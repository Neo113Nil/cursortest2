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
public final class k8 {

    @NotNull
    public static final j8 Companion = new j8();
    public static final arf[] e;
    public final com.yandex.plus.bdui.action.a a;
    public final com.yandex.plus.bdui.action.a b;
    public final com.yandex.plus.bdui.action.a c;
    public final com.yandex.plus.bdui.action.a d;

    static {
        bwf bwfVar = bwf.b;
        e = new arf[]{btf.a(bwfVar, new y5(17)), btf.a(bwfVar, new y5(18)), btf.a(bwfVar, new y5(19)), btf.a(bwfVar, new y5(20))};
    }

    public /* synthetic */ k8(int i, com.yandex.plus.bdui.action.a aVar, com.yandex.plus.bdui.action.a aVar2, com.yandex.plus.bdui.action.a aVar3, com.yandex.plus.bdui.action.a aVar4) {
        if (15 != (i & 15)) {
            u7g.V(i, 15, i8.a.getDescriptor());
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
        if (!(obj instanceof k8)) {
            return false;
        }
        k8 k8Var = (k8) obj;
        return Intrinsics.d(this.a, k8Var.a) && Intrinsics.d(this.b, k8Var.b) && Intrinsics.d(this.c, k8Var.c) && Intrinsics.d(this.d, k8Var.d);
    }

    public final int hashCode() {
        int e2 = com.appsflyer.internal.k.e(this.c, com.appsflyer.internal.k.e(this.b, this.a.hashCode() * 31, 31), 31);
        com.yandex.plus.bdui.action.a aVar = this.d;
        return e2 + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionsDto(next=");
        sb.append(this.a);
        sb.append(", cancel=");
        sb.append(this.b);
        sb.append(", failure=");
        sb.append(this.c);
        sb.append(", back=");
        return com.appsflyer.internal.k.o(sb, this.d, ')');
    }
}
