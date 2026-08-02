package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class v6 {

    @NotNull
    public static final u6 Companion = new u6();
    public static final arf[] f = {null, null, null, btf.a(bwf.b, new y5(7)), null};
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final c e;

    public /* synthetic */ v6(int i, String str, String str2, String str3, List list, c cVar) {
        if (31 != (i & 31)) {
            u7g.V(i, 31, t6.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6)) {
            return false;
        }
        v6 v6Var = (v6) obj;
        return Intrinsics.d(this.a, v6Var.a) && Intrinsics.d(this.b, v6Var.b) && Intrinsics.d(this.c, v6Var.c) && Intrinsics.d(this.d, v6Var.d) && Intrinsics.d(this.e, v6Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int c = k5r.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        List list = this.d;
        int hashCode2 = (c + (list == null ? 0 : list.hashCode())) * 31;
        c cVar = this.e;
        return hashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "DataDto(title=" + this.a + ", subtitle=" + this.b + ", button=" + this.c + ", icons=" + this.d + ", user=" + this.e + ')';
    }
}
