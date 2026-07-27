package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import l.C4648e;

/* renamed from: com.google.android.gms.internal.ads.yv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4237yv {

    /* renamed from: a, reason: collision with root package name */
    public final Context f35240a;

    /* renamed from: b, reason: collision with root package name */
    public final RD f35241b;

    /* renamed from: c, reason: collision with root package name */
    public final SD f35242c;

    /* renamed from: d, reason: collision with root package name */
    public final v2.l f35243d;

    /* renamed from: e, reason: collision with root package name */
    public final C4129wv f35244e;

    /* renamed from: f, reason: collision with root package name */
    public final Wu f35245f;

    /* renamed from: g, reason: collision with root package name */
    public final C2824Vh f35246g;

    public C4237yv(Context context, RD rd, SD sd, v2.l lVar, C4129wv c4129wv, Wu wu, C2824Vh c2824Vh) {
        this.f35240a = context;
        this.f35241b = rd;
        this.f35242c = sd;
        this.f35243d = lVar;
        this.f35244e = c4129wv;
        this.f35245f = wu;
        this.f35246g = c2824Vh;
    }

    public final void a(List list, C4648e c4648e) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((String) it.next(), c4648e, null, null);
        }
    }

    public final void b(String str, C4648e c4648e, Vu vu, C2779Sk c2779Sk) {
        N3.a b9;
        Su su = null;
        if (Wu.a() && ((Boolean) AbstractC2633Ka.f25929d.r()).booleanValue()) {
            su = Su.g(this.f35240a, 14);
            su.c();
        }
        if (c4648e != null) {
            b9 = new C3864s((v2.h) c4648e.f38761u, this.f35243d, this.f35242c, this.f35244e, this.f35246g, 10).a(str);
        } else {
            b9 = ((C3360ig) this.f35242c).b(new C2.x(10, this, str));
        }
        b9.a(new LD(0, b9, new C2570Gf(this, su, vu, c2779Sk)), this.f35241b);
    }
}
