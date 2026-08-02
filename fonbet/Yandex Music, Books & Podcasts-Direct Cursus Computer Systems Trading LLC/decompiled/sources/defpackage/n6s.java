package defpackage;

import ru.yandex.video.m3.data.Format;

/* loaded from: classes6.dex */
public final class n6s {
    public final int a;
    public final Format b;

    public n6s(int i, Format format) {
        this.a = i;
        this.b = format;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6s)) {
            return false;
        }
        n6s n6sVar = (n6s) obj;
        return this.a == n6sVar.a && this.b.equals(n6sVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "UsableFormat(trackIndex=" + this.a + ", format=" + this.b + ')';
    }
}
