package defpackage;

import android.os.SystemClock;
import android.view.View;
import com.yandex.passport.internal.l;
import com.yandex.passport.internal.push.h0;
import com.yandex.passport.internal.push.m;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.home.feature.panel.internalapi.analytics.c;
import com.yandex.plus.home.repository.api.model.panel.b0;
import com.yandex.plus.home.repository.api.model.panel.c0;
import com.yandex.plus.home.repository.api.model.panel.i;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.video.m3.data.StartFromCacheInfo;
import ru.yandex.video.m3.data.TrackSelectionType;
import ru.yandex.video.m3.player.impl.tracking.a;
import ru.yandex.video.m3.player.impl.tracking.event.CanPlayData;
import ru.yandex.video.m3.player.impl.tracking.event.DebugReportData;
import ru.yandex.video.m3.player.impl.tracking.event.DecoderFallbackData;
import ru.yandex.video.m3.player.impl.tracking.event.DefaultEventData;
import ru.yandex.video.m3.player.impl.tracking.event.Event;
import ru.yandex.video.m3.player.impl.tracking.event.EventDefault;
import ru.yandex.video.m3.player.impl.tracking.event.EventType;
import ru.yandex.video.m3.player.tracking.LoadCanceled;

/* loaded from: classes.dex */
public final class oh3 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oh3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
        this.n = obj4;
        this.o = obj5;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                oh3 oh3Var = new oh3((ph3) this.l, (f8j) this.m, (ha0) this.n, (t03) this.o, continuation, 0);
                oh3Var.k = obj;
                return oh3Var;
            case 1:
                return new oh3((cir) this.k, (t5a) this.l, (vhm) this.m, (l4a) this.n, (q2a) this.o, continuation, 1);
            case 2:
                oh3 oh3Var2 = new oh3((bjb) this.l, continuation, (a) this.m, (gfc) this.n, (cjb) this.o, 2);
                oh3Var2.k = obj;
                return oh3Var2;
            case 3:
                oh3 oh3Var3 = new oh3((bjb) this.l, continuation, (a) this.m, (cjb) this.n, (LoadCanceled) this.o, 3);
                oh3Var3.k = obj;
                return oh3Var3;
            case 4:
                oh3 oh3Var4 = new oh3((bjb) this.l, continuation, (a) this.m, (y2t) this.n, (cjb) this.o, 4);
                oh3Var4.k = obj;
                return oh3Var4;
            case 5:
                oh3 oh3Var5 = new oh3((bjb) this.l, continuation, (a) this.m, (StartFromCacheInfo) this.n, (cjb) this.o, 5);
                oh3Var5.k = obj;
                return oh3Var5;
            case 6:
                oh3 oh3Var6 = new oh3((bjb) this.l, continuation, (a) this.m, (DecoderFallbackData) this.n, (cjb) this.o, 6);
                oh3Var6.k = obj;
                return oh3Var6;
            case 7:
                return new oh3((a7g) this.k, (aqi) this.l, (aqi) this.m, (aqi) this.n, (aqi) this.o, continuation, 7);
            case 8:
                return new oh3((u6q) this.k, (pjc) this.l, (jf2) this.m, (j0l) this.n, (iy1) this.o, continuation, 8);
            case 9:
                oh3 oh3Var7 = new oh3((m) this.l, (l) this.m, (String) this.n, (h0) this.o, continuation, 9);
                oh3Var7.k = obj;
                return oh3Var7;
            default:
                return new oh3((com.yandex.plus.home.feature.panel.internal.sections.l) this.k, (View) this.l, (i) this.m, (b0) this.n, (c0) this.o, continuation, 10);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((oh3) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((oh3) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((oh3) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((oh3) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((oh3) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((oh3) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((oh3) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((oh3) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((oh3) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((oh3) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((oh3) create((Unit) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Event event;
        boolean z;
        ylr ylrVar;
        a aVar;
        Object t7oVar;
        Object t7oVar2;
        v33 v33Var;
        Object obj2 = null;
        int i = 3;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                mm6 mm6Var = (mm6) this.k;
                ph3 ph3Var = (ph3) this.l;
                Continuation continuation = null;
                x97.y(mm6Var, null, null, new k3(ph3Var, (f8j) this.m, (ha0) this.n, continuation, 22), 3);
                return x97.y(mm6Var, null, null, new cs1(ph3Var, (t03) this.o, continuation, 14), 3);
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                ((cir) this.k).b(new thm((t5a) this.l, (vhm) this.m, m4a.a((m4a) ((l4a) this.n), (q2a) this.o)));
                return Unit.a;
            case 2:
                cjb cjbVar = (cjb) this.o;
                gfc gfcVar = (gfc) this.n;
                StartFromCacheInfo startFromCacheInfo = gfcVar.a;
                TrackSelectionType trackSelectionType = gfcVar.b;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                bjb bjbVar = (bjb) this.l;
                n0l n0lVar = bjbVar.a;
                try {
                    r7o r7oVar = z7o.b;
                    a aVar2 = (a) this.m;
                    Event event2 = Event.CAN_PLAY;
                    EventType eventType = EventType.EVENT;
                    aVar2.g.getClass();
                    eventType.getClass();
                    boolean z2 = aVar2.l;
                    ylr ylrVar2 = aVar2.a;
                    a aVar3 = (a) this.m;
                    if (z2) {
                        EventDefault h = a.h(aVar3, bjbVar, event2, null, null, null, new CanPlayData(trackSelectionType, n0lVar, startFromCacheInfo), cjbVar, 14);
                        ylrVar2.getClass();
                        ylrVar2.c(h);
                    } else {
                        ylrVar2.b(a.h(aVar3, bjbVar, event2, null, null, null, new CanPlayData(trackSelectionType, n0lVar, startFromCacheInfo), cjbVar, 14));
                    }
                } catch (Throwable unused) {
                    r7o r7oVar2 = z7o.b;
                }
                return Unit.a;
            case 3:
                cjb cjbVar2 = (cjb) this.n;
                LoadCanceled loadCanceled = (LoadCanceled) this.o;
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                bjb bjbVar2 = (bjb) this.l;
                try {
                    r7o r7oVar3 = z7o.b;
                    a aVar4 = (a) this.m;
                    event = Event.LOAD_CANCELED;
                    EventType eventType2 = EventType.EVENT;
                    aVar4.g.getClass();
                    eventType2.getClass();
                    z = aVar4.l;
                    ylrVar = aVar4.a;
                    aVar = (a) this.m;
                } catch (Throwable unused2) {
                    r7o r7oVar4 = z7o.b;
                }
                if (!z) {
                    try {
                        t7oVar2 = aVar.h.to(loadCanceled);
                    } catch (Throwable th) {
                        r7o r7oVar5 = z7o.b;
                        t7oVar2 = new t7o(th);
                    }
                    if (!(t7oVar2 instanceof t7o)) {
                        obj2 = t7oVar2;
                    }
                    ylrVar.b(a.h(aVar, bjbVar2, event, null, null, null, new DefaultEventData((String) obj2), cjbVar2, 14));
                    return Unit.a;
                }
                try {
                    t7oVar = aVar.h.to(loadCanceled);
                } catch (Throwable th2) {
                    r7o r7oVar6 = z7o.b;
                    t7oVar = new t7o(th2);
                }
                if (!(t7oVar instanceof t7o)) {
                    obj2 = t7oVar;
                }
                EventDefault h2 = a.h(aVar, bjbVar2, event, null, null, null, new DefaultEventData((String) obj2), cjbVar2, 14);
                ylrVar.getClass();
                ylrVar.c(h2);
                return Unit.a;
                r7o r7oVar42 = z7o.b;
                return Unit.a;
            case 4:
                cjb cjbVar3 = (cjb) this.o;
                a aVar5 = (a) this.m;
                y2t y2tVar = (y2t) this.n;
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                bjb bjbVar3 = (bjb) this.l;
                try {
                    r7o r7oVar7 = z7o.b;
                    Event event3 = Event.DEBUG_REPORT;
                    EventType eventType3 = EventType.EVENT;
                    aVar5.g.getClass();
                    eventType3.getClass();
                    boolean z3 = aVar5.l;
                    ylr ylrVar3 = aVar5.a;
                    if (z3) {
                        EventDefault h3 = a.h(aVar5, bjbVar3, event3, null, null, null, new DebugReportData(aVar5.h.to(y2tVar.invoke())), cjbVar3, 14);
                        ylrVar3.getClass();
                        ylrVar3.c(h3);
                    } else {
                        ylrVar3.b(a.h(aVar5, bjbVar3, event3, null, null, null, new DebugReportData(aVar5.h.to(y2tVar.invoke())), cjbVar3, 14));
                    }
                } catch (Throwable unused3) {
                    r7o r7oVar8 = z7o.b;
                }
                return Unit.a;
            case 5:
                cjb cjbVar4 = (cjb) this.o;
                StartFromCacheInfo startFromCacheInfo2 = (StartFromCacheInfo) this.n;
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                bjb bjbVar4 = (bjb) this.l;
                n0l n0lVar2 = bjbVar4.a;
                try {
                    r7o r7oVar9 = z7o.b;
                    a aVar6 = (a) this.m;
                    Event event4 = Event.CACHE_INFO_READY;
                    EventType eventType4 = EventType.EVENT;
                    aVar6.g.getClass();
                    eventType4.getClass();
                    boolean z4 = aVar6.l;
                    ylr ylrVar4 = aVar6.a;
                    a aVar7 = (a) this.m;
                    if (z4) {
                        EventDefault h4 = a.h(aVar7, bjbVar4, event4, null, null, null, new CanPlayData(null, n0lVar2, startFromCacheInfo2), cjbVar4, 14);
                        ylrVar4.getClass();
                        ylrVar4.c(h4);
                    } else {
                        ylrVar4.b(a.h(aVar7, bjbVar4, event4, null, null, null, new CanPlayData(null, n0lVar2, startFromCacheInfo2), cjbVar4, 14));
                    }
                } catch (Throwable unused4) {
                    r7o r7oVar10 = z7o.b;
                }
                return Unit.a;
            case 6:
                cjb cjbVar5 = (cjb) this.o;
                DecoderFallbackData decoderFallbackData = (DecoderFallbackData) this.n;
                a aVar8 = (a) this.m;
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                bjb bjbVar5 = (bjb) this.l;
                try {
                    r7o r7oVar11 = z7o.b;
                    Event event5 = Event.VIDEO_DECODER_FALLBACK;
                    EventType eventType5 = EventType.EVENT;
                    aVar8.g.getClass();
                    eventType5.getClass();
                    boolean z5 = aVar8.l;
                    ylr ylrVar5 = aVar8.a;
                    if (z5) {
                        EventDefault h5 = a.h(aVar8, bjbVar5, event5, null, null, null, decoderFallbackData, cjbVar5, 14);
                        ylrVar5.getClass();
                        ylrVar5.c(h5);
                    } else {
                        ylrVar5.b(a.h(aVar8, bjbVar5, event5, null, null, null, decoderFallbackData, cjbVar5, 14));
                    }
                } catch (Throwable unused5) {
                    r7o r7oVar12 = z7o.b;
                }
                return Unit.a;
            case 7:
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                a7g a7gVar = (a7g) this.k;
                float floatValue = ((Number) ((aqi) this.l).getValue()).floatValue();
                long longValue = ((Number) ((aqi) this.m).getValue()).longValue();
                boolean booleanValue = ((Boolean) ((aqi) this.n).getValue()).booleanValue();
                float floatValue2 = ((Number) ((aqi) this.o).getValue()).floatValue();
                v6k v6kVar = a7gVar.e;
                t6k t6kVar = a7gVar.d;
                long uptimeMillis = SystemClock.uptimeMillis();
                long j = uptimeMillis - a7gVar.g;
                if (j < 0) {
                    j = 0;
                }
                if (Math.abs((Math.abs(floatValue - a7gVar.f) * longValue) - (a7gVar.h ? j * a7gVar.i : 0.0f)) > 750) {
                    float c = yhn.c(floatValue, 0.0f, 1.0f);
                    t6kVar.h(c);
                    v6kVar.i(SystemClock.uptimeMillis());
                    a7gVar.a(c);
                } else {
                    t6kVar.h(Math.max(a7gVar.b(floatValue2, uptimeMillis, longValue, booleanValue), floatValue));
                    v6kVar.i(uptimeMillis);
                }
                a7gVar.f = floatValue;
                a7gVar.g = uptimeMillis;
                a7gVar.h = booleanValue;
                a7gVar.i = floatValue2;
                return Unit.a;
            case 8:
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                u6q u6qVar = (u6q) this.k;
                b7q b7qVar = u6qVar.n;
                bdt I = hag.I(wzc.class);
                qdc qdcVar = b7qVar.a;
                qdcVar.getClass();
                wzc wzcVar = (wzc) qdcVar.C(I);
                kzp kzpVar = new kzp(2, u6qVar);
                iy1 iy1Var = (iy1) this.o;
                kzp kzpVar2 = new kzp(i, iy1Var);
                cte cteVar = new cte(27, wzcVar, kzpVar, u6qVar);
                b7q b7qVar2 = u6qVar.n;
                bdt I2 = hag.I(zss.class);
                qdc qdcVar2 = b7qVar2.a;
                qdcVar2.getClass();
                zss zssVar = (zss) qdcVar2.C(I2);
                w1f w1fVar = new w1f();
                pjc A = u6qVar.k.A();
                p6o p6oVar = new p6o((pjc) this.l, 18);
                u6qVar.k.getClass();
                kv6 kv6Var = new kv6(w1fVar, A, p6oVar, 10L, ((Boolean) u6qVar.i.a.d.getValue()).booleanValue(), ((Boolean) u6qVar.i.a.h.getValue()).booleanValue(), u6qVar.j, u6qVar.n, zssVar, cteVar, kzpVar2, mal.b());
                kv6Var.c1(new r6q(iy1Var, kv6Var));
                g7q g7qVar = (g7q) kv6Var.j.getValue();
                ncl nclVar = (ncl) kv6Var.k.getValue();
                b7q b7qVar3 = u6qVar.n;
                xu6 xu6Var = new xu6(kv6Var, i);
                tcl tclVar = u6qVar.i;
                jf2 jf2Var = (jf2) this.m;
                tclVar.getClass();
                rdk rdkVar = new rdk(xu6Var, new efo(29, new oxo(17, xu6Var)), tclVar, jf2Var);
                b7q b7qVar4 = u6qVar.n;
                tcl tclVar2 = u6qVar.i;
                b7qVar4.getClass();
                tclVar2.getClass();
                if (((Boolean) tclVar2.a.b.invoke()).booleanValue()) {
                    bdt I3 = hag.I(vv1.class);
                    qdc qdcVar3 = b7qVar4.a;
                    qdcVar3.getClass();
                    v33Var = new mmo(kv6Var, (vv1) qdcVar3.C(I3), mal.b());
                } else {
                    v33Var = l48.b;
                }
                return new a7q(kv6Var, w1fVar, g7qVar, b7qVar3, rdkVar, v33Var, nclVar, new hs4(23), (j0l) this.n);
            case 9:
                mm6 mm6Var2 = (mm6) this.k;
                nm6 nm6Var10 = nm6.a;
                qgg.h0(obj);
                m mVar = (m) this.l;
                l lVar = (l) this.m;
                x97.y(mm6Var2, null, null, new ocu(mVar, lVar, (String) this.n, (h0) this.o, (Continuation) null, 22), 3);
                return x97.y(mm6Var2, null, null, new wzv((m) this.l, (h0) this.o, lVar, null, 28), 3);
            default:
                nm6 nm6Var11 = nm6.a;
                qgg.h0(obj);
                com.yandex.plus.home.feature.panel.internal.sections.l lVar2 = (com.yandex.plus.home.feature.panel.internal.sections.l) this.k;
                com.yandex.plus.home.feature.panel.internalapi.analytics.a u = lVar2.u((View) this.l);
                i iVar = (i) this.m;
                b0 b0Var = (b0) this.n;
                c0 c0Var = (c0) this.o;
                iVar.getClass();
                b0Var.getClass();
                c0Var.getClass();
                String str = iVar.a;
                String str2 = iVar.b;
                String str3 = b0Var.a;
                String str4 = b0Var.b;
                String id = c0Var.getId();
                String name = c0Var.getName();
                if (u == null) {
                    jyr jyrVar = com.yandex.plus.home.feature.panel.internalapi.analytics.a.e;
                    u = r1.o();
                }
                lVar2.C.invoke(new c(str, str2, str3, str4, id, name, u));
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oh3(Object obj, Object obj2, Serializable serializable, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
        this.n = serializable;
        this.o = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oh3(bjb bjbVar, Continuation continuation, a aVar, Object obj, Object obj2, int i) {
        super(2, continuation);
        this.j = i;
        this.l = bjbVar;
        this.m = aVar;
        this.n = obj;
        this.o = obj2;
    }
}
