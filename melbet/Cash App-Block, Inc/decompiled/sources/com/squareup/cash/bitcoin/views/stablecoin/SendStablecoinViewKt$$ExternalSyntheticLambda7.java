package com.squareup.cash.bitcoin.views.stablecoin;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.SendStablecoinModel;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class SendStablecoinViewKt$$ExternalSyntheticLambda7 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SendStablecoinModel.Content f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ SendStablecoinViewKt$$ExternalSyntheticLambda7(SendStablecoinModel.Content content, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = content;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Function1 function1 = this.f$1;
        SendStablecoinModel.Content content = this.f$0;
        int i2 = 1;
        switch (i) {
            case 0:
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                titleBarActionScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(titleBarActionScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    TransactorKt.CustomAction(titleBarActionScope, null, null, Expect_jvmKt.rememberComposableLambda(1058315585, new SendStablecoinViewKt$$ExternalSyntheticLambda7(content, function1, i2), gapComposer), gapComposer, (14 & intValue) | 3072, 3);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (!gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    gapComposer2.skipToGroupEnd();
                } else if (content.buttonEnabled) {
                    gapComposer2.startReplaceGroup(-1075273197);
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new BitcoinMapViewKt$$ExternalSyntheticLambda6(17, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    KeypadKt.IconButton(PlatformKt.withHaptics((Function0) rememberedValue, null, gapComposer2, 0, 1), null, null, false, SendStablecoinViewKt.lambda$48401528, gapComposer2, 24576, 14);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(-1074827262);
                    Trace.m1191Iconww6aTOc(Icons.NavigationScanQr, Room.stringResource(gapComposer2, R.string.bitcoin_toolbar_scanner_title), SizeKt.m285size3ABfNKs(companion, 24.0f), Color.m675copywmQWz5c$default(0.5f, ((Color) gapComposer2.consume(ArcadeThemeKt.LocalIconColor)).value, 14), gapComposer2, 390, 0);
                    gapComposer2.end(false);
                }
                break;
            default:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, 16.0f, 1), 1.0f);
                    boolean z = content.buttonEnabled;
                    boolean changed2 = gapComposer3.changed(function1);
                    Object rememberedValue2 = gapComposer3.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new BitcoinMapViewKt$$ExternalSyntheticLambda6(16, function1);
                        gapComposer3.updateRememberedValue(rememberedValue2);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, fillMaxWidth, buttonProminence, false, z, null, SendStablecoinViewKt.lambda$1410083836, gapComposer3, 1573296, 40);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
