package androidx.glance.appwidget;

import android.content.Context;
import android.util.Log;
import androidx.camera.camera2.impl.StillCaptureRequestControl;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.paging.PageFetcher$flow$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.n3$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.qrcodes.widget.CashQrWidget;
import com.squareup.cash.ui.qrcodes.widget.CashQrWidgetReceiver;
import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.cameraScreen.BasicGovIdCaptureViewController;
import com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidCameraBinding;
import java.io.File;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import papa.SafeTrace;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class GlanceAppWidgetReceiver$onDeleted$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $appWidgetIds;
    public Object $context;
    public final /* synthetic */ int $r8$classId = 0;
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidgetReceiver$onDeleted$1(ArrayList arrayList, int i, int i2, CompletableDeferredImpl completableDeferredImpl, StillCaptureRequestControl stillCaptureRequestControl, Continuation continuation) {
        super(2, continuation);
        this.L$2 = arrayList;
        this.I$1 = i;
        this.label = i2;
        this.$context = completableDeferredImpl;
        this.$appWidgetIds = stillCaptureRequestControl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$appWidgetIds;
        switch (i) {
            case 0:
                GlanceAppWidgetReceiver$onDeleted$1 glanceAppWidgetReceiver$onDeleted$1 = new GlanceAppWidgetReceiver$onDeleted$1((CashQrWidgetReceiver) this.this$0, (Context) this.$context, (int[]) obj2, continuation);
                glanceAppWidgetReceiver$onDeleted$1.L$0 = obj;
                return glanceAppWidgetReceiver$onDeleted$1;
            case 1:
                return new GlanceAppWidgetReceiver$onDeleted$1((ArrayList) this.L$2, this.I$1, this.label, (CompletableDeferredImpl) this.$context, (StillCaptureRequestControl) obj2, continuation);
            default:
                return new GlanceAppWidgetReceiver$onDeleted$1((Screen.CameraScreen) this.L$0, (CameraScreenRunner) obj2, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((GlanceAppWidgetReceiver$onDeleted$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0110, code lost:
    
        if (r4 == r0) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006a  */
    /* JADX WARN: Type inference failed for: r0v16, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0063 -> B:7:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x01df -> B:65:0x01e3). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int[] iArr;
        CashQrWidgetReceiver cashQrWidgetReceiver;
        Context context;
        int length;
        int i;
        StillCaptureRequestControl.CaptureRequest captureRequest;
        UseCaseCameraRequestControl useCaseCameraRequestControl;
        Object awaitSurfaceSetup;
        MutexImpl mutexImpl;
        StillCaptureRequestControl.CaptureRequest captureRequest2;
        Object access$submitRequest;
        StillCaptureRequestControl.CaptureRequest captureRequest3;
        UseCaseCameraRequestControl useCaseCameraRequestControl2;
        int i2;
        ArrayList arrayList;
        Screen.CameraScreen cameraScreen;
        CameraScreenRunner cameraScreenRunner;
        int i3 = this.$r8$classId;
        int i4 = 0;
        Object obj2 = this.$appWidgetIds;
        switch (i3) {
            case 0:
                Context context2 = (Context) this.$context;
                CashQrWidgetReceiver cashQrWidgetReceiver2 = (CashQrWidgetReceiver) this.this$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    JobKt.launch$default((CoroutineScope) this.L$0, null, null, new PageFetcher$flow$1(context2, cashQrWidgetReceiver2, null, 11), 3);
                    iArr = (int[]) obj2;
                    cashQrWidgetReceiver = cashQrWidgetReceiver2;
                    context = context2;
                    length = iArr.length;
                    i = 0;
                    CashQrWidgetReceiver cashQrWidgetReceiver3 = cashQrWidgetReceiver;
                    if (i < length) {
                    }
                } else {
                    if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    length = this.I$1;
                    int i6 = this.I$0;
                    Context context3 = (Context) this.L$2;
                    CashQrWidgetReceiver cashQrWidgetReceiver4 = (CashQrWidgetReceiver) this.L$1;
                    iArr = (int[]) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    cashQrWidgetReceiver = cashQrWidgetReceiver4;
                    i = i6 + 1;
                    context = context3;
                    CashQrWidgetReceiver cashQrWidgetReceiver32 = cashQrWidgetReceiver;
                    if (i < length) {
                        int i7 = iArr[i];
                        CashQrWidget cashQrWidget = cashQrWidgetReceiver32.glanceAppWidget;
                        this.L$0 = iArr;
                        this.L$1 = cashQrWidgetReceiver32;
                        this.L$2 = context;
                        this.I$0 = i;
                        this.I$1 = length;
                        this.label = 1;
                        if (cashQrWidget.deleted$glance_appwidget_release(context, i7, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        context3 = context;
                        i6 = i;
                        cashQrWidgetReceiver4 = cashQrWidgetReceiver32;
                        cashQrWidgetReceiver = cashQrWidgetReceiver4;
                        i = i6 + 1;
                        context = context3;
                        CashQrWidgetReceiver cashQrWidgetReceiver322 = cashQrWidgetReceiver;
                        if (i < length) {
                            return Unit.INSTANCE;
                        }
                    }
                }
            case 1:
                StillCaptureRequestControl stillCaptureRequestControl = (StillCaptureRequestControl) obj2;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.I$0;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    captureRequest = new StillCaptureRequestControl.CaptureRequest((ArrayList) this.L$2, this.I$1, this.label, (CompletableDeferredImpl) this.$context);
                    useCaseCameraRequestControl = stillCaptureRequestControl._requestControl;
                    if (useCaseCameraRequestControl != null) {
                        this.L$1 = captureRequest;
                        this.L$0 = useCaseCameraRequestControl;
                        this.I$0 = 1;
                        awaitSurfaceSetup = useCaseCameraRequestControl.awaitSurfaceSetup(this);
                        break;
                    }
                    mutexImpl = stillCaptureRequestControl.mutex;
                    this.L$1 = captureRequest;
                    this.L$0 = mutexImpl;
                    this.this$0 = stillCaptureRequestControl;
                    this.I$0 = 3;
                    if (mutexImpl.lock(this) != coroutineSingletons2) {
                        captureRequest2 = captureRequest;
                        stillCaptureRequestControl.pendingRequests.add(captureRequest2);
                        mutexImpl.unlock(null);
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                        }
                        return Unit.INSTANCE;
                    }
                    return coroutineSingletons2;
                }
                if (i8 != 1) {
                    if (i8 == 2) {
                        stillCaptureRequestControl = (StillCaptureRequestControl) this.this$0;
                        UseCaseCameraRequestControl useCaseCameraRequestControl3 = (UseCaseCameraRequestControl) this.L$0;
                        StillCaptureRequestControl.CaptureRequest captureRequest4 = (StillCaptureRequestControl.CaptureRequest) this.L$1;
                        SafeTrace.throwOnFailure(obj);
                        captureRequest3 = captureRequest4;
                        access$submitRequest = obj;
                        useCaseCameraRequestControl2 = useCaseCameraRequestControl3;
                        StillCaptureRequestControl stillCaptureRequestControl2 = stillCaptureRequestControl;
                        Deferred deferred = (Deferred) access$submitRequest;
                        if (useCaseCameraRequestControl2 != null) {
                            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                            return null;
                        }
                        stillCaptureRequestControl2.getClass();
                        deferred.invokeOnCompletion(new n3$$ExternalSyntheticLambda0(stillCaptureRequestControl2, deferred, captureRequest3, useCaseCameraRequestControl2, 1));
                        return Unit.INSTANCE;
                    }
                    if (i8 != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    stillCaptureRequestControl = (StillCaptureRequestControl) this.this$0;
                    ?? r0 = (Mutex) this.L$0;
                    captureRequest2 = (StillCaptureRequestControl.CaptureRequest) this.L$1;
                    SafeTrace.throwOnFailure(obj);
                    mutexImpl = r0;
                    try {
                        stillCaptureRequestControl.pendingRequests.add(captureRequest2);
                        mutexImpl.unlock(null);
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "StillCaptureRequestControl: useCaseCamera is null, " + captureRequest2 + " will be retried with a future UseCaseCamera");
                        }
                        return Unit.INSTANCE;
                    } catch (Throwable th) {
                        mutexImpl.unlock(null);
                        throw th;
                    }
                }
                UseCaseCameraRequestControl useCaseCameraRequestControl4 = (UseCaseCameraRequestControl) this.L$0;
                StillCaptureRequestControl.CaptureRequest captureRequest5 = (StillCaptureRequestControl.CaptureRequest) this.L$1;
                SafeTrace.throwOnFailure(obj);
                useCaseCameraRequestControl = useCaseCameraRequestControl4;
                captureRequest = captureRequest5;
                awaitSurfaceSetup = obj;
                if (((Boolean) awaitSurfaceSetup).booleanValue()) {
                    if (useCaseCameraRequestControl == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return null;
                    }
                    this.L$1 = captureRequest;
                    this.L$0 = useCaseCameraRequestControl;
                    this.this$0 = stillCaptureRequestControl;
                    this.I$0 = 2;
                    access$submitRequest = StillCaptureRequestControl.access$submitRequest(stillCaptureRequestControl, captureRequest, useCaseCameraRequestControl, this);
                    if (access$submitRequest != coroutineSingletons2) {
                        captureRequest3 = captureRequest;
                        useCaseCameraRequestControl2 = useCaseCameraRequestControl;
                        StillCaptureRequestControl stillCaptureRequestControl22 = stillCaptureRequestControl;
                        Deferred deferred2 = (Deferred) access$submitRequest;
                        if (useCaseCameraRequestControl2 != null) {
                        }
                    }
                    return coroutineSingletons2;
                }
                mutexImpl = stillCaptureRequestControl.mutex;
                this.L$1 = captureRequest;
                this.L$0 = mutexImpl;
                this.this$0 = stillCaptureRequestControl;
                this.I$0 = 3;
                if (mutexImpl.lock(this) != coroutineSingletons2) {
                }
                return coroutineSingletons2;
            default:
                Screen.CameraScreen cameraScreen2 = (Screen.CameraScreen) this.L$0;
                CameraScreenRunner cameraScreenRunner2 = (CameraScreenRunner) obj2;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    i2 = cameraScreen2.remainingCaptureCount;
                    arrayList = new ArrayList(i2);
                    cameraScreen = cameraScreen2;
                    cameraScreenRunner = cameraScreenRunner2;
                    if (i4 < i2) {
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i4 = this.I$1;
                    i2 = this.I$0;
                    arrayList = (ArrayList) this.$context;
                    ArrayList arrayList2 = (ArrayList) this.L$2;
                    cameraScreen = (Screen.CameraScreen) this.this$0;
                    cameraScreenRunner = (CameraScreenRunner) this.L$1;
                    SafeTrace.throwOnFailure(obj);
                    Object mo4085takePictureIoAF18A = ((Result) obj).value;
                    Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(mo4085takePictureIoAF18A);
                    if (m4120exceptionOrNullimpl != null) {
                        arrayList.add(((File) mo4085takePictureIoAF18A).getAbsolutePath());
                        i4++;
                        arrayList = arrayList2;
                        if (i4 < i2) {
                            Pi2GovernmentidCameraBinding pi2GovernmentidCameraBinding = ((BasicGovIdCaptureViewController) cameraScreenRunner2.viewController).binding;
                            pi2GovernmentidCameraBinding.rootView.setHapticFeedbackEnabled(true);
                            pi2GovernmentidCameraBinding.rootView.performHapticFeedback(BasicGovIdCaptureViewController.confirmConst, 2);
                            cameraScreen2.manuallyCapture.invoke(arrayList, cameraScreenRunner2.cameraController.getCameraProperties());
                            return Unit.INSTANCE;
                        }
                        CameraController cameraController = cameraScreenRunner.cameraController;
                        this.L$1 = cameraScreenRunner;
                        this.this$0 = cameraScreen;
                        this.L$2 = arrayList;
                        this.$context = arrayList;
                        this.I$0 = i2;
                        this.I$1 = i4;
                        this.label = 1;
                        mo4085takePictureIoAF18A = cameraController.mo4085takePictureIoAF18A(this);
                        if (mo4085takePictureIoAF18A == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                        arrayList2 = arrayList;
                        Throwable m4120exceptionOrNullimpl2 = Result.m4120exceptionOrNullimpl(mo4085takePictureIoAF18A);
                        if (m4120exceptionOrNullimpl2 != null) {
                            cameraScreen.onCaptureError.invoke(m4120exceptionOrNullimpl2);
                            return Unit.INSTANCE;
                        }
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidgetReceiver$onDeleted$1(Screen.CameraScreen cameraScreen, CameraScreenRunner cameraScreenRunner, Continuation continuation) {
        super(2, continuation);
        this.L$0 = cameraScreen;
        this.$appWidgetIds = cameraScreenRunner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidgetReceiver$onDeleted$1(CashQrWidgetReceiver cashQrWidgetReceiver, Context context, int[] iArr, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cashQrWidgetReceiver;
        this.$context = context;
        this.$appWidgetIds = iArr;
    }
}
