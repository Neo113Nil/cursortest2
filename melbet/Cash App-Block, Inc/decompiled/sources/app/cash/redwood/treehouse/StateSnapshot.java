package app.cash.redwood.treehouse;

import bo.app.b$$ExternalSyntheticLambda3;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes3.dex */
public final class StateSnapshot {
    public final Map content;
    public static final Companion Companion = new Companion();
    public static final Lazy[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new b$$ExternalSyntheticLambda3(9))};

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/redwood/treehouse/StateSnapshot$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/redwood/treehouse/StateSnapshot;", "serializer", "()Lkotlinx/serialization/KSerializer;", "redwood-treehouse_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return StateSnapshot$$serializer.INSTANCE;
        }
    }

    @JvmInline
    @Serializable
    public final class Id {
        public static final Companion Companion = new Companion();
        public final String value;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/redwood/treehouse/StateSnapshot$Id$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/redwood/treehouse/StateSnapshot$Id;", "serializer", "()Lkotlinx/serialization/KSerializer;", "redwood-treehouse_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return StateSnapshot$Id$$serializer.INSTANCE;
            }
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Id) {
                return Intrinsics.areEqual(this.value, ((Id) obj).value);
            }
            return false;
        }

        public final int hashCode() {
            String str = this.value;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Id(value=", this.value, ")");
        }
    }

    public /* synthetic */ StateSnapshot(int i, Map map) {
        if (1 == (i & 1)) {
            this.content = map;
        } else {
            TuplesKt.throwMissingFieldException(i, 1, StateSnapshot$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }
}
