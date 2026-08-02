package com.fidesmo.sec.core.models;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/fidesmo/sec/core/models/InstanceElementsResponse;", "", "instanceElements", "", "Lcom/fidesmo/sec/core/models/InstanceElement;", "(Ljava/util/List;)V", "getInstanceElements", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class InstanceElementsResponse {
    private final List<InstanceElement> instanceElements;

    public InstanceElementsResponse(List<InstanceElement> list) {
        list.getClass();
        this.instanceElements = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InstanceElementsResponse copy$default(InstanceElementsResponse instanceElementsResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = instanceElementsResponse.instanceElements;
        }
        return instanceElementsResponse.copy(list);
    }

    public final List<InstanceElement> component1() {
        return this.instanceElements;
    }

    public final InstanceElementsResponse copy(List<InstanceElement> instanceElements) {
        instanceElements.getClass();
        return new InstanceElementsResponse(instanceElements);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof InstanceElementsResponse) && Intrinsics.areEqual(this.instanceElements, ((InstanceElementsResponse) other).instanceElements);
    }

    public final List<InstanceElement> getInstanceElements() {
        return this.instanceElements;
    }

    public int hashCode() {
        return this.instanceElements.hashCode();
    }

    public String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("InstanceElementsResponse(instanceElements="), (List) this.instanceElements, ')');
    }
}
