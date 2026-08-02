package defpackage;

import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.r0;
import com.yandex.plus.bdui.plus.checkout.o;
import com.yandex.plus.bdui.plus.webview.q;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.log.api.b;
import com.yandex.plus.pay.ui.core.api.domain.a;
import com.yandex.plus.pay.ui.webview.paymentwidget.ui.c;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import ru.yandex.video.m3.data.PlaybackParameters;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.PlaybackException;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final /* synthetic */ class m10 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ m10(f20 f20Var, Function0 function0, String str, String str2, String str3, Function0 function02) {
        this.a = 0;
        this.b = f20Var;
        this.c = function0;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.d = function02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v19, types: [kotlin.Unit] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HashSet u0;
        HashSet u02;
        HashSet u03;
        Object t7oVar;
        Object t7oVar2;
        Object t7oVar3;
        final int i = 3;
        int i2 = 6;
        final int i3 = 2;
        final int i4 = 0;
        final int i5 = 1;
        Continuation continuation = null;
        Unit unit = null;
        Unit unit2 = null;
        switch (this.a) {
            case 0:
                f20 f20Var = (f20) this.b;
                Function0 function0 = (Function0) this.c;
                String str = (String) this.e;
                String str2 = (String) this.f;
                String str3 = (String) this.g;
                Function0 function02 = (Function0) this.d;
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                String str4 = f20Var.d;
                n8g b = t75.b();
                String str5 = f20Var.c;
                b.add(str5);
                if (str4 != null) {
                    b.add(str4);
                }
                n8g a = t75.a(b);
                n8g b2 = t75.b();
                if (str != null) {
                    b2.add(str);
                }
                b2.add(String.valueOf(f20Var.a));
                b2.add(str5);
                if (str4 != null) {
                    b2.add(str4);
                }
                if (str2 != null) {
                    b2.add(str2);
                }
                if (str3 != null) {
                    b2.add(str3);
                }
                n8g a2 = t75.a(b2);
                wfp.u(jfpVar, new mn0(6, CollectionsKt.X(a, StringUtils.COMMA, null, null, null, 62), (ArrayList) null));
                wfp.k(jfpVar, CollectionsKt.X(a2, StringUtils.COMMA, null, null, null, 62));
                wfp.h(jfpVar, new or(1, function02));
                if (function0 != null) {
                    jfpVar.o(hfp.c, new sa(null, new or(2, function0)));
                }
                return Unit.a;
            case 1:
                lvf lvfVar = (lvf) this.b;
                fvf fvfVar = (fvf) this.c;
                eoe eoeVar = (eoe) this.d;
                c26 c26Var = (c26) this.e;
                xqc xqcVar = (xqc) this.f;
                List list = (List) this.g;
                vuf vufVar = (vuf) obj;
                vufVar.getClass();
                if (lvfVar != null) {
                    vq2.f(vufVar, lvfVar, c26Var, xqcVar, list.size() + 2);
                }
                jf0.h(vufVar, fvfVar, eoeVar);
                return Unit.a;
            case 2:
                tf6 tf6Var = (tf6) this.b;
                frt frtVar = (frt) this.c;
                qec qecVar = (qec) this.d;
                ehv ehvVar = (ehv) this.e;
                wt5 wt5Var = (wt5) this.f;
                final pnk pnkVar = (pnk) this.g;
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(g2q.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                rp7Var.E(new r90(tf6Var, frtVar, qecVar, ehvVar, wt5Var, 5));
                o18Var.c = hag.I(yws.class);
                rp7Var.getClass();
                rp7Var.E(new Function1() { // from class: onk
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        l13 l13Var = (l13) obj2;
                        switch (i4) {
                            case 0:
                                l13Var.getClass();
                                return pnkVar.a().a;
                            case 1:
                                l13Var.getClass();
                                return pnkVar.a().b;
                            case 2:
                                l13Var.getClass();
                                return pnkVar.a().c;
                            case 3:
                                l13Var.getClass();
                                return pnkVar.a().d;
                            default:
                                l13Var.getClass();
                                return pnkVar.a().e;
                        }
                    }
                });
                o18Var.c = hag.I(cu.class);
                rp7Var.getClass();
                rp7Var.E(new Function1() { // from class: onk
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        l13 l13Var = (l13) obj2;
                        switch (i5) {
                            case 0:
                                l13Var.getClass();
                                return pnkVar.a().a;
                            case 1:
                                l13Var.getClass();
                                return pnkVar.a().b;
                            case 2:
                                l13Var.getClass();
                                return pnkVar.a().c;
                            case 3:
                                l13Var.getClass();
                                return pnkVar.a().d;
                            default:
                                l13Var.getClass();
                                return pnkVar.a().e;
                        }
                    }
                });
                o18Var.c = hag.I(dc1.class);
                rp7Var.getClass();
                rp7Var.E(new Function1() { // from class: onk
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        l13 l13Var = (l13) obj2;
                        switch (i3) {
                            case 0:
                                l13Var.getClass();
                                return pnkVar.a().a;
                            case 1:
                                l13Var.getClass();
                                return pnkVar.a().b;
                            case 2:
                                l13Var.getClass();
                                return pnkVar.a().c;
                            case 3:
                                l13Var.getClass();
                                return pnkVar.a().d;
                            default:
                                l13Var.getClass();
                                return pnkVar.a().e;
                        }
                    }
                });
                o18Var.c = hag.I(tvl.class);
                rp7Var.getClass();
                rp7Var.E(new Function1() { // from class: onk
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        l13 l13Var = (l13) obj2;
                        switch (i) {
                            case 0:
                                l13Var.getClass();
                                return pnkVar.a().a;
                            case 1:
                                l13Var.getClass();
                                return pnkVar.a().b;
                            case 2:
                                l13Var.getClass();
                                return pnkVar.a().c;
                            case 3:
                                l13Var.getClass();
                                return pnkVar.a().d;
                            default:
                                l13Var.getClass();
                                return pnkVar.a().e;
                        }
                    }
                });
                o18Var.c = hag.I(u4u.class);
                rp7Var.getClass();
                final int i6 = 4;
                rp7Var.E(new Function1() { // from class: onk
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        l13 l13Var = (l13) obj2;
                        switch (i6) {
                            case 0:
                                l13Var.getClass();
                                return pnkVar.a().a;
                            case 1:
                                l13Var.getClass();
                                return pnkVar.a().b;
                            case 2:
                                l13Var.getClass();
                                return pnkVar.a().c;
                            case 3:
                                l13Var.getClass();
                                return pnkVar.a().d;
                            default:
                                l13Var.getClass();
                                return pnkVar.a().e;
                        }
                    }
                });
                return Unit.a;
            case 3:
                poi poiVar = (poi) this.b;
                poi poiVar2 = (poi) this.c;
                uqn uqnVar = (uqn) this.d;
                uqn uqnVar2 = (uqn) this.e;
                aqi aqiVar = (aqi) this.f;
                gq4 gq4Var = (gq4) this.g;
                t6k t6kVar = (t6k) poiVar;
                t6k t6kVar2 = (t6k) poiVar2;
                t6kVar.h(t6kVar2.e() + t6kVar.e() + ((Float) obj).floatValue());
                t6kVar2.h(0.0f);
                float c = yhn.c(t6kVar.e(), uqnVar.a, uqnVar2.a);
                Function1 function1 = (Function1) aqiVar.getValue();
                float f = uqnVar.a;
                float f2 = uqnVar2.a - f;
                function1.invoke(Float.valueOf(fxf.I(((Number) gq4Var.g()).floatValue(), ((Number) gq4Var.m()).floatValue(), yhn.c(f2 == 0.0f ? 0.0f : (c - f) / f2, 0.0f, 1.0f))));
                return Unit.a;
            case 4:
                fjt fjtVar = (fjt) this.b;
                String str6 = (String) this.e;
                tsf tsfVar = (tsf) this.c;
                ynn ynnVar = (ynn) this.d;
                njt njtVar = (njt) this.f;
                zpd zpdVar = (zpd) this.g;
                bsf bsfVar = (bsf) obj;
                bsfVar.getClass();
                if (fjtVar instanceof ejt) {
                    if (str6 != null && str6.length() != 0) {
                        bsf.X(bsfVar, new h4t(16), new wn5(new mf3(str6, 13), -1618232033, true), 5);
                    }
                    Iterator it = ((ejt) fjtVar).a.iterator();
                    while (true) {
                        int i7 = i4;
                        if (it.hasNext()) {
                            Object next = it.next();
                            i4 = i7 + 1;
                            if (i7 < 0) {
                                u75.n();
                                throw null;
                            }
                            bsf.X(bsfVar, null, new wn5(new kqd(i7, tsfVar, ynnVar, njtVar, (yit) next), 555187105, true), 7);
                        }
                    }
                } else {
                    if (!(fjtVar instanceof djt)) {
                        b6e.s();
                        return null;
                    }
                    while (i4 < 100) {
                        bsf.X(bsfVar, null, new wn5(new f6p(14, fjtVar, zpdVar), 1867232101, true), 7);
                        i4++;
                    }
                }
                return Unit.a;
            case 5:
                yj2 yj2Var = (yj2) this.b;
                sdr sdrVar = (sdr) this.e;
                nbg nbgVar = (nbg) this.f;
                Function0 function03 = (Function0) this.c;
                Function0 function04 = (Function0) this.d;
                Function0 function05 = (Function0) this.g;
                ((oa8) obj).getClass();
                boolean z = (yj2Var.e && ((Boolean) sdrVar.getValue()).booleanValue()) ? false : true;
                e9w e9wVar = new e9w(function03, function04, function05);
                nbgVar.a.a(e9wVar);
                kyk kykVar = new kyk(yj2Var.h, z);
                final acg acgVar = nbgVar.a;
                final imh imhVar = (imh) yj2Var.k.getValue();
                imhVar.getClass();
                y7g.Y(false, acgVar.a);
                qdc qdcVar = acgVar.a;
                qdcVar.H(acgVar.h, "setSource", imhVar.d + " playbackConfig: " + kykVar + " isWithEngine = " + acgVar.f(), new Object[0]);
                String str7 = acgVar.h;
                StringBuilder sb = new StringBuilder("mediaData=");
                sb.append(imhVar);
                qdcVar.H(str7, "setSource", sb.toString(), new Object[0]);
                imh imhVar2 = acgVar.p;
                acgVar.r = false;
                acgVar.t = false;
                acgVar.s = false;
                acgVar.p = imhVar;
                acgVar.q = kykVar;
                yjj yjjVar = acgVar.o;
                synchronized (yjjVar.a) {
                    u0 = CollectionsKt.u0(yjjVar.a);
                }
                Iterator it2 = u0.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    try {
                        r7o r7oVar = z7o.b;
                        ((r9g) next2).R();
                        t7oVar3 = Unit.a;
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        t7oVar3 = new t7o(th);
                    }
                    Throwable a3 = z7o.a(t7oVar3);
                    if (a3 != null) {
                        Timber.INSTANCE.e(a3, "notifyObservers", new Object[0]);
                    }
                }
                yjj yjjVar2 = acgVar.u;
                synchronized (yjjVar2.a) {
                    u02 = CollectionsKt.u0(yjjVar2.a);
                }
                Iterator it3 = u02.iterator();
                while (it3.hasNext()) {
                    Object next3 = it3.next();
                    try {
                        r7o r7oVar3 = z7o.b;
                        ((p9g) next3).c(acgVar, imhVar2, imhVar, kykVar);
                        t7oVar2 = Unit.a;
                    } catch (Throwable th2) {
                        r7o r7oVar4 = z7o.b;
                        t7oVar2 = new t7o(th2);
                    }
                    Throwable a4 = z7o.a(t7oVar2);
                    if (a4 != null) {
                        Timber.INSTANCE.e(a4, "notifyObservers", new Object[0]);
                    }
                }
                acgVar.y = 0L;
                acgVar.w = null;
                i9g i9gVar = acgVar.z;
                boolean z2 = kykVar.b;
                boolean z3 = i9gVar.c;
                i9gVar.c = z2;
                final PlaybackParameters e = a4g.e(false, new fm9(kykVar, acgVar.f.B()));
                String str8 = imhVar.d;
                String str9 = imhVar.b;
                String str10 = imhVar.c;
                if (str8 != null && ((str10 != null && !StringsKt.U(str10)) || (str9 != null && !StringsKt.U(str9)))) {
                    acgVar.e.G(new dfc(str10, str9), imhVar.d);
                }
                final VideoData b3 = acgVar.b(imhVar);
                if (b3 != null) {
                    paw pawVar = acgVar.j;
                    if (pawVar != null) {
                        pawVar.y(b3, e);
                        unit = Unit.a;
                    }
                    if (unit == null) {
                        acgVar.w = new xbg() { // from class: pbg
                            @Override // defpackage.xbg
                            public final void a(paw pawVar2) {
                                switch (i4) {
                                    case 0:
                                        VideoData videoData = (VideoData) b3;
                                        acg acgVar2 = acgVar;
                                        acgVar2.a.H(acgVar2.h, "setSource", "Postponed prepare postponedStartPosition = " + acgVar2.y, new Object[0]);
                                        Long l = acgVar2.y;
                                        PlaybackParameters playbackParameters = e;
                                        if (l != null) {
                                            playbackParameters = a4g.e(playbackParameters.getAutoPlay(), new sea(28, acgVar2, playbackParameters));
                                        }
                                        acgVar2.y = null;
                                        pawVar2.y(videoData, playbackParameters);
                                        break;
                                    default:
                                        imh imhVar3 = (imh) b3;
                                        acg acgVar3 = acgVar;
                                        acgVar3.a.H(acgVar3.h, "setSource", "Postponed prepare postponedStartPosition = " + acgVar3.y, new Object[0]);
                                        Long l2 = acgVar3.y;
                                        PlaybackParameters playbackParameters2 = e;
                                        if (l2 != null) {
                                            playbackParameters2 = a4g.e(playbackParameters2.getAutoPlay(), new sea(28, acgVar3, playbackParameters2));
                                        }
                                        acgVar3.y = null;
                                        pawVar2.H(imhVar3.d, playbackParameters2);
                                        break;
                                }
                            }
                        };
                    }
                } else {
                    String str11 = imhVar.d;
                    if (str11 == null) {
                        ngl.r(acgVar.a, acgVar.h, "setSource", "Empty stream url and videoContentId for " + imhVar + '!', null, new Object[0], 8);
                        yjj yjjVar3 = acgVar.o;
                        synchronized (yjjVar3.a) {
                            u03 = CollectionsKt.u0(yjjVar3.a);
                        }
                        Iterator it4 = u03.iterator();
                        while (it4.hasNext()) {
                            Object next4 = it4.next();
                            try {
                                r7o r7oVar5 = z7o.b;
                                ((r9g) next4).P(new PlaybackException.ErrorPreparing.InvalidStreamUrl(new IllegalArgumentException("Empty stream url and videoContentId for " + imhVar + '!')));
                                t7oVar = Unit.a;
                            } catch (Throwable th3) {
                                r7o r7oVar6 = z7o.b;
                                t7oVar = new t7o(th3);
                            }
                            Throwable a5 = z7o.a(t7oVar);
                            if (a5 != null) {
                                Timber.INSTANCE.e(a5, "notifyObservers", new Object[0]);
                            }
                        }
                        paw pawVar2 = acgVar.j;
                        if (pawVar2 != null) {
                            pawVar2.k();
                            continuation = Unit.a;
                        }
                        if (continuation == null) {
                            acgVar.w = new qbg();
                        }
                        return new mf0(21, nbgVar, e9wVar);
                    }
                    paw pawVar3 = acgVar.j;
                    if (pawVar3 != null) {
                        pawVar3.H(str11, e);
                        unit2 = Unit.a;
                    }
                    if (unit2 == null) {
                        acgVar.w = new xbg() { // from class: pbg
                            @Override // defpackage.xbg
                            public final void a(paw pawVar22) {
                                switch (i5) {
                                    case 0:
                                        VideoData videoData = (VideoData) imhVar;
                                        acg acgVar2 = acgVar;
                                        acgVar2.a.H(acgVar2.h, "setSource", "Postponed prepare postponedStartPosition = " + acgVar2.y, new Object[0]);
                                        Long l = acgVar2.y;
                                        PlaybackParameters playbackParameters = e;
                                        if (l != null) {
                                            playbackParameters = a4g.e(playbackParameters.getAutoPlay(), new sea(28, acgVar2, playbackParameters));
                                        }
                                        acgVar2.y = null;
                                        pawVar22.y(videoData, playbackParameters);
                                        break;
                                    default:
                                        imh imhVar3 = (imh) imhVar;
                                        acg acgVar3 = acgVar;
                                        acgVar3.a.H(acgVar3.h, "setSource", "Postponed prepare postponedStartPosition = " + acgVar3.y, new Object[0]);
                                        Long l2 = acgVar3.y;
                                        PlaybackParameters playbackParameters2 = e;
                                        if (l2 != null) {
                                            playbackParameters2 = a4g.e(playbackParameters2.getAutoPlay(), new sea(28, acgVar3, playbackParameters2));
                                        }
                                        acgVar3.y = null;
                                        pawVar22.H(imhVar3.d, playbackParameters2);
                                        break;
                                }
                            }
                        };
                    }
                }
                boolean z4 = kykVar.a;
                iyn iynVar = z4 ? eyn.a : fyn.a;
                paw pawVar4 = acgVar.j;
                if (pawVar4 != null) {
                    pawVar4.r(iynVar);
                } else {
                    acgVar.x.add(new rbg(acgVar, iynVar, z4));
                }
                acgVar.i(kykVar.b);
                return new mf0(21, nbgVar, e9wVar);
            case 6:
                mm6 mm6Var = (mm6) this.b;
                zcq zcqVar = (zcq) this.e;
                Function0 function06 = (Function0) this.c;
                Function1 function12 = (Function1) this.f;
                Function0 function07 = (Function0) this.d;
                aqi aqiVar2 = (aqi) this.g;
                r0 r0Var = (r0) obj;
                r0Var.getClass();
                x97.y(mm6Var, null, null, new bbi(zcqVar, continuation, i2), 3).R(new r90(r0Var, function06, function12, function07, aqiVar2));
                return Unit.a;
            default:
                c cVar = (c) this.b;
                o oVar = (o) this.c;
                a aVar = (a) this.d;
                kotlinx.coroutines.a aVar2 = (kotlinx.coroutines.a) this.e;
                y yVar = (y) this.f;
                b bVar = (b) this.g;
                q qVar = (q) obj;
                qVar.getClass();
                return new com.yandex.plus.bdui.plus.checkout.webview.contract.b(qVar, cVar, oVar, aVar, aVar2, yVar, bVar);
        }
    }

    public /* synthetic */ m10(yj2 yj2Var, sdr sdrVar, nbg nbgVar, Function0 function0, Function0 function02, Function0 function03) {
        this.a = 5;
        this.b = yj2Var;
        this.e = sdrVar;
        this.f = nbgVar;
        this.c = function0;
        this.d = function02;
        this.g = function03;
    }

    public /* synthetic */ m10(mm6 mm6Var, zcq zcqVar, Function0 function0, Function1 function1, Function0 function02, aqi aqiVar) {
        this.a = 6;
        this.b = mm6Var;
        this.e = zcqVar;
        this.c = function0;
        this.f = function1;
        this.d = function02;
        this.g = aqiVar;
    }

    public /* synthetic */ m10(fjt fjtVar, String str, tsf tsfVar, ynn ynnVar, njt njtVar, zpd zpdVar) {
        this.a = 4;
        this.b = fjtVar;
        this.e = str;
        this.c = tsfVar;
        this.d = ynnVar;
        this.f = njtVar;
        this.g = zpdVar;
    }

    public /* synthetic */ m10(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }
}
