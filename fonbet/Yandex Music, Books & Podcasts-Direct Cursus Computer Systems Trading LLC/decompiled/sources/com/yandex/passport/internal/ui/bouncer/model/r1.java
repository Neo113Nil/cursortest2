package com.yandex.passport.internal.ui.bouncer.model;

import defpackage.eta;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r1 implements v1 {
    public final com.yandex.passport.internal.properties.l a;
    public final List b;

    public r1(com.yandex.passport.internal.properties.l lVar, List list) {
        list.getClass();
        this.a = lVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return this.a.equals(r1Var.a) && Intrinsics.d(this.b, r1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Roundabout(loginProperties=");
        sb.append(this.a);
        sb.append(", accounts=");
        return eta.h(sb, this.b, ')');
    }
}
