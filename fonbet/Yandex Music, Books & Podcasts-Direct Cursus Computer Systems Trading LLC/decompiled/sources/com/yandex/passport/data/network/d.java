package com.yandex.passport.data.network;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class d implements com.yandex.passport.common.network.h0 {

    @NotNull
    public static final c Companion = new c();
    public static final arf[] e = {btf.a(bwf.b, new com.yandex.passport.api.exception.l(13)), null, null, null};
    public final List a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ d(int i, String str, String str2, String str3, List list) {
        if (1 != (i & 1)) {
            u7g.V(i, 1, b.a.getDescriptor());
            throw null;
        }
        this.a = list;
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
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    @Override // com.yandex.passport.common.network.h0
    public final com.yandex.passport.common.network.c a() {
        return new com.yandex.passport.common.network.c(this.a.toString(), null, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.a, dVar.a) && Intrinsics.d(this.b, dVar.b) && Intrinsics.d(this.c, dVar.c) && Intrinsics.d(this.d, dVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorResponse(errors=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", captchaImageUrl=");
        sb.append(this.c);
        sb.append(", requestId=");
        return dfi.i(sb, this.d, ')');
    }
}
