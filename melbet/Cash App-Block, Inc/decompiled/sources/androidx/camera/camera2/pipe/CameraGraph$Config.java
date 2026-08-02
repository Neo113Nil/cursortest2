package androidx.camera.camera2.pipe;

import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyMap;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class CameraGraph$Config {
    public final String camera;
    public final List defaultListeners;
    public final Map defaultParameters;
    public final int defaultTemplate;
    public final List exclusiveStreamGroups;
    public final CameraGraph$Flags flags;
    public final List graphStateListeners;
    public final ArrayList input;
    public final MetadataTransform metadataTransform;
    public final CameraStream.Config postviewStream;
    public final Map requiredParameters;
    public final int sessionMode;
    public final Map sessionParameters;
    public final int sessionTemplate;
    public final List streams;

    public CameraGraph$Config(String str, List list, List list2, ArrayList arrayList, CameraStream.Config config, int i, LinkedHashMap linkedHashMap, int i2, MapBuilder mapBuilder, List list3, List list4, CameraGraph$Flags cameraGraph$Flags) {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        MetadataTransform metadataTransform = new MetadataTransform();
        str.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.camera = str;
        this.streams = list;
        this.exclusiveStreamGroups = list2;
        this.input = arrayList;
        this.postviewStream = config;
        this.sessionTemplate = i;
        this.sessionParameters = linkedHashMap;
        this.sessionMode = i2;
        this.defaultTemplate = 1;
        this.defaultParameters = mapBuilder;
        this.defaultListeners = list3;
        this.graphStateListeners = list4;
        this.requiredParameters = emptyMap;
        this.metadataTransform = metadataTransform;
        this.flags = cameraGraph$Flags;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraGraph$Config)) {
            return false;
        }
        CameraGraph$Config cameraGraph$Config = (CameraGraph$Config) obj;
        return Intrinsics.areEqual(this.camera, cameraGraph$Config.camera) && Intrinsics.areEqual(this.streams, cameraGraph$Config.streams) && Intrinsics.areEqual(this.exclusiveStreamGroups, cameraGraph$Config.exclusiveStreamGroups) && Intrinsics.areEqual(this.input, cameraGraph$Config.input) && Intrinsics.areEqual(this.postviewStream, cameraGraph$Config.postviewStream) && this.sessionTemplate == cameraGraph$Config.sessionTemplate && Intrinsics.areEqual(this.sessionParameters, cameraGraph$Config.sessionParameters) && this.sessionMode == cameraGraph$Config.sessionMode && this.defaultTemplate == cameraGraph$Config.defaultTemplate && Intrinsics.areEqual(this.defaultParameters, cameraGraph$Config.defaultParameters) && Intrinsics.areEqual(this.defaultListeners, cameraGraph$Config.defaultListeners) && Intrinsics.areEqual(this.graphStateListeners, cameraGraph$Config.graphStateListeners) && Intrinsics.areEqual(this.requiredParameters, cameraGraph$Config.requiredParameters) && Intrinsics.areEqual(this.metadataTransform, cameraGraph$Config.metadataTransform) && Intrinsics.areEqual(this.flags, cameraGraph$Config.flags);
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(this.camera.hashCode() * 31, 31, this.streams), 31, this.exclusiveStreamGroups);
        ArrayList arrayList = this.input;
        int hashCode = (m + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        CameraStream.Config config = this.postviewStream;
        return (this.flags.hashCode() + ((this.metadataTransform.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(CameraState$Type$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.defaultTemplate, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sessionMode, CameraState$Type$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sessionTemplate, (hashCode + (config != null ? config.hashCode() : 0)) * 31, 31), this.sessionParameters, 31), 31), 31), this.defaultParameters, 31), 31, this.defaultListeners), 31, this.graphStateListeners), this.requiredParameters, 29791)) * 31)) * 31;
    }

    public final String toString() {
        return "Config(camera=" + ((Object) CameraId.m46toStringimpl(this.camera)) + ", streams=" + this.streams + ", exclusiveStreamGroups=" + this.exclusiveStreamGroups + ", input=" + this.input + ", postviewStream=" + this.postviewStream + ", sessionTemplate=" + ((Object) RequestTemplate.m54toStringimpl(this.sessionTemplate)) + ", sessionParameters=" + this.sessionParameters + ", sessionMode=" + ((Object) CameraGraph$OperatingMode.m44toStringimpl(this.sessionMode)) + ", defaultTemplate=" + ((Object) RequestTemplate.m54toStringimpl(this.defaultTemplate)) + ", defaultParameters=" + this.defaultParameters + ", defaultListeners=" + this.defaultListeners + ", graphStateListeners=" + this.graphStateListeners + ", requiredParameters=" + this.requiredParameters + ", cameraBackendId=" + ((Object) "null") + ", customCameraBackend=null, metadataTransform=" + this.metadataTransform + ", flags=" + this.flags + ", sessionColorSpace=" + ((Object) "null") + ')';
    }
}
