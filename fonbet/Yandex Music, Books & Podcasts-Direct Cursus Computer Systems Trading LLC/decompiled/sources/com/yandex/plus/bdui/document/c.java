package com.yandex.plus.bdui.document;

/* loaded from: classes4.dex */
public final class c {
    public final double a;
    public final a b;
    public final b c;

    public c(double d, a aVar, b bVar) {
        this.a = d;
        this.b = aVar;
        this.c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Double.compare(this.a, cVar.a) == 0 && this.b == cVar.b && this.c == cVar.c;
    }

    public final int hashCode() {
        int hashCode = Double.hashCode(this.a) * 31;
        a aVar = this.b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b bVar = this.c;
        return hashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "Option(duration=" + this.a + ", interpolator=" + this.b + ", transition=" + this.c + ')';
    }
}
