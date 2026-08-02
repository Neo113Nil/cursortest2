package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.dfi;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class f3 {

    @NotNull
    public static final e3 Companion = new e3();
    public static final arf[] f = {null, btf.a(bwf.b, new q0(14)), null, null, null};
    public final com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 a;
    public final List b;
    public final com.yandex.plus.bdui.plus.checkout.content.serializer.dto.t c;
    public final String d;
    public final String e;

    public /* synthetic */ f3(int i, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var, List list, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.t tVar, String str, String str2) {
        if (31 != (i & 31)) {
            u7g.V(i, 31, d3.a.getDescriptor());
            throw null;
        }
        this.a = m1Var;
        this.b = list;
        this.c = tVar;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3)) {
            return false;
        }
        f3 f3Var = (f3) obj;
        return Intrinsics.d(this.a, f3Var.a) && Intrinsics.d(this.b, f3Var.b) && Intrinsics.d(this.c, f3Var.c) && Intrinsics.d(this.d, f3Var.d) && Intrinsics.d(this.e, f3Var.e);
    }

    public final int hashCode() {
        int c = k5r.c((this.c.hashCode() + k5r.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
        String str = this.e;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AssetDto(title=");
        sb.append(this.a);
        sb.append(", benefits=");
        sb.append(this.b);
        sb.append(", icon=");
        sb.append(this.c);
        sb.append(", buttonText=");
        sb.append(this.d);
        sb.append(", additionalButtonText=");
        return dfi.i(sb, this.e, ')');
    }
}
