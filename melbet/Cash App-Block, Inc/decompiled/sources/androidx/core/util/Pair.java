package androidx.core.util;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class Pair {
    public final Object first;
    public final Object second;

    public Pair(Object obj, Object obj2) {
        this.first = obj;
        this.second = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return Objects.equals(pair.first, this.first) && Objects.equals(pair.second, this.second);
    }

    public final int hashCode() {
        Object obj = this.first;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.second;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append(this.first);
        sb.append(" ");
        return Recorder$$ExternalSyntheticOutline1.m(sb, this.second, "}");
    }
}
