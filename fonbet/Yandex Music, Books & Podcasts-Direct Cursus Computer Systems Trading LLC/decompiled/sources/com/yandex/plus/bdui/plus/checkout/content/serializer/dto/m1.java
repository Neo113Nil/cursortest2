package com.yandex.plus.bdui.plus.checkout.content.serializer.dto;

import com.yandex.plus.bdui.plus.checkout.content.serializer.y5;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.eta;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class m1 {

    @NotNull
    public static final l1 Companion = new l1();
    public static final arf[] c = {null, btf.a(bwf.b, new y5(23))};
    public final String a;
    public final List b;

    public /* synthetic */ m1(String str, List list, int i) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, k1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return Intrinsics.d(this.a, m1Var.a) && Intrinsics.d(this.b, m1Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextDto(text=");
        sb.append(this.a);
        sb.append(", components=");
        return eta.h(sb, this.b, ')');
    }
}
