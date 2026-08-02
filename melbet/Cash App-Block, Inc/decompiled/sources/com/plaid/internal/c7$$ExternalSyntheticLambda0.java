package com.plaid.internal;

import androidx.camera.core.AutoValue_CameraState;
import androidx.camera.core.AutoValue_CameraState_StateError;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.core.impl.CameraPresenceProvider;
import androidx.camera.core.impl.CameraPresenceProvider$$ExternalSyntheticLambda3;
import androidx.lifecycle.Observer;
import com.miteksystems.misnap.camera.frameproducers.FrameProducer;
import com.miteksystems.misnap.camera.util.CameraUtil$CameraSupportResult;
import com.miteksystems.misnap.camera.util.CameraUtil$CameraSupportResult$Error$Execution;
import com.miteksystems.misnap.workflow.fragment.HelpFragment;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import utils.StringUtilsKt;

/* loaded from: classes4.dex */
public final /* synthetic */ class c7$$ExternalSyntheticLambda0 implements Observer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ c7$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                C0116c7.a((C0116c7) obj3, (Observer) obj2, obj);
                break;
            case 1:
                CameraPresenceProvider cameraPresenceProvider = (CameraPresenceProvider) obj3;
                String str = (String) obj2;
                AutoValue_CameraState autoValue_CameraState = (AutoValue_CameraState) obj;
                if (!cameraPresenceProvider.isMonitoring.get()) {
                    StringUtilsKt.d("CameraPresencePrvdr", "Ignore camera state change handling since already stop monitoring");
                    break;
                } else if (autoValue_CameraState.error != null) {
                    StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Camera ", str, " state changed to ");
                    m3m.append(CameraState$Type$EnumUnboxingLocalUtility.stringValueOf(autoValue_CameraState.f844type));
                    m3m.append(" with error: ");
                    AutoValue_CameraState_StateError autoValue_CameraState_StateError = autoValue_CameraState.error;
                    m3m.append(autoValue_CameraState_StateError != null ? Integer.valueOf(autoValue_CameraState_StateError.code) : null);
                    m3m.append(". Triggering refresh.");
                    StringUtilsKt.w("CameraPresencePrvdr", m3m.toString());
                    cameraPresenceProvider.backgroundExecutor.execute(new CameraPresenceProvider$$ExternalSyntheticLambda3(cameraPresenceProvider, 2));
                    break;
                }
                break;
            default:
                HelpFragment.g gVar = (HelpFragment.g) obj3;
                FrameProducer frameProducer = (FrameProducer) obj2;
                FrameProducer.Event event = (FrameProducer.Event) obj;
                if (event instanceof FrameProducer.Event.CameraInitialized) {
                    gVar.invoke(new CameraUtil$CameraSupportResult.Success(((FrameProducer.Event.CameraInitialized) event).getCameraInfo()));
                } else {
                    gVar.invoke(event instanceof FrameProducer.Event.InitializationError.InsufficientCamera ? CameraUtil$CameraSupportResult$Error$Execution.INSTANCE$2 : event instanceof FrameProducer.Event.InitializationError.CameraNotAvailable ? CameraUtil$CameraSupportResult$Error$Execution.INSTANCE$1 : CameraUtil$CameraSupportResult$Error$Execution.INSTANCE);
                }
                frameProducer.release();
                break;
        }
    }
}
