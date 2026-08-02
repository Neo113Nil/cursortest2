package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Log;
import com.yandex.div.state.db.StateEntry;
import defpackage.ba20;
import defpackage.hqg;
import defpackage.x920;
import defpackage.ywt0;
import defpackage.z920;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes11.dex */
public class ywt0 implements tsr, ca20 {
    public static String A;
    public static pqg E;
    public Context a;
    public ea20 b;
    public static final HashMap c = new HashMap();
    public static final HashMap w = new HashMap();
    public static final Object x = new Object();
    public static final Object y = new Object();
    public static int z = 0;
    public static int B = 0;
    public static int C = 1;
    public static int D = 0;

    public static void a(ywt0 ywt0Var, hqg hqgVar) {
        try {
            if (hqgVar.d >= 1) {
                hqgVar.g();
            }
            HashMap hashMap = hqgVar.g;
            if (!hashMap.isEmpty() && hqgVar.d >= 1) {
                hqgVar.g();
                hashMap.size();
            }
            hqgVar.i.close();
        } catch (Exception e) {
            Log.e("Sqflite", "error " + e + " while closing database " + D);
        }
        synchronized (x) {
            try {
                if (w.isEmpty() && E != null) {
                    if (hqgVar.d >= 1) {
                        hqgVar.g();
                    }
                    E.k();
                    E = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static hqg b(x920 x920Var, ba20 ba20Var) {
        Integer num = (Integer) x920Var.a("id");
        int intValue = num.intValue();
        hqg hqgVar = (hqg) w.get(num);
        if (hqgVar != null) {
            return hqgVar;
        }
        ba20Var.error("sqlite_error", "database_closed " + intValue, null);
        return null;
    }

    public static HashMap c(int i, boolean z2, boolean z3) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", Integer.valueOf(i));
        if (z2) {
            hashMap.put("recovered", Boolean.TRUE);
        }
        if (z3) {
            hashMap.put("recoveredInTransaction", Boolean.TRUE);
        }
        return hashMap;
    }

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        Context context = ssrVar.a;
        tt5 tt5Var = ssrVar.c;
        this.a = context;
        wzt0 wzt0Var = wzt0.b;
        tt5Var.getClass();
        ea20 ea20Var = new ea20(tt5Var, "com.tekartik.sqflite", wzt0Var, tt5Var.d(new st5()));
        this.b = ea20Var;
        ea20Var.b(this);
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        this.a = null;
        this.b.b(null);
        this.b = null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ca20
    public final void onMethodCall(final x920 x920Var, da20 da20Var) {
        hqg hqgVar;
        final int i;
        hqg hqgVar2;
        String str = x920Var.a;
        str.getClass();
        int i2 = 5;
        int i3 = 4;
        int i4 = 2;
        int i5 = 1;
        boolean z2 = false;
        Object[] objArr = 0;
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1319569547:
                if (str.equals("execute")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1253581933:
                if (str.equals("closeDatabase")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1249474914:
                if (str.equals("options")) {
                    c2 = 2;
                    break;
                }
                break;
            case -1183792455:
                if (str.equals("insert")) {
                    c2 = 3;
                    break;
                }
                break;
            case -838846263:
                if (str.equals("update")) {
                    c2 = 4;
                    break;
                }
                break;
            case -396289107:
                if (str.equals("androidSetLocale")) {
                    c2 = 5;
                    break;
                }
                break;
            case -263511994:
                if (str.equals("deleteDatabase")) {
                    c2 = 6;
                    break;
                }
                break;
            case -198450538:
                if (str.equals("debugMode")) {
                    c2 = 7;
                    break;
                }
                break;
            case -17190427:
                if (str.equals("openDatabase")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 93509434:
                if (str.equals("batch")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 95458899:
                if (str.equals("debug")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 107944136:
                if (str.equals("query")) {
                    c2 = 11;
                    break;
                }
                break;
            case 956410295:
                if (str.equals("databaseExists")) {
                    c2 = '\f';
                    break;
                }
                break;
            case 1193546321:
                if (str.equals("queryCursorNext")) {
                    c2 = HexString.LF;
                    break;
                }
                break;
            case 1385449135:
                if (str.equals("getPlatformVersion")) {
                    c2 = 14;
                    break;
                }
                break;
            case 1863829223:
                if (str.equals("getDatabasesPath")) {
                    c2 = 15;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                ba20 ba20Var = (ba20) da20Var;
                hqg b = b(x920Var, ba20Var);
                if (b == null) {
                    return;
                }
                E.h(b, new xwt0(x920Var, ba20Var, b, i3));
                return;
            case 1:
                Integer num = (Integer) x920Var.a("id");
                num.getClass();
                ba20 ba20Var2 = (ba20) da20Var;
                hqg b2 = b(x920Var, ba20Var2);
                if (b2 == null) {
                    return;
                }
                if (b2.d >= 1) {
                    b2.g();
                }
                String str2 = b2.b;
                synchronized (x) {
                    try {
                        w.remove(num);
                        if (b2.a) {
                            c.remove(str2);
                        }
                    } finally {
                    }
                }
                E.h(b2, new lz((Object) this, (Object) b2, (Object) ba20Var2, false, 26));
                return;
            case 2:
                Object a = x920Var.a("androidThreadPriority");
                if (a != null) {
                    B = ((Integer) a).intValue();
                }
                Object a2 = x920Var.a("androidThreadCount");
                if (a2 != null && !a2.equals(Integer.valueOf(C))) {
                    C = ((Integer) a2).intValue();
                    pqg pqgVar = E;
                    if (pqgVar != null) {
                        pqgVar.k();
                        E = null;
                    }
                }
                Integer num2 = (Integer) x920Var.a("logLevel");
                if (num2 != null) {
                    z = num2.intValue();
                }
                ((ba20) da20Var).success(null);
                return;
            case 3:
                ba20 ba20Var3 = (ba20) da20Var;
                hqg b3 = b(x920Var, ba20Var3);
                if (b3 == null) {
                    return;
                }
                E.h(b3, new xwt0(x920Var, ba20Var3, b3, i5));
                return;
            case 4:
                ba20 ba20Var4 = (ba20) da20Var;
                hqg b4 = b(x920Var, ba20Var4);
                if (b4 == null) {
                    return;
                }
                E.h(b4, new xwt0(x920Var, ba20Var4, b4, i2));
                return;
            case 5:
                ba20 ba20Var5 = (ba20) da20Var;
                hqg b5 = b(x920Var, ba20Var5);
                if (b5 == null) {
                    return;
                }
                E.h(b5, new xwt0(x920Var, b5, ba20Var5));
                return;
            case 6:
                String str3 = (String) x920Var.a(StateEntry.COLUMN_PATH);
                synchronized (x) {
                    try {
                        if (rez.a(z)) {
                            Objects.toString(c.keySet());
                        }
                        HashMap hashMap = c;
                        Integer num3 = (Integer) hashMap.get(str3);
                        if (num3 != null) {
                            HashMap hashMap2 = w;
                            hqg hqgVar3 = (hqg) hashMap2.get(num3);
                            if (hqgVar3 != null && hqgVar3.i.isOpen()) {
                                if (rez.a(z)) {
                                    hqgVar3.g();
                                    hqgVar3.i();
                                }
                                hashMap2.remove(num3);
                                hashMap.remove(str3);
                                hqgVar = hqgVar3;
                            }
                        }
                        hqgVar = null;
                    } finally {
                    }
                }
                kz kzVar = new kz(7, this, hqgVar, (ba20) da20Var, str3);
                pqg pqgVar2 = E;
                if (pqgVar2 != null) {
                    pqgVar2.h(hqgVar, kzVar);
                    return;
                } else {
                    kzVar.run();
                    return;
                }
            case 7:
                boolean equals = Boolean.TRUE.equals(x920Var.b);
                if (!equals) {
                    z = 0;
                } else if (equals) {
                    z = 1;
                }
                ((ba20) da20Var).success(null);
                return;
            case '\b':
                final String str4 = (String) x920Var.a(StateEntry.COLUMN_PATH);
                final Boolean bool = (Boolean) x920Var.a("readOnly");
                boolean z3 = str4 == null || str4.equals(":memory:");
                boolean z4 = (Boolean.FALSE.equals(x920Var.a("singleInstance")) || z3) ? false : true;
                if (z4) {
                    synchronized (x) {
                        try {
                            if (rez.a(z)) {
                                Objects.toString(c.keySet());
                            }
                            Integer num4 = (Integer) c.get(str4);
                            if (num4 != null && (hqgVar2 = (hqg) w.get(num4)) != null) {
                                if (hqgVar2.i.isOpen()) {
                                    if (rez.a(z)) {
                                        hqgVar2.g();
                                        hqgVar2.i();
                                    }
                                    ((ba20) da20Var).success(c(num4.intValue(), true, hqgVar2.i()));
                                    return;
                                }
                                if (rez.a(z)) {
                                    hqgVar2.g();
                                }
                            }
                        } finally {
                        }
                    }
                }
                Object obj = x;
                synchronized (obj) {
                    i = D + 1;
                    D = i;
                }
                final hqg hqgVar4 = new hqg(this.a, str4, i, z4, z);
                synchronized (obj) {
                    try {
                        if (E == null) {
                            int i6 = C;
                            int i7 = B;
                            pqg o3Var = i6 == 1 ? new o3(i7) : new qqg(i6, i7);
                            E = o3Var;
                            o3Var.start();
                            if (hqgVar4.d >= 1) {
                                hqgVar4.g();
                            }
                        }
                        hqgVar4.h = E;
                        if (hqgVar4.d >= 1) {
                            hqgVar4.g();
                        }
                        final boolean z5 = z3;
                        final ba20 ba20Var6 = (ba20) da20Var;
                        final boolean z6 = z4;
                        E.h(hqgVar4, new Runnable() { // from class: com.tekartik.sqflite.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z7 = z5;
                                String str5 = str4;
                                ba20 ba20Var7 = ba20Var6;
                                Boolean bool2 = bool;
                                final hqg hqgVar5 = hqgVar4;
                                x920 x920Var2 = x920Var;
                                boolean z8 = z6;
                                int i8 = i;
                                synchronized (ywt0.y) {
                                    if (!z7) {
                                        File file = new File(new File(str5).getParent());
                                        if (!file.exists() && !file.mkdirs() && !file.exists()) {
                                            ba20Var7.error("sqlite_error", "open_failed " + str5, null);
                                            return;
                                        }
                                    }
                                    try {
                                        if (Boolean.TRUE.equals(bool2)) {
                                            hqgVar5.i = SQLiteDatabase.openDatabase(hqgVar5.b, null, 1, new DatabaseErrorHandler() { // from class: com.tekartik.sqflite.Database$1
                                                @Override // android.database.DatabaseErrorHandler
                                                public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                                                }
                                            });
                                        } else {
                                            hqgVar5.j();
                                        }
                                        synchronized (ywt0.x) {
                                            if (z8) {
                                                try {
                                                    ywt0.c.put(str5, Integer.valueOf(i8));
                                                } finally {
                                                }
                                            }
                                            ywt0.w.put(Integer.valueOf(i8), hqgVar5);
                                        }
                                        if (hqgVar5.d >= 1) {
                                            hqgVar5.g();
                                        }
                                        ba20Var7.success(ywt0.c(i8, false, false));
                                    } catch (Exception e) {
                                        hqgVar5.h(e, new z920(x920Var2, ba20Var7));
                                    }
                                }
                            }
                        });
                    } finally {
                    }
                }
                return;
            case '\t':
                ba20 ba20Var7 = (ba20) da20Var;
                hqg b6 = b(x920Var, ba20Var7);
                if (b6 == null) {
                    return;
                }
                E.h(b6, new xwt0(b6, x920Var, ba20Var7));
                return;
            case '\n':
                String str5 = (String) x920Var.a("cmd");
                HashMap hashMap3 = new HashMap();
                if ("get".equals(str5)) {
                    int i8 = z;
                    if (i8 > 0) {
                        hashMap3.put("logLevel", Integer.valueOf(i8));
                    }
                    HashMap hashMap4 = w;
                    if (!hashMap4.isEmpty()) {
                        HashMap hashMap5 = new HashMap();
                        for (Map.Entry entry : hashMap4.entrySet()) {
                            hqg hqgVar5 = (hqg) entry.getValue();
                            HashMap hashMap6 = new HashMap();
                            hashMap6.put(StateEntry.COLUMN_PATH, hqgVar5.b);
                            hashMap6.put("singleInstance", Boolean.valueOf(hqgVar5.a));
                            int i9 = hqgVar5.d;
                            if (i9 > 0) {
                                hashMap6.put("logLevel", Integer.valueOf(i9));
                            }
                            hashMap5.put(((Integer) entry.getKey()).toString(), hashMap6);
                        }
                        hashMap3.put("databases", hashMap5);
                    }
                }
                ((ba20) da20Var).success(hashMap3);
                return;
            case 11:
                ba20 ba20Var8 = (ba20) da20Var;
                hqg b7 = b(x920Var, ba20Var8);
                if (b7 == null) {
                    return;
                }
                E.h(b7, new xwt0(x920Var, ba20Var8, b7, i4));
                return;
            case '\f':
                try {
                    z2 = new File((String) x920Var.a(StateEntry.COLUMN_PATH)).exists();
                } catch (Exception unused) {
                }
                ((ba20) da20Var).success(Boolean.valueOf(z2));
                return;
            case '\r':
                ba20 ba20Var9 = (ba20) da20Var;
                hqg b8 = b(x920Var, ba20Var9);
                if (b8 == null) {
                    return;
                }
                E.h(b8, new xwt0(x920Var, ba20Var9, b8, objArr == true ? 1 : 0));
                return;
            case 14:
                ((ba20) da20Var).success("Android " + Build.VERSION.RELEASE);
                return;
            case 15:
                if (A == null) {
                    A = this.a.getDatabasePath("tekartik_sqflite.db").getParent();
                }
                ((ba20) da20Var).success(A);
                return;
            default:
                ((ba20) da20Var).notImplemented();
                return;
        }
    }
}
