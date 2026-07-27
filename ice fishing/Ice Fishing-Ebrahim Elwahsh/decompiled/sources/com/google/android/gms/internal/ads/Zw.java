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

/* loaded from: classes2.dex */
public final class Zw implements Gu, t.i, InterfaceC3273gn {

    /* renamed from: y, reason: collision with root package name */
    public static final Object f29109y = new Object();

    /* renamed from: n, reason: collision with root package name */
    public final boolean f29110n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f29111u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f29112v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f29113w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f29114x;

    public /* synthetic */ Zw(M.h hVar, boolean z8, ArrayList arrayList, C3187f9 c3187f9, EnumC3456k9 enumC3456k9) {
        this.f29111u = hVar;
        this.f29110n = z8;
        this.f29112v = arrayList;
        this.f29113w = c3187f9;
        this.f29114x = enumC3456k9;
    }

    public static Zw a(Xv xv, Zv zv, EnumC3010bw enumC3010bw, EnumC3010bw enumC3010bw2, boolean z8) {
        if (enumC3010bw == EnumC3010bw.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        Xv xv2 = Xv.DEFINED_BY_JAVASCRIPT;
        EnumC3010bw enumC3010bw3 = EnumC3010bw.NATIVE;
        if (xv == xv2 && enumC3010bw == enumC3010bw3) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (zv == Zv.DEFINED_BY_JAVASCRIPT && enumC3010bw == enumC3010bw3) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new Zw(xv, zv, enumC3010bw, enumC3010bw2, z8);
    }

    public static String n(Z7 z72) {
        C3022c8 H6 = C3077d8.H();
        String A8 = z72.A().A();
        H6.h();
        ((C3077d8) H6.f30000u).J(A8);
        String B8 = z72.A().B();
        H6.h();
        ((C3077d8) H6.f30000u).K(B8);
        long D8 = z72.A().D();
        H6.h();
        ((C3077d8) H6.f30000u).M(D8);
        long E8 = z72.A().E();
        H6.h();
        ((C3077d8) H6.f30000u).N(E8);
        long C7 = z72.A().C();
        H6.h();
        ((C3077d8) H6.f30000u).L(C7);
        return S2.b.b(((C3077d8) H6.j()).b());
    }

    public static String o(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        O6 A8 = P6.A();
        A8.h();
        ((P6) A8.f30000u).E(5);
        QK s3 = SK.s(bArr, 0, bArr.length);
        A8.h();
        ((P6) A8.f30000u).B(s3);
        return Base64.encodeToString(((P6) A8.j()).b(), 11);
    }

    @Override // com.google.android.gms.internal.ads.Gu
    public Object b(Object obj) {
        long j9;
        long j10;
        int i;
        C2783Sp c2783Sp = (C2783Sp) ((M.h) this.f29111u).f1828u;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (((t2.E) c2783Sp.f683u).t()) {
            return null;
        }
        EnumC3456k9 enumC3456k9 = (EnumC3456k9) this.f29114x;
        C3187f9 c3187f9 = (C3187f9) this.f29113w;
        ArrayList arrayList = (ArrayList) this.f29112v;
        boolean z8 = this.f29110n;
        C3296h9 Q3 = C3350i9.Q();
        Q3.h();
        ((C3350i9) Q3.f30000u).E(arrayList);
        Context context = c2783Sp.f27622w;
        int i4 = Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 2 : 1;
        Q3.h();
        ((C3350i9) Q3.f30000u).H(i4);
        TelephonyManager telephonyManager = c2783Sp.f27624y;
        p2.j jVar = p2.j.f39798C;
        int z9 = jVar.f39806f.z(context, telephonyManager);
        Q3.h();
        ((C3350i9) Q3.f30000u).I(z9);
        C2749Qp c2749Qp = c2783Sp.f27625z;
        synchronized (c2749Qp.f27247h) {
            j9 = c2749Qp.f27242c;
        }
        Q3.h();
        ((C3350i9) Q3.f30000u).C(j9);
        synchronized (c2749Qp) {
            synchronized (c2749Qp.f27248j) {
                j10 = c2749Qp.f27244e;
            }
        }
        Q3.h();
        ((C3350i9) Q3.f30000u).D(j10);
        synchronized (c2749Qp.f27246g) {
            i = c2749Qp.f27241b;
        }
        Q3.h();
        ((C3350i9) Q3.f30000u).J(i);
        Q3.h();
        ((C3350i9) Q3.f30000u).L(enumC3456k9);
        Q3.h();
        ((C3350i9) Q3.f30000u).F(c3187f9);
        int i9 = c2783Sp.f27621A;
        Q3.h();
        ((C3350i9) Q3.f30000u).K(i9);
        int i10 = z8 ? 2 : 1;
        Q3.h();
        ((C3350i9) Q3.f30000u).B(i10);
        long a9 = c2749Qp.a();
        Q3.h();
        ((C3350i9) Q3.f30000u).M(a9);
        jVar.f39810k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        Q3.h();
        ((C3350i9) Q3.f30000u).A(currentTimeMillis);
        int i11 = Settings.Global.getInt(context.getContentResolver(), "wifi_on", 0) != 0 ? 2 : 1;
        Q3.h();
        ((C3350i9) Q3.f30000u).G(i11);
        byte[] b9 = ((C3350i9) Q3.j()).b();
        sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'completed_requests'");
        if (!z8) {
            sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'failed_requests'");
        }
        AbstractC2655Lg.w(sQLiteDatabase, c2783Sp.f27625z.a(), b9);
        return null;
    }

    @Override // t.i
    public /* synthetic */ Object c(t.h hVar) {
        C3875ry c3875ry = (C3875ry) this.f29111u;
        c3875ry.getClass();
        c3875ry.f34143a.execute(new RunnableC3768py(c3875ry, (String) this.f29113w, hVar, this.f29110n, (String) this.f29112v, (byte[]) this.f29114x));
        return "";
    }

    public synchronized String d(Context context) {
        byte[] q6;
        try {
            HashMap d2 = ((InterfaceC3065cx) this.f29113w).d();
            d2.put("f", com.anythink.expressad.foundation.d.d.bu);
            d2.put("ctx", context);
            d2.put("aid", null);
            q6 = q(d2);
            if (this.f29110n) {
                d2.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return o(q6);
    }

    public boolean e(Z7 z72, T2 t22) {
        boolean z8;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f29109y) {
            try {
                C3077d8 r9 = r(1);
                String A8 = z72.A().A();
                if (r9 != null && r9.A().equals(A8)) {
                    p(4014, currentTimeMillis);
                    return false;
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                File j9 = j(A8);
                if (j9.exists()) {
                    String str = true != j9.isDirectory() ? "0" : "1";
                    String str2 = true != j9.isFile() ? "0" : "1";
                    StringBuilder sb = new StringBuilder(7);
                    sb.append("d:");
                    sb.append(str);
                    sb.append(",f:");
                    sb.append(str2);
                    ((Ow) this.f29114x).i(4023, currentTimeMillis2, sb.toString());
                    p(4015, currentTimeMillis2);
                } else if (!j9.mkdirs()) {
                    ((Ow) this.f29114x).i(4024, currentTimeMillis2, "cw:".concat(true != j9.canWrite() ? "0" : "1"));
                    p(4015, currentTimeMillis2);
                    return false;
                }
                File j10 = j(A8);
                File file = new File(j10, "pcam.jar");
                File file2 = new File(j10, "pcbc");
                if (!AbstractC2720Pd.t(file, z72.B().a())) {
                    p(4016, currentTimeMillis);
                    return false;
                }
                if (!AbstractC2720Pd.t(file2, z72.C().a())) {
                    p(4017, currentTimeMillis);
                    return false;
                }
                if (t22 != null) {
                    try {
                        z8 = Cw.a(file);
                    } catch (GeneralSecurityException unused) {
                        z8 = false;
                    }
                    if (!z8) {
                        p(4018, currentTimeMillis);
                        AbstractC2720Pd.K(j10);
                        return false;
                    }
                }
                String n9 = n(z72);
                long currentTimeMillis3 = System.currentTimeMillis();
                SharedPreferences sharedPreferences = (SharedPreferences) this.f29112v;
                String string = sharedPreferences.getString("LATMTD".concat(String.valueOf((String) this.f29113w)), null);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString("LATMTD".concat(String.valueOf((String) this.f29113w)), n9);
                if (string != null) {
                    edit.putString("FBAMTD".concat(String.valueOf((String) this.f29113w)), string);
                }
                if (!edit.commit()) {
                    p(4019, currentTimeMillis3);
                    return false;
                }
                HashSet hashSet = new HashSet();
                C3077d8 r10 = r(1);
                if (r10 != null) {
                    hashSet.add(r10.A());
                }
                C3077d8 r11 = r(2);
                if (r11 != null) {
                    hashSet.add(r11.A());
                }
                for (File file3 : new File(((Context) this.f29111u).getDir("pccache", 0), (String) this.f29113w).listFiles()) {
                    if (!hashSet.contains(file3.getName())) {
                        AbstractC2720Pd.K(file3);
                    }
                }
                p(5014, currentTimeMillis);
                return true;
            } finally {
            }
        }
    }

    public synchronized String f(Context context, View view, Activity activity) {
        byte[] q6;
        try {
            HashMap i = ((InterfaceC3065cx) this.f29113w).i();
            i.put("f", "v");
            i.put("ctx", context);
            i.put("aid", null);
            i.put(com.anythink.expressad.a.f17754C, view);
            i.put("act", activity);
            q6 = q(i);
            if (this.f29110n) {
                i.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return o(q6);
    }

    public boolean g(Z7 z72) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f29109y) {
            try {
                if (!AbstractC2720Pd.t(new File(j(z72.A().A()), "pcbc"), z72.C().a())) {
                    p(4020, currentTimeMillis);
                    return false;
                }
                String n9 = n(z72);
                SharedPreferences.Editor edit = ((SharedPreferences) this.f29112v).edit();
                edit.putString("LATMTD".concat(String.valueOf((String) this.f29113w)), n9);
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
        byte[] q6;
        try {
            HashMap o9 = ((InterfaceC3065cx) this.f29113w).o();
            o9.put("f", "c");
            o9.put("ctx", context);
            o9.put("cs", str);
            o9.put("aid", null);
            o9.put(com.anythink.expressad.a.f17754C, view);
            o9.put("act", activity);
            q6 = q(o9);
            if (this.f29110n) {
                o9.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return o(q6);
    }

    public synchronized void i(MotionEvent motionEvent) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap c4 = ((InterfaceC3065cx) this.f29113w).c();
            c4.put("aid", null);
            c4.put("evt", motionEvent);
            Object obj = this.f29111u;
            obj.getClass().getDeclaredMethod("he", Map.class).invoke(obj, c4);
            ((Dw) this.f29114x).b(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e6) {
            throw new C2956ax(2005, e6);
        }
    }

    public File j(String str) {
        return new File(new File(((Context) this.f29111u).getDir("pccache", 0), (String) this.f29113w), str);
    }

    public synchronized boolean k() {
        Object obj;
        try {
            obj = this.f29111u;
        } catch (Exception e6) {
            throw new C2956ax(AdError.INTERNAL_ERROR_CODE, e6);
        }
        return ((Boolean) obj.getClass().getDeclaredMethod("init", new Class[0]).invoke(obj, new Object[0])).booleanValue();
    }

    public synchronized void l() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Object obj = this.f29111u;
            obj.getClass().getDeclaredMethod(com.anythink.expressad.foundation.d.d.cs, new Class[0]).invoke(obj, new Object[0]);
            ((Dw) this.f29114x).b(AdError.MEDIATION_ERROR_CODE, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e6) {
            throw new C2956ax(AdError.INTERNAL_ERROR_2003, e6);
        }
    }

    public synchronized int m() {
        Object obj;
        try {
            obj = this.f29111u;
        } catch (Exception e6) {
            throw new C2956ax(AdError.INTERNAL_ERROR_2006, e6);
        }
        return ((Integer) obj.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(obj, new Object[0])).intValue();
    }

    public void p(int i, long j9) {
        ((Ow) this.f29114x).r(i, j9);
    }

    public synchronized byte[] q(Map map) {
        Object obj;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            obj = this.f29111u;
        } catch (Exception e6) {
            ((Dw) this.f29114x).c(2007, System.currentTimeMillis() - currentTimeMillis, e6);
            return null;
        }
        return (byte[]) obj.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(obj, null, map);
    }

    public C3077d8 r(int i) {
        YK a9;
        String str = (String) this.f29113w;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f29112v;
        String string = i == 1 ? sharedPreferences.getString("LATMTD".concat(String.valueOf(str)), null) : sharedPreferences.getString("FBAMTD".concat(String.valueOf(str)), null);
        if (string != null) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                byte[] j9 = S2.b.j(string);
                QK s3 = SK.s(j9, 0, j9.length);
                if (this.f29110n) {
                    YK yk = YK.f28820a;
                    int i4 = KK.f25952a;
                    a9 = YK.f28821b;
                } else {
                    a9 = YK.a();
                }
                return C3077d8.G(s3, a9);
            } catch (C3845rL unused) {
            } catch (NullPointerException unused2) {
                p(2029, currentTimeMillis);
            } catch (RuntimeException unused3) {
                p(2032, currentTimeMillis);
            }
        }
        return null;
    }

    public /* synthetic */ Zw(C3875ry c3875ry, String str, boolean z8, String str2, byte[] bArr) {
        this.f29111u = c3875ry;
        this.f29113w = str;
        this.f29110n = z8;
        this.f29112v = str2;
        this.f29114x = bArr;
    }

    public /* synthetic */ Zw(Object obj, Object obj2, Object obj3, Object obj4, boolean z8) {
        this.f29111u = obj;
        this.f29112v = obj2;
        this.f29113w = obj3;
        this.f29114x = obj4;
        this.f29110n = z8;
    }

    public Zw(Context context, X7 x72, Ow ow, boolean z8) {
        this.f29110n = false;
        this.f29111u = context;
        this.f29113w = Integer.toString(x72.f28615n);
        this.f29112v = context.getSharedPreferences("pcvmspf", 0);
        this.f29114x = ow;
        this.f29110n = z8;
    }

    public Zw(Xv xv, Zv zv, EnumC3010bw enumC3010bw, EnumC3010bw enumC3010bw2, boolean z8) {
        this.f29113w = xv;
        this.f29114x = zv;
        this.f29111u = enumC3010bw;
        this.f29112v = enumC3010bw2;
        this.f29110n = z8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3273gn, com.google.android.gms.internal.ads.InterfaceC3865ro
    /* renamed from: b */
    public /* synthetic */ void mo2b(Object obj) {
        ((EQ) obj).p(0, ((NP) this.f29111u).f26543a, (C3958tQ) this.f29112v, (C4228yQ) this.f29113w, (IOException) this.f29114x, this.f29110n);
    }
}
