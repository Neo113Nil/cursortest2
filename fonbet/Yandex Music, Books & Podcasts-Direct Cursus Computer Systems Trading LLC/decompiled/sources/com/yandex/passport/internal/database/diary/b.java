package com.yandex.passport.internal.database.diary;

import defpackage.hrg;
import defpackage.k5r;
import defpackage.tlm;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {
    public final String a;
    public final String b;
    public final String c;
    public final long d;

    public b(String str, String str2, String str3, long j) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.a, bVar.a) && Intrinsics.d(this.b, bVar.b) && this.c.equals(bVar.c) && this.d == bVar.d;
    }

    public final int hashCode() {
        return tlm.c(this.d, k5r.c(k5r.c(k5r.c(Long.hashCode(0L) * 31, 31, this.a), 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiaryParameterEntity(id=0, name=");
        sb.append(this.a);
        sb.append(", methodName=");
        sb.append(this.b);
        sb.append(", value=");
        sb.append(this.c);
        sb.append(", issuedAt=");
        return hrg.m(this.d, ", uploadId=null)", sb);
    }
}
