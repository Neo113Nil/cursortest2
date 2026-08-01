package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.br, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2996br implements InterfaceC3639nq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29335a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f29336b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f29337c;

    /* renamed from: d, reason: collision with root package name */
    public final C3900si f29338d;

    public /* synthetic */ C2996br(Context context, Executor executor, C3900si c3900si, int i) {
        this.f29335a = i;
        this.f29336b = context;
        this.f29337c = executor;
        this.f29338d = c3900si;
    }

    public static final void c(Yt yt, St st, C3477kq c3477kq) {
        try {
            C3535lu c3535lu = (C3535lu) c3477kq.f31639b;
            q2.c1 c1Var = ((C3052cu) yt.f28753a.f31863u).f29623d;
            try {
                c3535lu.f31864a.P2(st.f27646v.toString(), c1Var);
            } catch (Throwable th) {
                throw new C3267gu(th);
            }
        } catch (Exception e9) {
            int i = u2.z.f41322b;
            v2.i.g("Fail to load ad from adapter ".concat(String.valueOf(c3477kq.f31638a)), e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3639nq
    public final Object a(Yt yt, St st, C3477kq c3477kq) {
        switch (this.f29335a) {
            case 0:
                C3481ku c3481ku = new C3481ku(yt, st, c3477kq.f31638a);
                C2493Bn c2493Bn = new C2493Bn(new S0.e(this, c3477kq, st), null, 0);
                C3900si c3900si = this.f29338d;
                C3846ri c3846ri = new C3846ri(c3900si.f34061c, c3900si.f34064d, c3481ku, c2493Bn);
                ((C2558Fk) c3846ri.f33682r0.f()).H1(new C2641Ki(0, (C3535lu) c3477kq.f31639b), this.f29337c);
                ((BinderC2564Fq) c3477kq.f31640c).V3((BinderC3102dr) c3846ri.f33676X0.f());
                return c3846ri.T();
            default:
                C3481ku c3481ku2 = new C3481ku(yt, st, c3477kq.f31638a);
                C2493Bn c2493Bn2 = new C2493Bn(new S0.l(this, c3477kq, st), null, 0);
                C3900si c3900si2 = this.f29338d;
                C3846ri c3846ri2 = new C3846ri(c3900si2.f34061c, c3900si2.f34064d, c3481ku2, c2493Bn2);
                ((C2558Fk) c3846ri2.f33682r0.f()).H1(new C2641Ki(0, (C3535lu) c3477kq.f31639b), this.f29337c);
                C2575Gk c2575Gk = (C2575Gk) c3846ri2.f33656H0.f();
                C3902sk c3902sk = (C3902sk) c3846ri2.f33658J0.f();
                C2762Rk c2762Rk = (C2762Rk) c3846ri2.f33664P0.f();
                C2610Il c2610Il = (C2610Il) c3846ri2.f33672V0.f();
                BinderC2581Gq binderC2581Gq = (BinderC2581Gq) c3477kq.f31640c;
                BinderC3210fr binderC3210fr = new BinderC3210fr(this, c2762Rk, c3902sk, c2575Gk, c2610Il);
                synchronized (binderC2581Gq) {
                    binderC2581Gq.f25130n = binderC3210fr;
                }
                return c3846ri2.T();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3639nq
    public final void b(Yt yt, St st, C3477kq c3477kq) {
        C3267gu c3267gu;
        switch (this.f29335a) {
            case 0:
                try {
                    C3052cu c3052cu = (C3052cu) yt.f28753a.f31863u;
                    int i = c3052cu.f29634p.f1974u;
                    JSONObject jSONObject = st.f27646v;
                    IInterface iInterface = c3477kq.f31640c;
                    Object obj = c3477kq.f31639b;
                    Context context = this.f29336b;
                    q2.c1 c1Var = c3052cu.f29623d;
                    if (i == 3) {
                        C3535lu c3535lu = (C3535lu) obj;
                        try {
                            c3535lu.f31864a.s1(new W2.b(context), c1Var, jSONObject.toString(), (InterfaceC3841rd) iInterface);
                            return;
                        } finally {
                        }
                    }
                    C3535lu c3535lu2 = (C3535lu) obj;
                    try {
                        c3535lu2.f31864a.V2(new W2.b(context), c1Var, jSONObject.toString(), (InterfaceC3841rd) iInterface);
                        return;
                    } finally {
                    }
                } catch (Exception e9) {
                    int i6 = u2.z.f41322b;
                    v2.i.g("Fail to load ad from adapter ".concat(String.valueOf(c3477kq.f31638a)), e9);
                    return;
                }
                int i62 = u2.z.f41322b;
                v2.i.g("Fail to load ad from adapter ".concat(String.valueOf(c3477kq.f31638a)), e9);
                return;
            default:
                C3535lu c3535lu3 = (C3535lu) c3477kq.f31639b;
                if (c3535lu3.a()) {
                    c(yt, st, c3477kq);
                    return;
                }
                C2570Gf c2570Gf = new C2570Gf(this, yt, st, c3477kq);
                IInterface iInterface2 = c3477kq.f31640c;
                BinderC2581Gq binderC2581Gq = (BinderC2581Gq) iInterface2;
                synchronized (binderC2581Gq) {
                    binderC2581Gq.f25132v = c2570Gf;
                }
                Context context2 = this.f29336b;
                C3052cu c3052cu2 = (C3052cu) yt.f28753a.f31863u;
                InterfaceC3037cf interfaceC3037cf = (InterfaceC3037cf) iInterface2;
                String jSONObject2 = st.f27646v.toString();
                try {
                    c3535lu3.f31864a.b2(new W2.b(context2), c3052cu2.f29623d, interfaceC3037cf, jSONObject2);
                    return;
                } finally {
                }
        }
    }
}
