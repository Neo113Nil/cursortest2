package k7;

import g7.n;
import j7.AbstractC4612a;
import java.util.Locale;
import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f38693a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38694b;

    /* renamed from: c, reason: collision with root package name */
    public final String f38695c;

    /* renamed from: d, reason: collision with root package name */
    public final String f38696d;

    /* renamed from: e, reason: collision with root package name */
    public final n f38697e;

    /* renamed from: f, reason: collision with root package name */
    public final int f38698f;

    /* renamed from: g, reason: collision with root package name */
    public final a f38699g;

    public b(String str, String str2, String str3, n nVar, int i, a aVar) {
        if (AbstractC4612a.f38476a) {
            Thread.currentThread().getStackTrace();
        }
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f38694b = str;
        if (str2 == null) {
            throw new NullPointerException("Null description");
        }
        this.f38695c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null unit");
        }
        this.f38696d = str3;
        this.f38697e = nVar;
        if (i == 0) {
            throw new NullPointerException("Null valueType");
        }
        this.f38698f = i;
        this.f38699g = aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f38694b.equalsIgnoreCase(bVar.f38694b) && this.f38695c.equals(bVar.f38695c) && this.f38696d.equals(bVar.f38696d) && this.f38697e.equals(bVar.f38697e) && AbstractC5049e.a(this.f38698f, bVar.f38698f);
    }

    public final int hashCode() {
        int i = this.f38693a;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((((this.f38694b.toLowerCase(Locale.ROOT).hashCode() ^ 1000003) * 1000003) ^ this.f38695c.hashCode()) * 1000003) ^ this.f38696d.hashCode()) * 1000003) ^ this.f38697e.hashCode()) * 1000003) ^ AbstractC5049e.d(this.f38698f);
        this.f38693a = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstrumentDescriptor{name=");
        sb.append(this.f38694b);
        sb.append(", description=");
        sb.append(this.f38695c);
        sb.append(", unit=");
        sb.append(this.f38696d);
        sb.append(", type=");
        sb.append(this.f38697e);
        sb.append(", valueType=");
        int i = this.f38698f;
        sb.append(i != 1 ? i != 2 ? "null" : "DOUBLE" : "LONG");
        sb.append(", advice=");
        sb.append(this.f38699g);
        sb.append("}");
        return sb.toString();
    }
}
