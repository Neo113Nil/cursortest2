package app.cash.local.views.brand.menu;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.local.viewmodels.LocalMenuComboDetailsViewEvent;
import app.cash.local.viewmodels.LocalMenuItemDetailsViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalMenuItemDetailsViewKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ ParcelableSnapshotMutableIntState f$1;
    public final /* synthetic */ MutableState f$2;

    public /* synthetic */ LocalMenuItemDetailsViewKt$$ExternalSyntheticLambda0(Function1 function1, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = parcelableSnapshotMutableIntState;
        this.f$2 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.f$2;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                LocalMenuItemDetailsViewEvent localMenuItemDetailsViewEvent = (LocalMenuItemDetailsViewEvent) obj;
                localMenuItemDetailsViewEvent.getClass();
                NavAction$$ExternalSyntheticOutline0.m(1, parcelableSnapshotMutableIntState);
                mutableState.setValue(Boolean.FALSE);
                function1.invoke(localMenuItemDetailsViewEvent);
                break;
            default:
                LocalMenuComboDetailsViewEvent localMenuComboDetailsViewEvent = (LocalMenuComboDetailsViewEvent) obj;
                localMenuComboDetailsViewEvent.getClass();
                NavAction$$ExternalSyntheticOutline0.m(1, parcelableSnapshotMutableIntState);
                mutableState.setValue(Boolean.FALSE);
                function1.invoke(localMenuComboDetailsViewEvent);
                break;
        }
        return Unit.INSTANCE;
    }
}
