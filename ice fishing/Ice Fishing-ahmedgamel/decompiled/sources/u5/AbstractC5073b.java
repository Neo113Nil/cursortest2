package u5;

import java.util.List;
import z7.InterfaceC5240d;

/* renamed from: u5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5073b {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object listNotificationsForOutstanding$default(d dVar, List list, InterfaceC5240d interfaceC5240d, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listNotificationsForOutstanding");
        }
        if ((i & 1) != 0) {
            list = null;
        }
        return dVar.listNotificationsForOutstanding(list, interfaceC5240d);
    }

    public static /* synthetic */ Object markAsConsumed$default(d dVar, int i, boolean z6, String str, boolean z9, InterfaceC5240d interfaceC5240d, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: markAsConsumed");
        }
        if ((i4 & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i4 & 8) != 0) {
            z9 = true;
        }
        return dVar.markAsConsumed(i, z6, str2, z9, interfaceC5240d);
    }
}
