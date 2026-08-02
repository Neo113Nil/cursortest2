package com.yandex.plus.bdui.plus.checkout.content;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o implements com.yandex.plus.bdui.content.a, com.yandex.plus.bdui.action.j {
    public final String a;
    public final com.yandex.plus.pay.inapp.api.h b;
    public final com.yandex.plus.bdui.action.a c;
    public final com.yandex.plus.bdui.action.a d;
    public final com.yandex.plus.bdui.action.a e;
    public final com.yandex.plus.bdui.action.a f;

    public o(String str, com.yandex.plus.pay.inapp.api.h hVar, com.yandex.plus.bdui.action.a aVar, com.yandex.plus.bdui.action.a aVar2, com.yandex.plus.bdui.action.a aVar3, com.yandex.plus.bdui.action.a aVar4) {
        str.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        this.a = str;
        this.b = hVar;
        this.c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = aVar4;
    }

    @Override // com.yandex.plus.bdui.action.j
    public final com.yandex.plus.bdui.action.a b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.a, oVar.a) && Intrinsics.d(this.b, oVar.b) && Intrinsics.d(this.c, oVar.c) && Intrinsics.d(this.d, oVar.d) && Intrinsics.d(this.e, oVar.e) && Intrinsics.d(this.f, oVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        com.yandex.plus.pay.inapp.api.h hVar = this.b;
        int e = com.appsflyer.internal.k.e(this.e, com.appsflyer.internal.k.e(this.d, com.appsflyer.internal.k.e(this.c, (hashCode + (hVar == null ? 0 : hVar.hashCode())) * 31, 31), 31), 31);
        com.yandex.plus.bdui.action.a aVar = this.f;
        return e + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusPayPurchaseContent(productId=");
        sb.append(this.a);
        sb.append(", replacementParams=");
        sb.append(this.b);
        sb.append(", nextAction=");
        sb.append(this.c);
        sb.append(", cancelAction=");
        sb.append(this.d);
        sb.append(", failureAction=");
        sb.append(this.e);
        sb.append(", onBackAction=");
        return com.appsflyer.internal.k.o(sb, this.f, ')');
    }
}
