package Z2;

import A3.r;
import D1.E;
import O2.i;
import R2.w;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.anythink.core.common.d.j;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f4123c = null;

    /* renamed from: d, reason: collision with root package name */
    public static String f4124d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f4125e = false;

    /* renamed from: f, reason: collision with root package name */
    public static int f4126f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static Boolean f4127g;

    /* renamed from: k, reason: collision with root package name */
    public static g f4130k;

    /* renamed from: l, reason: collision with root package name */
    public static h f4131l;

    /* renamed from: a, reason: collision with root package name */
    public final Context f4132a;

    /* renamed from: h, reason: collision with root package name */
    public static final ThreadLocal f4128h = new ThreadLocal();
    public static final L7.b i = new L7.b(1);

    /* renamed from: j, reason: collision with root package name */
    public static final G3.e f4129j = new G3.e(11);

    /* renamed from: b, reason: collision with root package name */
    public static final i f4122b = new i(11);

    public b(Context context) {
        this.f4132a = context;
    }

    public static int a(Context context) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(ModuleDescriptor.MODULE_ID.length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (w.l(declaredField.get(null), ModuleDescriptor.MODULE_ID)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 50 + ModuleDescriptor.MODULE_ID.length() + 1);
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id 'com.google.android.gms.ads.dynamite'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(ModuleDescriptor.MODULE_ID.length() + 45);
            sb3.append("Local module descriptor class for com.google.android.gms.ads.dynamite not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e9) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e9.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static b c(Context context, i iVar) {
        b bVar;
        int i4;
        Context context2;
        Y2.a r1;
        h hVar;
        boolean z6;
        Y2.a r12;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new a("null application Context");
        }
        ThreadLocal threadLocal = f4128h;
        f fVar = (f) threadLocal.get();
        f fVar2 = new f();
        threadLocal.set(fVar2);
        L7.b bVar2 = i;
        Long l9 = (Long) bVar2.get();
        long longValue = l9.longValue();
        try {
            bVar2.set(Long.valueOf(SystemClock.uptimeMillis()));
            G3.e eVar = f4129j;
            iVar.getClass();
            r rVar = new r();
            eVar.getClass();
            int d9 = d(context, true);
            rVar.f185b = d9;
            if (d9 != 0) {
                rVar.f186c = 1;
            } else {
                int a9 = a(context);
                rVar.f184a = a9;
                if (a9 != 0) {
                    rVar.f186c = -1;
                }
            }
            int i6 = rVar.f184a;
            int i9 = rVar.f185b;
            StringBuilder sb = new StringBuilder(35 + 26 + String.valueOf(i6).length() + 19 + 35 + 1 + String.valueOf(i9).length());
            sb.append("Considering local module com.google.android.gms.ads.dynamite:");
            sb.append(i6);
            sb.append(" and remote module com.google.android.gms.ads.dynamite:");
            sb.append(i9);
            Log.i("DynamiteModule", sb.toString());
            int i10 = rVar.f186c;
            if (i10 != 0) {
                if (i10 == -1) {
                    if (rVar.f184a != 0) {
                        i10 = -1;
                    }
                }
                if (i10 != 1 || rVar.f185b != 0) {
                    if (i10 == -1) {
                        Log.i("DynamiteModule", "Selected local version of ".concat(ModuleDescriptor.MODULE_ID));
                        b bVar3 = new b(applicationContext);
                        if (longValue == 0) {
                            bVar2.remove();
                        } else {
                            bVar2.set(l9);
                        }
                        Cursor cursor = fVar2.f4138a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(fVar);
                        return bVar3;
                    }
                    if (i10 != 1) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 36);
                        sb2.append("VersionPolicy returned invalid code:");
                        sb2.append(i10);
                        throw new a(sb2.toString());
                    }
                    try {
                        i4 = rVar.f185b;
                    } catch (a e9) {
                        String message = e9.getMessage();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(message).length() + 30);
                        sb3.append("Failed to load remote module: ");
                        sb3.append(message);
                        Log.w("DynamiteModule", sb3.toString());
                        int i11 = rVar.f184a;
                        if (i11 != 0) {
                            r rVar2 = new r();
                            rVar2.f185b = 0;
                            rVar2.f184a = i11;
                            if (i11 != 0) {
                                rVar2.f186c = -1;
                            }
                            if (rVar2.f186c == -1) {
                                Log.i("DynamiteModule", "Selected local version of ".concat(ModuleDescriptor.MODULE_ID));
                                bVar = new b(applicationContext);
                            }
                        }
                        throw new a("Remote load failed. No local fallback found.", e9);
                    }
                    try {
                        try {
                            try {
                                try {
                                    synchronized (b.class) {
                                        try {
                                            if (!e(context)) {
                                                throw new a("Remote loading disabled");
                                            }
                                            Boolean bool = f4123c;
                                            if (bool == null) {
                                                throw new a("Failed to determine which loading route to use.");
                                            }
                                            if (bool.booleanValue()) {
                                                StringBuilder sb4 = new StringBuilder(35 + 40 + String.valueOf(i4).length());
                                                sb4.append("Selected remote version of com.google.android.gms.ads.dynamite, version >= ");
                                                sb4.append(i4);
                                                Log.i("DynamiteModule", sb4.toString());
                                                synchronized (b.class) {
                                                    hVar = f4131l;
                                                }
                                                if (hVar == null) {
                                                    throw new a("DynamiteLoaderV2 was not cached.");
                                                }
                                                f fVar3 = (f) threadLocal.get();
                                                if (fVar3 == null || fVar3.f4138a == null) {
                                                    throw new a("No result cursor");
                                                }
                                                Context applicationContext2 = context.getApplicationContext();
                                                Cursor cursor2 = fVar3.f4138a;
                                                new Y2.b(null);
                                                synchronized (b.class) {
                                                    z6 = f4126f >= 2;
                                                }
                                                if (z6) {
                                                    Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                    r12 = hVar.u1(new Y2.b(applicationContext2), i4, new Y2.b(cursor2));
                                                } else {
                                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                    r12 = hVar.r1(new Y2.b(applicationContext2), i4, new Y2.b(cursor2));
                                                }
                                                Context context3 = (Context) Y2.b.D0(r12);
                                                if (context3 == null) {
                                                    throw new a("Failed to get module context");
                                                }
                                                bVar = new b(context3);
                                            } else {
                                                StringBuilder sb5 = new StringBuilder(35 + 40 + String.valueOf(i4).length());
                                                sb5.append("Selected remote version of com.google.android.gms.ads.dynamite, version >= ");
                                                sb5.append(i4);
                                                Log.i("DynamiteModule", sb5.toString());
                                                g h3 = h(context);
                                                if (h3 == null) {
                                                    throw new a("Failed to create IDynamiteLoader.");
                                                }
                                                Parcel e02 = h3.e0(h3.t0(), 6);
                                                int readInt = e02.readInt();
                                                e02.recycle();
                                                if (readInt >= 3) {
                                                    f fVar4 = (f) threadLocal.get();
                                                    if (fVar4 == null) {
                                                        throw new a("No cached result cursor holder");
                                                    }
                                                    r1 = h3.Q1(new Y2.b(context), i4, new Y2.b(fVar4.f4138a));
                                                } else if (readInt == 2) {
                                                    Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                    r1 = h3.u1(new Y2.b(context), i4);
                                                } else {
                                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                    r1 = h3.r1(new Y2.b(context), i4);
                                                }
                                                Object D02 = Y2.b.D0(r1);
                                                if (D02 == null) {
                                                    throw new a("Failed to load remote module.");
                                                }
                                                bVar = new b((Context) D02);
                                            }
                                            return bVar;
                                        } catch (Throwable th) {
                                            th = th;
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    context2 = i6;
                                    V2.b.a(context2, th);
                                    throw new a("Failed to load remote module.", th);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                context2 = context;
                                V2.b.a(context2, th);
                                throw new a("Failed to load remote module.", th);
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (a e10) {
                        throw e10;
                    } catch (RemoteException e11) {
                        throw new a("Failed to load remote module.", e11);
                    }
                }
            }
            int i12 = rVar.f184a;
            int i13 = rVar.f185b;
            StringBuilder sb6 = new StringBuilder(35 + 46 + String.valueOf(i12).length() + 23 + String.valueOf(i13).length() + 1);
            sb6.append("No acceptable module com.google.android.gms.ads.dynamite found. Local version is ");
            sb6.append(i12);
            sb6.append(" and remote version is ");
            sb6.append(i13);
            sb6.append(j.f13164z);
            throw new a(sb6.toString());
        } finally {
            if (longValue == 0) {
                i.remove();
            } else {
                i.set(l9);
            }
            Cursor cursor3 = fVar2.f4138a;
            if (cursor3 != null) {
                cursor3.close();
            }
            f4128h.set(fVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x018b, code lost:
    
        if (r5 != false) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int d(Context context, boolean z6) {
        Field declaredField;
        Throwable th;
        RemoteException e9;
        int readInt;
        Cursor cursor;
        try {
            synchronized (b.class) {
                Boolean bool = f4123c;
                boolean z9 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e10) {
                        String obj = e10.toString();
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
                                g(classLoader);
                            } catch (a unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!e(context)) {
                                return 0;
                            }
                            if (!f4125e) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int f2 = f(context, z6, true);
                                        String str = f4124d;
                                        if (str != null && !str.isEmpty()) {
                                            ClassLoader r9 = d.r();
                                            if (r9 == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    E.d();
                                                    String str2 = f4124d;
                                                    w.h(str2);
                                                    r9 = E.b(ClassLoader.getSystemClassLoader(), str2);
                                                } else {
                                                    String str3 = f4124d;
                                                    w.h(str3);
                                                    r9 = new e(str3, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            g(r9);
                                            declaredField.set(null, r9);
                                            f4123c = bool2;
                                            return f2;
                                        }
                                        return f2;
                                    } catch (a unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        f4123c = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return f(context, z6, false);
                    } catch (a e11) {
                        String message = e11.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 42);
                        sb2.append("Failed to retrieve remote module version: ");
                        sb2.append(message);
                        Log.w("DynamiteModule", sb2.toString());
                        return 0;
                    }
                }
                g h3 = h(context);
                try {
                    if (h3 == null) {
                        return 0;
                    }
                    try {
                        Parcel e02 = h3.e0(h3.t0(), 6);
                        int readInt2 = e02.readInt();
                        e02.recycle();
                        if (readInt2 < 3) {
                            if (readInt2 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                Y2.b bVar = new Y2.b(context);
                                Parcel t02 = h3.t0();
                                e3.h.b(t02, bVar);
                                t02.writeString(ModuleDescriptor.MODULE_ID);
                                t02.writeInt(z6 ? 1 : 0);
                                Parcel e03 = h3.e0(t02, 5);
                                readInt = e03.readInt();
                                e03.recycle();
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                Y2.b bVar2 = new Y2.b(context);
                                Parcel t03 = h3.t0();
                                e3.h.b(t03, bVar2);
                                t03.writeString(ModuleDescriptor.MODULE_ID);
                                t03.writeInt(z6 ? 1 : 0);
                                Parcel e04 = h3.e0(t03, 3);
                                readInt = e04.readInt();
                                e04.recycle();
                            }
                            return readInt;
                        }
                        ThreadLocal threadLocal = f4128h;
                        f fVar = (f) threadLocal.get();
                        if (fVar != null && (cursor = fVar.f4138a) != null) {
                            return cursor.getInt(0);
                        }
                        Cursor cursor3 = (Cursor) Y2.b.D0(h3.G1(new Y2.b(context), z6, ((Long) i.get()).longValue()));
                        if (cursor3 != null) {
                            try {
                                if (cursor3.moveToFirst()) {
                                    int i4 = cursor3.getInt(0);
                                    if (i4 > 0) {
                                        f fVar2 = (f) threadLocal.get();
                                        if (fVar2 == null || fVar2.f4138a != null) {
                                            z9 = false;
                                        } else {
                                            fVar2.f4138a = cursor3;
                                        }
                                    }
                                    cursor2 = cursor3;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    return i4;
                                }
                            } catch (RemoteException e12) {
                                e9 = e12;
                                cursor2 = cursor3;
                                String message2 = e9.getMessage();
                                StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 42);
                                sb3.append("Failed to retrieve remote module version: ");
                                sb3.append(message2);
                                Log.w("DynamiteModule", sb3.toString());
                                if (cursor2 == null) {
                                    return 0;
                                }
                                cursor2.close();
                                return 0;
                            } catch (Throwable th2) {
                                th = th2;
                                cursor2 = cursor3;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        }
                        Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                        if (cursor3 == null) {
                            return 0;
                        }
                        cursor3.close();
                        return 0;
                    } catch (RemoteException e13) {
                        e9 = e13;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            V2.b.a(context, th4);
            throw th4;
        }
    }

    public static boolean e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f4127g)) {
            return true;
        }
        boolean z6 = false;
        if (f4127g == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (O2.f.f2270b.c(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z6 = true;
            }
            f4127g = Boolean.valueOf(z6);
            if (z6 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & com.anythink.expressad.video.module.a.a.f22517T) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f4125e = true;
            }
        }
        if (!z6) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0137, code lost:
    
        if (r7 != false) goto L92;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int f(Context context, boolean z6, boolean z9) {
        Exception exc;
        Throwable th;
        Cursor query;
        MatrixCursor matrixCursor;
        boolean z10;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z11 = true;
                Uri build = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z6 ? "api" : "api_force_staging").appendPath(ModuleDescriptor.MODULE_ID).appendQueryParameter("requestStartUptime", String.valueOf(((Long) i.get()).longValue())).build();
                ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
                boolean z12 = false;
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
                            for (int i4 = 0; i4 < count; i4++) {
                                if (!query.moveToPosition(i4)) {
                                    throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                }
                                Object[] objArr = new Object[columnCount];
                                for (int i6 = 0; i6 < columnCount; i6++) {
                                    int type = query.getType(i6);
                                    if (type == 0) {
                                        objArr[i6] = null;
                                    } else if (type == 1) {
                                        objArr[i6] = Long.valueOf(query.getLong(i6));
                                    } else if (type == 2) {
                                        objArr[i6] = Double.valueOf(query.getDouble(i6));
                                    } else if (type == 3) {
                                        objArr[i6] = query.getString(i6);
                                    } else {
                                        if (type != 4) {
                                            throw new RemoteException("Unknown column type");
                                        }
                                        objArr[i6] = query.getBlob(i6);
                                    }
                                }
                                matrixCursor.addRow(objArr);
                            }
                            query.close();
                            acquireUnstableContentProviderClient.release();
                            if (matrixCursor != null) {
                                try {
                                    if (matrixCursor.moveToFirst()) {
                                        int i9 = matrixCursor.getInt(0);
                                        if (i9 > 0) {
                                            synchronized (b.class) {
                                                try {
                                                    f4124d = matrixCursor.getString(2);
                                                    int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                                    if (columnIndex >= 0) {
                                                        f4126f = matrixCursor.getInt(columnIndex);
                                                    }
                                                    int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                                    if (columnIndex2 >= 0) {
                                                        z10 = matrixCursor.getInt(columnIndex2) != 0;
                                                        f4125e = z10;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                } finally {
                                                }
                                            }
                                            f fVar = (f) f4128h.get();
                                            if (fVar == null || fVar.f4138a != null) {
                                                z11 = false;
                                            } else {
                                                fVar.f4138a = matrixCursor;
                                            }
                                            z12 = z10;
                                        }
                                        matrixCursor2 = matrixCursor;
                                        if (z9 && z12) {
                                            throw new a("forcing fallback to container DynamiteLoader impl");
                                        }
                                        if (matrixCursor2 != null) {
                                            matrixCursor2.close();
                                        }
                                        return i9;
                                    }
                                } catch (Exception e9) {
                                    exc = e9;
                                    if (exc instanceof a) {
                                        throw exc;
                                    }
                                    String message = exc.getMessage();
                                    StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 25);
                                    sb.append("V2 version check failed: ");
                                    sb.append(message);
                                    throw new a(sb.toString(), exc);
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
                            throw new a("Failed to connect to dynamite module ContentResolver.");
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
                throw new a("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Exception e10) {
            exc = e10;
        }
    }

    public static void g(ClassLoader classLoader) {
        h hVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                hVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof h) {
                    hVar = (h) queryLocalInterface;
                } else {
                    try {
                        hVar = new h(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 2);
                    } catch (IllegalAccessException e9) {
                        e = e9;
                        throw new a("Failed to instantiate dynamite loader", e);
                    } catch (InstantiationException e10) {
                        e = e10;
                        throw new a("Failed to instantiate dynamite loader", e);
                    } catch (NoSuchMethodException e11) {
                        e = e11;
                        throw new a("Failed to instantiate dynamite loader", e);
                    } catch (InvocationTargetException e12) {
                        e = e12;
                        throw new a("Failed to instantiate dynamite loader", e);
                    }
                }
            }
            f4131l = hVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e13) {
            e = e13;
        }
    }

    public static g h(Context context) {
        g gVar;
        synchronized (b.class) {
            g gVar2 = f4130k;
            if (gVar2 != null) {
                return gVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    gVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    gVar = queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 2);
                }
                if (gVar != null) {
                    f4130k = gVar;
                    return gVar;
                }
            } catch (Exception e9) {
                String message = e9.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 45);
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
                Log.e("DynamiteModule", sb.toString());
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.f4132a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e9) {
            throw new a("Failed to instantiate module class: ".concat(str), e9);
        }
    }
}
