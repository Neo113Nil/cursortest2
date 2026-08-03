package e3;

import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public String f2065a;

    /* renamed from: b, reason: collision with root package name */
    public String f2066b;

    /* renamed from: c, reason: collision with root package name */
    public List f2067c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Objects.equals(this.f2065a, cVar.f2065a) && Objects.equals(this.f2066b, cVar.f2066b) && Objects.equals(this.f2067c, cVar.f2067c);
    }

    public final int hashCode() {
        return Objects.hash(this.f2065a, this.f2066b, this.f2067c);
    }
}
