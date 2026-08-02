package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import com.squareup.cash.card.onboarding.PaymentDeviceAvailabilityStyleKt;
import com.squareup.cash.card.onboarding.PaymentDeviceItemViewModel;
import com.squareup.cash.card.onboarding.ZoomLevel;
import com.squareup.cash.card.onboarding.core.instancing.CardScreenBounds;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* loaded from: classes3.dex */
public final /* synthetic */ class TransformableStateKt$$ExternalSyntheticLambda1 implements Function4 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState f$0;

    public /* synthetic */ TransformableStateKt$$ExternalSyntheticLambda1(int i, MutableState mutableState) {
        this.$r8$classId = i;
        this.f$0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2 = this.$r8$classId;
        MutableState mutableState = this.f$0;
        switch (i2) {
            case 0:
                Float f = (Float) obj2;
                f.getClass();
                Float f2 = (Float) obj4;
                f2.getClass();
                ((Function4) mutableState.getValue()).invoke((Offset) obj, f, (Offset) obj3, f2);
                break;
            default:
                CardScreenBounds cardScreenBounds = (CardScreenBounds) obj;
                ZoomLevel zoomLevel = (ZoomLevel) obj2;
                Composer composer = (Composer) obj3;
                int intValue = ((Integer) obj4).intValue();
                cardScreenBounds.getClass();
                int i3 = cardScreenBounds.canonicalIndex;
                zoomLevel.getClass();
                if ((intValue & 6) == 0) {
                    i = (((GapComposer) composer).changed(cardScreenBounds) ? 4 : 2) | intValue;
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= ((GapComposer) composer).changed(zoomLevel.ordinal()) ? 32 : 16;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (!gapComposer.shouldExecute(i & 1, (i & 147) != 146)) {
                    gapComposer.skipToGroupEnd();
                } else if (i3 < ((List) mutableState.getValue()).size()) {
                    gapComposer.startReplaceGroup(-1206243549);
                    PaymentDeviceAvailabilityStyleKt.CardOverlayContent((PaymentDeviceItemViewModel) ((List) mutableState.getValue()).get(i3), zoomLevel, gapComposer, i & 112);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1206148410);
                    gapComposer.end(false);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
