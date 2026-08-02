package app.cash.arcade.protocol.host.arcade;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.work.Worker$$ExternalSyntheticLambda1;
import app.cash.redwood.Modifier;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes3.dex */
public final class AccessibilityEnabledImpl implements Modifier.UnscopedElement {
    public final boolean isEnabled;
    public static final Companion Companion = new Companion();
    public static final Lazy[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Worker$$ExternalSyntheticLambda1(4))};

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/protocol/host/arcade/AccessibilityEnabledImpl$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/protocol/host/arcade/AccessibilityEnabledImpl;", "serializer", "()Lkotlinx/serialization/KSerializer;", "widget-protocol"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return AccessibilityEnabledImpl$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AccessibilityEnabledImpl(int i, boolean z) {
        if (1 == (i & 1)) {
            this.isEnabled = z;
        } else {
            TuplesKt.throwMissingFieldException(i, 1, AccessibilityEnabledImpl$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AccessibilityEnabledImpl) && ((AccessibilityEnabledImpl) obj).isEnabled == this.isEnabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isEnabled) + 527;
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("AccessibilityEnabled(isEnabled=", ")", this.isEnabled);
    }
}
