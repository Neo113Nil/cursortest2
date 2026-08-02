package defpackage;

import android.os.SystemClock;
import com.yandex.music.core.ui.compose.draggable.a;
import com.yandex.passport.common.network.p;
import com.yandex.passport.common.url.b;
import com.yandex.passport.internal.ui.bouncer.model.middleware.o;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.r0;
import com.yandex.passport.internal.ui.challenge.logout.d;
import com.yandex.passport.internal.ui.challenge.webview.c;
import com.yandex.passport.internal.ui.challenge.webview.e;
import com.yandex.passport.internal.ui.challenge.webview.f;
import com.yandex.passport.internal.ui.challenge.webview.g;
import com.yandex.passport.internal.ui.challenge.webview.h;
import com.yandex.plus.acquisition.sdk.pay.common.api.k;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.n;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.home.repository.api.model.panel.b0;
import com.yandex.plus.home.repository.api.model.panel.d0;
import com.yandex.plus.home.repository.api.model.panel.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class r90 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ r90(r0 r0Var, Function0 function0, Function1 function1, Function0 function02, aqi aqiVar) {
        this.a = 14;
        this.b = r0Var;
        this.c = function0;
        this.f = function1;
        this.d = function02;
        this.e = aqiVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cko D0;
        int i = this.a;
        int i2 = 14;
        int i3 = 5;
        int i4 = 4;
        int i5 = 2;
        int i6 = 15;
        int i7 = 0;
        int i8 = 3;
        int i9 = 1;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                obj.getClass();
                return a.a(obj, (u10) obj6, (oa0) obj5, (tm0) obj4, (uf7) obj3, (Function1) obj2);
            case 1:
                z6g z6gVar = (z6g) obj6;
                sdr sdrVar = (sdr) obj4;
                ((Long) obj).getClass();
                long uptimeMillis = SystemClock.uptimeMillis();
                float max = Math.max(Math.max(z6gVar.b(((cjc) obj3).e(), uptimeMillis, ((v6k) obj2).h(), ((Boolean) sdrVar.getValue()).booleanValue()), ((cjc) obj5).e()), z6gVar.b.e());
                if (uptimeMillis - z6gVar.l > 2000) {
                    z6gVar.a(max);
                } else {
                    t6k t6kVar = z6gVar.a;
                    ArrayList arrayList = z6gVar.c;
                    arrayList.add(Float.valueOf(max));
                    if (arrayList.size() > 15) {
                        arrayList.remove(0);
                    }
                    if (arrayList.size() <= 1) {
                        t6kVar.h(max);
                        z6gVar.l = SystemClock.uptimeMillis();
                    } else {
                        int size = arrayList.size();
                        float[] fArr = new float[size];
                        for (int i10 = 0; i10 < size; i10++) {
                            float f = i10;
                            int size2 = arrayList.size() - 1;
                            if (size2 < 1) {
                                size2 = 1;
                            }
                            fArr[i10] = ((f / size2) * 0.5f) + 0.5f;
                        }
                        float f2 = 0.0f;
                        for (int i11 = 0; i11 < size; i11++) {
                            f2 += fArr[i11];
                        }
                        Iterator it = arrayList.iterator();
                        float f3 = 0.0f;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i12 = i7 + 1;
                            if (i7 < 0) {
                                u75.n();
                                throw null;
                            }
                            f3 += ((Number) next).floatValue() * fArr[i7];
                            i7 = i12;
                        }
                        if (f2 > 0.0f) {
                            max = f3 / f2;
                        }
                        t6kVar.h(max);
                        z6gVar.l = SystemClock.uptimeMillis();
                    }
                }
                return Unit.a;
            case 2:
                a7g a7gVar = (a7g) obj6;
                aqi aqiVar = (aqi) obj4;
                ((Long) obj).getClass();
                long uptimeMillis2 = SystemClock.uptimeMillis();
                float max2 = Math.max(Math.max(a7gVar.b(((Number) ((aqi) obj3).getValue()).floatValue(), uptimeMillis2, ((Number) ((aqi) obj2).getValue()).longValue(), ((Boolean) aqiVar.getValue()).booleanValue()), ((Number) ((aqi) obj5).getValue()).floatValue()), a7gVar.b.e());
                if (uptimeMillis2 - a7gVar.l > 2000) {
                    a7gVar.a(max2);
                } else {
                    t6k t6kVar2 = a7gVar.a;
                    ArrayList arrayList2 = a7gVar.c;
                    arrayList2.add(Float.valueOf(max2));
                    if (arrayList2.size() > 15) {
                        arrayList2.remove(0);
                    }
                    if (arrayList2.size() <= 1) {
                        t6kVar2.h(max2);
                        a7gVar.l = SystemClock.uptimeMillis();
                    } else {
                        int size3 = arrayList2.size();
                        float[] fArr2 = new float[size3];
                        for (int i13 = 0; i13 < size3; i13++) {
                            float f4 = i13;
                            int size4 = arrayList2.size() - 1;
                            if (size4 < 1) {
                                size4 = 1;
                            }
                            fArr2[i13] = ((f4 / size4) * 0.5f) + 0.5f;
                        }
                        float f5 = 0.0f;
                        for (int i14 = 0; i14 < size3; i14++) {
                            f5 += fArr2[i14];
                        }
                        Iterator it2 = arrayList2.iterator();
                        float f6 = 0.0f;
                        while (it2.hasNext()) {
                            Object next2 = it2.next();
                            int i15 = i7 + 1;
                            if (i7 < 0) {
                                u75.n();
                                throw null;
                            }
                            f6 += ((Number) next2).floatValue() * fArr2[i7];
                            i7 = i15;
                        }
                        if (f5 > 0.0f) {
                            max2 = f6 / f5;
                        }
                        t6kVar2.h(max2);
                        a7gVar.l = SystemClock.uptimeMillis();
                    }
                }
                return Unit.a;
            case 3:
                l5j l5jVar = (l5j) obj5;
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.q(jfpVar, 0);
                wfp.s(jfpVar, (String) obj6);
                wfp.u(jfpVar, new mn0(l5jVar.j));
                wfp.h(jfpVar, new d1j(i8, (bc5) obj3));
                jfpVar.o(hfp.c, new sa(null, new q4j((i5j) obj2, l5jVar, 0)));
                wfp.l(jfpVar, (List) obj4);
                return Unit.a;
            case 4:
                Function0 function0 = (Function0) obj6;
                Function0 function02 = (Function0) obj5;
                Function0 function03 = (Function0) obj4;
                Function0 function04 = (Function0) obj3;
                Function0 function05 = (Function0) obj2;
                kyf kyfVar = (kyf) obj;
                kyfVar.getClass();
                switch (hqj.a[kyfVar.ordinal()]) {
                    case 1:
                    case 7:
                        break;
                    case 2:
                        if (function0 != null) {
                            function0.invoke();
                            break;
                        }
                        break;
                    case 3:
                        if (function02 != null) {
                            function02.invoke();
                            break;
                        }
                        break;
                    case 4:
                        if (function03 != null) {
                            function03.invoke();
                            break;
                        }
                        break;
                    case 5:
                        if (function04 != null) {
                            function04.invoke();
                            break;
                        }
                        break;
                    case 6:
                        if (function05 != null) {
                            function05.invoke();
                            break;
                        }
                        break;
                    default:
                        b6e.s();
                        return null;
                }
                return Unit.a;
            case 5:
                ((l13) obj).getClass();
                return new g2q((tf6) obj6, (frt) obj5, (qec) obj4, (ehv) obj3, (wt5) obj2);
            case 6:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(dst.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                rp7Var.C((dst) obj6);
                o18Var.c = hag.I(i5h.class);
                rp7Var.getClass();
                rp7Var.C((i5h) obj5);
                o18Var.c = hag.I(xnk.class);
                rp7Var.getClass();
                rp7Var.C((xnk) obj4);
                o18Var.c = hag.I(o3t.class);
                rp7Var.getClass();
                rp7Var.C((o3t) obj3);
                o18Var.c = hag.I(sca.class);
                rp7Var.getClass();
                rp7Var.E(new qnk(9));
                o18Var.c = hag.I(oga.class);
                rp7Var.getClass();
                rp7Var.E(new qnk(16));
                o18Var.c = hag.I(eka.class);
                rp7Var.getClass();
                rp7Var.E(new qnk(i9));
                o18Var.c = hag.I(et.class);
                rp7Var.getClass();
                rp7Var.E(new qnk(i5));
                o18Var.c = hag.I(p51.class);
                rp7Var.getClass();
                rp7Var.E(new qnk(i8));
                o18Var.c = hag.I(rus.class);
                rp7Var.getClass();
                rp7Var.E(new qnk(i4));
                o18Var.c = hag.I(b4m.class);
                rp7Var.getClass();
                rp7Var.E(new qnk(i3));
                o18Var.c = hag.I(i2m.class);
                rp7Var.getClass();
                rp7Var.E(new qnk(6));
                o18Var.c = hag.I(rtl.class);
                rp7Var.getClass();
                rp7Var.E(new qnk(7));
                o18Var.c = hag.I(fnk.class);
                rp7Var.getClass();
                rp7Var.E(new qnk(8));
                o18Var.c = hag.I(fkm.class);
                rp7Var.getClass();
                rp7Var.E(new qnk(10));
                o18Var.c = hag.I(xtl.class);
                rp7Var.getClass();
                int i16 = 13;
                rp7Var.E(new s8i(i16, (m88) obj2));
                o18Var.c = hag.I(p3u.class);
                rp7Var.getClass();
                rp7Var.E(new qnk(11));
                o18Var.c = hag.I(vkm.class);
                rp7Var.getClass();
                rp7Var.E(new qnk(12));
                o18Var.c = hag.I(uys.class);
                rp7Var.getClass();
                rp7Var.E(new qnk(i16));
                o18Var.c = hag.I(e1g.class);
                rp7Var.getClass();
                rp7Var.E(new qnk(i2));
                o18Var.c = hag.I(wnk.class);
                rp7Var.getClass();
                rp7Var.E(new qnk(i6));
                return Unit.a;
            case 7:
                p4r p4rVar = (p4r) obj6;
                osu osuVar = (osu) obj5;
                osu osuVar2 = (osu) obj4;
                float[] fArr3 = (float[]) obj3;
                float[] fArr4 = (float[]) obj2;
                float floatValue = ((Float) obj).floatValue();
                int intValue = ix0.a(floatValue, Integer.valueOf(osuVar.a), Integer.valueOf(osuVar2.a)).intValue();
                p4rVar.r = intValue;
                float[] fArr5 = p4rVar.A;
                p4r.g(intValue, 15, fArr5);
                int intValue2 = ix0.a(floatValue, Integer.valueOf(osuVar.b), Integer.valueOf(osuVar2.b)).intValue();
                p4rVar.s = intValue2;
                p4r.g(intValue2, 6, fArr5);
                int intValue3 = ix0.a(floatValue, Integer.valueOf(osuVar.c), Integer.valueOf(osuVar2.c)).intValue();
                p4rVar.t = intValue3;
                p4r.g(intValue3, 12, fArr5);
                int intValue4 = ix0.a(floatValue, Integer.valueOf(osuVar.d), Integer.valueOf(osuVar2.d)).intValue();
                p4rVar.u = intValue4;
                p4r.g(intValue4, 3, fArr5);
                int intValue5 = ix0.a(floatValue, Integer.valueOf(osuVar.e), Integer.valueOf(osuVar2.e)).intValue();
                p4rVar.v = intValue5;
                p4r.g(intValue5, 9, fArr5);
                int intValue6 = ix0.a(floatValue, Integer.valueOf(osuVar.f), Integer.valueOf(osuVar2.f)).intValue();
                p4rVar.w = intValue6;
                p4r.g(intValue6, 0, fArr5);
                while (i7 < 3) {
                    p4rVar.e[i7] = wxf.C(fArr3[i7], fArr4[i7], floatValue);
                    i7++;
                }
                p4rVar.h();
                return Unit.a;
            case 8:
                css cssVar = (css) obj6;
                Long l = (Long) obj5;
                zvs zvsVar = (zvs) obj4;
                o5n o5nVar = (o5n) obj3;
                thr thrVar = (thr) obj2;
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                D0 = xjoVar.D0("UPDATE tracks_cache SET cache_type = ?, added_timestamp = coalesce(?, added_timestamp) WHERE track_id = ? AND quality = ? AND storage = ?");
                try {
                    D0.E(1, c9g.U(cssVar));
                    if (l == null) {
                        D0.bindNull(2);
                    } else {
                        D0.bindLong(2, l.longValue());
                    }
                    zvsVar.getClass();
                    D0.E(3, zvsVar.a);
                    D0.E(4, c9g.S(o5nVar));
                    D0.E(5, c9g.T(thrVar));
                    D0.q();
                    D0.close();
                    return Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            case 9:
                String str = (String) obj6;
                bb6 bb6Var = (bb6) obj5;
                zvs zvsVar2 = (zvs) obj4;
                o5n o5nVar2 = (o5n) obj3;
                thr thrVar2 = (thr) obj2;
                xjo xjoVar2 = (xjo) obj;
                xjoVar2.getClass();
                D0 = xjoVar2.D0("UPDATE tracks_cache SET uri = ?, container = ? WHERE track_id = ? AND quality = ? AND storage = ?");
                try {
                    D0.E(1, str);
                    D0.E(2, c9g.R(bb6Var));
                    zvsVar2.getClass();
                    D0.E(3, zvsVar2.a);
                    D0.E(4, c9g.S(o5nVar2));
                    D0.E(5, c9g.T(thrVar2));
                    D0.q();
                    D0.close();
                    return Unit.a;
                } finally {
                    D0.close();
                }
            case 10:
                List list = (List) obj6;
                vuf vufVar = (vuf) obj;
                vufVar.getClass();
                vufVar.Z(list.size(), null, new zcf(list, 18), new wn5(new wv(list, (l5t) obj5, (h5t) obj4, (ynn) obj3, (aqi) obj2, 1), -1091073711, true));
                return Unit.a;
            case 11:
                fjt fjtVar = (fjt) obj6;
                String str2 = (String) obj5;
                ynn ynnVar = (ynn) obj4;
                njt njtVar = (njt) obj3;
                d9g d9gVar = (d9g) obj2;
                vuf vufVar2 = (vuf) obj;
                vufVar2.getClass();
                if (fjtVar instanceof ejt) {
                    if (str2 != null && str2.length() != 0) {
                        vuf.Y(vufVar2, null, new wn5(new mf3(str2, i2), 346786602, true), 3);
                    }
                    Iterator it3 = ((ejt) fjtVar).a.iterator();
                    while (true) {
                        int i17 = i7;
                        if (it3.hasNext()) {
                            Object next3 = it3.next();
                            i7 = i17 + 1;
                            if (i17 < 0) {
                                u75.n();
                                throw null;
                            }
                            vuf.Y(vufVar2, null, new wn5(new n2g(ynnVar, njtVar, i17, (yit) next3, 3), -121466222, true), 3);
                        }
                    }
                } else {
                    if (!(fjtVar instanceof djt)) {
                        b6e.s();
                        return null;
                    }
                    while (i7 < 100) {
                        vuf.Y(vufVar2, null, new wn5(new f6p(i6, d9gVar, fjtVar), 889981134, true), 3);
                        i7++;
                    }
                }
                return Unit.a;
            case 12:
                xsv xsvVar = (xsv) obj6;
                String str3 = (String) obj5;
                String str4 = (String) obj4;
                String str5 = (String) obj3;
                Function0 function06 = (Function0) obj2;
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                if (xsvVar.b instanceof vsv) {
                    wfp.g(jfpVar2);
                }
                wfp.q(jfpVar2, 0);
                wfp.k(jfpVar2, xsvVar.a.c);
                wfp.s(jfpVar2, str3 + ". " + str4 + ".");
                wfp.l(jfpVar2, t75.c(new nw6(str5, new gct(19, function06))));
                return Unit.a;
            case 13:
                p pVar = (p) obj;
                pVar.getClass();
                pVar.J("/1/bundle/auth/password/multi_step/magic_link/commit/");
                pVar.F("Ya-Consumer-Authorization", "OAuth ".concat((String) obj6));
                pVar.P((Map) obj5);
                pVar.S("track_id", (String) obj4);
                pVar.S("language", (String) obj3);
                pVar.S("secret", (String) obj2);
                return Unit.a;
            case 14:
                Function0 function07 = (Function0) obj5;
                Function1 function1 = (Function1) obj2;
                Function0 function08 = (Function0) obj4;
                aqi aqiVar2 = (aqi) obj3;
                int ordinal = ((r0) obj6).ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    function07.invoke();
                } else if (ordinal == 2) {
                    function1.invoke(d.b);
                } else if (ordinal == 3) {
                    function1.invoke(d.c);
                } else {
                    if (ordinal != 4) {
                        b6e.s();
                        return null;
                    }
                    function08.invoke();
                }
                aqiVar2.setValue(Boolean.FALSE);
                return Unit.a;
            case 15:
                Function1 function12 = (Function1) obj2;
                Function1 function13 = (Function1) obj6;
                Function1 function14 = (Function1) obj5;
                aqi aqiVar3 = (aqi) obj4;
                aqi aqiVar4 = (aqi) obj3;
                h hVar = (h) obj;
                hVar.getClass();
                if (hVar instanceof c) {
                    function12.invoke(((c) hVar).a);
                } else if (hVar instanceof e) {
                    function13.invoke(new b(((e) hVar).a));
                } else if (hVar instanceof f) {
                    aqiVar4.setValue(((f) hVar).a);
                } else if (hVar instanceof g) {
                    function14.invoke(((g) hVar).a);
                } else {
                    if (!(hVar instanceof com.yandex.passport.internal.ui.challenge.webview.d)) {
                        b6e.s();
                        return null;
                    }
                    aqiVar3.setValue(Boolean.TRUE);
                }
                return Unit.a;
            case 16:
                k kVar = (k) obj;
                kVar.getClass();
                ((r90) obj6).invoke(new vx4((com.yandex.plus.acquisition.sdk.pay.impl.b) obj5, kVar, (com.yandex.plus.acquisition.sdk.pay.common.api.a) obj4, (Map) obj3, (com.yandex.plus.acquisition.adapter.internal.controller.a) obj2, null, 5));
                return Unit.a;
            case 17:
                com.yandex.plus.home.feature.panel.internal.sections.a aVar = (com.yandex.plus.home.feature.panel.internal.sections.a) obj6;
                i iVar = (i) obj5;
                b0 b0Var = (b0) obj4;
                com.yandex.plus.home.repository.api.model.panel.g gVar = (com.yandex.plus.home.repository.api.model.panel.g) obj3;
                n nVar = (n) obj2;
                d0 d0Var = (d0) obj;
                int i18 = com.yandex.plus.home.feature.panel.internal.sections.a.E0;
                d0Var.getClass();
                com.yandex.plus.log.api.b bVar = aVar.x0;
                com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.b;
                if (bVar.b(aVar2)) {
                    bVar.c(aVar2, "PlusPanelDailySectionView", "shortcut clicked " + gVar);
                }
                com.yandex.plus.home.feature.panel.internalapi.analytics.a u = aVar.u(nVar);
                com.yandex.plus.home.feature.panel.internalapi.analytics.g gVar2 = com.yandex.plus.home.feature.panel.internalapi.analytics.g.b;
                iVar.getClass();
                b0Var.getClass();
                String str6 = iVar.a;
                String str7 = iVar.b;
                String str8 = b0Var.a;
                String str9 = b0Var.b;
                String id = gVar.getId();
                String name = gVar.getName();
                if (u == null) {
                    jyr jyrVar = com.yandex.plus.home.feature.panel.internalapi.analytics.a.e;
                    u = r1.o();
                }
                aVar.z0.invoke(new com.yandex.plus.home.feature.panel.internalapi.analytics.d(str6, str7, str8, str9, id, name, u, d0Var.e, gVar2, d0Var.c));
                aVar.y0.invoke(d0Var);
                return Unit.a;
            default:
                com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.acquisition.controllers.c cVar = (com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.acquisition.controllers.c) obj6;
                wxm wxmVar = (wxm) obj5;
                o oVar = (o) obj4;
                com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar3 = (com.yandex.plus.home.plaque.plugin.internal.proxy.a) obj3;
                y yVar = (y) obj2;
                Function1 function15 = (Function1) obj;
                function15.getClass();
                rar rarVar = cVar.c;
                if (rarVar != null && rarVar.b()) {
                    return Unit.a;
                }
                cVar.c = x97.y((mm6) wxmVar.get(), null, null, new inr(function15, cVar, oVar, aVar3, yVar, null, 25), 3);
                return Unit.a;
        }
    }

    public /* synthetic */ r90(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public /* synthetic */ r90(Function1 function1, Function1 function12, Function1 function13, aqi aqiVar, aqi aqiVar2) {
        this.a = 15;
        this.f = function1;
        this.b = function12;
        this.c = function13;
        this.d = aqiVar;
        this.e = aqiVar2;
    }
}
