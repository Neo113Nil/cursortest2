package androidx.camera.camera2.pipe.compat;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.fillr.browsersdk.model.WebviewProxy;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ExtensionSessionConfigData {
    public final WebviewProxy.AnonymousClass1 executor;
    public final Integer extensionMode;
    public final ExtensionSessionState extensionStateCallback;
    public final ArrayList outputConfigurations;
    public final AndroidOutputConfiguration postviewOutputConfiguration;
    public final Map sessionParameters;
    public final int sessionTemplateId;
    public final CaptureSessionState stateCallback;

    public ExtensionSessionConfigData(ArrayList arrayList, WebviewProxy.AnonymousClass1 anonymousClass1, CaptureSessionState captureSessionState, int i, Map map, Integer num, ExtensionSessionState extensionSessionState, AndroidOutputConfiguration androidOutputConfiguration) {
        captureSessionState.getClass();
        map.getClass();
        this.outputConfigurations = arrayList;
        this.executor = anonymousClass1;
        this.stateCallback = captureSessionState;
        this.sessionTemplateId = i;
        this.sessionParameters = map;
        this.extensionMode = num;
        this.extensionStateCallback = extensionSessionState;
        this.postviewOutputConfiguration = androidOutputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ExtensionSessionConfigData) {
            ExtensionSessionConfigData extensionSessionConfigData = (ExtensionSessionConfigData) obj;
            if (this.outputConfigurations.equals(extensionSessionConfigData.outputConfigurations) && this.executor == extensionSessionConfigData.executor && Intrinsics.areEqual(this.stateCallback, extensionSessionConfigData.stateCallback) && this.sessionTemplateId == extensionSessionConfigData.sessionTemplateId && Intrinsics.areEqual(this.sessionParameters, extensionSessionConfigData.sessionParameters) && this.extensionMode.equals(extensionSessionConfigData.extensionMode) && this.extensionStateCallback == extensionSessionConfigData.extensionStateCallback && Intrinsics.areEqual(this.postviewOutputConfiguration, extensionSessionConfigData.postviewOutputConfiguration)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.extensionStateCallback.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(CameraState$Type$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sessionTemplateId, (this.stateCallback.hashCode() + ((this.executor.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.outputConfigurations, Integer.hashCode(2) * 31, 31)) * 31)) * 31, 31), this.sessionParameters, 31), 31, this.extensionMode)) * 31;
        AndroidOutputConfiguration androidOutputConfiguration = this.postviewOutputConfiguration;
        return hashCode + (androidOutputConfiguration == null ? 0 : androidOutputConfiguration.hashCode());
    }

    public final String toString() {
        return "ExtensionSessionConfigData(sessionType=2, outputConfigurations=" + this.outputConfigurations + ", executor=" + this.executor + ", stateCallback=" + this.stateCallback + ", sessionTemplateId=" + this.sessionTemplateId + ", sessionParameters=" + this.sessionParameters + ", extensionMode=" + this.extensionMode + ", extensionStateCallback=" + this.extensionStateCallback + ", postviewOutputConfiguration=" + this.postviewOutputConfiguration + ')';
    }
}
