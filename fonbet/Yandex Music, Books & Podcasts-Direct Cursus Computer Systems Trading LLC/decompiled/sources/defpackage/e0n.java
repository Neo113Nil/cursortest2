package defpackage;

import android.view.View;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class e0n implements ogu {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    @Override // defpackage.ogu
    public final View a(String str) {
        Object obj = this.a.get(str);
        if (obj != null) {
            return ((ieu) obj).a();
        }
        wvs.h(null);
        return null;
    }

    @Override // defpackage.ogu
    public final void b(String str, ieu ieuVar, int i) {
        this.a.put(str, ieuVar);
    }
}
