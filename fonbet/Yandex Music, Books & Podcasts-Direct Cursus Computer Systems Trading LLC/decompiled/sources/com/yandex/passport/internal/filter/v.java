package com.yandex.passport.internal.filter;

import defpackage.hrg;

/* loaded from: classes4.dex */
public final class v implements x {
    public final int a;

    public /* synthetic */ v(int i) {
        this.a = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return super.j((x) obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            return this.a == ((v) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return hrg.o("NumericIdentifier(value=", this.a, ')');
    }
}
