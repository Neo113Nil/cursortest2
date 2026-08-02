package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family;

import defpackage.dfi;
import defpackage.f1d;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {
    public final String a;
    public final Map b;
    public final String c;

    public a(String str, String str2, Map map) {
        str2.getClass();
        this.a = str;
        this.b = map;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.b.equals(aVar.b) && Intrinsics.d(this.c, aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f1d.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FamilyInvitationContent(webPageUrl=");
        sb.append(this.a);
        sb.append(", webPageHeaders=");
        sb.append(this.b);
        sb.append(", skipButtonText=");
        return dfi.i(sb, this.c, ')');
    }
}
