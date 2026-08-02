package app.cash.zipline.internal.bridge;

import bo.app.b$$ExternalSyntheticLambda3;
import java.util.List;
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
public final class ThrowableSurrogate {
    public final String stacktraceString;
    public final List types;
    public static final Companion Companion = new Companion();
    public static final Lazy[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new b$$ExternalSyntheticLambda3(17)), null};

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/zipline/internal/bridge/ThrowableSurrogate$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/zipline/internal/bridge/ThrowableSurrogate;", "serializer", "()Lkotlinx/serialization/KSerializer;", "zipline_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return ThrowableSurrogate$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ThrowableSurrogate(String str, List list, int i) {
        if (3 != (i & 3)) {
            TuplesKt.throwMissingFieldException(i, 3, ThrowableSurrogate$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.types = list;
        this.stacktraceString = str;
    }

    public ThrowableSurrogate(List list, String str) {
        list.getClass();
        str.getClass();
        this.types = list;
        this.stacktraceString = str;
    }
}
