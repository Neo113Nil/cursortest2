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
import p2.C4835j;
import u2.C5069B;

/* loaded from: classes2.dex */
public final class Xw implements Eu, t.i, InterfaceC2992bn {

    /* renamed from: y, reason: collision with root package name */
    public static final Object f28605y = new Object();

    /* renamed from: n, reason: collision with root package name */
    public final boolean f28606n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f28607u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f28608v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f28609w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f28610x;

    public /* synthetic */ Xw(L3.h hVar, boolean z3, ArrayList arrayList, C3337i9 c3337i9, EnumC3605n9 enumC3605n9) {
        this.f28607u = hVar;
        this.f28606n = z3;
        this.f28608v = arrayList;
        this.f28609w = c3337i9;
        this.f28610x = enumC3605n9;
    }

    public static Xw b(Vv vv, Xv xv, Zv zv, Zv zv2, boolean z3) {
        if (zv == Zv.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        Vv vv2 = Vv.DEFINED_BY_JAVASCRIPT;
        Zv zv3 = Zv.NATIVE;
        if (vv == vv2 && zv == zv3) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (xv == Xv.DEFINED_BY_JAVASCRIPT && zv == zv3) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new Xw(vv, xv, zv, zv2, z3);
    }

    public static String n(C3013c8 c3013c8) {
        C3174f8 H8 = C3228g8.H();
        String A9 = c3013c8.A().A();
        H8.h();
        ((C3228g8) H8.f27721u).J(A9);
        String B9 = c3013c8.A().B();
        H8.h();
        ((C3228g8) H8.f27721u).K(B9);
        long D8 = c3013c8.A().D();
        H8.h();
        ((C3228g8) H8.f27721u).M(D8);
        long E8 = c3013c8.A().E();
        H8.h();
        ((C3228g8) H8.f27721u).N(E8);
        long C8 = c3013c8.A().C();
        H8.h();
        ((C3228g8) H8.f27721u).L(C8);
        return T2.b.b(((C3228g8) H8.j()).b());
    }

    public static String o(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        R6 A9 = S6.A();
        A9.h();
        ((S6) A9.f27721u).E(5);
        HK s9 = JK.s(bArr, 0, bArr.length);
        A9.h();
        ((S6) A9.f27721u).B(s9);
        return Base64.encodeToString(((S6) A9.j()).b(), 11);
    }

    @Override // com.google.android.gms.internal.ads.Eu
    public Object a(Object obj) {
        long j6;
        long j9;
        int i;
        C2733Pp c2733Pp = (C2733Pp) ((L3.h) this.f28607u).f1697u;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (((C5069B) c2733Pp.f731u).t()) {
            return null;
        }
        EnumC3605n9 enumC3605n9 = (EnumC3605n9) this.f28610x;
        C3337i9 c3337i9 = (C3337i9) this.f28609w;
        ArrayList arrayList = (ArrayList) this.f28608v;
        boolean z3 = this.f28606n;
        C3443k9 Q8 = C3497l9.Q();
        Q8.h();
        ((C3497l9) Q8.f27721u).E(arrayList);
        Context context = c2733Pp.f26868w;
        int i6 = Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 2 : 1;
        Q8.h();
        ((C3497l9) Q8.f27721u).H(i6);
        TelephonyManager telephonyManager = c2733Pp.f26870y;
        C4835j c4835j = C4835j.f39730C;
        int r9 = c4835j.f39738f.r(context, telephonyManager);
        Q8.h();
        ((C3497l9) Q8.f27721u).I(r9);
        C2699Np c2699Np = c2733Pp.f26871z;
        synchronized (c2699Np.f26547h) {
            j6 = c2699Np.f26542c;
        }
        Q8.h();
        ((C3497l9) Q8.f27721u).C(j6);
        synchronized (c2699Np) {
            synchronized (c2699Np.f26548j) {
                j9 = c2699Np.f26544e;
            }
        }
        Q8.h();
        ((C3497l9) Q8.f27721u).D(j9);
        synchronized (c2699Np.f26546g) {
            i = c2699Np.f26541b;
        }
        Q8.h();
        ((C3497l9) Q8.f27721u).J(i);
        Q8.h();
        ((C3497l9) Q8.f27721u).L(enumC3605n9);
        Q8.h();
        ((C3497l9) Q8.f27721u).F(c3337i9);
        int i9 = c2733Pp.f26867A;
        Q8.h();
        ((C3497l9) Q8.f27721u).K(i9);
        int i10 = z3 ? 2 : 1;
        Q8.h();
        ((C3497l9) Q8.f27721u).B(i10);
        long a9 = c2699Np.a();
        Q8.h();
        ((C3497l9) Q8.f27721u).M(a9);
        c4835j.f39742k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        Q8.h();
        ((C3497l9) Q8.f27721u).A(currentTimeMillis);
        int i11 = Settings.Global.getInt(context.getContentResolver(), "wifi_on", 0) != 0 ? 2 : 1;
        Q8.h();
        ((C3497l9) Q8.f27721u).G(i11);
        byte[] b9 = ((C3497l9) Q8.j()).b();
        sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'completed_requests'");
        if (!z3) {
            sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'failed_requests'");
        }
        SK.J(sQLiteDatabase, c2733Pp.f26871z.a(), b9);
        return null;
    }

    public synchronized String c(Context context) {
        byte[] q8;
        try {
            HashMap f3 = ((InterfaceC3055cx) this.f28609w).f();
            f3.put("f", com.anythink.expressad.foundation.d.d.bu);
            f3.put("ctx", context);
            f3.put("aid", null);
            q8 = q(f3);
            if (this.f28606n) {
                f3.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return o(q8);
    }

    public boolean d(C3013c8 c3013c8, V2 v22) {
        boolean z3;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f28605y) {
            try {
                C3228g8 r9 = r(1);
                String A9 = c3013c8.A().A();
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
                    ((Nw) this.f28610x).i(4023, currentTimeMillis2, sb.toString());
                    p(4015, currentTimeMillis2);
                } else if (!j6.mkdirs()) {
                    ((Nw) this.f28610x).i(4024, currentTimeMillis2, "cw:".concat(true != j6.canWrite() ? "0" : "1"));
                    p(4015, currentTimeMillis2);
                    return false;
                }
                File j9 = j(A9);
                File file = new File(j9, "pcam.jar");
                File file2 = new File(j9, "pcbc");
                if (!MA.u(file, c3013c8.B().a())) {
                    p(4016, currentTimeMillis);
                    return false;
                }
                if (!MA.u(file2, c3013c8.C().a())) {
                    p(4017, currentTimeMillis);
                    return false;
                }
                if (v22 != null) {
                    try {
                        z3 = Bw.a(file);
                    } catch (GeneralSecurityException unused) {
                        z3 = false;
                    }
                    if (!z3) {
                        p(4018, currentTimeMillis);
                        MA.N(j9);
                        return false;
                    }
                }
                String n9 = n(c3013c8);
                long currentTimeMillis3 = System.currentTimeMillis();
                SharedPreferences sharedPreferences = (SharedPreferences) this.f28608v;
                String string = sharedPreferences.getString("LATMTD".concat(String.valueOf((String) this.f28609w)), null);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString("LATMTD".concat(String.valueOf((String) this.f28609w)), n9);
                if (string != null) {
                    edit.putString("FBAMTD".concat(String.valueOf((String) this.f28609w)), string);
                }
                if (!edit.commit()) {
                    p(4019, currentTimeMillis3);
                    return false;
                }
                HashSet hashSet = new HashSet();
                C3228g8 r10 = r(1);
                if (r10 != null) {
                    hashSet.add(r10.A());
                }
                C3228g8 r11 = r(2);
                if (r11 != null) {
                    hashSet.add(r11.A());
                }
                for (File file3 : new File(((Context) this.f28607u).getDir("pccache", 0), (String) this.f28609w).listFiles()) {
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

    @Override // t.i
    public /* synthetic */ Object e(t.h hVar) {
        C3755py c3755py = (C3755py) this.f28607u;
        c3755py.getClass();
        c3755py.f33165a.execute(new RunnableC3647ny(c3755py, (String) this.f28609w, hVar, this.f28606n, (String) this.f28608v, (byte[]) this.f28610x));
        return "";
    }

    public synchronized String f(Context context, View view, Activity activity) {
        byte[] q8;
        try {
            HashMap i = ((InterfaceC3055cx) this.f28609w).i();
            i.put("f", "v");
            i.put("ctx", context);
            i.put("aid", null);
            i.put(com.anythink.expressad.a.f17596C, view);
            i.put("act", activity);
            q8 = q(i);
            if (this.f28606n) {
                i.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return o(q8);
    }

    public boolean g(C3013c8 c3013c8) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f28605y) {
            try {
                if (!MA.u(new File(j(c3013c8.A().A()), "pcbc"), c3013c8.C().a())) {
                    p(4020, currentTimeMillis);
                    return false;
                }
                String n9 = n(c3013c8);
                SharedPreferences.Editor edit = ((SharedPreferences) this.f28608v).edit();
                edit.putString("LATMTD".concat(String.valueOf((String) this.f28609w)), n9);
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
            HashMap o6 = ((InterfaceC3055cx) this.f28609w).o();
            o6.put("f", "c");
            o6.put("ctx", context);
            o6.put("cs", str);
            o6.put("aid", null);
            o6.put(com.anythink.expressad.a.f17596C, view);
            o6.put("act", activity);
            q8 = q(o6);
            if (this.f28606n) {
                o6.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return o(q8);
    }

    public synchronized void i(MotionEvent motionEvent) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap d2 = ((InterfaceC3055cx) this.f28609w).d();
            d2.put("aid", null);
            d2.put("evt", motionEvent);
            Object obj = this.f28607u;
            obj.getClass().getDeclaredMethod("he", Map.class).invoke(obj, d2);
            ((Cw) this.f28610x).b(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e9) {
            throw new C2948ax(2005, e9);
        }
    }

    public File j(String str) {
        return new File(new File(((Context) this.f28607u).getDir("pccache", 0), (String) this.f28609w), str);
    }

    public synchronized boolean k() {
        Object obj;
        try {
            obj = this.f28607u;
        } catch (Exception e9) {
            throw new C2948ax(AdError.INTERNAL_ERROR_CODE, e9);
        }
        return ((Boolean) obj.getClass().getDeclaredMethod("init", new Class[0]).invoke(obj, new Object[0])).booleanValue();
    }

    public synchronized void l() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Object obj = this.f28607u;
            obj.getClass().getDeclaredMethod(com.anythink.expressad.foundation.d.d.cs, new Class[0]).invoke(obj, new Object[0]);
            ((Cw) this.f28610x).b(AdError.MEDIATION_ERROR_CODE, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e9) {
            throw new C2948ax(AdError.INTERNAL_ERROR_2003, e9);
        }
    }

    public synchronized int m() {
        Object obj;
        try {
            obj = this.f28607u;
        } catch (Exception e9) {
            throw new C2948ax(AdError.INTERNAL_ERROR_2006, e9);
        }
        return ((Integer) obj.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(obj, new Object[0])).intValue();
    }

    public void p(int i, long j6) {
        ((Nw) this.f28610x).o(i, j6);
    }

    public synchronized byte[] q(Map map) {
        Object obj;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            obj = this.f28607u;
        } catch (Exception e9) {
            ((Cw) this.f28610x).c(2007, System.currentTimeMillis() - currentTimeMillis, e9);
            return null;
        }
        return (byte[]) obj.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(obj, null, map);
    }

    public C3228g8 r(int i) {
        PK a9;
        String str = (String) this.f28609w;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f28608v;
        String string = i == 1 ? sharedPreferences.getString("LATMTD".concat(String.valueOf(str)), null) : sharedPreferences.getString("FBAMTD".concat(String.valueOf(str)), null);
        if (string != null) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                byte[] j6 = T2.b.j(string);
                HK s9 = JK.s(j6, 0, j6.length);
                if (this.f28606n) {
                    PK pk = PK.f26757a;
                    int i6 = BK.f23877a;
                    a9 = PK.f26758b;
                } else {
                    a9 = PK.a();
                }
                return C3228g8.G(s9, a9);
            } catch (C3295hL unused) {
            } catch (NullPointerException unused2) {
                p(2029, currentTimeMillis);
            } catch (RuntimeException unused3) {
                p(2032, currentTimeMillis);
            }
        }
        return null;
    }

    public /* synthetic */ Xw(C3755py c3755py, String str, boolean z3, String str2, byte[] bArr) {
        this.f28607u = c3755py;
        this.f28609w = str;
        this.f28606n = z3;
        this.f28608v = str2;
        this.f28610x = bArr;
    }

    public /* synthetic */ Xw(Object obj, Object obj2, Object obj3, Object obj4, boolean z3) {
        this.f28607u = obj;
        this.f28608v = obj2;
        this.f28609w = obj3;
        this.f28610x = obj4;
        this.f28606n = z3;
    }

    public Xw(Context context, EnumC2960b8 enumC2960b8, Nw nw, boolean z3) {
        this.f28606n = false;
        this.f28607u = context;
        this.f28609w = Integer.toString(enumC2960b8.f29227n);
        this.f28608v = context.getSharedPreferences("pcvmspf", 0);
        this.f28610x = nw;
        this.f28606n = z3;
    }

    public Xw(Vv vv, Xv xv, Zv zv, Zv zv2, boolean z3) {
        this.f28609w = vv;
        this.f28610x = xv;
        this.f28607u = zv;
        this.f28608v = zv2;
        this.f28606n = z3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2992bn
    /* renamed from: a, reason: collision with other method in class */
    public /* synthetic */ void mo10a(Object obj) {
        ((InterfaceC3837rQ) obj).n(0, ((AP) this.f28607u).f23675a, (C3246gQ) this.f28608v, (C3514lQ) this.f28609w, (IOException) this.f28610x, this.f28606n);
    }
}
