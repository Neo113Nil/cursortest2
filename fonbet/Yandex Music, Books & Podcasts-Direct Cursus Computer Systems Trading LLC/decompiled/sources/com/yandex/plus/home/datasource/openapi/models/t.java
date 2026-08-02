package com.yandex.plus.home.datasource.openapi.models;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class t {

    @NotNull
    public static final s Companion = new s();
    public final i1 a;
    public final i1 b;
    public final i1 c;
    public final i1 d;

    public /* synthetic */ t(int i, i1 i1Var, i1 i1Var2, i1 i1Var3, i1 i1Var4) {
        if (15 != (i & 15)) {
            u7g.V(i, 15, r.a.getDescriptor());
            throw null;
        }
        this.a = i1Var;
        this.b = i1Var2;
        this.c = i1Var3;
        this.d = i1Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.a, tVar.a) && Intrinsics.d(this.b, tVar.b) && Intrinsics.d(this.c, tVar.c) && Intrinsics.d(this.d, tVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "NetworkBackgroundShapeModel(leftTopCorner=" + this.a + ", rightTopCorner=" + this.b + ", leftBottomCorner=" + this.c + ", rightBottomCorner=" + this.d + ')';
    }
}
