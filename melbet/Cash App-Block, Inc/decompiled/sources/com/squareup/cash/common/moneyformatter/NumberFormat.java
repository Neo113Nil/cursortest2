package com.squareup.cash.common.moneyformatter;

import com.squareup.cash.common.moneyformatter.DenominationOption;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
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
/* loaded from: classes.dex */
public abstract class NumberFormat {
    public static final Companion Companion = new Companion();
    public static final Lazy $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) Full.AnonymousClass1.INSTANCE$3);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/common/moneyformatter/NumberFormat$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/common/moneyformatter/NumberFormat;", "serializer", "()Lkotlinx/serialization/KSerializer;", "money-formatter-config_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return (KSerializer) NumberFormat.$cachedSerializer$delegate.getValue();
        }
    }

    @SerialName("Full")
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/common/moneyformatter/NumberFormat$Full", "Lcom/squareup/cash/common/moneyformatter/NumberFormat;", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/common/moneyformatter/NumberFormat$Full;", "serializer", "()Lkotlinx/serialization/KSerializer;", "money-formatter-config_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Serializable
    public final class Full extends NumberFormat {
        public static final Full INSTANCE = new Full();
        public static final /* synthetic */ Lazy $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) AnonymousClass1.INSTANCE);

        /* renamed from: com.squareup.cash.common.moneyformatter.NumberFormat$Full$1, reason: invalid class name */
        public final class AnonymousClass1 extends Lambda implements Function0 {
            public static final AnonymousClass1 INSTANCE;
            public static final AnonymousClass1 INSTANCE$1;
            public static final AnonymousClass1 INSTANCE$2;
            public static final AnonymousClass1 INSTANCE$3;
            public final /* synthetic */ int $r8$classId;

            static {
                int i = 0;
                INSTANCE$1 = new AnonymousClass1(i, 1);
                INSTANCE$2 = new AnonymousClass1(i, 2);
                INSTANCE$3 = new AnonymousClass1(i, 3);
                INSTANCE = new AnonymousClass1(i, 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ AnonymousClass1(int i, int i2) {
                super(i);
                this.$r8$classId = i2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (this.$r8$classId) {
                    case 0:
                        return new EnumSerializer("Full", Full.INSTANCE, new Annotation[0]);
                    case 1:
                        return new EnumSerializer("Cents", DenominationOption.Cents.INSTANCE, new Annotation[0]);
                    case 2:
                        ReflectionFactory reflectionFactory = Reflection.factory;
                        return new SealedClassSerializer("com.squareup.cash.common.moneyformatter.DenominationOption", reflectionFactory.getOrCreateKotlinClass(DenominationOption.class), new KClass[]{reflectionFactory.getOrCreateKotlinClass(DenominationOption.Cents.class), reflectionFactory.getOrCreateKotlinClass(DenominationOption.Dollars.class), reflectionFactory.getOrCreateKotlinClass(DenominationOption.DollarsAndCents.class)}, new KSerializer[]{new EnumSerializer("Cents", DenominationOption.Cents.INSTANCE, new Annotation[0]), DenominationOption$Dollars$$serializer.INSTANCE, DenominationOption$DollarsAndCents$$serializer.INSTANCE}, new Annotation[0]);
                    default:
                        ReflectionFactory reflectionFactory2 = Reflection.factory;
                        return new SealedClassSerializer("com.squareup.cash.common.moneyformatter.NumberFormat", reflectionFactory2.getOrCreateKotlinClass(NumberFormat.class), new KClass[]{reflectionFactory2.getOrCreateKotlinClass(Abbreviated.class), reflectionFactory2.getOrCreateKotlinClass(Full.class)}, new KSerializer[]{NumberFormat$Abbreviated$$serializer.INSTANCE, new EnumSerializer("Full", Full.INSTANCE, new Annotation[0])}, new Annotation[0]);
                }
            }
        }

        public final KSerializer serializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }
    }

    @Serializable
    public final class Abbreviated extends NumberFormat {
        public static final KSerializer[] $childSerializers;
        public static final Companion Companion = new Companion();
        public final FractionDigitsStrategy fractionDigitsStrategy;
        public final RoundingMode roundingMode;
        public final UnitMagnitudeFormat unitMagnitudeFormat;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/common/moneyformatter/NumberFormat$Abbreviated$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/common/moneyformatter/NumberFormat$Abbreviated;", "serializer", "()Lkotlinx/serialization/KSerializer;", "money-formatter-config_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return NumberFormat$Abbreviated$$serializer.INSTANCE;
            }
        }

        static {
            RoundingMode[] values = RoundingMode.values();
            values.getClass();
            EnumSerializer enumSerializer = new EnumSerializer("com.squareup.cash.common.moneyformatter.RoundingMode", (Enum[]) values);
            UnitMagnitudeFormat[] values2 = UnitMagnitudeFormat.values();
            values2.getClass();
            $childSerializers = new KSerializer[]{enumSerializer, null, new EnumSerializer("com.squareup.cash.common.moneyformatter.UnitMagnitudeFormat", (Enum[]) values2)};
        }

        public /* synthetic */ Abbreviated(int i, RoundingMode roundingMode, FractionDigitsStrategy fractionDigitsStrategy, UnitMagnitudeFormat unitMagnitudeFormat) {
            if (7 != (i & 7)) {
                TuplesKt.throwMissingFieldException(i, 7, NumberFormat$Abbreviated$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.roundingMode = roundingMode;
            this.fractionDigitsStrategy = fractionDigitsStrategy;
            this.unitMagnitudeFormat = unitMagnitudeFormat;
        }

        public Abbreviated(RoundingMode roundingMode, FractionDigitsStrategy fractionDigitsStrategy) {
            UnitMagnitudeFormat unitMagnitudeFormat = UnitMagnitudeFormat.ABBREVIATED;
            this.roundingMode = roundingMode;
            this.fractionDigitsStrategy = fractionDigitsStrategy;
            this.unitMagnitudeFormat = unitMagnitudeFormat;
        }
    }
}
