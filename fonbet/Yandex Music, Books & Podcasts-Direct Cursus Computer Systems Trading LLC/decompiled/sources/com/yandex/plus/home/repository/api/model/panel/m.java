package com.yandex.plus.home.repository.api.model.panel;

import defpackage.dfi;
import defpackage.k5r;

/* loaded from: classes5.dex */
public final class m implements n {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public m(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.a.equals(mVar.a) && this.b.equals(mVar.b) && this.c.equals(mVar.c) && this.d == mVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + k5r.c((((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + 3327403) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverlayNotFound(widgetType=");
        sb.append(this.a);
        sb.append(", shortcutId=");
        sb.append(this.b);
        sb.append(", shape=logo, shortcutTypeName=");
        sb.append(this.c);
        sb.append(", isLight=");
        return dfi.j(sb, this.d, ')');
    }
}
