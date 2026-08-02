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
public final class l2 {

    @NotNull
    public static final k2 Companion = new k2();
    public static final arf[] e;
    public final com.yandex.plus.bdui.action.a a;
    public final com.yandex.plus.bdui.action.a b;
    public final com.yandex.plus.bdui.action.a c;
    public final com.yandex.plus.bdui.action.a d;

    static {
        bwf bwfVar = bwf.b;
        e = new arf[]{btf.a(bwfVar, new q0(4)), btf.a(bwfVar, new q0(5)), btf.a(bwfVar, new q0(6)), btf.a(bwfVar, new q0(7))};
    }

    public /* synthetic */ l2(int i, com.yandex.plus.bdui.action.a aVar, com.yandex.plus.bdui.action.a aVar2, com.yandex.plus.bdui.action.a aVar3, com.yandex.plus.bdui.action.a aVar4) {
        if (15 != (i & 15)) {
            u7g.V(i, 15, j2.a.getDescriptor());
            throw null;
        }
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        return Intrinsics.d(this.a, l2Var.a) && Intrinsics.d(this.b, l2Var.b) && Intrinsics.d(this.c, l2Var.c) && Intrinsics.d(this.d, l2Var.d);
    }

    public final int hashCode() {
        int e2 = com.appsflyer.internal.k.e(this.c, com.appsflyer.internal.k.e(this.b, this.a.hashCode() * 31, 31), 31);
        com.yandex.plus.bdui.action.a aVar = this.d;
        return e2 + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionsDto(accept=");
        sb.append(this.a);
        sb.append(", reject=");
        sb.append(this.b);
        sb.append(", close=");
        sb.append(this.c);
        sb.append(", back=");
        return com.appsflyer.internal.k.o(sb, this.d, ')');
    }
}
