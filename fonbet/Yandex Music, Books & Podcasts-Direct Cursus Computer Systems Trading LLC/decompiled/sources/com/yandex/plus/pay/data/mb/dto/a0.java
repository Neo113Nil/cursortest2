package com.yandex.plus.pay.data.mb.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class a0 {

    @NotNull
    public static final u Companion = new u();
    public static final arf[] d = {null, btf.a(bwf.b, new com.yandex.plus.pay.data.acquisition.dto.f(23)), null};
    public final String a;
    public final z b;
    public final x c;

    public /* synthetic */ a0(int i, String str, z zVar, x xVar) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, t.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = zVar;
        this.c = xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.d(this.a, a0Var.a) && this.b == a0Var.b && Intrinsics.d(this.c, a0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Item(key=" + this.a + ", type=" + this.b + ", data=" + this.c + ')';
    }
}
