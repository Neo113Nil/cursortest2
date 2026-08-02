package io.flutter.plugins.imagepicker;

import io.flutter.plugins.imagepicker.Messages;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class j {
    public Messages.SourceType a;
    public Messages.SourceCamera b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.a.equals(jVar.a) && Objects.equals(this.b, jVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
