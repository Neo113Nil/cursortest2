package com.squareup.cash.db.contacts;

import androidx.compose.runtime.Updater;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.inputfieldtext.InputFieldText;
import com.squareup.cash.directdeposit.backend.api.PaycheckDepositAllocation;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositManualFormCompletionViewModel;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositUpdateManualFormDetailsViewModel;
import com.squareup.cash.family.familyhub.presenters.ManagedAccountTransferPresenter;
import com.squareup.cash.fidesmo.views.ScanningCardShape;
import com.squareup.cash.fidesmo.views.ScanningHeartShape;
import java.text.NumberFormat;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class Recipient$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Recipient$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return new Recipient("empty", false, false, null, null, null, false, false, false, null, null, null, null, null, false, 0L, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, false, null, null, -2, 63);
            case 1:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 2:
                return NumberFormat.getIntegerInstance();
            case 3:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 4:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 5:
                return Unit.INSTANCE;
            case 6:
                return Updater.mutableStateOf$default(null);
            case 7:
                return Updater.mutableStateOf$default(DirectDepositManualFormCompletionViewModel.Loading.INSTANCE);
            case 8:
                return Updater.mutableStateOf$default("");
            case 9:
                return Updater.mutableStateOf$default(PaycheckDepositAllocation.All.INSTANCE);
            case 10:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 11:
                return Updater.mutableStateOf$default(null);
            case 12:
                return Updater.mutableStateOf$default(DirectDepositUpdateManualFormDetailsViewModel.Loading.INSTANCE);
            case 13:
                return Unit.INSTANCE;
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
                return Updater.mutableStateOf$default(ManagedAccountTransferPresenter.InputMode.CHANGE_AMOUNT);
            case 21:
                return Updater.mutableStateOf$default(null);
            case 22:
                return Unit.INSTANCE;
            case 23:
                return Unit.INSTANCE;
            case 24:
                return Updater.mutableStateOf$default(new InputFieldText.Simple(""));
            case 25:
                return Unit.INSTANCE;
            case 26:
                return Unit.INSTANCE;
            case 27:
                ScanningCardShape scanningCardShape = ScanningCardShape.INSTANCE;
                return ScanningCardShape.buildPath(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f).getBounds();
            case 28:
                ScanningHeartShape scanningHeartShape = ScanningHeartShape.INSTANCE;
                return ScanningHeartShape.buildPath$1(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f).getBounds();
            default:
                return Updater.mutableStateOf$default(EmptyList.INSTANCE);
        }
    }
}
