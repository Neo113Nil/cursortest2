package com.yandex.passport.common.network;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.c5b;
import defpackage.dfi;
import defpackage.k5r;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class x implements h0 {

    @NotNull
    public static final w Companion = new w();
    public static final arf[] e;
    public final BackendError a;
    public final List b;
    public final String c;
    public final String d;

    static {
        bwf bwfVar = bwf.b;
        e = new arf[]{btf.a(bwfVar, new com.yandex.passport.api.exception.l(3)), btf.a(bwfVar, new com.yandex.passport.api.exception.l(4)), null, null};
    }

    public x(int i, BackendError backendError, List list, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = backendError;
        }
        if ((i & 2) == 0) {
            this.b = c5b.a;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
    }

    @Override // com.yandex.passport.common.network.h0
    public final c a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(' ');
        sb.append(this.b);
        return new c(sb.toString(), this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.a == xVar.a && Intrinsics.d(this.b, xVar.b) && Intrinsics.d(this.c, xVar.c) && Intrinsics.d(this.d, xVar.d);
    }

    public final int hashCode() {
        BackendError backendError = this.a;
        int d = k5r.d((backendError == null ? 0 : backendError.hashCode()) * 31, 31, this.b);
        String str = this.c;
        int hashCode = (d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultipleErrorResponse(error=");
        sb.append(this.a);
        sb.append(", errors=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", requestId=");
        return dfi.i(sb, this.d, ')');
    }
}
