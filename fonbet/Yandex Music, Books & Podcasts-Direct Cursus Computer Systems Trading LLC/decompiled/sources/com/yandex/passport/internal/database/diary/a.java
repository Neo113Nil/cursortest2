package com.yandex.passport.internal.database.diary;

import defpackage.hrg;
import defpackage.k5r;
import defpackage.tlm;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {
    public final String a;
    public final boolean b;
    public final long c;

    public a(String str, long j, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
    }

    public final int hashCode() {
        return tlm.c(this.c, k5r.e(k5r.c(Long.hashCode(0L) * 31, 31, this.a), 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiaryMethodEntity(id=0, name=");
        sb.append(this.a);
        sb.append(", isUiMethod=");
        sb.append(this.b);
        sb.append(", issuedAt=");
        return hrg.m(this.c, ", uploadId=null)", sb);
    }
}
