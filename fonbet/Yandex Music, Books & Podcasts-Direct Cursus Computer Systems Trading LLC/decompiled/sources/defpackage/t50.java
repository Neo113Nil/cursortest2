package defpackage;

import android.content.Context;
import androidx.compose.foundation.lazy.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.music.core.ui.compose.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class t50 extends uif implements ryc {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t50(ArrayList arrayList, Object obj, Object obj2, int i) {
        super(4);
        this.r = i;
        this.t = arrayList;
        this.u = obj;
        this.s = obj2;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        a aVar = (a) obj;
        int intValue = ((Number) obj2).intValue();
        hq5 hq5Var = (hq5) obj3;
        int intValue2 = ((Number) obj4).intValue();
        l8i l8iVar = (l8i) this.u;
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
            Object obj5 = (f8i) ((List) this.s).get(intValue);
            oq5Var.Z(1031620873);
            spd spdVar = new spd(intValue, 0, intValue);
            boolean z = obj5 instanceof c8i;
            Object obj6 = gq5.a;
            if (z) {
                oq5Var.Z(1031705657);
                c8i c8iVar = (c8i) obj5;
                ynn ynnVar = (ynn) this.t;
                boolean h = oq5Var.h(l8iVar);
                Object K = oq5Var.K();
                if (h || K == obj6) {
                    Object w4iVar = new w4i(2, (l8i) this.u, l8i.class, "onMixClick", "onMixClick(Lcom/yandex/music/mixes/api/data/MixesItemUi$Entity;Lcom/yandex/music/model/common/GridIndex;)V", 0, 2);
                    oq5Var.k0(w4iVar);
                    K = w4iVar;
                }
                Function2 function2 = (Function2) ((h9f) K);
                boolean h2 = oq5Var.h(l8iVar);
                Object K2 = oq5Var.K();
                if (h2 || K2 == obj6) {
                    Object wjdVar = new wjd(4, (l8i) this.u, l8i.class, "onVisibilityChanged", "onVisibilityChanged(Lcom/yandex/music/mixes/api/data/MixesItemUi$Entity;Lcom/yandex/music/model/common/GridIndex;ZLjava/lang/String;)V", 0, 2);
                    oq5Var.k0(wjdVar);
                    K2 = wjdVar;
                }
                avf.d(c8iVar, spdVar, ynnVar, function2, (ryc) ((h9f) K2), oq5Var, 0);
                oq5Var.p(false);
            } else if (obj5 instanceof b8i) {
                oq5Var.Z(1032096071);
                b8i b8iVar = (b8i) obj5;
                d6i d6iVar = b8iVar.a;
                boolean h3 = oq5Var.h(l8iVar) | oq5Var.f(obj5) | oq5Var.h(spdVar);
                Object K3 = oq5Var.K();
                if (h3 || K3 == obj6) {
                    K3 = new ou4(2, l8iVar, b8iVar, spdVar);
                    oq5Var.k0(K3);
                }
                Function0 function0 = (Function0) K3;
                ynn ynnVar2 = (ynn) this.t;
                boolean f = oq5Var.f(obj5) | oq5Var.h(l8iVar) | oq5Var.h(spdVar);
                Object K4 = oq5Var.K();
                if (f || K4 == obj6) {
                    K4 = new tv(1, l8iVar, b8iVar, spdVar);
                    oq5Var.k0(K4);
                }
                hdg.i(d6iVar, function0, com.yandex.music.core.ui.compose.a.b(vci.a, ynnVar2, 0L, 0.0f, null, (Function2) K4, 14), oq5Var, 0);
                oq5Var.p(false);
            } else if (Intrinsics.d(obj5, d8i.a)) {
                oq5Var.Z(1557329919);
                boolean h4 = oq5Var.h(l8iVar);
                Object K5 = oq5Var.K();
                if (h4 || K5 == obj6) {
                    K5 = new q8i(l8iVar, 0);
                    oq5Var.k0(K5);
                }
                ivf.e((Function0) K5, oq5Var, 0);
                oq5Var.p(false);
            } else {
                if (!Intrinsics.d(obj5, e8i.a)) {
                    throw vz1.i(oq5Var, 1557300327, false);
                }
                oq5Var.Z(1557333855);
                boolean h5 = oq5Var.h(l8iVar);
                Object K6 = oq5Var.K();
                if (h5 || K6 == obj6) {
                    K6 = new q8i(l8iVar, 1);
                    oq5Var.k0(K6);
                }
                hdg.k((Function0) K6, oq5Var, 0);
                oq5Var.p(false);
            }
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
            eej eejVar = (eej) ((ArrayList) this.t).get(intValue);
            oq5Var.Z(-1654685706);
            o5g.d(eejVar.a, aaw.t(eejVar.b, ((mdj) this.u).m, (fdj) this.s, null, oq5Var, 199680), b.b(androidx.compose.ui.platform.a.a(a.a(aVar, vci.a), "collection_non_music_tracks_item"), intValue), oq5Var, 0);
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
        Context context = (Context) this.s;
        Function2 function2 = (Function2) this.u;
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
        fyp fypVar = (fyp) ((ArrayList) this.t).get(intValue);
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.Z(-2004619669);
        boolean f = oq5Var2.f(function2) | oq5Var2.h(fypVar) | oq5Var2.h(context);
        Object K = oq5Var2.K();
        kjn kjnVar = gq5.a;
        if (f || K == kjnVar) {
            K = new ou4(5, function2, fypVar, context);
            oq5Var2.k0(K);
        }
        Function0 function0 = (Function0) K;
        boolean z = (((i & 112) ^ 48) > 32 && oq5Var2.d(intValue)) || (i & 48) == 32;
        Object K2 = oq5Var2.K();
        if (z || K2 == kjnVar) {
            K2 = new iii(intValue, 1);
            oq5Var2.k0(K2);
        }
        v7g.f(fypVar, function0, nfp.b(vci.a, false, (Function1) K2), oq5Var2, 0);
        oq5Var2.p(false);
        return Unit.a;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        String n;
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
        r10 = true;
        boolean z = true;
        int i15 = 0;
        int i16 = 2;
        switch (this.r) {
            case 0:
                a aVar = (a) obj;
                int intValue = ((Number) obj2).intValue();
                hq5 hq5Var = (hq5) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = intValue2 | (((oq5) hq5Var).f(aVar) ? 4 : 2);
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= ((oq5) hq5Var).d(intValue) ? 32 : 16;
                }
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(i & 1, (i & 147) != 146)) {
                    b2t b2tVar = (b2t) ((ArrayList) this.t).get(intValue);
                    oq5Var.Z(-1495911726);
                    po6 po6Var = b2tVar.b;
                    a60 a60Var = (a60) this.u;
                    mqs mqsVar = b2tVar.a;
                    List list = (List) this.s;
                    a60Var.getClass();
                    list.getClass();
                    Object K = oq5Var.K();
                    kjn kjnVar = gq5.a;
                    Object obj5 = K;
                    if (K == kjnVar) {
                        mm6 R = gld.R(g.a, oq5Var);
                        oq5Var.k0(R);
                        obj5 = R;
                    }
                    mm6 mm6Var = (mm6) obj5;
                    Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
                    boolean f = oq5Var.f(mqsVar) | oq5Var.f(list) | oq5Var.f(context);
                    Object K2 = oq5Var.K();
                    Object obj6 = K2;
                    if (f || K2 == kjnVar) {
                        context.getClass();
                        mm6Var.getClass();
                        fg5 C = up6.C(mm6Var, mqsVar, context, new w50(i15, list, a60Var), false);
                        oq5Var.k0(C);
                        obj6 = C;
                    }
                    vut.i(po6Var, (bg5) obj6, b.b(androidx.compose.ui.platform.a.a(a.a(aVar, vci.a), "track_item"), intValue), oq5Var, 0);
                    oq5Var.p(false);
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            case 1:
                a aVar2 = (a) obj;
                int intValue3 = ((Number) obj2).intValue();
                hq5 hq5Var2 = (hq5) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = intValue4 | (((oq5) hq5Var2).f(aVar2) ? 4 : 2);
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= ((oq5) hq5Var2).d(intValue3) ? 32 : 16;
                }
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(i2 & 1, (i2 & 147) != 146)) {
                    io6 io6Var = (io6) ((List) this.s).get(intValue3);
                    oq5Var2.Z(2066968342);
                    yci a = androidx.compose.ui.platform.a.a(vci.a, "familiar_collection_track");
                    po6 po6Var2 = io6Var.a;
                    t71 t71Var = (t71) this.t;
                    mqs mqsVar2 = io6Var.b;
                    List list2 = ((c81) this.u).b;
                    ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((io6) it.next()).b);
                    }
                    vut.i(po6Var2, wdp.p0(t71Var, mqsVar2, intValue3, arrayList, kf1.b, oq5Var2), a, oq5Var2, 384);
                    oq5Var2.p(false);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
            case 2:
                a aVar3 = (a) obj;
                int intValue5 = ((Number) obj2).intValue();
                hq5 hq5Var3 = (hq5) obj3;
                int intValue6 = ((Number) obj4).intValue();
                Function1 function1 = (Function1) this.s;
                if ((intValue6 & 6) == 0) {
                    i3 = intValue6 | (((oq5) hq5Var3).f(aVar3) ? 4 : 2);
                } else {
                    i3 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i3 |= ((oq5) hq5Var3).d(intValue5) ? 32 : 16;
                }
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(i3 & 1, (i3 & 147) != 146)) {
                    b81 b81Var = (b81) ((ArrayList) this.t).get(intValue5);
                    oq5Var3.Z(23116103);
                    int ordinal = b81Var.ordinal();
                    if (ordinal == 0) {
                        n = vz1.n(oq5Var3, -691988998, R.string.artist_familiar_collection_tab, oq5Var3, false);
                    } else {
                        if (ordinal != 1) {
                            throw vz1.i(oq5Var3, -691990977, false);
                        }
                        n = vz1.n(oq5Var3, -691985388, R.string.artist_familiar_wave_tab, oq5Var3, false);
                    }
                    yci a2 = androidx.compose.ui.platform.a.a(vci.a, "familiar_tab_".concat(b81Var.a));
                    boolean z2 = b81Var == ((b81) this.u);
                    boolean f2 = oq5Var3.f(function1) | oq5Var3.d(b81Var.ordinal());
                    Object K3 = oq5Var3.K();
                    if (f2 || K3 == gq5.a) {
                        K3 = new uv(i16, function1, b81Var);
                        oq5Var3.k0(K3);
                    }
                    zwf.g(z2, (Function0) K3, a2, ild.C(-1217577286, new ewb(i16, n), oq5Var3), oq5Var3, 3072);
                    oq5Var3.p(false);
                } else {
                    oq5Var3.S();
                }
                return Unit.a;
            case 3:
                a aVar4 = (a) obj;
                int intValue7 = ((Number) obj2).intValue();
                hq5 hq5Var4 = (hq5) obj3;
                int intValue8 = ((Number) obj4).intValue();
                if ((intValue8 & 6) == 0) {
                    i4 = intValue8 | (((oq5) hq5Var4).f(aVar4) ? 4 : 2);
                } else {
                    i4 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    i4 |= ((oq5) hq5Var4).d(intValue7) ? 32 : 16;
                }
                oq5 oq5Var4 = (oq5) hq5Var4;
                if (oq5Var4.P(i4 & 1, (i4 & 147) != 146)) {
                    io6 io6Var2 = (io6) ((List) this.s).get(intValue7);
                    oq5Var4.Z(1854425677);
                    yci b = b.b(androidx.compose.ui.platform.a.a(vci.a, "familiar_wave_track"), intValue7);
                    po6 po6Var3 = io6Var2.a;
                    t71 t71Var2 = (t71) this.t;
                    mqs mqsVar3 = io6Var2.b;
                    List list3 = ((d81) this.u).b;
                    ArrayList arrayList2 = new ArrayList(v75.o(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((io6) it2.next()).b);
                    }
                    vut.i(po6Var3, wdp.p0(t71Var2, mqsVar3, intValue7, arrayList2, kf1.a, oq5Var4), b, oq5Var4, 0);
                    oq5Var4.p(false);
                } else {
                    oq5Var4.S();
                }
                return Unit.a;
            case 4:
                a aVar5 = (a) obj;
                int intValue9 = ((Number) obj2).intValue();
                hq5 hq5Var5 = (hq5) obj3;
                int intValue10 = ((Number) obj4).intValue();
                if ((intValue10 & 6) == 0) {
                    i5 = intValue10 | (((oq5) hq5Var5).f(aVar5) ? 4 : 2);
                } else {
                    i5 = intValue10;
                }
                if ((intValue10 & 48) == 0) {
                    i5 |= ((oq5) hq5Var5).d(intValue9) ? 32 : 16;
                }
                oq5 oq5Var5 = (oq5) hq5Var5;
                if (oq5Var5.P(i5 & 1, (i5 & 147) != 146)) {
                    gdj gdjVar = (gdj) ((ArrayList) this.t).get(intValue9);
                    oq5Var5.Z(-1086477174);
                    raj rajVar = gdjVar.b;
                    v83 v83Var = (v83) this.u;
                    mqs mqsVar4 = gdjVar.a;
                    List list4 = (List) this.s;
                    v83Var.getClass();
                    list4.getClass();
                    Object K4 = oq5Var5.K();
                    kjn kjnVar2 = gq5.a;
                    Object obj7 = K4;
                    if (K4 == kjnVar2) {
                        mm6 R2 = gld.R(g.a, oq5Var5);
                        oq5Var5.k0(R2);
                        obj7 = R2;
                    }
                    mm6 mm6Var2 = (mm6) obj7;
                    Context context2 = (Context) oq5Var5.j(AndroidCompositionLocals_androidKt.b);
                    boolean f3 = oq5Var5.f(mqsVar4) | oq5Var5.f(list4) | oq5Var5.f(context2);
                    Object K5 = oq5Var5.K();
                    if (f3 || K5 == kjnVar2) {
                        context2.getClass();
                        mm6Var2.getClass();
                        w50 w50Var = new w50(r10 ? 1 : 0, list4, v83Var);
                        l18 l18Var = l18.b;
                        bdt I = hag.I(fdj.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        ydj ydjVar = new ydj((fdj) qdcVar.C(I), mqsVar4, false, mm6Var2, context2, w50Var, null);
                        oq5Var5.k0(ydjVar);
                        K5 = ydjVar;
                    }
                    o5g.d(rajVar, (wdj) K5, b.b(androidx.compose.ui.platform.a.a(a.a(aVar5, vci.a), "chapter_item"), intValue9), oq5Var5, 0);
                    oq5Var5.p(false);
                } else {
                    oq5Var5.S();
                }
                return Unit.a;
            case 5:
                i10 i10Var = (i10) this.u;
                vci vciVar = vci.a;
                a aVar6 = (a) obj;
                int intValue11 = ((Number) obj2).intValue();
                hq5 hq5Var6 = (hq5) obj3;
                int intValue12 = ((Number) obj4).intValue();
                kjn kjnVar3 = gq5.a;
                pu4 pu4Var = (pu4) this.s;
                if ((intValue12 & 6) == 0) {
                    i6 = (((oq5) hq5Var6).f(aVar6) ? 4 : 2) | intValue12;
                } else {
                    i6 = intValue12;
                }
                if ((intValue12 & 48) == 0) {
                    i6 |= ((oq5) hq5Var6).d(intValue11) ? 32 : 16;
                }
                oq5 oq5Var6 = (oq5) hq5Var6;
                if (oq5Var6.P(i6 & 1, (i6 & 147) != 146)) {
                    qab qabVar = (qab) ((ArrayList) this.t).get(intValue11);
                    oq5Var6.Z(-1073606304);
                    spd spdVar = new spd(0, intValue11, intValue11);
                    if (qabVar instanceof oab) {
                        oq5Var6.Z(-1073497805);
                        yci a3 = androidx.compose.ui.platform.a.a(a.a(aVar6, vciVar), "album_list_item");
                        boolean h = oq5Var6.h(pu4Var) | oq5Var6.h(qabVar) | oq5Var6.h(spdVar);
                        Object K6 = oq5Var6.K();
                        Object obj8 = K6;
                        if (h || K6 == kjnVar3) {
                            oe3 oe3Var = new oe3(pu4Var, (oab) qabVar, spdVar, r10 ? 1 : 0);
                            oq5Var6.k0(oe3Var);
                            obj8 = oe3Var;
                        }
                        yci c = com.yandex.music.core.ui.compose.a.c(a3, null, i10Var, (pyc) obj8, 15);
                        e9g e9gVar = e9g.a;
                        oab oabVar = (oab) qabVar;
                        ru ruVar = oabVar.b;
                        boolean h2 = oq5Var6.h(pu4Var) | oq5Var6.h(qabVar) | oq5Var6.h(spdVar);
                        Object K7 = oq5Var6.K();
                        Object obj9 = K7;
                        if (h2 || K7 == kjnVar3) {
                            ou4 ou4Var = new ou4(i15, pu4Var, oabVar, spdVar);
                            oq5Var6.k0(ou4Var);
                            obj9 = ou4Var;
                        }
                        Function0 function0 = (Function0) obj9;
                        boolean h3 = oq5Var6.h(pu4Var) | oq5Var6.h(qabVar);
                        Object K8 = oq5Var6.K();
                        Object obj10 = K8;
                        if (h3 || K8 == kjnVar3) {
                            uv uvVar = new uv(r9, pu4Var, oabVar);
                            oq5Var6.k0(uvVar);
                            obj10 = uvVar;
                        }
                        ghh.a(ruVar, function0, c, null, null, e9gVar, (Function0) obj10, oq5Var6, 196608, 24);
                        oq5Var6.p(false);
                    } else {
                        if (!(qabVar instanceof pab)) {
                            throw vz1.i(oq5Var6, 519558665, false);
                        }
                        oq5Var6.Z(-1072558164);
                        yci a4 = androidx.compose.ui.platform.a.a(a.a(aVar6, vciVar), "pre_save_list_item");
                        boolean h4 = oq5Var6.h(pu4Var) | oq5Var6.h(qabVar) | oq5Var6.h(spdVar);
                        Object K9 = oq5Var6.K();
                        Object obj11 = K9;
                        if (h4 || K9 == kjnVar3) {
                            oe3 oe3Var2 = new oe3(pu4Var, (pab) qabVar, spdVar, i16);
                            oq5Var6.k0(oe3Var2);
                            obj11 = oe3Var2;
                        }
                        yci c2 = com.yandex.music.core.ui.compose.a.c(a4, null, i10Var, (pyc) obj11, 15);
                        pab pabVar = (pab) qabVar;
                        nkm nkmVar = pabVar.b;
                        Object K10 = oq5Var6.K();
                        Object obj12 = K10;
                        if (K10 == kjnVar3) {
                            wg wgVar = wg.i;
                            oq5Var6.k0(wgVar);
                            obj12 = wgVar;
                        }
                        u1g.i(nkmVar, (Function0) obj12, c2, ild.C(-297102880, new yo1(r10 ? 1 : 0, pu4Var, pabVar), oq5Var6), oq5Var6, 25008);
                        oq5Var6.p(false);
                    }
                    oq5Var6.p(false);
                } else {
                    oq5Var6.S();
                }
                return Unit.a;
            case 6:
                a aVar7 = (a) obj;
                int intValue13 = ((Number) obj2).intValue();
                hq5 hq5Var7 = (hq5) obj3;
                int intValue14 = ((Number) obj4).intValue();
                if ((intValue14 & 6) == 0) {
                    i7 = intValue14 | (((oq5) hq5Var7).f(aVar7) ? 4 : 2);
                } else {
                    i7 = intValue14;
                }
                if ((intValue14 & 48) == 0) {
                    i7 |= ((oq5) hq5Var7).d(intValue13) ? 32 : 16;
                }
                oq5 oq5Var7 = (oq5) hq5Var7;
                if (oq5Var7.P(i7 & 1, (i7 & 147) != 146)) {
                    aau aauVar = (aau) ((List) this.s).get(intValue13);
                    oq5Var7.Z(468743100);
                    fgq.q(aVar7, (k65) this.u, aauVar, ((List) this.t).size() + intValue13, oq5Var7, i7 & 14);
                    oq5Var7.p(false);
                } else {
                    oq5Var7.S();
                }
                return Unit.a;
            case 7:
                a aVar8 = (a) obj;
                int intValue15 = ((Number) obj2).intValue();
                hq5 hq5Var8 = (hq5) obj3;
                int intValue16 = ((Number) obj4).intValue();
                kjn kjnVar4 = gq5.a;
                lx5 lx5Var = (lx5) this.s;
                ww5 ww5Var = (ww5) this.u;
                if ((intValue16 & 6) == 0) {
                    i8 = intValue16 | (((oq5) hq5Var8).f(aVar8) ? 4 : 2);
                } else {
                    i8 = intValue16;
                }
                if ((intValue16 & 48) == 0) {
                    i8 |= ((oq5) hq5Var8).d(intValue15) ? 32 : 16;
                }
                if ((i8 & 147) == 146) {
                    oq5 oq5Var8 = (oq5) hq5Var8;
                    if (oq5Var8.z()) {
                        oq5Var8.S();
                        return Unit.a;
                    }
                }
                kx5 kx5Var = (kx5) ((ArrayList) this.t).get(intValue15);
                oq5 oq5Var9 = (oq5) hq5Var8;
                oq5Var9.Z(-1814924308);
                int i17 = (i8 & 112) ^ 48;
                boolean f4 = oq5Var9.f(ww5Var) | oq5Var9.f(kx5Var) | ((i17 > 32 && oq5Var9.d(intValue15)) || (i8 & 48) == 32) | oq5Var9.f(lx5Var);
                Object K11 = oq5Var9.K();
                if (f4 || K11 == kjnVar4) {
                    K11 = new yw5(ww5Var, kx5Var, intValue15, lx5Var);
                    oq5Var9.k0(K11);
                }
                Function0 function02 = (Function0) K11;
                boolean f5 = oq5Var9.f(ww5Var) | oq5Var9.f(kx5Var);
                if ((i17 <= 32 || !oq5Var9.d(intValue15)) && (i8 & 48) != 32) {
                    z = false;
                }
                boolean f6 = f5 | z | oq5Var9.f(lx5Var);
                Object K12 = oq5Var9.K();
                if (f6 != 0 || K12 == kjnVar4) {
                    K12 = new zw5(ww5Var, kx5Var, intValue15, lx5Var);
                    oq5Var9.k0(K12);
                }
                ox6.r(kx5Var, function02, (Function2) K12, null, oq5Var9, 0);
                oq5Var9.p(false);
                return Unit.a;
            case 8:
                a aVar9 = (a) obj;
                int intValue17 = ((Number) obj2).intValue();
                hq5 hq5Var9 = (hq5) obj3;
                int intValue18 = ((Number) obj4).intValue();
                Function1 function12 = (Function1) this.u;
                kjn kjnVar5 = gq5.a;
                Function1 function13 = (Function1) this.t;
                if ((intValue18 & 6) == 0) {
                    i9 = intValue18 | (((oq5) hq5Var9).f(aVar9) ? 4 : 2);
                } else {
                    i9 = intValue18;
                }
                if ((intValue18 & 48) == 0) {
                    i9 |= ((oq5) hq5Var9).d(intValue17) ? 32 : 16;
                }
                oq5 oq5Var10 = (oq5) hq5Var9;
                if (oq5Var10.P(i9 & 1, (i9 & 147) != 146)) {
                    c01 c01Var = (c01) ((List) this.s).get(intValue17);
                    oq5Var10.Z(-1005379450);
                    yci b2 = b.b(androidx.compose.ui.platform.a.a(a.a(aVar9, vci.a), "artist"), intValue17);
                    c01Var.getClass();
                    String w = vz1.w(c01Var.q.a);
                    String str = c01Var.b;
                    int i18 = c01Var.g;
                    jd1 jd1Var = new jd1(w, str, false, i18 > 0 ? new w3g(tt0.C(i18), dag.A(i18, false), false) : null);
                    boolean f7 = oq5Var10.f(function13) | oq5Var10.h(c01Var);
                    Object K13 = oq5Var10.K();
                    Object obj13 = K13;
                    if (f7 || K13 == kjnVar5) {
                        h98 h98Var = new h98(function13, c01Var, 0);
                        oq5Var10.k0(h98Var);
                        obj13 = h98Var;
                    }
                    Function0 function03 = (Function0) obj13;
                    boolean f8 = oq5Var10.f(function12) | oq5Var10.h(c01Var);
                    Object K14 = oq5Var10.K();
                    Object obj14 = K14;
                    if (f8 || K14 == kjnVar5) {
                        h98 h98Var2 = new h98(function12, c01Var, 1);
                        oq5Var10.k0(h98Var2);
                        obj14 = h98Var2;
                    }
                    jf0.b(function03, jd1Var, b2, null, null, (Function0) obj14, oq5Var10, 0, 24);
                    oq5Var10.p(false);
                } else {
                    oq5Var10.S();
                }
                return Unit.a;
            case 9:
                a aVar10 = (a) obj;
                int intValue19 = ((Number) obj2).intValue();
                hq5 hq5Var10 = (hq5) obj3;
                int intValue20 = ((Number) obj4).intValue();
                if ((intValue20 & 6) == 0) {
                    i10 = (((oq5) hq5Var10).f(aVar10) ? 4 : 2) | intValue20;
                } else {
                    i10 = intValue20;
                }
                if ((intValue20 & 48) == 0) {
                    i10 |= ((oq5) hq5Var10).d(intValue19) ? 32 : 16;
                }
                oq5 oq5Var11 = (oq5) hq5Var10;
                if (oq5Var11.P(i10 & 1, (i10 & 147) != 146)) {
                    gdj gdjVar2 = (gdj) ((ArrayList) this.t).get(intValue19);
                    oq5Var11.Z(-444435285);
                    raj rajVar2 = gdjVar2.b;
                    heb hebVar = (heb) this.u;
                    mqs mqsVar5 = gdjVar2.a;
                    List list5 = (List) this.s;
                    hebVar.getClass();
                    list5.getClass();
                    Object K15 = oq5Var11.K();
                    kjn kjnVar6 = gq5.a;
                    Object obj15 = K15;
                    if (K15 == kjnVar6) {
                        mm6 R3 = gld.R(g.a, oq5Var11);
                        oq5Var11.k0(R3);
                        obj15 = R3;
                    }
                    mm6 mm6Var3 = (mm6) obj15;
                    Context context3 = (Context) oq5Var11.j(AndroidCompositionLocals_androidKt.b);
                    boolean f9 = oq5Var11.f(mqsVar5) | oq5Var11.f(list5) | oq5Var11.f(context3);
                    Object K16 = oq5Var11.K();
                    Object obj16 = K16;
                    if (f9 || K16 == kjnVar6) {
                        context3.getClass();
                        mm6Var3.getClass();
                        w50 w50Var2 = new w50(3, list5, hebVar);
                        l18 l18Var2 = l18.b;
                        bdt I2 = hag.I(fdj.class);
                        qdc qdcVar2 = l18Var2.a;
                        qdcVar2.getClass();
                        ydj ydjVar2 = new ydj((fdj) qdcVar2.C(I2), mqsVar5, false, mm6Var3, context3, w50Var2, null);
                        oq5Var11.k0(ydjVar2);
                        obj16 = ydjVar2;
                    }
                    o5g.d(rajVar2, (wdj) obj16, b.b(androidx.compose.ui.platform.a.a(a.a(aVar10, vci.a), "episode_item"), intValue19), oq5Var11, 0);
                    oq5Var11.p(false);
                } else {
                    oq5Var11.S();
                }
                return Unit.a;
            case 10:
                a aVar11 = (a) obj;
                int intValue21 = ((Number) obj2).intValue();
                hq5 hq5Var11 = (hq5) obj3;
                int intValue22 = ((Number) obj4).intValue();
                if ((intValue22 & 6) == 0) {
                    i11 = (((oq5) hq5Var11).f(aVar11) ? 4 : 2) | intValue22;
                } else {
                    i11 = intValue22;
                }
                if ((intValue22 & 48) == 0) {
                    i11 |= ((oq5) hq5Var11).d(intValue21) ? 32 : 16;
                }
                oq5 oq5Var12 = (oq5) hq5Var11;
                if (oq5Var12.P(i11 & 1, (i11 & 147) != 146)) {
                    c2t c2tVar = (c2t) ((ArrayList) this.t).get(intValue21);
                    oq5Var12.Z(-615563408);
                    po6 po6Var4 = c2tVar.b;
                    zgf zgfVar = (zgf) this.u;
                    mqs mqsVar6 = c2tVar.a;
                    ArrayList arrayList3 = (ArrayList) this.s;
                    ArrayList arrayList4 = new ArrayList(v75.o(arrayList3, 10));
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(((c2t) it3.next()).a);
                    }
                    zgfVar.getClass();
                    Object K17 = oq5Var12.K();
                    kjn kjnVar7 = gq5.a;
                    Object obj17 = K17;
                    if (K17 == kjnVar7) {
                        mm6 R4 = gld.R(g.a, oq5Var12);
                        oq5Var12.k0(R4);
                        obj17 = R4;
                    }
                    mm6 mm6Var4 = (mm6) obj17;
                    Context context4 = (Context) oq5Var12.j(AndroidCompositionLocals_androidKt.b);
                    boolean f10 = oq5Var12.f(mqsVar6) | oq5Var12.f(arrayList4) | oq5Var12.f(context4);
                    Object K18 = oq5Var12.K();
                    Object obj18 = K18;
                    if (f10 || K18 == kjnVar7) {
                        context4.getClass();
                        mm6Var4.getClass();
                        fg5 C2 = up6.C(mm6Var4, mqsVar6, context4, new w50(6, arrayList4, zgfVar), false);
                        oq5Var12.k0(C2);
                        obj18 = C2;
                    }
                    vut.i(po6Var4, (bg5) obj18, androidx.compose.ui.platform.a.a(a.a(aVar11, vci.a), "track_item"), oq5Var12, 0);
                    oq5Var12.p(false);
                } else {
                    oq5Var12.S();
                }
                return Unit.a;
            case 11:
                a aVar12 = (a) obj;
                int intValue23 = ((Number) obj2).intValue();
                hq5 hq5Var12 = (hq5) obj3;
                int intValue24 = ((Number) obj4).intValue();
                if ((intValue24 & 6) == 0) {
                    i12 = (((oq5) hq5Var12).f(aVar12) ? 4 : 2) | intValue24;
                } else {
                    i12 = intValue24;
                }
                if ((intValue24 & 48) == 0) {
                    i12 |= ((oq5) hq5Var12).d(intValue23) ? 32 : 16;
                }
                oq5 oq5Var13 = (oq5) hq5Var12;
                if (oq5Var13.P(i12 & 1, (i12 & 147) != 146)) {
                    b2t b2tVar2 = (b2t) ((ArrayList) this.t).get(intValue23);
                    oq5Var13.Z(-246541784);
                    po6 po6Var5 = b2tVar2.b;
                    ygf ygfVar = (ygf) this.u;
                    mqs mqsVar7 = b2tVar2.a;
                    List list6 = (List) this.s;
                    ygfVar.getClass();
                    list6.getClass();
                    Object K19 = oq5Var13.K();
                    kjn kjnVar8 = gq5.a;
                    Object obj19 = K19;
                    if (K19 == kjnVar8) {
                        mm6 R5 = gld.R(g.a, oq5Var13);
                        oq5Var13.k0(R5);
                        obj19 = R5;
                    }
                    mm6 mm6Var5 = (mm6) obj19;
                    Context context5 = (Context) oq5Var13.j(AndroidCompositionLocals_androidKt.b);
                    boolean f11 = oq5Var13.f(mqsVar7) | oq5Var13.f(list6) | oq5Var13.f(context5);
                    Object K20 = oq5Var13.K();
                    Object obj20 = K20;
                    if (f11 || K20 == kjnVar8) {
                        context5.getClass();
                        mm6Var5.getClass();
                        fg5 C3 = up6.C(mm6Var5, mqsVar7, context5, new w50(5, list6, ygfVar), false);
                        oq5Var13.k0(C3);
                        obj20 = C3;
                    }
                    vut.i(po6Var5, (bg5) obj20, b.b(androidx.compose.ui.platform.a.a(a.a(aVar12, vci.a), "track_item"), intValue23), oq5Var13, 0);
                    oq5Var13.p(false);
                } else {
                    oq5Var13.S();
                }
                return Unit.a;
            case 12:
                return a(obj, obj2, obj3, obj4);
            case 13:
                a aVar13 = (a) obj;
                int intValue25 = ((Number) obj2).intValue();
                hq5 hq5Var13 = (hq5) obj3;
                int intValue26 = ((Number) obj4).intValue();
                if ((intValue26 & 6) == 0) {
                    i13 = intValue26 | (((oq5) hq5Var13).f(aVar13) ? 4 : 2);
                } else {
                    i13 = intValue26;
                }
                if ((intValue26 & 48) == 0) {
                    i13 |= ((oq5) hq5Var13).d(intValue25) ? 32 : 16;
                }
                oq5 oq5Var14 = (oq5) hq5Var13;
                if (oq5Var14.P(i13 & 1, (i13 & 147) != 146)) {
                    eej eejVar = (eej) ((List) this.s).get(intValue25);
                    oq5Var14.Z(-551109581);
                    o5g.d(eejVar.a, aaw.t(eejVar.b, (ag5) this.t, (fdj) this.u, null, oq5Var14, 199680), androidx.compose.ui.platform.a.a(a.a(aVar13, vci.a), "collection_non_music_tracks_block_item"), oq5Var14, 0);
                    oq5Var14.p(false);
                } else {
                    oq5Var14.S();
                }
                return Unit.a;
            case 14:
                return d(obj, obj2, obj3, obj4);
            case 15:
                return g(obj, obj2, obj3, obj4);
            default:
                a aVar14 = (a) obj;
                int intValue27 = ((Number) obj2).intValue();
                hq5 hq5Var14 = (hq5) obj3;
                int intValue28 = ((Number) obj4).intValue();
                if ((intValue28 & 6) == 0) {
                    i14 = intValue28 | (((oq5) hq5Var14).f(aVar14) ? 4 : 2);
                } else {
                    i14 = intValue28;
                }
                if ((intValue28 & 48) == 0) {
                    i14 |= ((oq5) hq5Var14).d(intValue27) ? 32 : 16;
                }
                if ((i14 & 147) == 146) {
                    oq5 oq5Var15 = (oq5) hq5Var14;
                    if (oq5Var15.z()) {
                        oq5Var15.S();
                        return Unit.a;
                    }
                }
                w1w w1wVar = (w1w) ((List) this.s).get(intValue27);
                oq5 oq5Var16 = (oq5) hq5Var14;
                oq5Var16.Z(-2118964331);
                zwf.p(w1wVar, intValue27, (Function2) this.t, (pyc) this.u, oq5Var16, i14 & 112, 0);
                oq5Var16.p(false);
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t50(List list, Object obj, Object obj2, int i) {
        super(4);
        this.r = i;
        this.s = list;
        this.t = obj;
        this.u = obj2;
    }
}
