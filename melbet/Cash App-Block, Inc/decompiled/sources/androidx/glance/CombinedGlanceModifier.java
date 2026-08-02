package androidx.glance;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class CombinedGlanceModifier implements GlanceModifier {
    public final GlanceModifier inner;
    public final GlanceModifier outer;

    public CombinedGlanceModifier(GlanceModifier glanceModifier, GlanceModifier glanceModifier2) {
        this.outer = glanceModifier;
        this.inner = glanceModifier2;
    }

    @Override // androidx.glance.GlanceModifier
    public final boolean all() {
        return this.outer.all() && this.inner.all();
    }

    @Override // androidx.glance.GlanceModifier
    public final boolean any(Function1 function1) {
        return this.outer.any(function1) || this.inner.any(function1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CombinedGlanceModifier)) {
            return false;
        }
        CombinedGlanceModifier combinedGlanceModifier = (CombinedGlanceModifier) obj;
        return this.outer.equals(combinedGlanceModifier.outer) && Intrinsics.areEqual(this.inner, combinedGlanceModifier.inner);
    }

    @Override // androidx.glance.GlanceModifier
    public final Object foldIn(Object obj, Function2 function2) {
        return this.inner.foldIn(this.outer.foldIn(obj, function2), function2);
    }

    public final int hashCode() {
        return (this.inner.hashCode() * 31) + this.outer.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("["), (String) foldIn("", ImageKt$Image$2$1.INSTANCE$1), ']');
    }
}
