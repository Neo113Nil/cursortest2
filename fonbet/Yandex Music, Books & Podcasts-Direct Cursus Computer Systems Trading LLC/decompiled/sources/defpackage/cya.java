package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class cya {
    public static Boolean c = null;
    public static String d = null;
    public static boolean e = false;
    public static int f = -1;
    public static Boolean g;
    public static rjx k;
    public static mkx l;
    public final Context a;
    public static final ThreadLocal h = new ThreadLocal();
    public static final mo i = new mo(17);
    public static final jkl j = new jkl();
    public static final dml b = new dml();

    public cya(Context context) {
        this.a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (ldg.s(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    public static cya b(Context context, dml dmlVar) {
        long j2;
        cya cyaVar;
        Boolean bool;
        l9e S0;
        cya cyaVar2;
        mkx mkxVar;
        l9e S02;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new aya("null application Context");
        }
        ThreadLocal threadLocal = h;
        ghx ghxVar = (ghx) threadLocal.get();
        ghx ghxVar2 = new ghx();
        threadLocal.set(ghxVar2);
        mo moVar = i;
        Long l2 = (Long) moVar.get();
        long longValue = l2.longValue();
        try {
            moVar.set(Long.valueOf(SystemClock.elapsedRealtime()));
            aa c2 = dmlVar.c(context, j);
            j2 = longValue;
            try {
                Log.i("DynamiteModule", "Considering local module com.google.android.gms.cast.framework.dynamite:" + c2.a + " and remote module com.google.android.gms.cast.framework.dynamite:" + c2.b);
                int i2 = c2.c;
                if (i2 != 0) {
                    if (i2 == -1) {
                        if (c2.a != 0) {
                            i2 = -1;
                        }
                    }
                    boolean z = true;
                    if (i2 != 1 || c2.b != 0) {
                        if (i2 == -1) {
                            Log.i("DynamiteModule", "Selected local version of ".concat("com.google.android.gms.cast.framework.dynamite"));
                            cyaVar = new cya(applicationContext);
                        } else {
                            if (i2 != 1) {
                                throw new aya("VersionPolicy returned invalid code:" + i2);
                            }
                            try {
                                int i3 = c2.b;
                                try {
                                    synchronized (cya.class) {
                                        if (!e(context)) {
                                            throw new aya("Remote loading disabled");
                                        }
                                        bool = c;
                                    }
                                    if (bool == null) {
                                        throw new aya("Failed to determine which loading route to use.");
                                    }
                                    if (bool.booleanValue()) {
                                        Log.i("DynamiteModule", "Selected remote version of com.google.android.gms.cast.framework.dynamite, version >= " + i3);
                                        synchronized (cya.class) {
                                            mkxVar = l;
                                        }
                                        if (mkxVar == null) {
                                            throw new aya("DynamiteLoaderV2 was not cached.");
                                        }
                                        ghx ghxVar3 = (ghx) threadLocal.get();
                                        if (ghxVar3 == null || ghxVar3.a == null) {
                                            throw new aya("No result cursor");
                                        }
                                        Context applicationContext2 = context.getApplicationContext();
                                        Cursor cursor = ghxVar3.a;
                                        new zhj(null);
                                        synchronized (cya.class) {
                                            if (f < 2) {
                                                z = false;
                                            }
                                        }
                                        if (z) {
                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                            S02 = mkxVar.T0(new zhj(applicationContext2), i3, new zhj(cursor));
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                            S02 = mkxVar.S0(new zhj(applicationContext2), i3, new zhj(cursor));
                                        }
                                        Context context2 = (Context) zhj.T0(S02);
                                        if (context2 == null) {
                                            throw new aya("Failed to get module context");
                                        }
                                        cyaVar2 = new cya(context2);
                                    } else {
                                        Log.i("DynamiteModule", "Selected remote version of com.google.android.gms.cast.framework.dynamite, version >= " + i3);
                                        rjx f2 = f(context);
                                        if (f2 == null) {
                                            throw new aya("Failed to create IDynamiteLoader.");
                                        }
                                        Parcel L0 = f2.L0(f2.M0(), 6);
                                        int readInt = L0.readInt();
                                        L0.recycle();
                                        if (readInt >= 3) {
                                            ghx ghxVar4 = (ghx) threadLocal.get();
                                            if (ghxVar4 == null) {
                                                throw new aya("No cached result cursor holder");
                                            }
                                            S0 = f2.T0(new zhj(context), i3, new zhj(ghxVar4.a));
                                        } else if (readInt == 2) {
                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                            S0 = f2.U0(new zhj(context), i3);
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                            S0 = f2.S0(new zhj(context), i3);
                                        }
                                        Object T0 = zhj.T0(S0);
                                        if (T0 == null) {
                                            throw new aya("Failed to load remote module.");
                                        }
                                        cyaVar2 = new cya((Context) T0);
                                    }
                                    cyaVar = cyaVar2;
                                } catch (RemoteException e2) {
                                    throw new aya("Failed to load remote module.", e2);
                                } catch (aya e3) {
                                    throw e3;
                                } catch (Throwable th) {
                                    throw new aya("Failed to load remote module.", th);
                                }
                            } catch (aya e4) {
                                Log.w("DynamiteModule", "Failed to load remote module: " + e4.getMessage());
                                int i4 = c2.a;
                                if (i4 == 0 || dmlVar.c(context, new jsg(i4, 19)).c != -1) {
                                    throw new aya("Remote load failed. No local fallback found.", e4);
                                }
                                Log.i("DynamiteModule", "Selected local version of ".concat("com.google.android.gms.cast.framework.dynamite"));
                                cyaVar = new cya(applicationContext);
                            }
                        }
                        if (j2 == 0) {
                            i.remove();
                        } else {
                            i.set(l2);
                        }
                        Cursor cursor2 = ghxVar2.a;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        h.set(ghxVar);
                        return cyaVar;
                    }
                }
                throw new aya("No acceptable module com.google.android.gms.cast.framework.dynamite found. Local version is " + c2.a + " and remote version is " + c2.b + ".");
            } catch (Throwable th2) {
                th = th2;
                if (j2 == 0) {
                    i.remove();
                } else {
                    i.set(l2);
                }
                Cursor cursor3 = ghxVar2.a;
                if (cursor3 != null) {
                    cursor3.close();
                }
                h.set(ghxVar);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            j2 = longValue;
        }
    }

    public static int c(Context context, boolean z, boolean z2) {
        Throwable th;
        Exception exc;
        boolean z3;
        try {
            try {
                boolean z4 = true;
                Cursor query = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath("com.google.android.gms.cast.framework.dynamite").appendQueryParameter("requestStartTime", String.valueOf(((Long) i.get()).longValue())).build(), null, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            boolean z5 = false;
                            int i2 = query.getInt(0);
                            if (i2 > 0) {
                                synchronized (cya.class) {
                                    try {
                                        d = query.getString(2);
                                        int columnIndex = query.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f = query.getInt(columnIndex);
                                        }
                                        int columnIndex2 = query.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z3 = query.getInt(columnIndex2) != 0;
                                            e = z3;
                                        } else {
                                            z3 = false;
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                ghx ghxVar = (ghx) h.get();
                                if (ghxVar == null || ghxVar.a != null) {
                                    z4 = false;
                                } else {
                                    ghxVar.a = query;
                                }
                                r1 = z4 ? null : query;
                                z5 = z3;
                            } else {
                                r1 = query;
                            }
                            if (z2 && z5) {
                                throw new aya("forcing fallback to container DynamiteLoader impl");
                            }
                            if (r1 != null) {
                                r1.close();
                            }
                            return i2;
                        }
                    } catch (Exception e2) {
                        exc = e2;
                        if (exc instanceof aya) {
                            throw exc;
                        }
                        throw new aya("V2 version check failed: " + exc.getMessage(), exc);
                    } catch (Throwable th3) {
                        r1 = query;
                        th = th3;
                        if (r1 == null) {
                            throw th;
                        }
                        r1.close();
                        throw th;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new aya("Failed to connect to dynamite module ContentResolver.");
            } catch (Exception e3) {
                exc = e3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static void d(ClassLoader classLoader) {
        try {
            mkx mkxVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                mkxVar = queryLocalInterface instanceof mkx ? (mkx) queryLocalInterface : new mkx(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 3);
            }
            l = mkxVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new aya("Failed to instantiate dynamite loader", e2);
        }
    }

    public static boolean e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(g)) {
            return true;
        }
        boolean z = false;
        if (g == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (qmd.b.b(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            g = Boolean.valueOf(z);
            if (z && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                e = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    public static rjx f(Context context) {
        rjx rjxVar;
        synchronized (cya.class) {
            rjx rjxVar2 = k;
            if (rjxVar2 != null) {
                return rjxVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    rjxVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    rjxVar = queryLocalInterface instanceof rjx ? (rjx) queryLocalInterface : new rjx(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 3);
                }
                if (rjxVar != null) {
                    k = rjxVar;
                    return rjxVar;
                }
            } catch (Exception e2) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e2.getMessage());
            }
            return null;
        }
    }
}
