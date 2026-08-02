package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a;

/* loaded from: classes5.dex */
public abstract class dzc extends a implements bzc, h9f {
    private final int arity;
    private final int flags;

    public dzc(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = 0;
    }

    @Override // kotlin.jvm.internal.a
    public e9f computeReflected() {
        ern.a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzc) {
            dzc dzcVar = (dzc) obj;
            return getName().equals(dzcVar.getName()) && getSignature().equals(dzcVar.getSignature()) && this.flags == dzcVar.flags && this.arity == dzcVar.arity && Intrinsics.d(getBoundReceiver(), dzcVar.getBoundReceiver()) && Intrinsics.d(getOwner(), dzcVar.getOwner());
        }
        if (obj instanceof h9f) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // defpackage.bzc
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.jvm.internal.a
    public h9f getReflected() {
        return (h9f) super.getReflected();
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // defpackage.h9f
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // defpackage.h9f
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // defpackage.h9f
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // defpackage.h9f
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // defpackage.h9f
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        e9f compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
