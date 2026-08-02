package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import timber.log.Timber;

/* loaded from: classes5.dex */
public abstract class pxr {
    public static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static final void a() {
        Iterator it = a.iterator();
        while (it.hasNext()) {
            fme fmeVar = (fme) it.next();
            switch (fmeVar.a) {
                case 0:
                    Timber.d("onSyncFailed", new Object[0]);
                    a.remove(fmeVar);
                    eme.a();
                    jfb.x0(((mdr) fmeVar.b).a(), false);
                    break;
                default:
                    ktm ktmVar = (ktm) ((ltm) fmeVar.b);
                    ktmVar.getClass();
                    etn.k0(ktmVar, oxr.c);
                    break;
            }
        }
    }
}
