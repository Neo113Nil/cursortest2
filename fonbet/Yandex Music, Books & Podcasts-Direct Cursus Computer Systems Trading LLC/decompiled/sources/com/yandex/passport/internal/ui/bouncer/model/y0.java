package com.yandex.passport.internal.ui.bouncer.model;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y0 {
    public final com.yandex.passport.common.core.f a;
    public final String b;

    public y0(com.yandex.passport.common.core.f fVar, String str) {
        fVar.getClass();
        str.getClass();
        this.a = fVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return Intrinsics.d(this.a, y0Var.a) && Intrinsics.d(this.b, y0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BouncerMasterAccount(uid=");
        sb.append(this.a);
        sb.append(", phoneNumber=");
        return dfi.i(sb, this.b, ')');
    }
}
