package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public abstract class o extends b implements K7.l {
    private final boolean syntheticJavaProperty;

    public o(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.syntheticJavaProperty = false;
    }

    @Override // kotlin.jvm.internal.b
    public K7.b compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return getOwner().equals(oVar.getOwner()) && getName().equals(oVar.getName()) && getSignature().equals(oVar.getSignature()) && h.a(getBoundReceiver(), oVar.getBoundReceiver());
        }
        if (obj instanceof K7.l) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // K7.l
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // K7.l
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        K7.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.b
    public K7.l getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (K7.l) super.getReflected();
    }
}
