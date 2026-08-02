package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class xxk {
    public static final xxk q = new xxk(null, "", null, false, null, null, qo6.m, false, false, null, false, false, qxk.a, false, false, null);
    public final vxk a;
    public final CharSequence b;
    public final CharSequence c;
    public final boolean d;
    public final String e;
    public final d85 f;
    public final qo6 g;
    public final boolean h;
    public final boolean i;
    public final jzb j;
    public final boolean k;
    public final boolean l;
    public final qxk m;
    public final boolean n;
    public final boolean o;
    public final List p;

    public xxk(vxk vxkVar, CharSequence charSequence, CharSequence charSequence2, boolean z, String str, d85 d85Var, qo6 qo6Var, boolean z2, boolean z3, jzb jzbVar, boolean z4, boolean z5, qxk qxkVar, boolean z6, boolean z7, List list) {
        charSequence.getClass();
        this.a = vxkVar;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = z;
        this.e = str;
        this.f = d85Var;
        this.g = qo6Var;
        this.h = z2;
        this.i = z3;
        this.j = jzbVar;
        this.k = z4;
        this.l = z5;
        this.m = qxkVar;
        this.n = z6;
        this.o = z7;
        this.p = list;
    }

    public static xxk a(xxk xxkVar) {
        CharSequence charSequence = xxkVar.b;
        CharSequence charSequence2 = xxkVar.c;
        boolean z = xxkVar.d;
        String str = xxkVar.e;
        d85 d85Var = xxkVar.f;
        qo6 qo6Var = xxkVar.g;
        boolean z2 = xxkVar.h;
        boolean z3 = xxkVar.i;
        jzb jzbVar = xxkVar.j;
        boolean z4 = xxkVar.k;
        boolean z5 = xxkVar.l;
        qxk qxkVar = xxkVar.m;
        boolean z6 = xxkVar.n;
        boolean z7 = xxkVar.o;
        List list = xxkVar.p;
        xxkVar.getClass();
        charSequence.getClass();
        return new xxk(null, charSequence, charSequence2, z, str, d85Var, qo6Var, z2, z3, jzbVar, z4, z5, qxkVar, z6, z7, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxk)) {
            return false;
        }
        xxk xxkVar = (xxk) obj;
        return Intrinsics.d(this.a, xxkVar.a) && Intrinsics.d(this.b, xxkVar.b) && Intrinsics.d(this.c, xxkVar.c) && this.d == xxkVar.d && Intrinsics.d(this.e, xxkVar.e) && Intrinsics.d(this.f, xxkVar.f) && this.g == xxkVar.g && this.h == xxkVar.h && this.i == xxkVar.i && this.j == xxkVar.j && this.k == xxkVar.k && this.l == xxkVar.l && this.m == xxkVar.m && this.n == xxkVar.n && this.o == xxkVar.o && Intrinsics.d(this.p, xxkVar.p);
    }

    public final int hashCode() {
        int hashCode;
        vxk vxkVar = this.a;
        int hashCode2 = (this.b.hashCode() + ((vxkVar == null ? 0 : vxkVar.hashCode()) * 31)) * 31;
        CharSequence charSequence = this.c;
        int e = k5r.e((hashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.d);
        String str = this.e;
        int hashCode3 = (e + (str == null ? 0 : str.hashCode())) * 31;
        d85 d85Var = this.f;
        if (d85Var == null) {
            hashCode = 0;
        } else {
            long j = d85Var.a;
            met metVar = net.b;
            hashCode = Long.hashCode(j);
        }
        int e2 = k5r.e(k5r.e((this.g.hashCode() + ((hashCode3 + hashCode) * 31)) * 31, 31, this.h), 31, this.i);
        jzb jzbVar = this.j;
        int e3 = k5r.e(k5r.e((this.m.hashCode() + k5r.e(k5r.e((e2 + (jzbVar == null ? 0 : jzbVar.hashCode())) * 31, 31, this.k), 31, this.l)) * 31, 31, this.n), 31, this.o);
        List list = this.p;
        return e3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayableUiData(videoShot=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append((Object) this.b);
        sb.append(", subtitle=");
        sb.append((Object) this.c);
        sb.append(", showProgress=");
        sb.append(this.d);
        sb.append(", coverUrl=");
        sb.append(this.e);
        sb.append(", coverColor=");
        sb.append(this.f);
        sb.append(", coverType=");
        sb.append(this.g);
        sb.append(", showCoverShadow=");
        sb.append(this.h);
        sb.append(", showTrackInfoExpanded=");
        sb.append(this.i);
        sb.append(", explicitType=");
        sb.append(this.j);
        sb.append(", shareEnabled=");
        dfi.t(sb, this.k, ", menuEnabled=", this.l, ", titlesNavigation=");
        sb.append(this.m);
        sb.append(", showVideoClipIcon=");
        sb.append(this.n);
        sb.append(", showCoverInExpandedPlayer=");
        sb.append(this.o);
        sb.append(", artistsCoverUrl=");
        sb.append(this.p);
        sb.append(")");
        return sb.toString();
    }
}
