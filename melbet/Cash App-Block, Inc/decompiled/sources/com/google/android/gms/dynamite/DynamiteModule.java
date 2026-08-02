package com.google.android.gms.dynamite;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.collection.internal.Lock;
import app.cash.trifle.Trifle;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.plaid.internal.EnumC0170g;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class DynamiteModule {
    public static Boolean zzc = null;
    public static String zzd = null;
    public static boolean zze = false;
    public static int zzf = -1;
    public static Boolean zzg;
    public static zzp zzl;
    public static zzq zzm;
    public final Context zzk;
    public static final ThreadLocal zzh = new ThreadLocal();
    public static final zze zzi = new zze(0);
    public static final zzf zzj = new zzf(0);
    public static final zzg PREFER_REMOTE = new zzg(0);
    public static final zzh PREFER_LOCAL = new zzh(0);
    public static final Lock PREFER_HIGHEST_OR_LOCAL_VERSION = new Lock(11);
    public static final Trifle PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new Trifle(11);

    public class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public final class LoadingException extends Exception {
    }

    public interface VersionPolicy {

        public interface IVersions {
            int zza(Context context, String str, boolean z);

            int zzb(Context context, String str);
        }

        public final class SelectionResult {
            public int localVersion = 0;
            public int remoteVersion = 0;
            public int selection = 0;
        }

        SelectionResult selectModule(Context context, String str, IVersions iVersions);
    }

    public DynamiteModule(Context context) {
        this.zzk = context;
    }

    public static int getLocalVersion(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (zzae.equal(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 50 + String.valueOf(str).length() + 1);
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x030a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0319 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0310 A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.google.android.gms.dynamite.zze, java.lang.ThreadLocal] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static DynamiteModule load(Context context, VersionPolicy versionPolicy, String str) {
        Context context2;
        int i;
        DynamiteModule dynamiteModule;
        int i2;
        Context context3;
        IObjectWrapper zze2;
        zzq zzqVar;
        boolean z;
        IObjectWrapper zze3;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new LoadingException("null application Context");
        }
        ThreadLocal threadLocal = zzh;
        zzn zznVar = (zzn) threadLocal.get();
        zzn zznVar2 = new zzn();
        threadLocal.set(zznVar2);
        ?? r7 = zzi;
        Long l = (Long) r7.get();
        long longValue = l.longValue();
        try {
            r7.set(Long.valueOf(SystemClock.uptimeMillis()));
            VersionPolicy.SelectionResult selectModule = versionPolicy.selectModule(context, str, zzj);
            int i3 = selectModule.localVersion;
            int i4 = selectModule.remoteVersion;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(i3).length() + 19 + String.valueOf(str).length() + 1 + String.valueOf(i4).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i3);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i4);
            Log.i("DynamiteModule", sb.toString());
            int i5 = selectModule.selection;
            if (i5 != 0) {
                if (i5 == -1) {
                    if (selectModule.localVersion != 0) {
                        i5 = -1;
                    }
                }
                if (i5 != 1 || selectModule.remoteVersion != 0) {
                    if (i5 == -1) {
                        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                        DynamiteModule dynamiteModule2 = new DynamiteModule(applicationContext);
                        if (longValue == 0) {
                            r7.remove();
                        } else {
                            r7.set(l);
                        }
                        Cursor cursor = zznVar2.zza;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(zznVar);
                        return dynamiteModule2;
                    }
                    if (i5 != 1) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 36);
                        sb2.append("VersionPolicy returned invalid code:");
                        sb2.append(i5);
                        throw new LoadingException(sb2.toString());
                    }
                    try {
                        try {
                            i2 = selectModule.remoteVersion;
                        } catch (LoadingException e) {
                            e = e;
                            context2 = context;
                            String message = e.getMessage();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(message).length() + 30);
                            sb3.append("Failed to load remote module: ");
                            sb3.append(message);
                            Log.w("DynamiteModule", sb3.toString());
                            i = selectModule.localVersion;
                            if (i != 0 || versionPolicy.selectModule(context2, str, new zzo((byte) 0, i)).selection != -1) {
                                throw new LoadingException("Remote load failed. No local fallback found.", e);
                            }
                            Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                            dynamiteModule = new DynamiteModule(applicationContext);
                            return dynamiteModule;
                        }
                    } catch (LoadingException e2) {
                        e = e2;
                        context2 = r7;
                        String message2 = e.getMessage();
                        StringBuilder sb32 = new StringBuilder(String.valueOf(message2).length() + 30);
                        sb32.append("Failed to load remote module: ");
                        sb32.append(message2);
                        Log.w("DynamiteModule", sb32.toString());
                        i = selectModule.localVersion;
                        if (i != 0) {
                        }
                        throw new LoadingException("Remote load failed. No local fallback found.", e);
                    }
                    try {
                        try {
                            try {
                                synchronized (DynamiteModule.class) {
                                    try {
                                        if (!zzb(context)) {
                                            throw new LoadingException("Remote loading disabled");
                                        }
                                        Boolean bool = zzc;
                                        if (bool == null) {
                                            throw new LoadingException("Failed to determine which loading route to use.");
                                        }
                                        if (bool.booleanValue()) {
                                            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i2).length());
                                            sb4.append("Selected remote version of ");
                                            sb4.append(str);
                                            sb4.append(", version >= ");
                                            sb4.append(i2);
                                            Log.i("DynamiteModule", sb4.toString());
                                            synchronized (DynamiteModule.class) {
                                                zzqVar = zzm;
                                            }
                                            if (zzqVar == null) {
                                                throw new LoadingException("DynamiteLoaderV2 was not cached.");
                                            }
                                            zzn zznVar3 = (zzn) threadLocal.get();
                                            if (zznVar3 == null || zznVar3.zza == null) {
                                                throw new LoadingException("No result cursor");
                                            }
                                            Context applicationContext2 = context.getApplicationContext();
                                            Cursor cursor2 = zznVar3.zza;
                                            new ObjectWrapper(null);
                                            synchronized (DynamiteModule.class) {
                                                z = zzf >= 2;
                                            }
                                            if (z) {
                                                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                zze3 = zzqVar.zzf(new ObjectWrapper(applicationContext2), str, i2, new ObjectWrapper(cursor2));
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                zze3 = zzqVar.zze(new ObjectWrapper(applicationContext2), str, i2, new ObjectWrapper(cursor2));
                                            }
                                            Context context4 = (Context) ObjectWrapper.unwrap(zze3);
                                            if (context4 == null) {
                                                throw new LoadingException("Failed to get module context");
                                            }
                                            dynamiteModule = new DynamiteModule(context4);
                                        } else {
                                            StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i2).length());
                                            sb5.append("Selected remote version of ");
                                            sb5.append(str);
                                            sb5.append(", version >= ");
                                            sb5.append(i2);
                                            Log.i("DynamiteModule", sb5.toString());
                                            zzp zzg2 = zzg(context);
                                            if (zzg2 == null) {
                                                throw new LoadingException("Failed to create IDynamiteLoader.");
                                            }
                                            int zzi2 = zzg2.zzi();
                                            if (zzi2 >= 3) {
                                                zzn zznVar4 = (zzn) threadLocal.get();
                                                if (zznVar4 == null) {
                                                    throw new LoadingException("No cached result cursor holder");
                                                }
                                                zze2 = zzg2.zzk(new ObjectWrapper(context), str, i2, new ObjectWrapper(zznVar4.zza));
                                            } else if (zzi2 == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                zze2 = zzg2.zzg(new ObjectWrapper(context), str, i2);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                zze2 = zzg2.zze(new ObjectWrapper(context), str, i2);
                                            }
                                            Object unwrap2 = ObjectWrapper.unwrap(zze2);
                                            if (unwrap2 == null) {
                                                throw new LoadingException("Failed to load remote module.");
                                            }
                                            dynamiteModule = new DynamiteModule((Context) unwrap2);
                                        }
                                        return dynamiteModule;
                                    } catch (Throwable th) {
                                        th = th;
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (RemoteException e3) {
                            e = e3;
                            throw new LoadingException("Failed to load remote module.", e);
                        } catch (LoadingException e4) {
                            throw e4;
                        } catch (Throwable th3) {
                            th = th3;
                            context3 = context;
                            Hex.addDynamiteErrorToDropBox(context3, th);
                            throw new LoadingException("Failed to load remote module.", th);
                        }
                    } catch (RemoteException e5) {
                        e = e5;
                        throw new LoadingException("Failed to load remote module.", e);
                    } catch (LoadingException e6) {
                        throw e6;
                    } catch (Throwable th4) {
                        th = th4;
                        context3 = r7;
                        Hex.addDynamiteErrorToDropBox(context3, th);
                        throw new LoadingException("Failed to load remote module.", th);
                    }
                }
            }
            int i6 = selectModule.localVersion;
            int i7 = selectModule.remoteVersion;
            StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(i6).length() + 23 + String.valueOf(i7).length() + 1);
            sb6.append("No acceptable module ");
            sb6.append(str);
            sb6.append(" found. Local version is ");
            sb6.append(i6);
            sb6.append(" and remote version is ");
            sb6.append(i7);
            sb6.append(".");
            throw new LoadingException(sb6.toString());
        } finally {
            if (longValue == 0) {
                zzi.remove();
            } else {
                zzi.set(l);
            }
            Cursor cursor3 = zznVar2.zza;
            if (cursor3 != null) {
                cursor3.close();
            }
            zzh.set(zznVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0167, code lost:
    
        if (r4 != false) goto L96;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x01d6 -> B:25:0x01db). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x01d8 -> B:25:0x01db). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zza(Context context, String str, boolean z) {
        Field declaredField;
        Throwable th;
        RemoteException remoteException;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = zzc;
                boolean z2 = true;
                Cursor cursor2 = null;
                int i = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
                        String obj = e.toString();
                        StringBuilder sb = new StringBuilder(obj.length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(obj);
                        Log.w("DynamiteModule", sb.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                zzf(classLoader);
                            } catch (LoadingException unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!zzb(context)) {
                                return 0;
                            }
                            if (!zze) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int zzc2 = zzc(context, str, z, true);
                                        String str2 = zzd;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader zza = zzb.zza();
                                            if (zza == null) {
                                                String str3 = zzd;
                                                zzae.checkNotNull(str3);
                                                zza = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                            }
                                            zzf(zza);
                                            declaredField.set(null, zza);
                                            zzc = bool2;
                                            return zzc2;
                                        }
                                        return zzc2;
                                    } catch (LoadingException unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        zzc = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return zzc(context, str, z, false);
                    } catch (LoadingException e2) {
                        String message = e2.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 42);
                        sb2.append("Failed to retrieve remote module version: ");
                        sb2.append(message);
                        Log.w("DynamiteModule", sb2.toString());
                        return 0;
                    }
                }
                zzp zzg2 = zzg(context);
                try {
                    if (zzg2 != null) {
                        try {
                            int zzi2 = zzg2.zzi();
                            if (zzi2 >= 3) {
                                ThreadLocal threadLocal = zzh;
                                zzn zznVar = (zzn) threadLocal.get();
                                if (zznVar == null || (cursor = zznVar.zza) == null) {
                                    Cursor cursor3 = (Cursor) ObjectWrapper.unwrap(zzg2.zzj(new ObjectWrapper(context), str, z, ((Long) zzi.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i2 = cursor3.getInt(0);
                                                if (i2 > 0) {
                                                    zzn zznVar2 = (zzn) threadLocal.get();
                                                    if (zznVar2 == null || zznVar2.zza != null) {
                                                        z2 = false;
                                                    } else {
                                                        zznVar2.zza = cursor3;
                                                    }
                                                }
                                                cursor2 = cursor3;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                i = i2;
                                            }
                                        } catch (RemoteException e3) {
                                            remoteException = e3;
                                            cursor2 = cursor3;
                                            String message2 = remoteException.getMessage();
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 42);
                                            sb3.append("Failed to retrieve remote module version: ");
                                            sb3.append(message2);
                                            Log.w("DynamiteModule", sb3.toString());
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            return i;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor2 = cursor3;
                                            if (cursor2 == null) {
                                                throw th;
                                            }
                                            cursor2.close();
                                            throw th;
                                        }
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                } else {
                                    i = cursor.getInt(0);
                                }
                            } else if (zzi2 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                i = zzg2.zzh(new ObjectWrapper(context), str, z);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                i = zzg2.zzf(new ObjectWrapper(context), str, z);
                            }
                        } catch (RemoteException e4) {
                            remoteException = e4;
                        }
                    }
                    return i;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            Hex.addDynamiteErrorToDropBox(context, th4);
            throw th4;
        }
    }

    public static boolean zzb(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(zzg)) {
            return true;
        }
        boolean z = false;
        if (zzg == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 268435456);
            if (GoogleApiAvailabilityLight.zza.isGooglePlayServicesAvailable(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            zzg = Boolean.valueOf(z);
            if (z && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                zze = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0138, code lost:
    
        if (r6 != false) goto L92;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzc(Context context, String str, boolean z, boolean z2) {
        Exception exc;
        Throwable th;
        Cursor query;
        MatrixCursor matrixCursor;
        boolean z3;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z4 = true;
                Uri build = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) zzi.get()).longValue())).build();
                ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
                boolean z5 = false;
                if (acquireUnstableContentProviderClient != null) {
                    try {
                        query = acquireUnstableContentProviderClient.query(build, null, null, null, null);
                    } catch (RemoteException unused) {
                    } catch (Throwable th2) {
                        acquireUnstableContentProviderClient.release();
                        throw th2;
                    }
                    if (query != null) {
                        try {
                            int count = query.getCount();
                            int columnCount = query.getColumnCount();
                            matrixCursor = new MatrixCursor(query.getColumnNames(), count);
                            for (int i = 0; i < count; i++) {
                                if (!query.moveToPosition(i)) {
                                    throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                }
                                Object[] objArr = new Object[columnCount];
                                for (int i2 = 0; i2 < columnCount; i2++) {
                                    int type2 = query.getType(i2);
                                    if (type2 == 0) {
                                        objArr[i2] = null;
                                    } else if (type2 == 1) {
                                        objArr[i2] = Long.valueOf(query.getLong(i2));
                                    } else if (type2 == 2) {
                                        objArr[i2] = Double.valueOf(query.getDouble(i2));
                                    } else if (type2 == 3) {
                                        objArr[i2] = query.getString(i2);
                                    } else {
                                        if (type2 != 4) {
                                            throw new RemoteException("Unknown column type");
                                        }
                                        objArr[i2] = query.getBlob(i2);
                                    }
                                }
                                matrixCursor.addRow(objArr);
                            }
                            query.close();
                            acquireUnstableContentProviderClient.release();
                            if (matrixCursor != null) {
                                try {
                                    if (matrixCursor.moveToFirst()) {
                                        int i3 = matrixCursor.getInt(0);
                                        if (i3 > 0) {
                                            synchronized (DynamiteModule.class) {
                                                try {
                                                    zzd = matrixCursor.getString(2);
                                                    int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                                    if (columnIndex >= 0) {
                                                        zzf = matrixCursor.getInt(columnIndex);
                                                    }
                                                    int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                                    if (columnIndex2 >= 0) {
                                                        z3 = matrixCursor.getInt(columnIndex2) != 0;
                                                        zze = z3;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                } finally {
                                                }
                                            }
                                            zzn zznVar = (zzn) zzh.get();
                                            if (zznVar == null || zznVar.zza != null) {
                                                z4 = false;
                                            } else {
                                                zznVar.zza = matrixCursor;
                                            }
                                            z5 = z3;
                                        }
                                        matrixCursor2 = matrixCursor;
                                        if (z2 && z5) {
                                            throw new LoadingException("forcing fallback to container DynamiteLoader impl");
                                        }
                                        if (matrixCursor2 != null) {
                                            matrixCursor2.close();
                                        }
                                        return i3;
                                    }
                                } catch (Exception e) {
                                    exc = e;
                                    if (exc instanceof LoadingException) {
                                        throw exc;
                                    }
                                    String message = exc.getMessage();
                                    StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 25);
                                    sb.append("V2 version check failed: ");
                                    sb.append(message);
                                    throw new LoadingException(sb.toString(), exc);
                                } catch (Throwable th3) {
                                    th = th3;
                                    matrixCursor2 = matrixCursor;
                                    if (matrixCursor2 == null) {
                                        throw th;
                                    }
                                    matrixCursor2.close();
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            throw new LoadingException("Failed to connect to dynamite module ContentResolver.");
                        } catch (Throwable th4) {
                            try {
                                query.close();
                                throw th4;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                                throw th4;
                            }
                        }
                    }
                    acquireUnstableContentProviderClient.release();
                }
                matrixCursor = null;
                if (matrixCursor != null) {
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new LoadingException("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Exception e2) {
            exc = e2;
        }
    }

    public static void zzf(ClassLoader classLoader) {
        try {
            zzq zzqVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzqVar = queryLocalInterface instanceof zzq ? (zzq) queryLocalInterface : new zzq(iBinder);
            }
            zzm = zzqVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to instantiate dynamite loader", e);
        }
    }

    public static zzp zzg(Context context) {
        zzp zzpVar;
        synchronized (DynamiteModule.class) {
            zzp zzpVar2 = zzl;
            if (zzpVar2 != null) {
                return zzpVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzpVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzpVar = queryLocalInterface instanceof zzp ? (zzp) queryLocalInterface : new zzp(iBinder);
                }
                if (zzpVar != null) {
                    zzl = zzpVar;
                    return zzpVar;
                }
            } catch (Exception e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 45);
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
                Log.e("DynamiteModule", sb.toString());
            }
            return null;
        }
    }

    public final IBinder instantiate(String str) {
        try {
            return (IBinder) this.zzk.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new LoadingException("Failed to instantiate module class: ".concat(str), e);
        }
    }
}
