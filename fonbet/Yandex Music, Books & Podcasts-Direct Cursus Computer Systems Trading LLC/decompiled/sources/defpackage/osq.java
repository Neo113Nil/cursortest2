package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class osq extends xsq {
    public final String e;
    public final List f;
    public final ldn g;
    public final ak2 h;
    public final zd3 i;
    public final d85 j;
    public final long k;
    public final String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public osq(String str, List list, ldn ldnVar, ak2 ak2Var, zd3 zd3Var, d85 d85Var, long j, String str2) {
        super(str, list, ak2Var, zd3Var);
        str.getClass();
        this.e = str;
        this.f = list;
        this.g = ldnVar;
        this.h = ak2Var;
        this.i = zd3Var;
        this.j = d85Var;
        this.k = j;
        this.l = str2;
    }

    @Override // defpackage.xsq
    public final long a() {
        return this.k;
    }

    @Override // defpackage.xsq
    public final d85 b() {
        return this.j;
    }

    @Override // defpackage.xsq
    public final String c() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof osq)) {
            return false;
        }
        osq osqVar = (osq) obj;
        return Intrinsics.d(this.e, osqVar.e) && Intrinsics.d(this.f, osqVar.f) && this.g.equals(osqVar.g) && this.h.equals(osqVar.h) && Intrinsics.d(this.i, osqVar.i) && Intrinsics.d(this.j, osqVar.j) && this.k == osqVar.k && Intrinsics.d(this.l, osqVar.l);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.e.hashCode() * 31;
        List list = this.f;
        int hashCode3 = (this.h.hashCode() + ((this.g.hashCode() + ((hashCode2 + (list == null ? 0 : list.hashCode())) * 31)) * 31)) * 31;
        zd3 zd3Var = this.i;
        int hashCode4 = (hashCode3 + (zd3Var == null ? 0 : zd3Var.hashCode())) * 31;
        d85 d85Var = this.j;
        if (d85Var == null) {
            hashCode = 0;
        } else {
            long j = d85Var.a;
            met metVar = net.b;
            hashCode = Long.hashCode(j);
        }
        int c = tlm.c(this.k, (hashCode4 + hashCode) * 31, 31);
        String str = this.l;
        return c + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = ouj.v("Quiz(slideId=", this.e, ", previews=", ", content=", this.f);
        v.append(this.g);
        v.append(", bgUiData=");
        v.append(this.h);
        v.append(", button=");
        v.append(this.i);
        v.append(", dynamicColor=");
        v.append(this.j);
        v.append(", animationDelayMs=");
        v.append(this.k);
        v.append(", promoLogoUrl=");
        v.append(this.l);
        v.append(")");
        return v.toString();
    }
}
