package com.yandex.plus.home.feature.webviews.internal.purchase.button.section;

import com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.g;
import defpackage.dfi;
import defpackage.f1d;
import defpackage.k5r;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements e {
    public final g a;
    public final String b;
    public final String c;
    public final Map d;
    public final boolean e;

    public a(g gVar, String str, String str2, Map map, boolean z) {
        gVar.getClass();
        str.getClass();
        map.getClass();
        this.a = gVar;
        this.b = str;
        this.c = str2;
        this.d = map;
        this.e = z;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.purchase.button.section.e
    public final g b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.a, aVar.a) && Intrinsics.d(this.b, aVar.b) && this.c.equals(aVar.c) && Intrinsics.d(this.d, aVar.d) && this.e == aVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + f1d.b(this.d, k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusAcquisitionSdk(subscriptionInfo=");
        sb.append(this.a);
        sb.append(", page=");
        sb.append(this.b);
        sb.append(", place=");
        sb.append(this.c);
        sb.append(", restrictions=");
        sb.append(this.d);
        sb.append(", isOneClickSupported=");
        return dfi.j(sb, this.e, ')');
    }
}
