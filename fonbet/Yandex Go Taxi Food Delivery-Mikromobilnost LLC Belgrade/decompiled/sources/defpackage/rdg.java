package defpackage;

import android.graphics.drawable.RippleDrawable;
import android.view.View;

/* loaded from: classes2.dex */
public final class rdg {
    public final wky0 a;
    public final wky0 b;
    public final wky0 c;
    public final RippleDrawable d;
    public final boolean e;
    public final View.OnClickListener f;
    public final mz6 g;
    public final ght h;
    public final wj4 i;
    public final shr0 j;
    public final String k;
    public final shr0 l;
    public final shr0 m;
    public final boolean n;

    public rdg(wky0 wky0Var, wky0 wky0Var2, wky0 wky0Var3, RippleDrawable rippleDrawable, boolean z, View.OnClickListener onClickListener, mz6 mz6Var, ght ghtVar, wj4 wj4Var, shr0 shr0Var, String str, shr0 shr0Var2, shr0 shr0Var3, boolean z2) {
        this.a = wky0Var;
        this.b = wky0Var2;
        this.c = wky0Var3;
        this.d = rippleDrawable;
        this.e = z;
        this.f = onClickListener;
        this.g = mz6Var;
        this.h = ghtVar;
        this.i = wj4Var;
        this.j = shr0Var;
        this.k = str;
        this.l = shr0Var2;
        this.m = shr0Var3;
        this.n = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdg)) {
            return false;
        }
        rdg rdgVar = (rdg) obj;
        return jl40.l(this.a, rdgVar.a) && jl40.l(this.b, rdgVar.b) && jl40.l(this.c, rdgVar.c) && jl40.l(this.d, rdgVar.d) && this.e == rdgVar.e && jl40.l(this.f, rdgVar.f) && jl40.l(this.g, rdgVar.g) && jl40.l(this.h, rdgVar.h) && jl40.l(this.i, rdgVar.i) && jl40.l(this.j, rdgVar.j) && jl40.l(this.k, rdgVar.k) && jl40.l(this.l, rdgVar.l) && jl40.l(this.m, rdgVar.m) && this.n == rdgVar.n;
    }

    public final int hashCode() {
        int e = unr0.e((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e);
        View.OnClickListener onClickListener = this.f;
        int hashCode = (e + (onClickListener == null ? 0 : onClickListener.hashCode())) * 31;
        mz6 mz6Var = this.g;
        int hashCode2 = (hashCode + (mz6Var == null ? 0 : mz6Var.hashCode())) * 31;
        ght ghtVar = this.h;
        int hashCode3 = (hashCode2 + (ghtVar == null ? 0 : ghtVar.hashCode())) * 31;
        wj4 wj4Var = this.i;
        int hashCode4 = (hashCode3 + (wj4Var == null ? 0 : wj4Var.hashCode())) * 31;
        shr0 shr0Var = this.j;
        int b = unr0.b((hashCode4 + (shr0Var == null ? 0 : shr0Var.hashCode())) * 31, 31, this.k);
        shr0 shr0Var2 = this.l;
        int hashCode5 = (b + (shr0Var2 == null ? 0 : shr0Var2.hashCode())) * 31;
        shr0 shr0Var3 = this.m;
        return Boolean.hashCode(this.n) + ((hashCode5 + (shr0Var3 != null ? shr0Var3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DailyTopContent(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", background=");
        sb.append(this.d);
        sb.append(", isSeparatorVisible=");
        sb.append(this.e);
        sb.append(", rootClickListener=");
        sb.append(this.f);
        sb.append(", button=");
        sb.append(this.g);
        sb.append(", giftProgress=");
        sb.append(this.h);
        sb.append(", badgeContent=");
        sb.append(this.i);
        sb.append(", giftContent=");
        sb.append(this.j);
        sb.append(", contentDescription=");
        sb.append(this.k);
        sb.append(", confettiFirstLayerContent=");
        sb.append(this.l);
        sb.append(", confettiSecondLayerContent=");
        sb.append(this.m);
        sb.append(", isBig=");
        return unr0.u(sb, this.n, ')');
    }
}
