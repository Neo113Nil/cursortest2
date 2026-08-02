package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class Cp implements ProtobufConverter {
    public final C0509lh a = new C0509lh();
    public final C0879yb b = new C0879yb();
    public final C0287dq c = new C0287dq();
    public final X3 d = new X3();
    public final C0207b3 e = new C0207b3();
    public final C0759u7 f = new C0759u7();
    public final Zp g = new Zp();
    public final C0478kf h = new C0478kf();
    public final Sa i = new Sa();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Sp fromModel(Fp fp) {
        Sp sp = new Sp();
        sp.s = fp.u;
        sp.t = fp.v;
        String str = fp.a;
        if (str != null) {
            sp.a = str;
        }
        List list = fp.f;
        if (list != null) {
            sp.f = (String[]) list.toArray(new String[list.size()]);
        }
        List list2 = fp.g;
        if (list2 != null) {
            sp.g = (String[]) list2.toArray(new String[list2.size()]);
        }
        List list3 = fp.b;
        if (list3 != null) {
            sp.c = (String[]) list3.toArray(new String[list3.size()]);
        }
        List list4 = fp.h;
        if (list4 != null) {
            sp.o = (String[]) list4.toArray(new String[list4.size()]);
        }
        Map<String, ? extends List<String>> map = fp.i;
        if (map != null) {
            sp.h = this.f.fromModel(map);
        }
        C0480kh c0480kh = fp.s;
        if (c0480kh != null) {
            sp.v = this.a.fromModel(c0480kh);
        }
        String str2 = fp.j;
        if (str2 != null) {
            sp.j = str2;
        }
        String str3 = fp.c;
        if (str3 != null) {
            sp.d = str3;
        }
        String str4 = fp.d;
        if (str4 != null) {
            sp.e = str4;
        }
        String str5 = fp.e;
        if (str5 != null) {
            sp.r = str5;
        }
        sp.i = this.b.fromModel(fp.m);
        String str6 = fp.k;
        if (str6 != null) {
            sp.k = str6;
        }
        String str7 = fp.l;
        if (str7 != null) {
            sp.l = str7;
        }
        sp.m = fp.p;
        sp.b = fp.n;
        sp.q = fp.o;
        RetryPolicyConfig retryPolicyConfig = fp.t;
        sp.w = retryPolicyConfig.maxIntervalSeconds;
        sp.x = retryPolicyConfig.exponentialMultiplier;
        String str8 = fp.q;
        if (str8 != null) {
            sp.n = str8;
        }
        C0259cq c0259cq = fp.r;
        if (c0259cq != null) {
            this.c.getClass();
            Rp rp = new Rp();
            rp.a = c0259cq.a;
            sp.p = rp;
        }
        sp.u = fp.w;
        V3 v3 = fp.x;
        if (v3 != null) {
            this.d.getClass();
            Kp kp = new Kp();
            kp.a = v3.a;
            sp.y = kp;
        }
        C0178a3 c0178a3 = fp.y;
        if (c0178a3 != null) {
            sp.z = this.e.fromModel(c0178a3);
        }
        sp.A = this.g.fromModel(fp.z);
        sp.B = this.h.fromModel(fp.A);
        sp.C = this.i.fromModel(fp.B);
        return sp;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Fp toModel(Sp sp) {
        Ep ep = new Ep(this.b.toModel(sp.i));
        ep.a = sp.a;
        ep.j = sp.j;
        ep.c = sp.d;
        ep.b = Arrays.asList(sp.c);
        ep.g = Arrays.asList(sp.g);
        ep.f = Arrays.asList(sp.f);
        ep.d = sp.e;
        ep.e = sp.r;
        ep.h = Arrays.asList(sp.o);
        ep.k = sp.k;
        ep.l = sp.l;
        ep.q = sp.m;
        ep.o = sp.b;
        ep.p = sp.q;
        ep.t = sp.s;
        ep.u = sp.t;
        ep.r = sp.n;
        ep.v = sp.u;
        ep.w = new RetryPolicyConfig(sp.w, sp.x);
        ep.i = this.f.toModel(sp.h);
        Pp pp = sp.v;
        if (pp != null) {
            this.a.getClass();
            ep.n = new C0480kh(pp.a, pp.b);
        }
        Rp rp = sp.p;
        if (rp != null) {
            this.c.getClass();
            ep.s = new C0259cq(rp.a);
        }
        Kp kp = sp.y;
        if (kp != null) {
            this.d.getClass();
            ep.x = new V3(kp.a);
        }
        Jp jp = sp.z;
        if (jp != null) {
            ep.y = this.e.toModel(jp);
        }
        Qp qp = sp.A;
        if (qp != null) {
            this.g.getClass();
            ep.z = new Yp(qp.a);
        }
        ep.A = this.h.toModel(sp.B);
        Mp mp = sp.C;
        if (mp != null) {
            this.i.getClass();
            ep.B = new Ra(mp.a);
        }
        return new Fp(ep);
    }
}
