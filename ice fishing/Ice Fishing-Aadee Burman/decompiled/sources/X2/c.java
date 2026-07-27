package X2;

import B1.F;
import P2.w;
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
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f3775c = null;

    /* renamed from: d, reason: collision with root package name */
    public static String f3776d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f3777e = false;

    /* renamed from: f, reason: collision with root package name */
    public static int f3778f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static Boolean f3779g;

    /* renamed from: k, reason: collision with root package name */
    public static h f3782k;

    /* renamed from: l, reason: collision with root package name */
    public static i f3783l;

    /* renamed from: a, reason: collision with root package name */
    public final Context f3784a;

    /* renamed from: h, reason: collision with root package name */
    public static final ThreadLocal f3780h = new ThreadLocal();
    public static final L7.b i = new L7.b(1);

    /* renamed from: j, reason: collision with root package name */
    public static final M2.i f3781j = new M2.i(9);

    /* renamed from: b, reason: collision with root package name */
    public static final a4.e f3774b = new a4.e();

    public c(Context context) {
        this.f3784a = context;
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
    public static c c(Context context, a4.e eVar) {
        c cVar;
        int i6;
        Context context2;
        W2.a t12;
        i iVar;
        boolean z3;
        W2.a t13;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new a("null application Context");
        }
        ThreadLocal threadLocal = f3780h;
        g gVar = (g) threadLocal.get();
        g gVar2 = new g();
        threadLocal.set(gVar2);
        L7.b bVar = i;
        Long l9 = (Long) bVar.get();
        long longValue = l9.longValue();
        try {
            bVar.set(Long.valueOf(SystemClock.uptimeMillis()));
            M2.i iVar2 = f3781j;
            eVar.getClass();
            b bVar2 = new b();
            iVar2.getClass();
            int d2 = d(context, true);
            bVar2.f3772b = d2;
            if (d2 != 0) {
                bVar2.f3773c = 1;
            } else {
                int a9 = a(context);
                bVar2.f3771a = a9;
                if (a9 != 0) {
                    bVar2.f3773c = -1;
                }
            }
            int i9 = bVar2.f3771a;
            int i10 = bVar2.f3772b;
            StringBuilder sb = new StringBuilder(35 + 26 + String.valueOf(i9).length() + 19 + 35 + 1 + String.valueOf(i10).length());
            sb.append("Considering local module com.google.android.gms.ads.dynamite:");
            sb.append(i9);
            sb.append(" and remote module com.google.android.gms.ads.dynamite:");
            sb.append(i10);
            Log.i("DynamiteModule", sb.toString());
            int i11 = bVar2.f3773c;
            if (i11 != 0) {
                if (i11 == -1) {
                    if (bVar2.f3771a != 0) {
                        i11 = -1;
                    }
                }
                if (i11 != 1 || bVar2.f3772b != 0) {
                    if (i11 == -1) {
                        Log.i("DynamiteModule", "Selected local version of ".concat(ModuleDescriptor.MODULE_ID));
                        c cVar2 = new c(applicationContext);
                        if (longValue == 0) {
                            bVar.remove();
                        } else {
                            bVar.set(l9);
                        }
                        Cursor cursor = gVar2.f3793a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(gVar);
                        return cVar2;
                    }
                    if (i11 != 1) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 36);
                        sb2.append("VersionPolicy returned invalid code:");
                        sb2.append(i11);
                        throw new a(sb2.toString());
                    }
                    try {
                        i6 = bVar2.f3772b;
                    } catch (a e9) {
                        String message = e9.getMessage();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(message).length() + 30);
                        sb3.append("Failed to load remote module: ");
                        sb3.append(message);
                        Log.w("DynamiteModule", sb3.toString());
                        int i12 = bVar2.f3771a;
                        if (i12 != 0) {
                            b bVar3 = new b();
                            bVar3.f3772b = 0;
                            bVar3.f3771a = i12;
                            if (i12 != 0) {
                                bVar3.f3773c = -1;
                            }
                            if (bVar3.f3773c == -1) {
                                Log.i("DynamiteModule", "Selected local version of ".concat(ModuleDescriptor.MODULE_ID));
                                cVar = new c(applicationContext);
                            }
                        }
                        throw new a("Remote load failed. No local fallback found.", e9);
                    }
                    try {
                        try {
                            try {
                                try {
                                    synchronized (c.class) {
                                        try {
                                            if (!e(context)) {
                                                throw new a("Remote loading disabled");
                                            }
                                            Boolean bool = f3775c;
                                            if (bool == null) {
                                                throw new a("Failed to determine which loading route to use.");
                                            }
                                            if (bool.booleanValue()) {
                                                StringBuilder sb4 = new StringBuilder(35 + 40 + String.valueOf(i6).length());
                                                sb4.append("Selected remote version of com.google.android.gms.ads.dynamite, version >= ");
                                                sb4.append(i6);
                                                Log.i("DynamiteModule", sb4.toString());
                                                synchronized (c.class) {
                                                    iVar = f3783l;
                                                }
                                                if (iVar == null) {
                                                    throw new a("DynamiteLoaderV2 was not cached.");
                                                }
                                                g gVar3 = (g) threadLocal.get();
                                                if (gVar3 == null || gVar3.f3793a == null) {
                                                    throw new a("No result cursor");
                                                }
                                                Context applicationContext2 = context.getApplicationContext();
                                                Cursor cursor2 = gVar3.f3793a;
                                                new W2.b(null);
                                                synchronized (c.class) {
                                                    z3 = f3778f >= 2;
                                                }
                                                if (z3) {
                                                    Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                    t13 = iVar.B1(new W2.b(applicationContext2), i6, new W2.b(cursor2));
                                                } else {
                                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                    t13 = iVar.t1(new W2.b(applicationContext2), i6, new W2.b(cursor2));
                                                }
                                                Context context3 = (Context) W2.b.F0(t13);
                                                if (context3 == null) {
                                                    throw new a("Failed to get module context");
                                                }
                                                cVar = new c(context3);
                                            } else {
                                                StringBuilder sb5 = new StringBuilder(35 + 40 + String.valueOf(i6).length());
                                                sb5.append("Selected remote version of com.google.android.gms.ads.dynamite, version >= ");
                                                sb5.append(i6);
                                                Log.i("DynamiteModule", sb5.toString());
                                                h h9 = h(context);
                                                if (h9 == null) {
                                                    throw new a("Failed to create IDynamiteLoader.");
                                                }
                                                Parcel e02 = h9.e0(h9.w0(), 6);
                                                int readInt = e02.readInt();
                                                e02.recycle();
                                                if (readInt >= 3) {
                                                    g gVar4 = (g) threadLocal.get();
                                                    if (gVar4 == null) {
                                                        throw new a("No cached result cursor holder");
                                                    }
                                                    t12 = h9.R1(new W2.b(context), i6, new W2.b(gVar4.f3793a));
                                                } else if (readInt == 2) {
                                                    Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                    t12 = h9.B1(new W2.b(context), i6);
                                                } else {
                                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                    t12 = h9.t1(new W2.b(context), i6);
                                                }
                                                Object F02 = W2.b.F0(t12);
                                                if (F02 == null) {
                                                    throw new a("Failed to load remote module.");
                                                }
                                                cVar = new c((Context) F02);
                                            }
                                            return cVar;
                                        } catch (Throwable th) {
                                            th = th;
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    context2 = i9;
                                    T2.b.a(context2, th);
                                    throw new a("Failed to load remote module.", th);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                context2 = context;
                                T2.b.a(context2, th);
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
            int i13 = bVar2.f3771a;
            int i14 = bVar2.f3772b;
            StringBuilder sb6 = new StringBuilder(35 + 46 + String.valueOf(i13).length() + 23 + String.valueOf(i14).length() + 1);
            sb6.append("No acceptable module com.google.android.gms.ads.dynamite found. Local version is ");
            sb6.append(i13);
            sb6.append(" and remote version is ");
            sb6.append(i14);
            sb6.append(j.f12378z);
            throw new a(sb6.toString());
        } finally {
            if (longValue == 0) {
                i.remove();
            } else {
                i.set(l9);
            }
            Cursor cursor3 = gVar2.f3793a;
            if (cursor3 != null) {
                cursor3.close();
            }
            f3780h.set(gVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x018b, code lost:
    
        if (r5 != false) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int d(Context context, boolean z3) {
        Field declaredField;
        Throwable th;
        RemoteException e9;
        int readInt;
        Cursor cursor;
        try {
            synchronized (c.class) {
                Boolean bool = f3775c;
                boolean z6 = true;
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
                            if (!f3777e) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int f3 = f(context, z3, true);
                                        String str = f3776d;
                                        if (str != null && !str.isEmpty()) {
                                            ClassLoader S8 = e.S();
                                            if (S8 == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    F.d();
                                                    String str2 = f3776d;
                                                    w.h(str2);
                                                    S8 = F.b(ClassLoader.getSystemClassLoader(), str2);
                                                } else {
                                                    String str3 = f3776d;
                                                    w.h(str3);
                                                    S8 = new f(str3, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            g(S8);
                                            declaredField.set(null, S8);
                                            f3775c = bool2;
                                            return f3;
                                        }
                                        return f3;
                                    } catch (a unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        f3775c = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return f(context, z3, false);
                    } catch (a e11) {
                        String message = e11.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 42);
                        sb2.append("Failed to retrieve remote module version: ");
                        sb2.append(message);
                        Log.w("DynamiteModule", sb2.toString());
                        return 0;
                    }
                }
                h h9 = h(context);
                try {
                    if (h9 == null) {
                        return 0;
                    }
                    try {
                        Parcel e02 = h9.e0(h9.w0(), 6);
                        int readInt2 = e02.readInt();
                        e02.recycle();
                        if (readInt2 < 3) {
                            if (readInt2 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                W2.b bVar = new W2.b(context);
                                Parcel w02 = h9.w0();
                                c3.h.b(w02, bVar);
                                w02.writeString(ModuleDescriptor.MODULE_ID);
                                w02.writeInt(z3 ? 1 : 0);
                                Parcel e03 = h9.e0(w02, 5);
                                readInt = e03.readInt();
                                e03.recycle();
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                W2.b bVar2 = new W2.b(context);
                                Parcel w03 = h9.w0();
                                c3.h.b(w03, bVar2);
                                w03.writeString(ModuleDescriptor.MODULE_ID);
                                w03.writeInt(z3 ? 1 : 0);
                                Parcel e04 = h9.e0(w03, 3);
                                readInt = e04.readInt();
                                e04.recycle();
                            }
                            return readInt;
                        }
                        ThreadLocal threadLocal = f3780h;
                        g gVar = (g) threadLocal.get();
                        if (gVar != null && (cursor = gVar.f3793a) != null) {
                            return cursor.getInt(0);
                        }
                        Cursor cursor3 = (Cursor) W2.b.F0(h9.L1(new W2.b(context), z3, ((Long) i.get()).longValue()));
                        if (cursor3 != null) {
                            try {
                                if (cursor3.moveToFirst()) {
                                    int i6 = cursor3.getInt(0);
                                    if (i6 > 0) {
                                        g gVar2 = (g) threadLocal.get();
                                        if (gVar2 == null || gVar2.f3793a != null) {
                                            z6 = false;
                                        } else {
                                            gVar2.f3793a = cursor3;
                                        }
                                    }
                                    cursor2 = cursor3;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    return i6;
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
            T2.b.a(context, th4);
            throw th4;
        }
    }

    public static boolean e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f3779g)) {
            return true;
        }
        boolean z3 = false;
        if (f3779g == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (M2.f.f1844b.c(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z3 = true;
            }
            f3779g = Boolean.valueOf(z3);
            if (z3 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & com.anythink.expressad.video.module.a.a.f21730T) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f3777e = true;
            }
        }
        if (!z3) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0137, code lost:
    
        if (r7 != false) goto L92;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int f(Context context, boolean z3, boolean z6) {
        Exception exc;
        Throwable th;
        Cursor query;
        MatrixCursor matrixCursor;
        boolean z9;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z10 = true;
                Uri build = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z3 ? "api" : "api_force_staging").appendPath(ModuleDescriptor.MODULE_ID).appendQueryParameter("requestStartUptime", String.valueOf(((Long) i.get()).longValue())).build();
                ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
                boolean z11 = false;
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
                            for (int i6 = 0; i6 < count; i6++) {
                                if (!query.moveToPosition(i6)) {
                                    throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                }
                                Object[] objArr = new Object[columnCount];
                                for (int i9 = 0; i9 < columnCount; i9++) {
                                    int type = query.getType(i9);
                                    if (type == 0) {
                                        objArr[i9] = null;
                                    } else if (type == 1) {
                                        objArr[i9] = Long.valueOf(query.getLong(i9));
                                    } else if (type == 2) {
                                        objArr[i9] = Double.valueOf(query.getDouble(i9));
                                    } else if (type == 3) {
                                        objArr[i9] = query.getString(i9);
                                    } else {
                                        if (type != 4) {
                                            throw new RemoteException("Unknown column type");
                                        }
                                        objArr[i9] = query.getBlob(i9);
                                    }
                                }
                                matrixCursor.addRow(objArr);
                            }
                            query.close();
                            acquireUnstableContentProviderClient.release();
                            if (matrixCursor != null) {
                                try {
                                    if (matrixCursor.moveToFirst()) {
                                        int i10 = matrixCursor.getInt(0);
                                        if (i10 > 0) {
                                            synchronized (c.class) {
                                                try {
                                                    f3776d = matrixCursor.getString(2);
                                                    int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                                    if (columnIndex >= 0) {
                                                        f3778f = matrixCursor.getInt(columnIndex);
                                                    }
                                                    int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                                    if (columnIndex2 >= 0) {
                                                        z9 = matrixCursor.getInt(columnIndex2) != 0;
                                                        f3777e = z9;
                                                    } else {
                                                        z9 = false;
                                                    }
                                                } finally {
                                                }
                                            }
                                            g gVar = (g) f3780h.get();
                                            if (gVar == null || gVar.f3793a != null) {
                                                z10 = false;
                                            } else {
                                                gVar.f3793a = matrixCursor;
                                            }
                                            z11 = z9;
                                        }
                                        matrixCursor2 = matrixCursor;
                                        if (z6 && z11) {
                                            throw new a("forcing fallback to container DynamiteLoader impl");
                                        }
                                        if (matrixCursor2 != null) {
                                            matrixCursor2.close();
                                        }
                                        return i10;
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
        i iVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                iVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof i) {
                    iVar = (i) queryLocalInterface;
                } else {
                    try {
                        iVar = new i(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 1);
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
            f3783l = iVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e13) {
            e = e13;
        }
    }

    public static h h(Context context) {
        h hVar;
        synchronized (c.class) {
            h hVar2 = f3782k;
            if (hVar2 != null) {
                return hVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    hVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    hVar = queryLocalInterface instanceof h ? (h) queryLocalInterface : new h(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 1);
                }
                if (hVar != null) {
                    f3782k = hVar;
                    return hVar;
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
            return (IBinder) this.f3784a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e9) {
            throw new a("Failed to instantiate module class: ".concat(str), e9);
        }
    }
}
