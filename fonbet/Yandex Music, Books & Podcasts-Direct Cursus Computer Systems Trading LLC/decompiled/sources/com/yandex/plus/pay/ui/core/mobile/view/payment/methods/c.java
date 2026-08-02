package com.yandex.plus.pay.ui.core.mobile.view.payment.methods;

import com.yandex.plus.core.data.common.v;
import com.yandex.plus.core.data.common.y;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c {
    public final String a;
    public final boolean b;
    public final a c;
    public final String d;
    public final CharSequence e;
    public final CharSequence f;
    public final b g;
    public final v h;
    public final v i;

    public c(String str, boolean z, a aVar, String str2, CharSequence charSequence, CharSequence charSequence2, y yVar, v vVar, v vVar2) {
        str.getClass();
        aVar.getClass();
        str2.getClass();
        b bVar = yVar != null ? new b(yVar) : null;
        this.a = str;
        this.b = z;
        this.c = aVar;
        this.d = str2;
        this.e = charSequence;
        this.f = charSequence2;
        this.g = bVar;
        this.h = vVar;
        this.i = vVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.a, cVar.a) && this.b == cVar.b && Intrinsics.d(this.c, cVar.c) && Intrinsics.d(this.d, cVar.d) && Intrinsics.d(this.e, cVar.e) && Intrinsics.d(this.f, cVar.f) && Intrinsics.d(this.g, cVar.g) && Intrinsics.d(this.h, cVar.h) && Intrinsics.d(this.i, cVar.i);
    }

    public final int hashCode() {
        int c = k5r.c((this.c.hashCode() + k5r.e(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
        CharSequence charSequence = this.e;
        int hashCode = (c + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        b bVar = this.g;
        int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.a.hashCode())) * 31;
        v vVar = this.h;
        int hashCode4 = (hashCode3 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        v vVar2 = this.i;
        return hashCode4 + (vVar2 != null ? vVar2.hashCode() : 0);
    }

    public final String toString() {
        return "PlusPayPaymentMethodContent(id=" + this.a + ", isSelected=" + this.b + ", attributes=" + this.c + ", text=" + this.d + ", additionalText=" + ((Object) this.e) + ", promoText=" + ((Object) this.f) + ", icon=" + this.g + ", textColor=" + this.h + ", backgroundColor=" + this.i + ')';
    }
}
