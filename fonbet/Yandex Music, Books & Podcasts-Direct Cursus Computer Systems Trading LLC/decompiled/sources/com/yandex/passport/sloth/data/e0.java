package com.yandex.passport.sloth.data;

import defpackage.dfi;
import defpackage.k5r;
import defpackage.tlm;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e0 extends r implements q {
    public final com.yandex.passport.common.core.f b;
    public final long c;
    public final String d;
    public final boolean e;
    public final com.yandex.passport.sloth.dependencies.e f;
    public final boolean g;

    public e0(com.yandex.passport.common.core.f fVar, long j, String str, boolean z, com.yandex.passport.sloth.dependencies.e eVar) {
        super(k.PhoneConfirm);
        this.b = fVar;
        this.c = j;
        this.d = str;
        this.e = z;
        this.f = eVar;
        this.g = true;
    }

    @Override // com.yandex.passport.sloth.data.r
    public final com.yandex.passport.sloth.dependencies.e d() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Intrinsics.d(this.b, e0Var.b) && this.c == e0Var.c && Intrinsics.d(this.d, e0Var.d) && this.e == e0Var.e && Intrinsics.d(this.f, e0Var.f) && this.g == e0Var.g;
    }

    @Override // com.yandex.passport.sloth.data.q
    public final com.yandex.passport.common.core.f getUid() {
        return this.b;
    }

    public final int hashCode() {
        int c = tlm.c(this.c, this.b.hashCode() * 31, 31);
        String str = this.d;
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + k5r.e((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhoneConfirm(uid=");
        sb.append(this.b);
        sb.append(", locationId=");
        sb.append(this.c);
        sb.append(", phoneNumber=");
        sb.append(this.d);
        sb.append(", editable=");
        sb.append(this.e);
        sb.append(", properties=");
        sb.append(this.f);
        sb.append(", canGoBack=");
        return dfi.j(sb, this.g, ')');
    }
}
