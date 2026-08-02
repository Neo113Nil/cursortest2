package com.squareup.cash.p2pblocking.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Center$1;
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
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
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
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.core.content.PermissionChecker;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.inputfieldtext.InputFieldText;
import app.cash.inputfieldtext.composeui.TextFieldStateInputFieldText;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda11;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.SearchBarKt;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.avatar.components.StackedAvatarsKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda11;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda39;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.music.views.MusicViewKt$LoadedMusicContent$1$1;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda6;
import com.squareup.cash.offers.views.OffersAvatarKt$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.views.home.OffersHomeV2Kt$$ExternalSyntheticLambda7;
import com.squareup.cash.overlays.FakeOverlayLayerKt$$ExternalSyntheticLambda0;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda2;
import com.squareup.cash.p2pblocking.viewmodels.AllowlistSelectionViewModel;
import com.squareup.cash.p2pblocking.viewmodels.AllowlistSkipDialogModel;
import com.squareup.cash.p2pblocking.viewmodels.P2PFailureDialogModel;
import com.squareup.cash.p2pblocking.viewmodels.P2PListButtonValues;
import com.squareup.cash.p2pblocking.viewmodels.P2PListEmptyState;
import com.squareup.cash.p2pblocking.viewmodels.P2PListRowModel;
import com.squareup.cash.p2pblocking.viewmodels.P2PListRowTapButtonEvent;
import com.squareup.cash.p2pblocking.viewmodels.P2PListViewModel;
import com.squareup.cash.p2pblocking.viewmodels.SelectCustomerViewModel;
import com.squareup.cash.paychecks.views.HelpSheetView$$ExternalSyntheticLambda0;
import com.squareup.cash.paychecks.views.PaycheckCircles$$ExternalSyntheticLambda3;
import com.squareup.cash.payments.views.ToViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.util.Strings;
import com.squareup.util.cash.ColorsKt;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.text.StringsKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class P2PListRowKt {
    public static final ComposableLambdaImpl lambda$1858884831 = new ComposableLambdaImpl(new OffersAvatarKt$$ExternalSyntheticLambda0(23), false, 1858884831);

    /* renamed from: lambda$-2001205119, reason: not valid java name */
    public static final ComposableLambdaImpl f529lambda$2001205119 = new ComposableLambdaImpl(new OffersAvatarKt$$ExternalSyntheticLambda0(24), false, -2001205119);

    /* renamed from: lambda$-40064222, reason: not valid java name */
    public static final ComposableLambdaImpl f532lambda$40064222 = new ComposableLambdaImpl(new OffersAvatarKt$$ExternalSyntheticLambda0(25), false, -40064222);
    public static final ComposableLambdaImpl lambda$1751516285 = new ComposableLambdaImpl(new OffersAvatarKt$$ExternalSyntheticLambda0(26), false, 1751516285);
    public static final ComposableLambdaImpl lambda$38494428 = new ComposableLambdaImpl(new OffersAvatarKt$$ExternalSyntheticLambda0(27), false, 38494428);
    public static final ComposableLambdaImpl lambda$650978195 = new ComposableLambdaImpl(new OffersAvatarKt$$ExternalSyntheticLambda0(28), false, 650978195);
    public static final ComposableLambdaImpl lambda$823392276 = new ComposableLambdaImpl(new OffersAvatarKt$$ExternalSyntheticLambda0(29), false, 823392276);

    /* renamed from: lambda$-310866363, reason: not valid java name */
    public static final ComposableLambdaImpl f531lambda$310866363 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda3(1), false, -310866363);

    /* renamed from: lambda$-1938278531, reason: not valid java name */
    public static final ComposableLambdaImpl f528lambda$1938278531 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda3(2), false, -1938278531);
    public static final ComposableLambdaImpl lambda$1375033572 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda3(3), false, 1375033572);

    /* renamed from: lambda$-252378596, reason: not valid java name */
    public static final ComposableLambdaImpl f530lambda$252378596 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda3(4), false, -252378596);

    public static final void AllowListSelection(AllowlistSelectionViewModel allowlistSelectionViewModel, Function1 function1, Composer composer, int i) {
        float f;
        TextFieldState m382rememberTextFieldStateLepunE;
        boolean z;
        NeverEqualPolicy neverEqualPolicy;
        Function1 function12 = function1;
        allowlistSelectionViewModel.getClass();
        function12.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1602474233);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(allowlistSelectionViewModel) ? 4 : 2) | (gapComposer.changedInstance(function12) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, systemBarsPadding);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            SelectCustomerViewModel selectCustomerViewModel = allowlistSelectionViewModel.searchModel;
            InputFieldText inputFieldText = selectCustomerViewModel.searchText;
            if (inputFieldText instanceof TextFieldStateInputFieldText) {
                gapComposer.startReplaceGroup(-1466144053);
                gapComposer.end(false);
                m382rememberTextFieldStateLepunE = ((TextFieldStateInputFieldText) inputFieldText).textFieldState;
                f = 1.0f;
                z = false;
            } else {
                gapComposer.startReplaceGroup(1789940325);
                gapComposer.startMovableGroup(-1466142940, inputFieldText);
                f = 1.0f;
                m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE(inputFieldText.getValue().toString(), 0L, gapComposer, 0, 2);
                z = false;
                gapComposer.end(false);
                gapComposer.end(false);
            }
            CharSequence charSequence = m382rememberTextFieldStateLepunE.getValue$foundation().text;
            int i3 = i2 & 112;
            boolean changed = gapComposer.changed(m382rememberTextFieldStateLepunE) | (i3 == 32 ? true : z);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy2) {
                rememberedValue = new MusicViewKt$LoadedMusicContent$1$1(m382rememberTextFieldStateLepunE, function12, (Continuation) null, 12);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, charSequence, (Function2) rememberedValue);
            String str = allowlistSelectionViewModel.headerStyle == AllowlistSelectionViewModel.HeaderStyle.COMPACT ? allowlistSelectionViewModel.title : null;
            NavigationType navigationType = selectCustomerViewModel.useBackNavigation ? NavigationType.BACK : NavigationType.CLOSE;
            boolean changedInstance = gapComposer.changedInstance(allowlistSelectionViewModel) | (i3 == 32 ? true : z);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy2) {
                rememberedValue2 = new OffersHomeV2Kt$$ExternalSyntheticLambda7(11, (Object) allowlistSelectionViewModel, function12);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            TextFieldState textFieldState = m382rememberTextFieldStateLepunE;
            DBUtil.TitleBarSub(str, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue2, (Modifier) null, (Function3) null, gapComposer, 0, 108);
            gapComposer = gapComposer;
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(f, SizeKt.fillMaxWidth(companion, f), true);
            boolean changedInstance2 = gapComposer.changedInstance(allowlistSelectionViewModel) | (i3 == 32) | gapComposer.changed(textFieldState);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == neverEqualPolicy2) {
                rememberedValue3 = new MoneyTabUIKt$$ExternalSyntheticLambda39(19, allowlistSelectionViewModel, function1, textFieldState);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            function12 = function1;
            int i4 = 0;
            LazyDslKt.LazyColumn(m, null, null, null, null, null, false, null, (Function1) rememberedValue3, gapComposer, 0, 510);
            if (selectCustomerViewModel.showContinueButton) {
                gapComposer.startReplaceGroup(1799007515);
                DimensionKt.ButtonCtaGroup(null, true, null, null, Expect_jvmKt.rememberComposableLambda(-1256146112, new AllowlistSelectionKt$$ExternalSyntheticLambda2(allowlistSelectionViewModel, function12, i4), gapComposer), gapComposer, 24624, 13);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1799386149);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            gapComposer.end(true);
            P2PFailureDialogModel p2PFailureDialogModel = selectCustomerViewModel.unableToUnblockDialog;
            if (p2PFailureDialogModel == null) {
                gapComposer.startReplaceGroup(754080358);
                gapComposer.end(false);
                neverEqualPolicy = neverEqualPolicy2;
            } else {
                gapComposer.startReplaceGroup(754080359);
                boolean z2 = i3 == 32;
                Object rememberedValue4 = gapComposer.rememberedValue();
                neverEqualPolicy = neverEqualPolicy2;
                if (z2 || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new P2PListViewKt$$ExternalSyntheticLambda0(21, function12);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                P2PBlockFailureDialog(p2PFailureDialogModel, (Function0) rememberedValue4, gapComposer, 0);
                gapComposer.end(false);
            }
            AllowlistSkipDialogModel allowlistSkipDialogModel = allowlistSelectionViewModel.skipDialog;
            if (allowlistSkipDialogModel == null) {
                gapComposer.startReplaceGroup(754172242);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(754172243);
                boolean z3 = i3 == 32;
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (z3 || rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = new P2PListViewKt$$ExternalSyntheticLambda0(22, function12);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                Function0 function0 = (Function0) rememberedValue5;
                boolean z4 = i3 == 32;
                Object rememberedValue6 = gapComposer.rememberedValue();
                if (z4 || rememberedValue6 == neverEqualPolicy) {
                    rememberedValue6 = new P2PListViewKt$$ExternalSyntheticLambda0(23, function12);
                    gapComposer.updateRememberedValue(rememberedValue6);
                }
                AllowlistSkipDialog(allowlistSkipDialogModel, function0, (Function0) rememberedValue6, gapComposer, 0);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AllowlistSelectionKt$$ExternalSyntheticLambda6(allowlistSelectionViewModel, function12, i);
        }
    }

    public static final void AllowlistSkipDialog(AllowlistSkipDialogModel allowlistSkipDialogModel, Function0 function0, Function0 function02, Composer composer, int i) {
        allowlistSkipDialogModel.getClass();
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1911451774);
        int i2 = (gapComposer.changedInstance(allowlistSkipDialogModel) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changedInstance(function02) ? 256 : 128);
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ModalKt.Dimmer(null, function02, null, Expect_jvmKt.rememberComposableLambda(-2082954761, new AllowlistSkipDialogKt$$ExternalSyntheticLambda0(allowlistSkipDialogModel, function0, function02, i3), gapComposer), gapComposer, ((i2 >> 3) & 112) | 3072, 5);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HelpSheetView$$ExternalSyntheticLambda0(allowlistSkipDialogModel, function0, function02, i, 11);
        }
    }

    public static final void LoadingTitleAndSubtitle(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-87863437);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            VisibleKt.ShimmerBox(SpacerKt.m300paddingVpY3zN4$default(modifier, RecyclerView.DECELERATION_RATE, ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo231toDpGaN1DYA(Room.getSp(5)), 1), false, Alignment.Companion.CenterStart, f532lambda$40064222, gapComposer, 3456, 2);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda4(modifier, i, 3);
        }
    }

    public static final void P2PBlockFailureDialog(P2PFailureDialogModel p2PFailureDialogModel, Function0 function0, Composer composer, int i) {
        Function0 function02;
        p2PFailureDialogModel.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-770034458);
        int i2 = (gapComposer.changedInstance(p2PFailureDialogModel) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16);
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            function02 = function0;
            ModalKt.Dimmer(null, function02, null, Expect_jvmKt.rememberComposableLambda(251709261, new P2PBlockFailureDialogKt$$ExternalSyntheticLambda0(p2PFailureDialogModel, function0, i3), gapComposer), gapComposer, (i2 & 112) | 3072, 5);
        } else {
            function02 = function0;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FakeOverlayLayerKt$$ExternalSyntheticLambda0(p2PFailureDialogModel, function02, i, 28);
        }
    }

    public static final void P2PBlockListRowContent(P2PListRowModel p2PListRowModel, Function0 function0, Function0 function02, Composer composer, int i) {
        int i2;
        Modifier.Companion companion;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1694924314);
        Applier applier = gapComposer.applier;
        int i3 = i & 6;
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        if (i3 == 0) {
            i2 = (gapComposer.changed(rowScopeInstance) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(p2PListRowModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function02) ? 2048 : 1024;
        }
        int i4 = i2;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
            boolean z = (i4 & 7168) == 2048;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ToViewKt$$ExternalSyntheticLambda2(7, function02);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(companion2, false, null, null, (Function0) rememberedValue, 15);
            AvatarSize avatarSize = AvatarSize.Size48;
            StackedAvatarViewModel.Avatar avatar = p2PListRowModel.avatar;
            Icons icons = p2PListRowModel.badgeIcon;
            TextViewKt.Avatar(avatarSize, AvatarsKt.toAvatarEntry(avatar, icons != null ? new AvatarBadgeViewModel.IconToken(icons) : null, null, gapComposer, 8, 2), m183clickableoSLSa3U$default, false, gapComposer, 6, 24);
            Strings.getSizes(gapComposer).getClass();
            Request$Priority$EnumUnboxingLocalUtility.m$1(DefaultSizes.spacing, companion2, 16.0f, gapComposer);
            Modifier weight = rowScopeInstance.weight(1.0f, companion2, true);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, weight);
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
            boolean z2 = false;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, p2PListRowModel.fullName, (Map) null, (Function1) null, false);
            if (StringsKt.isBlank(p2PListRowModel.subtitle)) {
                companion = companion2;
                gapComposer = gapComposer;
                gapComposer.startReplaceGroup(71629094);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(71470529);
                companion = companion2;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, p2PListRowModel.subtitle, (Map) null, (Function1) null, false);
                gapComposer = gapComposer;
                z2 = false;
                gapComposer.end(false);
            }
            gapComposer.end(true);
            P2PListRowTapButtonEvent p2PListRowTapButtonEvent = p2PListRowModel.onTapButtonEvent;
            if (p2PListRowTapButtonEvent == null) {
                gapComposer.startReplaceGroup(-1853741784);
                gapComposer.end(z2);
            } else {
                gapComposer.startReplaceGroup(-1853741783);
                Strings.getSizes(gapComposer).getClass();
                Modifier.Companion companion3 = companion;
                SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion3, 16.0f));
                P2PListRowTapButtonEvent.TapAddOrRemove tapAddOrRemove = p2PListRowTapButtonEvent instanceof P2PListRowTapButtonEvent.TapAddOrRemove ? (P2PListRowTapButtonEvent.TapAddOrRemove) p2PListRowTapButtonEvent : null;
                boolean z3 = (tapAddOrRemove != null && tapAddOrRemove.toAdd && ((P2PListRowTapButtonEvent.TapAddOrRemove) p2PListRowTapButtonEvent).isAtLimit) ? false : true;
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion3);
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
                GapComposer gapComposer2 = gapComposer;
                coil3.size.SizeKt.ButtonCompact(function0, AllowanceViewKt.disabledClickable(companion3, z3, function0), p2PListRowModel.buttonIsProminent ? ButtonProminence.PROMINENT : ButtonProminence.STANDARD, p2PListRowModel.buttonIsDestructive, z3, null, Expect_jvmKt.rememberComposableLambda(-545128948, new MoneyTabUIKt$$ExternalSyntheticLambda11(26, p2PListRowModel, p2PListRowTapButtonEvent), gapComposer), gapComposer2, ((i4 >> 6) & 14) | 1572864, 32);
                gapComposer = gapComposer2;
                gapComposer.end(true);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new P2PListRowKt$$ExternalSyntheticLambda0(p2PListRowModel, function0, function02, i, 1);
        }
    }

    public static final void P2PBlockListRowLoading(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2088296188);
        if (gapComposer.shouldExecute(i & 1, (i & 3) != 2)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 40.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            StackedAvatarsKt.StackedAvatars(new StackedAvatarViewModel.Single(new StackedAvatarViewModel.Avatar(new ColorModel.Accented(ColorsKt.toColor(ColorKt.m694toArgb8_81llA(colors.base.grey95))), ' ', null, null, null, null, null, null, false, false, null, false, null, null, 131068)), m285size3ABfNKs, null, gapComposer, 56);
            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 13.0f));
            if (!(((double) 1.0f) > 0.0d)) {
                InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
            }
            LoadingTitleAndSubtitle(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NfcNotAvailableKt$$ExternalSyntheticLambda6(i, 18);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x044f, code lost:
    
        if (r3 == r40) goto L112;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void P2PList(P2PListViewModel p2PListViewModel, Function1 function1, Composer composer, int i) {
        Function1 function12;
        P2PListViewModel p2PListViewModel2;
        GapComposer gapComposer;
        Object obj;
        ?? r2;
        P2PFailureDialogModel p2PFailureDialogModel;
        NeverEqualPolicy neverEqualPolicy;
        Modifier.Companion companion;
        boolean z;
        Object obj2;
        GapComposer gapComposer2;
        Object obj3;
        function1.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-863018713);
        Applier applier = gapComposer3.applier;
        int i2 = i | (gapComposer3.changedInstance(p2PListViewModel) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= gapComposer3.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2;
        if (gapComposer3.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, companion2);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(companion2, 1.0f), Strings.getColors(gapComposer3).semantic.background.f1047app, ColorKt.RectangleShape));
            BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer3, 48);
            int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, systemBarsPadding);
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (p2PListViewModel == null) {
                gapComposer3.startReplaceGroup(-391125369);
                gapComposer3.end(false);
                function12 = function1;
                neverEqualPolicy = neverEqualPolicy2;
                r2 = 0;
                p2PFailureDialogModel = null;
                p2PListViewModel2 = p2PListViewModel;
                z = true;
                gapComposer2 = gapComposer3;
            } else {
                P2PListEmptyState p2PListEmptyState = p2PListViewModel.emptyState;
                gapComposer3.startReplaceGroup(-391125368);
                Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SizeKt.fillMaxWidth(companion2, 1.0f), true);
                BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal2, gapComposer3, 0);
                int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, m);
                gapComposer3.startReusableNode();
                if (gapComposer3.inserting) {
                    gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer3.useNode();
                }
                Updater.m576setimpl(gapComposer3, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer3, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                String str = p2PListViewModel.toolbarTitle;
                NavigationType navigationType = NavigationType.BACK;
                int i4 = i3 & 112;
                boolean z2 = i4 == 32;
                Object rememberedValue = gapComposer3.rememberedValue();
                if (z2 || rememberedValue == neverEqualPolicy2) {
                    P2PListViewKt$$ExternalSyntheticLambda0 p2PListViewKt$$ExternalSyntheticLambda0 = new P2PListViewKt$$ExternalSyntheticLambda0(0, function1);
                    gapComposer3.updateRememberedValue(p2PListViewKt$$ExternalSyntheticLambda0);
                    obj = p2PListViewKt$$ExternalSyntheticLambda0;
                } else {
                    obj = rememberedValue;
                }
                r2 = 0;
                boolean z3 = false;
                DBUtil.TitleBarSub(str, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) obj, (Modifier) null, Expect_jvmKt.rememberComposableLambda(1589064471, new MoneyTabUIKt$$ExternalSyntheticLambda11(27, (Object) p2PListViewModel, (Object) function1), gapComposer3), gapComposer3, 1572912, 44);
                GapComposer gapComposer4 = gapComposer3;
                List list = p2PListViewModel.list;
                if (list == null) {
                    gapComposer4.startReplaceGroup(-1414005242);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer4, null);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal2, gapComposer4, 0);
                    int hashCode4 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer4, companion2);
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer4, composeUiNode$Companion$SetModifier$13, gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer4, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                    Object rememberedValue2 = gapComposer4.rememberedValue();
                    Object obj4 = rememberedValue2;
                    if (rememberedValue2 == neverEqualPolicy2) {
                        P2PListViewKt$$ExternalSyntheticLambda2 p2PListViewKt$$ExternalSyntheticLambda2 = new P2PListViewKt$$ExternalSyntheticLambda2(0);
                        gapComposer4.updateRememberedValue(p2PListViewKt$$ExternalSyntheticLambda2);
                        obj4 = p2PListViewKt$$ExternalSyntheticLambda2;
                    }
                    Function0 function0 = (Function0) obj4;
                    Object rememberedValue3 = gapComposer4.rememberedValue();
                    Object obj5 = rememberedValue3;
                    if (rememberedValue3 == neverEqualPolicy2) {
                        P2PListViewKt$$ExternalSyntheticLambda2 p2PListViewKt$$ExternalSyntheticLambda22 = new P2PListViewKt$$ExternalSyntheticLambda2(19);
                        gapComposer4.updateRememberedValue(p2PListViewKt$$ExternalSyntheticLambda22);
                        obj5 = p2PListViewKt$$ExternalSyntheticLambda22;
                    }
                    P2PListRow(null, function0, (Function0) obj5, gapComposer4, 438);
                    Object rememberedValue4 = gapComposer4.rememberedValue();
                    Object obj6 = rememberedValue4;
                    if (rememberedValue4 == neverEqualPolicy2) {
                        P2PListViewKt$$ExternalSyntheticLambda2 p2PListViewKt$$ExternalSyntheticLambda23 = new P2PListViewKt$$ExternalSyntheticLambda2(20);
                        gapComposer4.updateRememberedValue(p2PListViewKt$$ExternalSyntheticLambda23);
                        obj6 = p2PListViewKt$$ExternalSyntheticLambda23;
                    }
                    Function0 function02 = (Function0) obj6;
                    Object rememberedValue5 = gapComposer4.rememberedValue();
                    Object obj7 = rememberedValue5;
                    if (rememberedValue5 == neverEqualPolicy2) {
                        P2PListViewKt$$ExternalSyntheticLambda2 p2PListViewKt$$ExternalSyntheticLambda24 = new P2PListViewKt$$ExternalSyntheticLambda2(21);
                        gapComposer4.updateRememberedValue(p2PListViewKt$$ExternalSyntheticLambda24);
                        obj7 = p2PListViewKt$$ExternalSyntheticLambda24;
                    }
                    P2PListRow(null, function02, (Function0) obj7, gapComposer4, 438);
                    gapComposer4.end(true);
                    gapComposer4.end(false);
                    p2PFailureDialogModel = null;
                    neverEqualPolicy = neverEqualPolicy2;
                    companion = companion2;
                    z = true;
                } else {
                    p2PFailureDialogModel = null;
                    if (list.isEmpty()) {
                        neverEqualPolicy = neverEqualPolicy2;
                        gapComposer4.startReplaceGroup(-1413252252);
                        Modifier fillMaxSize = SizeKt.fillMaxSize(companion2, 1.0f);
                        Strings.getSizes(gapComposer4).getClass();
                        DefaultSizes.spacing.getClass();
                        Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxSize, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                        ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(SpacerKt.Center, horizontal, gapComposer4, 54);
                        int hashCode5 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer4.currentCompositionLocalScope();
                        Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer4, m300paddingVpY3zN4$default);
                        gapComposer4.startReusableNode();
                        if (gapComposer4.inserting) {
                            gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer4.useNode();
                        }
                        Updater.m576setimpl(gapComposer4, columnMeasurePolicy4, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer4, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode5, gapComposer4, composeUiNode$Companion$SetModifier$13, gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer4, materializeModifier5, composeUiNode$Companion$SetModifier$14);
                        String str2 = p2PListEmptyState.title;
                        if (str2 == null) {
                            gapComposer4.startReplaceGroup(1543228196);
                            gapComposer4.end(false);
                            companion = companion2;
                            z = true;
                        } else {
                            gapComposer4.startReplaceGroup(1543228197);
                            companion = companion2;
                            z = true;
                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer4, (Modifier) null, Strings.getTypography(gapComposer4).labelMedium, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                            gapComposer4.end(false);
                        }
                        Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, Strings.getColors(gapComposer4).semantic.text.subtle, (Composer) gapComposer4, (Modifier) null, Strings.getTypography(gapComposer4).bodySmall, (TextLineBalancing) null, p2PListEmptyState.subtitle, (Map) null, (Function1) null, false);
                        gapComposer4.end(z);
                        gapComposer4.end(false);
                    } else {
                        gapComposer4.startReplaceGroup(-1413800549);
                        Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion2, 1.0f);
                        boolean changedInstance = gapComposer4.changedInstance(list) | (i4 == 32);
                        Object rememberedValue6 = gapComposer4.rememberedValue();
                        if (changedInstance || rememberedValue6 == neverEqualPolicy2) {
                            P2PListViewKt$$ExternalSyntheticLambda6 p2PListViewKt$$ExternalSyntheticLambda6 = new P2PListViewKt$$ExternalSyntheticLambda6(z3 ? 1 : 0, function1, list);
                            gapComposer4.updateRememberedValue(p2PListViewKt$$ExternalSyntheticLambda6);
                            obj2 = p2PListViewKt$$ExternalSyntheticLambda6;
                        } else {
                            obj2 = rememberedValue6;
                        }
                        neverEqualPolicy = neverEqualPolicy2;
                        LazyDslKt.LazyColumn(fillMaxSize2, null, null, null, null, null, false, null, (Function1) obj2, gapComposer4, 6, 510);
                        gapComposer4.end(false);
                        companion = companion2;
                        z = true;
                    }
                }
                gapComposer4.end(z);
                p2PListViewModel2 = p2PListViewModel;
                String str3 = p2PListViewModel2.footer;
                if (str3 == null) {
                    gapComposer4.startReplaceGroup(982199293);
                    gapComposer4.end(false);
                } else {
                    gapComposer4.startReplaceGroup(982199294);
                    Strings.getSizes(gapComposer4).getClass();
                    DefaultSizes.spacing.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3824, Strings.getColors(gapComposer4).semantic.text.subtle, (Composer) gapComposer4, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer4).bodyXSmall, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                    gapComposer4.end(false);
                }
                P2PListButtonValues p2PListButtonValues = p2PListViewModel2.buttonValues;
                if (p2PListButtonValues == null) {
                    gapComposer4.startReplaceGroup(982545501);
                    gapComposer4.end(false);
                    function12 = function1;
                } else {
                    gapComposer4.startReplaceGroup(982545502);
                    function12 = function1;
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(1116263352, new MoneyTabUIKt$$ExternalSyntheticLambda11(28, (Object) p2PListButtonValues, (Object) function12), gapComposer4), gapComposer4, 24576, 15);
                    gapComposer4.end(false);
                }
                gapComposer4.end(false);
                gapComposer2 = gapComposer4;
            }
            gapComposer2.end(z);
            P2PFailureDialogModel p2PFailureDialogModel2 = p2PListViewModel2 != null ? p2PListViewModel2.dialog : p2PFailureDialogModel;
            if (p2PFailureDialogModel2 == null) {
                gapComposer2.startReplaceGroup(765558168);
            } else {
                gapComposer2.startReplaceGroup(765558169);
                boolean z4 = (i3 & 112) == 32 ? z : r2;
                Object rememberedValue7 = gapComposer2.rememberedValue();
                if (!z4) {
                    obj3 = rememberedValue7;
                }
                P2PListViewKt$$ExternalSyntheticLambda0 p2PListViewKt$$ExternalSyntheticLambda02 = new P2PListViewKt$$ExternalSyntheticLambda0(24, function12);
                gapComposer2.updateRememberedValue(p2PListViewKt$$ExternalSyntheticLambda02);
                obj3 = p2PListViewKt$$ExternalSyntheticLambda02;
                P2PBlockFailureDialog(p2PFailureDialogModel2, (Function0) obj3, gapComposer2, r2);
            }
            gapComposer2.end(r2);
            gapComposer2.end(z);
            gapComposer = gapComposer2;
        } else {
            function12 = function1;
            p2PListViewModel2 = p2PListViewModel;
            gapComposer3.skipToGroupEnd();
            gapComposer = gapComposer3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OverlayKt$$ExternalSyntheticLambda2(p2PListViewModel2, function12, i, 17);
        }
    }

    public static final void P2PListRow(P2PListRowModel p2PListRowModel, Function0 function0, Function0 function02, Composer composer, int i) {
        int i2;
        Modifier wrapContentHeight;
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-541441152);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(p2PListRowModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function02) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            Arrangement$Center$1 arrangement$Center$1 = SpacerKt.SpaceBetween;
            wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(wrapContentHeight, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(m177backgroundbw27NRU, 16.0f, 16.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$Center$1, vertical, gapComposer, 54);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            if (p2PListRowModel == null) {
                gapComposer.startReplaceGroup(746537236);
                P2PBlockListRowLoading(gapComposer, 6);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(746538515);
                int i3 = i2 << 3;
                P2PBlockListRowContent(p2PListRowModel, function0, function02, gapComposer, (i3 & 7168) | 6 | (i3 & 112) | (i3 & 896));
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new P2PListRowKt$$ExternalSyntheticLambda0(p2PListRowModel, function0, function02, i, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x02e7, code lost:
    
        if (r3 == r30) goto L93;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0293  */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SelectCustomer(SelectCustomerViewModel selectCustomerViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        char c;
        TextFieldState m382rememberTextFieldStateLepunE;
        P2PFailureDialogModel p2PFailureDialogModel;
        Object obj;
        P2PFailureDialogModel p2PFailureDialogModel2;
        TextFieldState textFieldState;
        Modifier.Companion companion;
        boolean z;
        NeverEqualPolicy neverEqualPolicy;
        NeverEqualPolicy neverEqualPolicy2;
        Object obj2;
        NeverEqualPolicy neverEqualPolicy3;
        String str;
        GapComposer gapComposer2;
        ?? r2;
        Object obj3;
        Function1 function12 = function1;
        function12.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(557156127);
        Applier applier = gapComposer3.applier;
        int i2 = i | (gapComposer3.changedInstance(selectCustomerViewModel) ? 4 : 2) | (gapComposer3.changedInstance(function12) ? 32 : 16);
        if (gapComposer3.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, companion2);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(companion2, 1.0f), Strings.getColors(gapComposer3).semantic.background.f1047app, ColorKt.RectangleShape));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
            int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, systemBarsPadding);
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            NeverEqualPolicy neverEqualPolicy4 = Composer.Companion.Empty;
            if (selectCustomerViewModel == null) {
                gapComposer3.startReplaceGroup(-759661747);
                gapComposer3.end(false);
                neverEqualPolicy3 = neverEqualPolicy4;
                r2 = 0;
                p2PFailureDialogModel2 = null;
                gapComposer2 = gapComposer3;
            } else {
                gapComposer3.startReplaceGroup(-759661746);
                InputFieldText inputFieldText = selectCustomerViewModel.searchText;
                if (inputFieldText instanceof TextFieldStateInputFieldText) {
                    gapComposer3.startReplaceGroup(185420332);
                    gapComposer3.end(false);
                    m382rememberTextFieldStateLepunE = ((TextFieldStateInputFieldText) inputFieldText).textFieldState;
                    c = 0;
                } else {
                    gapComposer3.startReplaceGroup(1449627268);
                    gapComposer3.startMovableGroup(185421509, inputFieldText);
                    c = 0;
                    m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE(inputFieldText.getValue().toString(), 0L, gapComposer3, 0, 2);
                    gapComposer3.end(false);
                    gapComposer3.end(false);
                }
                TextFieldState textFieldState2 = m382rememberTextFieldStateLepunE;
                CharSequence charSequence = textFieldState2.getValue$foundation().text;
                int i3 = i2 & 112;
                boolean changed = gapComposer3.changed(textFieldState2) | (i3 == 32);
                Object rememberedValue = gapComposer3.rememberedValue();
                int i4 = 13;
                if (changed || rememberedValue == neverEqualPolicy4) {
                    p2PFailureDialogModel = null;
                    MusicViewKt$LoadedMusicContent$1$1 musicViewKt$LoadedMusicContent$1$1 = new MusicViewKt$LoadedMusicContent$1$1(textFieldState2, function12, (Continuation) null, 13);
                    gapComposer3.updateRememberedValue(musicViewKt$LoadedMusicContent$1$1);
                    obj = musicViewKt$LoadedMusicContent$1$1;
                } else {
                    p2PFailureDialogModel = null;
                    obj = rememberedValue;
                }
                Updater.LaunchedEffect(gapComposer3, charSequence, (Function2) obj);
                String str2 = selectCustomerViewModel.title;
                NavigationType navigationType = selectCustomerViewModel.useBackNavigation ? NavigationType.BACK : NavigationType.CLOSE;
                boolean changedInstance = gapComposer3.changedInstance(selectCustomerViewModel) | (i3 == 32);
                Object rememberedValue2 = gapComposer3.rememberedValue();
                Object obj4 = rememberedValue2;
                if (changedInstance || rememberedValue2 == neverEqualPolicy4) {
                    OffersHomeV2Kt$$ExternalSyntheticLambda7 offersHomeV2Kt$$ExternalSyntheticLambda7 = new OffersHomeV2Kt$$ExternalSyntheticLambda7(i4, (Object) selectCustomerViewModel, function12);
                    gapComposer3.updateRememberedValue(offersHomeV2Kt$$ExternalSyntheticLambda7);
                    obj4 = offersHomeV2Kt$$ExternalSyntheticLambda7;
                }
                p2PFailureDialogModel2 = p2PFailureDialogModel;
                DBUtil.TitleBarSub(str2, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) obj4, (Modifier) null, (Function3) null, gapComposer3, 0, 108);
                String str3 = selectCustomerViewModel.headerTitle;
                if (str3 == null) {
                    gapComposer3.startReplaceGroup(1453994547);
                    gapComposer3.end(false);
                    neverEqualPolicy = neverEqualPolicy4;
                    textFieldState = textFieldState2;
                    z = false;
                    companion = companion2;
                } else {
                    gapComposer3.startReplaceGroup(1453994548);
                    TextStyle textStyle = Strings.getTypography(gapComposer3).header;
                    long j = Strings.getColors(gapComposer3).semantic.text.standard;
                    Strings.getSizes(gapComposer3).getClass();
                    DefaultSizes.spacing.getClass();
                    Strings.getSizes(gapComposer3).getClass();
                    textFieldState = textFieldState2;
                    companion = companion2;
                    z = false;
                    neverEqualPolicy = neverEqualPolicy4;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j, (Composer) gapComposer3, SpacerKt.m299paddingVpY3zN4(companion2, 16.0f, 16.0f), textStyle, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                    gapComposer3.end(false);
                }
                SearchBarKt.SearchBar(textFieldState, selectCustomerViewModel.searchBarPlaceholder, SearchBarKt.rememberSearchBarKeyboardState(z, gapComposer3), null, null, null, null, null, null, null, false, null, gapComposer3, 0, 0, 8184);
                GapComposer gapComposer4 = gapComposer3;
                Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SizeKt.fillMaxWidth(companion, 1.0f), true);
                boolean changedInstance2 = gapComposer4.changedInstance(selectCustomerViewModel) | (i3 == 32 ? true : z ? 1 : 0);
                Object rememberedValue3 = gapComposer4.rememberedValue();
                int i5 = 24;
                if (changedInstance2) {
                    neverEqualPolicy2 = neverEqualPolicy;
                } else {
                    neverEqualPolicy2 = neverEqualPolicy;
                    if (rememberedValue3 != neverEqualPolicy2) {
                        obj2 = rememberedValue3;
                        neverEqualPolicy3 = neverEqualPolicy2;
                        function12 = function1;
                        LazyDslKt.LazyColumn(m, null, null, null, null, null, false, null, (Function1) obj2, gapComposer4, 0, 510);
                        str = selectCustomerViewModel.continueButtonText;
                        if (str != null) {
                            gapComposer4.startReplaceGroup(1454735137);
                            gapComposer4.end(z);
                        } else {
                            gapComposer4.startReplaceGroup(1454735138);
                            DimensionKt.ButtonCtaGroup(null, true, null, null, Expect_jvmKt.rememberComposableLambda(1524626535, new TabContentViewKt$$ExternalSyntheticLambda11(function12, str, i5), gapComposer4), gapComposer4, 24624, 13);
                            gapComposer4.end(z);
                        }
                        gapComposer4.end(z);
                        r2 = z;
                        gapComposer2 = gapComposer4;
                    }
                }
                MusicViewKt$$ExternalSyntheticLambda6 musicViewKt$$ExternalSyntheticLambda6 = new MusicViewKt$$ExternalSyntheticLambda6(i5, selectCustomerViewModel, function1);
                gapComposer4.updateRememberedValue(musicViewKt$$ExternalSyntheticLambda6);
                obj2 = musicViewKt$$ExternalSyntheticLambda6;
                neverEqualPolicy3 = neverEqualPolicy2;
                function12 = function1;
                LazyDslKt.LazyColumn(m, null, null, null, null, null, false, null, (Function1) obj2, gapComposer4, 0, 510);
                str = selectCustomerViewModel.continueButtonText;
                if (str != null) {
                }
                gapComposer4.end(z);
                r2 = z;
                gapComposer2 = gapComposer4;
            }
            gapComposer2.end(true);
            P2PFailureDialogModel p2PFailureDialogModel3 = selectCustomerViewModel != null ? selectCustomerViewModel.unableToUnblockDialog : p2PFailureDialogModel2;
            if (p2PFailureDialogModel3 == null) {
                gapComposer2.startReplaceGroup(-556150164);
            } else {
                gapComposer2.startReplaceGroup(-556150163);
                boolean z2 = (i2 & 112) == 32 ? true : r2;
                Object rememberedValue4 = gapComposer2.rememberedValue();
                if (!z2) {
                    obj3 = rememberedValue4;
                }
                P2PListViewKt$$ExternalSyntheticLambda0 p2PListViewKt$$ExternalSyntheticLambda0 = new P2PListViewKt$$ExternalSyntheticLambda0(26, function12);
                gapComposer2.updateRememberedValue(p2PListViewKt$$ExternalSyntheticLambda0);
                obj3 = p2PListViewKt$$ExternalSyntheticLambda0;
                P2PBlockFailureDialog(p2PFailureDialogModel3, (Function0) obj3, gapComposer2, r2);
            }
            gapComposer2.end(r2);
            gapComposer2.end(true);
            gapComposer = gapComposer2;
        } else {
            gapComposer3.skipToGroupEnd();
            gapComposer = gapComposer3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SelectCustomerView$$ExternalSyntheticLambda2(selectCustomerViewModel, function12, i);
        }
    }

    public static final void selectCustomerItems(LazyListScope lazyListScope, final SelectCustomerViewModel selectCustomerViewModel, final Function1 function1) {
        lazyListScope.getClass();
        selectCustomerViewModel.getClass();
        function1.getClass();
        boolean z = selectCustomerViewModel.isLoading;
        List list = selectCustomerViewModel.searchResults;
        List list2 = selectCustomerViewModel.suggestionResults;
        final int i = 3;
        if (z) {
            LazyListScope.item$default(lazyListScope, null, null, lambda$38494428, 3);
            LazyListScope.item$default(lazyListScope, null, null, lambda$650978195, 3);
            LazyListScope.item$default(lazyListScope, null, null, lambda$823392276, 3);
            return;
        }
        final int i2 = 1;
        if (!list2.isEmpty()) {
            LazyListScope.item$default(lazyListScope, null, null, f531lambda$310866363, 3);
            final int i3 = 0;
            LazyListScope.item$default(lazyListScope, null, null, new ComposableLambdaImpl(new Function3() { // from class: com.squareup.cash.p2pblocking.views.SelectCustomerViewKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i4 = i3;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    SelectCustomerViewModel selectCustomerViewModel2 = selectCustomerViewModel;
                    switch (i4) {
                        case 0:
                            Composer composer = (Composer) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((LazyItemScopeImpl) obj).getClass();
                            GapComposer gapComposer = (GapComposer) composer;
                            if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                String str = selectCustomerViewModel2.suggestionResultsTitle;
                                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                DefaultSizes.spacing.getClass();
                                ViewfinderDefaults.SectionHeader(str, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), (String) null, (Function0) null, (String) null, gapComposer, 0, 28);
                            } else {
                                gapComposer.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer2 = (Composer) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            ((LazyItemScopeImpl) obj).getClass();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                PermissionChecker.NoResults(selectCustomerViewModel2.region, selectCustomerViewModel2.promptSearchTitle, selectCustomerViewModel2.promptSearchMessage, gapComposer2, 0, 0);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        case 2:
                            Composer composer3 = (Composer) obj2;
                            int intValue3 = ((Integer) obj3).intValue();
                            ((LazyItemScopeImpl) obj).getClass();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                String str2 = selectCustomerViewModel2.searchResultsTitle;
                                ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                DefaultSizes.spacing.getClass();
                                ViewfinderDefaults.SectionHeader(str2, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), (String) null, (Function0) null, (String) null, gapComposer3, 0, 28);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj2;
                            int intValue4 = ((Integer) obj3).intValue();
                            ((LazyItemScopeImpl) obj).getClass();
                            GapComposer gapComposer4 = (GapComposer) composer4;
                            if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                PermissionChecker.NoResults(selectCustomerViewModel2.region, selectCustomerViewModel2.promptSearchTitle, selectCustomerViewModel2.promptSearchMessage, gapComposer4, 0, 0);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, true, -124485828), 3);
            LazyListScope.item$default(lazyListScope, null, null, f528lambda$1938278531, 3);
            LazyListScope.items$default(lazyListScope, list2.size(), null, new ComposableLambdaImpl(new Function4() { // from class: com.squareup.cash.p2pblocking.views.SelectCustomerViewKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i4 = i3;
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    Function1 function12 = function1;
                    SelectCustomerViewModel selectCustomerViewModel2 = selectCustomerViewModel;
                    LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
                    int intValue = ((Integer) obj2).intValue();
                    Composer composer = (Composer) obj3;
                    int intValue2 = ((Integer) obj4).intValue();
                    switch (i4) {
                        case 0:
                            lazyItemScopeImpl.getClass();
                            if ((intValue2 & 48) == 0) {
                                intValue2 |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
                            }
                            GapComposer gapComposer = (GapComposer) composer;
                            if (gapComposer.shouldExecute(intValue2 & 1, (intValue2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                                P2PListRowModel p2PListRowModel = (P2PListRowModel) selectCustomerViewModel2.suggestionResults.get(intValue);
                                boolean changedInstance = gapComposer.changedInstance(p2PListRowModel) | gapComposer.changed(function12);
                                Object rememberedValue = gapComposer.rememberedValue();
                                if (changedInstance || rememberedValue == neverEqualPolicy) {
                                    rememberedValue = new P2PListViewKt$$ExternalSyntheticLambda17(p2PListRowModel, function12, 5);
                                    gapComposer.updateRememberedValue(rememberedValue);
                                }
                                Function0 function0 = (Function0) rememberedValue;
                                boolean changed = gapComposer.changed(function12) | gapComposer.changedInstance(p2PListRowModel);
                                Object rememberedValue2 = gapComposer.rememberedValue();
                                if (changed || rememberedValue2 == neverEqualPolicy) {
                                    rememberedValue2 = new P2PListViewKt$$ExternalSyntheticLambda17(function12, p2PListRowModel, 6);
                                    gapComposer.updateRememberedValue(rememberedValue2);
                                }
                                P2PListRowKt.P2PListRow(p2PListRowModel, function0, (Function0) rememberedValue2, gapComposer, 0);
                            } else {
                                gapComposer.skipToGroupEnd();
                            }
                            break;
                        default:
                            lazyItemScopeImpl.getClass();
                            if ((intValue2 & 48) == 0) {
                                intValue2 |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
                            }
                            GapComposer gapComposer2 = (GapComposer) composer;
                            if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                                P2PListRowModel p2PListRowModel2 = (P2PListRowModel) selectCustomerViewModel2.searchResults.get(intValue);
                                boolean changedInstance2 = gapComposer2.changedInstance(p2PListRowModel2) | gapComposer2.changed(function12);
                                Object rememberedValue3 = gapComposer2.rememberedValue();
                                if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                                    rememberedValue3 = new P2PListViewKt$$ExternalSyntheticLambda17(p2PListRowModel2, function12, 3);
                                    gapComposer2.updateRememberedValue(rememberedValue3);
                                }
                                Function0 function02 = (Function0) rememberedValue3;
                                boolean changed2 = gapComposer2.changed(function12) | gapComposer2.changedInstance(p2PListRowModel2);
                                Object rememberedValue4 = gapComposer2.rememberedValue();
                                if (changed2 || rememberedValue4 == neverEqualPolicy) {
                                    rememberedValue4 = new P2PListViewKt$$ExternalSyntheticLambda17(function12, p2PListRowModel2, 4);
                                    gapComposer2.updateRememberedValue(rememberedValue4);
                                }
                                P2PListRowKt.P2PListRow(p2PListRowModel2, function02, (Function0) rememberedValue4, gapComposer2, 0);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, true, -1705976626), 6);
            return;
        }
        if (list.isEmpty()) {
            if (selectCustomerViewModel.searchText.getValue().length() == 0) {
                LazyListScope.item$default(lazyListScope, null, null, new ComposableLambdaImpl(new Function3() { // from class: com.squareup.cash.p2pblocking.views.SelectCustomerViewKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i4 = i;
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        SelectCustomerViewModel selectCustomerViewModel2 = selectCustomerViewModel;
                        switch (i4) {
                            case 0:
                                Composer composer = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                ((LazyItemScopeImpl) obj).getClass();
                                GapComposer gapComposer = (GapComposer) composer;
                                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    String str = selectCustomerViewModel2.suggestionResultsTitle;
                                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                    DefaultSizes.spacing.getClass();
                                    ViewfinderDefaults.SectionHeader(str, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), (String) null, (Function0) null, (String) null, gapComposer, 0, 28);
                                } else {
                                    gapComposer.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                Composer composer2 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                ((LazyItemScopeImpl) obj).getClass();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    PermissionChecker.NoResults(selectCustomerViewModel2.region, selectCustomerViewModel2.promptSearchTitle, selectCustomerViewModel2.promptSearchMessage, gapComposer2, 0, 0);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            case 2:
                                Composer composer3 = (Composer) obj2;
                                int intValue3 = ((Integer) obj3).intValue();
                                ((LazyItemScopeImpl) obj).getClass();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                    String str2 = selectCustomerViewModel2.searchResultsTitle;
                                    ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                    DefaultSizes.spacing.getClass();
                                    ViewfinderDefaults.SectionHeader(str2, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), (String) null, (Function0) null, (String) null, gapComposer3, 0, 28);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer4 = (Composer) obj2;
                                int intValue4 = ((Integer) obj3).intValue();
                                ((LazyItemScopeImpl) obj).getClass();
                                GapComposer gapComposer4 = (GapComposer) composer4;
                                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                    PermissionChecker.NoResults(selectCustomerViewModel2.region, selectCustomerViewModel2.promptSearchTitle, selectCustomerViewModel2.promptSearchMessage, gapComposer4, 0, 0);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, true, -1234033789), 3);
                return;
            } else {
                LazyListScope.item$default(lazyListScope, null, null, new ComposableLambdaImpl(new Function3() { // from class: com.squareup.cash.p2pblocking.views.SelectCustomerViewKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i4 = i2;
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        SelectCustomerViewModel selectCustomerViewModel2 = selectCustomerViewModel;
                        switch (i4) {
                            case 0:
                                Composer composer = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                ((LazyItemScopeImpl) obj).getClass();
                                GapComposer gapComposer = (GapComposer) composer;
                                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    String str = selectCustomerViewModel2.suggestionResultsTitle;
                                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                    DefaultSizes.spacing.getClass();
                                    ViewfinderDefaults.SectionHeader(str, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), (String) null, (Function0) null, (String) null, gapComposer, 0, 28);
                                } else {
                                    gapComposer.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                Composer composer2 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                ((LazyItemScopeImpl) obj).getClass();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    PermissionChecker.NoResults(selectCustomerViewModel2.region, selectCustomerViewModel2.promptSearchTitle, selectCustomerViewModel2.promptSearchMessage, gapComposer2, 0, 0);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            case 2:
                                Composer composer3 = (Composer) obj2;
                                int intValue3 = ((Integer) obj3).intValue();
                                ((LazyItemScopeImpl) obj).getClass();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                    String str2 = selectCustomerViewModel2.searchResultsTitle;
                                    ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                    DefaultSizes.spacing.getClass();
                                    ViewfinderDefaults.SectionHeader(str2, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), (String) null, (Function0) null, (String) null, gapComposer3, 0, 28);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer4 = (Composer) obj2;
                                int intValue4 = ((Integer) obj3).intValue();
                                ((LazyItemScopeImpl) obj).getClass();
                                GapComposer gapComposer4 = (GapComposer) composer4;
                                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                    PermissionChecker.NoResults(selectCustomerViewModel2.region, selectCustomerViewModel2.promptSearchTitle, selectCustomerViewModel2.promptSearchMessage, gapComposer4, 0, 0);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, true, 2141139429), 3);
                return;
            }
        }
        LazyListScope.item$default(lazyListScope, null, null, lambda$1375033572, 3);
        final int i4 = 2;
        LazyListScope.item$default(lazyListScope, null, null, new ComposableLambdaImpl(new Function3() { // from class: com.squareup.cash.p2pblocking.views.SelectCustomerViewKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i42 = i4;
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                SelectCustomerViewModel selectCustomerViewModel2 = selectCustomerViewModel;
                switch (i42) {
                    case 0:
                        Composer composer = (Composer) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        ((LazyItemScopeImpl) obj).getClass();
                        GapComposer gapComposer = (GapComposer) composer;
                        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                            String str = selectCustomerViewModel2.suggestionResultsTitle;
                            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                            DefaultSizes.spacing.getClass();
                            ViewfinderDefaults.SectionHeader(str, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), (String) null, (Function0) null, (String) null, gapComposer, 0, 28);
                        } else {
                            gapComposer.skipToGroupEnd();
                        }
                        break;
                    case 1:
                        Composer composer2 = (Composer) obj2;
                        int intValue2 = ((Integer) obj3).intValue();
                        ((LazyItemScopeImpl) obj).getClass();
                        GapComposer gapComposer2 = (GapComposer) composer2;
                        if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                            PermissionChecker.NoResults(selectCustomerViewModel2.region, selectCustomerViewModel2.promptSearchTitle, selectCustomerViewModel2.promptSearchMessage, gapComposer2, 0, 0);
                        } else {
                            gapComposer2.skipToGroupEnd();
                        }
                        break;
                    case 2:
                        Composer composer3 = (Composer) obj2;
                        int intValue3 = ((Integer) obj3).intValue();
                        ((LazyItemScopeImpl) obj).getClass();
                        GapComposer gapComposer3 = (GapComposer) composer3;
                        if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                            String str2 = selectCustomerViewModel2.searchResultsTitle;
                            ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                            DefaultSizes.spacing.getClass();
                            ViewfinderDefaults.SectionHeader(str2, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), (String) null, (Function0) null, (String) null, gapComposer3, 0, 28);
                        } else {
                            gapComposer3.skipToGroupEnd();
                        }
                        break;
                    default:
                        Composer composer4 = (Composer) obj2;
                        int intValue4 = ((Integer) obj3).intValue();
                        ((LazyItemScopeImpl) obj).getClass();
                        GapComposer gapComposer4 = (GapComposer) composer4;
                        if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                            PermissionChecker.NoResults(selectCustomerViewModel2.region, selectCustomerViewModel2.promptSearchTitle, selectCustomerViewModel2.promptSearchMessage, gapComposer4, 0, 0);
                        } else {
                            gapComposer4.skipToGroupEnd();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }, true, 1561414107), 3);
        LazyListScope.item$default(lazyListScope, null, null, f530lambda$252378596, 3);
        LazyListScope.items$default(lazyListScope, list.size(), null, new ComposableLambdaImpl(new Function4() { // from class: com.squareup.cash.p2pblocking.views.SelectCustomerViewKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                int i42 = i2;
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                Function1 function12 = function1;
                SelectCustomerViewModel selectCustomerViewModel2 = selectCustomerViewModel;
                LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
                int intValue = ((Integer) obj2).intValue();
                Composer composer = (Composer) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                switch (i42) {
                    case 0:
                        lazyItemScopeImpl.getClass();
                        if ((intValue2 & 48) == 0) {
                            intValue2 |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
                        }
                        GapComposer gapComposer = (GapComposer) composer;
                        if (gapComposer.shouldExecute(intValue2 & 1, (intValue2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                            P2PListRowModel p2PListRowModel = (P2PListRowModel) selectCustomerViewModel2.suggestionResults.get(intValue);
                            boolean changedInstance = gapComposer.changedInstance(p2PListRowModel) | gapComposer.changed(function12);
                            Object rememberedValue = gapComposer.rememberedValue();
                            if (changedInstance || rememberedValue == neverEqualPolicy) {
                                rememberedValue = new P2PListViewKt$$ExternalSyntheticLambda17(p2PListRowModel, function12, 5);
                                gapComposer.updateRememberedValue(rememberedValue);
                            }
                            Function0 function0 = (Function0) rememberedValue;
                            boolean changed = gapComposer.changed(function12) | gapComposer.changedInstance(p2PListRowModel);
                            Object rememberedValue2 = gapComposer.rememberedValue();
                            if (changed || rememberedValue2 == neverEqualPolicy) {
                                rememberedValue2 = new P2PListViewKt$$ExternalSyntheticLambda17(function12, p2PListRowModel, 6);
                                gapComposer.updateRememberedValue(rememberedValue2);
                            }
                            P2PListRowKt.P2PListRow(p2PListRowModel, function0, (Function0) rememberedValue2, gapComposer, 0);
                        } else {
                            gapComposer.skipToGroupEnd();
                        }
                        break;
                    default:
                        lazyItemScopeImpl.getClass();
                        if ((intValue2 & 48) == 0) {
                            intValue2 |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
                        }
                        GapComposer gapComposer2 = (GapComposer) composer;
                        if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                            P2PListRowModel p2PListRowModel2 = (P2PListRowModel) selectCustomerViewModel2.searchResults.get(intValue);
                            boolean changedInstance2 = gapComposer2.changedInstance(p2PListRowModel2) | gapComposer2.changed(function12);
                            Object rememberedValue3 = gapComposer2.rememberedValue();
                            if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                                rememberedValue3 = new P2PListViewKt$$ExternalSyntheticLambda17(p2PListRowModel2, function12, 3);
                                gapComposer2.updateRememberedValue(rememberedValue3);
                            }
                            Function0 function02 = (Function0) rememberedValue3;
                            boolean changed2 = gapComposer2.changed(function12) | gapComposer2.changedInstance(p2PListRowModel2);
                            Object rememberedValue4 = gapComposer2.rememberedValue();
                            if (changed2 || rememberedValue4 == neverEqualPolicy) {
                                rememberedValue4 = new P2PListViewKt$$ExternalSyntheticLambda17(function12, p2PListRowModel2, 4);
                                gapComposer2.updateRememberedValue(rememberedValue4);
                            }
                            P2PListRowKt.P2PListRow(p2PListRowModel2, function02, (Function0) rememberedValue4, gapComposer2, 0);
                        } else {
                            gapComposer2.skipToGroupEnd();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }, true, -20076691), 6);
    }
}
