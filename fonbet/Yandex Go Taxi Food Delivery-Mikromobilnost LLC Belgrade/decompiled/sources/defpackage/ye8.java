package defpackage;

import com.ybsdk.core.common.domain.entities.ColoredTextEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ye8 {
    public final String a;
    public final eh4 b;
    public final tw8 c;
    public final uw8 d;
    public final ColoredTextEntity e;
    public final ThemedImageUrlEntity f;
    public final ThemedImageUrlEntity g;
    public final go4 h;
    public final go4 i;
    public final svt0 j;
    public final rr51 k;
    public final b98 l;
    public final a9f0 m;

    public ye8(String str, eh4 eh4Var, tw8 tw8Var, uw8 uw8Var, ColoredTextEntity coloredTextEntity, ThemedImageUrlEntity themedImageUrlEntity, ThemedImageUrlEntity themedImageUrlEntity2, go4 go4Var, go4 go4Var2, svt0 svt0Var, rr51 rr51Var, b98 b98Var, a9f0 a9f0Var) {
        this.a = str;
        this.b = eh4Var;
        this.c = tw8Var;
        this.d = uw8Var;
        this.e = coloredTextEntity;
        this.f = themedImageUrlEntity;
        this.g = themedImageUrlEntity2;
        this.h = go4Var;
        this.i = go4Var2;
        this.j = svt0Var;
        this.k = rr51Var;
        this.l = b98Var;
        this.m = a9f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ye8)) {
            return false;
        }
        ye8 ye8Var = (ye8) obj;
        return jl40.l(this.a, ye8Var.a) && jl40.l(this.b, ye8Var.b) && jl40.l(this.c, ye8Var.c) && jl40.l(this.d, ye8Var.d) && jl40.l(this.e, ye8Var.e) && jl40.l(this.f, ye8Var.f) && jl40.l(this.g, ye8Var.g) && jl40.l(this.h, ye8Var.h) && jl40.l(this.i, ye8Var.i) && jl40.l(this.j, ye8Var.j) && jl40.l(this.k, ye8Var.k) && jl40.l(this.l, ye8Var.l) && jl40.l(this.m, ye8Var.m);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        tw8 tw8Var = this.c;
        int hashCode2 = (hashCode + (tw8Var == null ? 0 : tw8Var.hashCode())) * 31;
        uw8 uw8Var = this.d;
        int hashCode3 = (this.e.hashCode() + ((hashCode2 + (uw8Var == null ? 0 : uw8Var.hashCode())) * 31)) * 31;
        ThemedImageUrlEntity themedImageUrlEntity = this.f;
        int hashCode4 = (hashCode3 + (themedImageUrlEntity == null ? 0 : themedImageUrlEntity.hashCode())) * 31;
        ThemedImageUrlEntity themedImageUrlEntity2 = this.g;
        int hashCode5 = (this.h.hashCode() + ((hashCode4 + (themedImageUrlEntity2 == null ? 0 : themedImageUrlEntity2.hashCode())) * 31)) * 31;
        go4 go4Var = this.i;
        int hashCode6 = (this.j.hashCode() + ((hashCode5 + (go4Var == null ? 0 : go4Var.hashCode())) * 31)) * 31;
        rr51 rr51Var = this.k;
        int hashCode7 = (hashCode6 + (rr51Var == null ? 0 : rr51Var.hashCode())) * 31;
        b98 b98Var = this.l;
        int hashCode8 = (hashCode7 + (b98Var == null ? 0 : b98Var.hashCode())) * 31;
        a9f0 a9f0Var = this.m;
        return hashCode8 + (a9f0Var != null ? a9f0Var.hashCode() : 0);
    }

    public final String toString() {
        return "CardEntity(viewId=" + this.a + ", background=" + this.b + ", backdrop=" + this.c + ", divkitBackdrop=" + this.d + ", title=" + this.e + ", titleIcon=" + this.f + ", iconAfterTitle=" + this.g + ", balance=" + this.h + ", additionalBalance=" + this.i + ", balanceSpoiler=" + this.j + ", divkitOverlay=" + this.k + ", a11y=" + this.l + ", skin=" + this.m + Extension.C_BRAKE;
    }
}
