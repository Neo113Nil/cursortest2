package I;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f712a;

    public d(String name) {
        i.e(name, "name");
        this.f712a = name;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        return i.a(this.f712a, ((d) obj).f712a);
    }

    public final int hashCode() {
        return this.f712a.hashCode();
    }

    public final String toString() {
        return this.f712a;
    }
}
