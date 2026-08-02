package defpackage;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ypc {
    public String a;
    public String b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypc)) {
            return false;
        }
        ypc ypcVar = (ypc) obj;
        return Objects.equals(this.a, ypcVar.a) && Objects.equals(this.b, ypcVar.b) && Objects.equals(this.c, ypcVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
