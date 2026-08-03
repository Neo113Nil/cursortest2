package xa;

import fc.d;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class a {
    public static /* synthetic */ Object processNotification$default(b bVar, oa.c cVar, int i10, d dVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: processNotification");
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return bVar.processNotification(cVar, i10, dVar);
    }
}
