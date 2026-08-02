package com.squareup.cash.qrcodes.views;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.DialogEventHandlerKt;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.ColorsLightKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda3;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.data.profile.Badge;
import com.squareup.cash.moneybot.views.chat.MoneybotChatViewKt$$ExternalSyntheticLambda24;
import com.squareup.cash.payments.views.MainPaymentViewKt$$ExternalSyntheticLambda27;
import com.squareup.cash.pdf.view.ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.BadgeNameKt$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda5;
import com.squareup.cash.qrcodes.viewmodels.CameraState;
import com.squareup.cash.qrcodes.viewmodels.CashQrScannerViewModel;
import com.squareup.cash.qrcodes.viewmodels.CashtagQrScanViewModel;
import com.squareup.cash.qrcodes.viewmodels.QrAddressScannerViewModel;
import com.squareup.cash.qrcodes.viewmodels.QrCodeProfileViewModel;
import com.squareup.cash.retro.views.PaymentPlanSummaryKt$$ExternalSyntheticLambda11;
import com.squareup.cash.retro.views.RetroUiFactory$$ExternalSyntheticLambda3;
import com.squareup.cash.retro.views.SelectPaymentPlanViewKt$$ExternalSyntheticLambda10;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda0;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda4;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda1;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda32;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class CameraXPreviewKt {

    /* renamed from: lambda$-726325451, reason: not valid java name */
    public static final ComposableLambdaImpl f644lambda$726325451 = new ComposableLambdaImpl(new SelectPaymentPlanViewKt$$ExternalSyntheticLambda10(11), false, -726325451);

    /* renamed from: lambda$-2046943342, reason: not valid java name */
    public static final ComposableLambdaImpl f641lambda$2046943342 = new ComposableLambdaImpl(new SelectPaymentPlanViewKt$$ExternalSyntheticLambda10(12), false, -2046943342);

    /* renamed from: lambda$-694087202, reason: not valid java name */
    public static final ComposableLambdaImpl f643lambda$694087202 = new ComposableLambdaImpl(new SelectPaymentPlanViewKt$$ExternalSyntheticLambda10(13), false, -694087202);

    /* renamed from: lambda$-1936299883, reason: not valid java name */
    public static final ComposableLambdaImpl f640lambda$1936299883 = new ComposableLambdaImpl(new SelectPaymentPlanViewKt$$ExternalSyntheticLambda10(14), false, -1936299883);

    /* renamed from: lambda$-1563971865, reason: not valid java name */
    public static final ComposableLambdaImpl f639lambda$1563971865 = new ComposableLambdaImpl(new SelectPaymentPlanViewKt$$ExternalSyntheticLambda10(15), false, -1563971865);

    /* renamed from: lambda$-255768738, reason: not valid java name */
    public static final ComposableLambdaImpl f642lambda$255768738 = new ComposableLambdaImpl(new SelectPaymentPlanViewKt$$ExternalSyntheticLambda10(16), false, -255768738);

    /* renamed from: lambda$-1485725407, reason: not valid java name */
    public static final ComposableLambdaImpl f638lambda$1485725407 = new ComposableLambdaImpl(new SelectPaymentPlanViewKt$$ExternalSyntheticLambda10(17), false, -1485725407);

    /* renamed from: lambda$-1469216296, reason: not valid java name */
    public static final ComposableLambdaImpl f637lambda$1469216296 = new ComposableLambdaImpl(new SelectPaymentPlanViewKt$$ExternalSyntheticLambda10(18), false, -1469216296);

    /* renamed from: lambda$-1019336768, reason: not valid java name */
    public static final ComposableLambdaImpl f636lambda$1019336768 = new ComposableLambdaImpl(new PaymentPlanSummaryKt$$ExternalSyntheticLambda11(11), false, -1019336768);
    public static final ComposableLambdaImpl lambda$884327832 = new ComposableLambdaImpl(new PaymentPlanSummaryKt$$ExternalSyntheticLambda11(12), false, 884327832);
    public static final ComposableLambdaImpl lambda$308235407 = new ComposableLambdaImpl(new PaymentPlanSummaryKt$$ExternalSyntheticLambda11(13), false, 308235407);
    public static final ComposableLambdaImpl lambda$1389882301 = new ComposableLambdaImpl(new PaymentPlanSummaryKt$$ExternalSyntheticLambda11(14), false, 1389882301);
    public static final ComposableLambdaImpl lambda$1646122024 = new ComposableLambdaImpl(new SelectPaymentPlanViewKt$$ExternalSyntheticLambda10(19), false, 1646122024);
    public static final ComposableLambdaImpl lambda$961770065 = new ComposableLambdaImpl(new SelectPaymentPlanViewKt$$ExternalSyntheticLambda10(20), false, 961770065);
    public static final ComposableLambdaImpl lambda$2109618751 = new ComposableLambdaImpl(new SelectPaymentPlanViewKt$$ExternalSyntheticLambda10(21), false, 2109618751);

    /* renamed from: lambda$-85504344, reason: not valid java name */
    public static final ComposableLambdaImpl f645lambda$85504344 = new ComposableLambdaImpl(new SelectPaymentPlanViewKt$$ExternalSyntheticLambda10(22), false, -85504344);
    public static final ComposableLambdaImpl lambda$2061577958 = new ComposableLambdaImpl(new ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1(14), false, 2061577958);
    public static final ComposableLambdaImpl lambda$1386461553 = new ComposableLambdaImpl(new PaymentPlanSummaryKt$$ExternalSyntheticLambda11(15), false, 1386461553);

    /* renamed from: BadgeName-DpqVIHw, reason: not valid java name */
    public static final void m3729BadgeNameDpqVIHw(String str, Badge badge, Modifier modifier, int i, TextStyle textStyle, Composer composer, int i2) {
        Modifier modifier2;
        int i3;
        TextStyle textStyle2;
        int i4;
        TextStyle textStyle3;
        Modifier modifier3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2089017839);
        int i5 = i2 | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(badge == null ? -1 : badge.ordinal()) ? 32 : 16) | 77184;
        int i6 = 1;
        if (gapComposer.shouldExecute(i5 & 1, (74899 & i5) != 74898)) {
            gapComposer.startDefaults();
            if ((i2 & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                i4 = 3;
                textStyle3 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).header;
                modifier3 = Modifier.Companion.$$INSTANCE;
            } else {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier;
                i4 = i;
                textStyle3 = textStyle;
            }
            gapComposer.endDefaults();
            AnnotatedString.Builder builder = new AnnotatedString.Builder();
            builder.append(str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (badge == null) {
                gapComposer.startReplaceGroup(-145305111);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-145305110);
                builder.append(" ");
                KeyMappingKt.appendInlineContent(builder, "badge", "�");
                linkedHashMap.put("badge", new InlineTextContent(new Placeholder(7, Room.getSp(24), Room.getSp(24)), Expect_jvmKt.rememberComposableLambda(892876979, new BadgeNameKt$$ExternalSyntheticLambda0(badge, i6), gapComposer)));
                gapComposer.end(false);
            }
            int i7 = i4;
            Room.m1164Text25TpFw(0, 0, 0, i7, 48, 0, 1784, 0L, (Composer) gapComposer, modifier3, builder.toAnnotatedString(), textStyle3, (TextLineBalancing) null, (Map) linkedHashMap, (Function1) null, false);
            i3 = i7;
            modifier2 = modifier3;
            textStyle2 = textStyle3;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            i3 = i;
            textStyle2 = textStyle;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda4(str, badge, modifier2, i3, textStyle2, i2);
        }
    }

    public static final void BitcoinQrCodeScannerContent(QrAddressScannerViewModel qrAddressScannerViewModel, Function1 function1, PaddingValues paddingValues, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(461153722);
        int i2 = (gapComposer.changedInstance(qrAddressScannerViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(paddingValues) ? 256 : 128) | (gapComposer.changed(Modifier.Companion.$$INSTANCE) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            ArcadeThemeKt.ArcadeTheme(ColorsDarkKt.colorsDark, null, null, Expect_jvmKt.rememberComposableLambda(1877679951, new PoolGoalMetKt$$ExternalSyntheticLambda0(rememberCameraXPreviewState(qrAddressScannerViewModel.cameraState, gapComposer), function1, paddingValues, qrAddressScannerViewModel), gapComposer), gapComposer, 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new QrAddressScannerViewKt$$ExternalSyntheticLambda2(qrAddressScannerViewModel, function1, paddingValues, i);
        }
    }

    public static final void CameraXPreview(CameraXPreviewState cameraXPreviewState, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        Modifier.Companion companion;
        boolean z;
        GapComposer gapComposer2;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        boolean z2;
        GapComposer gapComposer3;
        cameraXPreviewState.getClass();
        function1.getClass();
        GapComposer gapComposer4 = (GapComposer) composer;
        gapComposer4.startRestartGroup(552738351);
        Applier applier = gapComposer4.applier;
        int i2 = i | (gapComposer4.changed(cameraXPreviewState) ? 4 : 2) | (gapComposer4.changedInstance(function1) ? 32 : 16);
        if (gapComposer4.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(modifier, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, fillMaxSize);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer4.startReusableNode();
            if (gapComposer4.inserting) {
                gapComposer4.createNode(function0);
            } else {
                gapComposer4.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer4, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$14);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$15);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer4, valueOf, composeUiNode$Companion$SetModifier$16);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer4, materializeModifier, composeUiNode$Companion$SetModifier$17);
            boolean booleanValue = ((Boolean) gapComposer4.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (booleanValue) {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                companion = companion2;
                z = false;
                gapComposer2 = gapComposer4;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                gapComposer2.startReplaceGroup(678475501);
                gapComposer2.end(false);
            } else {
                gapComposer4.startReplaceGroup(678100711);
                Context context = (Context) gapComposer4.consume(AndroidCompositionLocals_androidKt.LocalContext);
                RealCashVibrator realCashVibrator = (RealCashVibrator) gapComposer4.consume(LocalCashVibratorKt.LocalCashVibrator);
                Object rememberedValue = gapComposer4.rememberedValue();
                Object obj = Composer.Companion.Empty;
                if (rememberedValue == obj) {
                    rememberedValue = new CameraXPreviewManager(context, realCashVibrator);
                    gapComposer4.updateRememberedValue(rememberedValue);
                }
                CameraXPreviewManager cameraXPreviewManager = (CameraXPreviewManager) rememberedValue;
                Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion2, 1.0f);
                boolean changedInstance = gapComposer4.changedInstance(context) | gapComposer4.changedInstance(cameraXPreviewManager);
                Object rememberedValue2 = gapComposer4.rememberedValue();
                if (changedInstance || rememberedValue2 == obj) {
                    rememberedValue2 = new OpenSourceKt$$ExternalSyntheticLambda11(context, cameraXPreviewManager);
                    gapComposer4.updateRememberedValue(rememberedValue2);
                }
                Function1 function12 = (Function1) rememberedValue2;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                companion = companion2;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                gapComposer2 = gapComposer4;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                AndroidView_androidKt.AndroidView(function12, fillMaxSize2, null, gapComposer2, 48, 4);
                cameraXPreviewManager.HandleState(cameraXPreviewState, function1, gapComposer2, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                z = false;
                gapComposer2.end(false);
            }
            if (((Boolean) cameraXPreviewState.cameraAvailable$delegate.getValue()).booleanValue()) {
                GapComposer gapComposer5 = gapComposer2;
                z2 = true;
                gapComposer5.startReplaceGroup(678783021);
                gapComposer5.end(z);
                gapComposer3 = gapComposer5;
            } else {
                gapComposer2.startReplaceGroup(678517785);
                Modifier fillMaxSize3 = SizeKt.fillMaxSize(companion, 1.0f);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, z);
                int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, fillMaxSize3);
                gapComposer2.startReusableNode();
                if (gapComposer2.inserting) {
                    gapComposer2.createNode(function0);
                } else {
                    gapComposer2.useNode();
                }
                Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$14);
                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$1);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$12, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$13);
                GapComposer gapComposer6 = gapComposer2;
                z2 = true;
                Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3834, 0L, (Composer) gapComposer6, (Modifier) null, ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).helpText, (TextLineBalancing) null, Room.stringResource(gapComposer2, R.string.camera_unavailable), (Map) null, (Function1) null, false);
                gapComposer6.end(true);
                gapComposer6.end(z);
                gapComposer3 = gapComposer6;
            }
            gapComposer3.end(z2);
            gapComposer = gapComposer3;
        } else {
            gapComposer4.skipToGroupEnd();
            gapComposer = gapComposer4;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new RetroUiFactory$$ExternalSyntheticLambda3(modifier, (Object) cameraXPreviewState, function1, i, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CameraXPreviewOverlay(int i, int i2, Composer composer, Modifier modifier, String str) {
        String str2;
        String stringResource;
        boolean z;
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1280791333);
        int i4 = i | (gapComposer.changed(modifier) ? 4 : 2);
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                str2 = str;
                if (gapComposer.changed(str2)) {
                    i3 = 32;
                    i4 |= i3;
                }
            } else {
                str2 = str;
            }
            i3 = 16;
            i4 |= i3;
        } else {
            str2 = str;
        }
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            } else if ((i2 & 2) != 0) {
                stringResource = Room.stringResource(gapComposer, R.string.profile_scan_code_instruction);
                gapComposer.endDefaults();
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                if (gapComposer.applier != null) {
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
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(OffsetKt.aspectRatio(1.0f, Modifier.Companion.$$INSTANCE, false), 1.0f);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                Object obj = DefaultSizes.border.annotationsMap;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                BoxKt.Box(ImageKt.m178borderxT4_qwU(fillMaxWidth, 2.0f, colors.semantic.border.standard, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)), gapComposer, 0);
                if (stringResource == null) {
                    gapComposer.startReplaceGroup(-365639193);
                    gapComposer.end(false);
                    z = true;
                } else {
                    gapComposer.startReplaceGroup(-365639192);
                    DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
                    z = true;
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3834, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).helpText, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                    gapComposer.end(false);
                }
                gapComposer.end(z);
                str2 = stringResource;
            }
            stringResource = str2;
            gapComposer.endDefaults();
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier != null) {
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CameraXPreviewKt$$ExternalSyntheticLambda0(modifier, str2, i, i2, 0);
        }
    }

    public static final void CashQrCameraXScanner(CashQrScannerViewModel cashQrScannerViewModel, Function1 function1, Modifier modifier, boolean z, Composer composer, int i) {
        Modifier modifier2;
        boolean z2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(46734558);
        int i2 = i | (gapComposer.changedInstance(cashQrScannerViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | 3456;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            CameraXPreviewState rememberCameraXPreviewState = rememberCameraXPreviewState(cashQrScannerViewModel.cameraState, gapComposer);
            rememberCameraXPreviewState.cameraAvailable$delegate.setValue(true);
            ArcadeThemeKt.ArcadeTheme(ColorsDarkKt.colorsDark, null, null, Expect_jvmKt.rememberComposableLambda(681151987, new RetroUiFactory$$ExternalSyntheticLambda3(rememberCameraXPreviewState, function1, cashQrScannerViewModel), gapComposer), gapComposer, 3072, 6);
            modifier2 = Modifier.Companion.$$INSTANCE;
            z2 = true;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            z2 = z;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HeroCardViewKt$$ExternalSyntheticLambda32(cashQrScannerViewModel, function1, modifier2, z2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CashQrShortcutsOnboardingContent(PaddingValues paddingValues, boolean z, boolean z2, Function1 function1, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        RecomposeScopeImpl endRestartGroup;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1668395984);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(paddingValues) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 16384 : PKIFailureInfo.certRevoked;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i4 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                Modifier consumeWindowInsets = OffsetKt.consumeWindowInsets(SpacerKt.padding(SizeKt.fillMaxWidth(modifier4, 1.0f), paddingValues), paddingValues);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, consumeWindowInsets);
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
                Transformations.SheetHeader(Room.stringResource(gapComposer, R.string.qr_shortcuts_onboarding_title), (Modifier) null, (Function2) null, Room.stringResource(gapComposer, R.string.qr_shortcuts_onboarding_subtitle), gapComposer, 0, 6);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                ListUnorderedKt.ListUnordered((Modifier) null, (ListUnorderedState) null, (ListUnorderedProminence) null, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, f636lambda$1019336768, gapComposer, 196608, 31);
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-1934818984, new MainPaymentViewKt$$ExternalSyntheticLambda27(2, function1, z, z2), gapComposer), gapComposer, 24576, 15);
                gapComposer = gapComposer;
                gapComposer.end(true);
                modifier3 = modifier4;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new ProfileKt$$ExternalSyntheticLambda5(paddingValues, z, z2, function1, modifier3, i, i2);
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void CashtagQrScanner(CashtagQrScanViewModel cashtagQrScanViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1797171660);
        int i2 = (gapComposer.changedInstance(cashtagQrScanViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(ColorsDarkKt.colorsDark, null, null, Expect_jvmKt.rememberComposableLambda(-1408348457, new CalloutKt$$ExternalSyntheticLambda0(rememberCameraXPreviewState(cashtagQrScanViewModel.cameraState, gapComposer), function1), gapComposer), gapComposer, 3072, 6);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new RetroUiFactory$$ExternalSyntheticLambda3(modifier2, (Object) cashtagQrScanViewModel, function1, i, 10);
        }
    }

    public static final void QrAddressScannerView(QrAddressScannerViewModel qrAddressScannerViewModel, Function1 function1, RealCashVibrator realCashVibrator, Modifier modifier, PaddingValues paddingValues, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        PaddingValues paddingValues2;
        qrAddressScannerViewModel.getClass();
        function1.getClass();
        realCashVibrator.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1997881665);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(qrAddressScannerViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(realCashVibrator) ? 256 : 128;
        }
        int i4 = i3 | 3072;
        if ((i2 & 16) != 0) {
            i4 = i3 | 27648;
        } else if ((i & 24576) == 0) {
            i4 |= gapComposer.changed(false) ? 16384 : PKIFailureInfo.certRevoked;
        }
        int i5 = i2 & 32;
        if (i5 != 0) {
            i4 |= 196608;
        } else if ((196608 & i) == 0) {
            i4 |= gapComposer.changed(paddingValues) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if (gapComposer.shouldExecute(i4 & 1, (74899 & i4) != 74898)) {
            PaddingValues m295PaddingValuesYgX7TsA$default = i5 != 0 ? SpacerKt.m295PaddingValuesYgX7TsA$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 3) : paddingValues;
            int i6 = i4 & 112;
            boolean z = i6 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new CashtagQrScanView$$ExternalSyntheticLambda0(23, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            boolean z2 = i6 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new InfoSectionKt$$ExternalSyntheticLambda1(15, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue2, gapComposer, 0);
            Updater.CompositionLocalProvider(new ProvidedValue[]{LocalCashVibratorKt.LocalCashVibrator.defaultProvidedValue$runtime(realCashVibrator), InspectionModeKt.LocalInspectionMode.defaultProvidedValue$runtime(false)}, Expect_jvmKt.rememberComposableLambda(319373823, new QrAddressScannerViewKt$$ExternalSyntheticLambda2(qrAddressScannerViewModel, function1, m295PaddingValuesYgX7TsA$default), gapComposer), gapComposer, 56);
            paddingValues2 = m295PaddingValuesYgX7TsA$default;
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            paddingValues2 = paddingValues;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda3((Object) qrAddressScannerViewModel, (Object) function1, (Object) realCashVibrator, modifier2, (Object) paddingValues2, i, i2, 19);
        }
    }

    public static final void QrCodeProfile(QrCodeProfileViewModel qrCodeProfileViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1182221143);
        int i2 = (gapComposer.changedInstance(qrCodeProfileViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1923723820, new QrCodeProfileViewKt$$ExternalSyntheticLambda0(function1, qrCodeProfileViewModel, i3), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new RetroUiFactory$$ExternalSyntheticLambda3(modifier2, (Object) qrCodeProfileViewModel, function1, i, 12);
        }
    }

    public static final void ShareScanToggle(int i, Composer composer, Modifier modifier, Function1 function1) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1052053042);
        int i2 = (gapComposer.changedInstance(function1) ? 32 : 16) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(ColorsLightKt.colorsLight, null, null, Expect_jvmKt.rememberComposableLambda(-1514342685, new MoneybotChatViewKt$$ExternalSyntheticLambda24(modifier, function1), gapComposer), gapComposer, 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneybotChatViewKt$$ExternalSyntheticLambda24(function1, modifier, i, 5);
        }
    }

    public static final CameraXPreviewState rememberCameraXPreviewState(CameraState cameraState, Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new CameraXPreviewState();
            gapComposer.updateRememberedValue(rememberedValue);
        }
        CameraXPreviewState cameraXPreviewState = (CameraXPreviewState) rememberedValue;
        cameraXPreviewState.getClass();
        cameraXPreviewState.cameraState$delegate.setValue(cameraState);
        return cameraXPreviewState;
    }
}
