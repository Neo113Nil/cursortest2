package androidx.activity;

import androidx.lifecycle.LifecycleOwner;
import androidx.navigationevent.NavigationEventInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class OnBackPressedCallbackInfo extends NavigationEventInfo {
    public final OnBackPressedCallback callback;
    public final LifecycleOwner owner;

    public OnBackPressedCallbackInfo(OnBackPressedCallback onBackPressedCallback, LifecycleOwner lifecycleOwner) {
        onBackPressedCallback.getClass();
        this.callback = onBackPressedCallback;
        this.owner = lifecycleOwner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnBackPressedCallbackInfo)) {
            return false;
        }
        OnBackPressedCallbackInfo onBackPressedCallbackInfo = (OnBackPressedCallbackInfo) obj;
        return Intrinsics.areEqual(this.callback, onBackPressedCallbackInfo.callback) && Intrinsics.areEqual(this.owner, onBackPressedCallbackInfo.owner);
    }

    public final int hashCode() {
        int hashCode = this.callback.hashCode() * 31;
        LifecycleOwner lifecycleOwner = this.owner;
        return hashCode + (lifecycleOwner == null ? 0 : lifecycleOwner.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.callback + ", owner=" + this.owner + ')';
    }
}
