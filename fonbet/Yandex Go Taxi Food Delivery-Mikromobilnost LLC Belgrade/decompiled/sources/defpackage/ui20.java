package defpackage;

import com.yandex.messaging.internal.storage.MessagesRange$LoadingType;

/* loaded from: classes15.dex */
public final class ui20 {
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (r2 > r7) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ry10 a(yab yabVar, int i, int i2) {
        if (yabVar.moveToPosition(i) && yabVar.z0() != -1) {
            long k0 = yabVar.k0();
            if (k0 != 0) {
                if (!yabVar.moveToNext()) {
                    return new ry10(k0, 0L, MessagesRange$LoadingType.FromNewest);
                }
                long z0 = yabVar.z0();
                if (yabVar.R0()) {
                    Long B = yabVar.B();
                    if (B == null) {
                        ny61.k();
                        return null;
                    }
                    z0 = B.longValue();
                }
                if (yabVar.Q0()) {
                    z0 = yabVar.k0();
                }
                long j = z0;
                z83.c(null, j == -1);
                if (j != k0) {
                    return new ry10(k0, j, (!yabVar.moveToPosition(i2) || i2 <= i) ? MessagesRange$LoadingType.FromNewest : MessagesRange$LoadingType.FromOldest);
                }
            }
        }
        return null;
    }
}
