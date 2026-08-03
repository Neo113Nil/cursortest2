package h1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g extends c {

    /* renamed from: b, reason: collision with root package name */
    public final float f2602b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2603c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2604d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2605e;

    public g(float f10, float f11, int i10, int i11, int i12) {
        f11 = (i12 & 2) != 0 ? 4.0f : f11;
        i10 = (i12 & 4) != 0 ? 0 : i10;
        i11 = (i12 & 8) != 0 ? 0 : i11;
        this.f2602b = f10;
        this.f2603c = f11;
        this.f2604d = i10;
        this.f2605e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f2602b == gVar.f2602b && this.f2603c == gVar.f2603c && this.f2604d == gVar.f2604d && this.f2605e == gVar.f2605e;
    }

    public final int hashCode() {
        return v.f.b(this.f2605e, v.f.b(this.f2604d, a4.d.b(this.f2603c, Float.hashCode(this.f2602b) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.f2602b);
        sb.append(", miter=");
        sb.append(this.f2603c);
        sb.append(", cap=");
        String str = "Unknown";
        int i10 = this.f2604d;
        sb.append((Object) (i10 == 0 ? "Butt" : i10 == 1 ? "Round" : i10 == 2 ? "Square" : "Unknown"));
        sb.append(", join=");
        int i11 = this.f2605e;
        if (i11 == 0) {
            str = "Miter";
        } else if (i11 == 1) {
            str = "Round";
        } else if (i11 == 2) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
