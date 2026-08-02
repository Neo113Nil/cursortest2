package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public abstract class g extends b implements f, O7.e {

    /* renamed from: n, reason: collision with root package name */
    public final int f38638n;

    /* renamed from: u, reason: collision with root package name */
    public final int f38639u;

    public g(int i, Class cls, String str, String str2, int i4) {
        this(i, b.NO_RECEIVER, cls, str, str2, i4);
    }

    @Override // kotlin.jvm.internal.b
    public final O7.b computeReflected() {
        s.f38645a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return getName().equals(gVar.getName()) && getSignature().equals(gVar.getSignature()) && this.f38639u == gVar.f38639u && this.f38638n == gVar.f38638n && h.a(getBoundReceiver(), gVar.getBoundReceiver()) && h.a(getOwner(), gVar.getOwner());
        }
        if (obj instanceof O7.e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.f
    public final int getArity() {
        return this.f38638n;
    }

    @Override // kotlin.jvm.internal.b
    public final O7.b getReflected() {
        return (O7.e) super.getReflected();
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // kotlin.jvm.internal.b, O7.b
    public final boolean isSuspend() {
        return ((g) ((O7.e) super.getReflected())).isSuspend();
    }

    public final String toString() {
        O7.b compute = compute();
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
        this.f38638n = i;
        this.f38639u = 0;
    }
}
