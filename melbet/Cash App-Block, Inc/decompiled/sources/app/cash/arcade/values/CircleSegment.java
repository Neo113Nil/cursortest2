package app.cash.arcade.values;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes3.dex */
public final class CircleSegment {
    public final long amount;
    public final Color color;
    public static final Companion Companion = new Companion();
    public static final Lazy[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Font$$ExternalSyntheticLambda0(13))};

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/CircleSegment$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/CircleSegment;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return CircleSegment$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CircleSegment(int i, long j, Color color) {
        if (3 != (i & 3)) {
            TuplesKt.throwMissingFieldException(i, 3, CircleSegment$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.amount = j;
        this.color = color;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CircleSegment)) {
            return false;
        }
        CircleSegment circleSegment = (CircleSegment) obj;
        return this.amount == circleSegment.amount && Intrinsics.areEqual(this.color, circleSegment.color);
    }

    public final int hashCode() {
        return this.color.hashCode() + (Long.hashCode(this.amount) * 31);
    }

    public final String toString() {
        return "CircleSegment(amount=" + this.amount + ", color=" + this.color + ")";
    }
}
