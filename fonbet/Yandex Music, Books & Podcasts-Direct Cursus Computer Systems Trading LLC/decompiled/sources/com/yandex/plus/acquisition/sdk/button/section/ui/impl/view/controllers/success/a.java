package com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.controllers.success;

import android.graphics.drawable.Drawable;
import defpackage.f1d;
import defpackage.vz1;

/* loaded from: classes4.dex */
public final class a {
    public final Drawable a;
    public final int b;
    public final int c;

    public a(Drawable drawable, int i, int i2) {
        this.a = drawable;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.b == aVar.b && this.c == aVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + f1d.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Style(buttonDrawable=");
        sb.append(this.a);
        sb.append(", buttonTextAppearance=");
        sb.append(this.b);
        sb.append(", legalsTextAppearance=");
        return vz1.r(sb, this.c, ')');
    }
}
