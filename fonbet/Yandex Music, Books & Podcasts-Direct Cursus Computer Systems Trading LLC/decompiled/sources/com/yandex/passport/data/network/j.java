package com.yandex.passport.data.network;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class j {

    @NotNull
    public static final i Companion = new i();
    public static final arf[] e = {null, null, null, btf.a(bwf.b, new com.yandex.passport.api.exception.l(14))};
    public final String a;
    public final String b;
    public final String c;
    public final com.yandex.passport.data.models.w d;

    public /* synthetic */ j(int i, String str, String str2, String str3, com.yandex.passport.data.models.w wVar) {
        if (9 != (i & 9)) {
            u7g.V(i, 9, h.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        this.d = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.a, jVar.a) && Intrinsics.d(this.b, jVar.b) && Intrinsics.d(this.c, jVar.c) && Intrinsics.d(this.d, jVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Response(status=" + this.a + ", xToken=" + this.b + ", accessToken=" + this.c + ", userInfo=" + this.d + ')';
    }
}
