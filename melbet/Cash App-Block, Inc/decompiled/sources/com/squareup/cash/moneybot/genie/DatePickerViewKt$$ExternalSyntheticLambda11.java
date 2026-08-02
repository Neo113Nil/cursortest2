package com.squareup.cash.moneybot.genie;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import bo.app.re$$ExternalSyntheticOutline0;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda4;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class DatePickerViewKt$$ExternalSyntheticLambda11 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TextStyle f$0;

    public /* synthetic */ DatePickerViewKt$$ExternalSyntheticLambda11(TextStyle textStyle, int i) {
        this.$r8$classId = i;
        this.f$0 = textStyle;
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
                    TextKt.m561TextNvy7gAk("OK", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, this.f$0, gapComposer, 6, 0, 131070);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    float mo231toDpGaN1DYA = ((Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity)).mo231toDpGaN1DYA(this.f$0.paragraphStyle.lineHeight);
                    String stringResource = Room.stringResource(gapComposer2, R.string.afterpay_applet_view_loading);
                    Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, 16.0f, RecyclerView.DECELERATION_RATE, 2), 2.5f * mo231toDpGaN1DYA, mo231toDpGaN1DYA);
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Modifier alpha = AlphaKt.alpha(ImageKt.m177backgroundbw27NRU(m287sizeVpY3zN4, colors.semantic.background.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(4.0f)), RecyclerView.DECELERATION_RATE);
                    boolean changed = gapComposer2.changed(stringResource);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda4(stringResource, 17);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    BoxKt.Box(SemanticsModifierKt.semantics(alpha, false, (Function1) rememberedValue), gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    TextKt.m561TextNvy7gAk("Cancel", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, this.f$0, gapComposer3, 6, 0, 131070);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
