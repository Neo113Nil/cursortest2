package com.squareup.cash.activity.views.receipts;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.protos.franklin.ui.Timeline;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class ReceiptTimelineKt$$ExternalSyntheticLambda9 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Timeline.Event f$1;

    public /* synthetic */ ReceiptTimelineKt$$ExternalSyntheticLambda9(String str, Timeline.Event event, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = event;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Color color = null;
        Timeline.Event event = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    com.squareup.protos.cash.ui.Color color2 = event.body_text_color;
                    if (color2 == null) {
                        gapComposer.startReplaceGroup(-1034933265);
                        gapComposer.end(false);
                    } else {
                        color = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, -2111594926, color2, gapComposer, false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, color != null ? color.value : Color.Unspecified, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, this.f$0, (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (event.body_text != null) {
                        gapComposer2.startReplaceGroup(-1119435460);
                        com.squareup.protos.cash.ui.Color color3 = event.body_text_color;
                        if (color3 == null) {
                            gapComposer2.startReplaceGroup(-1119435461);
                            gapComposer2.end(false);
                        } else {
                            color = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer2, -728847482, color3, gapComposer2, false);
                        }
                        gapComposer2.end(false);
                    } else if (event.icon == Timeline.Event.Icon.ALERT) {
                        gapComposer2.startReplaceGroup(-728844158);
                        Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        color = Recorder$$ExternalSyntheticOutline1.m(gapComposer2, false, colors.semantic.text.danger);
                    } else {
                        gapComposer2.startReplaceGroup(-1119299743);
                        gapComposer2.end(false);
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
