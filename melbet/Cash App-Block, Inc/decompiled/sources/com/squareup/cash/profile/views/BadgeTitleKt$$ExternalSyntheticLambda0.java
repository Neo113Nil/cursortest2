package com.squareup.cash.profile.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.TextUnit;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.ColorsLightKt;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class BadgeTitleKt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ long f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ BadgeTitleKt$$ExternalSyntheticLambda0(int i, long j, long j2) {
        this.$r8$classId = i;
        this.f$0 = j;
        this.f$1 = j2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        final long j = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    Trace.m1191Iconww6aTOc(Icons.Business16, Room.stringResource(gapComposer, R.string.account_switcher_business_account), SizeKt.fillMaxSize(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, TextUnit.m1059getValueimpl(j), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), 1.0f), this.f$1, gapComposer, 6, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Colors m3376createLightmxwnekA$default = colors.isLight ? ColorsLightKt.m3376createLightmxwnekA$default(3, 0L) : ColorsDarkKt.m3375createDarkmxwnekA$default(3, 0L);
                    final long j2 = this.f$1;
                    ArcadeThemeKt.ArcadeTheme(m3376createLightmxwnekA$default, null, null, Expect_jvmKt.rememberComposableLambda(-1072955045, new Function2() { // from class: com.squareup.cash.family.requestsponsorship.views.SponsorRowViewKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            Composer composer3 = (Composer) obj4;
                            int intValue3 = ((Integer) obj5).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                Modifier aspectRatio = OffsetKt.aspectRatio(TextUnit.m1059getValueimpl(j) / TextUnit.m1059getValueimpl(j2), SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f), false);
                                Painter painter = Icons.CashAppCustomer16.painter(gapComposer3);
                                BiasAlignment biasAlignment = Alignment.Companion.CenterStart;
                                Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                if (colors2 == null) {
                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1762997739);
                                    gapComposer3.end(false);
                                }
                                long j3 = colors2.semantic.icon.brand;
                                ImageKt.Image(painter, Room.stringResource(gapComposer3, R.string.sponsor_row_cash_logo_description), aspectRatio, biasAlignment, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j3, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j3), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer3, Painter.$stable | 3072, 48);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer2), gapComposer2, 3072, 6);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
