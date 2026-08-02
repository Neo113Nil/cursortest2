package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class o3 implements r6 {

    @NotNull
    public static final l3 Companion = new l3();
    public static final arf[] d = {null, btf.a(bwf.b, new b0(24)), null};
    public final String a;
    public final n3 b;
    public final String c;

    public /* synthetic */ o3(int i, String str, n3 n3Var, String str2) {
        if (6 != (i & 6)) {
            u7g.V(i, 6, k3.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = n3Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj;
        return Intrinsics.d(this.a, o3Var.a) && this.b == o3Var.b && Intrinsics.d(this.c, o3Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NeedAuthorization(trackId=");
        sb.append(this.a);
        sb.append(", reason=");
        sb.append(this.b);
        sb.append(", callbackUrl=");
        return dfi.i(sb, this.c, ')');
    }
}
