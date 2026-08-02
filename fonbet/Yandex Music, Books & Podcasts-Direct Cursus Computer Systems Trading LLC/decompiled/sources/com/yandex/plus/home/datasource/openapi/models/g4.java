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
public final class g4 implements e8 {

    @NotNull
    public static final e4 Companion = new e4();
    public static final arf[] i;
    public final x1 a;
    public final w0 b;
    public final String c;
    public final String d;
    public final List e;
    public final f4 f;
    public final List g;
    public final g h;

    static {
        bwf bwfVar = bwf.b;
        i = new arf[]{null, null, null, null, btf.a(bwfVar, new k0(17)), btf.a(bwfVar, new k0(18)), btf.a(bwfVar, new k0(19)), null};
    }

    public /* synthetic */ g4(int i2, x1 x1Var, w0 w0Var, String str, String str2, List list, f4 f4Var, List list2, g gVar) {
        if (63 != (i2 & 63)) {
            u7g.V(i2, 63, d4.a.getDescriptor());
            throw null;
        }
        this.a = x1Var;
        this.b = w0Var;
        this.c = str;
        this.d = str2;
        this.e = list;
        this.f = f4Var;
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = list2;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = gVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4)) {
            return false;
        }
        g4 g4Var = (g4) obj;
        return Intrinsics.d(this.a, g4Var.a) && Intrinsics.d(this.b, g4Var.b) && Intrinsics.d(this.c, g4Var.c) && Intrinsics.d(this.d, g4Var.d) && Intrinsics.d(this.e, g4Var.e) && this.f == g4Var.f && Intrinsics.d(this.g, g4Var.g) && Intrinsics.d(this.h, g4Var.h);
    }

    @Override // com.yandex.plus.home.datasource.openapi.models.e8
    public final String getId() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + k5r.d(k5r.c(k5r.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e)) * 31;
        List list = this.g;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        g gVar = this.h;
        return hashCode2 + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkLineWidgetGroupModel(displayRules=" + this.a + ", contentDescription=" + this.b + ", id=" + this.c + ", type=" + this.d + ", widgetIds=" + this.e + ", orientation=" + this.f + ", templates=" + this.g + ", action=" + this.h + ')';
    }
}
