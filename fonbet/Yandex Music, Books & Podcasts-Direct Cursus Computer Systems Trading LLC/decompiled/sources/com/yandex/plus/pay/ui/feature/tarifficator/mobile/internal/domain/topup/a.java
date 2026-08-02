package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.topup;

import defpackage.tlm;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {
    public final String a;
    public final String b;
    public final Long c;
    public final Long d;

    public a(String str, String str2, Long l, Long l2) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.a, aVar.a) && Intrinsics.d(this.b, aVar.b) && Intrinsics.d(this.c, aVar.c) && Intrinsics.d(this.d, aVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        return hashCode3 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopupConfiguration(actionScenario=");
        sb.append(this.a);
        sb.append(", webPageUrl=");
        sb.append(this.b);
        sb.append(", startMessageTimeoutMillis=");
        sb.append(this.c);
        sb.append(", loadMessageTimeoutMillis=");
        return tlm.k(sb, this.d, ')');
    }
}
