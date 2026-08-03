package oa;

import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class b {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object listNotificationsForOutstanding$default(d dVar, List list, fc.d dVar2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listNotificationsForOutstanding");
        }
        if ((i10 & 1) != 0) {
            list = null;
        }
        return dVar.listNotificationsForOutstanding(list, dVar2);
    }

    public static /* synthetic */ Object markAsConsumed$default(d dVar, int i10, boolean z10, String str, boolean z11, fc.d dVar2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: markAsConsumed");
        }
        if ((i11 & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            z11 = true;
        }
        return dVar.markAsConsumed(i10, z10, str2, z11, dVar2);
    }
}
