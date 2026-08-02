package app.cash.local.presenters;

import androidx.compose.runtime.MutableState;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.local.primitives.RewardToken;
import app.cash.local.screens.app.LocalCurbsidePickupCarScreen;
import app.cash.local.screens.app.LocalLoyaltySheet;
import app.cash.local.screens.app.VehicleDescription;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.bitcoin.viewmodels.deposits.copy.BitcoinDepositCopyViewModel;
import com.squareup.cash.blockers.presenters.CashtagPresenter;
import com.squareup.cash.blockers.presenters.VerifyAliasPresenter;
import com.squareup.cash.history.viewmodels.PasscodeDialogViewModel;
import com.squareup.cash.investing.viewmodels.TransferStockViewModel;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments;
import com.squareup.cash.music.screens.MusicScreen;
import com.squareup.cash.payments.viewmodels.SelectedTrack;
import com.squareup.cash.ui.widget.keypad.KeypadListener;
import com.squareup.cash.ui.widget.keypad.KeypadViewModel;
import com.squareup.cash.ui.widget.text.AnimatedAmountTextView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class RealBrandFollowPresenter$models$2$1$1 implements Function1 {
    public final /* synthetic */ MutableState $addingOrRemovingBrand$delegate;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ RealBrandFollowPresenter$models$2$1$1(int i, MutableState mutableState) {
        this.$r8$classId = i;
        this.$addingOrRemovingBrand$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KeypadListener keypadListener;
        int i = this.$r8$classId;
        MutableState mutableState = this.$addingOrRemovingBrand$delegate;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                mutableState.setValue(bool);
                return Unit.INSTANCE;
            case 1:
                AskedQuestion askedQuestion = (AskedQuestion) obj;
                askedQuestion.getClass();
                RewardToken rewardToken = (RewardToken) mutableState.getValue();
                return new LocalLoyaltySheet(rewardToken != null ? rewardToken.value : null, askedQuestion);
            case 2:
                AskedQuestion askedQuestion2 = (AskedQuestion) obj;
                askedQuestion2.getClass();
                return new LocalCurbsidePickupCarScreen(askedQuestion2, (VehicleDescription) mutableState.getValue());
            case 3:
                mutableState.setValue((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate) obj);
                return Unit.INSTANCE;
            case 4:
                List list = (List) obj;
                list.getClass();
                mutableState.setValue(list);
                return Unit.INSTANCE;
            case 5:
                mutableState.setValue((AnimatedAmountTextView.Amount) obj);
                return Unit.INSTANCE;
            case 6:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                mutableState.setValue(bool2);
                return Unit.INSTANCE;
            case 7:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                mutableState.setValue(bool3);
                return Unit.INSTANCE;
            case 8:
                mutableState.setValue((BitcoinPayments) obj);
                return Unit.INSTANCE;
            case 9:
                BitcoinDepositCopyViewModel bitcoinDepositCopyViewModel = (BitcoinDepositCopyViewModel) obj;
                bitcoinDepositCopyViewModel.getClass();
                mutableState.setValue(bitcoinDepositCopyViewModel);
                return Unit.INSTANCE;
            case 10:
                CashtagPresenter.CashtagStatus cashtagStatus = (CashtagPresenter.CashtagStatus) obj;
                cashtagStatus.getClass();
                mutableState.setValue(cashtagStatus);
                return Unit.INSTANCE;
            case 11:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                mutableState.setValue(bool4);
                return Unit.INSTANCE;
            case 12:
                CashtagPresenter.CashtagStatus cashtagStatus2 = (CashtagPresenter.CashtagStatus) obj;
                cashtagStatus2.getClass();
                mutableState.setValue(cashtagStatus2);
                return Unit.INSTANCE;
            case 13:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                mutableState.setValue(bool5);
                return Unit.INSTANCE;
            case 14:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                mutableState.setValue(bool6);
                return Unit.INSTANCE;
            case 15:
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                mutableState.setValue(bool7);
                return Unit.INSTANCE;
            case 16:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                mutableState.setValue((VerifyAliasPresenter.State) function1.invoke((VerifyAliasPresenter.State) mutableState.getValue()));
                return Unit.INSTANCE;
            case 17:
                Function1 function12 = (Function1) obj;
                function12.getClass();
                mutableState.setValue((VerifyAliasPresenter.State) function12.invoke((VerifyAliasPresenter.State) mutableState.getValue()));
                return Unit.INSTANCE;
            case 18:
                Function1 function13 = (Function1) obj;
                function13.getClass();
                mutableState.setValue((VerifyAliasPresenter.State) function13.invoke((VerifyAliasPresenter.State) mutableState.getValue()));
                return Unit.INSTANCE;
            case 19:
                Boolean bool8 = (Boolean) obj;
                bool8.booleanValue();
                mutableState.setValue(bool8);
                return Unit.INSTANCE;
            case 20:
                mutableState.setValue((String) obj);
                return Unit.INSTANCE;
            case 21:
                Function1 function14 = (Function1) obj;
                function14.getClass();
                mutableState.setValue((PasscodeDialogViewModel) function14.invoke((PasscodeDialogViewModel) mutableState.getValue()));
                return Unit.INSTANCE;
            case 22:
                Function1 function15 = (Function1) obj;
                function15.getClass();
                mutableState.setValue((PasscodeDialogViewModel) function15.invoke((PasscodeDialogViewModel) mutableState.getValue()));
                return Unit.INSTANCE;
            case 23:
                Boolean bool9 = (Boolean) obj;
                bool9.booleanValue();
                mutableState.setValue(bool9);
                return Unit.INSTANCE;
            case 24:
                Boolean bool10 = (Boolean) obj;
                bool10.booleanValue();
                mutableState.setValue(bool10);
                return Unit.INSTANCE;
            case 25:
                TransferStockViewModel.Content.FullScreenContent.DialogContent dialogContent = (TransferStockViewModel.Content.FullScreenContent.DialogContent) obj;
                dialogContent.getClass();
                mutableState.setValue(dialogContent);
                return Unit.INSTANCE;
            case 26:
                TransferStockViewModel.Content.FullScreenContent.DialogContent dialogContent2 = (TransferStockViewModel.Content.FullScreenContent.DialogContent) obj;
                dialogContent2.getClass();
                mutableState.setValue(dialogContent2);
                return Unit.INSTANCE;
            case 27:
                List list2 = (List) obj;
                list2.getClass();
                mutableState.setValue(list2);
                return Unit.INSTANCE;
            case 28:
                KeypadViewModel.KeypadKey keypadKey = (KeypadViewModel.KeypadKey) obj;
                keypadKey.getClass();
                if (keypadKey.isDigit()) {
                    KeypadListener keypadListener2 = (KeypadListener) mutableState.getValue();
                    if (keypadListener2 != null) {
                        keypadListener2.onDigit(Integer.parseInt(keypadKey.value));
                    }
                } else if (keypadKey.isClear()) {
                    KeypadListener keypadListener3 = (KeypadListener) mutableState.getValue();
                    if (keypadListener3 != null) {
                        keypadListener3.onBackspace();
                    }
                } else if (keypadKey.isSeparator() && (keypadListener = (KeypadListener) mutableState.getValue()) != null) {
                    keypadListener.onDecimal();
                }
                return Unit.INSTANCE;
            default:
                AskedQuestion askedQuestion3 = (AskedQuestion) obj;
                askedQuestion3.getClass();
                SelectedTrack selectedTrack = (SelectedTrack) mutableState.getValue();
                return new MusicScreen(selectedTrack != null ? selectedTrack.musicId : null, askedQuestion3);
        }
    }
}
