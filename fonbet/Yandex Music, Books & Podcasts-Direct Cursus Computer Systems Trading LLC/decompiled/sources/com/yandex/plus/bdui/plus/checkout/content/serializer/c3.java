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
public final class c3 {

    @NotNull
    public static final b3 Companion = new b3();
    public static final arf[] f;
    public final com.yandex.plus.bdui.action.a a;
    public final com.yandex.plus.bdui.action.a b;
    public final com.yandex.plus.bdui.action.a c;
    public final com.yandex.plus.bdui.action.a d;
    public final com.yandex.plus.bdui.action.a e;

    static {
        bwf bwfVar = bwf.b;
        f = new arf[]{btf.a(bwfVar, new q0(9)), btf.a(bwfVar, new q0(10)), btf.a(bwfVar, new q0(11)), btf.a(bwfVar, new q0(12)), btf.a(bwfVar, new q0(13))};
    }

    public /* synthetic */ c3(int i, com.yandex.plus.bdui.action.a aVar, com.yandex.plus.bdui.action.a aVar2, com.yandex.plus.bdui.action.a aVar3, com.yandex.plus.bdui.action.a aVar4, com.yandex.plus.bdui.action.a aVar5) {
        if (31 != (i & 31)) {
            u7g.V(i, 31, a3.a.getDescriptor());
            throw null;
        }
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
        this.e = aVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3)) {
            return false;
        }
        c3 c3Var = (c3) obj;
        return Intrinsics.d(this.a, c3Var.a) && Intrinsics.d(this.b, c3Var.b) && Intrinsics.d(this.c, c3Var.c) && Intrinsics.d(this.d, c3Var.d) && Intrinsics.d(this.e, c3Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        com.yandex.plus.bdui.action.a aVar = this.b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        com.yandex.plus.bdui.action.a aVar2 = this.c;
        int e = com.appsflyer.internal.k.e(this.d, (hashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31, 31);
        com.yandex.plus.bdui.action.a aVar3 = this.e;
        return e + (aVar3 != null ? aVar3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionsDto(onOfferClick=");
        sb.append(this.a);
        sb.append(", onOfferShow=");
        sb.append(this.b);
        sb.append(", onLinkClick=");
        sb.append(this.c);
        sb.append(", close=");
        sb.append(this.d);
        sb.append(", back=");
        return com.appsflyer.internal.k.o(sb, this.e, ')');
    }
}
