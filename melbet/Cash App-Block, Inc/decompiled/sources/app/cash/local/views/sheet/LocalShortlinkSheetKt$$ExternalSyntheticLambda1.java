package app.cash.local.views.sheet;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import app.cash.local.viewmodels.sheet.EducationalSheetEvent;
import com.squareup.cash.borrow.viewmodels.BorrowAmountPickerViewEvent;
import com.squareup.cash.profile.viewmodels.AdjustableThresholdViewEvent$DoneClicked;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalShortlinkSheetKt$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ ParcelableSnapshotMutableIntState f$1;

    public /* synthetic */ LocalShortlinkSheetKt$$ExternalSyntheticLambda1(Function1 function1, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = parcelableSnapshotMutableIntState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.invoke(new EducationalSheetEvent.SheetDismissed(this.f$1.getIntValue()));
                break;
            case 1:
                this.f$0.invoke(new BorrowAmountPickerViewEvent.ConfirmQuickAmount(this.f$1.getIntValue()));
                break;
            default:
                this.f$0.invoke(new AdjustableThresholdViewEvent$DoneClicked(this.f$1.getIntValue()));
                break;
        }
        return Unit.INSTANCE;
    }
}
