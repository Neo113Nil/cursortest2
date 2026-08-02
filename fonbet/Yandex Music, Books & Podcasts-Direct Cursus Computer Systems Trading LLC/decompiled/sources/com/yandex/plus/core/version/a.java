package com.yandex.plus.core.version;

import defpackage.f1d;
import defpackage.get;
import defpackage.het;

/* loaded from: classes4.dex */
public final class a implements Comparable {
    public final int a;
    public final int b;
    public final int c;

    public a(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a aVar = (a) obj;
        aVar.getClass();
        int compare = Integer.compare(this.a ^ Integer.MIN_VALUE, aVar.a ^ Integer.MIN_VALUE);
        if (compare != 0) {
            return compare;
        }
        int compare2 = Integer.compare(this.b ^ Integer.MIN_VALUE, aVar.b ^ Integer.MIN_VALUE);
        if (compare2 != 0) {
            return compare2;
        }
        return Integer.compare(this.c ^ Integer.MIN_VALUE, aVar.c ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
    }

    public final int hashCode() {
        get getVar = het.b;
        return Integer.hashCode(this.c) + f1d.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) het.a(this.a));
        sb.append('.');
        sb.append((Object) het.a(this.b));
        sb.append('.');
        sb.append((Object) het.a(this.c));
        return sb.toString();
    }
}
