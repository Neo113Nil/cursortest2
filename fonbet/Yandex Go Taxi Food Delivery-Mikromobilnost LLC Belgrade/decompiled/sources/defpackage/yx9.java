package defpackage;

import com.yandex.go.chargers.analytics.ChargersError;

/* loaded from: classes12.dex */
public final class yx9 {
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r8 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(yx9 yx9Var, ChargersError chargersError, String str, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        yx9Var.getClass();
        hst hstVar = jst.e;
        String groupId = chargersError.getGroupId();
        if (str != null) {
            if (str.length() == 0) {
                str = chargersError.getDefMessage();
            }
        }
        str = chargersError.getDefMessage();
        xby.l(hstVar, groupId, null, null, str, 2);
    }
}
