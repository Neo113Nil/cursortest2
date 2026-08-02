package com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content;

import com.yandex.plus.core.data.common.y;
import defpackage.k5r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {
    public final y a;
    public final CharSequence b;
    public final CharSequence c;
    public final List d;
    public final String e;
    public final String f;
    public final CharSequence g;

    public a(y yVar, CharSequence charSequence, CharSequence charSequence2, List list, String str, String str2, CharSequence charSequence3) {
        yVar.getClass();
        charSequence.getClass();
        list.getClass();
        str.getClass();
        str2.getClass();
        this.a = yVar;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = list;
        this.e = str;
        this.f = str2;
        this.g = charSequence3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.a, aVar.a) && Intrinsics.d(this.b, aVar.b) && Intrinsics.d(this.c, aVar.c) && Intrinsics.d(this.d, aVar.d) && Intrinsics.d(this.e, aVar.e) && Intrinsics.d(this.f, aVar.f) && Intrinsics.d(this.g, aVar.g);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        CharSequence charSequence = this.c;
        int c = k5r.c(k5r.c(k5r.d((hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        CharSequence charSequence2 = this.g;
        return c + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public final String toString() {
        return "ClosingOfferContent(backgroundImage=" + this.a + ", titleText=" + ((Object) this.b) + ", subtitleText=" + ((Object) this.c) + ", itemContent=" + this.d + ", acceptButtonText=" + this.e + ", rejectButtonText=" + this.f + ", footerText=" + ((Object) this.g) + ')';
    }
}
