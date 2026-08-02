package com.yandex.plus.bdui.plus.checkout.action;

import com.appsflyer.internal.k;
import com.yandex.plus.pay.inapp.api.h;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d implements com.yandex.plus.bdui.action.a {
    public final String a;
    public final h b;
    public final com.yandex.plus.bdui.action.a c;
    public final com.yandex.plus.bdui.action.a d;
    public final com.yandex.plus.bdui.action.a e;

    public d(String str, h hVar, com.yandex.plus.bdui.action.a aVar, com.yandex.plus.bdui.action.a aVar2, com.yandex.plus.bdui.action.a aVar3) {
        str.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        this.a = str;
        this.b = hVar;
        this.c = aVar;
        this.d = aVar2;
        this.e = aVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.a, dVar.a) && Intrinsics.d(this.b, dVar.b) && Intrinsics.d(this.c, dVar.c) && Intrinsics.d(this.d, dVar.d) && Intrinsics.d(this.e, dVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        h hVar = this.b;
        return this.e.hashCode() + k.e(this.d, k.e(this.c, (hashCode + (hVar == null ? 0 : hVar.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusPayInAppPurchaseAction(productId=");
        sb.append(this.a);
        sb.append(", replacementParams=");
        sb.append(this.b);
        sb.append(", successAction=");
        sb.append(this.c);
        sb.append(", cancelAction=");
        sb.append(this.d);
        sb.append(", errorAction=");
        return k.o(sb, this.e, ')');
    }
}
