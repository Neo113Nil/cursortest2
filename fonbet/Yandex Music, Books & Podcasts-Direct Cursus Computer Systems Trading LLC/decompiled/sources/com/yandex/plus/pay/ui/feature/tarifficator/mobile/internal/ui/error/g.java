package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements i {
    public final com.yandex.plus.pay.ui.common.internal.error.content.h a;
    public final CharSequence b;

    public g(com.yandex.plus.pay.ui.common.internal.error.content.h hVar, CharSequence charSequence) {
        hVar.getClass();
        this.a = hVar;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.a, gVar.a) && Intrinsics.d(this.b, gVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        return hashCode + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final String toString() {
        return "Content(content=" + this.a + ", supportText=" + ((Object) this.b) + ')';
    }
}
