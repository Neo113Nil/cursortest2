package ru.yandex.common.cache;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import defpackage.aez;
import defpackage.kbs;
import defpackage.oyr;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import ru.yandex.common.cache.Cacheable;

/* loaded from: classes4.dex */
public class CacheProvider extends ContentProvider {
    private static final String CLASSNAME_KEY = "classname";
    private static final String FILENAME_KEY = "filename";
    protected static final String ID_PREFERENCE_PREFIX = "id-%s-";
    private static String INTERNAL_CACHE_DIR = "yamobile_cache";
    private static String PREFERENCES_NAME = "ru.yandex.searchlib.cache_provider";
    private static String SD_CACHE_DIR = "yamobile/cache";
    public static final String TAG = "[CacheProvider]";
    private static final String TIMESTAMP_KEY = "timestamp2";
    public static final boolean USE_ONLY_INTERNAL_STORAGE = true;
    private static HashMap<String, Cacheable.Reader> mReaders = new HashMap<>();
    private static Context sContext;

    private static String createFilename(String str) {
        return oyr.t(new StringBuilder(getCacheDir().getAbsolutePath()), "/id_", str);
    }

    public static void delete(String str) {
        deleteCacheableInfo(str);
    }

    private static void deleteCacheableInfo(String str) {
        SharedPreferences.Editor edit = getSharedPreferences().edit();
        edit.remove(formatIdPreferenceName(str, FILENAME_KEY));
        edit.remove(formatIdPreferenceName(str, CLASSNAME_KEY));
        edit.remove(formatIdPreferenceName(str, TIMESTAMP_KEY));
        edit.commit();
    }

    public static String formatIdPreferenceName(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("id-" + str + "-");
        sb.append(str2);
        return sb.toString();
    }

    private static File getCacheDir() {
        Environment.getExternalStorageState();
        if (sContext == null) {
            kbs.g("Error: Using uninitialized cache provider!");
            return null;
        }
        File file = new File(sContext.getApplicationContext().getCacheDir(), INTERNAL_CACHE_DIR);
        if (!file.exists() && !file.mkdir() && aez.c()) {
            Log.e(TAG, "Can't create cache folder");
        }
        return file;
    }

    private static String getCacheableClassname(String str) {
        return getSharedPreferences().getString(formatIdPreferenceName(str, CLASSNAME_KEY), null);
    }

    private static String getCacheableFilename(String str) {
        return getSharedPreferences().getString(formatIdPreferenceName(str, FILENAME_KEY), null);
    }

    private static long getCacheableTimestamp(String str) {
        return getSharedPreferences().getLong(formatIdPreferenceName(str, TIMESTAMP_KEY), 0L);
    }

    private static String getClassName(String str) {
        return getCacheableClassname(str);
    }

    private static String getFilename(String str) {
        return getCacheableFilename(str);
    }

    private static SharedPreferences getSharedPreferences() {
        Context context = sContext;
        if (context != null) {
            return context.getApplicationContext().getSharedPreferences(PREFERENCES_NAME, 0);
        }
        kbs.g("Error: Using uninitialized cache provider!");
        return null;
    }

    public static long getTimestamp(String str) {
        return getCacheableTimestamp(str);
    }

    public static void initialize(Context context, String str, String str2, String str3) {
        sContext = context;
        PREFERENCES_NAME = str;
        SD_CACHE_DIR = str2;
        INTERNAL_CACHE_DIR = str3;
    }

    public static boolean isOutdated(String str, long j) {
        long nanoTime = System.nanoTime() - getTimestamp(str);
        return nanoTime > j * 1000000 || nanoTime < 0;
    }

