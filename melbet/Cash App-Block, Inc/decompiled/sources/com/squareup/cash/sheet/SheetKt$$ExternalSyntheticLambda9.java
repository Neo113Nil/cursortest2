package com.squareup.cash.sheet;

import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import com.squareup.cash.support.chat.views.transcript.ErrorRowView;
import com.squareup.cash.support.chat.views.transcript.viewholder.MessageUnknownComposeView;
import com.squareup.cash.support.presenters.ArticlePresenter;
import com.squareup.cash.support.views.SupportTransactionConfirmationView;
import com.stripe.android.financialconnections.FinancialConnections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final /* synthetic */ class SheetKt$$ExternalSyntheticLambda9 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SheetKt$$ExternalSyntheticLambda9(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = SheetKt.LocalSheetInOverlayLayer;
                return Boolean.TRUE;
            case 1:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 2:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 3:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 4:
                int i = RealSheetState.$r8$clinit;
                return "Timed out waiting for the peek height to be calculated";
            case 5:
                synchronized (FinancialConnections.class) {
                    FinancialConnections.eventListener = null;
                }
                return Unit.INSTANCE;
            case 6:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 7:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 8:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 9:
                return Unit.INSTANCE;
            case 10:
                return Unit.INSTANCE;
            case 11:
                return Unit.INSTANCE;
            case 12:
                return Unit.INSTANCE;
            case 13:
                return Unit.INSTANCE;
            case 14:
                return Unit.INSTANCE;
            case 15:
                return Unit.INSTANCE;
            case 16:
                int i2 = ErrorRowView.$r8$clinit;
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
                int i3 = MessageUnknownComposeView.$r8$clinit;
                return Unit.INSTANCE;
            case 22:
                return Updater.mutableStateOf$default(ArticlePresenter.IncidentsState.LOADING);
            case 23:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 24:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 25:
                return Unit.INSTANCE;
            case 26:
                return Unit.INSTANCE;
            case 27:
                return Unit.INSTANCE;
            case 28:
                return Unit.INSTANCE;
            default:
                int i4 = SupportTransactionConfirmationView.$r8$clinit;
                return Unit.INSTANCE;
        }
    }
}
