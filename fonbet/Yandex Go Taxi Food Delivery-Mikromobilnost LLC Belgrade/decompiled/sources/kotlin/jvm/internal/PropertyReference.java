package kotlin.jvm.internal;

import defpackage.jl40;
import defpackage.kfx;
import defpackage.kgx;
import defpackage.w511;

/* loaded from: classes9.dex */
public abstract class PropertyReference extends CallableReference implements kgx {
    private final boolean syntheticJavaProperty;

    public PropertyReference(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.syntheticJavaProperty = (i & 2) == 2;
    }

    @Override // kotlin.jvm.internal.CallableReference
    public kfx compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PropertyReference) {
            PropertyReference propertyReference = (PropertyReference) obj;
            return getOwner().equals(propertyReference.getOwner()) && getName().equals(propertyReference.getName()) && getSignature().equals(propertyReference.getSignature()) && jl40.l(getBoundReceiver(), propertyReference.getBoundReceiver());
        }
        if (obj instanceof kgx) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.CallableReference
    public kgx getReflected() {
        if (!this.syntheticJavaProperty) {
            return (kgx) super.getReflected();
        }
        w511.x("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        return null;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // defpackage.kgx
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // defpackage.kgx
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        kfx compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public PropertyReference() {
        this.syntheticJavaProperty = false;
    }
}
