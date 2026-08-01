package u5;

import java.util.List;
import z7.InterfaceC5267d;

/* renamed from: u5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5081b {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object listNotificationsForOutstanding$default(d dVar, List list, InterfaceC5267d interfaceC5267d, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listNotificationsForOutstanding");
        }
        if ((i & 1) != 0) {
            list = null;
        }
        return dVar.listNotificationsForOutstanding(list, interfaceC5267d);
    }

    public static /* synthetic */ Object markAsConsumed$default(d dVar, int i, boolean z3, String str, boolean z6, InterfaceC5267d interfaceC5267d, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: markAsConsumed");
        }
        if ((i6 & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i6 & 8) != 0) {
            z6 = true;
        }
        return dVar.markAsConsumed(i, z3, str2, z6, interfaceC5267d);
    }
}
