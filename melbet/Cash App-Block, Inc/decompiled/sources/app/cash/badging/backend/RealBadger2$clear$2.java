package app.cash.badging.backend;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import androidx.camera.camera2.adapter.PipeCameraPresenceSource;
import androidx.camera.camera2.adapter.SessionConfigAdapter;
import androidx.camera.camera2.impl.LowLightBoostControl;
import androidx.camera.camera2.impl.State3AControl;
import androidx.camera.camera2.impl.UseCaseCameraKt;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.pipe.AudioRestrictionMode;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.compat.AndroidCameraDevice;
import androidx.camera.camera2.pipe.compat.AudioRestrictionControllerImpl;
import androidx.camera.camera2.pipe.compat.Camera2CameraMetadata;
import androidx.camera.camera2.pipe.compat.Camera2DeviceCache;
import androidx.camera.camera2.pipe.compat.Camera2ErrorProcessor;
import androidx.camera.camera2.pipe.compat.Camera2MetadataCache;
import androidx.camera.camera2.pipe.compat.CameraDeviceWrapper;
import androidx.camera.camera2.pipe.compat.CaptureSessionState;
import androidx.camera.camera2.pipe.compat.VirtualCameraState;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.CameraIdentifier;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.featurecombinationquery.AggregatedCameraDeviceSetupCompat;
import androidx.camera.featurecombinationquery.Camera2CameraDeviceSetupCompat;
import androidx.camera.featurecombinationquery.Camera2CameraDeviceSetupCompatProvider;
import androidx.camera.featurecombinationquery.CameraDeviceSetupCompatFactory;
import androidx.compose.animation.SharedElement;
import androidx.compose.animation.SharedElementEntry;
import androidx.compose.foundation.ClickableKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.material3.SwipeToDismissBoxValue;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.StateListIterator;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.datastore.core.Data;
import androidx.datastore.core.State;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.glance.appwidget.AppWidgetSession;
import androidx.glance.appwidget.GlanceAppWidgetManager;
import androidx.glance.appwidget.LayoutConfiguration;
import androidx.glance.appwidget.proto.LayoutProto$LayoutConfig;
import androidx.glance.appwidget.proto.LayoutProto$LayoutDefinition;
import androidx.glance.appwidget.proto.LayoutProto$LayoutNode;
import androidx.glance.appwidget.protobuf.GeneratedMessageLite;
import androidx.glance.session.SessionManagerImpl$scope$1;
import androidx.glance.session.SessionWorker;
import androidx.lifecycle.BlockRunner$cancel$1;
import androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon;
import app.cash.badging.api.Badger2;
import app.cash.local.backend.CartBuilder;
import app.cash.local.backend.real.CalculateLineItemsManager;
import app.cash.local.backend.real.RealCartBuilder;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.RealOrderBuilder;
import app.cash.local.presenters.cart.LocalBrandLocationCartPresenter;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.CartEntry;
import app.cash.local.primitives.CartEntryKt;
import app.cash.local.primitives.CartEntryWithQuantity;
import app.cash.local.primitives.Line;
import app.cash.local.primitives.PaymentMethod;
import app.cash.local.primitives.PaymentMethodToken;
import app.cash.local.primitives.Selection;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.e0;
import com.squareup.cash.api.Aliases;
import com.squareup.cash.cdf.localclient.LocalClientCartView;
import com.squareup.cash.cdf.localclient.LocalClientTabViewLocalCash;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.loadable.LoadableStateKt;
import com.squareup.cash.ui.qrcodes.widget.CashQrWidgetReceiver;
import com.squareup.protos.cash.badging.api.BadgeCounts;
import com.squareup.protos.cash.local.client.app.v1.cashbalance.LocalCashBalance;
import com.squareup.protos.cash.local.client.v1.LocalPaymentOption;
import com.squareup.protos.cash.local.client.v1.PreferredPaymentMethod;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt___ArraysJvmKt$asList$3;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.ranges.IntProgressionIterator;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelResult;
import okio.ByteString;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final class RealBadger2$clear$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $badges;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealBadger2$clear$2(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$badges = obj2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$badges;
        switch (i) {
            case 0:
                return new RealBadger2$clear$2((RealBadger2) this.this$0, (Badger2.Badge[]) obj2, continuation, 0);
            case 1:
                return new RealBadger2$clear$2((PipeCameraPresenceSource) this.this$0, (CallbackToFutureAdapter$Completer) obj2, continuation, 1);
            case 2:
                return new RealBadger2$clear$2((LowLightBoostControl) this.this$0, (List) obj2, continuation, 2);
            case 3:
                return new RealBadger2$clear$2(continuation, (Set) this.this$0, (State3AControl) obj2, 3);
            case 4:
                return new RealBadger2$clear$2(continuation, (State3AControl) this.this$0, (Ref$LongRef) obj2, 4);
            case 5:
                return new RealBadger2$clear$2((SessionConfigAdapter) this.this$0, (DeferrableSurface.SurfaceClosedException) obj2, continuation, 5);
            case 6:
                return new RealBadger2$clear$2((AndroidCameraDevice) this.this$0, (AudioRestrictionMode) obj2, continuation, 6);
            case 7:
                return new RealBadger2$clear$2((AudioRestrictionControllerImpl) this.this$0, (AudioRestrictionMode) obj2, continuation, 7);
            case 8:
                return new RealBadger2$clear$2((CaptureSessionState) this.this$0, (VirtualCameraState) obj2, continuation, 8);
            case 9:
                return new RealBadger2$clear$2((String) this.this$0, (Camera2DeviceCache) obj2, continuation, 9);
            case 10:
                return new RealBadger2$clear$2((Camera2MetadataCache) this.this$0, (String) obj2, continuation, 10);
            case 11:
                RealBadger2$clear$2 realBadger2$clear$2 = new RealBadger2$clear$2((e0) obj2, continuation, 11);
                realBadger2$clear$2.this$0 = obj;
                return realBadger2$clear$2;
            case 12:
                return new RealBadger2$clear$2((SharedElement) this.this$0, (SharedElementEntry) obj2, continuation, 12);
            case 13:
                return new RealBadger2$clear$2((SwipeToDismissBoxState) this.this$0, (Function1) obj2, continuation, 13);
            case 14:
                RealBadger2$clear$2 realBadger2$clear$22 = new RealBadger2$clear$2((State) obj2, continuation, 14);
                realBadger2$clear$22.this$0 = obj;
                return realBadger2$clear$22;
            case 15:
                RealBadger2$clear$2 realBadger2$clear$23 = new RealBadger2$clear$2((ArrayList) obj2, continuation, 15);
                realBadger2$clear$23.this$0 = obj;
                return realBadger2$clear$23;
            case 16:
                RealBadger2$clear$2 realBadger2$clear$24 = new RealBadger2$clear$2((Set) obj2, continuation, 16);
                realBadger2$clear$24.this$0 = obj;
                return realBadger2$clear$24;
            case 17:
                RealBadger2$clear$2 realBadger2$clear$25 = new RealBadger2$clear$2((LayoutConfiguration) obj2, continuation, 17);
                realBadger2$clear$25.this$0 = obj;
                return realBadger2$clear$25;
            case 18:
                RealBadger2$clear$2 realBadger2$clear$26 = new RealBadger2$clear$2((SessionWorker) obj2, continuation, 18);
                realBadger2$clear$26.this$0 = obj;
                return realBadger2$clear$26;
            case 19:
                RealBadger2$clear$2 realBadger2$clear$27 = new RealBadger2$clear$2((MeasurementManagerImplCommon) obj2, continuation, 19);
                realBadger2$clear$27.this$0 = obj;
                return realBadger2$clear$27;
            case 20:
                return new RealBadger2$clear$2((Callable) this.this$0, (CancellableContinuationImpl) obj2, continuation, 20);
            case 21:
                return new RealBadger2$clear$2((RealBadger2) this.this$0, (BadgeCounts) obj2, continuation, 21);
            case 22:
                return new RealBadger2$clear$2((RealBadger2) this.this$0, (ByteString) obj2, continuation, 22);
            case 23:
                return new RealBadger2$clear$2((RealBadger2) this.this$0, (List) obj2, continuation, 23);
            case 24:
                RealBadger2$clear$2 realBadger2$clear$28 = new RealBadger2$clear$2((CartBuilder) obj2, continuation, 24);
                realBadger2$clear$28.this$0 = obj;
                return realBadger2$clear$28;
            case 25:
                RealBadger2$clear$2 realBadger2$clear$29 = new RealBadger2$clear$2((LocalEditorialPresenter) obj2, continuation, 25);
                realBadger2$clear$29.this$0 = obj;
                return realBadger2$clear$29;
            case 26:
                RealBadger2$clear$2 realBadger2$clear$210 = new RealBadger2$clear$2((LocalCashBalancePresenter) obj2, continuation, 26);
                realBadger2$clear$210.this$0 = obj;
                return realBadger2$clear$210;
            case 27:
                return new RealBadger2$clear$2((LocalCashBalancePresenter) this.this$0, (MutableState) obj2, continuation, 27);
            case 28:
                return new RealBadger2$clear$2((RealOrderBuilder) this.this$0, (ArrayList) obj2, continuation, 28);
            default:
                return new RealBadger2$clear$2((LocalBrandLocationCartPresenter) this.this$0, (CartBuilder) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((RealBadger2$clear$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((RealBadger2$clear$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((RealBadger2$clear$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((RealBadger2$clear$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((RealBadger2$clear$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((RealBadger2$clear$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 6:
                return ((RealBadger2$clear$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 7:
                return ((RealBadger2$clear$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 8:
                return ((RealBadger2$clear$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 9:
                return ((RealBadger2$clear$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 10:
                return ((RealBadger2$clear$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 11:
                return ((RealBadger2$clear$2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 12:
                return ((RealBadger2$clear$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 13:
                return ((RealBadger2$clear$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 14:
                return ((RealBadger2$clear$2) create((State) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 15:
                return ((RealBadger2$clear$2) create((Preferences) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 16:
                return ((RealBadger2$clear$2) create((Preferences) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 17:
                return ((RealBadger2$clear$2) create((LayoutProto$LayoutConfig) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 18:
                return ((RealBadger2$clear$2) create((SessionManagerImpl$scope$1) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 19:
                ((RealBadger2$clear$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                throw null;
            case 20:
                return ((RealBadger2$clear$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 21:
                return ((RealBadger2$clear$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 22:
                return ((RealBadger2$clear$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 23:
                return ((RealBadger2$clear$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 24:
                return ((RealBadger2$clear$2) create((CalculateLineItemsManager.CalculateLineItemsResult) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 25:
                return ((RealBadger2$clear$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 26:
                return ((RealBadger2$clear$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 27:
                return ((RealBadger2$clear$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 28:
                return ((RealBadger2$clear$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((RealBadger2$clear$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
    
        if (r4 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x019b, code lost:
    
        if (r17 == 0) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:328:0x07c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0837 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CameraIdentifier cameraIdentifier;
        int i;
        State3AControl state3AControl;
        boolean z;
        CaptureConfig captureConfig;
        boolean z2;
        int i2;
        int i3;
        boolean z3;
        Integer num;
        Integer num2;
        int i4;
        List list;
        ListIterator listIterator;
        Continuation continuation;
        Object obj2;
        Continuation continuation2;
        Continuation continuation3;
        Long l;
        PaymentMethod paymentMethod;
        Object obj3;
        int i5 = 4;
        int i6 = 2;
        int i7 = 6;
        int i8 = 5;
        int i9 = 1;
        int i10 = 0;
        Continuation continuation4 = null;
        switch (this.$r8$classId) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealBadger2 realBadger2 = (RealBadger2) this.this$0;
                realBadger2.badgeQueries.transactionWithWrapper(new RealBadger2$$ExternalSyntheticLambda0(i6, (Badger2.Badge[]) this.$badges, realBadger2));
                return Unit.INSTANCE;
            case 1:
                CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = (CallbackToFutureAdapter$Completer) this.$badges;
                PipeCameraPresenceSource pipeCameraPresenceSource = (PipeCameraPresenceSource) this.this$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                try {
                    String[] cameraIdList = pipeCameraPresenceSource.cameraManager.getCameraIdList();
                    cameraIdList.getClass();
                    ArrayList arrayList = new ArrayList();
                    int length = cameraIdList.length;
                    while (i10 < length) {
                        String str = cameraIdList[i10];
                        try {
                            str.getClass();
                            cameraIdentifier = Aliases.create(str, null, null);
                        } catch (IllegalArgumentException e) {
                            Log.w("PipePresenceSrc", "Could not create CameraIdentifier for system ID: " + str, e);
                            cameraIdentifier = null;
                        }
                        if (cameraIdentifier != null) {
                            arrayList.add(cameraIdentifier);
                        }
                        i10++;
                    }
                    Log.d("PipePresenceSrc", "[FetchData] Refreshed camera list from hardware: " + arrayList);
                    pipeCameraPresenceSource.updateState(arrayList, null);
                    callbackToFutureAdapter$Completer.set(arrayList);
                } catch (Exception e2) {
                    Log.e("PipePresenceSrc", "[FetchData] Failed to refresh camera list from hardware.", e2);
                    pipeCameraPresenceSource.updateState(null, e2);
                    callbackToFutureAdapter$Completer.setException(e2);
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                List list2 = (List) this.$badges;
                SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    validatingBuilder.add(((UseCase) it.next()).mAttachedSessionConfig);
                }
                return Boolean.valueOf(((Number) validatingBuilder.build().mRepeatingCaptureConfig.getExpectedFrameRateRange().getUpper()).intValue() > 30);
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!((Set) this.this$0).isEmpty()) {
                    SessionConfigAdapter sessionConfigAdapter = new SessionConfigAdapter((Set) this.this$0, true);
                    SessionConfig sessionConfig = ((SessionConfig.ValidatingBuilder) sessionConfigAdapter.validatingBuilder$delegate.getValue()).isValid() ? (SessionConfig) sessionConfigAdapter.sessionConfig$delegate.getValue() : null;
                    if (sessionConfig != null && (captureConfig = sessionConfig.mRepeatingCaptureConfig) != null) {
                        int i11 = captureConfig.mTemplateType;
                        Integer valueOf = i11 != -1 ? Integer.valueOf(i11) : null;
                        if (valueOf != null) {
                            i = valueOf.intValue();
                            synchronized (((State3AControl) this.$badges).lock) {
                                state3AControl = (State3AControl) this.$badges;
                                if (state3AControl._template != i) {
                                    state3AControl._template = i;
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                            if (z) {
                                state3AControl.update();
                            }
                        }
                    }
                    i = 1;
                    synchronized (((State3AControl) this.$badges).lock) {
                    }
                }
                return Unit.INSTANCE;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                State3AControl state3AControl2 = (State3AControl) this.this$0;
                long j = ((Ref$LongRef) this.$badges).element;
                UseCaseCameraRequestControl useCaseCameraRequestControl = state3AControl2._requestControl;
                if (useCaseCameraRequestControl == null) {
                    state3AControl2.failAllPendingSignals(new CameraControl$OperationCanceledException("Camera is not active."));
                } else {
                    synchronized (state3AControl2.lock) {
                        z2 = j == state3AControl2.currentRevision;
                    }
                    if (z2) {
                        synchronized (state3AControl2.lock) {
                            i2 = state3AControl2._flashMode;
                            i3 = state3AControl2._template;
                            z3 = state3AControl2._tryExternalFlashAeMode;
                            num = state3AControl2._preferredAeMode;
                            num2 = state3AControl2._preferredFocusMode;
                        }
                        int finalPreferredAeMode = state3AControl2.getFinalPreferredAeMode(i2, num, z3);
                        int intValue = num2 != null ? num2.intValue() : (i3 == 1 || i3 != 3) ? 4 : 3;
                        Pair pair = new Pair(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(LoadableStateKt.getSupportedAeMode(state3AControl2.cameraProperties.metadata, finalPreferredAeMode)));
                        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
                        CameraMetadata cameraMetadata = state3AControl2.cameraProperties.metadata;
                        cameraMetadata.getClass();
                        if (LoadableStateKt.getAvailableAfModes(cameraMetadata).contains(Integer.valueOf(intValue))) {
                            i5 = intValue;
                        } else if (!LoadableStateKt.getAvailableAfModes(cameraMetadata).contains(4)) {
                            i5 = LoadableStateKt.getAvailableAfModes(cameraMetadata).contains(1) ? 1 : 0;
                        }
                        Pair pair2 = new Pair(key, Integer.valueOf(i5));
                        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AWB_MODE;
                        CameraMetadata cameraMetadata2 = state3AControl2.cameraProperties.metadata;
                        cameraMetadata2.getClass();
                        CameraCharacteristics.Key key3 = CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES;
                        key3.getClass();
                        Object obj4 = {0};
                        Camera2CameraMetadata camera2CameraMetadata = (Camera2CameraMetadata) cameraMetadata2;
                        Object obj5 = camera2CameraMetadata.get(key3);
                        if (obj5 != null) {
                            obj4 = obj5;
                        }
                        try {
                            if (!new ArraysKt___ArraysJvmKt$asList$3((int[]) obj4, i10).contains(1)) {
                                key3.getClass();
                                Object obj6 = {0};
                                Object obj7 = camera2CameraMetadata.get(key3);
                                if (obj7 != null) {
                                    obj6 = obj7;
                                }
                                if (!new ArraysKt___ArraysJvmKt$asList$3((int[]) obj6, i10).contains(1)) {
                                    i4 = 0;
                                    Deferred submitParameters = useCaseCameraRequestControl.submitParameters(MapsKt__MapsKt.mapOf(pair, pair2, new Pair(key2, Integer.valueOf(i4))), UseCaseCameraRequestControl.Type.DEFAULT, UseCaseCameraKt.defaultOptionPriority);
                                    synchronized (state3AControl2.lock) {
                                        list = CollectionsKt.toList(state3AControl2.pendingSignals);
                                    }
                                    submitParameters.invokeOnCompletion(new ClickableKt$$ExternalSyntheticLambda0(i8, list, state3AControl2));
                                }
                            }
                            Deferred submitParameters2 = useCaseCameraRequestControl.submitParameters(MapsKt__MapsKt.mapOf(pair, pair2, new Pair(key2, Integer.valueOf(i4))), UseCaseCameraRequestControl.Type.DEFAULT, UseCaseCameraKt.defaultOptionPriority);
                            synchronized (state3AControl2.lock) {
                            }
                        } catch (Exception e3) {
                            state3AControl2.failAllPendingSignals(e3);
                        }
                        i4 = 1;
                    }
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                SessionConfigAdapter sessionConfigAdapter2 = (SessionConfigAdapter) this.this$0;
                DeferrableSurface deferrableSurface = ((DeferrableSurface.SurfaceClosedException) this.$badges).mDeferrableSurface;
                deferrableSurface.getClass();
                sessionConfigAdapter2.reportSurfaceInvalid(deferrableSurface);
                return Unit.INSTANCE;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((AndroidCameraDevice) this.this$0).mo60onCameraAudioRestrictionUpdatedLwUUkyU(((AudioRestrictionMode) this.$badges).value);
                return Unit.INSTANCE;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Iterator it2 = ((AudioRestrictionControllerImpl) this.this$0).activeListeners.iterator();
                it2.getClass();
                while (it2.hasNext()) {
                    ((CameraDeviceWrapper) it2.next()).mo60onCameraAudioRestrictionUpdatedLwUUkyU(((AudioRestrictionMode) this.$badges).value);
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CaptureSessionState captureSessionState = (CaptureSessionState) this.this$0;
                if (captureSessionState != null) {
                    captureSessionState.shutdown();
                }
                VirtualCameraState virtualCameraState = (VirtualCameraState) this.$badges;
                if (virtualCameraState != null) {
                    virtualCameraState.m80disconnectTPqeGZw(null);
                }
                return Unit.INSTANCE;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                String str2 = (String) this.this$0;
                Log.d("CXCP", "Initializing CameraDeviceSetupCompat for " + ((Object) CameraId.m46toStringimpl(str2)));
                Camera2DeviceCache camera2DeviceCache = (Camera2DeviceCache) this.$badges;
                Camera2ErrorProcessor camera2ErrorProcessor = camera2DeviceCache.cameraErrorListener;
                try {
                    CameraDeviceSetupCompatFactory cameraDeviceSetupCompatFactory = (CameraDeviceSetupCompatFactory) camera2DeviceCache.cameraDeviceSetupCompatFactory$delegate.getValue();
                    cameraDeviceSetupCompatFactory.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    Camera2CameraDeviceSetupCompatProvider camera2CameraDeviceSetupCompatProvider = cameraDeviceSetupCompatFactory.mPlayServicesProvider;
                    if (camera2CameraDeviceSetupCompatProvider != null) {
                        arrayList2.add(new Camera2CameraDeviceSetupCompat(camera2CameraDeviceSetupCompatProvider.mCameraManager, str2));
                    }
                    Camera2CameraDeviceSetupCompatProvider camera2CameraDeviceSetupCompatProvider2 = cameraDeviceSetupCompatFactory.mCamera2Provider;
                    if (camera2CameraDeviceSetupCompatProvider2 != null) {
                        try {
                            arrayList2.add(new Camera2CameraDeviceSetupCompat(camera2CameraDeviceSetupCompatProvider2.mCameraManager, str2));
                        } catch (UnsupportedOperationException unused) {
                        }
                    }
                    return new AggregatedCameraDeviceSetupCompat(arrayList2);
                } catch (Exception e4) {
                    if (e4 instanceof CameraAccessException) {
                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e4.getMessage());
                        CameraAccessException cameraAccessException = (CameraAccessException) e4;
                        int reason = cameraAccessException.getReason();
                        boolean z4 = true;
                        if (reason != 1) {
                            if (reason == 2) {
                                i6 = 6;
                            } else if (reason == 3) {
                                i6 = 0;
                            } else if (reason == 4) {
                                i6 = 1;
                            } else if (reason != 5) {
                                Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                i6 = 11;
                            }
                            z4 = true;
                        } else {
                            i6 = 3;
                        }
                        camera2ErrorProcessor.m69onCameraError3M5Xam4(str2, i6, z4);
                    } else if ((e4 instanceof IllegalArgumentException) || (e4 instanceof SecurityException) || (e4 instanceof UnsupportedOperationException) || (e4 instanceof NullPointerException)) {
                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e4.getMessage());
                        camera2ErrorProcessor.m69onCameraError3M5Xam4(str2, 9, false);
                    } else {
                        if (!(e4 instanceof IllegalStateException)) {
                            throw e4;
                        }
                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    }
                    return null;
                }
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return ((Camera2MetadataCache) this.this$0).m72awaitCameraMetadataEfqyGwQ((String) this.$badges);
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Object obj8 = this.this$0;
                e0 e0Var = (e0) this.$badges;
                ArrayDeque arrayDeque = (ArrayDeque) e0Var.h;
                arrayDeque.addLast(obj8);
                BufferedChannel bufferedChannel = (BufferedChannel) e0Var.f;
                for (Object mo4189tryReceivePtdJZtk = bufferedChannel.mo4189tryReceivePtdJZtk(); !(mo4189tryReceivePtdJZtk instanceof ChannelResult.Failed); mo4189tryReceivePtdJZtk = bufferedChannel.mo4189tryReceivePtdJZtk()) {
                    ChannelResult.m4192getOrThrowimpl(mo4189tryReceivePtdJZtk);
                    arrayDeque.addLast(mo4189tryReceivePtdJZtk);
                }
                Log.d("CXCP", "PruningProcessingQueue: Pruning " + arrayDeque);
                ((Function1) e0Var.a).invoke(arrayDeque);
                return Unit.INSTANCE;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                SharedElement sharedElement = (SharedElement) this.this$0;
                if (sharedElement.get_allEntries().isEmpty()) {
                    sharedElement.scope.sharedElements.remove(sharedElement.key);
                }
                return Unit.INSTANCE;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                SwipeToDismissBoxState swipeToDismissBoxState = (SwipeToDismissBoxState) this.this$0;
                if (((SwipeToDismissBoxValue) swipeToDismissBoxState.anchoredDraggableState.settledValue$delegate.getValue()) != SwipeToDismissBoxValue.Settled) {
                    ((Function1) this.$badges).invoke(swipeToDismissBoxState.getDismissDirection());
                }
                return Unit.INSTANCE;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                State state = (State) this.this$0;
                return Boolean.valueOf((state instanceof Data) && state.version <= ((State) this.$badges).version);
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutablePreferences mutablePreferences = ((Preferences) this.this$0).toMutablePreferences();
                ArrayList<CashQrWidgetReceiver> arrayList3 = (ArrayList) this.$badges;
                Preferences.Key key4 = GlanceAppWidgetManager.providersKey;
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(((CashQrWidgetReceiver) it3.next()).getClass().getName());
                }
                mutablePreferences.set(key4, CollectionsKt.toSet(arrayList4));
                for (CashQrWidgetReceiver cashQrWidgetReceiver : arrayList3) {
                    GlanceAppWidgetManager.Companion companion = GlanceAppWidgetManager.Companion;
                    companion.getClass();
                    String canonicalName = cashQrWidgetReceiver.getClass().getCanonicalName();
                    if (canonicalName != null) {
                        Preferences.Key access$providerKey = GlanceAppWidgetManager.Companion.access$providerKey(companion, canonicalName);
                        String canonicalName2 = cashQrWidgetReceiver.glanceAppWidget.getClass().getCanonicalName();
                        if (canonicalName2 != null) {
                            mutablePreferences.setUnchecked$datastore_preferences_core_release(access$providerKey, canonicalName2);
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$3("no provider name");
                        }
                    } else {
                        a$$ExternalSyntheticBUOutline0.m$3("no receiver name");
                    }
                    return null;
                    break;
                }
                return mutablePreferences.toPreferences();
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Preferences preferences = (Preferences) this.this$0;
                Set set = (Set) preferences.get(GlanceAppWidgetManager.providersKey);
                if (set == null) {
                    return preferences;
                }
                Set set2 = (Set) this.$badges;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj9 : set) {
                    if (!set2.contains((String) obj9)) {
                        arrayList5.add(obj9);
                    }
                }
                if (arrayList5.isEmpty()) {
                    return preferences;
                }
                MutablePreferences mutablePreferences2 = preferences.toMutablePreferences();
                mutablePreferences2.set(GlanceAppWidgetManager.providersKey, SetsKt___SetsKt.minus(set, (Iterable) arrayList5));
                Iterator it4 = arrayList5.iterator();
                while (it4.hasNext()) {
                    mutablePreferences2.remove(GlanceAppWidgetManager.Companion.access$providerKey(GlanceAppWidgetManager.Companion, (String) it4.next()));
                }
                return mutablePreferences2.toPreferences();
            case 17:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LayoutProto$LayoutConfig layoutProto$LayoutConfig = (LayoutProto$LayoutConfig) this.this$0;
                GeneratedMessageLite.Builder builder = (GeneratedMessageLite.Builder) layoutProto$LayoutConfig.dynamicMethod(5);
                if (!builder.defaultInstance.equals(layoutProto$LayoutConfig)) {
                    builder.copyOnWrite();
                    GeneratedMessageLite.Builder.mergeFromInstance(builder.instance, layoutProto$LayoutConfig);
                }
                LayoutConfiguration layoutConfiguration = (LayoutConfiguration) this.$badges;
                LayoutProto$LayoutConfig.Builder builder2 = (LayoutProto$LayoutConfig.Builder) builder;
                int nextIndex = ((LayoutProto$LayoutConfig) builder2.instance).getNextIndex();
                builder2.copyOnWrite();
                ((LayoutProto$LayoutConfig) builder2.instance).nextIndex_ = nextIndex;
                builder2.copyOnWrite();
                LayoutProto$LayoutConfig.access$500((LayoutProto$LayoutConfig) builder2.instance);
                for (Map.Entry entry : layoutConfiguration.layoutConfig.entrySet()) {
                    LayoutProto$LayoutNode layoutProto$LayoutNode = (LayoutProto$LayoutNode) entry.getKey();
                    int intValue2 = ((Number) entry.getValue()).intValue();
                    if (layoutConfiguration.usedLayoutIds.contains(new Integer(intValue2))) {
                        LayoutProto$LayoutDefinition.Builder newBuilder = LayoutProto$LayoutDefinition.newBuilder();
                        newBuilder.copyOnWrite();
                        LayoutProto$LayoutDefinition.access$1100((LayoutProto$LayoutDefinition) newBuilder.instance, layoutProto$LayoutNode);
                        newBuilder.copyOnWrite();
                        ((LayoutProto$LayoutDefinition) newBuilder.instance).layoutIndex_ = intValue2;
                        builder2.copyOnWrite();
                        LayoutProto$LayoutConfig.access$200((LayoutProto$LayoutConfig) builder2.instance, (LayoutProto$LayoutDefinition) newBuilder.build());
                    }
                }
                return builder2.build();
            case 18:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return (AppWidgetSession) ((SessionManagerImpl$scope$1) this.this$0).sessions.get(((SessionWorker) this.$badges).key);
            case 19:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                throw null;
            case 20:
                CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.$badges;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                try {
                    Object call = ((Callable) this.this$0).call();
                    Result.Companion companion2 = Result.Companion;
                    cancellableContinuationImpl.resumeWith(call);
                } catch (Throwable th) {
                    Result.Companion companion3 = Result.Companion;
                    cancellableContinuationImpl.resumeWith(new Result.Failure(th));
                }
                return Unit.INSTANCE;
            case 21:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealBadger2.access$updateCounts((RealBadger2) this.this$0, (BadgeCounts) this.$badges);
                return Unit.INSTANCE;
            case 22:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealBadger2.access$updateCounts((RealBadger2) this.this$0, (BadgeCounts) BadgeCounts.ADAPTER.decode((ByteString) this.$badges));
                return Unit.INSTANCE;
            case 23:
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealBadger2 realBadger22 = (RealBadger2) this.this$0;
                realBadger22.badgeQueries.transactionWithWrapper(new RealBadger2$$ExternalSyntheticLambda0(r6, (List) this.$badges, realBadger22));
                return Unit.INSTANCE;
            case 24:
                CartBuilder cartBuilder = (CartBuilder) this.$badges;
                CalculateLineItemsManager.CalculateLineItemsResult calculateLineItemsResult = (CalculateLineItemsManager.CalculateLineItemsResult) this.this$0;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (calculateLineItemsResult instanceof CalculateLineItemsManager.CalculateLineItemsResult.RequestSuccess) {
                    CalculateLineItemsManager.CalculateLineItemsResult.RequestSuccess requestSuccess = (CalculateLineItemsManager.CalculateLineItemsResult.RequestSuccess) calculateLineItemsResult;
                    ArrayList arrayList6 = requestSuccess.lines;
                    RealCartBuilder realCartBuilder = (RealCartBuilder) cartBuilder;
                    LinkedHashSet mutableSet = CollectionsKt.toMutableSet(CollectionsKt__CollectionsKt.getIndices(arrayList6));
                    SnapshotStateList snapshotStateList = realCartBuilder.selections;
                    ListIterator listIterator2 = snapshotStateList.listIterator();
                    while (true) {
                        StateListIterator stateListIterator = (StateListIterator) listIterator2;
                        if (stateListIterator.hasNext()) {
                            int i12 = i10 + 1;
                            CartEntryWithQuantity cartEntryWithQuantity = (CartEntryWithQuantity) stateListIterator.next();
                            IntProgressionIterator it5 = CollectionsKt__CollectionsKt.getIndices(arrayList6).iterator();
                            while (true) {
                                if (it5.hasNext) {
                                    obj2 = it5.next();
                                    int intValue3 = ((Number) obj2).intValue();
                                    if (mutableSet.contains(Integer.valueOf(intValue3))) {
                                        Line line = (Line) arrayList6.get(intValue3);
                                        Selection selection = CartEntryKt.toSelection(cartEntryWithQuantity.getCartEntry(), i9);
                                        Selection selection2 = line.selection;
                                        String str3 = selection2.menuItemVariationToken;
                                        if (str3 != null) {
                                            int length2 = str3.length();
                                            Continuation continuation5 = str3;
                                            if (length2 == 0) {
                                                continuation5 = continuation4;
                                            }
                                            continuation = continuation4;
                                            continuation2 = continuation5;
                                        } else {
                                            Continuation continuation6 = continuation4;
                                            continuation = continuation6;
                                            continuation2 = continuation6;
                                        }
                                        String str4 = selection.menuItemVariationToken;
                                        if (str4 != null) {
                                            int length3 = str4.length();
                                            continuation3 = str4;
                                            break;
                                        }
                                        continuation3 = continuation;
                                        listIterator = listIterator2;
                                        if (Intrinsics.areEqual(selection2.menuItemToken, selection.menuItemToken) && Intrinsics.areEqual(continuation2, continuation3) && RealCartBuilder.matchesModifiers(selection2.modifiers, selection.modifiers) && RealCartBuilder.matchesTextModifiers(selection2.textModifiers, selection.textModifiers) && RealCartBuilder.matchesComboSlots(selection2.comboSlots, selection.comboSlots)) {
                                        }
                                    } else {
                                        listIterator = listIterator2;
                                        continuation = continuation4;
                                    }
                                    listIterator2 = listIterator;
                                    continuation4 = continuation;
                                    i9 = 1;
                                } else {
                                    listIterator = listIterator2;
                                    continuation = continuation4;
                                    obj2 = continuation;
                                }
                            }
                            Integer num3 = (Integer) obj2;
                            if (num3 != null) {
                                Line line2 = (Line) arrayList6.get(num3.intValue());
                                mutableSet.remove(num3);
                                CartEntryWithQuantity.ServerCartEntryWithQuantity serverCartEntryWithQuantity = new CartEntryWithQuantity.ServerCartEntryWithQuantity(CartEntry.m1230copyFx2XuU$default(cartEntryWithQuantity.getCartEntry(), line2.discountText, 95), cartEntryWithQuantity.getQuantity(), cartEntryWithQuantity.getAnalyticsContext(), line2.totalPrice, line2.totalPriceBeforeDiscounts);
                                if (!Intrinsics.areEqual(snapshotStateList.get(i10), serverCartEntryWithQuantity)) {
                                    snapshotStateList.set(i10, serverCartEntryWithQuantity);
                                }
                            }
                            listIterator2 = listIterator;
                            i10 = i12;
                            continuation4 = continuation;
                            i9 = 1;
                        } else {
                            realCartBuilder.includesPreorderItemsState.setValue(Boolean.valueOf(requestSuccess.includesPreorderItems));
                        }
                    }
                } else if (calculateLineItemsResult instanceof CalculateLineItemsManager.CalculateLineItemsResult.RequestFailure) {
                    Timber.Forest.e("CalculateLineItems failed: " + ((CalculateLineItemsManager.CalculateLineItemsResult.RequestFailure) calculateLineItemsResult).messages, new Object[0]);
                } else {
                    if (!(calculateLineItemsResult instanceof CalculateLineItemsManager.CalculateLineItemsResult.FlagDisabled) && !(calculateLineItemsResult instanceof CalculateLineItemsManager.CalculateLineItemsResult.NoSelections)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((RealCartBuilder) cartBuilder).includesPreorderItemsState.setValue(Boolean.FALSE);
                }
                return Unit.INSTANCE;
            case 25:
                CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JobKt.launch$default(coroutineScope, null, null, new BlockRunner$cancel$1((LocalEditorialPresenter) this.$badges, continuation4, i8), 3);
                return Unit.INSTANCE;
            case 26:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JobKt.launch$default(coroutineScope2, null, null, new BlockRunner$cancel$1((LocalCashBalancePresenter) this.$badges, continuation4, i7), 3);
                return Unit.INSTANCE;
            case 27:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState = (MutableState) this.$badges;
                if (((LocalCashBalance) mutableState.getValue()) == null) {
                    return Unit.INSTANCE;
                }
                LocalCashBalance localCashBalance = (LocalCashBalance) mutableState.getValue();
                ((Analytics) ((LocalCashBalancePresenter) this.this$0).analytics).track(new LocalClientTabViewLocalCash(Boolean.valueOf(((localCashBalance == null || (l = localCashBalance.amount) == null) ? 0L : l.longValue()) > 0)), null);
                return Unit.INSTANCE;
            case 28:
                ArrayList arrayList7 = (ArrayList) this.$badges;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealOrderBuilder realOrderBuilder = (RealOrderBuilder) this.this$0;
                if (realOrderBuilder.m1211getSelectedPaymentMethodTokenyJPV6_0() != null) {
                    return Unit.INSTANCE;
                }
                PreferredPaymentMethod preferredPaymentMethod = realOrderBuilder.getCartResponse().preferred_payment_method;
                if (preferredPaymentMethod != null) {
                    String str5 = preferredPaymentMethod.instrument_token;
                    if (str5 == null) {
                        LocalPaymentOption localPaymentOption = preferredPaymentMethod.preferred_payment_type;
                        localPaymentOption.getClass();
                        str5 = localPaymentOption.name();
                        str5.getClass();
                    }
                    Iterator it6 = arrayList7.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            obj3 = it6.next();
                            if (Intrinsics.areEqual(((PaymentMethod) obj3).mo1281getToken3m_AGhc(), str5)) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    paymentMethod = (PaymentMethod) obj3;
                    break;
                }
                paymentMethod = (PaymentMethod) CollectionsKt.first((List) arrayList7);
                String mo1281getToken3m_AGhc = paymentMethod.mo1281getToken3m_AGhc();
                realOrderBuilder.selectedPaymentMethodToken$delegate.setValue(mo1281getToken3m_AGhc != null ? new PaymentMethodToken(mo1281getToken3m_AGhc) : null);
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocalBrandLocationCartPresenter localBrandLocationCartPresenter = (LocalBrandLocationCartPresenter) this.this$0;
                Analytics analytics = localBrandLocationCartPresenter.analytics;
                BrandSpot brandSpot = localBrandLocationCartPresenter.brandSpot;
                String str6 = brandSpot.brandToken;
                String str7 = brandSpot.locationToken;
                if (str7 == null) {
                    str7 = null;
                }
                analytics.track(new LocalClientCartView(str6, PlatformKt.activeAccountTokenOrNull(localBrandLocationCartPresenter.sessionManager), str7, ((RealCartBuilder) ((CartBuilder) this.$badges)).checkoutFlowToken), null);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealBadger2$clear$2(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$badges = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealBadger2$clear$2(Continuation continuation, Object obj, Object obj2, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$badges = obj2;
    }
}
