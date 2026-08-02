package com.squareup.cash.bitcoin.views.stablecoin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.graphics.ColorKt;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda4;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.SendStablecoinModel;
import com.squareup.cash.bitcoin.views.send.MoveBitcoinViewKt$$ExternalSyntheticLambda3;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class SendStablecoinViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SendStablecoinModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ SendStablecoinViewKt$$ExternalSyntheticLambda0(SendStablecoinModel sendStablecoinModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = sendStablecoinModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        int i2 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    ArcadeThemeKt.ArcadeTheme(DimensionKt.m1468withTint4WTKRHQ(colors, ColorKt.Color(4280776138L)), null, null, Expect_jvmKt.rememberComposableLambda(-1862049334, new SendStablecoinViewKt$$ExternalSyntheticLambda0(this.f$0, function1, i2), gapComposer), gapComposer, 3072, 6);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    SendStablecoinModel sendStablecoinModel = this.f$0;
                    boolean z = !(sendStablecoinModel instanceof SendStablecoinModel.Content);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new MoveBitcoinViewKt$$ExternalSyntheticLambda3(4);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    Strings.LoadableFullScreenContent(sendStablecoinModel, z, null, (Function1) rememberedValue, null, Expect_jvmKt.rememberComposableLambda(-1715818063, new LocalViewFactory$$ExternalSyntheticLambda4(sendStablecoinModel, function1), gapComposer2), gapComposer2, 199680, 20);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
