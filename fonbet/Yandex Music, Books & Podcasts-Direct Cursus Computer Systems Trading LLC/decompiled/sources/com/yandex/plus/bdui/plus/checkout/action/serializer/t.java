package com.yandex.plus.bdui.plus.checkout.action.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class t {

    @NotNull
    public static final n Companion = new n();
    public final String a;
    public final s b;

    public /* synthetic */ t(int i, String str, s sVar) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, m.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.a, tVar.a) && Intrinsics.d(this.b, tVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        s sVar = this.b;
        return hashCode + (sVar == null ? 0 : sVar.hashCode());
    }

    public final String toString() {
        return "DataDto(productId=" + this.a + ", replacementParams=" + this.b + ')';
    }
}
