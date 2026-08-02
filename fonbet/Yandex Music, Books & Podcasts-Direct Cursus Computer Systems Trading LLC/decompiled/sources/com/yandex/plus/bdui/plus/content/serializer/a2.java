package com.yandex.plus.bdui.plus.content.serializer;

import defpackage.eta;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class a2 {

    @NotNull
    public static final z1 Companion = new z1();
    public final String a;
    public final long b;

    public /* synthetic */ a2(String str, int i, long j) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, y1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return Intrinsics.d(this.a, a2Var.a) && this.b == a2Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReadyDto(strategy=");
        sb.append(this.a);
        sb.append(", timeoutMillis=");
        return eta.g(sb, this.b, ')');
    }
}
