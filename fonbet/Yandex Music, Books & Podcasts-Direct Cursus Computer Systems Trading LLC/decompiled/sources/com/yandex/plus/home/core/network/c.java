package com.yandex.plus.home.core.network;

import defpackage.u7g;
import defpackage.vhp;
import defpackage.vz1;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();
    public final int a;
    public final int b;

    public /* synthetic */ c(int i, int i2, int i3) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, a.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && this.b == cVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RetryContext(attempt=");
        sb.append(this.a);
        sb.append(", maxAttempts=");
        return vz1.r(sb, this.b, ')');
    }

    public c(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
