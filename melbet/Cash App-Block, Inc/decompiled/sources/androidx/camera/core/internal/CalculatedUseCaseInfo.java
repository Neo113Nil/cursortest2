package androidx.camera.core.internal;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.core.UseCase;
import androidx.camera.core.streamsharing.StreamSharing;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class CalculatedUseCaseInfo {
    public final LinkedHashSet appUseCases;
    public final ArrayList cameraUseCases;
    public final ArrayList cameraUseCasesToAttach;
    public final ArrayList cameraUseCasesToDetach;
    public final ArrayList cameraUseCasesToKeep;
    public final UseCase placeholderForExtensions;
    public final StreamSpecQueryResult primaryStreamSpecResult;
    public final StreamSpecQueryResult secondaryStreamSpecResult;
    public final StreamSharing streamSharing;
    public final HashMap useCaseConfigs;

    public CalculatedUseCaseInfo(LinkedHashSet linkedHashSet, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, StreamSharing streamSharing, UseCase useCase, HashMap hashMap, StreamSpecQueryResult streamSpecQueryResult, StreamSpecQueryResult streamSpecQueryResult2) {
        streamSpecQueryResult.getClass();
        this.appUseCases = linkedHashSet;
        this.cameraUseCases = arrayList;
        this.cameraUseCasesToAttach = arrayList2;
        this.cameraUseCasesToKeep = arrayList3;
        this.cameraUseCasesToDetach = arrayList4;
        this.streamSharing = streamSharing;
        this.placeholderForExtensions = useCase;
        this.useCaseConfigs = hashMap;
        this.primaryStreamSpecResult = streamSpecQueryResult;
        this.secondaryStreamSpecResult = streamSpecQueryResult2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalculatedUseCaseInfo)) {
            return false;
        }
        CalculatedUseCaseInfo calculatedUseCaseInfo = (CalculatedUseCaseInfo) obj;
        return this.appUseCases.equals(calculatedUseCaseInfo.appUseCases) && this.cameraUseCases.equals(calculatedUseCaseInfo.cameraUseCases) && this.cameraUseCasesToAttach.equals(calculatedUseCaseInfo.cameraUseCasesToAttach) && this.cameraUseCasesToKeep.equals(calculatedUseCaseInfo.cameraUseCasesToKeep) && this.cameraUseCasesToDetach.equals(calculatedUseCaseInfo.cameraUseCasesToDetach) && Intrinsics.areEqual(this.streamSharing, calculatedUseCaseInfo.streamSharing) && Intrinsics.areEqual(this.placeholderForExtensions, calculatedUseCaseInfo.placeholderForExtensions) && this.useCaseConfigs.equals(calculatedUseCaseInfo.useCaseConfigs) && Intrinsics.areEqual(this.primaryStreamSpecResult, calculatedUseCaseInfo.primaryStreamSpecResult) && Intrinsics.areEqual(this.secondaryStreamSpecResult, calculatedUseCaseInfo.secondaryStreamSpecResult);
    }

    public final int hashCode() {
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.cameraUseCasesToDetach, CameraState$Type$EnumUnboxingLocalUtility.m(this.cameraUseCasesToKeep, CameraState$Type$EnumUnboxingLocalUtility.m(this.cameraUseCasesToAttach, CameraState$Type$EnumUnboxingLocalUtility.m(this.cameraUseCases, this.appUseCases.hashCode() * 31, 31), 31), 31), 31);
        StreamSharing streamSharing = this.streamSharing;
        int hashCode = (m + (streamSharing == null ? 0 : streamSharing.hashCode())) * 31;
        UseCase useCase = this.placeholderForExtensions;
        int hashCode2 = (this.primaryStreamSpecResult.hashCode() + ((this.useCaseConfigs.hashCode() + ((hashCode + (useCase == null ? 0 : useCase.hashCode())) * 31)) * 31)) * 31;
        StreamSpecQueryResult streamSpecQueryResult = this.secondaryStreamSpecResult;
        return hashCode2 + (streamSpecQueryResult != null ? streamSpecQueryResult.hashCode() : 0);
    }

    public final String toString() {
        return "CalculatedUseCaseInfo(appUseCases=" + this.appUseCases + ", cameraUseCases=" + this.cameraUseCases + ", cameraUseCasesToAttach=" + this.cameraUseCasesToAttach + ", cameraUseCasesToKeep=" + this.cameraUseCasesToKeep + ", cameraUseCasesToDetach=" + this.cameraUseCasesToDetach + ", streamSharing=" + this.streamSharing + ", placeholderForExtensions=" + this.placeholderForExtensions + ", useCaseConfigs=" + this.useCaseConfigs + ", primaryStreamSpecResult=" + this.primaryStreamSpecResult + ", secondaryStreamSpecResult=" + this.secondaryStreamSpecResult + ')';
    }
}
