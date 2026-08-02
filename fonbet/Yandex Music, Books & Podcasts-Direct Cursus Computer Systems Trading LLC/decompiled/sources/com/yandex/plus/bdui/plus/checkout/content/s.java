package com.yandex.plus.bdui.plus.checkout.content;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s implements com.yandex.plus.bdui.content.a, com.yandex.plus.bdui.action.j {
    public final String a;
    public final String b;
    public final String c;
    public final com.yandex.plus.bdui.action.a d;
    public final com.yandex.plus.bdui.action.a e;
    public final com.yandex.plus.bdui.action.a f;
    public final com.yandex.plus.bdui.action.a g;

    public s(String str, String str2, String str3, com.yandex.plus.bdui.action.a aVar, com.yandex.plus.bdui.action.a aVar2, com.yandex.plus.bdui.action.a aVar3, com.yandex.plus.bdui.action.a aVar4) {
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = aVar;
        this.e = aVar2;
        this.f = aVar3;
        this.g = aVar4;
    }

    @Override // com.yandex.plus.bdui.action.j
    public final com.yandex.plus.bdui.action.a b() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.a, sVar.a) && Intrinsics.d(this.b, sVar.b) && Intrinsics.d(this.c, sVar.c) && Intrinsics.d(this.d, sVar.d) && Intrinsics.d(this.e, sVar.e) && Intrinsics.d(this.f, sVar.f) && Intrinsics.d(this.g, sVar.g);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int e = com.appsflyer.internal.k.e(this.f, com.appsflyer.internal.k.e(this.e, com.appsflyer.internal.k.e(this.d, (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31), 31);
        com.yandex.plus.bdui.action.a aVar = this.g;
        return e + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusPayUserAddNewSbpContent(posId=");
        sb.append(this.a);
        sb.append(", trustServiceToken=");
        sb.append(this.b);
        sb.append(", currency=");
        sb.append(this.c);
        sb.append(", nextAction=");
        sb.append(this.d);
        sb.append(", cancelAction=");
        sb.append(this.e);
        sb.append(", failureAction=");
        sb.append(this.f);
        sb.append(", onBackAction=");
        return com.appsflyer.internal.k.o(sb, this.g, ')');
    }
}
