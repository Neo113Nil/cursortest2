package defpackage;

import com.yandex.media.ynison.service.e0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class orw {
    public final e0 a;
    public final nrw b;

    public orw(e0 e0Var, nrw nrwVar) {
        e0Var.getClass();
        this.a = e0Var;
        this.b = nrwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof orw)) {
            return false;
        }
        orw orwVar = (orw) obj;
        return Intrinsics.d(this.a, orwVar.a) && this.b == orwVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "YnisonResponse(response=" + this.a + ", importance=" + this.b + ")";
    }
}
