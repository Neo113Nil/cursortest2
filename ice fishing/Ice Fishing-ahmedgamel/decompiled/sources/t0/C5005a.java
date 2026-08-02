package t0;

import w.AbstractC5128c;

/* renamed from: t0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5005a {

    /* renamed from: a, reason: collision with root package name */
    public int f40695a;

    /* renamed from: b, reason: collision with root package name */
    public int f40696b;

    /* renamed from: c, reason: collision with root package name */
    public int f40697c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C5005a.class != obj.getClass()) {
                return false;
            }
            C5005a c5005a = (C5005a) obj;
            int i = this.f40695a;
            if (i != c5005a.f40695a) {
                return false;
            }
            if (i != 8 || Math.abs(this.f40697c - this.f40696b) != 1 || this.f40697c != c5005a.f40696b || this.f40696b != c5005a.f40697c) {
                return this.f40697c == c5005a.f40697c && this.f40696b == c5005a.f40696b;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f40695a * 31) + this.f40696b) * 31) + this.f40697c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f40695a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : com.anythink.expressad.f.a.b.ay);
        sb.append(",s:");
        sb.append(this.f40696b);
        sb.append("c:");
        return AbstractC5128c.e(this.f40697c, ",p:null]", sb);
    }
}
