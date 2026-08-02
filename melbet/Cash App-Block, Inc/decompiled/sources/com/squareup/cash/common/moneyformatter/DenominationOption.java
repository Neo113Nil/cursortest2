package com.squareup.cash.common.moneyformatter;

import com.squareup.cash.common.moneyformatter.NumberFormat;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes.dex */
public abstract class DenominationOption {
    public static final Companion Companion = new Companion();
    public static final Lazy $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) NumberFormat.Full.AnonymousClass1.INSTANCE$2);

    @SerialName("Cents")
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/common/moneyformatter/DenominationOption$Cents", "Lcom/squareup/cash/common/moneyformatter/DenominationOption;", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/common/moneyformatter/DenominationOption$Cents;", "serializer", "()Lkotlinx/serialization/KSerializer;", "money-formatter-config_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Serializable
    public final class Cents extends DenominationOption {
        public static final Cents INSTANCE = new Cents();
        public static final /* synthetic */ Lazy $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) NumberFormat.Full.AnonymousClass1.INSTANCE$1);

        public final KSerializer serializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/common/moneyformatter/DenominationOption$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/common/moneyformatter/DenominationOption;", "serializer", "()Lkotlinx/serialization/KSerializer;", "money-formatter-config_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return (KSerializer) DenominationOption.$cachedSerializer$delegate.getValue();
        }
    }

    @Serializable
    public final class Dollars extends DenominationOption {
        public static final KSerializer[] $childSerializers;
        public static final Companion Companion = new Companion();
        public final RoundingMode roundingMode;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/common/moneyformatter/DenominationOption$Dollars$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/common/moneyformatter/DenominationOption$Dollars;", "serializer", "()Lkotlinx/serialization/KSerializer;", "money-formatter-config_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return DenominationOption$Dollars$$serializer.INSTANCE;
            }
        }

        static {
            RoundingMode[] values = RoundingMode.values();
            values.getClass();
            $childSerializers = new KSerializer[]{new EnumSerializer("com.squareup.cash.common.moneyformatter.RoundingMode", (Enum[]) values)};
        }

        public /* synthetic */ Dollars(int i, RoundingMode roundingMode) {
            if ((i & 1) == 0) {
                this.roundingMode = RoundingMode.HALF_UP;
            } else {
                this.roundingMode = roundingMode;
            }
        }

        public Dollars(RoundingMode roundingMode) {
            roundingMode.getClass();
            this.roundingMode = roundingMode;
        }
    }

    @Serializable
    public final class DollarsAndCents extends DenominationOption {
        public static final KSerializer[] $childSerializers;
        public static final Companion Companion = new Companion();
        public final boolean omitsCentsIfPossible;
        public final boolean showsAsCentsIfPossible;
        public final TrailingZeroesBehavior trailingZeroesBehavior;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/common/moneyformatter/DenominationOption$DollarsAndCents$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/common/moneyformatter/DenominationOption$DollarsAndCents;", "serializer", "()Lkotlinx/serialization/KSerializer;", "money-formatter-config_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return DenominationOption$DollarsAndCents$$serializer.INSTANCE;
            }
        }

        static {
            TrailingZeroesBehavior[] values = TrailingZeroesBehavior.values();
            values.getClass();
            $childSerializers = new KSerializer[]{null, null, new EnumSerializer("com.squareup.cash.common.moneyformatter.TrailingZeroesBehavior", (Enum[]) values)};
        }

        public /* synthetic */ DollarsAndCents(int i, boolean z, boolean z2, TrailingZeroesBehavior trailingZeroesBehavior) {
            if (3 != (i & 3)) {
                TuplesKt.throwMissingFieldException(i, 3, DenominationOption$DollarsAndCents$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.omitsCentsIfPossible = z;
            this.showsAsCentsIfPossible = z2;
            if ((i & 4) == 0) {
                this.trailingZeroesBehavior = null;
            } else {
                this.trailingZeroesBehavior = trailingZeroesBehavior;
            }
        }

        public DollarsAndCents(boolean z) {
            this.omitsCentsIfPossible = z;
            this.showsAsCentsIfPossible = false;
            this.trailingZeroesBehavior = null;
        }
    }
}
