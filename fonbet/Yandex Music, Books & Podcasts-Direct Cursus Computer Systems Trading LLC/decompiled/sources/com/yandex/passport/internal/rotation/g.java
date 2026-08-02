package com.yandex.passport.internal.rotation;

import com.appsflyer.internal.k;
import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();
    public final String a;
    public final com.yandex.passport.common.core.f b;
    public final String c;

    public /* synthetic */ g(int i, com.yandex.passport.common.core.f fVar, String str, String str2) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, e.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = fVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.a, gVar.a) && Intrinsics.d(this.b, gVar.b) && Intrinsics.d(this.c, gVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuarantineMasterToken(masterToken=");
        sb.append(this.a);
        sb.append(", uid=");
        sb.append(this.b);
        sb.append(", clientId=");
        return dfi.i(sb, this.c, ')');
    }

    public g(String str, com.yandex.passport.common.core.f fVar, String str2) {
        str2.getClass();
        this.a = str;
        this.b = fVar;
        this.c = str2;
    }
}
