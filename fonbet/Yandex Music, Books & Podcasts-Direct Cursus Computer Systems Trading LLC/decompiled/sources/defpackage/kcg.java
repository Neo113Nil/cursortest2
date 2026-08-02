package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import ru.yandex.video.m3.ui.ListYandexPlayerView;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class kcg extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ ListYandexPlayerView s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kcg(ListYandexPlayerView listYandexPlayerView, int i) {
        super(0);
        this.r = i;
        this.s = listYandexPlayerView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        HashSet u0;
        Object t7oVar;
        HashSet u02;
        Object t7oVar2;
        switch (this.r) {
            case 0:
                ListYandexPlayerView listYandexPlayerView = this.s;
                rre rreVar = listYandexPlayerView.a;
                rreVar.getClass();
                rreVar.H(listYandexPlayerView.e(), "activatePreviewSurface", null, new Object[0]);
                if (listYandexPlayerView.j) {
                    listYandexPlayerView.e.setVisibility(0);
                    listYandexPlayerView.j = false;
                    listYandexPlayerView.l.c = false;
                    listYandexPlayerView.k.c = true;
                    yjj yjjVar = listYandexPlayerView.c;
                    synchronized (yjjVar.a) {
                        u0 = CollectionsKt.u0(yjjVar.a);
                    }
                    Iterator it = u0.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        try {
                            r7o r7oVar = z7o.b;
                            tzn tznVar = ((tag) next).a.y;
                            if ((tznVar.b & 2) != 0) {
                                tznVar.d = null;
                                tznVar.e = null;
                            }
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
                return Unit.a;
            default:
                ListYandexPlayerView listYandexPlayerView2 = this.s;
                rre rreVar2 = listYandexPlayerView2.a;
                rreVar2.getClass();
                rreVar2.H(listYandexPlayerView2.e(), "activateVideoSurface", null, new Object[0]);
                if (!listYandexPlayerView2.j) {
                    listYandexPlayerView2.e.setVisibility(8);
                    listYandexPlayerView2.j = true;
                    listYandexPlayerView2.l.c = true;
                    listYandexPlayerView2.k.c = false;
                    yjj yjjVar2 = listYandexPlayerView2.c;
                    synchronized (yjjVar2.a) {
                        u02 = CollectionsKt.u0(yjjVar2.a);
                    }
                    Iterator it2 = u02.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        try {
                            r7o r7oVar3 = z7o.b;
                            mbg mbgVar = ((tag) next2).a;
                            tzn tznVar2 = mbgVar.y;
                            tznVar2.e = new sag(mbgVar, 2);
                            tznVar2.c.add(tznVar2);
                            t7oVar2 = Unit.a;
                        } catch (Throwable th2) {
                            r7o r7oVar4 = z7o.b;
                            t7oVar2 = new t7o(th2);
                        }
                        Throwable a2 = z7o.a(t7oVar2);
                        if (a2 != null) {
                            Timber.INSTANCE.e(a2, "notifyObservers", new Object[0]);
                        }
                    }
                }
                return Unit.a;
        }
    }
}
