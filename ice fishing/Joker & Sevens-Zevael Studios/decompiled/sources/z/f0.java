package z;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public float f8951a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8952b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Float.compare(this.f8951a, f0Var.f8951a) == 0 && this.f8952b == f0Var.f8952b;
    }

    public final int hashCode() {
        return a4.d.d(Float.hashCode(this.f8951a) * 31, 961, this.f8952b);
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f8951a + ", fill=" + this.f8952b + ", crossAxisAlignment=null, flowLayoutData=null)";
    }
}
