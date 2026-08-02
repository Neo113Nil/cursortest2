package com.squareup.cash.overdraftly.api.v1_0.app;

import com.google.android.gms.internal.mlkit_genai_prompt.zzafe;
import com.squareup.cash.overdraftly.api.v1_0.app.ToggleOverdraftRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ToggleOverdraftRequest$Action$Enable extends zzafe {
    public final ToggleOverdraftRequest.Enable value;

    public ToggleOverdraftRequest$Action$Enable(ToggleOverdraftRequest.Enable enable) {
        enable.getClass();
        this.value = enable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ToggleOverdraftRequest$Action$Enable) && Intrinsics.areEqual(this.value, ((ToggleOverdraftRequest$Action$Enable) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Enable(value=" + this.value + ")";
    }
}
