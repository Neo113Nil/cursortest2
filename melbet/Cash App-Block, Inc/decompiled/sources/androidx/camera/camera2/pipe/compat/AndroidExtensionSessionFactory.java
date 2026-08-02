package androidx.camera.camera2.pipe.compat;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.camera.camera2.pipe.CameraExtensionMetadata;
import androidx.camera.camera2.pipe.CameraGraph$Config;
import androidx.camera.camera2.pipe.CameraGraph$OperatingMode;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.StrictMode;
import androidx.camera.camera2.pipe.compat.CaptureSessionFactory;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.browsersdk.model.WebviewProxy;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class AndroidExtensionSessionFactory implements CaptureSessionFactory {
    public final Camera2MetadataProvider camera2MetadataProvider;
    public final CameraGraph$Config graphConfig;
    public final StreamGraphImpl streamGraph;
    public final StrictMode strictMode;
    public final Threads threads;

    public AndroidExtensionSessionFactory(Threads threads, CameraGraph$Config cameraGraph$Config, StreamGraphImpl streamGraphImpl, Camera2MetadataProvider camera2MetadataProvider, StrictMode strictMode) {
        threads.getClass();
        cameraGraph$Config.getClass();
        camera2MetadataProvider.getClass();
        strictMode.getClass();
        this.threads = threads;
        this.graphConfig = cameraGraph$Config;
        this.streamGraph = streamGraphImpl;
        this.camera2MetadataProvider = camera2MetadataProvider;
        this.strictMode = strictMode;
    }

    @Override // androidx.camera.camera2.pipe.compat.CaptureSessionFactory
    public final CaptureSessionFactory.Result create(CameraDeviceWrapper cameraDeviceWrapper, Map map, CaptureSessionState captureSessionState) {
        CameraExtensionMetadata cameraExtensionMetadata;
        cameraDeviceWrapper.getClass();
        map.getClass();
        captureSessionState.getClass();
        CameraGraph$Config cameraGraph$Config = this.graphConfig;
        if (cameraGraph$Config.sessionMode != 2) {
            OptionalProvider$$ExternalSyntheticLambda0.m$1("Unsupported session mode: ", CameraGraph$OperatingMode.m44toStringimpl(this.graphConfig.sessionMode), " for Extension CameraGraph");
            return null;
        }
        Object obj = cameraGraph$Config.sessionParameters.get(CameraPipeKeys.camera2ExtensionMode);
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num == null) {
            a$$ExternalSyntheticBUOutline0.m$1("The CameraPipeKeys.camera2ExtensionMode must be set in the sessionParameters of the CameraGraph.Config when creating an Extension CameraGraph.");
            return null;
        }
        int intValue = num.intValue();
        if (this.graphConfig.input != null) {
            a$$ExternalSyntheticBUOutline0.m$1("Reprocessing is not supported for Extensions");
            return null;
        }
        Camera2CameraMetadata camera2CameraMetadata = (Camera2CameraMetadata) ((Camera2MetadataCache) this.camera2MetadataProvider).m72awaitCameraMetadataEfqyGwQ(cameraDeviceWrapper.mo59getCameraIdDz_R5H8());
        Set set = (Set) camera2CameraMetadata._supportedExtensions.getValue();
        StrictMode strictMode = this.strictMode;
        if (!set.contains(Integer.valueOf(intValue))) {
            strictMode.getClass();
            Log.w("CXCP", cameraDeviceWrapper + " does not support extension mode " + intValue + ". Supported extensions are " + set);
        }
        if (this.graphConfig.postviewStream != null) {
            synchronized (camera2CameraMetadata.extensionCache) {
                cameraExtensionMetadata = (CameraExtensionMetadata) camera2CameraMetadata.extensionCache.get(Integer.valueOf(intValue));
            }
            if (cameraExtensionMetadata == null) {
                Camera2MetadataCache camera2MetadataCache = camera2CameraMetadata.metadataProvider;
                String str = camera2CameraMetadata.camera;
                str.getClass();
                int i = Build.VERSION.SDK_INT;
                if (i < 31) {
                    throw new Exception(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Extension sessions are only supported on Android S or higher. Device SDK is "));
                }
                try {
                    Trace.beginSection(((Object) CameraId.m46toStringimpl(str)) + "#awaitExtensionMetadata");
                    synchronized (camera2MetadataCache.extensionCache) {
                        CameraExtensionMetadata cameraExtensionMetadata2 = (CameraExtensionMetadata) camera2MetadataCache.extensionCache.get(str);
                        if (cameraExtensionMetadata2 == null) {
                            if (Camera2MetadataCache.access$isMetadataRedacted(camera2MetadataCache)) {
                                cameraExtensionMetadata = Camera2MetadataCache.m70access$createCameraExtensionMetadataRzXb1QE(camera2MetadataCache, str, true, intValue);
                            } else {
                                cameraExtensionMetadata2 = Camera2MetadataCache.m70access$createCameraExtensionMetadataRzXb1QE(camera2MetadataCache, str, false, intValue);
                                camera2MetadataCache.extensionCache.put(str, cameraExtensionMetadata2);
                            }
                        }
                        cameraExtensionMetadata = cameraExtensionMetadata2;
                    }
                    Trace.endSection();
                    synchronized (camera2CameraMetadata.extensionCache) {
                        camera2CameraMetadata.extensionCache.put(Integer.valueOf(intValue), cameraExtensionMetadata);
                    }
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            StrictMode strictMode2 = this.strictMode;
            if (!((Boolean) ((Camera2CameraExtensionMetadata) cameraExtensionMetadata)._isPostviewSupported.getValue()).booleanValue()) {
                strictMode2.getClass();
                Log.w("CXCP", cameraDeviceWrapper + " does not support Postview streams");
            }
            if (this.graphConfig.postviewStream.outputs.size() != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("Postview streams can only have one OutputStream.config object");
                return null;
            }
        }
        OutputConfigurations buildOutputConfigurations = CaptureSessionFactoryKt.buildOutputConfigurations(this.graphConfig, this.streamGraph, map);
        if (buildOutputConfigurations.all.isEmpty()) {
            Log.w("CXCP", "Failed to create OutputConfigurations for " + this.graphConfig);
            captureSessionState.onSessionFinalized();
            return CaptureSessionFactory.Result.Failed.INSTANCE;
        }
        if (!buildOutputConfigurations.deferred.isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m$1("Deferred output is not supported for Extensions");
            return null;
        }
        ExtensionSessionState extensionSessionState = new ExtensionSessionState(captureSessionState);
        ArrayList arrayList = buildOutputConfigurations.all;
        WebviewProxy.AnonymousClass1 anonymousClass1 = new WebviewProxy.AnonymousClass1(this.threads.getCamera2Handler());
        CameraGraph$Config cameraGraph$Config2 = this.graphConfig;
        if (cameraDeviceWrapper.createExtensionSession(new ExtensionSessionConfigData(arrayList, anonymousClass1, captureSessionState, cameraGraph$Config2.sessionTemplate, cameraGraph$Config2.sessionParameters, Integer.valueOf(intValue), extensionSessionState, buildOutputConfigurations.postviewOutput))) {
            return new CaptureSessionFactory.Result.Success(buildOutputConfigurations.deferred, buildOutputConfigurations.outputSurfaceMap);
        }
        Log.w("CXCP", "Failed to create ExtensionCaptureSession from " + cameraDeviceWrapper + " for " + captureSessionState + '!');
        captureSessionState.onSessionFinalized();
        return CaptureSessionFactory.Result.Failed.INSTANCE;
    }
}
