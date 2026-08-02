package com.yandex.plus.bdui.plus.checkout.action.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class w {

    @NotNull
    public static final v Companion = new v();
    public final t a;
    public final l b;

    public /* synthetic */ w(int i, t tVar, l lVar) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, u.a.getDescriptor());
            throw null;
        }
        this.a = tVar;
        this.b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.d(this.a, wVar.a) && Intrinsics.d(this.b, wVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PurchaseDto(data=" + this.a + ", actions=" + this.b + ')';
    }
}
