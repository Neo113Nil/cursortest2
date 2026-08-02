package com.squareup.cash.common.composeui;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.views.internal.LocalViewsKt;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes7.dex */
public final /* synthetic */ class ArcadeBannerCardKt$$ExternalSyntheticLambda4 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ ArcadeBannerCardKt$$ExternalSyntheticLambda4(String str, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = j;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, this.f$1, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, this.f$0, (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                BoxScope boxScope = (BoxScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                boxScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(boxScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (!gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 19) != 18)) {
                    gapComposer2.skipToGroupEnd();
                } else if (this.f$0 == null) {
                    gapComposer2.startReplaceGroup(-936870221);
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(boxScope.align(Modifier.Companion.$$INSTANCE, Alignment.Companion.Center), 16.0f);
                    Painter painter = Icons.DiscountTagFill16.painter(gapComposer2);
                    long j = this.f$1;
                    ImageKt.Image(painter, null, m285size3ABfNKs, null, ContentScale.Companion.FillBounds, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer2, Painter.$stable | 24624, 40);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(-936578108);
                    LocalViewsKt.LocalImagePlaceholder(gapComposer2, 0);
                    gapComposer2.end(false);
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, this.f$1, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, this.f$0, (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 3:
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, this.f$1, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, this.f$0, (Map) null, (Function1) null, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            case 4:
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, this.f$1, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, this.f$0, (Map) null, (Function1) null, false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
            case 5:
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, this.f$1, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, this.f$0, (Map) null, (Function1) null, false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                break;
            case 6:
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, this.f$1, (Composer) gapComposer7, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, this.f$0, (Map) null, (Function1) null, false);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                break;
            case 7:
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, this.f$1, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, this.f$0, (Map) null, (Function1) null, false);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                break;
            case 8:
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, this.f$1, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, this.f$0, (Map) null, (Function1) null, false);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                break;
            default:
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, this.f$1, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, this.f$0, (Map) null, (Function1) null, false);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
