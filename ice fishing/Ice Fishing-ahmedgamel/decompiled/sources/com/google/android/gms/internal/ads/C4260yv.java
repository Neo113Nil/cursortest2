package com.google.android.gms.internal.ads;

import android.content.Context;
import h.C4543G;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.yv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4260yv {

    /* renamed from: a, reason: collision with root package name */
    public final Context f36024a;

    /* renamed from: b, reason: collision with root package name */
    public final RD f36025b;

    /* renamed from: c, reason: collision with root package name */
    public final SD f36026c;

    /* renamed from: d, reason: collision with root package name */
    public final x2.l f36027d;

    /* renamed from: e, reason: collision with root package name */
    public final C4152wv f36028e;

    /* renamed from: f, reason: collision with root package name */
    public final Wu f36029f;

    /* renamed from: g, reason: collision with root package name */
    public final C2847Vh f36030g;

    public C4260yv(Context context, RD rd, SD sd, x2.l lVar, C4152wv c4152wv, Wu wu, C2847Vh c2847Vh) {
        this.f36024a = context;
        this.f36025b = rd;
        this.f36026c = sd;
        this.f36027d = lVar;
        this.f36028e = c4152wv;
        this.f36029f = wu;
        this.f36030g = c2847Vh;
    }

    public final void a(List list, C4543G c4543g) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((String) it.next(), c4543g, null, null);
        }
    }

    public final void b(String str, C4543G c4543g, Vu vu, C2799Sk c2799Sk) {
        P3.a b9;
        Su su = null;
        if (Wu.a() && ((Boolean) AbstractC2653Ka.f26707d.r()).booleanValue()) {
            su = Su.e(this.f36024a, 14);
            su.c();
        }
        if (c4543g != null) {
            b9 = new C3887s((x2.h) c4543g.f37843n, this.f36027d, this.f36026c, this.f36028e, this.f36030g, 10).a(str);
        } else {
            b9 = ((C3383ig) this.f36026c).b(new E2.w(10, this, str));
        }
        b9.a(new LD(0, b9, new C2590Gf(this, su, vu, c2799Sk)), this.f36025b);
    }
}
