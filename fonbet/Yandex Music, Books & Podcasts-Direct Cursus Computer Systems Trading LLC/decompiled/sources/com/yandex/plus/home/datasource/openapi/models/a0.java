package com.yandex.plus.home.datasource.openapi.models;

import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class a0 implements j6 {

    @NotNull
    public static final z Companion = new z();
    public final String a;
    public final boolean b;

    public /* synthetic */ a0(int i, String str, boolean z) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, y.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.d(this.a, a0Var.a) && this.b == a0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkBoolArgumentModel(type=");
        sb.append(this.a);
        sb.append(", argValue=");
        return dfi.j(sb, this.b, ')');
    }
}
