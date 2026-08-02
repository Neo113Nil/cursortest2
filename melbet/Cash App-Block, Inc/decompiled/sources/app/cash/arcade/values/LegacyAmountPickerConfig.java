package app.cash.arcade.values;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes3.dex */
public interface LegacyAmountPickerConfig {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/LegacyAmountPickerConfig$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/LegacyAmountPickerConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public final KSerializer serializer() {
            ReflectionFactory reflectionFactory = Reflection.factory;
            return new SealedClassSerializer("app.cash.arcade.values.LegacyAmountPickerConfig", reflectionFactory.getOrCreateKotlinClass(LegacyAmountPickerConfig.class), new KClass[]{reflectionFactory.getOrCreateKotlinClass(CurrencyInput.class), reflectionFactory.getOrCreateKotlinClass(PercentInput.class)}, new KSerializer[]{LegacyAmountPickerConfig$CurrencyInput$$serializer.INSTANCE, new EnumSerializer("PercentInput", PercentInput.INSTANCE, new Annotation[0])}, new Annotation[0]);
        }
    }

    @SerialName("CurrencyInput")
    @Serializable
    public final class CurrencyInput implements LegacyAmountPickerConfig {
        public static final Lazy[] $childSerializers;
        public static final Companion Companion = new Companion();
        public final LegacyAmountContentLabelBuilder contentLabelBuilder;
        public final String initialRawAmount;
        public final int maxDisplayWholeDigits;
        public final int maxEmptyZeroCount;
        public final String prefix;
        public final LegacyAmountInputSuffixBuilder suffixBuilder;
        public final int totalFractionalDigitCount;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/LegacyAmountPickerConfig$CurrencyInput$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/LegacyAmountPickerConfig$CurrencyInput;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return LegacyAmountPickerConfig$CurrencyInput$$serializer.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Font$$ExternalSyntheticLambda0(27)), null, null, null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Font$$ExternalSyntheticLambda0(28)), null};
        }

        public /* synthetic */ CurrencyInput(int i, String str, LegacyAmountInputSuffixBuilder legacyAmountInputSuffixBuilder, int i2, int i3, int i4, LegacyAmountContentLabelBuilder legacyAmountContentLabelBuilder, String str2) {
            if (63 != (i & 63)) {
                TuplesKt.throwMissingFieldException(i, 63, LegacyAmountPickerConfig$CurrencyInput$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.prefix = str;
            this.suffixBuilder = legacyAmountInputSuffixBuilder;
            this.totalFractionalDigitCount = i2;
            this.maxDisplayWholeDigits = i3;
            this.maxEmptyZeroCount = i4;
            this.contentLabelBuilder = legacyAmountContentLabelBuilder;
            if ((i & 64) == 0) {
                this.initialRawAmount = null;
            } else {
                this.initialRawAmount = str2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CurrencyInput)) {
                return false;
            }
            CurrencyInput currencyInput = (CurrencyInput) obj;
            return Intrinsics.areEqual(this.prefix, currencyInput.prefix) && Intrinsics.areEqual(this.suffixBuilder, currencyInput.suffixBuilder) && this.totalFractionalDigitCount == currencyInput.totalFractionalDigitCount && this.maxDisplayWholeDigits == currencyInput.maxDisplayWholeDigits && this.maxEmptyZeroCount == currencyInput.maxEmptyZeroCount && Intrinsics.areEqual(this.contentLabelBuilder, currencyInput.contentLabelBuilder) && Intrinsics.areEqual(this.initialRawAmount, currencyInput.initialRawAmount);
        }

        public final int hashCode() {
            int hashCode = (this.contentLabelBuilder.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.maxEmptyZeroCount, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.maxDisplayWholeDigits, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.totalFractionalDigitCount, (this.suffixBuilder.hashCode() + (this.prefix.hashCode() * 31)) * 31, 31), 31), 31)) * 31;
            String str = this.initialRawAmount;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CurrencyInput(prefix=");
            sb.append(this.prefix);
            sb.append(", suffixBuilder=");
            sb.append(this.suffixBuilder);
            sb.append(", totalFractionalDigitCount=");
            Recorder$$ExternalSyntheticOutline1.m105m(this.totalFractionalDigitCount, this.maxDisplayWholeDigits, ", maxDisplayWholeDigits=", ", maxEmptyZeroCount=", sb);
            sb.append(this.maxEmptyZeroCount);
            sb.append(", contentLabelBuilder=");
            sb.append(this.contentLabelBuilder);
            sb.append(", initialRawAmount=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.initialRawAmount, ")");
        }
    }

    @SerialName("PercentInput")
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/LegacyAmountPickerConfig$PercentInput", "Lapp/cash/arcade/values/LegacyAmountPickerConfig;", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/LegacyAmountPickerConfig$PercentInput;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @Serializable
    public final /* data */ class PercentInput implements LegacyAmountPickerConfig {
        public static final PercentInput INSTANCE = new PercentInput();
        public static final /* synthetic */ Lazy $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Font$$ExternalSyntheticLambda0(29));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PercentInput);
        }

        public final int hashCode() {
            return 2018285574;
        }

        public final KSerializer serializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final String toString() {
            return "PercentInput";
        }
    }
}
