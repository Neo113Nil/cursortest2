package defpackage;

import android.os.SystemClock;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.CollectionsKt;
import ru.yandex.video.m3.list_player_manager.impl.telemetry.InitMediaItemData;
import ru.yandex.video.m3.list_player_manager.impl.telemetry.ListViewTelemetryLogger$NotStartReason;
import ru.yandex.video.m3.list_player_manager.impl.telemetry.ListViewTelemetryLogger$TerminalReason;
import ru.yandex.video.m3.list_player_manager.impl.telemetry.a;
import ru.yandex.video.m3.ui.ListYandexPlayerView;

/* loaded from: classes6.dex */
public final class mbg {
    public final szn A;
    public final szn B;
    public final tzn C;
    public final szn D;
    public final szn E;
    public int F;
    public final ListYandexPlayerView a;
    public final a b;
    public final qdc c;
    public final AtomicReference d;
    public final AtomicInteger e;
    public final l2j f;
    public final pag g;
    public final qag h;
    public final lum i;
    public Long j;
    public imh k;
    public kyk l;
    public boolean m;
    public final szn n;
    public final tzn o;
    public final tzn p;
    public final tzn q;
    public final szn r;
    public final tzn s;
    public final szn t;
    public final szn u;
    public final szn v;
    public final tzn w;
    public final tzn x;
    public final tzn y;
    public final szn z;

