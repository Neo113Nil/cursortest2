package com.yandex.plus.home.feature.webviews.internalapi.toolbar;

import defpackage.dfi;
import defpackage.k5r;

/* loaded from: classes5.dex */
public final class a {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        boolean booleanValue = bool != null ? bool.booleanValue() : true;
        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        boolean booleanValue3 = bool3 != null ? bool3.booleanValue() : true;
        boolean booleanValue4 = bool4 != null ? bool4.booleanValue() : true;
        this.a = booleanValue;
        this.b = booleanValue2;
        this.c = booleanValue3;
        this.d = booleanValue4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + k5r.e(k5r.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToolbarPresentationOptions(showToolbar=");
        sb.append(this.a);
        sb.append(", showDash=");
        sb.append(this.b);
        sb.append(", showCross=");
        sb.append(this.c);
        sb.append(", showArrow=");
        return dfi.j(sb, this.d, ')');
    }
}