    public static <T extends Cacheable> T retrieve(String str) {
        String className = getClassName(str);
        String filename = getFilename(str);
        T t = null;
        if (className != null && filename != null) {
            try {
                Class<?> cls = Class.forName(className);
                aez.c();
                t = (T) retrieve((Cacheable.Reader) cls.getField("READER").get(null), new ObjectInputStream(new FileInputStream(filename)));
            } catch (IOException e) {
                aez.a(TAG, "Enable to retrieve cached info", e);
            } catch (ClassNotFoundException e2) {
                aez.a(TAG, "Enable to retrieve cached info", e2);
            } catch (IllegalAccessException e3) {
                aez.a(TAG, "Enable to retrieve cached info", e3);
            } catch (NoSuchFieldException e4) {
                aez.a(TAG, "Enable to retrieve cached info", e4);
            } catch (Throwable th) {
                aez.a(TAG, "Enable to retrieve cached info", th);
            }
            if (t == null) {
                delete(str);
            }
        }
        return t;
    }

    private static void saveCacheableInfo(String str, String str2, String str3, long j) {
        SharedPreferences.Editor edit = getSharedPreferences().edit();
        edit.putString(formatIdPreferenceName(str, FILENAME_KEY), str2);
        edit.putString(formatIdPreferenceName(str, CLASSNAME_KEY), str3);
        edit.putLong(formatIdPreferenceName(str, TIMESTAMP_KEY), j);
        edit.commit();
    }

    public static void store(String str, Cacheable cacheable) {
        StringBuilder sb;
        ObjectOutputStream objectOutputStream;
        aez.c();
        String filename = getFilename(str);
        if (filename == null) {
            filename = createFilename(str);
        }
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(new FileOutputStream(filename));
            } catch (Throwable th) {
                if (objectOutputStream2 != null) {
                    try {
                        objectOutputStream2.flush();
                        objectOutputStream2.close();
                    } catch (IOException e) {
                        aez.a(TAG, "Unable to cache info for " + str, e);
                    }
                }
                throw th;
            }
        } catch (IOException unused) {
        } catch (IllegalAccessException e2) {
            e = e2;
        } catch (NoSuchFieldException e3) {
            e = e3;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            mReaders.put(cacheable.getClass().getCanonicalName(), (Cacheable.Reader) cacheable.getClass().getField("READER").get(null));
            aez.c();
            cacheable.writeExternal(objectOutputStream);
            saveCacheableInfo(str, filename, cacheable.getClass().getCanonicalName(), System.nanoTime());
            try {
                objectOutputStream.flush();
                objectOutputStream.close();
            } catch (IOException e4) {
                e = e4;
                sb = new StringBuilder("Unable to cache info for ");
                sb.append(str);
                aez.a(TAG, sb.toString(), e);
            }
        } catch (IOException unused2) {
            objectOutputStream2 = objectOutputStream;
            delete(str);
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.flush();
                    objectOutputStream2.close();
                } catch (IOException e5) {
                    e = e5;
                    sb = new StringBuilder("Unable to cache info for ");
                    sb.append(str);
                    aez.a(TAG, sb.toString(), e);
                }
            }
        } catch (IllegalAccessException e6) {
            e = e6;
            objectOutputStream2 = objectOutputStream;
            aez.a(TAG, "Exception: ", e);
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.flush();
                    objectOutputStream2.close();
                } catch (IOException e7) {
                    e = e7;
                    sb = new StringBuilder("Unable to cache info for ");
                    sb.append(str);
                    aez.a(TAG, sb.toString(), e);
                }
            }
        } catch (NoSuchFieldException e8) {
            e = e8;
            objectOutputStream2 = objectOutputStream;
            aez.a(TAG, "Exception: ", e);
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.flush();
                    objectOutputStream2.close();
                } catch (IOException e9) {
                    e = e9;
                    sb = new StringBuilder("Unable to cache info for ");
                    sb.append(str);
                    aez.a(TAG, sb.toString(), e);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            objectOutputStream2 = objectOutputStream;
            aez.a(TAG, "Exception: ", th);
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.flush();
                    objectOutputStream2.close();
                } catch (IOException e10) {
                    e = e10;
                    sb = new StringBuilder("Unable to cache info for ");
                    sb.append(str);
                    aez.a(TAG, sb.toString(), e);
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public static <T extends Cacheable> T retrieve(Cacheable.Reader<T> reader, ObjectInput objectInput) {
        try {
            return reader.readExternal(objectInput);
        } catch (IOException e) {
            aez.a(TAG, "Enable to retrieve cached info", e);
            return null;
        }
    }
}
