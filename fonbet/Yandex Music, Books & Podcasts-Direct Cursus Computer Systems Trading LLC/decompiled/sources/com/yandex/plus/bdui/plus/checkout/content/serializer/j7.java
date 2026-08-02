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
public final class j7 {

    @NotNull
    public static final i7 Companion = new i7();
    public static final arf[] e;
    public final com.yandex.plus.bdui.action.a a;
    public final com.yandex.plus.bdui.action.a b;
    public final com.yandex.plus.bdui.action.a c;
    public final com.yandex.plus.bdui.action.a d;

    static {
        bwf bwfVar = bwf.b;
        e = new arf[]{btf.a(bwfVar, new y5(8)), btf.a(bwfVar, new y5(9)), btf.a(bwfVar, new y5(10)), btf.a(bwfVar, new y5(11))};
    }

    public /* synthetic */ j7(int i, com.yandex.plus.bdui.action.a aVar, com.yandex.plus.bdui.action.a aVar2, com.yandex.plus.bdui.action.a aVar3, com.yandex.plus.bdui.action.a aVar4) {
        if (15 != (i & 15)) {
            u7g.V(i, 15, h7.a.getDescriptor());
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
        if (!(obj instanceof j7)) {
            return false;
        }
        j7 j7Var = (j7) obj;
        return Intrinsics.d(this.a, j7Var.a) && Intrinsics.d(this.b, j7Var.b) && Intrinsics.d(this.c, j7Var.c) && Intrinsics.d(this.d, j7Var.d);
    }

    public final int hashCode() {
        int e2 = com.appsflyer.internal.k.e(this.b, this.a.hashCode() * 31, 31);
        com.yandex.plus.bdui.action.a aVar = this.c;
        int hashCode = (e2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        com.yandex.plus.bdui.action.a aVar2 = this.d;
        return hashCode + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionsDto(accept=");
        sb.append(this.a);
        sb.append(", reject=");
        sb.append(this.b);
        sb.append(", onLegalTextShown=");
        sb.append(this.c);
        sb.append(", back=");
        return com.appsflyer.internal.k.o(sb, this.d, ')');
    }
}
