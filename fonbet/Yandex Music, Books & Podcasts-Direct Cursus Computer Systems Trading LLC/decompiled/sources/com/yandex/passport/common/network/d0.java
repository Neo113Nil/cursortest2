package com.yandex.passport.common.network;

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
public final class d0 implements h0 {

    @NotNull
    public static final c0 Companion = new c0();
    public static final arf[] d = {btf.a(bwf.b, new com.yandex.passport.api.exception.l(5)), null, null};
    public final BackendError a;
    public final String b;
    public final String c;

    public /* synthetic */ d0(int i, BackendError backendError, String str, String str2) {
        if (1 != (i & 1)) {
            u7g.V(i, 1, b0.a.getDescriptor());
            throw null;
        }
        this.a = backendError;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    @Override // com.yandex.passport.common.network.h0
    public final c a() {
        return new c(this.a.toString(), this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.a == d0Var.a && Intrinsics.d(this.b, d0Var.b) && Intrinsics.d(this.c, d0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SingleErrorResponse(error=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", requestId=");
        return dfi.i(sb, this.c, ')');
    }
}
