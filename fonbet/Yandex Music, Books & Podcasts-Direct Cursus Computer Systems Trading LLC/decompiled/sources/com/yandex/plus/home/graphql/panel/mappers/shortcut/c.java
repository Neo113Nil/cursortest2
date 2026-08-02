package com.yandex.plus.home.graphql.panel.mappers.shortcut;

import com.appsflyer.internal.k;
import com.yandex.plus.core.data.common.v;
import defpackage.eta;
import defpackage.k5r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c {
    public final String a;
    public final v b;
    public final List c;
    public final List d;

    public c(String str, v vVar, List list, List list2) {
        vVar.getClass();
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = vVar;
        this.c = list;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a.equals(cVar.a) && Intrinsics.d(this.b, cVar.b) && Intrinsics.d(this.c, cVar.c) && Intrinsics.d(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k5r.d(k.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextProperties(text=");
        sb.append(this.a);
        sb.append(", textColor=");
        sb.append(this.b);
        sb.append(", textIcons=");
        sb.append(this.c);
        sb.append(", styledTexts=");
        return eta.h(sb, this.d, ')');
    }
}
