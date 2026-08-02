package com.squareup.cash.afterpayapplet.views;

import androidx.camera.core.processing.TargetUtils;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.internal.DebugUtils;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.SliderKt$$ExternalSyntheticLambda9;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda4;
import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Latch$await$2$2;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ContentScale$Companion$Fit$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnFirstVisibleElement;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.local.presenters.RealBrandFollowPresenter$models$2$1$1;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda6;
import app.cash.local.views.internal.DismissableToastKt$$ExternalSyntheticLambda4;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda1;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda6;
import app.cash.local.views.sheet.EducationalSheetKt$$ExternalSyntheticLambda18;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.CombinedModifier$$ExternalSyntheticLambda0;
import bo.app.re$$ExternalSyntheticOutline0;
import bo.app.y0$$ExternalSyntheticLambda0;
import coil3.compose.AsyncImageKt;
import coil3.compose.internal.UtilsKt$$ExternalSyntheticLambda0;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.bugsnag.android.MarshalledEventSource;
import com.google.mlkit.common.internal.zzd;
import com.google.mlkit.vision.text.zzb;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.components.ProfilePreviewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.activity.viewmodels.FullScreenActivityViewModel;
import com.squareup.cash.activity.views.ActivityTabViewKt$$ExternalSyntheticLambda17;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda5;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda9;
import com.squareup.cash.activity.views.SectionHeaderScope$$ExternalSyntheticLambda1;
import com.squareup.cash.activity.views.receipts.ReceiptUiKt$$ExternalSyntheticLambda3;
import com.squareup.cash.activity.views.receipts.ReceiptUiKt$$ExternalSyntheticLambda4;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletInfoSheetViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletMerchantSheetViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletPurchasesEmbeddedViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletUpsellSheetViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpaySearchViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.FooterSection;
import com.squareup.cash.afterpayapplet.viewmodels.Loading;
import com.squareup.cash.afterpayapplet.viewmodels.TappableIcon;
import com.squareup.cash.afterpayapplet.views.homesection.IconTextSectionKt;
import com.squareup.cash.afterpayapplet.views.homesection.LegalSectionKt;
import com.squareup.cash.afterpayapplet.views.homesection.RetroSectionKt;
import com.squareup.cash.afterpayapplet.views.homesection.v3.AfterpayCardKt;
import com.squareup.cash.amountchooser.views.AtmPickerGridKt$$ExternalSyntheticLambda4;
import com.squareup.cash.app.api.ContextKt$$ExternalSyntheticLambda1;
import com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda8;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Motion;
import com.squareup.cash.arcade.MotionKt;
import com.squareup.cash.arcade.MotionKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.CopyCodeKt;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda10;
import com.squareup.cash.arcade.components.DividerKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.FilterBarKt;
import com.squareup.cash.arcade.components.LazyScaffoldContentScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.arcade.components.SearchBarKt;
import com.squareup.cash.arcade.components.SegmentedControlKt$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda8;
import com.squareup.cash.arcade.components.avatar.AvatarCarouselEntry;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.list.ListOrderedKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.treehouse.ButtonBinding$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.treehouse.SearchBarBinding$Content$1$1;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda13;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.borrow.presenters.RepayCustomAmountPickerPresenter$models$1$1$1;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda10;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.earnings.views.home.EarningsHeaderKt$$ExternalSyntheticLambda14;
import com.squareup.cash.formview.components.arcade.ArcadeFormDateInputView$Content$7$1;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.money.viewmodels.api.Section;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda14;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.moneybot.views.home.MoneybotHomeViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.moneybot.views.message.MoneybotMessageUiKt$$ExternalSyntheticLambda15;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.offers.views.OffersMessageViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.views.sup.OffersNotificationKt$$ExternalSyntheticLambda3;
import com.squareup.cash.offers.views.sup.OffersNotificationKt$OffersNotification$2$1$1;
import com.squareup.cash.offers.views.sup.OffersNotificationKt$OffersNotification$5$1;
import com.squareup.cash.payments.views.DuplicatePaymentViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.payments.views.NoteInputViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$2$2$1$1;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.sheet.ComposeBottomSheetKt;
import com.squareup.cash.ui.ArcadeBottomSheetStyle;
import com.squareup.cash.ui.BottomSheetConfig;
import com.squareup.cash.ui.widget.StackedAvatarViewModelKt;
import com.squareup.cash.ui.widget.text.AnimatedAmountTextView;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.squareup.wire.internal.ReflectionKt;
import com.stripe.android.uicore.elements.TextFieldUIKt$onPreviewKeyEvent$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.Tags;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import squareup.cash.savings.ArcadeElement;

/* loaded from: classes5.dex */
public abstract class AfterpaySearchViewKt {

    /* renamed from: lambda$-781489412, reason: not valid java name */
    public static final ComposableLambdaImpl f134lambda$781489412;

    /* renamed from: lambda$-1307290849, reason: not valid java name */
    public static final ComposableLambdaImpl f132lambda$1307290849 = new ComposableLambdaImpl(new AfterpaySearchViewKt$$ExternalSyntheticLambda16(11), false, -1307290849);

    /* renamed from: lambda$-1756839187, reason: not valid java name */
    public static final ComposableLambdaImpl f133lambda$1756839187 = new ComposableLambdaImpl(new AfterpaySearchViewKt$$ExternalSyntheticLambda16(12), false, -1756839187);
    public static final ComposableLambdaImpl lambda$682450118 = new ComposableLambdaImpl(new AfterpaySearchViewKt$$ExternalSyntheticLambda16(13), false, 682450118);

    /* renamed from: lambda$-1116902550, reason: not valid java name */
    public static final ComposableLambdaImpl f131lambda$1116902550 = new ComposableLambdaImpl(new AfterpaySearchViewKt$$ExternalSyntheticLambda16(14), false, -1116902550);

    static {
        new ComposableLambdaImpl(new ReceiptUiKt$$ExternalSyntheticLambda4(14), false, 1244765558);
        new ComposableLambdaImpl(new ReceiptUiKt$$ExternalSyntheticLambda4(4), false, 1873881013);
        new ComposableLambdaImpl(new ReceiptUiKt$$ExternalSyntheticLambda4(5), false, 1294900444);
        new ComposableLambdaImpl(new ReceiptUiKt$$ExternalSyntheticLambda4(6), false, -1120913182);
        new ComposableLambdaImpl(new ReceiptUiKt$$ExternalSyntheticLambda4(7), false, -620573913);
        new ComposableLambdaImpl(new ReceiptUiKt$$ExternalSyntheticLambda4(8), false, 651096391);
        f134lambda$781489412 = new ComposableLambdaImpl(new ReceiptUiKt$$ExternalSyntheticLambda4(9), false, -781489412);
        new ComposableLambdaImpl(new ReceiptUiKt$$ExternalSyntheticLambda4(10), false, 1781884938);
        new ComposableLambdaImpl(new ReceiptUiKt$$ExternalSyntheticLambda4(11), false, -2120049236);
        new ComposableLambdaImpl(new ReceiptUiKt$$ExternalSyntheticLambda4(12), false, 925369705);
        new ComposableLambdaImpl(new ReceiptUiKt$$ExternalSyntheticLambda4(13), false, 2043107033);
    }

