package com.squareup.cash.overdraftly.api.v1_0.app;

import com.google.android.gms.internal.mlkit_genai_prompt.zzafe;
import com.squareup.cash.overdraftly.api.v1_0.app.ToggleOverdraftRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ToggleOverdraftRequest$Action$Disable extends zzafe {
    public final ToggleOverdraftRequest.Disable value;

    public ToggleOverdraftRequest$Action$Disable(ToggleOverdraftRequest.Disable disable) {
        disable.getClass();
        this.value = disable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ToggleOverdraftRequest$Action$Disable) && Intrinsics.areEqual(this.value, ((ToggleOverdraftRequest$Action$Disable) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Disable(value=" + this.value + ")";
    }
}
