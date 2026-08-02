package app.cash.redwood.treehouse;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.compose.foundation.pager.DefaultPagerState;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.core.view.ContentInfoCompat;
import androidx.paging.PagingSource;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.work.Data$$ExternalSyntheticLambda0;
import app.cash.badging.backend.RealBadger2$$ExternalSyntheticLambda0;
import app.cash.local.backend.CartBuilder;
import app.cash.local.backend.OpenTabCartOverride;
import app.cash.local.backend.real.RealCartBuilder;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.local.presenters.fulfillment.FulfillmentPickerPresenter;
import app.cash.local.presenters.fulfillment.FulfillmentPickerPresenter$models$4$1$WhenMappings;
import app.cash.local.presenters.fulfillment.FulfillmentPickerPresenter$models$5$1$WhenMappings;
import app.cash.local.presenters.pos.LocalPosLocalCashRedemptionPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.local.presenters.wallet.TabContentPresenter;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.FulfillmentConfigurationKt;
import app.cash.local.primitives.GlobalAddressWrapper;
import app.cash.local.store.real.RealLocalInstalledStore;
import app.cash.local.viewmodels.CurbsidePickupCarViewModel;
import app.cash.local.viewmodels.GiftCardInputState;
import app.cash.local.viewmodels.LocalBrandProfileViewEvent;
import app.cash.local.viewmodels.fulfillment.FulfillmentPickerViewEvent;
import app.cash.local.viewmodels.toasts.ToastData;
import app.cash.local.views.brand.orders.CameraViewport;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.Modifier$$ExternalSyntheticLambda0;
import app.cash.redwood.compose.HostFocusDirectorKt$depthFirst$1;
import app.cash.redwood.protocol.Event;
import app.cash.redwood.treehouse.CodeState;
import app.cash.redwood.treehouse.ViewState;
import app.cash.redwood.ui.core.api.FocusRequester;
import app.cash.redwood.widget.Widget;
import app.cash.sqldelight.Transacter;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.paging3.OffsetQueryPagingSource;
import app.cash.zipline.internal.bridge.CancelCallback;
import app.cash.zipline.internal.bridge.OutboundCallHandler;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.n3$$ExternalSyntheticLambda0;
import coil3.disk.DiskLruCache$launchCleanup$1;
import coil3.size.SizeKt;
import com.caverock.androidsvg.SVG;
import com.fillr.featuretoggle.UnleashContext;
import com.fillr.m1;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmd;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmz;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.maps.android.compose.CameraPositionState;
import com.plaid.internal.EnumC0170g;
import com.squareup.address.typeahead.backend.api.AddressState;
import com.squareup.address.typeahead.views.AddressTypeaheadState;
import com.squareup.cardcustomizations.signature.SignaturesKt$$ExternalSyntheticLambda1;
import com.squareup.cash.account.presenters.AccountPresenter;
import com.squareup.cash.bugreporting.viewmodels.DiagnosticContext;
import com.squareup.cash.cdf.app.AppNavigateOpenSpace;
import com.squareup.cash.cdf.localclient.FulfillmentInstanceType;
import com.squareup.cash.cdf.localclient.FulfillmentType;
import com.squareup.cash.cdf.localclient.FulfillmentVersion;
import com.squareup.cash.cdf.localclient.LocalClientFulfillmentFlowClickFulfillment;
import com.squareup.cash.cdf.localclient.LocalClientFulfillmentFlowConfirmFulfillment;
import com.squareup.cash.cdf.localclient.LocalClientInStoreRedemptionViewCheckInConfirmation;
import com.squareup.cash.cdf.localclient.LocalClientMapScroll;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.PublicProfile;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.maps.presenter.CashMapPresenter;
import com.squareup.cash.maps.viewmodels.CashMapViewEvent;
import com.squareup.cash.maps.viewmodels.CashMapViewModel;
import com.squareup.cash.maps.viewmodels.LatLng;
import com.squareup.cash.maps.viewmodels.LocationViewModel;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.protos.cash.local.client.app.v1.GetLocalCashDetailResponse;
import com.squareup.protos.cash.local.client.v1.GetBrandCollectionResponse;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.sequences.SequenceBuilderIterator;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.internal.WriteModeKt;
import okio.ByteString;
import okio.Okio;
import okio.RealBufferedSink;
import okio.Utf8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import papa.SafeTrace;
import radiography.Radiography$$ExternalSyntheticLambda0;
import radiography.ScannableView;
import radiography.ViewFilters;
import radiography.ViewFilters$$ExternalSyntheticLambda0;
import radiography.ViewStateRenderers;

