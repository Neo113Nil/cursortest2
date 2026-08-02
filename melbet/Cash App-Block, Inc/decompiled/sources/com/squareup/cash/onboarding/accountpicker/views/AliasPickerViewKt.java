package com.squareup.cash.onboarding.accountpicker.views;

import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.DismissDirection;
import androidx.compose.material.DismissState;
import androidx.compose.material.DismissValue;
import androidx.compose.material.SnackbarHostKt$$ExternalSyntheticLambda2;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.broadway.ui.compose.DialogEventHandlerKt;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda30;
import app.cash.local.views.internal.DismissableToastKt$$ExternalSyntheticLambda3;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda10;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda5;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda2;
import com.squareup.cash.instruments.views.InstrumentCellKt$$ExternalSyntheticLambda9;
import com.squareup.cash.money.views.MoneyTabToolbarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda11;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda6;
import com.squareup.cash.offers.views.OffersAvatarKt$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.views.home.OffersHeroTileKt$$ExternalSyntheticLambda3;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingConfirmAccountRemovalScreen;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AccountPickerOptionsMenuViewModel;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AccountPickerViewModel;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AccountViewModel;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AliasPickerViewModel;
import com.squareup.cash.overlays.FakeOverlayLayerKt$$ExternalSyntheticLambda0;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda2;
import com.squareup.cash.overlays.OverlayKt$Overlay$1$1$1$1$1;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.paychecks.views.HelpSheetView$$ExternalSyntheticLambda0;
import com.squareup.cash.payments.views.NoteRequiredViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.payments.views.UtilKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.views.PoolInvitePeopleListViewKt$$ExternalSyntheticLambda19;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda22;
import com.squareup.cash.work.views.shift.ShiftNoteViewKt$$ExternalSyntheticLambda9;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.stripe.android.uicore.elements.H6TextKt$$ExternalSyntheticLambda0;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class AliasPickerViewKt {

    /* renamed from: lambda$-397447670, reason: not valid java name */
    public static final ComposableLambdaImpl f520lambda$397447670 = new ComposableLambdaImpl(new OffersAvatarKt$$ExternalSyntheticLambda0(12), false, -397447670);
    public static final ComposableLambdaImpl lambda$165908010 = new ComposableLambdaImpl(new OffersAvatarKt$$ExternalSyntheticLambda0(13), false, 165908010);
    public static final ComposableLambdaImpl lambda$2056370574 = new ComposableLambdaImpl(new NfcNotAvailableKt$$ExternalSyntheticLambda6(15), false, 2056370574);

    /* renamed from: lambda$-1737012480, reason: not valid java name */
    public static final ComposableLambdaImpl f517lambda$1737012480 = new ComposableLambdaImpl(new OffersAvatarKt$$ExternalSyntheticLambda0(14), false, -1737012480);

    /* renamed from: lambda$-1954736215, reason: not valid java name */
    public static final ComposableLambdaImpl f518lambda$1954736215 = new ComposableLambdaImpl(new OffersAvatarKt$$ExternalSyntheticLambda0(15), false, -1954736215);

    /* renamed from: lambda$-809852668, reason: not valid java name */
    public static final ComposableLambdaImpl f525lambda$809852668 = new ComposableLambdaImpl(new NfcNotAvailableKt$$ExternalSyntheticLambda6(16), false, -809852668);

    /* renamed from: lambda$-2142651869, reason: not valid java name */
    public static final ComposableLambdaImpl f519lambda$2142651869 = new ComposableLambdaImpl(new NfcNotAvailableKt$$ExternalSyntheticLambda6(17), false, -2142651869);

    /* renamed from: lambda$-607192416, reason: not valid java name */
    public static final ComposableLambdaImpl f522lambda$607192416 = new ComposableLambdaImpl(new OffersAvatarKt$$ExternalSyntheticLambda0(16), false, -607192416);
    public static final ComposableLambdaImpl lambda$547927961 = new ComposableLambdaImpl(new OffersAvatarKt$$ExternalSyntheticLambda0(17), false, 547927961);

    /* renamed from: lambda$-67869074, reason: not valid java name */
    public static final ComposableLambdaImpl f523lambda$67869074 = new ComposableLambdaImpl(new OffersAvatarKt$$ExternalSyntheticLambda0(18), false, -67869074);

    /* renamed from: lambda$-768048133, reason: not valid java name */
    public static final ComposableLambdaImpl f524lambda$768048133 = new ComposableLambdaImpl(new OffersAvatarKt$$ExternalSyntheticLambda0(19), false, -768048133);
    public static final ComposableLambdaImpl lambda$1920208498 = new ComposableLambdaImpl(new OffersAvatarKt$$ExternalSyntheticLambda0(20), false, 1920208498);

    /* renamed from: lambda$-84098565, reason: not valid java name */
    public static final ComposableLambdaImpl f526lambda$84098565 = new ComposableLambdaImpl(new OffersAvatarKt$$ExternalSyntheticLambda0(21), false, -84098565);
    public static final ComposableLambdaImpl lambda$1618265512 = new ComposableLambdaImpl(new OffersAvatarKt$$ExternalSyntheticLambda0(22), false, 1618265512);
    public static final ComposableLambdaImpl lambda$2037868797 = new ComposableLambdaImpl(new OffersHeroTileKt$$ExternalSyntheticLambda3(15), false, 2037868797);

    /* renamed from: lambda$-581519098, reason: not valid java name */
    public static final ComposableLambdaImpl f521lambda$581519098 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda2(10), false, -581519098);

    /* renamed from: lambda$-86296586, reason: not valid java name */
    public static final ComposableLambdaImpl f527lambda$86296586 = new ComposableLambdaImpl(new OffersHeroTileKt$$ExternalSyntheticLambda3(16), false, -86296586);

    public static final void AccountFailedRemoval(int i, Composer composer, Modifier modifier, Function0 function0, Function0 function02) {
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1843328307);
        int i2 = i | (gapComposer.changedInstance(function0) ? 4 : 2) | (gapComposer.changedInstance(function02) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(SpacerKt.m302paddingqDBjuR0$default(modifier, RecyclerView.DECELERATION_RATE, 48.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, navigationBarsPadding);
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
            Countries.PageHeader(Room.stringResource(gapComposer, R.string.account_removal_failed_title), (Modifier) null, lambda$2056370574, Room.stringResource(gapComposer, R.string.account_removal_failed_subtitle), gapComposer, MLKEMEngine.KyberPolyBytes, 2);
            SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f, true));
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-1094921659, new ShiftNoteViewKt$$ExternalSyntheticLambda9(function02, function0, 6), gapComposer), gapComposer, 24576, 15);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolInvitePeopleListViewKt$$ExternalSyntheticLambda19(function0, function02, modifier, i, 2);
        }
    }

    public static final void AccountList(AccountPickerViewModel.AccountList accountList, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        String str;
        PaddingValues asPaddingValues;
        boolean z;
        accountList.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2025954636);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(accountList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            int i4 = i2;
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
            DBUtil.TitleBarSub((String) null, NavigationType.NONE, (Modifier) null, (DynamicColorConfiguration) null, (Function0) null, (Modifier) null, Expect_jvmKt.rememberComposableLambda(-1244164617, new AccountPickerViewKt$$ExternalSyntheticLambda11(accountList, function1, i3), gapComposer), gapComposer, 1572918, 60);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Trace.m1191Iconww6aTOc(Icons.LogoUsd32, (String) null, SpacerKt.m298padding3ABfNKs(SizeKt.m285size3ABfNKs(ImageKt.m177backgroundbw27NRU(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getColors(gapComposer).semantic.background.brand, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(18.0f)), 48.0f), 12.0f), Strings.getColors(gapComposer).base.constantWhite, gapComposer, 54, 0);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            String str2 = accountList.title;
            boolean z2 = accountList.isInEditMode;
            if (accountList.accountViewModels.isEmpty()) {
                str = re$$ExternalSyntheticOutline0.m(gapComposer, 857710972, R.string.account_picker_message_no_accounts_saved, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(819317639);
                gapComposer.end(false);
                str = null;
            }
            Countries.PageHeader(str2, (Modifier) null, (Function2) null, str, gapComposer, 0, 6);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            if (z2) {
                gapComposer.startReplaceGroup(819471741);
                gapComposer.end(false);
                asPaddingValues = new PaddingValuesImpl(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
            } else {
                gapComposer.startReplaceGroup(819555689);
                WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                asPaddingValues = SpacerKt.asPaddingValues(Arrangement$End$1.current(gapComposer).navigationBars, gapComposer);
                gapComposer.end(false);
            }
            int i5 = i4 & 112;
            boolean changedInstance = gapComposer.changedInstance(accountList) | (i5 == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new MusicViewKt$$ExternalSyntheticLambda6(22, accountList, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.LazyColumn(layoutWeightElement, null, asPaddingValues, null, null, null, false, null, (Function1) rememberedValue, gapComposer, 0, 506);
            gapComposer = gapComposer;
            if (z2) {
                gapComposer.startReplaceGroup(821008969);
                Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(companion);
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, navigationBarsPadding);
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
                ModalKt.HorizontalDivider(0, 1, gapComposer, null);
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m298padding3ABfNKs(companion, 24.0f), 1.0f);
                boolean z3 = i5 == 32;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z3 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new P2PListViewKt$$ExternalSyntheticLambda0(11, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, fillMaxWidth, null, false, false, null, f522lambda$607192416, gapComposer, 1572912, 60);
                z = true;
                gapComposer.end(true);
                gapComposer.end(false);
            } else {
                z = true;
                gapComposer.startReplaceGroup(821319372);
                gapComposer.end(false);
            }
            gapComposer.end(z);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NoteRequiredViewKt$$ExternalSyntheticLambda1(accountList, function1, modifier, i, 3);
        }
    }

    public static final void AccountPickerContent(AccountPickerViewModel accountPickerViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1593223144);
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(accountPickerViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            boolean z = (i3 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new UtilKt$$ExternalSyntheticLambda0(i2, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue, gapComposer, 0);
            ArcadeAccountPicker(function1, accountPickerViewModel, null, gapComposer, ((i3 << 3) & 112) | ((i3 >> 3) & 14));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AccountPickerViewKt$$ExternalSyntheticLambda1(i, accountPickerViewModel, function1);
        }
    }

    public static final void AccountPickerErrorDialog(Function0 function0, Modifier modifier, String str, Composer composer, int i, int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        function0.getClass();
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2114819001);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (gapComposer.changed(modifier) ? 32 : 16);
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer.changed(str) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            if (i5 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            Modifier modifier3 = modifier;
            ModalKt.Modal(modifier3, f520lambda$397447670, Expect_jvmKt.rememberComposableLambda(-2054453911, new MoneyTabToolbarKt$$ExternalSyntheticLambda1(str, 14), gapComposer), Expect_jvmKt.rememberComposableLambda(2063457045, new DismissableToastKt$$ExternalSyntheticLambda3(23, function0), gapComposer), (Function3) null, (Function3) null, gapComposer, ((i4 >> 3) & 14) | 3504, 48);
            modifier2 = modifier3;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InstrumentCellKt$$ExternalSyntheticLambda9((Object) function0, modifier2, (Object) str, i, i2, 7);
        }
    }

    public static final void AccountPickerOptionsMenu(AccountPickerOptionsMenuViewModel accountPickerOptionsMenuViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        accountPickerOptionsMenuViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(45612325);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(accountPickerOptionsMenuViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-135091014, new FakeOverlayLayerKt$$ExternalSyntheticLambda0(accountPickerOptionsMenuViewModel, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NoteRequiredViewKt$$ExternalSyntheticLambda1(accountPickerOptionsMenuViewModel, function1, modifier2, i, 2);
        }
    }

    public static final void AccountRemoved(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1993770324);
        Applier applier = gapComposer.applier;
        if (gapComposer.shouldExecute(i & 1, (i & 3) != 2)) {
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(companion);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, navigationBarsPadding);
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
            Trace.m1191Iconww6aTOc(Icons.Check32, (String) null, SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(SizeKt.m285size3ABfNKs(companion, 48.0f), Strings.getColors(gapComposer).semantic.background.brand, RoundedCornerShapeKt.CircleShape), 12.0f), Strings.getColors(gapComposer).semantic.icon.inverse, gapComposer, 54, 0);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).sectionTitle, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.account_removed), (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda4(modifier, i, 2);
        }
    }

    public static final void AliasPicker(AliasPickerViewModel aliasPickerViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        aliasPickerViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1257286197);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(aliasPickerViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Updater.mutableStateOf$default(aliasPickerViewModel.preSelectedAliasId);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(293257174, new HelpSheetView$$ExternalSyntheticLambda0(aliasPickerViewModel, function1, (MutableState) rememberedValue), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NoteRequiredViewKt$$ExternalSyntheticLambda1(aliasPickerViewModel, function1, modifier2, i, 5);
        }
    }

    public static final void ArcadeAccountPicker(Function1 function1, AccountPickerViewModel accountPickerViewModel, Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-859769646);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(accountPickerViewModel) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        byte b = 0;
        int i4 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1627301469, new AccountPickerViewKt$$ExternalSyntheticLambda1(accountPickerViewModel, function1, i4, b), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NoteRequiredViewKt$$ExternalSyntheticLambda1(function1, (Object) accountPickerViewModel, (Object) modifier2, i, 4);
        }
    }

    public static final void ArcadeAccountRowItem(Function0 function0, Function0 function02, AccountViewModel accountViewModel, boolean z, Modifier modifier, Composer composer, int i) {
        AccountViewModel accountViewModel2;
        Modifier modifier2;
        Modifier.Companion companion;
        function0.getClass();
        function02.getClass();
        accountViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1943534508);
        int i2 = 2;
        int i3 = i | (gapComposer.changedInstance(function0) ? 4 : 2) | (gapComposer.changedInstance(function02) ? 32 : 16) | (gapComposer.changedInstance(accountViewModel) ? 256 : 128) | (gapComposer.changed(z) ? 2048 : 1024) | 24576;
        int i4 = 0;
        int i5 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z2 = (i3 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z2 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new LocalMapKt$$ExternalSyntheticLambda10(26, function02);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function1 = (Function1) rememberedValue;
            DismissValue dismissValue = DismissValue.Default;
            Object[] objArr = new Object[0];
            WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(8, new SnackbarHostKt$$ExternalSyntheticLambda2(14), new GestureNodeKt$$ExternalSyntheticLambda0(i2, function1));
            boolean changed = gapComposer.changed(0) | gapComposer.changed(function1);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new DialogHostKt$$ExternalSyntheticLambda0(22, dismissValue, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            DismissState dismissState = (DismissState) SaverKt.m581rememberSaveable(objArr, (Saver) workLauncherImpl, (Function0) rememberedValue2, (Composer) gapComposer, 0);
            Boolean valueOf = Boolean.valueOf(accountViewModel.isInSwipeToRemoveMode);
            boolean changed2 = gapComposer.changed(dismissState) | gapComposer.changedInstance(accountViewModel);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new OverlayKt$Overlay$1$1$1$1$1(dismissState, accountViewModel, null, 7);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue3);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (z) {
                gapComposer.startReplaceGroup(618244580);
                CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(Expect_jvmKt.rememberComposableLambda(-1953966345, new AccountPickerViewKt$$ExternalSyntheticLambda24(accountViewModel, i4), gapComposer), Expect_jvmKt.rememberComposableLambda(300325846, new AccountPickerViewKt$$ExternalSyntheticLambda24(accountViewModel, i5), gapComposer), companion2, function02, null, false, true, Expect_jvmKt.rememberComposableLambda(941177104, new AccountPickerViewKt$$ExternalSyntheticLambda24(accountViewModel, 2), gapComposer), null, new CellDefaultAccessory.ButtonCompact(null, null, true, lambda$547927961, 11), 0L, null, gapComposer, 14156214 | ((i3 << 6) & 7168), 0, 3376);
                companion = companion2;
                gapComposer.end(false);
                accountViewModel2 = accountViewModel;
            } else {
                companion = companion2;
                gapComposer.startReplaceGroup(619382156);
                accountViewModel2 = accountViewModel;
                CardKt.SwipeToDismiss(dismissState, null, SetsKt__SetsJVMKt.setOf(DismissDirection.EndToStart), null, Expect_jvmKt.rememberComposableLambda(1864349634, new P2PListViewKt$$ExternalSyntheticLambda12(dismissState, 18), gapComposer), Expect_jvmKt.rememberComposableLambda(2107886497, new MoneyTabUIKt$$ExternalSyntheticLambda11(function0, accountViewModel2), gapComposer), gapComposer, 221568);
                gapComposer.end(false);
            }
            modifier2 = companion;
        } else {
            accountViewModel2 = accountViewModel;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda30(function0, function02, accountViewModel2, z, modifier2, i);
        }
    }

    public static final void ConfirmAccountRemovalContent(Function1 function1, OnboardingConfirmAccountRemovalScreen onboardingConfirmAccountRemovalScreen, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(156977420);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(onboardingConfirmAccountRemovalScreen) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(121035233, new FakeOverlayLayerKt$$ExternalSyntheticLambda0(27, function1, onboardingConfirmAccountRemovalScreen), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OverlayKt$$ExternalSyntheticLambda2(function1, onboardingConfirmAccountRemovalScreen, i, i3);
        }
    }

    public static final void ConfirmAccountRemovalDialog(Function0 function0, Function0 function02, String str, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1363402294);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function02) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(str) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i4 = i3 | 3072;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i4 = i3 | (gapComposer.changed(modifier2) ? 2048 : 1024);
        }
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
            Modifier modifier3 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            Modifier testTag = TestTagKt.testTag(modifier3, "ConfirmAccountRemovalDialog");
            String format2 = new MessageFormat(Room.stringResource(gapComposer, R.string.confirm_account_removal_title)).format(new Object[]{str == null ? "" : str});
            format2.getClass();
            ModalKt.Modal(testTag, format2, Room.stringResource(gapComposer, R.string.confirm_account_removal_message), Expect_jvmKt.rememberComposableLambda(2047068710, new DismissableToastKt$$ExternalSyntheticLambda3(24, function0), gapComposer), Expect_jvmKt.rememberComposableLambda(1631741893, new DismissableToastKt$$ExternalSyntheticLambda3(25, function02), gapComposer), (Function3) null, gapComposer, 27648, 32);
            modifier2 = modifier3;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda5(function0, function02, str, modifier2, i, i2, 20);
        }
    }

    public static final void NameTitle(int i, Composer composer, Modifier modifier, String str, boolean z) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-395013233);
        int i2 = i | 6 | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            AnnotatedString.Builder builder = new AnnotatedString.Builder();
            builder.append(str);
            if (z) {
                KeyMappingKt.appendInlineContent(builder, "business_badge", "�");
            }
            AnnotatedString annotatedString = builder.toAnnotatedString();
            Map mapOf = MapsKt__MapsJVMKt.mapOf(new Pair("business_badge", new InlineTextContent(new Placeholder(7, Room.getSp(20), Room.getSp(16)), f523lambda$67869074)));
            modifier2 = Modifier.Companion.$$INSTANCE;
            Room.m1164Text25TpFw(0, 0, 0, 0, 48, 0, 2044, 0L, (Composer) gapComposer, modifier2, annotatedString, (TextStyle) null, (TextLineBalancing) null, mapOf, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new H6TextKt$$ExternalSyntheticLambda0(modifier2, str, z, i);
        }
    }

    public static final void Option(int i, Composer composer, String str, Function0 function0, boolean z) {
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1369518867);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SizeKt.m279heightInVpY3zN4$default(SpacerKt.m298padding3ABfNKs(ImageKt.m183clickableoSLSa3U$default(Modifier.Companion.$$INSTANCE, false, null, new Role(0), function0, 11), 4.0f), 56.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
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
            TextStyle textStyle = Strings.getTypography(gapComposer).button;
            if (z) {
                gapComposer.startReplaceGroup(-1307319110);
                j = Strings.getColors(gapComposer).component.button.destructive.standard.text.f156default;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1307223320);
                j = Strings.getColors(gapComposer).component.button.subtle.text.f168default;
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & 14, 0, 4082, j, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftListViewKt$$ExternalSyntheticLambda22(str, function0, z, i);
        }
    }
}
