package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.player.PreparingParams;
import ru.yandex.video.m3.player.ui.debug.model.CurrentStreamType;
import ru.yandex.video.m3.player.ui.debug.model.CurrentVideoType;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class ed6 implements u9l {
    public final yjj a;

    public ed6(yjj yjjVar) {
        this.a = yjjVar;
    }

    @Override // defpackage.u9l
    public final void j(PreparingParams preparingParams) {
        HashSet u0;
        Object t7oVar;
        preparingParams.getClass();
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
                String contentId = preparingParams.getContentId();
                if (contentId == null) {
                    contentId = "None";
                }
                tawVar.getClass();
                xdr xdrVar = tawVar.b;
                xdrVar.getClass();
                xdrVar.m(null, contentId);
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

    @Override // defpackage.u9l
    public final void s(VideoType videoType, StreamType streamType) {
        HashSet u0;
        Object t7oVar;
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
                int i = -1;
                int i2 = videoType == null ? -1 : dd6.a[videoType.ordinal()];
                CurrentVideoType currentVideoType = i2 != 1 ? i2 != 2 ? i2 != 3 ? CurrentVideoType.UNKNOWN : CurrentVideoType.LIVE : CurrentVideoType.EVENT : CurrentVideoType.VOD;
                if (streamType != null) {
                    i = dd6.b[streamType.ordinal()];
                }
                CurrentStreamType currentStreamType = i != 1 ? i != 2 ? CurrentStreamType.UNKNOWN : CurrentStreamType.HLS : CurrentStreamType.DASH;
                tawVar.getClass();
                currentVideoType.getClass();
                currentStreamType.getClass();
                xdr xdrVar = tawVar.c;
                xdrVar.getClass();
                xdrVar.m(null, currentVideoType);
                xdr xdrVar2 = tawVar.d;
                xdrVar2.getClass();
                xdrVar2.m(null, currentStreamType);
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
