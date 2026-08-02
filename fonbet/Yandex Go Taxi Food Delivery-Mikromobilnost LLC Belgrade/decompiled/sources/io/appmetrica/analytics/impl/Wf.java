package io.appmetrica.analytics.impl;

import defpackage.ffp0;
import defpackage.jl40;
import io.appmetrica.analytics.MviScreen;

/* loaded from: classes9.dex */
public final class Wf implements ffp0 {
    public final MviScreen a;

    public Wf(MviScreen mviScreen) {
        this.a = mviScreen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Wf) && jl40.l(this.a, ((Wf) obj).a);
    }

    @Override // defpackage.ffp0
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
