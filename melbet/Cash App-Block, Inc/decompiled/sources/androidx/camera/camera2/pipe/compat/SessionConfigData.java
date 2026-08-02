package androidx.camera.camera2.pipe.compat;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class SessionConfigData {
    public final Executor executor;
    public final List inputConfiguration;
    public final ArrayList outputConfigurations;
    public final Map sessionParameters;
    public final int sessionTemplateId;
    public final int sessionType;
    public final CaptureSessionState stateCallback;

    public SessionConfigData(int i, ArrayList arrayList, ArrayList arrayList2, Executor executor, CaptureSessionState captureSessionState, int i2, Map map) {
        executor.getClass();
        captureSessionState.getClass();
        map.getClass();
        this.sessionType = i;
        this.inputConfiguration = arrayList;
        this.outputConfigurations = arrayList2;
        this.executor = executor;
        this.stateCallback = captureSessionState;
        this.sessionTemplateId = i2;
        this.sessionParameters = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionConfigData)) {
            return false;
        }
        SessionConfigData sessionConfigData = (SessionConfigData) obj;
        return this.sessionType == sessionConfigData.sessionType && Intrinsics.areEqual(this.inputConfiguration, sessionConfigData.inputConfiguration) && this.outputConfigurations.equals(sessionConfigData.outputConfigurations) && Intrinsics.areEqual(this.executor, sessionConfigData.executor) && Intrinsics.areEqual(this.stateCallback, sessionConfigData.stateCallback) && this.sessionTemplateId == sessionConfigData.sessionTemplateId && Intrinsics.areEqual(this.sessionParameters, sessionConfigData.sessionParameters);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.sessionType) * 31;
        List list = this.inputConfiguration;
        return CameraState$Type$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sessionTemplateId, (this.stateCallback.hashCode() + ((this.executor.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.outputConfigurations, (hashCode + (list == null ? 0 : list.hashCode())) * 31, 31)) * 31)) * 31, 31), this.sessionParameters, 31);
    }

    public final String toString() {
        return "SessionConfigData(sessionType=" + this.sessionType + ", inputConfiguration=" + this.inputConfiguration + ", outputConfigurations=" + this.outputConfigurations + ", executor=" + this.executor + ", stateCallback=" + this.stateCallback + ", sessionTemplateId=" + this.sessionTemplateId + ", sessionParameters=" + this.sessionParameters + ", sessionColorSpace=" + ((Object) "null") + ')';
    }
}
