package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import ru.yandex.video.m3.data.DrmType;
import ru.yandex.video.m3.player.ui.debug.model.DrmMode;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class rqa implements u9l {
    public final yjj a;

    public rqa(yjj yjjVar) {
        this.a = yjjVar;
    }

    @Override // defpackage.u9l
    public final void y(DrmType drmType) {
        HashSet u0;
        Object t7oVar;
        drmType.getClass();
        yjj yjjVar = this.a;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                taw tawVar = (taw) next;
                int i = qqa.a[drmType.ordinal()];
                DrmMode drmMode = i != 1 ? i != 2 ? i != 3 ? i != 4 ? DrmMode.UNKNOWN : DrmMode.WIDEVINE : DrmMode.PLAYREADY : DrmMode.CLEARKEY : DrmMode.OFF;
                tawVar.getClass();
                drmMode.getClass();
                xdr xdrVar = tawVar.i;
                xdrVar.getClass();
                xdrVar.m(null, drmMode);
                t7oVar = Unit.a;
            } catch (Throwable th) {
                r7o r7oVar2 = z7o.b;
                t7oVar = new t7o(th);
            }
            Throwable a = z7o.a(t7oVar);
            if (a != null) {
                Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
            }
        }
    }
}
