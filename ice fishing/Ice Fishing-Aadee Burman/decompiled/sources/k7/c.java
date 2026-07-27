package k7;

import g7.d;
import j7.EnumC4613b;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f38700a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    public int f38701b;

    /* renamed from: c, reason: collision with root package name */
    public final String f38702c;

    /* renamed from: d, reason: collision with root package name */
    public final String f38703d;

    /* renamed from: e, reason: collision with root package name */
    public final d f38704e;

    /* renamed from: f, reason: collision with root package name */
    public final b f38705f;

    public c(String str, String str2, d dVar, b bVar) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f38702c = str;
        if (str2 == null) {
            throw new NullPointerException("Null description");
        }
        this.f38703d = str2;
        this.f38704e = dVar;
        this.f38705f = bVar;
    }

    public static c a(d dVar, EnumC4613b enumC4613b, b bVar) {
        c cVar = new c(bVar.f38694b, bVar.f38695c, dVar, bVar);
        cVar.f38700a.set(enumC4613b);
        return cVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f38702c.equalsIgnoreCase(cVar.f38702c) && this.f38703d.equals(cVar.f38703d) && this.f38704e.equals(cVar.f38704e) && this.f38705f.equals(cVar.f38705f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f38701b;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((this.f38702c.toLowerCase(Locale.ROOT).hashCode() ^ 1000003) * 1000003) ^ this.f38703d.hashCode()) * 1000003) ^ this.f38704e.hashCode()) * 1000003) ^ this.f38705f.hashCode();
        this.f38701b = hashCode;
        return hashCode;
    }

    public final String toString() {
        return "MetricDescriptor{name=" + this.f38702c + ", description=" + this.f38703d + ", view=" + this.f38704e + ", sourceInstrument=" + this.f38705f + "}";
    }
}
