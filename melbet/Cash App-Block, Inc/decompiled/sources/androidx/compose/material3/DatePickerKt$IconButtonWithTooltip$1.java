package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final class DatePickerKt$IconButtonWithTooltip$1 implements Function3 {
    public final /* synthetic */ String $contentDescription;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ DatePickerKt$IconButtonWithTooltip$1(String str, int i) {
        this.$r8$classId = i;
        this.$contentDescription = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i2 = 1;
        switch (i) {
            case 0:
                TooltipScopeImpl tooltipScopeImpl = (TooltipScopeImpl) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= (intValue & 8) == 0 ? ((GapComposer) composer).changed(tooltipScopeImpl) : ((GapComposer) composer).changedInstance(tooltipScopeImpl) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    TooltipKt.m562PlainTooltipgv3ox5I(tooltipScopeImpl, null, RecyclerView.DECELERATION_RATE, null, 0L, 0L, Expect_jvmKt.rememberComposableLambda(1905952188, new DateInputKt$DateInputContent$3(this.$contentDescription, i2), gapComposer), gapComposer, (intValue & 14) | 805306368);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Number) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, this.$contentDescription, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj2;
                ((Number) obj3).intValue();
                ((AnimatedVisibilityScope) obj).getClass();
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                GapComposer gapComposer3 = (GapComposer) composer3;
                TextStyle textStyle = ((com.squareup.cash.arcade.Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                } else {
                    gapComposer3.startReplaceGroup(-1762997739);
                    gapComposer3.end(false);
                }
                Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3824, colors.surface.keypad.text, composer3, fillMaxWidth, textStyle, (TextLineBalancing) null, this.$contentDescription, (Map) null, (Function1) null, false);
                break;
            case 3:
                Composer composer4 = (Composer) obj2;
                ((Number) obj3).intValue();
                ((AnimatedVisibilityScope) obj).getClass();
                Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                GapComposer gapComposer4 = (GapComposer) composer4;
                TextStyle textStyle2 = ((com.squareup.cash.arcade.Typography) gapComposer4.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                Colors colors2 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                } else {
                    gapComposer4.startReplaceGroup(-1762997739);
                    gapComposer4.end(false);
                }
                Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3824, colors2.surface.keypad.text, composer4, fillMaxWidth2, textStyle2, (TextLineBalancing) null, this.$contentDescription, (Map) null, (Function1) null, false);
                break;
            case 4:
                Composer composer5 = (Composer) obj2;
                int intValue3 = ((Number) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    VisibleKt.m3489EmojiIconDzVHIIc(this.$contentDescription, 28.0f, null, null, gapComposer5, 48, 12);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
            default:
                Composer composer6 = (Composer) obj2;
                int intValue4 = ((Number) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, this.$contentDescription, (Map) null, (Function1) null, false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
