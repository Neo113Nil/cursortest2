package com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers;

import defpackage.dfi;
import defpackage.k5r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d {
    public final CharSequence a;
    public final CharSequence b;
    public final List c;
    public final CharSequence d;
    public final CharSequence e;
    public final String f;
    public final String g;

    public d(CharSequence charSequence, CharSequence charSequence2, List list, CharSequence charSequence3, CharSequence charSequence4, String str, String str2) {
        list.getClass();
        this.a = charSequence;
        this.b = charSequence2;
        this.c = list;
        this.d = charSequence3;
        this.e = charSequence4;
        this.f = str;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.a, dVar.a) && Intrinsics.d(this.b, dVar.b) && Intrinsics.d(this.c, dVar.c) && Intrinsics.d(this.d, dVar.d) && Intrinsics.d(this.e, dVar.e) && Intrinsics.d(this.f, dVar.f) && Intrinsics.d(this.g, dVar.g);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        int d = k5r.d((hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31, 31, this.c);
        CharSequence charSequence3 = this.d;
        int hashCode2 = (d + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        CharSequence charSequence4 = this.e;
        int hashCode3 = (hashCode2 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31;
        String str = this.f;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CounterOffersContent(title=");
        sb.append((Object) this.a);
        sb.append(", subtitle=");
        sb.append((Object) this.b);
        sb.append(", items=");
        sb.append(this.c);
        sb.append(", alternativeActionText=");
        sb.append((Object) this.d);
        sb.append(", supportText=");
        sb.append((Object) this.e);
        sb.append(", errorCode=");
        sb.append(this.f);
        sb.append(", errorCodeContentDescription=");
        return dfi.i(sb, this.g, ')');
    }
}
