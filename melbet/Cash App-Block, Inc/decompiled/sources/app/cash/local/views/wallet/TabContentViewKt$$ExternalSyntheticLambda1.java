package app.cash.local.views.wallet;

import androidx.compose.runtime.MutableState;
import app.cash.local.viewmodels.wallet.LocalHomeViewEvent;
import com.squareup.cash.activity.viewmodels.ActivityFeedEntry;
import com.squareup.cash.activity.viewmodels.ActivityTabViewModel;
import com.squareup.cash.activity.views.ActivityTabViewKt;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinLocationFilter;
import com.squareup.cash.borrow.views.LoanDetailsSheetState;
import com.squareup.cash.card.onboarding.CardPreviewViewModel;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final /* synthetic */ class TabContentViewKt$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState f$0;

    public /* synthetic */ TabContentViewKt$$ExternalSyntheticLambda1(int i, MutableState mutableState) {
        this.$r8$classId = i;
        this.f$0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        LoanDetailsSheetState loanDetailsSheetState;
        int i = this.$r8$classId;
        MutableState mutableState = this.f$0;
        switch (i) {
            case 0:
                ((Function1) mutableState.getValue()).invoke(LocalHomeViewEvent.AddMenuClicked.INSTANCE);
                break;
            case 1:
                Boolean bool = Boolean.TRUE;
                mutableState.setValue(bool);
                break;
            case 2:
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                break;
            case 3:
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                break;
            case 4:
                mutableState.setValue(Boolean.FALSE);
                break;
            case 5:
                mutableState.setValue(Boolean.FALSE);
                break;
            case 6:
                mutableState.setValue(Boolean.FALSE);
                break;
            case 7:
                mutableState.setValue(Boolean.FALSE);
                break;
            case 8:
                mutableState.setValue(Boolean.TRUE);
                break;
            case 9:
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                break;
            case 10:
                mutableState.setValue(Boolean.FALSE);
                break;
            case 11:
                mutableState.setValue(null);
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                mutableState.setValue(new ActivityTabViewModel.ScrollToTop(((ActivityTabViewModel.ScrollToTop) mutableState.getValue()).id + 1, true));
                break;
            case 15:
                int i2 = ActivityTabViewKt.$r8$clinit;
                ActivityFeedEntry activityFeedEntry = (ActivityFeedEntry) CollectionsKt.firstOrNull((List) mutableState.getValue());
                if (activityFeedEntry != null) {
                    break;
                }
                break;
            case 16:
                mutableState.setValue(Boolean.FALSE);
                break;
            case 17:
                mutableState.setValue(Boolean.FALSE);
                break;
            case 18:
                break;
            case 19:
                mutableState.setValue(Boolean.FALSE);
                break;
            case 20:
                mutableState.setValue(Boolean.TRUE);
                break;
            case 21:
                BitcoinLocationFilter bitcoinLocationFilter = (BitcoinLocationFilter) mutableState.getValue();
                boolean z = !((BitcoinLocationFilter) mutableState.getValue()).squareSellersOnly;
                bitcoinLocationFilter.getClass();
                mutableState.setValue(new BitcoinLocationFilter(z));
                break;
            case 22:
                mutableState.setValue(Boolean.FALSE);
                break;
            case 23:
                int ordinal = ((LoanDetailsSheetState) mutableState.getValue()).ordinal();
                if (ordinal == 0) {
                    loanDetailsSheetState = LoanDetailsSheetState.Timeline;
                } else if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    loanDetailsSheetState = LoanDetailsSheetState.Details;
                }
                mutableState.setValue(loanDetailsSheetState);
                Timber.Forest.i("Switching loan details sheet state to " + ((LoanDetailsSheetState) mutableState.getValue()), new Object[0]);
                break;
            case 24:
                break;
            case 25:
                CardPreviewViewModel cardPreviewViewModel = (CardPreviewViewModel) mutableState.getValue();
                CardPreviewViewModel.Preview preview = cardPreviewViewModel instanceof CardPreviewViewModel.Preview ? (CardPreviewViewModel.Preview) cardPreviewViewModel : null;
                if (preview != null && (r3 = preview.cardViewModel.theme) != null) {
                    break;
                }
                break;
            case 26:
                mutableState.setValue(Boolean.TRUE);
                break;
            case 27:
                mutableState.setValue(Boolean.TRUE);
                break;
            case 28:
                mutableState.setValue(Boolean.FALSE);
                break;
            default:
                mutableState.setValue(Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }
}
