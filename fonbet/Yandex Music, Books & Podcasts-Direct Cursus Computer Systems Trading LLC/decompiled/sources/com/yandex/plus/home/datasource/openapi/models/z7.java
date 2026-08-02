package com.yandex.plus.home.datasource.openapi.models;

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
/* loaded from: classes5.dex */
public final class z7 implements e8 {

    @NotNull
    public static final y7 Companion = new y7();
    public static final arf[] i;
    public final x1 a;
    public final w0 b;
    public final String c;
    public final String d;
    public final List e;
    public final List f;
    public final g g;
    public final Integer h;

    static {
        bwf bwfVar = bwf.b;
        i = new arf[]{null, null, null, null, btf.a(bwfVar, new u6(10)), btf.a(bwfVar, new u6(11)), null, null};
    }

    public /* synthetic */ z7(int i2, x1 x1Var, w0 w0Var, String str, String str2, List list, List list2, g gVar, Integer num) {
        if (31 != (i2 & 31)) {
            u7g.V(i2, 31, x7.a.getDescriptor());
            throw null;
        }
        this.a = x1Var;
        this.b = w0Var;
        this.c = str;
        this.d = str2;
        this.e = list;
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = list2;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = gVar;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7)) {
            return false;
        }
        z7 z7Var = (z7) obj;
        return Intrinsics.d(this.a, z7Var.a) && Intrinsics.d(this.b, z7Var.b) && Intrinsics.d(this.c, z7Var.c) && Intrinsics.d(this.d, z7Var.d) && Intrinsics.d(this.e, z7Var.e) && Intrinsics.d(this.f, z7Var.f) && Intrinsics.d(this.g, z7Var.g) && Intrinsics.d(this.h, z7Var.h);
    }

    @Override // com.yandex.plus.home.datasource.openapi.models.e8
    public final String getId() {
        return this.c;
    }

    public final int hashCode() {
        int d = k5r.d(k5r.c(k5r.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
        List list = this.f;
        int hashCode = (d + (list == null ? 0 : list.hashCode())) * 31;
        g gVar = this.g;
        int hashCode2 = (hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        Integer num = this.h;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkTextWidgetModel(displayRules=" + this.a + ", contentDescription=" + this.b + ", id=" + this.c + ", type=" + this.d + ", textItems=" + this.e + ", templates=" + this.f + ", action=" + this.g + ", lineHeight=" + this.h + ')';
    }
}
