package com.yandex.plus.pay.data.mb.dto;

import defpackage.eta;
import defpackage.u7g;
import defpackage.vhp;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class v0 implements w0 {

    @NotNull
    public static final u0 Companion = new u0();
    public final long a;

    public /* synthetic */ v0(int i, long j) {
        if (1 == (i & 1)) {
            this.a = j;
        } else {
            u7g.V(i, 1, t0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v0) && this.a == ((v0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return eta.g(new StringBuilder("TrialUntil(until="), this.a, ')');
    }
}
