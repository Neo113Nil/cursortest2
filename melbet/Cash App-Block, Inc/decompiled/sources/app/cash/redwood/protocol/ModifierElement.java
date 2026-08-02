package app.cash.redwood.protocol;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;

@Serializable(with = ModifierElementSerializer.class)
/* loaded from: classes3.dex */
public final class ModifierElement {
    public static final Companion Companion = new Companion();
    public final int tag;
    public final JsonElement value;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/redwood/protocol/ModifierElement$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/redwood/protocol/ModifierElement;", "serializer", "()Lkotlinx/serialization/KSerializer;", "redwood-protocol"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return ModifierElementSerializer.INSTANCE;
        }
    }

    public ModifierElement(int i, JsonElement jsonElement) {
        jsonElement.getClass();
        this.tag = i;
        this.value = jsonElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModifierElement)) {
            return false;
        }
        ModifierElement modifierElement = (ModifierElement) obj;
        return this.tag == modifierElement.tag && Intrinsics.areEqual(this.value, modifierElement.value);
    }

    public final int hashCode() {
        return this.value.hashCode() + (Integer.hashCode(this.tag) * 31);
    }

    public final String toString() {
        return "ModifierElement(tag=" + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.tag, "ModifierTag(value=", ")") + ", value=" + this.value + ")";
    }
}
