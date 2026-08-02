package com.google.common.base;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;

/* loaded from: classes4.dex */
public final class Present extends Optional {
    public final Object reference;

    public Present(Object obj) {
        this.reference = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Present) {
            return this.reference.equals(((Present) obj).reference);
        }
        return false;
    }

    @Override // com.google.common.base.Optional
    public final Object get() {
        return this.reference;
    }

    public final int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    @Override // com.google.common.base.Optional
    public final boolean isPresent() {
        return true;
    }

    @Override // com.google.common.base.Optional
    public final Object orNull() {
        return this.reference;
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m(new StringBuilder("Optional.of("), this.reference, ")");
    }
}
