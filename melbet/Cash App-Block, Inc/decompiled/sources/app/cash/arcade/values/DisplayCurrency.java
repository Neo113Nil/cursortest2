package app.cash.arcade.values;

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
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes3.dex */
public interface DisplayCurrency {
    public static final Companion Companion = Companion.$$INSTANCE;

    @SerialName("Bitcoin")
    @Serializable
    public final class Bitcoin implements DisplayCurrency {
        public final BitcoinDisplayUnits units;
        public static final Companion Companion = new Companion();
        public static final Lazy[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Font$$ExternalSyntheticLambda0(16))};

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/DisplayCurrency$Bitcoin$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/DisplayCurrency$Bitcoin;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return DisplayCurrency$Bitcoin$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Bitcoin(int i, BitcoinDisplayUnits bitcoinDisplayUnits) {
            if (1 == (i & 1)) {
                this.units = bitcoinDisplayUnits;
            } else {
                TuplesKt.throwMissingFieldException(i, 1, DisplayCurrency$Bitcoin$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Bitcoin) && this.units == ((Bitcoin) obj).units;
        }

        public final int hashCode() {
            return this.units.hashCode();
        }

        public final String toString() {
            return "Bitcoin(units=" + this.units + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class BitcoinDisplayUnits {
        public static final /* synthetic */ BitcoinDisplayUnits[] $VALUES = {new BitcoinDisplayUnits("BITCOIN", 0), new BitcoinDisplayUnits("SATOSHIS", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        BitcoinDisplayUnits EF5;

        public static BitcoinDisplayUnits valueOf(String str) {
            return (BitcoinDisplayUnits) Enum.valueOf(BitcoinDisplayUnits.class, str);
        }

        public static BitcoinDisplayUnits[] values() {
            return (BitcoinDisplayUnits[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/DisplayCurrency$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/DisplayCurrency;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public final KSerializer serializer() {
            ReflectionFactory reflectionFactory = Reflection.factory;
            return new SealedClassSerializer("app.cash.arcade.values.DisplayCurrency", reflectionFactory.getOrCreateKotlinClass(DisplayCurrency.class), new KClass[]{reflectionFactory.getOrCreateKotlinClass(Bitcoin.class), reflectionFactory.getOrCreateKotlinClass(Fiat.class)}, new KSerializer[]{DisplayCurrency$Bitcoin$$serializer.INSTANCE, DisplayCurrency$Fiat$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    @SerialName("Fiat")
    @Serializable
    public final class Fiat implements DisplayCurrency {
        public static final Companion Companion = new Companion();
        public final String code;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/DisplayCurrency$Fiat$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/DisplayCurrency$Fiat;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return DisplayCurrency$Fiat$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Fiat(int i, String str) {
            if (1 == (i & 1)) {
                this.code = str;
            } else {
                TuplesKt.throwMissingFieldException(i, 1, DisplayCurrency$Fiat$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Fiat) && Intrinsics.areEqual(this.code, ((Fiat) obj).code);
        }

        public final int hashCode() {
            return this.code.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Fiat(code=", this.code, ")");
        }
    }
}
