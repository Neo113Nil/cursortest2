package kotlin.jvm.internal;

import A1.C0021w;
import x1.InterfaceC1067b;

/* loaded from: classes.dex */
public abstract class g extends b implements f, x1.e {
    private final int arity;
    private final int flags;

    public g(int i2, Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.arity = i2;
        this.flags = 0;
    }

    @Override // kotlin.jvm.internal.b
    public InterfaceC1067b computeReflected() {
        q.f8077a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return getName().equals(gVar.getName()) && getSignature().equals(gVar.getSignature()) && this.flags == gVar.flags && this.arity == gVar.arity && i.a(getBoundReceiver(), gVar.getBoundReceiver()) && i.a(getOwner(), gVar.getOwner());
        }
        if (obj instanceof x1.e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.f
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // x1.e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // x1.e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // x1.e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // x1.e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // x1.e
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC1067b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.b
    public x1.e getReflected() {
        InterfaceC1067b compute = compute();
        if (compute != this) {
            return (x1.e) compute;
        }
        throw new C0021w("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
