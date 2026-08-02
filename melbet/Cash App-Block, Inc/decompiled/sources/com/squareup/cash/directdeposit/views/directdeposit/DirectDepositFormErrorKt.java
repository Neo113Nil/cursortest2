package com.squareup.cash.directdeposit.views.directdeposit;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.platform.TestTagKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda4;
import app.cash.local.views.brand.orders.OrderStatusRowKt$$ExternalSyntheticLambda1;
import app.cash.local.views.internal.DismissableToastKt$$ExternalSyntheticLambda3;
import app.cash.local.views.internal.LocalCombinedViewsKt$$ExternalSyntheticLambda3;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.input.InputChipKt;
import com.squareup.cash.arcade.components.input.SelectionCardStyle;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda1;
import com.squareup.cash.checks.VerifyCheckDepositKt$$ExternalSyntheticLambda14;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda7;
import com.squareup.cash.db2.profile.ProfileQueries$$ExternalSyntheticLambda13;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda0;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda1;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda3;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda14;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositEditPaycheckAmountViewModel;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositManualFormCompletionViewModel;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositManualFormDetailsViewModel;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositSingleInputViewModel;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositUpdateManualFormDetailsViewModel;
import com.squareup.cash.directdeposit.viewmodels.PaycheckDepositAllocationType;
import com.squareup.cash.earningstracker.views.components.EarningsHeaderKt$$ExternalSyntheticLambda0;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.family.familyhub.views.FamilyHomeViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.family.familyhub.views.FamilyMemberRowKt$$ExternalSyntheticLambda5;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda3;
import com.squareup.cash.money.applets.common.views.FailedAppletTileKt$$ExternalSyntheticLambda0;
import com.squareup.cash.payments.views.NoteInputViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.work.views.shift.ShiftNoteViewKt$$ExternalSyntheticLambda9;
import com.squareup.util.Strings;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class DirectDepositFormErrorKt {
    public static final ComposableLambdaImpl lambda$55952063 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda7(29), false, 55952063);
    public static final ComposableLambdaImpl lambda$1955273881 = new ComposableLambdaImpl(new AllowanceViewKt$$ExternalSyntheticLambda3(2), false, 1955273881);
    public static final ComposableLambdaImpl lambda$2091045514 = new ComposableLambdaImpl(new EarningsHeaderKt$$ExternalSyntheticLambda0(1), false, 2091045514);

    /* renamed from: lambda$-1808121933, reason: not valid java name */
    public static final ComposableLambdaImpl f384lambda$1808121933 = new ComposableLambdaImpl(new EarningsHeaderKt$$ExternalSyntheticLambda0(2), false, -1808121933);
    public static final ComposableLambdaImpl lambda$1007420647 = new ComposableLambdaImpl(new EarningsHeaderKt$$ExternalSyntheticLambda0(3), false, 1007420647);
    public static final ComposableLambdaImpl lambda$513712721 = new ComposableLambdaImpl(new AllowanceViewKt$$ExternalSyntheticLambda3(3), false, 513712721);
    public static final ComposableLambdaImpl lambda$1485183420 = new ComposableLambdaImpl(new EarningsHeaderKt$$ExternalSyntheticLambda0(4), false, 1485183420);
    public static final ComposableLambdaImpl lambda$354236672 = new ComposableLambdaImpl(new EarningsHeaderKt$$ExternalSyntheticLambda0(5), false, 354236672);
    public static final ComposableLambdaImpl lambda$801532791 = new ComposableLambdaImpl(new EarningsHeaderKt$$ExternalSyntheticLambda0(6), false, 801532791);

    /* renamed from: lambda$-1101729063, reason: not valid java name */
    public static final ComposableLambdaImpl f382lambda$1101729063 = new ComposableLambdaImpl(new EarningsHeaderKt$$ExternalSyntheticLambda0(7), false, -1101729063);

    /* renamed from: lambda$-1744581099, reason: not valid java name */
    public static final ComposableLambdaImpl f383lambda$1744581099 = new ComposableLambdaImpl(new AllowanceViewKt$$ExternalSyntheticLambda3(4), false, -1744581099);
    public static final ComposableLambdaImpl lambda$1215072167 = new ComposableLambdaImpl(new EarningsHeaderKt$$ExternalSyntheticLambda0(8), false, 1215072167);

    /* renamed from: lambda$-1885625225, reason: not valid java name */
    public static final ComposableLambdaImpl f385lambda$1885625225 = new ComposableLambdaImpl(new AllowanceViewKt$$ExternalSyntheticLambda3(5), false, -1885625225);

    /* renamed from: lambda$-1919445179, reason: not valid java name */
    public static final ComposableLambdaImpl f386lambda$1919445179 = new ComposableLambdaImpl(new AllowanceViewKt$$ExternalSyntheticLambda3(6), false, -1919445179);

    /* renamed from: lambda$-212631560, reason: not valid java name */
    public static final ComposableLambdaImpl f387lambda$212631560 = new ComposableLambdaImpl(new AllowanceViewKt$$ExternalSyntheticLambda3(7), false, -212631560);

    /* renamed from: lambda$-619414746, reason: not valid java name */
    public static final ComposableLambdaImpl f388lambda$619414746 = new ComposableLambdaImpl(new EarningsHeaderKt$$ExternalSyntheticLambda0(9), false, -619414746);
    public static final ComposableLambdaImpl lambda$1712182415 = new ComposableLambdaImpl(new EarningsHeaderKt$$ExternalSyntheticLambda0(10), false, 1712182415);

    public static final void DirectDepositEditPaycheckAllocation(DirectDepositEditPaycheckAmountViewModel directDepositEditPaycheckAmountViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        directDepositEditPaycheckAmountViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1372168975);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(directDepositEditPaycheckAmountViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            ScrollableContentScaffold(Expect_jvmKt.rememberComposableLambda(1933355778, new BookletGridKt$$ExternalSyntheticLambda1(25, function1), gapComposer), Expect_jvmKt.rememberComposableLambda(-1713384061, new ArcadeModal2Kt$$ExternalSyntheticLambda0(3, directDepositEditPaycheckAmountViewModel, function1), gapComposer), Expect_jvmKt.rememberComposableLambda(1611271620, new BookletGridKt$$ExternalSyntheticLambda1(26, function1), gapComposer), companion, null, gapComposer, ((i3 << 3) & 7168) | 438, 16);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda3(directDepositEditPaycheckAmountViewModel, function1, modifier2, i, 27);
        }
    }

    public static final void DirectDepositManualFormCompletion(DirectDepositManualFormCompletionViewModel directDepositManualFormCompletionViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        DirectDepositManualFormCompletionViewModel directDepositManualFormCompletionViewModel2;
        directDepositManualFormCompletionViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1770643316);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(directDepositManualFormCompletionViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            boolean z = directDepositManualFormCompletionViewModel instanceof DirectDepositManualFormCompletionViewModel.Loading;
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda14(3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            directDepositManualFormCompletionViewModel2 = directDepositManualFormCompletionViewModel;
            Strings.LoadableFullScreenContent(directDepositManualFormCompletionViewModel2, z, m177backgroundbw27NRU, (Function1) rememberedValue, null, Expect_jvmKt.rememberComposableLambda(1805614879, new LocalViewFactory$$ExternalSyntheticLambda4(23, directDepositManualFormCompletionViewModel, function1), gapComposer), gapComposer, (i2 & 14) | 199680, 16);
        } else {
            directDepositManualFormCompletionViewModel2 = directDepositManualFormCompletionViewModel;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda1(directDepositManualFormCompletionViewModel2, function1, i, 11);
        }
    }

    public static final void DirectDepositManualFormDetails(DirectDepositManualFormDetailsViewModel directDepositManualFormDetailsViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        directDepositManualFormDetailsViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-509494953);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(directDepositManualFormDetailsViewModel) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 | MLKEMEngine.KyberPolyBytes;
        int i5 = 1;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            ScrollableContentScaffold(Expect_jvmKt.rememberComposableLambda(1550068548, new BookletGridKt$$ExternalSyntheticLambda1(29, function1), gapComposer), Expect_jvmKt.rememberComposableLambda(1995605859, new ArcadeModal2Kt$$ExternalSyntheticLambda0(i3, directDepositManualFormDetailsViewModel, function1), gapComposer), Expect_jvmKt.rememberComposableLambda(-405213758, new ErrorView$$ExternalSyntheticLambda3(i5, function1), gapComposer), companion, null, gapComposer, ((i4 << 3) & 7168) | 438, 16);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda3(directDepositManualFormDetailsViewModel, function1, modifier2, i, 28);
        }
    }

    public static final void DirectDepositSingleInput(DirectDepositSingleInputViewModel directDepositSingleInputViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        Modifier modifier2;
        directDepositSingleInputViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-505466387);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(directDepositSingleInputViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer2.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            FocusRequester rememberFocusRequesterAndRequestFocus = DBUtil.rememberFocusRequesterAndRequestFocus(gapComposer2);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            gapComposer = gapComposer2;
            ScrollableContentScaffold(Expect_jvmKt.rememberComposableLambda(-318163686, new DirectDepositSingleInputKt$$ExternalSyntheticLambda0(directDepositSingleInputViewModel, rememberFocusRequesterAndRequestFocus, delegatingSoftwareKeyboardController, function1, 0), gapComposer2), Expect_jvmKt.rememberComposableLambda(1392487161, new DirectDepositSingleInputKt$$ExternalSyntheticLambda0(directDepositSingleInputViewModel, function1, rememberFocusRequesterAndRequestFocus, delegatingSoftwareKeyboardController), gapComposer2), Expect_jvmKt.rememberComposableLambda(-2025309416, new DirectDepositSingleInputKt$$ExternalSyntheticLambda0(directDepositSingleInputViewModel, rememberFocusRequesterAndRequestFocus, delegatingSoftwareKeyboardController, function1, 2), gapComposer2), TestTagKt.testTag(SpacerKt.imePadding(companion), "DirectDepositSingleInput"), null, gapComposer, 438, 16);
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda3(directDepositSingleInputViewModel, function1, modifier2, i, 29);
        }
    }

    public static final void DirectDepositUpdateManualFormDetails(DirectDepositUpdateManualFormDetailsViewModel directDepositUpdateManualFormDetailsViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        directDepositUpdateManualFormDetailsViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(592681312);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(directDepositUpdateManualFormDetailsViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1);
            boolean z = directDepositUpdateManualFormDetailsViewModel instanceof DirectDepositUpdateManualFormDetailsViewModel.Loading;
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda14(i3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Strings.LoadableFullScreenContent(directDepositUpdateManualFormDetailsViewModel, z, m177backgroundbw27NRU, (Function1) rememberedValue, null, Expect_jvmKt.rememberComposableLambda(-347888146, new LocalViewFactory$$ExternalSyntheticLambda4(directDepositUpdateManualFormDetailsViewModel, function1), gapComposer), gapComposer, 199680 | (i4 & 14), 16);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeViewKt$$ExternalSyntheticLambda1((Object) directDepositUpdateManualFormDetailsViewModel, function1, (Object) modifier2, i, 1);
        }
    }

    public static final void ErrorContent(String str, String str2, Function0 function0, Function0 function02, Composer composer, int i) {
        str.getClass();
        str2.getClass();
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1272291622);
        int i2 = (gapComposer.changed(str) ? 4 : 2) | i | (gapComposer.changed(str2) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128) | (gapComposer.changedInstance(function02) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = 3;
            ScrollableContentScaffold(Expect_jvmKt.rememberComposableLambda(-1630646771, new DismissableToastKt$$ExternalSyntheticLambda3(12, function0), gapComposer), Expect_jvmKt.rememberComposableLambda(-1620876210, new NoteInputViewKt$$ExternalSyntheticLambda4(str, str2, i3), gapComposer), Expect_jvmKt.rememberComposableLambda(-37676977, new ShiftNoteViewKt$$ExternalSyntheticLambda9(function02, function0, i3), gapComposer), null, null, gapComposer, 438, 24);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new VerifyCheckDepositKt$$ExternalSyntheticLambda14(i, 23, str, str2, function02, function0);
        }
    }

    public static final void FormField(int i, String str, Function0 function0, Composer composer, int i2) {
        str.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1081309479);
        int i3 = i2 | (gapComposer.changed(i) ? 4 : 2) | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128);
        int i4 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(Expect_jvmKt.rememberComposableLambda(-398510503, new LocalCombinedViewsKt$$ExternalSyntheticLambda3(i, 7), gapComposer), null, function0, false, false, Expect_jvmKt.rememberComposableLambda(-353735201, new FamilyMemberRowKt$$ExternalSyntheticLambda5(str, i4), gapComposer), null, 0L, new CellDefaultAccessory.ButtonCompact(null, null, false, lambda$1007420647, 15), null, gapComposer, (i3 & 896) | 1572870, 1466);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FailedAppletTileKt$$ExternalSyntheticLambda0(str, function0, i, i2);
        }
    }

    public static final void PaycheckInputCard(DirectDepositEditPaycheckAmountViewModel directDepositEditPaycheckAmountViewModel, PaycheckDepositAllocationType paycheckDepositAllocationType, int i, int i2, Function1 function1, Composer composer, int i3) {
        int i4;
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1175269255);
        int i5 = (gapComposer.changedInstance(directDepositEditPaycheckAmountViewModel) ? 4 : 2) | i3 | (gapComposer.changed(i) ? 256 : 128) | (gapComposer.changed(i2) ? 2048 : 1024) | (gapComposer.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 9363) != 9362)) {
            SelectionCardStyle[] selectionCardStyleArr = SelectionCardStyle.$VALUES;
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            if (directDepositEditPaycheckAmountViewModel.selectedType == paycheckDepositAllocationType) {
                i4 = 16384;
                z = true;
            } else {
                i4 = 16384;
                z = false;
            }
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-85478902, new LocalCombinedViewsKt$$ExternalSyntheticLambda3(i, 5), gapComposer);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-203115671, new LocalCombinedViewsKt$$ExternalSyntheticLambda3(i2, 6), gapComposer);
            boolean z2 = (i5 & 57344) == i4;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ProfileQueries$$ExternalSyntheticLambda13(16, function1, paycheckDepositAllocationType);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            InputChipKt.SelectionCard(rememberComposableLambda, rememberComposableLambda2, z, m300paddingVpY3zN4$default, false, (Function1) rememberedValue, gapComposer, 3126, 32);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OrderStatusRowKt$$ExternalSyntheticLambda1(directDepositEditPaycheckAmountViewModel, paycheckDepositAllocationType, i, i2, function1, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ScrollableContentScaffold(ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, ComposableLambdaImpl composableLambdaImpl3, Modifier modifier, Function3 function3, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function3 function32;
        Modifier modifier3;
        Function3 function33;
        RecomposeScopeImpl endRestartGroup;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2071806771);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(composableLambdaImpl) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(composableLambdaImpl2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(composableLambdaImpl3) ? 256 : 128;
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
                function32 = function3;
                i3 |= gapComposer.changedInstance(function32) ? 16384 : PKIFailureInfo.certRevoked;
                if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    if (i5 != 0) {
                        modifier2 = companion;
                    }
                    Function3 function34 = i4 != 0 ? null : function32;
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(modifier2, colors.semantic.background.f1047app, ColorKt.RectangleShape), 1.0f));
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, systemBarsPadding);
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
                    int i6 = i3;
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    Object valueOf2 = Integer.valueOf(6 | ((i6 << 3) & 112));
                    Modifier modifier4 = modifier2;
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    composableLambdaImpl.invoke(columnScopeInstance, gapComposer, valueOf2);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                    Modifier verticalScroll$default = ImageKt.verticalScroll$default(columnScopeInstance.weight(1.0f, companion, true), ImageKt.rememberScrollState(gapComposer), false, 14);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
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
                    Recorder$$ExternalSyntheticOutline1.m(6 | (i6 & 112), composableLambdaImpl2, columnScopeInstance, gapComposer, true);
                    DimensionKt.ButtonCtaGroup(null, false, null, function34, composableLambdaImpl3, gapComposer, ((i6 >> 3) & 7168) | (57344 & (i6 << 6)), 7);
                    gapComposer.end(true);
                    function33 = function34;
                    modifier3 = modifier4;
                } else {
                    gapComposer.skipToGroupEnd();
                    modifier3 = modifier2;
                    function33 = function32;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda3((Object) composableLambdaImpl, (Object) composableLambdaImpl2, (Object) composableLambdaImpl3, modifier3, (Object) function33, i, i2, 17);
                    return;
                }
                return;
            }
            function32 = function3;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function32 = function3;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void SuccessContent(Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(751976112);
        int i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ScrollableContentScaffold(Expect_jvmKt.rememberComposableLambda(-1947479715, new BookletGridKt$$ExternalSyntheticLambda1(27, function1), gapComposer), lambda$1485183420, Expect_jvmKt.rememberComposableLambda(378592347, new BookletGridKt$$ExternalSyntheticLambda1(28, function1), gapComposer), null, f382lambda$1101729063, gapComposer, 25014, 8);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SsnViewKt$$ExternalSyntheticLambda12(i, 22, function1);
        }
    }
}
