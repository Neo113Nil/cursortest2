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
public final class g0 {

    @NotNull
    public static final f0 Companion = new f0();
    public static final arf[] h;
    public final com.yandex.plus.bdui.action.a a;
    public final com.yandex.plus.bdui.action.a b;
    public final com.yandex.plus.bdui.action.a c;
    public final com.yandex.plus.bdui.action.a d;
    public final com.yandex.plus.bdui.action.a e;
    public final com.yandex.plus.bdui.action.a f;
    public final com.yandex.plus.bdui.action.a g;

    static {
        bwf bwfVar = bwf.b;
        h = new arf[]{btf.a(bwfVar, new com.yandex.plus.bdui.plus.action.serializer.s(18)), btf.a(bwfVar, new com.yandex.plus.bdui.plus.action.serializer.s(19)), btf.a(bwfVar, new com.yandex.plus.bdui.plus.action.serializer.s(20)), btf.a(bwfVar, new com.yandex.plus.bdui.plus.action.serializer.s(21)), btf.a(bwfVar, new com.yandex.plus.bdui.plus.action.serializer.s(22)), btf.a(bwfVar, new com.yandex.plus.bdui.plus.action.serializer.s(23)), btf.a(bwfVar, new com.yandex.plus.bdui.plus.action.serializer.s(24))};
    }

    public /* synthetic */ g0(int i, com.yandex.plus.bdui.action.a aVar, com.yandex.plus.bdui.action.a aVar2, com.yandex.plus.bdui.action.a aVar3, com.yandex.plus.bdui.action.a aVar4, com.yandex.plus.bdui.action.a aVar5, com.yandex.plus.bdui.action.a aVar6, com.yandex.plus.bdui.action.a aVar7) {
        if (127 != (i & 127)) {
            u7g.V(i, 127, e0.a.getDescriptor());
            throw null;
        }
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
        this.g = aVar7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Intrinsics.d(this.a, g0Var.a) && Intrinsics.d(this.b, g0Var.b) && Intrinsics.d(this.c, g0Var.c) && Intrinsics.d(this.d, g0Var.d) && Intrinsics.d(this.e, g0Var.e) && Intrinsics.d(this.f, g0Var.f) && Intrinsics.d(this.g, g0Var.g);
    }

    public final int hashCode() {
        int e = com.appsflyer.internal.k.e(this.b, this.a.hashCode() * 31, 31);
        com.yandex.plus.bdui.action.a aVar = this.c;
        int hashCode = (e + (aVar == null ? 0 : aVar.hashCode())) * 31;
        com.yandex.plus.bdui.action.a aVar2 = this.d;
        int hashCode2 = (hashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        com.yandex.plus.bdui.action.a aVar3 = this.e;
        int hashCode3 = (hashCode2 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        com.yandex.plus.bdui.action.a aVar4 = this.f;
        int hashCode4 = (hashCode3 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        com.yandex.plus.bdui.action.a aVar5 = this.g;
        return hashCode4 + (aVar5 != null ? aVar5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionsDto(next=");
        sb.append(this.a);
        sb.append(", close=");
        sb.append(this.b);
        sb.append(", onLegalTextShown=");
        sb.append(this.c);
        sb.append(", onPaymentMethodClick=");
        sb.append(this.d);
        sb.append(", onOfferSwitchClick=");
        sb.append(this.e);
        sb.append(", onAdditionalOfferSelectedChange=");
        sb.append(this.f);
        sb.append(", back=");
        return com.appsflyer.internal.k.o(sb, this.g, ')');
    }
}
