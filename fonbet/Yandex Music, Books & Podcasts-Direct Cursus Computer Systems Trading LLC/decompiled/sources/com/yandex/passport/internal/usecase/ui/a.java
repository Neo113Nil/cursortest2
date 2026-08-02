package com.yandex.passport.internal.usecase.ui;

import defpackage.k5r;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {
    public final List a;
    public final Map b;

    public a(List list, Map map) {
        list.getClass();
        map.getClass();
        this.a = list;
        this.b = map;
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
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(accounts=");
        sb.append(this.a);
        sb.append(", children=");
        return k5r.p(sb, this.b, ')');
    }
}
