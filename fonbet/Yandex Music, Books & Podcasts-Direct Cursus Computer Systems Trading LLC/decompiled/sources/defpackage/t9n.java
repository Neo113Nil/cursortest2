package defpackage;

import com.yandex.media.ynison.service.f;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t9n {
    public final wwk a;
    public final f b;

    public t9n(wwk wwkVar, f fVar) {
        fVar.getClass();
        this.a = wwkVar;
        this.b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9n)) {
            return false;
        }
        t9n t9nVar = (t9n) obj;
        return this.a.equals(t9nVar.a) && Intrinsics.d(this.b, t9nVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlayableWithKey(playableKey=" + this.a + ", playable=" + this.b + ")";
    }
}
