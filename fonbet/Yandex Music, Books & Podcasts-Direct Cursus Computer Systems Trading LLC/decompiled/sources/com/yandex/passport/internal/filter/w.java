package com.yandex.passport.internal.filter;

import defpackage.ouj;

/* loaded from: classes4.dex */
public final class w implements x {
    public final String a;

    public /* synthetic */ w(String str) {
        this.a = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return super.j((x) obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            return this.a.equals(((w) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ouj.k(')', "StringIdentifier(value=", this.a);
    }
}
