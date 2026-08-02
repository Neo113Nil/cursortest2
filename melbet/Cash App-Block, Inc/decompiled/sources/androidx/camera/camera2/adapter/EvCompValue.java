package androidx.camera.camera2.adapter;

import android.util.Range;
import android.util.Rational;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class EvCompValue {
    public final int index;
    public final Range range;
    public final Rational step;
    public final boolean supported;

    public EvCompValue(boolean z, int i, Range range, Rational rational) {
        range.getClass();
        rational.getClass();
        this.supported = z;
        this.index = i;
        this.range = range;
        this.step = rational;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EvCompValue)) {
            return false;
        }
        EvCompValue evCompValue = (EvCompValue) obj;
        return this.supported == evCompValue.supported && this.index == evCompValue.index && Intrinsics.areEqual(this.range, evCompValue.range) && Intrinsics.areEqual(this.step, evCompValue.step);
    }

    public final int hashCode() {
        return this.step.hashCode() + ((this.range.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.index, Boolean.hashCode(this.supported) * 31, 31)) * 31);
    }

    public final String toString() {
        return "EvCompValue(supported=" + this.supported + ", index=" + this.index + ", range=" + this.range + ", step=" + this.step + ')';
    }
}
