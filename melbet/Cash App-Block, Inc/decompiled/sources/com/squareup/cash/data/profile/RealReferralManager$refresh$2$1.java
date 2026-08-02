package com.squareup.cash.data.profile;

import android.hardware.camera2.CaptureRequest;
import android.util.ArrayMap;
import android.util.Log;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.adapter.SessionConfigAdapter;
import androidx.camera.camera2.config.UseCaseGraphContext;
import androidx.camera.camera2.impl.CameraCallbackMap;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestTemplate;
import androidx.camera.core.impl.AutoValue_StreamSpec;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.MutableTagBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.TagBundle;
import androidx.media3.ui.PlayerControlView$$ExternalSyntheticLambda0;
import app.cash.api.ApiResult;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.data.contacts.RealContactSync$syncRequest$2;
import com.squareup.cash.db2.InstrumentQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.session.backend.TimeToLiveSyncState;
import com.squareup.preferences.BooleanPreference;
import com.squareup.protos.franklin.app.GetRewardStatusResponse;
import com.squareup.protos.franklin.common.RewardStatus;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;
import squareup.cash.overdraft.OverdraftStatus;
import timber.log.Timber;
import utils.StringUtilsKt;

/* loaded from: classes4.dex */
public final class RealReferralManager$refresh$2$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ boolean $force;
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object $result;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealReferralManager$refresh$2$1(ApiResult apiResult, RealReferralManager realReferralManager, boolean z, Continuation continuation) {
        super(1, continuation);
        this.$result = apiResult;
        this.this$0 = realReferralManager;
        this.$force = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.$r8$classId;
        Object obj = this.this$0;
        boolean z = this.$force;
        Object obj2 = this.$result;
        switch (i) {
            case 0:
                return new RealReferralManager$refresh$2$1((ApiResult) obj2, (RealReferralManager) obj, z, continuation);
            default:
                return new RealReferralManager$refresh$2$1((LinkedHashSet) obj2, z, (UseCaseCameraRequestControlImpl) obj, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((RealReferralManager$refresh$2$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0283, code lost:
    
        if (r11.join(r28) != r1) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0223, code lost:
    
        if (kotlin.Unit.INSTANCE == r1) goto L77;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        char c;
        int i = this.$r8$classId;
        Object obj2 = this.$result;
        Object obj3 = this.this$0;
        switch (i) {
            case 0:
                ApiResult apiResult = (ApiResult) obj2;
                RealReferralManager realReferralManager = (RealReferralManager) obj3;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!(apiResult instanceof ApiResult.Success)) {
                        if (!(apiResult instanceof ApiResult.Failure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        Timber.Forest.e("Failed to update reward status.", new Object[0]);
                        z = false;
                        TimeToLiveSyncState timeToLiveSyncState = realReferralManager.referralSyncState;
                        AppLockMonitor$special$$inlined$map$2 appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(Boolean.valueOf(z), 19);
                        JobImpl Job$default = JobKt.Job$default();
                        JobKt.launch$default(timeToLiveSyncState.scope, null, null, new RealContactSync$syncRequest$2.AnonymousClass1(timeToLiveSyncState, Job$default, this.$force, appLockMonitor$special$$inlined$map$2, null), 3);
                        this.label = 2;
                        break;
                    } else {
                        RewardStatus rewardStatus = ((GetRewardStatusResponse) ((ApiResult.Success) apiResult).response).reward_status;
                        z2 = true;
                        z2 = true;
                        if (rewardStatus != null) {
                            this.label = 1;
                            realReferralManager.queries.transactionWithWrapper(new InstrumentQueries$$ExternalSyntheticLambda0(z2 ? 1 : 0, rewardStatus, realReferralManager));
                            break;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    z2 = true;
                }
                RewardStatus rewardStatus2 = ((GetRewardStatusResponse) ((ApiResult.Success) apiResult).response).reward_status;
                if (rewardStatus2 != null) {
                    BooleanPreference booleanPreference = realReferralManager.shouldCallGetRewardStatus;
                    Boolean bool = rewardStatus2.code_entry_enabled;
                    Boolean bool2 = Boolean.TRUE;
                    booleanPreference.set((Intrinsics.areEqual(bool, bool2) || Intrinsics.areEqual(rewardStatus2.reward_screen_enabled, bool2)) ? z2 : false);
                }
                z = z2;
                TimeToLiveSyncState timeToLiveSyncState2 = realReferralManager.referralSyncState;
                AppLockMonitor$special$$inlined$map$2 appLockMonitor$special$$inlined$map$22 = new AppLockMonitor$special$$inlined$map$2(Boolean.valueOf(z), 19);
                JobImpl Job$default2 = JobKt.Job$default();
                JobKt.launch$default(timeToLiveSyncState2.scope, null, null, new RealContactSync$syncRequest$2.AnonymousClass1(timeToLiveSyncState2, Job$default2, this.$force, appLockMonitor$special$$inlined$map$22, null), 3);
                this.label = 2;
                break;
            default:
                UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = (UseCaseCameraRequestControlImpl) obj3;
                LinkedHashMap linkedHashMap = useCaseCameraRequestControlImpl.infoBundleMap;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                int i4 = 1;
                if (i3 != 0) {
                    if (i3 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    Log.d("CXCP", "UseCaseCameraRequestControlImpl: Building SessionConfig...");
                }
                SessionConfigAdapter sessionConfigAdapter = new SessionConfigAdapter((LinkedHashSet) obj2, this.$force);
                SessionConfig sessionConfig = ((SessionConfig.ValidatingBuilder) sessionConfigAdapter.validatingBuilder$delegate.getValue()).isValid() ? (SessionConfig) sessionConfigAdapter.sessionConfig$delegate.getValue() : null;
                if (sessionConfig == null) {
                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                        Log.d("CXCP", "Using default SessionConfig");
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    HashSet hashSet = new HashSet();
                    MutableOptionsBundle create = MutableOptionsBundle.create();
                    ArrayList arrayList = new ArrayList();
                    ArrayMap arrayMap = MutableTagBundle.create().mTagMap;
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    c = 0;
                    ArrayList arrayList5 = new ArrayList(linkedHashSet);
                    ArrayList arrayList6 = new ArrayList(arrayList2);
                    ArrayList arrayList7 = new ArrayList(arrayList3);
                    ArrayList arrayList8 = new ArrayList(arrayList4);
                    ArrayList arrayList9 = new ArrayList(hashSet);
                    OptionsBundle from = OptionsBundle.from(create);
                    ArrayList arrayList10 = new ArrayList(arrayList);
                    TagBundle tagBundle = TagBundle.EMPTY_TAGBUNDLE;
                    ArrayMap arrayMap2 = new ArrayMap();
                    for (String str : arrayMap.keySet()) {
                        arrayMap2.put(str, arrayMap.get(str));
                    }
                    i4 = 1;
                    sessionConfig = new SessionConfig(arrayList5, arrayList6, arrayList7, arrayList8, new CaptureConfig(arrayList9, from, 1, arrayList10, new TagBundle(arrayMap2)), null, null, 0, null);
                } else {
                    c = 0;
                }
                CaptureConfig captureConfig = sessionConfig.mRepeatingCaptureConfig;
                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    Log.d("CXCP", "UseCaseCameraRequestControlImpl: SessionConfig built. Updating state...");
                }
                UseCaseCameraRequestControl.Type type2 = UseCaseCameraRequestControl.Type.SESSION_CONFIG;
                CompletableDeferredImpl completableDeferredImpl = UseCaseCameraRequestControlImpl.submitFailedResult;
                PlayerControlView$$ExternalSyntheticLambda0 playerControlView$$ExternalSyntheticLambda0 = useCaseCameraRequestControlImpl.threads.sequentialExecutor;
                Toolbar.AnonymousClass1 anonymousClass1 = new Toolbar.AnonymousClass1(5);
                if (!captureConfig.getExpectedFrameRateRange().equals(AutoValue_StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
                    CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
                    key.getClass();
                    ((MutableOptionsBundle) anonymousClass1.this$0).insertOption(OverdraftStatus.State_.createCaptureRequestOption(key), captureConfig.getExpectedFrameRateRange());
                }
                anonymousClass1.insertAllOptions(captureConfig.mImplementationOptions);
                TagBundle tagBundle2 = captureConfig.mTagBundle;
                tagBundle2.getClass();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                ArrayMap arrayMap3 = tagBundle2.mTagMap;
                Set<String> keySet = arrayMap3.keySet();
                keySet.getClass();
                for (String str2 : keySet) {
                    Object obj4 = arrayMap3.get(str2);
                    obj4.getClass();
                    linkedHashMap2.put(str2, obj4);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
                playerControlView$$ExternalSyntheticLambda0.getClass();
                List list = captureConfig.mCameraCaptureCallbacks;
                list.getClass();
                CameraCallbackMap cameraCallbackMap = new CameraCallbackMap();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    cameraCallbackMap.addCaptureCallback((CameraCaptureCallback) it.next(), playerControlView$$ExternalSyntheticLambda0);
                }
                Request.Listener[] listenerArr = new Request.Listener[1];
                listenerArr[c] = cameraCallbackMap;
                linkedHashMap.put(type2, new UseCaseCameraRequestControlImpl.InfoBundle(anonymousClass1, linkedHashMap3, SetsKt__SetsKt.mutableSetOf(listenerArr), new RequestTemplate(captureConfig.mTemplateType)));
                UseCaseGraphContext useCaseGraphContext = useCaseCameraRequestControlImpl.useCaseGraphContext;
                List unmodifiableList = Collections.unmodifiableList(captureConfig.mSurfaces);
                unmodifiableList.getClass();
                LinkedHashSet streamIdsFromSurfaces = useCaseGraphContext.getStreamIdsFromSurfaces(unmodifiableList);
                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    Log.d("CXCP", "UseCaseCameraRequestControlImpl: State update processing.");
                }
                UseCaseCameraRequestControlImpl.InfoBundle merge = UseCaseCameraRequestControlImpl.merge(linkedHashMap);
                this.label = i4;
                Object updateCameraStateAsync = useCaseCameraRequestControlImpl.updateCameraStateAsync(merge, streamIdsFromSurfaces, this);
                return updateCameraStateAsync == coroutineSingletons2 ? coroutineSingletons2 : updateCameraStateAsync;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealReferralManager$refresh$2$1(LinkedHashSet linkedHashSet, boolean z, UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, Continuation continuation) {
        super(1, continuation);
        this.$result = linkedHashSet;
        this.$force = z;
        this.this$0 = useCaseCameraRequestControlImpl;
    }
}
