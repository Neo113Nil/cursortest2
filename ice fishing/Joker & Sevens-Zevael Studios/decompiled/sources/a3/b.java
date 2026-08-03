package a3;

import android.graphics.Insets;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f193e = new b(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f194a;

    /* renamed from: b, reason: collision with root package name */
    public final int f195b;

    /* renamed from: c, reason: collision with root package name */
    public final int f196c;

    /* renamed from: d, reason: collision with root package name */
    public final int f197d;

    public b(int i10, int i11, int i12, int i13) {
        this.f194a = i10;
        this.f195b = i11;
        this.f196c = i12;
        this.f197d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f194a, bVar2.f194a), Math.max(bVar.f195b, bVar2.f195b), Math.max(bVar.f196c, bVar2.f196c), Math.max(bVar.f197d, bVar2.f197d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f193e : new b(i10, i11, i12, i13);
    }

    public static b c(Insets insets) {
        int i10;
        int i11;
        int i12;
        int i13;
        i10 = insets.left;
        i11 = insets.top;
        i12 = insets.right;
        i13 = insets.bottom;
        return b(i10, i11, i12, i13);
    }

    public final Insets d() {
        return a2.b.h(this.f194a, this.f195b, this.f196c, this.f197d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f197d == bVar.f197d && this.f194a == bVar.f194a && this.f196c == bVar.f196c && this.f195b == bVar.f195b;
    }

    public final int hashCode() {
        return (((((this.f194a * 31) + this.f195b) * 31) + this.f196c) * 31) + this.f197d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f194a);
        sb.append(", top=");
        sb.append(this.f195b);
        sb.append(", right=");
        sb.append(this.f196c);
        sb.append(", bottom=");
        return a4.d.l(sb, this.f197d, '}');
    }
}
