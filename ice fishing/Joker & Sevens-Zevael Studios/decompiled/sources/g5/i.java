package g5;

import android.util.LruCache;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i extends LruCache {
    @Override // android.util.LruCache
    public final void entryRemoved(boolean z10, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        k kVar = (k) obj2;
        pc.j.e(kVar, "oldValue");
        if (z10) {
            kVar.close();
        }
    }
}
