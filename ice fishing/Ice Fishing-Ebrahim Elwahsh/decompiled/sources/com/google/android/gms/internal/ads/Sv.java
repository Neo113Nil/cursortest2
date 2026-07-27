package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.concurrent.ScheduledExecutorService;
import k2.EnumC4631b;
import u2.C5107a;

/* loaded from: classes2.dex */
public final class Sv {

    /* renamed from: a, reason: collision with root package name */
    public final Context f27637a;

    /* renamed from: b, reason: collision with root package name */
    public final C5107a f27638b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f27639c;

    /* renamed from: d, reason: collision with root package name */
    public final Iu f27640d;

    /* renamed from: e, reason: collision with root package name */
    public final ClientApi f27641e = new ClientApi();

    /* renamed from: f, reason: collision with root package name */
    public final C3602mu f27642f;

    /* renamed from: g, reason: collision with root package name */
    public final S2.a f27643g;

    /* renamed from: h, reason: collision with root package name */
    public final Ev f27644h;
    public final Mt i;

    public Sv(Context context, C5107a c5107a, ScheduledExecutorService scheduledExecutorService, Iu iu, C3602mu c3602mu, S2.a aVar, Ev ev, Mt mt) {
        this.f27637a = context;
        this.f27638b = c5107a;
        this.f27639c = scheduledExecutorService;
        this.f27640d = iu;
        this.f27643g = aVar;
        this.f27642f = c3602mu;
        this.f27644h = ev;
        this.i = mt;
    }

    public final Hv a(q2.W0 w02, q2.N n9) {
        EnumC4631b a9 = EnumC4631b.a(w02.f39987u);
        if (a9 == null) {
            return null;
        }
        int ordinal = a9.ordinal();
        C5107a c5107a = this.f27638b;
        Context context = this.f27637a;
        if (ordinal == 1) {
            int i = c5107a.f41219v;
            Iv b9 = b();
            return new Hv(this.f27641e, context, i, this.f27642f, w02, n9, this.f27639c, this.f27640d, b9, this.f27643g, 1);
        }
        if (ordinal == 2) {
            int i4 = c5107a.f41219v;
            Iv b10 = b();
            return new Hv(this.f27641e, context, i4, this.f27642f, w02, n9, this.f27639c, this.f27640d, b10, this.f27643g, 2);
        }
        if (ordinal != 5) {
            return null;
        }
        int i9 = c5107a.f41219v;
        Iv b11 = b();
        return new Hv(this.f27641e, context, i9, this.f27642f, w02, n9, this.f27639c, this.f27640d, b11, this.f27643g, 0);
    }

    public final Iv b() {
        C3151ea c3151ea = AbstractC3368ia.J;
        q2.r rVar = q2.r.f40116e;
        return new Iv(((Long) rVar.f40119c.a(c3151ea)).longValue(), ((Long) rVar.f40119c.a(AbstractC3368ia.f31473K)).longValue(), this.f27643g, this.i);
    }
}
