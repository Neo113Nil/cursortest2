package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class lal {
    public final sgl a;
    public final Function0 b;
    public final Function0 c;
    public final jyr d;
    public final kme e;
    public final jyr f;
    public final p9w g;
    public final jyr h;
    public final p9w i;
    public final Function0 j;
    public final Function0 k;

    public lal(sgl sglVar, p9w p9wVar, p9w p9wVar2, jyr jyrVar, kme kmeVar, jyr jyrVar2, p9w p9wVar3, jyr jyrVar3, p9w p9wVar4, p9w p9wVar5, p9w p9wVar6) {
        this.a = sglVar;
        this.b = p9wVar;
        this.c = p9wVar2;
        this.d = jyrVar;
        this.e = kmeVar;
        this.f = jyrVar2;
        this.g = p9wVar3;
        this.h = jyrVar3;
        this.i = p9wVar4;
        this.j = p9wVar5;
        this.k = p9wVar6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lal)) {
            return false;
        }
        lal lalVar = (lal) obj;
        return this.a.equals(lalVar.a) && this.b.equals(lalVar.b) && this.c.equals(lalVar.c) && this.d.equals(lalVar.d) && this.e.equals(lalVar.e) && this.f.equals(lalVar.f) && this.g.equals(lalVar.g) && this.h.equals(lalVar.h) && this.i.equals(lalVar.i) && this.j.equals(lalVar.j) && this.k.equals(lalVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + k5r.e((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 961)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, false)) * 31)) * 31);
    }

    public final String toString() {
        return "PlayerConfig(playerOptimizations=" + this.a + ", audioBitrateEnabled=" + this.b + ", generativeQualityOverride=null, generativeFixFeedbackEnabled=" + this.c + ", crossfadeSetsEnabled=" + this.d + ", playsSetsEnabled=" + this.e + ", wakeLockEnabled=" + this.f + ", autoplayEnabled=" + this.g + ", quarterFadeRaceFixEnabled=" + this.h + ", collectPreFetcherStatus=false, debugLogEventsEnabled=" + this.i + ", rendererErrorPermanentRetryEnabled=" + this.j + ", hedgingDisabled=" + this.k + ")";
    }
}
