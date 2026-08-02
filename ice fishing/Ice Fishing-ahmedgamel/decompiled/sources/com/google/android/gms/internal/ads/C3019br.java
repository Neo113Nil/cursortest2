package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.br, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3019br implements InterfaceC3662nq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30123a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f30124b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f30125c;

    /* renamed from: d, reason: collision with root package name */
    public final C3923si f30126d;

    public /* synthetic */ C3019br(Context context, Executor executor, C3923si c3923si, int i) {
        this.f30123a = i;
        this.f30124b = context;
        this.f30125c = executor;
        this.f30126d = c3923si;
    }

    public static final void c(Yt yt, St st, C3500kq c3500kq) {
        try {
            C3558lu c3558lu = (C3558lu) c3500kq.f32421b;
            s2.c1 c1Var = ((C3075cu) yt.f29532a.f32643u).f30393d;
            try {
                c3558lu.f32644a.m3(st.f28429v.toString(), c1Var);
            } catch (Throwable th) {
                throw new C3290gu(th);
            }
        } catch (Exception e9) {
            int i = w2.z.f41712b;
            x2.i.g("Fail to load ad from adapter ".concat(String.valueOf(c3500kq.f32420a)), e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3662nq
    public final Object a(Yt yt, St st, C3500kq c3500kq) {
        switch (this.f30123a) {
            case 0:
                C3504ku c3504ku = new C3504ku(yt, st, c3500kq.f32420a);
                C2530Cn c2530Cn = new C2530Cn(new S0.e(this, c3500kq, st), null, 0);
                C3923si c3923si = this.f30126d;
                C3869ri c3869ri = new C3869ri(c3923si.f34827c, c3923si.f34830d, c3504ku, c2530Cn);
                ((C2578Fk) c3869ri.m0.f()).I1(new C2661Ki(0, (C3558lu) c3500kq.f32421b), this.f30125c);
                ((BinderC2584Fq) c3500kq.f32422c).V3((BinderC3125dr) c3869ri.f34440S0.f());
                return c3869ri.T();
            default:
                C3504ku c3504ku2 = new C3504ku(yt, st, c3500kq.f32420a);
                C2530Cn c2530Cn2 = new C2530Cn(new S0.l(this, c3500kq, st), null, 0);
                C3923si c3923si2 = this.f30126d;
                C3869ri c3869ri2 = new C3869ri(c3923si2.f34827c, c3923si2.f34830d, c3504ku2, c2530Cn2);
                ((C2578Fk) c3869ri2.m0.f()).I1(new C2661Ki(0, (C3558lu) c3500kq.f32421b), this.f30125c);
                C2595Gk c2595Gk = (C2595Gk) c3869ri2.C0.f();
                C3925sk c3925sk = (C3925sk) c3869ri2.f34426E0.f();
                C2782Rk c2782Rk = (C2782Rk) c3869ri2.f34432K0.f();
                C2647Jl c2647Jl = (C2647Jl) c3869ri2.f34438Q0.f();
                BinderC2601Gq binderC2601Gq = (BinderC2601Gq) c3500kq.f32422c;
                BinderC3233fr binderC3233fr = new BinderC3233fr(this, c2782Rk, c3925sk, c2595Gk, c2647Jl);
                synchronized (binderC2601Gq) {
                    binderC2601Gq.f25902n = binderC3233fr;
                }
                return c3869ri2.T();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3662nq
    public final void b(Yt yt, St st, C3500kq c3500kq) {
        C3290gu c3290gu;
        switch (this.f30123a) {
            case 0:
                try {
                    C3075cu c3075cu = (C3075cu) yt.f29532a.f32643u;
                    int i = c3075cu.f30404p.f2062u;
                    JSONObject jSONObject = st.f28429v;
                    IInterface iInterface = c3500kq.f32422c;
                    Object obj = c3500kq.f32421b;
                    Context context = this.f30124b;
                    s2.c1 c1Var = c3075cu.f30393d;
                    if (i == 3) {
                        C3558lu c3558lu = (C3558lu) obj;
                        try {
                            c3558lu.f32644a.w3(new Y2.b(context), c1Var, jSONObject.toString(), (InterfaceC3864rd) iInterface);
                            return;
                        } finally {
                        }
                    }
                    C3558lu c3558lu2 = (C3558lu) obj;
                    try {
                        c3558lu2.f32644a.j2(new Y2.b(context), c1Var, jSONObject.toString(), (InterfaceC3864rd) iInterface);
                        return;
                    } finally {
                    }
                } catch (Exception e9) {
                    int i4 = w2.z.f41712b;
                    x2.i.g("Fail to load ad from adapter ".concat(String.valueOf(c3500kq.f32420a)), e9);
                    return;
                }
                int i42 = w2.z.f41712b;
                x2.i.g("Fail to load ad from adapter ".concat(String.valueOf(c3500kq.f32420a)), e9);
                return;
            default:
                C3558lu c3558lu3 = (C3558lu) c3500kq.f32421b;
                if (c3558lu3.a()) {
                    c(yt, st, c3500kq);
                    return;
                }
                C2590Gf c2590Gf = new C2590Gf(this, yt, st, c3500kq);
                IInterface iInterface2 = c3500kq.f32422c;
                BinderC2601Gq binderC2601Gq = (BinderC2601Gq) iInterface2;
                synchronized (binderC2601Gq) {
                    binderC2601Gq.f25904v = c2590Gf;
                }
                Context context2 = this.f30124b;
                C3075cu c3075cu2 = (C3075cu) yt.f29532a.f32643u;
                InterfaceC3060cf interfaceC3060cf = (InterfaceC3060cf) iInterface2;
                String jSONObject2 = st.f28429v.toString();
                try {
                    c3558lu3.f32644a.x3(new Y2.b(context2), c3075cu2.f30393d, interfaceC3060cf, jSONObject2);
                    return;
                } finally {
                }
        }
    }
}
