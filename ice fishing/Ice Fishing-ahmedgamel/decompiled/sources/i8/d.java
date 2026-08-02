package i8;

import a.AbstractC0426a;
import java.util.ArrayList;
import java.util.Set;
import v7.AbstractC5119j;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f38211c = new d(AbstractC5119j.N(new ArrayList()), null);

    /* renamed from: a, reason: collision with root package name */
    public final Set f38212a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0426a f38213b;

    public d(Set set, AbstractC0426a abstractC0426a) {
        this.f38212a = set;
        this.f38213b = abstractC0426a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.h.a(dVar.f38212a, this.f38212a) && kotlin.jvm.internal.h.a(dVar.f38213b, this.f38213b);
    }

    public final int hashCode() {
        int hashCode = (this.f38212a.hashCode() + 1517) * 41;
        AbstractC0426a abstractC0426a = this.f38213b;
        return hashCode + (abstractC0426a != null ? abstractC0426a.hashCode() : 0);
    }
}
