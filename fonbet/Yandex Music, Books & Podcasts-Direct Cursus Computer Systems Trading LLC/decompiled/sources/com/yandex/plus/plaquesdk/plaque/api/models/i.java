package com.yandex.plus.plaquesdk.plaque.api.models;

import defpackage.c5b;
import defpackage.dfi;
import defpackage.k5r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i implements g {
    public final String a;
    public final c b;
    public final d c;
    public final Integer d;
    public final List e;
    public final List f;
    public final String g;
    public final String h;

    public i(String str, c cVar, d dVar, Integer num, List list, c5b c5bVar, String str2, String str3) {
        str.getClass();
        list.getClass();
        c5bVar.getClass();
        str2.getClass();
        this.a = str;
        this.b = cVar;
        this.c = dVar;
        this.d = num;
        this.e = list;
        this.f = c5bVar;
        this.g = str2;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.a, iVar.a) && this.b == iVar.b && this.c == iVar.c && Intrinsics.d(this.d, iVar.d) && Intrinsics.d(this.e, iVar.e) && Intrinsics.d(this.f, iVar.f) && Intrinsics.d(this.g, iVar.g) && Intrinsics.d(this.h, iVar.h);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        d dVar = this.c;
        int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Integer num = this.d;
        int c = k5r.c(k5r.d(k5r.d((hashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        return c + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Text(text=");
        sb.append(this.a);
        sb.append(", fontStyle=");
        sb.append(this.b);
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontSize=");
        sb.append(this.d);
        sb.append(", textDecoration=");
        sb.append(this.e);
        sb.append(", detailedTextDecoration=");
        sb.append(this.f);
        sb.append(", color=");
        sb.append(this.g);
        sb.append(", metaColor=");
        return dfi.i(sb, this.h, ')');
    }
}
