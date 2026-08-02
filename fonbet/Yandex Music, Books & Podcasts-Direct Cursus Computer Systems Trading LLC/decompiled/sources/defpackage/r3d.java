package defpackage;

import com.yandex.music.shared.generative.GenerativeException;

/* loaded from: classes5.dex */
public final class r3d implements t3d {
    public final GenerativeException a;

    public r3d(GenerativeException generativeException) {
        this.a = generativeException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r3d) && this.a.equals(((r3d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(exception=" + this.a + ")";
    }
}
