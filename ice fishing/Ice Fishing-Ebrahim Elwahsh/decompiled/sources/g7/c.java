package g7;

import c7.d;
import f7.EnumC4517b;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f37946a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    public int f37947b;

    /* renamed from: c, reason: collision with root package name */
    public final String f37948c;

    /* renamed from: d, reason: collision with root package name */
    public final String f37949d;

    /* renamed from: e, reason: collision with root package name */
    public final d f37950e;

    /* renamed from: f, reason: collision with root package name */
    public final b f37951f;

    public c(String str, String str2, d dVar, b bVar) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f37948c = str;
        if (str2 == null) {
            throw new NullPointerException("Null description");
        }
        this.f37949d = str2;
        this.f37950e = dVar;
        this.f37951f = bVar;
    }

    public static c a(d dVar, EnumC4517b enumC4517b, b bVar) {
        c cVar = new c(bVar.f37940b, bVar.f37941c, dVar, bVar);
        cVar.f37946a.set(enumC4517b);
        return cVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f37948c.equalsIgnoreCase(cVar.f37948c) && this.f37949d.equals(cVar.f37949d) && this.f37950e.equals(cVar.f37950e) && this.f37951f.equals(cVar.f37951f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f37947b;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((this.f37948c.toLowerCase(Locale.ROOT).hashCode() ^ 1000003) * 1000003) ^ this.f37949d.hashCode()) * 1000003) ^ this.f37950e.hashCode()) * 1000003) ^ this.f37951f.hashCode();
        this.f37947b = hashCode;
        return hashCode;
    }

    public final String toString() {
        return "MetricDescriptor{name=" + this.f37948c + ", description=" + this.f37949d + ", view=" + this.f37950e + ", sourceInstrument=" + this.f37951f + "}";
    }
}
