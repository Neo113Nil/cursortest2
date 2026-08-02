package com.yandex.passport.data.network;

import com.yandex.passport.common.network.BackendError;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class r6 implements com.yandex.passport.common.network.h0 {

    @NotNull
    public static final q6 Companion = new q6();
    public static final arf[] c = {btf.a(bwf.b, new k5(11)), null};
    public final BackendError a;
    public final String b;

    public /* synthetic */ r6(int i, BackendError backendError, String str) {
        if (1 != (i & 1)) {
            u7g.V(i, 1, p6.a.getDescriptor());
            throw null;
        }
        this.a = backendError;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    @Override // com.yandex.passport.common.network.h0
    public final com.yandex.passport.common.network.c a() {
        return new com.yandex.passport.common.network.c(this.a.toString(), null, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6)) {
            return false;
        }
        r6 r6Var = (r6) obj;
        return this.a == r6Var.a && Intrinsics.d(this.b, r6Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorResult(error=");
        sb.append(this.a);
        sb.append(", requestId=");
        return dfi.i(sb, this.b, ')');
    }
}
