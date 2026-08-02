package com.yandex.plus.core.graphql.fragment;

import defpackage.k5r;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ol {
    public final String a;
    public final ll b;
    public final List c;
    public final ArrayList d;

    public ol(String str, ll llVar, List list, ArrayList arrayList) {
        this.a = str;
        this.b = llVar;
        this.c = list;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol)) {
            return false;
        }
        ol olVar = (ol) obj;
        return Intrinsics.d(this.a, olVar.a) && Intrinsics.d(this.b, olVar.b) && Intrinsics.d(this.c, olVar.c) && this.d.equals(olVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ll llVar = this.b;
        int hashCode2 = (hashCode + (llVar == null ? 0 : llVar.hashCode())) * 31;
        List list = this.c;
        return this.d.hashCode() + ((hashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Popup(textColor=");
        sb.append(this.a);
        sb.append(", background=");
        sb.append(this.b);
        sb.append(", commonOverlays=");
        sb.append(this.c);
        sb.append(", buttons=");
        return k5r.o(sb, this.d, ')');
    }
}
