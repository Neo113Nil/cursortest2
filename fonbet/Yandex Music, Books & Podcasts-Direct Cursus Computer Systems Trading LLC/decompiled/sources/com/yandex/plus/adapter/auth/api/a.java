package com.yandex.plus.adapter.auth.api;

import defpackage.k5r;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class a {
    public final boolean a;
    public final ArrayList b;

    public a(ArrayList arrayList, boolean z) {
        this.a = z;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b.equals(aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountInfo(isYandexEmployee=");
        sb.append(this.a);
        sb.append(", partitions=");
        return k5r.o(sb, this.b, ')');
    }
}
