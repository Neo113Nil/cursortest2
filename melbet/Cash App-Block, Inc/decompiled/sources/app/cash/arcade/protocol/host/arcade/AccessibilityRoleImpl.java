package app.cash.arcade.protocol.host.arcade;

import androidx.work.Worker$$ExternalSyntheticLambda1;
import app.cash.arcade.values.AccessibilityRoleType;
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
public final class AccessibilityRoleImpl implements Modifier.UnscopedElement {
    public final AccessibilityRoleType role;
    public static final Companion Companion = new Companion();
    public static final Lazy[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Worker$$ExternalSyntheticLambda1(6))};

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/protocol/host/arcade/AccessibilityRoleImpl$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/protocol/host/arcade/AccessibilityRoleImpl;", "serializer", "()Lkotlinx/serialization/KSerializer;", "widget-protocol"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return AccessibilityRoleImpl$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AccessibilityRoleImpl(int i, AccessibilityRoleType accessibilityRoleType) {
        if (1 == (i & 1)) {
            this.role = accessibilityRoleType;
        } else {
            TuplesKt.throwMissingFieldException(i, 1, AccessibilityRoleImpl$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AccessibilityRoleImpl) && ((AccessibilityRoleImpl) obj).role == this.role;
    }

    public final int hashCode() {
        return this.role.hashCode() + 527;
    }

    public final String toString() {
        return "AccessibilityRole(role=" + this.role + ")";
    }
}