    public static final void AfterpayAppletActivityEmbeddedList(FullScreenActivityViewModel fullScreenActivityViewModel, FooterSection footerSection, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1914814064);
        int i2 = i | (gapComposer2.changedInstance(fullScreenActivityViewModel) ? 4 : 2) | (gapComposer2.changedInstance(footerSection) ? 32 : 16) | (gapComposer2.changedInstance(function1) ? 256 : 128);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Modifier statusBarsPadding = SpacerKt.statusBarsPadding(SpacerKt.navigationBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape)));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, statusBarsPadding);
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
            gapComposer2.startReplaceGroup(446138127);
            String str = fullScreenActivityViewModel.title;
            boolean z = (i2 & 896) == 256;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ReceiptUiKt$$ExternalSyntheticLambda3(8, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            AppletTitleBar(null, str, null, (Function0) rememberedValue, null, gapComposer2, 0, 21);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
            gapComposer2.end(false);
            gapComposer2.startReplaceGroup(446331102);
            AvatarsKt.ActivityScrollableEmbeddedView(fullScreenActivityViewModel.activityEmbeddedViewModel, new LayoutWeightElement(1.0f, true), (LazyListState) null, (PaddingValues) null, (Function3) null, Expect_jvmKt.rememberComposableLambda(1397331755, new AtmPickerGridKt$$ExternalSyntheticLambda4(5, footerSection, function1), gapComposer2), (Function3) null, gapComposer2, 12582912, 380);
            gapComposer = gapComposer2;
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InlineAppMessageKt$$ExternalSyntheticLambda8((Object) fullScreenActivityViewModel, (Object) footerSection, function1, i, 5);
        }
    }

    public static final void AfterpayAppletError(String str, String str2, String str3, String str4, String str5, Function0 function0, Function0 function02, Function0 function03, Composer composer, int i, int i2) {
        int i3;
        String str6;
        int i4;
        Function0 function04;
        int i5;
        GapComposer gapComposer;
        String str7;
        Function0 function05;
        Modifier modifier;
        Modifier.Companion companion;
        TappableIcon tappableIcon;
        String str8;
        str2.getClass();
        str3.getClass();
        str4.getClass();
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-174218949);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i3 = i | (gapComposer2.changed(str) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i6 = i3 | (gapComposer2.changed(str2) ? 32 : 16) | (gapComposer2.changed(str3) ? 256 : 128) | (gapComposer2.changed(str4) ? 2048 : 1024);
        int i7 = i2 & 16;
        if (i7 != 0) {
            i4 = i6 | 24576;
            str6 = str5;
        } else {
            str6 = str5;
            i4 = i6 | (gapComposer2.changed(str6) ? 16384 : PKIFailureInfo.certRevoked);
        }
        int i8 = i4 | (gapComposer2.changedInstance(function0) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer2.changedInstance(function02) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        int i9 = i2 & 128;
        if (i9 != 0) {
            i5 = i8 | 12582912;
            function04 = function03;
        } else {
            function04 = function03;
            i5 = i8 | (gapComposer2.changedInstance(function04) ? 8388608 : 4194304);
        }
        if (gapComposer2.shouldExecute(i5 & 1, (i5 & 4793491) != 4793490)) {
            if (i7 != 0) {
                str6 = null;
            }
            Function0 function06 = i9 != 0 ? null : function04;
            int i10 = i5;
            long j = Strings.getColors(gapComposer2).semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(companion2, j, rectangleShapeKt$RectangleShape$1), 1.0f));
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, systemBarsPadding);
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
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            String str9 = str6;
            Modifier align = BoxScopeInstance.INSTANCE.align(companion2, Alignment.Companion.TopCenter);
            if (function06 != null) {
                zzd zzdVar = Icons.Companion;
                if (str9 == null) {
                    modifier = align;
                    str8 = "";
                } else {
                    modifier = align;
                    str8 = str9;
                }
                TappableIcon tappableIcon2 = new TappableIcon("7pZsFc", null, str8);
                companion = companion2;
                tappableIcon = tappableIcon2;
            } else {
                modifier = align;
                companion = companion2;
                tappableIcon = null;
            }
            boolean z = (i10 & 29360128) == 8388608;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new y0$$ExternalSyntheticLambda0(18, function06);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            int i11 = i10 >> 6;
            Modifier.Companion companion3 = companion;
            AppletTitleBar(modifier, str, tappableIcon, function0, (Function0) rememberedValue, gapComposer2, ((i10 << 3) & 112) | (i11 & 7168), 0);
            gapComposer = gapComposer2;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion3, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            Room.m1165Text25TpFw(0, 0, 0, 3, (i10 >> 3) & 14, 0, 3826, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion3, 1.0f), 4.0f));
            Room.m1165Text25TpFw(0, 0, 0, 3, i11 & 14, 0, 3826, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            coil3.size.SizeKt.Button(function02, null, null, false, false, null, Expect_jvmKt.rememberComposableLambda(-1246970190, new LocalHomeViewKt$$ExternalSyntheticLambda1(str4, 14), gapComposer), gapComposer, ((i10 >> 18) & 14) | 1572864, 62);
            gapComposer.end(true);
            gapComposer.end(true);
            function05 = function06;
            str7 = str9;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            str7 = str6;
            function05 = function04;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ToastKt$$ExternalSyntheticLambda8(str, str2, str3, str4, str7, function0, function02, function05, i, i2);
        }
    }

    public static final void AfterpayAppletFooter(FooterSection footerSection, Function2 function2, Composer composer, int i) {
        boolean z;
        footerSection.getClass();
        function2.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(767654138);
        int i2 = i | (gapComposer.changedInstance(footerSection) ? 4 : 2) | (gapComposer.changedInstance(function2) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth, 32.0f, RecyclerView.DECELERATION_RATE, 32.0f, 16.0f, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
            String str = footerSection.iconId;
            if (str == null) {
                gapComposer.startReplaceGroup(-876284453);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-876284452);
                Icons.Companion.getClass();
                Icons icons = zzd.get(str);
                if (icons == null) {
                    gapComposer.startReplaceGroup(543374921);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(543374922);
                    Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, Strings.getColors(gapComposer).semantic.icon.standard, gapComposer, 48, 4);
                    gapComposer.end(false);
                }
                re$$ExternalSyntheticOutline0.m(companion, 12.0f, gapComposer, false);
            }
            String str2 = footerSection.text;
            if (str2 == null) {
                gapComposer.startReplaceGroup(-876022937);
                gapComposer.end(false);
                z = true;
            } else {
                gapComposer.startReplaceGroup(-876022936);
                LazyDslKt.m304MarkdownTextpCuZGqc(str2, function2, null, Strings.getTypography(gapComposer).bodyXSmall, Strings.getColors(gapComposer).semantic.text.subtle, null, null, null, 0, 0, 3, gapComposer, i2 & 112, 996);
                gapComposer.end(false);
                z = true;
            }
            gapComposer.end(z);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AtmPickerGridKt$$ExternalSyntheticLambda4(footerSection, function2, i, 6);
        }
    }

    public static final void AfterpayAppletHomeLoaded(final AfterpayAppletHomeContentViewModel afterpayAppletHomeContentViewModel, final Function1 function1, final boolean z, final boolean z2, Composer composer, int i) {
        GapComposer gapComposer;
        boolean z3;
        Colors colors;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(234750763);
        int i2 = i | (gapComposer2.changedInstance(afterpayAppletHomeContentViewModel) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16) | (gapComposer2.changed(z) ? 256 : 128) | (gapComposer2.changed(z2) ? 2048 : 1024);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            AfterpayAppletHomeContentViewModel.HomeSection homeSection = (AfterpayAppletHomeContentViewModel.HomeSection) CollectionsKt.firstOrNull((List) afterpayAppletHomeContentViewModel.homeSections);
            AfterpayAppletHomeContentViewModel.HomeSection.SectionContent sectionContent = homeSection != null ? homeSection.content : null;
            final boolean z4 = sectionContent instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection;
            boolean z5 = z4 || (sectionContent instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayHeroUpsell);
            final boolean z6 = sectionContent instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayHeroUpsell;
            boolean z7 = z6 && afterpayAppletHomeContentViewModel.homeSections.size() == 2;
            final SpringSpec soft$default = TargetUtils.soft$default((zzb) ((Motion) gapComposer2.consume(MotionKt.LocalMotion)).springs.text);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(null);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState = (MutableState) rememberedValue;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Updater.mutableStateOf$default(EmptyList.INSTANCE);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            final MutableState mutableState2 = (MutableState) rememberedValue2;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = Updater.mutableStateOf$default(null);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            final MutableState mutableState3 = (MutableState) rememberedValue3;
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            final MutableState mutableState4 = (MutableState) rememberedValue4;
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue5);
            }
            final MutableState mutableState5 = (MutableState) rememberedValue5;
            boolean z8 = afterpayAppletHomeContentViewModel.isRefreshing;
            Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors2 == null) {
                z3 = z7;
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                z3 = z7;
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
                colors = colors2;
            }
            Modifier fillMaxSize = SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, ColorKt.RectangleShape), 1.0f);
            int i3 = i2 & 112;
            boolean changedInstance = gapComposer2.changedInstance(afterpayAppletHomeContentViewModel) | (i3 == 32);
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = new BalanceFeedKt$$ExternalSyntheticLambda5(15, afterpayAppletHomeContentViewModel, function1);
                gapComposer2.updateRememberedValue(rememberedValue6);
            }
            Modifier onVisible$default = VisibleKt.onVisible$default(fillMaxSize, (Function0) rememberedValue6);
            String stringResource = Room.stringResource(gapComposer2, R.string.afterpay_applet_pull_to_refresh_label);
            boolean z9 = i3 == 32;
            Object rememberedValue7 = gapComposer2.rememberedValue();
            if (z9 || rememberedValue7 == neverEqualPolicy) {
                rememberedValue7 = new ReceiptUiKt$$ExternalSyntheticLambda3(16, function1);
                gapComposer2.updateRememberedValue(rememberedValue7);
            }
            final boolean z10 = z3;
            final boolean z11 = z5;
            gapComposer = gapComposer2;
            VisibleKt.PullToRefresh(196608, 8, gapComposer, Expect_jvmKt.rememberComposableLambda(-1286281536, new Function2() { // from class: com.squareup.cash.afterpayapplet.views.AfterpayAppletHomeViewKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    LazyListState lazyListState;
                    SpringSpec springSpec;
                    AfterpayAppletHomeContentViewModel afterpayAppletHomeContentViewModel2;
                    boolean z12;
                    LazyListState lazyListState2;
                    Composer composer2 = (Composer) obj;
                    int intValue = ((Integer) obj2).intValue();
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                        LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 3, gapComposer3);
                        Object rememberedValue8 = gapComposer3.rememberedValue();
                        Object obj3 = Composer.Companion.Empty;
                        if (rememberedValue8 == obj3) {
                            rememberedValue8 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer3);
                            gapComposer3.updateRememberedValue(rememberedValue8);
                        }
                        final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue8;
                        Object rememberedValue9 = gapComposer3.rememberedValue();
                        boolean z13 = z6;
                        if (rememberedValue9 == obj3) {
                            rememberedValue9 = Updater.derivedStateOf(new MoneybotHomeViewKt$$ExternalSyntheticLambda0(z13, rememberLazyListState, 1));
                            gapComposer3.updateRememberedValue(rememberedValue9);
                        }
                        State state = (State) rememberedValue9;
                        AfterpayAppletHomeContentViewModel afterpayAppletHomeContentViewModel3 = AfterpayAppletHomeContentViewModel.this;
                        String str = afterpayAppletHomeContentViewModel3.scrollToId;
                        boolean changedInstance2 = gapComposer3.changedInstance(afterpayAppletHomeContentViewModel3) | gapComposer3.changedInstance(coroutineScope) | gapComposer3.changed(rememberLazyListState);
                        SpringSpec springSpec2 = soft$default;
                        boolean changed = changedInstance2 | gapComposer3.changed(springSpec2);
                        boolean z14 = z4;
                        boolean changed2 = changed | gapComposer3.changed(z14);
                        Object rememberedValue10 = gapComposer3.rememberedValue();
                        if (changed2 || rememberedValue10 == obj3) {
                            lazyListState = rememberLazyListState;
                            Object arcadeFormDateInputView$Content$7$1 = new ArcadeFormDateInputView$Content$7$1(afterpayAppletHomeContentViewModel3, coroutineScope, lazyListState, springSpec2, z14, (Continuation) null);
                            springSpec = springSpec2;
                            afterpayAppletHomeContentViewModel2 = afterpayAppletHomeContentViewModel3;
                            z12 = z14;
                            gapComposer3.updateRememberedValue(arcadeFormDateInputView$Content$7$1);
                            rememberedValue10 = arcadeFormDateInputView$Content$7$1;
                        } else {
                            lazyListState = rememberLazyListState;
                            springSpec = springSpec2;
                            afterpayAppletHomeContentViewModel2 = afterpayAppletHomeContentViewModel3;
                            z12 = z14;
                        }
                        Updater.LaunchedEffect(gapComposer3, str, (Function2) rememberedValue10);
                        final Density density = (Density) gapComposer3.consume(CompositionLocalsKt.LocalDensity);
                        Object rememberedValue11 = gapComposer3.rememberedValue();
                        if (rememberedValue11 == obj3) {
                            rememberedValue11 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer3);
                        }
                        final ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue11;
                        Object rememberedValue12 = gapComposer3.rememberedValue();
                        if (rememberedValue12 == obj3) {
                            rememberedValue12 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer3);
                        }
                        final ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) rememberedValue12;
                        Object rememberedValue13 = gapComposer3.rememberedValue();
                        if (rememberedValue13 == obj3) {
                            rememberedValue13 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer3);
                        }
                        final ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3 = (ParcelableSnapshotMutableIntState) rememberedValue13;
                        WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                        final int i4 = Arrangement$End$1.current(gapComposer3).statusBars.getInsets$foundation_layout().top;
                        float mo236toPx0680j_4 = density.mo236toPx0680j_4(100.0f);
                        PaddingValuesImpl m295PaddingValuesYgX7TsA$default = SpacerKt.m295PaddingValuesYgX7TsA$default(RecyclerView.DECELERATION_RATE, 16.0f, 1);
                        Object rememberedValue14 = gapComposer3.rememberedValue();
                        if (rememberedValue14 == obj3) {
                            rememberedValue14 = new MoneyTabUIKt$$ExternalSyntheticLambda14(8, parcelableSnapshotMutableIntState);
                            gapComposer3.updateRememberedValue(rememberedValue14);
                        }
                        Modifier onGloballyPositioned = ValueInsets.onGloballyPositioned(Modifier.Companion.$$INSTANCE, (Function1) rememberedValue14);
                        final Function1 function12 = function1;
                        final LazyListState lazyListState3 = lazyListState;
                        SliderKt$$ExternalSyntheticLambda9 sliderKt$$ExternalSyntheticLambda9 = new SliderKt$$ExternalSyntheticLambda9(z12, afterpayAppletHomeContentViewModel2, function12, z13, lazyListState3, mo236toPx0680j_4, parcelableSnapshotMutableIntState3, state);
                        final boolean z15 = z12;
                        final AfterpayAppletHomeContentViewModel afterpayAppletHomeContentViewModel4 = afterpayAppletHomeContentViewModel2;
                        ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1237963510, sliderKt$$ExternalSyntheticLambda9, gapComposer3);
                        boolean changed3 = gapComposer3.changed(function12) | gapComposer3.changed(z15) | gapComposer3.changedInstance(afterpayAppletHomeContentViewModel4);
                        final boolean z16 = z10;
                        boolean changed4 = changed3 | gapComposer3.changed(z16);
                        final boolean z17 = z11;
                        boolean changed5 = changed4 | gapComposer3.changed(z17);
                        final boolean z18 = z2;
                        boolean changed6 = changed5 | gapComposer3.changed(z18);
                        final boolean z19 = z;
                        boolean changed7 = changed6 | gapComposer3.changed(z19) | gapComposer3.changedInstance(coroutineScope) | gapComposer3.changed(lazyListState3) | gapComposer3.changed(springSpec) | gapComposer3.changed(density) | gapComposer3.changed(i4);
                        Object rememberedValue15 = gapComposer3.rememberedValue();
                        if (changed7 || rememberedValue15 == obj3) {
                            final MutableState mutableState6 = mutableState;
                            final MutableState mutableState7 = mutableState2;
                            final MutableState mutableState8 = mutableState3;
                            final MutableState mutableState9 = mutableState4;
                            final MutableState mutableState10 = mutableState5;
                            final SpringSpec springSpec3 = springSpec;
                            Object obj4 = new Function1() { // from class: com.squareup.cash.afterpayapplet.views.AfterpayAppletHomeViewKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    LazyScaffoldContentScope lazyScaffoldContentScope = (LazyScaffoldContentScope) obj5;
                                    lazyScaffoldContentScope.getClass();
                                    final Function1 function13 = function12;
                                    final SwipeToDismissKt$$ExternalSyntheticLambda4 swipeToDismissKt$$ExternalSyntheticLambda4 = new SwipeToDismissKt$$ExternalSyntheticLambda4(16, function13);
                                    boolean z20 = z15;
                                    final AfterpayAppletHomeContentViewModel afterpayAppletHomeContentViewModel5 = afterpayAppletHomeContentViewModel4;
                                    if (z20) {
                                        LazyListScope.item$default(lazyScaffoldContentScope, null, null, new ComposableLambdaImpl(new BalanceFeedKt$$ExternalSyntheticLambda9(afterpayAppletHomeContentViewModel5, 12), true, 85149439), 3);
                                    }
                                    final AbstractPersistentList abstractPersistentList = afterpayAppletHomeContentViewModel5.homeSections;
                                    ActivityTabViewKt$$ExternalSyntheticLambda17 activityTabViewKt$$ExternalSyntheticLambda17 = new ActivityTabViewKt$$ExternalSyntheticLambda17(23);
                                    ActivityTabViewKt$$ExternalSyntheticLambda17 activityTabViewKt$$ExternalSyntheticLambda172 = new ActivityTabViewKt$$ExternalSyntheticLambda17(24);
                                    int size = abstractPersistentList.size();
                                    Latch$await$2$2 latch$await$2$2 = new Latch$await$2$2(19, activityTabViewKt$$ExternalSyntheticLambda17, abstractPersistentList);
                                    Latch$await$2$2 latch$await$2$22 = new Latch$await$2$2(20, activityTabViewKt$$ExternalSyntheticLambda172, abstractPersistentList);
                                    final boolean z21 = z16;
                                    final boolean z22 = z17;
                                    final boolean z23 = z18;
                                    final boolean z24 = z19;
                                    final CoroutineScope coroutineScope2 = coroutineScope;
                                    final LazyListState lazyListState4 = lazyListState3;
                                    final SpringSpec springSpec4 = springSpec3;
                                    final ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState4 = parcelableSnapshotMutableIntState2;
                                    final MutableState mutableState11 = mutableState6;
                                    final MutableState mutableState12 = mutableState7;
                                    final MutableState mutableState13 = mutableState8;
                                    final MutableState mutableState14 = mutableState9;
                                    final MutableState mutableState15 = mutableState10;
                                    lazyScaffoldContentScope.$$delegate_0.items(size, latch$await$2$2, latch$await$2$22, new ComposableLambdaImpl(new Function4() { // from class: com.squareup.cash.afterpayapplet.views.AfterpayAppletHomeViewKt$AfterpayAppletHomeLoaded$lambda$17$15$0$$inlined$items$3
                                        @Override // kotlin.jvm.functions.Function4
                                        public final Object invoke(Object obj6, Object obj7, Object obj8, Object obj9) {
                                            int i5;
                                            boolean z25;
                                            Modifier then;
                                            Modifier modifier;
                                            LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj6;
                                            int intValue2 = ((Number) obj7).intValue();
                                            Composer composer3 = (Composer) obj8;
                                            int intValue3 = ((Number) obj9).intValue();
                                            final int i6 = 2;
                                            final int i7 = 4;
                                            if ((intValue3 & 6) == 0) {
                                                i5 = (((GapComposer) composer3).changed(lazyItemScopeImpl) ? 4 : 2) | intValue3;
                                            } else {
                                                i5 = intValue3;
                                            }
                                            if ((intValue3 & 48) == 0) {
                                                i5 |= ((GapComposer) composer3).changed(intValue2) ? 32 : 16;
                                            }
                                            final int i8 = 1;
                                            final int i9 = 0;
                                            GapComposer gapComposer4 = (GapComposer) composer3;
                                            if (gapComposer4.shouldExecute(i5 & 1, (i5 & 147) != 146)) {
                                                AfterpayAppletHomeContentViewModel.HomeSection homeSection2 = (AfterpayAppletHomeContentViewModel.HomeSection) abstractPersistentList.get(intValue2);
                                                gapComposer4.startReplaceGroup(2135204980);
                                                final String str2 = homeSection2.id;
                                                boolean z26 = homeSection2.showDivider;
                                                final AfterpayAppletHomeContentViewModel.HomeSection.SectionContent sectionContent2 = homeSection2.content;
                                                final List list = homeSection2.impressionEvent;
                                                AfterpayAppletHomeContentViewModel afterpayAppletHomeContentViewModel6 = afterpayAppletHomeContentViewModel5;
                                                AfterpayAppletHomeContentViewModel.HomeSection homeSection3 = (AfterpayAppletHomeContentViewModel.HomeSection) CollectionsKt.lastOrNull((List) afterpayAppletHomeContentViewModel6.homeSections);
                                                boolean areEqual = Intrinsics.areEqual(homeSection3 != null ? homeSection3.content : null, sectionContent2);
                                                Modifier modifier2 = Modifier.Companion.$$INSTANCE;
                                                NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                                                if (areEqual && z21) {
                                                    gapComposer4.startReplaceGroup(2135143227);
                                                    Object rememberedValue16 = gapComposer4.rememberedValue();
                                                    if (rememberedValue16 == neverEqualPolicy2) {
                                                        rememberedValue16 = new RepayCustomAmountPickerPresenter$models$1$1$1(1, parcelableSnapshotMutableIntState4);
                                                        gapComposer4.updateRememberedValue(rememberedValue16);
                                                    }
                                                    modifier2 = ValueInsets.onGloballyPositioned(modifier2, (Function1) rememberedValue16);
                                                    gapComposer4.end(false);
                                                } else {
                                                    gapComposer4.startReplaceGroup(2135285734);
                                                    gapComposer4.end(false);
                                                }
                                                Modifier modifier3 = modifier2;
                                                boolean z27 = sectionContent2 instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PaymentManagement;
                                                final SwipeToDismissKt$$ExternalSyntheticLambda4 swipeToDismissKt$$ExternalSyntheticLambda42 = swipeToDismissKt$$ExternalSyntheticLambda4;
                                                if (z27) {
                                                    gapComposer4.startReplaceGroup(-900947516);
                                                    boolean changed8 = gapComposer4.changed(swipeToDismissKt$$ExternalSyntheticLambda42) | gapComposer4.changedInstance(list) | gapComposer4.changed(str2);
                                                    Object rememberedValue17 = gapComposer4.rememberedValue();
                                                    if (changed8 || rememberedValue17 == neverEqualPolicy2) {
                                                        rememberedValue17 = new Function0() { // from class: com.squareup.cash.afterpayapplet.views.AfterpayAppletHomeViewKt$AfterpayAppletHomeLoaded$3$4$1$4$1$1
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                int i10 = i9;
                                                                String str3 = str2;
                                                                List list2 = list;
                                                                SwipeToDismissKt$$ExternalSyntheticLambda4 swipeToDismissKt$$ExternalSyntheticLambda43 = swipeToDismissKt$$ExternalSyntheticLambda42;
                                                                switch (i10) {
                                                                    case 0:
                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                        break;
                                                                    case 1:
                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                        break;
                                                                    case 2:
                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                        break;
                                                                    case 3:
                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                        break;
                                                                    case 4:
                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                        break;
                                                                    case 5:
                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                        break;
                                                                    case 6:
                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                        break;
                                                                    case 7:
                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                        break;
                                                                    case 8:
                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                        break;
                                                                    case 9:
                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                        break;
                                                                    case 10:
                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                        break;
                                                                    case 11:
                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                        break;
                                                                    case 12:
                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                        break;
                                                                    case 13:
                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                        break;
                                                                    default:
                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        gapComposer4.updateRememberedValue(rememberedValue17);
                                                    }
                                                    LegalSectionKt.PaymentManagementSection(VisibleKt.onVisible$default(modifier3, (Function0) rememberedValue17), (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PaymentManagement) sectionContent2, z26, function13, gapComposer4, 0);
                                                    gapComposer4.end(false);
                                                } else {
                                                    final int i10 = 6;
                                                    if (sectionContent2 instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.ImageText) {
                                                        gapComposer4.startReplaceGroup(2135658540);
                                                        boolean changed9 = gapComposer4.changed(swipeToDismissKt$$ExternalSyntheticLambda42) | gapComposer4.changedInstance(list) | gapComposer4.changed(str2);
                                                        Object rememberedValue18 = gapComposer4.rememberedValue();
                                                        if (changed9 || rememberedValue18 == neverEqualPolicy2) {
                                                            rememberedValue18 = new Function0() { // from class: com.squareup.cash.afterpayapplet.views.AfterpayAppletHomeViewKt$AfterpayAppletHomeLoaded$3$4$1$4$1$1
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    int i102 = i10;
                                                                    String str3 = str2;
                                                                    List list2 = list;
                                                                    SwipeToDismissKt$$ExternalSyntheticLambda4 swipeToDismissKt$$ExternalSyntheticLambda43 = swipeToDismissKt$$ExternalSyntheticLambda42;
                                                                    switch (i102) {
                                                                        case 0:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 1:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 2:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 3:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 4:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 5:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 6:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 7:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 8:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 9:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 10:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 11:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 12:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 13:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        default:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            gapComposer4.updateRememberedValue(rememberedValue18);
                                                        }
                                                        LegalSectionKt.ImageTextSection(VisibleKt.onVisible$default(modifier3, (Function0) rememberedValue18), (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.ImageText) sectionContent2, z26, function13, gapComposer4, 0, 0);
                                                        gapComposer4.end(false);
                                                    } else if (sectionContent2 instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PageHeader) {
                                                        gapComposer4.startReplaceGroup(2135937323);
                                                        boolean changed10 = gapComposer4.changed(swipeToDismissKt$$ExternalSyntheticLambda42) | gapComposer4.changedInstance(list) | gapComposer4.changed(str2);
                                                        Object rememberedValue19 = gapComposer4.rememberedValue();
                                                        if (changed10 || rememberedValue19 == neverEqualPolicy2) {
                                                            final int i11 = 8;
                                                            rememberedValue19 = new Function0() { // from class: com.squareup.cash.afterpayapplet.views.AfterpayAppletHomeViewKt$AfterpayAppletHomeLoaded$3$4$1$4$1$1
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    int i102 = i11;
                                                                    String str3 = str2;
                                                                    List list2 = list;
                                                                    SwipeToDismissKt$$ExternalSyntheticLambda4 swipeToDismissKt$$ExternalSyntheticLambda43 = swipeToDismissKt$$ExternalSyntheticLambda42;
                                                                    switch (i102) {
                                                                        case 0:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 1:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 2:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 3:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 4:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 5:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 6:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 7:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 8:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 9:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 10:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 11:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 12:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 13:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        default:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            gapComposer4.updateRememberedValue(rememberedValue19);
                                                        }
                                                        LegalSectionKt.PageHeaderSection(VisibleKt.onVisible$default(modifier3, (Function0) rememberedValue19), (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PageHeader) sectionContent2, z26, function13, gapComposer4, 0);
                                                        gapComposer4.end(false);
                                                    } else if (sectionContent2 instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.IconText) {
                                                        gapComposer4.startReplaceGroup(2136215858);
                                                        boolean changed11 = gapComposer4.changed(swipeToDismissKt$$ExternalSyntheticLambda42) | gapComposer4.changedInstance(list) | gapComposer4.changed(str2);
                                                        Object rememberedValue20 = gapComposer4.rememberedValue();
                                                        if (changed11 || rememberedValue20 == neverEqualPolicy2) {
                                                            final int i12 = 9;
                                                            rememberedValue20 = new Function0() { // from class: com.squareup.cash.afterpayapplet.views.AfterpayAppletHomeViewKt$AfterpayAppletHomeLoaded$3$4$1$4$1$1
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    int i102 = i12;
                                                                    String str3 = str2;
                                                                    List list2 = list;
                                                                    SwipeToDismissKt$$ExternalSyntheticLambda4 swipeToDismissKt$$ExternalSyntheticLambda43 = swipeToDismissKt$$ExternalSyntheticLambda42;
                                                                    switch (i102) {
                                                                        case 0:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 1:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 2:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 3:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 4:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 5:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 6:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 7:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 8:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 9:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 10:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 11:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 12:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 13:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        default:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            gapComposer4.updateRememberedValue(rememberedValue20);
                                                        }
                                                        IconTextSectionKt.IconTextSection(VisibleKt.onVisible$default(modifier3, (Function0) rememberedValue20), (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.IconText) sectionContent2, z26, z22, function13, gapComposer4, 0, 0);
                                                        gapComposer4 = gapComposer4;
                                                        gapComposer4.end(false);
                                                    } else if (sectionContent2 instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.MoneyBarSection) {
                                                        gapComposer4.startReplaceGroup(2136537793);
                                                        boolean changed12 = gapComposer4.changed(swipeToDismissKt$$ExternalSyntheticLambda42) | gapComposer4.changedInstance(list) | gapComposer4.changed(str2);
                                                        Object rememberedValue21 = gapComposer4.rememberedValue();
                                                        if (changed12 || rememberedValue21 == neverEqualPolicy2) {
                                                            final int i13 = 10;
                                                            rememberedValue21 = new Function0() { // from class: com.squareup.cash.afterpayapplet.views.AfterpayAppletHomeViewKt$AfterpayAppletHomeLoaded$3$4$1$4$1$1
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    int i102 = i13;
                                                                    String str3 = str2;
                                                                    List list2 = list;
                                                                    SwipeToDismissKt$$ExternalSyntheticLambda4 swipeToDismissKt$$ExternalSyntheticLambda43 = swipeToDismissKt$$ExternalSyntheticLambda42;
                                                                    switch (i102) {
                                                                        case 0:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 1:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 2:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 3:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 4:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 5:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 6:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 7:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 8:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 9:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 10:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 11:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 12:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 13:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        default:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            gapComposer4.updateRememberedValue(rememberedValue21);
                                                        }
                                                        LegalSectionKt.MoneyBarCreditSection((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.MoneyBarSection) sectionContent2, VisibleKt.onVisible$default(modifier3, (Function0) rememberedValue21), z26, function13, gapComposer4, 0);
                                                        gapComposer4.end(false);
                                                    } else if (sectionContent2 instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.RetroTransactionSection) {
                                                        gapComposer4.startReplaceGroup(2136821040);
                                                        boolean changed13 = gapComposer4.changed(swipeToDismissKt$$ExternalSyntheticLambda42) | gapComposer4.changedInstance(list) | gapComposer4.changed(str2);
                                                        Object rememberedValue22 = gapComposer4.rememberedValue();
                                                        if (changed13 || rememberedValue22 == neverEqualPolicy2) {
                                                            final int i14 = 11;
                                                            rememberedValue22 = new Function0() { // from class: com.squareup.cash.afterpayapplet.views.AfterpayAppletHomeViewKt$AfterpayAppletHomeLoaded$3$4$1$4$1$1
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    int i102 = i14;
                                                                    String str3 = str2;
                                                                    List list2 = list;
                                                                    SwipeToDismissKt$$ExternalSyntheticLambda4 swipeToDismissKt$$ExternalSyntheticLambda43 = swipeToDismissKt$$ExternalSyntheticLambda42;
                                                                    switch (i102) {
                                                                        case 0:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 1:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 2:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 3:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 4:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 5:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 6:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 7:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 8:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 9:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 10:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 11:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 12:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 13:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        default:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            gapComposer4.updateRememberedValue(rememberedValue22);
                                                        }
                                                        RetroSectionKt.RetroSection(VisibleKt.onVisible$default(modifier3, (Function0) rememberedValue22), (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.RetroTransactionSection) sectionContent2, z26, function13, gapComposer4, 0);
                                                        gapComposer4.end(false);
                                                    } else if (sectionContent2 instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.StandaloneHeader) {
                                                        gapComposer4.startReplaceGroup(-900892189);
                                                        boolean changed14 = gapComposer4.changed(swipeToDismissKt$$ExternalSyntheticLambda42) | gapComposer4.changedInstance(list) | gapComposer4.changed(str2);
                                                        Object rememberedValue23 = gapComposer4.rememberedValue();
                                                        if (changed14 || rememberedValue23 == neverEqualPolicy2) {
                                                            final int i15 = 12;
                                                            rememberedValue23 = new Function0() { // from class: com.squareup.cash.afterpayapplet.views.AfterpayAppletHomeViewKt$AfterpayAppletHomeLoaded$3$4$1$4$1$1
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    int i102 = i15;
                                                                    String str3 = str2;
                                                                    List list2 = list;
                                                                    SwipeToDismissKt$$ExternalSyntheticLambda4 swipeToDismissKt$$ExternalSyntheticLambda43 = swipeToDismissKt$$ExternalSyntheticLambda42;
                                                                    switch (i102) {
                                                                        case 0:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 1:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 2:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 3:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 4:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 5:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 6:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 7:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 8:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 9:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 10:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 11:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 12:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        case 13:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                        default:
                                                                            swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            gapComposer4.updateRememberedValue(rememberedValue23);
                                                        }
                                                        LegalSectionKt.StandaloneHeaderSection(VisibleKt.onVisible$default(modifier3, (Function0) rememberedValue23), (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.StandaloneHeader) sectionContent2, z26, function13, gapComposer4, 0, 0);
                                                        gapComposer4.end(false);
                                                    } else {
                                                        boolean z28 = sectionContent2 instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.Legal;
                                                        final Function1 function14 = function13;
                                                        if (z28) {
                                                            gapComposer4.startReplaceGroup(-900884150);
                                                            LegalSectionKt.LegalSection((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.Legal) sectionContent2, function14, gapComposer4, 0);
                                                            gapComposer4.end(false);
                                                        } else if (sectionContent2 instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.StandaloneCreditSectionHeader) {
                                                            gapComposer4.startReplaceGroup(-900880503);
                                                            boolean changed15 = gapComposer4.changed(swipeToDismissKt$$ExternalSyntheticLambda42) | gapComposer4.changedInstance(list) | gapComposer4.changed(str2);
                                                            Object rememberedValue24 = gapComposer4.rememberedValue();
                                                            if (changed15 || rememberedValue24 == neverEqualPolicy2) {
                                                                final int i16 = 13;
                                                                rememberedValue24 = new Function0() { // from class: com.squareup.cash.afterpayapplet.views.AfterpayAppletHomeViewKt$AfterpayAppletHomeLoaded$3$4$1$4$1$1
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        int i102 = i16;
                                                                        String str3 = str2;
                                                                        List list2 = list;
                                                                        SwipeToDismissKt$$ExternalSyntheticLambda4 swipeToDismissKt$$ExternalSyntheticLambda43 = swipeToDismissKt$$ExternalSyntheticLambda42;
                                                                        switch (i102) {
                                                                            case 0:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 1:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 2:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 3:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 4:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 5:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 6:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 7:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 8:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 9:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 10:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 11:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 12:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 13:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            default:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                };
                                                                gapComposer4.updateRememberedValue(rememberedValue24);
                                                            }
                                                            LegalSectionKt.StandaloneCreditHeaderSection(VisibleKt.onVisible$default(modifier3, (Function0) rememberedValue24), (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.StandaloneCreditSectionHeader) sectionContent2, z26, function13, gapComposer4, 0);
                                                            gapComposer4.end(false);
                                                        } else if (sectionContent2 instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AvatarText) {
                                                            gapComposer4.startReplaceGroup(2137755132);
                                                            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(modifier3, 24.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
                                                            boolean changed16 = gapComposer4.changed(swipeToDismissKt$$ExternalSyntheticLambda42) | gapComposer4.changedInstance(list) | gapComposer4.changed(str2);
                                                            Object rememberedValue25 = gapComposer4.rememberedValue();
                                                            if (changed16 || rememberedValue25 == neverEqualPolicy2) {
                                                                final int i17 = 14;
                                                                rememberedValue25 = new Function0() { // from class: com.squareup.cash.afterpayapplet.views.AfterpayAppletHomeViewKt$AfterpayAppletHomeLoaded$3$4$1$4$1$1
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        int i102 = i17;
                                                                        String str3 = str2;
                                                                        List list2 = list;
                                                                        SwipeToDismissKt$$ExternalSyntheticLambda4 swipeToDismissKt$$ExternalSyntheticLambda43 = swipeToDismissKt$$ExternalSyntheticLambda42;
                                                                        switch (i102) {
                                                                            case 0:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 1:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 2:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 3:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 4:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 5:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 6:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 7:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 8:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 9:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 10:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 11:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 12:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 13:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            default:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                };
                                                                gapComposer4.updateRememberedValue(rememberedValue25);
                                                            }
                                                            LegalSectionKt.AvatarTextSection(VisibleKt.onVisible$default(m302paddingqDBjuR0$default, (Function0) rememberedValue25), (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AvatarText) sectionContent2, z26, function13, gapComposer4, 0);
                                                            gapComposer4.end(false);
                                                        } else if (sectionContent2 instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.BannerSection) {
                                                            gapComposer4.startReplaceGroup(-900860578);
                                                            boolean changed17 = gapComposer4.changed(swipeToDismissKt$$ExternalSyntheticLambda42) | gapComposer4.changedInstance(list) | gapComposer4.changed(str2);
                                                            Object rememberedValue26 = gapComposer4.rememberedValue();
                                                            if (changed17 || rememberedValue26 == neverEqualPolicy2) {
                                                                rememberedValue26 = new Function0() { // from class: com.squareup.cash.afterpayapplet.views.AfterpayAppletHomeViewKt$AfterpayAppletHomeLoaded$3$4$1$4$1$1
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        int i102 = i8;
                                                                        String str3 = str2;
                                                                        List list2 = list;
                                                                        SwipeToDismissKt$$ExternalSyntheticLambda4 swipeToDismissKt$$ExternalSyntheticLambda43 = swipeToDismissKt$$ExternalSyntheticLambda42;
                                                                        switch (i102) {
                                                                            case 0:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 1:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 2:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 3:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 4:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 5:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 6:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 7:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 8:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 9:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 10:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 11:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 12:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 13:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            default:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                };
                                                                gapComposer4.updateRememberedValue(rememberedValue26);
                                                            }
                                                            LegalSectionKt.AfterpayAppletBannerSection(VisibleKt.onVisible$default(modifier3, (Function0) rememberedValue26), (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.BannerSection) sectionContent2, function14, gapComposer4, 0);
                                                            gapComposer4.end(false);
                                                        } else if (sectionContent2 instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.TextLines) {
                                                            gapComposer4.startReplaceGroup(-900853029);
                                                            boolean changed18 = gapComposer4.changed(swipeToDismissKt$$ExternalSyntheticLambda42) | gapComposer4.changedInstance(list) | gapComposer4.changed(str2);
                                                            Object rememberedValue27 = gapComposer4.rememberedValue();
                                                            if (changed18 || rememberedValue27 == neverEqualPolicy2) {
                                                                rememberedValue27 = new Function0() { // from class: com.squareup.cash.afterpayapplet.views.AfterpayAppletHomeViewKt$AfterpayAppletHomeLoaded$3$4$1$4$1$1
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        int i102 = i6;
                                                                        String str3 = str2;
                                                                        List list2 = list;
                                                                        SwipeToDismissKt$$ExternalSyntheticLambda4 swipeToDismissKt$$ExternalSyntheticLambda43 = swipeToDismissKt$$ExternalSyntheticLambda42;
                                                                        switch (i102) {
                                                                            case 0:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 1:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 2:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 3:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 4:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 5:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 6:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 7:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 8:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 9:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 10:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 11:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 12:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            case 13:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                            default:
                                                                                swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                break;
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                };
                                                                gapComposer4.updateRememberedValue(rememberedValue27);
                                                            }
                                                            LegalSectionKt.TextLinesSection(VisibleKt.onVisible$default(modifier3, (Function0) rememberedValue27), (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.TextLines) sectionContent2, z26, gapComposer4, 0, 0);
                                                            gapComposer4 = gapComposer4;
                                                            gapComposer4.end(false);
                                                        } else {
                                                            final int i18 = 5;
                                                            if (sectionContent2 instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection) {
                                                                gapComposer4.startReplaceGroup(2138598456);
                                                                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection heroBalanceSection = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection) sectionContent2;
                                                                if (heroBalanceSection instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar) {
                                                                    gapComposer4.startReplaceGroup(2138650040);
                                                                    boolean changed19 = gapComposer4.changed(swipeToDismissKt$$ExternalSyntheticLambda42) | gapComposer4.changedInstance(list) | gapComposer4.changed(str2);
                                                                    Object rememberedValue28 = gapComposer4.rememberedValue();
                                                                    final int i19 = 3;
                                                                    if (changed19 || rememberedValue28 == neverEqualPolicy2) {
                                                                        rememberedValue28 = new Function0() { // from class: com.squareup.cash.afterpayapplet.views.AfterpayAppletHomeViewKt$AfterpayAppletHomeLoaded$3$4$1$4$1$1
                                                                            @Override // kotlin.jvm.functions.Function0
                                                                            public final Object invoke() {
                                                                                int i102 = i19;
                                                                                String str3 = str2;
                                                                                List list2 = list;
                                                                                SwipeToDismissKt$$ExternalSyntheticLambda4 swipeToDismissKt$$ExternalSyntheticLambda43 = swipeToDismissKt$$ExternalSyntheticLambda42;
                                                                                switch (i102) {
                                                                                    case 0:
                                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                        break;
                                                                                    case 1:
                                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                        break;
                                                                                    case 2:
                                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                        break;
                                                                                    case 3:
                                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                        break;
                                                                                    case 4:
                                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                        break;
                                                                                    case 5:
                                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                        break;
                                                                                    case 6:
                                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                        break;
                                                                                    case 7:
                                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                        break;
                                                                                    case 8:
                                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                        break;
                                                                                    case 9:
                                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                        break;
                                                                                    case 10:
                                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                        break;
                                                                                    case 11:
                                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                        break;
                                                                                    case 12:
                                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                        break;
                                                                                    case 13:
                                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                        break;
                                                                                    default:
                                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list2, str3);
                                                                                        break;
                                                                                }
                                                                                return Unit.INSTANCE;
                                                                            }
                                                                        };
                                                                        gapComposer4.updateRememberedValue(rememberedValue28);
                                                                    }
                                                                    Modifier onVisible$default2 = VisibleKt.onVisible$default(modifier3, (Function0) rememberedValue28);
                                                                    AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar paymentCalendar = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar) sectionContent2;
                                                                    MutableState mutableState16 = mutableState11;
                                                                    AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate calendarDate = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate) mutableState16.getValue();
                                                                    MutableState mutableState17 = mutableState12;
                                                                    List list2 = (List) mutableState17.getValue();
                                                                    MutableState mutableState18 = mutableState13;
                                                                    AnimatedAmountTextView.Amount amount = (AnimatedAmountTextView.Amount) mutableState18.getValue();
                                                                    MutableState mutableState19 = mutableState14;
                                                                    boolean booleanValue = ((Boolean) mutableState19.getValue()).booleanValue();
                                                                    MutableState mutableState20 = mutableState15;
                                                                    boolean booleanValue2 = ((Boolean) mutableState20.getValue()).booleanValue();
                                                                    Object rememberedValue29 = gapComposer4.rememberedValue();
                                                                    if (rememberedValue29 == neverEqualPolicy2) {
                                                                        rememberedValue29 = new RealBrandFollowPresenter$models$2$1$1(3, mutableState16);
                                                                        gapComposer4.updateRememberedValue(rememberedValue29);
                                                                    }
                                                                    Function1 function15 = (Function1) rememberedValue29;
                                                                    Object rememberedValue30 = gapComposer4.rememberedValue();
                                                                    if (rememberedValue30 == neverEqualPolicy2) {
                                                                        rememberedValue30 = new RealBrandFollowPresenter$models$2$1$1(4, mutableState17);
                                                                        gapComposer4.updateRememberedValue(rememberedValue30);
                                                                    }
                                                                    Function1 function16 = (Function1) rememberedValue30;
                                                                    Object rememberedValue31 = gapComposer4.rememberedValue();
                                                                    if (rememberedValue31 == neverEqualPolicy2) {
                                                                        rememberedValue31 = new RealBrandFollowPresenter$models$2$1$1(5, mutableState18);
                                                                        gapComposer4.updateRememberedValue(rememberedValue31);
                                                                    }
                                                                    Function1 function17 = (Function1) rememberedValue31;
                                                                    Object rememberedValue32 = gapComposer4.rememberedValue();
                                                                    if (rememberedValue32 == neverEqualPolicy2) {
                                                                        rememberedValue32 = new RealBrandFollowPresenter$models$2$1$1(6, mutableState19);
                                                                        gapComposer4.updateRememberedValue(rememberedValue32);
                                                                    }
                                                                    Function1 function18 = (Function1) rememberedValue32;
                                                                    Object rememberedValue33 = gapComposer4.rememberedValue();
                                                                    if (rememberedValue33 == neverEqualPolicy2) {
                                                                        rememberedValue33 = new RealBrandFollowPresenter$models$2$1$1(7, mutableState20);
                                                                        gapComposer4.updateRememberedValue(rememberedValue33);
                                                                    }
                                                                    modifier = null;
                                                                    AfterpayCardKt.AfterpayAppletCalendarHeroSection(onVisible$default2, paymentCalendar, false, calendarDate, list2, amount, booleanValue, booleanValue2, function15, function16, function17, function18, (Function1) rememberedValue33, function13, z23, gapComposer4, 905969664);
                                                                    gapComposer4 = gapComposer4;
                                                                    gapComposer4.end(false);
                                                                    z25 = false;
                                                                } else {
                                                                    modifier = null;
                                                                    if (!(heroBalanceSection instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.NoBalance)) {
                                                                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer4, -900843896, false);
                                                                    }
                                                                    gapComposer4.startReplaceGroup(2139770752);
                                                                    DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer4, null);
                                                                    boolean changed20 = gapComposer4.changed(swipeToDismissKt$$ExternalSyntheticLambda42) | gapComposer4.changedInstance(list) | gapComposer4.changed(str2);
                                                                    Object rememberedValue34 = gapComposer4.rememberedValue();
                                                                    if (changed20 || rememberedValue34 == neverEqualPolicy2) {
                                                                        rememberedValue34 = new Function0() { // from class: com.squareup.cash.afterpayapplet.views.AfterpayAppletHomeViewKt$AfterpayAppletHomeLoaded$3$4$1$4$1$1
                                                                            @Override // kotlin.jvm.functions.Function0
                                                                            public final Object invoke() {
                                                                                int i102 = i7;
                                                                                String str3 = str2;
                                                                                List list22 = list;
                                                                                SwipeToDismissKt$$ExternalSyntheticLambda4 swipeToDismissKt$$ExternalSyntheticLambda43 = swipeToDismissKt$$ExternalSyntheticLambda42;
                                                                                switch (i102) {
                                                                                    case 0:
                                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                        break;
                                                                                    case 1:
                                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                        break;
                                                                                    case 2:
                                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                        break;
                                                                                    case 3:
                                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                        break;
                                                                                    case 4:
                                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                        break;
                                                                                    case 5:
                                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                        break;
                                                                                    case 6:
                                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                        break;
                                                                                    case 7:
                                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                        break;
                                                                                    case 8:
                                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                        break;
                                                                                    case 9:
                                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                        break;
                                                                                    case 10:
                                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                        break;
                                                                                    case 11:
                                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                        break;
                                                                                    case 12:
                                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                        break;
                                                                                    case 13:
                                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                        break;
                                                                                    default:
                                                                                        swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                        break;
                                                                                }
                                                                                return Unit.INSTANCE;
                                                                            }
                                                                        };
                                                                        gapComposer4.updateRememberedValue(rememberedValue34);
                                                                    }
                                                                    z25 = false;
                                                                    AfterpayCardKt.AfterpayAppletNoBalanceHeroSection(VisibleKt.onVisible$default(modifier3, (Function0) rememberedValue34), (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.NoBalance) sectionContent2, function14, gapComposer4, 0);
                                                                    gapComposer4.end(false);
                                                                }
                                                                DBUtil.SpacerBetweenSectionLarge(z25 ? 1 : 0, 1, gapComposer4, modifier);
                                                                gapComposer4.end(z25);
                                                            } else if (sectionContent2 instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection) {
                                                                gapComposer4.startReplaceGroup(2140183021);
                                                                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer4, null);
                                                                AbstractPersistentList abstractPersistentList2 = afterpayAppletHomeContentViewModel6.homeSections;
                                                                ArrayList arrayList = new ArrayList();
                                                                ListIterator listIterator = abstractPersistentList2.listIterator(0);
                                                                while (listIterator.hasNext()) {
                                                                    Object next = listIterator.next();
                                                                    if (((AfterpayAppletHomeContentViewModel.HomeSection) next).content instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection) {
                                                                        arrayList.add(next);
                                                                    }
                                                                }
                                                                Iterator it = arrayList.iterator();
                                                                final int i20 = 0;
                                                                while (true) {
                                                                    if (!it.hasNext()) {
                                                                        i20 = -1;
                                                                        break;
                                                                    }
                                                                    if (((AfterpayAppletHomeContentViewModel.HomeSection) it.next()).content == sectionContent2) {
                                                                        break;
                                                                    }
                                                                    i20++;
                                                                }
                                                                boolean changed21 = gapComposer4.changed(swipeToDismissKt$$ExternalSyntheticLambda42) | gapComposer4.changedInstance(list) | gapComposer4.changed(str2);
                                                                Object rememberedValue35 = gapComposer4.rememberedValue();
                                                                if (changed21 || rememberedValue35 == neverEqualPolicy2) {
                                                                    rememberedValue35 = new Function0() { // from class: com.squareup.cash.afterpayapplet.views.AfterpayAppletHomeViewKt$AfterpayAppletHomeLoaded$3$4$1$4$1$1
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public final Object invoke() {
                                                                            int i102 = i18;
                                                                            String str3 = str2;
                                                                            List list22 = list;
                                                                            SwipeToDismissKt$$ExternalSyntheticLambda4 swipeToDismissKt$$ExternalSyntheticLambda43 = swipeToDismissKt$$ExternalSyntheticLambda42;
                                                                            switch (i102) {
                                                                                case 0:
                                                                                    swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                    break;
                                                                                case 1:
                                                                                    swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                    break;
                                                                                case 2:
                                                                                    swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                    break;
                                                                                case 3:
                                                                                    swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                    break;
                                                                                case 4:
                                                                                    swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                    break;
                                                                                case 5:
                                                                                    swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                    break;
                                                                                case 6:
                                                                                    swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                    break;
                                                                                case 7:
                                                                                    swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                    break;
                                                                                case 8:
                                                                                    swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                    break;
                                                                                case 9:
                                                                                    swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                    break;
                                                                                case 10:
                                                                                    swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                    break;
                                                                                case 11:
                                                                                    swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                    break;
                                                                                case 12:
                                                                                    swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                    break;
                                                                                case 13:
                                                                                    swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                    break;
                                                                                default:
                                                                                    swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                    break;
                                                                            }
                                                                            return Unit.INSTANCE;
                                                                        }
                                                                    };
                                                                    gapComposer4.updateRememberedValue(rememberedValue35);
                                                                }
                                                                Modifier onVisible$default3 = VisibleKt.onVisible$default(modifier3, (Function0) rememberedValue35);
                                                                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection afterpayCardSection = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection) sectionContent2;
                                                                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent afterpayCardContent = afterpayCardSection.content;
                                                                Integer valueOf = Integer.valueOf(i20);
                                                                boolean changed22 = gapComposer4.changed(function14) | gapComposer4.changedInstance(sectionContent2) | gapComposer4.changed(i20);
                                                                Object rememberedValue36 = gapComposer4.rememberedValue();
                                                                if (changed22 || rememberedValue36 == neverEqualPolicy2) {
                                                                    rememberedValue36 = new PointerInputEventHandler() { // from class: com.squareup.cash.afterpayapplet.views.AfterpayAppletHomeViewKt$AfterpayAppletHomeLoaded$3$4$1$4$20$1
                                                                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                                                                        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                                                                            Object detectTapGestures$default = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, new TextFieldUIKt$onPreviewKeyEvent$1(Function1.this, sectionContent2, i20, 1), continuation, 7);
                                                                            return detectTapGestures$default == CoroutineSingletons.COROUTINE_SUSPENDED ? detectTapGestures$default : Unit.INSTANCE;
                                                                        }
                                                                    };
                                                                    gapComposer4.updateRememberedValue(rememberedValue36);
                                                                }
                                                                AfterpayCardKt.AfterpayCardSection(SuspendingPointerInputFilterKt.pointerInput(onVisible$default3, afterpayCardContent, valueOf, (PointerInputEventHandler) rememberedValue36), afterpayCardSection, z24, function13, gapComposer4, 0, 0);
                                                                z25 = false;
                                                                gapComposer4.end(false);
                                                            } else if (sectionContent2 instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection) {
                                                                gapComposer4.startReplaceGroup(2141004242);
                                                                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer4, null);
                                                                boolean changed23 = gapComposer4.changed(swipeToDismissKt$$ExternalSyntheticLambda42) | gapComposer4.changedInstance(list) | gapComposer4.changed(str2);
                                                                Object rememberedValue37 = gapComposer4.rememberedValue();
                                                                if (changed23 || rememberedValue37 == neverEqualPolicy2) {
                                                                    final int i21 = 7;
                                                                    rememberedValue37 = new Function0() { // from class: com.squareup.cash.afterpayapplet.views.AfterpayAppletHomeViewKt$AfterpayAppletHomeLoaded$3$4$1$4$1$1
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public final Object invoke() {
                                                                            int i102 = i21;
                                                                            String str3 = str2;
                                                                            List list22 = list;
                                                                            SwipeToDismissKt$$ExternalSyntheticLambda4 swipeToDismissKt$$ExternalSyntheticLambda43 = swipeToDismissKt$$ExternalSyntheticLambda42;
                                                                            switch (i102) {
                                                                                case 0:
                                                                                    swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                    break;
                                                                                case 1:
                                                                                    swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                    break;
                                                                                case 2:
                                                                                    swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                    break;
                                                                                case 3:
                                                                                    swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                    break;
                                                                                case 4:
                                                                                    swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                    break;
                                                                                case 5:
                                                                                    swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                    break;
                                                                                case 6:
                                                                                    swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                    break;
                                                                                case 7:
                                                                                    swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                    break;
                                                                                case 8:
                                                                                    swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                    break;
                                                                                case 9:
                                                                                    swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                    break;
                                                                                case 10:
                                                                                    swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                    break;
                                                                                case 11:
                                                                                    swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                    break;
                                                                                case 12:
                                                                                    swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                    break;
                                                                                case 13:
                                                                                    swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                    break;
                                                                                default:
                                                                                    swipeToDismissKt$$ExternalSyntheticLambda43.invoke(list22, str3);
                                                                                    break;
                                                                            }
                                                                            return Unit.INSTANCE;
                                                                        }
                                                                    };
                                                                    gapComposer4.updateRememberedValue(rememberedValue37);
                                                                }
                                                                Modifier onVisible$default4 = VisibleKt.onVisible$default(modifier3, (Function0) rememberedValue37);
                                                                boolean changed24 = gapComposer4.changed(function14);
                                                                Object rememberedValue38 = gapComposer4.rememberedValue();
                                                                if (changed24 || rememberedValue38 == neverEqualPolicy2) {
                                                                    rememberedValue38 = new QuickPayViewKt$QuickPay$1$1$1$2$2$1$1(1, function14);
                                                                    gapComposer4.updateRememberedValue(rememberedValue38);
                                                                }
                                                                then = onVisible$default4.then(new OnFirstVisibleElement((Function0) rememberedValue38));
                                                                AfterpayCardKt.PrepurchaseToggleSection((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection) sectionContent2, z24, function13, then, gapComposer4, 0);
                                                                z25 = false;
                                                                gapComposer4.end(false);
                                                            } else {
                                                                if (!(sectionContent2 instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayHeroUpsell)) {
                                                                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer4, -900943112, false);
                                                                }
                                                                gapComposer4.startReplaceGroup(2141505946);
                                                                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayHeroUpsell afterpayHeroUpsell = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayHeroUpsell) sectionContent2;
                                                                CoroutineScope coroutineScope3 = coroutineScope2;
                                                                boolean changedInstance3 = gapComposer4.changedInstance(coroutineScope3);
                                                                LazyListState lazyListState5 = lazyListState4;
                                                                boolean changed25 = changedInstance3 | gapComposer4.changed(lazyListState5) | gapComposer4.changedInstance(afterpayAppletHomeContentViewModel6);
                                                                SpringSpec springSpec5 = springSpec4;
                                                                boolean changed26 = changed25 | gapComposer4.changed(springSpec5);
                                                                Object rememberedValue39 = gapComposer4.rememberedValue();
                                                                if (changed26 || rememberedValue39 == neverEqualPolicy2) {
                                                                    MarshalledEventSource marshalledEventSource = new MarshalledEventSource(coroutineScope3, lazyListState5, afterpayAppletHomeContentViewModel6, springSpec5, 2);
                                                                    gapComposer4.updateRememberedValue(marshalledEventSource);
                                                                    rememberedValue39 = marshalledEventSource;
                                                                }
                                                                AfterpayCardKt.AfterpayHeroUpsellSection(modifier3, afterpayHeroUpsell, function13, (Function0) rememberedValue39, gapComposer4, 0);
                                                                z25 = false;
                                                                gapComposer4.end(false);
                                                            }
                                                            gapComposer4.end(z25);
                                                        }
                                                    }
                                                }
                                                z25 = false;
                                                gapComposer4.end(z25);
                                            } else {
                                                gapComposer4.skipToGroupEnd();
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, true, 802480018));
                                    if (z21) {
                                        LazyListScope.item$default(lazyScaffoldContentScope, null, null, new ComposableLambdaImpl(new EducationalSheetKt$$ExternalSyntheticLambda18(density, parcelableSnapshotMutableIntState, parcelableSnapshotMutableIntState4, parcelableSnapshotMutableIntState3, i4), true, -128695064), 3);
                                    } else if (z22) {
                                        LazyListScope.item$default(lazyScaffoldContentScope, null, null, AfterpaySearchViewKt.f132lambda$1307290849, 3);
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            lazyListState2 = lazyListState3;
                            gapComposer3.updateRememberedValue(obj4);
                            rememberedValue15 = obj4;
                        } else {
                            lazyListState2 = lazyListState3;
                        }
                        ScreenScaffoldKt.ScreenScaffoldLazy(onGloballyPositioned, lazyListState2, m295PaddingValuesYgX7TsA$default, rememberComposableLambda, null, (Function1) rememberedValue15, gapComposer3, 3462, 16);
                    } else {
                        gapComposer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2), onVisible$default, stringResource, (Function0) rememberedValue7, z8, false);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneybotMessageUiKt$$ExternalSyntheticLambda15(afterpayAppletHomeContentViewModel, function1, z, z2, i, 1);
        }
    }

    public static final void AfterpayAppletHomeLoading(Loading loading, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(309941286);
        int i2 = (gapComposer.changedInstance(loading) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String str = loading.screenTitle;
            String stringResource = Room.stringResource(gapComposer, R.string.afterpay_applet_help_button);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new ReceiptUiKt$$ExternalSyntheticLambda3(12, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            boolean z2 = i3 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ReceiptUiKt$$ExternalSyntheticLambda3(14, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            AfterpayAppletLoading(null, str, stringResource, function0, (Function0) rememberedValue2, gapComposer, 0, 1);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AtmPickerGridKt$$ExternalSyntheticLambda4(loading, function1, i, 7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0430, code lost:
    
        if (r11 == r10) goto L107;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r23v0, types: [androidx.compose.ui.Modifier, java.lang.Throwable, kotlin.coroutines.Continuation] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AfterpayAppletInfoSheetContent(Modifier modifier, AfterpayAppletInfoSheetViewModel afterpayAppletInfoSheetViewModel, Function1 function1, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer;
        Object obj;
        GapComposer gapComposer2;
        float f;
        Modifier.Companion companion;
        NeverEqualPolicy neverEqualPolicy;
        ?? r1;
        GapComposer gapComposer3;
        Modifier.Companion companion2;
        NeverEqualPolicy neverEqualPolicy2;
        List list;
        Modifier.Companion companion3;
        NeverEqualPolicy neverEqualPolicy3;
        NeverEqualPolicy neverEqualPolicy4;
        Modifier.Companion companion4;
        NeverEqualPolicy neverEqualPolicy5;
        GapComposer gapComposer4;
        afterpayAppletInfoSheetViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer5 = (GapComposer) composer;
        gapComposer5.startRestartGroup(-1303487469);
        int i2 = i | 6 | (gapComposer5.changedInstance(afterpayAppletInfoSheetViewModel) ? 32 : 16) | (gapComposer5.changedInstance(function1) ? 256 : 128);
        if (gapComposer5.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion5 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion5, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer5, 0);
            int hashCode = Long.hashCode(gapComposer5.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer5.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer5, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer5.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer5.startReusableNode();
            if (gapComposer5.inserting) {
                gapComposer5.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer5.useNode();
            }
            Updater.m576setimpl(gapComposer5, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer5, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer5, materializeModifier, ComposeUiNode.Companion.SetModifier);
            UiAvatar uiAvatar = afterpayAppletInfoSheetViewModel.avatar;
            if (uiAvatar == null) {
                gapComposer5.startReplaceGroup(-1597062035);
                gapComposer5.end(false);
                f = 16.0f;
                gapComposer2 = gapComposer5;
                obj = null;
            } else {
                gapComposer5.startReplaceGroup(-1597062034);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer5.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                ((DefaultSizes) gapComposer5.consume(staticProvidableCompositionLocal)).getClass();
                ((DefaultSizes) gapComposer5.consume(staticProvidableCompositionLocal)).getClass();
                Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(companion5, 16.0f, 16.0f, 16.0f, 12.0f);
                AvatarSize avatarSize = AvatarSize.Size64;
                AvatarEntry avatarEntry = com.squareup.cash.arcade.util.AvatarsKt.toAvatarEntry(uiAvatar, null, gapComposer5, 1);
                obj = null;
                gapComposer2 = gapComposer5;
                f = 16.0f;
                TextViewKt.Avatar(avatarSize, avatarEntry, m301paddingqDBjuR0, false, gapComposer2, 6, 24);
                gapComposer2.end(false);
            }
            Strings.getSizes(gapComposer2).getClass();
            DefaultSizes.spacing.getClass();
            ?? r23 = obj;
            GapComposer gapComposer6 = gapComposer2;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer6, SpacerKt.m300paddingVpY3zN4$default(companion5, f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer2).header, (TextLineBalancing) null, afterpayAppletInfoSheetViewModel.title, (Map) null, (Function1) null, false);
            String str = afterpayAppletInfoSheetViewModel.subtitle;
            int i3 = 17;
            NeverEqualPolicy neverEqualPolicy6 = Composer.Companion.Empty;
            if (str == null) {
                gapComposer6.startReplaceGroup(-1596446003);
                gapComposer6.end(false);
                companion = companion5;
                neverEqualPolicy = neverEqualPolicy6;
                r1 = 1;
                gapComposer3 = gapComposer6;
            } else {
                gapComposer6.startReplaceGroup(-1596446002);
                DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer6, r23);
                Strings.getSizes(gapComposer6).getClass();
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion5, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                TextStyle textStyle = Strings.getTypography(gapComposer6).bodyMedium;
                long j = Strings.getColors(gapComposer6).semantic.text.subtle;
                boolean z = (i2 & 896) == 256;
                Object rememberedValue = gapComposer6.rememberedValue();
                if (z || rememberedValue == neverEqualPolicy6) {
                    rememberedValue = new SwipeToDismissKt$$ExternalSyntheticLambda4(i3, function1);
                    gapComposer6.updateRememberedValue(rememberedValue);
                }
                companion = companion5;
                neverEqualPolicy = neverEqualPolicy6;
                r1 = 1;
                LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue, m300paddingVpY3zN4$default, textStyle, j, null, null, null, 0, 0, 0, gapComposer6, 0, 2016);
                GapComposer gapComposer7 = gapComposer6;
                gapComposer7.end(false);
                gapComposer3 = gapComposer7;
            }
            List list2 = afterpayAppletInfoSheetViewModel.textContent;
            if (list2 == null || list2.isEmpty()) {
                list2 = r23;
            }
            if (list2 == null) {
                gapComposer3.startReplaceGroup(-1595971548);
                gapComposer3.end(false);
                companion2 = companion;
                neverEqualPolicy2 = neverEqualPolicy;
            } else {
                gapComposer3.startReplaceGroup(-1595971547);
                DBUtil.SpacerWithinSectionSmall(0, r1, gapComposer3, r23);
                gapComposer3.startReplaceGroup(-1991143007);
                int i4 = 0;
                for (Object obj2 : list2) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw r23;
                    }
                    AfterpayAppletInfoSheetViewModel.TextContentItem textContentItem = (AfterpayAppletInfoSheetViewModel.TextContentItem) obj2;
                    if (i4 > 0) {
                        gapComposer3.startReplaceGroup(-292372637);
                        if ((textContentItem instanceof AfterpayAppletInfoSheetViewModel.TextContentItem.BulletList) != (((AfterpayAppletInfoSheetViewModel.TextContentItem) list2.get(i4 - 1)) instanceof AfterpayAppletInfoSheetViewModel.TextContentItem.BulletList)) {
                            gapComposer3.startReplaceGroup(-292100085);
                            DBUtil.SpacerWithinSectionMedium(0, r1, gapComposer3, r23);
                            gapComposer3.end(false);
                        } else {
                            gapComposer3.startReplaceGroup(-292045308);
                            gapComposer3.end(false);
                        }
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(-292033404);
                        gapComposer3.end(false);
                    }
                    if (textContentItem instanceof AfterpayAppletInfoSheetViewModel.TextContentItem.BulletList) {
                        gapComposer3.startReplaceGroup(-291938482);
                        Iterator it = ((AfterpayAppletInfoSheetViewModel.TextContentItem.BulletList) textContentItem).items.iterator();
                        while (it.hasNext()) {
                            String m = Recorder$$ExternalSyntheticOutline2.m("• ", (String) it.next());
                            TextStyle textStyle2 = Strings.getTypography(gapComposer3).bodyMedium;
                            long j2 = Strings.getColors(gapComposer3).semantic.text.subtle;
                            Strings.getSizes(gapComposer3).getClass();
                            DefaultSizes.spacing.getClass();
                            Strings.getSizes(gapComposer3).getClass();
                            Strings.getSizes(gapComposer3).getClass();
                            Modifier.Companion companion6 = companion;
                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j2, (Composer) gapComposer3, SpacerKt.m302paddingqDBjuR0$default(companion6, 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 4.0f, 2), textStyle2, (TextLineBalancing) null, m, (Map) null, (Function1) null, false);
                            companion = companion6;
                            list2 = list2;
                        }
                        list = list2;
                        gapComposer3.end(false);
                        companion3 = companion;
                        neverEqualPolicy3 = neverEqualPolicy;
                    } else {
                        list = list2;
                        Modifier.Companion companion7 = companion;
                        if (textContentItem instanceof AfterpayAppletInfoSheetViewModel.TextContentItem.NumberedList) {
                            gapComposer3.startReplaceGroup(-291324527);
                            DBUtil.SpacerBetweenSectionLarge(0, r1, gapComposer3, r23);
                            boolean changedInstance = gapComposer3.changedInstance(textContentItem);
                            Object rememberedValue2 = gapComposer3.rememberedValue();
                            NeverEqualPolicy neverEqualPolicy7 = neverEqualPolicy;
                            if (changedInstance || rememberedValue2 == neverEqualPolicy7) {
                                rememberedValue2 = new ContextKt$$ExternalSyntheticLambda1((AfterpayAppletInfoSheetViewModel.TextContentItem.NumberedList) textContentItem, 8);
                                gapComposer3.updateRememberedValue(rememberedValue2);
                            }
                            ListOrderedKt.ListOrderedStandard(0, (int) r1, gapComposer3, (Modifier) r23, (Function1) rememberedValue2);
                            gapComposer3.end(false);
                            neverEqualPolicy3 = neverEqualPolicy7;
                            companion3 = companion7;
                        } else {
                            NeverEqualPolicy neverEqualPolicy8 = neverEqualPolicy;
                            if (!(textContentItem instanceof AfterpayAppletInfoSheetViewModel.TextContentItem.TextLine)) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, -1671986120, false);
                            }
                            gapComposer3.startReplaceGroup(-290585859);
                            String str2 = ((AfterpayAppletInfoSheetViewModel.TextContentItem.TextLine) textContentItem).text;
                            TextStyle textStyle3 = Strings.getTypography(gapComposer3).bodyMedium;
                            long j3 = Strings.getColors(gapComposer3).semantic.text.subtle;
                            Strings.getSizes(gapComposer3).getClass();
                            DefaultSizes.spacing.getClass();
                            Strings.getSizes(gapComposer3).getClass();
                            Strings.getSizes(gapComposer3).getClass();
                            companion3 = companion7;
                            neverEqualPolicy3 = neverEqualPolicy8;
                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j3, (Composer) gapComposer3, SpacerKt.m302paddingqDBjuR0$default(companion7, 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 4.0f, 2), textStyle3, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                            gapComposer3.end(false);
                        }
                    }
                    i4 = i5;
                    list2 = list;
                    companion = companion3;
                    neverEqualPolicy = neverEqualPolicy3;
                }
                companion2 = companion;
                neverEqualPolicy2 = neverEqualPolicy;
                gapComposer3.end(false);
                gapComposer3.end(false);
            }
            Button button = afterpayAppletInfoSheetViewModel.ctaButton;
            if (button == null) {
                gapComposer3.startReplaceGroup(-1593495020);
                gapComposer3.end(false);
                companion4 = companion2;
                neverEqualPolicy5 = neverEqualPolicy2;
                gapComposer4 = gapComposer3;
            } else {
                gapComposer3.startReplaceGroup(-1593495019);
                DBUtil.SpacerWithinSectionMedium(0, r1, gapComposer3, r23);
                ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier.Companion companion8 = companion2;
                Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(companion8, 16.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f);
                Button.Prominence prominence = button.prominence;
                int i6 = prominence == null ? -1 : AfterpayAppletInfoSheetViewKt$WhenMappings.$EnumSwitchMapping$0[prominence.ordinal()];
                ButtonProminence buttonProminence = i6 != r1 ? i6 != 2 ? i6 != 3 ? ButtonProminence.STANDARD : ButtonProminence.SUBTLE : ButtonProminence.PROMINENT : ButtonProminence.STANDARD;
                boolean changedInstance2 = gapComposer3.changedInstance(button) | ((i2 & 896) == 256 ? r1 : false);
                Object rememberedValue3 = gapComposer3.rememberedValue();
                if (changedInstance2) {
                    neverEqualPolicy4 = neverEqualPolicy2;
                } else {
                    neverEqualPolicy4 = neverEqualPolicy2;
                }
                rememberedValue3 = new BalanceFeedKt$$ExternalSyntheticLambda5(17, function1, button);
                gapComposer3.updateRememberedValue(rememberedValue3);
                GapComposer gapComposer8 = gapComposer3;
                companion4 = companion8;
                neverEqualPolicy5 = neverEqualPolicy4;
                coil3.size.SizeKt.Button((Function0) rememberedValue3, fillMaxWidth2, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-1306242322, new OffersMessageViewKt$$ExternalSyntheticLambda0(button, r1), gapComposer3), gapComposer8, 1572864, 56);
                GapComposer gapComposer9 = gapComposer8;
                gapComposer9.end(false);
                gapComposer4 = gapComposer9;
            }
            DBUtil.SpacerBetweenSectionLarge(0, r1, gapComposer4, r23);
            gapComposer4.end(r1);
            List list3 = afterpayAppletInfoSheetViewModel.impressionEvent;
            if (list3 == null) {
                gapComposer4.startReplaceGroup(-1391235403);
            } else {
                gapComposer4.startReplaceGroup(-1391235402);
                boolean changedInstance3 = gapComposer4.changedInstance(list3) | ((i2 & 896) == 256 ? r1 : false);
                Object rememberedValue4 = gapComposer4.rememberedValue();
                if (changedInstance3 || rememberedValue4 == neverEqualPolicy5) {
                    rememberedValue4 = new SearchBarBinding$Content$1$1(function1, list3, r23, 14);
                    gapComposer4.updateRememberedValue(rememberedValue4);
                }
                Updater.LaunchedEffect(gapComposer4, afterpayAppletInfoSheetViewModel, (Function2) rememberedValue4);
            }
            gapComposer4.end(false);
            modifier2 = companion4;
            gapComposer = gapComposer4;
        } else {
            gapComposer5.skipToGroupEnd();
            modifier2 = modifier;
            gapComposer = gapComposer5;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InlineAppMessageKt$$ExternalSyntheticLambda8(i, 6, modifier2, afterpayAppletInfoSheetViewModel, function1);
        }
    }

    public static final void AfterpayAppletLoading(Modifier modifier, String str, String str2, Function0 function0, Function0 function02, Composer composer, int i, int i2) {
        String str3;
        int i3;
        String str4;
        int i4;
        Function0 function03;
        int i5;
        Modifier modifier2;
        String str5;
        Function0 function04;
        String str6;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-775389523);
        int i6 = i | 6;
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 = i | 54;
            str3 = str;
        } else {
            str3 = str;
            i3 = i6 | (gapComposer.changed(str3) ? 32 : 16);
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i4 = i3 | MLKEMEngine.KyberPolyBytes;
            str4 = str2;
        } else {
            str4 = str2;
            i4 = i3 | (gapComposer.changed(str4) ? 256 : 128);
        }
        int i9 = i4 | (gapComposer.changedInstance(function0) ? 2048 : 1024);
        int i10 = i2 & 16;
        if (i10 != 0) {
            i5 = i9 | 24576;
            function03 = function02;
        } else {
            function03 = function02;
            i5 = i9 | (gapComposer.changedInstance(function03) ? 16384 : PKIFailureInfo.certRevoked);
        }
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 9363) != 9362)) {
            TappableIcon tappableIcon = null;
            String str7 = i7 != 0 ? null : str3;
            String str8 = i8 != 0 ? null : str4;
            if (i10 != 0) {
                function03 = null;
            }
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
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1), 1.0f));
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, systemBarsPadding);
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
            BiasAlignment biasAlignment = Alignment.Companion.TopCenter;
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier align = boxScopeInstance.align(companion, biasAlignment);
            if (function03 != null) {
                zzd zzdVar = Icons.Companion;
                tappableIcon = new TappableIcon("7pZsFc", null, str8 == null ? "" : str8);
            }
            boolean z = (57344 & i5) == 16384;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new y0$$ExternalSyntheticLambda0(19, function03);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            AppletTitleBar(align, str7, tappableIcon, function0, (Function0) rememberedValue, gapComposer, i5 & 7280, 0);
            ProgressCircularKt.ProgressCircular(0, 0, gapComposer, boxScopeInstance.align(companion, Alignment.Companion.Center));
            gapComposer.end(true);
            str5 = str8;
            modifier2 = companion;
            function04 = function03;
            str6 = str7;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            str5 = str4;
            function04 = function03;
            str6 = str3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DuplicatePaymentViewKt$$ExternalSyntheticLambda6(modifier2, str6, str5, function0, function04, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Throwable] */
    public static final void AfterpayAppletNotificationOverlay(String str, String str2, Long l, Function0 function0, Composer composer, int i) {
        GapComposer gapComposer;
        Continuation continuation;
        Modifier wrapContentHeight;
        str.getClass();
        str2.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(328738164);
        int i2 = i | (gapComposer2.changed(str) ? 4 : 2) | (gapComposer2.changed(str2) ? 32 : 16) | (gapComposer2.changed(l) ? 256 : 128) | (gapComposer2.changedInstance(function0) ? 2048 : 1024);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            SwipeState swipeState = SwipeState.START;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new ActivityTabViewKt$$ExternalSyntheticLambda17(26);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            AnchoredDraggableState rememberAnchoredDraggableState = ReflectionKt.rememberAnchoredDraggableState(swipeState, Draggable2DKt.DraggableAnchors((Function1) rememberedValue), gapComposer2);
            Continuation continuation2 = null;
            if (l == null) {
                gapComposer2.startReplaceGroup(913603537);
                gapComposer2.end(false);
                continuation = null;
            } else {
                gapComposer2.startReplaceGroup(913603538);
                long longValue = l.longValue();
                boolean changed = gapComposer2.changed(longValue) | gapComposer2.changed(rememberAnchoredDraggableState);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (changed || rememberedValue2 == neverEqualPolicy) {
                    OffersNotificationKt$OffersNotification$2$1$1 offersNotificationKt$OffersNotification$2$1$1 = new OffersNotificationKt$OffersNotification$2$1$1(longValue, rememberAnchoredDraggableState, continuation2, 1);
                    rememberAnchoredDraggableState = rememberAnchoredDraggableState;
                    continuation = null;
                    gapComposer2.updateRememberedValue(offersNotificationKt$OffersNotification$2$1$1);
                    rememberedValue2 = offersNotificationKt$OffersNotification$2$1$1;
                } else {
                    continuation = null;
                }
                Updater.LaunchedEffect(gapComposer2, rememberAnchoredDraggableState, (Function2) rememberedValue2);
                gapComposer2.end(false);
            }
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = Updater.derivedStateOf(new OffersNotificationKt$$ExternalSyntheticLambda3(rememberAnchoredDraggableState, 5));
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            State state = (State) rememberedValue3;
            Boolean bool = (Boolean) state.getValue();
            bool.booleanValue();
            boolean z = (i2 & 7168) == 2048;
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (z || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new OffersNotificationKt$OffersNotification$5$1(function0, state, continuation, 1);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            Updater.LaunchedEffect(gapComposer2, bool, (Function2) rememberedValue4);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            ?? r17 = continuation;
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxSize);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw r17;
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
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f);
            wrapContentHeight = SizeKt.wrapContentHeight(SpacerKt.systemBarsPadding(SpacerKt.m301paddingqDBjuR0(companion, 8.0f, 24.0f, 8.0f, 8.0f)), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            Modifier anchoredDraggable$default = Draggable2DKt.anchoredDraggable$default(BoxScopeInstance.INSTANCE.align(wrapContentHeight, Alignment.Companion.TopCenter), rememberAnchoredDraggableState, Orientation.Vertical, false, null, 60);
            boolean changed2 = gapComposer2.changed(rememberAnchoredDraggableState);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = new SegmentedControlKt$$ExternalSyntheticLambda4(rememberAnchoredDraggableState, 1);
                gapComposer2.updateRememberedValue(rememberedValue5);
            }
            Modifier zIndex = ZIndexModifierKt.zIndex(OffsetKt.offset(anchoredDraggable$default, (Function1) rememberedValue5), 1.0f);
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = new ActivityTabViewKt$$ExternalSyntheticLambda17(27);
                gapComposer2.updateRememberedValue(rememberedValue6);
            }
            Modifier semantics = SemanticsModifierKt.semantics(zIndex, false, (Function1) rememberedValue6);
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            KeypadKt.m3641CardIkByU14(semantics, m340RoundedCornerShape0680j_4, colors.component.toast.background.f220default, false, null, null, null, Expect_jvmKt.rememberComposableLambda(1025724914, new NoteInputViewKt$$ExternalSyntheticLambda4(str, str2, 2), gapComposer2), gapComposer2, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DismissableToastKt$$ExternalSyntheticLambda4(i, 18, str, str2, l, function0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public static final void AfterpayAppletUpsellSheet(AfterpayAppletUpsellSheetViewModel afterpayAppletUpsellSheetViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        Function1 function12;
        Modifier modifier2;
        GapComposer gapComposer;
        Modifier.Companion companion;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        NeverEqualPolicy neverEqualPolicy;
        BiasAlignment.Horizontal horizontal;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14;
        int i2;
        boolean z;
        boolean z2;
        Modifier modifier3;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        boolean z3;
        boolean z4;
        GapComposer gapComposer2;
        GapComposer gapComposer3;
        Modifier.Companion companion2;
        float f;
        GapComposer gapComposer4;
        ?? r2;
        ?? r0;
        NeverEqualPolicy neverEqualPolicy2;
        StaticProvidableCompositionLocal staticProvidableCompositionLocal;
        int i3;
        Modifier.Companion companion3;
        NeverEqualPolicy neverEqualPolicy3;
        GapComposer gapComposer5;
        Modifier.Companion companion4;
        GapComposer gapComposer6;
        AfterpayAppletUpsellSheetViewModel afterpayAppletUpsellSheetViewModel2 = afterpayAppletUpsellSheetViewModel;
        afterpayAppletUpsellSheetViewModel2.getClass();
        function1.getClass();
        GapComposer gapComposer7 = (GapComposer) composer;
        gapComposer7.startRestartGroup(-1983187305);
        Applier applier = gapComposer7.applier;
        int i4 = i | (gapComposer7.changedInstance(afterpayAppletUpsellSheetViewModel2) ? 4 : 2) | (gapComposer7.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer7.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            Object rememberedValue = gapComposer7.rememberedValue();
            NeverEqualPolicy neverEqualPolicy4 = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy4) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer7.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Modifier.Companion companion5 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion5, 1.0f);
            int i5 = i4 & 112;
            boolean z5 = i5 == 32;
            Object rememberedValue2 = gapComposer7.rememberedValue();
            if (z5 || rememberedValue2 == neverEqualPolicy4) {
                rememberedValue2 = new CashMapViewKt$$ExternalSyntheticLambda3(mutableState, function1);
                gapComposer7.updateRememberedValue(rememberedValue2);
            }
            Modifier onGloballyPositioned = ValueInsets.onGloballyPositioned(fillMaxWidth, (Function1) rememberedValue2);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal2, gapComposer7, 0);
            int hashCode = Long.hashCode(gapComposer7.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer7.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer7, onGloballyPositioned);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer7.startReusableNode();
            if (gapComposer7.inserting) {
                gapComposer7.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer7.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer7, columnMeasurePolicy, composeUiNode$Companion$SetModifier$15);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer7, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$16);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer7, valueOf, composeUiNode$Companion$SetModifier$17);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer7, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer7, materializeModifier, composeUiNode$Companion$SetModifier$18);
            AfterpayAppletUpsellSheetViewModel.TopContent topContent = afterpayAppletUpsellSheetViewModel2.topContent;
            if (topContent == null) {
                gapComposer7.startReplaceGroup(1261992226);
                gapComposer7.end(false);
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                i2 = i5;
                f = 1.0f;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                companion2 = companion5;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$18;
                r0 = 0;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                neverEqualPolicy = neverEqualPolicy4;
                horizontal = horizontal2;
                r2 = 1;
                modifier3 = null;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                gapComposer4 = gapComposer7;
            } else {
                gapComposer7.startReplaceGroup(1261992227);
                if (topContent instanceof AfterpayAppletUpsellSheetViewModel.TopContent.SingleAvatar) {
                    gapComposer7.startReplaceGroup(2025365665);
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion5, 1.0f);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer7.consume(staticProvidableCompositionLocal2)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth2, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer7, 48);
                    int hashCode2 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer7.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer7, m300paddingVpY3zN4$default);
                    gapComposer7.startReusableNode();
                    if (gapComposer7.inserting) {
                        gapComposer7.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer7.useNode();
                    }
                    Updater.m576setimpl(gapComposer7, rowMeasurePolicy, composeUiNode$Companion$SetModifier$15);
                    Updater.m576setimpl(gapComposer7, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$16);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer7, composeUiNode$Companion$SetModifier$17, gapComposer7, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    Updater.m576setimpl(gapComposer7, materializeModifier2, composeUiNode$Companion$SetModifier$18);
                    AvatarEntry avatarEntry = com.squareup.cash.arcade.util.AvatarsKt.toAvatarEntry(StackedAvatarViewModelKt.toStackedAvatarViewModel(((AfterpayAppletUpsellSheetViewModel.TopContent.SingleAvatar) topContent).avatar).avatar, null, null, gapComposer7, 8, 3);
                    AvatarSize avatarSize = AvatarSize.Size64;
                    ((DefaultSizes) gapComposer7.consume(staticProvidableCompositionLocal2)).getClass();
                    companion = companion5;
                    TextViewKt.Avatar(avatarSize, avatarEntry, SpacerKt.m300paddingVpY3zN4$default(companion5, RecyclerView.DECELERATION_RATE, 8.0f, 1), false, gapComposer7, 6, 24);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer7, null);
                    gapComposer7.end(true);
                    gapComposer7.end(false);
                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                    z = false;
                    gapComposer3 = gapComposer7;
                    composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                    composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                    neverEqualPolicy = neverEqualPolicy4;
                    horizontal = horizontal2;
                    composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$18;
                    i2 = i5;
                    z2 = true;
                    modifier3 = null;
                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                    layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                } else {
                    companion = companion5;
                    if (topContent instanceof AfterpayAppletUpsellSheetViewModel.TopContent.AvatarCarousel) {
                        gapComposer7.startReplaceGroup(2026019300);
                        ArrayList arrayList = ((AfterpayAppletUpsellSheetViewModel.TopContent.AvatarCarousel) topContent).avatars;
                        if (arrayList.isEmpty()) {
                            composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                            GapComposer gapComposer8 = gapComposer7;
                            composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                            composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                            neverEqualPolicy = neverEqualPolicy4;
                            horizontal = horizontal2;
                            composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$18;
                            i2 = i5;
                            z3 = false;
                            z4 = true;
                            modifier3 = null;
                            ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                            layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                            gapComposer8.startReplaceGroup(2026774336);
                            gapComposer8.end(false);
                            gapComposer2 = gapComposer8;
                        } else {
                            gapComposer7.startReplaceGroup(2026066079);
                            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer7, null);
                            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(39060962, new SetPinViewKt$$ExternalSyntheticLambda4(4, function1), gapComposer7);
                            GapComposer gapComposer9 = gapComposer7;
                            composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                            neverEqualPolicy = neverEqualPolicy4;
                            z4 = true;
                            horizontal = horizontal2;
                            composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$18;
                            i2 = i5;
                            ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                            composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                            modifier3 = null;
                            layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                            composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                            z3 = false;
                            Section.Header.m3609FloatingTileRow9QcgTRs(arrayList, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13.0f, 0L, 0.0d, rememberComposableLambda, gapComposer9, 1575936);
                            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer9, null);
                            gapComposer9.end(false);
                            gapComposer2 = gapComposer9;
                        }
                        gapComposer2.end(z3);
                        z = z3;
                        z2 = z4;
                        gapComposer3 = gapComposer2;
                    } else {
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                        GapComposer gapComposer10 = gapComposer7;
                        composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                        composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                        neverEqualPolicy = neverEqualPolicy4;
                        horizontal = horizontal2;
                        composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$18;
                        i2 = i5;
                        z = false;
                        z2 = true;
                        modifier3 = null;
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                        layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                        if (!(topContent instanceof AfterpayAppletUpsellSheetViewModel.TopContent.ImageHero)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer10, 896616564, false);
                        }
                        gapComposer10.startReplaceGroup(2026859555);
                        DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer10, null);
                        ImageHero(((AfterpayAppletUpsellSheetViewModel.TopContent.ImageHero) topContent).image, gapComposer10, 0);
                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer10, null);
                        gapComposer10.end(false);
                        gapComposer3 = gapComposer10;
                    }
                }
                gapComposer3.end(z);
                companion2 = companion;
                f = 1.0f;
                r0 = z;
                r2 = z2;
                gapComposer4 = gapComposer3;
            }
            Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion2, f);
            ((DefaultSizes) gapComposer4.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth3, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer4, r0);
            int hashCode3 = Long.hashCode(gapComposer4.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer4.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer4, m300paddingVpY3zN4$default2);
            gapComposer4.startReusableNode();
            if (gapComposer4.inserting) {
                gapComposer4.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer4.useNode();
            }
            Updater.m576setimpl(gapComposer4, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer4, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer4, composeUiNode$Companion$SetModifier$13, gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer4, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            String str = afterpayAppletUpsellSheetViewModel.title;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = ArcadeThemeKt.LocalTypography;
            Modifier.Companion companion6 = companion2;
            Modifier modifier4 = modifier3;
            Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4088, 0L, (Composer) gapComposer4, SizeKt.fillMaxWidth(companion2, f), ((Typography) gapComposer4.consume(staticProvidableCompositionLocal3)).header, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            DBUtil.SpacerWithinSectionSmall(r0, r2, gapComposer4, modifier4);
            String str2 = afterpayAppletUpsellSheetViewModel.body;
            if (str2 == null) {
                gapComposer4.startReplaceGroup(-1848328278);
                gapComposer4.end(r0);
                i3 = i2;
                neverEqualPolicy3 = neverEqualPolicy;
                staticProvidableCompositionLocal = staticProvidableCompositionLocal3;
                companion3 = companion6;
                gapComposer5 = gapComposer4;
            } else {
                gapComposer4.startReplaceGroup(-1848328277);
                TextStyle textStyle = ((Typography) gapComposer4.consume(staticProvidableCompositionLocal3)).bodyMedium;
                Modifier fillMaxWidth4 = SizeKt.fillMaxWidth(companion6, 1.0f);
                int i6 = i2;
                boolean z6 = i6 == 32 ? r2 : r0;
                Object rememberedValue3 = gapComposer4.rememberedValue();
                if (z6) {
                    neverEqualPolicy2 = neverEqualPolicy;
                } else {
                    neverEqualPolicy2 = neverEqualPolicy;
                    if (rememberedValue3 != neverEqualPolicy2) {
                        Composer composer2 = gapComposer4;
                        staticProvidableCompositionLocal = staticProvidableCompositionLocal3;
                        i3 = i6;
                        companion3 = companion6;
                        neverEqualPolicy3 = neverEqualPolicy2;
                        LazyDslKt.m304MarkdownTextpCuZGqc(str2, (Function2) rememberedValue3, fillMaxWidth4, textStyle, 0L, null, null, null, 0, 0, 0, composer2, MLKEMEngine.KyberPolyBytes, 2032);
                        GapComposer gapComposer11 = composer2;
                        DBUtil.SpacerWithinSectionMedium(r0, r2, gapComposer11, modifier4);
                        gapComposer11.end(r0);
                        gapComposer5 = gapComposer11;
                    }
                }
                rememberedValue3 = new SwipeToDismissKt$$ExternalSyntheticLambda4(19, function1);
                gapComposer4.updateRememberedValue(rememberedValue3);
                Composer composer22 = gapComposer4;
                staticProvidableCompositionLocal = staticProvidableCompositionLocal3;
                i3 = i6;
                companion3 = companion6;
                neverEqualPolicy3 = neverEqualPolicy2;
                LazyDslKt.m304MarkdownTextpCuZGqc(str2, (Function2) rememberedValue3, fillMaxWidth4, textStyle, 0L, null, null, null, 0, 0, 0, composer22, MLKEMEngine.KyberPolyBytes, 2032);
                GapComposer gapComposer112 = composer22;
                DBUtil.SpacerWithinSectionMedium(r0, r2, gapComposer112, modifier4);
                gapComposer112.end(r0);
                gapComposer5 = gapComposer112;
            }
            DBUtil.SpacerWithinSectionSmall(r0, r2, gapComposer5, modifier4);
            String str3 = afterpayAppletUpsellSheetViewModel.footer;
            if (str3 == null) {
                gapComposer5.startReplaceGroup(-1847965733);
                gapComposer5.end(r0);
                companion4 = companion3;
                gapComposer6 = gapComposer5;
            } else {
                gapComposer5.startReplaceGroup(-1847965732);
                TextStyle textStyle2 = ((Typography) gapComposer5.consume(staticProvidableCompositionLocal)).bodySmall;
                Modifier.Companion companion7 = companion3;
                Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(Alignment.Companion.CenterHorizontally, SizeKt.fillMaxWidth(companion7, 1.0f));
                boolean z7 = i3 == 32 ? r2 : r0;
                Object rememberedValue4 = gapComposer5.rememberedValue();
                if (z7 || rememberedValue4 == neverEqualPolicy3) {
                    rememberedValue4 = new SwipeToDismissKt$$ExternalSyntheticLambda4(20, function1);
                    gapComposer5.updateRememberedValue(rememberedValue4);
                }
                companion4 = companion7;
                Composer composer3 = gapComposer5;
                LazyDslKt.m304MarkdownTextpCuZGqc(str3, (Function2) rememberedValue4, m, textStyle2, 0L, null, null, null, 0, 0, 3, composer3, 0, IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                GapComposer gapComposer12 = composer3;
                DBUtil.SpacerWithinSectionMedium(r0, r2, gapComposer12, modifier4);
                gapComposer12.end(r0);
                gapComposer6 = gapComposer12;
            }
            DBUtil.SpacerWithinSectionSmall(r0, r2, gapComposer6, modifier4);
            gapComposer6.end(r2);
            afterpayAppletUpsellSheetViewModel2 = afterpayAppletUpsellSheetViewModel;
            if (afterpayAppletUpsellSheetViewModel2.ctaButton == null && afterpayAppletUpsellSheetViewModel2.secondaryButton == null) {
                gapComposer6.startReplaceGroup(1265069845);
                gapComposer6.end(r0);
                function12 = function1;
            } else {
                gapComposer6.startReplaceGroup(1264866113);
                function12 = function1;
                DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-18393878, new BrandSheetViewKt$$ExternalSyntheticLambda1(22, (Object) afterpayAppletUpsellSheetViewModel2, (Object) function12), gapComposer6), gapComposer6, 24576, 15);
                gapComposer6.end(r0);
            }
            gapComposer6.end(r2);
            modifier2 = companion4;
            gapComposer = gapComposer6;
        } else {
            function12 = function1;
            gapComposer7.skipToGroupEnd();
            modifier2 = modifier;
            gapComposer = gapComposer7;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InlineAppMessageKt$$ExternalSyntheticLambda8(afterpayAppletUpsellSheetViewModel2, function12, modifier2, i, 10);
        }
    }

    public static final void AfterpayListUnordered(int i, Composer composer, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, boolean z) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(906029929);
        int i2 = i | 6;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 0);
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
            composableLambdaImpl.invoke(new AfterpayListUnorderedScope(z), (Object) gapComposer, (Object) 48);
            gapComposer.end(true);
            modifier = companion;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EarningsHeaderKt$$ExternalSyntheticLambda14(modifier, z, composableLambdaImpl, i);
        }
    }

    public static final void AfterpayPurchasesContent(AfterpayAppletPurchasesEmbeddedViewModel.Default r9, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-754023947);
        int i2 = (gapComposer.changedInstance(r9) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            AfterpayAppletPurchasesEmbeddedViewModel.EmbeddedActivitySection embeddedActivitySection = r9.upcomingActivitiesSection;
            AfterpayAppletPurchasesEmbeddedViewModel.EmbeddedActivitySection embeddedActivitySection2 = r9.completedActivitiesSection;
            boolean z = embeddedActivitySection.activitiesViewModel.isRefreshing || embeddedActivitySection2.activitiesViewModel.isRefreshing;
            String stringResource = Room.stringResource(gapComposer, R.string.afterpay_applet_pull_to_refresh_label);
            boolean z2 = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ReceiptUiKt$$ExternalSyntheticLambda3(22, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            VisibleKt.PullToRefresh(196608, 12, gapComposer, Expect_jvmKt.rememberComposableLambda(1236331328, new DismissableToastKt$$ExternalSyntheticLambda4(r9, function1, embeddedActivitySection, embeddedActivitySection2), gapComposer), null, stringResource, (Function0) rememberedValue, z, false);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InlineAppMessageKt$$ExternalSyntheticLambda8(r9, function1, modifier2, i, 9);
        }
    }

    public static final void AfterpaySearch(AfterpaySearchViewModel afterpaySearchViewModel, Function1 function1, Composer composer, int i) {
        afterpaySearchViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-288914806);
        int i2 = (gapComposer.changedInstance(afterpaySearchViewModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Content(afterpaySearchViewModel, SearchBarKt.rememberSearchBarKeyboardState(false, gapComposer), function1, gapComposer, ((i2 << 3) & 896) | (i2 & 14));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SectionHeaderScope$$ExternalSyntheticLambda1(afterpaySearchViewModel, function1, i, 13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AppletTitleBar(Modifier modifier, String str, TappableIcon tappableIcon, Function0 function0, Function0 function02, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        TappableIcon tappableIcon2;
        int i4;
        Function0 function03;
        TappableIcon tappableIcon3;
        Function0 function04;
        RecomposeScopeImpl endRestartGroup;
        Function0 function05;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(808731958);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (gapComposer.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(str) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            tappableIcon2 = tappableIcon;
            i3 |= gapComposer.changedInstance(tappableIcon2) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= gapComposer.changedInstance(function0) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function03 = function02;
                i3 |= gapComposer.changedInstance(function03) ? 16384 : PKIFailureInfo.certRevoked;
                if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
                    Modifier modifier3 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                    TappableIcon tappableIcon4 = i6 != 0 ? null : tappableIcon2;
                    if (i4 != 0) {
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (rememberedValue == Composer.Companion.Empty) {
                            rememberedValue = new MotionKt$$ExternalSyntheticLambda0(16);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        function05 = (Function0) rememberedValue;
                    } else {
                        function05 = function03;
                    }
                    DBUtil.TitleBarSub(Expect_jvmKt.rememberComposableLambda(1022192252, new ToastKt$$ExternalSyntheticLambda1(str, 14), gapComposer), NavigationType.BACK, SizeKt.fillMaxWidth(modifier3, 1.0f), (DynamicColorConfiguration) null, function0, (Modifier) null, Expect_jvmKt.rememberComposableLambda(-854933737, new BrandSheetViewKt$$ExternalSyntheticLambda1(21, tappableIcon4, function05), gapComposer), gapComposer, ((i3 << 3) & 57344) | 1572918, 40);
                    tappableIcon3 = tappableIcon4;
                    function04 = function05;
                    modifier2 = modifier3;
                } else {
                    gapComposer.skipToGroupEnd();
                    tappableIcon3 = tappableIcon2;
                    function04 = function03;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda3(modifier2, (Object) str, (Object) tappableIcon3, (Object) function0, (Object) function04, i, i2, 7);
                    return;
                }
                return;
            }
            function03 = function02;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        tappableIcon2 = tappableIcon;
        if ((i & 3072) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function03 = function02;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void Content(AfterpaySearchViewModel afterpaySearchViewModel, final SearchBarKeyboardState searchBarKeyboardState, Function1 function1, Composer composer, int i) {
        afterpaySearchViewModel.getClass();
        searchBarKeyboardState.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(751208540);
        int i2 = (gapComposer.changedInstance(afterpaySearchViewModel) ? 4 : 2) | i | (gapComposer.changed(searchBarKeyboardState) ? 32 : 16);
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Object[] objArr = new Object[0];
            WorkLauncherImpl workLauncherImpl = LazyListState.Saver;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new MotionKt$$ExternalSyntheticLambda0(17);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyListState lazyListState = (LazyListState) SaverKt.m581rememberSaveable(objArr, (Saver) workLauncherImpl, (Function0) rememberedValue, (Composer) gapComposer, MLKEMEngine.KyberPolyBytes);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
            }
            final ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue2;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
            }
            final ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) rememberedValue3;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = Updater.mutableStateOf$default(null);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            final MutableState mutableState = (MutableState) rememberedValue4;
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
            }
            final ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3 = (ParcelableSnapshotMutableIntState) rememberedValue5;
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (rememberedValue6 == neverEqualPolicy) {
                NestedScrollConnection nestedScrollConnection = new NestedScrollConnection() { // from class: com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt$Content$nestedScrollConnection$1$1
                    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
                    /* renamed from: onPreScroll-OzD1aCk */
                    public final long mo326onPreScrollOzD1aCk(int i3, long j) {
                        SearchBarKeyboardState.this.setOpen(false);
                        int intBitsToFloat = (int) Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
                        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState4 = parcelableSnapshotMutableIntState;
                        int intValue = parcelableSnapshotMutableIntState4.getIntValue() - parcelableSnapshotMutableIntState2.getIntValue();
                        int intValue2 = parcelableSnapshotMutableIntState4.getIntValue();
                        MutableState mutableState2 = mutableState;
                        Integer num = (Integer) mutableState2.getValue();
                        mutableState2.setValue(Integer.valueOf(RangesKt___RangesKt.coerceIn((num != null ? num.intValue() : parcelableSnapshotMutableIntState4.getIntValue()) + intBitsToFloat, intValue, intValue2)));
                        Integer num2 = (Integer) mutableState2.getValue();
                        num2.getClass();
                        parcelableSnapshotMutableIntState3.setIntValue(num2.intValue() - parcelableSnapshotMutableIntState4.getIntValue());
                        return (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax);
                    }
                };
                gapComposer.updateRememberedValue(nestedScrollConnection);
                rememberedValue6 = nestedScrollConnection;
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-413204953, new DateInputKt$$ExternalSyntheticLambda1((AfterpaySearchViewKt$Content$nestedScrollConnection$1$1) rememberedValue6, afterpaySearchViewModel, function1, lazyListState, searchBarKeyboardState, parcelableSnapshotMutableIntState, parcelableSnapshotMutableIntState2, parcelableSnapshotMutableIntState3), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CopyCodeKt$$ExternalSyntheticLambda10(afterpaySearchViewModel, searchBarKeyboardState, function1, i, 2);
        }
    }

    public static final void ContentView(AfterpayAppletMerchantSheetViewModel afterpayAppletMerchantSheetViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(870981494);
        int i2 = (gapComposer.changed(afterpayAppletMerchantSheetViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
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
            if (afterpayAppletMerchantSheetViewModel instanceof AfterpayAppletMerchantSheetViewModel.Error) {
                gapComposer.startReplaceGroup(-1659027752);
                ErrorMerchantSheetView((AfterpayAppletMerchantSheetViewModel.Error) afterpayAppletMerchantSheetViewModel, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                gapComposer.end(false);
            } else if (afterpayAppletMerchantSheetViewModel instanceof AfterpayAppletMerchantSheetViewModel.Loaded) {
                gapComposer.startReplaceGroup(-1659025287);
                LoadedMerchantSheetView((AfterpayAppletMerchantSheetViewModel.Loaded) afterpayAppletMerchantSheetViewModel, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                gapComposer.end(false);
            } else {
                if (!(afterpayAppletMerchantSheetViewModel instanceof AfterpayAppletMerchantSheetViewModel.Loading)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1659028643, false);
                }
                gapComposer.startReplaceGroup(-1659022790);
                LoadingMerchantSheetView(gapComposer, 0);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AfterpayAppletMerchantSheetView$$ExternalSyntheticLambda4(afterpayAppletMerchantSheetViewModel, function1, i);
        }
    }

    public static final void ErrorMerchantSheetView(AfterpayAppletMerchantSheetViewModel.Error error, Function1 function1, Composer composer, int i) {
        AfterpayAppletMerchantSheetViewModel.Error error2;
        Function1 function12;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1571019149);
        int i2 = i | (gapComposer.changed(error) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new ActivityTabViewKt$$ExternalSyntheticLambda17(25);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(fillMaxWidth, false, (Function1) rememberedValue);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
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
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Trace.m1191Iconww6aTOc(Icons.AlertOutline24, (String) null, (Modifier) null, 0L, gapComposer, 54, 12);
            String str = error.title;
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, colors.semantic.text.standard, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                function12 = function1;
                rememberedValue2 = new ReceiptUiKt$$ExternalSyntheticLambda3(18, function12);
                gapComposer.updateRememberedValue(rememberedValue2);
            } else {
                function12 = function1;
            }
            error2 = error;
            coil3.size.SizeKt.Button((Function0) rememberedValue2, null, null, false, false, null, Expect_jvmKt.rememberComposableLambda(-882047542, new BalanceFeedKt$$ExternalSyntheticLambda9(error2, 13), gapComposer), gapComposer, 1572864, 62);
            gapComposer = gapComposer;
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            error2 = error;
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AtmPickerGridKt$$ExternalSyntheticLambda4(error2, function12, i, 10);
        }
    }

    public static final void FilterBottomSheet(AfterpaySearchViewModel afterpaySearchViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-93107234);
        int i2 = 16;
        int i3 = (gapComposer.changedInstance(afterpaySearchViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            AfterpaySearchViewModel.FilterBottomSheetViewModel filterBottomSheetViewModel = afterpaySearchViewModel.filterBottomSheet;
            BottomSheetConfig.HeightMode heightMode = BottomSheetConfig.HeightMode.EIGHTY_PERCENT;
            ArcadeBottomSheetStyle ArcadeBottomSheetStyle = Navigation.ArcadeBottomSheetStyle(gapComposer);
            boolean z = (i3 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ReceiptUiKt$$ExternalSyntheticLambda3(27, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ComposeBottomSheetKt.BottomSheet(filterBottomSheetViewModel, filterBottomSheetViewModel, (Function0) rememberedValue, false, false, 0, heightMode, ArcadeBottomSheetStyle, Expect_jvmKt.rememberComposableLambda(-1150613099, new BrandSheetViewKt$$ExternalSyntheticLambda6(i2, function1), gapComposer), gapComposer, 119013376, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AfterpaySearchView$$ExternalSyntheticLambda1(afterpaySearchViewModel, function1, i);
        }
    }

    public static final void FilterBottomSheetContent(AfterpaySearchViewModel.FilterBottomSheetViewModel filterBottomSheetViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function12;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(952301935);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(filterBottomSheetViewModel) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String str = filterBottomSheetViewModel.selectedItemToken;
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = Updater.mutableStateOf$default(str);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
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
            char c = 14;
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14, 1.0f, true), ImageKt.rememberScrollState(gapComposer), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Transformations.SheetHeader(filterBottomSheetViewModel.title, (Modifier) null, (Function2) null, (String) null, gapComposer, 0, 14);
            gapComposer.startReplaceGroup(-1214998006);
            Iterator it = filterBottomSheetViewModel.rows.iterator();
            while (it.hasNext()) {
                final AfterpaySearchViewModel.FilterBottomSheetViewModel.FilterBottomSheetRowViewModel filterBottomSheetRowViewModel = (AfterpaySearchViewModel.FilterBottomSheetViewModel.FilterBottomSheetRowViewModel) it.next();
                CellDefaultAccessory.Radio radio = new CellDefaultAccessory.Radio(Intrinsics.areEqual(filterBottomSheetRowViewModel.token, (String) mutableState.getValue()));
                final int i3 = 0;
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-2117392250, new Function2() { // from class: com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        int i4 = i3;
                        AfterpaySearchViewModel.FilterBottomSheetViewModel.FilterBottomSheetRowViewModel filterBottomSheetRowViewModel2 = filterBottomSheetRowViewModel;
                        switch (i4) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                    zzd zzdVar = Icons.Companion;
                                    String str2 = filterBottomSheetRowViewModel2.iconId;
                                    zzdVar.getClass();
                                    Icons icons = zzd.get(str2);
                                    if (icons == null) {
                                        gapComposer2.startReplaceGroup(952178985);
                                    } else {
                                        gapComposer2.startReplaceGroup(952178986);
                                        Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                                    }
                                    gapComposer2.end(false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, filterBottomSheetRowViewModel2.name, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer);
                final int i4 = 1;
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-2124772571, new Function2() { // from class: com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        int i42 = i4;
                        AfterpaySearchViewModel.FilterBottomSheetViewModel.FilterBottomSheetRowViewModel filterBottomSheetRowViewModel2 = filterBottomSheetRowViewModel;
                        switch (i42) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                    zzd zzdVar = Icons.Companion;
                                    String str2 = filterBottomSheetRowViewModel2.iconId;
                                    zzdVar.getClass();
                                    Icons icons = zzd.get(str2);
                                    if (icons == null) {
                                        gapComposer2.startReplaceGroup(952178985);
                                    } else {
                                        gapComposer2.startReplaceGroup(952178986);
                                        Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                                    }
                                    gapComposer2.end(false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, filterBottomSheetRowViewModel2.name, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer);
                boolean changedInstance = gapComposer.changedInstance(filterBottomSheetRowViewModel);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue2 == obj) {
                    rememberedValue2 = new BalanceFeedKt$$ExternalSyntheticLambda5(22, filterBottomSheetRowViewModel, mutableState);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, null, (Function0) rememberedValue2, false, true, null, null, radio, 0L, gapComposer, 1572918, 3508);
                it = it;
                mutableState = mutableState;
                obj = obj;
                c = 14;
            }
            gapComposer.end(false);
            gapComposer.end(true);
            function12 = function1;
            DimensionKt.ButtonCtaGroup(null, true, ButtonCtaGroupOrientation.AUTOMATIC, null, Expect_jvmKt.rememberComposableLambda(1559518967, new LocalViewFactory$$ExternalSyntheticLambda6(function12, filterBottomSheetViewModel, mutableState), gapComposer), gapComposer, 25008, 9);
            gapComposer.end(true);
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SectionHeaderScope$$ExternalSyntheticLambda1(filterBottomSheetViewModel, function12, i, 14);
        }
    }

    public static final void FilterRow(final Modifier modifier, final List list, final SearchBarKeyboardState searchBarKeyboardState, final Function1 function1, Composer composer, final int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-939063480);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i | (gapComposer.changedInstance(list) ? 32 : 16) | (gapComposer.changed(searchBarKeyboardState) ? 256 : 128) | (gapComposer.changedInstance(function1) ? 2048 : 1024);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (list.isEmpty()) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i3 = 0;
                    endRestartGroup.block = new Function2(modifier, list, searchBarKeyboardState, function1, i, i3) { // from class: com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt$$ExternalSyntheticLambda17
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ Modifier f$0;
                        public final /* synthetic */ List f$1;
                        public final /* synthetic */ SearchBarKeyboardState f$2;
                        public final /* synthetic */ Function1 f$3;

                        {
                            this.$r8$classId = i3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.$r8$classId) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int updateChangedFlags = Updater.updateChangedFlags(1);
                                    AfterpaySearchViewKt.FilterRow(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, updateChangedFlags);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int updateChangedFlags2 = Updater.updateChangedFlags(1);
                                    AfterpaySearchViewKt.FilterRow(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, updateChangedFlags2);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(modifier, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            boolean changedInstance = gapComposer.changedInstance(list) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new UtilsKt$$ExternalSyntheticLambda0(20, list, searchBarKeyboardState, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            FilterBarKt.FilterBar(m300paddingVpY3zN4$default, null, null, (Function1) rememberedValue, gapComposer, 0, 6);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i4 = 1;
            endRestartGroup2.block = new Function2(modifier, list, searchBarKeyboardState, function1, i, i4) { // from class: com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt$$ExternalSyntheticLambda17
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ Modifier f$0;
                public final /* synthetic */ List f$1;
                public final /* synthetic */ SearchBarKeyboardState f$2;
                public final /* synthetic */ Function1 f$3;

                {
                    this.$r8$classId = i4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.$r8$classId) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int updateChangedFlags = Updater.updateChangedFlags(1);
                            AfterpaySearchViewKt.FilterRow(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, updateChangedFlags);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int updateChangedFlags2 = Updater.updateChangedFlags(1);
                            AfterpaySearchViewKt.FilterRow(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, updateChangedFlags2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void ImageHero(Image image, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(333067965);
        int i2 = (gapComposer.changedInstance(image) ? 4 : 2) | i;
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            long j = Strings.getColors(gapComposer).semantic.background.subtle;
            Strings.getSizes(gapComposer).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(m300paddingVpY3zN4$default, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
            Strings.getSizes(gapComposer).getClass();
            Strings.getSizes(gapComposer).getClass();
            Strings.getSizes(gapComposer).getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(m177backgroundbw27NRU, 16.0f, 24.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            AsyncImageKt.m1438AsyncImage10Xjiaw(ThemablesKt.urlForTheme(image, gapComposer), null, BoxScopeInstance.INSTANCE.align(SizeKt.fillMaxWidth(companion, 1.0f), Alignment.Companion.Center), null, ContentScale.Companion.Fit, null, gapComposer, 1572912, 1976);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ProfilePreviewKt$$ExternalSyntheticLambda9(image, i, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v19 */
    public static final void LoadedMerchantSheetView(AfterpayAppletMerchantSheetViewModel.Loaded loaded, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1807045487);
        Applier applier = gapComposer.applier;
        int i2 = (gapComposer.changed(loaded) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        boolean z = false;
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.TRUE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState2 = (MutableState) rememberedValue2;
            LifecycleOwner lifecycleOwner = (LifecycleOwner) gapComposer.consume(LocalLifecycleOwnerKt.LocalLifecycleOwner);
            int i4 = i2 & 112;
            boolean changedInstance = (i4 == 32) | gapComposer.changedInstance(lifecycleOwner);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new CaptureCheckFaceKt$$ExternalSyntheticLambda10(lifecycleOwner, mutableState, function1, i3);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Updater.DisposableEffect(lifecycleOwner, (Function1) rememberedValue3, gapComposer);
            ?? r4 = i4 == 32;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (r4 != false || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new CashtagViewKt$$ExternalSyntheticLambda13(mutableState2, function1, 3);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(VisibleKt.onVisible$default(companion, (Function0) rememberedValue4), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            Countries.PageHeader(loaded.title, (Modifier) null, Expect_jvmKt.rememberComposableLambda(-649023474, new ButtonBinding$$ExternalSyntheticLambda2(loaded, 5), gapComposer), loaded.subtitle, gapComposer, MLKEMEngine.KyberPolyBytes, 2);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            gapComposer.startReplaceGroup(1640412379);
            for (String str : loaded.linesToCopy) {
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
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
                GapComposer gapComposer2 = gapComposer;
                CopyCodeKt.CopyCode(str, null, null, null, null, null, gapComposer2, 432, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                gapComposer = gapComposer2;
                gapComposer.end(true);
                z = false;
                companion = companion;
            }
            boolean z2 = z;
            gapComposer.end(z2);
            DBUtil.SpacerWithinSectionMedium(z2 ? 1 : 0, 1, gapComposer, null);
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth2, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(176833775, new BalanceFeedKt$$ExternalSyntheticLambda9(loaded, 14), gapComposer);
            squareup.cash.ui.arcade.elements.ButtonProminence buttonProminence = loaded.button.buttonProminence;
            ?? r5 = ((14 & i2) == 4 ? true : z2 ? 1 : 0) | (i4 == 32 ? true : z2 ? 1 : 0);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (r5 != false || rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = new BalanceFeedKt$$ExternalSyntheticLambda5(18, function1, loaded);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            ArcadeElement.Element.ButtonCta(m300paddingVpY3zN4$default, rememberComposableLambda, buttonProminence, (Function0) rememberedValue5, gapComposer, 48);
            DBUtil.SpacerWithinSectionMedium(z2 ? 1 : 0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AtmPickerGridKt$$ExternalSyntheticLambda4(loaded, function1, i, 9);
        }
    }

    public static final void LoadingBody(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1607228626);
        int i2 = 2;
        int i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth, 16.0f, 16.0f, 16.0f, RecyclerView.DECELERATION_RATE, 8);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
            ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DividerKt$$ExternalSyntheticLambda1(modifier, i, i2);
        }
    }

    public static final void LoadingMerchantSheetView(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1119846872);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            ProgressCircularKt.ProgressCircular(6, 0, gapComposer, SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), RecyclerView.DECELERATION_RATE, 60.0f, 1));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ReceiptUiKt$$ExternalSyntheticLambda4(i, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v6 */
    public static final void NoResults(Modifier modifier, AfterpaySearchViewModel.BodyViewModel.NoContentViewModel noContentViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        boolean z;
        boolean z2;
        GapComposer gapComposer2;
        boolean z3;
        int i2;
        GapComposer gapComposer3;
        Modifier.Companion companion;
        GapComposer gapComposer4;
        GapComposer gapComposer5;
        GapComposer gapComposer6;
        Painter painterResource;
        Image image = noContentViewModel.remoteImage;
        GapComposer gapComposer7 = (GapComposer) composer;
        gapComposer7.startRestartGroup(-1393572140);
        int i3 = i | (gapComposer7.changed(modifier) ? 4 : 2) | (gapComposer7.changedInstance(noContentViewModel) ? 32 : 16) | (gapComposer7.changedInstance(function1) ? 256 : 128);
        if (gapComposer7.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            ((DefaultSizes) gapComposer7.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth, 16.0f, 16.0f, 16.0f, RecyclerView.DECELERATION_RATE, 8);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer7, 48);
            int hashCode = Long.hashCode(gapComposer7.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer7.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer7, m302paddingqDBjuR0$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer7.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer7.startReusableNode();
            if (gapComposer7.inserting) {
                gapComposer7.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer7.useNode();
            }
            Updater.m576setimpl(gapComposer7, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer7, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer7, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer7, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer7, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            ContentScale$Companion$Fit$1 contentScale$Companion$Fit$1 = ContentScale.Companion.FillWidth;
            if (image == null) {
                gapComposer7.startReplaceGroup(1909961731);
                gapComposer7.end(false);
                z2 = 0;
                z = true;
                gapComposer2 = gapComposer7;
            } else {
                gapComposer7.startReplaceGroup(1909961732);
                GapComposer gapComposer8 = gapComposer7;
                z = true;
                z2 = 0;
                AsyncImageKt.m1438AsyncImage10Xjiaw(ThemablesKt.urlForTheme(image, gapComposer7), null, SizeKt.m287sizeVpY3zN4(SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 32.0f, 7), 250.0f, 180.0f), null, contentScale$Companion$Fit$1, null, gapComposer8, 1572912, 1976);
                gapComposer8.end(false);
                gapComposer2 = gapComposer8;
            }
            if (image == null && noContentViewModel.fallbackToLocalImage) {
                gapComposer2.startReplaceGroup(1910294951);
                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, z2);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(z2);
                }
                boolean z4 = colors.isLight;
                if (z4 == z) {
                    gapComposer2.startReplaceGroup(1447098303);
                    painterResource = Countries.painterResource(R.drawable.arcade_telescope_light, z2, gapComposer2);
                    gapComposer2.end(z2);
                } else {
                    if (z4) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, 1447096665, z2);
                    }
                    gapComposer2.startReplaceGroup(1447101086);
                    painterResource = Countries.painterResource(R.drawable.arcade_telescope_dark, z2, gapComposer2);
                    gapComposer2.end(z2);
                }
                Painter painter = painterResource;
                GapComposer gapComposer9 = gapComposer2;
                z3 = z2;
                i2 = 16;
                ImageKt.Image(painter, null, SizeKt.fillMaxWidth(SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 32.0f, 7), 1.0f), null, contentScale$Companion$Fit$1, RecyclerView.DECELERATION_RATE, null, gapComposer9, Painter.$stable | 25008, 104);
                GapComposer gapComposer10 = gapComposer9;
                gapComposer10.end(z3);
                gapComposer3 = gapComposer10;
            } else {
                z3 = z2;
                i2 = 16;
                gapComposer2.startReplaceGroup(1910697796);
                gapComposer2.end(z3);
                gapComposer3 = gapComposer2;
            }
            String str = noContentViewModel.title;
            if (str == null) {
                gapComposer3.startReplaceGroup(1910720239);
                gapComposer3.end(z3);
                companion = companion2;
                gapComposer4 = gapComposer3;
            } else {
                gapComposer3.startReplaceGroup(1910720240);
                companion = companion2;
                GapComposer gapComposer11 = gapComposer3;
                Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4088, 0L, (Composer) gapComposer11, SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, 7), ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).sectionTitle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                GapComposer gapComposer12 = gapComposer11;
                gapComposer12.end(z3);
                gapComposer4 = gapComposer12;
            }
            String str2 = noContentViewModel.subtitle;
            if (str2 == null) {
                gapComposer4.startReplaceGroup(1910887856);
                gapComposer4.end(z3);
                gapComposer5 = gapComposer4;
            } else {
                gapComposer4.startReplaceGroup(1910887857);
                GapComposer gapComposer13 = gapComposer4;
                Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4088, 0L, (Composer) gapComposer13, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7), ((Typography) gapComposer4.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                GapComposer gapComposer14 = gapComposer13;
                gapComposer14.end(z3);
                gapComposer5 = gapComposer14;
            }
            if (noContentViewModel.buttonText == null && noContentViewModel.buttonIconId == null) {
                gapComposer5.startReplaceGroup(1911359460);
                gapComposer5.end(z3);
                gapComposer6 = gapComposer5;
            } else {
                gapComposer5.startReplaceGroup(1911102873);
                boolean changedInstance = gapComposer5.changedInstance(noContentViewModel) | ((i3 & 896) == 256 ? true : z3);
                Object rememberedValue = gapComposer5.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new BalanceFeedKt$$ExternalSyntheticLambda5(21, function1, noContentViewModel);
                    gapComposer5.updateRememberedValue(rememberedValue);
                }
                GapComposer gapComposer15 = gapComposer5;
                coil3.size.SizeKt.ButtonCompact((Function0) rememberedValue, null, null, false, false, null, Expect_jvmKt.rememberComposableLambda(-1328932716, new BalanceFeedKt$$ExternalSyntheticLambda9(noContentViewModel, i2), gapComposer5), gapComposer15, 1572864, 62);
                GapComposer gapComposer16 = gapComposer15;
                gapComposer16.end(z3);
                gapComposer6 = gapComposer16;
            }
            gapComposer6.end(true);
            gapComposer = gapComposer6;
        } else {
            GapComposer gapComposer17 = gapComposer7;
            gapComposer17.skipToGroupEnd();
            gapComposer = gapComposer17;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InlineAppMessageKt$$ExternalSyntheticLambda8(i, 11, modifier, noContentViewModel, function1);
        }
    }

    public static final void PurchasesToolbar(String str, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-825811608);
        int i2 = 4;
        int i3 = (gapComposer.changed(str) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            NavigationType navigationType = NavigationType.BACK;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1470655330, new ToastKt$$ExternalSyntheticLambda1(str, 13), gapComposer);
            boolean z = (i3 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ReceiptUiKt$$ExternalSyntheticLambda3(25, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub(rememberComposableLambda, navigationType, fillMaxWidth, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 438, 104);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolCreateViewKt$$ExternalSyntheticLambda6(str, function1, i, i2);
        }
    }

    public static final void PurchasesTotalOwedSection(AfterpayAppletPurchasesEmbeddedViewModel.TotalOwedSection totalOwedSection, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2049233117);
        int i2 = (gapComposer.changedInstance(totalOwedSection) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ActivityTabViewKt$$ExternalSyntheticLambda17(28);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier semantics = SemanticsModifierKt.semantics(companion, true, (Function1) rememberedValue);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            CrossfadeKt.Crossfade(totalOwedSection.totalOwedValue, (Modifier) null, (FiniteAnimationSpec) null, "AfterpayAppletPurchasesTotalOwed", f133lambda$1756839187, gapComposer, 27648, 6);
            Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4088, 0L, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, totalOwedSection.totalOwedTitle, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ButtonBinding$$ExternalSyntheticLambda2(totalOwedSection, i, 6);
        }
    }

    public static final void RecentlyViewedCarousel(AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.RecentlyViewedCarouselViewModel recentlyViewedCarouselViewModel, SearchBarKeyboardState searchBarKeyboardState, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1728950803);
        int i2 = i | (gapComposer2.changedInstance(recentlyViewedCarouselViewModel) ? 4 : 2) | (gapComposer2.changed(searchBarKeyboardState) ? 32 : 16) | (gapComposer2.changedInstance(function1) ? 256 : 128);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, RecyclerView.DECELERATION_RATE, 16.0f, 1);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m300paddingVpY3zN4$default);
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
            GapComposer gapComposer3 = gapComposer2;
            ViewfinderDefaults.SectionHeader(recentlyViewedCarouselViewModel.title, (Modifier) null, (String) null, (Function0) null, recentlyViewedCarouselViewModel.subtitle, gapComposer3, 0, 14);
            gapComposer3.startReplaceGroup(-1282285000);
            List<AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.RecentlyViewedCarouselViewModel.CarouselEntryViewModel> list = recentlyViewedCarouselViewModel.entries;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.RecentlyViewedCarouselViewModel.CarouselEntryViewModel carouselEntryViewModel : list) {
                GapComposer gapComposer4 = gapComposer3;
                gapComposer3 = gapComposer4;
                arrayList.add(new AvatarCarouselEntry(carouselEntryViewModel.name, carouselEntryViewModel.id, com.squareup.cash.arcade.util.AvatarsKt.toAvatarEntry(carouselEntryViewModel.avatar.avatar, null, new BalanceFeedKt$$ExternalSyntheticLambda9(carouselEntryViewModel, 17), gapComposer4, 8, 1), null, 24));
            }
            gapComposer3.end(false);
            ImmutableList immutableList = Tags.toImmutableList(arrayList);
            boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer3.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CombinedModifier$$ExternalSyntheticLambda0(25, searchBarKeyboardState, function1);
                gapComposer3.updateRememberedValue(rememberedValue);
            }
            GapComposer gapComposer5 = gapComposer3;
            DebugUtils.AvatarCarousel(immutableList, (Function1) rememberedValue, null, null, gapComposer5, 0, 12);
            gapComposer = gapComposer5;
            if (recentlyViewedCarouselViewModel.showFooterDivider) {
                gapComposer.startReplaceGroup(-1095527872);
                ModalKt.HorizontalDivider(0, 0, gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, 16.0f, 16.0f, 16.0f, RecyclerView.DECELERATION_RATE, 8));
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1095430811);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InlineAppMessageKt$$ExternalSyntheticLambda8((Object) recentlyViewedCarouselViewModel, (Object) searchBarKeyboardState, function1, i, 12);
        }
    }

    public static final void SheetButton(AfterpayAppletUpsellSheetViewModel.CtaButton ctaButton, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(212265357);
        int i2 = (gapComposer.changedInstance(ctaButton) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            squareup.cash.ui.arcade.elements.ButtonProminence buttonProminence = ctaButton.prominence;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1891121257, new BalanceFeedKt$$ExternalSyntheticLambda9(ctaButton, 15), gapComposer);
            boolean changedInstance = gapComposer.changedInstance(ctaButton) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BalanceFeedKt$$ExternalSyntheticLambda5(20, function1, ctaButton);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ArcadeElement.Element.ButtonCta(fillMaxWidth, rememberComposableLambda, buttonProminence, (Function0) rememberedValue, gapComposer, 54);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AtmPickerGridKt$$ExternalSyntheticLambda4(ctaButton, function1, i, 14);
        }
    }
}
