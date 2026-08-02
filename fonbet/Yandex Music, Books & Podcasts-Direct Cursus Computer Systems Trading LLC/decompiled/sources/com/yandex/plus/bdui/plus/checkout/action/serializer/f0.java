package com.yandex.plus.bdui.plus.checkout.action.serializer;

import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class f0 {

    @NotNull
    public static final e0 Companion = new e0();
    public final String a;
    public final boolean b;

    public /* synthetic */ f0(int i, String str, boolean z) {
        if (1 != (i & 1)) {
            u7g.V(i, 1, d0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = true;
        } else {
            this.b = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Intrinsics.d(this.a, f0Var.a) && this.b == f0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataDto(url=");
        sb.append(this.a);
        sb.append(", authorize=");
        return dfi.j(sb, this.b, ')');
    }

    public f0(String str) {
        str.getClass();
        this.a = str;
        this.b = true;
    }
}
