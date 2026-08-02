package com.yandex.plus.bdui.plus.checkout.content;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k implements com.yandex.plus.bdui.content.a, com.yandex.plus.bdui.action.j {
    public final List a;
    public final com.yandex.plus.bdui.action.a b;
    public final com.yandex.plus.bdui.action.a c;
    public final com.yandex.plus.bdui.action.a d;

    public k(List list, com.yandex.plus.bdui.action.a aVar, com.yandex.plus.bdui.action.a aVar2, com.yandex.plus.bdui.action.a aVar3) {
        list.getClass();
        aVar.getClass();
        aVar2.getClass();
        this.a = list;
        this.b = aVar;
        this.c = aVar2;
        this.d = aVar3;
    }

    @Override // com.yandex.plus.bdui.action.j
    public final com.yandex.plus.bdui.action.a b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.a, kVar.a) && Intrinsics.d(this.b, kVar.b) && Intrinsics.d(this.c, kVar.c) && Intrinsics.d(this.d, kVar.d);
    }

    public final int hashCode() {
        int e = com.appsflyer.internal.k.e(this.c, com.appsflyer.internal.k.e(this.b, this.a.hashCode() * 31, 31), 31);
        com.yandex.plus.bdui.action.a aVar = this.d;
        return e + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusPayGetInAppInfoContent(productIds=");
        sb.append(this.a);
        sb.append(", nextAction=");
        sb.append(this.b);
        sb.append(", failureAction=");
        sb.append(this.c);
        sb.append(", onBackAction=");
        return com.appsflyer.internal.k.o(sb, this.d, ')');
    }
}
