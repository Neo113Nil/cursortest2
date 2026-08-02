package androidx.glance.appwidget;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class ContainerInfo {
    public final int layoutId;

    public ContainerInfo(int i) {
        this.layoutId = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContainerInfo) && this.layoutId == ((ContainerInfo) obj).layoutId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.layoutId);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("ContainerInfo(layoutId="), this.layoutId, ')');
    }
}
