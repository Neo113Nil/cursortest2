package androidx.glance.unit;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class ResourceColorProvider {
    public final int resId;

    public ResourceColorProvider(int i) {
        this.resId = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResourceColorProvider) && this.resId == ((ResourceColorProvider) obj).resId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.resId);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("ResourceColorProvider(resId="), this.resId, ')');
    }
}
