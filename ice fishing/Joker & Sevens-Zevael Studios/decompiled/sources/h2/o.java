package h2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final o2.d f2693a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2694b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2695c;

    public o(o2.d dVar, int i10, int i11) {
        this.f2693a = dVar;
        this.f2694b = i10;
        this.f2695c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f2693a.equals(oVar.f2693a) && this.f2694b == oVar.f2694b && this.f2695c == oVar.f2695c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2695c) + v.f.b(this.f2694b, this.f2693a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.f2693a);
        sb.append(", startIndex=");
        sb.append(this.f2694b);
        sb.append(", endIndex=");
        return a4.d.l(sb, this.f2695c, ')');
    }
}
