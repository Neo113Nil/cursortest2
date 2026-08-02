package com.squareup.cash.investing.components;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.TextUnit;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.util.cash.Countries;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class MyInvestmentsTileKt$$ExternalSyntheticLambda6 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ long f$0;

    public /* synthetic */ MyInvestmentsTileKt$$ExternalSyntheticLambda6(long j, int i) {
        this.$r8$classId = i;
        this.f$0 = j;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        long j = this.f$0;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    Trace.m1191Iconww6aTOc(Icons.TickerUp16, Room.stringResource(gapComposer, R.string.investing_components_up_arrow_content_description), SizeKt.fillMaxSize(companion, 1.0f), this.f$0, gapComposer, 390, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    ImageKt.Image(Countries.painterResource(R.drawable.badge_business_customer, 0, gapComposer2), Room.stringResource(gapComposer2, R.string.account_switcher_business_account), SizeKt.fillMaxSize(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, TextUnit.m1059getValueimpl(j), 1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12), 1.0f), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer2, Painter.$stable, 120);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    BoxKt.Box(SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m287sizeVpY3zN4(companion, 100.0f, 20.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(4.0f)), j, rectangleShapeKt$RectangleShape$1), 1.0f), gapComposer3, 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 3:
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    BoxKt.Box(SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m287sizeVpY3zN4(companion, 187.0f, 52.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(4.0f)), j, rectangleShapeKt$RectangleShape$1), 1.0f), gapComposer4, 0);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            default:
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    Trace.m1191Iconww6aTOc(Icons.TickerDown16, Room.stringResource(gapComposer5, R.string.investing_components_down_arrow_content_description), SizeKt.fillMaxSize(companion, 1.0f), this.f$0, gapComposer5, 390, 0);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
