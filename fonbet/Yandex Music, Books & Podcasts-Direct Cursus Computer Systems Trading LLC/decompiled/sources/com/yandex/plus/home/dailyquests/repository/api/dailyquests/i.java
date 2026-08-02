package com.yandex.plus.home.dailyquests.repository.api.dailyquests;

import com.yandex.plus.core.data.common.y;
import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i {
    public final String a;
    public final y b;
    public final String c;
    public final String d;

    public i(String str, String str2, String str3, y yVar) {
        dfi.s(str, str2, str3);
        this.a = str;
        this.b = yVar;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.a, iVar.a) && this.b.equals(iVar.b) && Intrinsics.d(this.c, iVar.c) && Intrinsics.d(this.d, iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k5r.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Reward(text=");
        sb.append(this.a);
        sb.append(", iconUrl=");
        sb.append(this.b);
        sb.append(", iconUrlPlaceholder=");
        sb.append(this.c);
        sb.append(", contentDescription=");
        return dfi.i(sb, this.d, ')');
    }
}
