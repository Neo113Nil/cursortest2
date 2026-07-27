package e8;

import java.util.ArrayList;
import java.util.Set;
import r7.AbstractC4979j;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f37369c = new d(AbstractC4979j.V(new ArrayList()), null);

    /* renamed from: a, reason: collision with root package name */
    public final Set f37370a;

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.d f37371b;

    public d(Set set, com.bumptech.glide.d dVar) {
        this.f37370a = set;
        this.f37371b = dVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.h.a(dVar.f37370a, this.f37370a) && kotlin.jvm.internal.h.a(dVar.f37371b, this.f37371b);
    }

    public final int hashCode() {
        int hashCode = (this.f37370a.hashCode() + 1517) * 41;
        com.bumptech.glide.d dVar = this.f37371b;
        return hashCode + (dVar != null ? dVar.hashCode() : 0);
    }
}
