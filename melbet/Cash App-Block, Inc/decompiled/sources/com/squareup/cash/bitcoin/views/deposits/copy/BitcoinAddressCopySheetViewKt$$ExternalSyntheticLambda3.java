package com.squareup.cash.bitcoin.views.deposits.copy;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsLightKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.bitcoin.viewmodels.WalletAddressOptionsViewModel;
import com.squareup.cash.bitcoin.views.deposits.BitcoinDepositsViewKt;
import com.squareup.cash.bitcoin.views.map.BitcoinLocationViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.qrcodes.viewmodels.QrCodeModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class BitcoinAddressCopySheetViewKt$$ExternalSyntheticLambda3 implements Function3 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ WalletAddressOptionsViewModel.Content f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ BitcoinAddressCopySheetViewKt$$ExternalSyntheticLambda3(WalletAddressOptionsViewModel.Content content, Function1 function1) {
        this.f$0 = content;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        WalletAddressOptionsViewModel.Content content = this.f$0;
        Function1 function1 = this.f$1;
        int i2 = 1;
        switch (i) {
            case 0:
                ColumnScope columnScope = (ColumnScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                columnScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(columnScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 240.0f);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                    Object obj4 = DefaultSizes.border.entries;
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(m285size3ABfNKs, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)), ColorsLightKt.colorsLight.semantic.background.f1047app, ColorKt.RectangleShape);
                    ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    long j = colors.semantic.border.subtle;
                    ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                    Modifier align = columnScope.align(ImageKt.m178borderxT4_qwU(m177backgroundbw27NRU, 2.0f, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)), Alignment.Companion.CenterHorizontally);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, align);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    QrCodeModel qrCodeModel = content.qrCodeModel;
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new SsnViewKt$$ExternalSyntheticLambda0(13);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Function0 function0 = (Function0) rememberedValue;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new BitcoinLocationViewKt$$ExternalSyntheticLambda1(6, function1);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    BitcoinDepositsViewKt.m3415BitcoinDepositQrCodeRFMEUTM(qrCodeModel, function0, null, (Function0) rememberedValue2, false, null, 0L, gapComposer, 48, 116);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                adaptiveStackScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(adaptiveStackScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    boolean changed2 = gapComposer2.changed(function1);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new BitcoinLocationViewKt$$ExternalSyntheticLambda1(3, function1);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue3, adaptiveStackScope.horizontalWeight(companion, 1.0f), null, false, content.walletAddress != null, null, Expect_jvmKt.rememberComposableLambda(-1456233102, new SsnViewKt$$ExternalSyntheticLambda2(content, i2), gapComposer2), gapComposer2, 1572864, 44);
                    boolean changed3 = gapComposer2.changed(function1);
                    Object rememberedValue4 = gapComposer2.rememberedValue();
                    if (changed3 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new BitcoinLocationViewKt$$ExternalSyntheticLambda1(4, function1);
                        gapComposer2.updateRememberedValue(rememberedValue4);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue4, adaptiveStackScope.horizontalWeight(companion, 1.0f), null, false, false, null, BitcoinAddressCopySheetViewKt.lambda$1348008411, gapComposer2, 1572864, 60);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ BitcoinAddressCopySheetViewKt$$ExternalSyntheticLambda3(Function1 function1, WalletAddressOptionsViewModel.Content content) {
        this.f$1 = function1;
        this.f$0 = content;
    }
}
