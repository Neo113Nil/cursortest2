package com.yandex.passport.sloth.command.data;

import defpackage.dfi;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class q0 {

    @NotNull
    public static final p0 Companion = new p0();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ q0(String str, int i, String str2, String str3) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, o0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Intrinsics.d(this.a, q0Var.a) && Intrinsics.d(this.b, q0Var.b) && Intrinsics.d(this.c, q0Var.c);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SaveLoginCredentialsData(login=");
        sb.append(this.a);
        sb.append(", password=");
        sb.append(this.b);
        sb.append(", avatarUrl=");
        return dfi.i(sb, this.c, ')');
    }
}
