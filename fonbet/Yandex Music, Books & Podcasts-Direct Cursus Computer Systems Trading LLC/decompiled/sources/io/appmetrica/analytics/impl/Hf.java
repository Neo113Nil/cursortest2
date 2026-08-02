package io.appmetrica.analytics.impl;

import defpackage.gvo;
import io.appmetrica.analytics.MviScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class Hf implements gvo {
    public final MviScreen a;

    public Hf(MviScreen mviScreen) {
        this.a = mviScreen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Hf) && Intrinsics.d(this.a, ((Hf) obj).a);
    }

    @Override // defpackage.gvo
    public final String getName() {
        return this.a.getName();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MviScreenWrapper(screen=" + this.a + ')';
    }
}
