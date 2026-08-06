package kotlin.jvm.internal;

import A1.C0021w;
import x1.InterfaceC1067b;

/* loaded from: classes.dex */
public abstract class m extends b implements x1.g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8073a;

    public m(Object obj, Class cls, String str, String str2) {
        super(obj, cls, str, str2, true);
        this.f8073a = false;
    }

    @Override // kotlin.jvm.internal.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final x1.g getReflected() {
        if (this.f8073a) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        InterfaceC1067b compute = compute();
        if (compute != this) {
            return (x1.g) compute;
        }
        throw new C0021w("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    @Override // kotlin.jvm.internal.b
    public final InterfaceC1067b compute() {
        return this.f8073a ? this : super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return getOwner().equals(mVar.getOwner()) && getName().equals(mVar.getName()) && getSignature().equals(mVar.getSignature()) && i.a(getBoundReceiver(), mVar.getBoundReceiver());
        }
        if (obj instanceof x1.g) {
            return obj.equals(compute());
        }
        return false;
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public final String toString() {
        InterfaceC1067b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
