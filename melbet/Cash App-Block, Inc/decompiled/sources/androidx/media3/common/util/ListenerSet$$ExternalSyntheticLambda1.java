package androidx.media3.common.util;

import android.content.Intent;
import android.content.IntentSender;
import androidx.activity.ComponentActivity$activityResultRegistry$1;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.camera.camera2.impl.CameraCallbackMap;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.media3.common.util.ListenerSet;
import androidx.profileinstaller.DeviceProfileWriter;
import androidx.profileinstaller.ProfileInstaller;
import coil3.memory.MemoryCacheService;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes3.dex */
public final /* synthetic */ class ListenerSet$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ ListenerSet$$ExternalSyntheticLambda1(CameraCaptureCallback cameraCaptureCallback, CameraCallbackMap cameraCallbackMap, RequestMetadata requestMetadata, int i) {
        this.$r8$classId = 3;
        this.f$0 = cameraCaptureCallback;
        this.f$2 = requestMetadata;
        this.f$1 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$2;
        int i2 = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                ListenerSet.Event event = (ListenerSet.Event) obj;
                Iterator it = ((CopyOnWriteArraySet) obj2).iterator();
                while (it.hasNext()) {
                    ListenerSet.ListenerHolder listenerHolder = (ListenerSet.ListenerHolder) it.next();
                    if (!listenerHolder.released) {
                        if (i2 != -1) {
                            listenerHolder.flagsBuilder.add(i2);
                        }
                        listenerHolder.needsIterationFinishedEvent = true;
                        event.invoke(listenerHolder.listener);
                    }
                }
                break;
            case 1:
                ComponentActivity$activityResultRegistry$1 componentActivity$activityResultRegistry$1 = (ComponentActivity$activityResultRegistry$1) obj2;
                Object obj3 = ((ActivityResultContract.SynchronousResult) obj).value;
                String str = (String) componentActivity$activityResultRegistry$1.rcToKey.get(Integer.valueOf(i2));
                if (str != null) {
                    ActivityResultRegistry.CallbackAndContract callbackAndContract = (ActivityResultRegistry.CallbackAndContract) componentActivity$activityResultRegistry$1.keyToCallback.get(str);
                    if ((callbackAndContract != null ? callbackAndContract.callback : null) != null) {
                        ActivityResultCallback activityResultCallback = callbackAndContract.callback;
                        activityResultCallback.getClass();
                        if (componentActivity$activityResultRegistry$1.launchedKeys.remove(str)) {
                            activityResultCallback.onActivityResult(obj3);
                            break;
                        }
                    } else {
                        componentActivity$activityResultRegistry$1.pendingResults.remove(str);
                        componentActivity$activityResultRegistry$1.parsedPendingResults.put(str, obj3);
                        break;
                    }
                }
                break;
            case 2:
                ((ComponentActivity$activityResultRegistry$1) obj2).dispatchResult(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
            case 3:
                ((CameraCaptureCallback) obj2).onCaptureProcessProgressed(CameraCallbackMap.getCaptureConfigId((RequestMetadata) obj), i2);
                break;
            case 4:
                ((ProfileInstaller.DiagnosticsCallback) ((DeviceProfileWriter) obj2).mDiagnostics).onResultReceived(i2, obj);
                break;
            default:
                ((MemoryCacheService) obj2).onResultReceived(i2, obj);
                break;
        }
    }

    public /* synthetic */ ListenerSet$$ExternalSyntheticLambda1(Object obj, int i, Object obj2, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = obj2;
    }
}
