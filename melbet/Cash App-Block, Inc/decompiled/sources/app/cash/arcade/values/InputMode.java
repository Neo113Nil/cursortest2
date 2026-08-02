package app.cash.arcade.values;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes3.dex */
public abstract class InputMode {
    public static final Companion Companion = new Companion();
    public static final Lazy $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Font$$ExternalSyntheticLambda0(23));

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/InputMode$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/InputMode;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return (KSerializer) InputMode.$cachedSerializer$delegate.getValue();
        }
    }

    @SerialName("Id")
    @Serializable
    public final class Id extends InputMode {
        public static final Companion Companion = new Companion();
        public final int id;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/InputMode$Id$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/InputMode$Id;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return InputMode$Id$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Id(int i, int i2) {
            if (1 == (i & 1)) {
                this.id = i2;
            } else {
                TuplesKt.throwMissingFieldException(i, 1, InputMode$Id$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Id) && this.id == ((Id) obj).id;
        }

        public final int hashCode() {
            return Integer.hashCode(this.id);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id, "Id(id=", ")");
        }

        public Id() {
            this.id = 305006;
        }
    }
}
