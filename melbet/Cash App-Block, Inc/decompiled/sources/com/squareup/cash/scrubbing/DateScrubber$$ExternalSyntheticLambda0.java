package com.squareup.cash.scrubbing;

import androidx.compose.runtime.Updater;
import com.plaid.link.Plaid;
import com.squareup.cash.pools.viewmodels.PoolCategory;
import java.text.NumberFormat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class DateScrubber$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ DateScrubber$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return Unit.INSTANCE;
            case 1:
                return Updater.mutableStateOf$default(null);
            case 2:
                Plaid.clearLinkEventListener();
                return Unit.INSTANCE;
            case 3:
                return Updater.mutableStateOf$default(null);
            case 4:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 5:
                return Updater.mutableStateOf$default(PoolCategory.ACTIVE);
            case 6:
                return Unit.INSTANCE;
            case 7:
                return Unit.INSTANCE;
            case 8:
                return Unit.INSTANCE;
            case 9:
                return Unit.INSTANCE;
            case 10:
                return Unit.INSTANCE;
            case 11:
                return Unit.INSTANCE;
            case 12:
                return Updater.mutableStateOf$default(null);
            case 13:
                return Unit.INSTANCE;
            case 14:
                return Unit.INSTANCE;
            case 15:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 16:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 17:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 18:
                return Unit.INSTANCE;
            case 19:
                return Unit.INSTANCE;
            case 20:
                return Unit.INSTANCE;
            case 21:
                return Unit.INSTANCE;
            case 22:
                return NumberFormat.getPercentInstance();
            case 23:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 24:
                return Unit.INSTANCE;
            case 25:
                return Unit.INSTANCE;
            case 26:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 27:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 28:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            default:
                return Unit.INSTANCE;
        }
    }
}
