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
public final class n5 {

    @NotNull
    public static final m5 Companion = new m5();
    public static final arf[] f;
    public final com.yandex.plus.bdui.action.a a;
    public final com.yandex.plus.bdui.action.a b;
    public final com.yandex.plus.bdui.action.a c;
    public final com.yandex.plus.bdui.action.a d;
    public final com.yandex.plus.bdui.action.a e;

    static {
        bwf bwfVar = bwf.b;
        f = new arf[]{btf.a(bwfVar, new q0(24)), btf.a(bwfVar, new q0(25)), btf.a(bwfVar, new q0(26)), btf.a(bwfVar, new q0(27)), btf.a(bwfVar, new q0(28))};
    }

    public /* synthetic */ n5(int i, com.yandex.plus.bdui.action.a aVar, com.yandex.plus.bdui.action.a aVar2, com.yandex.plus.bdui.action.a aVar3, com.yandex.plus.bdui.action.a aVar4, com.yandex.plus.bdui.action.a aVar5) {
        if (31 != (i & 31)) {
            u7g.V(i, 31, l5.a.getDescriptor());
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
        if (!(obj instanceof n5)) {
            return false;
        }
        n5 n5Var = (n5) obj;
        return Intrinsics.d(this.a, n5Var.a) && Intrinsics.d(this.b, n5Var.b) && Intrinsics.d(this.c, n5Var.c) && Intrinsics.d(this.d, n5Var.d) && Intrinsics.d(this.e, n5Var.e);
    }

    public final int hashCode() {
        int e = com.appsflyer.internal.k.e(this.c, com.appsflyer.internal.k.e(this.b, this.a.hashCode() * 31, 31), 31);
        com.yandex.plus.bdui.action.a aVar = this.d;
        int hashCode = (e + (aVar == null ? 0 : aVar.hashCode())) * 31;
        com.yandex.plus.bdui.action.a aVar2 = this.e;
        return hashCode + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionsDto(close=");
        sb.append(this.a);
        sb.append(", onSuggestedOfferClick=");
        sb.append(this.b);
        sb.append(", onOriginalOfferClick=");
        sb.append(this.c);
        sb.append(", onLegalTextShown=");
        sb.append(this.d);
        sb.append(", back=");
        return com.appsflyer.internal.k.o(sb, this.e, ')');
    }
}
