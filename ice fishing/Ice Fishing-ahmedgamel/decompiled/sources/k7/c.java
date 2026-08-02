package k7;

import g7.d;
import j7.EnumC4623b;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f38627a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    public int f38628b;

    /* renamed from: c, reason: collision with root package name */
    public final String f38629c;

    /* renamed from: d, reason: collision with root package name */
    public final String f38630d;

    /* renamed from: e, reason: collision with root package name */
    public final d f38631e;

    /* renamed from: f, reason: collision with root package name */
    public final b f38632f;

    public c(String str, String str2, d dVar, b bVar) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f38629c = str;
        if (str2 == null) {
            throw new NullPointerException("Null description");
        }
        this.f38630d = str2;
        this.f38631e = dVar;
        this.f38632f = bVar;
    }

    public static c a(d dVar, EnumC4623b enumC4623b, b bVar) {
        c cVar = new c(bVar.f38621b, bVar.f38622c, dVar, bVar);
        cVar.f38627a.set(enumC4623b);
        return cVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f38629c.equalsIgnoreCase(cVar.f38629c) && this.f38630d.equals(cVar.f38630d) && this.f38631e.equals(cVar.f38631e) && this.f38632f.equals(cVar.f38632f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f38628b;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((this.f38629c.toLowerCase(Locale.ROOT).hashCode() ^ 1000003) * 1000003) ^ this.f38630d.hashCode()) * 1000003) ^ this.f38631e.hashCode()) * 1000003) ^ this.f38632f.hashCode();
        this.f38628b = hashCode;
        return hashCode;
    }

    public final String toString() {
        return "MetricDescriptor{name=" + this.f38629c + ", description=" + this.f38630d + ", view=" + this.f38631e + ", sourceInstrument=" + this.f38632f + "}";
    }
}
