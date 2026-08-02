package app.cash.arcade.values;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes3.dex */
public final class BooleanState {
    public static final Companion Companion = new Companion();
    public final long userEditCount;
    public final boolean value;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/BooleanState$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/BooleanState;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return BooleanState$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BooleanState(long j, int i, boolean z) {
        if (1 != (i & 1)) {
            TuplesKt.throwMissingFieldException(i, 1, BooleanState$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.value = z;
        if ((i & 2) == 0) {
            this.userEditCount = 0L;
        } else {
            this.userEditCount = j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BooleanState)) {
            return false;
        }
        BooleanState booleanState = (BooleanState) obj;
        return this.value == booleanState.value && this.userEditCount == booleanState.userEditCount;
    }

    public final int hashCode() {
        return Long.hashCode(this.userEditCount) + (Boolean.hashCode(this.value) * 31);
    }

    public final String toString() {
        return "BooleanState(value=" + this.value + ", userEditCount=" + this.userEditCount + ")";
    }

    public BooleanState(boolean z, long j) {
        this.value = z;
        this.userEditCount = j;
    }

    public /* synthetic */ BooleanState() {
        this(false, 0L);
    }
}
