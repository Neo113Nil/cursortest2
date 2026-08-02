package com.anythink.basead.mixad.e;

import D.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.l.g.d;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class c extends y implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    private final int f10345o;

    /* renamed from: p, reason: collision with root package name */
    private final int f10346p;

    /* renamed from: q, reason: collision with root package name */
    private final int f10347q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f10348r;

    public c(com.anythink.core.common.l.g.a aVar) {
        y(aVar.d());
        r(aVar.c());
        b(aVar.b() * 1000);
        s(aVar.a());
        A(aVar.e());
        z(aVar.f());
        e(aVar.n());
        this.f10347q = aVar.j();
        int k9 = aVar.k();
        this.f10345o = k9;
        this.f10346p = aVar.m();
        if (aVar instanceof d) {
            this.f10348r = ((d) aVar).p();
        }
        f(String.valueOf(k9));
        ap(aVar.o());
    }

    public final boolean a() {
        return this.f10347q == 1;
    }

    public final int b() {
        return this.f10345o;
    }

    public final int c() {
        return this.f10346p;
    }

    public final boolean d() {
        return this.f10348r;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ThirdPartyAdSetting{adSourceInterType=");
        sb.append(this.f10345o);
        sb.append(", adSourceShakeType=");
        sb.append(this.f10346p);
        sb.append(", nativeRenderingType=");
        sb.append(this.f10347q);
        sb.append(", isShowCloseButton=");
        sb.append(this.f10348r);
        sb.append(", probabilityForDelayShowCloseButtonInEndCard=");
        sb.append(this.f14992e);
        sb.append(", MinDelayTimeWhenShowCloseButton=");
        sb.append(this.f14993f);
        sb.append(", MaxDelayTimeWhenShowCloseButton=");
        sb.append(this.f14994g);
        sb.append(", interstitialType='");
        sb.append(this.f14995h);
        sb.append("', rewardTime=");
        sb.append(this.i);
        sb.append(", isRewardForPlayFail=");
        sb.append(this.f14996j);
        sb.append(", closeClickType=");
        sb.append(this.f14997k);
        sb.append(", splashImageScaleType=");
        sb.append(this.f14998l);
        sb.append(", impressionMonitorTime=");
        return x.n(sb, this.f14999m, '}');
    }
}
