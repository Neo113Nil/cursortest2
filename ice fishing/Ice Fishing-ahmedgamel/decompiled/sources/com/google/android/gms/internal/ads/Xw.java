package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.AdError;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import r2.C4906k;
import w2.C5140B;

/* loaded from: classes2.dex */
public final class Xw implements Eu, t.i, InterfaceC3068cn {

    /* renamed from: y, reason: collision with root package name */
    public static final Object f29382y = new Object();

    /* renamed from: n, reason: collision with root package name */
    public final boolean f29383n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f29384u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f29385v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f29386w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f29387x;

    public /* synthetic */ Xw(M.h hVar, boolean z6, ArrayList arrayList, C3360i9 c3360i9, EnumC3628n9 enumC3628n9) {
        this.f29384u = hVar;
        this.f29383n = z6;
        this.f29385v = arrayList;
        this.f29386w = c3360i9;
        this.f29387x = enumC3628n9;
    }

    public static Xw c(Vv vv, Yv yv, EnumC2970aw enumC2970aw, EnumC2970aw enumC2970aw2, boolean z6) {
        if (enumC2970aw == EnumC2970aw.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        Vv vv2 = Vv.DEFINED_BY_JAVASCRIPT;
        EnumC2970aw enumC2970aw3 = EnumC2970aw.NATIVE;
        if (vv == vv2 && enumC2970aw == enumC2970aw3) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (yv == Yv.DEFINED_BY_JAVASCRIPT && enumC2970aw == enumC2970aw3) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new Xw(vv, yv, enumC2970aw, enumC2970aw2, z6);
    }

    public static String n(C3036c8 c3036c8) {
        C3197f8 H8 = C3251g8.H();
        String A9 = c3036c8.A().A();
        H8.h();
        ((C3251g8) H8.f28504u).J(A9);
        String B3 = c3036c8.A().B();
        H8.h();
        ((C3251g8) H8.f28504u).K(B3);
        long D8 = c3036c8.A().D();
        H8.h();
        ((C3251g8) H8.f28504u).M(D8);
        long E8 = c3036c8.A().E();
        H8.h();
        ((C3251g8) H8.f28504u).N(E8);
        long C8 = c3036c8.A().C();
        H8.h();
        ((C3251g8) H8.f28504u).L(C8);
        return V2.b.b(((C3251g8) H8.j()).b());
    }

    public static String o(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        R6 A9 = S6.A();
        A9.h();
        ((S6) A9.f28504u).E(5);
        HK s9 = JK.s(bArr, 0, bArr.length);
        A9.h();
        ((S6) A9.f28504u).B(s9);
        return Base64.encodeToString(((S6) A9.j()).b(), 11);
    }

    @Override // com.google.android.gms.internal.ads.Eu
    public Object a(Object obj) {
        long j6;
        long j9;
        int i;
        C2753Pp c2753Pp = (C2753Pp) ((M.h) this.f29384u).f1807u;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (((C5140B) c2753Pp.f256u).t()) {
            return null;
        }
        EnumC3628n9 enumC3628n9 = (EnumC3628n9) this.f29387x;
        C3360i9 c3360i9 = (C3360i9) this.f29386w;
        ArrayList arrayList = (ArrayList) this.f29385v;
        boolean z6 = this.f29383n;
        C3466k9 Q8 = C3520l9.Q();
        Q8.h();
        ((C3520l9) Q8.f28504u).E(arrayList);
        Context context = c2753Pp.f27655w;
        int i4 = Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 2 : 1;
        Q8.h();
        ((C3520l9) Q8.f28504u).H(i4);
        TelephonyManager telephonyManager = c2753Pp.f27657y;
        C4906k c4906k = C4906k.f40186C;
        int u6 = c4906k.f40194f.u(context, telephonyManager);
        Q8.h();
        ((C3520l9) Q8.f28504u).I(u6);
        C2719Np c2719Np = c2753Pp.f27658z;
        synchronized (c2719Np.f27329h) {
            j6 = c2719Np.f27324c;
        }
        Q8.h();
        ((C3520l9) Q8.f28504u).C(j6);
        synchronized (c2719Np) {
            synchronized (c2719Np.f27330j) {
                j9 = c2719Np.f27326e;
            }
        }
        Q8.h();
        ((C3520l9) Q8.f28504u).D(j9);
        synchronized (c2719Np.f27328g) {
            i = c2719Np.f27323b;
        }
        Q8.h();
        ((C3520l9) Q8.f28504u).J(i);
        Q8.h();
        ((C3520l9) Q8.f28504u).L(enumC3628n9);
        Q8.h();
        ((C3520l9) Q8.f28504u).F(c3360i9);
        int i6 = c2753Pp.f27654A;
        Q8.h();
        ((C3520l9) Q8.f28504u).K(i6);
        int i9 = z6 ? 2 : 1;
        Q8.h();
        ((C3520l9) Q8.f28504u).B(i9);
        long a9 = c2719Np.a();
        Q8.h();
        ((C3520l9) Q8.f28504u).M(a9);
        c4906k.f40198k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        Q8.h();
        ((C3520l9) Q8.f28504u).A(currentTimeMillis);
        int i10 = Settings.Global.getInt(context.getContentResolver(), "wifi_on", 0) != 0 ? 2 : 1;
        Q8.h();
        ((C3520l9) Q8.f28504u).G(i10);
        byte[] b9 = ((C3520l9) Q8.j()).b();
        sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'completed_requests'");
        if (!z6) {
            sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'failed_requests'");
        }
        SK.J(sQLiteDatabase, c2753Pp.f27658z.a(), b9);
        return null;
    }

    @Override // t.i
    public /* synthetic */ Object b(t.h hVar) {
        C3778py c3778py = (C3778py) this.f29384u;
        c3778py.getClass();
        c3778py.f33949a.execute(new RunnableC3670ny(c3778py, (String) this.f29386w, hVar, this.f29383n, (String) this.f29385v, (byte[]) this.f29387x));
        return "";
    }

    public synchronized String d(Context context) {
        byte[] q8;
        try {
            HashMap f2 = ((InterfaceC3078cx) this.f29386w).f();
            f2.put("f", com.anythink.expressad.foundation.d.d.bu);
            f2.put("ctx", context);
            f2.put("aid", null);
            q8 = q(f2);
            if (this.f29383n) {
                f2.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return o(q8);
    }

    public boolean e(C3036c8 c3036c8, V2 v22) {
        boolean z6;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f29382y) {
            try {
                C3251g8 r9 = r(1);
                String A9 = c3036c8.A().A();
                if (r9 != null && r9.A().equals(A9)) {
                    p(4014, currentTimeMillis);
                    return false;
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                File j6 = j(A9);
                if (j6.exists()) {
                    String str = true != j6.isDirectory() ? "0" : "1";
                    String str2 = true != j6.isFile() ? "0" : "1";
                    StringBuilder sb = new StringBuilder(7);
                    sb.append("d:");
                    sb.append(str);
                    sb.append(",f:");
                    sb.append(str2);
                    ((Nw) this.f29387x).b(4023, currentTimeMillis2, sb.toString());
                    p(4015, currentTimeMillis2);
                } else if (!j6.mkdirs()) {
                    ((Nw) this.f29387x).b(4024, currentTimeMillis2, "cw:".concat(true != j6.canWrite() ? "0" : "1"));
                    p(4015, currentTimeMillis2);
                    return false;
                }
                File j9 = j(A9);
                File file = new File(j9, "pcam.jar");
                File file2 = new File(j9, "pcbc");
                if (!MA.u(file, c3036c8.B().a())) {
                    p(4016, currentTimeMillis);
                    return false;
                }
                if (!MA.u(file2, c3036c8.C().a())) {
                    p(4017, currentTimeMillis);
                    return false;
                }
                if (v22 != null) {
                    try {
                        z6 = Bw.a(file);
                    } catch (GeneralSecurityException unused) {
                        z6 = false;
                    }
                    if (!z6) {
                        p(4018, currentTimeMillis);
                        MA.N(j9);
                        return false;
                    }
                }
                String n9 = n(c3036c8);
                long currentTimeMillis3 = System.currentTimeMillis();
                SharedPreferences sharedPreferences = (SharedPreferences) this.f29385v;
                String string = sharedPreferences.getString("LATMTD".concat(String.valueOf((String) this.f29386w)), null);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString("LATMTD".concat(String.valueOf((String) this.f29386w)), n9);
                if (string != null) {
                    edit.putString("FBAMTD".concat(String.valueOf((String) this.f29386w)), string);
                }
                if (!edit.commit()) {
                    p(4019, currentTimeMillis3);
                    return false;
                }
                HashSet hashSet = new HashSet();
                C3251g8 r10 = r(1);
                if (r10 != null) {
                    hashSet.add(r10.A());
                }
                C3251g8 r11 = r(2);
                if (r11 != null) {
                    hashSet.add(r11.A());
                }
                for (File file3 : new File(((Context) this.f29384u).getDir("pccache", 0), (String) this.f29386w).listFiles()) {
                    if (!hashSet.contains(file3.getName())) {
                        MA.N(file3);
                    }
                }
                p(5014, currentTimeMillis);
                return true;
            } finally {
            }
        }
    }

    public synchronized String f(Context context, View view, Activity activity) {
        byte[] q8;
        try {
            HashMap i = ((InterfaceC3078cx) this.f29386w).i();
            i.put("f", "v");
            i.put("ctx", context);
            i.put("aid", null);
            i.put(com.anythink.expressad.a.f18383C, view);
            i.put("act", activity);
            q8 = q(i);
            if (this.f29383n) {
                i.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return o(q8);
    }

    public boolean g(C3036c8 c3036c8) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f29382y) {
            try {
                if (!MA.u(new File(j(c3036c8.A().A()), "pcbc"), c3036c8.C().a())) {
                    p(4020, currentTimeMillis);
                    return false;
                }
                String n9 = n(c3036c8);
                SharedPreferences.Editor edit = ((SharedPreferences) this.f29385v).edit();
                edit.putString("LATMTD".concat(String.valueOf((String) this.f29386w)), n9);
                boolean commit = edit.commit();
                if (commit) {
                    p(5015, currentTimeMillis);
                } else {
                    p(4021, currentTimeMillis);
                }
                return commit;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized String h(Context context, String str, View view, Activity activity) {
        byte[] q8;
        try {
            HashMap o4 = ((InterfaceC3078cx) this.f29386w).o();
            o4.put("f", "c");
            o4.put("ctx", context);
            o4.put("cs", str);
            o4.put("aid", null);
            o4.put(com.anythink.expressad.a.f18383C, view);
            o4.put("act", activity);
            q8 = q(o4);
            if (this.f29383n) {
                o4.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return o(q8);
    }

    public synchronized void i(MotionEvent motionEvent) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap d9 = ((InterfaceC3078cx) this.f29386w).d();
            d9.put("aid", null);
            d9.put("evt", motionEvent);
            Object obj = this.f29384u;
            obj.getClass().getDeclaredMethod("he", Map.class).invoke(obj, d9);
            ((Cw) this.f29387x).b(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e9) {
            throw new C2971ax(2005, e9);
        }
    }

    public File j(String str) {
        return new File(new File(((Context) this.f29384u).getDir("pccache", 0), (String) this.f29386w), str);
    }

    public synchronized boolean k() {
        Object obj;
        try {
            obj = this.f29384u;
        } catch (Exception e9) {
            throw new C2971ax(AdError.INTERNAL_ERROR_CODE, e9);
        }
        return ((Boolean) obj.getClass().getDeclaredMethod("init", new Class[0]).invoke(obj, new Object[0])).booleanValue();
    }

    public synchronized void l() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Object obj = this.f29384u;
            obj.getClass().getDeclaredMethod(com.anythink.expressad.foundation.d.d.cs, new Class[0]).invoke(obj, new Object[0]);
            ((Cw) this.f29387x).b(AdError.MEDIATION_ERROR_CODE, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e9) {
            throw new C2971ax(AdError.INTERNAL_ERROR_2003, e9);
        }
    }

    public synchronized int m() {
        Object obj;
        try {
            obj = this.f29384u;
        } catch (Exception e9) {
            throw new C2971ax(AdError.INTERNAL_ERROR_2006, e9);
        }
        return ((Integer) obj.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(obj, new Object[0])).intValue();
    }

    public void p(int i, long j6) {
        ((Nw) this.f29387x).i(i, j6);
    }

    public synchronized byte[] q(Map map) {
        Object obj;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            obj = this.f29384u;
        } catch (Exception e9) {
            ((Cw) this.f29387x).c(2007, System.currentTimeMillis() - currentTimeMillis, e9);
            return null;
        }
        return (byte[]) obj.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(obj, null, map);
    }

    public C3251g8 r(int i) {
        PK a9;
        String str = (String) this.f29386w;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f29385v;
        String string = i == 1 ? sharedPreferences.getString("LATMTD".concat(String.valueOf(str)), null) : sharedPreferences.getString("FBAMTD".concat(String.valueOf(str)), null);
        if (string != null) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                byte[] j6 = V2.b.j(string);
                HK s9 = JK.s(j6, 0, j6.length);
                if (this.f29383n) {
                    PK pk = PK.f27540a;
                    int i4 = BK.f24648a;
                    a9 = PK.f27541b;
                } else {
                    a9 = PK.a();
                }
                return C3251g8.G(s9, a9);
            } catch (C3318hL unused) {
            } catch (NullPointerException unused2) {
                p(2029, currentTimeMillis);
            } catch (RuntimeException unused3) {
                p(2032, currentTimeMillis);
            }
        }
        return null;
    }

    public /* synthetic */ Xw(C3778py c3778py, String str, boolean z6, String str2, byte[] bArr) {
        this.f29384u = c3778py;
        this.f29386w = str;
        this.f29383n = z6;
        this.f29385v = str2;
        this.f29387x = bArr;
    }

    public /* synthetic */ Xw(Object obj, Object obj2, Object obj3, Object obj4, boolean z6) {
        this.f29384u = obj;
        this.f29385v = obj2;
        this.f29386w = obj3;
        this.f29387x = obj4;
        this.f29383n = z6;
    }

    public Xw(Context context, EnumC2983b8 enumC2983b8, Nw nw, boolean z6) {
        this.f29383n = false;
        this.f29384u = context;
        this.f29386w = Integer.toString(enumC2983b8.f30015n);
        this.f29385v = context.getSharedPreferences("pcvmspf", 0);
        this.f29387x = nw;
        this.f29383n = z6;
    }

    public Xw(Vv vv, Yv yv, EnumC2970aw enumC2970aw, EnumC2970aw enumC2970aw2, boolean z6) {
        this.f29386w = vv;
        this.f29387x = yv;
        this.f29384u = enumC2970aw;
        this.f29385v = enumC2970aw2;
        this.f29383n = z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3068cn
    /* renamed from: a, reason: collision with other method in class */
    public /* synthetic */ void mo9a(Object obj) {
        ((InterfaceC4022uQ) obj).n(0, ((AP) this.f29384u).f24455a, (C3429jQ) this.f29385v, (C3699oQ) this.f29386w, (IOException) this.f29387x, this.f29383n);
    }
}