/* loaded from: classes3.dex */
public final class EventBridge$sendEvent$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object $uiEvent;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EventBridge$sendEvent$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$uiEvent = obj;
        this.this$0 = obj2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                return new EventBridge$sendEvent$1((ContentInfoCompat.CompatImpl) this.$uiEvent, (SVG) obj2, continuation, 0);
            case 1:
                EventBridge$sendEvent$1 eventBridge$sendEvent$1 = new EventBridge$sendEvent$1((FulfillmentPickerPresenter) obj2, continuation, 1);
                eventBridge$sendEvent$1.$uiEvent = obj;
                return eventBridge$sendEvent$1;
            case 2:
                return new EventBridge$sendEvent$1((FulfillmentPickerPresenter) this.$uiEvent, (MutableState) obj2, continuation, 2);
            case 3:
                return new EventBridge$sendEvent$1((FulfillmentPickerPresenter) this.$uiEvent, (FulfillmentPickerViewEvent) obj2, continuation, 3);
            case 4:
                return new EventBridge$sendEvent$1((MutableSharedFlow) this.$uiEvent, (LocalBrandProfileViewEvent) obj2, continuation, 4);
            case 5:
                return new EventBridge$sendEvent$1((OpenTabCartOverride) this.$uiEvent, (CartBuilder) obj2, continuation, 5);
            case 6:
                return new EventBridge$sendEvent$1((MutableState) this.$uiEvent, (CashMapPresenter) obj2, continuation, 6);
            case 7:
                return new EventBridge$sendEvent$1((CashMapViewModel) this.$uiEvent, (LocalHomePresenter) obj2, continuation, 7);
            case 8:
                return new EventBridge$sendEvent$1((LocalPosLocalCashRedemptionPresenter) this.$uiEvent, (MutableState) obj2, continuation, 8);
            case 9:
                return new EventBridge$sendEvent$1((TabContentPresenter) this.$uiEvent, (MutableState) obj2, continuation, 9);
            case 10:
                return new EventBridge$sendEvent$1((RealLocalInstalledStore) this.$uiEvent, (GetBrandCollectionResponse) obj2, continuation, 10);
            case 11:
                return new EventBridge$sendEvent$1((RealLocalInstalledStore) this.$uiEvent, (GetLocalCashDetailResponse) obj2, continuation, 11);
            case 12:
                return new EventBridge$sendEvent$1((RealLocalInstalledStore) this.$uiEvent, (GetNeighborhoodsTabContentResponse) obj2, continuation, 12);
            case 13:
                return new EventBridge$sendEvent$1((GiftCardInputState) this.$uiEvent, (TextFieldState) obj2, continuation, 13);
            case 14:
                return new EventBridge$sendEvent$1((TextFieldState) this.$uiEvent, (CurbsidePickupCarViewModel) obj2, continuation, 14);
            case 15:
                return new EventBridge$sendEvent$1((CameraPositionState) this.$uiEvent, (CameraViewport) obj2, continuation, 15);
            case 16:
                return new EventBridge$sendEvent$1((AddressTypeaheadState) this.$uiEvent, (Function1) obj2, continuation, 16);
            case 17:
                return new EventBridge$sendEvent$1((ToastData) this.$uiEvent, (MutableState) obj2, continuation, 17);
            case 18:
                return new EventBridge$sendEvent$1((DefaultPagerState) this.$uiEvent, (ParcelableSnapshotMutableIntState) obj2, continuation, 18);
            case 19:
                return new EventBridge$sendEvent$1((RealTreehouseApp$codeHost$1) this.$uiEvent, (ZiplineCodeSession) obj2, continuation, 19);
            case 20:
                return new EventBridge$sendEvent$1((ZiplineCodeSession) this.$uiEvent, (Throwable) obj2, continuation, 20);
            case 21:
                return new EventBridge$sendEvent$1((ViewContentCodeBinding) this.$uiEvent, (FocusRequester) obj2, continuation, 21);
            case 22:
                return new EventBridge$sendEvent$1((ViewContentCodeBinding) this.$uiEvent, (ArrayList) obj2, continuation, 22);
            case 23:
                return new EventBridge$sendEvent$1((PagingSource.LoadParams) this.$uiEvent, (OffsetQueryPagingSource) obj2, continuation, 23);
            case 24:
                return new EventBridge$sendEvent$1((OutboundCallHandler.RealSuspendCallback) this.$uiEvent, (CancelCallback) obj2, continuation, 24);
            case 25:
                EventBridge$sendEvent$1 eventBridge$sendEvent$12 = new EventBridge$sendEvent$1((Map) obj2, continuation, 25);
                eventBridge$sendEvent$12.$uiEvent = obj;
                return eventBridge$sendEvent$12;
            case 26:
                return new EventBridge$sendEvent$1((zzmz) this.$uiEvent, (Context) obj2, continuation, 26);
            case 27:
                EventBridge$sendEvent$1 eventBridge$sendEvent$13 = new EventBridge$sendEvent$1((DiagnosticContext) obj2, continuation, 27);
                eventBridge$sendEvent$13.$uiEvent = obj;
                return eventBridge$sendEvent$13;
            case 28:
                return new EventBridge$sendEvent$1((MutableState) this.$uiEvent, (AccountPresenter) obj2, continuation, 28);
            default:
                EventBridge$sendEvent$1 eventBridge$sendEvent$14 = new EventBridge$sendEvent$1((AccountPresenter) obj2, continuation, 29);
                eventBridge$sendEvent$14.$uiEvent = obj;
                return eventBridge$sendEvent$14;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((EventBridge$sendEvent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((EventBridge$sendEvent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((EventBridge$sendEvent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((EventBridge$sendEvent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((EventBridge$sendEvent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((EventBridge$sendEvent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 6:
                return ((EventBridge$sendEvent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 7:
                return ((EventBridge$sendEvent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 8:
                return ((EventBridge$sendEvent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 9:
                return ((EventBridge$sendEvent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 10:
                return ((EventBridge$sendEvent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 11:
                return ((EventBridge$sendEvent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 12:
                return ((EventBridge$sendEvent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 13:
                return ((EventBridge$sendEvent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 14:
                return ((EventBridge$sendEvent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 15:
                return ((EventBridge$sendEvent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 16:
                return ((EventBridge$sendEvent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 17:
                return ((EventBridge$sendEvent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 18:
                return ((EventBridge$sendEvent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 19:
                return ((EventBridge$sendEvent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 20:
                return ((EventBridge$sendEvent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 21:
                return ((EventBridge$sendEvent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 22:
                return ((EventBridge$sendEvent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 23:
                return ((EventBridge$sendEvent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 24:
                return ((EventBridge$sendEvent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 25:
                return ((EventBridge$sendEvent$1) create((Map) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 26:
                return ((EventBridge$sendEvent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 27:
                return ((EventBridge$sendEvent$1) create((File) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 28:
                return ((EventBridge$sendEvent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((EventBridge$sendEvent$1) create((PublicProfile) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object, kotlin.collections.EmptyMap] */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Cloneable] */
    /* JADX WARN: Type inference failed for: r13v72, types: [androidx.compose.foundation.text.input.TextFieldState] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r6v17, types: [androidx.compose.foundation.text.input.TextFieldState] */
    /* JADX WARN: Type inference failed for: r6v21, types: [androidx.compose.runtime.MutableState, androidx.compose.runtime.State] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        FulfillmentType fulfillmentType;
        FulfillmentInstanceType fulfillmentInstanceType;
        String str;
        AddressState.Valid valid;
        String str2;
        m1 m1Var;
        StateFlow stateFlow;
        Object obj2;
        String sb;
        RealBufferedSink realBufferedSink;
        Looper mainLooper;
        View view;
        Handler handler;
        int i = this.$r8$classId;
        int i2 = 11;
        int i3 = 3;
        int i4 = 0;
        int i5 = 1;
        Widget widget = null;
        Object obj3 = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ContentInfoCompat.CompatImpl compatImpl = (ContentInfoCompat.CompatImpl) this.$uiEvent;
                Event.Companion companion = Event.Companion;
                int i6 = compatImpl.mSource;
                int i7 = compatImpl.mFlags;
                Object[] objArr = (Object[]) compatImpl.mLinkUri;
                if (objArr == null) {
                    list = EmptyList.INSTANCE;
                } else {
                    Json json = (Json) compatImpl.mClip;
                    json.getClass();
                    KSerializer[] kSerializerArr = (KSerializer[]) compatImpl.mExtras;
                    kSerializerArr.getClass();
                    int length = objArr.length;
                    ArrayList arrayList = new ArrayList(length);
                    while (i4 < length) {
                        KSerializer kSerializer = kSerializerArr[i4];
                        Object obj4 = objArr[i4];
                        kSerializer.getClass();
                        arrayList.add(WriteModeKt.writeJson(json, obj4, kSerializer));
                        i4++;
                    }
                    list = arrayList;
                }
                companion.getClass();
                list.getClass();
                Event event = new Event(i6, i7, list);
                ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService ziplineTreehouseUi$Companion$Adapter$GeneratedOutboundService = (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) ((SVG) obj3).idToElementMap;
                if (ziplineTreehouseUi$Companion$Adapter$GeneratedOutboundService != null) {
                    Object call = ziplineTreehouseUi$Companion$Adapter$GeneratedOutboundService.callHandler.call(ziplineTreehouseUi$Companion$Adapter$GeneratedOutboundService, 3, event);
                    call.getClass();
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineScope coroutineScope = (CoroutineScope) this.$uiEvent;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JobKt.launch$default(coroutineScope, null, null, new DiskLruCache$launchCleanup$1((FulfillmentPickerPresenter) obj3, (Continuation) (0 == true ? 1 : 0), 16), 3);
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                FulfillmentPickerPresenter fulfillmentPickerPresenter = (FulfillmentPickerPresenter) this.$uiEvent;
                Analytics analytics = fulfillmentPickerPresenter.analytics;
                String str3 = fulfillmentPickerPresenter.screen.brandToken;
                String activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull(fulfillmentPickerPresenter.sessionManager);
                FulfillmentVersion fulfillmentVersion = FulfillmentVersion.BX;
                switch (FulfillmentPickerPresenter$models$4$1$WhenMappings.$EnumSwitchMapping$0[FulfillmentConfigurationKt.getType((FulfillmentConfiguration) ((MutableState) obj3).getValue()).ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        fulfillmentType = FulfillmentType.PICKUP;
                        break;
                    case 6:
                        fulfillmentType = FulfillmentType.DELIVERY;
                        break;
                    default:
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                }
                analytics.track(new LocalClientFulfillmentFlowConfirmFulfillment(str3, activeAccountTokenOrNull, fulfillmentType), null);
                return Unit.INSTANCE;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                FulfillmentPickerPresenter fulfillmentPickerPresenter2 = (FulfillmentPickerPresenter) this.$uiEvent;
                Analytics analytics2 = fulfillmentPickerPresenter2.analytics;
                String str4 = fulfillmentPickerPresenter2.screen.brandToken;
                String activeAccountTokenOrNull2 = PlatformKt.activeAccountTokenOrNull(fulfillmentPickerPresenter2.sessionManager);
                FulfillmentVersion fulfillmentVersion2 = FulfillmentVersion.BX;
                switch (FulfillmentPickerPresenter$models$5$1$WhenMappings.$EnumSwitchMapping$0[((FulfillmentPickerViewEvent.FulfillmentTypeSelected) ((FulfillmentPickerViewEvent) obj3)).f922type.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        fulfillmentInstanceType = FulfillmentInstanceType.PICKUP;
                        break;
                    case 6:
                        fulfillmentInstanceType = FulfillmentInstanceType.DELIVERY;
                        break;
                    default:
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                }
                analytics2.track(new LocalClientFulfillmentFlowClickFulfillment(str4, activeAccountTokenOrNull2, fulfillmentInstanceType), null);
                return Unit.INSTANCE;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                StateFlowKt.emitOrThrow((MutableSharedFlow) this.$uiEvent, (LocalBrandProfileViewEvent) obj3);
                return Unit.INSTANCE;
            case 5:
                CartBuilder cartBuilder = (CartBuilder) obj3;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                OpenTabCartOverride openTabCartOverride = (OpenTabCartOverride) this.$uiEvent;
                if (openTabCartOverride != null) {
                    RealCartBuilder realCartBuilder = (RealCartBuilder) cartBuilder;
                    if (((OpenTabCartOverride) realCartBuilder.openTabCartOverrideState.getValue()) == openTabCartOverride) {
                        realCartBuilder.openTabCartOverrideState.setValue(null);
                    }
                }
                return Unit.INSTANCE;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LatLng latLng = (LatLng) ((Pair) ((MutableState) this.$uiEvent).getValue()).second;
                if (latLng != null) {
                    ((CashMapPresenter) obj3).searchLocation(new LocationViewModel(latLng.lat, latLng.lng, 15.0f));
                }
                return Unit.INSTANCE;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CashMapViewEvent.MapMovementFinished mapMovementFinished = ((CashMapViewModel) this.$uiEvent).latestMapMovement;
                if (mapMovementFinished != null && mapMovementFinished.isUserGesture) {
                    ((Analytics) ((LocalHomePresenter) obj3).embeddedMapEnabled$delegate).track(new LocalClientMapScroll(), null);
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((LocalPosLocalCashRedemptionPresenter) this.$uiEvent).analytics.track(new LocalClientInStoreRedemptionViewCheckInConfirmation((Long) ((MutableState) obj3).getValue()), null);
                return Unit.INSTANCE;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState = (MutableState) obj3;
                ((TabContentPresenter) this.$uiEvent).analytics.track(new AppNavigateOpenSpace(((Boolean) mutableState.getValue()).booleanValue() ? AppNavigateOpenSpace.Source.SWIPE : null, null, AppNavigateOpenSpace.Space.LOCAL, null, EnumC0170g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE), null);
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocalTabContentQueries localTabContentQueries = ((RealLocalInstalledStore) this.$uiEvent).localBrandCollectionQueries;
                QueryResult execute = localTabContentQueries.driver.execute(1755984413, "UPDATE local_brand_collection\nSET\n  response = ?", new RealBadger2$$ExternalSyntheticLambda0(10, (GetBrandCollectionResponse) obj3, localTabContentQueries));
                localTabContentQueries.notifyQueries(1755984413, new Data$$ExternalSyntheticLambda0(i2));
                return execute;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocalTabContentQueries localTabContentQueries2 = ((RealLocalInstalledStore) this.$uiEvent).cashDetailContentQueries;
                GetLocalCashDetailResponse getLocalCashDetailResponse = (GetLocalCashDetailResponse) obj3;
                QueryResult execute2 = localTabContentQueries2.driver.execute(-1257831635, "UPDATE local_cash_detail_content\nSET\n  content = ?,\n  activity = ?,\n  how_it_works = ?", new n3$$ExternalSyntheticLambda0(getLocalCashDetailResponse.content, getLocalCashDetailResponse.activity, getLocalCashDetailResponse.how_it_works, localTabContentQueries2, 10));
                localTabContentQueries2.notifyQueries(-1257831635, new Data$$ExternalSyntheticLambda0(12));
                return execute2;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocalTabContentQueries localTabContentQueries3 = ((RealLocalInstalledStore) this.$uiEvent).localTabContentQueries;
                QueryResult execute3 = localTabContentQueries3.driver.execute(902522718, "UPDATE local_tab_content\nSET\n  response = ?", new RealBadger2$$ExternalSyntheticLambda0(i2, (GetNeighborhoodsTabContentResponse) obj3, localTabContentQueries3));
                localTabContentQueries3.notifyQueries(902522718, new Data$$ExternalSyntheticLambda0(17));
                return execute3;
            case 13:
                ?? r6 = (TextFieldState) obj3;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                GiftCardInputState giftCardInputState = (GiftCardInputState) this.$uiEvent;
                if (giftCardInputState == null || (str = giftCardInputState.code) == null) {
                    return Unit.INSTANCE;
                }
                if (!Intrinsics.areEqual(r6.getValue$foundation().text.toString(), str)) {
                    TextFieldBuffer startEdit = r6.startEdit();
                    try {
                        startEdit.replace(0, startEdit.buffer.length(), str);
                        int length2 = str.length();
                        startEdit.m379setSelection5zctL8(SizeKt.TextRange(length2, length2));
                        r6.commitEdit(startEdit);
                    } finally {
                    }
                }
                return Unit.INSTANCE;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ?? r13 = (TextFieldState) this.$uiEvent;
                String obj5 = r13.getValue$foundation().text.toString();
                CurbsidePickupCarViewModel curbsidePickupCarViewModel = (CurbsidePickupCarViewModel) obj3;
                String str5 = curbsidePickupCarViewModel.initialNote;
                String str6 = curbsidePickupCarViewModel.initialNote;
                if (!Intrinsics.areEqual(obj5, str5)) {
                    TextFieldBuffer startEdit2 = r13.startEdit();
                    try {
                        startEdit2.replace(0, startEdit2.buffer.length(), str6);
                        int length3 = str6.length();
                        startEdit2.m379setSelection5zctL8(SizeKt.TextRange(length3, length3));
                        r13.commitEdit(startEdit2);
                    } finally {
                    }
                }
                return Unit.INSTANCE;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CameraViewport cameraViewport = (CameraViewport) obj3;
                ((CameraPositionState) this.$uiEvent).setPosition(new CameraPosition(cameraViewport.target, cameraViewport.zoom, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE));
                return Unit.INSTANCE;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                AddressState address = ((AddressTypeaheadState) this.$uiEvent).getAddress();
                if ((address instanceof AddressState.Valid) && (str2 = (valid = (AddressState.Valid) address).placeId) != null) {
                    GlobalAddress globalAddress = valid.address;
                    globalAddress.getClass();
                    ((Function1) obj3).invoke(new FulfillmentPickerViewEvent.ValidAddressEntered(new GlobalAddressWrapper(globalAddress, str2)));
                }
                return Unit.INSTANCE;
            case 17:
                ?? r62 = (MutableState) obj3;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ToastData toastData = (ToastData) this.$uiEvent;
                if (toastData != null && !toastData.equals((ToastData) r62.getValue())) {
                    r62.setValue(toastData);
                }
                return Unit.INSTANCE;
            case 18:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((ParcelableSnapshotMutableIntState) obj3).setIntValue(((ParcelableSnapshotMutableIntState) ((DefaultPagerState) this.$uiEvent).scrollPosition.elementTypes).getIntValue());
                return Unit.INSTANCE;
            case 19:
                ZiplineCodeSession ziplineCodeSession = (ZiplineCodeSession) obj3;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealTreehouseApp$codeHost$1 realTreehouseApp$codeHost$1 = (RealTreehouseApp$codeHost$1) this.$uiEvent;
                CodeHost$codeSessionListener$1 codeHost$codeSessionListener$1 = realTreehouseApp$codeHost$1.codeSessionListener;
                Room room = realTreehouseApp$codeHost$1.state;
                ZiplineCodeSession codeSession = room.getCodeSession();
                if (codeSession != null) {
                    codeSession.removeListener(codeHost$codeSessionListener$1);
                }
                ZiplineCodeSession codeSession2 = room.getCodeSession();
                if (codeSession2 != null) {
                    codeSession2.stop();
                }
                CoroutineScope codeUpdatesScope = room.getCodeUpdatesScope();
                if (codeUpdatesScope == null) {
                    ziplineCodeSession.stop();
                    return Unit.INSTANCE;
                }
                realTreehouseApp$codeHost$1.state = new CodeHost$State$Running(codeUpdatesScope, ziplineCodeSession);
                realTreehouseApp$codeHost$1.mutableZipline.setValue(ziplineCodeSession.zipline);
                codeHost$codeSessionListener$1.getClass();
                AndroidTreehouseDispatchers.checkUi();
                ziplineCodeSession.listeners.add(codeHost$codeSessionListener$1);
                AndroidTreehouseDispatchers androidTreehouseDispatchers = ziplineCodeSession.dispatchers;
                AndroidTreehouseDispatchers.checkUi();
                JobKt.launch$default(ziplineCodeSession.scope, androidTreehouseDispatchers.zipline, null, new CodeSession$stop$1(ziplineCodeSession, 0 == true ? 1 : 0, i5), 2);
                Iterator it = realTreehouseApp$codeHost$1.listeners.iterator();
                while (it.hasNext()) {
                    TreehouseAppContent treehouseAppContent = (TreehouseAppContent) it.next();
                    treehouseAppContent.getClass();
                    AndroidTreehouseDispatchers.checkUi();
                    StateFlowImpl stateFlowImpl = treehouseAppContent.internalStateFlow;
                    InternalState internalState = (InternalState) stateFlowImpl.getValue();
                    ViewState viewState = internalState.viewState;
                    CodeState codeState = internalState.codeState;
                    boolean z = viewState instanceof ViewState.Preloading;
                    if (z) {
                        m1Var = ((ViewState.Preloading) viewState).onBackPressedDispatcher;
                    } else {
                        if (!(viewState instanceof ViewState.Bound)) {
                            a$$ExternalSyntheticBUOutline0.m$1("unexpected receiveCodeSession with no view bound and no preload");
                            return null;
                        }
                        m1Var = ((ViewState.Bound) viewState).view.onBackPressedDispatcher;
                    }
                    if (z) {
                        stateFlow = ((ViewState.Preloading) viewState).uiConfiguration;
                    } else {
                        if (!(viewState instanceof ViewState.Bound)) {
                            a$$ExternalSyntheticBUOutline0.m$1("unexpected receiveCodeSession with no view bound and no preload");
                            return null;
                        }
                        stateFlow = ((ViewState.Bound) viewState).view.mutableUiConfiguration;
                    }
                    int loadCount = codeState.getLoadCount() + 1;
                    Throwable lastUncaughtException = codeState.getLastUncaughtException();
                    ViewContentCodeBinding startViewCodeContentBinding = treehouseAppContent.startViewCodeContentBinding(ziplineCodeSession, m1Var, stateFlow);
                    CodeState.Running running = new CodeState.Running(loadCount, lastUncaughtException, startViewCodeContentBinding, 0);
                    if (viewState instanceof ViewState.Bound) {
                        startViewCodeContentBinding.initView(((ViewState.Bound) viewState).view, false);
                    }
                    if (codeState instanceof CodeState.Running) {
                        ViewContentCodeBinding viewContentCodeBinding = ((CodeState.Running) codeState).viewContentCodeBinding;
                        viewContentCodeBinding.cancel(null);
                        viewContentCodeBinding.codeSession.removeListener(treehouseAppContent);
                    }
                    stateFlowImpl.updateState(null, new InternalState(viewState, running));
                    StateFlowImpl stateFlowImpl2 = treehouseAppContent.externalStateFlow;
                    Content$State asState = running.asState();
                    stateFlowImpl2.getClass();
                    stateFlowImpl2.updateState(null, asState);
                }
                return Unit.INSTANCE;
            case 20:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ZiplineCodeSession ziplineCodeSession2 = (ZiplineCodeSession) this.$uiEvent;
                CodeSession$Listener[] codeSession$ListenerArr = (CodeSession$Listener[]) ziplineCodeSession2.listeners.toArray(new CodeSession$Listener[0]);
                int length4 = codeSession$ListenerArr.length;
                while (i4 < length4) {
                    codeSession$ListenerArr[i4].onUncaughtException(ziplineCodeSession2, (Throwable) obj3);
                    i4++;
                }
                ziplineCodeSession2.stop();
                return Unit.INSTANCE;
            case 21:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                TreehouseLayout treehouseLayout = ((ViewContentCodeBinding) this.$uiEvent).viewOrNull;
                if (treehouseLayout != null) {
                    FocusRequester focusRequester = (FocusRequester) obj3;
                    UnleashContext unleashContext = treehouseLayout.children;
                    unleashContext.getClass();
                    ArrayList arrayList2 = (ArrayList) unleashContext.properties;
                    arrayList2.getClass();
                    SequenceBuilderIterator it2 = SequencesKt__SequenceBuilderKt.iterator(new HostFocusDirectorKt$depthFirst$1(arrayList2, 0 == true ? 1 : 0, i4));
                    while (true) {
                        if (it2.hasNext()) {
                            Widget widget2 = (Widget) it2.next();
                            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                            widget2.getModifier().forEachUnscoped(new Modifier$$ExternalSyntheticLambda0(i3, ref$ObjectRef));
                            if (!Intrinsics.areEqual((FocusRequester) ref$ObjectRef.element, focusRequester)) {
                                widget2 = null;
                            }
                            if (widget2 != null) {
                                widget = widget2;
                            }
                        }
                    }
                    if (widget != null) {
                        ((View) widget.getValue()).requestFocus();
                    }
                }
                return Unit.INSTANCE;
            case 22:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((ViewContentCodeBinding) this.$uiEvent).receiveChangesOnUiDispatcher((ArrayList) obj3);
                return Unit.INSTANCE;
            case 23:
                OffsetQueryPagingSource offsetQueryPagingSource = (OffsetQueryPagingSource) obj3;
                PagingSource.LoadParams loadParams = (PagingSource.LoadParams) this.$uiEvent;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Integer num = (Integer) loadParams.getKey();
                int intValue = num != null ? num.intValue() : offsetQueryPagingSource.initialOffset;
                SignaturesKt$$ExternalSyntheticLambda1 signaturesKt$$ExternalSyntheticLambda1 = new SignaturesKt$$ExternalSyntheticLambda1(offsetQueryPagingSource, loadParams, intValue, loadParams instanceof PagingSource.LoadParams.Prepend ? Math.min(intValue, ((PagingSource.LoadParams.Prepend) loadParams).loadSize) : loadParams.loadSize, 1);
                Transacter transacter = offsetQueryPagingSource.transacter;
                if (transacter instanceof Transacter) {
                    return offsetQueryPagingSource.invalidateCallbackTracker.intermediate ? new PagingSource.LoadResult.Invalid() : (PagingSource.LoadResult.Page) TransactorKt.transactionWithResult$default(transacter, signaturesKt$$ExternalSyntheticLambda1);
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 24:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!((OutboundCallHandler.RealSuspendCallback) this.$uiEvent).completed) {
                    ((CancelCallback) obj3).cancel();
                }
                return Unit.INSTANCE;
            case 25:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Map map = (Map) this.$uiEvent;
                map.clear();
                map.putAll((Map) obj3);
                return Unit.INSTANCE;
            case 26:
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                File file = new File(zzmz.zzt((Context) obj3), "index");
                if (!file.exists()) {
                    EmptyMap emptyMap = EmptyMap.INSTANCE;
                    emptyMap.getClass();
                    return emptyMap;
                }
                try {
                    String readText = FilesKt__FileReadWriteKt.readText(file, Charsets.UTF_8);
                    if (StringsKt.isBlank(readText)) {
                        obj2 = EmptyMap.INSTANCE;
                        obj2.getClass();
                    } else {
                        JSONArray jSONArray = new JSONArray(readText);
                        obj2 = new LinkedHashMap();
                        int length5 = jSONArray.length();
                        while (i4 < length5) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i4);
                            jSONObject.getClass();
                            String string2 = jSONObject.getString("id");
                            string2.getClass();
                            String string3 = jSONObject.getString("path");
                            string3.getClass();
                            zzmd zzmdVar = new zzmd(string2, string3, jSONObject.getLong("last_access_time"));
                            if (obj2.containsKey(string2)) {
                                Log.w("CacheManager", "Duplicate cache id: " + string2 + ". Overwriting.");
                            }
                            obj2.put(string2, zzmdVar);
                            i4++;
                        }
                    }
                    return obj2;
                } catch (IOException e) {
                    Log.e("CacheManager", "Failed to read cache index file.", e);
                    EmptyMap emptyMap2 = EmptyMap.INSTANCE;
                    emptyMap2.getClass();
                    return emptyMap2;
                } catch (JSONException e2) {
                    Log.e("CacheManager", "Cache index file is corrupted.", e2);
                    file.delete();
                    EmptyMap emptyMap3 = EmptyMap.INSTANCE;
                    emptyMap3.getClass();
                    return emptyMap3;
                }
            case 27:
                File file2 = (File) this.$uiEvent;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                View view2 = ((DiagnosticContext) obj3).contentRootView;
                if (view2 != null) {
                    List list2 = ViewStateRenderers.DefaultsNoPii;
                    list2.getClass();
                    StringBuilder sb2 = new StringBuilder();
                    try {
                    } catch (Throwable th) {
                        sb2.append("Exception when finding scan roots: " + th.getMessage());
                    }
                    try {
                        for (ScannableView scannableView : CollectionsKt__CollectionsJVMKt.listOf(new ScannableView.AndroidView(view2))) {
                            ScannableView.AndroidView androidView = scannableView instanceof ScannableView.AndroidView ? (ScannableView.AndroidView) scannableView : null;
                            if (androidView == null || (view = androidView.view) == null || (handler = view.getHandler()) == null || (mainLooper = handler.getLooper()) == null) {
                                mainLooper = Looper.getMainLooper();
                                mainLooper.getClass();
                            }
                            boolean areEqual = Intrinsics.areEqual(mainLooper.getThread(), Thread.currentThread());
                            ViewFilters$$ExternalSyntheticLambda0 viewFilters$$ExternalSyntheticLambda0 = ViewFilters.NoFilter;
                            if (areEqual) {
                                ViewFilters.scanFromLooperThread(sb2, scannableView, list2, viewFilters$$ExternalSyntheticLambda0);
                            } else {
                                CountDownLatch countDownLatch = new CountDownLatch(1);
                                new Handler(mainLooper).post(new Radiography$$ExternalSyntheticLambda0(sb2, scannableView, list2, viewFilters$$ExternalSyntheticLambda0, countDownLatch, 0));
                                if (!countDownLatch.await(5L, TimeUnit.SECONDS)) {
                                    sb = "Could not retrieve view hierarchy from main thread after 5 seconds wait";
                                    realBufferedSink = new RealBufferedSink(Okio.sink$default(file2));
                                    ByteString.Companion companion2 = ByteString.Companion;
                                    realBufferedSink.write(ByteString.Companion.encodeUtf8(sb));
                                    realBufferedSink.close();
                                }
                            }
                        }
                        ByteString.Companion companion22 = ByteString.Companion;
                        realBufferedSink.write(ByteString.Companion.encodeUtf8(sb));
                        realBufferedSink.close();
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            Utf8.closeFinally(realBufferedSink, th2);
                            throw th3;
                        }
                    }
                    sb = sb2.toString();
                    realBufferedSink = new RealBufferedSink(Okio.sink$default(file2));
                } else {
                    FilesKt__FileReadWriteKt.writeText$default(file2, "Content root view not available");
                }
                return Unit.INSTANCE;
            case 28:
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Uri uri = (Uri) ((MutableState) this.$uiEvent).getValue();
                if (uri != null) {
                    BetterNavigator.ScreenNavigator screenNavigator = ((AccountPresenter) obj3).accountOutboundNavigator.navigator;
                    String uri2 = uri.toString();
                    uri2.getClass();
                    screenNavigator.goTo(new ProfileScreens.CropScreen(uri2));
                }
                return Unit.INSTANCE;
            default:
                PublicProfile publicProfile = (PublicProfile) this.$uiEvent;
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((AccountPresenter) obj3).photoUrl.setValue(publicProfile.photoUrl);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EventBridge$sendEvent$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }
}
