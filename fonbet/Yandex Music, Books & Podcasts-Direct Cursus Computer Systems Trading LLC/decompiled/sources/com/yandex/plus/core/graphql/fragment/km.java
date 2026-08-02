package com.yandex.plus.core.graphql.fragment;

import defpackage.dfi;

/* loaded from: classes4.dex */
public final class km {
    public final String a;
    public final String b;

    public km(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km)) {
            return false;
        }
        km kmVar = (km) obj;
        return this.a.equals(kmVar.a) && this.b.equals(kmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnCheckoutTitleLinkItem(text=");
        sb.append(this.a);
        sb.append(", url=");
        return dfi.i(sb, this.b, ')');
    }
}
