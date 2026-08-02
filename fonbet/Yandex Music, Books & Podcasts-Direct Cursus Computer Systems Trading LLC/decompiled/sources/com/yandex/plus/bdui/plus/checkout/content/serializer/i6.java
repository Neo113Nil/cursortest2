package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class i6 {

    @NotNull
    public static final f6 Companion = new f6();
    public static final arf[] c = {null, btf.a(bwf.b, new y5(3))};
    public final String a;
    public final h6 b;

    public /* synthetic */ i6(int i, String str, h6 h6Var) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, e6.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = h6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6)) {
            return false;
        }
        i6 i6Var = (i6) obj;
        return Intrinsics.d(this.a, i6Var.a) && this.b == i6Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ReplacementParams(purchaseToken=" + this.a + ", strategy=" + this.b + ')';
    }
}
