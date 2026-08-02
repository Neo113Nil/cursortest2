package com.squareup.cash.marketing.components;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.SliderKt$$ExternalSyntheticLambda7;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.compose.LocalImageLoaderKt;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda1;
import coil3.request.ImageRequest;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Illustrations;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.booklet.ui.BookletTileKt$$ExternalSyntheticLambda7;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.maps.views.ComposableSingletons$CashMapViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.MoneyTabSectionUIKt$$ExternalSyntheticLambda6;
import com.squareup.cash.money.views.MoneyTabThemedHeaderKt$$ExternalSyntheticLambda13;
import com.squareup.cash.money.views.MoneyUiFactory$$ExternalSyntheticLambda1;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda0;
import com.squareup.cash.overlays.OverlaysKt$$ExternalSyntheticLambda1;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda13;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda17;
import com.squareup.cash.wallet.views.CardAppletTileKt$$ExternalSyntheticLambda24;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class CardUpsellKt {

    /* renamed from: lambda$-1022748396, reason: not valid java name */
    public static final ComposableLambdaImpl f464lambda$1022748396 = new ComposableLambdaImpl(new ComposableSingletons$CashMapViewKt$$ExternalSyntheticLambda0(6), false, -1022748396);

    static {
        new ComposableLambdaImpl(new CashMapViewKt$$ExternalSyntheticLambda1(27), false, -1254431366);
        new ComposableLambdaImpl(new CashMapViewKt$$ExternalSyntheticLambda1(28), false, -1861277938);
        new ComposableLambdaImpl(new CashMapViewKt$$ExternalSyntheticLambda1(29), false, 1644613984);
        new ComposableLambdaImpl(new MoneyTabThemedHeaderKt$$ExternalSyntheticLambda13(1), false, -1728752482);
        new ComposableLambdaImpl(new MoneyTabThemedHeaderKt$$ExternalSyntheticLambda13(2), false, 324931387);
    }

    public static final void CardUpsellContainer(int i, Composer composer, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, Function0 function0) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-689392239);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            long j = Strings.getColors(gapComposer).semantic.border.subtle;
            Strings.getSizes(gapComposer).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(modifier, 1.0f, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
            Strings.getSizes(gapComposer).getClass();
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(ImageKt.m177backgroundbw27NRU(ImageKt.m183clickableoSLSa3U$default(ClipKt.clip(m178borderxT4_qwU, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), false, null, null, function0, 15), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape), 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.CenterStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            Recorder$$ExternalSyntheticOutline2.m((i2 >> 6) & 14, composableLambdaImpl, gapComposer, true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardAppletTileKt$$ExternalSyntheticLambda24(modifier, function0, composableLambdaImpl, i, 1);
        }
    }

    public static final void CardUpsellLarge(ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, Function0 function0, Modifier modifier, Function2 function2, Composer composer, int i) {
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1684922225);
        int i2 = (gapComposer.changedInstance(function0) ? 256 : 128) | i | (gapComposer.changed(modifier) ? 2048 : 1024) | (gapComposer.changedInstance(function2) ? 16384 : PKIFailureInfo.certRevoked) | 196608;
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            CardUpsellContainer(((i2 >> 3) & 112) | ((i2 >> 9) & 14) | MLKEMEngine.KyberPolyBytes, gapComposer, Expect_jvmKt.rememberComposableLambda(-911463048, new MoneyTabSectionUIKt$$ExternalSyntheticLambda6(22, function2, composableLambdaImpl, composableLambdaImpl2), gapComposer), modifier, function0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashMapViewKt$$ExternalSyntheticLambda15(composableLambdaImpl, composableLambdaImpl2, function0, modifier, function2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CardUpsellSmall(ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, Function0 function0, Modifier modifier, Function2 function2, CardUpsellIllustration cardUpsellIllustration, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2 function22;
        Function2 function23;
        RecomposeScopeImpl endRestartGroup;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(122256451);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(composableLambdaImpl) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(composableLambdaImpl2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function22 = function2;
                i3 |= gapComposer.changedInstance(function22) ? 16384 : PKIFailureInfo.certRevoked;
                if ((196608 & i) == 0) {
                    i3 |= gapComposer.changed(cardUpsellIllustration) ? PKIFailureInfo.unsupportedVersion : 65536;
                }
                if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
                    Modifier modifier3 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                    Function2 function24 = i4 != 0 ? null : function22;
                    CardUpsellContainer(((i3 >> 3) & 112) | ((i3 >> 9) & 14) | MLKEMEngine.KyberPolyBytes, gapComposer, Expect_jvmKt.rememberComposableLambda(895715628, new MoneyUiFactory$$ExternalSyntheticLambda1(composableLambdaImpl, composableLambdaImpl2, cardUpsellIllustration, function24, 20), gapComposer), modifier3, function0);
                    modifier2 = modifier3;
                    function23 = function24;
                } else {
                    gapComposer.skipToGroupEnd();
                    function23 = function22;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(composableLambdaImpl, composableLambdaImpl2, function0, modifier2, function23, cardUpsellIllustration, i, i2);
                    return;
                }
                return;
            }
            function22 = function2;
            if ((196608 & i) == 0) {
            }
            if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function22 = function2;
        if ((196608 & i) == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: Pointer-Bx497Mc, reason: not valid java name */
    public static final void m3596PointerBx497Mc(ArrowOrientation arrowOrientation, Alignment.Horizontal horizontal, long j, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(59489315);
        int i3 = i & 6;
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        if (i3 == 0) {
            i2 = (gapComposer.changed(columnScopeInstance) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(arrowOrientation.ordinal()) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(horizontal) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(j) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            float f = RecyclerView.DECELERATION_RATE;
            Modifier align = columnScopeInstance.align(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), horizontal);
            if (arrowOrientation == ArrowOrientation.Up) {
                f = 180.0f;
            }
            Modifier rotate = RotateKt.rotate(align, f);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CashMapViewKt$$ExternalSyntheticLambda0(18);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ImageKt.Image(Countries.painterResource(R.drawable.tooltip_pointer, 0, gapComposer), "", SemanticsModifierKt.clearAndSetSemantics(rotate, (Function1) rememberedValue), null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 48, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetScope$$ExternalSyntheticLambda13(i, 6, j, arrowOrientation, horizontal);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    public static final void SmallUpsellCardContent(ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, CardUpsellIllustration cardUpsellIllustration, Modifier modifier, Function2 function2, Composer composer, int i) {
        ComposableLambdaImpl composableLambdaImpl3;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        TextStyle textStyle;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        ?? r1;
        Modifier.Companion companion;
        Unit unit;
        ComposableLambdaImpl composableLambdaImpl4 = composableLambdaImpl2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(520151414);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(composableLambdaImpl) ? 4 : 2) | (gapComposer.changedInstance(composableLambdaImpl4) ? 32 : 16) | (gapComposer.changed(cardUpsellIllustration) ? 256 : 128) | (gapComposer.changed(modifier) ? 2048 : 1024) | (gapComposer.changedInstance(function2) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            TextStyle textStyle2 = Strings.getTypography(gapComposer).labelMedium;
            TextStyle textStyle3 = Strings.getTypography(gapComposer).bodySmall;
            gapComposer.startReplaceGroup(1649314337);
            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            int mo230roundToPx0680j_4 = density.mo230roundToPx0680j_4(16.0f);
            gapComposer.end(false);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = new CashMapViewKt$$ExternalSyntheticLambda0(8);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(modifier, false, (Function1) rememberedValue);
            boolean changed = ((i2 & 896) == 256) | gapComposer.changed(mo230roundToPx0680j_4);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == obj) {
                rememberedValue2 = new CardUpsellKt$SmallUpsellCardContent$2$1(cardUpsellIllustration, mo230roundToPx0680j_4);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue2;
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, measurePolicy, composeUiNode$Companion$SetModifier$14);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$15);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$16);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$17);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (cardUpsellIllustration == null) {
                gapComposer.startReplaceGroup(1638093132);
                gapComposer.end(false);
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$17;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$15;
                textStyle = textStyle3;
                companion = companion2;
                r1 = 0;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                unit = null;
            } else {
                gapComposer.startReplaceGroup(1638093133);
                Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(companion2, cardUpsellIllustration.height);
                ImageRequest.Builder builder = new ImageRequest.Builder((Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext));
                builder.data = Strings.getColors(gapComposer).isLight ? cardUpsellIllustration.lightUrl : cardUpsellIllustration.darkUrl;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$17;
                textStyle = textStyle3;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$15;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                r1 = 0;
                companion = companion2;
                AsyncImageKt.m1441AsyncImagesKDTAoQ(builder.build(), null, (RealImageLoader) gapComposer.consume(LocalImageLoaderKt.LocalImageLoader), m277height3ABfNKs, null, null, null, gapComposer, 48, 0, 4080);
                gapComposer.end(false);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                gapComposer.startReplaceGroup(-916978307);
                SpacerKt.Spacer(gapComposer, companion);
            } else {
                gapComposer.startReplaceGroup(-916990025);
            }
            gapComposer.end(r1);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, r1);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$14);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$13);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$12, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$1);
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ArcadeThemeKt.LocalTextStyle;
            composableLambdaImpl3 = composableLambdaImpl;
            Updater.CompositionLocalProvider(dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(textStyle2), Expect_jvmKt.rememberComposableLambda(-1690180445, new HypeWelcomeUIKt$$ExternalSyntheticLambda0(18, cardUpsellIllustration, composableLambdaImpl3), gapComposer), gapComposer, 56);
            if (function2 == null) {
                gapComposer.startReplaceGroup(1705505898);
                gapComposer.end(r1);
            } else {
                gapComposer.startReplaceGroup(1705505899);
                Updater.CompositionLocalProvider(new ProvidedValue[]{dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(textStyle), re$$ExternalSyntheticOutline0.m(Strings.getColors(gapComposer).semantic.text.subtle, ArcadeThemeKt.LocalTextColor)}, Expect_jvmKt.rememberComposableLambda(1962344009, new HypeWelcomeUIKt$$ExternalSyntheticLambda0(19, cardUpsellIllustration, function2), gapComposer), gapComposer, 56);
                gapComposer.end(r1);
            }
            gapComposer.end(true);
            composableLambdaImpl4 = composableLambdaImpl2;
            coil3.size.SizeKt.ButtonCompact(null, null, ButtonProminence.SUBTLE, false, false, null, Expect_jvmKt.rememberComposableLambda(-2002319003, new OverlayKt$$ExternalSyntheticLambda0(composableLambdaImpl4, 16), gapComposer), gapComposer, 1573254, 58);
            gapComposer.end(true);
        } else {
            composableLambdaImpl3 = composableLambdaImpl;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashMapViewKt$$ExternalSyntheticLambda15(composableLambdaImpl3, composableLambdaImpl4, cardUpsellIllustration, modifier, function2, i);
        }
    }

    /* renamed from: Tooltip-osbwsH8, reason: not valid java name */
    public static final void m3597TooltiposbwsH8(Modifier modifier, String str, float f, Function0 function0, Alignment.Horizontal horizontal, ArrowOrientation arrowOrientation, Composer composer, int i) {
        int i2;
        ArrowOrientation arrowOrientation2;
        long j;
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-427939706);
        Applier applier = gapComposer.applier;
        int i3 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changed(f) ? 256 : 128) | (gapComposer.changedInstance(function0) ? 2048 : 1024) | (gapComposer.changed(horizontal) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(arrowOrientation.ordinal()) ? PKIFailureInfo.unsupportedVersion : 65536);
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            long j2 = Strings.getColors(gapComposer).component.tooltip.background;
            Modifier alpha = AlphaKt.alpha(modifier, ((Number) function0.invoke()).floatValue());
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Strings.getSizes(gapComposer).getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(alpha, 16.0f, 4.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            if (arrowOrientation == ArrowOrientation.Up) {
                gapComposer.startReplaceGroup(637188446);
                i2 = i3;
                m3596PointerBx497Mc(arrowOrientation, horizontal, j2, gapComposer, 6 | ((i3 >> 12) & 112) | ((i2 >> 6) & 896));
                arrowOrientation2 = arrowOrientation;
                j = j2;
                z = false;
                gapComposer.end(false);
            } else {
                i2 = i3;
                arrowOrientation2 = arrowOrientation;
                j = j2;
                z = false;
                gapComposer.startReplaceGroup(637257638);
                gapComposer.end(false);
            }
            Strings.getSizes(gapComposer).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier m292widthInVpY3zN4$default = SizeKt.m292widthInVpY3zN4$default(ImageKt.m177backgroundbw27NRU(ShadowKt.m591shadows4CzXII$default(Modifier.Companion.$$INSTANCE, 12.0f, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f), z, 24), j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(10.0f)), RecyclerView.DECELERATION_RATE, f, 1);
            Strings.getSizes(gapComposer).getClass();
            Strings.getSizes(gapComposer).getClass();
            Strings.getSizes(gapComposer).getClass();
            Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(m292widthInVpY3zN4$default, 16.0f, 12.0f, 16.0f, 16.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m301paddingqDBjuR0);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            long j3 = j;
            Room.m1165Text25TpFw(0, 0, 0, 0, (i2 >> 3) & 14, 0, 4082, Strings.getColors(gapComposer).semantic.text.inverse, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            gapComposer.end(true);
            if (arrowOrientation2 == ArrowOrientation.Down) {
                gapComposer.startReplaceGroup(638007838);
                m3596PointerBx497Mc(arrowOrientation2, horizontal, j3, gapComposer, 6 | ((i2 >> 12) & 112) | ((i2 >> 6) & 896));
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(638077030);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TooltipBoxKt$$ExternalSyntheticLambda8(modifier, str, f, function0, horizontal, arrowOrientation, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005c  */
    /* renamed from: TooltipBox-iHT-50w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3598TooltipBoxiHT50w(Modifier modifier, String str, TooltipState tooltipState, Alignment.Horizontal horizontal, float f, Function0 function0, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        Alignment.Horizontal horizontal2;
        int i3;
        float f2;
        Function0 function02;
        ComposableLambdaImpl composableLambdaImpl2;
        Modifier modifier2;
        GapComposer gapComposer;
        float f3;
        Alignment.Horizontal horizontal3;
        RecomposeScopeImpl endRestartGroup;
        str.getClass();
        tooltipState.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(984730048);
        int i4 = i | 6;
        if ((i & 48) == 0) {
            i4 |= gapComposer2.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer2.changed(tooltipState) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            horizontal2 = horizontal;
            i4 |= gapComposer2.changed(horizontal2) ? 2048 : 1024;
            i3 = i2 & 16;
            if (i3 == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                f2 = f;
                i4 |= gapComposer2.changed(f2) ? 16384 : PKIFailureInfo.certRevoked;
                if ((196608 & i) == 0) {
                    function02 = function0;
                    i4 |= gapComposer2.changedInstance(function02) ? PKIFailureInfo.unsupportedVersion : 65536;
                } else {
                    function02 = function0;
                }
                if ((1572864 & i) == 0) {
                    composableLambdaImpl2 = composableLambdaImpl;
                    i4 |= gapComposer2.changedInstance(composableLambdaImpl2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                } else {
                    composableLambdaImpl2 = composableLambdaImpl;
                }
                if (gapComposer2.shouldExecute(i4 & 1, (599187 & i4) != 599186)) {
                    Alignment.Horizontal horizontal4 = i5 != 0 ? Alignment.Companion.Start : horizontal2;
                    float f4 = i3 != 0 ? 224.0f : f2;
                    int i6 = (i4 & 14) | 48 | (i4 & 896) | (i4 & 7168);
                    int i7 = i4 >> 3;
                    TooltipPopupBox(Expect_jvmKt.rememberComposableLambda(1796035050, new SliderKt$$ExternalSyntheticLambda7(tooltipState, function02, str, f4, horizontal4), gapComposer2), tooltipState, horizontal4, function0, composableLambdaImpl2, gapComposer2, i6 | (57344 & i7) | (i7 & 458752));
                    modifier2 = Modifier.Companion.$$INSTANCE;
                    gapComposer = gapComposer2;
                    f3 = f4;
                    horizontal3 = horizontal4;
                } else {
                    gapComposer2.skipToGroupEnd();
                    modifier2 = modifier;
                    gapComposer = gapComposer2;
                    f3 = f2;
                    horizontal3 = horizontal2;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new BookletTileKt$$ExternalSyntheticLambda7(modifier2, str, tooltipState, horizontal3, f3, function0, composableLambdaImpl, i, i2, 1);
                    return;
                }
                return;
            }
            f2 = f;
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if (gapComposer2.shouldExecute(i4 & 1, (599187 & i4) != 599186)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        horizontal2 = horizontal;
        i3 = i2 & 16;
        if (i3 == 0) {
        }
        f2 = f;
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if (gapComposer2.shouldExecute(i4 & 1, (599187 & i4) != 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void TooltipPopupBox(ComposableLambdaImpl composableLambdaImpl, TooltipState tooltipState, Alignment.Horizontal horizontal, Function0 function0, ComposableLambdaImpl composableLambdaImpl2, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(390938158);
        int i3 = i & 6;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (i3 == 0) {
            i2 = (gapComposer.changed(companion) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(tooltipState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(horizontal) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl2) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        int i4 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
            ComposeUiNode.Companion.getClass();
            Function0 function02 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function02);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            if (tooltipState._alpha$delegate.getFloatValue() > RecyclerView.DECELERATION_RATE) {
                gapComposer.startReplaceGroup(-1681255599);
                boolean z = (i2 & 7168) == 2048;
                Object rememberedValue = gapComposer.rememberedValue();
                Object obj = Composer.Companion.Empty;
                if (z || rememberedValue == obj) {
                    rememberedValue = new PositionProvider(horizontal, new TooltipBoxKt$$ExternalSyntheticLambda2(tooltipState, 0));
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                PositionProvider positionProvider = (PositionProvider) rememberedValue;
                boolean z2 = ((i2 & 896) == 256) | ((57344 & i2) == 16384);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z2 || rememberedValue2 == obj) {
                    rememberedValue2 = new TooltipBoxKt$$ExternalSyntheticLambda3(tooltipState, function0, i4);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                AndroidPopup_androidKt.Popup(positionProvider, (Function0) rememberedValue2, null, Expect_jvmKt.rememberComposableLambda(2107924461, new OverlaysKt$$ExternalSyntheticLambda1(composableLambdaImpl, 17), gapComposer), gapComposer, 3072, 4);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1680950962);
                gapComposer.end(false);
            }
            composableLambdaImpl2.invoke(BoxScopeInstance.INSTANCE, gapComposer, Integer.valueOf(((i2 >> 12) & 112) | 6));
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabToolbarsKt$$ExternalSyntheticLambda17(composableLambdaImpl, tooltipState, horizontal, function0, composableLambdaImpl2, i);
        }
    }

    public static final TooltipState rememberTooltipState(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new TooltipState(coroutineScope);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        return (TooltipState) rememberedValue2;
    }

    public static final CardUpsellIllustration toCardUpsellIllustration(Illustrations illustrations) {
        if (StringsKt__StringsJVMKt.startsWith(illustrations.name(), "MessagingCards", false)) {
            return new CardUpsellIllustration(illustrations.lightUrl, illustrations.height, illustrations.width, illustrations.darkUrl);
        }
        InvalidCardUpsellIllustrationError invalidCardUpsellIllustrationError = new InvalidCardUpsellIllustrationError(illustrations.name());
        ErrorReporter errorReporter = ErrorReporter.Companion.INSTANCE;
        if (errorReporter != null) {
            errorReporter.report(invalidCardUpsellIllustrationError, ErrorReporter.DefaultSamplingStrategy.INSTANCE);
            return null;
        }
        WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
        return null;
    }
}
