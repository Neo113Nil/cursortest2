package com.squareup.cash.p2pblocking.views;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Updater;
import app.cash.inputfieldtext.InputFieldText;
import com.squareup.cash.offers.backend.api.OffersAnalyticsState;
import com.squareup.cash.offers.views.OffersCollapsibleHeaderScaffoldState;
import java.text.NumberFormat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class P2PListViewKt$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ P2PListViewKt$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return Unit.INSTANCE;
            case 1:
                return Unit.INSTANCE;
            case 2:
                return Unit.INSTANCE;
            case 3:
                return Updater.mutableStateOf$default(null);
            case 4:
                return Updater.mutableStateOf$default(new OffersAnalyticsState(OffersAnalyticsState.EMPTY));
            case 5:
                return Updater.mutableStateOf$default(null);
            case 6:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 7:
                return Unit.INSTANCE;
            case 8:
                return Unit.INSTANCE;
            case 9:
                return Unit.INSTANCE;
            case 10:
                return new LazyListState(0, 0);
            case 11:
                return new OffersCollapsibleHeaderScaffoldState();
            case 12:
                return Updater.mutableStateOf$default(new InputFieldText.Simple(""));
            case 13:
                return Updater.mutableStateOf$default(new InputFieldText.Simple(""));
            case 14:
                return Unit.INSTANCE;
            case 15:
                return Unit.INSTANCE;
            case 16:
                return Unit.INSTANCE;
            case 17:
                return Unit.INSTANCE;
            case 18:
                return Unit.INSTANCE;
            case 19:
                return Unit.INSTANCE;
            case 20:
                return Unit.INSTANCE;
            case 21:
                return Unit.INSTANCE;
            case 22:
                return Unit.INSTANCE;
            case 23:
                return Unit.INSTANCE;
            case 24:
                return Unit.INSTANCE;
            case 25:
                return NumberFormat.getIntegerInstance();
            case 26:
                return NumberFormat.getPercentInstance();
            case 27:
                return NumberFormat.getPercentInstance();
            case 28:
                return NumberFormat.getIntegerInstance();
            default:
                return NumberFormat.getPercentInstance();
        }
    }
}
