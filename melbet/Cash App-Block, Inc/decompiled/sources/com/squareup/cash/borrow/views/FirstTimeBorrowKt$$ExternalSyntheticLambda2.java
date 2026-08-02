package com.squareup.cash.borrow.views;

import android.content.Context;
import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.collection.ArrayMap;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListState$$ExternalSyntheticLambda3;
import androidx.compose.foundation.pager.PagerScopeImpl;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.platform.LazyWindowInfo;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ImageViewCompat;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.paging.compose.LazyPagingItems;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.broadway.ui.compose.UiScopeKt;
import app.cash.local.views.LocalViewFactory$createUi$view$3$1$1$1;
import app.cash.local.views.cart.CartBannerViewKt$$ExternalSyntheticLambda2;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda0;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.yoga.internal.Yoga$$ExternalSyntheticLambda7;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import bo.app.t7$$ExternalSyntheticLambda4;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.fillr.featuretoggle.UnleashContext;
import com.google.android.gms.internal.mlkit_genai_prompt.zzie;
import com.plaid.internal.EnumC0170g;
import com.squareup.address.typeahead.backend.api.AddressState;
import com.squareup.address.typeahead.views.AddressTypeaheadState;
import com.squareup.cash.R;
import com.squareup.cash.account.components.AccountToDoKt;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewModel;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewModel;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda4;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.FilterBarKt;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ScrollingScaffoldContentScope;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.input.InputFieldKt;
import com.squareup.cash.arcade.components.internal.InputState;
import com.squareup.cash.arcade.components.list.ListUnorderedItem;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.viewmodels.InputCardInfoViewModel;
import com.squareup.cash.blockers.viewmodels.SetAddressViewModel;
import com.squareup.cash.blockers.views.AmountBlockerViewKt;
import com.squareup.cash.blockers.views.CardState;
import com.squareup.cash.blockers.views.ExpirationTransformation;
import com.squareup.cash.blockers.views.InputCardInfoViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.blockers.views.InputCardInfoViewKt$WhenMappings;
import com.squareup.cash.blockers.views.LabelValueView$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.views.SetNameViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.blockers.views.VerifyCardViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.borrow.viewmodels.FirstTimeBorrowViewModel;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderHubRowModel;
import com.squareup.cash.calendar.views.CalendarRowKt$$ExternalSyntheticLambda10;
import com.squareup.cash.card.onboarding.CardPreviewViewModel;
import com.squareup.cash.card.onboarding.CardStylePickerViewModel;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda12;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewModel;
import com.squareup.cash.earnings.views.home.EarningsHomeKt;
import com.squareup.cash.education.stories.viewmodels.EducationStoryViewModel;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.graphics.views.TextureViewFpsTracker;
import com.squareup.cash.history.views.SkipPaymentView$$ExternalSyntheticLambda1;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionViewModel;
import com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentViewModel;
import com.squareup.cash.instruments.views.InstrumentCellKt;
import com.squareup.cash.investing.viewmodels.categories.InvestingCategoryDetailViewModel;
import com.squareup.cash.launcher.IntentLauncher$$ExternalSyntheticLambda0;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.money.booklet.MoneyTabBookletKt$$ExternalSyntheticLambda4;
import com.squareup.cash.money.views.CardNestedScrollExpander;
import com.squareup.cash.money.views.HypeWelcomeUIKt;
import com.squareup.cash.money.views.ToolbarNestedScrollExpander;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.nearby.views.PulsingState$$ExternalSyntheticLambda0;
import com.squareup.cash.overlays.RealOverlayLayer$show$3;
import com.squareup.cash.paychecks.backend.api.model.EditDistributionConfiguration;
import com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel;
import com.squareup.cash.payments.views.composer.ErrorKt;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.scrubbing.CardNumberKt;
import com.squareup.cash.scrubbing.MaskVisualTransformation;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.CardRegistry;
import com.squareup.cash.wallet.views.CardTransitionKt;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$$ExternalSyntheticLambda13;
import com.squareup.cash.wallet.views.UtilsKt;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewModel;
import com.squareup.cash.work.views.clockin.ClockInOverlayMode;
import com.squareup.cash.work.views.clockin.ClockInOverlayState;
import com.squareup.cash.work.views.clockin.DisclaimerTextKt;
import com.squareup.protos.common.countries.Country;
import com.squareup.scannerview.ScannerView;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.squareup.util.compose.ListsKt$$ExternalSyntheticLambda0;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.ViewShowRenderingKt;
import com.stripe.android.StripePaymentController$$ExternalSyntheticLambda1;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt;
import com.stripe.android.uicore.image.StripeImageKt$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.camera.CameraPreview;
import com.withpersona.sdk2.camera.NoSuitableCameraError;
import com.withpersona.sdk2.camera.SelfieDirectionFeed;
import com.withpersona.sdk2.camera.camera2.Camera2Controller_Factory_Impl;
import com.withpersona.sdk2.camera.camera2.Camera2ImageAnalyzer;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.camera.camera2.Camera2UtilsKt;
import com.withpersona.sdk2.camera.camera2.CameraChoices;
import com.withpersona.sdk2.camera.camera2.CameraDirection;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2OldSelfieCameraBinding;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import dagger.Lazy;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.chrisbanes.haze.HazeKt;
import dev.chrisbanes.haze.HazeState;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.KFunction;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import net.idrnd.face.iad.capture.internal.o0;
import okhttp3.internal.Tags;
import operations.array.Map$evaluateLogic$1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public final /* synthetic */ class FirstTimeBorrowKt$$ExternalSyntheticLambda2 implements Function4 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ FirstTimeBorrowKt$$ExternalSyntheticLambda2(Function0 function0, Function1 function1, Function0 function02) {
        this.$r8$classId = 11;
        this.f$1 = function0;
        this.f$0 = function1;
        this.f$2 = function02;
    }

    private final Object invoke$com$squareup$cash$education$stories$views$EducationStoryViewPagerViewKt$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, Object obj4) {
        PagerState pagerState = (PagerState) this.f$0;
        ArrayList arrayList = (ArrayList) this.f$1;
        ColorModel colorModel = (ColorModel) this.f$2;
        int intValue = ((Integer) obj2).intValue();
        int intValue2 = ((Integer) obj4).intValue();
        ((PagerScopeImpl) obj).getClass();
        GapComposer gapComposer = (GapComposer) ((Composer) obj3);
        boolean changed = gapComposer.changed(pagerState) | ((((intValue2 & 112) ^ 48) > 32 && gapComposer.changed(intValue)) || (intValue2 & 48) == 32);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new LazyListState$$ExternalSyntheticLambda3(pagerState, intValue, 10);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Modifier clip = ClipKt.clip(ImageKt.m177backgroundbw27NRU(ColorKt.graphicsLayer(Modifier.Companion.$$INSTANCE, (Function1) rememberedValue), Color.Black, ColorKt.RectangleShape), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(12.0f));
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, clip);
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
        UiCallbackModel uiCallbackModel = (UiCallbackModel) arrayList.get(intValue);
        EducationStoryViewModel educationStoryViewModel = (EducationStoryViewModel) uiCallbackModel.model;
        Function1 function1 = uiCallbackModel.onEvent;
        if (colorModel == null) {
            colorModel = ColorModel.CashGreen.INSTANCE;
        }
        zzie.EducationStoryContent(0, educationStoryViewModel, function1, colorModel, gapComposer, 6);
        gapComposer.end(true);
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$instruments$views$InstrumentSelectionViewKt$$ExternalSyntheticLambda13(Object obj, Object obj2, Object obj3, Object obj4) {
        InstrumentSelectionViewModel.Ready ready = (InstrumentSelectionViewModel.Ready) this.f$1;
        Object obj5 = (Function1) this.f$0;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) this.f$2;
        int intValue = ((Integer) obj2).intValue();
        Composer composer = (Composer) obj3;
        int intValue2 = ((Integer) obj4).intValue();
        ((LazyItemScopeImpl) obj).getClass();
        if ((intValue2 & 48) == 0) {
            intValue2 |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue2 & 1, (intValue2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
            SelectPaymentInstrumentViewModel.PaymentInstrument paymentInstrument = (SelectPaymentInstrumentViewModel.PaymentInstrument) ready.instruments.get(intValue);
            gapComposer.startReplaceGroup(-29829451);
            List list = ready.instruments;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(InstrumentCellKt.toCell((SelectPaymentInstrumentViewModel.PaymentInstrument) it.next(), gapComposer));
            }
            gapComposer.end(false);
            InstrumentCellViewModel instrumentCellViewModel = (InstrumentCellViewModel) arrayList.get(intValue);
            boolean z = parcelableSnapshotMutableIntState.getIntValue() == intValue;
            boolean changed = gapComposer.changed(obj5) | gapComposer.changedInstance(paymentInstrument);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new IntentLauncher$$ExternalSyntheticLambda0(2, obj5, paymentInstrument);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            InstrumentCellKt.m3578InstrumentRowjM_yU8I(null, instrumentCellViewModel, null, z, null, (Function0) rememberedValue, gapComposer, 0, 21);
            String amountExceededMessage = paymentInstrument.getAmountExceededMessage();
            if (amountExceededMessage == null) {
                gapComposer.startReplaceGroup(-924387046);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-924387045);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                ListUnorderedKt.ListUnordered(Tags.persistentListOf(new ListUnorderedItem(amountExceededMessage, Icons.InformationOutline16, null, null, 12)), SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 16.0f, 1), (ListUnorderedState) null, ListUnorderedProminence.Subtle, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, gapComposer, 3072, 52);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$instruments$views$InstrumentSelectionViewKt$$ExternalSyntheticLambda8(Object obj, Object obj2, Object obj3, Object obj4) {
        Function0 function0 = (Function0) this.f$1;
        Function1 function1 = (Function1) this.f$0;
        Function0 function02 = (Function0) this.f$2;
        InstrumentSelectionViewModel instrumentSelectionViewModel = (InstrumentSelectionViewModel) obj2;
        ((Integer) obj4).getClass();
        ((AnimatedContentScopeImpl) obj).getClass();
        instrumentSelectionViewModel.getClass();
        InstrumentSelectionViewModel.Ready ready = (InstrumentSelectionViewModel.Ready) instrumentSelectionViewModel;
        int i = ready.selectedIndex;
        GapComposer gapComposer = (GapComposer) ((Composer) obj3);
        boolean changed = gapComposer.changed(i);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (changed || rememberedValue == neverEqualPolicy) {
            rememberedValue = Boxes$$ExternalSyntheticOutline1.m(i, gapComposer);
        }
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue;
        Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
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
        DBUtil.TitleBarSub((String) null, NavigationType.CLOSE, (Modifier) null, (DynamicColorConfiguration) null, function0, (Modifier) null, (Function3) null, gapComposer, 54, 108);
        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
        Countries.PageHeader(ready.title, (Modifier) null, (Function2) null, (String) null, gapComposer, 0, 14);
        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
        boolean changedInstance = gapComposer.changedInstance(ready) | gapComposer.changed(parcelableSnapshotMutableIntState) | gapComposer.changed(function1);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new GpsConfigQueries$$ExternalSyntheticLambda3(15, ready, function1, parcelableSnapshotMutableIntState);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        LazyDslKt.LazyColumn(layoutWeightElement, null, null, null, null, null, false, null, (Function1) rememberedValue2, gapComposer, 0, 510);
        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
        DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(1200067366, new MoneyTabBookletKt$$ExternalSyntheticLambda4(13, function02, ready), gapComposer), gapComposer, 24576, 15);
        gapComposer.end(true);
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$investing$components$categories$InvestingCategoryDetailKt$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3, Object obj4) {
        InvestingCategoryDetailViewModel investingCategoryDetailViewModel = (InvestingCategoryDetailViewModel) this.f$1;
        RealImageLoader realImageLoader = (RealImageLoader) this.f$2;
        Function1 function1 = (Function1) this.f$0;
        Composer composer = (Composer) obj3;
        ((Integer) obj4).getClass();
        ((AnimatedContentScopeImpl) obj).getClass();
        ((InvestingCategoryDetailViewModel) obj2).getClass();
        investingCategoryDetailViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
        if (colors == null) {
            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
        } else {
            gapComposer.startReplaceGroup(-1762997739);
            gapComposer.end(false);
        }
        Modifier systemBarsPadding = SpacerKt.systemBarsPadding(SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, ColorKt.RectangleShape), 1.0f));
        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer, 0);
        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
        Modifier materializeModifier = PlatformKt.materializeModifier(composer, systemBarsPadding);
        ComposeUiNode.Companion.getClass();
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
        GapComposer gapComposer2 = (GapComposer) composer;
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
        Updater.m576setimpl(composer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
        Updater.m576setimpl(composer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
        Updater.m576setimpl(composer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
        Updater.m575reconcileimpl(composer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
        Updater.m576setimpl(composer, materializeModifier, ComposeUiNode.Companion.SetModifier);
        Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(260576693, new SkipPaymentView$$ExternalSyntheticLambda1(function1, investingCategoryDetailViewModel), composer), composer, 56);
        gapComposer2.end(true);
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$money$views$MoneyTabSectionUIKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3, Object obj4) {
        final CardNestedScrollExpander cardNestedScrollExpander;
        State state;
        int i;
        State state2;
        CardSchemeViewModel.Module.HeroTag heroTag;
        Density density;
        Object derivedStateOf;
        CardSchemeViewModel.Module.HeroTag heroTag2;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        GapComposer gapComposer;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12;
        final ToolbarNestedScrollExpander toolbarNestedScrollExpander = (ToolbarNestedScrollExpander) this.f$0;
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = toolbarNestedScrollExpander._toolbarScrollDelta;
        CardNestedScrollExpander cardNestedScrollExpander2 = (CardNestedScrollExpander) this.f$1;
        List list = (List) this.f$2;
        ((Integer) obj2).getClass();
        Composer composer = (Composer) obj3;
        int intValue = ((Integer) obj4).intValue();
        ((LazyItemScopeImpl) obj).getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        boolean shouldExecute = gapComposer2.shouldExecute(intValue & 1, (intValue & EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) != 128);
        Applier applier = gapComposer2.applier;
        if (shouldExecute) {
            CardRegistry cardRegistry = (CardRegistry) gapComposer2.consume(CardTransitionKt.LocalCardRegistry);
            CardSchemeViewModel.Module.HeroTag activeHeroTag = cardRegistry != null ? cardRegistry.getActiveHeroTag() : null;
            Integer num = cardRegistry != null ? (Integer) cardRegistry.activeHeroTagPage$delegate.getValue() : null;
            State cardTransitionState = CardTransitionKt.cardTransitionState(gapComposer2);
            State cardNuxAnimation = CardTransitionKt.cardNuxAnimation(gapComposer2);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.LocalWindowInfo;
            int m939getContainerSizeYbymL2g = (int) (((LazyWindowInfo) ((WindowInfo) gapComposer2.consume(staticProvidableCompositionLocal))).m939getContainerSizeYbymL2g() & BodyPartID.bodyIdMax);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = CompositionLocalsKt.LocalDensity;
            Density density2 = (Density) gapComposer2.consume(staticProvidableCompositionLocal2);
            float floatValue = toolbarNestedScrollExpander._toolbarHeight.getFloatValue() - ((HypeWelcomeUIKt.isFullyExpanded(toolbarNestedScrollExpander) ? parcelableSnapshotMutableFloatState.getFloatValue() : 0.0f) + (HypeWelcomeUIKt.isFullyExpanded(toolbarNestedScrollExpander) ? 0.0f : parcelableSnapshotMutableFloatState.getFloatValue()));
            if (floatValue < RecyclerView.DECELERATION_RATE) {
                floatValue = 0.0f;
            }
            Integer num2 = num;
            boolean z = RangesKt___RangesKt.coerceIn(1.0f - ((Number) cardTransitionState.getValue()).floatValue(), RecyclerView.DECELERATION_RATE, 1.0f) == 1.0f && num2 == null;
            cardNestedScrollExpander2.getClass();
            float f = floatValue;
            final long m939getContainerSizeYbymL2g2 = ((LazyWindowInfo) ((WindowInfo) gapComposer2.consume(staticProvidableCompositionLocal))).m939getContainerSizeYbymL2g();
            Density density3 = (Density) gapComposer2.consume(staticProvidableCompositionLocal2);
            WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
            final float f2 = Arrangement$End$1.current(gapComposer2).statusBarsIgnoringVisibility.getValue$foundation_layout().top;
            gapComposer2.startReplaceGroup(-1040424805);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal3)).getClass();
            boolean z2 = z;
            Object obj5 = DefaultSizes.border.entries;
            final float mo236toPx0680j_4 = density3.mo236toPx0680j_4(40.0f);
            gapComposer2.end(false);
            final float mo236toPx0680j_42 = density3.mo236toPx0680j_4(60.0f);
            final float mo236toPx0680j_43 = density3.mo236toPx0680j_4(20.0f);
            CardSchemeViewModel.Module.HeroTag heroTag3 = activeHeroTag;
            final State cardTransitionState2 = CardTransitionKt.cardTransitionState(gapComposer2);
            boolean changed = gapComposer2.changed(m939getContainerSizeYbymL2g2) | gapComposer2.changed(f2) | gapComposer2.changed(mo236toPx0680j_4) | gapComposer2.changed(mo236toPx0680j_42) | gapComposer2.changed(mo236toPx0680j_43) | gapComposer2.changed(toolbarNestedScrollExpander) | gapComposer2.changed(cardNestedScrollExpander2) | gapComposer2.changed(cardTransitionState2);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                cardNestedScrollExpander = cardNestedScrollExpander2;
                state = cardTransitionState;
                i = m939getContainerSizeYbymL2g;
                state2 = cardNuxAnimation;
                heroTag = heroTag3;
                density = density2;
                derivedStateOf = Updater.derivedStateOf(new Function0() { // from class: com.squareup.cash.money.views.MoneyTabScrollTransitionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        long j = m939getContainerSizeYbymL2g2;
                        return Float.valueOf(RangesKt___RangesKt.coerceIn(1.0f - HypeWelcomeUIKt.scrollTransitionProgress((int) (j >> 32), (int) (j & BodyPartID.bodyIdMax), f2, toolbarNestedScrollExpander._toolbarHeight.getFloatValue(), mo236toPx0680j_4, mo236toPx0680j_42, cardNestedScrollExpander.cardRevealDistance$delegate.getFloatValue(), ((Number) cardTransitionState2.getValue()).floatValue(), mo236toPx0680j_43), RecyclerView.DECELERATION_RATE, 1.0f));
                    }
                });
                gapComposer2.updateRememberedValue(derivedStateOf);
            } else {
                derivedStateOf = rememberedValue;
                heroTag = heroTag3;
                density = density2;
                state2 = cardNuxAnimation;
                state = cardTransitionState;
                i = m939getContainerSizeYbymL2g;
                cardNestedScrollExpander = cardNestedScrollExpander2;
            }
            State state3 = (State) derivedStateOf;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            boolean changed2 = gapComposer2.changed(state2) | gapComposer2.changed(cardNestedScrollExpander);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new MoneyTabBookletKt$$ExternalSyntheticLambda4(29, cardNestedScrollExpander, state2);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Modifier layout = ValueInsets.layout(fillMaxWidth, (Function3) rememberedValue2);
            boolean changedInstance = gapComposer2.changedInstance(heroTag) | gapComposer2.changed(cardNestedScrollExpander);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new LocalViewFactory$createUi$view$3$1$1$1(9, heroTag, cardNestedScrollExpander);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(layout, heroTag, (PointerInputEventHandler) rememberedValue3);
            BiasAlignment biasAlignment = Alignment.Companion.TopStart;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, pointerInput);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$13);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$16);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$17);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$18);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$19 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$19);
            HazeState rememberHazeState = HazeKt.rememberHazeState(gapComposer2);
            if (heroTag == null || num2 == null) {
                heroTag2 = heroTag;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$17;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$18;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$13;
                gapComposer = gapComposer2;
                gapComposer.startReplaceGroup(-1600771242);
                gapComposer.end(false);
            } else {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$17;
                gapComposer2.startReplaceGroup(-1601437215);
                CardSchemeViewModel.Module.HeroTag heroTag4 = heroTag;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$18;
                Modifier m273offsetVpY3zN4$default = OffsetKt.m273offsetVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, -HypeWelcomeUIKt.moneyTabHeroTagPeekOffset(heroTag.formFactor), 1);
                boolean changed3 = gapComposer2.changed(f);
                Object rememberedValue4 = gapComposer2.rememberedValue();
                if (changed3 || rememberedValue4 == neverEqualPolicy) {
                    layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$13;
                    rememberedValue4 = new PulsingState$$ExternalSyntheticLambda0(f, 10);
                    gapComposer2.updateRememberedValue(rememberedValue4);
                } else {
                    layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$13;
                }
                heroTag2 = heroTag4;
                UtilsKt.Render(heroTag2, HazeKt.hazeSource$default(SizeKt.fillMaxWidth(CardTransitionKt.cardTransition(MLKEMEngine.KyberPolyBytes, 0, gapComposer2, ColorKt.graphicsLayer(m273offsetVpY3zN4$default, (Function1) rememberedValue4), JsonLogicResult$Success$$ExternalSyntheticOutline0.m(num2.intValue(), "hero-tag:page-"), true), 1.0f), rememberHazeState), num2.intValue(), RecyclerView.DECELERATION_RATE, true, false, gapComposer2, 221184, 4);
                gapComposer = gapComposer2;
                gapComposer.end(false);
            }
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal3)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth2, 16.0f, RecyclerView.DECELERATION_RATE, 2), RecyclerView.DECELERATION_RATE, density.mo232toDpu2uoSUM(((Number) cardNestedScrollExpander.cardOffset$delegate.getValue()).floatValue()), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            int i2 = i;
            State state4 = state;
            boolean changed4 = gapComposer.changed(cardNestedScrollExpander) | gapComposer.changed(state2) | gapComposer.changed(i2) | gapComposer.changed(state4);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changed4 || rememberedValue5 == neverEqualPolicy) {
                CardNestedScrollExpander cardNestedScrollExpander3 = cardNestedScrollExpander;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$16;
                State state5 = state2;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$1;
                composeUiNode$Companion$SetModifier$15 = composeUiNode$Companion$SetModifier$12;
                layoutNode$Companion$Constructor$12 = layoutNode$Companion$Constructor$1;
                Hero3DCardViewKt$$ExternalSyntheticLambda13 hero3DCardViewKt$$ExternalSyntheticLambda13 = new Hero3DCardViewKt$$ExternalSyntheticLambda13(cardNestedScrollExpander3, state5, i2, state4, 3);
                gapComposer.updateRememberedValue(hero3DCardViewKt$$ExternalSyntheticLambda13);
                rememberedValue5 = hero3DCardViewKt$$ExternalSyntheticLambda13;
            } else {
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$16;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$1;
                composeUiNode$Companion$SetModifier$15 = composeUiNode$Companion$SetModifier$12;
                layoutNode$Companion$Constructor$12 = layoutNode$Companion$Constructor$1;
            }
            Modifier graphicsLayer = ColorKt.graphicsLayer(m302paddingqDBjuR0$default, (Function1) rememberedValue5);
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, graphicsLayer);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$13);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$14);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$15, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$19);
            Updater.CompositionLocalProvider(CardTransitionKt.LocalCardPillFadeOpacity.defaultProvidedValue$runtime(state3), Expect_jvmKt.rememberComposableLambda(-1341922094, new LocalHomeViewKt$$ExternalSyntheticLambda0(heroTag2, rememberHazeState, z2, list, 21), gapComposer), gapComposer, 56);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer2.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$paychecks$presenters$EditDistributionPresenterKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3, Object obj4) {
        String str;
        EditDistributionConfiguration.DestinationUiConfiguration destinationUiConfiguration = (EditDistributionConfiguration.DestinationUiConfiguration) this.f$0;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.f$1;
        NumberFormat numberFormat = (NumberFormat) this.f$2;
        EditDistributionConfiguration.DestinationUiConfiguration destinationUiConfiguration2 = (EditDistributionConfiguration.DestinationUiConfiguration) obj;
        Float f = (Float) obj2;
        float floatValue = f.floatValue();
        float floatValue2 = ((Float) obj3).floatValue();
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        destinationUiConfiguration2.getClass();
        DistributionWheelViewModel.Allocation.Treatment interactableSelected = destinationUiConfiguration2.destination.getClass() != destinationUiConfiguration.destination.getClass() ? DistributionWheelViewModel.Allocation.Treatment.Default.INSTANCE : booleanValue ? new DistributionWheelViewModel.Allocation.Treatment.InteractableSelected(floatValue2) : DistributionWheelViewModel.Allocation.Treatment.InteractableNotSelected.INSTANCE;
        com.squareup.protos.cash.ui.Color color = destinationUiConfiguration2.tint;
        String str2 = destinationUiConfiguration2.accessibilityLabel;
        if (str2 != null) {
            String format2 = numberFormat.format(f);
            ArrayMap m = SVG$Unit$EnumUnboxingLocalUtility.m(2, format2, "destination", str2);
            m.put("share", format2);
            Resources resources = androidStringManager.resources;
            resources.getClass();
            str = new MessageFormat(resources.getString(R.string.edit_distribution_wheel_segment_accessibility_label_template)).format(m);
            str.getClass();
        } else {
            str = null;
        }
        return new DistributionWheelViewModel.SingleAllocation(color, floatValue, interactableSelected, str);
    }

    private final Object invoke$com$squareup$cash$payments$views$composer$RotatingTitleIconKt$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, Object obj4) {
        Function0 function0 = (Function0) this.f$0;
        State state = (State) this.f$1;
        State state2 = (State) this.f$2;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        Composer composer = (Composer) obj3;
        ((Integer) obj4).getClass();
        ((AnimatedContentScopeImpl) obj).getClass();
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (booleanValue) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(-219624787);
            ErrorKt.NavigationIcon(NavigationType.CLOSE, RotateKt.rotate(companion, ((Number) state.getValue()).floatValue()), function0, gapComposer, 6);
            gapComposer.end(false);
        } else {
            if (booleanValue) {
                throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer, -422727864, false);
            }
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startReplaceGroup(-219432401);
            ErrorKt.NavigationIcon(NavigationType.BACK, RotateKt.rotate(companion, ((Number) state2.getValue()).floatValue()), function0, gapComposer2, 6);
            gapComposer2.end(false);
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$work$views$clockin$ClockInOverlayViewKt$$ExternalSyntheticLambda9(Object obj, Object obj2, Object obj3, Object obj4) {
        String str;
        String str2;
        ClockInOverlayState clockInOverlayState = (ClockInOverlayState) this.f$0;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = clockInOverlayState.isClockingOut$delegate;
        ClockInOverlayViewModel.Loaded loaded = (ClockInOverlayViewModel.Loaded) this.f$1;
        PaddingValuesImpl paddingValuesImpl = (PaddingValuesImpl) this.f$2;
        ClockInOverlayMode clockInOverlayMode = (ClockInOverlayMode) obj2;
        Composer composer = (Composer) obj3;
        ((Integer) obj4).getClass();
        ((AnimatedContentScopeImpl) obj).getClass();
        clockInOverlayMode.getClass();
        int ordinal = clockInOverlayMode.ordinal();
        if (ordinal != 0) {
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (ordinal == 1) {
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(1984056599);
                ClockInOverlayViewModel.Loaded.ClockedOut clockedOut = loaded instanceof ClockInOverlayViewModel.Loaded.ClockedOut ? (ClockInOverlayViewModel.Loaded.ClockedOut) loaded : null;
                String stringResource = Room.stringResource(gapComposer, R.string.work_views_select_location);
                String stringResource2 = Room.stringResource(gapComposer, R.string.work_views_save);
                List list = clockedOut != null ? clockedOut.locations : null;
                if (list == null) {
                    list = EmptyList.INSTANCE;
                }
                List list2 = list;
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = new StripePaymentController$$ExternalSyntheticLambda1(12);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Function1 function1 = (Function1) rememberedValue;
                boolean changed = gapComposer.changed(clockInOverlayState);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new RealOverlayLayer$show$3(0, clockInOverlayState, ClockInOverlayState.class, "onBackFromPicker", "onBackFromPicker()V", 0, 22);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Function0 function0 = (Function0) ((KFunction) rememberedValue2);
                boolean changed2 = gapComposer.changed(clockInOverlayState);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new ScannerView.AnonymousClass3(1, clockInOverlayState, ClockInOverlayState.class, "onLocationSaved", "onLocationSaved(Lcom/squareup/cash/work/identifiers/LocationIdentifier;)V", 0, 20);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                DisclaimerTextKt.ItemPickerContent(stringResource, stringResource2, list2, function1, function0, (Function1) ((KFunction) rememberedValue3), false, gapComposer, 3072, 64);
                gapComposer.end(false);
            } else if (ordinal == 2) {
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(1984551142);
                ClockInOverlayViewModel.Loaded.ClockedOut clockedOut2 = loaded instanceof ClockInOverlayViewModel.Loaded.ClockedOut ? (ClockInOverlayViewModel.Loaded.ClockedOut) loaded : null;
                String stringResource3 = Room.stringResource(gapComposer2, R.string.work_views_select_job);
                String stringResource4 = Room.stringResource(gapComposer2, R.string.work_views_save);
                List list3 = clockedOut2 != null ? clockedOut2.jobs : null;
                if (list3 == null) {
                    list3 = EmptyList.INSTANCE;
                }
                List list4 = list3;
                Object rememberedValue4 = gapComposer2.rememberedValue();
                if (rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new StripePaymentController$$ExternalSyntheticLambda1(13);
                    gapComposer2.updateRememberedValue(rememberedValue4);
                }
                Function1 function12 = (Function1) rememberedValue4;
                boolean changed3 = gapComposer2.changed(clockInOverlayState);
                Object rememberedValue5 = gapComposer2.rememberedValue();
                if (changed3 || rememberedValue5 == neverEqualPolicy) {
                    RealOverlayLayer$show$3 realOverlayLayer$show$3 = new RealOverlayLayer$show$3(0, clockInOverlayState, ClockInOverlayState.class, "onBackFromPicker", "onBackFromPicker()V", 0, 23);
                    gapComposer2.updateRememberedValue(realOverlayLayer$show$3);
                    rememberedValue5 = realOverlayLayer$show$3;
                }
                Function0 function02 = (Function0) ((KFunction) rememberedValue5);
                boolean changed4 = gapComposer2.changed(clockInOverlayState);
                Object rememberedValue6 = gapComposer2.rememberedValue();
                if (changed4 || rememberedValue6 == neverEqualPolicy) {
                    ScannerView.AnonymousClass3 anonymousClass3 = new ScannerView.AnonymousClass3(1, clockInOverlayState, ClockInOverlayState.class, "onJobSaved", "onJobSaved(Lcom/squareup/cash/work/identifiers/JobIdentifier;)V", 0, 21);
                    gapComposer2.updateRememberedValue(anonymousClass3);
                    rememberedValue6 = anonymousClass3;
                }
                DisclaimerTextKt.ItemPickerContent(stringResource3, stringResource4, list4, function12, function02, (Function1) ((KFunction) rememberedValue6), false, gapComposer2, 3072, 64);
                gapComposer2.end(false);
            } else if (ordinal == 3) {
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(1985035703);
                ClockInOverlayViewModel.Loaded.ClockedIn clockedIn = loaded instanceof ClockInOverlayViewModel.Loaded.ClockedIn ? (ClockInOverlayViewModel.Loaded.ClockedIn) loaded : null;
                String stringResource5 = Room.stringResource(gapComposer3, R.string.work_views_take_a_break_title);
                String stringResource6 = Room.stringResource(gapComposer3, R.string.work_views_start_break_button);
                List list5 = clockedIn != null ? clockedIn.breakItems : null;
                if (list5 == null) {
                    list5 = EmptyList.INSTANCE;
                }
                List list6 = list5;
                Object rememberedValue7 = gapComposer3.rememberedValue();
                if (rememberedValue7 == neverEqualPolicy) {
                    rememberedValue7 = new StripePaymentController$$ExternalSyntheticLambda1(14);
                    gapComposer3.updateRememberedValue(rememberedValue7);
                }
                Function1 function13 = (Function1) rememberedValue7;
                boolean changed5 = gapComposer3.changed(clockInOverlayState);
                Object rememberedValue8 = gapComposer3.rememberedValue();
                if (changed5 || rememberedValue8 == neverEqualPolicy) {
                    RealOverlayLayer$show$3 realOverlayLayer$show$32 = new RealOverlayLayer$show$3(0, clockInOverlayState, ClockInOverlayState.class, "onBackFromPicker", "onBackFromPicker()V", 0, 24);
                    gapComposer3.updateRememberedValue(realOverlayLayer$show$32);
                    rememberedValue8 = realOverlayLayer$show$32;
                }
                Function0 function03 = (Function0) ((KFunction) rememberedValue8);
                boolean changed6 = gapComposer3.changed(clockInOverlayState);
                Object rememberedValue9 = gapComposer3.rememberedValue();
                if (changed6 || rememberedValue9 == neverEqualPolicy) {
                    ScannerView.AnonymousClass3 anonymousClass32 = new ScannerView.AnonymousClass3(1, clockInOverlayState, ClockInOverlayState.class, "onStartBreakClicked", "onStartBreakClicked(Lcom/squareup/cash/work/viewmodels/ClockInOverlayViewModel$BreakIdentifier;)V", 0, 22);
                    gapComposer3.updateRememberedValue(anonymousClass32);
                    rememberedValue9 = anonymousClass32;
                }
                DisclaimerTextKt.ItemPickerContent(stringResource5, stringResource6, list6, function13, function03, (Function1) ((KFunction) rememberedValue9), ((Boolean) clockInOverlayState.isStartingBreak$delegate.getValue()).booleanValue(), gapComposer3, 3072, 0);
                gapComposer3.end(false);
            } else if (ordinal == 4) {
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startReplaceGroup(1985601763);
                ClockInOverlayViewModel.Loaded.ClockedIn clockedIn2 = loaded instanceof ClockInOverlayViewModel.Loaded.ClockedIn ? (ClockInOverlayViewModel.Loaded.ClockedIn) loaded : null;
                boolean changed7 = gapComposer4.changed(clockInOverlayState);
                Object rememberedValue10 = gapComposer4.rememberedValue();
                if (changed7 || rememberedValue10 == neverEqualPolicy) {
                    RealOverlayLayer$show$3 realOverlayLayer$show$33 = new RealOverlayLayer$show$3(0, clockInOverlayState, ClockInOverlayState.class, "onBackFromPicker", "onBackFromPicker()V", 0, 20);
                    gapComposer4.updateRememberedValue(realOverlayLayer$show$33);
                    rememberedValue10 = realOverlayLayer$show$33;
                }
                Function0 function04 = (Function0) ((KFunction) rememberedValue10);
                boolean changed8 = gapComposer4.changed(clockInOverlayState) | gapComposer4.changedInstance(clockedIn2);
                Object rememberedValue11 = gapComposer4.rememberedValue();
                if (changed8 || rememberedValue11 == neverEqualPolicy) {
                    rememberedValue11 = new ListsKt$$ExternalSyntheticLambda0(11, clockInOverlayState, clockedIn2);
                    gapComposer4.updateRememberedValue(rememberedValue11);
                }
                DisclaimerTextKt.ClockOutConfirmationContent(function04, (Function0) rememberedValue11, ((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue(), gapComposer4, 0, 0);
                gapComposer4.end(false);
            } else {
                if (ordinal != 5) {
                    throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer, 1449471294, false);
                }
                GapComposer gapComposer5 = (GapComposer) composer;
                gapComposer5.startReplaceGroup(1986057897);
                ClockInOverlayViewModel.Loaded.ClockedIn clockedIn3 = loaded instanceof ClockInOverlayViewModel.Loaded.ClockedIn ? (ClockInOverlayViewModel.Loaded.ClockedIn) loaded : null;
                if (clockedIn3 == null || (str = clockedIn3.currencySymbol) == null) {
                    str = "$";
                }
                String str3 = str;
                if (clockedIn3 == null || (str2 = clockedIn3.currencyCode) == null) {
                    str2 = "USD";
                }
                String str4 = str2;
                boolean changed9 = gapComposer5.changed(clockInOverlayState);
                Object rememberedValue12 = gapComposer5.rememberedValue();
                if (changed9 || rememberedValue12 == neverEqualPolicy) {
                    RealOverlayLayer$show$3 realOverlayLayer$show$34 = new RealOverlayLayer$show$3(0, clockInOverlayState, ClockInOverlayState.class, "onBackFromPicker", "onBackFromPicker()V", 0, 21);
                    gapComposer5.updateRememberedValue(realOverlayLayer$show$34);
                    rememberedValue12 = realOverlayLayer$show$34;
                }
                Function0 function05 = (Function0) ((KFunction) rememberedValue12);
                boolean changed10 = gapComposer5.changed(clockInOverlayState);
                Object rememberedValue13 = gapComposer5.rememberedValue();
                if (changed10 || rememberedValue13 == neverEqualPolicy) {
                    ScannerView.AnonymousClass3 anonymousClass33 = new ScannerView.AnonymousClass3(1, clockInOverlayState, ClockInOverlayState.class, "onDeclareCashTipClockOutClicked", "onDeclareCashTipClockOutClicked(Ljava/lang/String;)V", 0, 19);
                    gapComposer5.updateRememberedValue(anonymousClass33);
                    rememberedValue13 = anonymousClass33;
                }
                DisclaimerTextKt.DeclareCashTipContent(str3, str4, function05, (Function1) ((KFunction) rememberedValue13), ((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue(), gapComposer5, 0);
                gapComposer5.end(false);
            }
        } else {
            GapComposer gapComposer6 = (GapComposer) composer;
            gapComposer6.startReplaceGroup(1449470520);
            DisclaimerTextKt.ClockInOverlayMainContent(clockInOverlayState, loaded, paddingValuesImpl, gapComposer6, 0);
            gapComposer6.end(false);
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$stripe$android$financialconnections$features$institutionpicker$InstitutionPickerScreenKt$$ExternalSyntheticLambda28(Object obj, Object obj2, Object obj3, Object obj4) {
        FocusRequester focusRequester = (FocusRequester) this.f$1;
        MutableState mutableState = (MutableState) this.f$2;
        Function1 function1 = (Function1) this.f$0;
        ((Integer) obj2).getClass();
        Composer composer = (Composer) obj3;
        int intValue = ((Integer) obj4).intValue();
        ((LazyItemScopeImpl) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) != 128)) {
            String str = (String) mutableState.getValue();
            boolean changed = gapComposer.changed(mutableState) | gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CashMapViewKt$$ExternalSyntheticLambda3(function1, mutableState, 18);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            InstitutionPickerScreenKt.SearchRow(null, focusRequester, str, (Function1) rememberedValue, gapComposer, 48);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:245:0x080c, code lost:
    
        if (r11 == r6) goto L245;
     */
    @Override // kotlin.jvm.functions.Function4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        NavigationType navigationType;
        NeverEqualPolicy neverEqualPolicy;
        final CardState cardState;
        Function1 function1;
        ComposableLambdaImpl composableLambdaImpl;
        String str;
        final int i;
        Composer composer;
        final InputCardInfoViewModel inputCardInfoViewModel;
        NavigationType navigationType2;
        boolean z2;
        Object obj5;
        Context context;
        CameraController create;
        int i2 = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
        int i3 = 14;
        final int i4 = 1;
        Object obj6 = this.f$2;
        Object obj7 = this.f$1;
        Object obj8 = this.f$0;
        switch (i2) {
            case 0:
                FirstTimeBorrowViewModel firstTimeBorrowViewModel = (FirstTimeBorrowViewModel) obj2;
                int intValue = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                firstTimeBorrowViewModel.getClass();
                BorrowHomeKt.FirstTimeBorrow((FirstTimeBorrowViewModel.Content) firstTimeBorrowViewModel, (Function1) obj8, (Modifier) obj7, (ScrollState) obj6, (Composer) obj3, (intValue >> 3) & 14);
                return Unit.INSTANCE;
            case 1:
                AccountDocumentsViewModel accountDocumentsViewModel = (AccountDocumentsViewModel) obj7;
                Function1 function12 = (Function1) obj8;
                AccountDocumentsViewModel accountDocumentsViewModel2 = (AccountDocumentsViewModel) obj6;
                int intValue2 = ((Integer) obj2).intValue();
                Composer composer2 = (Composer) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                if ((intValue3 & 48) == 0) {
                    intValue3 |= ((GapComposer) composer2).changed(intValue2) ? 32 : 16;
                }
                GapComposer gapComposer = (GapComposer) composer2;
                if (gapComposer.shouldExecute(intValue3 & 1, (intValue3 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                    AccountDocumentsViewModel.DocumentModel documentModel = (AccountDocumentsViewModel.DocumentModel) accountDocumentsViewModel.documents.get(intValue2);
                    if (documentModel instanceof AccountDocumentsViewModel.DocumentModel.DisclosureModel) {
                        gapComposer.startReplaceGroup(-486144503);
                        DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
                        AccountToDoKt.Disclosure(null, (AccountDocumentsViewModel.DocumentModel.DisclosureModel) documentModel, function12, gapComposer, 0);
                        gapComposer.end(false);
                    } else if (documentModel instanceof AccountDocumentsViewModel.DocumentModel.FooterModel) {
                        gapComposer.startReplaceGroup(-485985907);
                        DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
                        AccountToDoKt.Footer(null, (AccountDocumentsViewModel.DocumentModel.FooterModel) documentModel, function12, gapComposer, 0);
                        gapComposer.end(false);
                    } else if (documentModel instanceof AccountDocumentsViewModel.DocumentModel.HeaderModel) {
                        gapComposer.startReplaceGroup(-485817391);
                        if (intValue2 == 0 || (accountDocumentsViewModel.documents.get(0) instanceof AccountDocumentsViewModel.DocumentModel.BannerModel)) {
                            gapComposer.startReplaceGroup(-485637498);
                            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(-485567035);
                            DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
                            gapComposer.end(false);
                        }
                        String lowerCase = ((AccountDocumentsViewModel.DocumentModel.HeaderModel) documentModel).label.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (lowerCase.length() > 0) {
                            lowerCase = Character.toUpperCase(lowerCase.charAt(0)) + lowerCase.substring(1);
                        }
                        ViewfinderDefaults.SectionHeader(lowerCase, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer, 0, 30);
                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                        gapComposer.end(false);
                    } else if (documentModel instanceof AccountDocumentsViewModel.DocumentModel.RecordModel) {
                        gapComposer.startReplaceGroup(-485214131);
                        CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
                        AccountDocumentsViewModel.DocumentModel.RecordModel recordModel = (AccountDocumentsViewModel.DocumentModel.RecordModel) documentModel;
                        ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-371630482, new CartBannerViewKt$$ExternalSyntheticLambda2(recordModel, 18), gapComposer);
                        boolean changedInstance = gapComposer.changedInstance(documentModel) | gapComposer.changed(function12);
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (changedInstance || rememberedValue == neverEqualPolicy2) {
                            rememberedValue = new t7$$ExternalSyntheticLambda4(28, function12, recordModel);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda, null, (Function0) rememberedValue, false, false, null, null, 0L, push, null, gapComposer, 805306374, 1530);
                        gapComposer.end(false);
                    } else if (documentModel instanceof AccountDocumentsViewModel.DocumentModel.SectionModel) {
                        gapComposer.startReplaceGroup(-484898458);
                        CellDefaultAccessory.Push push2 = CellDefaultAccessory.Push.INSTANCE;
                        AccountDocumentsViewModel.DocumentModel.SectionModel sectionModel = (AccountDocumentsViewModel.DocumentModel.SectionModel) documentModel;
                        ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1106046801, new CartBannerViewKt$$ExternalSyntheticLambda2(sectionModel, 17), gapComposer);
                        boolean changedInstance2 = gapComposer.changedInstance(documentModel) | gapComposer.changed(function12);
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (changedInstance2 || rememberedValue2 == neverEqualPolicy2) {
                            rememberedValue2 = new t7$$ExternalSyntheticLambda4(29, function12, sectionModel);
                            gapComposer.updateRememberedValue(rememberedValue2);
                        }
                        CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda2, null, (Function0) rememberedValue2, false, false, null, null, 0L, push2, null, gapComposer, 805306374, 1530);
                        gapComposer.end(false);
                    } else {
                        if (!(documentModel instanceof AccountDocumentsViewModel.DocumentModel.BannerModel)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1923980450, false);
                        }
                        gapComposer.startReplaceGroup(-484596611);
                        AccountDocumentsViewModel.DocumentModel.BannerModel.BannerStyle bannerStyle = AccountDocumentsViewModel.DocumentModel.BannerModel.BannerStyle.BITCOIN_TAXES;
                        gapComposer.startReplaceGroup(1924034144);
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                        Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        long j = colors.semantic.service.taxes;
                        gapComposer.end(false);
                        Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        ArcadeThemeKt.ArcadeTheme(DimensionKt.m1468withTint4WTKRHQ(colors2, j), null, null, Expect_jvmKt.rememberComposableLambda(1476428691, new Yoga$$ExternalSyntheticLambda7((AccountDocumentsViewModel.DocumentModel.BannerModel) documentModel, function12, accountDocumentsViewModel2), gapComposer), gapComposer, 3072, 6);
                        gapComposer.end(false);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Function2 function2 = (Function2) obj6;
                Function1 function13 = (Function1) obj8;
                Modifier modifier = (Modifier) obj7;
                ActivityEmbeddedViewModel.LoadingError loadingError = (ActivityEmbeddedViewModel.LoadingError) obj2;
                Composer composer3 = (Composer) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                if (loadingError == null) {
                    GapComposer gapComposer2 = (GapComposer) composer3;
                    gapComposer2.startReplaceGroup(1986102929);
                    gapComposer2.end(false);
                } else {
                    boolean z3 = false;
                    GapComposer gapComposer3 = (GapComposer) composer3;
                    gapComposer3.startReplaceGroup(1986130581);
                    if (function2 != null) {
                        gapComposer3.startReplaceGroup(1986166789);
                        function2.invoke(gapComposer3, 0);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(1986222527);
                        boolean changed = gapComposer3.changed(function13);
                        Object rememberedValue3 = gapComposer3.rememberedValue();
                        if (changed || rememberedValue3 == neverEqualPolicy2) {
                            rememberedValue3 = new BalanceFeedKt$$ExternalSyntheticLambda4(8, function13);
                            gapComposer3.updateRememberedValue(rememberedValue3);
                        }
                        AvatarsKt.LoadingError(loadingError, (Function0) rememberedValue3, modifier, gapComposer3, (intValue4 >> 3) & 14);
                        z3 = false;
                        gapComposer3.end(false);
                    }
                    gapComposer3.end(z3);
                }
                return Unit.INSTANCE;
            case 3:
                CardState cardState2 = (CardState) obj7;
                final FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) obj6;
                Function1 function14 = (Function1) obj8;
                AnimatedContentScopeImpl animatedContentScopeImpl = (AnimatedContentScopeImpl) obj;
                final InputCardInfoViewModel inputCardInfoViewModel2 = (InputCardInfoViewModel) obj2;
                Composer composer4 = (Composer) obj3;
                ((Integer) obj4).getClass();
                animatedContentScopeImpl.getClass();
                inputCardInfoViewModel2.getClass();
                if (inputCardInfoViewModel2 instanceof InputCardInfoViewModel.InitialLoading) {
                    return Unit.INSTANCE;
                }
                if (inputCardInfoViewModel2 instanceof InputCardInfoViewModel.Ready) {
                    InputCardInfoViewModel.Ready ready = (InputCardInfoViewModel.Ready) inputCardInfoViewModel2;
                    boolean z4 = ready.showNameField;
                    boolean z5 = ready.showPostalCodeField;
                    InputCardInfoViewModel.TextContent textContent = ready.textContent;
                    boolean z6 = cardState2.get_requireName();
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState = cardState2._postalCountry$delegate;
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = cardState2._name$delegate;
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = cardState2._postalCode$delegate;
                    if (z6 == z4) {
                        z = z4;
                    } else {
                        z = z4;
                        cardState2._requireName$delegate.setValue(Boolean.valueOf(z));
                        if (!z) {
                            parcelableSnapshotMutableState2.setValue("");
                        }
                        cardState2.checkValidity();
                    }
                    if (cardState2.get_requirePostalCode() != z5) {
                        cardState2._requirePostalCode$delegate.setValue(Boolean.valueOf(z5));
                        if (!z5) {
                            parcelableSnapshotMutableState3.setValue("");
                        }
                        cardState2.checkValidity();
                    }
                    Country country = textContent.countryCode;
                    if (((Country) parcelableSnapshotMutableState.getValue()) != country) {
                        parcelableSnapshotMutableState.setValue(country);
                        parcelableSnapshotMutableState3.setValue("");
                        cardState2.checkValidity();
                    }
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, composer4, 0);
                    GapComposer gapComposer4 = (GapComposer) composer4;
                    int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(composer4, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    GapComposer gapComposer5 = (GapComposer) composer4;
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
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(composer4, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(composer4, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(composer4, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(composer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(composer4, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    boolean z7 = ready.showBackButton;
                    if (z7) {
                        navigationType = NavigationType.BACK;
                    } else if (z7) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                    } else {
                        navigationType = NavigationType.NONE;
                    }
                    NavigationType navigationType3 = navigationType;
                    boolean changedInstance3 = gapComposer5.changedInstance(focusOwnerImpl) | gapComposer5.changed(function14);
                    Object rememberedValue4 = gapComposer5.rememberedValue();
                    if (changedInstance3 || rememberedValue4 == neverEqualPolicy2) {
                        rememberedValue4 = new BulletinTileKt$$ExternalSyntheticLambda12(15, (Object) focusOwnerImpl, function14);
                        gapComposer5.updateRememberedValue(rememberedValue4);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType3, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue4, (Modifier) null, (Function3) null, composer4, 6, 108);
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(ImageKt.verticalScroll$default(new LayoutWeightElement(1.0f, true), ImageKt.rememberScrollState(composer4), false, 14), RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, composer4, 0);
                    int hashCode2 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(composer4, m302paddingqDBjuR0$default);
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(composer4, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(composer4, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Request$Priority$EnumUnboxingLocalUtility.m(hashCode2, composer4, composeUiNode$Companion$SetModifier$13, composer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(composer4, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    Countries.PageHeader(textContent.title, (Modifier) null, (Function2) null, textContent.subtitle, composer4, 0, 6);
                    SpacerKt.Spacer(composer4, SizeKt.m277height3ABfNKs(companion, 32.0f));
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), horizontal, composer4, 6);
                    int hashCode3 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(composer4, m300paddingVpY3zN4$default);
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(composer4, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(composer4, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Request$Priority$EnumUnboxingLocalUtility.m(hashCode3, composer4, composeUiNode$Companion$SetModifier$13, composer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(composer4, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    if (z) {
                        gapComposer5.startReplaceGroup(-767494395);
                        String str2 = (String) parcelableSnapshotMutableState2.getValue();
                        cardState = cardState2;
                        boolean changed2 = gapComposer5.changed(cardState);
                        Object rememberedValue5 = gapComposer5.rememberedValue();
                        if (!changed2) {
                            neverEqualPolicy = neverEqualPolicy2;
                            break;
                        } else {
                            neverEqualPolicy = neverEqualPolicy2;
                        }
                        rememberedValue5 = new VerifyCardViewKt$$ExternalSyntheticLambda1(cardState, 1);
                        gapComposer5.updateRememberedValue(rememberedValue5);
                        InputFieldKt.InputField(str2, (Function1) rememberedValue5, (Modifier) null, (InputState) null, AmountBlockerViewKt.f280lambda$145200446, (Function2) null, (Function2) null, (Function3) null, Room.stringResource(composer4, R.string.card_cardholder_name_hint), new KeyboardOptions(0, (Boolean) null, 1, 6, (Boolean) null, 115), (KeyboardActions) null, (VisualTransformation) null, composer4, 805330944, 0, 3308);
                        gapComposer5.end(false);
                    } else {
                        neverEqualPolicy = neverEqualPolicy2;
                        cardState = cardState2;
                        gapComposer5.startReplaceGroup(-767041764);
                        gapComposer5.end(false);
                    }
                    String str3 = cardState.get_number();
                    MaskVisualTransformation rememberCardNumberTransformation = CardNumberKt.rememberCardNumberTransformation(cardState.get_brand(), composer4);
                    String str4 = ready.cardNumberHint;
                    if (ready.showScanCardIcon) {
                        gapComposer5.startReplaceGroup(-766503170);
                        function1 = function14;
                        ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(-1064276863, new SsnViewKt$$ExternalSyntheticLambda12(2, function1), composer4);
                        gapComposer5.end(false);
                        composableLambdaImpl = rememberComposableLambda3;
                    } else {
                        function1 = function14;
                        gapComposer5.startReplaceGroup(-766098062);
                        gapComposer5.end(false);
                        composableLambdaImpl = null;
                    }
                    KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 3, 6, (Boolean) null, 115);
                    boolean changed3 = gapComposer5.changed(cardState) | gapComposer5.changedInstance(focusOwnerImpl);
                    Object rememberedValue6 = gapComposer5.rememberedValue();
                    if (changed3 || rememberedValue6 == neverEqualPolicy) {
                        str = str4;
                        i = 0;
                        rememberedValue6 = new Function1() { // from class: com.squareup.cash.blockers.views.InputCardInfoViewKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj9) {
                                int i5 = i;
                                FocusOwnerImpl focusOwnerImpl2 = focusOwnerImpl;
                                CardState cardState3 = cardState;
                                String str5 = (String) obj9;
                                str5.getClass();
                                switch (i5) {
                                    case 0:
                                        if (cardState3.setNumber(str5) == CardState.UpdateResult.ValidComplete) {
                                            focusOwnerImpl2.m597moveFocusaToIllA(1, true);
                                        }
                                        break;
                                    case 1:
                                        cardState3.getClass();
                                        String replace = new Regex("[ /]").replace(str5, "");
                                        CardState.UpdateResult checkExpiration = cardState3.checkExpiration(replace);
                                        if (checkExpiration != CardState.UpdateResult.Invalid) {
                                            cardState3._expiration$delegate.setValue(replace);
                                            cardState3.checkValidity();
                                        }
                                        if (checkExpiration == CardState.UpdateResult.ValidComplete) {
                                            focusOwnerImpl2.m597moveFocusaToIllA(1, true);
                                        }
                                        break;
                                    case 2:
                                        cardState3.getClass();
                                        CardState.UpdateResult checkSecurityCode = CardState.checkSecurityCode(str5, cardState3.get_brand());
                                        if (checkSecurityCode != CardState.UpdateResult.Invalid) {
                                            cardState3._securityCode$delegate.setValue(str5);
                                            cardState3.checkValidity();
                                        }
                                        if (checkSecurityCode == CardState.UpdateResult.ValidComplete) {
                                            focusOwnerImpl2.m597moveFocusaToIllA(1, true);
                                        }
                                        break;
                                    default:
                                        cardState3.getClass();
                                        String replace$default = StringsKt__StringsJVMKt.replace$default(str5, " ", "");
                                        Locale locale = Locale.US;
                                        locale.getClass();
                                        String upperCase = replace$default.toUpperCase(locale);
                                        upperCase.getClass();
                                        CardState.UpdateResult checkPostalCode = cardState3.checkPostalCode(upperCase);
                                        if (checkPostalCode != CardState.UpdateResult.Invalid) {
                                            cardState3._postalCode$delegate.setValue(upperCase);
                                            cardState3.checkValidity();
                                        }
                                        if (checkPostalCode == CardState.UpdateResult.ValidComplete) {
                                            focusOwnerImpl2.clearFocus(false);
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer5.updateRememberedValue(rememberedValue6);
                    } else {
                        str = str4;
                        i = 0;
                    }
                    Function1 function15 = function1;
                    InputFieldKt.InputField(str3, (Function1) rememberedValue6, (Modifier) null, (InputState) null, Expect_jvmKt.rememberComposableLambda(1906319783, new Function2() { // from class: com.squareup.cash.blockers.views.InputCardInfoViewKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj9, Object obj10) {
                            int i5 = i;
                            InputCardInfoViewModel inputCardInfoViewModel3 = inputCardInfoViewModel2;
                            switch (i5) {
                                case 0:
                                    Composer composer5 = (Composer) obj9;
                                    int intValue5 = ((Integer) obj10).intValue();
                                    GapComposer gapComposer6 = (GapComposer) composer5;
                                    if (gapComposer6.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((InputCardInfoViewModel.Ready) inputCardInfoViewModel3).cardNumberHint, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer6.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer6 = (Composer) obj9;
                                    int intValue6 = ((Integer) obj10).intValue();
                                    GapComposer gapComposer7 = (GapComposer) composer6;
                                    if (gapComposer7.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer7, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((InputCardInfoViewModel.Ready) inputCardInfoViewModel3).textContent.postcode, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer7.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, composer4), (Function2) null, composableLambdaImpl, (Function3) null, str, keyboardOptions, (KeyboardActions) null, rememberCardNumberTransformation, composer4, 805330944, 0, 1196);
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(12.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Top, composer4, 6);
                    int hashCode4 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(composer4, fillMaxWidth);
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(composer4, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(composer4, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                    Request$Priority$EnumUnboxingLocalUtility.m(hashCode4, composer4, composeUiNode$Companion$SetModifier$13, composer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(composer4, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    Modifier weight = rowScopeInstance.weight(2.0f, companion, false);
                    Object rememberedValue7 = gapComposer5.rememberedValue();
                    if (rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new LabelValueView$$ExternalSyntheticLambda0(14);
                        gapComposer5.updateRememberedValue(rememberedValue7);
                    }
                    Modifier semantics = SemanticsModifierKt.semantics(weight, true, (Function1) rememberedValue7);
                    String str5 = (String) cardState._expiration$delegate.getValue();
                    ExpirationTransformation expirationTransformation = ExpirationTransformation.INSTANCE;
                    String stringResource = Room.stringResource(composer4, R.string.card_expiration_hint);
                    KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, (Boolean) null, 3, 6, (Boolean) null, 115);
                    boolean changed4 = gapComposer5.changed(cardState) | gapComposer5.changedInstance(focusOwnerImpl);
                    Object rememberedValue8 = gapComposer5.rememberedValue();
                    if (changed4 || rememberedValue8 == neverEqualPolicy) {
                        final int i5 = 1;
                        rememberedValue8 = new Function1() { // from class: com.squareup.cash.blockers.views.InputCardInfoViewKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj9) {
                                int i52 = i5;
                                FocusOwnerImpl focusOwnerImpl2 = focusOwnerImpl;
                                CardState cardState3 = cardState;
                                String str52 = (String) obj9;
                                str52.getClass();
                                switch (i52) {
                                    case 0:
                                        if (cardState3.setNumber(str52) == CardState.UpdateResult.ValidComplete) {
                                            focusOwnerImpl2.m597moveFocusaToIllA(1, true);
                                        }
                                        break;
                                    case 1:
                                        cardState3.getClass();
                                        String replace = new Regex("[ /]").replace(str52, "");
                                        CardState.UpdateResult checkExpiration = cardState3.checkExpiration(replace);
                                        if (checkExpiration != CardState.UpdateResult.Invalid) {
                                            cardState3._expiration$delegate.setValue(replace);
                                            cardState3.checkValidity();
                                        }
                                        if (checkExpiration == CardState.UpdateResult.ValidComplete) {
                                            focusOwnerImpl2.m597moveFocusaToIllA(1, true);
                                        }
                                        break;
                                    case 2:
                                        cardState3.getClass();
                                        CardState.UpdateResult checkSecurityCode = CardState.checkSecurityCode(str52, cardState3.get_brand());
                                        if (checkSecurityCode != CardState.UpdateResult.Invalid) {
                                            cardState3._securityCode$delegate.setValue(str52);
                                            cardState3.checkValidity();
                                        }
                                        if (checkSecurityCode == CardState.UpdateResult.ValidComplete) {
                                            focusOwnerImpl2.m597moveFocusaToIllA(1, true);
                                        }
                                        break;
                                    default:
                                        cardState3.getClass();
                                        String replace$default = StringsKt__StringsJVMKt.replace$default(str52, " ", "");
                                        Locale locale = Locale.US;
                                        locale.getClass();
                                        String upperCase = replace$default.toUpperCase(locale);
                                        upperCase.getClass();
                                        CardState.UpdateResult checkPostalCode = cardState3.checkPostalCode(upperCase);
                                        if (checkPostalCode != CardState.UpdateResult.Invalid) {
                                            cardState3._postalCode$delegate.setValue(upperCase);
                                            cardState3.checkValidity();
                                        }
                                        if (checkPostalCode == CardState.UpdateResult.ValidComplete) {
                                            focusOwnerImpl2.clearFocus(false);
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer5.updateRememberedValue(rememberedValue8);
                    }
                    InputFieldKt.InputField(str5, (Function1) rememberedValue8, semantics, (InputState) null, AmountBlockerViewKt.f275lambda$1061895605, (Function2) null, (Function2) null, (Function3) null, stringResource, keyboardOptions2, (KeyboardActions) null, expirationTransformation, composer4, 805330944, 48, 1256);
                    Modifier weight2 = rowScopeInstance.weight(1.0f, companion, true);
                    String str6 = (String) cardState._securityCode$delegate.getValue();
                    String stringResource2 = Room.stringResource(composer4, R.string.card_security_code_hint);
                    KeyboardOptions keyboardOptions3 = new KeyboardOptions(0, (Boolean) null, 3, z5 ? 6 : 7, (Boolean) null, 115);
                    boolean changed5 = gapComposer5.changed(cardState) | gapComposer5.changedInstance(focusOwnerImpl);
                    Object rememberedValue9 = gapComposer5.rememberedValue();
                    if (changed5 || rememberedValue9 == neverEqualPolicy) {
                        final int i6 = 2;
                        rememberedValue9 = new Function1() { // from class: com.squareup.cash.blockers.views.InputCardInfoViewKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj9) {
                                int i52 = i6;
                                FocusOwnerImpl focusOwnerImpl2 = focusOwnerImpl;
                                CardState cardState3 = cardState;
                                String str52 = (String) obj9;
                                str52.getClass();
                                switch (i52) {
                                    case 0:
                                        if (cardState3.setNumber(str52) == CardState.UpdateResult.ValidComplete) {
                                            focusOwnerImpl2.m597moveFocusaToIllA(1, true);
                                        }
                                        break;
                                    case 1:
                                        cardState3.getClass();
                                        String replace = new Regex("[ /]").replace(str52, "");
                                        CardState.UpdateResult checkExpiration = cardState3.checkExpiration(replace);
                                        if (checkExpiration != CardState.UpdateResult.Invalid) {
                                            cardState3._expiration$delegate.setValue(replace);
                                            cardState3.checkValidity();
                                        }
                                        if (checkExpiration == CardState.UpdateResult.ValidComplete) {
                                            focusOwnerImpl2.m597moveFocusaToIllA(1, true);
                                        }
                                        break;
                                    case 2:
                                        cardState3.getClass();
                                        CardState.UpdateResult checkSecurityCode = CardState.checkSecurityCode(str52, cardState3.get_brand());
                                        if (checkSecurityCode != CardState.UpdateResult.Invalid) {
                                            cardState3._securityCode$delegate.setValue(str52);
                                            cardState3.checkValidity();
                                        }
                                        if (checkSecurityCode == CardState.UpdateResult.ValidComplete) {
                                            focusOwnerImpl2.m597moveFocusaToIllA(1, true);
                                        }
                                        break;
                                    default:
                                        cardState3.getClass();
                                        String replace$default = StringsKt__StringsJVMKt.replace$default(str52, " ", "");
                                        Locale locale = Locale.US;
                                        locale.getClass();
                                        String upperCase = replace$default.toUpperCase(locale);
                                        upperCase.getClass();
                                        CardState.UpdateResult checkPostalCode = cardState3.checkPostalCode(upperCase);
                                        if (checkPostalCode != CardState.UpdateResult.Invalid) {
                                            cardState3._postalCode$delegate.setValue(upperCase);
                                            cardState3.checkValidity();
                                        }
                                        if (checkPostalCode == CardState.UpdateResult.ValidComplete) {
                                            focusOwnerImpl2.clearFocus(false);
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer5.updateRememberedValue(rememberedValue9);
                    }
                    InputFieldKt.InputField(str6, (Function1) rememberedValue9, weight2, (InputState) null, AmountBlockerViewKt.f303lambda$69483518, (Function2) null, (Function2) null, (Function3) null, stringResource2, keyboardOptions3, (KeyboardActions) null, (VisualTransformation) null, composer4, 24576, 0, 3304);
                    gapComposer5.end(true);
                    if (z5) {
                        gapComposer5.startReplaceGroup(-764005469);
                        String str7 = (String) parcelableSnapshotMutableState3.getValue();
                        VisualTransformation postalCodeTransformation = ImageViewCompat.postalCodeTransformation(country);
                        String str8 = textContent.postcode;
                        int i7 = InputCardInfoViewKt$WhenMappings.$EnumSwitchMapping$0[country.ordinal()];
                        KeyboardOptions keyboardOptions4 = new KeyboardOptions(0, (Boolean) null, (i7 == 1 || i7 == 2 || i7 == 3) ? 1 : 3, 7, (Boolean) null, 115);
                        boolean changed6 = gapComposer5.changed(cardState) | gapComposer5.changedInstance(focusOwnerImpl);
                        Object rememberedValue10 = gapComposer5.rememberedValue();
                        if (changed6 || rememberedValue10 == neverEqualPolicy) {
                            final int i8 = 3;
                            rememberedValue10 = new Function1() { // from class: com.squareup.cash.blockers.views.InputCardInfoViewKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj9) {
                                    int i52 = i8;
                                    FocusOwnerImpl focusOwnerImpl2 = focusOwnerImpl;
                                    CardState cardState3 = cardState;
                                    String str52 = (String) obj9;
                                    str52.getClass();
                                    switch (i52) {
                                        case 0:
                                            if (cardState3.setNumber(str52) == CardState.UpdateResult.ValidComplete) {
                                                focusOwnerImpl2.m597moveFocusaToIllA(1, true);
                                            }
                                            break;
                                        case 1:
                                            cardState3.getClass();
                                            String replace = new Regex("[ /]").replace(str52, "");
                                            CardState.UpdateResult checkExpiration = cardState3.checkExpiration(replace);
                                            if (checkExpiration != CardState.UpdateResult.Invalid) {
                                                cardState3._expiration$delegate.setValue(replace);
                                                cardState3.checkValidity();
                                            }
                                            if (checkExpiration == CardState.UpdateResult.ValidComplete) {
                                                focusOwnerImpl2.m597moveFocusaToIllA(1, true);
                                            }
                                            break;
                                        case 2:
                                            cardState3.getClass();
                                            CardState.UpdateResult checkSecurityCode = CardState.checkSecurityCode(str52, cardState3.get_brand());
                                            if (checkSecurityCode != CardState.UpdateResult.Invalid) {
                                                cardState3._securityCode$delegate.setValue(str52);
                                                cardState3.checkValidity();
                                            }
                                            if (checkSecurityCode == CardState.UpdateResult.ValidComplete) {
                                                focusOwnerImpl2.m597moveFocusaToIllA(1, true);
                                            }
                                            break;
                                        default:
                                            cardState3.getClass();
                                            String replace$default = StringsKt__StringsJVMKt.replace$default(str52, " ", "");
                                            Locale locale = Locale.US;
                                            locale.getClass();
                                            String upperCase = replace$default.toUpperCase(locale);
                                            upperCase.getClass();
                                            CardState.UpdateResult checkPostalCode = cardState3.checkPostalCode(upperCase);
                                            if (checkPostalCode != CardState.UpdateResult.Invalid) {
                                                cardState3._postalCode$delegate.setValue(upperCase);
                                                cardState3.checkValidity();
                                            }
                                            if (checkPostalCode == CardState.UpdateResult.ValidComplete) {
                                                focusOwnerImpl2.clearFocus(false);
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            gapComposer5.updateRememberedValue(rememberedValue10);
                        }
                        inputCardInfoViewModel = inputCardInfoViewModel2;
                        final int i9 = 1;
                        InputFieldKt.InputField(str7, (Function1) rememberedValue10, (Modifier) null, (InputState) null, Expect_jvmKt.rememberComposableLambda(-1601541639, new Function2() { // from class: com.squareup.cash.blockers.views.InputCardInfoViewKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj9, Object obj10) {
                                int i52 = i9;
                                InputCardInfoViewModel inputCardInfoViewModel3 = inputCardInfoViewModel;
                                switch (i52) {
                                    case 0:
                                        Composer composer5 = (Composer) obj9;
                                        int intValue5 = ((Integer) obj10).intValue();
                                        GapComposer gapComposer6 = (GapComposer) composer5;
                                        if (gapComposer6.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((InputCardInfoViewModel.Ready) inputCardInfoViewModel3).cardNumberHint, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer6.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer6 = (Composer) obj9;
                                        int intValue6 = ((Integer) obj10).intValue();
                                        GapComposer gapComposer7 = (GapComposer) composer6;
                                        if (gapComposer7.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer7, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((InputCardInfoViewModel.Ready) inputCardInfoViewModel3).textContent.postcode, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer7.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, composer4), (Function2) null, (Function2) null, Expect_jvmKt.rememberComposableLambda(360742628, new InputCardInfoViewKt$$ExternalSyntheticLambda5(inputCardInfoViewModel, 0), composer4), str8, keyboardOptions4, (KeyboardActions) null, postalCodeTransformation, composer4, 12607488, 0, 1132);
                        composer = composer4;
                        gapComposer5.end(false);
                    } else {
                        composer = composer4;
                        inputCardInfoViewModel = inputCardInfoViewModel2;
                        gapComposer5.startReplaceGroup(-762891236);
                        gapComposer5.end(false);
                    }
                    gapComposer5.end(true);
                    gapComposer5.end(true);
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-1818393956, new ComposeDialogKt$$ExternalSyntheticLambda12(inputCardInfoViewModel, animatedContentScopeImpl, function15, cardState, 18), composer), composer, 24576, 15);
                    gapComposer5.end(true);
                    return Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                return null;
            case 4:
                AddressTypeaheadState addressTypeaheadState = (AddressTypeaheadState) obj7;
                Function1 function16 = (Function1) obj8;
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj6;
                AnimatedContentScopeImpl animatedContentScopeImpl2 = (AnimatedContentScopeImpl) obj;
                SetAddressViewModel setAddressViewModel = (SetAddressViewModel) obj2;
                ((Integer) obj4).getClass();
                animatedContentScopeImpl2.getClass();
                setAddressViewModel.getClass();
                String str9 = setAddressViewModel.title;
                GapComposer gapComposer6 = (GapComposer) ((Composer) obj3);
                Object rememberedValue11 = gapComposer6.rememberedValue();
                Applier applier = gapComposer6.applier;
                if (rememberedValue11 == neverEqualPolicy2) {
                    rememberedValue11 = new TouchRecorder();
                    gapComposer6.updateRememberedValue(rememberedValue11);
                }
                TouchRecorder touchRecorder = (TouchRecorder) rememberedValue11;
                boolean changed7 = gapComposer6.changed(str9);
                Object rememberedValue12 = gapComposer6.rememberedValue();
                if (changed7 || rememberedValue12 == neverEqualPolicy2) {
                    rememberedValue12 = Updater.mutableStateOf$default(str9);
                    gapComposer6.updateRememberedValue(rememberedValue12);
                }
                MutableState mutableState = (MutableState) rememberedValue12;
                AddressState address = addressTypeaheadState.getAddress();
                Arrangement$Top$1 arrangement$Top$12 = SpacerKt.Top;
                BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
                ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal2, gapComposer6, 0);
                int hashCode5 = Long.hashCode(gapComposer6.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer6.currentCompositionLocalScope();
                Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer6, companion);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                if (applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer6.startReusableNode();
                if (gapComposer6.inserting) {
                    gapComposer6.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer6.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(gapComposer6, columnMeasurePolicy4, composeUiNode$Companion$SetModifier$15);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer6, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$16);
                Integer valueOf2 = Integer.valueOf(hashCode5);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(gapComposer6, valueOf2, composeUiNode$Companion$SetModifier$17);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer6, ownerSnapshotObserver$onCommitAffectingLayout$12);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer6, materializeModifier5, composeUiNode$Companion$SetModifier$18);
                boolean z8 = setAddressViewModel.showCloseButton;
                if (z8) {
                    navigationType2 = NavigationType.CLOSE;
                } else {
                    if (z8) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    navigationType2 = NavigationType.NONE;
                }
                NavigationType navigationType4 = navigationType2;
                boolean changed8 = gapComposer6.changed(function16) | gapComposer6.changed(delegatingSoftwareKeyboardController);
                Object rememberedValue13 = gapComposer6.rememberedValue();
                if (changed8 || rememberedValue13 == neverEqualPolicy2) {
                    rememberedValue13 = new SetNameViewKt$$ExternalSyntheticLambda6(function16, delegatingSoftwareKeyboardController, 4);
                    gapComposer6.updateRememberedValue(rememberedValue13);
                }
                DBUtil.TitleBarSub((String) null, navigationType4, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue13, (Modifier) null, (Function3) null, gapComposer6, 6, 108);
                Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(ImageKt.verticalScroll$default(new LayoutWeightElement(1.0f, true), ImageKt.rememberScrollState(gapComposer6), false, 14), RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                ColumnMeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal2, gapComposer6, 0);
                int hashCode6 = Long.hashCode(gapComposer6.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer6.currentCompositionLocalScope();
                Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer6, m302paddingqDBjuR0$default2);
                gapComposer6.startReusableNode();
                if (gapComposer6.inserting) {
                    gapComposer6.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer6.useNode();
                }
                Updater.m576setimpl(gapComposer6, columnMeasurePolicy5, composeUiNode$Companion$SetModifier$15);
                Updater.m576setimpl(gapComposer6, currentCompositionLocalScope6, composeUiNode$Companion$SetModifier$16);
                Recorder$$ExternalSyntheticOutline2.m(hashCode6, gapComposer6, composeUiNode$Companion$SetModifier$17, gapComposer6, ownerSnapshotObserver$onCommitAffectingLayout$12);
                Updater.m576setimpl(gapComposer6, materializeModifier6, composeUiNode$Companion$SetModifier$18);
                Countries.PageHeader((String) mutableState.getValue(), (Modifier) null, (Function2) null, setAddressViewModel.subtitle, gapComposer6, 0, 6);
                SpacerKt.Spacer(gapComposer6, SizeKt.m277height3ABfNKs(companion, 32.0f));
                Strings.TouchRecordingLayout(touchRecorder, null, Expect_jvmKt.rememberComposableLambda(998095272, new SetPinViewKt$$ExternalSyntheticLambda2(20, setAddressViewModel, addressTypeaheadState), gapComposer6), gapComposer6, 392, 2);
                gapComposer6.end(true);
                DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-1518146775, new StripeImageKt$$ExternalSyntheticLambda2(setAddressViewModel, touchRecorder, animatedContentScopeImpl2, function16, address, mutableState, delegatingSoftwareKeyboardController, 1), gapComposer6), gapComposer6, 24576, 15);
                gapComposer6.end(true);
                return Unit.INSTANCE;
            case 5:
                LazyPagingItems lazyPagingItems = (LazyPagingItems) obj7;
                Function1 function17 = (Function1) obj8;
                RealImageLoader realImageLoader = (RealImageLoader) obj6;
                int intValue5 = ((Integer) obj2).intValue();
                Composer composer5 = (Composer) obj3;
                int intValue6 = ((Integer) obj4).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                if ((intValue6 & 48) == 0) {
                    intValue6 |= ((GapComposer) composer5).changed(intValue5) ? 32 : 16;
                }
                GapComposer gapComposer7 = (GapComposer) composer5;
                if (gapComposer7.shouldExecute(intValue6 & 1, (intValue6 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                    final AfterPayOrderHubRowModel afterPayOrderHubRowModel = (AfterPayOrderHubRowModel) lazyPagingItems.get(intValue5);
                    if (afterPayOrderHubRowModel == null) {
                        return Unit.INSTANCE;
                    }
                    if (afterPayOrderHubRowModel instanceof AfterPayOrderHubRowModel.HeaderModel) {
                        gapComposer7.startReplaceGroup(1898640818);
                        Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                        boolean changed9 = gapComposer7.changed(function17);
                        Object rememberedValue14 = gapComposer7.rememberedValue();
                        Object obj9 = rememberedValue14;
                        if (changed9 || rememberedValue14 == neverEqualPolicy2) {
                            SsnViewKt$$ExternalSyntheticLambda1 ssnViewKt$$ExternalSyntheticLambda1 = new SsnViewKt$$ExternalSyntheticLambda1(i3, function17);
                            gapComposer7.updateRememberedValue(ssnViewKt$$ExternalSyntheticLambda1);
                            obj9 = ssnViewKt$$ExternalSyntheticLambda1;
                        }
                        Function1 function18 = (Function1) obj9;
                        boolean changedInstance4 = gapComposer7.changedInstance(afterPayOrderHubRowModel);
                        Object rememberedValue15 = gapComposer7.rememberedValue();
                        if (changedInstance4 || rememberedValue15 == neverEqualPolicy2) {
                            z2 = false;
                            final boolean z9 = false ? 1 : 0;
                            Function1 function19 = new Function1() { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderHubViewKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj10) {
                                    int i10 = z9;
                                    AfterPayOrderHubRowModel afterPayOrderHubRowModel2 = afterPayOrderHubRowModel;
                                    switch (i10) {
                                        case 0:
                                            AfterPayOrderHubMainHeaderView afterPayOrderHubMainHeaderView = (AfterPayOrderHubMainHeaderView) obj10;
                                            afterPayOrderHubMainHeaderView.getClass();
                                            afterPayOrderHubMainHeaderView.setModel((AfterPayOrderHubRowModel.HeaderModel) afterPayOrderHubRowModel2);
                                            break;
                                        case 1:
                                            AfterPayOrderHubRowItemView afterPayOrderHubRowItemView = (AfterPayOrderHubRowItemView) obj10;
                                            afterPayOrderHubRowItemView.getClass();
                                            afterPayOrderHubRowItemView.setModel((AfterPayOrderHubRowModel.PaymentRowModel) afterPayOrderHubRowModel2);
                                            break;
                                        default:
                                            AfterPayOrderHubSectionHeaderView afterPayOrderHubSectionHeaderView = (AfterPayOrderHubSectionHeaderView) obj10;
                                            afterPayOrderHubSectionHeaderView.getClass();
                                            String str10 = ((AfterPayOrderHubRowModel.SectionHeaderModel) afterPayOrderHubRowModel2).title.text;
                                            if (str10 == null) {
                                                str10 = "";
                                            }
                                            afterPayOrderHubSectionHeaderView.setTitle(str10);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            gapComposer7.updateRememberedValue(function19);
                            obj5 = function19;
                        } else {
                            z2 = false;
                            obj5 = rememberedValue15;
                        }
                        AndroidView_androidKt.AndroidView(function18, fillMaxWidth2, (Function1) obj5, gapComposer7, 48, 0);
                        gapComposer7.end(z2);
                    } else if (afterPayOrderHubRowModel instanceof AfterPayOrderHubRowModel.SectionHeaderModel) {
                        gapComposer7.startReplaceGroup(1899049801);
                        Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
                        Object rememberedValue16 = gapComposer7.rememberedValue();
                        Object obj10 = rememberedValue16;
                        if (rememberedValue16 == neverEqualPolicy2) {
                            CalendarRowKt$$ExternalSyntheticLambda10 calendarRowKt$$ExternalSyntheticLambda10 = new CalendarRowKt$$ExternalSyntheticLambda10(8);
                            gapComposer7.updateRememberedValue(calendarRowKt$$ExternalSyntheticLambda10);
                            obj10 = calendarRowKt$$ExternalSyntheticLambda10;
                        }
                        Function1 function110 = (Function1) obj10;
                        boolean changedInstance5 = gapComposer7.changedInstance(afterPayOrderHubRowModel);
                        Object rememberedValue17 = gapComposer7.rememberedValue();
                        Object obj11 = rememberedValue17;
                        if (changedInstance5 || rememberedValue17 == neverEqualPolicy2) {
                            final int i10 = 2;
                            Function1 function111 = new Function1() { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderHubViewKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj102) {
                                    int i102 = i10;
                                    AfterPayOrderHubRowModel afterPayOrderHubRowModel2 = afterPayOrderHubRowModel;
                                    switch (i102) {
                                        case 0:
                                            AfterPayOrderHubMainHeaderView afterPayOrderHubMainHeaderView = (AfterPayOrderHubMainHeaderView) obj102;
                                            afterPayOrderHubMainHeaderView.getClass();
                                            afterPayOrderHubMainHeaderView.setModel((AfterPayOrderHubRowModel.HeaderModel) afterPayOrderHubRowModel2);
                                            break;
                                        case 1:
                                            AfterPayOrderHubRowItemView afterPayOrderHubRowItemView = (AfterPayOrderHubRowItemView) obj102;
                                            afterPayOrderHubRowItemView.getClass();
                                            afterPayOrderHubRowItemView.setModel((AfterPayOrderHubRowModel.PaymentRowModel) afterPayOrderHubRowModel2);
                                            break;
                                        default:
                                            AfterPayOrderHubSectionHeaderView afterPayOrderHubSectionHeaderView = (AfterPayOrderHubSectionHeaderView) obj102;
                                            afterPayOrderHubSectionHeaderView.getClass();
                                            String str10 = ((AfterPayOrderHubRowModel.SectionHeaderModel) afterPayOrderHubRowModel2).title.text;
                                            if (str10 == null) {
                                                str10 = "";
                                            }
                                            afterPayOrderHubSectionHeaderView.setTitle(str10);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            gapComposer7.updateRememberedValue(function111);
                            obj11 = function111;
                        }
                        AndroidView_androidKt.AndroidView(function110, fillMaxWidth3, (Function1) obj11, gapComposer7, 54, 0);
                        gapComposer7.end(false);
                    } else {
                        if (!(afterPayOrderHubRowModel instanceof AfterPayOrderHubRowModel.PaymentRowModel)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer7, -2016964378, false);
                        }
                        gapComposer7.startReplaceGroup(1899305396);
                        Modifier fillMaxWidth4 = SizeKt.fillMaxWidth(companion, 1.0f);
                        boolean changedInstance6 = gapComposer7.changedInstance(realImageLoader) | gapComposer7.changed(function17);
                        Object rememberedValue18 = gapComposer7.rememberedValue();
                        Object obj12 = rememberedValue18;
                        if (changedInstance6 || rememberedValue18 == neverEqualPolicy2) {
                            BorrowHomeKt$$ExternalSyntheticLambda1 borrowHomeKt$$ExternalSyntheticLambda1 = new BorrowHomeKt$$ExternalSyntheticLambda1(7, (Object) realImageLoader, (Object) function17);
                            gapComposer7.updateRememberedValue(borrowHomeKt$$ExternalSyntheticLambda1);
                            obj12 = borrowHomeKt$$ExternalSyntheticLambda1;
                        }
                        Function1 function112 = (Function1) obj12;
                        boolean changedInstance7 = gapComposer7.changedInstance(afterPayOrderHubRowModel);
                        Object rememberedValue19 = gapComposer7.rememberedValue();
                        Object obj13 = rememberedValue19;
                        if (changedInstance7 || rememberedValue19 == neverEqualPolicy2) {
                            Function1 function113 = new Function1() { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderHubViewKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj102) {
                                    int i102 = i4;
                                    AfterPayOrderHubRowModel afterPayOrderHubRowModel2 = afterPayOrderHubRowModel;
                                    switch (i102) {
                                        case 0:
                                            AfterPayOrderHubMainHeaderView afterPayOrderHubMainHeaderView = (AfterPayOrderHubMainHeaderView) obj102;
                                            afterPayOrderHubMainHeaderView.getClass();
                                            afterPayOrderHubMainHeaderView.setModel((AfterPayOrderHubRowModel.HeaderModel) afterPayOrderHubRowModel2);
                                            break;
                                        case 1:
                                            AfterPayOrderHubRowItemView afterPayOrderHubRowItemView = (AfterPayOrderHubRowItemView) obj102;
                                            afterPayOrderHubRowItemView.getClass();
                                            afterPayOrderHubRowItemView.setModel((AfterPayOrderHubRowModel.PaymentRowModel) afterPayOrderHubRowModel2);
                                            break;
                                        default:
                                            AfterPayOrderHubSectionHeaderView afterPayOrderHubSectionHeaderView = (AfterPayOrderHubSectionHeaderView) obj102;
                                            afterPayOrderHubSectionHeaderView.getClass();
                                            String str10 = ((AfterPayOrderHubRowModel.SectionHeaderModel) afterPayOrderHubRowModel2).title.text;
                                            if (str10 == null) {
                                                str10 = "";
                                            }
                                            afterPayOrderHubSectionHeaderView.setTitle(str10);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            gapComposer7.updateRememberedValue(function113);
                            obj13 = function113;
                        }
                        AndroidView_androidKt.AndroidView(function112, fillMaxWidth4, (Function1) obj13, gapComposer7, 48, 0);
                        ModalKt.HorizontalDivider(0, 1, gapComposer7, null);
                        gapComposer7.end(false);
                    }
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                Composer composer6 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                UiScopeKt.UiScope(Expect_jvmKt.rememberComposableLambda(1326272386, new ComposeDialogKt$$ExternalSyntheticLambda12((CardPreviewViewModel) obj7, (CardPreviewViewModel) obj2, (Function1) obj8, (TextureViewFpsTracker) obj6, 23), composer6), composer6, 6);
                return Unit.INSTANCE;
            case 7:
                LazyListState lazyListState = (LazyListState) obj8;
                CardStylePickerViewModel cardStylePickerViewModel = (CardStylePickerViewModel) obj7;
                MutableState mutableState2 = (MutableState) obj6;
                ((Integer) obj2).getClass();
                Composer composer7 = (Composer) obj3;
                int intValue7 = ((Integer) obj4).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer7;
                if (gapComposer8.shouldExecute(intValue7 & 1, (intValue7 & EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) != 128)) {
                    Colors colors3 = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                    } else {
                        gapComposer8.startReplaceGroup(-1762997739);
                        gapComposer8.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion, colors3.semantic.background.f1047app, ColorKt.RectangleShape);
                    ColumnMeasurePolicy columnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer8, 0);
                    int hashCode7 = Long.hashCode(gapComposer8.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope7 = gapComposer8.currentCompositionLocalScope();
                    Modifier materializeModifier7 = PlatformKt.materializeModifier(gapComposer8, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer8.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer8.startReusableNode();
                    if (gapComposer8.inserting) {
                        gapComposer8.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer8.useNode();
                    }
                    Updater.m576setimpl(gapComposer8, columnMeasurePolicy6, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer8, currentCompositionLocalScope7, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer8, Integer.valueOf(hashCode7), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer8, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer8, materializeModifier7, ComposeUiNode.Companion.SetModifier);
                    Modifier fillMaxWidth5 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changedInstance8 = gapComposer8.changedInstance(cardStylePickerViewModel) | gapComposer8.changed(mutableState2);
                    Object rememberedValue20 = gapComposer8.rememberedValue();
                    if (changedInstance8 || rememberedValue20 == neverEqualPolicy2) {
                        rememberedValue20 = new BorrowHomeKt$$ExternalSyntheticLambda1(i3, cardStylePickerViewModel, mutableState2);
                        gapComposer8.updateRememberedValue(rememberedValue20);
                    }
                    FilterBarKt.FilterBar(fillMaxWidth5, lazyListState, null, (Function1) rememberedValue20, gapComposer8, 6, 4);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer8, null);
                    gapComposer8.end(true);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                Function1 function114 = (Function1) obj8;
                ScrollingScaffoldContentScope scrollingScaffoldContentScope = (ScrollingScaffoldContentScope) obj7;
                LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) obj6;
                EarningsHomeViewModel earningsHomeViewModel = (EarningsHomeViewModel) obj2;
                Composer composer8 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                earningsHomeViewModel.getClass();
                ColumnMeasurePolicy columnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer8, 0);
                GapComposer gapComposer9 = (GapComposer) composer8;
                int hashCode8 = Long.hashCode(gapComposer9.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope8 = gapComposer9.currentCompositionLocalScope();
                Modifier materializeModifier8 = PlatformKt.materializeModifier(composer8, companion);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer10 = (GapComposer) composer8;
                if (gapComposer10.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer10.startReusableNode();
                if (gapComposer10.inserting) {
                    gapComposer10.createNode(layoutNode$Companion$Constructor$14);
                } else {
                    gapComposer10.useNode();
                }
                Updater.m576setimpl(composer8, columnMeasurePolicy7, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer8, currentCompositionLocalScope8, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer8, Integer.valueOf(hashCode8), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer8, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer8, materializeModifier8, ComposeUiNode.Companion.SetModifier);
                ArrayList arrayList = ((EarningsHomeViewModel.Loaded) earningsHomeViewModel).sections;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj14 : arrayList) {
                    EarningsHomeViewModel.SectionContent sectionContent = (EarningsHomeViewModel.SectionContent) obj14;
                    if ((sectionContent instanceof EarningsHomeViewModel.SectionContent.Header) || (sectionContent instanceof EarningsHomeViewModel.SectionContent.Activity) || (sectionContent instanceof EarningsHomeViewModel.SectionContent.Distributions) || (sectionContent instanceof EarningsHomeViewModel.SectionContent.ActionButtons) || (sectionContent instanceof EarningsHomeViewModel.SectionContent.EarningTools) || (sectionContent instanceof EarningsHomeViewModel.SectionContent.DisclosureFooter)) {
                        arrayList2.add(obj14);
                    } else if (!Intrinsics.areEqual(sectionContent, EarningsHomeViewModel.SectionContent.Unknown.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                }
                gapComposer10.startReplaceGroup(476054289);
                Iterator it = arrayList2.iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    EarningsHomeKt.SectionView((EarningsHomeViewModel.SectionContent) next, (EarningsHomeViewModel.SectionContent) CollectionsKt.getOrNull(i11 - 1, arrayList2), function114, scrollingScaffoldContentScope, factory, composer8, 0);
                    i11 = i12;
                }
                gapComposer10.end(false);
                gapComposer10.end(true);
                return Unit.INSTANCE;
            case 9:
                return invoke$com$squareup$cash$education$stories$views$EducationStoryViewPagerViewKt$$ExternalSyntheticLambda1(obj, obj2, obj3, obj4);
            case 10:
                return invoke$com$squareup$cash$instruments$views$InstrumentSelectionViewKt$$ExternalSyntheticLambda13(obj, obj2, obj3, obj4);
            case 11:
                return invoke$com$squareup$cash$instruments$views$InstrumentSelectionViewKt$$ExternalSyntheticLambda8(obj, obj2, obj3, obj4);
            case 12:
                return invoke$com$squareup$cash$investing$components$categories$InvestingCategoryDetailKt$$ExternalSyntheticLambda3(obj, obj2, obj3, obj4);
            case 13:
                return invoke$com$squareup$cash$money$views$MoneyTabSectionUIKt$$ExternalSyntheticLambda4(obj, obj2, obj3, obj4);
            case 14:
                return invoke$com$squareup$cash$paychecks$presenters$EditDistributionPresenterKt$$ExternalSyntheticLambda2(obj, obj2, obj3, obj4);
            case 15:
                return invoke$com$squareup$cash$payments$views$composer$RotatingTitleIconKt$$ExternalSyntheticLambda1(obj, obj2, obj3, obj4);
            case 16:
                return invoke$com$squareup$cash$work$views$clockin$ClockInOverlayViewKt$$ExternalSyntheticLambda9(obj, obj2, obj3, obj4);
            case 17:
                return invoke$com$stripe$android$financialconnections$features$institutionpicker$InstitutionPickerScreenKt$$ExternalSyntheticLambda28(obj, obj2, obj3, obj4);
            default:
                Lazy lazy = (Lazy) obj8;
                CameraPreview cameraPreview = (CameraPreview) obj7;
                TrackingEventsLogger trackingEventsLogger = (TrackingEventsLogger) obj6;
                SelfieWorkflow.Screen.OldCameraScreen oldCameraScreen = (SelfieWorkflow.Screen.OldCameraScreen) obj;
                ViewEnvironment viewEnvironment = (ViewEnvironment) obj2;
                Context context2 = (Context) obj3;
                ViewGroup viewGroup = (ViewGroup) obj4;
                oldCameraScreen.getClass();
                VideoCaptureMethod videoCaptureMethod = oldCameraScreen.videoCaptureMethod;
                viewEnvironment.getClass();
                context2.getClass();
                if (viewGroup == null || (context = viewGroup.getContext()) == null) {
                    context = context2;
                }
                Pi2OldSelfieCameraBinding inflate = Pi2OldSelfieCameraBinding.inflate(LayoutInflater.from(context).cloneInContext(context2));
                Camera2PreviewView camera2PreviewView = inflate.camera2Preview;
                ConstraintLayout constraintLayout = inflate.rootView;
                if (videoCaptureMethod != VideoCaptureMethod.None) {
                    Context applicationContext = context2.getApplicationContext();
                    applicationContext.getClass();
                    CameraChoices bestCameraChoices = Camera2UtilsKt.getBestCameraChoices(applicationContext, CameraDirection.FRONT);
                    if (bestCameraChoices == null) {
                        oldCameraScreen.onCameraError.invoke(new NoSuitableCameraError());
                        create = new o0(camera2PreviewView, 11);
                    } else {
                        Camera2Controller_Factory_Impl camera2Controller_Factory_Impl = oldCameraScreen.camera2ControllerFactory;
                        Object obj15 = lazy.get();
                        obj15.getClass();
                        create = camera2Controller_Factory_Impl.create(bestCameraChoices, camera2PreviewView, (Camera2ImageAnalyzer) obj15, VideoCaptureMethod.valueOf(videoCaptureMethod.toString()), oldCameraScreen.isAudioRequired);
                    }
                } else {
                    create = oldCameraScreen.cameraXControllerFactory.create(cameraPreview, inflate.previewviewSelfieCamera, new UnleashContext(inflate, lazy, cameraPreview, oldCameraScreen), oldCameraScreen.isAudioRequired);
                }
                constraintLayout.getClass();
                Object obj16 = lazy.get();
                obj16.getClass();
                ViewShowRenderingKt.bindShowRendering(constraintLayout, oldCameraScreen, viewEnvironment, new Map$evaluateLogic$1(2, new OldCameraScreenRunner(inflate, create, (SelfieDirectionFeed) obj16, trackingEventsLogger), OldCameraScreenRunner.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0, 1));
                return constraintLayout;
        }
    }

    public /* synthetic */ FirstTimeBorrowKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$0 = function1;
    }

    public /* synthetic */ FirstTimeBorrowKt$$ExternalSyntheticLambda2(Object obj, Function1 function1, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$0 = function1;
        this.f$2 = obj2;
    }

    public /* synthetic */ FirstTimeBorrowKt$$ExternalSyntheticLambda2(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ FirstTimeBorrowKt$$ExternalSyntheticLambda2(Function2 function2, Function1 function1, Modifier modifier) {
        this.$r8$classId = 2;
        this.f$2 = function2;
        this.f$0 = function1;
        this.f$1 = modifier;
    }
}
