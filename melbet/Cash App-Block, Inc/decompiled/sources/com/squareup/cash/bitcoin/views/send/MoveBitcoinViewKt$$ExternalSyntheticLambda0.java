package com.squareup.cash.bitcoin.views.send;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.Expect_jvmKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.bitcoin.viewmodels.MoveBitcoinModel;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class MoveBitcoinViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MoveBitcoinModel f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ MoveBitcoinViewKt$$ExternalSyntheticLambda0(MoveBitcoinModel moveBitcoinModel, boolean z, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = moveBitcoinModel;
        this.f$1 = z;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$2;
        boolean z = this.f$1;
        int i2 = 0;
        int i3 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                    Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    ArcadeThemeKt.ArcadeTheme(DimensionKt.m1468withTint4WTKRHQ(colors, colors2.semantic.icon.brand), null, null, Expect_jvmKt.rememberComposableLambda(1078023453, new MoveBitcoinViewKt$$ExternalSyntheticLambda0(this.f$0, z, function1, i3), gapComposer), gapComposer, 3072, 6);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    MoveBitcoinModel moveBitcoinModel = this.f$0;
                    boolean z2 = !(moveBitcoinModel instanceof MoveBitcoinModel.Content);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new MoveBitcoinViewKt$$ExternalSyntheticLambda3(i2);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    Strings.LoadableFullScreenContent(moveBitcoinModel, z2, null, (Function1) rememberedValue, null, Expect_jvmKt.rememberComposableLambda(-1938122853, new MoveBitcoinViewKt$$ExternalSyntheticLambda4(moveBitcoinModel, z, function1), gapComposer2), gapComposer2, 199680, 20);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
