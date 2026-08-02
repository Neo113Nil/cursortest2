package app.cash.arcade.values;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes3.dex */
public final class AttributedString {
    public final List attributeRanges;
    public final String text;
    public static final Companion Companion = new Companion();
    public static final Lazy[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Font$$ExternalSyntheticLambda0(5))};

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/AttributedString$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/AttributedString;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return AttributedString$$serializer.INSTANCE;
        }
    }

    public AttributedString(String str, List list, int i) {
        if (1 != (i & 1)) {
            TuplesKt.throwMissingFieldException(i, 1, AttributedString$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.text = str;
        if ((i & 2) == 0) {
            this.attributeRanges = EmptyList.INSTANCE;
        } else {
            this.attributeRanges = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttributedString)) {
            return false;
        }
        AttributedString attributedString = (AttributedString) obj;
        return Intrinsics.areEqual(this.text, attributedString.text) && Intrinsics.areEqual(this.attributeRanges, attributedString.attributeRanges);
    }

    public final int hashCode() {
        return this.attributeRanges.hashCode() + (this.text.hashCode() * 31);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("AttributedString(text=", this.text, ", attributeRanges=", ")", this.attributeRanges);
    }

    public AttributedString(String str, ArrayList arrayList) {
        str.getClass();
        this.text = str;
        this.attributeRanges = arrayList;
    }
}
