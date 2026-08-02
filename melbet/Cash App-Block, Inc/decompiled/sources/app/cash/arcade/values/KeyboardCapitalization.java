package app.cash.arcade.values;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes3.dex */
public final class KeyboardCapitalization {
    public final String id;
    public static final Companion Companion = new Companion();
    public static final KeyboardCapitalization None = new KeyboardCapitalization("None");
    public static final KeyboardCapitalization Characters = new KeyboardCapitalization("Characters");
    public static final KeyboardCapitalization Words = new KeyboardCapitalization("Words");
    public static final KeyboardCapitalization Sentences = new KeyboardCapitalization("Sentences");

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/KeyboardCapitalization$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/KeyboardCapitalization;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return KeyboardCapitalization$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ KeyboardCapitalization(int i, String str) {
        if (1 == (i & 1)) {
            this.id = str;
        } else {
            TuplesKt.throwMissingFieldException(i, 1, KeyboardCapitalization$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KeyboardCapitalization) && Intrinsics.areEqual(this.id, ((KeyboardCapitalization) obj).id);
    }

    public final int hashCode() {
        return this.id.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("KeyboardCapitalization(id=", this.id, ")");
    }

    public KeyboardCapitalization(String str) {
        this.id = str;
    }
}
