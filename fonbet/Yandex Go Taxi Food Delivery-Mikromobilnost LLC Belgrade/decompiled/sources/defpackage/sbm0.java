package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import yads.d4;
import yads.es2;
import yads.f5;
import yads.ly;
import yads.s41;
import yads.x3;

/* loaded from: classes7.dex */
public final class sbm0 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public sbm0(Context context, v981 v981Var, bc71 bc71Var, i971 i971Var, i581 i581Var, ji41 ji41Var, js81 js81Var, hv81 hv81Var, xc71 xc71Var, i971 i971Var2, d881 d881Var) {
        this.b = bc71Var;
        this.c = i971Var;
        this.d = i581Var;
        this.e = js81Var;
        this.f = hv81Var;
        e971 e971Var = new e971();
        this.g = e971Var;
        qv71 qv71Var = new qv71(context, v981Var, d881Var, i581Var, e971Var, js81Var, i971Var, ji41Var, hv81Var);
        this.a = qv71Var;
        kzo kzoVar = new kzo(bc71Var, xc71Var);
        this.h = kzoVar;
        this.i = new pbj(i581Var, bc71Var, kzoVar, qv71Var, js81Var, e971Var, hv81Var, i971Var2);
        o281 o281Var = new o281(hv81Var);
        o281 o281Var2 = new o281(context, i581Var);
        bp71 bp71Var = new bp71(i581Var, i971Var, hv81Var, i971Var2);
        yr81 yr81Var = new yr81(i971Var, hv81Var, bc71Var);
        p281 p281Var = new p281(i581Var, i971Var, js81Var, hv81Var, i971Var2);
        ycc.t(xc71Var.a, new z971[]{o281Var, o281Var2, yr81Var, bp71Var, p281Var});
        ycc.t(xc71Var.b, new bg71[]{p281Var});
    }

    public void a(fw81 fw81Var, s41 s41Var, kde kdeVar) {
        String str;
        String str2;
        String str3;
        cp81 cp81Var;
        gg81 a = dha1.f().a((Context) this.i);
        if (a != null) {
            dh71 dh71Var = (dh71) this.e;
            gg81 a2 = dh71Var.a.a(dh71Var.d);
            if (a2 != null) {
                fb71 fb71Var = dh71Var.c;
                gf71 gf71Var = fb71Var.a.a;
                if (System.currentTimeMillis() < a2.e) {
                    fb71Var.b.getClass();
                    if ("8.0.0-beta.1".equals(a2.U)) {
                        fb71Var.c.getClass();
                        if (a081.g == null) {
                            synchronized (a081.f) {
                                if (a081.g == null) {
                                    a081.g = new a081();
                                }
                            }
                        }
                        Object obj = a081.f;
                        synchronized (obj) {
                        }
                        if (jl40.l(null, a2.N)) {
                            fb71Var.c.getClass();
                            if (a081.g == null) {
                                synchronized (obj) {
                                    if (a081.g == null) {
                                        a081.g = new a081();
                                    }
                                }
                            }
                            synchronized (obj) {
                            }
                            if (!a2.P) {
                                fb71Var.c.getClass();
                                if (!w681.a(a2)) {
                                    ly lyVar = ly.d;
                                    if (kdeVar.b.t() instanceof mf60) {
                                        kdeVar.b.resumeWith(new vw71(a, lyVar));
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        hlx0 hlx0Var = new hlx0((Context) this.i, (p171) this.f, kdeVar, (e971) this.d);
        ((kg71) this.h).a.c(new zj71("sdk_configuration_request", new LinkedHashMap(g8e.z("call_source", s41Var.b)), (no61) null));
        c171 c171Var = ((k471) this.c).a;
        Context context = (Context) this.i;
        String str4 = c171Var.d;
        if (str4 == null || str4.length() == 0) {
            str = null;
        } else {
            t771 t771Var = (t771) this.a;
            p671 p671Var = (p671) this.b;
            t771Var.getClass();
            fw81Var.getClass();
            boolean b = fw81.b(context);
            in61 in61Var = new in61(b);
            synchronized (c171.g) {
                str2 = c171Var.f;
            }
            in61Var.t = str2;
            in61Var.l = c171Var.c;
            vc71 vc71Var = p671Var.a;
            boolean z = p671Var.c;
            if (vc71Var != null) {
                in61Var.K = Boolean.valueOf(vc71Var.b);
                in61Var.L = Boolean.valueOf(z);
                String str5 = vc71Var.a;
                in61Var.e.getClass();
                boolean z2 = (str5.length() == 0 || "00000000-0000-0000-0000-000000000000".equals(str5)) ? false : true;
                if (!b && jl40.l(in61Var.K, Boolean.FALSE) && z2) {
                    in61Var.M = str5;
                }
            }
            vc71 vc71Var2 = p671Var.b;
            if (vc71Var2 != null) {
                in61Var.N = Boolean.valueOf(vc71Var2.b);
                String str6 = vc71Var2.a;
                in61Var.e.getClass();
                boolean z3 = (str6.length() == 0 || "00000000-0000-0000-0000-000000000000".equals(str6)) ? false : true;
                if (!b && jl40.l(in61Var.N, Boolean.FALSE) && z3) {
                    in61Var.O = str6;
                }
            }
            in61Var.c.getClass();
            try {
                str3 = bv81.a(context).b.q();
            } catch (Throwable unused) {
                str3 = null;
            }
            in61Var.x0 = str3;
            in61Var.A = Integer.valueOf(sj71.g(context));
            in61Var.B = Integer.valueOf(sj71.d(context));
            in61Var.C = Float.valueOf(context.getResources().getDisplayMetrics().density);
            in61Var.m0 = context.getResources().getDisplayMetrics().densityDpi;
            try {
                cp81Var = kma1.b(context);
            } catch (Throwable unused2) {
                cp81Var = cp81.g;
            }
            in61Var.n0 = cp81Var.a;
            in61Var.o0 = cp81Var.b;
            in61Var.p0 = cp81Var.c;
            in61Var.q0 = cp81Var.d;
            in61Var.r0 = cp81Var.e;
            in61Var.s0 = cp81Var.f;
            in61Var.d();
            in61Var.g = fw81.a(context);
            in61Var.c(context, c171Var.a);
            in61Var.i0 = context.getPackageName();
            in61Var.j0 = kla1.b(context);
            in61Var.k0 = kla1.c(context);
            in61Var.d.getClass();
            in61Var.v0 = iq81.a("%d.%d%d");
            in61Var.d.getClass();
            in61Var.w0 = iq81.a("%d.%d.%d");
            in61Var.e();
            in61Var.f = true;
            in61Var.a();
            String[] strArr = {new v771(in61Var).toString(), a.X(EmptyList.a, "&", null, null, es2.w, 30)};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                String str7 = strArr[i];
                if (!evu0.J(str7)) {
                    arrayList.add(str7);
                }
            }
            String a3 = t771Var.a.a(context, a.X(arrayList, "&", null, null, null, 62));
            StringBuilder t = qv10.t(str4);
            if (!jl40.l(String.valueOf(gvu0.x0(t)), "/")) {
                t.append("/");
            }
            str = unr0.r(t, "v1/startup", "?", a3);
        }
        if (str == null || str.length() == 0) {
            hlx0Var.j(new x3(d4.j));
            return;
        }
        he71 he71Var = new he71((Context) this.i, str, (dh71) this.e, c171Var.b, hlx0Var, hlx0Var);
        he71Var.setTag(this);
        ((e971) this.d).b(f5.l, null);
        ys81 ys81Var = (ys81) this.g;
        Context context2 = (Context) this.i;
        synchronized (ys81Var) {
            hba1.b(context2).b(he71Var);
        }
    }

    public /* synthetic */ sbm0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.a = obj7;
        this.h = obj8;
        this.i = obj9;
    }

    public sbm0(Context context, e971 e971Var, p671 p671Var, k471 k471Var, ge71 ge71Var) {
        p171 p171Var;
        dh71 dh71Var = new dh71(context, ge71Var);
        p171 p171Var2 = p171.c;
        if (p171Var2 == null) {
            synchronized (p171.b) {
                p171Var = p171.c;
                if (p171Var == null) {
                    p171Var = new p171();
                    p171.c = p171Var;
                }
            }
            p171Var2 = p171Var;
        }
        ys81 c = mka1.c();
        t771 t771Var = new t771();
        kg71 kg71Var = new kg71(ge71Var);
        this.b = p671Var;
        this.c = k471Var;
        this.d = e971Var;
        this.e = dh71Var;
        this.f = p171Var2;
        this.g = c;
        this.a = t771Var;
        this.h = kg71Var;
        this.i = context.getApplicationContext();
    }

    public /* synthetic */ sbm0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9) {
        this.a = xvf0Var;
        this.b = xvf0Var2;
        this.c = xvf0Var3;
        this.d = xvf0Var4;
        this.e = xvf0Var5;
        this.f = xvf0Var6;
        this.g = xvf0Var7;
        this.h = xvf0Var8;
        this.i = xvf0Var9;
    }

    public sbm0(np6 np6Var, qbg qbgVar, xvf0 xvf0Var, qcz0 qcz0Var, n3w n3wVar, qbg qbgVar2, qbg qbgVar3, qbg qbgVar4, n3w n3wVar2) {
        this.b = np6Var;
        this.c = qbgVar;
        this.a = xvf0Var;
        this.d = qcz0Var;
        this.h = n3wVar;
        this.e = qbgVar2;
        this.f = qbgVar3;
        this.g = qbgVar4;
        this.i = n3wVar2;
    }
}
