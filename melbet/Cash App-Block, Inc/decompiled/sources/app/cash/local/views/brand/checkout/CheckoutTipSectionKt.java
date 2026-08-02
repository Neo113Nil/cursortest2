package app.cash.local.views.brand.checkout;

import android.icu.text.MessageFormat;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.FilterChain;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.MaxLengthFilter;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.material.IconKt$$ExternalSyntheticLambda0;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda1;
import androidx.compose.material.SliderKt$$ExternalSyntheticLambda2;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda4;
import androidx.compose.material.TextKt$$ExternalSyntheticLambda1;
import androidx.compose.material3.ButtonKt$$ExternalSyntheticLambda2;
import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda5;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda8;
import androidx.compose.material3.InteractiveComponentSizeKt;
import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda3;
import androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Savers_androidKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.paging.HintHandler$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda1;
import app.cash.badging.backend.RealBadger2$$ExternalSyntheticLambda0;
import app.cash.broadway.ui.compose.FullScreenKt$$ExternalSyntheticLambda0;
import app.cash.local.primitives.LocationMenu$$ExternalSyntheticLambda6;
import app.cash.local.primitives.PaymentMethodToken;
import app.cash.local.viewmodels.AppliedGiftCard;
import app.cash.local.viewmodels.ComboSlotViewModel;
import app.cash.local.viewmodels.CouponSection;
import app.cash.local.viewmodels.GiftCardInputState;
import app.cash.local.viewmodels.InputError;
import app.cash.local.viewmodels.KeyValue;
import app.cash.local.viewmodels.LocalCartSummaryLineViewModel;
import app.cash.local.viewmodels.LocalCheckoutGiftCardSectionViewModel;
import app.cash.local.viewmodels.LocalCheckoutOrderSummaryViewModel;
import app.cash.local.viewmodels.LocalCheckoutPaymentMethodViewModel;
import app.cash.local.viewmodels.LocalCheckoutPaymentSectionViewModel;
import app.cash.local.viewmodels.LocalCheckoutSpecialInstructionsViewModel;
import app.cash.local.viewmodels.LocalCheckoutTipSectionViewModel;
import app.cash.local.viewmodels.OrderBuilderModel;
import app.cash.local.viewmodels.TipOption;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda6;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda30;
import app.cash.local.views.internal.DismissableToastKt$$ExternalSyntheticLambda4;
import app.cash.local.views.internal.ExpandableSectionStyle;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda3;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda18;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.treehouse.EventBridge$sendEvent$1;
import bo.app.n$$ExternalSyntheticLambda1;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader$execute$2;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.braze.Braze$$ExternalSyntheticLambda34;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.R;
import com.squareup.cash.account.components.AccountUiViewKt$$ExternalSyntheticLambda14;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.SearchBarKt$$ExternalSyntheticLambda7;
import com.squareup.cash.arcade.components.avatar.AvatarKt$$ExternalSyntheticLambda7;
import com.squareup.cash.arcade.components.cell.CellActivityAvatarScope$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.components.input.InputFieldKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.theme.RippleNodeFactory;
import com.squareup.cash.avatar.components.BadgedAvatarKt$$ExternalSyntheticLambda4;
import com.squareup.cash.blockers.views.SetNameViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.blockers.views.SignatureViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.bugreporting.views.BugReportingViewKt$ProblemSection$1$1;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda12;
import com.squareup.cash.fidesmo.views.ScanningShapePulseKt$$ExternalSyntheticLambda2;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda37;
import com.squareup.cash.offers.views.OffersSearchViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.offers.views.OffersSearchViewKt$OffersSearchView$1$1;
import com.squareup.cash.payments.views.NoteInputViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.payments.views.ToViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.views.PoolListSectionKt$$ExternalSyntheticLambda8;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda13;
import com.squareup.cash.support.views.home.SupportHomeViewKt$$ExternalSyntheticLambda10;
import com.squareup.protos.cash.local.client.v1.LegalConsent;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class CheckoutTipSectionKt {
    public static final ComposableLambdaImpl lambda$1907123998 = new ComposableLambdaImpl(new Savers_androidKt$$ExternalSyntheticLambda0((byte) 0, 16), false, 1907123998);
    public static final ComposableLambdaImpl lambda$1064757717 = new ComposableLambdaImpl(new Savers_androidKt$$ExternalSyntheticLambda0((byte) 0, 17), false, 1064757717);
    public static final ComposableLambdaImpl lambda$1884546764 = new ComposableLambdaImpl(new Savers_androidKt$$ExternalSyntheticLambda0((byte) 0, 18), false, 1884546764);

    /* renamed from: lambda$-911498430, reason: not valid java name */
    public static final ComposableLambdaImpl f30lambda$911498430 = new ComposableLambdaImpl(new FullScreenKt$$ExternalSyntheticLambda0(13), false, -911498430);
    public static final ComposableLambdaImpl lambda$370237090 = new ComposableLambdaImpl(new Savers_androidKt$$ExternalSyntheticLambda0((byte) 0, 19), false, 370237090);
    public static final ComposableLambdaImpl lambda$1066122275 = new ComposableLambdaImpl(new FullScreenKt$$ExternalSyntheticLambda0(14), false, 1066122275);
    public static final ComposableLambdaImpl lambda$2119896669 = new ComposableLambdaImpl(new FullScreenKt$$ExternalSyntheticLambda0(15), false, 2119896669);
    public static final ComposableLambdaImpl lambda$1864711001 = new ComposableLambdaImpl(new FullScreenKt$$ExternalSyntheticLambda0(16), false, 1864711001);
    public static final ComposableLambdaImpl lambda$632950478 = new ComposableLambdaImpl(new FullScreenKt$$ExternalSyntheticLambda0(17), false, 632950478);

    /* renamed from: lambda$-214811909, reason: not valid java name */
    public static final ComposableLambdaImpl f28lambda$214811909 = new ComposableLambdaImpl(new FullScreenKt$$ExternalSyntheticLambda0(18), false, -214811909);

    /* renamed from: lambda$-1199837109, reason: not valid java name */
    public static final ComposableLambdaImpl f26lambda$1199837109 = new ComposableLambdaImpl(new FullScreenKt$$ExternalSyntheticLambda0(19), false, -1199837109);

    /* renamed from: lambda$-1232778084, reason: not valid java name */
    public static final ComposableLambdaImpl f27lambda$1232778084 = new ComposableLambdaImpl(new FullScreenKt$$ExternalSyntheticLambda0(20), false, -1232778084);

    /* renamed from: lambda$-649116546, reason: not valid java name */
    public static final ComposableLambdaImpl f29lambda$649116546 = new ComposableLambdaImpl(new FullScreenKt$$ExternalSyntheticLambda0(21), false, -649116546);
    public static final ComposableLambdaImpl lambda$84723700 = new ComposableLambdaImpl(new FullScreenKt$$ExternalSyntheticLambda0(22), false, 84723700);
    public static final ComposableLambdaImpl lambda$183847628 = new ComposableLambdaImpl(new FullScreenKt$$ExternalSyntheticLambda0(23), false, 183847628);
    public static final ComposableLambdaImpl lambda$285217614 = new ComposableLambdaImpl(new FullScreenKt$$ExternalSyntheticLambda0(24), false, 285217614);

    public static final void AppliedCouponChip(int i, Composer composer, String str, Function0 function0) {
        Function0 function02;
        GapComposer gapComposer;
        int i2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1710748599);
        Applier applier = gapComposer2.applier;
        int i3 = i | (gapComposer2.changed(str) ? 4 : 2) | (gapComposer2.changedInstance(function0) ? 32 : 16);
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Strings.getSizes(gapComposer2).getClass();
            Object obj = DefaultSizes.border.entries;
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(9999.0f);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier clip = ClipKt.clip(companion, m340RoundedCornerShape0680j_4);
            long j = Strings.getColors(gapComposer2).semantic.background.subtle;
            Strings.getSizes(gapComposer2).getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(ImageKt.m177backgroundbw27NRU(clip, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(9999.0f)), 12.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m302paddingqDBjuR0$default);
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
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Room.m1165Text25TpFw(0, 0, 0, 0, i3 & 14, 0, 4082, Strings.getColors(gapComposer2).semantic.text.subtle, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).base.medium10, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            String stringResource = Room.stringResource(gapComposer2, R.string.local_views_coupon_remove);
            HorizontalAlignmentLine horizontalAlignmentLine = InteractiveComponentSizeKt.MinimumInteractiveTopAlignmentLine;
            Strings.getSizes(gapComposer2).getClass();
            Modifier clip2 = ClipKt.clip(MinimumInteractiveModifier.INSTANCE, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(9999.0f));
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj2 = Composer.Companion.Empty;
            if (rememberedValue == obj2) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
            }
            Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(clip2, (MutableInteractionSourceImpl) rememberedValue, RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer2, 0, 15), false, null, new Role(0), function0, 12);
            function02 = function0;
            boolean changed = gapComposer2.changed(stringResource);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed || rememberedValue2 == obj2) {
                rememberedValue2 = new IconKt$$ExternalSyntheticLambda0(stringResource, 21);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Modifier semantics = SemanticsModifierKt.semantics(m182clickableO2vRcR0$default, false, (Function1) rememberedValue2);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, semantics);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 8.0f);
            Painter painter = Icons.NavigationClose.painter(gapComposer2);
            long j2 = Strings.getColors(gapComposer2).semantic.icon.subtle;
            ImageKt.Image(painter, null, m285size3ABfNKs, null, ContentScale.Companion.Fit, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j2, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j2), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer2, Painter.$stable | 25008, 40);
            gapComposer = gapComposer2;
            i2 = 1;
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            function02 = function0;
            gapComposer = gapComposer2;
            i2 = 1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ToViewKt$$ExternalSyntheticLambda0(str, function02, i, i2);
        }
    }

    public static final void AppliedGiftCardChip(Modifier modifier, AppliedGiftCard appliedGiftCard, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1424330675);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(appliedGiftCard) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            long j = Strings.getColors(gapComposer2).semantic.background.subtle;
            Strings.getSizes(gapComposer2).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(ImageKt.m177backgroundbw27NRU(modifier, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(9999.0f)), 16.0f, 12.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.CenterVertically, gapComposer2, 54);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m299paddingVpY3zN4);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(function0);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            String format2 = new MessageFormat(Room.stringResource(gapComposer2, R.string.local_views_gift_card_applied)).format(new Object[]{appliedGiftCard.last4});
            format2.getClass();
            String replace = StringsKt__StringsJVMKt.replace(format2.toString(), '*', (char) 8226, false);
            String stringResource = Room.stringResource(gapComposer2, R.string.local_views_gift_card_balance);
            String stringResource2 = Room.stringResource(gapComposer2, R.string.local_views_separator_dot);
            gapComposer2.startReplaceGroup(1940573995);
            AnnotatedString.Builder builder = new AnnotatedString.Builder();
            int i3 = i2;
            int pushStyle = builder.pushStyle(new SpanStyle(Strings.getColors(gapComposer2).semantic.text.standard, 0L, FontWeight.Medium, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65530));
            try {
                builder.append(replace);
                builder.pop(pushStyle);
                pushStyle = builder.pushStyle(new SpanStyle(Strings.getColors(gapComposer2).semantic.text.subtle, 0L, FontWeight.Normal, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65530));
                try {
                    builder.append(stringResource2);
                    builder.append(stringResource);
                    builder.append(" ");
                    builder.append(appliedGiftCard.amount);
                    builder.pop(pushStyle);
                    AnnotatedString annotatedString = builder.toAnnotatedString();
                    gapComposer2.end(false);
                    Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer2, (Modifier) null, annotatedString, Strings.getTypography(gapComposer2).bodySmall, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                    String stringResource3 = Room.stringResource(gapComposer2, R.string.local_views_remove_gift_card);
                    HorizontalAlignmentLine horizontalAlignmentLine = InteractiveComponentSizeKt.MinimumInteractiveTopAlignmentLine;
                    Strings.getSizes(gapComposer2).getClass();
                    Modifier clip = ClipKt.clip(MinimumInteractiveModifier.INSTANCE, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(9999.0f));
                    Object rememberedValue = gapComposer2.rememberedValue();
                    Object obj2 = Composer.Companion.Empty;
                    if (rememberedValue == obj2) {
                        rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
                    }
                    MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
                    RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer2, 0, 15);
                    Role role = new Role(0);
                    boolean changedInstance = gapComposer2.changedInstance(appliedGiftCard) | ((i3 & 896) == 256);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changedInstance || rememberedValue2 == obj2) {
                        rememberedValue2 = new StatusRunnable$$ExternalSyntheticLambda1(17, function1, appliedGiftCard);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(clip, mutableInteractionSourceImpl, m3400rippleYJYuY3k, false, null, role, (Function0) rememberedValue2, 12);
                    boolean changed = gapComposer2.changed(stringResource3);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (changed || rememberedValue3 == obj2) {
                        rememberedValue3 = new IconKt$$ExternalSyntheticLambda0(stringResource3, 22);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    Modifier semantics = SemanticsModifierKt.semantics(m182clickableO2vRcR0$default, false, (Function1) rememberedValue3);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, semantics);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(function0);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 8.0f);
                    Painter painter = Icons.NavigationClose.painter(gapComposer2);
                    long j2 = Strings.getColors(gapComposer2).semantic.icon.subtle;
                    ImageKt.Image(painter, null, m285size3ABfNKs, null, ContentScale.Companion.Fit, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j2, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j2), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer2, Painter.$stable | 25008, 40);
                    gapComposer = gapComposer2;
                    gapComposer.end(true);
                    gapComposer.end(true);
                } finally {
                }
            } finally {
            }
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda8((Object) modifier, (Object) appliedGiftCard, function1, i, 13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CheckoutBuyerInfoSection(OrderBuilderModel.BuyerInfo.UiReady uiReady, TextFieldState textFieldState, TextFieldState textFieldState2, Function0 function0, Function1 function1, Modifier modifier, String str, PaddingValues paddingValues, boolean z, Composer composer, int i, int i2) {
        boolean z2;
        boolean z3;
        RecomposeScopeImpl endRestartGroup;
        boolean z4;
        String str2;
        uiReady.getClass();
        textFieldState.getClass();
        textFieldState2.getClass();
        function0.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(71348709);
        int i3 = i | (gapComposer.changedInstance(uiReady) ? 4 : 2) | (gapComposer.changed(textFieldState) ? 32 : 16) | (gapComposer.changed(textFieldState2) ? 256 : 128) | (gapComposer.changedInstance(function0) ? 2048 : 1024) | (gapComposer.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(str) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        int i4 = i2 & 256;
        if (i4 != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            z2 = z;
            i3 |= gapComposer.changed(z2) ? 67108864 : 33554432;
            if (gapComposer.shouldExecute(i3 & 1, (38347923 & i3) == 38347922)) {
                gapComposer.skipToGroupEnd();
                z3 = z2;
            } else {
                gapComposer.startDefaults();
                if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                    gapComposer.skipToGroupEnd();
                } else if (i4 != 0) {
                    z4 = true;
                    gapComposer.endDefaults();
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new LocationMenu$$ExternalSyntheticLambda6(6);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    AnimatedContentKt.AnimatedContent(uiReady, null, null, null, null, (Function1) rememberedValue, Expect_jvmKt.rememberComposableLambda(-95222875, new SetNameViewKt$$ExternalSyntheticLambda5(1, paddingValues, str, function0, textFieldState, textFieldState2, z4), gapComposer), gapComposer, (i3 & 14) | 1769472, 30);
                    LegalConsent legalConsent = uiReady.getLegalConsent();
                    String str3 = (legalConsent == null || (str2 = legalConsent.text) == null || !z4) ? null : str2;
                    if (str3 == null) {
                        gapComposer.startReplaceGroup(598554569);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(598554570);
                        Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, 8.0f, 5);
                        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        long j = colors.semantic.text.subtle;
                        TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).badgeLargeAsset;
                        boolean z5 = (i3 & 57344) == 16384;
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (z5 || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new SwipeToDismissKt$$ExternalSyntheticLambda4(2, function1);
                            gapComposer.updateRememberedValue(rememberedValue2);
                        }
                        LazyDslKt.m304MarkdownTextpCuZGqc(str3, (Function2) rememberedValue2, m302paddingqDBjuR0$default, textStyle, j, null, null, null, 0, 0, 0, gapComposer, MLKEMEngine.KyberPolyBytes, 2016);
                        gapComposer = gapComposer;
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                    z3 = z4;
                }
                z4 = z2;
                gapComposer.endDefaults();
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, modifier);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                if (gapComposer.applier != null) {
                }
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new ButtonKt$$ExternalSyntheticLambda2(uiReady, textFieldState, textFieldState2, function0, function1, modifier, str, paddingValues, z3, i, i2);
                return;
            }
            return;
        }
        z2 = z;
        if (gapComposer.shouldExecute(i3 & 1, (38347923 & i3) == 38347922)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: CheckoutCartItemRow-FNF3uiM, reason: not valid java name */
    public static final void m1300CheckoutCartItemRowFNF3uiM(LocalCartSummaryLineViewModel localCartSummaryLineViewModel, Modifier modifier, long j, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Modifier modifier3;
        localCartSummaryLineViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-943999629);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(localCartSummaryLineViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(j) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            gapComposer.startDefaults();
            int i4 = i & 1;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (i4 == 0 || gapComposer.getDefaultsInvalid()) {
                modifier3 = companion;
            } else {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier;
            }
            gapComposer.endDefaults();
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier3);
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
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(12.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer, 54);
            int i5 = i3;
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
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
            LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14, 1.0f, true);
            Modifier modifier4 = modifier3;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) m, TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).bodySmall, 0L, 0L, FontWeight.Medium, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211), (TextLineBalancing) null, localCartSummaryLineViewModel.label + " × " + localCartSummaryLineViewModel.quantity, (Map) null, (Function1) null, false);
            m1308SelectionTotalAmountXOJAsU(localCartSummaryLineViewModel.totalPriceBeforeDiscountFormatted, localCartSummaryLineViewModel.totalPriceFormatted, j, gapComposer, i5 & 896);
            gapComposer.end(true);
            String str = localCartSummaryLineViewModel.information;
            if (str == null) {
                gapComposer.startReplaceGroup(-400004477);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-400004476);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            LocalCartSummaryLineViewModel.Discount discount = localCartSummaryLineViewModel.discount;
            if (discount == null) {
                gapComposer.startReplaceGroup(-399803814);
            } else {
                gapComposer.startReplaceGroup(-399803813);
                SelectionDiscountLine(discount, gapComposer, 0);
            }
            gapComposer.end(false);
            gapComposer.startReplaceGroup(264200882);
            List list = localCartSummaryLineViewModel.slots;
            int size = list.size();
            int i6 = 0;
            while (i6 < size) {
                ComboSlotViewModel comboSlotViewModel = (ComboSlotViewModel) list.get(i6);
                SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 12.0f));
                int i7 = size;
                int i8 = i6;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelSmall, (TextLineBalancing) null, comboSlotViewModel.title, (Map) null, (Function1) null, false);
                String str2 = comboSlotViewModel.subtitle;
                if (str2 == null) {
                    gapComposer.startReplaceGroup(1782382466);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1782382467);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                    gapComposer.end(false);
                }
                i6 = i8 + 1;
                size = i7;
            }
            gapComposer.end(false);
            gapComposer.end(true);
            modifier2 = modifier4;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetScope$$ExternalSyntheticLambda13(i, 2, j, localCartSummaryLineViewModel, modifier2);
        }
    }

    public static final void CheckoutCouponSection(Modifier modifier, CouponSection couponSection, Function1 function1, Function1 function12, Composer composer, int i) {
        couponSection.getClass();
        function1.getClass();
        function12.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1431860002);
        int i2 = i | (gapComposer.changedInstance(couponSection) ? 32 : 16) | MLKEMEngine.KyberPolyBytes | (gapComposer.changedInstance(function1) ? 2048 : 1024) | (gapComposer.changedInstance(function12) ? 16384 : PKIFailureInfo.certRevoked);
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            Object[] objArr = new Object[0];
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new LocalMapKt$$ExternalSyntheticLambda3(15);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer, 0);
            TextFieldState m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE(null, 0L, gapComposer, 0, 3);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            String stringResource = Room.stringResource(gapComposer, R.string.local_views_coupon_section_title);
            String stringResource2 = Room.stringResource(gapComposer, R.string.local_views_coupon_redeem);
            boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
            boolean changed = gapComposer.changed(mutableState);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new DateInputKt$$ExternalSyntheticLambda5(12, mutableState);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            CheckoutExpandableReviewRowKt.m1298CheckoutExpandableReviewRowIBGS8fI(null, stringResource, stringResource2, null, booleanValue, (Function1) rememberedValue2, false, false, false, null, null, Expect_jvmKt.rememberComposableLambda(-891726583, new LocalViewFactory$$ExternalSyntheticLambda6(2, couponSection, m382rememberTextFieldStateLepunE, function1), gapComposer), gapComposer, 0, 48, 1993);
            gapComposer = gapComposer;
            if (couponSection.appliedCoupons.isEmpty()) {
                gapComposer.startReplaceGroup(545843502);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(545478322);
                OffsetKt.FlowRow(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, 16.0f, 5), new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), null, 0, 0, Expect_jvmKt.rememberComposableLambda(1732557396, new CheckoutCouponSectionKt$$ExternalSyntheticLambda3(couponSection, function12, i3), gapComposer), gapComposer, 1573302, 56);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DismissableToastKt$$ExternalSyntheticLambda4(modifier, i, couponSection, function1, function12, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r11v4, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v14 */
    public static final void CheckoutGiftCardSection(Modifier modifier, LocalCheckoutGiftCardSectionViewModel localCheckoutGiftCardSectionViewModel, Function1 function1, Function1 function12, Function0 function0, Function1 function13, Composer composer, int i) {
        GapComposer gapComposer;
        NeverEqualPolicy neverEqualPolicy;
        GiftCardInputState giftCardInputState;
        ?? r1;
        TextFieldState textFieldState;
        Continuation continuation;
        String str;
        function1.getClass();
        function12.getClass();
        function0.getClass();
        function13.getClass();
        ?? r11 = (GapComposer) composer;
        r11.startRestartGroup(2073716592);
        int i2 = (r11.changedInstance(localCheckoutGiftCardSectionViewModel) ? 32 : 16) | i;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= r11.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= r11.changedInstance(function12) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= r11.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= r11.changedInstance(function13) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if (r11.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            GiftCardInputState giftCardInputState2 = localCheckoutGiftCardSectionViewModel.input;
            List list = localCheckoutGiftCardSectionViewModel.appliedGiftCards;
            String str2 = giftCardInputState2 != null ? giftCardInputState2.code : null;
            if (str2 == null) {
                str2 = "";
            }
            TextFieldState m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE(str2, 0L, r11, 0, 2);
            Boolean valueOf = Boolean.valueOf(giftCardInputState2 != null);
            boolean changedInstance = ((i2 & 7168) == 2048) | r11.changedInstance(giftCardInputState2) | r11.changed(m382rememberTextFieldStateLepunE);
            Object rememberedValue = r11.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy2) {
                neverEqualPolicy = neverEqualPolicy2;
                giftCardInputState = giftCardInputState2;
                r1 = 0;
                textFieldState = m382rememberTextFieldStateLepunE;
                RealImageLoader$execute$2 realImageLoader$execute$2 = new RealImageLoader$execute$2(giftCardInputState, textFieldState, function12, null, 11);
                continuation = null;
                r11.updateRememberedValue(realImageLoader$execute$2);
                rememberedValue = realImageLoader$execute$2;
            } else {
                giftCardInputState = giftCardInputState2;
                neverEqualPolicy = neverEqualPolicy2;
                r1 = 0;
                textFieldState = m382rememberTextFieldStateLepunE;
                continuation = null;
            }
            Updater.LaunchedEffect(textFieldState, valueOf, (Function2) rememberedValue, r11);
            Object obj = giftCardInputState != null ? giftCardInputState.code : continuation;
            boolean changedInstance2 = r11.changedInstance(giftCardInputState) | r11.changed(textFieldState);
            Object rememberedValue2 = r11.rememberedValue();
            if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new EventBridge$sendEvent$1(giftCardInputState, textFieldState, continuation, 13);
                r11.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect((Composer) r11, obj, (Function2) rememberedValue2);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, r11, r1);
            ?? r16 = continuation;
            int hashCode = Long.hashCode(r11.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = r11.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(r11, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (r11.applier == null) {
                Updater.invalidApplier();
                throw r16;
            }
            r11.startReusableNode();
            if (r11.inserting) {
                r11.createNode(layoutNode$Companion$Constructor$1);
            } else {
                r11.useNode();
            }
            Updater.m576setimpl(r11, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(r11, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(r11, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(r11, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(r11, materializeModifier, ComposeUiNode.Companion.SetModifier);
            List list2 = list;
            boolean isEmpty = list2.isEmpty();
            boolean z = (giftCardInputState == null || !isEmpty) ? r1 : true;
            String stringResource = Room.stringResource(r11, R.string.local_views_gift_cards);
            if (isEmpty) {
                str = re$$ExternalSyntheticOutline0.m((GapComposer) r11, 104290929, R.string.local_views_redeem_gift_card, (GapComposer) r11, (boolean) r1);
            } else {
                r11.startReplaceGroup(104257666);
                r11.end(r1);
                str = r16;
            }
            boolean z2 = z;
            CheckoutExpandableReviewRowKt.m1298CheckoutExpandableReviewRowIBGS8fI(null, stringResource, str, null, (localCheckoutGiftCardSectionViewModel.isExpanded && z) ? true : r1, function1, z2, z2, false, null, null, Expect_jvmKt.rememberComposableLambda(-1756665701, new LocalViewFactory$$ExternalSyntheticLambda6(3, giftCardInputState, textFieldState, function0), r11), r11, (i2 << 9) & 458752, 48, 1801);
            ?? r112 = r11;
            r112.startReplaceGroup(1665998853);
            int size = list2.size();
            for (int i3 = r1; i3 < size; i3++) {
                AppliedGiftCardChip(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, 16.0f, 5), (AppliedGiftCard) list.get(i3), function13, r112, ((i2 >> 9) & 896) | 6);
            }
            r112.end(r1);
            r112.end(true);
            gapComposer = r112;
        } else {
            r11.skipToGroupEnd();
            gapComposer = r11;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OffersSearchViewKt$$ExternalSyntheticLambda6(modifier, localCheckoutGiftCardSectionViewModel, function1, function12, function0, function13, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if ((r21 & 2) != 0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0036  */
    /* renamed from: CheckoutOrderSummaryContent-iJQMabo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1301CheckoutOrderSummaryContentiJQMabo(LocalCheckoutOrderSummaryViewModel localCheckoutOrderSummaryViewModel, long j, Composer composer, int i, int i2) {
        long j2;
        int i3;
        int i4;
        long j3;
        RecomposeScopeImpl endRestartGroup;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2000277856);
        Applier applier = gapComposer.applier;
        int i5 = i | (gapComposer.changedInstance(localCheckoutOrderSummaryViewModel) ? 4 : 2);
        if ((i2 & 2) == 0) {
            j2 = j;
            if (gapComposer.changed(j2)) {
                i3 = 32;
                i4 = i5 | i3;
                if (gapComposer.shouldExecute(i4 & 1, (i4 & 19) == 18)) {
                    gapComposer.skipToGroupEnd();
                    j3 = j2;
                } else {
                    gapComposer.startDefaults();
                    if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                        if ((i2 & 2) != 0) {
                            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                            if (colors == null) {
                                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                            } else {
                                gapComposer.startReplaceGroup(-1762997739);
                                gapComposer.end(false);
                            }
                            j2 = colors.semantic.text.subtle;
                            i4 &= -113;
                        }
                        int i6 = i4;
                        long j4 = j2;
                        gapComposer.endDefaults();
                        Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                        BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
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
                        ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(12.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), horizontal, gapComposer, 6);
                        int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
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
                        gapComposer.startReplaceGroup(-887831778);
                        List list = localCheckoutOrderSummaryViewModel.selections;
                        int size = list.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            m1300CheckoutCartItemRowFNF3uiM((LocalCartSummaryLineViewModel) list.get(i7), null, j4, gapComposer, (i6 << 3) & 896);
                        }
                        gapComposer.end(false);
                        gapComposer.end(true);
                        SummaryRows(localCheckoutOrderSummaryViewModel, gapComposer, i6 & 14);
                        gapComposer.end(true);
                        j3 = j4;
                    } else {
                        gapComposer.skipToGroupEnd();
                    }
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                    endRestartGroup.block = new AvatarKt$$ExternalSyntheticLambda7(localCheckoutOrderSummaryViewModel, j3, i, i2);
                    return;
                }
                return;
            }
        } else {
            j2 = j;
        }
        i3 = 16;
        i4 = i5 | i3;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 19) == 18)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0042  */
    /* renamed from: CheckoutOrderSummarySection-yrwZFoE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1302CheckoutOrderSummarySectionyrwZFoE(LocalCheckoutOrderSummaryViewModel localCheckoutOrderSummaryViewModel, Modifier modifier, String str, String str2, long j, Composer composer, int i, int i2) {
        Modifier modifier2;
        String str3;
        int i3;
        int i4;
        String str4;
        int i5;
        long j2;
        int i6;
        int i7;
        Modifier modifier3;
        String str5;
        String str6;
        long j3;
        RecomposeScopeImpl endRestartGroup;
        Modifier modifier4;
        String str7;
        int i8;
        String str8;
        long j4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2107944899);
        int i9 = 2;
        int i10 = i | (gapComposer.changedInstance(localCheckoutOrderSummaryViewModel) ? 4 : 2);
        int i11 = i2 & 2;
        if (i11 != 0) {
            i10 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i10 |= gapComposer.changed(modifier2) ? 32 : 16;
            if ((i2 & 4) != 0) {
                str3 = str;
                if (gapComposer.changed(str3)) {
                    i3 = 256;
                    int i12 = i10 | i3;
                    i4 = i2 & 8;
                    if (i4 != 0) {
                        i5 = i12 | 3072;
                        str4 = str2;
                    } else {
                        str4 = str2;
                        i5 = i12 | (gapComposer.changed(str4) ? 2048 : 1024);
                    }
                    if ((i2 & 16) == 0) {
                        j2 = j;
                        if (gapComposer.changed(j2)) {
                            i6 = 16384;
                            i7 = i5 | i6;
                            int i13 = 1;
                            if (gapComposer.shouldExecute(i7 & 1, (i7 & 9363) == 9362)) {
                                gapComposer.skipToGroupEnd();
                                modifier3 = modifier2;
                                str5 = str3;
                                str6 = str4;
                                j3 = j2;
                            } else {
                                gapComposer.startDefaults();
                                if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                                    modifier4 = i11 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                                    if ((i2 & 4) != 0) {
                                        str7 = new MessageFormat(Room.stringResource(gapComposer, R.string.local_views_items_count)).format(NavAction$$ExternalSyntheticOutline0.m(1, Integer.valueOf(localCheckoutOrderSummaryViewModel.itemCount), "count"));
                                        str7.getClass();
                                        i7 &= -897;
                                    } else {
                                        str7 = str3;
                                    }
                                    if (i4 != 0) {
                                        str4 = null;
                                    }
                                    if ((i2 & 16) != 0) {
                                        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                                        if (colors == null) {
                                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                                        } else {
                                            gapComposer.startReplaceGroup(-1762997739);
                                            gapComposer.end(false);
                                        }
                                        String str9 = str7;
                                        i8 = i7 & (-57345);
                                        str8 = str9;
                                        j4 = colors.semantic.text.subtle;
                                    } else {
                                        String str10 = str7;
                                        i8 = i7;
                                        str8 = str10;
                                        j4 = j2;
                                    }
                                } else {
                                    gapComposer.skipToGroupEnd();
                                    if ((i2 & 4) != 0) {
                                        i7 &= -897;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i7 &= -57345;
                                    }
                                    modifier4 = modifier2;
                                    j4 = j2;
                                    i8 = i7;
                                    str8 = str3;
                                }
                                String str11 = str4;
                                gapComposer.endDefaults();
                                modifier3 = modifier4;
                                LocalMapKt.LocalExpandableSection(modifier3, Expect_jvmKt.rememberComposableLambda(-357901343, new NoteInputViewKt$$ExternalSyntheticLambda4(str8, str11, i13), gapComposer), Expect_jvmKt.rememberComposableLambda(836792984, new PoolListSectionKt$$ExternalSyntheticLambda8(localCheckoutOrderSummaryViewModel, j4, i9), gapComposer), new ExpandableSectionStyle(0L, null, SpacerKt.m297PaddingValuesa9UjIt4$default(RecyclerView.DECELERATION_RATE, 24.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), 15), localCheckoutOrderSummaryViewModel.isExpanded, gapComposer, ((i8 >> 3) & 14) | 3504);
                                str5 = str8;
                                str6 = str11;
                                j3 = j4;
                            }
                            endRestartGroup = gapComposer.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.block = new CellActivityAvatarScope$$ExternalSyntheticLambda0(localCheckoutOrderSummaryViewModel, modifier3, str5, str6, j3, i, i2);
                                return;
                            }
                            return;
                        }
                    } else {
                        j2 = j;
                    }
                    i6 = PKIFailureInfo.certRevoked;
                    i7 = i5 | i6;
                    int i132 = 1;
                    if (gapComposer.shouldExecute(i7 & 1, (i7 & 9363) == 9362)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
            } else {
                str3 = str;
            }
            i3 = 128;
            int i122 = i10 | i3;
            i4 = i2 & 8;
            if (i4 != 0) {
            }
            if ((i2 & 16) == 0) {
            }
            i6 = PKIFailureInfo.certRevoked;
            i7 = i5 | i6;
            int i1322 = 1;
            if (gapComposer.shouldExecute(i7 & 1, (i7 & 9363) == 9362)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 4) != 0) {
        }
        i3 = 128;
        int i1222 = i10 | i3;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        if ((i2 & 16) == 0) {
        }
        i6 = PKIFailureInfo.certRevoked;
        i7 = i5 | i6;
        int i13222 = 1;
        if (gapComposer.shouldExecute(i7 & 1, (i7 & 9363) == 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: CheckoutPaymentSection-PfoAEA0, reason: not valid java name */
    public static final void m1303CheckoutPaymentSectionPfoAEA0(LocalCheckoutPaymentSectionViewModel localCheckoutPaymentSectionViewModel, Function1 function1, Modifier modifier, String str, boolean z, float f, PaddingValues paddingValues, Composer composer, int i) {
        Modifier modifier2;
        String str2;
        String stringResource;
        int i2;
        String str3;
        localCheckoutPaymentSectionViewModel.getClass();
        List list = localCheckoutPaymentSectionViewModel.paymentMethods;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1102428872);
        int i3 = i | (gapComposer.changedInstance(localCheckoutPaymentSectionViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | 1024;
        if (gapComposer.shouldExecute(i3 & 1, (599187 & i3) != 599186)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                stringResource = Room.stringResource(gapComposer, R.string.local_views_payment_method);
                i2 = i3 & (-7169);
            } else {
                gapComposer.skipToGroupEnd();
                i2 = i3 & (-7169);
                stringResource = str;
            }
            gapComposer.endDefaults();
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            modifier2 = modifier;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier2);
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
            if (list.size() != 1 || z) {
                gapComposer.startReplaceGroup(532892978);
                str3 = stringResource;
                m1305ExpandablePaymentMethodSection942rkJo(str3, localCheckoutPaymentSectionViewModel, f, paddingValues, function1, gapComposer, ((i2 << 3) & 112) | 3456 | ((i2 << 9) & 57344));
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(532781099);
                SinglePaymentMethodSection(stringResource, (LocalCheckoutPaymentMethodViewModel) CollectionsKt.first(list), gapComposer, 0);
                gapComposer.end(false);
                str3 = stringResource;
            }
            gapComposer.end(true);
            str2 = str3;
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
            str2 = str;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SliderKt$$ExternalSyntheticLambda2(localCheckoutPaymentSectionViewModel, function1, modifier2, str2, z, f, paddingValues, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* renamed from: CheckoutSpecialInstructionsSection-FJfuzF0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1304CheckoutSpecialInstructionsSectionFJfuzF0(LocalCheckoutSpecialInstructionsViewModel localCheckoutSpecialInstructionsViewModel, Function1 function1, Modifier modifier, PaddingValues paddingValues, float f, Composer composer, int i, int i2) {
        float f2;
        GapComposer gapComposer;
        float f3;
        RecomposeScopeImpl endRestartGroup;
        localCheckoutSpecialInstructionsViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(530724178);
        int i3 = (gapComposer2.changedInstance(localCheckoutSpecialInstructionsViewModel) ? 4 : 2) | i | (gapComposer2.changedInstance(function1) ? 32 : 16);
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            f2 = f;
            i3 |= gapComposer2.changed(f2) ? 16384 : PKIFailureInfo.certRevoked;
            if (gapComposer2.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
                gapComposer = gapComposer2;
                gapComposer.skipToGroupEnd();
                f3 = f2;
            } else {
                float f4 = i4 != 0 ? 16.0f : f2;
                String stringResource = Room.stringResource(gapComposer2, R.string.local_views_special_instructions);
                String str = localCheckoutSpecialInstructionsViewModel.brandName;
                str.getClass();
                String format2 = new MessageFormat(Room.stringResource(gapComposer2, R.string.local_views_note_for)).format(new Object[]{str});
                format2.getClass();
                String str2 = localCheckoutSpecialInstructionsViewModel.notes;
                gapComposer = gapComposer2;
                m1306LocalCheckoutNotesgMrHQkA(modifier, stringResource, format2, str2, str2.length() > 0, true, paddingValues, f4, function1, gapComposer, ((i3 << 9) & 29360128) | 1572870 | ((i3 << 21) & 234881024), 0);
                f3 = f4;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new MoneyTabUIKt$$ExternalSyntheticLambda37(localCheckoutSpecialInstructionsViewModel, function1, modifier, paddingValues, f3, i, i2);
                return;
            }
            return;
        }
        f2 = f;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void CheckoutTipSection(final Modifier modifier, final LocalCheckoutTipSectionViewModel localCheckoutTipSectionViewModel, final Function1 function1, final Function1 function12, final Function1 function13, Composer composer, final int i) {
        Object obj;
        Object obj2;
        GapComposer gapComposer;
        RecomposeScopeImpl recomposeScopeImpl;
        Function2 function2;
        function1.getClass();
        function12.getClass();
        function13.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(2015455845);
        int i2 = (gapComposer2.changedInstance(localCheckoutTipSectionViewModel) ? 32 : 16) | i;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            obj = function1;
            i2 |= gapComposer2.changedInstance(obj) ? 256 : 128;
        } else {
            obj = function1;
        }
        if ((i & 3072) == 0) {
            obj2 = function12;
            i2 |= gapComposer2.changedInstance(obj2) ? 2048 : 1024;
        } else {
            obj2 = function12;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changedInstance(function13) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (!gapComposer2.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        } else {
            if (!localCheckoutTipSectionViewModel.isEnabled || localCheckoutTipSectionViewModel.options.isEmpty()) {
                recomposeScopeImpl = gapComposer2.endRestartGroup();
                if (recomposeScopeImpl != null) {
                    final int i3 = 0;
                    function2 = new Function2() { // from class: app.cash.local.views.brand.checkout.CheckoutTipSectionKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            int i4 = i3;
                            int i5 = i;
                            switch (i4) {
                                case 0:
                                    ((Integer) obj4).getClass();
                                    CheckoutTipSectionKt.CheckoutTipSection(modifier, localCheckoutTipSectionViewModel, function1, function12, function13, (Composer) obj3, Updater.updateChangedFlags(i5 | 1));
                                    break;
                                default:
                                    ((Integer) obj4).getClass();
                                    CheckoutTipSectionKt.CheckoutTipSection(modifier, localCheckoutTipSectionViewModel, function1, function12, function13, (Composer) obj3, Updater.updateChangedFlags(i5 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    recomposeScopeImpl.block = function2;
                }
                return;
            }
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            Color color = null;
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
            Object[] objArr = new Object[0];
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj3 = Composer.Companion.Empty;
            if (rememberedValue == obj3) {
                rememberedValue = new LocalMapKt$$ExternalSyntheticLambda3(16);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer2, 48);
            String str = localCheckoutTipSectionViewModel.title;
            String str2 = localCheckoutTipSectionViewModel.subtitle;
            if (localCheckoutTipSectionViewModel.subtitleHighlighted) {
                gapComposer2.startReplaceGroup(-828845930);
                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                color = Recorder$$ExternalSyntheticOutline1.m(gapComposer2, false, colors.semantic.text.success);
            } else {
                gapComposer2.startReplaceGroup(75592750);
                gapComposer2.end(false);
            }
            Color color2 = color;
            boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
            boolean changed = gapComposer2.changed(mutableState);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed || rememberedValue2 == obj3) {
                rememberedValue2 = new DateInputKt$$ExternalSyntheticLambda5(13, mutableState);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            CheckoutExpandableReviewRowKt.m1298CheckoutExpandableReviewRowIBGS8fI(null, str, str2, color2, booleanValue, (Function1) rememberedValue2, false, false, false, null, null, Expect_jvmKt.rememberComposableLambda(-1465456934, new ComposeDialogKt$$ExternalSyntheticLambda12(localCheckoutTipSectionViewModel, obj, obj2, function13, 4), gapComposer2), gapComposer2, 0, 48, 1985);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        }
        recomposeScopeImpl = gapComposer.endRestartGroup();
        if (recomposeScopeImpl != null) {
            final int i4 = 1;
            function2 = new Function2() { // from class: app.cash.local.views.brand.checkout.CheckoutTipSectionKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj32, Object obj4) {
                    int i42 = i4;
                    int i5 = i;
                    switch (i42) {
                        case 0:
                            ((Integer) obj4).getClass();
                            CheckoutTipSectionKt.CheckoutTipSection(modifier, localCheckoutTipSectionViewModel, function1, function12, function13, (Composer) obj32, Updater.updateChangedFlags(i5 | 1));
                            break;
                        default:
                            ((Integer) obj4).getClass();
                            CheckoutTipSectionKt.CheckoutTipSection(modifier, localCheckoutTipSectionViewModel, function1, function12, function13, (Composer) obj32, Updater.updateChangedFlags(i5 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            recomposeScopeImpl.block = function2;
        }
    }

    public static final void CustomAmountInput(int i, Composer composer, Modifier modifier, String str, Function1 function1) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(2061944232);
        int i2 = i | (gapComposer2.changed(str) ? 32 : 16) | (gapComposer2.changedInstance(function1) ? 256 : 128);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            TextFieldState m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE(str, 0L, gapComposer2, (i2 >> 3) & 14, 2);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
            MutableState collectIsFocusedAsState = Countries.collectIsFocusedAsState(mutableInteractionSourceImpl, gapComposer2, 6);
            boolean changed = gapComposer2.changed(m382rememberTextFieldStateLepunE) | gapComposer2.changed(collectIsFocusedAsState) | ((i2 & 896) == 256);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new RealImageLoader$execute$2(m382rememberTextFieldStateLepunE, function1, collectIsFocusedAsState, null, 12);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer2, m382rememberTextFieldStateLepunE, (Function2) rememberedValue2);
            boolean changed2 = gapComposer2.changed(m382rememberTextFieldStateLepunE) | ((i2 & 112) == 32);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new BugReportingViewKt$ProblemSection$1$1(m382rememberTextFieldStateLepunE, str, (Continuation) null);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            Updater.LaunchedEffect(gapComposer2, str, (Function2) rememberedValue3);
            FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) gapComposer2.consume(CompositionLocalsKt.LocalFocusManager);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            String stringResource = Room.stringResource(gapComposer2, R.string.local_views_tip_hint);
            ComposableLambdaImpl composableLambdaImpl = StringsKt.isBlank(m382rememberTextFieldStateLepunE.getValue$foundation().text) ? null : lambda$370237090;
            FilterChain filterChain = new FilterChain(new CheckoutTipSectionKt$$ExternalSyntheticLambda14(), new FilterChain(InputTransformation.Companion.$$INSTANCE, new MaxLengthFilter(6)));
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 9, 7, (Boolean) null, 115);
            boolean changedInstance = gapComposer2.changedInstance(focusOwnerImpl);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new SearchBarKt$$ExternalSyntheticLambda7(focusOwnerImpl, 1);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            gapComposer = gapComposer2;
            InputFieldKt.InputField(m382rememberTextFieldStateLepunE, fillMaxWidth, false, false, false, null, composableLambdaImpl, null, null, stringResource, keyboardOptions, (KeyboardActionHandler) rememberedValue4, filterChain, null, mutableInteractionSourceImpl, null, gapComposer, 0, 24582, 41404);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckoutTipSectionKt$$ExternalSyntheticLambda13(i, 0, modifier, str, function1);
        }
    }

    /* renamed from: ExpandablePaymentMethodSection-942rkJo, reason: not valid java name */
    public static final void m1305ExpandablePaymentMethodSection942rkJo(String str, LocalCheckoutPaymentSectionViewModel localCheckoutPaymentSectionViewModel, float f, PaddingValues paddingValues, Function1 function1, Composer composer, int i) {
        int i2;
        Modifier.Companion companion;
        Modifier modifier;
        Modifier.Companion companion2;
        float f2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-954879974);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(localCheckoutPaymentSectionViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(paddingValues) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked;
        }
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                localCheckoutPaymentSectionViewModel.getClass();
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            localCheckoutPaymentSectionViewModel.getClass();
            gapComposer.startReplaceGroup(-1260539960);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new TooltipKt$$ExternalSyntheticLambda1(26, mutableState);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Function0 function0 = (Function0) rememberedValue2;
            gapComposer.end(false);
            Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
            if (paddingValues == null) {
                gapComposer.startReplaceGroup(-1260399592);
                companion2 = companion3;
                PaymentMethodHeader(str, selectedPaymentMethodLabel(localCheckoutPaymentSectionViewModel, Room.stringResource(gapComposer, R.string.local_views_separator_dot)), ((Boolean) mutableState.getValue()).booleanValue(), function0, gapComposer, i2 & 14);
                gapComposer.end(false);
                f2 = 1.0f;
            } else {
                gapComposer.startReplaceGroup(-1260113958);
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion3, 1.0f);
                if (function0 != null) {
                    companion = companion3;
                    modifier = ImageKt.m183clickableoSLSa3U$default(companion, false, null, null, function0, 15);
                } else {
                    companion = companion3;
                    modifier = companion;
                }
                Modifier padding = SpacerKt.padding(fillMaxWidth.then(modifier), paddingValues);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                companion2 = companion;
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, padding);
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
                int i4 = (i2 & 14) | 3072;
                f2 = 1.0f;
                PaymentMethodHeader(str, selectedPaymentMethodLabel(localCheckoutPaymentSectionViewModel, Room.stringResource(gapComposer, R.string.local_views_separator_dot)), ((Boolean) mutableState.getValue()).booleanValue(), null, gapComposer, i4);
                gapComposer.end(true);
                gapComposer.end(false);
            }
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion2, f2);
            Boolean bool = (Boolean) mutableState.getValue();
            bool.booleanValue();
            AnimatedContentKt.AnimatedContent(bool, fillMaxWidth2, null, null, null, null, Expect_jvmKt.rememberComposableLambda(544769757, new SupportHomeViewKt$$ExternalSyntheticLambda10(f, localCheckoutPaymentSectionViewModel, function1, i3), gapComposer), gapComposer, 1572912, 60);
            gapComposer = gapComposer;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScanningShapePulseKt$$ExternalSyntheticLambda2(str, localCheckoutPaymentSectionViewModel, f, paddingValues, function1, i, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0240, code lost:
    
        if (r8 == r2) goto L143;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0174  */
    /* renamed from: LocalCheckoutNotes-gMrHQkA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1306LocalCheckoutNotesgMrHQkA(final Modifier modifier, final String str, String str2, final String str3, boolean z, boolean z2, PaddingValues paddingValues, float f, final Function1 function1, Composer composer, final int i, final int i2) {
        int i3;
        String str4;
        boolean z3;
        boolean z4;
        int i4;
        PaddingValues paddingValues2;
        int i5;
        float f2;
        int i6;
        String str5;
        GapComposer gapComposer;
        final boolean z5;
        final float f3;
        final boolean z6;
        final PaddingValues paddingValues3;
        RecomposeScopeImpl endRestartGroup;
        int i7;
        float f4;
        int i8;
        PaddingValues paddingValues4;
        boolean z7;
        Object obj;
        int i9;
        str.getClass();
        str2.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1929012340);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            str4 = str3;
            i3 |= gapComposer2.changed(str4) ? 2048 : 1024;
        } else {
            str4 = str3;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                z3 = z;
                if (gapComposer2.changed(z3)) {
                    i9 = 16384;
                    i3 |= i9;
                }
            } else {
                z3 = z;
            }
            i9 = PKIFailureInfo.certRevoked;
            i3 |= i9;
        } else {
            z3 = z;
        }
        int i10 = i2 & 32;
        if (i10 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            z4 = z2;
            i3 |= gapComposer2.changed(z4) ? PKIFailureInfo.unsupportedVersion : 65536;
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                paddingValues2 = paddingValues;
                i3 |= gapComposer2.changed(paddingValues2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                    f2 = f;
                } else {
                    f2 = f;
                    if ((i & 12582912) == 0) {
                        i3 |= gapComposer2.changed(f2) ? 8388608 : 4194304;
                    }
                }
                if ((i & 100663296) == 0) {
                    i3 |= gapComposer2.changedInstance(function1) ? 67108864 : 33554432;
                }
                i6 = i3;
                if (gapComposer2.shouldExecute(i6 & 1, (i3 & 38347923) != 38347922)) {
                    gapComposer2.startDefaults();
                    if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                        if ((i2 & 16) != 0) {
                            i7 = i6 & (-57345);
                            z3 = str4.length() > 0;
                        } else {
                            i7 = i6;
                        }
                        if (i10 != 0) {
                            z4 = true;
                        }
                        if (i4 != 0) {
                            paddingValues2 = new PaddingValuesImpl(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
                        }
                        if (i5 != 0) {
                            f2 = 16.0f;
                        }
                    } else {
                        gapComposer2.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i7 = i6 & (-57345);
                        } else {
                            z7 = z3;
                            f4 = f2;
                            paddingValues4 = paddingValues2;
                            i8 = i6;
                            gapComposer2.endDefaults();
                            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier);
                            ComposeUiNode.Companion.getClass();
                            Function0 function0 = ComposeUiNode.Companion.Constructor;
                            if (applier != null) {
                                Updater.invalidApplier();
                                throw null;
                            }
                            gapComposer2.startReusableNode();
                            if (gapComposer2.inserting) {
                                gapComposer2.createNode(function0);
                            } else {
                                gapComposer2.useNode();
                            }
                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                            Integer valueOf = Integer.valueOf(hashCode);
                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
                            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
                            Object[] objArr = new Object[0];
                            boolean z8 = (((i8 & 57344) ^ 24576) > 16384 && gapComposer2.changed(z7)) || (i8 & 24576) == 16384;
                            Object rememberedValue = gapComposer2.rememberedValue();
                            Object obj2 = Composer.Companion.Empty;
                            if (z8 || rememberedValue == obj2) {
                                rememberedValue = new Braze$$ExternalSyntheticLambda34(z7, 2);
                                gapComposer2.updateRememberedValue(rememberedValue);
                            }
                            MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer2, 0);
                            Object rememberedValue2 = gapComposer2.rememberedValue();
                            if (rememberedValue2 == obj2) {
                                rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m106m(gapComposer2);
                            }
                            FocusRequester focusRequester = (FocusRequester) rememberedValue2;
                            boolean z9 = z7;
                            boolean z10 = z4;
                            int i11 = i8;
                            TextFieldState m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE(str3, 0L, gapComposer2, (i8 >> 9) & 14, 2);
                            Boolean bool = (Boolean) mutableState.getValue();
                            bool.getClass();
                            CharSequence charSequence = m382rememberTextFieldStateLepunE.getValue$foundation().text;
                            boolean changed = ((i11 & 234881024) == 67108864) | gapComposer2.changed(mutableState) | gapComposer2.changed(m382rememberTextFieldStateLepunE);
                            Object rememberedValue3 = gapComposer2.rememberedValue();
                            if (changed) {
                                obj = obj2;
                            } else {
                                obj = obj2;
                            }
                            rememberedValue3 = new OffersSearchViewKt$OffersSearchView$1$1(function1, m382rememberTextFieldStateLepunE, mutableState, null, 1);
                            gapComposer2.updateRememberedValue(rememberedValue3);
                            Updater.LaunchedEffect(bool, charSequence, (Function2) rememberedValue3, gapComposer2);
                            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                            boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                            Role role = new Role(1);
                            boolean changed2 = gapComposer2.changed(mutableState);
                            Object rememberedValue4 = gapComposer2.rememberedValue();
                            if (changed2 || rememberedValue4 == obj) {
                                rememberedValue4 = new RealBadger2$$ExternalSyntheticLambda0(14, focusRequester, mutableState);
                                gapComposer2.updateRememberedValue(rememberedValue4);
                            }
                            Modifier m337toggleableoSLSa3U$default = SelectableKt.m337toggleableoSLSa3U$default(fillMaxWidth, booleanValue, z10, role, (Function1) rememberedValue4, 8);
                            z6 = z10;
                            Modifier padding = SpacerKt.padding(m337toggleableoSLSa3U$default, paddingValues4);
                            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer2, 48);
                            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, padding);
                            gapComposer2.startReusableNode();
                            if (gapComposer2.inserting) {
                                gapComposer2.createNode(function0);
                            } else {
                                gapComposer2.useNode();
                            }
                            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                            gapComposer2.startReplaceGroup(1872839256);
                            AnnotatedString.Builder builder = new AnnotatedString.Builder();
                            int pushStyle = builder.pushStyle(new SpanStyle(Strings.getColors(gapComposer2).semantic.text.standard, Strings.getTypography(gapComposer2).labelSmall.spanStyle.fontSize, Strings.getTypography(gapComposer2).labelSmall.spanStyle.fontWeight, (FontStyle) null, (FontSynthesis) null, Strings.getTypography(gapComposer2).labelSmall.spanStyle.fontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65496));
                            try {
                                builder.append(str);
                                builder.pop(pushStyle);
                                builder.append(" ");
                                gapComposer2.startReplaceGroup(1872853229);
                                pushStyle = builder.pushStyle(new SpanStyle(Strings.getColors(gapComposer2).semantic.text.subtle, Strings.getTypography(gapComposer2).bodySmall.spanStyle.fontSize, Strings.getTypography(gapComposer2).bodySmall.spanStyle.fontWeight, (FontStyle) null, (FontSynthesis) null, Strings.getTypography(gapComposer2).bodySmall.spanStyle.fontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65496));
                                try {
                                    builder.append(Room.stringResource(gapComposer2, R.string.local_views_special_instructions_add_note));
                                    builder.pop(pushStyle);
                                    gapComposer2.end(false);
                                    AnnotatedString annotatedString = builder.toAnnotatedString();
                                    gapComposer2.end(false);
                                    PaddingValues paddingValues5 = paddingValues4;
                                    Room.m1164Text25TpFw(2, 1, 0, 0, 1769472, 0, 3996, 0L, (Composer) gapComposer2, (Modifier) new LayoutWeightElement(1.0f, true), annotatedString, (TextStyle) null, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                                    LocalMapKt.UnlabeledLocalCheckbox(((Boolean) mutableState.getValue()).booleanValue(), null, null, null, z6, gapComposer2, ((i11 >> 3) & 57344) | 48, 12);
                                    gapComposer2.end(true);
                                    float f5 = f4;
                                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, f5, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                                    str5 = str2;
                                    AnimatedContentKt.AnimatedVisibility(ColumnScopeInstance.INSTANCE, ((Boolean) mutableState.getValue()).booleanValue(), m302paddingqDBjuR0$default, null, null, null, Expect_jvmKt.rememberComposableLambda(-1636827582, new AccountUiViewKt$$ExternalSyntheticLambda14(focusRequester, m382rememberTextFieldStateLepunE, z6, str5), gapComposer2), gapComposer2, 1572870, 28);
                                    gapComposer2.end(true);
                                    z5 = z9;
                                    gapComposer = gapComposer2;
                                    f3 = f5;
                                    paddingValues3 = paddingValues5;
                                } finally {
                                }
                            } finally {
                            }
                        }
                    }
                    z7 = z3;
                    f4 = f2;
                    paddingValues4 = paddingValues2;
                    i8 = i7;
                    gapComposer2.endDefaults();
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                    int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, modifier);
                    ComposeUiNode.Companion.getClass();
                    Function0 function02 = ComposeUiNode.Companion.Constructor;
                    if (applier != null) {
                    }
                } else {
                    str5 = str2;
                    gapComposer2.skipToGroupEnd();
                    gapComposer = gapComposer2;
                    z5 = z3;
                    f3 = f2;
                    z6 = z4;
                    paddingValues3 = paddingValues2;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final String str6 = str5;
                    endRestartGroup.block = new Function2() { // from class: app.cash.local.views.brand.checkout.LocalCheckoutNotesKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            ((Integer) obj4).getClass();
                            CheckoutTipSectionKt.m1306LocalCheckoutNotesgMrHQkA(Modifier.this, str, str6, str3, z5, z6, paddingValues3, f3, function1, (Composer) obj3, Updater.updateChangedFlags(i | 1), i2);
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            paddingValues2 = paddingValues;
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i6 = i3;
            if (gapComposer2.shouldExecute(i6 & 1, (i3 & 38347923) != 38347922)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z4 = z2;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        paddingValues2 = paddingValues;
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i6 = i3;
        if (gapComposer2.shouldExecute(i6 & 1, (i3 & 38347923) != 38347922)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void PaymentMethodHeader(String str, String str2, boolean z, Function0 function0, Composer composer, int i) {
        int i2;
        String str3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-651901881);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str2;
            i2 |= gapComposer.changed(str3) ? 32 : 16;
        } else {
            str3 = str2;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1639797380, new SignatureViewKt$$ExternalSyntheticLambda2(z, i3), gapComposer);
            int i4 = i2 << 3;
            LocalMapKt.InfoEntry((Modifier) null, str, str3, (Function2) null, rememberComposableLambda, function0, gapComposer, (i4 & 896) | (i4 & 112) | 24576 | ((i2 << 6) & 458752), 9);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckoutPaymentSectionKt$$ExternalSyntheticLambda9(str, str2, z, function0, i, 0);
        }
    }

    /* renamed from: PaymentMethodItem-G3d1Xqg, reason: not valid java name */
    public static final void m1307PaymentMethodItemG3d1Xqg(LocalCheckoutPaymentMethodViewModel localCheckoutPaymentMethodViewModel, String str, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        int i2;
        BlendModeColorFilter blendModeColorFilter;
        GapComposer gapComposer2;
        boolean z;
        char c;
        boolean z2;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(1643476522);
        Applier applier = gapComposer3.applier;
        int i3 = i | (gapComposer3.changedInstance(localCheckoutPaymentMethodViewModel) ? 4 : 2) | (gapComposer3.changed(str) ? 32 : 16) | (gapComposer3.changed(true) ? 256 : 128) | (gapComposer3.changedInstance(function1) ? 2048 : 1024);
        if (gapComposer3.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            gapComposer3.startReplaceGroup(-1167019341);
            boolean changedInstance = ((i3 & 7168) == 2048) | gapComposer3.changedInstance(localCheckoutPaymentMethodViewModel);
            Object rememberedValue = gapComposer3.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new StatusRunnable$$ExternalSyntheticLambda1(18, function1, localCheckoutPaymentMethodViewModel);
                gapComposer3.updateRememberedValue(rememberedValue);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(companion, false, null, null, (Function0) rememberedValue, 15);
            gapComposer3.end(false);
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(m183clickableoSLSa3U$default, RecyclerView.DECELERATION_RATE, 24.0f, 1);
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            Arrangement$End$1 arrangement$End$1 = SpacerKt.Start;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer3, 48);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, m300paddingVpY3zN4$default);
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
            Updater.m576setimpl(gapComposer3, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$14, 1.0f, true);
            RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer3, 54);
            int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, m);
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            LocalCheckoutPaymentMethodViewModel.Icon icon = localCheckoutPaymentMethodViewModel.icon;
            if (icon == null) {
                gapComposer3.startReplaceGroup(2120408557);
                gapComposer3.end(false);
                z = false;
                gapComposer2 = gapComposer3;
                c = '0';
                z2 = true;
            } else {
                gapComposer3.startReplaceGroup(2120408558);
                Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 11), 32.0f, 21.0f);
                switch (icon.ordinal()) {
                    case 0:
                        i2 = R.drawable.local_views_payment_method_cash_app;
                        break;
                    case 1:
                        i2 = R.drawable.local_views_google_pay_mark;
                        break;
                    case 2:
                        i2 = R.drawable.local_views_payment_method_visa;
                        break;
                    case 3:
                        i2 = R.drawable.local_views_payment_method_mastercard;
                        break;
                    case 4:
                        i2 = R.drawable.local_views_payment_method_amex;
                        break;
                    case 5:
                        i2 = R.drawable.local_views_payment_method_discover;
                        break;
                    case 6:
                        i2 = R.drawable.local_views_payment_method_diners;
                        break;
                    case 7:
                        zzd zzdVar = Icons.Companion;
                        i2 = R.drawable.icon_card_add_32;
                        break;
                    default:
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                }
                boolean z3 = false;
                Painter painterResource = Countries.painterResource(i2, 0, gapComposer3);
                if (icon == LocalCheckoutPaymentMethodViewModel.Icon.NEW_CARD) {
                    gapComposer3.startReplaceGroup(365355793);
                    Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    long j = colors.semantic.icon.standard;
                    BlendModeColorFilter blendModeColorFilter2 = new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5)));
                    z3 = false;
                    gapComposer3.end(false);
                    blendModeColorFilter = blendModeColorFilter2;
                } else {
                    gapComposer3.startReplaceGroup(365448328);
                    gapComposer3.end(false);
                    blendModeColorFilter = null;
                }
                gapComposer2 = gapComposer3;
                z = z3;
                c = '0';
                z2 = true;
                ImageKt.Image(painterResource, null, m287sizeVpY3zN4, null, ContentScale.Companion.Fit, RecyclerView.DECELERATION_RATE, blendModeColorFilter, gapComposer2, Painter.$stable | 25008, 40);
                gapComposer2.end(z);
            }
            GapComposer gapComposer4 = gapComposer2;
            boolean z4 = z;
            Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer4, (Modifier) companion, TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer2).bodySmall, 0L, 0L, new FontWeight(500), null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211), (TextLineBalancing) null, localCheckoutPaymentMethodViewModel.title, (Map) null, (Function1) null, false);
            GapComposer gapComposer5 = gapComposer4;
            String str2 = localCheckoutPaymentMethodViewModel.subtitle;
            if (str2 == null) {
                gapComposer5.startReplaceGroup(2121705504);
                gapComposer5.end(z4);
            } else {
                gapComposer5.startReplaceGroup(2121705505);
                Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer5).semantic.text.subtle, (Composer) gapComposer5, SpacerKt.m302paddingqDBjuR0$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), Strings.getTypography(gapComposer5).bodySmall, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer5 = gapComposer5;
                gapComposer5.end(z4);
            }
            gapComposer5.end(true);
            GapComposer gapComposer6 = gapComposer5;
            ModalKt.Radio(Intrinsics.areEqual(str, localCheckoutPaymentMethodViewModel.token), SpacerKt.m302paddingqDBjuR0$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), null, true, null, gapComposer6, ((i3 << 3) & 7168) | 48, 20);
            gapComposer = gapComposer6;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer3;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MenuKt$$ExternalSyntheticLambda1(localCheckoutPaymentMethodViewModel, str, function1, i, 15);
        }
    }

    public static final void SelectionDiscountLine(LocalCartSummaryLineViewModel.Discount discount, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2054677751);
        int i2 = i | (gapComposer.changedInstance(discount) ? 4 : 2);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(4.0f, false, null), Alignment.Companion.Top, gapComposer, 0);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.success, (Composer) gapComposer, (Modifier) Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier, 1.0f, true), Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, discount.text, (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.success, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, discount.amount, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HintHandler$$ExternalSyntheticLambda0(discount, i, 21);
        }
    }

    /* renamed from: SelectionTotalAmount-XO-JAsU, reason: not valid java name */
    public static final void m1308SelectionTotalAmountXOJAsU(String str, String str2, long j, Composer composer, int i) {
        int i2;
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2141739788);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(str2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(j) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(4.0f, false, null), Alignment.Companion.Top, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
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
            if (str == null) {
                gapComposer.startReplaceGroup(-1645965399);
                gapComposer.end(false);
                i3 = i2;
            } else {
                gapComposer.startReplaceGroup(-1645965398);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                i3 = i2;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.subtle, (Composer) gapComposer, (Modifier) null, TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall, 0L, 0L, null, null, 0L, null, 0L, TextDecoration.LineThrough, null, null, 0, 0L, null, null, 0, 16773119), (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, ((i3 >> 3) & 14) | ((i3 << 3) & 7168), 0, 4082, j, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetScope$$ExternalSyntheticLambda13(i, 3, j, str, str2);
        }
    }

    public static final void SinglePaymentMethodSection(String str, LocalCheckoutPaymentMethodViewModel localCheckoutPaymentMethodViewModel, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1093615100);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(localCheckoutPaymentMethodViewModel) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            Room.m1165Text25TpFw(0, 0, 0, 0, (i2 & 14) | 48, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7), Strings.getTypography(gapComposer).sectionTitle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).listNumber, (TextLineBalancing) null, localCheckoutPaymentMethodViewModel.title, (Map) null, (Function1) null, false);
            String str2 = localCheckoutPaymentMethodViewModel.subtitle;
            if (str2 == null) {
                gapComposer.startReplaceGroup(1407264690);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1407264691);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            re$$ExternalSyntheticOutline0.m(companion, 24.0f, gapComposer, true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda1(str, localCheckoutPaymentMethodViewModel, i, 10);
        }
    }

    public static final void SummaryRows(final LocalCheckoutOrderSummaryViewModel localCheckoutOrderSummaryViewModel, Composer composer, final int i) {
        int i2;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(725965499);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(localCheckoutOrderSummaryViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 1;
        final int i4 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            String str = localCheckoutOrderSummaryViewModel.subtotalAmount;
            List list = localCheckoutOrderSummaryViewModel.summaryLines;
            if (list.isEmpty() && str == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    function2 = new Function2() { // from class: app.cash.local.views.brand.checkout.CheckoutOrderSummarySectionKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i4;
                            int i6 = i;
                            LocalCheckoutOrderSummaryViewModel localCheckoutOrderSummaryViewModel2 = localCheckoutOrderSummaryViewModel;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    CheckoutTipSectionKt.SummaryRows(localCheckoutOrderSummaryViewModel2, composer2, Updater.updateChangedFlags(i6 | 1));
                                    break;
                                default:
                                    CheckoutTipSectionKt.SummaryRows(localCheckoutOrderSummaryViewModel2, composer2, Updater.updateChangedFlags(i6 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 24.0f));
            gapComposer.startReplaceGroup(1868152837);
            int size = list.size();
            int i5 = 0;
            while (true) {
                float f = RecyclerView.DECELERATION_RATE;
                if (i5 >= size) {
                    break;
                }
                KeyValue keyValue = (KeyValue) list.get(i5);
                if (((i5 < list.size() - i3 || str != null) ? i3 : 0) != 0) {
                    f = 8.0f;
                }
                LocalMapKt.KeyValueRow(SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f, 7), keyValue, gapComposer, 0, 0);
                i5++;
                i3 = 1;
            }
            gapComposer.end(false);
            if (str == null) {
                gapComposer.startReplaceGroup(2078475952);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(2078475953);
                LocalMapKt.KeyValueRow(SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 7), new KeyValue(Room.stringResource(gapComposer, R.string.local_views_subtotal), str, 4, false), gapComposer, 0, 0);
                gapComposer.end(false);
            }
            gapComposer.startReplaceGroup(2078733097);
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final int i6 = 1;
            function2 = new Function2() { // from class: app.cash.local.views.brand.checkout.CheckoutOrderSummarySectionKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = i6;
                    int i62 = i;
                    LocalCheckoutOrderSummaryViewModel localCheckoutOrderSummaryViewModel2 = localCheckoutOrderSummaryViewModel;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i52) {
                        case 0:
                            CheckoutTipSectionKt.SummaryRows(localCheckoutOrderSummaryViewModel2, composer2, Updater.updateChangedFlags(i62 | 1));
                            break;
                        default:
                            CheckoutTipSectionKt.SummaryRows(localCheckoutOrderSummaryViewModel2, composer2, Updater.updateChangedFlags(i62 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    /* renamed from: TipDivider-8Feqmps, reason: not valid java name */
    public static final void m1309TipDivider8Feqmps(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1146675726);
        int i2 = (gapComposer.changed(1.0f) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(SizeKt.fillMaxHeight(SizeKt.m290width3ABfNKs(Modifier.Companion.$$INSTANCE, 1.0f), 1.0f), 48.0f, RecyclerView.DECELERATION_RATE, 2);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(m279heightInVpY3zN4$default, colors.semantic.border.subtle, ColorKt.RectangleShape), gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Savers_androidKt$$ExternalSyntheticLambda0(i, 15);
        }
    }

    public static final void TipOptionItem(int i, Composer composer, String str, Function0 function0, boolean z) {
        int i2;
        long j;
        boolean z2;
        long j2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1916440691);
        Applier applier = gapComposer.applier;
        int i3 = i & 6;
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        if (i3 == 0) {
            i2 = (gapComposer.changed(rowScopeInstance) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed((Object) null) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            Object obj = (FocusOwnerImpl) gapComposer.consume(CompositionLocalsKt.LocalFocusManager);
            Object obj2 = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(rowScopeInstance.weight(1.0f, companion, true), 48.0f, RecyclerView.DECELERATION_RATE, 2);
            if (z) {
                gapComposer.startReplaceGroup(-315261945);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.background.inverse;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-315185468);
                gapComposer.end(false);
                j = Color.Transparent;
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(m279heightInVpY3zN4$default, j, ColorKt.RectangleShape);
            Role role = new Role(3);
            boolean changedInstance = ((i2 & 57344) == 16384) | gapComposer.changedInstance(obj) | gapComposer.changed(obj2);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new n$$ExternalSyntheticLambda1(16, obj, obj2, function0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier m335selectableoSLSa3U$default = SelectableKt.m335selectableoSLSa3U$default(m177backgroundbw27NRU, z, false, role, (Function0) rememberedValue, 10);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m335selectableoSLSa3U$default);
            ComposeUiNode.Companion.getClass();
            Function0 function02 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function02);
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
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer, 54);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function02);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            if (z) {
                gapComposer.startReplaceGroup(-993833363);
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    z2 = false;
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    z2 = false;
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j2 = colors2.semantic.text.inverse;
                gapComposer.end(z2);
            } else {
                z2 = false;
                gapComposer.startReplaceGroup(-993765876);
                Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j2 = colors3.semantic.text.standard;
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, (i2 >> 3) & 14, 0, 4082, j2, (Composer) gapComposer, (Modifier) null, TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium, 0L, Room.getSp(14), null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777213), (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer.startReplaceGroup(-993540538);
            gapComposer.end(z2);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckoutTipSectionKt$$ExternalSyntheticLambda16(str, z, function0, i, 0);
        }
    }

    public static final void TipOptionsGroup(Modifier modifier, List list, boolean z, Function1 function1, Function0 function0, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1570691464);
        int i2 = i | 6 | (gapComposer.changedInstance(list) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128) | (gapComposer.changedInstance(function1) ? 2048 : 1024) | (gapComposer.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Object obj = DefaultSizes.border.entries;
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.border.subtle;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier selectableGroup = SelectableKt.selectableGroup(ImageKt.m178borderxT4_qwU(ClipKt.clip(SizeKt.fillMaxWidth(companion, 1.0f), m340RoundedCornerShape0680j_4), 1.0f, j, m340RoundedCornerShape0680j_4));
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, selectableGroup);
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
            gapComposer.startReplaceGroup(-176921427);
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                TipOption tipOption = (TipOption) list.get(i3);
                if (i3 > 0) {
                    gapComposer.startReplaceGroup(-1838304652);
                    m1309TipDivider8Feqmps(gapComposer, 0);
                } else {
                    gapComposer.startReplaceGroup(-1152833805);
                }
                gapComposer.end(false);
                String str = tipOption.label;
                boolean z2 = tipOption.selected;
                boolean changed = ((i2 & 7168) == 2048) | gapComposer.changed(i3);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new TabContentViewKt$$ExternalSyntheticLambda18(i3, 2, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                TipOptionItem(6, gapComposer, str, (Function0) rememberedValue, z2);
            }
            gapComposer.end(false);
            m1309TipDivider8Feqmps(gapComposer, 0);
            TipOptionItem((i2 & 57344) | ((i2 << 3) & 7168) | 390, gapComposer, Room.stringResource(gapComposer, R.string.local_views_tip_other), function0, z);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda30(modifier2, list, z, function1, function0, i);
        }
    }

    public static final ComposableLambdaImpl helperText(InputError inputError, int i) {
        if (inputError instanceof InputError.TextTooLong) {
            return new ComposableLambdaImpl(new BadgedAvatarKt$$ExternalSyntheticLambda4(i, inputError, 2), true, -1147936813);
        }
        if (inputError instanceof InputError.ValueMissing) {
            return new ComposableLambdaImpl(new SliderDefaults$$ExternalSyntheticLambda3(inputError, 4), true, -1877324470);
        }
        if (inputError == null) {
            return null;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final boolean isError(InputError inputError, int i) {
        if (inputError instanceof InputError.TextTooLong) {
            return i > ((InputError.TextTooLong) inputError).maxLength;
        }
        if (inputError instanceof InputError.ValueMissing) {
            return i == 0;
        }
        if (inputError == null) {
            return false;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0029, code lost:
    
        if (r3 == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String selectedPaymentMethodLabel(LocalCheckoutPaymentSectionViewModel localCheckoutPaymentSectionViewModel, String str) {
        List list = localCheckoutPaymentSectionViewModel.paymentMethods;
        String str2 = localCheckoutPaymentSectionViewModel.selectedPaymentMethodToken;
        Iterator it = list.iterator();
        boolean z = false;
        Object obj = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (Intrinsics.areEqual(((LocalCheckoutPaymentMethodViewModel) next).token, str2)) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj = next;
                }
            }
        }
        obj = null;
        if (obj != null) {
            LocalCheckoutPaymentMethodViewModel localCheckoutPaymentMethodViewModel = (LocalCheckoutPaymentMethodViewModel) obj;
            return CollectionsKt.joinToString$default(ArraysKt___ArraysKt.filterNotNull(new String[]{localCheckoutPaymentMethodViewModel.title, localCheckoutPaymentMethodViewModel.subtitle}), str, null, null, 0, null, null, 62);
        }
        Path$$ExternalSyntheticBUOutline0.m$1((Object) CameraSelector$$ExternalSyntheticOutline0.m("No payment method matching the token ", PaymentMethodToken.m1282toStringimpl(str2), " in ", CollectionsKt.joinToString$default(localCheckoutPaymentSectionViewModel.paymentMethods, null, null, null, 0, null, new LocationMenu$$ExternalSyntheticLambda6(7), 31)));
        return null;
    }
}
