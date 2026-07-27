package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.er, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3168er implements InterfaceC3760pq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30518a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f30519b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f30520c;

    /* renamed from: d, reason: collision with root package name */
    public final C3806qi f30521d;

    public /* synthetic */ C3168er(Context context, Executor executor, C3806qi c3806qi, int i) {
        this.f30518a = i;
        this.f30519b = context;
        this.f30520c = executor;
        this.f30521d = c3806qi;
    }

    public static final void c(C2953au c2953au, Ut ut, C3598mq c3598mq) {
        try {
            C3656nu c3656nu = (C3656nu) c3598mq.f32761b;
            q2.d1 d1Var = ((C3226fu) c2953au.f29348a.f26393u).f30901d;
            try {
                c3656nu.f33064a.J2(ut.f28179v.toString(), d1Var);
            } catch (Throwable th) {
                throw new C3334hu(th);
            }
        } catch (Exception e6) {
            int i = t2.C.f40822b;
            u2.i.g("Fail to load ad from adapter ".concat(String.valueOf(c3598mq.f32760a)), e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3760pq
    public final Object a(C2953au c2953au, Ut ut, C3598mq c3598mq) {
        switch (this.f30518a) {
            case 0:
                C3602mu c3602mu = new C3602mu(c2953au, ut, c3598mq.f32760a);
                C2509Cn c2509Cn = new C2509Cn(new C4029uq(this, c3598mq, ut), null, 0);
                C3806qi c3806qi = this.f30521d;
                C3752pi c3752pi = new C3752pi(c3806qi.f33795c, c3806qi.f33798d, c3602mu, c2509Cn);
                ((C2540Ek) c3752pi.f33462n0.d()).s1(new C2623Ji(0, (C3656nu) c3598mq.f32761b), this.f30520c);
                ((BinderC2597Hq) c3598mq.f32762c).H3((BinderC3277gr) c3752pi.f33457U0.d());
                return c3752pi.L();
            default:
                C3602mu c3602mu2 = new C3602mu(c2953au, ut, c3598mq.f32760a);
                C2509Cn c2509Cn2 = new C2509Cn(new C4029uq(this, c3598mq, ut, (byte) 0), null, 0);
                C3806qi c3806qi2 = this.f30521d;
                C3752pi c3752pi2 = new C3752pi(c3806qi2.f33795c, c3806qi2.f33798d, c3602mu2, c2509Cn2);
                ((C2540Ek) c3752pi2.f33462n0.d()).s1(new C2623Ji(0, (C3656nu) c3598mq.f32761b), this.f30520c);
                C2557Fk c2557Fk = (C2557Fk) c3752pi2.f33438E0.d();
                C3808qk c3808qk = (C3808qk) c3752pi2.f33440G0.d();
                C2727Pk c2727Pk = (C2727Pk) c3752pi2.f33446M0.d();
                C2575Gl c2575Gl = (C2575Gl) c3752pi2.f33453S0.d();
                BinderC2614Iq binderC2614Iq = (BinderC2614Iq) c3598mq.f32762c;
                BinderC3384ir binderC3384ir = new BinderC3384ir(this, c2727Pk, c3808qk, c2557Fk, c2575Gl);
                synchronized (binderC2614Iq) {
                    binderC2614Iq.f25629n = binderC3384ir;
                }
                return c3752pi2.L();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3760pq
    public final void b(C2953au c2953au, Ut ut, C3598mq c3598mq) {
        C3334hu c3334hu;
        switch (this.f30518a) {
            case 0:
                try {
                    C3226fu c3226fu = (C3226fu) c2953au.f29348a.f26393u;
                    int i = c3226fu.f30912p.f1421u;
                    JSONObject jSONObject = ut.f28179v;
                    IInterface iInterface = c3598mq.f32762c;
                    Object obj = c3598mq.f32761b;
                    Context context = this.f30519b;
                    q2.d1 d1Var = c3226fu.f30901d;
                    if (i == 3) {
                        C3656nu c3656nu = (C3656nu) obj;
                        try {
                            c3656nu.f33064a.N2(new V2.b(context), d1Var, jSONObject.toString(), (InterfaceC3693od) iInterface);
                            return;
                        } finally {
                        }
                    }
                    C3656nu c3656nu2 = (C3656nu) obj;
                    try {
                        c3656nu2.f33064a.M0(new V2.b(context), d1Var, jSONObject.toString(), (InterfaceC3693od) iInterface);
                        return;
                    } finally {
                    }
                } catch (Exception e6) {
                    int i4 = t2.C.f40822b;
                    u2.i.g("Fail to load ad from adapter ".concat(String.valueOf(c3598mq.f32760a)), e6);
                    return;
                }
                int i42 = t2.C.f40822b;
                u2.i.g("Fail to load ad from adapter ".concat(String.valueOf(c3598mq.f32760a)), e6);
                return;
            default:
                C3656nu c3656nu3 = (C3656nu) c3598mq.f32761b;
                if (c3656nu3.a()) {
                    c(c2953au, ut, c3598mq);
                    return;
                }
                C2518Df c2518Df = new C2518Df(this, c2953au, ut, c3598mq);
                IInterface iInterface2 = c3598mq.f32762c;
                BinderC2614Iq binderC2614Iq = (BinderC2614Iq) iInterface2;
                synchronized (binderC2614Iq) {
                    binderC2614Iq.f25631v = c2518Df;
                }
                Context context2 = this.f30519b;
                C3226fu c3226fu2 = (C3226fu) c2953au.f29348a.f26393u;
                InterfaceC2891Ze interfaceC2891Ze = (InterfaceC2891Ze) iInterface2;
                String jSONObject2 = ut.f28179v.toString();
                try {
                    c3656nu3.f33064a.Z1(new V2.b(context2), c3226fu2.f30901d, interfaceC2891Ze, jSONObject2);
                    return;
                } finally {
                }
        }
    }
}
