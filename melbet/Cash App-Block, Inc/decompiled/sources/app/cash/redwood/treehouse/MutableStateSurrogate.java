package app.cash.redwood.treehouse;

import bo.app.b$$ExternalSyntheticLambda3;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@SerialName("MutableState")
@Serializable
/* loaded from: classes3.dex */
public final class MutableStateSurrogate {
    public final Object value;
    public static final Companion Companion = new Companion();
    public static final Lazy[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new b$$ExternalSyntheticLambda3(8))};

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/redwood/treehouse/MutableStateSurrogate$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/redwood/treehouse/MutableStateSurrogate;", "serializer", "()Lkotlinx/serialization/KSerializer;", "redwood-treehouse_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return MutableStateSurrogate$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MutableStateSurrogate(int i, Object obj) {
        if (1 == (i & 1)) {
            this.value = obj;
        } else {
            TuplesKt.throwMissingFieldException(i, 1, MutableStateSurrogate$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public MutableStateSurrogate(Object obj) {
        this.value = obj;
    }
}
