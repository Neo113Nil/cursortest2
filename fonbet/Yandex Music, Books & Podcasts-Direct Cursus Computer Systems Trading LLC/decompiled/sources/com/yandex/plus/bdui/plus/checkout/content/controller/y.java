package com.yandex.plus.bdui.plus.checkout.content.controller;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y {
    public final com.yandex.plus.bdui.action.a a;
    public final com.yandex.plus.bdui.action.a b;
    public final com.yandex.plus.bdui.action.a c;
    public final com.yandex.plus.bdui.shared.b d;

    public y(com.yandex.plus.bdui.action.a aVar, com.yandex.plus.bdui.action.a aVar2, com.yandex.plus.bdui.action.a aVar3, com.yandex.plus.bdui.shared.b bVar) {
        aVar.getClass();
        aVar3.getClass();
        bVar.getClass();
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.d(this.a, yVar.a) && Intrinsics.d(this.b, yVar.b) && Intrinsics.d(this.c, yVar.c) && Intrinsics.d(this.d, yVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        com.yandex.plus.bdui.action.a aVar = this.b;
        return this.d.hashCode() + com.appsflyer.internal.k.e(this.c, (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "FailureInfo(primaryButtonAction=" + this.a + ", secondaryButtonAction=" + this.b + ", closeButtonAction=" + this.c + ", shared=" + this.d + ')';
    }
}
