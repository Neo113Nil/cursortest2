package kotlin.jvm.internal;

import defpackage.jl40;
import defpackage.kfx;
import defpackage.lms;
import defpackage.qoi0;
import defpackage.tfx;

/* loaded from: classes9.dex */
public abstract class FunctionReference extends CallableReference implements lms, tfx {
    private final int arity;

    public FunctionReference(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.CallableReference
    public kfx computeReflected() {
        qoi0.a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            return getName().equals(functionReference.getName()) && getSignature().equals(functionReference.getSignature()) && jl40.l(getBoundReceiver(), functionReference.getBoundReceiver()) && jl40.l(getOwner(), functionReference.getOwner());
        }
        if (obj instanceof tfx) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // defpackage.lms
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.jvm.internal.CallableReference
    public tfx getReflected() {
        return (tfx) super.getReflected();
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // defpackage.tfx
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // defpackage.tfx
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // defpackage.tfx
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // defpackage.tfx
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.CallableReference, defpackage.kfx
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        kfx compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
