package app.cash.arcade.protocol.host.arcade;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.work.Worker$$ExternalSyntheticLambda1;
import app.cash.redwood.Modifier;
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
public final class AccessibilityActionImpl implements Modifier.UnscopedElement {
    public static final Lazy[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final String callbackTag;
    public final String label;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/protocol/host/arcade/AccessibilityActionImpl$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/protocol/host/arcade/AccessibilityActionImpl;", "serializer", "()Lkotlinx/serialization/KSerializer;", "widget-protocol"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return AccessibilityActionImpl$$serializer.INSTANCE;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Worker$$ExternalSyntheticLambda1(2)), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Worker$$ExternalSyntheticLambda1(3))};
    }

    public /* synthetic */ AccessibilityActionImpl(int i, String str, String str2) {
        if (3 != (i & 3)) {
            TuplesKt.throwMissingFieldException(i, 3, AccessibilityActionImpl$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.label = str;
        this.callbackTag = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AccessibilityActionImpl)) {
            return false;
        }
        AccessibilityActionImpl accessibilityActionImpl = (AccessibilityActionImpl) obj;
        return Intrinsics.areEqual(accessibilityActionImpl.label, this.label) && Intrinsics.areEqual(accessibilityActionImpl.callbackTag, this.callbackTag);
    }

    public final int hashCode() {
        return this.callbackTag.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(527, 31, this.label);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("AccessibilityAction(label=", this.label, ", callbackTag=", this.callbackTag, ")");
    }
}
