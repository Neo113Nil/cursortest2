package com.gamericefishpro.space.u1;

import com.gamericefishpro.space.t0.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends h0 implements Iterable, com.gamericefishpro.space.fi.a {
    public final float A;
    public final List B;
    public final List C;
    public final String d;
    public final float e;
    public final float i;
    public final float v;
    public final float w;
    public final float y;
    public final float z;

    public f0(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.d = str;
        this.e = f;
        this.i = f2;
        this.v = f3;
        this.w = f4;
        this.y = f5;
        this.z = f6;
        this.A = f7;
        this.B = list;
        this.C = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof f0)) {
            f0 f0Var = (f0) obj;
            return Intrinsics.a(this.d, f0Var.d) && this.e == f0Var.e && this.i == f0Var.i && this.v == f0Var.v && this.w == f0Var.w && this.y == f0Var.y && this.z == f0Var.z && this.A == f0Var.A && Intrinsics.a(this.B, f0Var.B) && Intrinsics.a(this.C, f0Var.C);
        }
        return false;
    }

    public final int hashCode() {
        return this.C.hashCode() + ((this.B.hashCode() + y0.a(this.A, y0.a(this.z, y0.a(this.y, y0.a(this.w, y0.a(this.v, y0.a(this.i, y0.a(this.e, this.d.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new com.gamericefishpro.space.ph.h(this);
    }
}
