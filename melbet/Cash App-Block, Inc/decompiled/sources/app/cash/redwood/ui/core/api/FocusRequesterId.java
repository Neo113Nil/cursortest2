package app.cash.redwood.ui.core.api;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes3.dex */
public final class FocusRequesterId implements FocusRequester {
    public static final Companion Companion = new Companion();
    public final int id;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/redwood/ui/core/api/FocusRequesterId$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/redwood/ui/core/api/FocusRequesterId;", "serializer", "()Lkotlinx/serialization/KSerializer;", "redwood-ui-core-api"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return FocusRequesterId$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FocusRequesterId(int i, int i2) {
        if (1 == (i & 1)) {
            this.id = i2;
        } else {
            TuplesKt.throwMissingFieldException(i, 1, FocusRequesterId$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterId) && this.id == ((FocusRequesterId) obj).id;
    }

    public final int hashCode() {
        return Integer.hashCode(this.id);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id, "FocusRequesterId(id=", ")");
    }

    public FocusRequesterId(int i) {
        this.id = i;
    }
}
