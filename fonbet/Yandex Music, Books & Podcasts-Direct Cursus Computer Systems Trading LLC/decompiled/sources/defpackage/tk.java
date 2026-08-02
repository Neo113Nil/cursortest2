package defpackage;

import com.yandex.passport.api.exception.j;

/* loaded from: classes3.dex */
public final class tk extends vk {
    public final j a;

    public tk(j jVar) {
        this.a = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tk) && this.a.equals(((tk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failed(throwable=" + this.a + ")";
    }
}
