package q5;

import java.util.List;
import v7.InterfaceC5133d;

/* renamed from: q5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4930b {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object listNotificationsForOutstanding$default(d dVar, List list, InterfaceC5133d interfaceC5133d, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listNotificationsForOutstanding");
        }
        if ((i & 1) != 0) {
            list = null;
        }
        return dVar.listNotificationsForOutstanding(list, interfaceC5133d);
    }

    public static /* synthetic */ Object markAsConsumed$default(d dVar, int i, boolean z8, String str, boolean z9, InterfaceC5133d interfaceC5133d, int i4, Object obj) {
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
        return dVar.markAsConsumed(i, z8, str2, z9, interfaceC5133d);
    }
}
