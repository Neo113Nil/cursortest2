package androidx.camera.view;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import android.util.Base64;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import android.webkit.WebView;
import androidx.camera.camera2.adapter.ZslControlImpl$$ExternalSyntheticLambda1;
import androidx.camera.core.AutoValue_SurfaceRequest_TransformationInfo;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda17;
import androidx.camera.video.VideoEncoderSession;
import androidx.camera.video.internal.encoder.AutoValue_VideoEncoderConfig;
import androidx.camera.video.internal.encoder.Encoder$EncoderInput;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import androidx.camera.view.PreviewView;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.ResponseUtils$Companion$$ExternalSyntheticLambda1;
import androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController;
import androidx.media3.common.TrackGroup;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.work.DirectExecutor;
import androidx.work.WorkerKt$$ExternalSyntheticLambda1;
import androidx.work.WorkerKt$$ExternalSyntheticLambda2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.IInAppMessageViewWrapper;
import com.braze.ui.inappmessage.listeners.IWebViewClientStateListener;
import com.fidesmo.sec.delivery.DeliveryState;
import com.fidesmo.sec.delivery.ServiceDeliveryClient;
import com.fidesmo.sec.delivery.models.ServiceDeliveryRequired;
import com.fillr.featuretoggle.UnleashContext;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.AutoValue_EventInternal;
import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_EventStoreConfig;
import com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_PersistedEvent;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import com.knotapi.knot.interfaces.ScreenshotCallback;
import com.knotapi.knot.utilities.ScreenshotHelper;
import com.knotapi.knot.webview.KnotView;
import com.squareup.cash.sheet.SheetStateKt;
import com.squareup.workflow1.internal.SubtreeManager;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class PreviewView$1$$ExternalSyntheticLambda2 implements CallbackToFutureAdapter$Resolver, SurfaceRequest.TransformationInfoListener, OnFailureListener, DefaultTrackSelector.TrackInfo.Factory, IWebViewClientStateListener, Function, Consumer, SynchronizationGuard$CriticalSection, SQLiteEventStore.Function, ScreenshotCallback {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ PreviewView$1$$ExternalSyntheticLambda2(PreviewView.AnonymousClass1 anonymousClass1, CameraInternal cameraInternal, SurfaceRequest surfaceRequest) {
        this.$r8$classId = 2;
        this.f$0 = anonymousClass1;
        this.f$2 = cameraInternal;
        this.f$1 = surfaceRequest;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public void accept(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$2;
        Object obj3 = this.f$1;
        ServiceDeliveryClient serviceDeliveryClient = (ServiceDeliveryClient) this.f$0;
        switch (i) {
            case 9:
                serviceDeliveryClient.lambda$execUtil$4((DeliveryState) obj3, (PublishSubject) obj2, obj);
                break;
            default:
                serviceDeliveryClient.lambda$deliverUsingHandlers$0((ServiceDeliveryRequired) obj3, (PublishSubject) obj2, (Disposable) obj);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007d A[SYNTHETIC] */
    @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    /* renamed from: apply */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo39apply(Object obj) {
        ObservableSource lambda$getDeliveryRequestCall$6;
        long insert;
        Cursor cursor;
        SQLiteEventStore sQLiteEventStore;
        LogEventDropped.Reason reason;
        int i = this.$r8$classId;
        int i2 = 6;
        int i3 = 5;
        int i4 = 4;
        int i5 = 3;
        LogEventDropped.Reason reason2 = LogEventDropped.Reason.CACHE_FULL;
        int i6 = 2;
        int i7 = 1;
        int i8 = 0;
        Object obj2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 8:
                lambda$getDeliveryRequestCall$6 = ((ServiceDeliveryClient) obj4).lambda$getDeliveryRequestCall$6((ServiceDeliveryRequired) obj3, (String) obj2, (String) obj);
                return lambda$getDeliveryRequestCall$6;
            case 12:
                SQLiteEventStore sQLiteEventStore2 = (SQLiteEventStore) obj4;
                AutoValue_EventInternal autoValue_EventInternal = (AutoValue_EventInternal) obj3;
                EncodedPayload encodedPayload = autoValue_EventInternal.encodedPayload;
                String str = autoValue_EventInternal.transportName;
                AutoValue_TransportContext autoValue_TransportContext = (AutoValue_TransportContext) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long simpleQueryForLong = sQLiteEventStore2.getDb().compileStatement("PRAGMA page_size").simpleQueryForLong() * sQLiteEventStore2.getDb().compileStatement("PRAGMA page_count").simpleQueryForLong();
                AutoValue_EventStoreConfig autoValue_EventStoreConfig = sQLiteEventStore2.config;
                if (simpleQueryForLong >= autoValue_EventStoreConfig.maxStorageSizeInBytes) {
                    sQLiteEventStore2.recordLogEventDropped(1L, reason2, str);
                    return -1L;
                }
                Long transportContextId = SQLiteEventStore.getTransportContextId(sQLiteDatabase, autoValue_TransportContext);
                if (transportContextId != null) {
                    insert = transportContextId.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", autoValue_TransportContext.backendName);
                    contentValues.put("priority", Integer.valueOf(PriorityMapping.toInt(autoValue_TransportContext.priority)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = autoValue_TransportContext.extras;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i9 = autoValue_EventStoreConfig.maxBlobByteSizePerRow;
                byte[] bArr2 = encodedPayload.bytes;
                boolean z = bArr2.length <= i9;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(autoValue_EventInternal.eventMillis));
                contentValues2.put("uptime_ms", Long.valueOf(autoValue_EventInternal.uptimeMillis));
                contentValues2.put("payload_encoding", encodedPayload.f989encoding.name);
                contentValues2.put("code", autoValue_EventInternal.code);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr2 : new byte[0]);
                contentValues2.put("product_id", autoValue_EventInternal.productId);
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int ceil = (int) Math.ceil(bArr2.length / i9);
                    for (int i10 = 1; i10 <= ceil; i10++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, (i10 - 1) * i9, Math.min(i10 * i9, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i10));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(autoValue_EventInternal.autoMetadata).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
            case 13:
                SQLiteEventStore sQLiteEventStore3 = (SQLiteEventStore) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                AutoValue_TransportContext autoValue_TransportContext2 = (AutoValue_TransportContext) obj2;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j = cursor2.getLong(0);
                    int i11 = cursor2.getInt(7) != 0 ? i7 : 0;
                    SubtreeManager subtreeManager = new SubtreeManager();
                    subtreeManager.idCounter = new HashMap();
                    String string2 = cursor2.getString(i7);
                    if (string2 == null) {
                        a$$ExternalSyntheticBUOutline0.m$2("Null transportName");
                        return null;
                    }
                    subtreeManager.snapshotCache = string2;
                    subtreeManager.workflowSession = Long.valueOf(cursor2.getLong(i6));
                    subtreeManager.interceptor = Long.valueOf(cursor2.getLong(3));
                    if (i11 != 0) {
                        String string3 = cursor2.getString(4);
                        subtreeManager.emitActionToParent = new EncodedPayload(string3 == null ? SQLiteEventStore.PROTOBUF_ENCODING : new Encoding(string3), cursor2.getBlob(5));
                        sQLiteEventStore = sQLiteEventStore3;
                    } else {
                        String string4 = cursor2.getString(4);
                        Encoding encoding2 = string4 == null ? SQLiteEventStore.PROTOBUF_ENCODING : new Encoding(string4);
                        Cursor query = sQLiteEventStore3.getDb().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int i12 = 0;
                            while (query.moveToNext()) {
                                byte[] blob = query.getBlob(0);
                                arrayList2.add(blob);
                                i12 += blob.length;
                            }
                            byte[] bArr3 = new byte[i12];
                            int i13 = 0;
                            int i14 = 0;
                            while (i13 < arrayList2.size()) {
                                byte[] bArr4 = (byte[]) arrayList2.get(i13);
                                SQLiteEventStore sQLiteEventStore4 = sQLiteEventStore3;
                                cursor = query;
                                try {
                                    System.arraycopy(bArr4, 0, bArr3, i14, bArr4.length);
                                    i14 += bArr4.length;
                                    i13++;
                                    query = cursor;
                                    sQLiteEventStore3 = sQLiteEventStore4;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            sQLiteEventStore = sQLiteEventStore3;
                            query.close();
                            subtreeManager.emitActionToParent = new EncodedPayload(encoding2, bArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = query;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        subtreeManager.contextForChildren = Integer.valueOf(cursor2.getInt(6));
                    }
                    if (!cursor2.isNull(8)) {
                        subtreeManager.children = Integer.valueOf(cursor2.getInt(8));
                    }
                    arrayList.add(new AutoValue_PersistedEvent(j, autoValue_TransportContext2, subtreeManager.m4005build()));
                    sQLiteEventStore3 = sQLiteEventStore;
                    i6 = 2;
                    i7 = 1;
                }
                return null;
            default:
                SQLiteEventStore sQLiteEventStore5 = (SQLiteEventStore) obj4;
                HashMap hashMap = (HashMap) obj3;
                UnleashContext unleashContext = (UnleashContext) obj2;
                ArrayList arrayList3 = (ArrayList) unleashContext.remoteAddress;
                Cursor cursor3 = (Cursor) obj;
                sQLiteEventStore5.getClass();
                while (cursor3.moveToNext()) {
                    String string5 = cursor3.getString(i8);
                    int i15 = cursor3.getInt(1);
                    LogEventDropped.Reason reason3 = LogEventDropped.Reason.REASON_UNKNOWN;
                    if (i15 != 0) {
                        if (i15 == 1) {
                            reason3 = LogEventDropped.Reason.MESSAGE_TOO_OLD;
                        } else if (i15 == 2) {
                            reason = reason2;
                            long j2 = cursor3.getLong(2);
                            if (hashMap.containsKey(string5)) {
                                hashMap.put(string5, new ArrayList());
                            }
                            ((List) hashMap.get(string5)).add(new LogEventDropped(j2, reason));
                            i2 = 6;
                            i3 = 5;
                            i4 = 4;
                            i5 = 3;
                            i8 = 0;
                        } else if (i15 == i5) {
                            reason3 = LogEventDropped.Reason.PAYLOAD_TOO_BIG;
                        } else if (i15 == i4) {
                            reason3 = LogEventDropped.Reason.MAX_RETRIES_REACHED;
                        } else if (i15 == i3) {
                            reason3 = LogEventDropped.Reason.INVALID_PAYLOD;
                        } else if (i15 == i2) {
                            reason3 = LogEventDropped.Reason.SERVER_ERROR;
                        } else {
                            Logging.d("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i15));
                        }
                    }
                    reason = reason3;
                    long j22 = cursor3.getLong(2);
                    if (hashMap.containsKey(string5)) {
                    }
                    ((List) hashMap.get(string5)).add(new LogEventDropped(j22, reason));
                    i2 = 6;
                    i3 = 5;
                    i4 = 4;
                    i5 = 3;
                    i8 = 0;
                }
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    int i16 = LogSourceMetrics.$r8$clinit;
                    new ArrayList();
                    arrayList3.add(new LogSourceMetrics((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long time = sQLiteEventStore5.wallClock.getTime();
                SQLiteDatabase db = sQLiteEventStore5.getDb();
                db.beginTransaction();
                try {
                    Cursor rawQuery = db.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        rawQuery.moveToNext();
                        TimeWindow timeWindow = new TimeWindow(rawQuery.getLong(0), time);
                        rawQuery.close();
                        db.setTransactionSuccessful();
                        db.endTransaction();
                        unleashContext.sessionId = timeWindow;
                        unleashContext.properties = new GlobalMetrics(new StorageMetrics(sQLiteEventStore5.getDb().compileStatement("PRAGMA page_size").simpleQueryForLong() * sQLiteEventStore5.getDb().compileStatement("PRAGMA page_count").simpleQueryForLong(), AutoValue_EventStoreConfig.DEFAULT.maxStorageSizeInBytes));
                        unleashContext.userId = (String) sQLiteEventStore5.packageName.get();
                        return new ClientMetrics((TimeWindow) unleashContext.sessionId, Collections.unmodifiableList(arrayList3), (GlobalMetrics) unleashContext.properties, (String) unleashContext.userId);
                    } catch (Throwable th3) {
                        rawQuery.close();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    db.endTransaction();
                    throw th4;
                }
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer) {
        int i = this.$r8$classId;
        Object obj = this.f$2;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (i) {
            case 1:
                VideoEncoderSession videoEncoderSession = (VideoEncoderSession) obj3;
                SurfaceRequest surfaceRequest = (SurfaceRequest) obj2;
                AutoValue_VideoEncoderConfig autoValue_VideoEncoderConfig = (AutoValue_VideoEncoderConfig) obj;
                try {
                    ZslControlImpl$$ExternalSyntheticLambda1 zslControlImpl$$ExternalSyntheticLambda1 = (ZslControlImpl$$ExternalSyntheticLambda1) videoEncoderSession.mVideoEncoderFactory;
                    Executor executor = (Executor) videoEncoderSession.mExecutor;
                    int i2 = surfaceRequest.mSessionType;
                    zslControlImpl$$ExternalSyntheticLambda1.getClass();
                    EncoderImpl encoderImpl = new EncoderImpl(executor, autoValue_VideoEncoderConfig, i2);
                    videoEncoderSession.mVideoEncoder = encoderImpl;
                    Encoder$EncoderInput encoder$EncoderInput = encoderImpl.mEncoderInput;
                    if (encoder$EncoderInput instanceof EncoderImpl.SurfaceInput) {
                        Surface surface = ((EncoderImpl.SurfaceInput) encoder$EncoderInput).getSurface();
                        videoEncoderSession.mActiveSurface = surface;
                        StringUtilsKt.d("VideoEncoderSession", "provide surface: " + surface);
                        surfaceRequest.provideSurface(surface, (Executor) videoEncoderSession.mSequentialExecutor, new Recorder$$ExternalSyntheticLambda17(videoEncoderSession, 2));
                        videoEncoderSession.mVideoEncoderState = 4;
                        callbackToFutureAdapter$Completer.set((EncoderImpl) videoEncoderSession.mVideoEncoder);
                    } else {
                        callbackToFutureAdapter$Completer.setException(new AssertionError("The EncoderInput of video isn't a SurfaceInput."));
                    }
                } catch (InvalidConfigException e) {
                    StringUtilsKt.e("VideoEncoderSession", "Unable to initialize video encoder.", e);
                    callbackToFutureAdapter$Completer.setException(e);
                }
                return "ConfigureVideoEncoderFuture " + videoEncoderSession;
            default:
                String str = (String) obj2;
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                callbackToFutureAdapter$Completer.addCancellationListener(new WorkerKt$$ExternalSyntheticLambda1(atomicBoolean, 1), DirectExecutor.INSTANCE);
                ((Executor) obj3).execute(new WorkerKt$$ExternalSyntheticLambda2(atomicBoolean, callbackToFutureAdapter$Completer, (Function0) obj, 1));
                return str;
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
    public RegularImmutableList create(int i, TrackGroup trackGroup, int[] iArr) {
        DefaultTrackSelector.Parameters parameters = (DefaultTrackSelector.Parameters) this.f$0;
        String str = (String) this.f$1;
        String str2 = (String) this.f$2;
        ImmutableList.Builder builder = ImmutableList.builder();
        for (int i2 = 0; i2 < trackGroup.length; i2++) {
            builder.m2032add((Object) new DefaultTrackSelector.TextTrackInfo(i, trackGroup, i2, parameters, iArr[i2], str, str2));
        }
        return builder.build();
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection
    public Object execute() {
        DefaultScheduler defaultScheduler = (DefaultScheduler) this.f$0;
        AutoValue_TransportContext autoValue_TransportContext = (AutoValue_TransportContext) this.f$1;
        AutoValue_EventInternal autoValue_EventInternal = (AutoValue_EventInternal) this.f$2;
        SQLiteEventStore sQLiteEventStore = defaultScheduler.eventStore;
        sQLiteEventStore.getClass();
        Priority priority = autoValue_TransportContext.priority;
        String str = autoValue_EventInternal.transportName;
        String str2 = autoValue_TransportContext.backendName;
        String concat = "TRuntime.".concat("SQLiteEventStore");
        if (Log.isLoggable(concat, 3)) {
            Log.d(concat, "Storing event with priority=" + priority + ", name=" + str + " for destination " + str2);
        }
        ((Long) sQLiteEventStore.inTransaction(new PreviewView$1$$ExternalSyntheticLambda2(12, sQLiteEventStore, autoValue_EventInternal, autoValue_TransportContext))).getClass();
        defaultScheduler.workScheduler.schedule(autoValue_TransportContext, 1, false);
        return null;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        GetCredentialException getCredentialUnknownException;
        CancellationSignal cancellationSignal = (CancellationSignal) this.f$0;
        Executor executor = (Executor) this.f$1;
        CredentialManagerCallback credentialManagerCallback = (CredentialManagerCallback) this.f$2;
        if (exc instanceof com.google.android.gms.identitycredentials.GetCredentialException) {
            SheetStateKt.toJetpackGetException(exc.getMessage(), null);
            throw null;
        }
        if (exc instanceof ApiException) {
            int i = ((ApiException) exc).mStatus.zza;
            getCredentialUnknownException = i == 16 ? new GetCredentialCancellationException(exc.getMessage()) : CredentialProviderController.retryables.contains(Integer.valueOf(i)) ? new GetCredentialInterruptedException(exc.getMessage()) : new GetCredentialUnknownException(Boxes$$ExternalSyntheticOutline1.m(exc, "Get digital credential failed, failure: "));
        } else {
            getCredentialUnknownException = new GetCredentialUnknownException(Boxes$$ExternalSyntheticOutline1.m(exc, "Get digital credential failed, failure: "));
        }
        CredentialProviderPlayServicesImpl.INSTANCE.getClass();
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return;
        }
        executor.execute(new ResponseUtils$Companion$$ExternalSyntheticLambda1(credentialManagerCallback, getCredentialUnknownException, 2));
    }

    public void onPageFinished() {
        BrazeInAppMessageManager.displayInAppMessage$lambda$12((IInAppMessageViewWrapper) this.f$0, (BrazeInAppMessageManager) this.f$1, (Activity) this.f$2);
    }

    @Override // com.knotapi.knot.interfaces.ScreenshotCallback
    public void onScreenshotReady(String str) {
        ScreenshotHelper.lambda$startScreenshotFlow$1((WebView) this.f$0, (KnotView) this.f$1, (String) this.f$2, str);
    }

    public void onSurfaceNotInUse() {
        PreviewView.AnonymousClass1 anonymousClass1 = (PreviewView.AnonymousClass1) this.f$0;
        PreviewStreamStateObserver previewStreamStateObserver = (PreviewStreamStateObserver) this.f$1;
        CameraInternal cameraInternal = (CameraInternal) this.f$2;
        AtomicReference atomicReference = ((PreviewView) anonymousClass1.this$0).mActiveStreamStateObserver;
        while (true) {
            if (atomicReference.compareAndSet(previewStreamStateObserver, null)) {
                previewStreamStateObserver.updatePreviewStreamState(PreviewView.StreamState.IDLE);
                break;
            } else if (atomicReference.get() != previewStreamStateObserver) {
                break;
            }
        }
        FutureChain futureChain = previewStreamStateObserver.mFlowFuture;
        if (futureChain != null) {
            futureChain.cancel(false);
            previewStreamStateObserver.mFlowFuture = null;
        }
        cameraInternal.getCameraState().removeObserver(previewStreamStateObserver);
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
    public void onTransformationInfoUpdate(AutoValue_SurfaceRequest_TransformationInfo autoValue_SurfaceRequest_TransformationInfo) {
        PreviewViewImplementation previewViewImplementation;
        PreviewView.AnonymousClass1 anonymousClass1 = (PreviewView.AnonymousClass1) this.f$0;
        CameraInternal cameraInternal = (CameraInternal) this.f$2;
        SurfaceRequest surfaceRequest = (SurfaceRequest) this.f$1;
        PreviewView previewView = (PreviewView) anonymousClass1.this$0;
        StringUtilsKt.d("PreviewView", "Preview transformation info updated. " + autoValue_SurfaceRequest_TransformationInfo);
        boolean z = cameraInternal.getCameraInfoInternal().getLensFacing() == 0;
        PreviewTransformation previewTransformation = previewView.mPreviewTransform;
        Size size = surfaceRequest.mResolution;
        previewTransformation.getClass();
        StringUtilsKt.d("PreviewTransform", "Transformation info set: " + autoValue_SurfaceRequest_TransformationInfo + " " + size + " " + z);
        previewTransformation.mSurfaceCropRect = autoValue_SurfaceRequest_TransformationInfo.getCropRect;
        previewTransformation.mPreviewRotationDegrees = autoValue_SurfaceRequest_TransformationInfo.getRotationDegrees;
        int i = autoValue_SurfaceRequest_TransformationInfo.getTargetRotation;
        previewTransformation.mTargetRotation = i;
        previewTransformation.mResolution = size;
        previewTransformation.mIsFrontCamera = z;
        previewTransformation.mHasCameraTransform = autoValue_SurfaceRequest_TransformationInfo.hasCameraTransform;
        previewTransformation.mSensorToBufferTransform = autoValue_SurfaceRequest_TransformationInfo.getSensorToBufferTransform;
        if (i == -1 || ((previewViewImplementation = previewView.mImplementation) != null && (previewViewImplementation instanceof SurfaceViewImplementation))) {
            previewView.mUseDisplayRotation = true;
        } else {
            previewView.mUseDisplayRotation = false;
        }
        previewView.redrawPreview();
    }

    public /* synthetic */ PreviewView$1$$ExternalSyntheticLambda2(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ PreviewView$1$$ExternalSyntheticLambda2(CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback credentialManagerCallback) {
        this.$r8$classId = 3;
        this.f$0 = cancellationSignal;
        this.f$1 = executor;
        this.f$2 = credentialManagerCallback;
    }
}
