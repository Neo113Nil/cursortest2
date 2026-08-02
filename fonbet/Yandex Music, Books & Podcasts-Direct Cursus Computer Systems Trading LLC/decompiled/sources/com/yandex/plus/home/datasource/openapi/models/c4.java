package com.yandex.plus.home.datasource.openapi.models;

import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class c4 implements g {

    @NotNull
    public static final b4 Companion = new b4();
    public final String a;
    public final String b;

    public /* synthetic */ c4(int i, String str, String str2) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, a4.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4)) {
            return false;
        }
        c4 c4Var = (c4) obj;
        return Intrinsics.d(this.a, c4Var.a) && Intrinsics.d(this.b, c4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkJustInteractActionModel(actionContext=");
        sb.append(this.a);
        sb.append(", type=");
        return dfi.i(sb, this.b, ')');
    }
}
