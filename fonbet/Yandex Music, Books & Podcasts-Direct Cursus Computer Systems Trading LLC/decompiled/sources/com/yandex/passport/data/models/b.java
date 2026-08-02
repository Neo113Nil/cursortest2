package com.yandex.passport.data.models;

import defpackage.eta;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {
    public final y a;
    public final y b;
    public final List c;

    public b(y yVar, y yVar2, List list) {
        this.a = yVar;
        this.b = yVar2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.a, bVar.a) && Intrinsics.d(this.b, bVar.b) && Intrinsics.d(this.c, bVar.c);
    }

    public final int hashCode() {
        y yVar = this.a;
        int hashCode = (yVar == null ? 0 : yVar.hashCode()) * 31;
        y yVar2 = this.b;
        int hashCode2 = (hashCode + (yVar2 == null ? 0 : yVar2.hashCode())) * 31;
        List list = this.c;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppSpecification(amVersion=");
        sb.append(this.a);
        sb.append(", appVersion=");
        sb.append(this.b);
        sb.append(", appId=");
        return eta.h(sb, this.c, ')');
    }
}
