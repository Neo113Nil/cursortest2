package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d3w {
    public final w2w a;
    public final dyv b;
    public final wn5 c;
    public final huv d;
    public final h0w e;
    public final guv f;
    public final cuv g;
    public final c3w h;
    public final boolean i;
    public final pyc j;
    public final ryc k;
    public final Function0 l;
    public final Function2 m;

    public d3w(w2w w2wVar, dyv dyvVar, wn5 wn5Var, huv huvVar, h0w h0wVar, guv guvVar, cuv cuvVar, c3w c3wVar, boolean z, pyc pycVar, ryc rycVar, Function0 function0, Function2 function2) {
        pycVar.getClass();
        rycVar.getClass();
        this.a = w2wVar;
        this.b = dyvVar;
        this.c = wn5Var;
        this.d = huvVar;
        this.e = h0wVar;
        this.f = guvVar;
        this.g = cuvVar;
        this.h = c3wVar;
        this.i = z;
        this.j = pycVar;
        this.k = rycVar;
        this.l = function0;
        this.m = function2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3w)) {
            return false;
        }
        d3w d3wVar = (d3w) obj;
        return this.a.equals(d3wVar.a) && this.b.equals(d3wVar.b) && this.c.equals(d3wVar.c) && this.d.equals(d3wVar.d) && this.e.equals(d3wVar.e) && this.f.equals(d3wVar.f) && this.g.equals(d3wVar.g) && this.h.equals(d3wVar.h) && this.i == d3wVar.i && Intrinsics.d(this.j, d3wVar.j) && Intrinsics.d(this.k, d3wVar.k) && this.l.equals(d3wVar.l) && this.m.equals(d3wVar.m);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + k5r.e(k5r.e((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + k5r.e((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.i)) * 31)) * 31)) * 31)) * 31, 31, true), 31, false);
    }

    public final String toString() {
        return "WizardUiConfig(stringResources=" + this.a + ", matrixConfig=" + this.b + ", errorScreen=" + this.c + ", drawableResources=" + this.d + ", rawResources=" + this.e + ", dimensions=" + this.f + ", colors=" + this.g + ", typography=" + this.h + ", showOnboarding=" + this.i + ", shimmerBox=" + this.j + ", textShimmer=" + this.k + ", yandexPlayerCreator=" + this.l + ", motionStateReporterCreator=" + this.m + ", isSearchPopularArtistsTitleUppercase=true, shouldCenterLikedArtistsTitle=false, isSkippable=true)";
    }
}
