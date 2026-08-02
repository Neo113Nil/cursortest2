package com.datadog.android.api.context;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class ProcessInfo {
    public final boolean isMainProcess;

    public ProcessInfo(boolean z) {
        this.isMainProcess = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProcessInfo) && this.isMainProcess == ((ProcessInfo) obj).isMainProcess;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isMainProcess);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("ProcessInfo(isMainProcess=", ")", this.isMainProcess);
    }
}
