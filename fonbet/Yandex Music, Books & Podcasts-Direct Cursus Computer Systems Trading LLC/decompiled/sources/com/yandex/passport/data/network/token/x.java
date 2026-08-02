package com.yandex.passport.data.network.token;

import defpackage.dfi;
import defpackage.q5f;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class x implements com.yandex.passport.data.models.r {

    @NotNull
    public static final w Companion = new w();
    public final q5f a;
    public final String b;

    public /* synthetic */ x(int i, q5f q5fVar, String str) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, v.a.getDescriptor());
            throw null;
        }
        this.a = q5fVar;
        this.b = str;
    }

    @Override // com.yandex.passport.data.models.r
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.d(this.a, xVar.a) && Intrinsics.d(this.b, xVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(status=");
        sb.append(this.a);
        sb.append(", accessToken=");
        return dfi.i(sb, this.b, ')');
    }
}
