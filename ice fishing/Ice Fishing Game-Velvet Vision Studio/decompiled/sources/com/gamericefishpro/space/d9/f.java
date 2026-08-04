package com.gamericefishpro.space.d9;

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
import com.gamericefishpro.space.v8.c0;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static Boolean e = null;
    public static String f = null;
    public static boolean g = false;
    public static int h = -1;
    public static Boolean i;
    public static m m;
    public static n n;
    public final Context a;
    public static final ThreadLocal j = new ThreadLocal();
    public static final j k = new j(0);
    public static final com.gamericefishpro.space.v8.l l = new com.gamericefishpro.space.v8.l(2);
    public static final com.gamericefishpro.space.ka.f b = new com.gamericefishpro.space.ka.f(3);
    public static final com.gamericefishpro.space.lb.e c = new com.gamericefishpro.space.lb.e(3);
    public static final com.gamericefishpro.space.v8.l d = new com.gamericefishpro.space.v8.l(3);

    public f(Context context) {
        this.a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(str.length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (c0.j(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 50 + str.length() + 1);
            sb2.append("Module descriptor id '");
            sb2.append(strValueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(str.length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f5 A[Catch: all -> 0x0123, b -> 0x0126, RemoteException -> 0x0129, TryCatch #8 {RemoteException -> 0x0129, b -> 0x0126, all -> 0x0123, blocks: (B:36:0x00c0, B:42:0x00cc, B:44:0x00d3, B:45:0x00e9, B:49:0x00ef, B:51:0x00f7, B:53:0x00fb, B:54:0x0109, B:61:0x0114, B:69:0x0141, B:71:0x0149, B:72:0x0150, B:73:0x0157, B:68:0x012c, B:76:0x015a, B:77:0x015b, B:78:0x0162, B:79:0x0163, B:80:0x016a, B:83:0x016d, B:84:0x016e, B:86:0x0188, B:88:0x019b, B:90:0x01a3, B:96:0x01df, B:98:0x01e5, B:99:0x01ed, B:100:0x01f4, B:91:0x01b4, B:92:0x01bb, B:94:0x01be, B:95:0x01cf, B:101:0x01f5, B:102:0x01fc, B:103:0x01fd, B:104:0x0204, B:110:0x0210), top: B:160:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x01fd A[Catch: all -> 0x0123, b -> 0x0126, RemoteException -> 0x0129, TryCatch #8 {RemoteException -> 0x0129, b -> 0x0126, all -> 0x0123, blocks: (B:36:0x00c0, B:42:0x00cc, B:44:0x00d3, B:45:0x00e9, B:49:0x00ef, B:51:0x00f7, B:53:0x00fb, B:54:0x0109, B:61:0x0114, B:69:0x0141, B:71:0x0149, B:72:0x0150, B:73:0x0157, B:68:0x012c, B:76:0x015a, B:77:0x015b, B:78:0x0162, B:79:0x0163, B:80:0x016a, B:83:0x016d, B:84:0x016e, B:86:0x0188, B:88:0x019b, B:90:0x01a3, B:96:0x01df, B:98:0x01e5, B:99:0x01ed, B:100:0x01f4, B:91:0x01b4, B:92:0x01bb, B:94:0x01be, B:95:0x01cf, B:101:0x01f5, B:102:0x01fc, B:103:0x01fd, B:104:0x0204, B:110:0x0210), top: B:160:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0207 A[Catch: all -> 0x0205, TRY_ENTER, TryCatch #1 {, blocks: (B:37:0x00c1, B:39:0x00c7, B:40:0x00c9, B:107:0x0207, B:108:0x020e), top: B:151:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0266  */
    /* JADX WARN: Code duplicated, block: B:126:0x026c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0275  */
    /* JADX WARN: Code duplicated, block: B:134:0x0286 A[Catch: all -> 0x008d, TryCatch #7 {all -> 0x008d, blocks: (B:7:0x003c, B:11:0x0086, B:18:0x0092, B:22:0x0099, B:34:0x00bc, B:111:0x0211, B:112:0x0218, B:115:0x021b, B:116:0x021c, B:117:0x0223, B:134:0x0286, B:135:0x02a4, B:118:0x0224, B:120:0x024a, B:122:0x0258, B:132:0x027e, B:133:0x0285, B:136:0x02a5, B:137:0x02ee), top: B:157:0x003c, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x00ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0099 A[Catch: all -> 0x008d, TRY_LEAVE, TryCatch #7 {all -> 0x008d, blocks: (B:7:0x003c, B:11:0x0086, B:18:0x0092, B:22:0x0099, B:34:0x00bc, B:111:0x0211, B:112:0x0218, B:115:0x021b, B:116:0x021c, B:117:0x0223, B:134:0x0286, B:135:0x02a4, B:118:0x0224, B:120:0x024a, B:122:0x0258, B:132:0x027e, B:133:0x0285, B:136:0x02a5, B:137:0x02ee), top: B:157:0x003c, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c7 A[Catch: all -> 0x0205, TryCatch #1 {, blocks: (B:37:0x00c1, B:39:0x00c7, B:40:0x00c9, B:107:0x0207, B:108:0x020e), top: B:151:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00cc A[Catch: all -> 0x0123, b -> 0x0126, RemoteException -> 0x0129, TRY_ENTER, TryCatch #8 {RemoteException -> 0x0129, b -> 0x0126, all -> 0x0123, blocks: (B:36:0x00c0, B:42:0x00cc, B:44:0x00d3, B:45:0x00e9, B:49:0x00ef, B:51:0x00f7, B:53:0x00fb, B:54:0x0109, B:61:0x0114, B:69:0x0141, B:71:0x0149, B:72:0x0150, B:73:0x0157, B:68:0x012c, B:76:0x015a, B:77:0x015b, B:78:0x0162, B:79:0x0163, B:80:0x016a, B:83:0x016d, B:84:0x016e, B:86:0x0188, B:88:0x019b, B:90:0x01a3, B:96:0x01df, B:98:0x01e5, B:99:0x01ed, B:100:0x01f4, B:91:0x01b4, B:92:0x01bb, B:94:0x01be, B:95:0x01cf, B:101:0x01f5, B:102:0x01fc, B:103:0x01fd, B:104:0x0204, B:110:0x0210), top: B:160:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d3 A[Catch: all -> 0x0123, b -> 0x0126, RemoteException -> 0x0129, TryCatch #8 {RemoteException -> 0x0129, b -> 0x0126, all -> 0x0123, blocks: (B:36:0x00c0, B:42:0x00cc, B:44:0x00d3, B:45:0x00e9, B:49:0x00ef, B:51:0x00f7, B:53:0x00fb, B:54:0x0109, B:61:0x0114, B:69:0x0141, B:71:0x0149, B:72:0x0150, B:73:0x0157, B:68:0x012c, B:76:0x015a, B:77:0x015b, B:78:0x0162, B:79:0x0163, B:80:0x016a, B:83:0x016d, B:84:0x016e, B:86:0x0188, B:88:0x019b, B:90:0x01a3, B:96:0x01df, B:98:0x01e5, B:99:0x01ed, B:100:0x01f4, B:91:0x01b4, B:92:0x01bb, B:94:0x01be, B:95:0x01cf, B:101:0x01f5, B:102:0x01fc, B:103:0x01fd, B:104:0x0204, B:110:0x0210), top: B:160:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ef A[Catch: all -> 0x0123, b -> 0x0126, RemoteException -> 0x0129, TRY_ENTER, TryCatch #8 {RemoteException -> 0x0129, b -> 0x0126, all -> 0x0123, blocks: (B:36:0x00c0, B:42:0x00cc, B:44:0x00d3, B:45:0x00e9, B:49:0x00ef, B:51:0x00f7, B:53:0x00fb, B:54:0x0109, B:61:0x0114, B:69:0x0141, B:71:0x0149, B:72:0x0150, B:73:0x0157, B:68:0x012c, B:76:0x015a, B:77:0x015b, B:78:0x0162, B:79:0x0163, B:80:0x016a, B:83:0x016d, B:84:0x016e, B:86:0x0188, B:88:0x019b, B:90:0x01a3, B:96:0x01df, B:98:0x01e5, B:99:0x01ed, B:100:0x01f4, B:91:0x01b4, B:92:0x01bb, B:94:0x01be, B:95:0x01cf, B:101:0x01f5, B:102:0x01fc, B:103:0x01fd, B:104:0x0204, B:110:0x0210), top: B:160:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0163 A[Catch: all -> 0x0123, b -> 0x0126, RemoteException -> 0x0129, TryCatch #8 {RemoteException -> 0x0129, b -> 0x0126, all -> 0x0123, blocks: (B:36:0x00c0, B:42:0x00cc, B:44:0x00d3, B:45:0x00e9, B:49:0x00ef, B:51:0x00f7, B:53:0x00fb, B:54:0x0109, B:61:0x0114, B:69:0x0141, B:71:0x0149, B:72:0x0150, B:73:0x0157, B:68:0x012c, B:76:0x015a, B:77:0x015b, B:78:0x0162, B:79:0x0163, B:80:0x016a, B:83:0x016d, B:84:0x016e, B:86:0x0188, B:88:0x019b, B:90:0x01a3, B:96:0x01df, B:98:0x01e5, B:99:0x01ed, B:100:0x01f4, B:91:0x01b4, B:92:0x01bb, B:94:0x01be, B:95:0x01cf, B:101:0x01f5, B:102:0x01fc, B:103:0x01fd, B:104:0x0204, B:110:0x0210), top: B:160:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x016e A[Catch: all -> 0x0123, b -> 0x0126, RemoteException -> 0x0129, TryCatch #8 {RemoteException -> 0x0129, b -> 0x0126, all -> 0x0123, blocks: (B:36:0x00c0, B:42:0x00cc, B:44:0x00d3, B:45:0x00e9, B:49:0x00ef, B:51:0x00f7, B:53:0x00fb, B:54:0x0109, B:61:0x0114, B:69:0x0141, B:71:0x0149, B:72:0x0150, B:73:0x0157, B:68:0x012c, B:76:0x015a, B:77:0x015b, B:78:0x0162, B:79:0x0163, B:80:0x016a, B:83:0x016d, B:84:0x016e, B:86:0x0188, B:88:0x019b, B:90:0x01a3, B:96:0x01df, B:98:0x01e5, B:99:0x01ed, B:100:0x01f4, B:91:0x01b4, B:92:0x01bb, B:94:0x01be, B:95:0x01cf, B:101:0x01f5, B:102:0x01fc, B:103:0x01fd, B:104:0x0204, B:110:0x0210), top: B:160:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0188 A[Catch: all -> 0x0123, b -> 0x0126, RemoteException -> 0x0129, TryCatch #8 {RemoteException -> 0x0129, b -> 0x0126, all -> 0x0123, blocks: (B:36:0x00c0, B:42:0x00cc, B:44:0x00d3, B:45:0x00e9, B:49:0x00ef, B:51:0x00f7, B:53:0x00fb, B:54:0x0109, B:61:0x0114, B:69:0x0141, B:71:0x0149, B:72:0x0150, B:73:0x0157, B:68:0x012c, B:76:0x015a, B:77:0x015b, B:78:0x0162, B:79:0x0163, B:80:0x016a, B:83:0x016d, B:84:0x016e, B:86:0x0188, B:88:0x019b, B:90:0x01a3, B:96:0x01df, B:98:0x01e5, B:99:0x01ed, B:100:0x01f4, B:91:0x01b4, B:92:0x01bb, B:94:0x01be, B:95:0x01cf, B:101:0x01f5, B:102:0x01fc, B:103:0x01fd, B:104:0x0204, B:110:0x0210), top: B:160:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x019b A[Catch: all -> 0x0123, b -> 0x0126, RemoteException -> 0x0129, TryCatch #8 {RemoteException -> 0x0129, b -> 0x0126, all -> 0x0123, blocks: (B:36:0x00c0, B:42:0x00cc, B:44:0x00d3, B:45:0x00e9, B:49:0x00ef, B:51:0x00f7, B:53:0x00fb, B:54:0x0109, B:61:0x0114, B:69:0x0141, B:71:0x0149, B:72:0x0150, B:73:0x0157, B:68:0x012c, B:76:0x015a, B:77:0x015b, B:78:0x0162, B:79:0x0163, B:80:0x016a, B:83:0x016d, B:84:0x016e, B:86:0x0188, B:88:0x019b, B:90:0x01a3, B:96:0x01df, B:98:0x01e5, B:99:0x01ed, B:100:0x01f4, B:91:0x01b4, B:92:0x01bb, B:94:0x01be, B:95:0x01cf, B:101:0x01f5, B:102:0x01fc, B:103:0x01fd, B:104:0x0204, B:110:0x0210), top: B:160:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01a3 A[Catch: all -> 0x0123, b -> 0x0126, RemoteException -> 0x0129, TryCatch #8 {RemoteException -> 0x0129, b -> 0x0126, all -> 0x0123, blocks: (B:36:0x00c0, B:42:0x00cc, B:44:0x00d3, B:45:0x00e9, B:49:0x00ef, B:51:0x00f7, B:53:0x00fb, B:54:0x0109, B:61:0x0114, B:69:0x0141, B:71:0x0149, B:72:0x0150, B:73:0x0157, B:68:0x012c, B:76:0x015a, B:77:0x015b, B:78:0x0162, B:79:0x0163, B:80:0x016a, B:83:0x016d, B:84:0x016e, B:86:0x0188, B:88:0x019b, B:90:0x01a3, B:96:0x01df, B:98:0x01e5, B:99:0x01ed, B:100:0x01f4, B:91:0x01b4, B:92:0x01bb, B:94:0x01be, B:95:0x01cf, B:101:0x01f5, B:102:0x01fc, B:103:0x01fd, B:104:0x0204, B:110:0x0210), top: B:160:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01b4 A[Catch: all -> 0x0123, b -> 0x0126, RemoteException -> 0x0129, TryCatch #8 {RemoteException -> 0x0129, b -> 0x0126, all -> 0x0123, blocks: (B:36:0x00c0, B:42:0x00cc, B:44:0x00d3, B:45:0x00e9, B:49:0x00ef, B:51:0x00f7, B:53:0x00fb, B:54:0x0109, B:61:0x0114, B:69:0x0141, B:71:0x0149, B:72:0x0150, B:73:0x0157, B:68:0x012c, B:76:0x015a, B:77:0x015b, B:78:0x0162, B:79:0x0163, B:80:0x016a, B:83:0x016d, B:84:0x016e, B:86:0x0188, B:88:0x019b, B:90:0x01a3, B:96:0x01df, B:98:0x01e5, B:99:0x01ed, B:100:0x01f4, B:91:0x01b4, B:92:0x01bb, B:94:0x01be, B:95:0x01cf, B:101:0x01f5, B:102:0x01fc, B:103:0x01fd, B:104:0x0204, B:110:0x0210), top: B:160:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x01be A[Catch: all -> 0x0123, b -> 0x0126, RemoteException -> 0x0129, TryCatch #8 {RemoteException -> 0x0129, b -> 0x0126, all -> 0x0123, blocks: (B:36:0x00c0, B:42:0x00cc, B:44:0x00d3, B:45:0x00e9, B:49:0x00ef, B:51:0x00f7, B:53:0x00fb, B:54:0x0109, B:61:0x0114, B:69:0x0141, B:71:0x0149, B:72:0x0150, B:73:0x0157, B:68:0x012c, B:76:0x015a, B:77:0x015b, B:78:0x0162, B:79:0x0163, B:80:0x016a, B:83:0x016d, B:84:0x016e, B:86:0x0188, B:88:0x019b, B:90:0x01a3, B:96:0x01df, B:98:0x01e5, B:99:0x01ed, B:100:0x01f4, B:91:0x01b4, B:92:0x01bb, B:94:0x01be, B:95:0x01cf, B:101:0x01f5, B:102:0x01fc, B:103:0x01fd, B:104:0x0204, B:110:0x0210), top: B:160:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01cf A[Catch: all -> 0x0123, b -> 0x0126, RemoteException -> 0x0129, TryCatch #8 {RemoteException -> 0x0129, b -> 0x0126, all -> 0x0123, blocks: (B:36:0x00c0, B:42:0x00cc, B:44:0x00d3, B:45:0x00e9, B:49:0x00ef, B:51:0x00f7, B:53:0x00fb, B:54:0x0109, B:61:0x0114, B:69:0x0141, B:71:0x0149, B:72:0x0150, B:73:0x0157, B:68:0x012c, B:76:0x015a, B:77:0x015b, B:78:0x0162, B:79:0x0163, B:80:0x016a, B:83:0x016d, B:84:0x016e, B:86:0x0188, B:88:0x019b, B:90:0x01a3, B:96:0x01df, B:98:0x01e5, B:99:0x01ed, B:100:0x01f4, B:91:0x01b4, B:92:0x01bb, B:94:0x01be, B:95:0x01cf, B:101:0x01f5, B:102:0x01fc, B:103:0x01fd, B:104:0x0204, B:110:0x0210), top: B:160:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01e5 A[Catch: all -> 0x0123, b -> 0x0126, RemoteException -> 0x0129, TryCatch #8 {RemoteException -> 0x0129, b -> 0x0126, all -> 0x0123, blocks: (B:36:0x00c0, B:42:0x00cc, B:44:0x00d3, B:45:0x00e9, B:49:0x00ef, B:51:0x00f7, B:53:0x00fb, B:54:0x0109, B:61:0x0114, B:69:0x0141, B:71:0x0149, B:72:0x0150, B:73:0x0157, B:68:0x012c, B:76:0x015a, B:77:0x015b, B:78:0x0162, B:79:0x0163, B:80:0x016a, B:83:0x016d, B:84:0x016e, B:86:0x0188, B:88:0x019b, B:90:0x01a3, B:96:0x01df, B:98:0x01e5, B:99:0x01ed, B:100:0x01f4, B:91:0x01b4, B:92:0x01bb, B:94:0x01be, B:95:0x01cf, B:101:0x01f5, B:102:0x01fc, B:103:0x01fd, B:104:0x0204, B:110:0x0210), top: B:160:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01ed A[Catch: all -> 0x0123, b -> 0x0126, RemoteException -> 0x0129, TryCatch #8 {RemoteException -> 0x0129, b -> 0x0126, all -> 0x0123, blocks: (B:36:0x00c0, B:42:0x00cc, B:44:0x00d3, B:45:0x00e9, B:49:0x00ef, B:51:0x00f7, B:53:0x00fb, B:54:0x0109, B:61:0x0114, B:69:0x0141, B:71:0x0149, B:72:0x0150, B:73:0x0157, B:68:0x012c, B:76:0x015a, B:77:0x015b, B:78:0x0162, B:79:0x0163, B:80:0x016a, B:83:0x016d, B:84:0x016e, B:86:0x0188, B:88:0x019b, B:90:0x01a3, B:96:0x01df, B:98:0x01e5, B:99:0x01ed, B:100:0x01f4, B:91:0x01b4, B:92:0x01bb, B:94:0x01be, B:95:0x01cf, B:101:0x01f5, B:102:0x01fc, B:103:0x01fd, B:104:0x0204, B:110:0x0210), top: B:160:0x00c0 }] */
    public static f c(Context context, e eVar, String str) throws Throwable {
        long j2;
        f fVar;
        Cursor cursor;
        int i2;
        Boolean bool;
        m mVarH;
        int i3;
        com.gamericefishpro.space.c9.a aVarK;
        Object objG;
        k kVar;
        n nVar;
        k kVar2;
        boolean z;
        com.gamericefishpro.space.c9.a aVarK2;
        Cursor cursor2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new b("null application Context");
        }
        ThreadLocal threadLocal = j;
        k kVar3 = (k) threadLocal.get();
        k kVar4 = new k();
        threadLocal.set(kVar4);
        j jVar = k;
        Long l2 = (Long) jVar.get();
        long jLongValue = l2.longValue();
        try {
            j2 = jLongValue;
            try {
                jVar.set(Long.valueOf(SystemClock.uptimeMillis()));
                d dVarE = eVar.e(context, str, l);
                new StringBuilder(str.length() + 26 + String.valueOf(dVarE.a).length() + 19 + str.length() + 1 + String.valueOf(dVarE.b).length());
                int i4 = dVarE.c;
                if (i4 != 0) {
                    if (i4 != -1) {
                        if (i4 == 1 || dVarE.b != 0) {
                            if (i4 == -1) {
                                "Selected local version of ".concat(str);
                                f fVar2 = new f(applicationContext);
                                if (j2 == 0) {
                                    jVar.remove();
                                } else {
                                    jVar.set(l2);
                                }
                                cursor2 = kVar4.a;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                threadLocal.set(kVar3);
                                return fVar2;
                            }
                            if (i4 == 1) {
                                StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 36);
                                sb.append("VersionPolicy returned invalid code:");
                                sb.append(i4);
                                throw new b(sb.toString());
                            }
                            try {
                                i2 = dVarE.b;
                                try {
                                    synchronized (f.class) {
                                        if (e(context)) {
                                            throw new b("Remote loading disabled");
                                        }
                                        bool = e;
                                    }
                                    if (bool != null) {
                                        throw new b("Failed to determine which loading route to use.");
                                    }
                                    if (bool.booleanValue()) {
                                        new StringBuilder(str.length() + 40 + String.valueOf(i2).length());
                                        synchronized (f.class) {
                                            nVar = n;
                                        }
                                        if (nVar != null) {
                                            throw new b("DynamiteLoaderV2 was not cached.");
                                        }
                                        kVar2 = (k) threadLocal.get();
                                        if (kVar2 != null || kVar2.a == null) {
                                            throw new b("No result cursor");
                                        }
                                        Context applicationContext2 = context.getApplicationContext();
                                        Cursor cursor3 = kVar2.a;
                                        new com.gamericefishpro.space.c9.b(null);
                                        synchronized (f.class) {
                                            z = h >= 2;
                                        }
                                        if (z) {
                                            aVarK2 = nVar.L(new com.gamericefishpro.space.c9.b(applicationContext2), str, i2, new com.gamericefishpro.space.c9.b(cursor3));
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                            aVarK2 = nVar.K(new com.gamericefishpro.space.c9.b(applicationContext2), str, i2, new com.gamericefishpro.space.c9.b(cursor3));
                                        }
                                        Context context2 = (Context) com.gamericefishpro.space.c9.b.G(aVarK2);
                                        if (context2 == null) {
                                            throw new b("Failed to get module context");
                                        }
                                        fVar = new f(context2);
                                    } else {
                                        new StringBuilder(str.length() + 40 + String.valueOf(i2).length());
                                        mVarH = h(context);
                                        if (mVarH != null) {
                                            throw new b("Failed to create IDynamiteLoader.");
                                        }
                                        Parcel parcelF = mVarH.F(mVarH.H(), 6);
                                        i3 = parcelF.readInt();
                                        parcelF.recycle();
                                        if (i3 >= 3) {
                                            kVar = (k) threadLocal.get();
                                            if (kVar != null) {
                                                throw new b("No cached result cursor holder");
                                            }
                                            aVarK = mVarH.N(new com.gamericefishpro.space.c9.b(context), str, i2, new com.gamericefishpro.space.c9.b(kVar.a));
                                        } else if (i3 == 2) {
                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                            aVarK = mVarH.L(new com.gamericefishpro.space.c9.b(context), str, i2);
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                            aVarK = mVarH.K(new com.gamericefishpro.space.c9.b(context), str, i2);
                                        }
                                        objG = com.gamericefishpro.space.c9.b.G(aVarK);
                                        if (objG != null) {
                                            throw new b("Failed to load remote module.");
                                        }
                                        fVar = new f((Context) objG);
                                    }
                                    if (j2 == 0) {
                                        k.remove();
                                    } else {
                                        k.set(l2);
                                    }
                                    cursor = kVar4.a;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    j.set(kVar3);
                                    return fVar;
                                } catch (RemoteException e2) {
                                    throw new b("Failed to load remote module.", e2);
                                } catch (b e3) {
                                    throw e3;
                                } catch (Throwable th) {
                                    throw new b("Failed to load remote module.", th);
                                }
                            } catch (b e4) {
                                String message = e4.getMessage();
                                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 30);
                                sb2.append("Failed to load remote module: ");
                                sb2.append(message);
                                Log.w("DynamiteModule", sb2.toString());
                                int i5 = dVarE.a;
                                if (i5 == 0 || eVar.e(context, str, new l(i5)).c != -1) {
                                    throw new b("Remote load failed. No local fallback found.", e4);
                                }
                                "Selected local version of ".concat(str);
                                fVar = new f(applicationContext);
                            }
                        }
                    } else if (dVarE.a != 0) {
                        i4 = -1;
                        if (i4 == 1) {
                        }
                        if (i4 == -1) {
                            "Selected local version of ".concat(str);
                            f fVar3 = new f(applicationContext);
                            if (j2 == 0) {
                                jVar.remove();
                            } else {
                                jVar.set(l2);
                            }
                            cursor2 = kVar4.a;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(kVar3);
                            return fVar3;
                        }
                        if (i4 == 1) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(i4).length() + 36);
                            sb3.append("VersionPolicy returned invalid code:");
                            sb3.append(i4);
                            throw new b(sb3.toString());
                        }
                        i2 = dVarE.b;
                        synchronized (f.class) {
                            if (e(context)) {
                                throw new b("Remote loading disabled");
                            }
                            bool = e;
                            if (bool != null) {
                                throw new b("Failed to determine which loading route to use.");
                            }
                            if (bool.booleanValue()) {
                                new StringBuilder(str.length() + 40 + String.valueOf(i2).length());
                                synchronized (f.class) {
                                    nVar = n;
                                    if (nVar != null) {
                                        throw new b("DynamiteLoaderV2 was not cached.");
                                    }
                                    kVar2 = (k) threadLocal.get();
                                    if (kVar2 != null) {
                                    }
                                    throw new b("No result cursor");
                                }
                            }
                            new StringBuilder(str.length() + 40 + String.valueOf(i2).length());
                            mVarH = h(context);
                            if (mVarH != null) {
                                throw new b("Failed to create IDynamiteLoader.");
                            }
                            Parcel parcelF2 = mVarH.F(mVarH.H(), 6);
                            i3 = parcelF2.readInt();
                            parcelF2.recycle();
                            if (i3 >= 3) {
                                kVar = (k) threadLocal.get();
                                if (kVar != null) {
                                    throw new b("No cached result cursor holder");
                                }
                                aVarK = mVarH.N(new com.gamericefishpro.space.c9.b(context), str, i2, new com.gamericefishpro.space.c9.b(kVar.a));
                            } else if (i3 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                aVarK = mVarH.L(new com.gamericefishpro.space.c9.b(context), str, i2);
                            } else {
                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                aVarK = mVarH.K(new com.gamericefishpro.space.c9.b(context), str, i2);
                            }
                            objG = com.gamericefishpro.space.c9.b.G(aVarK);
                            if (objG != null) {
                                throw new b("Failed to load remote module.");
                            }
                            fVar = new f((Context) objG);
                            if (j2 == 0) {
                                k.remove();
                            } else {
                                k.set(l2);
                            }
                            cursor = kVar4.a;
                            if (cursor != null) {
                                cursor.close();
                            }
                            j.set(kVar3);
                            return fVar;
                        }
                    }
                }
                int i6 = dVarE.a;
                int i7 = dVarE.b;
                StringBuilder sb4 = new StringBuilder(str.length() + 46 + String.valueOf(i6).length() + 23 + String.valueOf(i7).length() + 1);
                sb4.append("No acceptable module ");
                sb4.append(str);
                sb4.append(" found. Local version is ");
                sb4.append(i6);
                sb4.append(" and remote version is ");
                sb4.append(i7);
                sb4.append(".");
                throw new b(sb4.toString());
            } catch (Throwable th2) {
                th = th2;
                if (j2 == 0) {
                    k.remove();
                } else {
                    k.set(l2);
                }
                Cursor cursor4 = kVar4.a;
                if (cursor4 != null) {
                    cursor4.close();
                }
                j.set(kVar3);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            j2 = jLongValue;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0191  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b4 A[Catch: all -> 0x003b, TryCatch #13 {all -> 0x003b, blocks: (B:10:0x002b, B:12:0x0037, B:52:0x00bd, B:17:0x0040, B:19:0x0047, B:21:0x004d, B:26:0x0054, B:28:0x0058, B:31:0x0061, B:33:0x0069, B:36:0x0070, B:43:0x009c, B:44:0x00a4, B:39:0x0077, B:41:0x007d, B:42:0x008e, B:47:0x00a7, B:50:0x00aa, B:51:0x00b4, B:18:0x0043), top: B:152:0x002b, inners: #4 }] */
    public static int d(String str, boolean z, Context context) {
        Throwable th;
        RemoteException remoteException;
        int i2;
        Cursor cursor;
        try {
            synchronized (f.class) {
                Boolean bool = e;
                boolean z2 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        g(classLoader);
                                    } catch (b unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!e(context)) {
                                        return 0;
                                    }
                                    if (g) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iF = f(context, str, z, true);
                                                String str2 = f;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderR = h.R();
                                                    if (classLoaderR == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            a.b();
                                                            String str3 = f;
                                                            c0.g(str3);
                                                            classLoaderR = a.a(str3, ClassLoader.getSystemClassLoader());
                                                        } else {
                                                            String str4 = f;
                                                            c0.g(str4);
                                                            classLoaderR = new i(str4, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    g(classLoaderR);
                                                    declaredField.set(null, classLoaderR);
                                                    e = bool2;
                                                    return iF;
                                                }
                                                return iF;
                                            } catch (b unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                e = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        String string = e2.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(string);
                        Log.w("DynamiteModule", sb.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return f(context, str, z, false);
                    } catch (b e3) {
                        String message = e3.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 42);
                        sb2.append("Failed to retrieve remote module version: ");
                        sb2.append(message);
                        Log.w("DynamiteModule", sb2.toString());
                        return 0;
                    }
                }
                m mVarH = h(context);
                try {
                    if (mVarH == null) {
                        return 0;
                    }
                    try {
                        Parcel parcelF = mVarH.F(mVarH.H(), 6);
                        int i3 = parcelF.readInt();
                        parcelF.recycle();
                        if (i3 >= 3) {
                            ThreadLocal threadLocal = j;
                            k kVar = (k) threadLocal.get();
                            if (kVar != null && (cursor = kVar.a) != null) {
                                return cursor.getInt(0);
                            }
                            Cursor cursor3 = (Cursor) com.gamericefishpro.space.c9.b.G(mVarH.M(new com.gamericefishpro.space.c9.b(context), str, z, ((Long) k.get()).longValue()));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        i2 = cursor3.getInt(0);
                                        if (i2 > 0) {
                                            k kVar2 = (k) threadLocal.get();
                                            if (kVar2 == null || kVar2.a != null) {
                                                z2 = false;
                                            } else {
                                                kVar2.a = cursor3;
                                            }
                                            cursor2 = z2 ? null : cursor3;
                                        }
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e4) {
                                    remoteException = e4;
                                    cursor2 = cursor3;
                                    String message2 = remoteException.getMessage();
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 42);
                                    sb3.append("Failed to retrieve remote module version: ");
                                    sb3.append(message2);
                                    Log.w("DynamiteModule", sb3.toString());
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor2 = cursor3;
                                    if (cursor2 == null) {
                                        throw th;
                                    }
                                    cursor2.close();
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        }
                        if (i3 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            com.gamericefishpro.space.c9.b bVar = new com.gamericefishpro.space.c9.b(context);
                            Parcel parcelH = mVarH.H();
                            com.gamericefishpro.space.h9.i.b(parcelH, bVar);
                            parcelH.writeString(str);
                            parcelH.writeInt(z ? 1 : 0);
                            Parcel parcelF2 = mVarH.F(parcelH, 5);
                            i2 = parcelF2.readInt();
                            parcelF2.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            com.gamericefishpro.space.c9.b bVar2 = new com.gamericefishpro.space.c9.b(context);
                            Parcel parcelH2 = mVarH.H();
                            com.gamericefishpro.space.h9.i.b(parcelH2, bVar2);
                            parcelH2.writeString(str);
                            parcelH2.writeInt(z ? 1 : 0);
                            Parcel parcelF3 = mVarH.F(parcelH2, 3);
                            i2 = parcelF3.readInt();
                            parcelF3.recycle();
                        }
                        return i2;
                    } catch (RemoteException e5) {
                        remoteException = e5;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            try {
                c0.g(context);
                throw th5;
            } catch (Exception e6) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e6);
                throw th5;
            }
        }
    }

    public static boolean e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(i)) {
            return true;
        }
        boolean z = false;
        if (i == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (com.gamericefishpro.space.s8.f.b.b(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            i = Boolean.valueOf(z);
            if (z && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                g = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x013a A[PHI: r3
      0x013a: PHI (r3v4 boolean) = (r3v3 boolean), (r3v6 boolean) binds: [B:58:0x00f1, B:83:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    public static int f(Context context, String str, boolean z, boolean z2) throws Throwable {
        Exception exc;
        Throwable th;
        MatrixCursor matrixCursor;
        boolean z3;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z4 = true;
                Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) k.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z5 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i2 = 0; i2 < count; i2++) {
                                    if (!cursorQuery.moveToPosition(i2)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr = new Object[columnCount];
                                    for (int i3 = 0; i3 < columnCount; i3++) {
                                        int type = cursorQuery.getType(i3);
                                        if (type == 0) {
                                            objArr[i3] = null;
                                        } else if (type == 1) {
                                            objArr[i3] = Long.valueOf(cursorQuery.getLong(i3));
                                        } else if (type == 2) {
                                            objArr[i3] = Double.valueOf(cursorQuery.getDouble(i3));
                                        } else if (type == 3) {
                                            objArr[i3] = cursorQuery.getString(i3);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr[i3] = cursorQuery.getBlob(i3);
                                        }
                                    }
                                    matrixCursor.addRow(objArr);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th2) {
                                try {
                                    cursorQuery.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                    } catch (RemoteException unused) {
                    } catch (Throwable th4) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th4;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i4 = matrixCursor.getInt(0);
                            if (i4 > 0) {
                                synchronized (f.class) {
                                    try {
                                        f = matrixCursor.getString(2);
                                        int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            h = matrixCursor.getInt(columnIndex);
                                        }
                                        int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z3 = matrixCursor.getInt(columnIndex2) != 0;
                                            g = z3;
                                        } else {
                                            z3 = false;
                                        }
                                    } catch (Throwable th5) {
                                        throw th5;
                                    }
                                }
                                k kVar = (k) j.get();
                                if (kVar == null || kVar.a != null) {
                                    z4 = false;
                                } else {
                                    kVar.a = matrixCursor;
                                }
                                z5 = z3;
                                matrixCursor2 = z4 ? null : matrixCursor;
                            }
                            if (z2 && z5) {
                                throw new b("forcing fallback to container DynamiteLoader impl");
                            }
                            if (matrixCursor2 != null) {
                                matrixCursor2.close();
                            }
                            return i4;
                        }
                    } catch (Exception e2) {
                        exc = e2;
                        if (exc instanceof b) {
                            throw exc;
                        }
                        String message = exc.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 25);
                        sb.append("V2 version check failed: ");
                        sb.append(message);
                        throw new b(sb.toString(), exc);
                    } catch (Throwable th6) {
                        th = th6;
                        matrixCursor2 = matrixCursor;
                        if (matrixCursor2 == null) {
                            throw th;
                        }
                        matrixCursor2.close();
                        throw th;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new b("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Exception e3) {
            exc = e3;
        }
    }

    public static void g(ClassLoader classLoader) throws b {
        try {
            n nVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                nVar = iInterfaceQueryLocalInterface instanceof n ? (n) iInterfaceQueryLocalInterface : new n(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 1);
            }
            n = nVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new b("Failed to instantiate dynamite loader", e2);
        }
    }

    public static m h(Context context) {
        m mVar;
        synchronized (f.class) {
            m mVar2 = m;
            if (mVar2 != null) {
                return mVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    mVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    mVar = iInterfaceQueryLocalInterface instanceof m ? (m) iInterfaceQueryLocalInterface : new m(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 1);
                }
                if (mVar != null) {
                    m = mVar;
                    return mVar;
                }
            } catch (Exception e2) {
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 45);
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
                Log.e("DynamiteModule", sb.toString());
            }
            return null;
        }
    }

    public final IBinder b(String str) throws b {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new b("Failed to instantiate module class: ".concat(str), e2);
        }
    }
}
