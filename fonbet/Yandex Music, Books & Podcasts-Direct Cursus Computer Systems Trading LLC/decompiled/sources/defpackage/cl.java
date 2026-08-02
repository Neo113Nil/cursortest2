package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.lazy.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.music.core.ui.compose.b;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class cl extends uif implements ryc {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cl(int i, Object obj, Object obj2) {
        super(4);
        this.r = i;
        this.s = obj;
        this.t = obj2;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        a aVar = (a) obj;
        int intValue = ((Number) obj2).intValue();
        hq5 hq5Var = (hq5) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((oq5) hq5Var).f(aVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((oq5) hq5Var).d(intValue) ? 32 : 16;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(i & 1, (i & 147) != 146)) {
            gdj gdjVar = (gdj) ((List) this.s).get(intValue);
            oq5Var.Z(-1720996513);
            raj rajVar = gdjVar.b;
            xha xhaVar = (xha) this.t;
            mqs mqsVar = gdjVar.a;
            xhaVar.getClass();
            Object K = oq5Var.K();
            Object obj5 = gq5.a;
            if (K == obj5) {
                K = gld.R(g.a, oq5Var);
                oq5Var.k0(K);
            }
            mm6 mm6Var = (mm6) K;
            Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
            boolean f = oq5Var.f(mqsVar) | oq5Var.f(context);
            Object K2 = oq5Var.K();
            if (f || K2 == obj5) {
                context.getClass();
                mm6Var.getClass();
                dg4 dg4Var = new dg4(xhaVar, intValue, 3);
                l18 l18Var = l18.b;
                bdt I = hag.I(fdj.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                Object ydjVar = new ydj((fdj) qdcVar.C(I), mqsVar, false, mm6Var, context, dg4Var, null);
                oq5Var.k0(ydjVar);
                K2 = ydjVar;
            }
            o5g.d(rajVar, (wdj) K2, b.b(androidx.compose.ui.platform.a.a(vci.a, "downloaded_episode"), intValue), oq5Var, 0);
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        a aVar = (a) obj;
        int intValue = ((Number) obj2).intValue();
        hq5 hq5Var = (hq5) obj3;
        int intValue2 = ((Number) obj4).intValue();
        Object obj5 = (cdf) this.t;
        if ((intValue2 & 6) == 0) {
            i = (((oq5) hq5Var).f(aVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((oq5) hq5Var).d(intValue) ? 32 : 16;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(i & 1, (i & 147) != 146)) {
            e9j e9jVar = (e9j) ((List) this.s).get(intValue);
            oq5Var.Z(-525202639);
            e9g e9gVar = e9g.a;
            kbj kbjVar = e9jVar.b;
            yci b = b.b(androidx.compose.ui.platform.a.a(a.a(aVar, vci.a), "collection_kids_album"), intValue);
            boolean h = oq5Var.h(obj5) | oq5Var.h(e9jVar);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new uv(10, obj5, e9jVar);
                oq5Var.k0(K);
            }
            p6g.d(kbjVar, (Function0) K, b, 0L, null, null, false, null, e9gVar, oq5Var, 100663296, 248);
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        a aVar = (a) obj;
        int intValue = ((Number) obj2).intValue();
        hq5 hq5Var = (hq5) obj3;
        int intValue2 = ((Number) obj4).intValue();
        Object obj5 = (bdf) this.t;
        if ((intValue2 & 6) == 0) {
            i = (((oq5) hq5Var).f(aVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((oq5) hq5Var).d(intValue) ? 32 : 16;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(i & 1, (i & 147) != 146)) {
            d9j d9jVar = (d9j) ((List) this.s).get(intValue);
            oq5Var.Z(-1230632043);
            e9g e9gVar = e9g.a;
            kbj kbjVar = d9jVar.b;
            yci b = b.b(androidx.compose.ui.platform.a.a(a.a(aVar, vci.a), "album_item"), intValue);
            boolean h = oq5Var.h(obj5) | oq5Var.h(d9jVar);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new uv(9, obj5, d9jVar);
                oq5Var.k0(K);
            }
            p6g.d(kbjVar, (Function0) K, b, 0L, null, null, false, null, e9gVar, oq5Var, 100663296, 248);
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        a aVar = (a) obj;
        int intValue = ((Number) obj2).intValue();
        hq5 hq5Var = (hq5) obj3;
        int intValue2 = ((Number) obj4).intValue();
        aff affVar = (aff) this.t;
        if ((intValue2 & 6) == 0) {
            i = (((oq5) hq5Var).f(aVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((oq5) hq5Var).d(intValue) ? 32 : 16;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(i & 1, (i & 147) != 146)) {
            rvl rvlVar = (rvl) ((ArrayList) this.s).get(intValue);
            oq5Var.Z(696774282);
            lwl lwlVar = rvlVar.a;
            yci b = b.b(androidx.compose.ui.platform.a.a(a.a(aVar, vci.a), "collection_kids_playlist"), intValue);
            boolean h = oq5Var.h(affVar) | oq5Var.h(rvlVar);
            Object K = oq5Var.K();
            Object obj5 = gq5.a;
            if (h || K == obj5) {
                K = new xef(affVar, rvlVar, 0);
                oq5Var.k0(K);
            }
            Function0 function0 = (Function0) K;
            boolean h2 = oq5Var.h(affVar) | oq5Var.h(rvlVar);
            Object K2 = oq5Var.K();
            if (h2 || K2 == obj5) {
                K2 = new xef(affVar, rvlVar, 1);
                oq5Var.k0(K2);
            }
            wyf.h(lwlVar, function0, b, 0L, null, null, null, (Function0) K2, oq5Var, 0, 120);
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        a aVar = (a) obj;
        int intValue = ((Number) obj2).intValue();
        hq5 hq5Var = (hq5) obj3;
        int intValue2 = ((Number) obj4).intValue();
        zef zefVar = (zef) this.t;
        if ((intValue2 & 6) == 0) {
            i = (((oq5) hq5Var).f(aVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((oq5) hq5Var).d(intValue) ? 32 : 16;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(i & 1, (i & 147) != 146)) {
            qvl qvlVar = (qvl) ((ArrayList) this.s).get(intValue);
            oq5Var.Z(-622751210);
            lwl lwlVar = qvlVar.a;
            yci b = b.b(androidx.compose.ui.platform.a.a(a.a(aVar, vci.a), "playlist_item"), intValue);
            boolean h = oq5Var.h(zefVar) | oq5Var.h(qvlVar);
            Object K = oq5Var.K();
            Object obj5 = gq5.a;
            if (h || K == obj5) {
                K = new wef(zefVar, qvlVar, 0);
                oq5Var.k0(K);
            }
            Function0 function0 = (Function0) K;
            boolean h2 = oq5Var.h(zefVar) | oq5Var.h(qvlVar);
            Object K2 = oq5Var.K();
            if (h2 || K2 == obj5) {
                K2 = new wef(zefVar, qvlVar, 1);
                oq5Var.k0(K2);
            }
            wyf.h(lwlVar, function0, b, 0L, null, null, null, (Function0) K2, oq5Var, 0, 120);
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        a aVar = (a) obj;
        int intValue = ((Number) obj2).intValue();
        hq5 hq5Var = (hq5) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((oq5) hq5Var).f(aVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((oq5) hq5Var).d(intValue) ? 32 : 16;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(i & 1, (i & 147) != 146)) {
            c2t c2tVar = (c2t) ((List) this.s).get(intValue);
            oq5Var.Z(-1969577414);
            po6 po6Var = c2tVar.b;
            r5h r5hVar = (r5h) this.t;
            mqs mqsVar = c2tVar.a;
            r5hVar.getClass();
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = gld.R(g.a, oq5Var);
                oq5Var.k0(K);
            }
            mm6 mm6Var = (mm6) K;
            Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
            boolean f = oq5Var.f(mqsVar) | oq5Var.f(context);
            Object K2 = oq5Var.K();
            if (f || K2 == kjnVar) {
                context.getClass();
                mm6Var.getClass();
                K2 = up6.C(mm6Var, mqsVar, context, new dg4(r5hVar, intValue, 4), false);
                oq5Var.k0(K2);
            }
            vut.i(po6Var, (bg5) K2, androidx.compose.ui.platform.a.a(vci.a, "track_item"), oq5Var, 384);
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        kjn kjnVar;
        a aVar = (a) obj;
        int intValue = ((Number) obj2).intValue();
        hq5 hq5Var = (hq5) obj3;
        int intValue2 = ((Number) obj4).intValue();
        kii kiiVar = (kii) this.t;
        if ((intValue2 & 6) == 0) {
            i = (((oq5) hq5Var).f(aVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((oq5) hq5Var).d(intValue) ? 32 : 16;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(i & 1, (i & 147) != 146)) {
            tf3 tf3Var = (tf3) ((List) this.s).get(intValue);
            oq5Var.Z(1442636035);
            Object K = oq5Var.K();
            kjn kjnVar2 = gq5.a;
            if (K == kjnVar2) {
                K = vq2.a(1.0f);
                oq5Var.k0(K);
            }
            fk0 fk0Var = (fk0) K;
            boolean h = oq5Var.h(kiiVar);
            Object K2 = oq5Var.K();
            if (h || K2 == kjnVar2) {
                kjnVar = kjnVar2;
                kef kefVar = new kef(1, kiiVar, kii.class, "onTabClicked", "onTabClicked(Lcom/yandex/music/design/components/bottomtabs/BottomTab;)V", 0, 13);
                oq5Var.k0(kefVar);
                K2 = kefVar;
            } else {
                kjnVar = kjnVar2;
            }
            h9f h9fVar = (h9f) K2;
            boolean z = (((i & 112) ^ 48) > 32 && oq5Var.d(intValue)) || (i & 48) == 32;
            Object K3 = oq5Var.K();
            if (z || K3 == kjnVar) {
                K3 = new iii(intValue, 0);
                oq5Var.k0(K3);
            }
            yci a = a.a(aVar, nfp.b(vci.a, false, (Function1) K3));
            boolean h2 = oq5Var.h(fk0Var);
            Object K4 = oq5Var.K();
            if (h2 || K4 == kjnVar) {
                K4 = new dgh(1, fk0Var);
                oq5Var.k0(K4);
            }
            vq1.b(tf3Var, (Function1) h9fVar, new sf3(((Boolean) oq5Var.j((agr) clg.d.c)).booleanValue(), ((Boolean) oq5Var.j((agr) dlg.d.c)).booleanValue(), ((Boolean) kiiVar.o.getValue()).booleanValue()), androidx.compose.ui.graphics.a.a(a, (Function1) K4), oq5Var, 0);
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        a aVar = (a) obj;
        int intValue = ((Number) obj2).intValue();
        hq5 hq5Var = (hq5) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((oq5) hq5Var).f(aVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((oq5) hq5Var).d(intValue) ? 32 : 16;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(i & 1, (i & 147) != 146)) {
            eti etiVar = (eti) ((List) this.s).get(intValue);
            oq5Var.Z(-1525722654);
            asq.e(etiVar, intValue, ((vti) this.t).e, o70.Liked, androidx.compose.ui.platform.a.a(vci.a, "my_shelf_liked_item"), oq5Var, 27648 | (i & 112));
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        a aVar = (a) obj;
        int intValue = ((Number) obj2).intValue();
        hq5 hq5Var = (hq5) obj3;
        int intValue2 = ((Number) obj4).intValue();
        Object obj5 = (l9j) this.t;
        if ((intValue2 & 6) == 0) {
            i = (((oq5) hq5Var).f(aVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((oq5) hq5Var).d(intValue) ? 32 : 16;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(i & 1, (i & 147) != 146)) {
            x9j x9jVar = (x9j) ((ArrayList) this.s).get(intValue);
            oq5Var.Z(1277851895);
            kbj kbjVar = x9jVar.a;
            yci b = b.b(androidx.compose.ui.platform.a.a(a.a(aVar, vci.a), "collection_non_music_albums_item"), intValue);
            boolean h = oq5Var.h(obj5) | oq5Var.f(x9jVar);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new uv(11, obj5, x9jVar);
                oq5Var.k0(K);
            }
            p6g.d(kbjVar, (Function0) K, b, 0L, null, null, true, null, null, oq5Var, ScreenMirroringConfig.Video.BITRATE_1_5MB, 440);
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        a aVar = (a) obj;
        int intValue = ((Number) obj2).intValue();
        hq5 hq5Var = (hq5) obj3;
        int intValue2 = ((Number) obj4).intValue();
        Object obj5 = (eha) this.t;
        if ((intValue2 & 6) == 0) {
            i = (((oq5) hq5Var).f(aVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((oq5) hq5Var).d(intValue) ? 32 : 16;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(i & 1, (i & 147) != 146)) {
            ewl ewlVar = (ewl) ((ArrayList) this.s).get(intValue);
            oq5Var.Z(1910409041);
            yci b = b.b(androidx.compose.ui.platform.a.a(a.a(aVar, vci.a), "playlist_list_content_tab_item"), intValue);
            lwl lwlVar = ewlVar.a;
            boolean h = oq5Var.h(obj5) | oq5Var.f(ewlVar);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new uv(13, obj5, ewlVar);
                oq5Var.k0(K);
            }
            wyf.h(lwlVar, (Function0) K, b, 0L, null, null, null, null, oq5Var, 0, 248);
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        a aVar = (a) obj;
        int intValue = ((Number) obj2).intValue();
        hq5 hq5Var = (hq5) obj3;
        int intValue2 = ((Number) obj4).intValue();
        Object obj5 = (sem) this.t;
        if ((intValue2 & 6) == 0) {
            i = (((oq5) hq5Var).f(aVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((oq5) hq5Var).d(intValue) ? 32 : 16;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(i & 1, (i & 147) != 146)) {
            d9j d9jVar = (d9j) ((List) this.s).get(intValue);
            oq5Var.Z(-768244658);
            e9g e9gVar = e9g.a;
            kbj kbjVar = d9jVar.b;
            yci b = b.b(androidx.compose.ui.platform.a.a(a.a(aVar, vci.a), "podcast_item"), intValue);
            boolean h = oq5Var.h(obj5) | oq5Var.h(d9jVar);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new uv(15, obj5, d9jVar);
                oq5Var.k0(K);
            }
            p6g.d(kbjVar, (Function0) K, b, 0L, null, null, false, null, e9gVar, oq5Var, 100663296, 248);
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object r(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        a aVar = (a) obj;
        int intValue = ((Number) obj2).intValue();
        hq5 hq5Var = (hq5) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((oq5) hq5Var).f(aVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((oq5) hq5Var).d(intValue) ? 32 : 16;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(i & 1, (i & 147) != 146)) {
            y7p y7pVar = (y7p) ((List) this.s).get(intValue);
            oq5Var.Z(-1903087645);
            y5g.k(y7pVar, (s2p) this.t, intValue, null, oq5Var, ((i & 126) << 3) & 896, 8);
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object s(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        a aVar = (a) obj;
        int intValue = ((Number) obj2).intValue();
        hq5 hq5Var = (hq5) obj3;
        int intValue2 = ((Number) obj4).intValue();
        sdr sdrVar = (sdr) this.t;
        if ((intValue2 & 6) == 0) {
            i = (((oq5) hq5Var).f(aVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((oq5) hq5Var).d(intValue) ? 32 : 16;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(i & 1, (i & 147) != 146)) {
            oq5Var.Z(-552467229);
            boolean z = intValue == 1;
            boolean f = oq5Var.f(sdrVar);
            Object K = oq5Var.K();
            if (f || K == gq5.a) {
                K = new oj2(sdrVar, 4);
                oq5Var.k0(K);
            }
            ug3.a(androidx.compose.foundation.a.b(xp3.u(androidx.compose.foundation.layout.a.n(d.e(d.d(wyf.s(vci.a, (Function0) K), 1.0f), 318), z ? 0 : 8, 4), ugo.a(z ? 16 : 10)), d85.b(d85.f, 0.1f, 0.0f, 0.0f, 0.0f, 14), vnj.i), oq5Var, 0);
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        a aVar = (a) obj;
        int intValue = ((Number) obj2).intValue();
        hq5 hq5Var = (hq5) obj3;
        int intValue2 = ((Number) obj4).intValue();
        nru nruVar = (nru) this.t;
        if ((intValue2 & 6) == 0) {
            i = (((oq5) hq5Var).f(aVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((oq5) hq5Var).d(intValue) ? 32 : 16;
        }
        if ((i & 147) == 146) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        hsu hsuVar = (hsu) ((List) this.s).get(intValue);
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.Z(-649376466);
        hsuVar.getClass();
        wn5 wn5Var = !(hsuVar instanceof gsu) ? ild.d : null;
        oq5Var2.Z(1087527114);
        yci yciVar = vci.a;
        yci d = d.d(yciVar, 1.0f);
        int i2 = (i & 112) ^ 48;
        boolean h = oq5Var2.h(nruVar) | oq5Var2.h(hsuVar) | ((i2 > 32 && oq5Var2.d(intValue)) || (i & 48) == 32);
        Object K = oq5Var2.K();
        kjn kjnVar = gq5.a;
        if (h || K == kjnVar) {
            K = new h25(nruVar, hsuVar, intValue, 1);
            oq5Var2.k0(K);
        }
        yci b = com.yandex.music.core.ui.compose.a.b(d, null, 0L, 0.0f, null, (Function2) K, 15);
        if (neg.x(hsuVar)) {
            yciVar = androidx.compose.foundation.a.b(yciVar, ((dq0) oq5Var2.j(eq0.a)).c.c, vnj.i);
        }
        yci f = b.f(yciVar);
        oq5Var2.p(false);
        wn5 C = ild.C(-784962646, new xru(hsuVar, 0), oq5Var2);
        wn5 C2 = ild.C(-766535893, new xru(hsuVar, 1), oq5Var2);
        wn5 C3 = ild.C(-748109140, new xru(hsuVar, 2), oq5Var2);
        boolean h2 = ((i2 > 32 && oq5Var2.d(intValue)) || (i & 48) == 32) | oq5Var2.h(nruVar) | oq5Var2.h(hsuVar);
        Object K2 = oq5Var2.K();
        if (h2 || K2 == kjnVar) {
            K2 = new i25(nruVar, hsuVar, intValue, 2);
            oq5Var2.k0(K2);
        }
        Function0 function0 = (Function0) K2;
        boolean h3 = oq5Var2.h(nruVar) | oq5Var2.h(hsuVar);
        Object K3 = oq5Var2.K();
        if (h3 || K3 == kjnVar) {
            K3 = new uv(16, nruVar, hsuVar);
            oq5Var2.k0(K3);
        }
        lsq.i(C, C2, C3, function0, f, wn5Var, (Function0) K3, oq5Var2, 438, 0);
        oq5Var2.p(false);
        return Unit.a;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        bc5 bc5Var;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        switch (this.r) {
            case 0:
                il ilVar = (il) this.t;
                a aVar = (a) obj;
                int intValue = ((Number) obj2).intValue();
                hq5 hq5Var = (hq5) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = (((oq5) hq5Var).f(aVar) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= ((oq5) hq5Var).d(intValue) ? 32 : 16;
                }
                if ((i & 147) == 146) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                bxl bxlVar = (bxl) ((List) this.s).get(intValue);
                oq5 oq5Var2 = (oq5) hq5Var;
                oq5Var2.Z(169181858);
                boolean h = oq5Var2.h(ilVar);
                Object K = oq5Var2.K();
                if (h || K == gq5.a) {
                    m5 m5Var = new m5(1, ilVar, il.class, "onToggle", "onToggle(Lcom/yandex/music/shared/addtoplaylist/bottomsheet/api/PlaylistRowUiData;)V", 0, 5);
                    oq5Var2.k0(m5Var);
                    K = m5Var;
                }
                j66.A(bxlVar, (Function1) ((h9f) K), oq5Var2, 0);
                oq5Var2.p(false);
                return Unit.a;
            case 1:
                a aVar2 = (a) obj;
                int intValue3 = ((Number) obj2).intValue();
                hq5 hq5Var2 = (hq5) obj3;
                int intValue4 = ((Number) obj4).intValue();
                Object obj5 = (v40) this.t;
                if ((intValue4 & 6) == 0) {
                    i2 = (((oq5) hq5Var2).f(aVar2) ? 4 : 2) | intValue4;
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= ((oq5) hq5Var2).d(intValue3) ? 32 : 16;
                }
                oq5 oq5Var3 = (oq5) hq5Var2;
                if (oq5Var3.P(i2 & 1, (i2 & 147) != 146)) {
                    d9j d9jVar = (d9j) ((List) this.s).get(intValue3);
                    oq5Var3.Z(700234449);
                    e9g e9gVar = e9g.a;
                    kbj kbjVar = d9jVar.b;
                    yci b = b.b(androidx.compose.ui.platform.a.a(a.a(aVar2, vci.a), "audiobook_item"), intValue3);
                    boolean h2 = oq5Var3.h(obj5) | oq5Var3.h(d9jVar);
                    Object K2 = oq5Var3.K();
                    if (h2 || K2 == gq5.a) {
                        K2 = new uv(1, obj5, d9jVar);
                        oq5Var3.k0(K2);
                    }
                    p6g.d(kbjVar, (Function0) K2, b, 0L, null, null, false, null, e9gVar, oq5Var3, 100663296, 248);
                    oq5Var3.p(false);
                } else {
                    oq5Var3.S();
                }
                return Unit.a;
            case 2:
                int intValue5 = ((Number) obj).intValue();
                int intValue6 = ((Number) obj2).intValue();
                int intValue7 = ((Number) obj3).intValue();
                int intValue8 = ((Number) obj4).intValue();
                sd0 sd0Var = (sd0) this.s;
                sd0Var.f.set(intValue5, intValue6, intValue7, intValue8);
                sd0Var.a.l(sd0Var.c, ((mpf) this.t).b, sd0Var.f);
                return Unit.a;
            case 3:
                a aVar3 = (a) obj;
                int intValue9 = ((Number) obj2).intValue();
                hq5 hq5Var3 = (hq5) obj3;
                int intValue10 = ((Number) obj4).intValue();
                if ((intValue10 & 6) == 0) {
                    i3 = (((oq5) hq5Var3).f(aVar3) ? 4 : 2) | intValue10;
                } else {
                    i3 = intValue10;
                }
                if ((intValue10 & 48) == 0) {
                    i3 |= ((oq5) hq5Var3).d(intValue9) ? 32 : 16;
                }
                oq5 oq5Var4 = (oq5) hq5Var3;
                if (oq5Var4.P(i3 & 1, (i3 & 147) != 146)) {
                    dn6 dn6Var = (dn6) ((List) this.s).get(intValue9);
                    oq5Var4.Z(1180936904);
                    t71 t71Var = (t71) this.t;
                    oq oqVar = dn6Var.b;
                    t71Var.getClass();
                    Object K3 = oq5Var4.K();
                    kjn kjnVar = gq5.a;
                    if (K3 == kjnVar) {
                        K3 = gld.R(g.a, oq5Var4);
                        oq5Var4.k0(K3);
                    }
                    bc5 h3 = t71Var.h(oqVar, (mm6) K3);
                    yci a = androidx.compose.ui.platform.a.a(vci.a, "familiar_collection_album");
                    ru ruVar = dn6Var.a;
                    boolean f = oq5Var4.f(h3);
                    Object K4 = oq5Var4.K();
                    if (f || K4 == kjnVar) {
                        zy zyVar = new zy(0, h3, bc5.class, "onClick", "onClick()V", 0, 27);
                        bc5Var = h3;
                        oq5Var4.k0(zyVar);
                        K4 = zyVar;
                    } else {
                        bc5Var = h3;
                    }
                    h9f h9fVar = (h9f) K4;
                    boolean f2 = oq5Var4.f(bc5Var);
                    Object K5 = oq5Var4.K();
                    if (f2 || K5 == kjnVar) {
                        zy zyVar2 = new zy(0, bc5Var, bc5.class, "onLongClick", "onLongClick()V", 0, 28);
                        oq5Var4.k0(zyVar2);
                        K5 = zyVar2;
                    }
                    ghh.a(ruVar, (Function0) h9fVar, a, null, null, null, (Function0) ((h9f) K5), oq5Var4, 384, 56);
                    oq5Var4.p(false);
                } else {
                    oq5Var4.S();
                }
                return Unit.a;
            case 4:
                vci vciVar = vci.a;
                a aVar4 = (a) obj;
                int intValue11 = ((Number) obj2).intValue();
                hq5 hq5Var4 = (hq5) obj3;
                int intValue12 = ((Number) obj4).intValue();
                ib1 ib1Var = (ib1) this.t;
                if ((intValue12 & 6) == 0) {
                    i4 = (((oq5) hq5Var4).f(aVar4) ? 4 : 2) | intValue12;
                } else {
                    i4 = intValue12;
                }
                if ((intValue12 & 48) == 0) {
                    i4 |= ((oq5) hq5Var4).d(intValue11) ? 32 : 16;
                }
                oq5 oq5Var5 = (oq5) hq5Var4;
                if (oq5Var5.P(i4 & 1, (i4 & 147) != 146)) {
                    wa1 wa1Var = (wa1) ((ArrayList) this.s).get(intValue11);
                    oq5Var5.Z(-2139455389);
                    c3x.r(wa1Var, oq5Var5, 0);
                    if (wa1Var instanceof ra1) {
                        oq5Var5.Z(-2139372558);
                        bow.a(48, oq5Var5, androidx.compose.foundation.layout.a.o(vciVar, 16, 0.0f, 2), ((ra1) wa1Var).a);
                        oq5Var5.p(false);
                    } else if (wa1Var instanceof sa1) {
                        oq5Var5.Z(-2139126325);
                        n7w.a((sa1) wa1Var, ib1Var, oq5Var5, 0);
                        oq5Var5.p(false);
                    } else if (wa1Var instanceof ta1) {
                        oq5Var5.Z(-2138921136);
                        ksw.g(ib1Var, oq5Var5, 0);
                        oq5Var5.p(false);
                    } else if (wa1Var instanceof ua1) {
                        oq5Var5.Z(-2138752465);
                        u2x.a((ua1) wa1Var, ib1Var, oq5Var5, 0);
                        oq5Var5.p(false);
                    } else {
                        if (!(wa1Var instanceof va1)) {
                            throw vz1.i(oq5Var5, -2147223587, false);
                        }
                        oq5Var5.Z(-2138529730);
                        y2x.b(((va1) wa1Var).a, androidx.compose.foundation.layout.a.o(vciVar, 16, 0.0f, 2), oq5Var5, 48);
                        oq5Var5.p(false);
                    }
                    oq5Var5.p(false);
                } else {
                    oq5Var5.S();
                }
                return Unit.a;
            case 5:
                a aVar5 = (a) obj;
                int intValue13 = ((Number) obj2).intValue();
                hq5 hq5Var5 = (hq5) obj3;
                int intValue14 = ((Number) obj4).intValue();
                kjn kjnVar2 = gq5.a;
                bp1 bp1Var = (bp1) this.t;
                if ((intValue14 & 6) == 0) {
                    i5 = (((oq5) hq5Var5).f(aVar5) ? 4 : 2) | intValue14;
                } else {
                    i5 = intValue14;
                }
                if ((intValue14 & 48) == 0) {
                    i5 |= ((oq5) hq5Var5).d(intValue13) ? 32 : 16;
                }
                if ((i5 & 147) == 146) {
                    oq5 oq5Var6 = (oq5) hq5Var5;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        return Unit.a;
                    }
                }
                so1 so1Var = (so1) ((List) this.s).get(intValue13);
                oq5 oq5Var7 = (oq5) hq5Var5;
                oq5Var7.Z(1969689317);
                boolean h4 = oq5Var7.h(bp1Var) | oq5Var7.h(so1Var);
                Object K6 = oq5Var7.K();
                if (h4 || K6 == kjnVar2) {
                    K6 = new uv(3, bp1Var, so1Var);
                    oq5Var7.k0(K6);
                }
                Function0 function0 = (Function0) K6;
                yci o = androidx.compose.foundation.layout.a.o(d.r(vci.a, zo1.a), 8, 0.0f, 2);
                boolean h5 = oq5Var7.h(bp1Var) | oq5Var7.h(so1Var);
                Object K7 = oq5Var7.K();
                if (h5 || K7 == kjnVar2) {
                    K7 = new yo1(0, bp1Var, so1Var);
                    oq5Var7.k0(K7);
                }
                zo1.d(so1Var, function0, b.b(androidx.compose.ui.platform.a.a(com.yandex.music.core.ui.compose.a.b(o, null, 0L, 0.0f, null, (Function2) K7, 15), "artists_top_item"), intValue13), null, oq5Var7, 0, 8);
                oq5Var7.p(false);
                return Unit.a;
            case 6:
                a aVar6 = (a) obj;
                int intValue15 = ((Number) obj2).intValue();
                hq5 hq5Var6 = (hq5) obj3;
                int intValue16 = ((Number) obj4).intValue();
                if ((intValue16 & 6) == 0) {
                    i6 = (((oq5) hq5Var6).f(aVar6) ? 4 : 2) | intValue16;
                } else {
                    i6 = intValue16;
                }
                if ((intValue16 & 48) == 0) {
                    i6 |= ((oq5) hq5Var6).d(intValue15) ? 32 : 16;
                }
                oq5 oq5Var8 = (oq5) hq5Var6;
                if (oq5Var8.P(i6 & 1, (i6 & 147) != 146)) {
                    ev4 ev4Var = (ev4) ((List) this.s).get(intValue15);
                    oq5Var8.Z(357083375);
                    irf.v(aVar6, ev4Var, intValue15, (tv4) this.t, oq5Var8, (i6 & 14) | (((i6 & 126) << 3) & 896));
                    oq5Var8.p(false);
                } else {
                    oq5Var8.S();
                }
                return Unit.a;
            case 7:
                a aVar7 = (a) obj;
                int intValue17 = ((Number) obj2).intValue();
                hq5 hq5Var7 = (hq5) obj3;
                int intValue18 = ((Number) obj4).intValue();
                Object obj6 = gq5.a;
                Object obj7 = (j25) this.t;
                if ((intValue18 & 6) == 0) {
                    i7 = (((oq5) hq5Var7).f(aVar7) ? 4 : 2) | intValue18;
                } else {
                    i7 = intValue18;
                }
                if ((intValue18 & 48) == 0) {
                    i7 |= ((oq5) hq5Var7).d(intValue17) ? 32 : 16;
                }
                boolean z = true;
                oq5 oq5Var9 = (oq5) hq5Var7;
                if (oq5Var9.P(i7 & 1, (i7 & 147) != 146)) {
                    dwl dwlVar = (dwl) ((List) this.s).get(intValue17);
                    oq5Var9.Z(-2120295924);
                    yci a2 = androidx.compose.ui.platform.a.a(a.a(aVar7, vci.a), "playlist_list_content_tab_item");
                    int i16 = (i7 & 112) ^ 48;
                    boolean h6 = oq5Var9.h(obj7) | oq5Var9.f(dwlVar) | ((i16 > 32 && oq5Var9.d(intValue17)) || (i7 & 48) == 32);
                    Object K8 = oq5Var9.K();
                    if (h6 || K8 == obj6) {
                        K8 = new h25(obj7, dwlVar, intValue17, 0);
                        oq5Var9.k0(K8);
                    }
                    yci b2 = com.yandex.music.core.ui.compose.a.b(a2, null, 0L, 0.0f, null, (Function2) K8, 13);
                    lwl lwlVar = dwlVar.a;
                    boolean h7 = oq5Var9.h(obj7) | oq5Var9.f(dwlVar);
                    if ((i16 <= 32 || !oq5Var9.d(intValue17)) && (i7 & 48) != 32) {
                        z = false;
                    }
                    boolean z2 = h7 | z;
                    Object K9 = oq5Var9.K();
                    if (z2 || K9 == obj6) {
                        K9 = new i25(obj7, dwlVar, intValue17, 0);
                        oq5Var9.k0(K9);
                    }
                    Function0 function02 = (Function0) K9;
                    boolean h8 = oq5Var9.h(obj7) | oq5Var9.f(dwlVar);
                    Object K10 = oq5Var9.K();
                    if (h8 || K10 == obj6) {
                        K10 = new uv(6, obj7, dwlVar);
                        oq5Var9.k0(K10);
                    }
                    wyf.h(lwlVar, function02, b2, 0L, null, null, null, (Function0) K10, oq5Var9, 0, 120);
                    oq5Var9.p(false);
                } else {
                    oq5Var9.S();
                }
                return Unit.a;
            case 8:
                a aVar8 = (a) obj;
                int intValue19 = ((Number) obj2).intValue();
                hq5 hq5Var8 = (hq5) obj3;
                int intValue20 = ((Number) obj4).intValue();
                if ((intValue20 & 6) == 0) {
                    i8 = (((oq5) hq5Var8).f(aVar8) ? 4 : 2) | intValue20;
                } else {
                    i8 = intValue20;
                }
                if ((intValue20 & 48) == 0) {
                    i8 |= ((oq5) hq5Var8).d(intValue19) ? 32 : 16;
                }
                oq5 oq5Var10 = (oq5) hq5Var8;
                if (oq5Var10.P(i8 & 1, (i8 & 147) != 146)) {
                    aau aauVar = (aau) ((List) this.s).get(intValue19);
                    oq5Var10.Z(-2146139712);
                    fgq.q(aVar8, (k65) this.t, aauVar, intValue19, oq5Var10, (i8 & 14) | (((i8 & 126) << 6) & 7168));
                    oq5Var10.p(false);
                } else {
                    oq5Var10.S();
                }
                return Unit.a;
            case 9:
                a aVar9 = (a) obj;
                int intValue21 = ((Number) obj2).intValue();
                hq5 hq5Var9 = (hq5) obj3;
                int intValue22 = ((Number) obj4).intValue();
                if ((intValue22 & 6) == 0) {
                    i9 = (((oq5) hq5Var9).f(aVar9) ? 4 : 2) | intValue22;
                } else {
                    i9 = intValue22;
                }
                if ((intValue22 & 48) == 0) {
                    i9 |= ((oq5) hq5Var9).d(intValue21) ? 32 : 16;
                }
                oq5 oq5Var11 = (oq5) hq5Var9;
                if (oq5Var11.P(i9 & 1, (i9 & 147) != 146)) {
                    mqs mqsVar = (mqs) ((List) this.s).get(intValue21);
                    oq5Var11.Z(127603505);
                    vut.i(oo6.a.a(mqsVar), up6.H(mqsVar, (w50) this.t, oq5Var11, 6, 4), b.b(androidx.compose.ui.platform.a.a(a.a(aVar9, vci.a), "track"), intValue21), oq5Var11, 0);
                    oq5Var11.p(false);
                } else {
                    oq5Var11.S();
                }
                return Unit.a;
            case 10:
                a aVar10 = (a) obj;
                int intValue23 = ((Number) obj2).intValue();
                hq5 hq5Var10 = (hq5) obj3;
                int intValue24 = ((Number) obj4).intValue();
                Object obj8 = (hda) this.t;
                if ((intValue24 & 6) == 0) {
                    i10 = (((oq5) hq5Var10).f(aVar10) ? 4 : 2) | intValue24;
                } else {
                    i10 = intValue24;
                }
                if ((intValue24 & 48) == 0) {
                    i10 |= ((oq5) hq5Var10).d(intValue23) ? 32 : 16;
                }
                oq5 oq5Var12 = (oq5) hq5Var10;
                if (oq5Var12.P(i10 & 1, (i10 & 147) != 146)) {
                    xt xtVar = (xt) ((ArrayList) this.s).get(intValue23);
                    oq5Var12.Z(-1081653454);
                    e9g e9gVar2 = e9g.a;
                    ru ruVar2 = xtVar.b;
                    yci b3 = b.b(androidx.compose.ui.platform.a.a(a.a(aVar10, vci.a), "album_item"), intValue23);
                    boolean h9 = oq5Var12.h(obj8) | oq5Var12.h(xtVar);
                    Object K11 = oq5Var12.K();
                    if (h9 || K11 == gq5.a) {
                        K11 = new uv(7, obj8, xtVar);
                        oq5Var12.k0(K11);
                    }
                    fxf.b(ruVar2, (Function0) K11, b3, null, e9gVar2, oq5Var12, 24576, 8);
                    oq5Var12.p(false);
                } else {
                    oq5Var12.S();
                }
                return Unit.a;
            case 11:
                a aVar11 = (a) obj;
                int intValue25 = ((Number) obj2).intValue();
                hq5 hq5Var11 = (hq5) obj3;
                int intValue26 = ((Number) obj4).intValue();
                Object obj9 = gq5.a;
                yda ydaVar = (yda) this.t;
                if ((intValue26 & 6) == 0) {
                    i11 = (((oq5) hq5Var11).f(aVar11) ? 4 : 2) | intValue26;
                } else {
                    i11 = intValue26;
                }
                if ((intValue26 & 48) == 0) {
                    i11 |= ((oq5) hq5Var11).d(intValue25) ? 32 : 16;
                }
                oq5 oq5Var13 = (oq5) hq5Var11;
                if (oq5Var13.P(i11 & 1, (i11 & 147) != 146)) {
                    xb1 xb1Var = (xb1) ((ArrayList) this.s).get(intValue25);
                    oq5Var13.Z(790070901);
                    e9g e9gVar3 = e9g.a;
                    jd1 jd1Var = xb1Var.b;
                    yci b4 = b.b(androidx.compose.ui.platform.a.a(a.a(aVar11, vci.a), "artist_item"), intValue25);
                    boolean h10 = oq5Var13.h(ydaVar) | oq5Var13.f(xb1Var);
                    Object K12 = oq5Var13.K();
                    if (h10 || K12 == obj9) {
                        K12 = new xda(ydaVar, xb1Var, 0);
                        oq5Var13.k0(K12);
                    }
                    Function0 function03 = (Function0) K12;
                    boolean h11 = oq5Var13.h(ydaVar) | oq5Var13.f(xb1Var);
                    Object K13 = oq5Var13.K();
                    if (h11 || K13 == obj9) {
                        K13 = new xda(ydaVar, xb1Var, 1);
                        oq5Var13.k0(K13);
                    }
                    jf0.b(function03, jd1Var, b4, null, e9gVar3, (Function0) K13, oq5Var13, 24576, 8);
                    oq5Var13.p(false);
                } else {
                    oq5Var13.S();
                }
                return Unit.a;
            case 12:
                a aVar12 = (a) obj;
                int intValue27 = ((Number) obj2).intValue();
                hq5 hq5Var12 = (hq5) obj3;
                int intValue28 = ((Number) obj4).intValue();
                if ((intValue28 & 6) == 0) {
                    i12 = (((oq5) hq5Var12).f(aVar12) ? 4 : 2) | intValue28;
                } else {
                    i12 = intValue28;
                }
                if ((intValue28 & 48) == 0) {
                    i12 |= ((oq5) hq5Var12).d(intValue27) ? 32 : 16;
                }
                oq5 oq5Var14 = (oq5) hq5Var12;
                if (oq5Var14.P(i12 & 1, (i12 & 147) != 146)) {
                    gdj gdjVar = (gdj) ((List) this.s).get(intValue27);
                    oq5Var14.Z(1420221198);
                    raj rajVar = gdjVar.b;
                    tea teaVar = (tea) this.t;
                    mqs mqsVar2 = gdjVar.a;
                    teaVar.getClass();
                    Object K14 = oq5Var14.K();
                    Object obj10 = gq5.a;
                    if (K14 == obj10) {
                        K14 = gld.R(g.a, oq5Var14);
                        oq5Var14.k0(K14);
                    }
                    mm6 mm6Var = (mm6) K14;
                    Context context = (Context) oq5Var14.j(AndroidCompositionLocals_androidKt.b);
                    boolean f3 = oq5Var14.f(mqsVar2) | oq5Var14.f(context);
                    Object K15 = oq5Var14.K();
                    if (f3 || K15 == obj10) {
                        context.getClass();
                        mm6Var.getClass();
                        dg4 dg4Var = new dg4(teaVar, intValue27, 1);
                        l18 l18Var = l18.b;
                        bdt I = hag.I(fdj.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        Object ydjVar = new ydj((fdj) qdcVar.C(I), mqsVar2, false, mm6Var, context, dg4Var, null);
                        oq5Var14.k0(ydjVar);
                        K15 = ydjVar;
                    }
                    o5g.d(rajVar, (wdj) K15, b.b(androidx.compose.ui.platform.a.a(vci.a, "downloaded_chapter"), intValue27), oq5Var14, 0);
                    oq5Var14.p(false);
                } else {
                    oq5Var14.S();
                }
                return Unit.a;
            case 13:
                a aVar13 = (a) obj;
                int intValue29 = ((Number) obj2).intValue();
                hq5 hq5Var13 = (hq5) obj3;
                int intValue30 = ((Number) obj4).intValue();
                if ((intValue30 & 6) == 0) {
                    i13 = (((oq5) hq5Var13).f(aVar13) ? 4 : 2) | intValue30;
                } else {
                    i13 = intValue30;
                }
                if ((intValue30 & 48) == 0) {
                    i13 |= ((oq5) hq5Var13).d(intValue29) ? 32 : 16;
                }
                oq5 oq5Var15 = (oq5) hq5Var13;
                if (oq5Var15.P(i13 & 1, (i13 & 147) != 146)) {
                    b2t b2tVar = (b2t) ((List) this.s).get(intValue29);
                    oq5Var15.Z(-1674003939);
                    po6 po6Var = b2tVar.b;
                    rfa rfaVar = (rfa) this.t;
                    mqs mqsVar3 = b2tVar.a;
                    rfaVar.getClass();
                    Object K16 = oq5Var15.K();
                    kjn kjnVar3 = gq5.a;
                    if (K16 == kjnVar3) {
                        K16 = gld.R(g.a, oq5Var15);
                        oq5Var15.k0(K16);
                    }
                    mm6 mm6Var2 = (mm6) K16;
                    Context context2 = (Context) oq5Var15.j(AndroidCompositionLocals_androidKt.b);
                    boolean f4 = oq5Var15.f(mqsVar3) | oq5Var15.f(context2);
                    Object K17 = oq5Var15.K();
                    if (f4 || K17 == kjnVar3) {
                        context2.getClass();
                        mm6Var2.getClass();
                        K17 = up6.C(mm6Var2, mqsVar3, context2, new dg4(rfaVar, intValue29, 2), false);
                        oq5Var15.k0(K17);
                    }
                    vut.i(po6Var, (bg5) K17, b.b(androidx.compose.ui.platform.a.a(vci.a, "downloaded_track"), intValue29), oq5Var15, 0);
                    oq5Var15.p(false);
                } else {
                    oq5Var15.S();
                }
                return Unit.a;
            case 14:
                return a(obj, obj2, obj3, obj4);
            case 15:
                return g(obj, obj2, obj3, obj4);
            case 16:
                return d(obj, obj2, obj3, obj4);
            case 17:
                return j(obj, obj2, obj3, obj4);
            case 18:
                return h(obj, obj2, obj3, obj4);
            case 19:
                return k(obj, obj2, obj3, obj4);
            case 20:
                dsf dsfVar = (dsf) obj;
                int intValue31 = ((Number) obj2).intValue();
                hq5 hq5Var14 = (hq5) obj3;
                int intValue32 = ((Number) obj4).intValue();
                if ((intValue32 & 6) == 0) {
                    i14 = (((oq5) hq5Var14).f(dsfVar) ? 4 : 2) | intValue32;
                } else {
                    i14 = intValue32;
                }
                if ((intValue32 & 48) == 0) {
                    i14 |= ((oq5) hq5Var14).d(intValue31) ? 32 : 16;
                }
                oq5 oq5Var16 = (oq5) hq5Var14;
                if (oq5Var16.P(i14 & 1, (i14 & 147) != 146)) {
                    c8i c8iVar = (c8i) ((List) this.s).get(intValue31);
                    oq5Var16.Z(97880926);
                    boolean h12 = oq5Var16.h((w8i) this.t);
                    Object K18 = oq5Var16.K();
                    if (h12 || K18 == gq5.a) {
                        kef kefVar = new kef(1, (w8i) this.t, w8i.class, "onClickMix", "onClickMix(Ljava/lang/String;)V", 0, 12);
                        oq5Var16.k0(kefVar);
                        K18 = kefVar;
                    }
                    swf.f(c8iVar, (Function1) ((h9f) K18), oq5Var16, 0);
                    oq5Var16.p(false);
                } else {
                    oq5Var16.S();
                }
                return Unit.a;
            case 21:
                return l(obj, obj2, obj3, obj4);
            case 22:
                return n(obj, obj2, obj3, obj4);
            case 23:
                return o(obj, obj2, obj3, obj4);
            case 24:
                return p(obj, obj2, obj3, obj4);
            case 25:
                return q(obj, obj2, obj3, obj4);
            case 26:
                return r(obj, obj2, obj3, obj4);
            case 27:
                return s(obj, obj2, obj3, obj4);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return t(obj, obj2, obj3, obj4);
            default:
                a aVar14 = (a) obj;
                int intValue33 = ((Number) obj2).intValue();
                hq5 hq5Var15 = (hq5) obj3;
                int intValue34 = ((Number) obj4).intValue();
                if ((intValue34 & 6) == 0) {
                    i15 = (((oq5) hq5Var15).f(aVar14) ? 4 : 2) | intValue34;
                } else {
                    i15 = intValue34;
                }
                if ((intValue34 & 48) == 0) {
                    i15 |= ((oq5) hq5Var15).d(intValue33) ? 32 : 16;
                }
                if ((i15 & 147) == 146) {
                    oq5 oq5Var17 = (oq5) hq5Var15;
                    if (oq5Var17.z()) {
                        oq5Var17.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var18 = (oq5) hq5Var15;
                oq5Var18.Z(-495564642);
                lwv lwvVar = (lwv) this.t;
                lwvVar.getClass();
                Object K19 = oq5Var18.K();
                kjn kjnVar4 = gq5.a;
                if (K19 == kjnVar4) {
                    K19 = tlm.f(gld.R(g.a, oq5Var18), oq5Var18);
                }
                mm6 mm6Var3 = ((fs5) K19).a;
                boolean z3 = (((i15 & 112) ^ 48) > 32 && oq5Var18.d(intValue33)) || (i15 & 48) == 32;
                Object K20 = oq5Var18.K();
                if (z3 || K20 == kjnVar4) {
                    Object obj11 = fwv.a;
                    fkn fknVar = lwvVar.a;
                    t7l t7lVar = lbq.a;
                    n1k n1kVar = new n1k(fknVar, intValue33, 1);
                    owv owvVar = (owv) fknVar.a.getValue();
                    if (!(owvVar instanceof nwv)) {
                        if (owvVar instanceof mwv) {
                            hwv hwvVar = (hwv) CollectionsKt.S(((mwv) owvVar).a, intValue33);
                            if (hwvVar != null) {
                                obj11 = new ewv(hwvVar);
                            }
                        } else {
                            b6e.s();
                            K20 = null;
                            oq5Var18.k0(K20);
                        }
                    }
                    K20 = new dwv(zsd.F0(n1kVar, mm6Var3, t7lVar, obj11), vq1.E(mm6Var3, fknVar, lwvVar.e, new mz3(intValue33, 8)), new kpm(21, lwvVar));
                    oq5Var18.k0(K20);
                }
                dwv dwvVar = (dwv) K20;
                Object K21 = oq5Var18.K();
                if (K21 == kjnVar4) {
                    K21 = szf.g0(Boolean.TRUE);
                    oq5Var18.k0(K21);
                }
                ldg.i(dwvVar, (aqi) K21, oq5Var18, 48);
                oq5Var18.p(false);
                return Unit.a;
        }
    }
}
