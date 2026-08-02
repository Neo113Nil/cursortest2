package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class dsq extends xsq {
    public final String e;
    public final List f;
    public final ak2 g;
    public final zd3 h;
    public final d85 i;
    public final long j;
    public final String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsq(String str, List list, ak2 ak2Var, zd3 zd3Var, d85 d85Var, long j, String str2) {
        super(str, list, ak2Var, zd3Var);
        str.getClass();
        this.e = str;
        this.f = list;
        this.g = ak2Var;
        this.h = zd3Var;
        this.i = d85Var;
        this.j = j;
        this.k = str2;
    }

    @Override // defpackage.xsq
    public final long a() {
        return this.j;
    }

    @Override // defpackage.xsq
    public final d85 b() {
        return this.i;
    }

    @Override // defpackage.xsq
    public final String c() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsq)) {
            return false;
        }
        dsq dsqVar = (dsq) obj;
        return Intrinsics.d(this.e, dsqVar.e) && Intrinsics.d(this.f, dsqVar.f) && Intrinsics.d(this.g, dsqVar.g) && Intrinsics.d(this.h, dsqVar.h) && Intrinsics.d(this.i, dsqVar.i) && this.j == dsqVar.j && Intrinsics.d(this.k, dsqVar.k);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.e.hashCode() * 31;
        List list = this.f;
        int hashCode3 = (this.g.hashCode() + ((hashCode2 + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        zd3 zd3Var = this.h;
        int hashCode4 = (hashCode3 + (zd3Var == null ? 0 : zd3Var.hashCode())) * 31;
        d85 d85Var = this.i;
        if (d85Var == null) {
            hashCode = 0;
        } else {
            long j = d85Var.a;
            met metVar = net.b;
            hashCode = Long.hashCode(j);
        }
        int c = tlm.c(this.j, (hashCode4 + hashCode) * 31, 31);
        String str = this.k;
        return c + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = ouj.v("BackgroundSlide(slideId=", this.e, ", previews=", ", bgUiData=", this.f);
        v.append(this.g);
        v.append(", button=");
        v.append(this.h);
        v.append(", dynamicColor=");
        v.append(this.i);
        v.append(", animationDelayMs=");
        v.append(this.j);
        return vz1.s(v, ", promoLogoUrl=", this.k, ")");
    }
}
