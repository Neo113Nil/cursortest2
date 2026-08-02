package com.yandex.passport.internal.ui.bouncer.model;

import defpackage.eta;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d2 implements g2 {
    public final com.yandex.passport.internal.l a;
    public final List b;

    public d2(com.yandex.passport.internal.l lVar, List list) {
        lVar.getClass();
        list.getClass();
        this.a = lVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return Intrinsics.d(this.a, d2Var.a) && Intrinsics.d(this.b, d2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectAccount(selectedAccount=");
        sb.append(this.a);
        sb.append(", badges=");
        return eta.h(sb, this.b, ')');
    }
}
