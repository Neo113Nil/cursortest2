package com.yandex.passport.data.network;

import defpackage.eta;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class j5 {

    @NotNull
    public static final i5 Companion = new i5();
    public final String a;
    public final long b;

    public /* synthetic */ j5(String str, int i, long j) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, h5.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5)) {
            return false;
        }
        j5 j5Var = (j5) obj;
        return Intrinsics.d(this.a, j5Var.a) && this.b == j5Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlockVpnEntryDTO(appId=");
        sb.append(this.a);
        sb.append(", version=");
        return eta.g(sb, this.b, ')');
    }
}
