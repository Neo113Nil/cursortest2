package com.squareup.cash.moneybot.views.plugins;

import androidx.compose.foundation.gestures.DraggableAnchorsConfig;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowRealSheetState;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowSheetPosition;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowUserDismissMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final /* synthetic */ class SlottedCardKt$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ float f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ SlottedCardKt$$ExternalSyntheticLambda4(boolean z, float f, MutableState mutableState, MutableState mutableState2) {
        this.f$0 = z;
        this.f$1 = f;
        this.f$2 = mutableState;
        this.f$3 = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$3;
        float f = this.f$1;
        Object obj3 = this.f$2;
        boolean z = this.f$0;
        switch (i) {
            case 0:
                MutableState mutableState = (MutableState) obj3;
                MutableState mutableState2 = (MutableState) obj2;
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                if (z && !((Boolean) mutableState.getValue()).booleanValue() && !((Boolean) mutableState2.getValue()).booleanValue()) {
                    float intBitsToFloat = Float.intBitsToFloat((int) (layoutCoordinates.mo843localToWindowMKHz9U(0L) & BodyPartID.bodyIdMax));
                    float mo838getSizeYbymL2g = ((int) (layoutCoordinates.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax)) + intBitsToFloat;
                    if (intBitsToFloat <= f && mo838getSizeYbymL2g >= RecyclerView.DECELERATION_RATE) {
                        Boolean bool = Boolean.TRUE;
                        mutableState.setValue(bool);
                        mutableState2.setValue(bool);
                    }
                }
                break;
            default:
                Float f2 = (Float) obj3;
                CoreFlowRealSheetState coreFlowRealSheetState = (CoreFlowRealSheetState) obj2;
                DraggableAnchorsConfig draggableAnchorsConfig = (DraggableAnchorsConfig) obj;
                draggableAnchorsConfig.getClass();
                draggableAnchorsConfig.at(CoreFlowSheetPosition.Expanded, RecyclerView.DECELERATION_RATE);
                if (!z && f2 != null && f2.floatValue() > RecyclerView.DECELERATION_RATE && f2.floatValue() < f) {
                    draggableAnchorsConfig.at(CoreFlowSheetPosition.Peeking, f2.floatValue());
                }
                if (((CoreFlowUserDismissMode) coreFlowRealSheetState.userDismissMode$delegate.getValue()).drag) {
                    draggableAnchorsConfig.at(CoreFlowSheetPosition.Hidden, f);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SlottedCardKt$$ExternalSyntheticLambda4(boolean z, Float f, float f2, CoreFlowRealSheetState coreFlowRealSheetState) {
        this.f$0 = z;
        this.f$2 = f;
        this.f$1 = f2;
        this.f$3 = coreFlowRealSheetState;
    }
}
