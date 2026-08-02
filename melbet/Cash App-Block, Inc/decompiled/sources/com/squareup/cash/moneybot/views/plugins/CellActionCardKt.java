package com.squareup.cash.moneybot.views.plugins;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.arcade.values.button.ArcadeButtonProminences;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabx;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.HapticsKt;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.bindings.component.ArcadeComponentProtoBindingKt;
import com.squareup.cash.arcade.components.haptic.HapticVibratorKt;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.moneybot.theme.MoneybotColors;
import com.squareup.cash.moneybot.theme.MoneybotColorsKt;
import com.squareup.cash.moneybot.theme.MoneybotThemeKt;
import com.squareup.cash.moneybot.viewmodels.plugins.CellActionCardViewModel;
import com.squareup.cash.moneybot.views.card.CardUiKt;
import com.squareup.cash.moneybot.views.card.InsightChartKt$$ExternalSyntheticLambda19;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.util.cash.StringsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import okio.ByteString;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import squareup.cash.ui.arcade.elements.ArcadeComponent;
import squareup.cash.ui.arcade.elements.ArcadeComponent$Component$CellDefault;
import squareup.cash.ui.arcade.elements.CellDefault;

/* loaded from: classes6.dex */
public abstract class CellActionCardKt {
    static {
        new CellDefault(new CellDefault.CellDefaultIcon(new CellDefault.CellDefaultIcon.IconStyle.Avatar(new UiAvatar(null, "RD", null, null, null, null, null, 32765)), null, 2, null), StringsKt.localized("Transfer from Rainy days"), StringsKt.localized("If Cash balance is below $500"), new CellDefault.CellDefaultAccessory(new CellDefault.CellDefaultAccessory.Type.Label(StringsKt.localized("$200")), null, 2, null), IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO);
        ArcadeButtonProminences.standard.getClass();
        new CellDefault(null, StringsKt.localized("Review budget"), StringsKt.localized("Every Friday"), null, IptcConstants.IMAGE_RESOURCE_BLOCK_DUOTONE_TRANSFER_FUNCS);
        LocalizedString localized = StringsKt.localized("Buy NVIDIA stock");
        LocalizedString localized2 = StringsKt.localized("Bi-weekly on Wednesdays");
        Image image = new Image("fake:///nvda.png", "fake:///nvda.png", 4);
        zzd zzdVar = Icons.Companion;
        new CellDefault(new CellDefault.CellDefaultIcon(new CellDefault.CellDefaultIcon.IconStyle.Avatar(new UiAvatar(null, null, null, null, image, null, new Icon("0IwHcW"), 30591)), null, 2, null), localized, localized2, null, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
        ArcadeButtonProminences.prominent.getClass();
    }

    public static final void CellActionCard(final CellActionCardViewModel cellActionCardViewModel, Modifier modifier, final Function1 function1, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-719075783);
        int i2 = (gapComposer.changedInstance(cellActionCardViewModel) ? 4 : 2) | i | 48;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            final RealHapticVibrator realHapticVibrator = (RealHapticVibrator) gapComposer.consume(HapticVibratorKt.LocalHapticVibrator);
            final Haptics haptics = (Haptics) gapComposer.consume(HapticsKt.LocalHaptics);
            MoneybotColors moneybotColors = (MoneybotColors) gapComposer.consume(MoneybotThemeKt.LocalMoneybotColors);
            if (moneybotColors == null) {
                gapComposer.startReplaceGroup(-973090538);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                moneybotColors = MoneybotColorsKt.fromArcade(colors);
            } else {
                gapComposer.startReplaceGroup(-973091964);
            }
            gapComposer.end(false);
            final long j = moneybotColors.card.background;
            modifier2 = Modifier.Companion.$$INSTANCE;
            CardUiKt.m3624CardContainerhTdSg4(SizeKt.fillMaxWidth(modifier2, 1.0f), new PaddingValuesImpl(8.0f, 24.0f, 8.0f, 24.0f), RecyclerView.DECELERATION_RATE, j, null, Expect_jvmKt.rememberComposableLambda(1185102441, new Function3() { // from class: com.squareup.cash.moneybot.views.plugins.CellActionCardKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((ColumnScope) obj).getClass();
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                        CellActionCardViewModel cellActionCardViewModel2 = CellActionCardViewModel.this;
                        ArcadeComponent arcadeComponent = new ArcadeComponent(null, new ArcadeComponent$Component$CellDefault(cellActionCardViewModel2.cell), ByteString.EMPTY);
                        Object rememberedValue = gapComposer2.rememberedValue();
                        if (rememberedValue == Composer.Companion.Empty) {
                            rememberedValue = new InsightChartKt$$ExternalSyntheticLambda19(25);
                            gapComposer2.updateRememberedValue(rememberedValue);
                        }
                        ArcadeComponentProtoBindingKt.m3377ArcadeComponentxqIIw2o(arcadeComponent, (Function1) rememberedValue, null, new Color(j), gapComposer2, 48);
                        CellActionCardViewModel.ButtonGroup buttonGroup = cellActionCardViewModel2.buttonGroup;
                        if (buttonGroup == null) {
                            gapComposer2.startReplaceGroup(755932563);
                            gapComposer2.end(false);
                        } else {
                            gapComposer2.startReplaceGroup(755932564);
                            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
                            zzabx.ButtonDefaultGroupHorizontal(null, Expect_jvmKt.rememberComposableLambda(-1560830301, new BasicShieetScope$$ExternalSyntheticLambda0(buttonGroup, realHapticVibrator, haptics, function1, 6), gapComposer2), gapComposer2, 48, 1);
                            gapComposer2.end(false);
                        }
                    } else {
                        gapComposer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 1572912, 52);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda8((Object) cellActionCardViewModel, (Object) modifier2, (Object) function1, false, i, 15);
        }
    }
}
