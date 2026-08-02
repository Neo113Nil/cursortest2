package com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts;

import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements c {
    public final String a;
    public final com.yandex.plus.core.strings.a b;
    public final String c;
    public final String d;

    public a(String str, com.yandex.plus.core.strings.a aVar, String str2, String str3) {
        str.getClass();
        aVar.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = aVar;
        this.c = str2;
        this.d = str3;
    }

    @Override // com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.c
    public final com.yandex.plus.core.strings.a a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.a, aVar.a) && this.b == aVar.b && Intrinsics.d(this.c, aVar.c) && Intrinsics.d(this.d, aVar.d);
    }

    @Override // com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.c
    public final String getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + k5r.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Accent(title=");
        sb.append(this.a);
        sb.append(", brandType=");
        sb.append(this.b);
        sb.append(", accentPartOfSubtitle=");
        sb.append(this.c);
        sb.append(", standardPartOfSubtitle=");
        return dfi.i(sb, this.d, ')');
    }
}
