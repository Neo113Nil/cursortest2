package com.yandex.plus.home.datasource.openapi.models;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.eta;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class t7 implements e8 {

    @NotNull
    public static final s7 Companion = new s7();
    public static final arf[] h;
    public final x1 a;
    public final w0 b;
    public final String c;
    public final String d;
    public final List e;
    public final g f;
    public final List g;

    static {
        bwf bwfVar = bwf.b;
        h = new arf[]{null, null, null, null, btf.a(bwfVar, new u6(8)), null, btf.a(bwfVar, new u6(9))};
    }

    public /* synthetic */ t7(int i, g gVar, w0 w0Var, x1 x1Var, String str, String str2, List list, List list2) {
        if (15 != (i & 15)) {
            u7g.V(i, 15, r7.a.getDescriptor());
            throw null;
        }
        this.a = x1Var;
        this.b = w0Var;
        this.c = str;
        this.d = str2;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = gVar;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7)) {
            return false;
        }
        t7 t7Var = (t7) obj;
        return Intrinsics.d(this.a, t7Var.a) && Intrinsics.d(this.b, t7Var.b) && Intrinsics.d(this.c, t7Var.c) && Intrinsics.d(this.d, t7Var.d) && Intrinsics.d(this.e, t7Var.e) && Intrinsics.d(this.f, t7Var.f) && Intrinsics.d(this.g, t7Var.g);
    }

    @Override // com.yandex.plus.home.datasource.openapi.models.e8
    public final String getId() {
        return this.c;
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        List list = this.e;
        int hashCode = (c + (list == null ? 0 : list.hashCode())) * 31;
        g gVar = this.f;
        int hashCode2 = (hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        List list2 = this.g;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkSwitchWidgetModel(displayRules=");
        sb.append(this.a);
        sb.append(", contentDescription=");
        sb.append(this.b);
        sb.append(", id=");
        sb.append(this.c);
        sb.append(", type=");
        sb.append(this.d);
        sb.append(", templates=");
        sb.append(this.e);
        sb.append(", action=");
        sb.append(this.f);
        sb.append(", textItems=");
        return eta.h(sb, this.g, ')');
    }
}
