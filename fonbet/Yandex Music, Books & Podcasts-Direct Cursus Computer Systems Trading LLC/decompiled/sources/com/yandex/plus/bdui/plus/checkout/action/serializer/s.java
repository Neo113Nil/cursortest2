package com.yandex.plus.bdui.plus.checkout.action.serializer;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class s {

    @NotNull
    public static final p Companion = new p();
    public static final arf[] c = {null, btf.a(bwf.b, new com.yandex.plus.bdui.plus.action.serializer.s(10))};
    public final String a;
    public final r b;

    public /* synthetic */ s(int i, String str, r rVar) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, o.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.a, sVar.a) && this.b == sVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ReplacementParams(purchaseToken=" + this.a + ", strategy=" + this.b + ')';
    }
}
