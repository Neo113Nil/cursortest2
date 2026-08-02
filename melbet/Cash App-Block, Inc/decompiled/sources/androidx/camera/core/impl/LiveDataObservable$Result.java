package androidx.camera.core.impl;

import androidx.camera.core.impl.CameraInternal;

/* loaded from: classes3.dex */
public final class LiveDataObservable$Result {
    public final Object mValue;

    public LiveDataObservable$Result(CameraInternal.State state) {
        this.mValue = state;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[Result: <");
        sb.append("Value: " + this.mValue);
        sb.append(">]");
        return sb.toString();
    }
}
