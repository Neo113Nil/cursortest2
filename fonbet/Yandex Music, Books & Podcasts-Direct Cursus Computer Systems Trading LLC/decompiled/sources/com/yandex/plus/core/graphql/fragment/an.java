package com.yandex.plus.core.graphql.fragment;

import defpackage.k5r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class an {
    public final String a;
    public final String b;
    public final com.yandex.plus.core.graphql.type.i0 c;
    public final List d;
    public final Boolean e;

    public an(String str, String str2, com.yandex.plus.core.graphql.type.i0 i0Var, List list, Boolean bool) {
        this.a = str;
        this.b = str2;
        this.c = i0Var;
        this.d = list;
        this.e = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an)) {
            return false;
        }
        an anVar = (an) obj;
        return this.a.equals(anVar.a) && this.b.equals(anVar.b) && this.c == anVar.c && Intrinsics.d(this.d, anVar.d) && Intrinsics.d(this.e, anVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b)) * 31;
        List list = this.d;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.e;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SectionFragment(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", viewType=");
        sb.append(this.c);
        sb.append(", shortcuts=");
        sb.append(this.d);
        sb.append(", hasHeavyShortcuts=");
        return com.appsflyer.internal.k.p(sb, this.e, ')');
    }
}
