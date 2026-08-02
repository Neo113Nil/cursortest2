package com.yandex.plus.bdui.plus.checkout.content.serializer.dto;

import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class v0 {

    @NotNull
    public static final u0 Companion = new u0();
    public final String a;
    public final String b;

    public /* synthetic */ v0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, t0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return Intrinsics.d(this.a, v0Var.a) && Intrinsics.d(this.b, v0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(text=");
        sb.append(this.a);
        sb.append(", url=");
        return dfi.i(sb, this.b, ')');
    }
}
