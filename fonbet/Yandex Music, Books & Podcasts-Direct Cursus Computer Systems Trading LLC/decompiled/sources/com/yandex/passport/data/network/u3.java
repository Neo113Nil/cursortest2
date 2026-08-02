package com.yandex.passport.data.network;

import defpackage.dfi;
import defpackage.f1d;
import defpackage.tlm;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u3 implements com.yandex.passport.data.network.core.u {
    public final com.yandex.passport.common.account.a a;
    public final com.yandex.passport.data.models.g b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;

    public u3(long j, com.yandex.passport.common.account.a aVar, com.yandex.passport.data.models.g gVar, String str, String str2, String str3) {
        aVar.getClass();
        str3.getClass();
        this.a = aVar;
        this.b = gVar;
        this.c = j;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    @Override // com.yandex.passport.data.network.core.u
    public final String a() {
        return this.a.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3)) {
            return false;
        }
        u3 u3Var = (u3) obj;
        return Intrinsics.d(this.a, u3Var.a) && this.b.equals(u3Var.b) && this.c == u3Var.c && Intrinsics.d(this.d, u3Var.d) && Intrinsics.d(this.e, u3Var.e) && Intrinsics.d(this.f, u3Var.f);
    }

    public final int hashCode() {
        int c = tlm.c(this.c, f1d.a(this.b.a, this.a.hashCode() * 31, 31), 31);
        String str = this.d;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return this.f.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(masterToken=");
        sb.append(this.a);
        sb.append(", environment=");
        sb.append(this.b);
        sb.append(", locationId=");
        sb.append(this.c);
        sb.append(", decryptedId=");
        sb.append(this.d);
        sb.append(", decryptedSecret=");
        sb.append(this.e);
        sb.append(", childUidString=");
        return dfi.i(sb, this.f, ')');
    }
}
