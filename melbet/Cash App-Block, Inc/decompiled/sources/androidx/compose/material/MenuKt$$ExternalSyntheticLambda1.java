package androidx.compose.material;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda5;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.unit.Density;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.NavHostKt$NavHost$29$1$1$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.ui.compose.SpacesPagerInteractionManagerKt;
import app.cash.local.backend.BuyerIntentState;
import app.cash.local.backend.CartBuilderManager;
import app.cash.local.presenters.BuyerIntentCartScopesKt;
import app.cash.local.presenters.brand.checkout.LocalBrandLocationCheckoutPresenter;
import app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.screens.app.SchedulingDayTimeQuestion;
import app.cash.local.screens.app.VehicleDescription;
import app.cash.local.screens.app.VehicleDescriptionQuestion;
import app.cash.local.viewmodels.AppliedCouponBanner;
import app.cash.local.viewmodels.CurbsidePickupDetails;
import app.cash.local.viewmodels.LocalAddBrandsViewModel;
import app.cash.local.viewmodels.LocalBrandLocationAddressContentModel;
import app.cash.local.viewmodels.LocalBrandLocationCartViewModel;
import app.cash.local.viewmodels.LocalBrandLocationCheckoutViewModel;
import app.cash.local.viewmodels.LocalBrandLocationMenuContentModel;
import app.cash.local.viewmodels.LocalCheckoutPaymentMethodViewModel;
import app.cash.local.viewmodels.LocalEditorialText;
import app.cash.local.viewmodels.LocalMenuComboDetailsViewModel;
import app.cash.local.viewmodels.LocalMenuItemDetailsViewModel;
import app.cash.local.viewmodels.OrderBuilderEvent;
import app.cash.local.viewmodels.instore.TableQrCodeScannerViewModel;
import app.cash.local.viewmodels.sheet.MapDecisionSheetModel;
import app.cash.local.viewmodels.wallet.LocalHomeViewModel;
import app.cash.local.views.LocalViewFactory$createUi$view$3$1$1$1;
import app.cash.local.views.brand.checkout.CheckoutTipSectionKt;
import app.cash.local.views.brand.checkout.CurbsidePickupCarSheetKt;
import app.cash.local.views.brand.checkout.LocalBrandLocationCheckoutViewKt;
import app.cash.local.views.brand.menu.LocalCaloriesTextKt;
import app.cash.local.views.brand.profile.LocalBrandLocationRowKt;
import app.cash.local.views.cart.LocalBrandLocationCartViewKt;
import app.cash.local.views.composeuiview.LocalAddBrandsViewKt;
import app.cash.local.views.instore.TableQrCodeScannerViewKt;
import app.cash.local.views.map.LocalMapPinKt$$ExternalSyntheticLambda5;
import app.cash.local.views.wallet.LocalHomeViewKt;
import app.cash.molecule.PlatformKt;
import app.cash.zipline.loader.ZiplineLoader$ModuleJob$run$3;
import coil3.RealImageLoader$execute$2;
import com.squareup.cash.core.navigationcontainer.SpacesPagerInteractionManagerImpl;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class MenuKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ MenuKt$$ExternalSyntheticLambda1(AppliedCouponBanner appliedCouponBanner, Function0 function0, Modifier modifier, int i) {
        this.$r8$classId = 26;
        this.f$1 = appliedCouponBanner;
        this.f$2 = function0;
        this.f$0 = modifier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj3 = this.f$2;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                Modifier modifier = (Modifier) obj5;
                ScrollState scrollState = (ScrollState) obj4;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(modifier, RecyclerView.DECELERATION_RATE, 8.0f, 1);
                    IntrinsicSize intrinsicSize = IntrinsicSize.Min;
                    Modifier verticalScroll$default = ImageKt.verticalScroll$default(OffsetKt.width(m300paddingVpY3zN4$default), scrollState, false, 14);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                    int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
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
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$1);
                    }
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Recorder$$ExternalSyntheticOutline1.m(6, composableLambdaImpl, ColumnScopeInstance.INSTANCE, gapComposer, true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj5;
                ScrollingLogic scrollingLogic = (ScrollingLogic) obj4;
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long m248toOffsettuRUvjQ = scrollingLogic.m248toOffsettuRUvjQ(scrollingLogic.reverseIfNeeded(floatValue - ref$FloatRef.element));
                ScrollingLogic scrollingLogic2 = ((ScrollingLogic$nestedScrollScope$1) obj3).this$0;
                ref$FloatRef.element += scrollingLogic.reverseIfNeeded(scrollingLogic.m247toFloatk4lQ0M(scrollingLogic2.m245performScroll3eAAhYA(scrollingLogic2.outerStateScope, m248toOffsettuRUvjQ, 1)));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                KeyMappingKt.CoreTextFieldRootBox((Modifier) obj5, (TextFieldSelectionManager) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(385));
                return Unit.INSTANCE;
            case 3:
                Modifier modifier2 = (Modifier) obj5;
                MutableState mutableState = (MutableState) obj4;
                ComposableLambdaImpl composableLambdaImpl2 = (ComposableLambdaImpl) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new DateInputKt$$ExternalSyntheticLambda5(4, mutableState);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    Modifier onGloballyPositioned = ValueInsets.onGloballyPositioned(modifier2, (Function1) rememberedValue);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, true);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, onGloballyPositioned);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer2.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    Recorder$$ExternalSyntheticOutline2.m(0, composableLambdaImpl2, gapComposer2, true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Ref$LongRef ref$LongRef = (Ref$LongRef) obj5;
                TextFieldSelectionState textFieldSelectionState = (TextFieldSelectionState) obj4;
                PointerInputChange pointerInputChange = (PointerInputChange) obj;
                long m626plusMKHz9U = Offset.m626plusMKHz9U(ref$LongRef.element, ((Offset) obj2).packedValue);
                ref$LongRef.element = m626plusMKHz9U;
                textFieldSelectionState.m422updateHandleDraggingUv8p0NA(Handle.Cursor, Offset.m626plusMKHz9U(((Ref$LongRef) obj3).element, m626plusMKHz9U));
                if (textFieldSelectionState.m421placeCursorAtNearestOffsetk4lQ0M(textFieldSelectionState.m419getHandleDragPositionF1C5BW0())) {
                    pointerInputChange.consume();
                    PlatformHapticFeedback platformHapticFeedback = textFieldSelectionState.hapticFeedBack;
                    if (platformHapticFeedback != null) {
                        platformHapticFeedback.m769performHapticFeedbackCdsT49E(9);
                    }
                }
                return Unit.INSTANCE;
            case 5:
                MutableState mutableState2 = (MutableState) obj5;
                PaddingValues paddingValues = (PaddingValues) obj4;
                ComposableLambdaImpl composableLambdaImpl3 = (ComposableLambdaImpl) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Updater.CompositionLocalProvider(ContentAlphaKt.LocalContentAlpha.defaultProvidedValue$runtime(Float.valueOf(Color.m677getAlphaimpl(((Color) mutableState2.getValue()).value))), Expect_jvmKt.rememberComposableLambda(-869936862, new ButtonKt$$ExternalSyntheticLambda0(paddingValues, composableLambdaImpl3, null == true ? 1 : 0), gapComposer3), gapComposer3, 56);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj5;
                Float f = (Float) obj;
                float floatValue2 = f.floatValue();
                Float f2 = (Float) obj2;
                float floatValue3 = f2.floatValue();
                ((FixedThreshold) ((Function2) obj4).invoke(MapsKt__MapsKt.getValue(linkedHashMap, f), MapsKt__MapsKt.getValue(linkedHashMap, f2))).getClass();
                return Float.valueOf((Math.signum(floatValue3 - floatValue2) * ((Density) obj3).mo236toPx0680j_4(56.0f)) + floatValue2);
            case 7:
                MutableState mutableState3 = (MutableState) obj5;
                PaddingValues paddingValues2 = (PaddingValues) obj4;
                Function2 function2 = (Function2) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Modifier layoutId = RulerKt.layoutId(companion, "border");
                    long j = ((Size) mutableState3.getValue()).packedValue;
                    int i2 = OutlinedTextFieldKt.$r8$clinit;
                    Modifier drawWithContent = ClipKt.drawWithContent(layoutId, new LocalMapPinKt$$ExternalSyntheticLambda5(j, paddingValues2));
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, true);
                    int currentCompositeKeyHash2 = Updater.getCurrentCompositeKeyHash(gapComposer4);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer4, drawWithContent);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer4.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    if (gapComposer4.inserting || !Intrinsics.areEqual(gapComposer4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash2, gapComposer4, currentCompositeKeyHash2, composeUiNode$Companion$SetModifier$12);
                    }
                    Updater.m576setimpl(gapComposer4, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    if (function2 == null) {
                        gapComposer4.startReplaceGroup(-1295979683);
                    } else {
                        gapComposer4.startReplaceGroup(235288868);
                        function2.invoke(gapComposer4, 0);
                    }
                    gapComposer4.end(false);
                    gapComposer4.end(true);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                float floatValue4 = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                JobKt.launch$default((CoroutineScope) obj5, null, null, new NavHostKt$NavHost$29$1$1$1(floatValue4, (SeekableTransitionState) obj4, (NavBackStackEntry) obj3, (Continuation) null), 3);
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                BuyerIntentCartScopesKt.SeedBuyerIntentCartEffect((CartBuilderManager) obj5, (BuyerIntentState) obj4, (LocationMenu) obj3, (Composer) obj, Updater.updateChangedFlags(65));
                return Unit.INSTANCE;
            case 10:
                CoroutineScope coroutineScope = (CoroutineScope) obj5;
                Function1 function1 = (Function1) obj4;
                LocalBrandLocationCheckoutPresenter localBrandLocationCheckoutPresenter = (LocalBrandLocationCheckoutPresenter) obj3;
                FulfillmentConfiguration fulfillmentConfiguration = (FulfillmentConfiguration) obj2;
                ((SchedulingDayTimeQuestion) obj).getClass();
                if (fulfillmentConfiguration != null) {
                    LocalFulfillment.SchedulingDetails schedulingDetails = fulfillmentConfiguration.getSchedulingDetails();
                    if (schedulingDetails != null) {
                        function1.invoke(new OrderBuilderEvent.UpdateFulfillmentScheduling(schedulingDetails));
                    }
                    JobKt.launch$default(coroutineScope, null, null, new ZiplineLoader$ModuleJob$run$3(localBrandLocationCheckoutPresenter, fulfillmentConfiguration, null == true ? 1 : 0, 5), 3);
                }
                return Unit.INSTANCE;
            case 11:
                Function1 function12 = (Function1) obj5;
                VehicleDescription vehicleDescription = (VehicleDescription) obj2;
                ((VehicleDescriptionQuestion) obj).getClass();
                ((MutableState) obj4).setValue(vehicleDescription);
                function12.invoke(new OrderBuilderEvent.UpdateCurbsideDetails(new CurbsidePickupDetails(((CurbsidePickupDetails) ((MutableState) obj3).getValue()).isSelected, vehicleDescription != null ? vehicleDescription.colorLabel : null, vehicleDescription != null ? vehicleDescription.typeLabel : null, vehicleDescription != null ? vehicleDescription.note : null)));
                return Unit.INSTANCE;
            case 12:
                CoroutineScope coroutineScope2 = (CoroutineScope) obj5;
                LocalBrandProfilePresenter localBrandProfilePresenter = (LocalBrandProfilePresenter) obj4;
                State state = (State) obj3;
                FulfillmentConfiguration fulfillmentConfiguration2 = (FulfillmentConfiguration) obj2;
                ((SchedulingDayTimeQuestion) obj).getClass();
                if (fulfillmentConfiguration2 != null) {
                    JobKt.launch$default(coroutineScope2, null, null, new RealImageLoader$execute$2(localBrandProfilePresenter, fulfillmentConfiguration2, state, null, 2), 3);
                }
                return Unit.INSTANCE;
            case 13:
                TableQrCodeScannerViewModel tableQrCodeScannerViewModel = (TableQrCodeScannerViewModel) obj4;
                Function1 function13 = (Function1) obj3;
                Modifier modifier3 = (Modifier) obj5;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    TableQrCodeScannerViewKt.TableQrCodeScannerView(tableQrCodeScannerViewModel, function13, modifier3, false, gapComposer5, 0);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                LocalHomeViewModel localHomeViewModel = (LocalHomeViewModel) obj5;
                Function1 function14 = (Function1) obj4;
                State state2 = (State) obj3;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Object rememberedValue2 = gapComposer6.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer6);
                        gapComposer6.updateRememberedValue(rememberedValue2);
                    }
                    CoroutineScope coroutineScope3 = (CoroutineScope) rememberedValue2;
                    SpacesPagerInteractionManagerImpl spacesPagerInteractionManagerImpl = (SpacesPagerInteractionManagerImpl) gapComposer6.consume(SpacesPagerInteractionManagerKt.LocalSpacesPagerInteractionManager);
                    Unit unit = Unit.INSTANCE;
                    boolean changedInstance = gapComposer6.changedInstance(coroutineScope3) | gapComposer6.changedInstance(spacesPagerInteractionManagerImpl);
                    Object rememberedValue3 = gapComposer6.rememberedValue();
                    if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new LocalViewFactory$createUi$view$3$1$1$1(null == true ? 1 : 0, coroutineScope3, spacesPagerInteractionManagerImpl);
                        gapComposer6.updateRememberedValue(rememberedValue3);
                    }
                    LocalHomeViewKt.LocalHomeView(SuspendingPointerInputFilterKt.pointerInput(companion, unit, (PointerInputEventHandler) rememberedValue3), localHomeViewModel, function14, ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) state2.getValue()).enabled(), gapComposer6, 0);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                CheckoutTipSectionKt.m1307PaymentMethodItemG3d1Xqg((LocalCheckoutPaymentMethodViewModel) obj5, (String) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                CurbsidePickupCarSheetKt.VehicleChipSection((String) obj4, (Modifier) obj5, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(385));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                LocalBrandLocationCheckoutViewKt.CurbsidePickupInfoSection((Modifier) obj5, (LocalBrandLocationCheckoutViewModel.CurbsidePickupSection) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                LocalCaloriesTextKt.LocalDietaryPreferencesSection((Modifier) obj5, (List) obj4, (List) obj3, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                LocalCaloriesTextKt.ComboSlotSection((Modifier) obj5, (LocalMenuComboDetailsViewModel.ComboSlot) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                LocalCaloriesTextKt.m1311SelectFromListOptionSyki4yk((String) obj5, (LocalMenuItemDetailsViewModel.ItemModifier.SelectFromList.Option) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                LocalCaloriesTextKt.ItemModifier((Modifier) obj5, (LocalMenuItemDetailsViewModel.ItemModifier) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                LocalBrandLocationRowKt.LocalBrandLocationAddressView((Modifier) obj5, (LocalBrandLocationAddressContentModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                LocalBrandLocationRowKt.LocalBrandLocationMapDecisionSheet((Modifier) obj5, (MapDecisionSheetModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                LocalBrandLocationRowKt.CategoryEntryRow((LocalBrandLocationMenuContentModel.Menu) obj5, (LocalBrandLocationMenuContentModel.Entry) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                LocalBrandLocationCartViewKt.FulfillmentSectionItem((LocalBrandLocationCartViewModel.Fulfillment) obj5, (List) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                LocalBrandLocationCartViewKt.AppliedCouponBannerView((AppliedCouponBanner) obj4, (Function0) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                LocalBrandLocationCartViewKt.OpenTabBannerView((Modifier) obj5, (LocalBrandLocationCartViewModel.OpenTabBanner) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                LocalAddBrandsViewKt.BrandCardGridItem((LocalAddBrandsViewModel.BrandCard) obj5, (Function0) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                LocalAddBrandsViewKt.LocalEditorialText((Modifier) obj5, (LocalEditorialText) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ MenuKt$$ExternalSyntheticLambda1(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ MenuKt$$ExternalSyntheticLambda1(TableQrCodeScannerViewModel tableQrCodeScannerViewModel, Function1 function1, Modifier modifier) {
        this.$r8$classId = 13;
        this.f$1 = tableQrCodeScannerViewModel;
        this.f$2 = function1;
        this.f$0 = modifier;
    }

    public /* synthetic */ MenuKt$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ MenuKt$$ExternalSyntheticLambda1(String str, Modifier modifier, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.$r8$classId = 16;
        this.f$1 = str;
        this.f$0 = modifier;
        this.f$2 = composableLambdaImpl;
    }
}
