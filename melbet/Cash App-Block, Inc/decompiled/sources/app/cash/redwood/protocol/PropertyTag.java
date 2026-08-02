package app.cash.redwood.protocol;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

@JvmInline
@Serializable
/* loaded from: classes3.dex */
public final class PropertyTag {
    public static final Companion Companion = new Companion();
    public final int value;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/redwood/protocol/PropertyTag$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/redwood/protocol/PropertyTag;", "serializer", "()Lkotlinx/serialization/KSerializer;", "redwood-protocol"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return PropertyTag$$serializer.INSTANCE;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PropertyTag) {
            return this.value == ((PropertyTag) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.value, "PropertyTag(value=", ")");
    }
}
