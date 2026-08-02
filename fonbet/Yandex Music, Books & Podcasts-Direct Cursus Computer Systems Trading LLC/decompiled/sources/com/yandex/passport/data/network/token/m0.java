package com.yandex.passport.data.network.token;

import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class m0 implements com.yandex.passport.data.models.r {

    @NotNull
    public static final l0 Companion = new l0();
    public final String a;
    public final String b;

    public /* synthetic */ m0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, k0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    @Override // com.yandex.passport.data.models.r
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return Intrinsics.d(this.a, m0Var.a) && Intrinsics.d(this.b, m0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(status=");
        sb.append(this.a);
        sb.append(", token=");
        return dfi.i(sb, this.b, ')');
    }
}
