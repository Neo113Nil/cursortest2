package com.yandex.plus.bdui.plus.checkout.content.controller;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p0 {
    public final com.yandex.plus.pay.ui.common.internal.error.content.f a;
    public final com.yandex.plus.bdui.action.a b;

    public p0(com.yandex.plus.pay.ui.common.internal.error.content.f fVar, com.yandex.plus.bdui.action.a aVar) {
        aVar.getClass();
        this.a = fVar;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return this.a.equals(p0Var.a) && Intrinsics.d(this.b, p0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ButtonContentAndAction(buttonContent=");
        sb.append(this.a);
        sb.append(", action=");
        return com.appsflyer.internal.k.o(sb, this.b, ')');
    }
}
