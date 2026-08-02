package com.yandex.passport.data.network;

import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class g3 {

    @NotNull
    public static final f3 Companion = new f3();
    public final String a;
    public final String b;

    public /* synthetic */ g3(int i, String str, String str2) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, e3.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3)) {
            return false;
        }
        g3 g3Var = (g3) obj;
        return Intrinsics.d(this.a, g3Var.a) && Intrinsics.d(this.b, g3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ThemedIcon(light=");
        sb.append(this.a);
        sb.append(", dark=");
        return dfi.i(sb, this.b, ')');
    }
}
