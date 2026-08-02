package com.squareup.cash.card.onboarding;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListMeasuredItem;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SliderKt$sliderTapModifier$1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
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
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.core.text.TextUtilsCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.api.ApiResult;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda26;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.boost.db.RewardSlotQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda1;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda2;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda9;
import com.squareup.cash.borrow.views.ComposableSingletons$BorrowUiFactoryKt$$ExternalSyntheticLambda0;
import com.squareup.cash.borrow.views.LoanDetailsSheetKt$$ExternalSyntheticLambda14;
import com.squareup.cash.card.onboarding.graphics.FlowsKt;
import com.squareup.cash.card.onboarding.graphics.HeartEdition;
import com.squareup.cash.card.onboarding.graphics.HeartScene;
import com.squareup.cash.card.onboarding.graphics.MiniCardEdition;
import com.squareup.cash.card.onboarding.graphics.MiniCardScene;
import com.squareup.cash.card.onboarding.graphics.TagPoseController;
import com.squareup.cash.card.onboarding.graphics.WandEdition;
import com.squareup.cash.card.onboarding.graphics.WandPose;
import com.squareup.cash.card.onboarding.graphics.WandPoseController;
import com.squareup.cash.card.onboarding.graphics.WandScene;
import com.squareup.cash.card.onboarding.opengl.renderer.HeatRenderer;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda0;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda1;
import com.squareup.cash.cashapppay.views.GrantSheetKt$$ExternalSyntheticLambda4;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda1;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda6;
import com.squareup.cash.common.composeui.DensityUtilsKt;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.data.TemporaryStorage$getDir$2;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda2;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda6;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda3;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector3;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda8;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.wallet.data.TagFormFactor;
import com.squareup.cash.wallet.views.CardLockViewKt$$ExternalSyntheticLambda2;
import com.squareup.protos.franklin.common.Stamp;
import com.squareup.util.Strings;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class CanvasKt {

    /* renamed from: lambda$-919429024, reason: not valid java name */
    public static final ComposableLambdaImpl f343lambda$919429024;
    public static final ComposableLambdaImpl lambda$1189572097;
    public static final ComposableLambdaImpl lambda$313022783;
    public static final ComposableLambdaImpl lambda$380991713;

    /* renamed from: lambda$-839200437, reason: not valid java name */
    public static final ComposableLambdaImpl f342lambda$839200437 = new ComposableLambdaImpl(new ComposableSingletons$BorrowUiFactoryKt$$ExternalSyntheticLambda0(25), false, -839200437);

    /* renamed from: lambda$-1768267606, reason: not valid java name */
    public static final ComposableLambdaImpl f336lambda$1768267606 = new ComposableLambdaImpl(new ComposableSingletons$BorrowUiFactoryKt$$ExternalSyntheticLambda0(26), false, -1768267606);

    /* renamed from: lambda$-718247557, reason: not valid java name */
    public static final ComposableLambdaImpl f339lambda$718247557 = new ComposableLambdaImpl(new ComposableSingletons$BorrowUiFactoryKt$$ExternalSyntheticLambda0(27), false, -718247557);

    /* renamed from: lambda$-747125044, reason: not valid java name */
    public static final ComposableLambdaImpl f340lambda$747125044 = new ComposableLambdaImpl(new ComposableSingletons$BorrowUiFactoryKt$$ExternalSyntheticLambda0(28), false, -747125044);
    public static final ComposableLambdaImpl lambda$1081811144 = new ComposableLambdaImpl(new CardStudioViewV2Kt$$ExternalSyntheticLambda47(12), false, 1081811144);

    /* renamed from: lambda$-452100298, reason: not valid java name */
    public static final ComposableLambdaImpl f338lambda$452100298 = new ComposableLambdaImpl(new CardStudioViewV2Kt$$ExternalSyntheticLambda47(13), false, -452100298);

    /* renamed from: lambda$-792430241, reason: not valid java name */
    public static final ComposableLambdaImpl f341lambda$792430241 = new ComposableLambdaImpl(new CardStudioViewV2Kt$$ExternalSyntheticLambda47(14), false, -792430241);
    public static final ComposableLambdaImpl lambda$1895805494 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda6(1), false, 1895805494);

    /* renamed from: lambda$-1335973193, reason: not valid java name */
    public static final ComposableLambdaImpl f335lambda$1335973193 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda6(2), false, -1335973193);
    public static final ComposableLambdaImpl lambda$1828089819 = new ComposableLambdaImpl(new CardStudioViewV2Kt$$ExternalSyntheticLambda47(15), false, 1828089819);
    public static final ComposableLambdaImpl lambda$301236938 = new ComposableLambdaImpl(new CardStudioViewV2Kt$$ExternalSyntheticLambda47(16), false, 301236938);
    public static final ComposableLambdaImpl lambda$979563187 = new ComposableLambdaImpl(new CardStudioViewV2Kt$$ExternalSyntheticLambda47(17), false, 979563187);
    public static final ComposableLambdaImpl lambda$1150035888 = new ComposableLambdaImpl(new CardStudioViewV2Kt$$ExternalSyntheticLambda47(18), false, 1150035888);
    public static final ComposableLambdaImpl lambda$1173387045 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda6(4), false, 1173387045);

    /* renamed from: lambda$-399677165, reason: not valid java name */
    public static final ComposableLambdaImpl f337lambda$399677165 = new ComposableLambdaImpl(new CardStudioViewV2Kt$$ExternalSyntheticLambda47(19), false, -399677165);
    public static final ComposableLambdaImpl lambda$1311331826 = new ComposableLambdaImpl(new CardStudioViewV2Kt$$ExternalSyntheticLambda47(20), false, 1311331826);
    public static final ComposableLambdaImpl lambda$1819955824 = new ComposableLambdaImpl(new CardStudioViewV2Kt$$ExternalSyntheticLambda47(21), false, 1819955824);
    public static final float[] ENTRANCE_SPIN_AXIS = {RecyclerView.DECELERATION_RATE, 1.0f, RecyclerView.DECELERATION_RATE};
    public static final float[] X_AXIS = {1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE};
    public static final float[] ENTRANCE_SPIN_AXIS$1 = {RecyclerView.DECELERATION_RATE, 1.0f, RecyclerView.DECELERATION_RATE};

    static {
        int i = 3;
        f343lambda$919429024 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda2(i), false, -919429024);
        int i2 = 29;
        lambda$380991713 = new ComposableLambdaImpl(new ComposableSingletons$BorrowUiFactoryKt$$ExternalSyntheticLambda0(i2), false, 380991713);
        lambda$313022783 = new ComposableLambdaImpl(new LoanDetailsSheetKt$$ExternalSyntheticLambda14(i2), false, 313022783);
        lambda$1189572097 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda6(i), false, 1189572097);
    }

    public static final void CardStudioExitDialog(CardStudioExitDialogViewModel cardStudioExitDialogViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1472479535);
        int i2 = (gapComposer.changedInstance(cardStudioExitDialogViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(512617948, new BulletinTileKt$$ExternalSyntheticLambda2(cardStudioExitDialogViewModel, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda9(cardStudioExitDialogViewModel, function1, modifier2, i, 29);
        }
    }

    public static final void CardStudioMoreSheetV2(CardStudioMoreSheetViewModel cardStudioMoreSheetViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        cardStudioMoreSheetViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(655870010);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(cardStudioMoreSheetViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new DisclosureView$$ExternalSyntheticLambda1(7, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SheetKt.Sheet((Function0) rememberedValue, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(1856365187, new CheckDepositAmountKt$$ExternalSyntheticLambda6(9, (Object) cardStudioMoreSheetViewModel, (Object) function1), gapComposer), gapComposer, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckDepositAmountKt$$ExternalSyntheticLambda1(cardStudioMoreSheetViewModel, function1, i, 12);
        }
    }

    public static final void CardStudioUndoDialog(CardStudioUndoDialogViewModel cardStudioUndoDialogViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-815987317);
        int i2 = (gapComposer.changedInstance(cardStudioUndoDialogViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1169110166, new BulletinTileKt$$ExternalSyntheticLambda2(cardStudioUndoDialogViewModel, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashCardKt$$ExternalSyntheticLambda1(i, 2, modifier2, cardStudioUndoDialogViewModel, function1);
        }
    }

    public static final void CardStylePicker(CardStylePickerViewModel cardStylePickerViewModel, Function1 function1, LazyListState lazyListState, Composer composer, int i) {
        int i2;
        cardStylePickerViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1257417901);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(cardStylePickerViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                lazyListState = LazyListStateKt.rememberLazyListState(0, 3, gapComposer);
            } else {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(975945720, new CashCardKt$$ExternalSyntheticLambda1(8, lazyListState, function1, cardStylePickerViewModel), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        LazyListState lazyListState2 = lazyListState;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda3(cardStylePickerViewModel, function1, lazyListState2, i, 15);
        }
    }

    public static final void HeartConfirmationEffect(Modifier modifier, boolean z, HeartEdition heartEdition, Composer composer, int i) {
        int i2;
        boolean z2;
        HeartEdition heartEdition2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-754678838);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= gapComposer.changed(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(heartEdition.ordinal()) ? 256 : 128;
        }
        int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Quat quat = HeartScene.DEFAULT_ROTATION;
            CardStudioViewV2Kt$$ExternalSyntheticLambda47 cardStudioViewV2Kt$$ExternalSyntheticLambda47 = new CardStudioViewV2Kt$$ExternalSyntheticLambda47(22);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new RealAppConfigManager$$ExternalSyntheticLambda2(i3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function5 function5 = (Function5) rememberedValue;
            heartEdition2 = heartEdition;
            boolean z3 = z2;
            TagConfirmationEffectScaffold(modifier, z3, 0.85f, quat, cardStudioViewV2Kt$$ExternalSyntheticLambda47, function5, Expect_jvmKt.rememberComposableLambda(-570551362, new WandConfirmationEffectKt$$ExternalSyntheticLambda2(heartEdition2, i4), gapComposer), 1.3f, ENTRANCE_SPIN_AXIS, Float.valueOf(0.7f), gapComposer, (i2 & 112) | (i2 & 14) | 819659136 | 4096, 0);
        } else {
            heartEdition2 = heartEdition;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardLockViewKt$$ExternalSyntheticLambda2(modifier, z, heartEdition2, i, 5);
        }
    }

    public static final void MiniCardConfirmationEffect(Modifier modifier, boolean z, MiniCardEdition miniCardEdition, Composer composer, int i) {
        int i2;
        boolean z2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1877015441);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= gapComposer.changed(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(miniCardEdition.ordinal()) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Quat quat = MiniCardScene.DEFAULT_ROTATION;
            CardStudioViewV2Kt$$ExternalSyntheticLambda47 cardStudioViewV2Kt$$ExternalSyntheticLambda47 = new CardStudioViewV2Kt$$ExternalSyntheticLambda47(23);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new RealAppConfigManager$$ExternalSyntheticLambda2(5);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            TagConfirmationEffectScaffold(modifier, z2, 0.85f, quat, cardStudioViewV2Kt$$ExternalSyntheticLambda47, (Function5) rememberedValue, Expect_jvmKt.rememberComposableLambda(-1451874565, new WandConfirmationEffectKt$$ExternalSyntheticLambda2(miniCardEdition, i3), gapComposer), 1.2f, null, Float.valueOf(0.7f), gapComposer, (i2 & 112) | (i2 & 14) | 819659136 | 4096, 256);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardLockViewKt$$ExternalSyntheticLambda2(modifier, z, miniCardEdition, i, 6);
        }
    }

    public static final void MoodHeatEffect(Modifier modifier, HeatRenderer heatRenderer, Composer composer, int i) {
        int i2;
        heatRenderer.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-868436001);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(heatRenderer) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Lifecycle lifecycle = ((LifecycleOwner) gapComposer.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
            boolean changedInstance = gapComposer.changedInstance(lifecycle) | gapComposer.changedInstance(heatRenderer);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new BorrowHomeKt$$ExternalSyntheticLambda1(15, lifecycle, heatRenderer);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.DisposableEffect(lifecycle, (Function1) rememberedValue, gapComposer);
            Unit unit = Unit.INSTANCE;
            boolean changedInstance2 = gapComposer.changedInstance(heatRenderer);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new SliderKt$sliderTapModifier$1(heatRenderer, 3);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(modifier, unit, (PointerInputEventHandler) rememberedValue2);
            boolean changedInstance3 = gapComposer.changedInstance(heatRenderer);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance3 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new MoodHeatEffectKt$$ExternalSyntheticLambda2(heatRenderer, 0);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            AndroidView_androidKt.AndroidView((Function1) rememberedValue3, pointerInput, null, gapComposer, 0, 4);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckDepositAmountKt$$ExternalSyntheticLambda1(modifier, heatRenderer, i, 14);
        }
    }

    public static final void Stamp(Stamp stamp, boolean z, boolean z2, Function1 function1, Composer composer, int i) {
        float f;
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(322145372);
        int i2 = i | (gapComposer.changedInstance(stamp) ? 4 : 2) | (gapComposer.changed(z) ? 32 : 16) | (gapComposer.changed(z2) ? 256 : 128) | (gapComposer.changedInstance(function1) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier aspectRatio = OffsetKt.aspectRatio(1.0f, companion, false);
            if (z) {
                gapComposer.startReplaceGroup(344065282);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                Object obj = DefaultSizes.border.annotationsMap;
                gapComposer.end(false);
                f = 2.0f;
            } else {
                gapComposer.startReplaceGroup(344065726);
                gapComposer.end(false);
                f = RecyclerView.DECELERATION_RATE;
            }
            if (z) {
                gapComposer.startReplaceGroup(344068065);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.border.brand;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(344068615);
                gapComposer.end(false);
                j = Color.Transparent;
            }
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Object obj2 = DefaultSizes.border.entries;
            Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(aspectRatio, f, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Modifier clip = ClipKt.clip(m178borderxT4_qwU, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
            boolean changedInstance = ((i2 & 7168) == 2048) | gapComposer.changedInstance(stamp);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new StampSheetV2Kt$$ExternalSyntheticLambda7(function1, stamp, 1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m183clickableoSLSa3U$default(clip, false, null, null, (Function0) rememberedValue, 15), 18.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
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
            Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            int m694toArgb8_81llA = ColorKt.m694toArgb8_81llA(colors2.semantic.icon.standard);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            float m3477toPx8Feqmps = DensityUtilsKt.m3477toPx8Feqmps(2.0f, gapComposer);
            Modifier alpha = AlphaKt.alpha(companion, z2 ? 1.0f : 0.3f);
            boolean changed = gapComposer.changed(m694toArgb8_81llA) | gapComposer.changed(m3477toPx8Feqmps);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new StampSheetV2Kt$$ExternalSyntheticLambda8(m3477toPx8Feqmps, m694toArgb8_81llA, 1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Function1 function12 = (Function1) rememberedValue2;
            boolean changedInstance2 = gapComposer.changedInstance(stamp);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new StampSheetV2Kt$$ExternalSyntheticLambda9(stamp, 1);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            AndroidView_androidKt.AndroidView(function12, alpha, (Function1) rememberedValue3, gapComposer, 0, 0);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new StampSheetV2Kt$$ExternalSyntheticLambda10(stamp, z, z2, function1, i, 1);
        }
    }

    public static final void StampCellV2(Stamp stamp, boolean z, boolean z2, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        long j;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1087012724);
        int i2 = i | (gapComposer2.changedInstance(stamp) ? 4 : 2) | (gapComposer2.changed(z) ? 32 : 16) | (gapComposer2.changed(z2) ? 256 : 128) | (gapComposer2.changedInstance(function1) ? 2048 : 1024);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 76.0f);
            Strings.getSizes(gapComposer2).getClass();
            Object obj = DefaultSizes.border.annotationsMap;
            if (z) {
                gapComposer2.startReplaceGroup(-942164335);
                j = Strings.getColors(gapComposer2).semantic.border.brand;
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(-942162478);
                j = Strings.getColors(gapComposer2).semantic.border.subtle;
                gapComposer2.end(false);
            }
            Strings.getSizes(gapComposer2).getClass();
            Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(m285size3ABfNKs, 2.0f, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
            Strings.getSizes(gapComposer2).getClass();
            Modifier clip = ClipKt.clip(m178borderxT4_qwU, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
            boolean changedInstance = ((i2 & 7168) == 2048) | gapComposer2.changedInstance(stamp);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new StampSheetV2Kt$$ExternalSyntheticLambda7(function1, stamp, 0);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(clip, z2, null, null, (Function0) rememberedValue, 14);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m183clickableoSLSa3U$default);
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
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            int m694toArgb8_81llA = ColorKt.m694toArgb8_81llA(Strings.getColors(gapComposer2).semantic.icon.prominent);
            Strings.getSizes(gapComposer2).getClass();
            float m3477toPx8Feqmps = DensityUtilsKt.m3477toPx8Feqmps(2.0f, gapComposer2);
            Modifier alpha = AlphaKt.alpha(SizeKt.m285size3ABfNKs(companion, 45.0f), z2 ? 1.0f : 0.3f);
            boolean changed = gapComposer2.changed(m694toArgb8_81llA) | gapComposer2.changed(m3477toPx8Feqmps);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new StampSheetV2Kt$$ExternalSyntheticLambda8(m3477toPx8Feqmps, m694toArgb8_81llA, 0);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Function1 function12 = (Function1) rememberedValue2;
            boolean changedInstance2 = gapComposer2.changedInstance(stamp);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new StampSheetV2Kt$$ExternalSyntheticLambda9(stamp, 0);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            Function1 function13 = (Function1) rememberedValue3;
            gapComposer = gapComposer2;
            AndroidView_androidKt.AndroidView(function12, alpha, function13, gapComposer, 0, 0);
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new StampSheetV2Kt$$ExternalSyntheticLambda10(stamp, z, z2, function1, i, 0);
        }
    }

    public static final void StampSheet(StampSheetViewModel stampSheetViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        stampSheetViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(165673370);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(stampSheetViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(2065241253, new BulletinTileKt$$ExternalSyntheticLambda2(26, stampSheetViewModel, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new StampSheetV2Kt$$ExternalSyntheticLambda2(stampSheetViewModel, function1, i, i3);
        }
    }

    public static final void StampSheetV2(StampSheetViewModel stampSheetViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        stampSheetViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-448002100);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(stampSheetViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i4 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GrantSheetKt$$ExternalSyntheticLambda4(i3, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SheetKt.Sheet((Function0) rememberedValue, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(1385893667, new StampSheetV2Kt$$ExternalSyntheticLambda1(function1, stampSheetViewModel), gapComposer), gapComposer, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new StampSheetV2Kt$$ExternalSyntheticLambda2(stampSheetViewModel, function1, i, i4);
        }
    }

    public static final void TagConfirmationEffectScaffold(final Modifier modifier, final boolean z, final float f, final Quat quat, final Function3 function3, final Function5 function5, final ComposableLambdaImpl composableLambdaImpl, final float f2, float[] fArr, final Float f3, Composer composer, final int i, final int i2) {
        int i3;
        float[] fArr2;
        GapComposer gapComposer;
        final float[] fArr3;
        float[] fArr4;
        int i4;
        float[] fArr5;
        Boolean bool;
        Animatable animatable;
        Object tagConfirmationEffectScaffoldKt$TagConfirmationEffectScaffold$1$1;
        NeverEqualPolicy neverEqualPolicy;
        final boolean z2;
        State state;
        int i5;
        modifier.getClass();
        quat.getClass();
        function5.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-2090685196);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changed(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? gapComposer2.changed(quat) : gapComposer2.changedInstance(quat) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= gapComposer2.changedInstance(function3) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i3 |= gapComposer2.changedInstance(function5) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= gapComposer2.changedInstance(composableLambdaImpl) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i3 |= gapComposer2.changed(f2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            if ((i2 & 256) == 0) {
                fArr2 = fArr;
                if (gapComposer2.changedInstance(fArr2)) {
                    i5 = 67108864;
                    i3 |= i5;
                }
            } else {
                fArr2 = fArr;
            }
            i5 = 33554432;
            i3 |= i5;
        } else {
            fArr2 = fArr;
        }
        if ((805306368 & i) == 0) {
            i3 |= gapComposer2.changed(f3) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 306783379) != 306783378)) {
            gapComposer2.startDefaults();
            if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                if ((i2 & 256) != 0) {
                    i3 &= -234881025;
                    fArr4 = X_AXIS;
                } else {
                    fArr4 = fArr2;
                }
                i4 = i3;
                fArr5 = fArr4;
            } else {
                gapComposer2.skipToGroupEnd();
                if ((i2 & 256) != 0) {
                    i3 &= -234881025;
                }
                i4 = i3;
                fArr5 = fArr2;
            }
            gapComposer2.endDefaults();
            boolean z3 = z && f2 != RecyclerView.DECELERATION_RATE;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy2) {
                rememberedValue = AnimatableKt.Animatable(z ? 0.0f : 1.0f, 0.01f);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            final Animatable animatable2 = (Animatable) rememberedValue;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy2) {
                rememberedValue2 = AnimatableKt.Animatable(z3 ? -f2 : RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Animatable animatable3 = (Animatable) rememberedValue2;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy2) {
                rememberedValue3 = AnimatableKt.Animatable(z3 ? RecyclerView.DECELERATION_RATE : 1.0f, 0.01f);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            final Animatable animatable4 = (Animatable) rememberedValue3;
            Boolean valueOf = Boolean.valueOf(z);
            boolean changedInstance = ((i4 & 112) == 32) | gapComposer2.changedInstance(animatable2) | gapComposer2.changed(z3) | gapComposer2.changedInstance(animatable3) | gapComposer2.changedInstance(animatable4);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue4 == neverEqualPolicy2) {
                bool = valueOf;
                animatable = animatable3;
                neverEqualPolicy = neverEqualPolicy2;
                tagConfirmationEffectScaffoldKt$TagConfirmationEffectScaffold$1$1 = new TagConfirmationEffectScaffoldKt$TagConfirmationEffectScaffold$1$1(z, z3, animatable2, animatable, animatable4, null);
                z2 = z3;
                gapComposer2.updateRememberedValue(tagConfirmationEffectScaffoldKt$TagConfirmationEffectScaffold$1$1);
            } else {
                bool = valueOf;
                neverEqualPolicy = neverEqualPolicy2;
                animatable = animatable3;
                tagConfirmationEffectScaffoldKt$TagConfirmationEffectScaffold$1$1 = rememberedValue4;
                z2 = z3;
            }
            Updater.LaunchedEffect(gapComposer2, bool, (Function2) tagConfirmationEffectScaffoldKt$TagConfirmationEffectScaffold$1$1);
            Pair pair = (Pair) function3.invoke(z2 ? WandPose.Still : z ? WandPose.Float : WandPose.Still, gapComposer2, Integer.valueOf((i4 >> 9) & 112));
            TagPoseController tagPoseController = (TagPoseController) pair.first;
            State state2 = (State) pair.second;
            if (z2) {
                gapComposer2.startReplaceGroup(2015673763);
                boolean changedInstance2 = gapComposer2.changedInstance(tagPoseController);
                Object rememberedValue5 = gapComposer2.rememberedValue();
                if (changedInstance2 || rememberedValue5 == neverEqualPolicy) {
                    state = state2;
                    rememberedValue5 = new TemporaryStorage$getDir$2(tagPoseController, null, 15);
                    gapComposer2.updateRememberedValue(rememberedValue5);
                } else {
                    state = state2;
                }
                Updater.LaunchedEffect(gapComposer2, tagPoseController, (Function2) rememberedValue5);
                gapComposer2.end(false);
            } else {
                state = state2;
                gapComposer2.startReplaceGroup(2015745838);
                gapComposer2.end(false);
            }
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = Updater.mutableStateOf$default(null);
                gapComposer2.updateRememberedValue(rememberedValue6);
            }
            final MutableState mutableState = (MutableState) rememberedValue6;
            boolean z4 = (i4 & 458752) == 131072;
            Object rememberedValue7 = gapComposer2.rememberedValue();
            if (z4 || rememberedValue7 == neverEqualPolicy) {
                rememberedValue7 = new BulletinTileKt$$ExternalSyntheticLambda2(27, mutableState, function5);
                gapComposer2.updateRememberedValue(rememberedValue7);
            }
            final Modifier tagDragGestures = FlowsKt.tagDragGestures(Modifier.Companion.$$INSTANCE, tagPoseController, (Function2) rememberedValue7);
            final State state3 = state;
            final float[] fArr6 = fArr5;
            final Animatable animatable5 = animatable;
            fArr3 = fArr6;
            gapComposer = gapComposer2;
            OffsetKt.BoxWithConstraints(SizeKt.fillMaxSize(modifier, 1.0f), Alignment.Companion.Center, false, Expect_jvmKt.rememberComposableLambda(-2022606390, new Function3() { // from class: com.squareup.cash.card.onboarding.TagConfirmationEffectScaffoldKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
                    Composer composer2 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    boxWithConstraintsScopeImpl.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((GapComposer) composer2).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                    }
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    if (gapComposer3.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                        boolean z5 = z2;
                        State state4 = state3;
                        Vector3 vector3 = z5 ? new Vector3(((WandPoseController.Output) state4.getValue()).positionOffset.x, ((Number) animatable5.getValue()).floatValue() + ((WandPoseController.Output) state4.getValue()).positionOffset.y, ((WandPoseController.Output) state4.getValue()).positionOffset.z) : ((WandPoseController.Output) state4.getValue()).positionOffset;
                        Quat quat2 = quat;
                        Quat times = z5 ? quat2.times(((WandPoseController.Output) state4.getValue()).rotation).times(new Quat((1.0f - ((Number) animatable4.getValue()).floatValue()) * 1.0f * 6.2831855f, fArr6)) : quat2.times(((WandPoseController.Output) state4.getValue()).rotation);
                        float m258getMaxHeightD9Ej5fM = boxWithConstraintsScopeImpl.m258getMaxHeightD9Ej5fM() * 0.88f;
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        Float f4 = f3;
                        Modifier then = AlphaKt.alpha((f4 == null || m258getMaxHeightD9Ej5fM <= RecyclerView.DECELERATION_RATE || boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM() / m258getMaxHeightD9Ej5fM <= f4.floatValue()) ? SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxSize(companion, 1.0f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, boxWithConstraintsScopeImpl.m258getMaxHeightD9Ej5fM() * 0.12f, 7) : OffsetKt.aspectRatio(f4.floatValue(), SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, boxWithConstraintsScopeImpl.m258getMaxHeightD9Ej5fM() * 0.12f, 7), false), ((Number) animatable2.getValue()).floatValue()).then(tagDragGestures);
                        Float valueOf2 = Float.valueOf(f * ((WandPoseController.Output) state4.getValue()).scale);
                        Float valueOf3 = Float.valueOf(((WandPoseController.Output) state4.getValue()).opacity);
                        Object rememberedValue8 = gapComposer3.rememberedValue();
                        if (rememberedValue8 == Composer.Companion.Empty) {
                            rememberedValue8 = new CashCardKt$$ExternalSyntheticLambda0(26, mutableState);
                            gapComposer3.updateRememberedValue(rememberedValue8);
                        }
                        composableLambdaImpl.invoke((Object) then, (Object) valueOf2, (Object) times, (Object) vector3, (Object) valueOf3, rememberedValue8, (Object) gapComposer3, (Serializable) 197120);
                    } else {
                        gapComposer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2), gapComposer, 3120, 4);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            fArr3 = fArr2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.card.onboarding.TagConfirmationEffectScaffoldKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    CanvasKt.TagConfirmationEffectScaffold(Modifier.this, z, f, quat, function3, function5, composableLambdaImpl, f2, fArr3, f3, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void TagOrderConfirmationEffect(int i, Composer composer, Modifier modifier, TagFormFactor tagFormFactor, boolean z) {
        tagFormFactor.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-951454935);
        int i2 = (gapComposer.changed(tagFormFactor.ordinal()) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            int ordinal = tagFormFactor.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                if (ordinal != 5) {
                                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 479846126, false);
                                }
                            }
                        }
                    }
                    gapComposer.startReplaceGroup(479860320);
                    MiniCardConfirmationEffect(modifier, z, tagFormFactor == TagFormFactor.MINI_CARD_FIRST_EDITION ? MiniCardEdition.FIRST_EDITION : MiniCardEdition.STANDARD, gapComposer, (i2 >> 3) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                    gapComposer.end(false);
                }
                gapComposer.startReplaceGroup(479855130);
                HeartConfirmationEffect(modifier, z, tagFormFactor == TagFormFactor.HEART_FIRST_EDITION ? HeartEdition.FIRST_EDITION : HeartEdition.STANDARD, gapComposer, (i2 >> 3) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                gapComposer.end(false);
            }
            gapComposer.startReplaceGroup(479848590);
            WandConfirmationEffect(modifier, z, toWandEdition(tagFormFactor), gapComposer, (i2 >> 3) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda26(tagFormFactor, modifier, z, i, 13);
        }
    }

    public static final void TagOrderConfirmationView(TagOrderConfirmationViewModel tagOrderConfirmationViewModel, Function1 function1, Composer composer, int i) {
        tagOrderConfirmationViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-374419809);
        int i2 = (gapComposer.changedInstance(tagOrderConfirmationViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(ColorsDarkKt.colorsDark, null, null, Expect_jvmKt.rememberComposableLambda(-2111499724, new CardOnboardingUiFactory$$ExternalSyntheticLambda3(function1, tagOrderConfirmationViewModel), gapComposer), gapComposer, 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardOnboardingUiFactory$$ExternalSyntheticLambda3(tagOrderConfirmationViewModel, function1, i);
        }
    }

    public static final void WandConfirmationEffect(Modifier modifier, boolean z, WandEdition wandEdition, Composer composer, int i) {
        int i2;
        boolean z2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(545640676);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= gapComposer.changed(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(wandEdition.ordinal()) ? 256 : 128;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Quat quat = WandScene.DEFAULT_ROTATION;
            CardStudioViewV2Kt$$ExternalSyntheticLambda47 cardStudioViewV2Kt$$ExternalSyntheticLambda47 = new CardStudioViewV2Kt$$ExternalSyntheticLambda47(24);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new RealAppConfigManager$$ExternalSyntheticLambda2(6);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            boolean z3 = z2;
            TagConfirmationEffectScaffold(modifier, z3, 0.12750001f, quat, cardStudioViewV2Kt$$ExternalSyntheticLambda47, (Function5) rememberedValue, Expect_jvmKt.rememberComposableLambda(-973904528, new WandConfirmationEffectKt$$ExternalSyntheticLambda2(wandEdition, i3), gapComposer), 1.3f, ENTRANCE_SPIN_AXIS$1, Float.valueOf(0.7f), gapComposer, (i2 & 112) | (i2 & 14) | 819659136 | 4096, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardLockViewKt$$ExternalSyntheticLambda2(modifier, z, wandEdition, i, 7);
        }
    }

    public static final void clipCard(Bitmap bitmap, float f, float f2) {
        bitmap.getClass();
        Canvas canvas = new Canvas(bitmap);
        int save = canvas.save();
        try {
            RectF rectF = new RectF(f, f, canvas.getWidth() - f, canvas.getHeight() - f);
            Path path = new Path();
            path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
            canvas.clipOutPath(path);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final Modifier clipCashtag(Modifier modifier, CashtagDrawable cashtagDrawable) {
        Modifier drawWithContent;
        modifier.getClass();
        return (cashtagDrawable == null || (drawWithContent = ClipKt.drawWithContent(modifier, new RewardSlotQueries$$ExternalSyntheticLambda0(cashtagDrawable, 29))) == null) ? modifier : drawWithContent;
    }

    public static final int headerSize(LazyListState lazyListState) {
        Object obj;
        lazyListState.getClass();
        Iterator it = lazyListState.getLayoutInfo().visibleItemsInfo.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((LazyListMeasuredItem) obj).key.equals("tabs")) {
                break;
            }
        }
        LazyListMeasuredItem lazyListMeasuredItem = (LazyListMeasuredItem) obj;
        if (lazyListMeasuredItem != null) {
            return lazyListMeasuredItem.size;
        }
        return 0;
    }

    public static final FailureMessageBlockerScreen toFailureScreen(ApiResult.Failure failure, BlockersData blockersData, AndroidStringManager androidStringManager) {
        blockersData.getClass();
        return new FailureMessageBlockerScreen(blockersData, TextUtilsCompat.errorMessaging(androidStringManager, failure, null).message, null, 4);
    }

    public static final WandEdition toWandEdition(TagFormFactor tagFormFactor) {
        tagFormFactor.getClass();
        return tagFormFactor == TagFormFactor.WAND_FIRST_EDITION ? WandEdition.FIRST_EDITION : WandEdition.STANDARD;
    }

    public static final void MoodHeatEffect(Modifier modifier, Integer num, Function1 function1, long j, long j2, Composer composer, int i) {
        long j3;
        long j4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(32014757);
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changed(R.drawable.mood_skin) ? 32 : 16) | (gapComposer.changed(num) ? 256 : 128) | 221184;
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
            Object rememberedValue = gapComposer.rememberedValue();
            long j5 = 33;
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new HeatRenderer(context, num, 33L, 50L, function1);
                j5 = 33;
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MoodHeatEffect(modifier, (HeatRenderer) rememberedValue, gapComposer, i2 & 14);
            j4 = 50;
            j3 = j5;
        } else {
            gapComposer.skipToGroupEnd();
            j3 = j;
            j4 = j2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetScope$$ExternalSyntheticLambda8(modifier, num, function1, j3, j4, i);
        }
    }
}
