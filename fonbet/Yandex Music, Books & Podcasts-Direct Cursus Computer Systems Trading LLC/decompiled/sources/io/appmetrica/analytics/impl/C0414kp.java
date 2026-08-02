package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.kp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0414kp implements ProtobufConverter {
    public final Vg a = new Vg();
    public final C0516ob b = new C0516ob();
    public final Lp c = new Lp();
    public final U3 d = new U3();
    public final C0133b3 e = new C0133b3();
    public final C0541p7 f = new C0541p7();
    public final Hp g = new Hp();
    public final Ve h = new Ve();
    public final Ka i = new Ka();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ap fromModel(@NonNull C0501np c0501np) {
        Ap ap = new Ap();
        ap.s = c0501np.u;
        ap.t = c0501np.v;
        String str = c0501np.a;
        if (str != null) {
            ap.a = str;
        }
        List list = c0501np.f;
        if (list != null) {
            ap.f = (String[]) list.toArray(new String[list.size()]);
        }
        List list2 = c0501np.g;
        if (list2 != null) {
            ap.g = (String[]) list2.toArray(new String[list2.size()]);
        }
        List list3 = c0501np.b;
        if (list3 != null) {
            ap.c = (String[]) list3.toArray(new String[list3.size()]);
        }
        List list4 = c0501np.h;
        if (list4 != null) {
            ap.o = (String[]) list4.toArray(new String[list4.size()]);
        }
        Map<String, ? extends List<String>> map = c0501np.i;
        if (map != null) {
            ap.h = this.f.fromModel(map);
        }
        Ug ug = c0501np.s;
        if (ug != null) {
            ap.v = this.a.fromModel(ug);
        }
        String str2 = c0501np.j;
        if (str2 != null) {
            ap.j = str2;
        }
        String str3 = c0501np.c;
        if (str3 != null) {
            ap.d = str3;
        }
        String str4 = c0501np.d;
        if (str4 != null) {
            ap.e = str4;
        }
        String str5 = c0501np.e;
        if (str5 != null) {
            ap.r = str5;
        }
        ap.i = this.b.fromModel(c0501np.m);
        String str6 = c0501np.k;
        if (str6 != null) {
            ap.k = str6;
        }
        String str7 = c0501np.l;
        if (str7 != null) {
            ap.l = str7;
        }
        ap.m = c0501np.p;
        ap.b = c0501np.n;
        ap.q = c0501np.o;
        RetryPolicyConfig retryPolicyConfig = c0501np.t;
        ap.w = retryPolicyConfig.maxIntervalSeconds;
        ap.x = retryPolicyConfig.exponentialMultiplier;
        String str8 = c0501np.q;
        if (str8 != null) {
            ap.n = str8;
        }
        Kp kp = c0501np.r;
        if (kp != null) {
            this.c.getClass();
            C0846zp c0846zp = new C0846zp();
            c0846zp.a = kp.a;
            ap.p = c0846zp;
        }
        ap.u = c0501np.w;
        S3 s3 = c0501np.x;
        if (s3 != null) {
            this.d.getClass();
            C0645sp c0645sp = new C0645sp();
            c0645sp.a = s3.a;
            ap.y = c0645sp;
        }
        C0104a3 c0104a3 = c0501np.y;
        if (c0104a3 != null) {
            ap.z = this.e.fromModel(c0104a3);
        }
        ap.A = this.g.fromModel(c0501np.z);
        ap.B = this.h.fromModel(c0501np.A);
        ap.C = this.i.fromModel(c0501np.B);
        return ap;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0501np toModel(@NonNull Ap ap) {
        C0472mp c0472mp = new C0472mp(this.b.toModel(ap.i));
        c0472mp.a = ap.a;
        c0472mp.j = ap.j;
        c0472mp.c = ap.d;
        c0472mp.b = Arrays.asList(ap.c);
        c0472mp.g = Arrays.asList(ap.g);
        c0472mp.f = Arrays.asList(ap.f);
        c0472mp.d = ap.e;
        c0472mp.e = ap.r;
        c0472mp.h = Arrays.asList(ap.o);
        c0472mp.k = ap.k;
        c0472mp.l = ap.l;
        c0472mp.q = ap.m;
        c0472mp.o = ap.b;
        c0472mp.p = ap.q;
        c0472mp.t = ap.s;
        c0472mp.u = ap.t;
        c0472mp.r = ap.n;
        c0472mp.v = ap.u;
        c0472mp.w = new RetryPolicyConfig(ap.w, ap.x);
        c0472mp.i = this.f.toModel(ap.h);
        C0790xp c0790xp = ap.v;
        if (c0790xp != null) {
            this.a.getClass();
            c0472mp.n = new Ug(c0790xp.a, c0790xp.b);
        }
        C0846zp c0846zp = ap.p;
        if (c0846zp != null) {
            this.c.getClass();
            c0472mp.s = new Kp(c0846zp.a);
        }
        C0645sp c0645sp = ap.y;
        if (c0645sp != null) {
            this.d.getClass();
            c0472mp.x = new S3(c0645sp.a);
        }
        C0616rp c0616rp = ap.z;
        if (c0616rp != null) {
            c0472mp.y = this.e.toModel(c0616rp);
        }
        C0818yp c0818yp = ap.A;
        if (c0818yp != null) {
            this.g.getClass();
            c0472mp.z = new Gp(c0818yp.a);
        }
        c0472mp.A = this.h.toModel(ap.B);
        C0703up c0703up = ap.C;
        if (c0703up != null) {
            this.i.getClass();
            c0472mp.B = new Ja(c0703up.a);
        }
        return new C0501np(c0472mp);
    }
}
