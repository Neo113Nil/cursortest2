package defpackage;

import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class b0g {
    public static final b0g c = new b0g(R.drawable.ic_like_active_24, R.drawable.ic_like_unactive_24);
    public static final b0g d = new b0g(R.drawable.ic_like_active_32, R.drawable.ic_like_32);
    public final int a;
    public final int b;

    public b0g(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0g)) {
            return false;
        }
        b0g b0gVar = (b0g) obj;
        return this.a == b0gVar.a && this.b == b0gVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return dfi.f("LikeIconSize(resourceActive=", this.a, this.b, ", resourceUnactive=", ")");
    }
}
