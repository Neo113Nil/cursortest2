package k7;

import g7.n;
import j7.AbstractC4622a;
import java.util.Locale;
import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f38620a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38621b;

    /* renamed from: c, reason: collision with root package name */
    public final String f38622c;

    /* renamed from: d, reason: collision with root package name */
    public final String f38623d;

    /* renamed from: e, reason: collision with root package name */
    public final n f38624e;

    /* renamed from: f, reason: collision with root package name */
    public final int f38625f;

    /* renamed from: g, reason: collision with root package name */
    public final a f38626g;

    public b(String str, String str2, String str3, n nVar, int i, a aVar) {
        if (AbstractC4622a.f38488a) {
            Thread.currentThread().getStackTrace();
        }
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f38621b = str;
        if (str2 == null) {
            throw new NullPointerException("Null description");
        }
        this.f38622c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null unit");
        }
        this.f38623d = str3;
        this.f38624e = nVar;
        if (i == 0) {
            throw new NullPointerException("Null valueType");
        }
        this.f38625f = i;
        this.f38626g = aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f38621b.equalsIgnoreCase(bVar.f38621b) && this.f38622c.equals(bVar.f38622c) && this.f38623d.equals(bVar.f38623d) && this.f38624e.equals(bVar.f38624e) && AbstractC5050e.a(this.f38625f, bVar.f38625f);
    }

    public final int hashCode() {
        int i = this.f38620a;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((((this.f38621b.toLowerCase(Locale.ROOT).hashCode() ^ 1000003) * 1000003) ^ this.f38622c.hashCode()) * 1000003) ^ this.f38623d.hashCode()) * 1000003) ^ this.f38624e.hashCode()) * 1000003) ^ AbstractC5050e.d(this.f38625f);
        this.f38620a = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstrumentDescriptor{name=");
        sb.append(this.f38621b);
        sb.append(", description=");
        sb.append(this.f38622c);
        sb.append(", unit=");
        sb.append(this.f38623d);
        sb.append(", type=");
        sb.append(this.f38624e);
        sb.append(", valueType=");
        int i = this.f38625f;
        sb.append(i != 1 ? i != 2 ? "null" : "DOUBLE" : "LONG");
        sb.append(", advice=");
        sb.append(this.f38626g);
        sb.append("}");
        return sb.toString();
    }
}
