package com.yandex.passport.internal.ui.bouncer.model;

import defpackage.eta;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n1 implements v1 {
    public final boolean a;
    public final List b;

    public n1(List list, boolean z) {
        list.getClass();
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return this.a == n1Var.a && Intrinsics.d(this.b, n1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChooseMaster(createMasterEnterPhoneNumberOption=");
        sb.append(this.a);
        sb.append(", masterAccounts=");
        return eta.h(sb, this.b, ')');
    }
}
