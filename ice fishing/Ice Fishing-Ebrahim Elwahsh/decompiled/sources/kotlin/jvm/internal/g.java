package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public abstract class g extends b implements f, K7.e {

    /* renamed from: n, reason: collision with root package name */
    public final int f38855n;

    /* renamed from: u, reason: collision with root package name */
    public final int f38856u;

    public g(int i, Class cls, String str, String str2, int i4) {
        this(i, b.NO_RECEIVER, cls, str, str2, i4);
    }

    @Override // kotlin.jvm.internal.b
    public final K7.b computeReflected() {
        s.f38862a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return getName().equals(gVar.getName()) && getSignature().equals(gVar.getSignature()) && this.f38856u == gVar.f38856u && this.f38855n == gVar.f38855n && h.a(getBoundReceiver(), gVar.getBoundReceiver()) && h.a(getOwner(), gVar.getOwner());
        }
        if (obj instanceof K7.e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.f
    public final int getArity() {
        return this.f38855n;
    }

    @Override // kotlin.jvm.internal.b
    public final K7.b getReflected() {
        return (K7.e) super.getReflected();
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // kotlin.jvm.internal.b, K7.b
    public final boolean isSuspend() {
        return ((g) ((K7.e) super.getReflected())).isSuspend();
    }

    public final String toString() {
        K7.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public g(int i, Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, (i4 & 1) == 1);
        this.f38855n = i;
        this.f38856u = 0;
    }
}
