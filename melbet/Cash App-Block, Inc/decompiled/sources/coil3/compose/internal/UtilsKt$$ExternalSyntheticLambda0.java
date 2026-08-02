package coil3.compose.internal;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.pager.DefaultPagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Latch$await$2$2;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.StateListIterator;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.spatial.RelativeLayoutBounds;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1;
import androidx.core.view.insets.SystemBarStateMonitor;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.local.primitives.LocationMenu$$ExternalSyntheticLambda6;
import app.cash.local.sharedui.LocalLoadingOverlay;
import app.cash.local.viewmodels.LocalBrandProfileViewEvent;
import app.cash.local.viewmodels.home.LocalHomeGeoViewModel;
import app.cash.local.viewmodels.sheet.EducationalButtonAction;
import app.cash.local.viewmodels.sheet.EducationalSheetEvent;
import app.cash.local.viewmodels.sheet.EducationalSheetModelList;
import app.cash.local.views.wallet.TabContentViewKt$SegmentedTabContent$3$1$1$1;
import app.cash.sqldelight.TransactionWrapper;
import app.cash.sqldelight.driver.android.AndroidStatement;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.Extras;
import coil3.RealImageLoader;
import coil3.compose.AsyncImagePainter;
import coil3.network.NetworkFetcher$fetch$2;
import coil3.request.ErrorResult;
import coil3.request.NullRequestDataException;
import com.braze.BrazeUser;
import com.braze.enums.Month;
import com.braze.ui.UserJavascriptInterfaceBase;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapView;
import com.google.maps.android.compose.CameraPositionState;
import com.google.maps.android.compose.MapLifecycleEventObserver;
import com.google.maps.android.compose.MapTagData;
import com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda2;
import com.squareup.cardcustomizations.stampview.FadingStamp;
import com.squareup.cardcustomizations.stampview.PatternStampState;
import com.squareup.cardcustomizations.stampview.StampState;
import com.squareup.cardcustomizations.stampview.TransformedStamp;
import com.squareup.cash.account.components.accountswitcher.AnimationPhase;
import com.squareup.cash.account.presenters.EditProfilePresenter$models$2$1;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewModel;
import com.squareup.cash.activity.presenters.PaymentHistoryActivityItemPresenter;
import com.squareup.cash.activity.viewmodels.ActivityItemViewEvent;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.activity.views.SectionHeaderScope;
import com.squareup.cash.advertising.views.FullscreenAdView;
import com.squareup.cash.afterpayapplet.presenters.OrderItemPresenter;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpaySearchViewModel;
import com.squareup.cash.amountchooser.views.AmountKeypadState;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.components.FilterBarChipType;
import com.squareup.cash.arcade.components.FilterBarScope;
import com.squareup.cash.arcade.components.ScaffoldState;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.badging.db.BadgeQueries$ClearQuery;
import com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewEvent;
import com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel;
import com.squareup.cash.borrow.views.FirstTimeBorrowKt$$ExternalSyntheticLambda2;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda0;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db.EnumListAdapter;
import com.squareup.cash.dialog.ComposeDialogKt$Modal$lambda$2$0$0$$inlined$onDispose$1;
import com.squareup.cash.directory_ui.views.SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3;
import com.squareup.cash.directory_ui.views.SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$4;
import com.squareup.cash.maps.viewmodels.CashMapViewEvent;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.nearby.views.PulsingState$$ExternalSyntheticLambda1;
import com.squareup.cash.overlays.OverlayLayer;
import com.squareup.cash.overlays.OverlaysKt;
import com.squareup.cash.score.views.ScoreUiFactory$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.sheet.RealSheetState$peek$3;
import com.squareup.cash.treehouse.android.platform.CashTreehouseLayout;
import com.squareup.cash.ui.widget.amount.AmountEvent;
import com.squareup.cash.ui.widget.keypad.KeypadViewModel;
import com.squareup.protos.cash.badging.api.ItemType;
import com.squareup.protos.cash.local.client.v1.SchedulingDay;
import com.squareup.wire.GrpcMethod;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.asn1.cmc.BodyPartID;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final /* synthetic */ class UtilsKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ UtilsKt$$ExternalSyntheticLambda0(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.squareup.cash.overlays.OverlayLayer$Session] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r13v11, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r1v31, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22, types: [android.content.ComponentCallbacks, com.google.maps.android.compose.GoogleMapKt$GoogleMap$4$1$1$componentCallbacks$1] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        OverlayLayer overlayLayerOrNull;
        Unit dateOfBirth$lambda$3;
        Unit customLocationAttribute$lambda$2;
        float height;
        int i = this.$r8$classId;
        int i2 = 6;
        int i3 = 4;
        int i4 = 2;
        int i5 = 3;
        ?? r10 = 0;
        r10 = 0;
        final int i6 = 1;
        Object obj2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                Painter painter = (Painter) obj4;
                Painter painter2 = (Painter) obj3;
                Painter painter3 = (Painter) obj2;
                AsyncImagePainter.State state = (AsyncImagePainter.State) obj;
                if (state instanceof AsyncImagePainter.State.Loading) {
                    return painter != null ? new AsyncImagePainter.State.Loading(painter) : (AsyncImagePainter.State.Loading) state;
                }
                if (!(state instanceof AsyncImagePainter.State.Error)) {
                    return state;
                }
                AsyncImagePainter.State.Error error = (AsyncImagePainter.State.Error) state;
                ErrorResult errorResult = error.result;
                return errorResult.throwable instanceof NullRequestDataException ? painter2 != null ? new AsyncImagePainter.State.Error(painter2, errorResult) : error : painter3 != null ? new AsyncImagePainter.State.Error(painter3, errorResult) : error;
            case 1:
                Context context = (Context) obj4;
                LocalLoadingOverlay localLoadingOverlay = (LocalLoadingOverlay) obj3;
                ((DisposableEffectScope) obj).getClass();
                if (((Boolean) ((State) obj2).getValue()).booleanValue() && (overlayLayerOrNull = OverlaysKt.getOverlayLayerOrNull(context)) != null) {
                    r10 = overlayLayerOrNull.show(localLoadingOverlay);
                }
                return new ComposeDialogKt$Modal$lambda$2$0$0$$inlined$onDispose$1(r10, 1);
            case 2:
                List list = (List) obj4;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                lazyListScope.items(list.size(), new Latch$await$2$2(12, new LocationMenu$$ExternalSyntheticLambda6(21), list), new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3(list, i3), new ComposableLambdaImpl(new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$4(list, (SchedulingDay) obj3, (Function1) obj2, i5), true, 802480018));
                return Unit.INSTANCE;
            case 3:
                CoroutineScope coroutineScope = (CoroutineScope) obj4;
                UiCallbackModel uiCallbackModel = (UiCallbackModel) obj3;
                RealSheetState realSheetState = (RealSheetState) obj2;
                LocalBrandProfileViewEvent localBrandProfileViewEvent = (LocalBrandProfileViewEvent) obj;
                localBrandProfileViewEvent.getClass();
                if (localBrandProfileViewEvent.equals(LocalBrandProfileViewEvent.BackClicked.INSTANCE)) {
                    JobKt.launch$default(coroutineScope, null, null, new RealSheetState$peek$3(realSheetState, r10, i5), 3);
                } else {
                    uiCallbackModel.onEvent.invoke(localBrandProfileViewEvent);
                }
                return Unit.INSTANCE;
            case 4:
                CoroutineScope coroutineScope2 = (CoroutineScope) obj4;
                UiCallbackModel uiCallbackModel2 = ((LocalHomeGeoViewModel) obj3).cashMapUiCallbackModel;
                RealSheetState realSheetState2 = (RealSheetState) obj2;
                CashMapViewEvent cashMapViewEvent = (CashMapViewEvent) obj;
                cashMapViewEvent.getClass();
                CashMapViewEvent.ClearSelectedLocation clearSelectedLocation = CashMapViewEvent.ClearSelectedLocation.INSTANCE;
                if (cashMapViewEvent.equals(clearSelectedLocation)) {
                    JobKt.launch$default(coroutineScope2, null, null, new RealSheetState$peek$3(realSheetState2, r10, i3), 3);
                } else if (cashMapViewEvent instanceof CashMapViewEvent.ClusterClicked) {
                    JobKt.launch$default(coroutineScope2, null, null, new RealSheetState$peek$3(realSheetState2, r10, 5), 3);
                    uiCallbackModel2.onEvent.invoke(clearSelectedLocation);
                }
                uiCallbackModel2.onEvent.invoke(cashMapViewEvent);
                return Unit.INSTANCE;
            case 5:
                Function1 function1 = (Function1) obj4;
                EducationalSheetModelList educationalSheetModelList = (EducationalSheetModelList) obj3;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj2;
                EducationalSheetEvent educationalSheetEvent = (EducationalSheetEvent) obj;
                educationalSheetEvent.getClass();
                if (!(educationalSheetEvent instanceof EducationalSheetEvent.ButtonTap)) {
                    function1.invoke(educationalSheetEvent);
                } else if (Intrinsics.areEqual(((EducationalSheetEvent.ButtonTap) educationalSheetEvent).action, EducationalButtonAction.Paginate.INSTANCE)) {
                    if (parcelableSnapshotMutableIntState.getIntValue() == educationalSheetModelList.sheets.size() - 1) {
                        Timber.Forest.w("Selected page out of bounds for " + educationalSheetModelList, new Object[0]);
                    } else {
                        NavAction$$ExternalSyntheticOutline0.m(1, parcelableSnapshotMutableIntState);
                    }
                    function1.invoke(educationalSheetEvent);
                } else {
                    function1.invoke(educationalSheetEvent);
                }
                return Unit.INSTANCE;
            case 6:
                CoroutineScope coroutineScope3 = (CoroutineScope) obj4;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) obj3;
                DefaultPagerState defaultPagerState = (DefaultPagerState) obj2;
                int intValue = ((Integer) obj).intValue();
                if (intValue != parcelableSnapshotMutableIntState2.getIntValue()) {
                    parcelableSnapshotMutableIntState2.setIntValue(intValue);
                    JobKt.launch$default(coroutineScope3, null, null, new TabContentViewKt$SegmentedTabContent$3$1$1$1(defaultPagerState, intValue, r10, r11), 3);
                }
                return Unit.INSTANCE;
            case 7:
                Function1 function12 = (Function1) obj4;
                Function1 function13 = (Function1) obj3;
                Function1 function14 = (Function1) obj2;
                AsyncImagePainter.State state2 = (AsyncImagePainter.State) obj;
                if (state2 instanceof AsyncImagePainter.State.Loading) {
                    if (function12 != null) {
                        function12.invoke(state2);
                    }
                } else if (state2 instanceof AsyncImagePainter.State.Success) {
                    if (function13 != null) {
                        function13.invoke(state2);
                    }
                } else if (state2 instanceof AsyncImagePainter.State.Error) {
                    if (function14 != null) {
                        function14.invoke(state2);
                    }
                } else if (!(state2 instanceof AsyncImagePainter.State.Empty)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return Unit.INSTANCE;
            case 8:
                dateOfBirth$lambda$3 = UserJavascriptInterfaceBase.setDateOfBirth$lambda$3((Integer) obj4, (Month) obj3, (Integer) obj2, (BrazeUser) obj);
                return dateOfBirth$lambda$3;
            case 9:
                customLocationAttribute$lambda$2 = UserJavascriptInterfaceBase.setCustomLocationAttribute$lambda$2((String) obj4, (Double) obj3, (Double) obj2, (BrazeUser) obj);
                return customLocationAttribute$lambda$2;
            case 10:
                ?? r1 = (Context) obj;
                r1.getClass();
                GoogleMapOptions googleMapOptions = (GoogleMapOptions) ((Function0) obj4).invoke();
                ((CameraPositionState) obj3).isLiteMode = Intrinsics.areEqual(googleMapOptions.zzl, Boolean.TRUE);
                final MapView mapView = (MapView) ((Function2) obj2).invoke(r1, googleMapOptions);
                ?? r2 = new ComponentCallbacks2() { // from class: com.google.maps.android.compose.GoogleMapKt$GoogleMap$4$1$1$componentCallbacks$1
                    @Override // android.content.ComponentCallbacks
                    public final void onConfigurationChanged(Configuration configuration) {
                        configuration.getClass();
                    }

                    @Override // android.content.ComponentCallbacks
                    public final void onLowMemory() {
                        MapView.this.onLowMemory();
                    }

                    @Override // android.content.ComponentCallbacks2
                    public final void onTrimMemory(int i7) {
                        MapView.this.onLowMemory();
                    }
                };
                r1.registerComponentCallbacks(r2);
                MapLifecycleEventObserver mapLifecycleEventObserver = new MapLifecycleEventObserver(mapView);
                mapView.setTag(new MapTagData(r2, mapLifecycleEventObserver));
                mapView.addOnAttachStateChangeListener(new SystemBarStateMonitor.AnonymousClass3(mapLifecycleEventObserver));
                return mapView;
            case 11:
                PatternStampState patternStampState = (PatternStampState) obj4;
                Paint paint = (Paint) obj3;
                Paint paint2 = (Paint) obj2;
                DrawScope drawScope = (DrawScope) obj;
                drawScope.getClass();
                patternStampState.getInvalidate$customizations();
                SnapshotStateList snapshotStateList = patternStampState.fadingStamps;
                Iterator it = patternStampState.getMovingStamps().iterator();
                while (it.hasNext()) {
                    TransformedStamp.draw$default((TransformedStamp) it.next(), drawScope.getDrawContext().getCanvas(), paint);
                }
                ListIterator listIterator = snapshotStateList.listIterator();
                while (true) {
                    StateListIterator stateListIterator = (StateListIterator) listIterator;
                    if (!stateListIterator.hasNext()) {
                        snapshotStateList.removeIf(new PulsingState$$ExternalSyntheticLambda1(i6, new MarkerKt$$ExternalSyntheticLambda2(18)));
                        if (!snapshotStateList.isEmpty()) {
                            patternStampState.invalidate$delegate.setValue(Integer.valueOf(patternStampState.getInvalidate$customizations() + 1));
                        }
                        AndroidPath androidPath = (AndroidPath) patternStampState.clipPath$delegate.getValue();
                        GrpcMethod drawContext = drawScope.getDrawContext();
                        long m3999getSizeNHjbRc = drawContext.m3999getSizeNHjbRc();
                        drawContext.getCanvas().save();
                        try {
                            ((Extras.Key) drawContext.path).m1434clipPathmtrdDE(androidPath, 1);
                            Iterator it2 = patternStampState.getStamps$customizations().iterator();
                            while (it2.hasNext()) {
                                TransformedStamp.draw$default((TransformedStamp) it2.next(), drawScope.getDrawContext().getCanvas(), paint2);
                            }
                            Iterator it3 = patternStampState.getMovingStamps().iterator();
                            while (it3.hasNext()) {
                                TransformedStamp.draw$default((TransformedStamp) it3.next(), drawScope.getDrawContext().getCanvas(), paint2);
                            }
                            Recorder$$ExternalSyntheticOutline2.m(drawContext, m3999getSizeNHjbRc);
                            return Unit.INSTANCE;
                        } catch (Throwable th) {
                            Recorder$$ExternalSyntheticOutline2.m(drawContext, m3999getSizeNHjbRc);
                            throw th;
                        }
                    }
                    FadingStamp fadingStamp = (FadingStamp) stateListIterator.next();
                    if (!fadingStamp.isComplete()) {
                        fadingStamp.draw(drawScope.getDrawContext().getCanvas());
                    }
                }
            case 12:
                StampState stampState = (StampState) obj4;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = stampState.strokeColor$delegate;
                Paint paint3 = (Paint) obj3;
                Paint paint4 = (Paint) obj2;
                DrawScope drawScope2 = (DrawScope) obj;
                drawScope2.getClass();
                stampState.getInvalidate$customizations();
                SnapshotStateList snapshotStateList2 = stampState.fadingStamps;
                TransformedStamp movingStamp = stampState.getMovingStamp();
                if (movingStamp != null) {
                    TransformedStamp.draw$default(movingStamp, drawScope2.getDrawContext().getCanvas(), paint3);
                }
                Iterator it4 = CollectionsKt.toMutableList((Collection) snapshotStateList2).iterator();
                while (it4.hasNext()) {
                    FadingStamp fadingStamp2 = (FadingStamp) it4.next();
                    if (fadingStamp2.isComplete()) {
                        snapshotStateList2.remove(fadingStamp2);
                    }
                    fadingStamp2.draw(drawScope2.getDrawContext().getCanvas());
                }
                if (!snapshotStateList2.isEmpty()) {
                    stampState.invalidate$delegate.setValue(Integer.valueOf(stampState.getInvalidate$customizations() + 1));
                }
                AndroidPath androidPath2 = (AndroidPath) stampState.clipPath$delegate.getValue();
                GrpcMethod drawContext2 = drawScope2.getDrawContext();
                long m3999getSizeNHjbRc2 = drawContext2.m3999getSizeNHjbRc();
                drawContext2.getCanvas().save();
                try {
                    ((Extras.Key) drawContext2.path).m1434clipPathmtrdDE(androidPath2, 1);
                    for (TransformedStamp transformedStamp : stampState.getStamps$customizations()) {
                        Canvas canvas = drawScope2.getDrawContext().getCanvas();
                        AndroidPaint androidPaint = (AndroidPaint) paint4;
                        androidPaint.m659setColor8_81llA(((Color) parcelableSnapshotMutableState.getValue()).value);
                        TransformedStamp.draw$default(transformedStamp, canvas, androidPaint);
                    }
                    TransformedStamp movingStamp2 = stampState.getMovingStamp();
                    if (movingStamp2 != null) {
                        Canvas canvas2 = drawScope2.getDrawContext().getCanvas();
                        AndroidPaint androidPaint2 = (AndroidPaint) paint4;
                        androidPaint2.m659setColor8_81llA(((Color) parcelableSnapshotMutableState.getValue()).value);
                        TransformedStamp.draw$default(movingStamp2, canvas2, androidPaint2);
                    }
                    Recorder$$ExternalSyntheticOutline2.m(drawContext2, m3999getSizeNHjbRc2);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    Recorder$$ExternalSyntheticOutline2.m(drawContext2, m3999getSizeNHjbRc2);
                    throw th2;
                }
            case 13:
                final AccountDocumentsViewModel accountDocumentsViewModel = (AccountDocumentsViewModel) obj4;
                Function1 function15 = (Function1) obj3;
                AccountDocumentsViewModel accountDocumentsViewModel2 = (AccountDocumentsViewModel) obj2;
                LazyListScope lazyListScope2 = (LazyListScope) obj;
                lazyListScope2.getClass();
                List list2 = accountDocumentsViewModel.documents;
                if (list2.isEmpty()) {
                    LazyListScope.item$default(lazyListScope2, null, null, new ComposableLambdaImpl(new Function3() { // from class: com.squareup.cash.account.components.AccountDocumentsViewKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            int i7 = r2;
                            AccountDocumentsViewModel accountDocumentsViewModel3 = accountDocumentsViewModel;
                            LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj5;
                            Composer composer = (Composer) obj6;
                            int intValue2 = ((Integer) obj7).intValue();
                            switch (i7) {
                                case 0:
                                    lazyItemScopeImpl.getClass();
                                    GapComposer gapComposer = (GapComposer) composer;
                                    if (gapComposer.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        AccountToDoKt.NoDocument(accountDocumentsViewModel3, null, gapComposer, 0);
                                    } else {
                                        gapComposer.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    lazyItemScopeImpl.getClass();
                                    GapComposer gapComposer2 = (GapComposer) composer;
                                    if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        AccountToDoKt.NoDocument(accountDocumentsViewModel3, null, gapComposer2, 0);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -1596540951), 3);
                }
                LazyListScope.items$default(lazyListScope2, list2.size(), null, new ComposableLambdaImpl(new FirstTimeBorrowKt$$ExternalSyntheticLambda2(accountDocumentsViewModel, function15, accountDocumentsViewModel2, i6), true, 1664570043), 6);
                if (list2.size() == 1 && (list2.get(0) instanceof AccountDocumentsViewModel.DocumentModel.BannerModel)) {
                    LazyListScope.item$default(lazyListScope2, null, null, new ComposableLambdaImpl(new Function3() { // from class: com.squareup.cash.account.components.AccountDocumentsViewKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            int i7 = i6;
                            AccountDocumentsViewModel accountDocumentsViewModel3 = accountDocumentsViewModel;
                            LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj5;
                            Composer composer = (Composer) obj6;
                            int intValue2 = ((Integer) obj7).intValue();
                            switch (i7) {
                                case 0:
                                    lazyItemScopeImpl.getClass();
                                    GapComposer gapComposer = (GapComposer) composer;
                                    if (gapComposer.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        AccountToDoKt.NoDocument(accountDocumentsViewModel3, null, gapComposer, 0);
                                    } else {
                                        gapComposer.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    lazyItemScopeImpl.getClass();
                                    GapComposer gapComposer2 = (GapComposer) composer;
                                    if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        AccountToDoKt.NoDocument(accountDocumentsViewModel3, null, gapComposer2, 0);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -1643547566), 3);
                }
                return Unit.INSTANCE;
            case 14:
                Animatable animatable = (Animatable) obj4;
                AbstractList abstractList = (AbstractList) obj3;
                DrawScope drawScope3 = (DrawScope) obj;
                drawScope3.getClass();
                int ordinal = ((AnimationPhase) ((MutableState) obj2).getValue()).ordinal();
                Painter.m761drawx_KDEd0$default((Painter) abstractList.get(ordinal != 0 ? ordinal != 1 ? abstractList.size() - 1 : RangesKt___RangesKt.coerceIn((int) (((Number) animatable.getValue()).floatValue() * (abstractList.size() - 1)), 0, abstractList.size() - 1) : 0), drawScope3, drawScope3.mo753getSizeNHjbRc(), RecyclerView.DECELERATION_RATE, null, 6, null);
                return Unit.INSTANCE;
            case 15:
                ActivityItemViewEvent activityItemViewEvent = (ActivityItemViewEvent) obj;
                activityItemViewEvent.getClass();
                JobKt.launch$default((CoroutineScope) obj4, null, null, new EditProfilePresenter$models$2$1(17, (MutableState) obj2, (PaymentHistoryActivityItemPresenter) obj3, activityItemViewEvent, (Continuation) null), 3);
                return Unit.INSTANCE;
            case 16:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                long positionInParent = ValueInsets.positionInParent(layoutCoordinates);
                float mo838getSizeYbymL2g = (int) (layoutCoordinates.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax);
                int i7 = (int) (positionInParent & BodyPartID.bodyIdMax);
                float coerceIn = RangesKt___RangesKt.coerceIn(Float.intBitsToFloat(i7), -mo838getSizeYbymL2g, mo838getSizeYbymL2g);
                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = (ParcelableSnapshotMutableFloatState) ((MutableFloatState) obj2);
                parcelableSnapshotMutableFloatState.setFloatValue(1.0f - RangesKt___RangesKt.coerceIn(Math.abs(coerceIn) / ((Density) obj4).mo236toPx0680j_4(32.0f), RecyclerView.DECELERATION_RATE, 1.0f));
                String str = ((SectionHeaderScope) obj3).entry.title;
                float floatValue = parcelableSnapshotMutableFloatState.getFloatValue();
                String m1038toStringimpl = Dp.m1038toStringimpl(coerceIn);
                String m1038toStringimpl2 = Dp.m1038toStringimpl(mo838getSizeYbymL2g);
                String m1038toStringimpl3 = Dp.m1038toStringimpl(Float.intBitsToFloat(i7));
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" Divider opacity: ");
                sb.append(floatValue);
                sb.append(", fromTop: ");
                sb.append(m1038toStringimpl);
                System.out.println((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, ", height: ", m1038toStringimpl2, ", position: ", m1038toStringimpl3));
                return Unit.INSTANCE;
            case 17:
                Context context2 = (Context) obj;
                context2.getClass();
                return new FullscreenAdView(context2, (RealImageLoader) obj4, new CashCardKt$$ExternalSyntheticLambda0(i4, (MutableState) obj2), (Flow) obj3);
            case 18:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindString(0, (String) obj4);
                androidStatement.bindLong(1, (Long) obj3);
                androidStatement.bindBoolean(2, (Boolean) obj2);
                return Unit.INSTANCE;
            case 19:
                ActivityItemViewModel activityItemViewModel = (ActivityItemViewModel) obj4;
                CoroutineScope coroutineScope4 = (CoroutineScope) obj3;
                OrderItemPresenter orderItemPresenter = (OrderItemPresenter) obj2;
                ActivityItemViewEvent activityItemViewEvent2 = (ActivityItemViewEvent) obj;
                activityItemViewEvent2.getClass();
                if (activityItemViewModel != null) {
                    JobKt.launch$default(coroutineScope4, null, null, new EditProfilePresenter$models$2$1(orderItemPresenter, activityItemViewModel, activityItemViewEvent2, (Continuation) null, 27), 3);
                }
                return Unit.INSTANCE;
            case 20:
                SearchBarKeyboardState searchBarKeyboardState = (SearchBarKeyboardState) obj3;
                Function1 function16 = (Function1) obj2;
                FilterBarScope filterBarScope = (FilterBarScope) obj;
                filterBarScope.getClass();
                for (AfterpaySearchViewModel.FilterPillViewModel filterPillViewModel : (List) obj4) {
                    FilterBarScope.legacyChip$default(filterBarScope, new CopyCodeKt$$ExternalSyntheticLambda4(i3, searchBarKeyboardState, function16, filterPillViewModel), null, false, filterPillViewModel.selected, filterPillViewModel.f1044type == AfterpaySearchViewModel.FilterPillViewModel.Type.SHEET ? FilterBarChipType.Dropdown : FilterBarChipType.Button, filterPillViewModel.text, new ComposableLambdaImpl(new ScoreUiFactory$$ExternalSyntheticLambda0(filterPillViewModel, i2), true, -538557548), 6);
                }
                return Unit.INSTANCE;
            case 21:
                MutableState mutableState = (MutableState) obj4;
                AmountKeypadState amountKeypadState = (AmountKeypadState) obj3;
                MutableState mutableState2 = (MutableState) obj2;
                AmountEvent amountEvent = (AmountEvent) obj;
                amountEvent.getClass();
                if (amountEvent instanceof AmountEvent.AmountChanged) {
                    ((Function1) mutableState.getValue()).invoke(((AmountEvent.AmountChanged) amountEvent).rawAmount);
                } else {
                    if (!(amountEvent instanceof AmountEvent.InvalidChange)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    amountKeypadState.shake();
                    Function0 function0 = (Function0) mutableState2.getValue();
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
                return Unit.INSTANCE;
            case 22:
                CashTreehouseLayout cashTreehouseLayout = (CashTreehouseLayout) obj4;
                ((DisposableEffectScope) obj).getClass();
                CashTreehouseLayout.setContent$default(cashTreehouseLayout, (String) obj3, (BetterNavigator.ScreenNavigator) obj2, null, 4, null);
                return new AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1(cashTreehouseLayout, 17);
            case 23:
                ScaffoldState scaffoldState = (ScaffoldState) obj4;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3 = (ParcelableSnapshotMutableIntState) obj3;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState4 = (ParcelableSnapshotMutableIntState) obj2;
                RelativeLayoutBounds relativeLayoutBounds = (RelativeLayoutBounds) obj;
                relativeLayoutBounds.getClass();
                long j = relativeLayoutBounds.topLeft;
                RelativeLayoutBounds relativeLayoutBounds2 = (RelativeLayoutBounds) ((ParcelableSnapshotMutableState) scaffoldState.contentViewPort.this$0).getValue();
                if (relativeLayoutBounds2 == null) {
                    return Unit.INSTANCE;
                }
                int i8 = (int) (relativeLayoutBounds2.topLeft & BodyPartID.bodyIdMax);
                int i9 = (int) (j & BodyPartID.bodyIdMax);
                int intValue2 = (parcelableSnapshotMutableIntState4.getIntValue() + i9) - (parcelableSnapshotMutableIntState3.getIntValue() + i9);
                if (intValue2 <= 0) {
                    return Unit.INSTANCE;
                }
                scaffoldState.titleBarVisibility$delegate.setFloatValue(RangesKt___RangesKt.coerceIn(((RangesKt___RangesKt.coerceIn(i8 - r2, 0, intValue2) / intValue2) - 0.4f) / 0.6f, RecyclerView.DECELERATION_RATE, 1.0f));
                return Unit.INSTANCE;
            case 24:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj4;
                Function0 function02 = (Function0) obj3;
                Function1 function17 = (Function1) obj2;
                KeypadViewModel.KeypadKey keypadKey = (KeypadViewModel.KeypadKey) obj;
                keypadKey.getClass();
                if (keypadKey.isClear()) {
                    if (ref$BooleanRef.element) {
                        ref$BooleanRef.element = false;
                    } else {
                        function02.invoke();
                    }
                } else if (keypadKey.isDigit()) {
                    ref$BooleanRef.element = false;
                    function17.invoke(Integer.valueOf(Integer.parseInt(keypadKey.value)));
                }
                return Unit.INSTANCE;
            case 25:
                Density density = (Density) obj4;
                MutableState mutableState3 = (MutableState) obj3;
                View view = (View) obj2;
                LayoutCoordinates layoutCoordinates2 = (LayoutCoordinates) obj;
                layoutCoordinates2.getClass();
                if (((Dp) mutableState3.getValue()) == null) {
                    float intBitsToFloat = Float.intBitsToFloat((int) (layoutCoordinates2.mo843localToWindowMKHz9U(0L) & BodyPartID.bodyIdMax));
                    int[] iArr = new int[2];
                    Object obj5 = view.getParent();
                    while (true) {
                        if (obj5 instanceof View) {
                            View view2 = (View) obj5;
                            if (view2.isScrollContainer()) {
                                view2.getLocationInWindow(iArr);
                                height = (view2.getHeight() + iArr[1]) - view2.getPaddingBottom();
                            } else {
                                obj5 = view2.getParent();
                            }
                        } else {
                            height = view.getRootView().getHeight();
                        }
                    }
                    float f = height - intBitsToFloat;
                    if (f < RecyclerView.DECELERATION_RATE) {
                        f = 0.0f;
                    }
                    float mo232toDpu2uoSUM = density.mo232toDpu2uoSUM(f);
                    if (Dp.m1036compareTo0680j_4(mo232toDpu2uoSUM, RecyclerView.DECELERATION_RATE) > 0) {
                        mutableState3.setValue(new Dp(mo232toDpu2uoSUM));
                    }
                }
                return Unit.INSTANCE;
            case 26:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindString(0, (String) obj4);
                androidStatement2.bindString(1, (String) ((EnumListAdapter) ((LocalTabContentQueries) obj3).local_tab_contentAdapter).enumColumnAdapter.encode((ItemType) obj2));
                return Unit.INSTANCE;
            case 27:
                LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) obj4;
                BadgeQueries$ClearQuery badgeQueries$ClearQuery = (BadgeQueries$ClearQuery) obj3;
                Function1 function18 = (Function1) obj2;
                ((TransactionWrapper) obj).getClass();
                localTabContentQueries.driver.execute(null, re$$ExternalSyntheticOutline0.m("\n          |UPDATE badge\n          |SET cleared_at = ?,\n          |cleared_version = ?\n          |WHERE external_token = ?\n          |AND item_type = ?\n          |AND badge_version ", badgeQueries$ClearQuery.version == null ? "IS" : "=", " ?\n          "), new BadgeQueries$$ExternalSyntheticLambda0(13, badgeQueries$ClearQuery, localTabContentQueries));
                return localTabContentQueries.driver.executeQuery(456753002, "SELECT changes()", function18, 0, null);
            case 28:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.setTestTag(semanticsPropertyReceiver, "amountTextTag");
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, (String) obj4);
                SemanticsPropertiesKt.setText(semanticsPropertyReceiver, new AnnotatedString((String) ((AppletTile.AppletTileAppearance) obj3).obfuscationMask.invoke(((BalanceAppletTileViewModel.Loaded.Default) ((BalanceAppletTileViewModel) obj2)).formattedBalance)));
                SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 1.0f);
                return Unit.INSTANCE;
            default:
                BalanceAppletTileViewEvent balanceAppletTileViewEvent = (BalanceAppletTileViewEvent) obj;
                balanceAppletTileViewEvent.getClass();
                ((RealHapticVibrator) obj4).vibrate(((Haptics) obj3).input.standard);
                ((NetworkFetcher$fetch$2) obj2).invoke(balanceAppletTileViewEvent);
                return Unit.INSTANCE;
        }
    }
}
