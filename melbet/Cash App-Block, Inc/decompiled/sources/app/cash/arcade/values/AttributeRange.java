package app.cash.arcade.values;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
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
public final class AttributeRange {
    public final Attribute attribute;
    public final int beginIndexInclusive;
    public final int endIndexExclusive;
    public static final Companion Companion = new Companion();
    public static final Lazy[] $childSerializers = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Font$$ExternalSyntheticLambda0(4))};

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/AttributeRange$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/AttributeRange;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return AttributeRange$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AttributeRange(int i, int i2, int i3, Attribute attribute) {
        if (7 != (i & 7)) {
            TuplesKt.throwMissingFieldException(i, 7, AttributeRange$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.beginIndexInclusive = i2;
        this.endIndexExclusive = i3;
        this.attribute = attribute;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttributeRange)) {
            return false;
        }
        AttributeRange attributeRange = (AttributeRange) obj;
        return this.beginIndexInclusive == attributeRange.beginIndexInclusive && this.endIndexExclusive == attributeRange.endIndexExclusive && Intrinsics.areEqual(this.attribute, attributeRange.attribute);
    }

    public final int hashCode() {
        return this.attribute.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.endIndexExclusive, Integer.hashCode(this.beginIndexInclusive) * 31, 31);
    }

    public final String toString() {
        StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(this.beginIndexInclusive, this.endIndexExclusive, "AttributeRange(beginIndexInclusive=", ", endIndexExclusive=", ", attribute=");
        m107m.append(this.attribute);
        m107m.append(")");
        return m107m.toString();
    }

    public AttributeRange(int i, int i2, Attribute attribute) {
        attribute.getClass();
        this.beginIndexInclusive = i;
        this.endIndexExclusive = i2;
        this.attribute = attribute;
    }
}
