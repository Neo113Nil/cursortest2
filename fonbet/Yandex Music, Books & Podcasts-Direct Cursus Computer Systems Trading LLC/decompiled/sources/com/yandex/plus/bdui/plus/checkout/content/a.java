package com.yandex.plus.bdui.plus.checkout.content;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements com.yandex.plus.bdui.content.a {
    public final com.yandex.plus.bdui.plus.checkout.content.serializer.e a;
    public final com.yandex.plus.bdui.action.a b;

    public a(com.yandex.plus.bdui.plus.checkout.content.serializer.e eVar, com.yandex.plus.bdui.action.a aVar) {
        aVar.getClass();
        this.a = eVar;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.a, aVar.a) && Intrinsics.d(this.b, aVar.b);
    }

    public final int hashCode() {
        com.yandex.plus.bdui.plus.checkout.content.serializer.e eVar = this.a;
        return this.b.hashCode() + ((eVar == null ? 0 : eVar.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusPayAppBarContent(user=");
        sb.append(this.a);
        sb.append(", onCloseAction=");
        return com.appsflyer.internal.k.o(sb, this.b, ')');
    }
}
