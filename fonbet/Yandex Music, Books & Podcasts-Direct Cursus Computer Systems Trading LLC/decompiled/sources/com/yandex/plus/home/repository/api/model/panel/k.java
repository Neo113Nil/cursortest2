package com.yandex.plus.home.repository.api.model.panel;

import defpackage.dfi;

/* loaded from: classes5.dex */
public final class k implements n {
    public final String a;
    public final String b;

    public k(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a.equals(kVar.a) && this.b.equals(kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DarkShortcutNotFound(widgetType=");
        sb.append(this.a);
        sb.append(", shortcutId=");
        return dfi.i(sb, this.b, ')');
    }
}
