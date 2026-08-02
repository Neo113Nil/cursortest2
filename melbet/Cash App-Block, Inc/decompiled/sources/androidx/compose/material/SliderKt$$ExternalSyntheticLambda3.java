package androidx.compose.material;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.ContextThemeWrapper;
import android.widget.EditText;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.ThumbNode$$ExternalSyntheticLambda0;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterfaceUtils;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.screens.app.LocalSchedulingDayTimePickerScreen;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda6;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import app.cash.sqldelight.driver.android.AndroidStatement;
import app.cash.zipline.Call;
import app.cash.zipline.internal.bridge.InboundService;
import app.cash.zipline.internal.bridge.InboundService$callSuspending$cancelCallback$1;
import app.cash.zipline.internal.bridge.SuspendCallback;
import bo.app.n3$$ExternalSyntheticLambda0;
import coil3.intercept.EngineInterceptor$intercept$2;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.maps.MapView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.renderscript.ToolkitKt;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.maps.android.compose.MapClickListeners;
import com.google.maps.android.compose.MapUpdaterState;
import com.google.mlkit.vision.text.zzd;
import com.miteksystems.misnap.workflow.a.o;
import com.squareup.cardcustomizations.stampview.PatternStampState;
import com.squareup.cardcustomizations.stampview.StampState;
import com.squareup.cash.R;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpaySearchViewModel;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt$$ExternalSyntheticLambda16;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.autofillweb.api.AutofillWebField;
import com.squareup.cash.card.onboarding.CardStudioViewEvent;
import com.squareup.cash.card.onboarding.CardStudioViewModel;
import com.squareup.cash.card.onboarding.StampResult;
import com.squareup.cash.db.EnumListAdapter;
import com.squareup.cash.db.WireRepeatedAdapter;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda10;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda12;
import com.squareup.cash.dialog.ComposeDialogKt$Modal$3$1$1$dialog$1;
import com.squareup.cash.dialog.ComposeDialogKt$Modal$lambda$2$0$0$$inlined$onDispose$1;
import com.squareup.cash.dialog.MooncakeDialog;
import com.squareup.cash.family.familyhub.views.WalletMetrics;
import com.squareup.cash.overlays.OverlayLayer;
import com.squareup.cash.screens.RedactedParcelableStringMap;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.sheet.AnimatedCornerShape;
import com.squareup.cash.sheet.BasicShieetScope;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda3;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.shopping.autofill.screens.AutofillScreen;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter;
import com.squareup.cash.webview.android.WebViewUseCase;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.protos.cash.grantly.api.ShippingAddress;
import com.squareup.protos.cash.grantly.app.RetrieveDefaultShippingAddressResponse;
import com.squareup.protos.cash.registrar.api.StatementType;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.common.location.Phone;
import com.squareup.protos.franklin.common.Stamp;
import com.squareup.util.android.PhoneNumbers;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.ui.TextControllerImpl;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import com.stripe.android.uicore.elements.TextFieldState;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdPart$SideIdPart;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputConfirmationCodeComponent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.ranges.ClosedFloatRange;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes3.dex */
public final /* synthetic */ class SliderKt$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda3(SimpleTextFieldController simpleTextFieldController, Function1 function1, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        this.$r8$classId = 12;
        this.f$0 = simpleTextFieldController;
        this.f$1 = function1;
        this.f$4 = mutableState;
        this.f$2 = mutableState2;
        this.f$3 = mutableState3;
        this.f$5 = mutableState4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v15, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte[] bArr;
        Placeable.PlacementScope placementScope;
        String str;
        String str2;
        String str3;
        TextFieldState onValueChange;
        Context context;
        int i = this.$r8$classId;
        int i2 = 10;
        float f = RecyclerView.DECELERATION_RATE;
        int i3 = 3;
        Object obj2 = this.f$5;
        Object obj3 = this.f$4;
        Object obj4 = this.f$3;
        Object obj5 = this.f$2;
        Object obj6 = this.f$1;
        Object obj7 = this.f$0;
        switch (i) {
            case 0:
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj5;
                Ref$FloatRef ref$FloatRef2 = (Ref$FloatRef) obj4;
                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = (ParcelableSnapshotMutableFloatState) ((MutableFloatState) obj7);
                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState2 = (ParcelableSnapshotMutableFloatState) ((MutableFloatState) obj6);
                parcelableSnapshotMutableFloatState.setFloatValue(parcelableSnapshotMutableFloatState2.getFloatValue() + parcelableSnapshotMutableFloatState.getFloatValue() + ((Float) obj).floatValue());
                parcelableSnapshotMutableFloatState2.setFloatValue(RecyclerView.DECELERATION_RATE);
                float coerceIn = RangesKt___RangesKt.coerceIn(parcelableSnapshotMutableFloatState.getFloatValue(), ref$FloatRef.element, ref$FloatRef2.element);
                Function1 function1 = (Function1) ((MutableState) obj3).getValue();
                float f2 = ref$FloatRef.element;
                float f3 = ref$FloatRef2.element;
                ClosedFloatRange closedFloatRange = (ClosedFloatRange) ((ClosedFloatingPointRange) obj2);
                float f4 = closedFloatRange._start;
                float f5 = closedFloatRange._endInclusive;
                float f6 = f3 - f2;
                float f7 = f6 == RecyclerView.DECELERATION_RATE ? 0.0f : (coerceIn - f2) / f6;
                if (f7 >= RecyclerView.DECELERATION_RATE) {
                    f = f7;
                }
                if (f > 1.0f) {
                    f = 1.0f;
                }
                function1.invoke(Float.valueOf(TransactorKt.lerp(f4, f5, f)));
                return Unit.INSTANCE;
            case 1:
                AskedQuestion askedQuestion = (AskedQuestion) obj;
                askedQuestion.getClass();
                return new LocalSchedulingDayTimePickerScreen((BrandSpot) obj7, (String) obj6, PlatformKt.activeAccountTokenOrNull((SessionManager) obj5), (String) obj4, (ArrayList) obj3, (FulfillmentConfiguration) obj2, askedQuestion);
            case 2:
                InboundService inboundService = (InboundService) obj6;
                DeferredCoroutine deferredCoroutine = (DeferredCoroutine) obj5;
                SuspendCallback suspendCallback = (SuspendCallback) obj4;
                Call call = (Call) obj3;
                String str4 = ((InboundService$callSuspending$cancelCallback$1) obj7).passByReferenceName;
                if (str4 != null) {
                    inboundService.endpoint.remove(str4);
                }
                Throwable completionExceptionOrNull = deferredCoroutine.getCompletionExceptionOrNull();
                if (completionExceptionOrNull != null) {
                    Result.Companion companion = Result.Companion;
                    bArr = new Result.Failure(completionExceptionOrNull);
                } else {
                    bArr = ((Result) deferredCoroutine.getCompletedInternal$kotlinx_coroutines_core()).value;
                }
                byte[] bArr2 = bArr;
                if (!JobKt.isActive(inboundService.endpoint.scope)) {
                    return Unit.INSTANCE;
                }
                inboundService.endpoint.callCodec.h = new n3$$ExternalSyntheticLambda0(inboundService, call, bArr2, this.f$5, 15);
                Result.Companion companion2 = Result.Companion;
                boolean z = bArr2 instanceof Result.Failure;
                if (z) {
                    Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(bArr2);
                    m4120exceptionOrNullimpl.getClass();
                    suspendCallback.failure(m4120exceptionOrNullimpl);
                } else {
                    suspendCallback.success(z ? null : bArr2);
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineScope coroutineScope = (CoroutineScope) obj7;
                MapUpdaterState mapUpdaterState = (MapUpdaterState) obj6;
                CompositionContext compositionContext = (CompositionContext) obj5;
                MapClickListeners mapClickListeners = (MapClickListeners) obj4;
                MutableState mutableState = (MutableState) obj3;
                MutableState mutableState2 = (MutableState) obj2;
                MapView mapView = (MapView) obj;
                mapView.getClass();
                if (((Job) mutableState.getValue()) == null) {
                    Function2 function2 = (Function2) mutableState2.getValue();
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    mutableState.setValue(JobKt.launch(coroutineScope, MainDispatcherLoader.dispatcher, CoroutineStart.UNDISPATCHED, new EngineInterceptor$intercept$2(mapView, mapClickListeners, compositionContext, mapUpdaterState, function2, (Continuation) null, 10)));
                }
                return Unit.INSTANCE;
            case 4:
                LazyListState lazyListState = (LazyListState) obj6;
                Function1 function12 = (Function1) obj5;
                SearchBarKeyboardState searchBarKeyboardState = (SearchBarKeyboardState) obj4;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                LazyListScope.item$default(lazyListScope, null, null, new ComposableLambdaImpl(new LocalViewFactory$$ExternalSyntheticLambda6(21, lazyListState, (ParcelableSnapshotMutableIntState) obj3, (ParcelableSnapshotMutableIntState) obj2), true, -1735660628), 3);
                AfterpaySearchViewModel.BodyViewModel.ResultsViewModel resultsViewModel = (AfterpaySearchViewModel.BodyViewModel.ResultsViewModel) ((AfterpaySearchViewModel.BodyViewModel) obj7);
                AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.UpsellCardSectionViewModel upsellCardSectionViewModel = resultsViewModel.upsellCardSectionViewModel;
                int i4 = 23;
                if (upsellCardSectionViewModel != null) {
                    LazyListScope.item$default(lazyListScope, upsellCardSectionViewModel.id, null, new ComposableLambdaImpl(new BrandSheetViewKt$$ExternalSyntheticLambda1(i4, (Object) upsellCardSectionViewModel, (Object) function12), true, -834012247), 2);
                }
                AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.RecentlyViewedCarouselViewModel recentlyViewedCarouselViewModel = resultsViewModel.recentlyViewedCarouselViewModel;
                if (recentlyViewedCarouselViewModel != null) {
                    LazyListScope.item$default(lazyListScope, recentlyViewedCarouselViewModel.title, null, new ComposableLambdaImpl(new ComposeDialogKt$$ExternalSyntheticLambda12(lazyListState, recentlyViewedCarouselViewModel, function12, searchBarKeyboardState, 11), true, 1017421657), 2);
                }
                for (AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.SectionViewModel sectionViewModel : resultsViewModel.sections) {
                    LazyListScope.item$default(lazyListScope, sectionViewModel.id, null, new ComposableLambdaImpl(new LocalViewFactory$$ExternalSyntheticLambda6(i4, lazyListState, sectionViewModel, function12), true, 162465153), 2);
                    for (AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.RowViewModel rowViewModel : sectionViewModel.rowViewModels) {
                        SearchBarKeyboardState searchBarKeyboardState2 = searchBarKeyboardState;
                        searchBarKeyboardState = searchBarKeyboardState2;
                        LazyListScope.item$default(lazyListScope, rowViewModel.id, null, new ComposableLambdaImpl(new SwipeToDismissKt$$ExternalSyntheticLambda2(3, lazyListState, rowViewModel, sectionViewModel, searchBarKeyboardState2, function12), true, -1885034630), 2);
                    }
                    if (sectionViewModel.showFooterDivider) {
                        LazyListScope.item$default(lazyListScope, null, null, AfterpaySearchViewKt.lambda$682450118, 3);
                    }
                    LazyListScope.item$default(lazyListScope, null, null, AfterpaySearchViewKt.f131lambda$1116902550, 3);
                    i4 = 23;
                }
                AfterpaySearchViewModel.CategoryTilesSectionViewModel categoryTilesSectionViewModel = resultsViewModel.categoryTilesSectionViewModel;
                if (categoryTilesSectionViewModel != null) {
                    LazyListScope.item$default(lazyListScope, categoryTilesSectionViewModel.id, null, new ComposableLambdaImpl(new LocalViewFactory$$ExternalSyntheticLambda6(22, lazyListState, categoryTilesSectionViewModel, function12), true, 1839879156), 2);
                }
                if (resultsViewModel.updateInProgress) {
                    LazyListScope.item$default(lazyListScope, null, null, new ComposableLambdaImpl(new AfterpaySearchViewKt$$ExternalSyntheticLambda16(r8), true, 1215972977), 3);
                }
                return Unit.INSTANCE;
            case 5:
                PatternStampState patternStampState = (PatternStampState) obj6;
                Function1 function13 = (Function1) obj5;
                StampState stampState = (StampState) obj4;
                MutableState mutableState3 = (MutableState) obj3;
                MutableState mutableState4 = (MutableState) obj2;
                StampResult stampResult = (StampResult) obj;
                stampResult.getClass();
                CardStudioViewModel.CustomizationMode customizationMode = ((CardStudioViewModel.Content) obj7).customizationMode instanceof CardStudioViewModel.CustomizationMode.Pattern ? CardStudioViewModel.CustomizationMode.Pattern.STAMP.INSTANCE : CardStudioViewModel.CustomizationMode.STAMP.INSTANCE;
                Collection collection = stampResult.svgStamps;
                if (collection == null) {
                    collection = EmptyList.INSTANCE;
                }
                if (!collection.isEmpty()) {
                    if (customizationMode instanceof CardStudioViewModel.CustomizationMode.Pattern) {
                        ArrayList arrayList = new ArrayList();
                        Collection<Stamp> collection2 = collection;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection2, 10));
                        for (Stamp stamp : collection2) {
                            Integer num = stamp.min_scale;
                            num.getClass();
                            arrayList.add(num);
                            String str5 = stamp.name;
                            str5.getClass();
                            String str6 = stamp.svg;
                            str6.getClass();
                            arrayList2.add(new com.squareup.cardcustomizations.stampview.Stamp(str5, str6));
                        }
                        patternStampState.originalStamps$delegate.setValue(arrayList2);
                        patternStampState.originalMinScales$delegate.setValue(arrayList);
                        if (patternStampState.boxWidth$delegate.getIntValue() > 0 && patternStampState.boxHeight$delegate.getIntValue() > 0) {
                            patternStampState.generateStampsFromOriginals();
                        }
                    } else {
                        for (Object obj8 : CollectionsKt.reversed(collection)) {
                            int i5 = r8 + 1;
                            if (r8 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                                throw null;
                            }
                            Stamp stamp2 = (Stamp) obj8;
                            String str7 = stamp2.name;
                            str7.getClass();
                            String str8 = stamp2.svg;
                            str8.getClass();
                            com.squareup.cardcustomizations.stampview.Stamp stamp3 = new com.squareup.cardcustomizations.stampview.Stamp(str7, str8);
                            Integer num2 = stamp2.min_scale;
                            num2.getClass();
                            int intValue = num2.intValue();
                            PointF pointF = (PointF) mutableState3.getValue();
                            PointF pointF2 = new PointF(((Number) mutableState4.getValue()).floatValue() * r8, RecyclerView.DECELERATION_RATE);
                            PointF pointF3 = new PointF(pointF.x, pointF.y);
                            pointF3.offset(-pointF2.x, -pointF2.y);
                            float f8 = pointF3.x;
                            stampState.addStamp(stamp3, new RectF(f8, pointF3.y, ((Number) mutableState4.getValue()).floatValue() + f8, ((Number) mutableState4.getValue()).floatValue() + pointF3.y), intValue);
                            r8 = i5;
                        }
                    }
                }
                function13.invoke(new CardStudioViewEvent.SetCustomizationMode(customizationMode));
                return Unit.INSTANCE;
            case 6:
                List list = (List) obj5;
                List list2 = (List) obj4;
                List list3 = (List) obj3;
                InstrumentQueries instrumentQueries = (InstrumentQueries) obj2;
                AndroidStatement androidStatement = (AndroidStatement) obj;
                Request$Priority$EnumUnboxingLocalUtility.m(androidStatement, 0, (String) obj7, 1, (String) obj6);
                androidStatement.bindBytes(2, list != null ? (byte[]) ((WireRepeatedAdapter) ((Instrument$Adapter) instrumentQueries.instrumentAdapter).cash_instrument_typeAdapter).encode(list) : null);
                androidStatement.bindBytes(3, list2 != null ? (byte[]) ((WireRepeatedAdapter) ((Instrument$Adapter) instrumentQueries.instrumentAdapter).card_brandAdapter).encode(list2) : null);
                androidStatement.bindBytes(4, list3 != null ? (byte[]) ((WireRepeatedAdapter) ((Instrument$Adapter) instrumentQueries.instrumentAdapter).balance_currencyAdapter).encode(list3) : null);
                return Unit.INSTANCE;
            case 7:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindString(0, (String) obj7);
                androidStatement2.bindBoolean(1, (Boolean) obj6);
                androidStatement2.bindString(2, (String) obj5);
                androidStatement2.bindString(3, (String) ((EnumListAdapter) ((InstrumentQueries) obj4).instrumentAdapter).enumColumnAdapter.encode((StatementType) obj3));
                androidStatement2.bindBoolean(4, (Boolean) obj2);
                return Unit.INSTANCE;
            case 8:
                Context context2 = (Context) obj7;
                ((DisposableEffectScope) obj).getClass();
                ComposeDialogKt$Modal$3$1$1$dialog$1 composeDialogKt$Modal$3$1$1$dialog$1 = new ComposeDialogKt$Modal$3$1$1$dialog$1(context2, (ComposableLambdaImpl) obj5, (MutableState) obj3, (Function0) obj4, 1);
                context2.getClass();
                MooncakeDialog mooncakeDialog = new MooncakeDialog(new ContextThemeWrapper(context2, R.style.Theme_Cash_Dialog));
                mooncakeDialog.content.addView(composeDialogKt$Modal$3$1$1$dialog$1);
                mooncakeDialog.setOnClickOutsideListener(new ComposeDialogKt$$ExternalSyntheticLambda10(18, (Function0) obj2));
                return new ComposeDialogKt$Modal$lambda$2$0$0$$inlined$onDispose$1(((OverlayLayer) obj6).show(mooncakeDialog), 2);
            case 9:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope.getClass();
                reusableGraphicsLayerScope.setTranslationX(((Number) ((Animatable) obj6).getValue()).floatValue() + ((WalletMetrics) obj7).dollarOffsetXPx);
                reusableGraphicsLayerScope.setTranslationY(((Number) ((Animatable) obj4).getValue()).floatValue() + ((Number) ((Animatable) obj5).getValue()).floatValue());
                reusableGraphicsLayerScope.setAlpha(((Number) ((Animatable) obj3).getValue()).floatValue());
                reusableGraphicsLayerScope.setRotationZ(((Number) ((Animatable) obj2).getValue()).floatValue());
                return Unit.INSTANCE;
            case 10:
                BasicShieetScope basicShieetScope = (BasicShieetScope) obj7;
                Placeable placeable = (Placeable) obj6;
                Placeable placeable2 = (Placeable) obj5;
                Placeable placeable3 = (Placeable) obj4;
                AnimatedCornerShape animatedCornerShape = (AnimatedCornerShape) obj3;
                Density density = (Density) obj2;
                Placeable.PlacementScope placementScope2 = (Placeable.PlacementScope) obj;
                placementScope2.getClass();
                RealSheetState realSheetState = basicShieetScope.state;
                float floatValue = ((Number) realSheetState.expandedContentProgress$delegate.getValue()).floatValue();
                if (floatValue > RecyclerView.DECELERATION_RATE) {
                    Placeable.PlacementScope.m854place70tqf50$default(placementScope2, placeable, 0L);
                    placementScope = placementScope2;
                    Placeable.PlacementScope.m856placeWithLayeraW9wM$default(placementScope, placeable2, 0L, new ThumbNode$$ExternalSyntheticLambda0(animatedCornerShape, density, floatValue, i2), 2);
                } else {
                    placementScope = placementScope2;
                }
                if (placeable3 != null && realSheetState.getCollapsedContentProgress() > RecyclerView.DECELERATION_RATE) {
                    Placeable.PlacementScope.m856placeWithLayeraW9wM$default(placementScope, placeable3, 0L, new BasicShieetScope$$ExternalSyntheticLambda3(basicShieetScope, i3), 2);
                }
                return Unit.INSTANCE;
            case 11:
                ShoppingWebPresenter shoppingWebPresenter = (ShoppingWebPresenter) obj7;
                WebViewUseCase webViewUseCase = (WebViewUseCase) obj6;
                String str9 = (String) obj5;
                MutableState mutableState5 = (MutableState) obj4;
                MutableState mutableState6 = (MutableState) obj2;
                AskedQuestion askedQuestion2 = (AskedQuestion) obj;
                Set set = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                RedactedString redactedString = (((Boolean) ((MutableState) obj3).getValue()).booleanValue() && ExifInterfaceUtils.isVersion2WithCorrectMetadata(shoppingWebPresenter.args, WebViewUseCase.AFFILIATE)) ? new RedactedString(((ShoppingWebPresenter.State) mutableState5.getValue()).cardState.lastFourDigits) : new RedactedString(null);
                RetrieveDefaultShippingAddressResponse retrieveDefaultShippingAddressResponse = (RetrieveDefaultShippingAddressResponse) mutableState6.getValue();
                retrieveDefaultShippingAddressResponse.getClass();
                HashMap hashMap = new HashMap();
                ShippingAddress shippingAddress = retrieveDefaultShippingAddressResponse.shipping_address;
                if (shippingAddress != null) {
                    FullName fullName = shippingAddress.full_name;
                    if (fullName != null) {
                        String str10 = fullName.given_name;
                        if (str10 != null) {
                            zzd zzdVar = AutofillWebField.Companion;
                            hashMap.put("PersonalDetails.FirstName", str10);
                        }
                        String str11 = fullName.family_name;
                        if (str11 != null) {
                            zzd zzdVar2 = AutofillWebField.Companion;
                            hashMap.put("PersonalDetails.LastName", str11);
                        }
                    }
                    String str12 = shippingAddress.email;
                    if (str12 != null) {
                        zzd zzdVar3 = AutofillWebField.Companion;
                        hashMap.put("ContactDetails.Emails.Email.Address", str12);
                    }
                    Phone phone = shippingAddress.phone;
                    if (phone != null && (str = phone.number) != null) {
                        String str13 = phone.calling_code;
                        if (str13 != null) {
                            StringBuilder sb = new StringBuilder();
                            int length = str13.length();
                            while (r8 < length) {
                                char charAt = str13.charAt(r8);
                                if (Character.isDigit(charAt)) {
                                    sb.append(charAt);
                                }
                                r8++;
                            }
                            str2 = sb.toString();
                        } else {
                            str2 = null;
                        }
                        if (str2 == null || str2.length() == 0) {
                            str3 = "US";
                        } else {
                            str3 = PhoneNumberUtil.getInstance().getRegionCodeForCountryCode(Integer.parseInt(str2));
                            str3.getClass();
                        }
                        zzd zzdVar4 = AutofillWebField.Companion;
                        String format2 = PhoneNumbers.format(str, str3, null);
                        if (format2 != null) {
                            str = format2;
                        }
                        hashMap.put("ContactDetails.CellPhones.CellPhone.Number", str);
                    }
                    GlobalAddress globalAddress = shippingAddress.global_address;
                    if (globalAddress != null) {
                        String str14 = globalAddress.address_line_1;
                        if (str14 != null) {
                            zzd zzdVar5 = AutofillWebField.Companion;
                            hashMap.put("AddressDetails.PostalAddress.AddressLine1", str14);
                        }
                        String str15 = globalAddress.address_line_2;
                        if (str15 != null) {
                            zzd zzdVar6 = AutofillWebField.Companion;
                            hashMap.put("AddressDetails.PostalAddress.AddressLine2", str15);
                        }
                        String str16 = globalAddress.postal_code;
                        if (str16 != null) {
                            zzd zzdVar7 = AutofillWebField.Companion;
                            hashMap.put("AddressDetails.PostalAddress.PostalCode", str16);
                        }
                        String str17 = globalAddress.locality;
                        if (str17 != null) {
                            zzd zzdVar8 = AutofillWebField.Companion;
                            hashMap.put("AddressDetails.PostalAddress.Suburb", str17);
                        }
                        String str18 = globalAddress.administrative_district_level_1;
                        if (str18 != null) {
                            zzd zzdVar9 = AutofillWebField.Companion;
                            hashMap.put("AddressDetails.PostalAddress.AdministrativeArea", str18);
                        }
                    }
                }
                return new AutofillScreen.OfferAutofillScreen(webViewUseCase, str9, redactedString, new RedactedParcelableStringMap(hashMap), shoppingWebPresenter.autofillAnalyticsParam, askedQuestion2);
            case 12:
                SimpleTextFieldController simpleTextFieldController = (SimpleTextFieldController) obj7;
                Function1 function14 = (Function1) obj6;
                MutableState mutableState7 = (MutableState) obj5;
                MutableState mutableState8 = (MutableState) obj4;
                MutableState mutableState9 = (MutableState) obj2;
                TextFieldValue textFieldValue = (TextFieldValue) obj;
                textFieldValue.getClass();
                String str19 = textFieldValue.annotatedString.text;
                TextFieldState textFieldState = (TextFieldState) ((MutableState) obj3).getValue();
                String str20 = (String) mutableState7.getValue();
                textFieldState.getClass();
                str20.getClass();
                str19.getClass();
                r8 = (!textFieldState.isFull() || str19.length() <= str20.length()) ? 1 : 0;
                if (str19.equals((String) mutableState7.getValue()) || r8 != 0) {
                    mutableState8.setValue(new TextRange(textFieldValue.selection));
                    mutableState9.setValue(textFieldValue.composition);
                }
                if (r8 != 0 && (onValueChange = simpleTextFieldController.onValueChange(str19)) != null) {
                    function14.invoke(onValueChange);
                }
                return Unit.INSTANCE;
            case 13:
                GovernmentIdState governmentIdState = (GovernmentIdState) obj7;
                IdPart$SideIdPart idPart$SideIdPart = (IdPart$SideIdPart) obj6;
                IdConfig idConfig = (IdConfig) obj5;
                GovernmentId.GovernmentIdImage governmentIdImage = (GovernmentId.GovernmentIdImage) obj4;
                CameraProperties cameraProperties = (CameraProperties) obj3;
                Integer num3 = (Integer) obj2;
                WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
                updater.getClass();
                if (updater.state.getClass() != governmentIdState.getClass()) {
                    return Unit.INSTANCE;
                }
                updater.state = new GovernmentIdState.HolographicTorchDelay(idPart$SideIdPart, governmentIdState.getUploadingIds$government_id_release(), governmentIdState.getParts$government_id_release(), governmentIdState.getPartIndex$government_id_release(), governmentIdState.getBackState$government_id_release(), governmentIdState.getCountryCode$government_id_release(), idConfig, governmentIdImage, cameraProperties, num3.intValue());
                return Unit.INSTANCE;
            default:
                InputConfirmationCodeComponent inputConfirmationCodeComponent = (InputConfirmationCodeComponent) obj7;
                o oVar = (o) obj6;
                List list4 = (List) obj5;
                EditText editText = (EditText) obj4;
                EditText editText2 = (EditText) obj3;
                EditText editText3 = (EditText) obj2;
                String str21 = (String) obj;
                str21.getClass();
                TextControllerImpl textControllerImpl = inputConfirmationCodeComponent.textController;
                ConstraintLayout constraintLayout = (ConstraintLayout) oVar.a;
                TextInputLayout textInputLayout = (TextInputLayout) oVar.c;
                constraintLayout.getClass();
                textControllerImpl.setTextValue(ToolkitKt.getConfirmationCode(constraintLayout));
                if (str21.length() >= list4.size()) {
                    if (str21.length() >= list4.size()) {
                        int size = list4.size();
                        while (r8 < size) {
                            int length2 = (str21.length() - list4.size()) + r8;
                            EditText editText4 = (EditText) list4.get(r8);
                            if (editText4 != null) {
                                editText4.setText(String.valueOf(str21.charAt(length2)));
                            }
                            r8++;
                        }
                    }
                } else if (str21.length() > 1) {
                    if (editText.getSelectionStart() == 1) {
                        editText.setText(String.valueOf(StringsKt___StringsKt.first(str21)));
                    } else {
                        editText.setText(String.valueOf(StringsKt___StringsKt.last(str21)));
                    }
                } else if (StringsKt.isBlank(str21) && editText2 != null) {
                    editText2.requestFocus();
                    editText2.setSelection(editText2.length());
                } else if (!StringsKt.isBlank(str21) && editText3 != null) {
                    editText3.requestFocus();
                } else if (!StringsKt.isBlank(str21)) {
                    ((Function0) inputConfirmationCodeComponent.submitCodeHelper.a).invoke();
                    EditText editText5 = textInputLayout.editText;
                    if (editText5 != null && (context = editText5.getContext()) != null) {
                        ContextUtilsKt.hideKeyboard(context);
                    }
                    EditText editText6 = textInputLayout.editText;
                    if (editText6 != null) {
                        editText6.clearFocus();
                    }
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3, MutableState mutableState, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$4 = mutableState;
        this.f$3 = obj4;
        this.f$5 = obj5;
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
        this.f$5 = obj6;
    }
}
