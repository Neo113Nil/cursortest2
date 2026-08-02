package app.cash.arcade.values;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes3.dex */
public interface LegacyAmountContentLabelBuilder {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/LegacyAmountContentLabelBuilder$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/LegacyAmountContentLabelBuilder;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public final KSerializer serializer() {
            ReflectionFactory reflectionFactory = Reflection.factory;
            return new SealedClassSerializer("app.cash.arcade.values.LegacyAmountContentLabelBuilder", reflectionFactory.getOrCreateKotlinClass(LegacyAmountContentLabelBuilder.class), new KClass[]{reflectionFactory.getOrCreateKotlinClass(NumberOrDigitContentLabelBuilder.class), reflectionFactory.getOrCreateKotlinClass(SuperContentLabelBuilder.class)}, new KSerializer[]{LegacyAmountContentLabelBuilder$NumberOrDigitContentLabelBuilder$$serializer.INSTANCE, LegacyAmountContentLabelBuilder$SuperContentLabelBuilder$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    @SerialName("NumberOrDigitContentLabelBuilder")
    @Serializable
    public final class NumberOrDigitContentLabelBuilder implements LegacyAmountContentLabelBuilder {
        public static final Companion Companion = new Companion();
        public final String suffix;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/LegacyAmountContentLabelBuilder$NumberOrDigitContentLabelBuilder$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/LegacyAmountContentLabelBuilder$NumberOrDigitContentLabelBuilder;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return LegacyAmountContentLabelBuilder$NumberOrDigitContentLabelBuilder$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ NumberOrDigitContentLabelBuilder(int i, String str) {
            if (1 == (i & 1)) {
                this.suffix = str;
            } else {
                TuplesKt.throwMissingFieldException(i, 1, LegacyAmountContentLabelBuilder$NumberOrDigitContentLabelBuilder$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NumberOrDigitContentLabelBuilder) && Intrinsics.areEqual(this.suffix, ((NumberOrDigitContentLabelBuilder) obj).suffix);
        }

        public final int hashCode() {
            return this.suffix.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NumberOrDigitContentLabelBuilder(suffix=", this.suffix, ")");
        }
    }

    @SerialName("SuperContentLabelBuilder")
    @Serializable
    public final class SuperContentLabelBuilder implements LegacyAmountContentLabelBuilder {
        public static final Companion Companion = new Companion();
        public final String suffix;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/LegacyAmountContentLabelBuilder$SuperContentLabelBuilder$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/LegacyAmountContentLabelBuilder$SuperContentLabelBuilder;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return LegacyAmountContentLabelBuilder$SuperContentLabelBuilder$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ SuperContentLabelBuilder(int i, String str) {
            if (1 == (i & 1)) {
                this.suffix = str;
            } else {
                TuplesKt.throwMissingFieldException(i, 1, LegacyAmountContentLabelBuilder$SuperContentLabelBuilder$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SuperContentLabelBuilder) && Intrinsics.areEqual(this.suffix, ((SuperContentLabelBuilder) obj).suffix);
        }

        public final int hashCode() {
            return this.suffix.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SuperContentLabelBuilder(suffix=", this.suffix, ")");
        }
    }
}
