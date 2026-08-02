package defpackage;

import com.yandex.media.ynison.service.x;

/* loaded from: classes3.dex */
public final class mil implements nil {
    public static final mil a = new mil();

    @Override // defpackage.nil
    public final boolean b(x xVar) {
        if (xVar.z() > 0) {
            return nil.a(xVar);
        }
        dfi.r("PlayerQueue.isValid() playable list is empty while updatePlayerState is called", "YnisonRequestValidator");
        return false;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mil);
    }

    public final int hashCode() {
        return 1041886428;
    }

    public final String toString() {
        return "UpdatePlayerState";
    }
}
