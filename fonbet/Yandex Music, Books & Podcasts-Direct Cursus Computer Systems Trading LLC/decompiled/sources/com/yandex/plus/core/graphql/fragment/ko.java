package com.yandex.plus.core.graphql.fragment;

/* loaded from: classes4.dex */
public final class ko {
    public final String a;
    public final ka b;

    public ko(String str, ka kaVar) {
        this.a = str;
        this.b = kaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ko)) {
            return false;
        }
        ko koVar = (ko) obj;
        return this.a.equals(koVar.a) && this.b.equals(koVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommonPrice(__typename=" + this.a + ", offerPrice=" + this.b + ')';
    }
}
