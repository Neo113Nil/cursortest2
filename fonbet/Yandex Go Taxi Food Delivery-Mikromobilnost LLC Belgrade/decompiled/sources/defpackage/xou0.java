package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.communications.api.dto.Story;
import ru.yandex.taxi.communications.api.dto.StoryWidgets;
import ru.yandex.taxi.promotions.model.PromotionBackground;
import ru.yandex.taxi.stories.presentation.story.StoryMediaInfo$PagerMode;

/* loaded from: classes6.dex */
public final class xou0 {
    public static final xou0 r;
    public final zxs0 a;
    public final zxs0 b;
    public final StoryWidgets c;
    public final int d;
    public final String e;
    public final boolean f;
    public final int g;
    public final int h;
    public final long i;
    public final Story.c j;
    public final StoryMediaInfo$PagerMode k;
    public final boolean l;
    public final boolean m;
    public final Story.g n;
    public final boolean o;
    public final PromotionBackground p;
    public final owd0 q;

    static {
        String str = "";
        Object obj = null;
        zxs0 zxs0Var = new zxs0(str, obj);
        zxs0 zxs0Var2 = new zxs0(str, obj);
        StoryWidgets storyWidgets = StoryWidgets.g;
        StoryMediaInfo$PagerMode storyMediaInfo$PagerMode = StoryMediaInfo$PagerMode.NONE;
        Story.Companion.getClass();
        r = new xou0(zxs0Var, zxs0Var2, storyWidgets, 0, null, false, 0, 0, 0L, null, storyMediaInfo$PagerMode, false, false, Story.o, false, null, null);
    }

    public xou0(zxs0 zxs0Var, zxs0 zxs0Var2, StoryWidgets storyWidgets, int i, String str, boolean z, int i2, int i3, long j, Story.c cVar, StoryMediaInfo$PagerMode storyMediaInfo$PagerMode, boolean z2, boolean z3, Story.g gVar, boolean z4, PromotionBackground promotionBackground, owd0 owd0Var) {
        this.a = zxs0Var;
        this.b = zxs0Var2;
        this.c = storyWidgets;
        this.d = i;
        this.e = str;
        this.f = z;
        this.g = i2;
        this.h = i3;
        this.i = j;
        this.j = cVar;
        this.k = storyMediaInfo$PagerMode;
        this.l = z2;
        this.m = z3;
        this.n = gVar;
        this.o = z4;
        this.p = promotionBackground;
        this.q = owd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xou0)) {
            return false;
        }
        xou0 xou0Var = (xou0) obj;
        return jl40.l(this.a, xou0Var.a) && jl40.l(this.b, xou0Var.b) && jl40.l(this.c, xou0Var.c) && this.d == xou0Var.d && jl40.l(this.e, xou0Var.e) && this.f == xou0Var.f && this.g == xou0Var.g && this.h == xou0Var.h && this.i == xou0Var.i && jl40.l(this.j, xou0Var.j) && this.k == xou0Var.k && this.l == xou0Var.l && this.m == xou0Var.m && jl40.l(this.n, xou0Var.n) && this.o == xou0Var.o && jl40.l(this.p, xou0Var.p) && jl40.l(this.q, xou0Var.q);
    }

    public final int hashCode() {
        int b = oyr.b(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31);
        String str = this.e;
        int c = qv10.c(oyr.b(this.h, oyr.b(this.g, unr0.e((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31), 31), 31, this.i);
        Story.c cVar = this.j;
        int e = unr0.e((this.n.hashCode() + unr0.e(unr0.e((this.k.hashCode() + ((c + (cVar == null ? 0 : cVar.hashCode())) * 31)) * 31, 31, this.l), 31, this.m)) * 31, 31, this.o);
        PromotionBackground promotionBackground = this.p;
        int hashCode = (e + (promotionBackground == null ? 0 : promotionBackground.hashCode())) * 31;
        owd0 owd0Var = this.q;
        return hashCode + (owd0Var != null ? owd0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryMediaInfo(title=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", widgets=");
        sb.append(this.c);
        sb.append(", backgroundColor=");
        sb.append(this.d);
        sb.append(", imagePlaceholder=");
        tse0.y(this.e, ", isNeedAnimateToVideo=", ", mediaCount=", sb, this.f);
        vfc.u(this.g, this.h, ", mediaIndex=", ", duration=", sb);
        sb.append(this.i);
        sb.append(", pageMedia=");
        sb.append(this.j);
        sb.append(", pagerMode=");
        sb.append(this.k);
        sb.append(", isAfterPageScroll=");
        sb.append(this.l);
        sb.append(", isBackgroundCached=");
        sb.append(this.m);
        sb.append(", layout=");
        sb.append(this.n);
        sb.append(", hideCloseButton=");
        sb.append(this.o);
        sb.append(", mainBackground=");
        sb.append(this.p);
        sb.append(", policy=");
        sb.append(this.q);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
