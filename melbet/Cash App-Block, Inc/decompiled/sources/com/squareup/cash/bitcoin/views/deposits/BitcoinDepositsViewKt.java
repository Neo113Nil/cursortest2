package com.squareup.cash.bitcoin.views.deposits;

import android.graphics.Bitmap;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda2;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.local.views.brand.orders.OrderStatusRowKt$$ExternalSyntheticLambda1;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda30;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsLightKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.benefits.views.BenefitsHubViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.bitcoin.viewmodels.BitcoinDepositsViewModel;
import com.squareup.cash.bitcoin.views.BitcoinUiFactory$$ExternalSyntheticLambda12;
import com.squareup.cash.bitcoin.views.map.BitcoinLocationViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda2;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda0;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda10;
import com.squareup.cash.pools.views.PoolErrorViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.qrcodes.viewmodels.QrCodeModel;
import com.squareup.cash.ui.util.RealCashScreenBrightness;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class BitcoinDepositsViewKt {

    /* renamed from: lambda$-1507194602, reason: not valid java name */
    public static final ComposableLambdaImpl f258lambda$1507194602 = new ComposableLambdaImpl(new AvatarsKt$$ExternalSyntheticLambda0(24), false, -1507194602);

    /* renamed from: lambda$-473990806, reason: not valid java name */
    public static final ComposableLambdaImpl f259lambda$473990806 = new ComposableLambdaImpl(new AvatarsKt$$ExternalSyntheticLambda0(25), false, -473990806);

    public static final void BitcoinDepositContent(BitcoinDepositsViewModel bitcoinDepositsViewModel, Function1 function1, Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        NavigationType navigationType;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1044513251);
        int i4 = i | (gapComposer.changedInstance(bitcoinDepositsViewModel) ? 4 : 2);
        if ((i & 48) == 0) {
            i4 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | MLKEMEngine.KyberPolyBytes;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i4 | (gapComposer.changed(modifier2) ? 256 : 128);
        }
        int i6 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier modifier4 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            Modifier fillMaxSize = SizeKt.fillMaxSize(modifier4, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, systemBarsPadding);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            boolean z = bitcoinDepositsViewModel instanceof BitcoinDepositsViewModel.Loaded;
            if (z) {
                navigationType = ((BitcoinDepositsViewModel.Loaded) bitcoinDepositsViewModel).navigationType == BitcoinDepositsViewModel.Loaded.NavigationType.Close ? NavigationType.CLOSE : NavigationType.BACK;
            } else {
                if (!Intrinsics.areEqual(bitcoinDepositsViewModel, BitcoinDepositsViewModel.Loading.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                navigationType = NavigationType.CLOSE;
            }
            boolean z2 = (i3 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z2 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new BitcoinLocationViewKt$$ExternalSyntheticLambda1(2, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, Expect_jvmKt.rememberComposableLambda(1060904088, new BorrowHomeKt$$ExternalSyntheticLambda0(i6, bitcoinDepositsViewModel, function1), gapComposer), gapComposer, 1572870, 44);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            boolean z3 = !z;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new BenefitsHubViewKt$$ExternalSyntheticLambda2(27);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            gapComposer = gapComposer;
            Strings.LoadableFullScreenContent(bitcoinDepositsViewModel, z3, null, (Function1) rememberedValue2, null, Expect_jvmKt.rememberComposableLambda(-817975188, new SetPinViewKt$$ExternalSyntheticLambda4(14, function1), gapComposer), gapComposer, (i3 & 14) | 199680, 20);
            gapComposer.end(true);
            modifier3 = modifier4;
        } else {
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OrderStatusRowKt$$ExternalSyntheticLambda1(bitcoinDepositsViewModel, function1, modifier3, i, i2, 17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0083  */
    /* renamed from: BitcoinDepositQrCode-RFMEUTM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3415BitcoinDepositQrCodeRFMEUTM(final QrCodeModel qrCodeModel, final Function0 function0, Modifier modifier, final Function0 function02, boolean z, PaddingValues paddingValues, long j, Composer composer, final int i, final int i2) {
        boolean z2;
        int i3;
        PaddingValues paddingValues2;
        int i4;
        int i5;
        long j2;
        final Modifier modifier2;
        final long j3;
        final boolean z3;
        final PaddingValues paddingValues3;
        RecomposeScopeImpl endRestartGroup;
        PaddingValues paddingValues4;
        Modifier modifier3;
        boolean z4;
        qrCodeModel.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-918236257);
        int i6 = i | (gapComposer.changedInstance(qrCodeModel) ? 4 : 2);
        if ((i & 48) == 0) {
            i6 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        int i7 = i6 | MLKEMEngine.KyberPolyBytes | (gapComposer.changedInstance(function02) ? 2048 : 1024);
        int i8 = i2 & 16;
        if (i8 != 0) {
            i3 = i7 | 24576;
            z2 = z;
        } else {
            z2 = z;
            i3 = i7 | (gapComposer.changed(z2) ? 16384 : PKIFailureInfo.certRevoked);
        }
        if ((i2 & 32) == 0) {
            paddingValues2 = paddingValues;
            if (gapComposer.changed(paddingValues2)) {
                i4 = PKIFailureInfo.unsupportedVersion;
                i5 = i3 | i4;
                if ((i & 1572864) != 0) {
                    j2 = j;
                    i5 |= ((i2 & 64) == 0 && gapComposer.changed(j2)) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                } else {
                    j2 = j;
                }
                if (gapComposer.shouldExecute(i5 & 1, (599187 & i5) == 599186)) {
                    gapComposer.skipToGroupEnd();
                    modifier2 = modifier;
                    j3 = j2;
                    z3 = z2;
                    paddingValues3 = paddingValues2;
                } else {
                    gapComposer.startDefaults();
                    if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                        if (i8 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 32) != 0) {
                            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                            DefaultSizes.spacing.getClass();
                            paddingValues4 = new PaddingValuesImpl(8.0f, 8.0f, 8.0f, 8.0f);
                        } else {
                            paddingValues4 = paddingValues2;
                        }
                        int i9 = i2 & 64;
                        modifier3 = Modifier.Companion.$$INSTANCE;
                        if (i9 != 0) {
                            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                            if (colors == null) {
                                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                            } else {
                                gapComposer.startReplaceGroup(-1762997739);
                                gapComposer.end(false);
                            }
                            j2 = colors.semantic.icon.brand;
                        }
                        z4 = z2;
                        j3 = j2;
                        paddingValues3 = paddingValues4;
                    } else {
                        gapComposer.skipToGroupEnd();
                        z4 = z2;
                        j3 = j2;
                        paddingValues3 = paddingValues2;
                        modifier3 = modifier;
                    }
                    gapComposer.endDefaults();
                    Modifier modifier4 = modifier3;
                    ArcadeThemeKt.ArcadeTheme(DimensionKt.m1468withTint4WTKRHQ(ColorsLightKt.colorsLight, j3), null, null, Expect_jvmKt.rememberComposableLambda(-1459055180, new TooltipKt$$ExternalSyntheticLambda2(modifier4, function02, qrCodeModel, z4, function0, paddingValues3), gapComposer), gapComposer, 3072, 6);
                    modifier2 = modifier4;
                    z3 = z4;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                    endRestartGroup.block = new Function2() { // from class: com.squareup.cash.bitcoin.views.deposits.BitcoinDepositQrCodeKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            BitcoinDepositsViewKt.m3415BitcoinDepositQrCodeRFMEUTM(QrCodeModel.this, function0, modifier2, function02, z3, paddingValues3, j3, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
        } else {
            paddingValues2 = paddingValues;
        }
        i4 = 65536;
        i5 = i3 | i4;
        if ((i & 1572864) != 0) {
        }
        if (gapComposer.shouldExecute(i5 & 1, (599187 & i5) == 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void BitcoinDepositQrContent(BitcoinDepositsViewModel.Loaded loaded, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Function1 function12;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-564146642);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(loaded) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxSize(companion, 1.0f), ImageKt.rememberScrollState(gapComposer), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            BitcoinDepositsQrCode(loaded, function1, null, gapComposer, i3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).helpText;
            String str = loaded.descriptionText;
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3832, 0L, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            DBUtil.SpacerWithinSectionMedium(0, 0, gapComposer, new LayoutWeightElement(1.0f, true));
            if (loaded.showAdjustButton || loaded.showShareButton) {
                gapComposer.startReplaceGroup(-48497783);
                function12 = function1;
                DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(437859009, new BorrowHomeKt$$ExternalSyntheticLambda0(2, loaded, function12), gapComposer), gapComposer, 24576, 15);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-47924066);
                gapComposer.end(false);
                function12 = function1;
            }
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinDepositsViewKt$$ExternalSyntheticLambda10(loaded, function12, modifier2, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v16 */
    public static final void BitcoinDepositsQrCode(BitcoinDepositsViewModel.Loaded loaded, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        GapComposer gapComposer;
        Modifier.Companion companion;
        boolean z;
        GapComposer gapComposer2;
        ?? r8;
        GapComposer gapComposer3;
        GapComposer gapComposer4 = (GapComposer) composer;
        gapComposer4.startRestartGroup(-1036863305);
        Applier applier = gapComposer4.applier;
        if ((i & 6) == 0) {
            i2 = i | (gapComposer4.changedInstance(loaded) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer4.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer4.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Strings.getSizes(gapComposer4).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier clip = ClipKt.clip(SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
            long j = ColorsLightKt.colorsLight.semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(clip, j, rectangleShapeKt$RectangleShape$1);
            Strings.getSizes(gapComposer4).getClass();
            Object obj = DefaultSizes.border.annotationsMap;
            Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(m177backgroundbw27NRU, 2.0f, Strings.getColors(gapComposer4).semantic.border.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer4, 0);
            int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, m178borderxT4_qwU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer4.startReusableNode();
            if (gapComposer4.inserting) {
                gapComposer4.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer4.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer4, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer4, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer4, materializeModifier, composeUiNode$Companion$SetModifier$14);
            QrCodeModel qrCodeModel = loaded.qrCodeModel;
            boolean z2 = loaded.hasError;
            Strings.getSizes(gapComposer4).getClass();
            PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(16.0f, 16.0f, 16.0f, 16.0f);
            int i4 = i3 & 112;
            boolean z3 = i4 == 32;
            Object rememberedValue = gapComposer4.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z3 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new BitcoinDepositsViewKt$$ExternalSyntheticLambda11(25, function1);
                gapComposer4.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            boolean z4 = i4 == 32;
            Object rememberedValue2 = gapComposer4.rememberedValue();
            if (z4 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new BitcoinDepositsViewKt$$ExternalSyntheticLambda11(26, function1);
                gapComposer4.updateRememberedValue(rememberedValue2);
            }
            GapComposer gapComposer5 = gapComposer4;
            m3415BitcoinDepositQrCodeRFMEUTM(qrCodeModel, function0, null, (Function0) rememberedValue2, z2, paddingValuesImpl, 0L, gapComposer5, 0, 68);
            String str = loaded.formattedAmount;
            String str2 = loaded.formattedSubAmount;
            if (str != null) {
                gapComposer5.startReplaceGroup(-254015331);
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(ImageKt.m177backgroundbw27NRU(companion2, Strings.getColors(gapComposer5).semantic.background.brand, rectangleShapeKt$RectangleShape$1), 1.0f);
                boolean z5 = i4 == 32;
                Object rememberedValue3 = gapComposer5.rememberedValue();
                if (z5 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new BitcoinDepositsViewKt$$ExternalSyntheticLambda11(27, function1);
                    gapComposer5.updateRememberedValue(rememberedValue3);
                }
                Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(fillMaxWidth, false, null, null, (Function0) rememberedValue3, 15);
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer5, 0);
                int hashCode2 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer5.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer5, m183clickableoSLSa3U$default);
                gapComposer5.startReusableNode();
                if (gapComposer5.inserting) {
                    gapComposer5.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer5.useNode();
                }
                Updater.m576setimpl(gapComposer5, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer5, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer5, composeUiNode$Companion$SetModifier$13, gapComposer5, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer5, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer5, null);
                companion = companion2;
                Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3824, Strings.getColors(gapComposer5).semantic.text.inverse, (Composer) gapComposer5, SizeKt.fillMaxWidth(companion2, 1.0f), Strings.getTypography(gapComposer5).hero, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                GapComposer gapComposer6 = gapComposer5;
                if (str2 != null) {
                    gapComposer6.startReplaceGroup(238682970);
                    Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3824, Strings.getColors(gapComposer6).semantic.text.inverse, (Composer) gapComposer6, SizeKt.fillMaxWidth(companion, 1.0f), Strings.getTypography(gapComposer6).buttonCompact, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                    GapComposer gapComposer7 = gapComposer6;
                    r8 = 0;
                    gapComposer7.end(false);
                    gapComposer3 = gapComposer7;
                } else {
                    r8 = 0;
                    gapComposer6.startReplaceGroup(238948516);
                    gapComposer6.end(false);
                    gapComposer3 = gapComposer6;
                }
                z = true;
                DBUtil.SpacerWithinSectionMedium(r8, 1, gapComposer3, null);
                gapComposer3.end(true);
                gapComposer3.end(r8);
                gapComposer2 = gapComposer3;
            } else {
                companion = companion2;
                z = true;
                gapComposer5.startReplaceGroup(-253161963);
                gapComposer5.end(false);
                gapComposer2 = gapComposer5;
            }
            gapComposer2.end(z);
            modifier2 = companion;
            gapComposer = gapComposer2;
        } else {
            GapComposer gapComposer8 = gapComposer4;
            gapComposer8.skipToGroupEnd();
            modifier2 = modifier;
            gapComposer = gapComposer8;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinDepositsViewKt$$ExternalSyntheticLambda10(loaded, function1, modifier2, i, 1);
        }
    }

    public static final void BitcoinDepositsView(BitcoinDepositsViewModel bitcoinDepositsViewModel, Function1 function1, RealCashScreenBrightness realCashScreenBrightness, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        bitcoinDepositsViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(802522302);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(bitcoinDepositsViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realCashScreenBrightness) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            boolean changedInstance = gapComposer.changedInstance(realCashScreenBrightness);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new BitcoinDepositsViewKt$$ExternalSyntheticLambda0(realCashScreenBrightness, 0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.DisposableEffect(realCashScreenBrightness, (Function1) rememberedValue, gapComposer);
            boolean z = (i3 & 112) == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new BitcoinLocationViewKt$$ExternalSyntheticLambda1(1, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue2, gapComposer, 0, 1);
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
            ArcadeThemeKt.ArcadeTheme(DimensionKt.m1468withTint4WTKRHQ(colors, colors2.semantic.icon.brand), null, null, Expect_jvmKt.rememberComposableLambda(-1782203757, new BitcoinUiFactory$$ExternalSyntheticLambda12(bitcoinDepositsViewModel, function1), gapComposer), gapComposer, 3072, 6);
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BookletGridKt$$ExternalSyntheticLambda2((Object) bitcoinDepositsViewModel, function1, (Object) realCashScreenBrightness, modifier2, i, 13);
        }
    }

    public static final void QrCodeOrError(Bitmap bitmap, boolean z, Function0 function0, PaddingValues paddingValues, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2049826489);
        int i2 = (gapComposer.changedInstance(bitmap) ? 4 : 2) | i | (gapComposer.changed(z) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128) | (gapComposer.changed(paddingValues) ? 2048 : 1024);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            gapComposer.skipToGroupEnd();
        } else if (bitmap != null) {
            gapComposer.startReplaceGroup(-535737671);
            ImageKt.m176Image5hnEew(new AndroidImageBitmap(bitmap), Room.stringResource(gapComposer, R.string.bitcoin_qr_code_content_description), SpacerKt.padding(modifier, paddingValues), null, null, gapComposer, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
            gapComposer.end(false);
        } else if (z) {
            gapComposer.startReplaceGroup(-535525662);
            QrError(((i2 >> 6) & 14) | 48, gapComposer, modifier, function0);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-535470885);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda30(bitmap, z, function0, paddingValues, modifier, i, 3);
        }
    }

    public static final void QrError(int i, Composer composer, Modifier modifier, Function0 function0) {
        int i2;
        int i3;
        int i4;
        Function0 function02 = function0;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-397213325);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(function02) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        int i5 = i2;
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 19) != 18)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            String stringResource = Room.stringResource(gapComposer, R.string.bitcoin_deposit_error_title);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
            Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3832, 0L, (Composer) gapComposer, fillMaxWidth, ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).titleBarPageTitle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
            String stringResource2 = Room.stringResource(gapComposer, R.string.bitcoin_deposit_error_description);
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            TextStyle textStyle = ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).bodyMedium;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                i4 = 0;
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                i4 = 0;
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3824, colors.semantic.text.subtle, (Composer) gapComposer, fillMaxWidth2, textStyle, (TextLineBalancing) null, stringResource2, (Map) null, (Function1) null, false);
            DBUtil.SpacerBetweenSectionLarge(i4, 1, gapComposer, null);
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            int i6 = (i5 & 14) == 4 ? 1 : i4;
            Object rememberedValue = gapComposer.rememberedValue();
            if (i6 != 0 || rememberedValue == Composer.Companion.Empty) {
                function02 = function0;
                rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda10(6, function02);
                gapComposer.updateRememberedValue(rememberedValue);
            } else {
                function02 = function0;
            }
            coil3.size.SizeKt.Button((Function0) rememberedValue, null, buttonProminence, false, false, null, f258lambda$1507194602, gapComposer, 1573248, 58);
            gapComposer = gapComposer;
            i3 = 1;
            gapComposer.end(true);
        } else {
            i3 = 1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolErrorViewKt$$ExternalSyntheticLambda0(function02, modifier, i, i3);
        }
    }
}
