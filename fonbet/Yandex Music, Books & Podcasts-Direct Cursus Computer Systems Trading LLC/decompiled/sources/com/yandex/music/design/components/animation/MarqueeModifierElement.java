package com.yandex.music.design.components.animation;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.cma;
import defpackage.edi;
import defpackage.eta;
import defpackage.f1d;
import defpackage.fbh;
import defpackage.fk0;
import defpackage.nbh;
import defpackage.pbh;
import defpackage.xci;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/yandex/music/design/components/animation/MarqueeModifierElement;", "Ledi;", "Lnbh;", "shared-design"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
final /* data */ class MarqueeModifierElement extends edi {
    public final int a;
    public final pbh b;
    public final float c;
    public final float d;
    public final fk0 e;

    public MarqueeModifierElement(int i, pbh pbhVar, float f, float f2, fk0 fk0Var) {
        this.a = i;
        this.b = pbhVar;
        this.c = f;
        this.d = f2;
        this.e = fk0Var;
    }

    @Override // defpackage.edi
    public final xci e() {
        return new nbh(this.a, this.b, this.c, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarqueeModifierElement)) {
            return false;
        }
        MarqueeModifierElement marqueeModifierElement = (MarqueeModifierElement) obj;
        return this.a == marqueeModifierElement.a && this.b.equals(marqueeModifierElement.b) && cma.a(this.c, marqueeModifierElement.c) && Float.compare(this.d, marqueeModifierElement.d) == 0 && this.e.equals(marqueeModifierElement.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + eta.a(eta.a((this.b.hashCode() + f1d.a(this.a, f1d.a(1200, f1d.a(0, Integer.hashCode(Integer.MAX_VALUE) * 31, 31), 31), 31)) * 31, this.c, 31), this.d, 31);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        nbh nbhVar = (nbh) xciVar;
        nbhVar.getClass();
        nbhVar.w.setValue(this.b);
        nbhVar.x.setValue(new fbh());
        int i = nbhVar.o;
        int i2 = this.a;
        float f = this.c;
        if (i == i2 && cma.a(nbhVar.p, f)) {
            return;
        }
        nbhVar.o = i2;
        nbhVar.p = f;
        nbhVar.U0();
    }

    public final String toString() {
        return "MarqueeModifierElement(iterations=2147483647, animationMode=Immediately, delayMillis=1200, initialDelayMillis=" + this.a + ", spacing=" + this.b + ", velocity=" + cma.b(this.c) + ", initialOffset=" + this.d + ", offset=" + this.e + ")";
    }
}