    /* JADX WARN: Type inference failed for: r5v18, types: [oag] */
    public mbg(ListYandexPlayerView listYandexPlayerView, ujl ujlVar, a aVar, qdc qdcVar, AtomicReference atomicReference, AtomicInteger atomicInteger, l2j l2jVar) {
        atomicReference.getClass();
        atomicInteger.getClass();
        this.a = listYandexPlayerView;
        this.b = aVar;
        this.c = qdcVar;
        this.d = atomicReference;
        this.e = atomicInteger;
        this.f = l2jVar;
        this.g = new pag(this);
        this.h = new qag(this);
        lum lumVar = new lum(4, false);
        this.i = lumVar;
        this.F = 1;
        this.n = lumVar.B(jbg.b, 2);
        this.o = lumVar.C(dbg.b, 2);
        this.p = lumVar.C(hbg.b, 1);
        this.q = lumVar.C(abg.b, 5);
        lbg lbgVar = lbg.b;
        LinkedHashSet linkedHashSet = (LinkedHashSet) lumVar.c;
        linkedHashSet.getClass();
        szn sznVar = new szn(lbgVar, 5, linkedHashSet);
        LinkedHashSet linkedHashSet2 = (LinkedHashSet) lumVar.b;
        linkedHashSet2.add(sznVar);
        this.r = sznVar;
        this.s = lumVar.C(vag.b, 4);
        this.t = lumVar.A(ebg.b, 4);
        this.u = lumVar.B(fbg.b, 4);
        this.v = lumVar.A(ibg.b, 5);
        this.w = lumVar.C(uag.b, 1);
        this.x = lumVar.C(xag.b, 1);
        this.y = lumVar.C(yag.b, 2);
        this.z = lumVar.B(bbg.b, 2);
        this.A = lumVar.A(gbg.b, 2);
        szn sznVar2 = new szn(zag.b, 2, linkedHashSet);
        linkedHashSet2.add(sznVar2);
        this.B = sznVar2;
        this.C = lumVar.C(kbg.b, 2);
        this.D = lumVar.B(wag.b, 2);
        this.E = lumVar.B(cbg.b, 5);
        listYandexPlayerView.b.a(new rag(this));
        listYandexPlayerView.c.a(new tag(this));
        new ac8(listYandexPlayerView, (oag) new ViewTreeObserver.OnDrawListener() { // from class: oag
            /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function0, uif] */
            @Override // android.view.ViewTreeObserver.OnDrawListener
            public final void onDraw() {
                LinkedHashSet linkedHashSet3 = (LinkedHashSet) mbg.this.i.c;
                List<rzn> w0 = CollectionsKt.w0(linkedHashSet3);
                linkedHashSet3.clear();
                for (rzn rznVar : w0) {
                    ?? r2 = rznVar.e;
                    if (r2 != 0) {
                        r2.invoke();
                    }
                    rznVar.e = null;
                }
            }
        });
    }

    public static final void a(mbg mbgVar, paw pawVar) {
        tzn tznVar = mbgVar.s;
        Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
        tznVar.getClass();
        tznVar.d = valueOf;
        szn sznVar = mbgVar.t;
        Integer valueOf2 = Integer.valueOf(pawVar.l());
        sznVar.getClass();
        sznVar.d = valueOf2;
        mbgVar.u.b(pawVar.D());
    }

    public final boolean b(ListViewTelemetryLogger$TerminalReason listViewTelemetryLogger$TerminalReason, ListViewTelemetryLogger$NotStartReason listViewTelemetryLogger$NotStartReason) {
        Long l = this.j;
        if (l == null) {
            return false;
        }
        long longValue = l.longValue();
        Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
        tzn tznVar = this.C;
        tznVar.getClass();
        tznVar.d = valueOf;
        this.D.b(listViewTelemetryLogger$TerminalReason.getIo.appmetrica.analytics.rtm.internal.Constants.KEY_VALUE java.lang.String());
        if (listViewTelemetryLogger$TerminalReason == ListViewTelemetryLogger$TerminalReason.NOT_START_PLAYBACK && listViewTelemetryLogger$NotStartReason != null) {
            this.E.b(listViewTelemetryLogger$NotStartReason.getIo.appmetrica.analytics.rtm.internal.Constants.KEY_VALUE java.lang.String());
        }
        this.z.b(this.f.d().getNetworkTypeName());
        imh imhVar = this.k;
        if (imhVar != null) {
            qdc qdcVar = this.c;
            int m = qdcVar.m(imhVar);
            imh imhVar2 = (imh) this.d.getAndSet(imhVar);
            if (m != -1) {
                int m2 = imhVar2 != null ? qdcVar.m(imhVar2) : -1;
                Boolean valueOf2 = Boolean.valueOf(m2 == -1 || m >= m2);
                szn sznVar = this.B;
                sznVar.getClass();
                sznVar.d = valueOf2;
                AtomicInteger atomicInteger = this.e;
                int i = atomicInteger.get();
                szn sznVar2 = this.A;
                if (i == Integer.MIN_VALUE) {
                    sznVar2.getClass();
                    sznVar2.d = 0;
                    atomicInteger.compareAndSet(Integer.MIN_VALUE, m);
                } else {
                    Integer valueOf3 = Integer.valueOf(m - i);
                    sznVar2.getClass();
                    sznVar2.d = valueOf3;
                }
            }
        }
        InitMediaItemData initMediaItemData = new InitMediaItemData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
        lum lumVar = this.i;
        Iterator it = ((LinkedHashSet) lumVar.a).iterator();
        while (true) {
            Long l2 = null;
            if (!it.hasNext()) {
                break;
            }
            tzn tznVar2 = (tzn) it.next();
            Long l3 = (Long) tznVar2.d;
            if (l3 != null) {
                long longValue2 = l3.longValue() - longValue;
                if (longValue2 < 0) {
                    longValue2 = 0;
                }
                l2 = Long.valueOf(longValue2);
            }
            tznVar2.d = l2;
        }
        for (rzn rznVar : (LinkedHashSet) lumVar.b) {
            Object obj = rznVar.d;
            if (obj != null) {
                rznVar.a.k(initMediaItemData, obj);
            }
        }
        imh imhVar3 = this.k;
        kyk kykVar = this.l;
        a aVar = this.b;
        vx6 vx6Var = aVar.d;
        tle tleVar = new tle(initMediaItemData, imhVar3);
        if (((Boolean) ((fkn) ((nsh) vx6Var.b).c).a.getValue()).booleanValue()) {
            ArrayList y0 = CollectionsKt.y0((Collection) ((fkn) vx6Var.d).a.getValue());
            y0.add(tleVar);
            xdr xdrVar = (xdr) vx6Var.c;
            xdrVar.getClass();
            xdrVar.m(null, y0);
        }
        aVar.a.b(a.a(aVar, "InitMediaItem", imhVar3, null, initMediaItemData, kykVar, initMediaItemData.getPlayerIndex(), initMediaItemData.getSourceIndex(), 20));
        lumVar.g0(2);
        this.j = null;
        this.m = false;
        return true;
    }
}
