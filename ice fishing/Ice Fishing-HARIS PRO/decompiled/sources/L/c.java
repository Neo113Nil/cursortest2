package L;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public String f410a;

    /* renamed from: b, reason: collision with root package name */
    public String f411b;

    /* renamed from: c, reason: collision with root package name */
    public List f412c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Objects.equals(this.f410a, cVar.f410a) && Objects.equals(this.f411b, cVar.f411b) && Objects.equals(this.f412c, cVar.f412c);
    }

    public final int hashCode() {
        return Objects.hash(this.f410a, this.f411b, this.f412c);
    }
}
