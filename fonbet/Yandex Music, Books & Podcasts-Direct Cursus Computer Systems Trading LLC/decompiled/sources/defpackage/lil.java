package defpackage;

import com.yandex.media.ynison.service.x;

/* loaded from: classes3.dex */
public final class lil implements nil {
    public static final lil a = new lil();

    @Override // defpackage.nil
    public final boolean b(x xVar) {
        if (xVar.z() != 0 || xVar.r() == -1) {
            return nil.a(xVar);
        }
        dfi.r(dfi.c(xVar.r(), "PlayerQueue.isValid() if playableList is empty currentPlayableIndex must be equal -1 (but now ", ")"), "YnisonRequestValidator");
        return false;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lil);
    }

    public final int hashCode() {
        return -2009350930;
    }

    public final String toString() {
        return "UpdateFullState";
    }
}
