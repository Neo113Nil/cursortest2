package com.squareup.cash.sharesheet;

import androidx.compose.runtime.MutableState;
import com.squareup.cash.lifecycle.ActivityEvent;
import com.squareup.cash.profile.presenters.personal.AliasesSectionPresenter$Result;
import com.squareup.cash.qrcodes.presenters.CashQrScannerPresenter;
import com.squareup.cash.qrcodes.presenters.CashtagQrScanPresenter$State;
import com.squareup.cash.qrcodes.presenters.CashtagQrScanPresenter$WhenMappings;
import com.squareup.cash.qrcodes.viewmodels.CameraState;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.shopping.presenters.RealShoppingJavascriptPresenter;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter;
import com.squareup.cash.wallet.db.IssuedCardFactory;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeActivity;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes7.dex */
public final class ShareSheetPresenter$models$1$1$5 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $state$delegate;

    public /* synthetic */ ShareSheetPresenter$models$1$1$5(int i, MutableState mutableState) {
        this.$r8$classId = i;
        this.$state$delegate = mutableState;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$state$delegate;
        switch (i) {
            case 0:
                mutableState.setValue((ShareSheetPresenter.StateUpdate.DataUpdated) obj);
                break;
            case 1:
                mutableState.setValue((AliasesSectionPresenter$Result.PopulatedList) obj);
                break;
            case 2:
                mutableState.setValue(CashQrScannerPresenter.State.copy$default((CashQrScannerPresenter.State) mutableState.getValue(), false, CashQrScannerPresenter.WhenMappings.$EnumSwitchMapping$0[((ActivityEvent) obj).ordinal()] == 1 ? CameraState.PAUSED : CameraState.RESUMED, null, 13));
                break;
            case 3:
                mutableState.setValue(CashtagQrScanPresenter$State.copy$default((CashtagQrScanPresenter$State) mutableState.getValue(), false, CashtagQrScanPresenter$WhenMappings.$EnumSwitchMapping$0[((ActivityEvent) obj).ordinal()] == 1 ? CameraState.PAUSED : CameraState.RESUMED, 1));
                break;
            case 4:
                mutableState.setValue((ShareSheetPresenter.StateUpdate.SharingCompleted) obj);
                break;
            case 5:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                List list = RealShoppingJavascriptPresenter.validAfterpayURLs;
                mutableState.setValue(bool);
                break;
            case 6:
                IssuedCardFactory.IssuedCard issuedCard = (IssuedCardFactory.IssuedCard) obj;
                if (issuedCard != null) {
                    String expiration = issuedCard.getExpiration();
                    String substring = expiration != null ? expiration.substring(2) : null;
                    String expiration2 = issuedCard.getExpiration();
                    String substring2 = expiration2 != null ? expiration2.substring(0, 2) : null;
                    Set set = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                    ShoppingWebPresenter.State state = (ShoppingWebPresenter.State) mutableState.getValue();
                    ShoppingWebPresenter.CardState cardState = ((ShoppingWebPresenter.State) mutableState.getValue()).cardState;
                    String pan = issuedCard.getPan();
                    String str = issuedCard.lastFour;
                    IssuedCardFactory.SensitiveCardData sensitiveCardData = issuedCard.this$0.sensitiveData;
                    mutableState.setValue(ShoppingWebPresenter.State.copy$default(state, false, ShoppingWebPresenter.CardState.copy$default(cardState, pan, str, substring, substring2, sensitiveCardData != null ? sensitiveCardData.securityCode.value : null, issuedCard.enabled, 448), null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, 536870909));
                }
                break;
            case 7:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                mutableState.setValue(bool2);
                break;
            case 8:
                mutableState.setValue(Boolean.TRUE);
                break;
            case 9:
                mutableState.setValue(Boolean.TRUE);
                break;
            default:
                int i2 = IntentConfirmationChallengeActivity.$r8$clinit;
                mutableState.setValue(Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ShareSheetPresenter$models$1$1$5(Object obj, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.$state$delegate = mutableState;
    }
}
