package pc;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class n extends c implements vc.c {

    /* renamed from: m, reason: collision with root package name */
    public final boolean f5678m;

    public n(int i10, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f5678m = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return e().equals(nVar.e()) && this.f5667j.equals(nVar.f5667j) && this.f5668k.equals(nVar.f5668k) && j.a(this.f5665h, nVar.f5665h);
        }
        if (obj instanceof vc.c) {
            return obj.equals(f());
        }
        return false;
    }

    public final vc.a f() {
        if (this.f5678m) {
            return this;
        }
        vc.a aVar = this.f5664g;
        if (aVar != null) {
            return aVar;
        }
        vc.a a6 = a();
        this.f5664g = a6;
        return a6;
    }

    public final int hashCode() {
        return this.f5668k.hashCode() + ((this.f5667j.hashCode() + (e().hashCode() * 31)) * 31);
    }

    public final String toString() {
        vc.a f10 = f();
        if (f10 != this) {
            return f10.toString();
        }
        return "property " + this.f5667j + " (Kotlin reflection is not available)";
    }
}
