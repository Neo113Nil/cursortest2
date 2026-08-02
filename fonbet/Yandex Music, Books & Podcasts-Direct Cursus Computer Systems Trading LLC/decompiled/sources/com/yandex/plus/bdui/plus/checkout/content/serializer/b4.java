package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class b4 {

    @NotNull
    public static final a4 Companion = new a4();
    public final String a;
    public final String b;

    public /* synthetic */ b4(int i, String str, String str2) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, z3.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4)) {
            return false;
        }
        b4 b4Var = (b4) obj;
        return Intrinsics.d(this.a, b4Var.a) && Intrinsics.d(this.b, b4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExpandableDto(title=");
        sb.append(this.a);
        sb.append(", text=");
        return dfi.i(sb, this.b, ')');
    }
}
