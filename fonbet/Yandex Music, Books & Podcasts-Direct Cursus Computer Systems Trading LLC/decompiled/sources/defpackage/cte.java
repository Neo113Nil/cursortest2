package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.http.SslError;
import android.os.Handler;
import com.google.gson.Gson;
import com.yandex.messenger.websdk.api.MessengerAnalytics;
import com.yandex.music.shared.playback.utils.api.commands.RemovePlayableCommand;
import com.yandex.passport.internal.entities.j;
import com.yandex.passport.internal.ui.bouncer.roundabout.k;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.home.api.lifecycle.a;
import com.yandex.plus.home.g;
import com.yandex.plus.home.internal.di.u;
import com.yandex.plus.home.t;
import com.yandex.plus.log.api.b;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import ru.yandex.music.R;
import ru.yandex.music.catalog.artist.screen.ArtistScreenActivity;
import ru.yandex.music.catalog.playlist.screen.PlaylistScreenActivity;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.c;
import ru.yandex.music.common.media.context.e;
import ru.yandex.music.main.MainScreenActivity;
import ru.yandex.music.phonoteka.mymusic.CollectionMainActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class cte implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cte(pui puiVar, mqs mqsVar, String str) {
        this.a = 10;
        this.b = puiVar;
        this.d = mqsVar;
        this.c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v44, types: [arf, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Intent h;
        n7q n7qVar;
        List B;
        int i;
        String str;
        Object i7nVar;
        vdr c;
        vdr c2;
        int i2 = 3;
        int i3 = 11;
        int i4 = 24;
        Object[] objArr = 0;
        switch (this.a) {
            case 0:
                ((MessengerAnalytics) ((qdc) this.b).b).l((String) this.c, (Throwable) this.d);
                return Unit.a;
            case 1:
                Map map = (Map) this.d;
                qdc qdcVar = (qdc) this.b;
                String str2 = (String) this.c;
                LinkedHashMap q = uah.q(map);
                q.putAll(qdcVar.c);
                ((MessengerAnalytics) qdcVar.b).sendEvent(str2, q);
                return Unit.a;
            case 2:
                cwg cwgVar = (cwg) this.b;
                jp0 jp0Var = (jp0) this.c;
                aqi aqiVar = (aqi) this.d;
                g06 g06Var = cwgVar.a.k;
                g06Var.S((fkb) ((gs4) g06Var.c).c);
                dn9 dn9Var = cwgVar.b;
                kwg kwgVar = ((lwg) aqiVar.getValue()).b;
                kwgVar.getClass();
                t1f t1fVar = (t1f) dn9Var.c;
                Object obj = dn9Var.d;
                Context context = (Context) t1fVar.b;
                PlaybackScope playbackScope = obj instanceof PlaybackScope ? (PlaybackScope) obj : null;
                if (playbackScope == null) {
                    playbackScope = PlaybackScope.a;
                    playbackScope.getClass();
                }
                if (kwgVar instanceof hwg) {
                    h = quj.V(context, ((hwg) kwgVar).a, playbackScope);
                } else if (kwgVar instanceof iwg) {
                    int i5 = ArtistScreenActivity.w0;
                    h = l48.p(context, ((iwg) kwgVar).a, playbackScope, null, 24);
                } else {
                    if (!(kwgVar instanceof jwg)) {
                        b6e.s();
                        return null;
                    }
                    int i6 = PlaylistScreenActivity.B0;
                    h = dxl.h(context, ((jwg) kwgVar).a, playbackScope);
                }
                context.startActivity(h);
                jp0Var.e();
                return Unit.a;
            case 3:
                jgh jghVar = (jgh) this.b;
                ygh yghVar = (ygh) this.c;
                return new clp(new ce5(new cr(jghVar.a, yghVar, (yb) this.d), yghVar));
            case 4:
                return new wnh(((jgh) this.b).a, (cce) this.c, (ssh) this.d);
            case 5:
                n8i n8iVar = (n8i) this.b;
                String str3 = (String) this.c;
                k7i k7iVar = (k7i) this.d;
                rmb.k(n8iVar.e, str3, null, null, 6);
                k7iVar.a(str3);
                return Unit.a;
            case 6:
                ((l8i) this.b).b((a8i) ((f8i) this.c), (spd) this.d);
                return Unit.a;
            case 7:
                xli xliVar = (xli) this.b;
                w70 w70Var = (w70) this.c;
                dou douVar = (dou) this.d;
                cvo cvoVar = xliVar.i;
                jab jabVar = new jab(qkb.MyWave, 1, w70Var.c, 1);
                pkb pkbVar = pkb.Wave;
                String str4 = douVar.a;
                str4.getClass();
                return new w5l(cvoVar, jabVar, new thj(pkbVar, str4, 1, 1, ""), null);
            case 8:
                return new u5l(((xli) this.b).i, new jab(qkb.Q2vWave, 1, ((dki) this.c).c.c, 1), new thj(pkb.Wave, CollectionsKt.X(((n7n) this.d).c, StringUtils.COMMA, null, null, null, 62), 1, 1, ""), null);
            case 9:
                return new x4d((y3l) this.b, (List) this.c, (kan) this.d);
            case 10:
                pui puiVar = (pui) this.b;
                mqs mqsVar = (mqs) this.d;
                String str5 = (String) this.c;
                e eVar = (e) puiVar.e.getValue();
                PlaybackScope playbackScope2 = puiVar.b;
                eVar.getClass();
                c h2 = playbackScope2.h();
                if (puiVar.b().c(h2, mqsVar, false)) {
                    puiVar.b().i(false);
                } else {
                    asq.t(z5l.g(puiVar.b(), h2, puiVar.c.a(str5), null, mqsVar, 0, 0, null, null, null, new mui(mqsVar, null, objArr == true ? 1 : 0), 23796), puiVar.a, new p1n(8));
                }
                return Unit.a;
            case 11:
                w6j w6jVar = (w6j) this.b;
                Context context2 = (Context) this.c;
                g7j g7jVar = (g7j) this.d;
                eke ekeVar = w6jVar.b;
                context2.getClass();
                ile ileVar = w6jVar.a;
                ileVar.getClass();
                if (g7jVar.equals(b7j.a)) {
                    ((z66) ileVar.a.getValue()).i(u0j.b);
                } else if (g7jVar instanceof y6j) {
                    ekeVar.a.c(ekeVar.b, wjb.DownloadedContentScreen, "");
                    Activity R = vq2.R(context2);
                    if (R != null) {
                        lhs lhsVar = MainScreenActivity.Q0;
                        R.startActivity(imp.J(R, rf3.l, null, w6h.a, 4));
                    }
                } else if (g7jVar instanceof d7j) {
                    ekeVar.a.c(ekeVar.b, wjb.SettingsAutoDownloadScreen, "");
                    Activity R2 = vq2.R(context2);
                    if (R2 != null) {
                        int i7 = CollectionMainActivity.v0;
                        R2.startActivity(men.B(R2, v35.l));
                    }
                } else if (!g7jVar.equals(x6j.a)) {
                    b6e.s();
                    return null;
                }
                return Unit.a;
            case 12:
                x97.y((mm6) this.b, null, null, new h1j((o3k) this.c, (yoc) this.d, (Continuation) null, i3), 3);
                return Unit.a;
            case 13:
                tf4 tf4Var = (tf4) this.b;
                mqs mqsVar2 = (mqs) this.c;
                zus zusVar = (zus) this.d;
                ef3 ef3Var = ef3.b;
                muo muoVar = tf4Var.g;
                if (muoVar == null) {
                    muoVar = muo.UNKNOWN;
                }
                ef3.g(ef3Var, muoVar, brs.j(mqsVar2), pe3.DELETE);
                tf4Var.d.e();
                d6l x = p6g.x((e6l) ((oq7) tf4Var.v.getValue()).a.c.getValue());
                if (x != null && (n7qVar = x.a) != null && (B = y7g.B(n7qVar)) != null && zusVar != null && (i = zusVar.a) >= 0 && i < B.size() && Intrinsics.d(((mwk) B.get(i)).a(), mqsVar2)) {
                    ((k1l) tf4Var.n.getValue()).a(new RemovePlayableCommand(i), new b3t("queue_remove"));
                }
                v5g.O(tf4Var.e, ((frt) tf4Var.m.getValue()).c(), R.string.track_was_removed_from_playlist);
                return Unit.a;
            case 14:
                qzl qzlVar = (qzl) this.b;
                jab jabVar2 = (jab) this.c;
                thj thjVar = (thj) ((qxl) this.d).c.getValue();
                qzlVar.getClass();
                thjVar.getClass();
                ff ffVar = qzlVar.e;
                if (ffVar != null && (str = ffVar.b) != null) {
                    if (str.length() == 0) {
                        str = null;
                    }
                    if (str != null) {
                        rmb.k(qzlVar.h.a(jabVar2, null), str, thjVar, null, 4);
                        cxl cxlVar = qzlVar.b;
                        Boolean bool = ffVar.d;
                        w1g.y(cxlVar.a, str, bool != null ? bool.booleanValue() : true);
                        return Unit.a;
                    }
                }
                cvl cvlVar = qzlVar.d;
                dfi.r(hrg.s("Acton button url for playlist ", cvlVar.b, " with id = ", cvlVar.e(), " is null or empty."), "PlaylistScreenPresenter");
                return Unit.a;
            case 15:
                qzl qzlVar2 = (qzl) this.b;
                jab jabVar3 = (jab) this.c;
                thj thjVar2 = (thj) this.d;
                qzlVar2.getClass();
                thjVar2.getClass();
                rmb.j(qzlVar2.h.a(jabVar3, null), wjb.AddTracksScreen, thjVar2, null, 12);
                cxl cxlVar2 = qzlVar2.b;
                cvl cvlVar2 = qzlVar2.d;
                cvlVar2.getClass();
                nr6.a(cxlVar2.a, cvlVar2);
                return Unit.a;
            case 16:
                t tVar = (t) this.b;
                hn5 hn5Var = (hn5) this.c;
                com.yandex.plus.paymentsdk.internal.method.e eVar2 = (com.yandex.plus.paymentsdk.internal.method.e) this.d;
                j jVar = new j();
                jVar.a = new ReentrantLock();
                Set synchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
                synchronizedSet.getClass();
                jVar.b = synchronizedSet;
                jVar.c = a.g;
                jVar.d = hn5Var;
                jVar.e = new ru2(i3, jVar);
                g gVar = new g(jVar, eVar2);
                u uVar = tVar.b;
                com.yandex.plus.home.internal.di.e eVar3 = tVar.c;
                return (com.yandex.plus.home.j) r1.R(eVar3.a, "Component.Initialization", new k(20, new cr(gVar, uVar, eVar3, tVar.d, tVar.f, tVar.g, tVar.h, tVar.j)));
            case 17:
                ((iwm) this.b).c.m(null, (thj) this.d, (String) this.c);
                return Unit.a;
            case 18:
                hav havVar = (hav) this.b;
                com.yandex.music.payment.screen.promocode.viewmodel.a aVar = (com.yandex.music.payment.screen.promocode.viewmodel.a) this.c;
                SslError sslError = (SslError) this.d;
                havVar.invoke();
                lum lumVar = aVar.n;
                Object value = aVar.p.getValue();
                swm swmVar = value instanceof swm ? (swm) value : null;
                if (swmVar == null) {
                    return Unit.a;
                }
                lumVar.Z(swmVar.a, sslError);
                return Unit.a;
            case 19:
                c3n c3nVar = (c3n) this.b;
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
                kpm kpmVar = (kpm) this.d;
                c3nVar.getClass();
                ArrayList arrayList = new ArrayList();
                b3n d = c3n.d(linkedHashMap);
                q2n q2nVar = null;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str6 = (String) entry.getKey();
                    bve bveVar = (bve) entry.getValue();
                    q2n c3 = c3nVar.c(bveVar, c3n.e(str6), new y20(kpmVar, bveVar, d != null ? d.a(bveVar) : false, 4), new a3n(kpmVar, bveVar, i2));
                    if (Intrinsics.d(str6, "bottom_button")) {
                        q2nVar = c3;
                    } else {
                        arrayList.add(c3);
                    }
                }
                if (arrayList.isEmpty()) {
                    return new e3n(new m3n(c3nVar.a(R.string.purchase_application_title_without_offer), null), c3nVar.a(R.string.purchase_block_empty_description));
                }
                return new f3n(c3nVar.b(linkedHashMap), q2nVar, d != null ? d.a : null, arrayList);
            case 20:
                return new lni((kni) this.b, new g8c((Gson) this.c), new b6n(16, (r9t) this.d), new p1n(i3));
            case 21:
                return new m1p((String) this.c, (Function0) this.b, (Function1) this.d);
            case 22:
                m7n m7nVar = (m7n) this.b;
                p7p p7pVar = (p7p) this.c;
                owu owuVar = (owu) this.d;
                Context context3 = m7nVar.a;
                p7p p7pVar2 = m7nVar.l;
                m7nVar.l = p7pVar;
                if (m7nVar.i != owuVar) {
                    m7nVar.i = owuVar;
                    rar rarVar = m7nVar.j;
                    if (rarVar != null) {
                        rarVar.g(null);
                    }
                    m7nVar.j = (owuVar == null || (c2 = owuVar.c()) == null) ? null : ox6.B(c2, m7nVar.b, new gfl(22, m7nVar));
                }
                if (p7pVar == null) {
                    String string = context3.getString(R.string.search_q2v_loading_title);
                    string.getClass();
                    i7nVar = new j7n(string, context3.getString(R.string.search_q2v_loading_description));
                } else {
                    qmu qmuVar = (owuVar == null || (c = owuVar.c()) == null) ? null : (qmu) c.getValue();
                    s7n s7nVar = p7pVar.a;
                    i7nVar = new i7n(s7nVar.a, s7nVar.b, p7pVar.b, (qmuVar == null || qmuVar == qmu.a) ? false : true, qmuVar != null ? qmuVar.a() : false);
                }
                m7nVar.g.setValue(i7nVar);
                if (m7nVar.k) {
                    if (!Intrinsics.d(p7pVar2 != null ? p7pVar2.b : null, p7pVar != null ? p7pVar.b : null)) {
                        if (p7pVar2 != null) {
                            p7p p7pVar3 = m7nVar.m;
                            m7nVar.m = null;
                            if (p7pVar3 != null) {
                                m7nVar.f.invoke(p7pVar3);
                            }
                        }
                        if (p7pVar != null) {
                            m7nVar.m = p7pVar;
                            t4p t4pVar = m7nVar.e;
                            String uuid = UUID.randomUUID().toString();
                            uuid.getClass();
                            t4pVar.invoke(p7pVar, uuid);
                        }
                    }
                }
                return Unit.a;
            case 23:
                ((g6p) this.b).H(((w6p) this.c).b, ((Number) ((aqi) this.d).getValue()).intValue());
                return Unit.a;
            case 24:
                Function1 function1 = (Function1) this.b;
                hdp hdpVar = (hdp) this.c;
                Function0 function0 = (Function0) this.d;
                function1.invoke(hdpVar.c);
                function0.invoke();
                return Unit.a;
            case 25:
                ((Handler) this.b).post(new zvh(i4, (aqi) this.c, (aqi) this.d));
                return Unit.a;
            case 26:
                com.yandex.plus.bdui.flex.document.a aVar2 = (com.yandex.plus.bdui.flex.document.a) this.b;
                x3f x3fVar = (x3f) this.c;
                w4f w4fVar = (w4f) this.d;
                String str7 = aVar2.c;
                x3fVar.getClass();
                b bVar = aVar2.b;
                com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.c;
                if (bVar.b(aVar3)) {
                    bVar.c(aVar3, "FlexSliceParser", "Parse shared data = " + w4fVar + "...");
                }
                try {
                    com.yandex.plus.bdui.shared.a aVar4 = (com.yandex.plus.bdui.shared.a) x3fVar.a((t9f) aVar2.d.getValue(), new q5f(tah.b(new Pair(str7, w4fVar))));
                    if (bVar.b(aVar3)) {
                        bVar.c(aVar3, "FlexSliceParser", hrg.q("Parse shared data of type = ", str7, " succeeded"));
                    }
                    return aVar2.a.d(aVar4);
                } catch (Throwable th) {
                    com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.e;
                    if (bVar.b(aVar5)) {
                        bVar.a(aVar5, "FlexSliceParser", hrg.q("Parse shared data of type = ", str7, " failed!"), th);
                    }
                    throw th;
                }
            case 27:
                wzc wzcVar = (wzc) this.b;
                kzp kzpVar = (kzp) this.c;
                u6q u6qVar = (u6q) this.d;
                mal.a();
                szc szcVar = new szc();
                int i8 = wzcVar.c + 1;
                wzcVar.c = i8;
                wzcVar.d.put(Integer.valueOf(i8), szcVar);
                wzcVar.a(szcVar);
                n4c n4cVar = new n4c();
                n4cVar.i = l4c.a;
                n4cVar.j = 1.0f;
                mal.a();
                u6qVar.j.getClass();
                do7.a(500, 0, "bufferForPlaybackMs", CommonUrlParts.Values.FALSE_INTEGER);
                do7.a(2000, 0, "bufferForPlaybackAfterRebufferMs", CommonUrlParts.Values.FALSE_INTEGER);
                do7.a(50000, 500, "minBufferMs", "bufferForPlaybackMs");
                do7.a(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
                do7.a(50000, 50000, "maxBufferMs", "minBufferMs");
                mua muaVar = new mua(new do7(new zi7(), 500));
                b7q b7qVar = u6qVar.n;
                bdt I = hag.I(tar.class);
                qdc qdcVar2 = b7qVar.a;
                qdcVar2.getClass();
                tar tarVar = (tar) qdcVar2.C(I);
                Context context4 = u6qVar.a;
                p3e p3eVar = new p3e(i4, u6qVar, new vx1[]{szcVar, n4cVar}, muaVar);
                qqb qqbVar = new qqb(context4.getApplicationContext());
                p3eVar.invoke(qqbVar);
                Object obj2 = qqbVar.d.get();
                obj2.getClass();
                tvh tvhVar = (tvh) obj2;
                Object obj3 = qqbVar.g.get();
                obj3.getClass();
                yk2 yk2Var = (yk2) obj3;
                xrb a = qqbVar.a();
                xdh xdhVar = new xdh(a);
                yar yarVar = tarVar.e;
                c5p c5pVar = tarVar.d;
                ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new jt7(2));
                List list = yarVar.g.a;
                ArrayList arrayList2 = new ArrayList(v75.o(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(String.valueOf(((Number) it.next()).intValue()));
                }
                List list2 = yarVar.j;
                if (list2 != null) {
                    arrayList2 = CollectionsKt.g0(arrayList2, list2);
                }
                List w0 = CollectionsKt.w0(CollectionsKt.z0(arrayList2));
                Context context5 = yarVar.a;
                OkHttpClient okHttpClient = yarVar.b;
                ExecutorService executorService = yarVar.c;
                newSingleThreadScheduledExecutor.getClass();
                var varVar = new xar(yarVar.d, yarVar.e, c5pVar, new hjq(4).c(fgq.k(context5, okHttpClient, executorService, newSingleThreadScheduledExecutor, ogp.d(b2c.q, s4b.b), w0, new hxo(12, yarVar)), new plr(null, null, null, yarVar.g, yarVar.e, yarVar.f, true, true)), xdhVar, new g46(c5pVar), yarVar.k).m;
                Handler handler = new Handler(a.t);
                yjj yjjVar = new yjj();
                yjjVar.a(varVar);
                ive iveVar = new ive(null, yjjVar, new au1(a));
                a.m.a(iveVar);
                a.N1();
                ct7 ct7Var = a.i;
                if (ct7Var instanceof ct7) {
                    a.m.a(new s3t(null, ct7Var, yjjVar));
                }
                a.c1(new dte(yjjVar, new nue(1)));
                h4b h4bVar = new h4b(yjjVar);
                cl2 cl2Var = new cl2(yk2Var);
                yk2Var.e(handler, h4bVar);
                apo apoVar = new apo(iveVar, varVar);
                ((yjj) tarVar.g.b).a(varVar);
                wlr wlrVar = new wlr(a, apoVar, handler, tvhVar, cl2Var.c, tarVar.h, new zg(yk2Var, h4bVar, tarVar, varVar, 17));
                wlrVar.j0((l73) u6qVar.t.getValue());
                kzpVar.invoke(wlrVar);
                uj7 f1 = wlrVar.f1();
                t6q t6qVar = new t6q(wlrVar, wzcVar, i8);
                f1.getClass();
                f1.f.a(t6qVar);
                return new o4c(wlrVar, n4cVar, muaVar);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new i3((foq) this.b, (jnq) this.c, (j1p) this.d);
            default:
                return new i3((loq) this.b, (jnq) this.c, (aqp) this.d);
        }
    }

    public /* synthetic */ cte(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ cte(String str, Function0 function0, Function1 function1) {
        this.a = 21;
        this.c = str;
        this.b = function0;
        this.d = function1;
    }

    public /* synthetic */ cte(Map map, qdc qdcVar, String str) {
        this.a = 1;
        this.d = map;
        this.b = qdcVar;
        this.c = str;
    }
}
