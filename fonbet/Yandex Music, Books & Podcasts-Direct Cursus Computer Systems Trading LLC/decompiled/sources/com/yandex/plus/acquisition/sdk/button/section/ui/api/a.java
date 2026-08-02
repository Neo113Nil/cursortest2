package com.yandex.plus.acquisition.sdk.button.section.ui.api;

import android.graphics.drawable.Drawable;
import android.text.Spanned;
import com.yandex.plus.acquisition.sdk.pay.common.api.k;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {
    public final k a;
    public final Spanned b;
    public final Drawable c;
    public final Drawable d;

    public a(k kVar, Spanned spanned, Drawable drawable, Drawable drawable2) {
        kVar.getClass();
        this.a = kVar;
        this.b = spanned;
        this.c = drawable;
        this.d = drawable2;
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
        Spanned spanned = this.b;
        int hashCode2 = (hashCode + (spanned == null ? 0 : spanned.hashCode())) * 31;
        Drawable drawable = this.c;
        int hashCode3 = (hashCode2 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.d;
        return hashCode3 + (drawable2 != null ? drawable2.hashCode() : 0);
    }

    public final String toString() {
        return "PlusAcquisitionButtonSectionOffer(processedSmartOffer=" + this.a + ", spannedLegals=" + ((Object) this.b) + ", tariffIconDrawable=" + this.c + ", optionIconDrawable=" + this.d + ')';
    }
}
