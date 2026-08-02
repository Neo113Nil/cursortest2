package app.cash.local.views.sheet;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.local.viewmodels.CartItemCounterViewEvent;
import app.cash.local.viewmodels.sheet.EducationalSheetEvent;
import com.squareup.cash.paymentpad.viewmodels.MainPaymentPadViewEvent;
import com.squareup.cash.ui.widget.amount.AmountChangedSource;
import com.squareup.cash.ui.widget.amount.AmountEvent;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalShortlinkSheetKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ ParcelableSnapshotMutableIntState f$1;

    public /* synthetic */ LocalShortlinkSheetKt$$ExternalSyntheticLambda0(Function1 function1, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = parcelableSnapshotMutableIntState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                EducationalSheetEvent educationalSheetEvent = (EducationalSheetEvent) obj;
                educationalSheetEvent.getClass();
                if (educationalSheetEvent instanceof EducationalSheetEvent.PageSeen) {
                    parcelableSnapshotMutableIntState.setIntValue(((EducationalSheetEvent.PageSeen) educationalSheetEvent).sheetIndex);
                }
                function1.invoke(educationalSheetEvent);
                return Unit.INSTANCE;
            case 1:
                CartItemCounterViewEvent cartItemCounterViewEvent = (CartItemCounterViewEvent) obj;
                cartItemCounterViewEvent.getClass();
                parcelableSnapshotMutableIntState.setIntValue(parcelableSnapshotMutableIntState.getIntValue() + 1);
                function1.invoke(cartItemCounterViewEvent);
                return Unit.INSTANCE;
            case 2:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                function1.invoke(Float.valueOf(Float.intBitsToFloat((int) (layoutCoordinates.mo841localToRootMKHz9U(0L) & BodyPartID.bodyIdMax)) + parcelableSnapshotMutableIntState.getIntValue()));
                return Unit.INSTANCE;
            default:
                AmountEvent amountEvent = (AmountEvent) obj;
                amountEvent.getClass();
                if (amountEvent instanceof AmountEvent.AmountChanged) {
                    AmountEvent.AmountChanged amountChanged = (AmountEvent.AmountChanged) amountEvent;
                    if (!Intrinsics.areEqual(amountChanged.source, AmountChangedSource.ConfigReset.INSTANCE)) {
                        function1.invoke(new MainPaymentPadViewEvent.FiatPaymentPadViewEvent.AmountChanged(amountChanged.rawAmount));
                    }
                } else {
                    if (!(amountEvent instanceof AmountEvent.InvalidChange)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    NavAction$$ExternalSyntheticOutline0.m(1, parcelableSnapshotMutableIntState);
                }
                return Unit.INSTANCE;
        }
    }
}
