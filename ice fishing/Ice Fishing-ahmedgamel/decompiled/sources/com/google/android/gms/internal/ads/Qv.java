package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.concurrent.ScheduledExecutorService;
import v2.C5110a;

/* loaded from: classes2.dex */
public final class Qv {

    /* renamed from: a, reason: collision with root package name */
    public final Context f27128a;

    /* renamed from: b, reason: collision with root package name */
    public final C5110a f27129b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f27130c;

    /* renamed from: d, reason: collision with root package name */
    public final Gu f27131d;

    /* renamed from: e, reason: collision with root package name */
    public final ClientApi f27132e = new ClientApi();

    /* renamed from: f, reason: collision with root package name */
    public final C3481ku f27133f;

    /* renamed from: g, reason: collision with root package name */
    public final T2.a f27134g;

    /* renamed from: h, reason: collision with root package name */
    public final Cv f27135h;
    public final C3534lt i;

    public Qv(Context context, C5110a c5110a, ScheduledExecutorService scheduledExecutorService, Gu gu, C3481ku c3481ku, T2.a aVar, Cv cv, C3534lt c3534lt) {
        this.f27128a = context;
        this.f27129b = c5110a;
        this.f27130c = scheduledExecutorService;
        this.f27131d = gu;
        this.f27134g = aVar;
        this.f27133f = c3481ku;
        this.f27135h = cv;
        this.i = c3534lt;
    }

    public final Fv a(q2.V0 v02, q2.N n9) {
        k2.b a9 = k2.b.a(v02.f40078u);
        if (a9 == null) {
            return null;
        }
        int ordinal = a9.ordinal();
        C5110a c5110a = this.f27129b;
        Context context = this.f27128a;
        if (ordinal == 1) {
            int i = c5110a.f41393v;
            Gv b9 = b();
            return new Fv(this.f27132e, context, i, this.f27133f, v02, n9, this.f27130c, this.f27131d, b9, this.f27134g, 1);
        }
        if (ordinal == 2) {
            int i6 = c5110a.f41393v;
            Gv b10 = b();
            return new Fv(this.f27132e, context, i6, this.f27133f, v02, n9, this.f27130c, this.f27131d, b10, this.f27134g, 2);
        }
        if (ordinal != 5) {
            return null;
        }
        int i9 = c5110a.f41393v;
        Gv b11 = b();
        return new Fv(this.f27132e, context, i9, this.f27133f, v02, n9, this.f27130c, this.f27131d, b11, this.f27134g, 0);
    }

    public final Gv b() {
        C3301ha c3301ha = AbstractC3569ma.J;
        q2.r rVar = q2.r.f40207e;
        return new Gv(((Long) rVar.f40210c.a(c3301ha)).longValue(), ((Long) rVar.f40210c.a(AbstractC3569ma.f32054K)).longValue(), this.f27134g, this.i);
    }
}
