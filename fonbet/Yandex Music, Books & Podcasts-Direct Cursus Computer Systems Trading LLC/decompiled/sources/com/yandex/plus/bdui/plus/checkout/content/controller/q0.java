package com.yandex.plus.bdui.plus.checkout.content.controller;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q0 {
    public final com.yandex.plus.bdui.action.a a;
    public final com.yandex.plus.bdui.action.a b;
    public final com.yandex.plus.bdui.shared.b c;

    public q0(com.yandex.plus.bdui.action.a aVar, com.yandex.plus.bdui.action.a aVar2, com.yandex.plus.bdui.shared.b bVar) {
        bVar.getClass();
        this.a = aVar;
        this.b = aVar2;
        this.c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Intrinsics.d(this.a, q0Var.a) && Intrinsics.d(this.b, q0Var.b) && Intrinsics.d(this.c, q0Var.c);
    }

    public final int hashCode() {
        com.yandex.plus.bdui.action.a aVar = this.a;
        int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        com.yandex.plus.bdui.action.a aVar2 = this.b;
        return this.c.hashCode() + ((hashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "FailureInfo(primaryAction=" + this.a + ", secondaryAction=" + this.b + ", shared=" + this.c + ')';
    }
}
