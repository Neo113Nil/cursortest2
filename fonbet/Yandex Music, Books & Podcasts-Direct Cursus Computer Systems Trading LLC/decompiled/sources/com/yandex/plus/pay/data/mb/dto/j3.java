package com.yandex.plus.pay.data.mb.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.c5b;
import defpackage.eta;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class j3 {

    @NotNull
    public static final d3 Companion = new d3();
    public static final arf[] c = {null, btf.a(bwf.b, new c1(12))};
    public final String a;
    public final List b;

    public j3(String str, List list, int i) {
        if (1 != (i & 1)) {
            u7g.V(i, 1, c3.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = c5b.a;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3)) {
            return false;
        }
        j3 j3Var = (j3) obj;
        return Intrinsics.d(this.a, j3Var.a) && Intrinsics.d(this.b, j3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RichTextDto(text=");
        sb.append(this.a);
        sb.append(", items=");
        return eta.h(sb, this.b, ')');
    }
}
