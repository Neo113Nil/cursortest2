package com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers;

import defpackage.dfi;
import defpackage.k5r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {
    public final List a;
    public final CharSequence b;
    public final List c;
    public final String d;
    public final String e;
    public final boolean f;

    public a(List list, CharSequence charSequence, List list2, String str, String str2, boolean z) {
        list.getClass();
        charSequence.getClass();
        list2.getClass();
        str.getClass();
        this.a = list;
        this.b = charSequence;
        this.c = list2;
        this.d = str;
        this.e = str2;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.a, aVar.a) && Intrinsics.d(this.b, aVar.b) && Intrinsics.d(this.c, aVar.c) && Intrinsics.d(this.d, aVar.d) && Intrinsics.d(this.e, aVar.e) && this.f == aVar.f;
    }

    public final int hashCode() {
        int c = k5r.c(k5r.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        return Boolean.hashCode(this.f) + ((c + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CounterOfferContent(logos=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append((Object) this.b);
        sb.append(", benefits=");
        sb.append(this.c);
        sb.append(", buttonText=");
        sb.append(this.d);
        sb.append(", additionalButtonText=");
        sb.append(this.e);
        sb.append(", isPrioritized=");
        return dfi.j(sb, this.f, ')');
    }
}
