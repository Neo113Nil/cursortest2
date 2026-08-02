package com.squareup.cash.retro.views;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.pager.PagerMeasureKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.DividerKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.c7$$ExternalSyntheticLambda6;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.compose.LocalImageLoaderKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.avatar.components.StackedAvatarsKt;
import com.squareup.cash.borrow.views.BulletinInfoOverlayKt$$ExternalSyntheticLambda7;
import com.squareup.cash.common.composeui.CircularBadgeShape;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.genie.TextViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.compose_ui.ComposeUtilsKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.compose_ui.components.NavigationIconType;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.retro.viewmodels.PaymentPlanSummaryViewModel;
import com.squareup.cash.savings.views.CelebrationKt$$ExternalSyntheticLambda1;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda4;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda1;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda0;
import com.squareup.cash.taptopay.views.TapToPayPaymentKt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.widget.StackedAvatarView$TextSize;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.cash.Countries;
import com.squareup.workflow1.Worker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class PaymentPlanSummaryViewKt {

    /* renamed from: lambda$-554124701, reason: not valid java name */
    public static final ComposableLambdaImpl f646lambda$554124701 = new ComposableLambdaImpl(new SelectPaymentPlanViewKt$$ExternalSyntheticLambda10(23), false, -554124701);

    static {
        new ComposableLambdaImpl(new SelectPaymentPlanViewKt$$ExternalSyntheticLambda10(24), false, 730340253);
    }

    public static final void LabeledLinkView(PaymentPlanSummaryViewModel.LabeledLink labeledLink, Function0 function0, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier modifier2;
        Modifier.Companion companion;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-27896898);
        int i2 = i | (gapComposer2.changedInstance(labeledLink) ? 4 : 2) | (gapComposer2.changedInstance(function0) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(ImageKt.m183clickableoSLSa3U$default(companion2, false, null, null, function0, 15), 16.0f, 12.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m299paddingVpY3zN4);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, 11), 16.0f);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CelebrationKt$$ExternalSyntheticLambda1(8);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            ImageKt.Image(AsyncImageKt.m1446rememberAsyncImagePainter19ie5dc(0, 30, gapComposer2, ComposeUtilsKt.getThemedUrl(labeledLink.icon, gapComposer2)), null, SemanticsModifierKt.clearAndSetSemantics(m285size3ABfNKs, (Function1) rememberedValue), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer2, 48, 120);
            KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4080, MooncakeTheme.getColors(gapComposer2).label, (Composer) gapComposer2, SpacerKt.m302paddingqDBjuR0$default(new LayoutWeightElement(1.0f, true), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, 11), MooncakeTheme.getTypography(gapComposer2).smallTitle, (TextLineBalancing) null, labeledLink.label, (Map) null, (Function1) null, false);
            gapComposer = gapComposer2;
            String str = labeledLink.accessoryText;
            if (str == null) {
                gapComposer.startReplaceGroup(-1685801726);
                gapComposer.end(false);
                companion = companion2;
            } else {
                gapComposer.startReplaceGroup(-1685801725);
                companion = companion2;
                KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 48, 0, 4080, MooncakeTheme.getColors(gapComposer).label, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, 11), MooncakeTheme.getTypography(gapComposer).smallTitle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
            Painter painterResource = Countries.painterResource(R.drawable.activity_row_chevron, 0, gapComposer);
            Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(companion, 5.0f, 8.0f);
            long j = MooncakeTheme.getColors(gapComposer).label;
            ImageKt.Image(painterResource, null, m287sizeVpY3zN4, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 432, 56);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new RetroUiFactory$$ExternalSyntheticLambda3(labeledLink, function0, modifier2, i, 17);
        }
    }

    public static final void LabeledLinksSection(int i, Composer composer, Modifier modifier, ArrayList arrayList, Function1 function1) {
        Modifier wrapContentHeight;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(504850481);
        int i2 = (gapComposer.changedInstance(arrayList) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(modifier, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(ImageKt.m177backgroundbw27NRU(ClipKt.clip(wrapContentHeight, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)), MooncakeTheme.getColors(gapComposer).background, ColorKt.RectangleShape), RecyclerView.DECELERATION_RATE, 12.0f, 1);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            gapComposer.startReplaceGroup(1451374812);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                PaymentPlanSummaryViewModel.LabeledLink labeledLink = (PaymentPlanSummaryViewModel.LabeledLink) it.next();
                boolean changedInstance = ((i2 & 112) == 32) | gapComposer.changedInstance(labeledLink);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new PaymentPlanSummaryKt$$ExternalSyntheticLambda32(function1, labeledLink, 1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                LabeledLinkView(labeledLink, (Function0) rememberedValue, null, gapComposer, 0);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PaymentPlanSummaryKt$$ExternalSyntheticLambda33(arrayList, function1, modifier, i, 2);
        }
    }

    /* renamed from: MaybeBadgedBox-3GLzNTs, reason: not valid java name */
    public static final void m3734MaybeBadgedBox3GLzNTs(float f, float f2, int i, Composer composer, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, RealImageLoader realImageLoader, CircularBadgeShape circularBadgeShape, AvatarBadgeViewModel avatarBadgeViewModel) {
        RealImageLoader realImageLoader2;
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-229949498);
        int i3 = (gapComposer.changed(avatarBadgeViewModel) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16) | 128 | (gapComposer.changed(circularBadgeShape) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i3 & 1, (599187 & i3) != 599186)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                i2 = i3 & (-897);
                realImageLoader2 = (RealImageLoader) gapComposer.consume(LocalImageLoaderKt.LocalImageLoader);
            } else {
                gapComposer.skipToGroupEnd();
                i2 = i3 & (-897);
                realImageLoader2 = realImageLoader;
            }
            gapComposer.endDefaults();
            if (avatarBadgeViewModel == null) {
                gapComposer.startReplaceGroup(47654188);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
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
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                composableLambdaImpl.invoke((Object) gapComposer, (Object) 6);
                gapComposer.end(true);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(47719443);
                VisibleKt.m3485BadgedBox3GLzNTs(f, f2, 1794048 | (i2 & 7168) | (i2 & 112) | ((i2 << 6) & 896), gapComposer, composableLambdaImpl, modifier, realImageLoader2, circularBadgeShape, avatarBadgeViewModel);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
            realImageLoader2 = realImageLoader;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PaymentPlanSummaryViewKt$$ExternalSyntheticLambda28(f, f2, i, composableLambdaImpl, modifier, realImageLoader2, circularBadgeShape, avatarBadgeViewModel);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x043b  */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PaymentPlanSummaryView(PaymentPlanSummaryViewModel paymentPlanSummaryViewModel, Function1 function1, Modifier modifier, ScrollState scrollState, Composer composer, int i) {
        Function1 function12;
        Modifier modifier2;
        ScrollState scrollState2;
        GapComposer gapComposer;
        ScrollState rememberScrollState;
        int i2;
        Modifier modifier3;
        NeverEqualPolicy neverEqualPolicy;
        ScrollState scrollState3;
        GapComposer gapComposer2;
        StackedAvatarViewModel.Single single;
        long j;
        Modifier.Companion companion;
        NeverEqualPolicy neverEqualPolicy2;
        boolean z;
        String str;
        ?? r14;
        GapComposer gapComposer3;
        PaymentPlanSummaryViewModel.TimelineSection timelineSection;
        int i3;
        NeverEqualPolicy neverEqualPolicy3;
        int i4;
        boolean z2;
        Object rememberedValue;
        PaymentPlanSummaryViewModel.SummarySection summarySection;
        PaymentPlanSummaryViewModel.PurchasesSection purchasesSection;
        PaymentPlanSummaryViewModel.BottomSheetData bottomSheetData;
        GapComposer gapComposer4;
        paymentPlanSummaryViewModel.getClass();
        ArrayList arrayList = paymentPlanSummaryViewModel.labeledLinks;
        function1.getClass();
        GapComposer gapComposer5 = (GapComposer) composer;
        gapComposer5.startRestartGroup(819962959);
        Applier applier = gapComposer5.applier;
        int i5 = i | (gapComposer5.changedInstance(paymentPlanSummaryViewModel) ? 4 : 2) | (gapComposer5.changedInstance(function1) ? 32 : 16) | 1408;
        if (gapComposer5.shouldExecute(i5 & 1, (i5 & 1171) != 1170)) {
            gapComposer5.startDefaults();
            int i6 = i & 1;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (i6 == 0 || gapComposer5.getDefaultsInvalid()) {
                rememberScrollState = ImageKt.rememberScrollState(gapComposer5);
                i2 = i5 & (-7169);
                modifier3 = companion2;
            } else {
                gapComposer5.skipToGroupEnd();
                rememberScrollState = scrollState;
                i2 = i5 & (-7169);
                modifier3 = modifier;
            }
            gapComposer5.endDefaults();
            int i7 = i2 & 112;
            boolean z3 = i7 == 32;
            Object rememberedValue2 = gapComposer5.rememberedValue();
            NeverEqualPolicy neverEqualPolicy4 = Composer.Companion.Empty;
            if (z3 || rememberedValue2 == neverEqualPolicy4) {
                rememberedValue2 = new PaymentPlanSummaryKt$$ExternalSyntheticLambda0(8, function1);
                gapComposer5.updateRememberedValue(rememberedValue2);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue2, gapComposer5, 0, 1);
            long j2 = MooncakeTheme.getColors(gapComposer5).secondaryBackground;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(ImageKt.m177backgroundbw27NRU(modifier3, j2, rectangleShapeKt$RectangleShape$1), 1.0f);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, Alignment.Companion.Start, gapComposer5, 0);
            int hashCode = Long.hashCode(gapComposer5.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer5.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer5, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer5.startReusableNode();
            if (gapComposer5.inserting) {
                gapComposer5.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer5.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer5, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer5, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer5, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer5, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer5, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier modifier4 = modifier3;
            Modifier statusBarsPadding = SpacerKt.statusBarsPadding(ImageKt.m177backgroundbw27NRU(ZIndexModifierKt.zIndex(PlatformKt.composed(companion2, new ShareSheetViewKt$$ExternalSyntheticLambda1(9, rememberScrollState, rectangleShapeKt$RectangleShape$1)), 1.0f), MooncakeTheme.getColors(gapComposer5).secondaryBackground, rectangleShapeKt$RectangleShape$1));
            ScrollState scrollState4 = rememberScrollState;
            NavigationIconType navigationIconType = NavigationIconType.CLOSE;
            boolean z4 = i7 == 32;
            Object rememberedValue3 = gapComposer5.rememberedValue();
            if (z4) {
                neverEqualPolicy = neverEqualPolicy4;
            } else {
                neverEqualPolicy = neverEqualPolicy4;
                if (rememberedValue3 != neverEqualPolicy) {
                    scrollState3 = scrollState4;
                    Function0 function0 = (Function0) rememberedValue3;
                    NeverEqualPolicy neverEqualPolicy5 = neverEqualPolicy;
                    ScrollState scrollState5 = scrollState3;
                    KeypadKt.m3654ToolbarA_Dysh8(null, statusBarsPadding, navigationIconType, 0L, function0, null, gapComposer5, 24582, 364);
                    gapComposer2 = gapComposer5;
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SpacerKt.navigationBarsPadding(ImageKt.verticalScroll$default(new LayoutWeightElement(1.0f, false), scrollState5, false, 14)), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 24.0f, 7);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, Alignment.Companion.CenterHorizontally, gapComposer2, 48);
                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m302paddingqDBjuR0$default);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.useNode();
                    } else {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    }
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    Color forThemeComposable = PagerMeasureKt.forThemeComposable(paymentPlanSummaryViewModel.accentColor, ThemeHelpersKt.themeInfo((Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext)), gapComposer2);
                    forThemeComposable.getClass();
                    long j3 = forThemeComposable.value;
                    single = paymentPlanSummaryViewModel.avatar;
                    if (single == null) {
                        gapComposer2.startReplaceGroup(-1442490144);
                        AvatarBadgeViewModel avatarBadgeViewModel = paymentPlanSummaryViewModel.avatarBadge;
                        companion = companion2;
                        Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(SpacerKt.m300paddingVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, 6.0f, 1), null, 3);
                        Object rememberedValue4 = gapComposer2.rememberedValue();
                        if (rememberedValue4 == neverEqualPolicy5) {
                            rememberedValue4 = new CelebrationKt$$ExternalSyntheticLambda1(10);
                            gapComposer2.updateRememberedValue(rememberedValue4);
                        }
                        j = j3;
                        neverEqualPolicy2 = neverEqualPolicy5;
                        z = true;
                        m3734MaybeBadgedBox3GLzNTs(6.0f, 3.0f, 1794048, gapComposer2, Expect_jvmKt.rememberComposableLambda(-511218037, new PaymentPlanSummaryKt$$ExternalSyntheticLambda42(single, 5, (byte) 0), gapComposer2), SemanticsModifierKt.clearAndSetSemantics(wrapContentSize$default, (Function1) rememberedValue4), null, new CircularBadgeShape(25.0f), avatarBadgeViewModel);
                        gapComposer2 = gapComposer2;
                        gapComposer2.end(false);
                    } else {
                        j = j3;
                        companion = companion2;
                        neverEqualPolicy2 = neverEqualPolicy5;
                        z = true;
                        gapComposer2.startReplaceGroup(-1441960633);
                        gapComposer2.end(false);
                    }
                    String str2 = paymentPlanSummaryViewModel.title;
                    GapComposer gapComposer6 = gapComposer2;
                    KeypadKt.m3651TextPdH14aY(0, 0, 3, 0, 48, 0, 3824, MooncakeTheme.getColors(gapComposer2).label, (Composer) gapComposer6, SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2), MooncakeTheme.getTypography(gapComposer2).mainTitle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                    GapComposer gapComposer7 = gapComposer6;
                    str = paymentPlanSummaryViewModel.subtitle;
                    if (str == null) {
                        gapComposer7.startReplaceGroup(-1441633800);
                        KeypadKt.m3651TextPdH14aY(0, 0, 3, 0, 0, 0, 3824, MooncakeTheme.getColors(gapComposer7).secondaryLabel, (Composer) gapComposer7, SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, 4.0f, 16.0f, RecyclerView.DECELERATION_RATE, 8), MooncakeTheme.getTypography(gapComposer7).smallBody, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                        gapComposer7 = gapComposer7;
                        r14 = 0;
                        gapComposer7.end(false);
                    } else {
                        r14 = 0;
                        gapComposer7.startReplaceGroup(-1441342617);
                        gapComposer7.end(false);
                    }
                    Modifier.Companion companion3 = companion;
                    GapComposer gapComposer8 = gapComposer7;
                    long j4 = j;
                    m3736ProgressSection3IgeMak(paymentPlanSummaryViewModel.progressSection, j4, SpacerKt.m302paddingqDBjuR0$default(companion3, 16.0f, 24.0f, 16.0f, RecyclerView.DECELERATION_RATE, 8), gapComposer8, 0);
                    gapComposer3 = gapComposer8;
                    timelineSection = paymentPlanSummaryViewModel.refundsTimelineSection;
                    if (timelineSection == null) {
                        gapComposer3.startReplaceGroup(-1441037298);
                        i3 = i7;
                        i4 = 32;
                        boolean z5 = i3 == 32 ? true : r14;
                        Object rememberedValue5 = gapComposer3.rememberedValue();
                        neverEqualPolicy3 = neverEqualPolicy2;
                        if (z5 || rememberedValue5 == neverEqualPolicy3) {
                            function12 = function1;
                            rememberedValue5 = new InfoSectionKt$$ExternalSyntheticLambda1(22, function12);
                            gapComposer3.updateRememberedValue(rememberedValue5);
                        } else {
                            function12 = function1;
                        }
                        m3738TimelineSectionsW7UJKQ(timelineSection, j4, (Function1) rememberedValue5, SpacerKt.m302paddingqDBjuR0$default(companion3, 16.0f, 24.0f, 16.0f, RecyclerView.DECELERATION_RATE, 8), gapComposer3, 0);
                        gapComposer3.end(r14);
                    } else {
                        function12 = function1;
                        i3 = i7;
                        neverEqualPolicy3 = neverEqualPolicy2;
                        i4 = 32;
                        gapComposer3.startReplaceGroup(-1440798009);
                        gapComposer3.end(r14);
                    }
                    PaymentPlanSummaryViewModel.TimelineSection timelineSection2 = paymentPlanSummaryViewModel.paymentsTimelineSection;
                    z2 = i3 != i4 ? true : r14;
                    rememberedValue = gapComposer3.rememberedValue();
                    if (!z2 || rememberedValue == neverEqualPolicy3) {
                        rememberedValue = new InfoSectionKt$$ExternalSyntheticLambda1(23, function12);
                        gapComposer3.updateRememberedValue(rememberedValue);
                    }
                    m3738TimelineSectionsW7UJKQ(timelineSection2, j4, (Function1) rememberedValue, SpacerKt.m302paddingqDBjuR0$default(companion3, 16.0f, 24.0f, 16.0f, RecyclerView.DECELERATION_RATE, 8), gapComposer3, 0);
                    summarySection = paymentPlanSummaryViewModel.summarySection;
                    if (summarySection == null) {
                        gapComposer3.startReplaceGroup(-1440473904);
                        boolean z6 = i3 == i4 ? true : r14;
                        Object rememberedValue6 = gapComposer3.rememberedValue();
                        if (z6 || rememberedValue6 == neverEqualPolicy3) {
                            rememberedValue6 = new PaymentPlanSummaryKt$$ExternalSyntheticLambda0(12, function12);
                            gapComposer3.updateRememberedValue(rememberedValue6);
                        }
                        SummarySection(summarySection, (Function0) rememberedValue6, SpacerKt.m302paddingqDBjuR0$default(companion3, 16.0f, 24.0f, 16.0f, RecyclerView.DECELERATION_RATE, 8), gapComposer3, r14);
                        gapComposer3.end(r14);
                    } else {
                        gapComposer3.startReplaceGroup(-1440267289);
                        gapComposer3.end(r14);
                    }
                    purchasesSection = paymentPlanSummaryViewModel.purchasesSection;
                    if (purchasesSection == null) {
                        gapComposer3.startReplaceGroup(-1440169918);
                        boolean z7 = i3 == i4 ? true : r14;
                        Object rememberedValue7 = gapComposer3.rememberedValue();
                        if (z7 || rememberedValue7 == neverEqualPolicy3) {
                            rememberedValue7 = new InfoSectionKt$$ExternalSyntheticLambda1(24, function12);
                            gapComposer3.updateRememberedValue(rememberedValue7);
                        }
                        m3737PurchasesSectionsW7UJKQ(purchasesSection, j4, (Function1) rememberedValue7, SpacerKt.m302paddingqDBjuR0$default(companion3, 16.0f, 24.0f, 16.0f, RecyclerView.DECELERATION_RATE, 8), gapComposer3, 0);
                        gapComposer3.end(r14);
                    } else {
                        gapComposer3.startReplaceGroup(-1439919097);
                        gapComposer3.end(r14);
                    }
                    if (arrayList.isEmpty()) {
                        gapComposer3.startReplaceGroup(-1439867761);
                        boolean z8 = i3 == i4 ? true : r14;
                        Object rememberedValue8 = gapComposer3.rememberedValue();
                        if (z8 || rememberedValue8 == neverEqualPolicy3) {
                            rememberedValue8 = new InfoSectionKt$$ExternalSyntheticLambda1(21, function12);
                            gapComposer3.updateRememberedValue(rememberedValue8);
                        }
                        LabeledLinksSection(r14, gapComposer3, SpacerKt.m302paddingqDBjuR0$default(companion3, 16.0f, 24.0f, 16.0f, RecyclerView.DECELERATION_RATE, 8), arrayList, (Function1) rememberedValue8);
                        gapComposer3.end(r14);
                    } else {
                        gapComposer3.startReplaceGroup(-1439660185);
                        gapComposer3.end(r14);
                    }
                    gapComposer3.end(true);
                    gapComposer3.end(true);
                    bottomSheetData = paymentPlanSummaryViewModel.bottomSheetData;
                    if (bottomSheetData != null) {
                        gapComposer3.startReplaceGroup(2041506340);
                        gapComposer3.end(r14);
                        gapComposer4 = gapComposer3;
                    } else {
                        gapComposer3.startReplaceGroup(2041506341);
                        boolean z9 = i3 != i4 ? r14 : true;
                        Object rememberedValue9 = gapComposer3.rememberedValue();
                        if (z9 || rememberedValue9 == neverEqualPolicy3) {
                            rememberedValue9 = new PaymentPlanSummaryKt$$ExternalSyntheticLambda0(9, function12);
                            gapComposer3.updateRememberedValue(rememberedValue9);
                        }
                        SheetKt.Sheet((Function0) rememberedValue9, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(-559591055, new ShareSheetViewKt$$ExternalSyntheticLambda1(10, (Object) bottomSheetData, (Object) function12), gapComposer3), gapComposer3, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                        GapComposer gapComposer9 = gapComposer3;
                        gapComposer9.end(r14);
                        gapComposer4 = gapComposer9;
                    }
                    modifier2 = modifier4;
                    scrollState2 = scrollState5;
                    gapComposer = gapComposer4;
                }
            }
            scrollState3 = scrollState4;
            rememberedValue3 = new PaymentPlanSummaryKt$$ExternalSyntheticLambda0(11, function1);
            gapComposer5.updateRememberedValue(rememberedValue3);
            Function0 function02 = (Function0) rememberedValue3;
            NeverEqualPolicy neverEqualPolicy52 = neverEqualPolicy;
            ScrollState scrollState52 = scrollState3;
            KeypadKt.m3654ToolbarA_Dysh8(null, statusBarsPadding, navigationIconType, 0L, function02, null, gapComposer5, 24582, 364);
            gapComposer2 = gapComposer5;
            Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(SpacerKt.navigationBarsPadding(ImageKt.verticalScroll$default(new LayoutWeightElement(1.0f, false), scrollState52, false, 14)), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 24.0f, 7);
            ColumnMeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, Alignment.Companion.CenterHorizontally, gapComposer2, 48);
            int hashCode22 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope22 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier22 = PlatformKt.materializeModifier(gapComposer2, m302paddingqDBjuR0$default2);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy22, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope22, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode22, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier22, composeUiNode$Companion$SetModifier$14);
            Color forThemeComposable2 = PagerMeasureKt.forThemeComposable(paymentPlanSummaryViewModel.accentColor, ThemeHelpersKt.themeInfo((Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext)), gapComposer2);
            forThemeComposable2.getClass();
            long j32 = forThemeComposable2.value;
            single = paymentPlanSummaryViewModel.avatar;
            if (single == null) {
            }
            String str22 = paymentPlanSummaryViewModel.title;
            GapComposer gapComposer62 = gapComposer2;
            KeypadKt.m3651TextPdH14aY(0, 0, 3, 0, 48, 0, 3824, MooncakeTheme.getColors(gapComposer2).label, (Composer) gapComposer62, SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2), MooncakeTheme.getTypography(gapComposer2).mainTitle, (TextLineBalancing) null, str22, (Map) null, (Function1) null, false);
            GapComposer gapComposer72 = gapComposer62;
            str = paymentPlanSummaryViewModel.subtitle;
            if (str == null) {
            }
            Modifier.Companion companion32 = companion;
            GapComposer gapComposer82 = gapComposer72;
            long j42 = j;
            m3736ProgressSection3IgeMak(paymentPlanSummaryViewModel.progressSection, j42, SpacerKt.m302paddingqDBjuR0$default(companion32, 16.0f, 24.0f, 16.0f, RecyclerView.DECELERATION_RATE, 8), gapComposer82, 0);
            gapComposer3 = gapComposer82;
            timelineSection = paymentPlanSummaryViewModel.refundsTimelineSection;
            if (timelineSection == null) {
            }
            PaymentPlanSummaryViewModel.TimelineSection timelineSection22 = paymentPlanSummaryViewModel.paymentsTimelineSection;
            if (i3 != i4) {
            }
            rememberedValue = gapComposer3.rememberedValue();
            if (!z2) {
            }
            rememberedValue = new InfoSectionKt$$ExternalSyntheticLambda1(23, function12);
            gapComposer3.updateRememberedValue(rememberedValue);
            m3738TimelineSectionsW7UJKQ(timelineSection22, j42, (Function1) rememberedValue, SpacerKt.m302paddingqDBjuR0$default(companion32, 16.0f, 24.0f, 16.0f, RecyclerView.DECELERATION_RATE, 8), gapComposer3, 0);
            summarySection = paymentPlanSummaryViewModel.summarySection;
            if (summarySection == null) {
            }
            purchasesSection = paymentPlanSummaryViewModel.purchasesSection;
            if (purchasesSection == null) {
            }
            if (arrayList.isEmpty()) {
            }
            gapComposer3.end(true);
            gapComposer3.end(true);
            bottomSheetData = paymentPlanSummaryViewModel.bottomSheetData;
            if (bottomSheetData != null) {
            }
            modifier2 = modifier4;
            scrollState2 = scrollState52;
            gapComposer = gapComposer4;
        } else {
            function12 = function1;
            gapComposer5.skipToGroupEnd();
            modifier2 = modifier;
            scrollState2 = scrollState;
            gapComposer = gapComposer5;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PaymentPlanSummaryKt$$ExternalSyntheticLambda1(paymentPlanSummaryViewModel, function12, modifier2, scrollState2, i, 1);
        }
    }

    public static final void PaymentPlanSummaryViewBottomSheetContent(PaymentPlanSummaryViewModel.BottomSheetData bottomSheetData, Function0 function0, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier.Companion companion;
        bottomSheetData.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(522232418);
        int i3 = i | (gapComposer.changedInstance(bottomSheetData) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(modifier, 16.0f, 28.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
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
            String str = bottomSheetData.title;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (str != null) {
                gapComposer.startReplaceGroup(300856381);
                companion = companion2;
                i2 = i3;
                KeypadKt.m3651TextPdH14aY(0, 0, 3, 0, 48, 0, 3824, MooncakeTheme.getColors(gapComposer).label, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12.0f, 7), MooncakeTheme.getTypography(gapComposer).smallTitle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            } else {
                i2 = i3;
                companion = companion2;
                gapComposer.startReplaceGroup(301084138);
                gapComposer.end(false);
            }
            KeypadKt.m3651TextPdH14aY(0, 0, 3, 0, 48, 0, 3824, MooncakeTheme.getColors(gapComposer).secondaryLabel, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 40.0f, 7), MooncakeTheme.getTypography(gapComposer).smallBody, (TextLineBalancing) null, bottomSheetData.description, (Map) null, (Function1) null, false);
            KeypadKt.m3640ButtonGFipHI0(bottomSheetData.closeButtonText, function0, SizeKt.fillMaxWidth(companion, 1.0f), null, null, null, null, false, 0, null, null, gapComposer, (i2 & 112) | MLKEMEngine.KyberPolyBytes, 0, 4088);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new RetroUiFactory$$ExternalSyntheticLambda3(bottomSheetData, function0, modifier, i, 18);
        }
    }

    /* renamed from: ProgressBar-3IgeMak, reason: not valid java name */
    public static final void m3735ProgressBar3IgeMak(float f, int i, long j, Composer composer, Modifier modifier) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-801712);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(j) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(modifier, 1.0f), 16.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m277height3ABfNKs);
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
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxHeight(SizeKt.fillMaxWidth(companion, 1.0f), 1.0f), MooncakeTheme.getColors(gapComposer).outline, RoundedCornerShapeKt.RoundedCornerShape(50)), gapComposer, 0);
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxHeight(SizeKt.fillMaxWidth(companion, f > RecyclerView.DECELERATION_RATE ? RangesKt___RangesKt.coerceIn(f, 0.05f, 1.0f) : f), 1.0f), j, RoundedCornerShapeKt.RoundedCornerShape(50)), gapComposer, 0);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DividerKt$$ExternalSyntheticLambda0(f, modifier, j, i);
        }
    }

    /* renamed from: ProgressSection-3IgeMak, reason: not valid java name */
    public static final void m3736ProgressSection3IgeMak(PaymentPlanSummaryViewModel.ProgressSection progressSection, long j, Modifier modifier, Composer composer, int i) {
        Modifier wrapContentHeight;
        PaymentPlanSummaryViewModel.ProgressSection progressSection2 = progressSection;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1584421086);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(progressSection2) ? 4 : 2) | (gapComposer.changed(j) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(modifier, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CelebrationKt$$ExternalSyntheticLambda1(6);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(24.0f, SemanticsModifierKt.semantics(wrapContentHeight, true, (Function1) rememberedValue), MooncakeTheme.getColors(gapComposer).background, 24.0f);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m);
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
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(12.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Top, gapComposer, 6);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier weight = rowScopeInstance.weight(1.0f, companion, true);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 48);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, weight);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            progressSection2 = progressSection;
            KeypadKt.m3651TextPdH14aY(0, 0, 5, 0, 0, 0, 3826, MooncakeTheme.getColors(gapComposer).label, (Composer) gapComposer, (Modifier) null, MooncakeTheme.getTypography(gapComposer).header3, (TextLineBalancing) null, progressSection2.startText, (Map) null, (Function1) null, false);
            String str = progressSection2.startLabel;
            KeypadKt.m3651TextPdH14aY(0, 0, 5, 0, 0, 0, 3826, MooncakeTheme.getColors(gapComposer).label, (Composer) gapComposer, (Modifier) null, MooncakeTheme.getTypography(gapComposer).smallBody, (TextLineBalancing) null, str == null ? "" : str, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            Modifier weight2 = rowScopeInstance.weight(1.0f, companion, true);
            ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, Alignment.Companion.End, gapComposer, 48);
            int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, weight2);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier4, composeUiNode$Companion$SetModifier$14);
            KeypadKt.m3651TextPdH14aY(0, 0, 6, 0, 0, 0, 3826, MooncakeTheme.getColors(gapComposer).label, (Composer) gapComposer, (Modifier) null, MooncakeTheme.getTypography(gapComposer).header3, (TextLineBalancing) null, progressSection2.endText, (Map) null, (Function1) null, false);
            String str2 = progressSection2.endLabel;
            KeypadKt.m3651TextPdH14aY(0, 0, 6, 0, 0, 0, 3826, MooncakeTheme.getColors(gapComposer).label, (Composer) gapComposer, (Modifier) null, MooncakeTheme.getTypography(gapComposer).smallBody, (TextLineBalancing) null, str2 == null ? "" : str2, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            gapComposer.end(true);
            gapComposer.end(true);
            m3735ProgressBar3IgeMak(progressSection2.progressPercent, (i2 & 112) | MLKEMEngine.KyberPolyBytes, j, gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13));
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TapToPayPaymentKt$$ExternalSyntheticLambda3(i, 11, j, progressSection2, modifier);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, int] */
    /* renamed from: PurchasesSection-sW7UJKQ, reason: not valid java name */
    public static final void m3737PurchasesSectionsW7UJKQ(PaymentPlanSummaryViewModel.PurchasesSection purchasesSection, long j, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier wrapContentHeight;
        Object obj;
        ComposableLambdaImpl composableLambdaImpl;
        boolean z;
        Unit unit;
        Modifier.Companion companion;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        BiasAlignment.Horizontal horizontal;
        Arrangement$Top$1 arrangement$Top$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        PaymentPlanSummaryViewModel.PurchasesSection.DetailRow detailRow;
        ?? r2;
        float f;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14;
        Arrangement$End$1 arrangement$End$1;
        Unit unit2;
        GapComposer gapComposer;
        Modifier.Companion companion2;
        boolean z2;
        Function1 function12 = function1;
        BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
        Arrangement$Top$1 arrangement$Top$12 = SpacerKt.Top;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1597274805);
        Applier applier = gapComposer2.applier;
        int i2 = i | (gapComposer2.changedInstance(purchasesSection) ? 4 : 2) | (gapComposer2.changedInstance(function12) ? 256 : 128) | (gapComposer2.changed(modifier) ? 2048 : 1024);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1155) != 1154)) {
            wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(modifier, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(wrapContentHeight, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)), MooncakeTheme.getColors(gapComposer2).background, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal2, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            String str = purchasesSection.title;
            Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
            float f2 = 24.0f;
            Modifier.Companion companion4 = companion3;
            KeypadKt.m3651TextPdH14aY(0, 0, 5, 0, 48, 0, 3824, MooncakeTheme.getColors(gapComposer2).label, (Composer) gapComposer2, SpacerKt.m298padding3ABfNKs(companion3, 24.0f), MooncakeTheme.getTypography(gapComposer2).smallTitle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer2.startReplaceGroup(1914250265);
            Iterator it = purchasesSection.detailRows.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                obj = Composer.Companion.Empty;
                if (!hasNext) {
                    break;
                }
                PaymentPlanSummaryViewModel.PurchasesSection.DetailRow detailRow2 = (PaymentPlanSummaryViewModel.PurchasesSection.DetailRow) it.next();
                Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(companion4, 16.0f, 16.0f, f2, 16.0f);
                Object rememberedValue = gapComposer2.rememberedValue();
                if (rememberedValue == obj) {
                    rememberedValue = new CelebrationKt$$ExternalSyntheticLambda1(4);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                Modifier semantics = SemanticsModifierKt.semantics(m301paddingqDBjuR0, true, (Function1) rememberedValue);
                BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
                Arrangement$End$1 arrangement$End$12 = SpacerKt.Start;
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$End$12, vertical, gapComposer2, 48);
                int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, semantics);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                gapComposer2.startReusableNode();
                if (gapComposer2.inserting) {
                    gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer2.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$15);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$16);
                Integer valueOf = Integer.valueOf(hashCode2);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$17);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$12);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$18);
                StackedAvatarViewModel.Single single = detailRow2.avatar;
                if (single == null) {
                    gapComposer2.startReplaceGroup(143432704);
                    gapComposer2.end(false);
                    horizontal = horizontal2;
                    arrangement$Top$1 = arrangement$Top$12;
                    companion = companion4;
                    detailRow = detailRow2;
                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$18;
                    r2 = 0;
                    f = 16.0f;
                    composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                    composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$17;
                    gapComposer = gapComposer2;
                    composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$15;
                    unit2 = null;
                    arrangement$End$1 = arrangement$End$12;
                } else {
                    gapComposer2.startReplaceGroup(143432705);
                    AvatarBadgeViewModel avatarBadgeViewModel = detailRow2.avatarBadge;
                    Modifier.Companion companion5 = companion4;
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion5, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, 11);
                    companion = companion5;
                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$18;
                    Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(m302paddingqDBjuR0$default, null, 3);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (rememberedValue2 == obj) {
                        rememberedValue2 = new CelebrationKt$$ExternalSyntheticLambda1(5);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(wrapContentSize$default, (Function1) rememberedValue2);
                    CircularBadgeShape circularBadgeShape = new CircularBadgeShape(16.0f);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1204225796, new PaymentPlanSummaryKt$$ExternalSyntheticLambda42(single, 4, (byte) 0), gapComposer2);
                    horizontal = horizontal2;
                    arrangement$Top$1 = arrangement$Top$12;
                    composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                    composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$15;
                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                    detailRow = detailRow2;
                    r2 = 0;
                    f = 16.0f;
                    composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$17;
                    GapComposer gapComposer3 = gapComposer2;
                    arrangement$End$1 = arrangement$End$12;
                    m3734MaybeBadgedBox3GLzNTs(4.0f, 2.0f, 1794048, gapComposer3, rememberComposableLambda, clearAndSetSemantics, null, circularBadgeShape, avatarBadgeViewModel);
                    gapComposer3.end(false);
                    unit2 = Unit.INSTANCE;
                    gapComposer = gapComposer3;
                }
                if (unit2 == null) {
                    gapComposer.startReplaceGroup(-410997360);
                    companion2 = companion;
                    SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion2, 8.0f));
                } else {
                    companion2 = companion;
                    gapComposer.startReplaceGroup(-411015650);
                }
                gapComposer.end(r2);
                RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$End$1, Alignment.Companion.Top, gapComposer, r2);
                int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, companion2);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$13);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$14, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$19 = composeUiNode$Companion$SetModifier$1;
                LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$19, 1.0f, true);
                BiasAlignment.Horizontal horizontal3 = horizontal;
                Arrangement$Top$1 arrangement$Top$13 = arrangement$Top$1;
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$13, horizontal3, gapComposer, 0);
                int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, m);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$13);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer, composeUiNode$Companion$SetModifier$14, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier4, composeUiNode$Companion$SetModifier$19);
                PaymentPlanSummaryViewModel.PurchasesSection.DetailRow detailRow3 = detailRow;
                gapComposer2 = gapComposer;
                companion4 = companion2;
                KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4082, MooncakeTheme.getColors(gapComposer).label, (Composer) gapComposer2, (Modifier) null, MooncakeTheme.getTypography(gapComposer).smallTitle, (TextLineBalancing) null, detailRow3.title, (Map) null, (Function1) null, false);
                String str2 = detailRow3.subtitle;
                if (str2 == null) {
                    gapComposer2.startReplaceGroup(-1148069220);
                    z2 = false;
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(-1148069219);
                    KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 48, 0, 4080, MooncakeTheme.getColors(gapComposer2).secondaryLabel, (Composer) gapComposer2, SpacerKt.m302paddingqDBjuR0$default(companion4, RecyclerView.DECELERATION_RATE, 2.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), MooncakeTheme.getTypography(gapComposer2).smallBody, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                    z2 = false;
                    gapComposer2.end(false);
                }
                gapComposer2.end(true);
                String str3 = detailRow3.detail;
                if (str3 == null) {
                    gapComposer2.startReplaceGroup(1049034005);
                    gapComposer2.end(z2);
                } else {
                    gapComposer2.startReplaceGroup(1049034006);
                    KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 48, 0, 4080, MooncakeTheme.getColors(gapComposer2).label, (Composer) gapComposer2, SpacerKt.m302paddingqDBjuR0$default(companion4, f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), MooncakeTheme.getTypography(gapComposer2).smallTitle, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                    gapComposer2.end(false);
                }
                gapComposer2.end(true);
                gapComposer2.end(true);
                f2 = 24.0f;
                horizontal2 = horizontal3;
                arrangement$Top$12 = arrangement$Top$13;
            }
            gapComposer2.end(false);
            PaymentPlanSummaryViewModel.PurchasesSection.ActionButton actionButton = purchasesSection.button;
            if (actionButton == null) {
                gapComposer2.startReplaceGroup(-786032304);
                gapComposer2.end(false);
                function12 = function1;
                z = false;
                unit = null;
            } else {
                gapComposer2.startReplaceGroup(-786032303);
                String str4 = actionButton.text;
                boolean changedInstance = gapComposer2.changedInstance(actionButton) | ((i2 & 896) == 256);
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (changedInstance || rememberedValue3 == obj) {
                    function12 = function1;
                    rememberedValue3 = new PaymentPlanSummaryKt$$ExternalSyntheticLambda25(function12, actionButton, 1);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                } else {
                    function12 = function1;
                }
                Function0 function0 = (Function0) rememberedValue3;
                Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxWidth(companion4, 1.0f), 24.0f);
                Image image = actionButton.icon;
                if (image == null) {
                    gapComposer2.startReplaceGroup(363880355);
                    gapComposer2.end(false);
                    composableLambdaImpl = null;
                } else {
                    gapComposer2.startReplaceGroup(363880356);
                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-2125117973, new BulletinInfoOverlayKt$$ExternalSyntheticLambda7(image, 1), gapComposer2);
                    gapComposer2.end(false);
                    composableLambdaImpl = rememberComposableLambda2;
                }
                GapComposer gapComposer4 = gapComposer2;
                KeypadKt.m3640ButtonGFipHI0(str4, function0, m298padding3ABfNKs, null, null, null, null, false, 0, null, composableLambdaImpl, gapComposer4, MLKEMEngine.KyberPolyBytes, 0, 3064);
                gapComposer2 = gapComposer4;
                z = false;
                gapComposer2.end(false);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                re$$ExternalSyntheticOutline0.m(gapComposer2, 1914323367, companion4, 8.0f, gapComposer2);
            } else {
                gapComposer2.startReplaceGroup(1914306379);
            }
            gapComposer2.end(z);
            gapComposer2.end(true);
        } else {
            gapComposer2.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextViewKt$$ExternalSyntheticLambda0(purchasesSection, j, function12, modifier, i, 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v4 */
    public static final void SourceInfoSection(StackedAvatarViewModel stackedAvatarViewModel, String str, Function0 function0, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        GapComposer gapComposer;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        ?? r8;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        int i3;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        Modifier.Companion companion;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14;
        Modifier m183clickableoSLSa3U$default;
        Modifier.Companion companion2;
        GapComposer gapComposer2;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-2087559160);
        Applier applier = gapComposer3.applier;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer3.changed(stackedAvatarViewModel) : gapComposer3.changedInstance(stackedAvatarViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer3.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer3.changedInstance(function0) ? 256 : 128;
        }
        int i4 = i2 | 3072;
        if (gapComposer3.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
            Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion3, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, m302paddingqDBjuR0$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer3.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$15);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$16);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$17);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$18);
            KeypadKt.m3642DivideraMcp0Q(null, MooncakeTheme.getColors(gapComposer3).segmentedControlBackground, 2.0f, gapComposer3, MLKEMEngine.KyberPolyBytes, 1);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion3, 1.0f);
            if (function0 == null) {
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$15;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$18;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                r8 = 0;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$17;
                companion = companion3;
                m183clickableoSLSa3U$default = companion;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                i3 = 3072;
            } else {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                r8 = 0;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$18;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                i3 = 3072;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$15;
                companion = companion3;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$17;
                m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(companion, false, null, null, function0, 15);
            }
            Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(fillMaxWidth.then(m183clickableoSLSa3U$default), 16.0f, 24.0f, 16.0f, 28.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer3, 48);
            int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, m301paddingqDBjuR0);
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, rowMeasurePolicy, composeUiNode$Companion$SetModifier$13);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$1);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$14, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$12);
            if (stackedAvatarViewModel != null) {
                gapComposer3.startReplaceGroup(1330916789);
                Object rememberedValue = gapComposer3.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new CelebrationKt$$ExternalSyntheticLambda1(9);
                    gapComposer3.updateRememberedValue(rememberedValue);
                }
                companion2 = companion;
                StackedAvatarsKt.StackedAvatars(stackedAvatarViewModel, new PaymentPlanSummaryKt$$ExternalSyntheticLambda11(20), SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, 11), 24.0f), StackedAvatarView$TextSize.LARGE, gapComposer3, i3 | (i4 & 14), 0);
                gapComposer3.end(r8);
            } else {
                companion2 = companion;
                gapComposer3.startReplaceGroup(1331169780);
                gapComposer3.end(r8);
            }
            if (str != null) {
                gapComposer3.startReplaceGroup(1331203539);
                AnnotatedString.Builder builder = new AnnotatedString.Builder();
                Worker.DefaultImpls.appendMarkdown$default(builder, str, null, 6);
                KeypadKt.m3650TextPdH14aY(0, 0, 0, 0, 0, 0, 4080, MooncakeTheme.getColors(gapComposer3).label, (Composer) gapComposer3, (Modifier) new LayoutWeightElement(1.0f, r8), builder.toAnnotatedString(), MooncakeTheme.getTypography(gapComposer3).strongCaption, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                GapComposer gapComposer4 = gapComposer3;
                gapComposer4.end(r8);
                gapComposer2 = gapComposer4;
            } else {
                gapComposer3.startReplaceGroup(1331450516);
                gapComposer3.end(r8);
                gapComposer2 = gapComposer3;
            }
            Painter painterResource = Countries.painterResource(R.drawable.retro_icon_info, r8, gapComposer2);
            Modifier.Companion companion4 = companion2;
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(companion4, 10.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), 12.0f);
            long j = MooncakeTheme.getColors(gapComposer2).icon;
            GapComposer gapComposer5 = gapComposer2;
            ImageKt.Image(painterResource, null, m285size3ABfNKs, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer5, Painter.$stable | 432, 56);
            GapComposer gapComposer6 = gapComposer5;
            gapComposer6.end(true);
            gapComposer6.end(true);
            modifier2 = companion4;
            gapComposer = gapComposer6;
        } else {
            gapComposer3.skipToGroupEnd();
            modifier2 = modifier;
            gapComposer = gapComposer3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda4(stackedAvatarViewModel, i, str, function0, modifier2, 11);
        }
    }

    public static final void SummarySection(PaymentPlanSummaryViewModel.SummarySection summarySection, Function0 function0, Modifier modifier, Composer composer, int i) {
        Modifier wrapContentHeight;
        ArrayList<PaymentPlanSummaryViewModel.SummarySection.DetailItem> arrayList;
        boolean z;
        Modifier.Companion companion;
        int i2;
        Modifier.Companion companion2;
        boolean z2;
        boolean z3;
        char c;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1306617677);
        Applier applier = gapComposer.applier;
        int i3 = i | (gapComposer.changedInstance(summarySection) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(modifier, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(wrapContentHeight, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)), MooncakeTheme.getColors(gapComposer).background, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            String str = summarySection.title;
            ArrayList arrayList2 = summarySection.detailItems;
            Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
            if (str != null) {
                gapComposer.startReplaceGroup(-43143434);
                arrayList = arrayList2;
                z = false;
                companion = companion3;
                KeypadKt.m3651TextPdH14aY(0, 0, 5, 0, 0, 0, 3824, MooncakeTheme.getColors(gapComposer).label, (Composer) gapComposer, SpacerKt.m301paddingqDBjuR0(companion3, 16.0f, 24.0f, 16.0f, 16.0f), MooncakeTheme.getTypography(gapComposer).smallTitle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            } else {
                arrayList = arrayList2;
                z = false;
                companion = companion3;
                gapComposer.startReplaceGroup(-42877237);
                gapComposer.end(false);
            }
            String str2 = summarySection.summaryMarkdownText;
            if (str2 != null) {
                gapComposer.startReplaceGroup(-42774286);
                AnnotatedString.Builder builder = new AnnotatedString.Builder();
                Worker.DefaultImpls.appendMarkdown$default(builder, str2, null, 6);
                Modifier.Companion companion4 = companion;
                i2 = i3;
                companion2 = companion4;
                KeypadKt.m3650TextPdH14aY(0, 0, 0, 0, 48, 0, 4080, MooncakeTheme.getColors(gapComposer).label, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion4, 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 16.0f, 2), builder.toAnnotatedString(), MooncakeTheme.getTypography(gapComposer).smallBody, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                gapComposer.end(z);
            } else {
                i2 = i3;
                companion2 = companion;
                gapComposer.startReplaceGroup(-42504245);
                gapComposer.end(z);
            }
            if (arrayList.isEmpty()) {
                z2 = z;
                z3 = true;
                gapComposer.startReplaceGroup(-41438837);
                gapComposer.end(z2);
            } else {
                float f = 18.0f;
                re$$ExternalSyntheticOutline0.m(gapComposer, -42430589, companion2, 18.0f, gapComposer);
                gapComposer.startReplaceGroup(-278461123);
                for (PaymentPlanSummaryViewModel.SummarySection.DetailItem detailItem : arrayList) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        c = 3;
                        rememberedValue = new CelebrationKt$$ExternalSyntheticLambda1(3);
                        gapComposer.updateRememberedValue(rememberedValue);
                    } else {
                        c = 3;
                    }
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(SemanticsModifierKt.semantics(fillMaxWidth, true, (Function1) rememberedValue), 16.0f, 6.0f);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.CenterVertically, gapComposer, 54);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    AnnotatedString.Builder builder2 = new AnnotatedString.Builder();
                    Worker.DefaultImpls.appendMarkdown$default(builder2, detailItem.label, null, 6);
                    Modifier.Companion companion5 = companion2;
                    KeypadKt.m3650TextPdH14aY(0, 0, 0, 0, 0, 0, 4080, MooncakeTheme.getColors(gapComposer).label, (Composer) gapComposer, (Modifier) new LayoutWeightElement(1.0f, true), builder2.toAnnotatedString(), MooncakeTheme.getTypography(gapComposer).smallBody, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                    AnnotatedString.Builder builder3 = new AnnotatedString.Builder();
                    Worker.DefaultImpls.appendMarkdown$default(builder3, detailItem.value, null, 6);
                    KeypadKt.m3650TextPdH14aY(1, 0, 0, 0, 196656, 0, 4048, MooncakeTheme.getColors(gapComposer).label, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion5, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), builder3.toAnnotatedString(), MooncakeTheme.getTypography(gapComposer).smallBody, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                    gapComposer.end(true);
                    companion2 = companion5;
                    z = false;
                    f = 18.0f;
                }
                z2 = z;
                Modifier.Companion companion6 = companion2;
                z3 = true;
                Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, z2, companion6, f, gapComposer);
                gapComposer.end(z2);
            }
            StackedAvatarViewModel.Single single = summarySection.sourceIcon;
            String str3 = summarySection.sourceText;
            if (single == null && str3 == null) {
                gapComposer.startReplaceGroup(-41215637);
                gapComposer.end(z2);
            } else {
                gapComposer.startReplaceGroup(-41308854);
                SourceInfoSection(single, str3, function0, null, gapComposer, 8 | ((i2 << 3) & 896));
                gapComposer.end(false);
            }
            gapComposer.end(z3);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PaymentPlanSummaryKt$$ExternalSyntheticLambda19(summarySection, function0, modifier, i, 1);
        }
    }

    /* renamed from: TimelineSection-sW7UJKQ, reason: not valid java name */
    public static final void m3738TimelineSectionsW7UJKQ(PaymentPlanSummaryViewModel.TimelineSection timelineSection, long j, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier wrapContentHeight;
        String str;
        boolean z;
        Modifier.Companion companion;
        Modifier.Companion companion2;
        MooncakePillButton.Style style;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1462803875);
        int i2 = i | (gapComposer.changedInstance(timelineSection) ? 4 : 2) | (gapComposer.changed(j) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128) | (gapComposer.changed(modifier) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(modifier, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(24.0f, wrapContentHeight, MooncakeTheme.getColors(gapComposer).background, 24.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m);
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
            String str2 = timelineSection.title;
            String str3 = timelineSection.subtitle;
            Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
            if (str2 != null) {
                gapComposer.startReplaceGroup(1126581129);
                companion = companion3;
                str = str3;
                z = false;
                KeypadKt.m3651TextPdH14aY(0, 0, 5, 0, 0, 0, 3824, MooncakeTheme.getColors(gapComposer).label, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion3, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, str3 != null ? 4.0f : 16.0f, 7), MooncakeTheme.getTypography(gapComposer).smallTitle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            } else {
                str = str3;
                z = false;
                companion = companion3;
                gapComposer.startReplaceGroup(1126844443);
                gapComposer.end(false);
            }
            if (str != null) {
                gapComposer.startReplaceGroup(1126912612);
                Modifier.Companion companion4 = companion;
                companion2 = companion4;
                KeypadKt.m3651TextPdH14aY(0, 0, 5, 0, 48, 0, 3824, MooncakeTheme.getColors(gapComposer).secondaryLabel, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion4, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7), MooncakeTheme.getTypography(gapComposer).smallBody, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer.end(z);
            } else {
                companion2 = companion;
                gapComposer.startReplaceGroup(1127149979);
                gapComposer.end(z);
            }
            boolean z2 = (i2 & 112) == 32 ? true : z;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z2 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new c7$$ExternalSyntheticLambda6(j, 19);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function12 = (Function1) rememberedValue;
            boolean changedInstance = gapComposer.changedInstance(timelineSection);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new RealSandboxer$$ExternalSyntheticLambda0(timelineSection, 5);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            AndroidView_androidKt.AndroidView(function12, null, (Function1) rememberedValue2, gapComposer, 0, 2);
            PaymentPlanSummaryViewModel.SubmitButton submitButton = timelineSection.button;
            if (submitButton != null) {
                gapComposer.startReplaceGroup(1127512152);
                String str4 = submitButton.text;
                boolean changedInstance2 = gapComposer.changedInstance(submitButton) | ((i2 & 896) == 256 ? true : z);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new PaymentPlanSummaryKt$$ExternalSyntheticLambda13(function1, submitButton, 1);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                Function0 function0 = (Function0) rememberedValue3;
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion2, 1.0f), RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                int ordinal = submitButton.style.ordinal();
                if (ordinal == 0) {
                    style = MooncakePillButton.Style.SECONDARY;
                } else if (ordinal == 1) {
                    style = MooncakePillButton.Style.PRIMARY;
                } else {
                    if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    style = MooncakePillButton.Style.TERTIARY;
                }
                KeypadKt.m3640ButtonGFipHI0(str4, function0, m302paddingqDBjuR0$default, null, null, style, null, false, 0, null, null, gapComposer, MLKEMEngine.KyberPolyBytes, 0, 4056);
                gapComposer = gapComposer;
                gapComposer.end(z);
            } else {
                gapComposer.startReplaceGroup(1127730299);
                gapComposer.end(z);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextViewKt$$ExternalSyntheticLambda0(timelineSection, j, function1, modifier, i, 7);
        }
    }
}
