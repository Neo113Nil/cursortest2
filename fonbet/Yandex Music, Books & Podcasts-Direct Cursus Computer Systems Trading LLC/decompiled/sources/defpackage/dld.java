package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import ru.yandex.video.m3.ui.ListYandexPlayerView;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class dld extends o33 {
    public final qdc e;
    public final ListYandexPlayerView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dld(qdc qdcVar, ListYandexPlayerView listYandexPlayerView) {
        super(listYandexPlayerView.getFirstFrameImageView$video_player_internalRelease(), 1);
        listYandexPlayerView.getClass();
        this.e = qdcVar;
        this.f = listYandexPlayerView;
    }

    @Override // defpackage.o33, defpackage.j6s
    public final void d(Object obj) {
        HashSet u0;
        Object t7oVar;
        Object obj2 = (Drawable) obj;
        qdc qdcVar = this.e;
        qdcVar.getClass();
        qdcVar.H("GlideBitmapDownloader", "onResourceReady", "view tag:".concat(this.f.e()), new Object[0]);
        ListYandexPlayerView listYandexPlayerView = this.f;
        rre rreVar = listYandexPlayerView.a;
        rreVar.getClass();
        rreVar.H(listYandexPlayerView.e(), "firstFramePictureIsSet", null, new Object[0]);
        yjj yjjVar = listYandexPlayerView.c;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                mbg mbgVar = ((tag) next).a;
                tzn tznVar = mbgVar.x;
                tznVar.e = new sag(mbgVar, 1);
                tznVar.c.add(tznVar);
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
        hrl hrlVar = listYandexPlayerView.k;
        if (!hrlVar.d) {
            hrlVar.d = true;
            listYandexPlayerView.n.b(hrlVar);
        }
        j(obj2);
        if (!(obj2 instanceof Animatable)) {
            this.c = null;
            return;
        }
        Animatable animatable = (Animatable) obj2;
        this.c = animatable;
        animatable.start();
    }

    @Override // defpackage.o33, defpackage.j6s
    public final void e(Drawable drawable) {
        HashSet u0;
        Object t7oVar;
        qdc qdcVar = this.e;
        qdcVar.getClass();
        qdcVar.H("GlideBitmapDownloader", "onLoadStarted", "view tag:".concat(this.f.e()), new Object[0]);
        if (drawable != null) {
            ListYandexPlayerView listYandexPlayerView = this.f;
            rre rreVar = listYandexPlayerView.a;
            rreVar.getClass();
            rreVar.H(listYandexPlayerView.e(), "blurPictureIsSet", null, new Object[0]);
            yjj yjjVar = listYandexPlayerView.c;
            synchronized (yjjVar.a) {
                u0 = CollectionsKt.u0(yjjVar.a);
            }
            Iterator it = u0.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                try {
                    r7o r7oVar = z7o.b;
                    mbg mbgVar = ((tag) next).a;
                    tzn tznVar = mbgVar.w;
                    tznVar.e = new sag(mbgVar, 0);
                    tznVar.c.add(tznVar);
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
            hrl hrlVar = listYandexPlayerView.k;
            hrlVar.d = true;
            listYandexPlayerView.n.b(hrlVar);
        }
        super.e(drawable);
    }

    @Override // defpackage.o33, defpackage.j6s
    public final void g(Drawable drawable) {
        qdc qdcVar = this.e;
        qdcVar.getClass();
        qdcVar.H("GlideBitmapDownloader", "onLoadCleared", "view tag:".concat(this.f.e()), new Object[0]);
        super.g(drawable);
    }

    @Override // defpackage.o33, defpackage.j6s
    public final void i(Drawable drawable) {
        qdc qdcVar = this.e;
        qdcVar.getClass();
        qdcVar.H("GlideBitmapDownloader", "onLoadFailed", "view tag:".concat(this.f.e()), new Object[0]);
        super.i(drawable);
    }
}
