package com.datadog.android.rum.tracking;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ViewTarget {
    public final WeakReference viewRef;

    public ViewTarget(WeakReference weakReference) {
        this.viewRef = weakReference;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ViewTarget) && Intrinsics.areEqual(this.viewRef.get(), ((ViewTarget) obj).viewRef.get());
    }

    public final int hashCode() {
        Object obj = this.viewRef.get();
        return (obj != null ? obj.hashCode() : 0) * 31;
    }
}
