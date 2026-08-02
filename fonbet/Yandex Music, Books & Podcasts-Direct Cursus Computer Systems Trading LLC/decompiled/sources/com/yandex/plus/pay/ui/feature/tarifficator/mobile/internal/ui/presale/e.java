package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements g {
    public final CharSequence a;
    public final com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.b b;
    public final CharSequence c;
    public final CharSequence d;

    public e(CharSequence charSequence, com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.b bVar, CharSequence charSequence2, CharSequence charSequence3) {
        charSequence.getClass();
        bVar.getClass();
        charSequence2.getClass();
        this.a = charSequence;
        this.b = bVar;
        this.c = charSequence2;
        this.d = charSequence3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.a, eVar.a) && Intrinsics.d(this.b, eVar.b) && Intrinsics.d(this.c, eVar.c) && Intrinsics.d(this.d, eVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        CharSequence charSequence = this.d;
        return hashCode + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final String toString() {
        return "OfferSuggestion(loadingText=" + ((Object) this.a) + ", suggestionContent=" + this.b + ", originalOfferButtonText=" + ((Object) this.c) + ", legalText=" + ((Object) this.d) + ')';
    }
}
