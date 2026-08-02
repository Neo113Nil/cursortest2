package com.squareup.cash.activity.views.receipts;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.protos.franklin.ui.Timeline;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class ReceiptTimelineKt$$ExternalSyntheticLambda8 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Timeline.Event f$1;

    public /* synthetic */ ReceiptTimelineKt$$ExternalSyntheticLambda8(String str, Timeline.Event event, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = event;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Color color = null;
        Timeline.Event event = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    com.squareup.protos.cash.ui.Color color2 = event.detail_text_color;
                    if (color2 == null) {
                        gapComposer.startReplaceGroup(-174343176);
                        gapComposer.end(false);
                    } else {
                        color = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, -1668191959, color2, gapComposer, false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, color != null ? color.value : Color.Unspecified, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, this.f$0, (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                    com.squareup.protos.cash.ui.Color color3 = event.detail_text_color;
                    if (color3 == null) {
                        gapComposer2.startReplaceGroup(687325650);
                        gapComposer2.end(false);
                    } else {
                        color = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer2, -116375537, color3, gapComposer2, false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, color != null ? color.value : Color.Unspecified, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, this.f$0, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
