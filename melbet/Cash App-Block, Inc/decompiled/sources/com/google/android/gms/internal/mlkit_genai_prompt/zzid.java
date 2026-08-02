package com.google.android.gms.internal.mlkit_genai_prompt;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.charting.viewmodels.EarningsBarViewModel;
import com.squareup.protos.common.Money;
import com.stripe.android.core.model.parsers.ModelJsonParser;

/* loaded from: classes4.dex */
public abstract class zzid implements ModelJsonParser {
    public final /* synthetic */ int $r8$classId = 0;

    public static final EarningsBarViewModel.Color access$toColor(Money money) {
        if (money == null) {
            return EarningsBarViewModel.Color.FUTURE;
        }
        Long l = money.amount;
        if (l != null && l.longValue() == 0) {
            return EarningsBarViewModel.Color.DISABLED;
        }
        Long l2 = money.amount;
        l2.getClass();
        if (l2.longValue() > 0) {
            return EarningsBarViewModel.Color.ACTIVE;
        }
        a$$ExternalSyntheticBUOutline0.m$1("The amount should not be negative for earnings tracker");
        return null;
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 0:
                return ((zzkv) this).zza$1.toString();
            default:
                return super.toString();
        }
    }
}
