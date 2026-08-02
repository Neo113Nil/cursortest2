package androidx.glance.session;

import android.graphics.Bitmap;
import android.hardware.camera2.CameraDevice;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import androidx.camera.camera2.pipe.compat.CaptureSessionState;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.api.ApiResult;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.molecule.MoleculeKt$$ExternalSyntheticLambda1;
import com.bugsnag.android.TraceParser;
import com.squareup.cash.boost.backend.RealBoostConfigManager;
import com.squareup.cash.card.onboarding.core.HeatMaskRenderer;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticLambda10;
import com.squareup.cash.graphics.swampgl.Engine;
import com.squareup.cash.graphics.swampgl.EngineSurfaceViewTarget;
import com.squareup.cash.work.tinygraph.EntityStore;
import com.squareup.cash.work.tinygraph.job.JobDao;
import com.squareup.cash.work.tinygraph.models.EntityReference;
import com.squareup.cash.work.tinygraph.models.EntityType;
import com.squareup.cash.work.tinygraph.models.IBaseEntity;
import com.squareup.cash.work.tinygraph.models.Job;
import com.squareup.cash.work.tinygraph.models.Merchant;
import com.squareup.cash.work.tinygraph.models.Person;
import com.squareup.cash.work.tinygraph.models.Setting;
import com.squareup.cash.work.tinygraph.real.RealJobRepository;
import com.squareup.cash.work.tinygraph.real.RealMerchantRepository;
import com.squareup.cash.work.tinygraph.real.RealPersonRepository;
import com.squareup.cash.work.tinygraph.real.RealSettingRepository;
import com.squareup.cash.work.tinygraph.setting.SettingDao;
import com.squareup.protos.franklin.app.GetBoostConfigResponse;
import com.squareup.workflow1.internal.SubtreeManager;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager;
import com.withpersona.sdk2.inquiry.internal.InquiryState;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Output;
import com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import dev.chrisbanes.haze.Pool;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final class SessionWorker$doWork$2$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ Object $$this$withTimerOrNull;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SessionWorker$doWork$2$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.$$this$withTimerOrNull = obj;
        this.this$0 = obj2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.$r8$classId;
        Object obj = this.this$0;
        Object obj2 = this.$$this$withTimerOrNull;
        switch (i) {
            case 0:
                return new SessionWorker$doWork$2$1((TimerScopeKt$withTimer$2$1$blockScope$1) obj2, (SessionWorker) obj, continuation, 0);
            case 1:
                return new SessionWorker$doWork$2$1((CameraDevice) obj2, (Ref$BooleanRef) obj, continuation, 1);
            case 2:
                return new SessionWorker$doWork$2$1((CaptureSessionState) obj2, (CaptureSessionState.ConfiguredCameraCaptureSession) obj, continuation, 2);
            case 3:
                return new SessionWorker$doWork$2$1((CaptureSessionState) obj2, (TraceParser) obj, continuation, 3);
            case 4:
                return new SessionWorker$doWork$2$1((ApiResult) obj2, (RealBoostConfigManager) obj, continuation, 4);
            case 5:
                return new SessionWorker$doWork$2$1((HeatMaskRenderer) obj2, (Bitmap) obj, continuation, 5);
            case 6:
                return new SessionWorker$doWork$2$1((EngineSurfaceViewTarget) obj2, (EGLSurface) obj, continuation, 6);
            case 7:
                return new SessionWorker$doWork$2$1((RealJobRepository) obj2, (String) obj, continuation, 7);
            case 8:
                return new SessionWorker$doWork$2$1((RealJobRepository) obj2, (ArrayList) obj, continuation, 8);
            case 9:
                return new SessionWorker$doWork$2$1((RealMerchantRepository) obj2, (String) obj, continuation, 9);
            case 10:
                return new SessionWorker$doWork$2$1((RealPersonRepository) obj2, (String) obj, continuation, 10);
            case 11:
                return new SessionWorker$doWork$2$1((RealSettingRepository) obj2, (String) obj, continuation, 11);
            case 12:
                return new SessionWorker$doWork$2$1((DocumentStepStateManager) obj2, (String) obj, continuation, 12);
            case 13:
                return new SessionWorker$doWork$2$1((DocumentStepStateManager) obj2, (DocumentWorkflow.State.UploadState.UploadFiles) obj, continuation, 13);
            default:
                return new SessionWorker$doWork$2$1((InquiryStateManager) obj2, (InquiryState.Complete) obj, continuation, 14);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((SessionWorker$doWork$2$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        int i2 = 1;
        Object obj2 = this.$$this$withTimerOrNull;
        Object obj3 = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((TimerScopeKt$withTimer$2$1$blockScope$1) obj2).m1129startTimerLRDsOJo(((SessionWorker) obj3).timeouts.idleTimeout);
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CameraDevice cameraDevice = (CameraDevice) obj2;
                if (cameraDevice != null) {
                    Log.i("CXCP", "Closing Camera " + cameraDevice.getId());
                    String str = "CXCP#CameraDevice-" + cameraDevice.getId() + "#close";
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    try {
                        Trace.beginSection(str);
                        try {
                            cameraDevice.close();
                        } catch (NullPointerException e) {
                            Log.w("CXCP", "NPE encountered during CameraDevice.close()", e);
                        }
                        Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / 1000000.0d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(str, " - ")));
                    } catch (Throwable th) {
                        Log.d("CXCP", CameraState$Type$EnumUnboxingLocalUtility.m(new Object[]{Double.valueOf(CameraState$Type$EnumUnboxingLocalUtility.m(elapsedRealtimeNanos) / 1000000.0d)}, 1, (Locale) null, "%.3f ms", Recorder$$ExternalSyntheticOutline2.m108m(str, " - ")));
                        throw th;
                    }
                }
                ((Ref$BooleanRef) obj3).element = true;
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                StringBuilder sb = new StringBuilder();
                CaptureSessionState captureSessionState = (CaptureSessionState) obj2;
                sb.append(captureSessionState);
                sb.append(" CameraCaptureSessionWrapper#close");
                CaptureSessionState.ConfiguredCameraCaptureSession configuredCameraCaptureSession = (CaptureSessionState.ConfiguredCameraCaptureSession) obj3;
                try {
                    Trace.beginSection(sb.toString());
                    Log.d("CXCP", "Closing capture session for " + captureSessionState);
                    CameraState$Type$EnumUnboxingLocalUtility.m(configuredCameraCaptureSession.session);
                    Trace.endSection();
                    return Unit.INSTANCE;
                } finally {
                }
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                StringBuilder sb2 = new StringBuilder();
                CaptureSessionState captureSessionState2 = (CaptureSessionState) obj2;
                sb2.append(captureSessionState2);
                sb2.append(" stopRepeating");
                TraceParser traceParser = (TraceParser) obj3;
                try {
                    Trace.beginSection(sb2.toString());
                    traceParser.stopRepeating$camera_camera2_pipe();
                    Trace.endSection();
                    try {
                        Trace.beginSection(captureSessionState2 + " abortCaptures");
                        traceParser.abortCaptures$camera_camera2_pipe();
                        Trace.endSection();
                        return Unit.INSTANCE;
                    } finally {
                    }
                } finally {
                }
            case 4:
                RealBoostConfigManager realBoostConfigManager = (RealBoostConfigManager) obj3;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ApiResult apiResult = (ApiResult) obj2;
                if (apiResult instanceof ApiResult.Success) {
                    GetBoostConfigResponse getBoostConfigResponse = (GetBoostConfigResponse) ((ApiResult.Success) apiResult).response;
                    Timber.Forest.d("Updated boost config: " + getBoostConfigResponse, new Object[0]);
                    LocalTabContentQueries localTabContentQueries = realBoostConfigManager.boostConfigQueries;
                    localTabContentQueries.driver.execute(1352430653, "UPDATE boostConfig\nSET expirationHintThresholdBps = ?,\n    bitcoinBoostUpsell = ?", new MoleculeKt$$ExternalSyntheticLambda1(4, getBoostConfigResponse.boost_expiration_hint_threshold_basis_points, getBoostConfigResponse.btc_boost_upsell, localTabContentQueries));
                    localTabContentQueries.notifyQueries(1352430653, new Matcher$$ExternalSyntheticLambda10(i2));
                    realBoostConfigManager.lastUpdated = realBoostConfigManager.clock.millis();
                } else {
                    Timber.Forest.e("Failed to update boost config.", new Object[0]);
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                HeatMaskRenderer heatMaskRenderer = (HeatMaskRenderer) obj2;
                heatMaskRenderer.initialize();
                Bitmap bitmap = (Bitmap) obj3;
                if (bitmap != null) {
                    heatMaskRenderer.renderBitmapToHeatMask(bitmap);
                }
                return Unit.INSTANCE;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Engine engine = ((EngineSurfaceViewTarget) obj2).engine;
                engine.restoreSurfacelessCurrent();
                EGLSurface eGLSurface = (EGLSurface) obj3;
                if (eGLSurface != null) {
                    EGLSurface eGLSurface2 = eGLSurface.equals(EGL14.EGL_NO_SURFACE) ? null : eGLSurface;
                    if (eGLSurface2 != null) {
                        EGL14.eglDestroySurface(engine.eglDisplay, eGLSurface2);
                        Timber.Forest forest = Timber.Forest;
                        forest.tag("EngineSurfaceViewTarget");
                        forest.d("EGL surface destroyed", new Object[0]);
                    }
                }
                Timber.Forest forest2 = Timber.Forest;
                forest2.tag("EngineSurfaceViewTarget");
                forest2.d("Surface destroyed", new Object[0]);
                return Unit.INSTANCE;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JobDao jobDao = ((RealJobRepository) obj2).dao;
                String str2 = (String) obj3;
                jobDao.getClass();
                str2.getClass();
                IBaseEntity byId = jobDao.entityStore.getById(str2);
                if (byId instanceof Job) {
                    return (Job) byId;
                }
                return null;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JobDao jobDao2 = ((RealJobRepository) obj2).dao;
                jobDao2.getClass();
                ArrayList arrayList = new ArrayList();
                for (String str3 : (ArrayList) obj3) {
                    str3.getClass();
                    IBaseEntity byId2 = jobDao2.entityStore.getById(str3);
                    Job job = byId2 instanceof Job ? (Job) byId2 : null;
                    if (job != null) {
                        arrayList.add(job);
                    }
                }
                return arrayList;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Pool pool = ((RealMerchantRepository) obj2).dao;
                String str4 = (String) obj3;
                pool.getClass();
                str4.getClass();
                IBaseEntity byId3 = ((EntityStore) pool.pool).getById(str4);
                if (byId3 instanceof Merchant) {
                    return (Merchant) byId3;
                }
                return null;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JobDao jobDao3 = ((RealPersonRepository) obj2).dao;
                String str5 = (String) obj3;
                jobDao3.getClass();
                str5.getClass();
                IBaseEntity byId4 = jobDao3.entityStore.getById(str5);
                if (byId4 instanceof Person) {
                    return (Person) byId4;
                }
                return null;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                SettingDao settingDao = ((RealSettingRepository) obj2).dao;
                String str6 = (String) obj3;
                settingDao.getClass();
                str6.getClass();
                List<IBaseEntity> allByType = settingDao.entityStore.getAllByType(EntityType.SETTINGS);
                ArrayList arrayList2 = new ArrayList();
                for (IBaseEntity iBaseEntity : allByType) {
                    Setting setting = iBaseEntity instanceof Setting ? (Setting) iBaseEntity : null;
                    if (setting != null) {
                        arrayList2.add(setting);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    EntityReference entityReference = ((Setting) next).merchantId;
                    if (Intrinsics.areEqual(entityReference != null ? entityReference.id : null, str6)) {
                        arrayList3.add(next);
                    }
                }
                return arrayList3;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                SubtreeManager subtreeManager = (SubtreeManager) ((DocumentStepStateManager) obj2).lastChild;
                WorkflowState state = subtreeManager.getState();
                DocumentWorkflow.State.ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId = state instanceof DocumentWorkflow.State.ReviewCapturesWithoutDocumentId ? (DocumentWorkflow.State.ReviewCapturesWithoutDocumentId) state : null;
                if (reviewCapturesWithoutDocumentId == null) {
                    return Unit.INSTANCE;
                }
                subtreeManager.updateState(new DocumentWorkflow.State.ReviewCaptures(reviewCapturesWithoutDocumentId.documents, (String) obj3, new DocumentWorkflow.State.UploadState.UploadFiles((String) obj3), false, reviewCapturesWithoutDocumentId.error, 116));
                return Unit.INSTANCE;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                SubtreeManager subtreeManager2 = (SubtreeManager) ((DocumentStepStateManager) obj2).lastChild;
                DocumentWorkflow.State state2 = (DocumentWorkflow.State) subtreeManager2.getState();
                if (state2 == null) {
                    return Unit.INSTANCE;
                }
                subtreeManager2.updateState(DocumentWorkflow.State.copyWithUploadState$document_release$default(state2, new DocumentWorkflow.State.UploadState.ReadyToSubmit(((DocumentWorkflow.State.UploadState.UploadFiles) obj3).documentId), null, null, null, 14));
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                InquiryState.Complete complete = (InquiryState.Complete) obj3;
                ((InquiryStateManager) obj2).setOutput(new InquiryWorkflow$Output.Complete(complete.inquiryId, complete.inquiryStatus, complete.sessionToken, complete.redirectUri, complete.fields));
                return Unit.INSTANCE;
        }
    }
}
