package com.squareup.cash.common.moneyformatter;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes.dex */
public final class FractionDigitsStrategy {
    public final int maximumFractionDigits;
    public final int maximumTotalDigits;
    public final int minimumFractionDigits;
    public static final Companion Companion = new Companion();
    public static final FractionDigitsStrategy UP_TO_ONE = new FractionDigitsStrategy(0, 1, Integer.MAX_VALUE);
    public static final FractionDigitsStrategy EXACTLY_TWO = new FractionDigitsStrategy(2, 2, Integer.MAX_VALUE);
    public static final FractionDigitsStrategy BALANCED = new FractionDigitsStrategy(0, 2, 4);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"com/squareup/cash/common/moneyformatter/FractionDigitsStrategy$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/common/moneyformatter/FractionDigitsStrategy;", "serializer", "()Lkotlinx/serialization/KSerializer;", "BALANCED", "Lcom/squareup/cash/common/moneyformatter/FractionDigitsStrategy;", "EXACTLY_TWO", "UP_TO_ONE", "money-formatter-config_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return FractionDigitsStrategy$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FractionDigitsStrategy(int i, int i2, int i3, int i4) {
        if (7 != (i & 7)) {
            TuplesKt.throwMissingFieldException(i, 7, FractionDigitsStrategy$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.minimumFractionDigits = i2;
        this.maximumFractionDigits = i3;
        this.maximumTotalDigits = i4;
    }

    public FractionDigitsStrategy(int i, int i2, int i3) {
        this.minimumFractionDigits = i;
        this.maximumFractionDigits = i2;
        this.maximumTotalDigits = i3;
    }
}
