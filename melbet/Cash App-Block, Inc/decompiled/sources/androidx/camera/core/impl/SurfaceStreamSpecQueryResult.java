package androidx.camera.core.impl;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class SurfaceStreamSpecQueryResult {
    public final LinkedHashMap attachedSurfaceStreamSpecs;
    public final int maxSupportedFrameRate;
    public final LinkedHashMap useCaseStreamSpecs;

    public SurfaceStreamSpecQueryResult(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, int i) {
        this.useCaseStreamSpecs = linkedHashMap;
        this.attachedSurfaceStreamSpecs = linkedHashMap2;
        this.maxSupportedFrameRate = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurfaceStreamSpecQueryResult)) {
            return false;
        }
        SurfaceStreamSpecQueryResult surfaceStreamSpecQueryResult = (SurfaceStreamSpecQueryResult) obj;
        return this.useCaseStreamSpecs.equals(surfaceStreamSpecQueryResult.useCaseStreamSpecs) && this.attachedSurfaceStreamSpecs.equals(surfaceStreamSpecQueryResult.attachedSurfaceStreamSpecs) && this.maxSupportedFrameRate == surfaceStreamSpecQueryResult.maxSupportedFrameRate;
    }

    public final int hashCode() {
        return Integer.hashCode(this.maxSupportedFrameRate) + ((this.attachedSurfaceStreamSpecs.hashCode() + (this.useCaseStreamSpecs.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceStreamSpecQueryResult(useCaseStreamSpecs=");
        sb.append(this.useCaseStreamSpecs);
        sb.append(", attachedSurfaceStreamSpecs=");
        sb.append(this.attachedSurfaceStreamSpecs);
        sb.append(", maxSupportedFrameRate=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.maxSupportedFrameRate, ')');
    }
}
