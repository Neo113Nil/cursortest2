package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class z4 {

    @NotNull
    public static final r4 Companion = new r4();
    public static final arf[] e;
    public final y4 a;
    public final y4 b;
    public final y4 c;
    public final y4 d;

    static {
        bwf bwfVar = bwf.b;
        e = new arf[]{btf.a(bwfVar, new h0(26)), btf.a(bwfVar, new h0(27)), btf.a(bwfVar, new h0(28)), btf.a(bwfVar, new h0(29))};
    }

    public /* synthetic */ z4(int i, y4 y4Var, y4 y4Var2, y4 y4Var3, y4 y4Var4) {
        if (15 != (i & 15)) {
            u7g.V(i, 15, q4.a.getDescriptor());
            throw null;
        }
        this.a = y4Var;
        this.b = y4Var2;
        this.c = y4Var3;
        this.d = y4Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4)) {
            return false;
        }
        z4 z4Var = (z4) obj;
        return Intrinsics.d(this.a, z4Var.a) && Intrinsics.d(this.b, z4Var.b) && Intrinsics.d(this.c, z4Var.c) && Intrinsics.d(this.d, z4Var.d);
    }

    public final int hashCode() {
        y4 y4Var = this.a;
        int hashCode = (y4Var == null ? 0 : y4Var.hashCode()) * 31;
        y4 y4Var2 = this.b;
        int hashCode2 = (hashCode + (y4Var2 == null ? 0 : y4Var2.hashCode())) * 31;
        y4 y4Var3 = this.c;
        int hashCode3 = (hashCode2 + (y4Var3 == null ? 0 : y4Var3.hashCode())) * 31;
        y4 y4Var4 = this.d;
        return hashCode3 + (y4Var4 != null ? y4Var4.hashCode() : 0);
    }

    public final String toString() {
        return "ShapeSettingsDto(leftTopCorner=" + this.a + ", rightTopCorner=" + this.b + ", leftBottomCorner=" + this.c + ", rightBottomCorner=" + this.d + ')';
    }

    public z4(y4 y4Var, y4 y4Var2, y4 y4Var3, y4 y4Var4) {
        this.a = y4Var;
        this.b = y4Var2;
        this.c = y4Var3;
        this.d = y4Var4;
    }
}
