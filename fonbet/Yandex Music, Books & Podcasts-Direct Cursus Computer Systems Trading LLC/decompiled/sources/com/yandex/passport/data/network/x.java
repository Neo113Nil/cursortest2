package com.yandex.passport.data.network;

import defpackage.dfi;
import defpackage.f1d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x implements com.yandex.passport.data.network.core.u {
    public final com.yandex.passport.common.account.a a;
    public final String b;
    public final com.yandex.passport.data.models.g c;
    public final String d;

    public x(com.yandex.passport.common.account.a aVar, com.yandex.passport.data.models.g gVar, String str, String str2) {
        aVar.getClass();
        str2.getClass();
        this.a = aVar;
        this.b = str;
        this.c = gVar;
        this.d = str2;
    }

    @Override // com.yandex.passport.data.network.core.u
    public final String a() {
        return this.a.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.d(this.a, xVar.a) && Intrinsics.d(this.b, xVar.b) && this.c.equals(xVar.c) && Intrinsics.d(this.d, xVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + f1d.a(this.c.a, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(masterToken=");
        sb.append(this.a);
        sb.append(", flowId=");
        sb.append(this.b);
        sb.append(", environment=");
        sb.append(this.c);
        sb.append(", biometricSessionId=");
        return dfi.i(sb, this.d, ')');
    }
}
