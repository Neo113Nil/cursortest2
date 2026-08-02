package com.squareup.cash.history.views;

import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import app.cash.local.views.internal.ProgressBarKt$$ExternalSyntheticLambda0;
import app.cash.molecule.MoleculeKt$immediateClockFlow$1$1$1;
import app.cash.molecule.PlatformKt;
import app.cash.versioned.Versioned;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.RadioKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SignatureViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.charting.components.LineChartKt$Chart$1$1;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.globalsearch.views.GlobalSearchCellKt$$ExternalSyntheticLambda6;
import com.squareup.cash.globalsearch.views.QuickAccessBarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.graphics.views.GLSceneScopeProvider$SceneScope$2$1$1;
import com.squareup.cash.history.viewmodels.CancelPendingSupPaymentViewModel;
import com.squareup.cash.history.viewmodels.PasscodeDialogViewModel;
import com.squareup.cash.history.viewmodels.ReportAbuseViewModel;
import com.squareup.cash.money.booklet.MoneyTabBookletKt$$ExternalSyntheticLambda4;
import com.squareup.cash.moneybot.views.chat.EmptyChatKt;
import com.squareup.cash.pools.views.PoolToastKt$$ExternalSyntheticLambda0;
import com.squareup.cash.transfers.views.shared.TransferSheetKt$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.keypad.KeypadViewModel;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.util.Strings;
import com.squareup.util.compose.SharedViewEventsKt;
import java.util.ArrayList;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class ReportAbuseViewKt {

    /* renamed from: lambda$-1391988052, reason: not valid java name */
    public static final ComposableLambdaImpl f431lambda$1391988052 = new ComposableLambdaImpl(new GlobalSearchCellKt$$ExternalSyntheticLambda6(8), false, -1391988052);
    public static final ComposableLambdaImpl lambda$309390815 = new ComposableLambdaImpl(new GlobalSearchCellKt$$ExternalSyntheticLambda6(9), false, 309390815);
    public static final ComposableLambdaImpl lambda$1528735496 = new ComposableLambdaImpl(new GlobalSearchCellKt$$ExternalSyntheticLambda6(10), false, 1528735496);

    /* renamed from: lambda$-789913472, reason: not valid java name */
    public static final ComposableLambdaImpl f434lambda$789913472 = new ComposableLambdaImpl(new GlobalSearchCellKt$$ExternalSyntheticLambda6(11), false, -789913472);

    /* renamed from: lambda$-1494252010, reason: not valid java name */
    public static final ComposableLambdaImpl f433lambda$1494252010 = new ComposableLambdaImpl(new GlobalSearchCellKt$$ExternalSyntheticLambda6(12), false, -1494252010);

    /* renamed from: lambda$-1229099602, reason: not valid java name */
    public static final ComposableLambdaImpl f430lambda$1229099602 = new ComposableLambdaImpl(new GlobalSearchCellKt$$ExternalSyntheticLambda6(13), false, -1229099602);
    public static final ComposableLambdaImpl lambda$472279265 = new ComposableLambdaImpl(new GlobalSearchCellKt$$ExternalSyntheticLambda6(14), false, 472279265);

    /* renamed from: lambda$-1404649753, reason: not valid java name */
    public static final ComposableLambdaImpl f432lambda$1404649753 = new ComposableLambdaImpl(new GlobalSearchCellKt$$ExternalSyntheticLambda6(15), false, -1404649753);
    public static final ComposableLambdaImpl lambda$638377050 = new ComposableLambdaImpl(new GlobalSearchCellKt$$ExternalSyntheticLambda6(16), false, 638377050);
    public static final WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0 OvershootEasing = new WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0(11);

    public static final void CancelPendingSupPaymentBottomSheet(CancelPendingSupPaymentViewModel cancelPendingSupPaymentViewModel, Function1 function1, Composer composer, int i) {
        cancelPendingSupPaymentViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1119479502);
        int i2 = (gapComposer.changedInstance(cancelPendingSupPaymentViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-72277415, new CancelPendingSupPaymentBottomSheetKt$$ExternalSyntheticLambda0(cancelPendingSupPaymentViewModel, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CancelPendingSupPaymentBottomSheetKt$$ExternalSyntheticLambda0(cancelPendingSupPaymentViewModel, function1, i, i3);
        }
    }

    public static final void Content(CancelPendingSupPaymentViewModel cancelPendingSupPaymentViewModel, Function1 function1, Composer composer, int i) {
        Function1 function12;
        Modifier.Companion companion;
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-75810448);
        int i2 = i | (gapComposer.changedInstance(cancelPendingSupPaymentViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion2, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
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
            String str = cancelPendingSupPaymentViewModel.title;
            if (str == null) {
                gapComposer.startReplaceGroup(1161454809);
                gapComposer.end(false);
                companion = companion2;
                z = false;
            } else {
                gapComposer.startReplaceGroup(1161454810);
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).sectionTitle;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                companion = companion2;
                z = false;
                Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3832, 0L, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 4.0f, 2), textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            String str2 = cancelPendingSupPaymentViewModel.body;
            if (str2 == null) {
                gapComposer.startReplaceGroup(1161867419);
                gapComposer.end(z);
            } else {
                gapComposer.startReplaceGroup(1161867420);
                TextStyle textStyle2 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal2)).getClass();
                DefaultSizes.spacing.getClass();
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal2)).getClass();
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal2)).getClass();
                Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3832, 0L, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth2, 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 16.0f, 2), textStyle2, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer.end(z);
            }
            function12 = function1;
            DimensionKt.ButtonCtaGroup(null, false, ButtonCtaGroupOrientation.AUTOMATIC, null, Expect_jvmKt.rememberComposableLambda(1649959160, new MoneyTabBookletKt$$ExternalSyntheticLambda4(10, (Object) cancelPendingSupPaymentViewModel, function12), gapComposer), gapComposer, 24960, 11);
            gapComposer.end(true);
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CancelPendingSupPaymentBottomSheetKt$$ExternalSyntheticLambda0(cancelPendingSupPaymentViewModel, function12, i, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [int] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v2, types: [int] */
    public static final void PasscodeDialogContent(PasscodeDialogViewModel passcodeDialogViewModel, Function1 function1, String str, Composer composer, int i) {
        GapComposer gapComposer;
        String str2;
        int i2;
        NeverEqualPolicy neverEqualPolicy;
        Applier applier;
        ?? r13;
        ?? r12;
        RealCashVibrator realCashVibrator;
        Shaker shaker;
        MutableState mutableState;
        Throwable th;
        Object paymentPasscodeDialogViewKt$$ExternalSyntheticLambda2;
        Shaker shaker2;
        boolean z;
        PasscodeDialogViewModel passcodeDialogViewModel2;
        MutableState mutableState2;
        Versioned versioned = passcodeDialogViewModel.resetInvalidInput;
        int i3 = passcodeDialogViewModel.passcodeLength;
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1839453678);
        Applier applier2 = gapComposer2.applier;
        int i4 = i | (gapComposer2.changedInstance(passcodeDialogViewModel) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            RealCashVibrator realCashVibrator2 = (RealCashVibrator) gapComposer2.consume(LocalCashVibratorKt.LocalCashVibrator);
            Shaker rememberShaker = SharedViewEventsKt.rememberShaker(true, gapComposer2, 0);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy2) {
                rememberedValue = Updater.mutableStateOf$default("");
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState3 = (MutableState) rememberedValue;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy2) {
                rememberedValue2 = Boxes$$ExternalSyntheticOutline1.m(i3, gapComposer2);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue2;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy2) {
                rememberedValue3 = Updater.mutableStateOf$default(versioned);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState4 = (MutableState) rememberedValue3;
            boolean changedInstance = gapComposer2.changedInstance(passcodeDialogViewModel) | gapComposer2.changedInstance(realCashVibrator2) | gapComposer2.changedInstance(rememberShaker);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue4 == neverEqualPolicy2) {
                i2 = i4;
                neverEqualPolicy = neverEqualPolicy2;
                applier = applier2;
                r13 = 0;
                r12 = 1;
                rememberedValue4 = new MoleculeKt$immediateClockFlow$1$1$1(passcodeDialogViewModel, realCashVibrator2, rememberShaker, mutableState4, mutableState3, null, 14);
                realCashVibrator = realCashVibrator2;
                shaker = rememberShaker;
                mutableState = mutableState3;
                gapComposer2.updateRememberedValue(rememberedValue4);
            } else {
                shaker = rememberShaker;
                r13 = 0;
                mutableState = mutableState3;
                applier = applier2;
                i2 = i4;
                r12 = 1;
                neverEqualPolicy = neverEqualPolicy2;
                realCashVibrator = realCashVibrator2;
            }
            Updater.LaunchedEffect(gapComposer2, versioned, (Function2) rememberedValue4);
            Integer valueOf = Integer.valueOf(i3);
            boolean changedInstance2 = gapComposer2.changedInstance(passcodeDialogViewModel);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            Continuation continuation = null;
            if (changedInstance2 || rememberedValue5 == neverEqualPolicy) {
                GLSceneScopeProvider$SceneScope$2$1$1 gLSceneScopeProvider$SceneScope$2$1$1 = new GLSceneScopeProvider$SceneScope$2$1$1((Object) passcodeDialogViewModel, (Object) parcelableSnapshotMutableIntState, (Object) mutableState, continuation, 25);
                th = null;
                gapComposer2.updateRememberedValue(gLSceneScopeProvider$SceneScope$2$1$1);
                rememberedValue5 = gLSceneScopeProvider$SceneScope$2$1$1;
            } else {
                th = null;
            }
            Updater.LaunchedEffect(gapComposer2, valueOf, (Function2) rememberedValue5);
            boolean z2 = passcodeDialogViewModel.loading;
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue6);
            }
            MutableState mutableState5 = (MutableState) rememberedValue6;
            ArrayList arrayList = KeypadViewModel.keysWithoutSeparator;
            boolean changed = gapComposer2.changed(z2);
            Object rememberedValue7 = gapComposer2.rememberedValue();
            if (changed || rememberedValue7 == neverEqualPolicy) {
                rememberedValue7 = new TransferSheetKt$$ExternalSyntheticLambda0(z2, mutableState, mutableState5, r12);
                gapComposer2.updateRememberedValue(rememberedValue7);
            }
            Function0 function0 = (Function0) rememberedValue7;
            int i5 = i2 & 112;
            boolean changed2 = gapComposer2.changed(z2) | gapComposer2.changedInstance(realCashVibrator) | gapComposer2.changedInstance(shaker) | gapComposer2.changedInstance(passcodeDialogViewModel) | (i5 == 32 ? r12 : r13);
            Object rememberedValue8 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue8 == neverEqualPolicy) {
                Shaker shaker3 = shaker;
                MutableState mutableState6 = mutableState;
                shaker2 = shaker3;
                paymentPasscodeDialogViewKt$$ExternalSyntheticLambda2 = new PaymentPasscodeDialogViewKt$$ExternalSyntheticLambda2(z2, realCashVibrator, shaker2, passcodeDialogViewModel, function1, mutableState5, mutableState6);
                z = z2;
                passcodeDialogViewModel2 = passcodeDialogViewModel;
                mutableState2 = mutableState6;
                gapComposer2.updateRememberedValue(paymentPasscodeDialogViewKt$$ExternalSyntheticLambda2);
            } else {
                z = z2;
                passcodeDialogViewModel2 = passcodeDialogViewModel;
                paymentPasscodeDialogViewKt$$ExternalSyntheticLambda2 = rememberedValue8;
                mutableState2 = mutableState;
                shaker2 = shaker;
            }
            KeypadViewModel keypadViewModel = new KeypadViewModel(arrayList, false, function0, (Function1) paymentPasscodeDialogViewKt$$ExternalSyntheticLambda2, 2);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxWidth(companion, 1.0f), Strings.getColors(gapComposer2).semantic.background.f1047app, ColorKt.RectangleShape), PrimitiveResources_androidKt.dimensionResource(gapComposer2, R.dimen.passcode_dialog_padding_sides), PrimitiveResources_androidKt.dimensionResource(gapComposer2, R.dimen.passcode_dialog_padding_top));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, r13);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m299paddingVpY3zN4);
            ComposeUiNode.Companion.getClass();
            Throwable th2 = th;
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw th2;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf2 = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf2, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            NeverEqualPolicy neverEqualPolicy3 = neverEqualPolicy;
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3824, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, SpacerKt.m299paddingVpY3zN4(SizeKt.fillMaxWidth(companion, 1.0f), 32.0f, PrimitiveResources_androidKt.dimensionResource(gapComposer2, R.dimen.passcode_dialog_message_margin)), Strings.getTypography(gapComposer2).labelMedium, (TextLineBalancing) null, passcodeDialogViewModel2.title, (Map) null, (Function1) null, false);
            Boolean valueOf3 = Boolean.valueOf(z);
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, PrimitiveResources_androidKt.dimensionResource(gapComposer2, R.dimen.passcode_dialog_editor_margin), 1);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(119936711, new PoolToastKt$$ExternalSyntheticLambda0(4, passcodeDialogViewModel2, shaker2, mutableState2), gapComposer2);
            gapComposer = gapComposer2;
            CrossfadeKt.Crossfade(valueOf3, m300paddingVpY3zN4$default, (FiniteAnimationSpec) null, (String) null, rememberComposableLambda, gapComposer, 24576, 12);
            float f = z ? 0.5f : 1.0f;
            float f2 = f;
            RelationUtil.m1189KeypadViewww6aTOc(AlphaKt.alpha(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), PrimitiveResources_androidKt.dimensionResource(gapComposer, R.dimen.dialog_keypad_height)), f), keypadViewModel, null, 0L, gapComposer, 0, 12);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            boolean z3 = !z;
            boolean z4 = i5 == 32;
            Object rememberedValue9 = gapComposer.rememberedValue();
            if (z4 || rememberedValue9 == neverEqualPolicy3) {
                rememberedValue9 = new ErrorView$$ExternalSyntheticLambda4(18, function1);
                gapComposer.updateRememberedValue(rememberedValue9);
            }
            Modifier alpha = AlphaKt.alpha(SpacerKt.m300paddingVpY3zN4$default(ImageKt.m183clickableoSLSa3U$default(fillMaxWidth, z3, null, null, (Function0) rememberedValue9, 14), RecyclerView.DECELERATION_RATE, 12.0f, 1), f2);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, alpha);
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
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.passcode_dialog_negative), (Map) null, (Function1) null, false);
            gapComposer.end(true);
            gapComposer.end(true);
            str2 = "";
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            str2 = str;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new QuickAccessBarKt$$ExternalSyntheticLambda1(passcodeDialogViewModel, function1, str2, i, 5);
        }
    }

    public static final void PasscodePips(int i, int i2, int i3, Composer composer, Modifier modifier) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2083533482);
        int i4 = (gapComposer.changed(i) ? 4 : 2) | i3 | (gapComposer.changed(i2) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(PrimitiveResources_androidKt.dimensionResource(gapComposer, R.dimen.passcode_pip_margin), true, new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(Alignment.Companion.CenterHorizontally, 1)), Alignment.Companion.CenterVertically, gapComposer, 48);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(101297898);
            int i5 = 0;
            while (i5 < i) {
                Pip(i5 < i2, gapComposer, 0);
                i5++;
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ProgressBarKt$$ExternalSyntheticLambda0(i, i2, modifier, i3, 9);
        }
    }

    public static final void Pip(boolean z, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1243573666);
        int i2 = (gapComposer.changed(z) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.text.standard;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = AnimatableKt.Animatable(z ? 1.0f : RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Animatable animatable = (Animatable) rememberedValue;
            Boolean valueOf = Boolean.valueOf(z);
            boolean changedInstance = ((i2 & 14) == 4) | gapComposer.changedInstance(animatable);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new LineChartKt$Chart$1$1(animatable, z, (Continuation) null, 2);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue2);
            float dimensionResource = PrimitiveResources_androidKt.dimensionResource(gapComposer, R.dimen.passcode_pip_radius) * 2.0f;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, dimensionResource);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m285size3ABfNKs);
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
            Modifier m285size3ABfNKs2 = SizeKt.m285size3ABfNKs(companion, dimensionResource);
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
            Modifier clip = ClipKt.clip(m285size3ABfNKs2, roundedCornerShape);
            long m675copywmQWz5c$default = Color.m675copywmQWz5c$default(0.25f, j, 14);
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(clip, m675copywmQWz5c$default, rectangleShapeKt$RectangleShape$1), gapComposer, 0);
            Modifier m285size3ABfNKs3 = SizeKt.m285size3ABfNKs(companion, dimensionResource);
            boolean changedInstance2 = gapComposer.changedInstance(animatable);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new RadioKt$$ExternalSyntheticLambda1(animatable, 11);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(ClipKt.clip(ColorKt.graphicsLayer(m285size3ABfNKs3, (Function1) rememberedValue3), roundedCornerShape), j, rectangleShapeKt$RectangleShape$1), gapComposer, 0);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SignatureViewKt$$ExternalSyntheticLambda2(i, 4, z);
        }
    }

    public static final void ReportAbuse(ReportAbuseViewModel reportAbuseViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-130316034);
        int i2 = (gapComposer.changedInstance(reportAbuseViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxWidth, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            String str = reportAbuseViewModel.title;
            if (str == null) {
                str = "";
            }
            EmptyChatKt.ProfileHeader(str, (Modifier) null, (Function2) null, reportAbuseViewModel.subtitle, gapComposer, 0, 6);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(124106358, new ReportAbuseViewKt$$ExternalSyntheticLambda0(reportAbuseViewModel, function1, i3), gapComposer), gapComposer, 24576, 15);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ReportAbuseViewKt$$ExternalSyntheticLambda1(reportAbuseViewModel, function1, i, 0);
        }
    }

    public static final void ReportAbuseDialog(ReportAbuseViewModel reportAbuseViewModel, Function1 function1, Composer composer, int i) {
        boolean z;
        reportAbuseViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-460514818);
        Applier applier = gapComposer.applier;
        int i2 = (gapComposer.changedInstance(reportAbuseViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
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
            AnimatedContentKt.AnimatedVisibility(true, (Modifier) null, (EnterTransitionImpl) null, (ExitTransitionImpl) null, (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(-691125668, new ReportAbuseViewKt$$ExternalSyntheticLambda0(reportAbuseViewModel, function1, i3), gapComposer), (Composer) gapComposer, 196614, 30);
            if (reportAbuseViewModel.actionInProgress) {
                gapComposer.startReplaceGroup(1325180985);
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(BoxScopeInstance.INSTANCE.matchParentSize(), 1.0f);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxWidth, colors.semantic.background.f1047app, ColorKt.RectangleShape);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                z = true;
                ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
                gapComposer.end(true);
                gapComposer.end(false);
            } else {
                z = true;
                gapComposer.startReplaceGroup(1325431806);
                gapComposer.end(false);
            }
            gapComposer.end(z);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ReportAbuseViewKt$$ExternalSyntheticLambda1(reportAbuseViewModel, function1, i, 2);
        }
    }
}
