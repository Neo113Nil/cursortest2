package com.yandex.plus.pay.ui.yb.web.internal.ui;

import defpackage.eta;
import defpackage.tlm;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f {
    public final String a;
    public final long b;
    public final long c;

    public f(String str, long j, long j2) {
        str.getClass();
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.a, fVar.a) && this.b == fVar.b && this.c == fVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + tlm.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("YbWebScreenState(url=");
        sb.append(this.a);
        sb.append(", startedTimeoutMillis=");
        sb.append(this.b);
        sb.append(", loadedTimeoutMillis=");
        return eta.g(sb, this.c, ')');
    }
}
