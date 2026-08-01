package com.anythink.basead.mixad.e;

import com.anythink.core.common.h.y;
import com.anythink.core.common.l.g.d;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class c extends y implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    private final int f9559o;

    /* renamed from: p, reason: collision with root package name */
    private final int f9560p;

    /* renamed from: q, reason: collision with root package name */
    private final int f9561q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f9562r;

    public c(com.anythink.core.common.l.g.a aVar) {
        y(aVar.d());
        r(aVar.c());
        b(aVar.b() * 1000);
        s(aVar.a());
        A(aVar.e());
        z(aVar.f());
        e(aVar.n());
        this.f9561q = aVar.j();
        int k9 = aVar.k();
        this.f9559o = k9;
        this.f9560p = aVar.m();
        if (aVar instanceof d) {
            this.f9562r = ((d) aVar).p();
        }
        f(String.valueOf(k9));
        ap(aVar.o());
    }

    public final boolean a() {
        return this.f9561q == 1;
    }

    public final int b() {
        return this.f9559o;
    }

    public final int c() {
        return this.f9560p;
    }

    public final boolean d() {
        return this.f9562r;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ThirdPartyAdSetting{adSourceInterType=");
        sb.append(this.f9559o);
        sb.append(", adSourceShakeType=");
        sb.append(this.f9560p);
        sb.append(", nativeRenderingType=");
        sb.append(this.f9561q);
        sb.append(", isShowCloseButton=");
        sb.append(this.f9562r);
        sb.append(", probabilityForDelayShowCloseButtonInEndCard=");
        sb.append(this.f14206e);
        sb.append(", MinDelayTimeWhenShowCloseButton=");
        sb.append(this.f14207f);
        sb.append(", MaxDelayTimeWhenShowCloseButton=");
        sb.append(this.f14208g);
        sb.append(", interstitialType='");
        sb.append(this.f14209h);
        sb.append("', rewardTime=");
        sb.append(this.i);
        sb.append(", isRewardForPlayFail=");
        sb.append(this.f14210j);
        sb.append(", closeClickType=");
        sb.append(this.f14211k);
        sb.append(", splashImageScaleType=");
        sb.append(this.f14212l);
        sb.append(", impressionMonitorTime=");
        return D.y.q(sb, this.f14213m, '}');
    }
}
