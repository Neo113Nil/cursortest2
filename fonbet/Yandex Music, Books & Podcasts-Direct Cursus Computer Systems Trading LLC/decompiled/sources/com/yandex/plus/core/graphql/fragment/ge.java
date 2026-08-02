package com.yandex.plus.core.graphql.fragment;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ge {
    public final String a;
    public final List b;
    public final String c;
    public final Boolean d;

    public ge(String str, List list, String str2, Boolean bool) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge)) {
            return false;
        }
        ge geVar = (ge) obj;
        return Intrinsics.d(this.a, geVar.a) && Intrinsics.d(this.b, geVar.b) && Intrinsics.d(this.c, geVar.c) && Intrinsics.d(this.d, geVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.d;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaqueContentDescription(text=");
        sb.append(this.a);
        sb.append(", templates=");
        sb.append(this.b);
        sb.append(", actionText=");
        sb.append(this.c);
        sb.append(", accessibilityEnabled=");
        return com.appsflyer.internal.k.p(sb, this.d, ')');
    }
}
