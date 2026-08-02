package com.squareup.cash.moneybot.views.card;

import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.arcade.bindings.component.ArcadeComponentEvent;
import com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewEvent;
import com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewModel;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class InsightChartKt$$ExternalSyntheticLambda19 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ InsightChartKt$$ExternalSyntheticLambda19(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        switch (i) {
            case 0:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 1:
                throw Boxes$$ExternalSyntheticOutline1.m(obj);
            case 2:
                ((MoneybotChatViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 3:
                ((MoneybotChatViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj).intValue();
                return Unit.INSTANCE;
            case 5:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 6:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope.getClass();
                reusableGraphicsLayerScope.setClip(false);
                return Unit.INSTANCE;
            case 7:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.m949setLiveRegionhR3wRGc(semanticsPropertyReceiver, 0);
                return Unit.INSTANCE;
            case 8:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 9:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 10:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 11:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 12:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj).intValue();
                return Unit.INSTANCE;
            case 14:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope2 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope2.getClass();
                reusableGraphicsLayerScope2.setClip(false);
                return Unit.INSTANCE;
            case 15:
                ((MoneybotHomeViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 16:
                MoneybotHomeViewModel.WidgetCard widgetCard = (MoneybotHomeViewModel.WidgetCard) obj;
                widgetCard.getClass();
                return widgetCard.lazyColumnKey;
            case 17:
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 18:
                ((Throwable) obj).getClass();
                return Unit.INSTANCE;
            case 19:
                ((RowScope) obj).getClass();
                return companion;
            case 20:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 21:
                ((RowScope) obj).getClass();
                return companion;
            case 22:
                ((RowScope) obj).getClass();
                return companion;
            case 23:
                ((RowScope) obj).getClass();
                return companion;
            case 24:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 25:
                ((ArcadeComponentEvent) obj).getClass();
                return Unit.INSTANCE;
            case 26:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver2, 0);
                return Unit.INSTANCE;
            case 27:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 28:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            default:
                KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = (KeyframesSpec.KeyframesSpecConfig) obj;
                keyframesSpecConfig.getClass();
                keyframesSpecConfig.durationMillis = 2050;
                KeyframesSpec.KeyframeEntity at = keyframesSpecConfig.at(Float.valueOf(RecyclerView.DECELERATION_RATE), 0);
                Drop$$ExternalSyntheticBUOutline0 drop$$ExternalSyntheticBUOutline0 = EasingKt.LinearEasing;
                at.easing = drop$$ExternalSyntheticBUOutline0;
                Float valueOf = Float.valueOf(1.0f);
                keyframesSpecConfig.at(valueOf, 1800).easing = drop$$ExternalSyntheticBUOutline0;
                keyframesSpecConfig.at(valueOf, 2050);
                return Unit.INSTANCE;
        }
    }
}
