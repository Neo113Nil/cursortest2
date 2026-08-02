package com.squareup.cash.securityhub.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.theme.MoneybotTheme;
import com.squareup.cash.pdf.view.ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.retro.views.PaymentPlanSummaryKt$$ExternalSyntheticLambda11;
import com.squareup.cash.savings.views.ButtonGroupKt$$ExternalSyntheticLambda11;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda1;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda7;
import com.squareup.cash.securityhub.viewmodels.BookletFeatureCardLinkViewModel;
import com.squareup.cash.securityhub.viewmodels.BookletFeatureCardViewModel;
import com.squareup.cash.securityhub.viewmodels.BookletSummary;
import com.squareup.cash.securityhub.viewmodels.EducationCardUiModel;
import com.squareup.cash.securityhub.viewmodels.SecurityEducationSupportRowViewModel;
import com.squareup.cash.sharesheet.ShareSheetPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda1;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda6;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class EducationCardKt {

    /* renamed from: lambda$-1819241958, reason: not valid java name */
    public static final ComposableLambdaImpl f656lambda$1819241958 = new ComposableLambdaImpl(new PaymentPlanSummaryKt$$ExternalSyntheticLambda11(23), false, -1819241958);
    public static final ComposableLambdaImpl lambda$1142398620;
    public static final ComposableLambdaImpl lambda$1459475810;
    public static final ComposableLambdaImpl lambda$429012772;
    public static final ComposableLambdaImpl lambda$45646605;
    public static final ComposableLambdaImpl lambda$6182298;
    public static final ComposableLambdaImpl lambda$631358489;
    public static final ComposableLambdaImpl lambda$772993909;

    static {
        new ComposableLambdaImpl(new ShareSheetPresenter$$ExternalSyntheticLambda0(5), false, 303328058);
        new ComposableLambdaImpl(new ShareSheetPresenter$$ExternalSyntheticLambda0(6), false, -1958185395);
        new ComposableLambdaImpl(new ShareSheetPresenter$$ExternalSyntheticLambda0(7), false, -246971434);
        new ComposableLambdaImpl(new ShareSheetPresenter$$ExternalSyntheticLambda0(8), false, 1819984875);
        new ComposableLambdaImpl(new ShareSheetPresenter$$ExternalSyntheticLambda0(9), false, -2013286756);
        lambda$772993909 = new ComposableLambdaImpl(new PaymentPlanSummaryKt$$ExternalSyntheticLambda11(24), false, 772993909);
        lambda$1142398620 = new ComposableLambdaImpl(new PaymentPlanSummaryKt$$ExternalSyntheticLambda11(25), false, 1142398620);
        new ComposableLambdaImpl(new ShareSheetPresenter$$ExternalSyntheticLambda0(10), false, 1796532833);
        new ComposableLambdaImpl(new ShareSheetPresenter$$ExternalSyntheticLambda0(11), false, -1857971173);
        lambda$429012772 = new ComposableLambdaImpl(new ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1(23), false, 429012772);
        lambda$45646605 = new ComposableLambdaImpl(new ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1(24), false, 45646605);
        lambda$631358489 = new ComposableLambdaImpl(new ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1(25), false, 631358489);
        lambda$6182298 = new ComposableLambdaImpl(new PaymentPlanSummaryKt$$ExternalSyntheticLambda11(26), false, 6182298);
        lambda$1459475810 = new ComposableLambdaImpl(new PaymentPlanSummaryKt$$ExternalSyntheticLambda11(27), false, 1459475810);
        new ComposableLambdaImpl(new ShareSheetPresenter$$ExternalSyntheticLambda0(12), false, 1078238644);
    }

    public static final void BookletFeatureCard(BookletFeatureCardViewModel bookletFeatureCardViewModel, Modifier modifier, Function0 function0, Composer composer, int i) {
        Modifier modifier2;
        bookletFeatureCardViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-587606650);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(bookletFeatureCardViewModel) ? 4 : 2) | 48 | (gapComposer.changedInstance(function0) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Strings.getSizes(gapComposer).getClass();
            Object obj = DefaultSizes.border.entries;
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier clip = ClipKt.clip(SizeKt.fillMaxWidth(companion, 1.0f), m340RoundedCornerShape0680j_4);
            long j = Strings.getColors(gapComposer).semantic.background.subtle;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(clip, j, rectangleShapeKt$RectangleShape$1);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
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
            String str = bookletFeatureCardViewModel.imageUrl;
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Strings.getSizes(gapComposer).getClass();
            Strings.getSizes(gapComposer).getClass();
            Modifier aspectRatio = OffsetKt.aspectRatio(1.7777778f, SizeKt.fillMaxWidth(SpacerKt.m302paddingqDBjuR0$default(companion, 8.0f, 8.0f, 8.0f, RecyclerView.DECELERATION_RATE, 8), 1.0f), false);
            Strings.getSizes(gapComposer).getClass();
            AsyncImageKt.m1438AsyncImage10Xjiaw(str, null, ImageKt.m177backgroundbw27NRU(ClipKt.clip(aspectRatio, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)), Strings.getColors(gapComposer).semantic.background.subtle, rectangleShapeKt$RectangleShape$1), null, ContentScale.Companion.Crop, null, gapComposer, 1572912, 1976);
            Strings.getSizes(gapComposer).getClass();
            Strings.getSizes(gapComposer).getClass();
            Strings.getSizes(gapComposer).getClass();
            Strings.getSizes(gapComposer).getClass();
            Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(companion, 16.0f, 16.0f, 16.0f, 16.0f);
            Strings.getSizes(gapComposer).getClass();
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m301paddingqDBjuR0);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            String str2 = bookletFeatureCardViewModel.title;
            TextStyle textStyle = Strings.getTypography(gapComposer).headlineSmall;
            long j2 = Strings.getColors(gapComposer).semantic.text.standard;
            gapComposer = gapComposer;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, j2, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, bookletFeatureCardViewModel.body, (Map) null, (Function1) null, false);
            BookletFeatureCardLinkViewModel bookletFeatureCardLinkViewModel = bookletFeatureCardViewModel.link;
            if (bookletFeatureCardLinkViewModel == null) {
                gapComposer.startReplaceGroup(-1753821881);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1753821880);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.link, (Composer) gapComposer, ImageKt.m183clickableoSLSa3U$default(companion, false, null, null, function0, 15), TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).linkMedium, 0L, 0L, null, null, 0L, null, 0L, TextDecoration.Underline, null, null, 0, 0L, null, null, 0, 16773119), (TextLineBalancing) null, bookletFeatureCardLinkViewModel.text, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetScope$$ExternalSyntheticLambda1(bookletFeatureCardViewModel, modifier2, function0, i, 4);
        }
    }

    public static final void EducationCard(EducationCardUiModel educationCardUiModel, Function0 function0, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        educationCardUiModel.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-911381723);
        int i2 = i | (gapComposer.changedInstance(educationCardUiModel) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m290width3ABfNKs = SizeKt.m290width3ABfNKs(companion, 164.0f);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CalloutKt$$ExternalSyntheticLambda1(26);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(m290width3ABfNKs, true, (Function1) rememberedValue);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
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
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.m290width3ABfNKs(companion, 164.0f), 180.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            MoneybotTheme.m3623Cardjb40ds(m277height3ABfNKs, false, colors.semantic.background.subtle, RecyclerView.DECELERATION_RATE, function0, Expect_jvmKt.rememberComposableLambda(1810110486, new ButtonGroupKt$$ExternalSyntheticLambda11(educationCardUiModel, 22), gapComposer), lambda$772993909, gapComposer, ((i2 << 9) & 57344) | 1769526, 8);
            gapComposer = gapComposer;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium, (TextLineBalancing) null, educationCardUiModel.title, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetScope$$ExternalSyntheticLambda1(educationCardUiModel, function0, modifier2, i, 5);
        }
    }

    public static final void RelatedBookletThumbnail(String str, Composer composer, int i) {
        String str2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-477544194);
        int i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            Object obj = DefaultSizes.border.entries;
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f);
            Modifier clip = ClipKt.clip(SizeKt.m287sizeVpY3zN4(Modifier.Companion.$$INSTANCE, 39.0f, 48.0f), m340RoundedCornerShape0680j_4);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(clip, colors.semantic.background.subtle, m340RoundedCornerShape0680j_4);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CalloutKt$$ExternalSyntheticLambda1(27);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            str2 = str;
            AsyncImageKt.m1438AsyncImage10Xjiaw(str2, null, SemanticsModifierKt.clearAndSetSemantics(m177backgroundbw27NRU, (Function1) rememberedValue), null, ContentScale.Companion.Crop, null, gapComposer, (i2 & 14) | 1572912, 1976);
        } else {
            str2 = str;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InfoSectionKt$$ExternalSyntheticLambda7(str2, i, 23);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void RelatedBookletsSection(String str, List list, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer;
        str.getClass();
        list.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1924768602);
        int i2 = 256;
        int i3 = i | (gapComposer2.changed(str) ? 4 : 2) | (gapComposer2.changedInstance(list) ? 32 : 16) | (gapComposer2.changedInstance(function1) ? 256 : 128) | 3072;
        final int i4 = 0;
        final int i5 = 1;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, companion);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(function0);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ViewfinderDefaults.SectionHeader(str, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer2, i3 & 14, 30);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer2, null);
            gapComposer2.startReplaceGroup(1607576355);
            Iterator it = list.iterator();
            GapComposer gapComposer3 = gapComposer2;
            while (it.hasNext()) {
                final BookletSummary bookletSummary = (BookletSummary) it.next();
                CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-269504735, new Function2() { // from class: com.squareup.cash.securityhub.views.RelatedBookletsSectionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i6 = i4;
                        BookletSummary bookletSummary2 = bookletSummary;
                        switch (i6) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer2;
                                if (gapComposer4.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                    EducationCardKt.RelatedBookletThumbnail(bookletSummary2.imageUrl, gapComposer4, 0);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer5 = (GapComposer) composer3;
                                if (gapComposer5.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, bookletSummary2.title, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer5.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer4 = (Composer) obj;
                                int intValue3 = ((Integer) obj2).intValue();
                                GapComposer gapComposer6 = (GapComposer) composer4;
                                if (gapComposer6.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, bookletSummary2.subtitle, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer6.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer3);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1068987520, new Function2() { // from class: com.squareup.cash.securityhub.views.RelatedBookletsSectionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i6 = i5;
                        BookletSummary bookletSummary2 = bookletSummary;
                        switch (i6) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer2;
                                if (gapComposer4.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                    EducationCardKt.RelatedBookletThumbnail(bookletSummary2.imageUrl, gapComposer4, 0);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer5 = (GapComposer) composer3;
                                if (gapComposer5.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, bookletSummary2.title, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer5.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer4 = (Composer) obj;
                                int intValue3 = ((Integer) obj2).intValue();
                                GapComposer gapComposer6 = (GapComposer) composer4;
                                if (gapComposer6.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, bookletSummary2.subtitle, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer6.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer3);
                int i6 = ((i3 & 896) == i2 ? i5 : i4) | (gapComposer3.changedInstance(bookletSummary) ? 1 : 0);
                Object rememberedValue = gapComposer3.rememberedValue();
                if (i6 != 0 || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ShareSheetViewKt$$ExternalSyntheticLambda5(20, function1, bookletSummary);
                    gapComposer3.updateRememberedValue(rememberedValue);
                }
                final int i7 = 2;
                GapComposer gapComposer4 = gapComposer3;
                CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, null, (Function0) rememberedValue, null, false, true, Expect_jvmKt.rememberComposableLambda(510006458, new Function2() { // from class: com.squareup.cash.securityhub.views.RelatedBookletsSectionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i62 = i7;
                        BookletSummary bookletSummary2 = bookletSummary;
                        switch (i62) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer42 = (GapComposer) composer2;
                                if (gapComposer42.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                    EducationCardKt.RelatedBookletThumbnail(bookletSummary2.imageUrl, gapComposer42, 0);
                                } else {
                                    gapComposer42.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer5 = (GapComposer) composer3;
                                if (gapComposer5.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, bookletSummary2.title, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer5.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer4 = (Composer) obj;
                                int intValue3 = ((Integer) obj2).intValue();
                                GapComposer gapComposer6 = (GapComposer) composer4;
                                if (gapComposer6.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, bookletSummary2.subtitle, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer6.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer3), null, push, 0L, null, gapComposer4, 819462198, 0, 3380);
                i4 = i4;
                gapComposer3 = gapComposer4;
                i3 = i3;
                i2 = i2;
                i5 = 1;
            }
            gapComposer3.end(i4);
            gapComposer3.end(true);
            modifier2 = companion;
            gapComposer = gapComposer3;
        } else {
            gapComposer2.skipToGroupEnd();
            modifier2 = modifier;
            gapComposer = gapComposer2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new RelatedBookletsSectionKt$$ExternalSyntheticLambda4(str, list, function1, modifier2, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r16v2 */
    public static final void SecurityEducationSupportSection(String str, List list, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Function0 function0;
        Icons icons;
        ?? r16;
        str.getClass();
        list.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(599472678);
        int i2 = 256;
        int i3 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changedInstance(list) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128) | 3072;
        boolean z = true;
        boolean z2 = false;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            Function0 function02 = null;
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
            ViewfinderDefaults.SectionHeader(str, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer, i3 & 14, 30);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            gapComposer.startReplaceGroup(-834916845);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SecurityEducationSupportRowViewModel securityEducationSupportRowViewModel = (SecurityEducationSupportRowViewModel) it.next();
                boolean z3 = securityEducationSupportRowViewModel.isActionable;
                CellDefaultAccessory cellDefaultAccessory = z3 ? CellDefaultAccessory.Push.INSTANCE : CellDefaultAccessory.None.INSTANCE;
                if (z3) {
                    gapComposer.startReplaceGroup(72703273);
                    boolean changedInstance = ((i3 & 896) == i2 ? z : z2) | gapComposer.changedInstance(securityEducationSupportRowViewModel);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new ShareSheetViewKt$$ExternalSyntheticLambda5(21, function1, securityEducationSupportRowViewModel);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    function0 = (Function0) rememberedValue;
                    gapComposer.end(z2);
                } else {
                    gapComposer.startReplaceGroup(72753276);
                    gapComposer.end(z2);
                    function0 = function02;
                }
                int ordinal = securityEducationSupportRowViewModel.id.ordinal();
                if (ordinal == 0) {
                    icons = Icons.Alert24;
                } else if (ordinal == z) {
                    icons = Icons.LockUnlocked24;
                } else {
                    if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    icons = Icons.CommSms24;
                }
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z2);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(z2);
                }
                long j = colors.semantic.background.subtle;
                String str2 = securityEducationSupportRowViewModel.subtitle;
                if (str2 == null) {
                    gapComposer.startReplaceGroup(73022696);
                    gapComposer.end(z2);
                    r16 = function02;
                } else {
                    gapComposer.startReplaceGroup(73022697);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(906785514, new InfoSectionKt$$ExternalSyntheticLambda7(str2, 24), gapComposer);
                    gapComposer.end(z2);
                    r16 = rememberComposableLambda;
                }
                GapComposer gapComposer2 = gapComposer;
                CellDefaultKt.m3391CellDefaultLargeIconaIPZJ5k(icons, null, j, Expect_jvmKt.rememberComposableLambda(-1363051481, new SheetKt$$ExternalSyntheticLambda6(securityEducationSupportRowViewModel, 9), gapComposer), null, 0L, function0, null, false, true, r16, null, cellDefaultAccessory, 0L, null, gapComposer2, 805309488, 0, 27056);
                z2 = z2;
                gapComposer = gapComposer2;
                i2 = i2;
                function02 = null;
                z = true;
                i3 = i3;
            }
            gapComposer.end(z2);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new RelatedBookletsSectionKt$$ExternalSyntheticLambda4(str, list, function1, modifier2, i, 1);
        }
    }
}
