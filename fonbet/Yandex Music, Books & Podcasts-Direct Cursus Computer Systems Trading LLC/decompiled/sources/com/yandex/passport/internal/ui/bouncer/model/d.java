package com.yandex.passport.internal.ui.bouncer.model;

import defpackage.eta;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d implements k0 {
    public final com.yandex.passport.internal.l a;
    public final List b;

    public d(com.yandex.passport.internal.l lVar, List list) {
        lVar.getClass();
        list.getClass();
        this.a = lVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.a, dVar.a) && Intrinsics.d(this.b, dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountSelected(modernAccount=");
        sb.append(this.a);
        sb.append(", badges=");
        return eta.h(sb, this.b, ')');
    }
}
