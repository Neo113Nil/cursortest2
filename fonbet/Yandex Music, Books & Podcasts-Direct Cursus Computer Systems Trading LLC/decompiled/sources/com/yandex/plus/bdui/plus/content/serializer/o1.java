package com.yandex.plus.bdui.plus.content.serializer;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class o1 {

    @NotNull
    public static final n1 Companion = new n1();
    public static final arf[] c = {null, btf.a(bwf.b, new b(17))};
    public final r1 a;
    public final com.yandex.plus.bdui.action.a b;

    public /* synthetic */ o1(int i, r1 r1Var, com.yandex.plus.bdui.action.a aVar) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, m1.a.getDescriptor());
            throw null;
        }
        this.a = r1Var;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return Intrinsics.d(this.a, o1Var.a) && Intrinsics.d(this.b, o1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FallbackDto(texts=");
        sb.append(this.a);
        sb.append(", nextAction=");
        return com.appsflyer.internal.k.o(sb, this.b, ')');
    }
}
