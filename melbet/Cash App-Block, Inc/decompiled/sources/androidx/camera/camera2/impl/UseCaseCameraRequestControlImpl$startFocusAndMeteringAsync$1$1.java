package androidx.camera.camera2.impl;

import android.util.Log;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.Lock3ABehavior;
import androidx.camera.camera2.pipe.graph.CameraGraphImpl;
import androidx.camera.camera2.pipe.graph.CameraGraphSessionImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Deferred;
import okhttp3.Cache;
import papa.SafeTrace;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class UseCaseCameraRequestControlImpl$startFocusAndMeteringAsync$1$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ List $aeRegions;
    public final /* synthetic */ Lock3ABehavior $afLockBehavior;
    public final /* synthetic */ List $afRegions;
    public final /* synthetic */ AeMode $afTriggerStartAeMode;
    public final /* synthetic */ List $awbRegions;
    public final /* synthetic */ long $timeLimitNs;
    public long J$0;
    public Object L$0;
    public List L$1;
    public List L$2;
    public Lock3ABehavior L$4;
    public AeMode L$6;
    public int label;
    public final /* synthetic */ UseCaseCameraRequestControlImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UseCaseCameraRequestControlImpl$startFocusAndMeteringAsync$1$1(UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, List list, List list2, List list3, Lock3ABehavior lock3ABehavior, AeMode aeMode, long j, Continuation continuation) {
        super(1, continuation);
        this.this$0 = useCaseCameraRequestControlImpl;
        this.$aeRegions = list;
        this.$afRegions = list2;
        this.$awbRegions = list3;
        this.$afLockBehavior = lock3ABehavior;
        this.$afTriggerStartAeMode = aeMode;
        this.$timeLimitNs = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new UseCaseCameraRequestControlImpl$startFocusAndMeteringAsync$1$1(this.this$0, this.$aeRegions, this.$afRegions, this.$awbRegions, this.$afLockBehavior, this.$afTriggerStartAeMode, this.$timeLimitNs, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((UseCaseCameraRequestControlImpl$startFocusAndMeteringAsync$1$1) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00f2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        int i;
        String str2;
        List list;
        AeMode aeMode;
        Object acquireSession;
        Lock3ABehavior lock3ABehavior;
        List list2;
        boolean z;
        List list3;
        long j;
        AutoCloseable autoCloseable;
        AutoCloseable autoCloseable2;
        Throwable th;
        AutoCloseable autoCloseable3;
        CameraGraphSessionImpl cameraGraphSessionImpl;
        Object m84lock3AtS25XM$default;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        try {
            try {
                try {
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "UseCaseCameraRequestControlImpl#startFocusAndMeteringAsync");
                        }
                        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.this$0;
                        List list4 = this.$aeRegions;
                        List list5 = this.$afRegions;
                        list = this.$awbRegions;
                        Lock3ABehavior lock3ABehavior2 = this.$afLockBehavior;
                        aeMode = this.$afTriggerStartAeMode;
                        long j2 = this.$timeLimitNs;
                        try {
                            CameraGraphImpl graph = useCaseCameraRequestControlImpl.useCaseGraphContext.getGraph();
                            this.L$0 = list4;
                            this.L$1 = list5;
                            this.L$2 = list;
                            this.L$4 = lock3ABehavior2;
                            this.L$6 = aeMode;
                            this.J$0 = j2;
                            this.label = 1;
                            acquireSession = graph.acquireSession(this);
                            if (acquireSession == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            lock3ABehavior = lock3ABehavior2;
                            list2 = list5;
                            z = 3;
                            list3 = list4;
                            j = j2;
                        } catch (CancellationException e) {
                            e = e;
                            str2 = "CXCP";
                            str = str2;
                            i = 3;
                            if (StringUtilsKt.isLogLevelEnabled(i, str)) {
                            }
                            return UseCaseCameraRequestControlImpl.submitFailedResult;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            autoCloseable3 = (AutoCloseable) this.L$0;
                            try {
                                SafeTrace.throwOnFailure(obj);
                                m84lock3AtS25XM$default = obj;
                                str2 = "CXCP";
                            } catch (Throwable th2) {
                                th = th2;
                                str2 = "CXCP";
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    Cache.Companion.closeFinally(autoCloseable3, th);
                                    throw th3;
                                }
                            }
                            try {
                                Deferred deferred = (Deferred) m84lock3AtS25XM$default;
                                Cache.Companion.closeFinally(autoCloseable3, null);
                                return deferred;
                            } catch (Throwable th4) {
                                th = th4;
                                throw th;
                            }
                        }
                        long j3 = this.J$0;
                        AeMode aeMode2 = this.L$6;
                        lock3ABehavior = this.L$4;
                        list = this.L$2;
                        List list6 = this.L$1;
                        List list7 = (List) this.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            z = 3;
                            list3 = list7;
                            acquireSession = obj;
                            aeMode = aeMode2;
                            list2 = list6;
                            j = j3;
                        } catch (CancellationException e2) {
                            e = e2;
                            i = 3;
                            str = "CXCP";
                            if (StringUtilsKt.isLogLevelEnabled(i, str)) {
                                Log.d(str, "Cannot acquire the CameraGraph.Session", e);
                            }
                            return UseCaseCameraRequestControlImpl.submitFailedResult;
                        }
                    }
                    m84lock3AtS25XM$default = CameraGraphSessionImpl.m84lock3AtS25XM$default(cameraGraphSessionImpl, list3, list2, list, null, lock3ABehavior, null, aeMode, null, j, j, this, 7175);
                    if (m84lock3AtS25XM$default != coroutineSingletons) {
                        autoCloseable3 = autoCloseable2;
                        Deferred deferred2 = (Deferred) m84lock3AtS25XM$default;
                        Cache.Companion.closeFinally(autoCloseable3, null);
                        return deferred2;
                    }
                    return coroutineSingletons;
                } catch (Throwable th5) {
                    th = th5;
                    th = th;
                    autoCloseable3 = autoCloseable2;
                    throw th;
                }
                cameraGraphSessionImpl = (CameraGraphSessionImpl) autoCloseable;
                this.L$0 = autoCloseable;
                this.L$1 = null;
                this.L$2 = null;
                this.L$4 = null;
                this.L$6 = null;
                this.label = 2;
                autoCloseable2 = autoCloseable;
                str2 = "CXCP";
            } catch (Throwable th6) {
                th = th6;
                str2 = "CXCP";
                autoCloseable2 = autoCloseable;
            }
            autoCloseable = (AutoCloseable) acquireSession;
        } catch (CancellationException e3) {
            e = e3;
        }
    }
}
