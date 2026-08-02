package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a;

/* loaded from: classes5.dex */
public abstract class bym extends a implements s9f {
    public final boolean a;

    public bym(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.a = (i & 2) == 2;
    }

    @Override // kotlin.jvm.internal.a
    public final e9f compute() {
        return this.a ? this : super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bym) {
            bym bymVar = (bym) obj;
            return getOwner().equals(bymVar.getOwner()) && getName().equals(bymVar.getName()) && getSignature().equals(bymVar.getSignature()) && Intrinsics.d(getBoundReceiver(), bymVar.getBoundReceiver());
        }
        if (obj instanceof s9f) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.a
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final s9f getReflected() {
        if (!this.a) {
            return (s9f) super.getReflected();
        }
        qq6.d("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        return null;
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public final String toString() {
        e9f compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public bym() {
        this.a = false;
    }
}
