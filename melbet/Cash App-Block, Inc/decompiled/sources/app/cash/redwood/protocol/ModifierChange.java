package app.cash.redwood.protocol;

import bo.app.b$$ExternalSyntheticLambda3;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@SerialName("modifier")
@Serializable
/* loaded from: classes3.dex */
public final class ModifierChange implements Change {
    public final int _id;
    public final List elements;
    public static final Companion Companion = new Companion();
    public static final Lazy[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new b$$ExternalSyntheticLambda3(6))};

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/redwood/protocol/ModifierChange$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/redwood/protocol/ModifierChange;", "serializer", "()Lkotlinx/serialization/KSerializer;", "redwood-protocol"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return ModifierChange$$serializer.INSTANCE;
        }
    }

    public ModifierChange(int i, int i2, List list) {
        if (1 != (i & 1)) {
            TuplesKt.throwMissingFieldException(i, 1, ModifierChange$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this._id = i2;
        if ((i & 2) == 0) {
            this.elements = EmptyList.INSTANCE;
        } else {
            this.elements = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModifierChange)) {
            return false;
        }
        ModifierChange modifierChange = (ModifierChange) obj;
        return this._id == modifierChange._id && Intrinsics.areEqual(this.elements, modifierChange.elements);
    }

    @Override // app.cash.redwood.protocol.Change
    /* renamed from: getId-0HhLjSo */
    public final int mo1368getId0HhLjSo() {
        throw null;
    }

    public final int hashCode() {
        return this.elements.hashCode() + (this._id * 31);
    }

    public final String toString() {
        return "ModifierChange(_id=" + this._id + ", elements=" + this.elements + ")";
    }
}
