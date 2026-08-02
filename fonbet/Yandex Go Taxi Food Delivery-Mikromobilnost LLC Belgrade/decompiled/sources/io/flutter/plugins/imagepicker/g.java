package io.flutter.plugins.imagepicker;

import defpackage.hx10;
import io.flutter.plugins.imagepicker.Messages;
import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class g {
    public Messages.CacheRetrievalType a;
    public hx10 b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (this.a.equals(gVar.a) && Objects.equals(this.b, gVar.b) && this.c.equals(gVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
