package com.yandex.passport.data.network.token;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class g0 implements com.yandex.passport.data.models.r {

    @NotNull
    public static final f0 Companion = new f0();
    public final String a;
    public final b0 b;

    public /* synthetic */ g0(int i, String str, b0 b0Var) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, e0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = b0Var;
    }

    @Override // com.yandex.passport.data.models.r
    public final String a() {
        return this.b.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Intrinsics.d(this.a, g0Var.a) && Intrinsics.d(this.b, g0Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Result(status=" + this.a + ", oAuth=" + this.b + ')';
    }
}
