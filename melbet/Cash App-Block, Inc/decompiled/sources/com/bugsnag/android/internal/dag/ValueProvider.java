package com.bugsnag.android.internal.dag;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ValueProvider implements Provider {
    public final Object value;

    public ValueProvider(String str) {
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ValueProvider) && Intrinsics.areEqual(this.value, ((ValueProvider) obj).value);
    }

    @Override // com.bugsnag.android.internal.dag.Provider
    public final Object get() {
        return this.value;
    }

    @Override // com.bugsnag.android.internal.dag.Provider
    public final Object getOrNull() {
        return this.value;
    }

    public final int hashCode() {
        Object obj = this.value;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // com.bugsnag.android.internal.dag.Provider
    public final boolean isComplete() {
        return true;
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m(new StringBuilder("ValueProvider(value="), this.value, ')');
    }
}
