package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.concurrent.ScheduledExecutorService;
import x2.C5189a;

/* loaded from: classes2.dex */
public final class Qv {

    /* renamed from: a, reason: collision with root package name */
    public final Context f27884a;

    /* renamed from: b, reason: collision with root package name */
    public final C5189a f27885b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f27886c;

    /* renamed from: d, reason: collision with root package name */
    public final Gu f27887d;

    /* renamed from: e, reason: collision with root package name */
    public final ClientApi f27888e = new ClientApi();

    /* renamed from: f, reason: collision with root package name */
    public final C3504ku f27889f;

    /* renamed from: g, reason: collision with root package name */
    public final V2.a f27890g;

    /* renamed from: h, reason: collision with root package name */
    public final Cv f27891h;
    public final C3557lt i;

    public Qv(Context context, C5189a c5189a, ScheduledExecutorService scheduledExecutorService, Gu gu, C3504ku c3504ku, V2.a aVar, Cv cv, C3557lt c3557lt) {
        this.f27884a = context;
        this.f27885b = c5189a;
        this.f27886c = scheduledExecutorService;
        this.f27887d = gu;
        this.f27890g = aVar;
        this.f27889f = c3504ku;
        this.f27891h = cv;
        this.i = c3557lt;
    }

    public final Fv a(s2.V0 v02, s2.N n9) {
        m2.b a9 = m2.b.a(v02.f40377u);
        if (a9 == null) {
            return null;
        }
        int ordinal = a9.ordinal();
        C5189a c5189a = this.f27885b;
        Context context = this.f27884a;
        if (ordinal == 1) {
            int i = c5189a.f41847v;
            Gv b9 = b();
            return new Fv(this.f27888e, context, i, this.f27889f, v02, n9, this.f27886c, this.f27887d, b9, this.f27890g, 1);
        }
        if (ordinal == 2) {
            int i4 = c5189a.f41847v;
            Gv b10 = b();
            return new Fv(this.f27888e, context, i4, this.f27889f, v02, n9, this.f27886c, this.f27887d, b10, this.f27890g, 2);
        }
        if (ordinal != 5) {
            return null;
        }
        int i6 = c5189a.f41847v;
        Gv b11 = b();
        return new Fv(this.f27888e, context, i6, this.f27889f, v02, n9, this.f27886c, this.f27887d, b11, this.f27890g, 0);
    }

    public final Gv b() {
        C3324ha c3324ha = AbstractC3592ma.J;
        s2.r rVar = s2.r.f40506e;
        return new Gv(((Long) rVar.f40509c.a(c3324ha)).longValue(), ((Long) rVar.f40509c.a(AbstractC3592ma.f32834K)).longValue(), this.f27890g, this.i);
    }
}
