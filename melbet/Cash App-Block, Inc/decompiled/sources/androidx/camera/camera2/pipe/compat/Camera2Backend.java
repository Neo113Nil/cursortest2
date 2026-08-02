package androidx.camera.camera2.pipe.compat;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import android.util.Log;
import androidx.biometric.BiometricPrompt;
import androidx.camera.camera2.pipe.CameraGraph$Config;
import androidx.camera.camera2.pipe.CameraGraph$OperatingMode;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.ConfigQueryResult;
import androidx.camera.camera2.pipe.MetadataTransform;
import androidx.camera.camera2.pipe.OutputStream$Config;
import androidx.camera.camera2.pipe.compat.CaptureSessionFactory;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.featurecombinationquery.CameraDeviceSetupCompat;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Reflection;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class Camera2Backend {
    public final LinkedHashSet activeCameraControllers;
    public final BiometricPrompt camera2CameraControllerComponent;
    public final Camera2DeviceCache camera2DeviceCache;
    public final PruningCamera2DeviceManager camera2DeviceManager;
    public final Camera2MetadataCache camera2MetadataCache;
    public final Object lock;
    public final Threads threads;

    public Camera2Backend(Threads threads, Camera2DeviceCache camera2DeviceCache, Camera2MetadataCache camera2MetadataCache, PruningCamera2DeviceManager pruningCamera2DeviceManager, BiometricPrompt biometricPrompt, Context context) {
        threads.getClass();
        camera2DeviceCache.getClass();
        camera2MetadataCache.getClass();
        pruningCamera2DeviceManager.getClass();
        this.threads = threads;
        this.camera2DeviceCache = camera2DeviceCache;
        this.camera2MetadataCache = camera2MetadataCache;
        this.camera2DeviceManager = pruningCamera2DeviceManager;
        this.camera2CameraControllerComponent = biometricPrompt;
        this.lock = new Object();
        this.activeCameraControllers = new LinkedHashSet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0060, code lost:
    
        if (r2 == r4) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* renamed from: isConfigSupported-NpXggIU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m63isConfigSupportedNpXggIU(CameraGraph$Config cameraGraph$Config, ContinuationImpl continuationImpl) {
        Camera2Backend$isConfigSupported$1 camera2Backend$isConfigSupported$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        int i2;
        Iterator it;
        Object m68getOrInitializeDeviceSetupWrapper0r8Bogc;
        CameraGraph$Config cameraGraph$Config2;
        CameraDeviceSetupCompat cameraDeviceSetupCompat;
        SessionConfiguration sessionConfiguration;
        OutputConfiguration outputConfiguration;
        CaptureRequest.Builder createCaptureRequest;
        CameraGraph$Config cameraGraph$Config3 = cameraGraph$Config;
        if (continuationImpl instanceof Camera2Backend$isConfigSupported$1) {
            camera2Backend$isConfigSupported$1 = (Camera2Backend$isConfigSupported$1) continuationImpl;
            int i3 = camera2Backend$isConfigSupported$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                camera2Backend$isConfigSupported$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = camera2Backend$isConfigSupported$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = camera2Backend$isConfigSupported$1.label;
                Camera2DeviceCache camera2DeviceCache = this.camera2DeviceCache;
                int i4 = 1;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (Build.VERSION.SDK_INT < 35) {
                        return new ConfigQueryResult(0);
                    }
                    String str = cameraGraph$Config3.camera;
                    camera2Backend$isConfigSupported$1.L$0 = cameraGraph$Config3;
                    camera2Backend$isConfigSupported$1.label = 1;
                    obj = camera2DeviceCache.m67getOrInitializeDeviceSetupCompat0r8Bogc(str, camera2Backend$isConfigSupported$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        sessionConfiguration = camera2Backend$isConfigSupported$1.L$2;
                        cameraDeviceSetupCompat = camera2Backend$isConfigSupported$1.L$1;
                        cameraGraph$Config2 = camera2Backend$isConfigSupported$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        Camera2DeviceSetupWrapper camera2DeviceSetupWrapper = (Camera2DeviceSetupWrapper) obj;
                        createCaptureRequest = camera2DeviceSetupWrapper == null ? ((Camera2DeviceSetup) camera2DeviceSetupWrapper).createCaptureRequest(cameraGraph$Config2.sessionTemplate) : null;
                        if (createCaptureRequest != null) {
                            for (Map.Entry entry : cameraGraph$Config2.sessionParameters.entrySet()) {
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                CaptureRequest.Key key2 = key instanceof CaptureRequest.Key ? (CaptureRequest.Key) key : null;
                                if (key2 != null) {
                                    createCaptureRequest.set(key2, value);
                                }
                            }
                            CaptureRequest build = createCaptureRequest.build();
                            build.getClass();
                            sessionConfiguration.getClass();
                            sessionConfiguration.setSessionParameters(build);
                        }
                        Integer num = cameraDeviceSetupCompat == null ? new Integer(cameraDeviceSetupCompat.isSessionConfigurationSupported(sessionConfiguration).zza) : null;
                        return num == null ? new ConfigQueryResult(num.intValue()) : new ConfigQueryResult(0);
                    }
                    cameraGraph$Config3 = camera2Backend$isConfigSupported$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                CameraDeviceSetupCompat cameraDeviceSetupCompat2 = (CameraDeviceSetupCompat) obj;
                i2 = cameraGraph$Config3.sessionMode;
                String str2 = cameraGraph$Config3.camera;
                if (i2 != 0) {
                    i4 = 0;
                } else if (i2 != 1) {
                    if (i2 == 2) {
                        Log.i("CXCP", "Unsupported session mode: " + ((Object) CameraGraph$OperatingMode.m44toStringimpl(cameraGraph$Config3.sessionMode)));
                        return new ConfigQueryResult(0);
                    }
                    i4 = i2;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                it = cameraGraph$Config3.streams.iterator();
                while (it.hasNext()) {
                    for (OutputStream$Config outputStream$Config : ((CameraStream.Config) it.next()).outputs) {
                        int i5 = outputStream$Config.f838format;
                        String str3 = outputStream$Config.camera;
                        AndroidOutputConfiguration m75creategWWoySg$default = CaptureSessionFactory.Result.Failed.m75creategWWoySg$default(null, Integer.valueOf(i5), MetadataTransform.AnonymousClass1.SURFACE_DEFERRED_FOR_QUERY_ONLY, outputStream$Config.mirrorMode, outputStream$Config.dynamicRangeProfile, outputStream$Config.streamUseCase, outputStream$Config.sensorPixelModes, outputStream$Config.size, false, 0, !(str3 == null ? false : str3.equals(str2)) ? str3 : null, 1536);
                        if (m75creategWWoySg$default != null && (outputConfiguration = (OutputConfiguration) m75creategWWoySg$default.unwrapAs(Reflection.factory.getOrCreateKotlinClass(OutputConfiguration.class))) != null) {
                            linkedHashSet.add(outputConfiguration);
                        }
                    }
                }
                List list = CollectionsKt.toList(linkedHashSet);
                list.getClass();
                SessionConfiguration m = Api35Compat$$ExternalSyntheticApiModelOutline0.m(i4, list);
                camera2Backend$isConfigSupported$1.L$0 = cameraGraph$Config3;
                camera2Backend$isConfigSupported$1.L$1 = cameraDeviceSetupCompat2;
                camera2Backend$isConfigSupported$1.L$2 = m;
                camera2Backend$isConfigSupported$1.label = 2;
                m68getOrInitializeDeviceSetupWrapper0r8Bogc = camera2DeviceCache.m68getOrInitializeDeviceSetupWrapper0r8Bogc(str2, camera2Backend$isConfigSupported$1);
                if (m68getOrInitializeDeviceSetupWrapper0r8Bogc != coroutineSingletons) {
                    cameraGraph$Config2 = cameraGraph$Config3;
                    cameraDeviceSetupCompat = cameraDeviceSetupCompat2;
                    obj = m68getOrInitializeDeviceSetupWrapper0r8Bogc;
                    sessionConfiguration = m;
                    Camera2DeviceSetupWrapper camera2DeviceSetupWrapper2 = (Camera2DeviceSetupWrapper) obj;
                    if (camera2DeviceSetupWrapper2 == null) {
                    }
                    if (createCaptureRequest != null) {
                    }
                    if (cameraDeviceSetupCompat == null) {
                    }
                    if (num == null) {
                    }
                }
                return coroutineSingletons;
            }
        }
        camera2Backend$isConfigSupported$1 = new Camera2Backend$isConfigSupported$1(this, continuationImpl);
        Object obj2 = camera2Backend$isConfigSupported$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = camera2Backend$isConfigSupported$1.label;
        Camera2DeviceCache camera2DeviceCache2 = this.camera2DeviceCache;
        int i42 = 1;
        if (i != 0) {
        }
        CameraDeviceSetupCompat cameraDeviceSetupCompat22 = (CameraDeviceSetupCompat) obj2;
        i2 = cameraGraph$Config3.sessionMode;
        String str22 = cameraGraph$Config3.camera;
        if (i2 != 0) {
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        it = cameraGraph$Config3.streams.iterator();
        while (it.hasNext()) {
        }
        List list2 = CollectionsKt.toList(linkedHashSet2);
        list2.getClass();
        SessionConfiguration m2 = Api35Compat$$ExternalSyntheticApiModelOutline0.m(i42, list2);
        camera2Backend$isConfigSupported$1.L$0 = cameraGraph$Config3;
        camera2Backend$isConfigSupported$1.L$1 = cameraDeviceSetupCompat22;
        camera2Backend$isConfigSupported$1.L$2 = m2;
        camera2Backend$isConfigSupported$1.label = 2;
        m68getOrInitializeDeviceSetupWrapper0r8Bogc = camera2DeviceCache2.m68getOrInitializeDeviceSetupWrapper0r8Bogc(str22, camera2Backend$isConfigSupported$1);
        if (m68getOrInitializeDeviceSetupWrapper0r8Bogc != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
