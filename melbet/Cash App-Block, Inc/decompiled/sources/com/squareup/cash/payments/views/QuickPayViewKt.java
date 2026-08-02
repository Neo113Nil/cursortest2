package com.squareup.cash.payments.views;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.view.View;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.internal.Lock;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.ArcSplineKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.CanvasKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.SliderKt$$ExternalSyntheticLambda5;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.CanvasCompatO;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.DialogEventHandlerKt;
import app.cash.broadway.ui.compose.SecureScreenKt;
import app.cash.local.views.internal.LocalBottomModalKt$$ExternalSyntheticLambda1;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda0;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda26;
import app.cash.molecule.PlatformKt;
import app.cash.versioned.Versioned;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import coil3.size.DimensionKt;
import com.google.common.hash.AbstractHashFunction;
import com.google.common.io.Files;
import com.google.common.primitives.UnsignedBytes;
import com.plaid.internal.EnumC0170g;
import com.squareup.cardcustomizations.signature.SignaturesKt$Signature$1$1;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.blockers.views.SetNameViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.graphics.backend.engine.LightStateImpl;
import com.squareup.cash.graphics.backend.math.Vector4;
import com.squareup.cash.graphics.views.effect.LightSource;
import com.squareup.cash.instruments.views.InstrumentCellKt$$ExternalSyntheticLambda9;
import com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda8;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda24;
import com.squareup.cash.nearby.views.DotGridKt$DotGrid$3$1;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda1;
import com.squareup.cash.offers.views.home.OffersHeroTileKt$$ExternalSyntheticLambda3;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda2;
import com.squareup.cash.paychecks.views.PaycheckCircles$$ExternalSyntheticLambda3;
import com.squareup.cash.paychecks.views.PaycheckCircles$$ExternalSyntheticLambda4;
import com.squareup.cash.paychecks.views.PaycheckCirclesKt$$ExternalSyntheticLambda3;
import com.squareup.cash.payments.common.PaymentScheduleFrequency;
import com.squareup.cash.payments.viewmodels.ConfirmDuplicateDialogViewModel;
import com.squareup.cash.payments.viewmodels.ConfirmRecipientDialogViewModel;
import com.squareup.cash.payments.viewmodels.DuplicatePaymentViewModel;
import com.squareup.cash.payments.viewmodels.NoteRequiredViewModel;
import com.squareup.cash.payments.viewmodels.PaymentClaimViewModel;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationTitleViewModel;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel;
import com.squareup.cash.payments.viewmodels.QuickPayDetailsViewModel;
import com.squareup.cash.payments.viewmodels.QuickPayViewModel;
import com.squareup.cash.payments.viewmodels.RecipientSelectionWarningViewModel;
import com.squareup.cash.payments.viewmodels.ScheduleCalendarDate;
import com.squareup.cash.payments.viewmodels.SchedulePaymentViewModel;
import com.squareup.cash.payments.viewmodels.SelectedTrack;
import com.squareup.cash.payments.views.composer.ErrorKt;
import com.squareup.cash.payments.views.personalization.AlphaKt;
import com.squareup.cash.pdf.view.ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.pdf.view.PdfPreviewView$$ExternalSyntheticLambda1;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.views.PoolToastKt$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda1;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda4;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda8;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import com.squareup.cash.sheet.BasicShieetKt$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda0;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda16;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda17;
import com.squareup.cash.tax.views.TaxAuthorizationView$Content$1$1;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.wallet.views.CardLockViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.work.views.ClockedInStatusDotKt$$ExternalSyntheticLambda3;
import com.squareup.cash.work.views.shift.ShiftNoteViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.work.views.you.WorkYouViewKt$$ExternalSyntheticLambda2;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.SlidingWindowKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class QuickPayViewKt {
    public static final ComposableLambdaImpl lambda$1323147378 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda3(14), false, 1323147378);

    /* renamed from: lambda$-1683823081, reason: not valid java name */
    public static final ComposableLambdaImpl f549lambda$1683823081 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda3(15), false, -1683823081);
    public static final ComposableLambdaImpl lambda$867641571 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda3(16), false, 867641571);
    public static final ComposableLambdaImpl lambda$204828496 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda3(17), false, 204828496);
    public static final ComposableLambdaImpl lambda$894802772 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda4(10), false, 894802772);
    public static final ComposableLambdaImpl lambda$1973210914 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda3(18), false, 1973210914);
    public static final ComposableLambdaImpl lambda$1031629593 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda3(19), false, 1031629593);
    public static final ComposableLambdaImpl lambda$1801957212 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda3(20), false, 1801957212);
    public static final ComposableLambdaImpl lambda$1123264211 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda3(21), false, 1123264211);
    public static final ComposableLambdaImpl lambda$399508078 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda4(11), false, 399508078);
    public static final ComposableLambdaImpl lambda$69267869 = new ComposableLambdaImpl(new OffersHeroTileKt$$ExternalSyntheticLambda3(20), false, 69267869);
    public static final ComposableLambdaImpl lambda$1977644486 = new ComposableLambdaImpl(new OffersHeroTileKt$$ExternalSyntheticLambda3(25), false, 1977644486);
    public static final ComposableLambdaImpl lambda$1706255337 = new ComposableLambdaImpl(new OffersHeroTileKt$$ExternalSyntheticLambda3(26), false, 1706255337);
    public static final ComposableLambdaImpl lambda$1210963529 = new ComposableLambdaImpl(new OffersHeroTileKt$$ExternalSyntheticLambda3(27), false, 1210963529);

    /* renamed from: lambda$-182580568, reason: not valid java name */
    public static final ComposableLambdaImpl f552lambda$182580568 = new ComposableLambdaImpl(new OffersHeroTileKt$$ExternalSyntheticLambda3(28), false, -182580568);
    public static final ComposableLambdaImpl lambda$644732905 = new ComposableLambdaImpl(new OffersHeroTileKt$$ExternalSyntheticLambda3(29), false, 644732905);

    /* renamed from: lambda$-1805435511, reason: not valid java name */
    public static final ComposableLambdaImpl f551lambda$1805435511 = new ComposableLambdaImpl(new ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1(1), false, -1805435511);

    /* renamed from: lambda$-1783637337, reason: not valid java name */
    public static final ComposableLambdaImpl f550lambda$1783637337 = new ComposableLambdaImpl(new ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1(2), false, -1783637337);

    /* renamed from: lambda$-1352818417, reason: not valid java name */
    public static final ComposableLambdaImpl f547lambda$1352818417 = new ComposableLambdaImpl(new OffersHeroTileKt$$ExternalSyntheticLambda3(21), false, -1352818417);
    public static final ComposableLambdaImpl lambda$133900828 = new ComposableLambdaImpl(new OffersHeroTileKt$$ExternalSyntheticLambda3(22), false, 133900828);
    public static final ComposableLambdaImpl lambda$1371106114 = new ComposableLambdaImpl(new OffersHeroTileKt$$ExternalSyntheticLambda3(23), false, 1371106114);
    public static final ComposableLambdaImpl lambda$661580375 = new ComposableLambdaImpl(new OffersHeroTileKt$$ExternalSyntheticLambda3(24), false, 661580375);
    public static final ComposableLambdaImpl lambda$1982681678 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda4(12), false, 1982681678);

    /* renamed from: lambda$-1625806479, reason: not valid java name */
    public static final ComposableLambdaImpl f548lambda$1625806479 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda3(22), false, -1625806479);

    /* renamed from: lambda$-1137985784, reason: not valid java name */
    public static final ComposableLambdaImpl f546lambda$1137985784 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda3(23), false, -1137985784);
    public static final ComposableLambdaImpl lambda$854534700 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda3(24), false, 854534700);

    public static final void ClaimPayment(Function1 function1, Modifier modifier, PaymentClaimViewModel paymentClaimViewModel, Composer composer, int i) {
        int i2;
        PaymentClaimViewModel paymentClaimViewModel2;
        function1.getClass();
        paymentClaimViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1607746684);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(paymentClaimViewModel) ? 256 : 128;
        }
        int i4 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            SecureScreenKt.SecureScreen(true, gapComposer, 6);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(SpacerKt.systemBarsPadding(companion), 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            paymentClaimViewModel2 = paymentClaimViewModel;
            CrossfadeKt.Crossfade(paymentClaimViewModel2, ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape), (FiniteAnimationSpec) null, (String) null, Expect_jvmKt.rememberComposableLambda(-1053886793, new PdfPreviewViewKt$$ExternalSyntheticLambda4(i4, function1), gapComposer), gapComposer, ((i3 >> 6) & 14) | 24576, 12);
            modifier = companion;
        } else {
            paymentClaimViewModel2 = paymentClaimViewModel;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NoteRequiredViewKt$$ExternalSyntheticLambda1(function1, modifier, paymentClaimViewModel2, i);
        }
    }

    public static final void ConfirmDuplicate(ConfirmDuplicateDialogViewModel confirmDuplicateDialogViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        confirmDuplicateDialogViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(912135980);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(confirmDuplicateDialogViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            if (delegatingSoftwareKeyboardController != null) {
                delegatingSoftwareKeyboardController.hide();
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-824943935, new PaycheckCirclesKt$$ExternalSyntheticLambda3(confirmDuplicateDialogViewModel, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NoteRequiredViewKt$$ExternalSyntheticLambda1(confirmDuplicateDialogViewModel, function1, modifier2, i, 16);
        }
    }

    public static final void ConfirmRecipient(ConfirmRecipientDialogViewModel confirmRecipientDialogViewModel, Function1 function1, RealImageLoader realImageLoader, Modifier modifier, Composer composer, int i) {
        int i2;
        confirmRecipientDialogViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-688502112);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(confirmRecipientDialogViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        int i4 = 0;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            if (delegatingSoftwareKeyboardController != null) {
                delegatingSoftwareKeyboardController.hide();
            }
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-1662312992, new ConfirmRecipientDialogKt$$ExternalSyntheticLambda0(function1, confirmRecipientDialogViewModel, i4), gapComposer), gapComposer, 56);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda4(confirmRecipientDialogViewModel, function1, realImageLoader, modifier2, i, 1);
        }
    }

    public static final void ContactSync(int i, Composer composer, Modifier modifier, Function1 function1) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-500403939);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            if (delegatingSoftwareKeyboardController != null) {
                delegatingSoftwareKeyboardController.hide();
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-785002766, new ScoreHomeKt$$ExternalSyntheticLambda8(3, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CanvasKt$$ExternalSyntheticLambda0(function1, modifier, i, 5);
        }
    }

    public static final void DissolveWipeContent(Triple triple, Modifier modifier, int i, float f, DissolveTransitionStyle dissolveTransitionStyle, boolean z, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i2) {
        Modifier modifier2;
        int i3;
        float f2;
        MutableState mutableState;
        MutableState mutableState2;
        final Animatable animatable;
        MutableState mutableState3;
        Applier applier;
        NeverEqualPolicy neverEqualPolicy;
        MutableState mutableState4;
        Throwable th;
        Modifier drawWithContent;
        BiasAlignment biasAlignment = Alignment.Companion.TopStart;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1026234260);
        Applier applier2 = gapComposer.applier;
        int i4 = i2 | (gapComposer.changed(triple) ? 4 : 2) | 3504 | (gapComposer.changed(dissolveTransitionStyle.ordinal()) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(z) ? PKIFailureInfo.unsupportedVersion : 65536);
        if (gapComposer.shouldExecute(i4 & 1, (599187 & i4) != 599186)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy2) {
                rememberedValue = Updater.mutableStateOf$default(triple);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState5 = (MutableState) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy2) {
                rememberedValue2 = Updater.mutableStateOf$default(triple);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState6 = (MutableState) rememberedValue2;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy2) {
                rememberedValue3 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Animatable animatable2 = (Animatable) rememberedValue3;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (rememberedValue4 == neverEqualPolicy2) {
                rememberedValue4 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            MutableState mutableState7 = (MutableState) rememberedValue4;
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (rememberedValue5 == neverEqualPolicy2) {
                rememberedValue5 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            MutableState mutableState8 = (MutableState) rememberedValue5;
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (rememberedValue6 == neverEqualPolicy2) {
                rememberedValue6 = Updater.mutableStateOf$default(DissolveTransitionStyle.WIPE);
                gapComposer.updateRememberedValue(rememberedValue6);
            }
            MutableState mutableState9 = (MutableState) rememberedValue6;
            boolean changedInstance = ((i4 & 14) == 4) | ((i4 & 57344) == 16384) | ((i4 & 458752) == 131072) | gapComposer.changedInstance(animatable2);
            Object rememberedValue7 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue7 == neverEqualPolicy2) {
                mutableState = mutableState9;
                mutableState2 = mutableState5;
                animatable = animatable2;
                mutableState3 = mutableState7;
                applier = applier2;
                neverEqualPolicy = neverEqualPolicy2;
                mutableState4 = mutableState6;
                DissolveWipeContentKt$DissolveWipeContent$1$1 dissolveWipeContentKt$DissolveWipeContent$1$1 = new DissolveWipeContentKt$DissolveWipeContent$1$1(triple, dissolveTransitionStyle, z, animatable, mutableState2, mutableState, mutableState8, mutableState4, mutableState3, null);
                gapComposer.updateRememberedValue(dissolveWipeContentKt$DissolveWipeContent$1$1);
                rememberedValue7 = dissolveWipeContentKt$DissolveWipeContent$1$1;
            } else {
                mutableState = mutableState9;
                applier = applier2;
                mutableState2 = mutableState5;
                neverEqualPolicy = neverEqualPolicy2;
                animatable = animatable2;
                mutableState3 = mutableState7;
                mutableState4 = mutableState6;
            }
            Updater.LaunchedEffect(gapComposer, triple, (Function2) rememberedValue7);
            Object rememberedValue8 = gapComposer.rememberedValue();
            if (rememberedValue8 == neverEqualPolicy) {
                rememberedValue8 = Updater.derivedStateOf(new CardLockViewKt$$ExternalSyntheticLambda1(animatable, 2));
                gapComposer.updateRememberedValue(rememberedValue8);
            }
            State state = (State) rememberedValue8;
            boolean booleanValue = ((Boolean) mutableState3.getValue()).booleanValue();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            final float f3 = 70.0f;
            if (booleanValue) {
                gapComposer.startReplaceGroup(-963989376);
                Modifier clipToBounds = ClipKt.clipToBounds(companion);
                final boolean booleanValue2 = ((Boolean) state.getValue()).booleanValue();
                int ordinal = ((DissolveTransitionStyle) mutableState.getValue()).ordinal();
                if (ordinal != 0) {
                    th = null;
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    drawWithContent = ColorKt.graphicsLayer(companion, new SliderKt$$ExternalSyntheticLambda5(booleanValue2, animatable, 7));
                } else {
                    th = null;
                    final boolean booleanValue3 = ((Boolean) mutableState8.getValue()).booleanValue();
                    drawWithContent = ClipKt.drawWithContent(ColorKt.graphicsLayer(companion, new MainPaymentViewKt$$ExternalSyntheticLambda25(9)), new Function1() { // from class: com.squareup.cash.payments.views.DissolveWipeContentKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            LayoutNodeDrawScope layoutNodeDrawScope = (LayoutNodeDrawScope) obj;
                            layoutNodeDrawScope.getClass();
                            layoutNodeDrawScope.drawContent();
                            CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.canvasDrawScope;
                            boolean z2 = booleanValue2;
                            Animatable animatable3 = animatable;
                            float f4 = RecyclerView.DECELERATION_RATE;
                            float coerceIn = z2 ? RangesKt___RangesKt.coerceIn(((Number) animatable3.getValue()).floatValue() * 2.0f, RecyclerView.DECELERATION_RATE, 1.0f) : RangesKt___RangesKt.coerceIn((((Number) animatable3.getValue()).floatValue() - 0.5f) * 2.0f, RecyclerView.DECELERATION_RATE, 1.0f);
                            float mo236toPx0680j_4 = layoutNodeDrawScope.mo236toPx0680j_4(f3);
                            boolean z3 = booleanValue3;
                            float intBitsToFloat = z3 ? Float.intBitsToFloat((int) (canvasDrawScope.mo753getSizeNHjbRc() >> 32)) * (1.0f - coerceIn) : coerceIn * Float.intBitsToFloat((int) (canvasDrawScope.mo753getSizeNHjbRc() >> 32));
                            List listOf = z3 ^ z2 ? CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{new Color(Color.Transparent), new Color(Color.Black)}) : CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{new Color(Color.Black), new Color(Color.Transparent)});
                            float f5 = intBitsToFloat - mo236toPx0680j_4;
                            if (f5 >= RecyclerView.DECELERATION_RATE) {
                                f4 = f5;
                            }
                            float f6 = intBitsToFloat + mo236toPx0680j_4;
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (canvasDrawScope.mo753getSizeNHjbRc() >> 32));
                            if (f6 > intBitsToFloat2) {
                                f6 = intBitsToFloat2;
                            }
                            DrawScope.m746drawRectAsUm42w$default(layoutNodeDrawScope, Lock.m131horizontalGradient8A3gB4$default(listOf, f4, f6, 8), 0L, 0L, RecyclerView.DECELERATION_RATE, null, null, 6, 62);
                            return Unit.INSTANCE;
                        }
                    });
                }
                Modifier then = clipToBounds.then(drawWithContent);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, then);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                if (applier == null) {
                    Updater.invalidApplier();
                    throw th;
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
                composableLambdaImpl.invoke(((Boolean) state.getValue()).booleanValue() ? mutableState2.getValue() : mutableState4.getValue(), (Object) gapComposer, (Object) 48);
                gapComposer.end(true);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-963745096);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
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
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                composableLambdaImpl.invoke(mutableState2.getValue(), (Object) gapComposer, (Object) 48);
                gapComposer.end(true);
                gapComposer.end(false);
            }
            i3 = 1400;
            modifier2 = companion;
            f2 = 70.0f;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            i3 = i;
            f2 = f;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DissolveWipeContentKt$$ExternalSyntheticLambda1(triple, modifier2, i3, f2, dissolveTransitionStyle, z, composableLambdaImpl, i2);
        }
    }

    public static final void DuplicatePayment(int i, Composer composer, Modifier modifier, String str, String str2, Function0 function0, Function0 function02) {
        int i2;
        String str3;
        GapComposer gapComposer;
        Modifier modifier2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1054938507);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function02) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            str3 = str2;
            i2 |= gapComposer2.changed(str3) ? 2048 : 1024;
        } else {
            str3 = str2;
        }
        int i3 = i2 | 24576;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, systemBarsPadding);
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
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            NavigationType navigationType = NavigationType.CLOSE;
            boolean z = (i3 & 14) == 4;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ToViewKt$$ExternalSyntheticLambda2(9, function0);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer2, 54, 108);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer2, null);
            Countries.PageHeader(str, (Modifier) null, lambda$894802772, str3, gapComposer2, ((i3 >> 6) & 14) | MLKEMEngine.KyberPolyBytes | (i3 & 7168), 2);
            SpacerKt.Spacer(gapComposer2, new LayoutWeightElement(1.0f, true));
            DimensionKt.ButtonCtaGroup(null, false, ButtonCtaGroupOrientation.AUTOMATIC, null, Expect_jvmKt.rememberComposableLambda(-1450371587, new ShiftNoteViewKt$$ExternalSyntheticLambda9(function0, function02, 7), gapComposer2), gapComposer2, 24960, 11);
            gapComposer = gapComposer2;
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DuplicatePaymentViewKt$$ExternalSyntheticLambda6(i, modifier2, str, str2, function0, function02);
        }
    }

    public static final void DuplicatePaymentView(Function1 function1, DuplicatePaymentViewModel duplicatePaymentViewModel, Composer composer, int i) {
        int i2;
        function1.getClass();
        duplicatePaymentViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1576083497);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(duplicatePaymentViewModel) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1705602594, new PaycheckCirclesKt$$ExternalSyntheticLambda3(22, function1, duplicatePaymentViewModel), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OverlayKt$$ExternalSyntheticLambda2(function1, duplicatePaymentViewModel, i, 23);
        }
    }

    public static final void FrequencyButton(int i, Composer composer, Modifier modifier, String str, Function0 function0, boolean z) {
        Color m;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1641173461);
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changed(str) ? 256 : 128) | (gapComposer.changed(z) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f);
            if (z) {
                gapComposer.startReplaceGroup(-1708902648);
                gapComposer.end(false);
                m = null;
            } else {
                gapComposer.startReplaceGroup(914707005);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                m = Recorder$$ExternalSyntheticOutline1.m(gapComposer, false, colors.semantic.background.standard);
            }
            Modifier clip = ClipKt.clip(modifier, m340RoundedCornerShape0680j_4);
            if (m != null) {
                clip = clip.then(ImageKt.m178borderxT4_qwU(Modifier.Companion.$$INSTANCE, 1.0f, m.value, m340RoundedCornerShape0680j_4));
            }
            boolean z2 = (i2 & 7168) == 2048;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z2 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda24(z, 14);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(clip, true, (Function1) rememberedValue);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(ImageKt.m182clickableO2vRcR0$default(semantics, (MutableInteractionSourceImpl) rememberedValue2, RippleKt.m3400rippleYJYuY3k(Color.m675copywmQWz5c$default(0.2f, Strings.getColors(gapComposer).semantic.background.prominent, 14), true, RecyclerView.DECELERATION_RATE, null, gapComposer, 48, 12), false, null, null, function0, 28), RecyclerView.DECELERATION_RATE, 12.0f, 1);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Room.m1165Text25TpFw(0, 0, 0, 3, (i2 >> 6) & 14, 0, 3826, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SchedulePaymentViewKt$$ExternalSyntheticLambda23(modifier, function0, str, z, i);
        }
    }

    public static final void FrequencyButtons(Modifier modifier, Function1 function1, ImmutableList immutableList, PaymentScheduleFrequency paymentScheduleFrequency, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1299339099);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(immutableList) ? 256 : 128) | (gapComposer.changed(paymentScheduleFrequency.ordinal()) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Iterator it = immutableList.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                } else if (((SchedulePaymentViewModel.FrequencyOption) it.next()).frequency == paymentScheduleFrequency) {
                    break;
                } else {
                    i3++;
                }
            }
            int i4 = i3 >= 0 ? i3 : 0;
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            OffsetKt.BoxWithConstraints(SizeKt.fillMaxWidth(modifier, 1.0f), null, false, Expect_jvmKt.rememberComposableLambda(-704885873, new LocalBottomModalKt$$ExternalSyntheticLambda1(i4, 2, immutableList, function1), gapComposer), gapComposer, 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolGoalMetKt$$ExternalSyntheticLambda0(modifier, function1, immutableList, paymentScheduleFrequency, i, 8);
        }
    }

    /* renamed from: GlitterBackground-FNF3uiM, reason: not valid java name */
    public static final void m3703GlitterBackgroundFNF3uiM(int i, long j, Composer composer, Modifier modifier, String str) {
        int i2;
        MutableState mutableState;
        boolean z;
        Float valueOf = Float.valueOf(RecyclerView.DECELERATION_RATE);
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1757939390);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(j) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
            RealImageLoader realImageLoader = (RealImageLoader) gapComposer.consume(LocalImageLoaderKt.LocalImageLoader);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(null);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState2 = (MutableState) rememberedValue;
            MutableState produceLightSource = SlidingWindowKt.produceLightSource(gapComposer);
            Configuration configuration = (Configuration) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalConfiguration);
            float f = configuration.screenWidthDp / configuration.screenHeightDp;
            boolean changedInstance = ((i2 & 112) == 32) | gapComposer.changedInstance(realImageLoader) | gapComposer.changedInstance(context) | gapComposer.changed(f);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                mutableState = mutableState2;
                GlitterBackgroundKt$GlitterBackground$1$1 glitterBackgroundKt$GlitterBackground$1$1 = new GlitterBackgroundKt$GlitterBackground$1$1(realImageLoader, context, str, f, mutableState, null);
                gapComposer.updateRememberedValue(glitterBackgroundKt$GlitterBackground$1$1);
                rememberedValue2 = glitterBackgroundKt$GlitterBackground$1$1;
            } else {
                mutableState = mutableState2;
            }
            Updater.LaunchedEffect(gapComposer, str, (Function2) rememberedValue2);
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(modifier, 1.0f), j, ColorKt.RectangleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Bitmap bitmap = (Bitmap) mutableState.getValue();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (bitmap != null) {
                gapComposer.startReplaceGroup(-1765240494);
                Bitmap bitmap2 = (Bitmap) mutableState.getValue();
                bitmap2.getClass();
                z = true;
                UnsignedBytes.GlitterEffect(companion, bitmap2, Updater.rememberUpdatedState(Float.valueOf(0.01f), gapComposer), Updater.rememberUpdatedState(Float.valueOf(0.13f), gapComposer), Updater.rememberUpdatedState(Float.valueOf(0.3f), gapComposer), Updater.rememberUpdatedState(valueOf, gapComposer), Updater.rememberUpdatedState(Float.valueOf(2.8f), gapComposer), Updater.rememberUpdatedState(valueOf, gapComposer), Updater.rememberUpdatedState(CollectionsKt__CollectionsKt.listOf((Object[]) new LightStateImpl[]{rememberGlitterLightState(((LightSource) produceLightSource.getValue()).x, ((LightSource) produceLightSource.getValue()).y, 0.4f, gapComposer), rememberGlitterLightState((((LightSource) produceLightSource.getValue()).x / 4.0f) + 0.3f, (((LightSource) produceLightSource.getValue()).y / 4.0f) + 0.5f, 0.2f, gapComposer), rememberGlitterLightState((((LightSource) produceLightSource.getValue()).x / 4.0f) + 0.3f, (((LightSource) produceLightSource.getValue()).y / 4.0f) - 0.5f, 0.2f, gapComposer), rememberGlitterLightState((((LightSource) produceLightSource.getValue()).x / 4.0f) - 0.3f, (((LightSource) produceLightSource.getValue()).y / 4.0f) + 0.5f, 0.2f, gapComposer), rememberGlitterLightState((((LightSource) produceLightSource.getValue()).x / 4.0f) - 0.3f, (((LightSource) produceLightSource.getValue()).y / 4.0f) - 0.5f, 0.2f, gapComposer)}), gapComposer), gapComposer, 6);
                gapComposer.end(false);
            } else {
                z = true;
                gapComposer.startReplaceGroup(-1764023651);
                AlphaKt.PersonalizedBackgroundLoadingIndicator(SizeKt.m285size3ABfNKs(BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.Center), 32.0f), gapComposer, 0);
                gapComposer.end(false);
            }
            gapComposer.end(z);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ClockedInStatusDotKt$$ExternalSyntheticLambda3(modifier, str, j, i);
        }
    }

    public static final void NoteInputView(Modifier modifier, String str, String str2, int i, boolean z, Function1 function1, Versioned versioned, Composer composer, int i2, int i3) {
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        str.getClass();
        str2.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-774445435);
        int i6 = i2 | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changed(str2) ? 256 : 128);
        int i7 = i6 | 3072;
        int i8 = i3 & 16;
        if (i8 != 0) {
            i4 = i6 | 27648;
            z2 = z;
        } else {
            z2 = z;
            i4 = i7 | (gapComposer.changed(z2) ? 16384 : PKIFailureInfo.certRevoked);
        }
        int i9 = i4 | (gapComposer.changedInstance(function1) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changed(versioned) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        if (gapComposer.shouldExecute(i9 & 1, (599187 & i9) != 599186)) {
            boolean z4 = i8 != 0 ? true : z2;
            FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) gapComposer.consume(CompositionLocalsKt.LocalFocusManager);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m106m(gapComposer);
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(245403418, new SheetKt$$ExternalSyntheticLambda0(modifier, versioned, z4, (FocusRequester) rememberedValue, focusOwnerImpl, str, function1, str2), gapComposer), gapComposer, 3072, 7);
            i5 = 50;
            z3 = z4;
        } else {
            gapComposer.skipToGroupEnd();
            i5 = i;
            z3 = z2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new IconButtonKt$$ExternalSyntheticLambda0(modifier, str, str2, i5, z3, function1, versioned, i2, i3);
        }
    }

    public static final void NoteRequired(NoteRequiredViewModel noteRequiredViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        noteRequiredViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1072623185);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(noteRequiredViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            if (delegatingSoftwareKeyboardController != null) {
                delegatingSoftwareKeyboardController.hide();
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(304680550, new PaycheckCirclesKt$$ExternalSyntheticLambda3(noteRequiredViewModel, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NoteRequiredViewKt$$ExternalSyntheticLambda1(noteRequiredViewModel, function1, modifier2, i, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0148, code lost:
    
        if (r6 == r4) goto L64;
     */
    /* renamed from: PaymentConfigurationContent-6PoWaU8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3704PaymentConfigurationContent6PoWaU8(Modifier modifier, Function1 function1, PaymentConfigurationViewModel paymentConfigurationViewModel, float f, float f2, Composer composer, int i) {
        Object obj;
        function1.getClass();
        paymentConfigurationViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1376289925);
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(paymentConfigurationViewModel) ? 256 : 128) | (gapComposer.changed(f) ? 2048 : 1024) | (gapComposer.changed(f2) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj2 = Composer.Companion.Empty;
            if (rememberedValue == obj2) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m106m(gapComposer);
            }
            FocusRequester focusRequester = (FocusRequester) rememberedValue;
            Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
            View view = (View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView);
            float f3 = paymentConfigurationViewModel instanceof PaymentConfigurationViewModel.SelectRecipientMenu ? f2 : ((paymentConfigurationViewModel instanceof PaymentConfigurationViewModel.InputNote) || (paymentConfigurationViewModel instanceof PaymentConfigurationViewModel.InputAmount)) ? f : RecyclerView.DECELERATION_RATE;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(ImageKt.m177backgroundbw27NRU(modifier, colors.semantic.background.f1047app, ColorKt.RectangleShape), f3, RecyclerView.DECELERATION_RATE, 2);
            boolean z = paymentConfigurationViewModel instanceof PaymentConfigurationViewModel.InputNote;
            Modifier modifier2 = Modifier.Companion.$$INSTANCE;
            if (z) {
                modifier2 = SpacerKt.imePadding(modifier2);
            }
            Modifier then = m279heightInVpY3zN4$default.then(modifier2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, then);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            boolean showClose = paymentConfigurationViewModel.getShowClose();
            int i3 = i2 & 112;
            boolean changed = gapComposer.changed(delegatingSoftwareKeyboardController) | (i3 == 32);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed) {
                obj = obj2;
            } else {
                obj = obj2;
            }
            rememberedValue2 = new SetNameViewKt$$ExternalSyntheticLambda6(delegatingSoftwareKeyboardController, function1, 15);
            gapComposer.updateRememberedValue(rememberedValue2);
            ErrorKt.RotatingTitleIcon(0, gapComposer, null, (Function0) rememberedValue2, showClose);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            PaymentConfigurationTitleViewModel title = paymentConfigurationViewModel.getTitle();
            boolean z2 = i3 == 32;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z2 || rememberedValue3 == obj) {
                rememberedValue3 = new UtilKt$$ExternalSyntheticLambda0(25, function1);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            ErrorKt.PaymentConfigurationTitle(title, (Function1) rememberedValue3, null, gapComposer, 0);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (rememberedValue4 == obj) {
                rememberedValue4 = new MainPaymentViewKt$$ExternalSyntheticLambda25(11);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Function1 function12 = (Function1) rememberedValue4;
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (rememberedValue5 == obj) {
                rememberedValue5 = new MainPaymentViewKt$$ExternalSyntheticLambda25(12);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            AnimatedContentKt.AnimatedContent(paymentConfigurationViewModel, null, function12, null, "PaymentConfigurationContent", (Function1) rememberedValue5, Expect_jvmKt.rememberComposableLambda(-1446088790, new TabToolbarsKt$$ExternalSyntheticLambda16(function1, context, view, focusRequester), gapComposer), gapComposer, ((i2 >> 6) & 14) | 1794432, 10);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PaymentConfigurationViewKt$$ExternalSyntheticLambda3(modifier, function1, paymentConfigurationViewModel, f, f2, i);
        }
    }

    public static final void PaymentConfigurationView(Function1 function1, PaymentConfigurationViewModel paymentConfigurationViewModel, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        function1.getClass();
        paymentConfigurationViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-29454400);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(paymentConfigurationViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-2000530304, new PaycheckCirclesKt$$ExternalSyntheticLambda3(25, function1, paymentConfigurationViewModel), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NoteRequiredViewKt$$ExternalSyntheticLambda1(function1, (Object) paymentConfigurationViewModel, (Object) realImageLoader, i, 18);
        }
    }

    public static final void PaymentLoading(Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(950104419);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new WarningDialogViewKt$$ExternalSyntheticLambda5(15, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            Unit unit = Unit.INSTANCE;
            boolean z2 = i3 == 4;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new TaxAuthorizationView$Content$1$1(function1, (Continuation) null, 9);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
            ArcadeThemeKt.ArcadeTheme(null, null, null, lambda$399508078, gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NfcNotAvailableKt$$ExternalSyntheticLambda1(function1, i, 23, false);
        }
    }

    public static final void QuickPay(QuickPayViewModel.Ready ready, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1012953696);
        int i2 = (gapComposer2.changedInstance(ready) ? 4 : 2) | i | (gapComposer2.changedInstance(function1) ? 32 : 16) | (gapComposer2.changedInstance(realImageLoader) ? 256 : 128);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            RealCashVibrator realCashVibrator = (RealCashVibrator) gapComposer2.consume(LocalCashVibratorKt.LocalCashVibrator);
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer2.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new TouchRecorder(2);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            TouchRecorder touchRecorder = (TouchRecorder) rememberedValue;
            boolean changed = gapComposer2.changed(ready.personalizePaymentButtonState.showTooltip);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Recorder$$ExternalSyntheticOutline1.m(ready.personalizePaymentButtonState.showTooltip, gapComposer2);
            }
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(780324651, new BasicShieetKt$$ExternalSyntheticLambda0(ready, function1, realCashVibrator, touchRecorder, (MutableState) rememberedValue2, delegatingSoftwareKeyboardController, realImageLoader, 12), gapComposer2);
            gapComposer = gapComposer2;
            ArcadeThemeKt.ArcadeTheme(null, null, null, rememberComposableLambda, gapComposer, 3072, 7);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PdfPreviewView$$ExternalSyntheticLambda1((Object) ready, function1, (Object) realImageLoader, i, 5);
        }
    }

    public static final void QuickPayDetailsSheet(Function1 function1, QuickPayDetailsViewModel quickPayDetailsViewModel, Modifier modifier, Composer composer, int i) {
        Modifier wrapContentHeight;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-803279990);
        int i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i | (gapComposer.changedInstance(quickPayDetailsViewModel) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            if (delegatingSoftwareKeyboardController != null) {
                delegatingSoftwareKeyboardController.hide();
            }
            wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(modifier, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(wrapContentHeight, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 6);
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
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(1155970306, new QuickPayDetailsSheetKt$$ExternalSyntheticLambda1(function1, quickPayDetailsViewModel, i3), gapComposer), gapComposer, 24576, 15);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PdfPreviewView$$ExternalSyntheticLambda1(function1, (Object) quickPayDetailsViewModel, (Object) modifier, i, 3);
        }
    }

    public static final void QuickPayDetailsSheetView(QuickPayDetailsViewModel quickPayDetailsViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        quickPayDetailsViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-664505420);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(quickPayDetailsViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new WarningDialogViewKt$$ExternalSyntheticLambda5(16, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SheetKt.Sheet((Function0) rememberedValue, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(1194894859, new QuickPayDetailsSheetKt$$ExternalSyntheticLambda1(function1, quickPayDetailsViewModel, i3), gapComposer), gapComposer, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OverlayKt$$ExternalSyntheticLambda2(quickPayDetailsViewModel, function1, i, 24);
        }
    }

    public static final void QuickPayExitRouterView(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1976794311);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, lambda$1982681678, gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PaycheckCircles$$ExternalSyntheticLambda4(i, 16);
        }
    }

    public static final void QuickPayView(QuickPayViewModel quickPayViewModel, Function1 function1, RealImageLoader realImageLoader, RealCashVibrator realCashVibrator, ElementBoundsRegistry elementBoundsRegistry, Composer composer, int i) {
        int i2;
        quickPayViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1953432183);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(quickPayViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(realCashVibrator) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(elementBoundsRegistry) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            SecureScreenKt.SecureScreen(true, gapComposer, 6);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new UtilKt$$ExternalSyntheticLambda0(26, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue, gapComposer, 0);
            Updater.CompositionLocalProvider(new ProvidedValue[]{LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), MainPaymentViewKt.LocalElementBoundsRegistry.defaultProvidedValue$runtime(elementBoundsRegistry), LocalCashVibratorKt.LocalCashVibrator.defaultProvidedValue$runtime(realCashVibrator)}, Expect_jvmKt.rememberComposableLambda(-604002889, new PdfPreviewView$$ExternalSyntheticLambda1(quickPayViewModel, function1, realImageLoader, i3), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabToolbarsKt$$ExternalSyntheticLambda17((Object) quickPayViewModel, function1, (Object) realImageLoader, (Object) realCashVibrator, (Object) elementBoundsRegistry, i, 7);
        }
    }

    public static final void RecipientList(Modifier modifier, List list, Map map, Function1 function1, Function1 function12, Function1 function13, Function2 function2, boolean z, Composer composer, int i) {
        list.getClass();
        map.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1421381605);
        int i2 = i | 6 | (gapComposer.changedInstance(list) ? 32 : 16) | (gapComposer.changedInstance(map) ? 256 : 128) | (gapComposer.changedInstance(function1) ? 2048 : 1024) | (gapComposer.changedInstance(function12) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changedInstance(function13) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changedInstance(function2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer.changed(z) ? 8388608 : 4194304);
        if (gapComposer.shouldExecute(i2 & 1, (4793491 & i2) != 4793490)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1910945552, new RecipientListViewKt$$ExternalSyntheticLambda0(list, map, function1, function12, function13, z, function2), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SheetKt$$ExternalSyntheticLambda0(modifier2, list, map, function1, function12, function13, function2, z, i);
        }
    }

    public static final void RecipientListInternal(List list, Map map, Function1 function1, Function1 function12, Function1 function13, boolean z, Function2 function2, Composer composer, int i) {
        LazyListState lazyListState;
        Object inviteContactsBodyKt$$ExternalSyntheticLambda8;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1989820610);
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i2 = (gapComposer.changedInstance(function2) ? 8388608 : 4194304) | i | (gapComposer.changed(companion) ? 4 : 2) | (gapComposer.changedInstance(list) ? 32 : 16) | (gapComposer.changedInstance(map) ? 256 : 128) | (gapComposer.changedInstance(function1) ? 2048 : 1024) | (gapComposer.changedInstance(function12) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changedInstance(function13) ? 131072 : 65536) | (gapComposer.changed(z) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        if (gapComposer.shouldExecute(i2 & 1, (4793491 & i2) != 4793490)) {
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 3, gapComposer);
            boolean changedInstance = ((i2 & 7168) == 2048) | ((57344 & i2) == 16384) | ((i2 & 458752) == 131072) | gapComposer.changedInstance(list) | gapComposer.changed(rememberLazyListState) | gapComposer.changedInstance(map) | ((3670016 & i2) == 1048576) | ((29360128 & i2) == 8388608);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                lazyListState = rememberLazyListState;
                inviteContactsBodyKt$$ExternalSyntheticLambda8 = new InviteContactsBodyKt$$ExternalSyntheticLambda8(list, function2, function13, map, function12, lazyListState, function1, z);
                gapComposer.updateRememberedValue(inviteContactsBodyKt$$ExternalSyntheticLambda8);
            } else {
                lazyListState = rememberLazyListState;
                inviteContactsBodyKt$$ExternalSyntheticLambda8 = rememberedValue;
            }
            LazyDslKt.LazyColumn(companion, lazyListState, null, null, null, null, false, null, (Function1) inviteContactsBodyKt$$ExternalSyntheticLambda8, gapComposer, i2 & 14, 508);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new RecipientListViewKt$$ExternalSyntheticLambda0(list, map, function1, function12, function13, z, function2, i);
        }
    }

    public static final void RecipientSelectionWarning(Function1 function1, RecipientSelectionWarningViewModel recipientSelectionWarningViewModel, Composer composer, int i) {
        int i2;
        function1.getClass();
        recipientSelectionWarningViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1234259539);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(recipientSelectionWarningViewModel) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String str = recipientSelectionWarningViewModel.title;
            if (str == null) {
                str = "";
            }
            ModalKt.Modal((Modifier) null, str, recipientSelectionWarningViewModel.message, Expect_jvmKt.rememberComposableLambda(333228753, new ProfileKt$$ExternalSyntheticLambda1(8, (Object) recipientSelectionWarningViewModel, function1), gapComposer), (Function3) null, (Function3) null, gapComposer, 3072, 49);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OverlayKt$$ExternalSyntheticLambda2(function1, recipientSelectionWarningViewModel, i, 25);
        }
    }

    public static final void RecipientsInputView(Modifier modifier, String str, TextFieldValue textFieldValue, String str2, int i, boolean z, boolean z2, boolean z3, Function0 function0, Function1 function1, Composer composer, int i2) {
        Modifier modifier2;
        str.getClass();
        textFieldValue.getClass();
        str2.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-101750872);
        int i3 = i2 | 6 | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changed(textFieldValue) ? 256 : 128) | (gapComposer.changed(str2) ? 2048 : 1024) | (gapComposer.changed(i) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(z) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changed(z3) ? 8388608 : 4194304) | (gapComposer.changedInstance(function0) ? 67108864 : 33554432) | (gapComposer.changedInstance(function1) ? PKIFailureInfo.duplicateCertReq : 268435456);
        if (gapComposer.shouldExecute(i3 & 1, (306783379 & i3) != 306783378)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m106m(gapComposer);
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1840901133, new RecipientsInputViewKt$$ExternalSyntheticLambda0(str, z2, (FocusRequester) rememberedValue, z3, textFieldValue, function0, function1, i, z, str2), gapComposer), gapComposer, 3072, 7);
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new RecipientsInputViewKt$$ExternalSyntheticLambda0(modifier2, str, textFieldValue, str2, i, z, z2, z3, function0, function1, i2);
        }
    }

    public static final void SchedulePaymentView(Function1 function1, SchedulePaymentViewModel schedulePaymentViewModel, Composer composer, int i) {
        int i2;
        function1.getClass();
        schedulePaymentViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2138487889);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(schedulePaymentViewModel) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1757989350, new SchedulePaymentViewKt$$ExternalSyntheticLambda0(function1, schedulePaymentViewModel), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OverlayKt$$ExternalSyntheticLambda2(function1, schedulePaymentViewModel, i, 26);
        }
    }

    public static final void SectionHeader(int i, Composer composer, Modifier modifier, String str, String str2) {
        Modifier modifier2;
        str.getClass();
        str2.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1952663706);
        int i2 = i | 6 | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changed(str2) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            long j = Strings.getColors(gapComposer).semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1), 16.0f, 12.0f, 16.0f, 6.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m301paddingqDBjuR0);
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
            Room.m1165Text25TpFw(0, 0, 0, 0, (i2 >> 3) & 14, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 0, (i2 >> 6) & 14, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).bodyMedium, Strings.getColors(gapComposer).semantic.text.subtle, 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777214), (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new WorkYouViewKt$$ExternalSyntheticLambda2(modifier2, str, str2, i, 6);
        }
    }

    public static final void SelectedTrackCard(SelectedTrack selectedTrack, Modifier modifier, Composer composer, int i) {
        selectedTrack.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1372455996);
        int i2 = (gapComposer.changedInstance(selectedTrack) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Object obj = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
            Object obj2 = (RealImageLoader) gapComposer.consume(LocalImageLoaderKt.LocalImageLoader);
            Image image = selectedTrack.albumArt;
            boolean changed = gapComposer.changed(image);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj3 = Composer.Companion.Empty;
            if (changed || rememberedValue == obj3) {
                rememberedValue = Updater.mutableStateOf$default(null);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Object urlForTheme = ThemablesKt.urlForTheme(image, gapComposer);
            boolean changedInstance = gapComposer.changedInstance(obj2) | gapComposer.changedInstance(obj) | gapComposer.changed(urlForTheme) | gapComposer.changed(mutableState);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == obj3) {
                Object dotGridKt$DotGrid$3$1 = new DotGridKt$DotGrid$3$1(obj2, obj, urlForTheme, mutableState, (Continuation) null, 24);
                gapComposer.updateRememberedValue(dotGridKt$DotGrid$3$1);
                rememberedValue2 = dotGridKt$DotGrid$3$1;
            }
            Updater.LaunchedEffect(gapComposer, image, (Function2) rememberedValue2);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(489935705, new PdfPreviewView$$ExternalSyntheticLambda1(7, modifier, selectedTrack, mutableState), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PaycheckCirclesKt$$ExternalSyntheticLambda3(selectedTrack, modifier, i, 26);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        if ((r23 & 2) != 0) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SheetTextFieldFocusKeyboardWrapper(Modifier modifier, FocusRequester focusRequester, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        int i3;
        FocusRequester focusRequester2;
        int i4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1825358575);
        int i5 = 4;
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                focusRequester2 = focusRequester;
                if (gapComposer.changed(focusRequester2)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                focusRequester2 = focusRequester;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            focusRequester2 = focusRequester;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(composableLambdaImpl) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
                    focusRequester2 = DBUtil.rememberFocusRequesterAndRequestFocus(gapComposer);
                    i3 &= -113;
                }
                gapComposer.endDefaults();
                Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
                View view = (View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView);
                Object[] objArr = {context, view, focusRequester2};
                boolean changedInstance = ((((i3 & 112) ^ 48) > 32 && gapComposer.changed(focusRequester2)) || (i3 & 48) == 32) | gapComposer.changedInstance(view) | gapComposer.changedInstance(context);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new SignaturesKt$Signature$1$1(i5, focusRequester2, view, context);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                PointerEvent pointerEvent = SuspendingPointerInputFilterKt.EmptyPointerEvent;
                Modifier then = modifier.then(new SuspendPointerInputElement(null, null, objArr, (PointerInputEventHandler) rememberedValue, 3));
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, then);
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
                Recorder$$ExternalSyntheticOutline2.m((i3 >> 6) & 14, composableLambdaImpl, gapComposer, true);
            } else {
                gapComposer.skipToGroupEnd();
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        FocusRequester focusRequester3 = focusRequester2;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InstrumentCellKt$$ExternalSyntheticLambda9(modifier, focusRequester3, composableLambdaImpl, i, i2, 9);
        }
    }

    public static final void Toolbar(QuickPayViewModel.ToolbarWithAvatarViewModel toolbarWithAvatarViewModel, boolean z, Function1 function1, Composer composer, int i) {
        Function1 function12;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-987931771);
        int i2 = i | (gapComposer.changedInstance(toolbarWithAvatarViewModel) ? 4 : 2) | (gapComposer.changed(z) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            NavigationType navigationType = toolbarWithAvatarViewModel.isBackNavigation ? NavigationType.BACK : NavigationType.CLOSE;
            function12 = function1;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1007748609, new LocalHomeViewKt$$ExternalSyntheticLambda0(toolbarWithAvatarViewModel, delegatingSoftwareKeyboardController, function1, z, 25), gapComposer);
            boolean changed = gapComposer.changed(delegatingSoftwareKeyboardController) | ((i2 & 896) == 256);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SetNameViewKt$$ExternalSyntheticLambda6(delegatingSoftwareKeyboardController, function1, 17);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub(rememberComposableLambda, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, Expect_jvmKt.rememberComposableLambda(-553672124, new PoolToastKt$$ExternalSyntheticLambda0(24, toolbarWithAvatarViewModel, delegatingSoftwareKeyboardController, function1), gapComposer), gapComposer, 1572870, 44);
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda26(toolbarWithAvatarViewModel, z, function12, i, 29);
        }
    }

    public static final void WeekDates(Function1 function1, ImmutableList immutableList, ScheduleCalendarDate scheduleCalendarDate, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1704614610);
        int i3 = i | (gapComposer.changedInstance(function1) ? 4 : 2) | (gapComposer.changedInstance(immutableList) ? 32 : 16) | (gapComposer.changedInstance(scheduleCalendarDate) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            boolean changed = gapComposer.changed(scheduleCalendarDate) | gapComposer.changed(immutableList);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                if (scheduleCalendarDate == null || (i2 = immutableList.indexOf(scheduleCalendarDate)) < 0) {
                    i2 = 0;
                }
                rememberedValue = Integer.valueOf(i2 / 7);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            int intValue = ((Number) rememberedValue).intValue();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, ((Dp) gapComposer.consume(ArcadeThemeKt.LocalScreenMargin)).value, RecyclerView.DECELERATION_RATE, 2);
            boolean z = (i3 & 14) == 4;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new UtilKt$$ExternalSyntheticLambda0(27, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Function1 function12 = (Function1) rememberedValue2;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new MainPaymentViewKt$$ExternalSyntheticLambda25(13);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            CanvasCompatO.CalendarRow(m300paddingVpY3zN4$default, immutableList, scheduleCalendarDate, intValue, false, true, null, function12, (Function1) rememberedValue3, gapComposer, (i3 & 112) | 12582912 | (i3 & 896));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PdfPreviewView$$ExternalSyntheticLambda1(function1, (Object) immutableList, (Object) scheduleCalendarDate, i, 6);
        }
    }

    public static final Modifier movingImageBackground(Modifier modifier, AndroidImageBitmap androidImageBitmap, Composer composer) {
        modifier.getClass();
        androidImageBitmap.getClass();
        int i = 2;
        InfiniteTransition.TransitionAnimationState animateFloat = ArcSplineKt.animateFloat(ArcSplineKt.rememberInfiniteTransition("image_overlay_animation", composer, 0), RecyclerView.DECELERATION_RATE, 6.2831855f, AnimatableKt.m154infiniteRepeatable9IiC70o$default(AnimatableKt.tween$default(30000, 0, EasingKt.LinearEasing, 2), RepeatMode.Restart, 4), "rotation_angle", composer, 28728, 0);
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = new MainPaymentViewKt$$ExternalSyntheticLambda25(8);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Modifier graphicsLayer = ColorKt.graphicsLayer(modifier, (Function1) rememberedValue);
        boolean changed = gapComposer.changed(animateFloat) | gapComposer.changedInstance(androidImageBitmap);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changed || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new OpenSourceKt$$ExternalSyntheticLambda11(i, androidImageBitmap, animateFloat);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        return ClipKt.drawWithContent(graphicsLayer, (Function1) rememberedValue2);
    }

    public static final LightStateImpl rememberGlitterLightState(float f, float f2, float f3, Composer composer) {
        Float valueOf = Float.valueOf(1.0f);
        return Files.rememberLightState(AbstractHashFunction.rememberEntityState(null, Updater.rememberUpdatedState(new Vector4(f, f2, f3, RecyclerView.DECELERATION_RATE), composer), null, composer, 5), new Vector4(RecyclerView.DECELERATION_RATE, -1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE), Updater.rememberUpdatedState(Float.valueOf(RecyclerView.DECELERATION_RATE), composer), Updater.rememberUpdatedState(Float.valueOf(7500.0f), composer), Updater.rememberUpdatedState(CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{valueOf, valueOf, valueOf}), composer), composer);
    }
}
