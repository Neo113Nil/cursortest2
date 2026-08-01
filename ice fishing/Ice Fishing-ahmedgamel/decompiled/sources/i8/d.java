package i8;

import java.util.ArrayList;
import java.util.Set;
import v7.AbstractC5129j;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f38092c = new d(AbstractC5129j.P(new ArrayList()), null);

    /* renamed from: a, reason: collision with root package name */
    public final Set f38093a;

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.e f38094b;

    public d(Set set, com.bumptech.glide.e eVar) {
        this.f38093a = set;
        this.f38094b = eVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.h.a(dVar.f38093a, this.f38093a) && kotlin.jvm.internal.h.a(dVar.f38094b, this.f38094b);
    }

    public final int hashCode() {
        int hashCode = (this.f38093a.hashCode() + 1517) * 41;
        com.bumptech.glide.e eVar = this.f38094b;
        return hashCode + (eVar != null ? eVar.hashCode() : 0);
    }
}
