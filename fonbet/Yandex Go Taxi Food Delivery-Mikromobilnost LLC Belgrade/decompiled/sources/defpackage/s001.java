package defpackage;

import android.os.SystemClock;

/* loaded from: classes10.dex */
public abstract class s001 {
    public static qwy a(loo looVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = looVar.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (looVar.isTrackExcluded(i2, elapsedRealtime)) {
                i++;
            }
        }
        return new qwy(1, 0, length, i);
    }
}
