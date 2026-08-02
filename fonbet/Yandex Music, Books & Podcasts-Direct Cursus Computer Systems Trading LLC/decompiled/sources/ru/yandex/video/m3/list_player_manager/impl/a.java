package ru.yandex.video.m3.list_player_manager.impl;

import android.widget.ImageView;
import com.yandex.passport.sloth.ui.dependencies.m;
import defpackage.aa0;
import defpackage.acg;
import defpackage.apo;
import defpackage.b1o;
import defpackage.brc;
import defpackage.cnm;
import defpackage.cr;
import defpackage.dbw;
import defpackage.dn9;
import defpackage.eag;
import defpackage.ecg;
import defpackage.eld;
import defpackage.fag;
import defpackage.fld;
import defpackage.gag;
import defpackage.hnm;
import defpackage.i8l;
import defpackage.imh;
import defpackage.kma;
import defpackage.kyk;
import defpackage.l8d;
import defpackage.mmo;
import defpackage.ngl;
import defpackage.omr;
import defpackage.p9g;
import defpackage.paw;
import defpackage.qdc;
import defpackage.r7o;
import defpackage.rue;
import defpackage.s7b;
import defpackage.sea;
import defpackage.t75;
import defpackage.t7o;
import defpackage.tf6;
import defpackage.u7b;
import defpackage.uah;
import defpackage.v75;
import defpackage.wct;
import defpackage.x97;
import defpackage.xbg;
import defpackage.xbu;
import defpackage.xdr;
import defpackage.y6v;
import defpackage.y7g;
import defpackage.yjj;
import defpackage.z0o;
import defpackage.z7o;
import defpackage.zye;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.list_player_manager.impl.EngineReuseException;
import ru.yandex.video.m3.ott.data.dto.VhVideoData;
import ru.yandex.video.m3.player.impl.tracking.event.DefaultEventData;
import ru.yandex.video.m3.player.impl.tracking.event.EventType;
import ru.yandex.video.m3.preload_manager.PreloadException;
import ru.yandex.video.m3.ui.ListYandexPlayerView;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class a implements p9g {
    public final m a;
    public final dbw b;
    public final qdc c;
    public final boolean d;
    public final int e;
    public final int f;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final LinkedHashMap i = new LinkedHashMap();
    public final LinkedHashMap j = new LinkedHashMap();
    public final ArrayList k = new ArrayList();
    public ecg l;

    public a(m mVar, dbw dbwVar, qdc qdcVar, boolean z, s7b s7bVar) {
        this.a = mVar;
        this.b = dbwVar;
        this.c = qdcVar;
        this.d = z;
        this.e = s7bVar.b;
        this.f = s7bVar.a;
    }

    public static String l(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(y7g.v((rue) it.next()));
        }
        return CollectionsKt.X(arrayList, null, null, null, null, 63);
    }

    @Override // defpackage.p9g
    public final void a(acg acgVar, ListYandexPlayerView listYandexPlayerView) {
        listYandexPlayerView.getClass();
        y7g.Y(false, this.c);
        ecg ecgVar = this.l;
        if (ecgVar != null) {
            int width = listYandexPlayerView.getWidth();
            int height = listYandexPlayerView.getHeight();
            if (width <= 0 || height <= 0) {
                return;
            }
            xbu xbuVar = ecgVar.c;
            xbuVar.t = width;
            xbuVar.u = height;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0159 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v22, types: [kotlin.coroutines.Continuation] */
    @Override // defpackage.p9g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(acg acgVar, imh imhVar, imh imhVar2, kyk kykVar) {
        Throwable th;
        xbu xbuVar;
        ecg ecgVar;
        yjj yjjVar;
        HashSet u0;
        Object value;
        Object obj;
        boolean z;
        y7g.Y(false, this.c);
        qdc qdcVar = this.c;
        StringBuilder sb = new StringBuilder("from ");
        sb.append(imhVar != null ? imhVar.d : null);
        sb.append(" to ");
        sb.append(imhVar2.d);
        sb.append(" on player ");
        sb.append(y7g.v(acgVar));
        qdcVar.H("EngineReuseManager", "onSetSource", sb.toString(), new Object[0]);
        wct.n(this.j).remove(imhVar);
        this.j.put(imhVar2, acgVar);
        if (!acgVar.f()) {
            String str = "";
            if (this.k.contains(imhVar2)) {
                str = "Found player that was missing it's engine, probably this item was preloaded. Give engine to player ".concat(y7g.v(acgVar));
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.c.H("EngineReuseManager", "onSetSource", str, new Object[0]);
                k(acgVar);
            }
        }
        ecg ecgVar2 = this.l;
        if (ecgVar2 == null) {
            return;
        }
        ListYandexPlayerView listYandexPlayerView = acgVar.n;
        if (listYandexPlayerView != null) {
            listYandexPlayerView.setFirstFrameUntilPlay(false);
            cr crVar = ecgVar2.o;
            ecgVar2.a(crVar);
            if (crVar != null) {
                ((qdc) crVar.b).H("GlideBitmapDownloader", "onSourceSetForView", "view tag:".concat(listYandexPlayerView.e()), new Object[0]);
                ?? r6 = 0;
                aa0 aa0Var = new aa0(imhVar2, crVar, listYandexPlayerView, r6, 5);
                apo apoVar = (apo) crVar.f;
                if (apoVar != null) {
                    x97.y((tf6) apoVar.c, null, null, new y6v(apoVar, new eld(aa0Var, r6, 0), (Continuation) null), 3);
                    th = r6;
                } else {
                    x97.D(g.a, new eld(aa0Var, r6, 1));
                    th = r6;
                }
                xbuVar = ecgVar2.c;
                xbuVar.c.H("VideoPreloadManager", "notifyItemAttachedToListPlayer", String.valueOf(imhVar2.d), new Object[0]);
                if (xbuVar.r) {
                    VideoData videoData = (VideoData) xbuVar.p.get(imhVar2);
                    if (videoData != null) {
                        xbuVar.c.H("VideoPreloadManager", "cancelPreload", String.valueOf(imhVar2.d), new Object[0]);
                        hnm hnmVar = xbuVar.s;
                        if (hnmVar == null) {
                            Intrinsics.j("preloadManager");
                            throw th;
                        }
                        hnmVar.c(videoData);
                    }
                    String str2 = imhVar2.d;
                    if (str2 != null) {
                        xbuVar.b.a(t75.c(str2));
                    }
                }
                xbuVar.p.remove(imhVar2);
                ecgVar = xbuVar.i;
                if (ecgVar != null) {
                    ecgVar.d(imhVar2);
                }
                xbuVar.o.remove(imhVar2);
                xbuVar.c.H("VideoPreloadManager", "notifyItemAttachedToListPlayer", "now preloading= ".concat(xbu.a(CollectionsKt.w0(xbuVar.p.keySet()))), new Object[0]);
                xbuVar.q.addLast(imhVar2);
                yjjVar = ecgVar2.l;
                synchronized (yjjVar.a) {
                    u0 = CollectionsKt.u0(yjjVar.a);
                }
                Iterator it = u0.iterator();
                while (it.hasNext()) {
                    gag gagVar = (gag) it.next();
                    xdr xdrVar = gagVar.c;
                    LinkedHashMap q = uah.q(((eag) xdrVar.getValue()).e);
                    q.put(imhVar2, Integer.valueOf(acgVar.c));
                    do {
                        value = xdrVar.getValue();
                    } while (!xdrVar.k(value, eag.a((eag) value, null, null, null, null, q, null, null, null, null, null, null, null, null, null, null, null, null, 131055)));
                    Iterator it2 = ((eag) xdrVar.getValue()).c.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it2.next();
                            if (Intrinsics.d(((zye) obj).a, imhVar2)) {
                                break;
                            }
                        }
                    }
                    if (obj != null) {
                        gagVar.b();
                    }
                }
                return;
            }
        }
        th = null;
        xbuVar = ecgVar2.c;
        xbuVar.c.H("VideoPreloadManager", "notifyItemAttachedToListPlayer", String.valueOf(imhVar2.d), new Object[0]);
        if (xbuVar.r) {
        }
        xbuVar.p.remove(imhVar2);
        ecgVar = xbuVar.i;
        if (ecgVar != null) {
        }
        xbuVar.o.remove(imhVar2);
        xbuVar.c.H("VideoPreloadManager", "notifyItemAttachedToListPlayer", "now preloading= ".concat(xbu.a(CollectionsKt.w0(xbuVar.p.keySet()))), new Object[0]);
        xbuVar.q.addLast(imhVar2);
        yjjVar = ecgVar2.l;
        synchronized (yjjVar.a) {
        }
    }

    @Override // defpackage.p9g
    public final void f(acg acgVar, boolean z) {
        qdc qdcVar = this.c;
        y7g.Y(false, qdcVar);
        StringBuilder sb = new StringBuilder("try to play ");
        imh d = acgVar.d();
        sb.append(d != null ? d.d : null);
        qdcVar.H("EngineReuseManager", "onPlay", sb.toString(), new Object[0]);
        if (acgVar.f()) {
            return;
        }
        String str = "Try to play " + y7g.v(acgVar) + " without engine";
        y7g.Q(new EngineReuseException.PlayToPlayerWithoutEngine(str, null, 2, null), qdcVar, "EngineReuseManager", "onPlay", str);
        k(acgVar);
    }

    @Override // defpackage.p9g
    public final void g(rue rueVar, ListYandexPlayerView listYandexPlayerView, VideoData videoData, boolean z) {
        ecg ecgVar = this.l;
        if (ecgVar == null || listYandexPlayerView == null) {
            return;
        }
        cr crVar = ecgVar.o;
        ecgVar.a(crVar);
        if (crVar != null) {
            qdc qdcVar = (qdc) crVar.b;
            StringBuilder sb = new StringBuilder("view tag:");
            sb.append(listYandexPlayerView.e());
            sb.append(" ffUrl=");
            Continuation continuation = null;
            VhVideoData vhVideoData = videoData instanceof VhVideoData ? (VhVideoData) videoData : null;
            sb.append(vhVideoData != null ? vhVideoData.getFirstFrameUrl() : null);
            qdcVar.H("GlideBitmapDownloader", "onVideoDataLoadedForView", sb.toString(), new Object[0]);
            aa0 aa0Var = new aa0(videoData instanceof VhVideoData ? (VhVideoData) videoData : null, crVar, listYandexPlayerView, continuation, 6);
            apo apoVar = (apo) crVar.f;
            if (apoVar != null) {
                x97.y((tf6) apoVar.c, null, null, new y6v(apoVar, new fld(aa0Var, continuation, 0), (Continuation) null), 3);
            } else {
                x97.D(g.a, new fld(aa0Var, continuation, 1));
            }
        }
    }

    @Override // defpackage.p9g
    public final void i(acg acgVar, ListYandexPlayerView listYandexPlayerView) {
        acgVar.getClass();
        listYandexPlayerView.getClass();
        y7g.Y(false, this.c);
        ecg ecgVar = this.l;
        if (ecgVar != null) {
            cr crVar = ecgVar.o;
            ecgVar.a(crVar);
            if (crVar != null) {
                ((qdc) crVar.b).H("GlideBitmapDownloader", "onSourceClearedFromView", "view tag:".concat(listYandexPlayerView.e()), new Object[0]);
                listYandexPlayerView.getFirstFrameImageView$video_player_internalRelease().setTag(null);
                b1o b1oVar = (b1o) crVar.h;
                ImageView firstFrameImageView$video_player_internalRelease = listYandexPlayerView.getFirstFrameImageView$video_player_internalRelease();
                b1oVar.getClass();
                b1oVar.j(new z0o(firstFrameImageView$video_player_internalRelease, 0));
            }
        }
    }

    public final void k(rue rueVar) {
        HashSet u0;
        ecg ecgVar;
        HashSet u02;
        Object obj;
        ListYandexPlayerView listYandexPlayerView;
        Object t7oVar;
        Object obj2;
        ecg ecgVar2;
        paw b = this.b.b();
        if (b == null) {
            this.c.H("EngineReuseManager", "giveEngineToPlayer", "No free engine found. Try get paused from other item", new Object[0]);
            Iterator it = this.i.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                acg acgVar = (acg) ((rue) obj2);
                if (acgVar.f() && !acgVar.s) {
                    break;
                }
            }
            rue rueVar2 = (rue) obj2;
            if (rueVar2 != null) {
                acg acgVar2 = (acg) rueVar2;
                paw c = acgVar2.c();
                if (c != null) {
                    this.c.H("EngineReuseManager", "giveEngineToPlayer", "Found paused from other player with index " + acgVar2.c, new Object[0]);
                    imh d = acgVar2.d();
                    if (d != null && (ecgVar2 = this.l) != null) {
                        ecgVar2.c(d, c);
                    }
                    this.i.remove(rueVar2);
                    ecg ecgVar3 = this.l;
                    if (ecgVar3 != null) {
                        rueVar.getClass();
                        try {
                            ru.yandex.video.m3.list_player_manager.impl.telemetry.a aVar = ecgVar3.f;
                            aVar.a.b(ru.yandex.video.m3.list_player_manager.impl.telemetry.a.a(aVar, "PollError", null, EventType.ERROR, new DefaultEventData(aVar.c.to(new l8d(((acg) rueVar).c, ((acg) rueVar2).c))), null, null, null, 208));
                        } catch (Exception e) {
                            ngl.r(ecgVar3.a, ecgVar3.m, "onGetEngineFromOtherPlayer", null, e, new Object[0], 4);
                        }
                    }
                }
                b = c;
            }
        }
        if (b == null) {
            this.c.H("EngineReuseManager", "giveEngineToPlayer", "No free engine found. Force new engine from pool", new Object[0]);
            ecg ecgVar4 = this.l;
            if (ecgVar4 != null) {
                Set keySet = this.i.keySet();
                rueVar.getClass();
                keySet.getClass();
                try {
                    ru.yandex.video.m3.list_player_manager.impl.telemetry.a aVar2 = ecgVar4.f;
                    int i = ((acg) rueVar).c;
                    kyk kykVar = ((acg) rueVar).q;
                    Set set = keySet;
                    ArrayList arrayList = new ArrayList(v75.o(set, 10));
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Integer.valueOf(((acg) ((rue) it2.next())).c));
                    }
                    aVar2.a.b(ru.yandex.video.m3.list_player_manager.impl.telemetry.a.a(aVar2, "PollError", null, EventType.ERROR, new DefaultEventData(aVar2.c.to(new brc(i, kykVar, arrayList))), null, null, null, 208));
                } catch (Exception e2) {
                    ngl.r(ecgVar4.a, ecgVar4.m, "onForceEngineAcquire", null, e2, new Object[0], 4);
                }
            }
            dbw dbwVar = this.b;
            paw b2 = dbwVar.b();
            if (b2 == null) {
                b2 = dbwVar.c();
                if (dbwVar.g.c + dbwVar.f.size() >= dbwVar.h) {
                    dbwVar.e.H("YP:Pool", "acquireForce", "Try get more then " + dbwVar.h + " players. It will be " + (dbwVar.g.c + dbwVar.f.size() + 1) + " player", new Object[0]);
                }
            }
            b = b2;
        }
        paw pawVar = b;
        acg acgVar3 = (acg) rueVar;
        acgVar3.getClass();
        qdc qdcVar = acgVar3.a;
        String str = acgVar3.h;
        StringBuilder sb = new StringBuilder("item = ");
        imh imhVar = acgVar3.p;
        sb.append(imhVar != null ? imhVar.d : null);
        sb.append(", WxH: ");
        ListYandexPlayerView listYandexPlayerView2 = acgVar3.n;
        sb.append(listYandexPlayerView2 != null ? Integer.valueOf(listYandexPlayerView2.getWidth()) : null);
        sb.append('x');
        ListYandexPlayerView listYandexPlayerView3 = acgVar3.n;
        sb.append(listYandexPlayerView3 != null ? Integer.valueOf(listYandexPlayerView3.getHeight()) : null);
        qdcVar.H(str, "attachEngine", sb.toString(), new Object[0]);
        acgVar3.j = pawVar;
        omr omrVar = acgVar3.m;
        if (omrVar != null) {
            omrVar.d((i8l) pawVar.J());
        }
        pawVar.I(acgVar3.k);
        pawVar.w(acgVar3.l);
        sea seaVar = acgVar3.A;
        if (seaVar != null) {
            seaVar.invoke(pawVar);
        }
        acgVar3.A = null;
        yjj yjjVar = acgVar3.u;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it3 = u0.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            try {
                r7o r7oVar = z7o.b;
                ((p9g) next).e(pawVar);
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
        mmo mmoVar = new mmo(pawVar, acgVar3.i);
        acgVar3.o.c(new kma(29, mmoVar));
        acgVar3.v = mmoVar;
        if (acgVar3.g.h() && (listYandexPlayerView = acgVar3.n) != null && listYandexPlayerView.getWidth() > 0 && listYandexPlayerView.getHeight() > 0) {
            pawVar.p(listYandexPlayerView.getWidth(), listYandexPlayerView.getHeight());
        }
        if (!acgVar3.e()) {
            qdc qdcVar2 = acgVar3.a;
            String str2 = acgVar3.h;
            StringBuilder sb2 = new StringBuilder("other media data in engine mediaData=");
            imh imhVar2 = acgVar3.p;
            sb2.append(imhVar2 != null ? y7g.P(imhVar2) : null);
            sb2.append(" engine=");
            VideoData G = pawVar.G();
            sb2.append(G != null ? G.getManifestUrl() : null);
            qdcVar2.H(str2, "attachEngine", sb2.toString(), new Object[0]);
            acgVar3.j();
        }
        xbg xbgVar = acgVar3.w;
        if (xbgVar != null) {
            xbgVar.a(pawVar);
        }
        acgVar3.w = null;
        Iterator it4 = acgVar3.x.iterator();
        while (it4.hasNext()) {
            ((xbg) it4.next()).a(pawVar);
        }
        acgVar3.x.clear();
        acgVar3.z.a(pawVar);
        this.i.put(rueVar, pawVar);
        imh d2 = acgVar3.d();
        if (d2 == null || (ecgVar = this.l) == null) {
            return;
        }
        yjj yjjVar2 = ecgVar.l;
        synchronized (yjjVar2.a) {
            u02 = CollectionsKt.u0(yjjVar2.a);
        }
        Iterator it5 = u02.iterator();
        while (it5.hasNext()) {
            gag gagVar = (gag) it5.next();
            gagVar.getClass();
            fag fagVar = new fag(gagVar, pawVar);
            pawVar.I(fagVar);
            xdr xdrVar = gagVar.c;
            LinkedHashMap q = uah.q(((eag) xdrVar.getValue()).f);
            q.put(d2, new u7b(pawVar, fagVar));
            while (true) {
                Object value = xdrVar.getValue();
                LinkedHashMap linkedHashMap = q;
                if (xdrVar.k(value, eag.a((eag) value, null, null, null, null, null, linkedHashMap, null, null, null, null, null, null, null, null, null, null, null, 131039))) {
                    break;
                } else {
                    q = linkedHashMap;
                }
            }
            Iterator it6 = ((eag) xdrVar.getValue()).c.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it6.next();
                    if (Intrinsics.d(((zye) obj).a, d2)) {
                        break;
                    }
                }
            }
            if (obj != null) {
                gagVar.b();
            }
        }
        if (ecgVar.p) {
            return;
        }
        cnm cnmVar = (cnm) ecgVar.i;
        Object obj3 = cnmVar.b;
        if (obj3 == null) {
            obj3 = cnmVar.c;
        }
        if (obj3 == null) {
            cnmVar.a();
        }
        PreloadException.CacheInitException cacheInitException = cnmVar.c;
        if (cacheInitException != null) {
            ecgVar.f.b(cacheInitException);
            ecgVar.p = true;
        }
    }

    public final String m(List list) {
        StringBuilder sb = new StringBuilder("[MediaData + ListPlayer]: ");
        List<imh> list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        for (imh imhVar : list2) {
            arrayList.add("[" + imhVar.d + " + " + y7g.v((rue) this.j.get(imhVar)) + ']');
        }
        sb.append(CollectionsKt.X(arrayList, null, null, null, null, 63));
        return sb.toString();
    }

    public final void n(rue rueVar) {
        HashSet u0;
        Object t7oVar;
        paw c;
        ecg ecgVar;
        rueVar.getClass();
        y7g.Y(false, this.c);
        acg acgVar = (acg) rueVar;
        acgVar.u.e(this);
        this.g.remove(rueVar);
        if (acgVar.f() && (c = acgVar.c()) != null) {
            this.b.d(c);
            this.i.remove(rueVar);
            imh d = acgVar.d();
            if (d != null && (ecgVar = this.l) != null) {
                ecgVar.c(d, c);
            }
        }
        ecg ecgVar2 = this.l;
        if (ecgVar2 != null && this.g.size() == 0) {
            dn9 dn9Var = ecgVar2.d;
            ((AtomicReference) dn9Var.e).set(null);
            ((AtomicInteger) dn9Var.f).set(Integer.MIN_VALUE);
        }
        yjj yjjVar = acgVar.u;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((p9g) next).j(acgVar);
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
        acgVar.u.b();
        acgVar.o.b();
    }
}
