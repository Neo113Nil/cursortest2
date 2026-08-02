package com.yandex.plus.core.graphql.fragment;

import defpackage.k5r;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class de {
    public final String a;
    public final ArrayList b;

    public de(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de)) {
            return false;
        }
        de deVar = (de) obj;
        return Intrinsics.d(this.a, deVar.a) && this.b.equals(deVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaqueContainer(metaColor=");
        sb.append(this.a);
        sb.append(", items=");
        return k5r.o(sb, this.b, ')');
    }
}
