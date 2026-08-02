package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.compose.foundation.lazy.a;
import androidx.media3.exoplayer.ExoPlayer;
import com.yandex.music.core.ui.compose.b;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.account.f;
import com.yandex.passport.internal.properties.d;
import com.yandex.passport.internal.ui.challenge.webview.i;
import com.yandex.plus.bdui.plus.analytics.c;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class i50 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i50(String str, List list, Function1 function1, Function1 function12) {
        this.a = 17;
        this.d = str;
        this.c = list;
        this.b = function1;
        this.e = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        lnu lnuVar;
        Pair pair;
        Object ylnVar;
        int i = this.a;
        int i2 = 16;
        int i3 = 13;
        int i4 = 12;
        int i5 = 8;
        int i6 = 3;
        final int i7 = 2;
        final int i8 = 0;
        final int i9 = 1;
        Object obj2 = this.e;
        Object obj3 = this.b;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                List list = (List) obj5;
                vuf vufVar = (vuf) obj;
                vufVar.getClass();
                vufVar.Z(list.size(), null, new bl(2, list, false), new wn5(new n50(list, (a60) obj4, (mm6) obj3, (fvf) obj2, 0), -1091073711, true));
                return Unit.a;
            case 1:
                g21 g21Var = (g21) obj5;
                b21 b21Var = (b21) obj4;
                mm6 mm6Var = (mm6) obj3;
                Context context = (Context) obj2;
                n9b n9bVar = (n9b) obj;
                n9bVar.getClass();
                ubi ubiVar = n9bVar.a;
                if (Intrinsics.d(g21Var, d21.a) || Intrinsics.d(g21Var, e21.a)) {
                    lg3.A(n9bVar);
                } else {
                    if (!(g21Var instanceof f21)) {
                        b6e.s();
                        return null;
                    }
                    f21 f21Var = (f21) g21Var;
                    boolean z = f21Var.f;
                    xbb xbbVar = f21Var.a;
                    if (z) {
                        ubiVar.a(new wn5(new ba1(xbbVar, b21Var.b(mm6Var), i8), 1104231954, true));
                    } else {
                        ubiVar.a(new wn5(new aa1(xbbVar, i8), -338878357, true));
                    }
                    String str = f21Var.b;
                    if (str != null) {
                        xv.l(n9bVar, str, new zy(0, b21Var, b21.class, "onDescriptionClick", "onDescriptionClick()V", 0, 18), context.getString(R.string.artist_info_block_title), 4);
                    }
                    if (!z && (lnuVar = f21Var.c) != null) {
                        o5g.p(n9bVar, lnuVar, b21Var.b(mm6Var));
                    }
                    float f = 16;
                    lg3.D(n9bVar, f);
                    Iterator it = f21Var.d.iterator();
                    while (it.hasNext()) {
                        cxb.z(n9bVar, (pj1) it.next(), b21Var);
                    }
                    lg3.D(n9bVar, f);
                    Iterator it2 = f21Var.e.iterator();
                    while (it2.hasNext()) {
                        cxb.z(n9bVar, (pj1) it2.next(), b21Var);
                    }
                }
                return Unit.a;
            case 2:
                lb1 lb1Var = (lb1) obj5;
                ib1 ib1Var = (ib1) obj4;
                vuf vufVar2 = (vuf) obj;
                vufVar2.getClass();
                wn5 wn5Var = new wn5(new fb1(i8, lb1Var, (fvf) obj2, (u6k) obj3), 320109182, true);
                x0 x0Var = vufVar2.k;
                roi roiVar = vufVar2.l;
                if (roiVar == null) {
                    roiVar = new roi();
                    vufVar2.l = roiVar;
                }
                roiVar.a(x0Var.b);
                vufVar2.X("artist_info_title", new wn5(new uuf(wn5Var, x0Var.b), 1491981087, true));
                if (!(lb1Var instanceof jb1)) {
                    if (!(lb1Var instanceof kb1)) {
                        b6e.s();
                        return null;
                    }
                    n8g b = t75.b();
                    kb1 kb1Var = (kb1) lb1Var;
                    b.add(kb1Var.c);
                    b.add(kb1Var.d);
                    b.add(kb1Var.b);
                    b.add(kb1Var.e);
                    b.add(kb1Var.f);
                    ArrayList O = CollectionsKt.O(t75.a(b));
                    vufVar2.Z(O.size(), new al(i4, new zs0(18), O), new vv(O, 7), new wn5(new cl(4, O, ib1Var), -632812321, true));
                }
                vuf.Y(vufVar2, null, q6k.a, 3);
                return Unit.a;
            case 3:
                ((te) obj).getClass();
                ((va3) obj5).a.g((u0s) obj4, (jab) obj3, (thj) obj2);
                return Unit.a;
            case 4:
                wn5 wn5Var2 = (wn5) obj3;
                o14 o14Var = (o14) obj2;
                d44 d44Var = (d44) obj;
                d44Var.getClass();
                ya0 ya0Var = (ya0) ((Function1) ((ab0) obj5).a((Function1) obj4).c).invoke(d44Var);
                if (ya0Var != null) {
                    return new l54(ya0Var, h4a.s(wn5Var2, o14Var));
                }
                return null;
            case 5:
                ((whm) obj).getClass();
                whm whmVar = whm.a;
                return new m54(new nvr((b9r) obj5, (Function1) obj4), quj.M((wn5) obj3, (p14) obj2));
            case 6:
                List list2 = (List) obj5;
                g5u g5uVar = (g5u) obj4;
                List list3 = (List) obj3;
                k65 k65Var = (k65) obj2;
                vuf vufVar3 = (vuf) obj;
                vufVar3.getClass();
                if (list2.isEmpty()) {
                    vuf.Y(vufVar3, "emptyView", sj2.c, 2);
                }
                vufVar3.Z(list2.size(), new sv4(i7, new t83(14), list2), new bl(12, list2, false), new wn5(new cl(i5, list2, k65Var), -1091073711, true));
                if (!(g5uVar instanceof e5u)) {
                    vuf.Y(vufVar3, "recommendations", new wn5(new ar(20, g5uVar, k65Var), 1971075988, true), 2);
                }
                vufVar3.Z(list3.size(), new sv4(i6, new t83(15), list3), new bl(13, list3, false), new wn5(new t50(list3, list2, k65Var, 6), -1091073711, true));
                return Unit.a;
            case 7:
                final ArrayList arrayList = (ArrayList) obj5;
                final ArrayList arrayList2 = (ArrayList) obj4;
                final ArrayList arrayList3 = (ArrayList) obj3;
                final rfa rfaVar = (rfa) obj2;
                vuf vufVar4 = (vuf) obj;
                vufVar4.getClass();
                if (!arrayList.isEmpty()) {
                    vuf.Y(vufVar4, "downloaded_tracks_title", new wn5(new pyc() { // from class: lfa
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.pyc
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            int i10 = i8;
                            kjn kjnVar = gq5.a;
                            ArrayList arrayList4 = arrayList;
                            final rfa rfaVar2 = rfaVar;
                            Object[] objArr = 0;
                            Object[] objArr2 = 0;
                            final int i11 = 1;
                            switch (i10) {
                                case 0:
                                    hq5 hq5Var = (hq5) obj7;
                                    int intValue = ((Integer) obj8).intValue();
                                    ((a) obj6).getClass();
                                    oq5 oq5Var = (oq5) hq5Var;
                                    if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                                        yci a = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(vci.a, 0.0f, 8, 0.0f, 4, 5), "downloaded_tracks_title");
                                        String M = rvf.M(R.string.kids_tracks_and_episodes, oq5Var);
                                        boolean h = oq5Var.h(rfaVar2);
                                        Object K = oq5Var.K();
                                        if (h || K == kjnVar) {
                                            final Object[] objArr3 = objArr == true ? 1 : 0;
                                            K = new Function0() { // from class: jfa
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (objArr3) {
                                                        case 0:
                                                            ((vni) rfaVar2.c.a).b(new vgf());
                                                            break;
                                                        case 1:
                                                            ((vni) rfaVar2.c.a).b(new uef());
                                                            break;
                                                        default:
                                                            ((vni) rfaVar2.c.a).b(new xcf());
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            oq5Var.k0(K);
                                        }
                                        irf.h(M, a, null, null, arrayList4.size() > 5 ? (Function0) K : null, false, null, false, null, oq5Var, 48, 492);
                                    } else {
                                        oq5Var.S();
                                    }
                                    break;
                                case 1:
                                    hq5 hq5Var2 = (hq5) obj7;
                                    int intValue2 = ((Integer) obj8).intValue();
                                    ((a) obj6).getClass();
                                    oq5 oq5Var2 = (oq5) hq5Var2;
                                    if (oq5Var2.P(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        vci vciVar = vci.a;
                                        yci a2 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 32, 0.0f, 8, 5), "downloaded_playlists_title");
                                        String M2 = rvf.M(R.string.kids_playlists, oq5Var2);
                                        boolean h2 = oq5Var2.h(rfaVar2);
                                        Object K2 = oq5Var2.K();
                                        if (h2 || K2 == kjnVar) {
                                            K2 = new Function0() { // from class: jfa
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i11) {
                                                        case 0:
                                                            ((vni) rfaVar2.c.a).b(new vgf());
                                                            break;
                                                        case 1:
                                                            ((vni) rfaVar2.c.a).b(new uef());
                                                            break;
                                                        default:
                                                            ((vni) rfaVar2.c.a).b(new xcf());
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            oq5Var2.k0(K2);
                                        }
                                        irf.h(M2, a2, null, null, arrayList4.size() > 8 ? (Function0) K2 : null, false, null, false, null, oq5Var2, 48, 492);
                                        List q0 = CollectionsKt.q0(arrayList4, 8);
                                        yci a3 = androidx.compose.ui.platform.a.a(vciVar, "downloaded_playlists_carousel");
                                        Object K3 = oq5Var2.K();
                                        if (K3 == kjnVar) {
                                            K3 = new rea(3);
                                            oq5Var2.k0(K3);
                                        }
                                        up6.i(q0, a3, (Function2) K3, null, 0.0f, 0.0f, 0.0f, null, null, null, false, 0, ild.C(147994409, new ryc() { // from class: ifa
                                            @Override // defpackage.ryc
                                            public final Object invoke(Object obj9, Object obj10, Object obj11, Object obj12) {
                                                int i12;
                                                int i13 = i11;
                                                int intValue3 = ((Integer) obj9).intValue();
                                                switch (i13) {
                                                    case 0:
                                                        nt ntVar = (nt) obj10;
                                                        hq5 hq5Var3 = (hq5) obj11;
                                                        ((Integer) obj12).getClass();
                                                        ntVar.getClass();
                                                        taj S = y9w.S(ntVar.a, new pv9(1, rfaVar2), hq5Var3);
                                                        x1g x1gVar = ntVar.b;
                                                        w3g w3gVar = (w3g) szf.Q(S.b(), hq5Var3).getValue();
                                                        yci b2 = b.b(vci.a, intValue3);
                                                        oq5 oq5Var3 = (oq5) hq5Var3;
                                                        boolean h3 = oq5Var3.h(S);
                                                        Object K4 = oq5Var3.K();
                                                        kjn kjnVar2 = gq5.a;
                                                        if (h3 || K4 == kjnVar2) {
                                                            K4 = new oea(S, 2);
                                                            oq5Var3.k0(K4);
                                                        }
                                                        Function0 function0 = (Function0) K4;
                                                        boolean h4 = oq5Var3.h(S);
                                                        Object K5 = oq5Var3.K();
                                                        if (h4 || K5 == kjnVar2) {
                                                            K5 = new oea(S, 3);
                                                            oq5Var3.k0(K5);
                                                        }
                                                        w1g.a(function0, x1gVar, w3gVar, b2, false, (Function0) K5, oq5Var3, 0, 16);
                                                        break;
                                                    default:
                                                        bvl bvlVar = (bvl) obj10;
                                                        hq5 hq5Var4 = (hq5) obj11;
                                                        int intValue4 = ((Integer) obj12).intValue();
                                                        bvlVar.getClass();
                                                        if ((intValue4 & 6) == 0) {
                                                            i12 = (((oq5) hq5Var4).d(intValue3) ? 4 : 2) | intValue4;
                                                        } else {
                                                            i12 = intValue4;
                                                        }
                                                        if ((intValue4 & 48) == 0) {
                                                            i12 |= ((oq5) hq5Var4).f(bvlVar) ? 32 : 16;
                                                        }
                                                        oq5 oq5Var4 = (oq5) hq5Var4;
                                                        if (oq5Var4.P(i12 & 1, (i12 & 147) != 146)) {
                                                            Object obj13 = bvlVar.b;
                                                            rfa rfaVar3 = rfaVar2;
                                                            rfaVar3.getClass();
                                                            obj13.getClass();
                                                            boolean f2 = oq5Var4.f(obj13);
                                                            Object K6 = oq5Var4.K();
                                                            Object obj14 = gq5.a;
                                                            if (f2 || K6 == obj14) {
                                                                K6 = new xpd(obj13, new bnd(26, rfaVar3));
                                                                oq5Var4.k0(K6);
                                                            }
                                                            xpd xpdVar = (xpd) K6;
                                                            rab rabVar = bvlVar.a;
                                                            boolean h5 = oq5Var4.h(xpdVar);
                                                            Object K7 = oq5Var4.K();
                                                            if (h5 || K7 == obj14) {
                                                                K7 = new kfa(xpdVar, 0);
                                                                oq5Var4.k0(K7);
                                                            }
                                                            swf.j(0, 24, oq5Var4, rabVar, b.b(vci.a, intValue3), (Function0) K7, null, false);
                                                        } else {
                                                            oq5Var4.S();
                                                        }
                                                        break;
                                                }
                                                return Unit.a;
                                            }
                                        }, oq5Var2), oq5Var2, 432, 384, 4088);
                                    } else {
                                        oq5Var2.S();
                                    }
                                    break;
                                default:
                                    hq5 hq5Var3 = (hq5) obj7;
                                    int intValue3 = ((Integer) obj8).intValue();
                                    ((a) obj6).getClass();
                                    oq5 oq5Var3 = (oq5) hq5Var3;
                                    if (oq5Var3.P(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        vci vciVar2 = vci.a;
                                        yci a4 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, 32, 0.0f, 8, 5), "downloaded_albums_title");
                                        String M3 = rvf.M(R.string.kids_albums_and_podcasts, oq5Var3);
                                        boolean h3 = oq5Var3.h(rfaVar2);
                                        Object K4 = oq5Var3.K();
                                        if (h3 || K4 == kjnVar) {
                                            final int i12 = 2;
                                            K4 = new Function0() { // from class: jfa
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i12) {
                                                        case 0:
                                                            ((vni) rfaVar2.c.a).b(new vgf());
                                                            break;
                                                        case 1:
                                                            ((vni) rfaVar2.c.a).b(new uef());
                                                            break;
                                                        default:
                                                            ((vni) rfaVar2.c.a).b(new xcf());
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            oq5Var3.k0(K4);
                                        }
                                        irf.h(M3, a4, null, null, arrayList4.size() > 8 ? (Function0) K4 : null, false, null, false, null, oq5Var3, 48, 492);
                                        List q02 = CollectionsKt.q0(arrayList4, 8);
                                        yci a5 = androidx.compose.ui.platform.a.a(vciVar2, "downloaded_albums_carousel");
                                        Object K5 = oq5Var3.K();
                                        if (K5 == kjnVar) {
                                            K5 = new rea(i11);
                                            oq5Var3.k0(K5);
                                        }
                                        final Object[] objArr4 = objArr2 == true ? 1 : 0;
                                        up6.i(q02, a5, (Function2) K5, null, 0.0f, 0.0f, 0.0f, null, null, null, false, 0, ild.C(-1477097888, new ryc() { // from class: ifa
                                            @Override // defpackage.ryc
                                            public final Object invoke(Object obj9, Object obj10, Object obj11, Object obj12) {
                                                int i122;
                                                int i13 = objArr4;
                                                int intValue32 = ((Integer) obj9).intValue();
                                                switch (i13) {
                                                    case 0:
                                                        nt ntVar = (nt) obj10;
                                                        hq5 hq5Var32 = (hq5) obj11;
                                                        ((Integer) obj12).getClass();
                                                        ntVar.getClass();
                                                        taj S = y9w.S(ntVar.a, new pv9(1, rfaVar2), hq5Var32);
                                                        x1g x1gVar = ntVar.b;
                                                        w3g w3gVar = (w3g) szf.Q(S.b(), hq5Var32).getValue();
                                                        yci b2 = b.b(vci.a, intValue32);
                                                        oq5 oq5Var32 = (oq5) hq5Var32;
                                                        boolean h32 = oq5Var32.h(S);
                                                        Object K42 = oq5Var32.K();
                                                        kjn kjnVar2 = gq5.a;
                                                        if (h32 || K42 == kjnVar2) {
                                                            K42 = new oea(S, 2);
                                                            oq5Var32.k0(K42);
                                                        }
                                                        Function0 function0 = (Function0) K42;
                                                        boolean h4 = oq5Var32.h(S);
                                                        Object K52 = oq5Var32.K();
                                                        if (h4 || K52 == kjnVar2) {
                                                            K52 = new oea(S, 3);
                                                            oq5Var32.k0(K52);
                                                        }
                                                        w1g.a(function0, x1gVar, w3gVar, b2, false, (Function0) K52, oq5Var32, 0, 16);
                                                        break;
                                                    default:
                                                        bvl bvlVar = (bvl) obj10;
                                                        hq5 hq5Var4 = (hq5) obj11;
                                                        int intValue4 = ((Integer) obj12).intValue();
                                                        bvlVar.getClass();
                                                        if ((intValue4 & 6) == 0) {
                                                            i122 = (((oq5) hq5Var4).d(intValue32) ? 4 : 2) | intValue4;
                                                        } else {
                                                            i122 = intValue4;
                                                        }
                                                        if ((intValue4 & 48) == 0) {
                                                            i122 |= ((oq5) hq5Var4).f(bvlVar) ? 32 : 16;
                                                        }
                                                        oq5 oq5Var4 = (oq5) hq5Var4;
                                                        if (oq5Var4.P(i122 & 1, (i122 & 147) != 146)) {
                                                            Object obj13 = bvlVar.b;
                                                            rfa rfaVar3 = rfaVar2;
                                                            rfaVar3.getClass();
                                                            obj13.getClass();
                                                            boolean f2 = oq5Var4.f(obj13);
                                                            Object K6 = oq5Var4.K();
                                                            Object obj14 = gq5.a;
                                                            if (f2 || K6 == obj14) {
                                                                K6 = new xpd(obj13, new bnd(26, rfaVar3));
                                                                oq5Var4.k0(K6);
                                                            }
                                                            xpd xpdVar = (xpd) K6;
                                                            rab rabVar = bvlVar.a;
                                                            boolean h5 = oq5Var4.h(xpdVar);
                                                            Object K7 = oq5Var4.K();
                                                            if (h5 || K7 == obj14) {
                                                                K7 = new kfa(xpdVar, 0);
                                                                oq5Var4.k0(K7);
                                                            }
                                                            swf.j(0, 24, oq5Var4, rabVar, b.b(vci.a, intValue32), (Function0) K7, null, false);
                                                        } else {
                                                            oq5Var4.S();
                                                        }
                                                        break;
                                                }
                                                return Unit.a;
                                            }
                                        }, oq5Var3), oq5Var3, 432, 384, 4088);
                                    } else {
                                        oq5Var3.S();
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    }, 125089537, true), 2);
                    List q0 = CollectionsKt.q0(arrayList, 5);
                    vufVar4.Z(q0.size(), new sea(i9, new rea(i7), q0), new bl(18, q0, false), new wn5(new cl(i3, q0, rfaVar), -1091073711, true));
                }
                if (!arrayList2.isEmpty()) {
                    vuf.Y(vufVar4, "downloaded_playlists_title", new wn5(new pyc() { // from class: lfa
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.pyc
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            int i10 = i9;
                            kjn kjnVar = gq5.a;
                            ArrayList arrayList4 = arrayList2;
                            final rfa rfaVar2 = rfaVar;
                            Object[] objArr = 0;
                            Object[] objArr2 = 0;
                            final int i11 = 1;
                            switch (i10) {
                                case 0:
                                    hq5 hq5Var = (hq5) obj7;
                                    int intValue = ((Integer) obj8).intValue();
                                    ((a) obj6).getClass();
                                    oq5 oq5Var = (oq5) hq5Var;
                                    if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                                        yci a = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(vci.a, 0.0f, 8, 0.0f, 4, 5), "downloaded_tracks_title");
                                        String M = rvf.M(R.string.kids_tracks_and_episodes, oq5Var);
                                        boolean h = oq5Var.h(rfaVar2);
                                        Object K = oq5Var.K();
                                        if (h || K == kjnVar) {
                                            final int objArr3 = objArr == true ? 1 : 0;
                                            K = new Function0() { // from class: jfa
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (objArr3) {
                                                        case 0:
                                                            ((vni) rfaVar2.c.a).b(new vgf());
                                                            break;
                                                        case 1:
                                                            ((vni) rfaVar2.c.a).b(new uef());
                                                            break;
                                                        default:
                                                            ((vni) rfaVar2.c.a).b(new xcf());
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            oq5Var.k0(K);
                                        }
                                        irf.h(M, a, null, null, arrayList4.size() > 5 ? (Function0) K : null, false, null, false, null, oq5Var, 48, 492);
                                    } else {
                                        oq5Var.S();
                                    }
                                    break;
                                case 1:
                                    hq5 hq5Var2 = (hq5) obj7;
                                    int intValue2 = ((Integer) obj8).intValue();
                                    ((a) obj6).getClass();
                                    oq5 oq5Var2 = (oq5) hq5Var2;
                                    if (oq5Var2.P(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        vci vciVar = vci.a;
                                        yci a2 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 32, 0.0f, 8, 5), "downloaded_playlists_title");
                                        String M2 = rvf.M(R.string.kids_playlists, oq5Var2);
                                        boolean h2 = oq5Var2.h(rfaVar2);
                                        Object K2 = oq5Var2.K();
                                        if (h2 || K2 == kjnVar) {
                                            K2 = new Function0() { // from class: jfa
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i11) {
                                                        case 0:
                                                            ((vni) rfaVar2.c.a).b(new vgf());
                                                            break;
                                                        case 1:
                                                            ((vni) rfaVar2.c.a).b(new uef());
                                                            break;
                                                        default:
                                                            ((vni) rfaVar2.c.a).b(new xcf());
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            oq5Var2.k0(K2);
                                        }
                                        irf.h(M2, a2, null, null, arrayList4.size() > 8 ? (Function0) K2 : null, false, null, false, null, oq5Var2, 48, 492);
                                        List q02 = CollectionsKt.q0(arrayList4, 8);
                                        yci a3 = androidx.compose.ui.platform.a.a(vciVar, "downloaded_playlists_carousel");
                                        Object K3 = oq5Var2.K();
                                        if (K3 == kjnVar) {
                                            K3 = new rea(3);
                                            oq5Var2.k0(K3);
                                        }
                                        up6.i(q02, a3, (Function2) K3, null, 0.0f, 0.0f, 0.0f, null, null, null, false, 0, ild.C(147994409, new ryc() { // from class: ifa
                                            @Override // defpackage.ryc
                                            public final Object invoke(Object obj9, Object obj10, Object obj11, Object obj12) {
                                                int i122;
                                                int i13 = i11;
                                                int intValue32 = ((Integer) obj9).intValue();
                                                switch (i13) {
                                                    case 0:
                                                        nt ntVar = (nt) obj10;
                                                        hq5 hq5Var32 = (hq5) obj11;
                                                        ((Integer) obj12).getClass();
                                                        ntVar.getClass();
                                                        taj S = y9w.S(ntVar.a, new pv9(1, rfaVar2), hq5Var32);
                                                        x1g x1gVar = ntVar.b;
                                                        w3g w3gVar = (w3g) szf.Q(S.b(), hq5Var32).getValue();
                                                        yci b2 = b.b(vci.a, intValue32);
                                                        oq5 oq5Var32 = (oq5) hq5Var32;
                                                        boolean h32 = oq5Var32.h(S);
                                                        Object K42 = oq5Var32.K();
                                                        kjn kjnVar2 = gq5.a;
                                                        if (h32 || K42 == kjnVar2) {
                                                            K42 = new oea(S, 2);
                                                            oq5Var32.k0(K42);
                                                        }
                                                        Function0 function0 = (Function0) K42;
                                                        boolean h4 = oq5Var32.h(S);
                                                        Object K52 = oq5Var32.K();
                                                        if (h4 || K52 == kjnVar2) {
                                                            K52 = new oea(S, 3);
                                                            oq5Var32.k0(K52);
                                                        }
                                                        w1g.a(function0, x1gVar, w3gVar, b2, false, (Function0) K52, oq5Var32, 0, 16);
                                                        break;
                                                    default:
                                                        bvl bvlVar = (bvl) obj10;
                                                        hq5 hq5Var4 = (hq5) obj11;
                                                        int intValue4 = ((Integer) obj12).intValue();
                                                        bvlVar.getClass();
                                                        if ((intValue4 & 6) == 0) {
                                                            i122 = (((oq5) hq5Var4).d(intValue32) ? 4 : 2) | intValue4;
                                                        } else {
                                                            i122 = intValue4;
                                                        }
                                                        if ((intValue4 & 48) == 0) {
                                                            i122 |= ((oq5) hq5Var4).f(bvlVar) ? 32 : 16;
                                                        }
                                                        oq5 oq5Var4 = (oq5) hq5Var4;
                                                        if (oq5Var4.P(i122 & 1, (i122 & 147) != 146)) {
                                                            Object obj13 = bvlVar.b;
                                                            rfa rfaVar3 = rfaVar2;
                                                            rfaVar3.getClass();
                                                            obj13.getClass();
                                                            boolean f2 = oq5Var4.f(obj13);
                                                            Object K6 = oq5Var4.K();
                                                            Object obj14 = gq5.a;
                                                            if (f2 || K6 == obj14) {
                                                                K6 = new xpd(obj13, new bnd(26, rfaVar3));
                                                                oq5Var4.k0(K6);
                                                            }
                                                            xpd xpdVar = (xpd) K6;
                                                            rab rabVar = bvlVar.a;
                                                            boolean h5 = oq5Var4.h(xpdVar);
                                                            Object K7 = oq5Var4.K();
                                                            if (h5 || K7 == obj14) {
                                                                K7 = new kfa(xpdVar, 0);
                                                                oq5Var4.k0(K7);
                                                            }
                                                            swf.j(0, 24, oq5Var4, rabVar, b.b(vci.a, intValue32), (Function0) K7, null, false);
                                                        } else {
                                                            oq5Var4.S();
                                                        }
                                                        break;
                                                }
                                                return Unit.a;
                                            }
                                        }, oq5Var2), oq5Var2, 432, 384, 4088);
                                    } else {
                                        oq5Var2.S();
                                    }
                                    break;
                                default:
                                    hq5 hq5Var3 = (hq5) obj7;
                                    int intValue3 = ((Integer) obj8).intValue();
                                    ((a) obj6).getClass();
                                    oq5 oq5Var3 = (oq5) hq5Var3;
                                    if (oq5Var3.P(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        vci vciVar2 = vci.a;
                                        yci a4 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, 32, 0.0f, 8, 5), "downloaded_albums_title");
                                        String M3 = rvf.M(R.string.kids_albums_and_podcasts, oq5Var3);
                                        boolean h3 = oq5Var3.h(rfaVar2);
                                        Object K4 = oq5Var3.K();
                                        if (h3 || K4 == kjnVar) {
                                            final int i12 = 2;
                                            K4 = new Function0() { // from class: jfa
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i12) {
                                                        case 0:
                                                            ((vni) rfaVar2.c.a).b(new vgf());
                                                            break;
                                                        case 1:
                                                            ((vni) rfaVar2.c.a).b(new uef());
                                                            break;
                                                        default:
                                                            ((vni) rfaVar2.c.a).b(new xcf());
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            oq5Var3.k0(K4);
                                        }
                                        irf.h(M3, a4, null, null, arrayList4.size() > 8 ? (Function0) K4 : null, false, null, false, null, oq5Var3, 48, 492);
                                        List q022 = CollectionsKt.q0(arrayList4, 8);
                                        yci a5 = androidx.compose.ui.platform.a.a(vciVar2, "downloaded_albums_carousel");
                                        Object K5 = oq5Var3.K();
                                        if (K5 == kjnVar) {
                                            K5 = new rea(i11);
                                            oq5Var3.k0(K5);
                                        }
                                        final int objArr4 = objArr2 == true ? 1 : 0;
                                        up6.i(q022, a5, (Function2) K5, null, 0.0f, 0.0f, 0.0f, null, null, null, false, 0, ild.C(-1477097888, new ryc() { // from class: ifa
                                            @Override // defpackage.ryc
                                            public final Object invoke(Object obj9, Object obj10, Object obj11, Object obj12) {
                                                int i122;
                                                int i13 = objArr4;
                                                int intValue32 = ((Integer) obj9).intValue();
                                                switch (i13) {
                                                    case 0:
                                                        nt ntVar = (nt) obj10;
                                                        hq5 hq5Var32 = (hq5) obj11;
                                                        ((Integer) obj12).getClass();
                                                        ntVar.getClass();
                                                        taj S = y9w.S(ntVar.a, new pv9(1, rfaVar2), hq5Var32);
                                                        x1g x1gVar = ntVar.b;
                                                        w3g w3gVar = (w3g) szf.Q(S.b(), hq5Var32).getValue();
                                                        yci b2 = b.b(vci.a, intValue32);
                                                        oq5 oq5Var32 = (oq5) hq5Var32;
                                                        boolean h32 = oq5Var32.h(S);
                                                        Object K42 = oq5Var32.K();
                                                        kjn kjnVar2 = gq5.a;
                                                        if (h32 || K42 == kjnVar2) {
                                                            K42 = new oea(S, 2);
                                                            oq5Var32.k0(K42);
                                                        }
                                                        Function0 function0 = (Function0) K42;
                                                        boolean h4 = oq5Var32.h(S);
                                                        Object K52 = oq5Var32.K();
                                                        if (h4 || K52 == kjnVar2) {
                                                            K52 = new oea(S, 3);
                                                            oq5Var32.k0(K52);
                                                        }
                                                        w1g.a(function0, x1gVar, w3gVar, b2, false, (Function0) K52, oq5Var32, 0, 16);
                                                        break;
                                                    default:
                                                        bvl bvlVar = (bvl) obj10;
                                                        hq5 hq5Var4 = (hq5) obj11;
                                                        int intValue4 = ((Integer) obj12).intValue();
                                                        bvlVar.getClass();
                                                        if ((intValue4 & 6) == 0) {
                                                            i122 = (((oq5) hq5Var4).d(intValue32) ? 4 : 2) | intValue4;
                                                        } else {
                                                            i122 = intValue4;
                                                        }
                                                        if ((intValue4 & 48) == 0) {
                                                            i122 |= ((oq5) hq5Var4).f(bvlVar) ? 32 : 16;
                                                        }
                                                        oq5 oq5Var4 = (oq5) hq5Var4;
                                                        if (oq5Var4.P(i122 & 1, (i122 & 147) != 146)) {
                                                            Object obj13 = bvlVar.b;
                                                            rfa rfaVar3 = rfaVar2;
                                                            rfaVar3.getClass();
                                                            obj13.getClass();
                                                            boolean f2 = oq5Var4.f(obj13);
                                                            Object K6 = oq5Var4.K();
                                                            Object obj14 = gq5.a;
                                                            if (f2 || K6 == obj14) {
                                                                K6 = new xpd(obj13, new bnd(26, rfaVar3));
                                                                oq5Var4.k0(K6);
                                                            }
                                                            xpd xpdVar = (xpd) K6;
                                                            rab rabVar = bvlVar.a;
                                                            boolean h5 = oq5Var4.h(xpdVar);
                                                            Object K7 = oq5Var4.K();
                                                            if (h5 || K7 == obj14) {
                                                                K7 = new kfa(xpdVar, 0);
                                                                oq5Var4.k0(K7);
                                                            }
                                                            swf.j(0, 24, oq5Var4, rabVar, b.b(vci.a, intValue32), (Function0) K7, null, false);
                                                        } else {
                                                            oq5Var4.S();
                                                        }
                                                        break;
                                                }
                                                return Unit.a;
                                            }
                                        }, oq5Var3), oq5Var3, 432, 384, 4088);
                                    } else {
                                        oq5Var3.S();
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    }, 648895224, true), 2);
                }
                if (!arrayList3.isEmpty()) {
                    vuf.Y(vufVar4, "downloaded_albums_title", new wn5(new pyc() { // from class: lfa
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.pyc
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            int i10 = i7;
                            kjn kjnVar = gq5.a;
                            ArrayList arrayList4 = arrayList3;
                            final rfa rfaVar2 = rfaVar;
                            Object[] objArr = 0;
                            Object[] objArr2 = 0;
                            final int i11 = 1;
                            switch (i10) {
                                case 0:
                                    hq5 hq5Var = (hq5) obj7;
                                    int intValue = ((Integer) obj8).intValue();
                                    ((a) obj6).getClass();
                                    oq5 oq5Var = (oq5) hq5Var;
                                    if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                                        yci a = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(vci.a, 0.0f, 8, 0.0f, 4, 5), "downloaded_tracks_title");
                                        String M = rvf.M(R.string.kids_tracks_and_episodes, oq5Var);
                                        boolean h = oq5Var.h(rfaVar2);
                                        Object K = oq5Var.K();
                                        if (h || K == kjnVar) {
                                            final int objArr3 = objArr == true ? 1 : 0;
                                            K = new Function0() { // from class: jfa
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (objArr3) {
                                                        case 0:
                                                            ((vni) rfaVar2.c.a).b(new vgf());
                                                            break;
                                                        case 1:
                                                            ((vni) rfaVar2.c.a).b(new uef());
                                                            break;
                                                        default:
                                                            ((vni) rfaVar2.c.a).b(new xcf());
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            oq5Var.k0(K);
                                        }
                                        irf.h(M, a, null, null, arrayList4.size() > 5 ? (Function0) K : null, false, null, false, null, oq5Var, 48, 492);
                                    } else {
                                        oq5Var.S();
                                    }
                                    break;
                                case 1:
                                    hq5 hq5Var2 = (hq5) obj7;
                                    int intValue2 = ((Integer) obj8).intValue();
                                    ((a) obj6).getClass();
                                    oq5 oq5Var2 = (oq5) hq5Var2;
                                    if (oq5Var2.P(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        vci vciVar = vci.a;
                                        yci a2 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 32, 0.0f, 8, 5), "downloaded_playlists_title");
                                        String M2 = rvf.M(R.string.kids_playlists, oq5Var2);
                                        boolean h2 = oq5Var2.h(rfaVar2);
                                        Object K2 = oq5Var2.K();
                                        if (h2 || K2 == kjnVar) {
                                            K2 = new Function0() { // from class: jfa
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i11) {
                                                        case 0:
                                                            ((vni) rfaVar2.c.a).b(new vgf());
                                                            break;
                                                        case 1:
                                                            ((vni) rfaVar2.c.a).b(new uef());
                                                            break;
                                                        default:
                                                            ((vni) rfaVar2.c.a).b(new xcf());
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            oq5Var2.k0(K2);
                                        }
                                        irf.h(M2, a2, null, null, arrayList4.size() > 8 ? (Function0) K2 : null, false, null, false, null, oq5Var2, 48, 492);
                                        List q02 = CollectionsKt.q0(arrayList4, 8);
                                        yci a3 = androidx.compose.ui.platform.a.a(vciVar, "downloaded_playlists_carousel");
                                        Object K3 = oq5Var2.K();
                                        if (K3 == kjnVar) {
                                            K3 = new rea(3);
                                            oq5Var2.k0(K3);
                                        }
                                        up6.i(q02, a3, (Function2) K3, null, 0.0f, 0.0f, 0.0f, null, null, null, false, 0, ild.C(147994409, new ryc() { // from class: ifa
                                            @Override // defpackage.ryc
                                            public final Object invoke(Object obj9, Object obj10, Object obj11, Object obj12) {
                                                int i122;
                                                int i13 = i11;
                                                int intValue32 = ((Integer) obj9).intValue();
                                                switch (i13) {
                                                    case 0:
                                                        nt ntVar = (nt) obj10;
                                                        hq5 hq5Var32 = (hq5) obj11;
                                                        ((Integer) obj12).getClass();
                                                        ntVar.getClass();
                                                        taj S = y9w.S(ntVar.a, new pv9(1, rfaVar2), hq5Var32);
                                                        x1g x1gVar = ntVar.b;
                                                        w3g w3gVar = (w3g) szf.Q(S.b(), hq5Var32).getValue();
                                                        yci b2 = b.b(vci.a, intValue32);
                                                        oq5 oq5Var32 = (oq5) hq5Var32;
                                                        boolean h32 = oq5Var32.h(S);
                                                        Object K42 = oq5Var32.K();
                                                        kjn kjnVar2 = gq5.a;
                                                        if (h32 || K42 == kjnVar2) {
                                                            K42 = new oea(S, 2);
                                                            oq5Var32.k0(K42);
                                                        }
                                                        Function0 function0 = (Function0) K42;
                                                        boolean h4 = oq5Var32.h(S);
                                                        Object K52 = oq5Var32.K();
                                                        if (h4 || K52 == kjnVar2) {
                                                            K52 = new oea(S, 3);
                                                            oq5Var32.k0(K52);
                                                        }
                                                        w1g.a(function0, x1gVar, w3gVar, b2, false, (Function0) K52, oq5Var32, 0, 16);
                                                        break;
                                                    default:
                                                        bvl bvlVar = (bvl) obj10;
                                                        hq5 hq5Var4 = (hq5) obj11;
                                                        int intValue4 = ((Integer) obj12).intValue();
                                                        bvlVar.getClass();
                                                        if ((intValue4 & 6) == 0) {
                                                            i122 = (((oq5) hq5Var4).d(intValue32) ? 4 : 2) | intValue4;
                                                        } else {
                                                            i122 = intValue4;
                                                        }
                                                        if ((intValue4 & 48) == 0) {
                                                            i122 |= ((oq5) hq5Var4).f(bvlVar) ? 32 : 16;
                                                        }
                                                        oq5 oq5Var4 = (oq5) hq5Var4;
                                                        if (oq5Var4.P(i122 & 1, (i122 & 147) != 146)) {
                                                            Object obj13 = bvlVar.b;
                                                            rfa rfaVar3 = rfaVar2;
                                                            rfaVar3.getClass();
                                                            obj13.getClass();
                                                            boolean f2 = oq5Var4.f(obj13);
                                                            Object K6 = oq5Var4.K();
                                                            Object obj14 = gq5.a;
                                                            if (f2 || K6 == obj14) {
                                                                K6 = new xpd(obj13, new bnd(26, rfaVar3));
                                                                oq5Var4.k0(K6);
                                                            }
                                                            xpd xpdVar = (xpd) K6;
                                                            rab rabVar = bvlVar.a;
                                                            boolean h5 = oq5Var4.h(xpdVar);
                                                            Object K7 = oq5Var4.K();
                                                            if (h5 || K7 == obj14) {
                                                                K7 = new kfa(xpdVar, 0);
                                                                oq5Var4.k0(K7);
                                                            }
                                                            swf.j(0, 24, oq5Var4, rabVar, b.b(vci.a, intValue32), (Function0) K7, null, false);
                                                        } else {
                                                            oq5Var4.S();
                                                        }
                                                        break;
                                                }
                                                return Unit.a;
                                            }
                                        }, oq5Var2), oq5Var2, 432, 384, 4088);
                                    } else {
                                        oq5Var2.S();
                                    }
                                    break;
                                default:
                                    hq5 hq5Var3 = (hq5) obj7;
                                    int intValue3 = ((Integer) obj8).intValue();
                                    ((a) obj6).getClass();
                                    oq5 oq5Var3 = (oq5) hq5Var3;
                                    if (oq5Var3.P(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        vci vciVar2 = vci.a;
                                        yci a4 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, 32, 0.0f, 8, 5), "downloaded_albums_title");
                                        String M3 = rvf.M(R.string.kids_albums_and_podcasts, oq5Var3);
                                        boolean h3 = oq5Var3.h(rfaVar2);
                                        Object K4 = oq5Var3.K();
                                        if (h3 || K4 == kjnVar) {
                                            final int i12 = 2;
                                            K4 = new Function0() { // from class: jfa
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i12) {
                                                        case 0:
                                                            ((vni) rfaVar2.c.a).b(new vgf());
                                                            break;
                                                        case 1:
                                                            ((vni) rfaVar2.c.a).b(new uef());
                                                            break;
                                                        default:
                                                            ((vni) rfaVar2.c.a).b(new xcf());
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            oq5Var3.k0(K4);
                                        }
                                        irf.h(M3, a4, null, null, arrayList4.size() > 8 ? (Function0) K4 : null, false, null, false, null, oq5Var3, 48, 492);
                                        List q022 = CollectionsKt.q0(arrayList4, 8);
                                        yci a5 = androidx.compose.ui.platform.a.a(vciVar2, "downloaded_albums_carousel");
                                        Object K5 = oq5Var3.K();
                                        if (K5 == kjnVar) {
                                            K5 = new rea(i11);
                                            oq5Var3.k0(K5);
                                        }
                                        final int objArr4 = objArr2 == true ? 1 : 0;
                                        up6.i(q022, a5, (Function2) K5, null, 0.0f, 0.0f, 0.0f, null, null, null, false, 0, ild.C(-1477097888, new ryc() { // from class: ifa
                                            @Override // defpackage.ryc
                                            public final Object invoke(Object obj9, Object obj10, Object obj11, Object obj12) {
                                                int i122;
                                                int i13 = objArr4;
                                                int intValue32 = ((Integer) obj9).intValue();
                                                switch (i13) {
                                                    case 0:
                                                        nt ntVar = (nt) obj10;
                                                        hq5 hq5Var32 = (hq5) obj11;
                                                        ((Integer) obj12).getClass();
                                                        ntVar.getClass();
                                                        taj S = y9w.S(ntVar.a, new pv9(1, rfaVar2), hq5Var32);
                                                        x1g x1gVar = ntVar.b;
                                                        w3g w3gVar = (w3g) szf.Q(S.b(), hq5Var32).getValue();
                                                        yci b2 = b.b(vci.a, intValue32);
                                                        oq5 oq5Var32 = (oq5) hq5Var32;
                                                        boolean h32 = oq5Var32.h(S);
                                                        Object K42 = oq5Var32.K();
                                                        kjn kjnVar2 = gq5.a;
                                                        if (h32 || K42 == kjnVar2) {
                                                            K42 = new oea(S, 2);
                                                            oq5Var32.k0(K42);
                                                        }
                                                        Function0 function0 = (Function0) K42;
                                                        boolean h4 = oq5Var32.h(S);
                                                        Object K52 = oq5Var32.K();
                                                        if (h4 || K52 == kjnVar2) {
                                                            K52 = new oea(S, 3);
                                                            oq5Var32.k0(K52);
                                                        }
                                                        w1g.a(function0, x1gVar, w3gVar, b2, false, (Function0) K52, oq5Var32, 0, 16);
                                                        break;
                                                    default:
                                                        bvl bvlVar = (bvl) obj10;
                                                        hq5 hq5Var4 = (hq5) obj11;
                                                        int intValue4 = ((Integer) obj12).intValue();
                                                        bvlVar.getClass();
                                                        if ((intValue4 & 6) == 0) {
                                                            i122 = (((oq5) hq5Var4).d(intValue32) ? 4 : 2) | intValue4;
                                                        } else {
                                                            i122 = intValue4;
                                                        }
                                                        if ((intValue4 & 48) == 0) {
                                                            i122 |= ((oq5) hq5Var4).f(bvlVar) ? 32 : 16;
                                                        }
                                                        oq5 oq5Var4 = (oq5) hq5Var4;
                                                        if (oq5Var4.P(i122 & 1, (i122 & 147) != 146)) {
                                                            Object obj13 = bvlVar.b;
                                                            rfa rfaVar3 = rfaVar2;
                                                            rfaVar3.getClass();
                                                            obj13.getClass();
                                                            boolean f2 = oq5Var4.f(obj13);
                                                            Object K6 = oq5Var4.K();
                                                            Object obj14 = gq5.a;
                                                            if (f2 || K6 == obj14) {
                                                                K6 = new xpd(obj13, new bnd(26, rfaVar3));
                                                                oq5Var4.k0(K6);
                                                            }
                                                            xpd xpdVar = (xpd) K6;
                                                            rab rabVar = bvlVar.a;
                                                            boolean h5 = oq5Var4.h(xpdVar);
                                                            Object K7 = oq5Var4.K();
                                                            if (h5 || K7 == obj14) {
                                                                K7 = new kfa(xpdVar, 0);
                                                                oq5Var4.k0(K7);
                                                            }
                                                            swf.j(0, 24, oq5Var4, rabVar, b.b(vci.a, intValue32), (Function0) K7, null, false);
                                                        } else {
                                                            oq5Var4.S();
                                                        }
                                                        break;
                                                }
                                                return Unit.a;
                                            }
                                        }, oq5Var3), oq5Var3, 432, 384, 4088);
                                    } else {
                                        oq5Var3.S();
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    }, 727016313, true), 2);
                }
                return Unit.a;
            case 8:
                List list4 = (List) obj5;
                vuf vufVar5 = (vuf) obj;
                vufVar5.getClass();
                vufVar5.Z(list4.size(), null, new bl(21, list4, false), new wn5(new n50(list4, (rja) obj4, (mm6) obj3, (fvf) obj2, 1), -1091073711, true));
                return Unit.a;
            case 9:
                t0d t0dVar = (t0d) obj5;
                e0d e0dVar = (e0d) obj4;
                arf arfVar = (arf) obj3;
                arf arfVar2 = (arf) obj2;
                ((is6) obj).getClass();
                if (arfVar == null) {
                    arfVar = btf.b(new htb(16));
                }
                return new c1d(t0dVar, e0dVar, arfVar, arfVar2);
            case 10:
                final ArrayList arrayList4 = (ArrayList) obj5;
                final ArrayList arrayList5 = (ArrayList) obj4;
                final ArrayList arrayList6 = (ArrayList) obj3;
                final r5h r5hVar = (r5h) obj2;
                vuf vufVar6 = (vuf) obj;
                vufVar6.getClass();
                if (!arrayList4.isEmpty()) {
                    vuf.Y(vufVar6, null, new wn5(new pyc() { // from class: o5h
                        @Override // defpackage.pyc
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            int i10 = i8;
                            kjn kjnVar = gq5.a;
                            ArrayList arrayList7 = arrayList4;
                            final r5h r5hVar2 = r5hVar;
                            final int i11 = 1;
                            switch (i10) {
                                case 0:
                                    hq5 hq5Var = (hq5) obj7;
                                    int intValue = ((Integer) obj8).intValue();
                                    ((a) obj6).getClass();
                                    oq5 oq5Var = (oq5) hq5Var;
                                    if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                                        yci a = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(vci.a, 0.0f, 8, 0.0f, 4, 5), "kids_tracks_header");
                                        String M = rvf.M(R.string.kids_episode_title, oq5Var);
                                        boolean h = oq5Var.h(r5hVar2);
                                        Object K = oq5Var.K();
                                        if (h || K == kjnVar) {
                                            K = new Function0() { // from class: p5h
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i11) {
                                                        case 0:
                                                            ((vni) r5hVar2.c.b).b(new vef());
                                                            break;
                                                        case 1:
                                                            ((vni) r5hVar2.c.b).b(new wgf());
                                                            break;
                                                        default:
                                                            ((vni) r5hVar2.c.b).b(new ycf());
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            oq5Var.k0(K);
                                        }
                                        irf.h(M, a, null, null, arrayList7.size() > 5 ? (Function0) K : null, false, null, false, null, oq5Var, 48, 492);
                                    } else {
                                        oq5Var.S();
                                    }
                                    break;
                                case 1:
                                    hq5 hq5Var2 = (hq5) obj7;
                                    int intValue2 = ((Integer) obj8).intValue();
                                    ((a) obj6).getClass();
                                    oq5 oq5Var2 = (oq5) hq5Var2;
                                    if (oq5Var2.P(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        vci vciVar = vci.a;
                                        yci a2 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 32, 0.0f, 8, 5), "kids_albums_header");
                                        String M2 = rvf.M(R.string.kids_subscribes_title, oq5Var2);
                                        boolean h2 = oq5Var2.h(r5hVar2);
                                        Object K2 = oq5Var2.K();
                                        if (h2 || K2 == kjnVar) {
                                            final int i12 = 2;
                                            K2 = new Function0() { // from class: p5h
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i12) {
                                                        case 0:
                                                            ((vni) r5hVar2.c.b).b(new vef());
                                                            break;
                                                        case 1:
                                                            ((vni) r5hVar2.c.b).b(new wgf());
                                                            break;
                                                        default:
                                                            ((vni) r5hVar2.c.b).b(new ycf());
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            oq5Var2.k0(K2);
                                        }
                                        irf.h(M2, a2, null, null, arrayList7.size() > 8 ? (Function0) K2 : null, false, null, false, null, oq5Var2, 48, 492);
                                        up6.i(CollectionsKt.q0(arrayList7, 8), androidx.compose.ui.platform.a.a(vciVar, "albums_lazy_row"), null, null, 0.0f, 0.0f, 0.0f, null, null, null, false, 0, ild.C(340308718, new ryc() { // from class: q5h
                                            @Override // defpackage.ryc
                                            public final Object invoke(Object obj9, Object obj10, Object obj11, Object obj12) {
                                                int i13;
                                                int i14 = i11;
                                                int intValue3 = ((Integer) obj9).intValue();
                                                switch (i14) {
                                                    case 0:
                                                        bvl bvlVar = (bvl) obj10;
                                                        hq5 hq5Var3 = (hq5) obj11;
                                                        int intValue4 = ((Integer) obj12).intValue();
                                                        bvlVar.getClass();
                                                        if ((intValue4 & 6) == 0) {
                                                            i13 = (((oq5) hq5Var3).d(intValue3) ? 4 : 2) | intValue4;
                                                        } else {
                                                            i13 = intValue4;
                                                        }
                                                        if ((intValue4 & 48) == 0) {
                                                            i13 |= ((oq5) hq5Var3).f(bvlVar) ? 32 : 16;
                                                        }
                                                        oq5 oq5Var3 = (oq5) hq5Var3;
                                                        if (oq5Var3.P(i13 & 1, (i13 & 147) != 146)) {
                                                            Object obj13 = bvlVar.b;
                                                            r5h r5hVar3 = r5hVar2;
                                                            r5hVar3.getClass();
                                                            obj13.getClass();
                                                            boolean f2 = oq5Var3.f(obj13);
                                                            Object K3 = oq5Var3.K();
                                                            Object obj14 = gq5.a;
                                                            if (f2 || K3 == obj14) {
                                                                K3 = new xpd(obj13, new qec(11, r5hVar3));
                                                                oq5Var3.k0(K3);
                                                            }
                                                            xpd xpdVar = (xpd) K3;
                                                            rab rabVar = bvlVar.a;
                                                            boolean h3 = oq5Var3.h(xpdVar);
                                                            Object K4 = oq5Var3.K();
                                                            if (h3 || K4 == obj14) {
                                                                K4 = new kfa(xpdVar, 1);
                                                                oq5Var3.k0(K4);
                                                            }
                                                            swf.j(0, 24, oq5Var3, rabVar, b.b(vci.a, intValue3), (Function0) K4, null, false);
                                                        } else {
                                                            oq5Var3.S();
                                                        }
                                                        break;
                                                    default:
                                                        ot otVar = (ot) obj10;
                                                        hq5 hq5Var4 = (hq5) obj11;
                                                        ((Integer) obj12).getClass();
                                                        otVar.getClass();
                                                        taj S = y9w.S(otVar.a, new h4b(r5hVar2), hq5Var4);
                                                        x1g x1gVar = otVar.b;
                                                        w3g w3gVar = (w3g) szf.Q(S.b(), hq5Var4).getValue();
                                                        yci b2 = b.b(vci.a, intValue3);
                                                        oq5 oq5Var4 = (oq5) hq5Var4;
                                                        boolean h4 = oq5Var4.h(S);
                                                        Object K5 = oq5Var4.K();
                                                        kjn kjnVar2 = gq5.a;
                                                        if (h4 || K5 == kjnVar2) {
                                                            K5 = new oea(S, 6);
                                                            oq5Var4.k0(K5);
                                                        }
                                                        Function0 function0 = (Function0) K5;
                                                        boolean h5 = oq5Var4.h(S);
                                                        Object K6 = oq5Var4.K();
                                                        if (h5 || K6 == kjnVar2) {
                                                            K6 = new oea(S, 7);
                                                            oq5Var4.k0(K6);
                                                        }
                                                        w1g.a(function0, x1gVar, w3gVar, b2, false, (Function0) K6, oq5Var4, 0, 16);
                                                        break;
                                                }
                                                return Unit.a;
                                            }
                                        }, oq5Var2), oq5Var2, 48, 384, 4092);
                                    } else {
                                        oq5Var2.S();
                                    }
                                    break;
                                default:
                                    hq5 hq5Var3 = (hq5) obj7;
                                    int intValue3 = ((Integer) obj8).intValue();
                                    ((a) obj6).getClass();
                                    oq5 oq5Var3 = (oq5) hq5Var3;
                                    if (oq5Var3.P(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        vci vciVar2 = vci.a;
                                        yci a3 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, 32, 0.0f, 8, 5), "kids_playlists_header");
                                        String M3 = rvf.M(R.string.playlists, oq5Var3);
                                        boolean h3 = oq5Var3.h(r5hVar2);
                                        Object K3 = oq5Var3.K();
                                        if (h3 || K3 == kjnVar) {
                                            final int i13 = r10 ? 1 : 0;
                                            K3 = new Function0() { // from class: p5h
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i13) {
                                                        case 0:
                                                            ((vni) r5hVar2.c.b).b(new vef());
                                                            break;
                                                        case 1:
                                                            ((vni) r5hVar2.c.b).b(new wgf());
                                                            break;
                                                        default:
                                                            ((vni) r5hVar2.c.b).b(new ycf());
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            oq5Var3.k0(K3);
                                        }
                                        irf.h(M3, a3, null, null, arrayList7.size() > 8 ? (Function0) K3 : null, false, null, false, null, oq5Var3, 48, 492);
                                        List q02 = CollectionsKt.q0(arrayList7, 8);
                                        yci a4 = androidx.compose.ui.platform.a.a(vciVar2, "playlists_lazy_row");
                                        final int i14 = r10 ? 1 : 0;
                                        up6.i(q02, a4, null, null, 0.0f, 0.0f, 0.0f, null, null, null, false, 0, ild.C(423532409, new ryc() { // from class: q5h
                                            @Override // defpackage.ryc
                                            public final Object invoke(Object obj9, Object obj10, Object obj11, Object obj12) {
                                                int i132;
                                                int i142 = i14;
                                                int intValue32 = ((Integer) obj9).intValue();
                                                switch (i142) {
                                                    case 0:
                                                        bvl bvlVar = (bvl) obj10;
                                                        hq5 hq5Var32 = (hq5) obj11;
                                                        int intValue4 = ((Integer) obj12).intValue();
                                                        bvlVar.getClass();
                                                        if ((intValue4 & 6) == 0) {
                                                            i132 = (((oq5) hq5Var32).d(intValue32) ? 4 : 2) | intValue4;
                                                        } else {
                                                            i132 = intValue4;
                                                        }
                                                        if ((intValue4 & 48) == 0) {
                                                            i132 |= ((oq5) hq5Var32).f(bvlVar) ? 32 : 16;
                                                        }
                                                        oq5 oq5Var32 = (oq5) hq5Var32;
                                                        if (oq5Var32.P(i132 & 1, (i132 & 147) != 146)) {
                                                            Object obj13 = bvlVar.b;
                                                            r5h r5hVar3 = r5hVar2;
                                                            r5hVar3.getClass();
                                                            obj13.getClass();
                                                            boolean f2 = oq5Var32.f(obj13);
                                                            Object K32 = oq5Var32.K();
                                                            Object obj14 = gq5.a;
                                                            if (f2 || K32 == obj14) {
                                                                K32 = new xpd(obj13, new qec(11, r5hVar3));
                                                                oq5Var32.k0(K32);
                                                            }
                                                            xpd xpdVar = (xpd) K32;
                                                            rab rabVar = bvlVar.a;
                                                            boolean h32 = oq5Var32.h(xpdVar);
                                                            Object K4 = oq5Var32.K();
                                                            if (h32 || K4 == obj14) {
                                                                K4 = new kfa(xpdVar, 1);
                                                                oq5Var32.k0(K4);
                                                            }
                                                            swf.j(0, 24, oq5Var32, rabVar, b.b(vci.a, intValue32), (Function0) K4, null, false);
                                                        } else {
                                                            oq5Var32.S();
                                                        }
                                                        break;
                                                    default:
                                                        ot otVar = (ot) obj10;
                                                        hq5 hq5Var4 = (hq5) obj11;
                                                        ((Integer) obj12).getClass();
                                                        otVar.getClass();
                                                        taj S = y9w.S(otVar.a, new h4b(r5hVar2), hq5Var4);
                                                        x1g x1gVar = otVar.b;
                                                        w3g w3gVar = (w3g) szf.Q(S.b(), hq5Var4).getValue();
                                                        yci b2 = b.b(vci.a, intValue32);
                                                        oq5 oq5Var4 = (oq5) hq5Var4;
                                                        boolean h4 = oq5Var4.h(S);
                                                        Object K5 = oq5Var4.K();
                                                        kjn kjnVar2 = gq5.a;
                                                        if (h4 || K5 == kjnVar2) {
                                                            K5 = new oea(S, 6);
                                                            oq5Var4.k0(K5);
                                                        }
                                                        Function0 function0 = (Function0) K5;
                                                        boolean h5 = oq5Var4.h(S);
                                                        Object K6 = oq5Var4.K();
                                                        if (h5 || K6 == kjnVar2) {
                                                            K6 = new oea(S, 7);
                                                            oq5Var4.k0(K6);
                                                        }
                                                        w1g.a(function0, x1gVar, w3gVar, b2, false, (Function0) K6, oq5Var4, 0, 16);
                                                        break;
                                                }
                                                return Unit.a;
                                            }
                                        }, oq5Var3), oq5Var3, 48, 384, 4092);
                                    } else {
                                        oq5Var3.S();
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    }, -1205922672, true), 3);
                    List q02 = CollectionsKt.q0(arrayList4, 5);
                    vufVar6.Z(q02.size(), null, new zcf(q02, i6), new wn5(new cl(19, q02, r5hVar), -1091073711, true));
                }
                if (!arrayList5.isEmpty()) {
                    vuf.Y(vufVar6, null, new wn5(new pyc() { // from class: o5h
                        @Override // defpackage.pyc
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            int i10 = i9;
                            kjn kjnVar = gq5.a;
                            ArrayList arrayList7 = arrayList5;
                            final r5h r5hVar2 = r5hVar;
                            final int i11 = 1;
                            switch (i10) {
                                case 0:
                                    hq5 hq5Var = (hq5) obj7;
                                    int intValue = ((Integer) obj8).intValue();
                                    ((a) obj6).getClass();
                                    oq5 oq5Var = (oq5) hq5Var;
                                    if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                                        yci a = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(vci.a, 0.0f, 8, 0.0f, 4, 5), "kids_tracks_header");
                                        String M = rvf.M(R.string.kids_episode_title, oq5Var);
                                        boolean h = oq5Var.h(r5hVar2);
                                        Object K = oq5Var.K();
                                        if (h || K == kjnVar) {
                                            K = new Function0() { // from class: p5h
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i11) {
                                                        case 0:
                                                            ((vni) r5hVar2.c.b).b(new vef());
                                                            break;
                                                        case 1:
                                                            ((vni) r5hVar2.c.b).b(new wgf());
                                                            break;
                                                        default:
                                                            ((vni) r5hVar2.c.b).b(new ycf());
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            oq5Var.k0(K);
                                        }
                                        irf.h(M, a, null, null, arrayList7.size() > 5 ? (Function0) K : null, false, null, false, null, oq5Var, 48, 492);
                                    } else {
                                        oq5Var.S();
                                    }
                                    break;
                                case 1:
                                    hq5 hq5Var2 = (hq5) obj7;
                                    int intValue2 = ((Integer) obj8).intValue();
                                    ((a) obj6).getClass();
                                    oq5 oq5Var2 = (oq5) hq5Var2;
                                    if (oq5Var2.P(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        vci vciVar = vci.a;
                                        yci a2 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 32, 0.0f, 8, 5), "kids_albums_header");
                                        String M2 = rvf.M(R.string.kids_subscribes_title, oq5Var2);
                                        boolean h2 = oq5Var2.h(r5hVar2);
                                        Object K2 = oq5Var2.K();
                                        if (h2 || K2 == kjnVar) {
                                            final int i12 = 2;
                                            K2 = new Function0() { // from class: p5h
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i12) {
                                                        case 0:
                                                            ((vni) r5hVar2.c.b).b(new vef());
                                                            break;
                                                        case 1:
                                                            ((vni) r5hVar2.c.b).b(new wgf());
                                                            break;
                                                        default:
                                                            ((vni) r5hVar2.c.b).b(new ycf());
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            oq5Var2.k0(K2);
                                        }
                                        irf.h(M2, a2, null, null, arrayList7.size() > 8 ? (Function0) K2 : null, false, null, false, null, oq5Var2, 48, 492);
                                        up6.i(CollectionsKt.q0(arrayList7, 8), androidx.compose.ui.platform.a.a(vciVar, "albums_lazy_row"), null, null, 0.0f, 0.0f, 0.0f, null, null, null, false, 0, ild.C(340308718, new ryc() { // from class: q5h
                                            @Override // defpackage.ryc
                                            public final Object invoke(Object obj9, Object obj10, Object obj11, Object obj12) {
                                                int i132;
                                                int i142 = i11;
                                                int intValue32 = ((Integer) obj9).intValue();
                                                switch (i142) {
                                                    case 0:
                                                        bvl bvlVar = (bvl) obj10;
                                                        hq5 hq5Var32 = (hq5) obj11;
                                                        int intValue4 = ((Integer) obj12).intValue();
                                                        bvlVar.getClass();
                                                        if ((intValue4 & 6) == 0) {
                                                            i132 = (((oq5) hq5Var32).d(intValue32) ? 4 : 2) | intValue4;
                                                        } else {
                                                            i132 = intValue4;
                                                        }
                                                        if ((intValue4 & 48) == 0) {
                                                            i132 |= ((oq5) hq5Var32).f(bvlVar) ? 32 : 16;
                                                        }
                                                        oq5 oq5Var32 = (oq5) hq5Var32;
                                                        if (oq5Var32.P(i132 & 1, (i132 & 147) != 146)) {
                                                            Object obj13 = bvlVar.b;
                                                            r5h r5hVar3 = r5hVar2;
                                                            r5hVar3.getClass();
                                                            obj13.getClass();
                                                            boolean f2 = oq5Var32.f(obj13);
                                                            Object K32 = oq5Var32.K();
                                                            Object obj14 = gq5.a;
                                                            if (f2 || K32 == obj14) {
                                                                K32 = new xpd(obj13, new qec(11, r5hVar3));
                                                                oq5Var32.k0(K32);
                                                            }
                                                            xpd xpdVar = (xpd) K32;
                                                            rab rabVar = bvlVar.a;
                                                            boolean h32 = oq5Var32.h(xpdVar);
                                                            Object K4 = oq5Var32.K();
                                                            if (h32 || K4 == obj14) {
                                                                K4 = new kfa(xpdVar, 1);
                                                                oq5Var32.k0(K4);
                                                            }
                                                            swf.j(0, 24, oq5Var32, rabVar, b.b(vci.a, intValue32), (Function0) K4, null, false);
                                                        } else {
                                                            oq5Var32.S();
                                                        }
                                                        break;
                                                    default:
                                                        ot otVar = (ot) obj10;
                                                        hq5 hq5Var4 = (hq5) obj11;
                                                        ((Integer) obj12).getClass();
                                                        otVar.getClass();
                                                        taj S = y9w.S(otVar.a, new h4b(r5hVar2), hq5Var4);
                                                        x1g x1gVar = otVar.b;
                                                        w3g w3gVar = (w3g) szf.Q(S.b(), hq5Var4).getValue();
                                                        yci b2 = b.b(vci.a, intValue32);
                                                        oq5 oq5Var4 = (oq5) hq5Var4;
                                                        boolean h4 = oq5Var4.h(S);
                                                        Object K5 = oq5Var4.K();
                                                        kjn kjnVar2 = gq5.a;
                                                        if (h4 || K5 == kjnVar2) {
                                                            K5 = new oea(S, 6);
                                                            oq5Var4.k0(K5);
                                                        }
                                                        Function0 function0 = (Function0) K5;
                                                        boolean h5 = oq5Var4.h(S);
                                                        Object K6 = oq5Var4.K();
                                                        if (h5 || K6 == kjnVar2) {
                                                            K6 = new oea(S, 7);
                                                            oq5Var4.k0(K6);
                                                        }
                                                        w1g.a(function0, x1gVar, w3gVar, b2, false, (Function0) K6, oq5Var4, 0, 16);
                                                        break;
                                                }
                                                return Unit.a;
                                            }
                                        }, oq5Var2), oq5Var2, 48, 384, 4092);
                                    } else {
                                        oq5Var2.S();
                                    }
                                    break;
                                default:
                                    hq5 hq5Var3 = (hq5) obj7;
                                    int intValue3 = ((Integer) obj8).intValue();
                                    ((a) obj6).getClass();
                                    oq5 oq5Var3 = (oq5) hq5Var3;
                                    if (oq5Var3.P(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        vci vciVar2 = vci.a;
                                        yci a3 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, 32, 0.0f, 8, 5), "kids_playlists_header");
                                        String M3 = rvf.M(R.string.playlists, oq5Var3);
                                        boolean h3 = oq5Var3.h(r5hVar2);
                                        Object K3 = oq5Var3.K();
                                        if (h3 || K3 == kjnVar) {
                                            final int i13 = r10 ? 1 : 0;
                                            K3 = new Function0() { // from class: p5h
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i13) {
                                                        case 0:
                                                            ((vni) r5hVar2.c.b).b(new vef());
                                                            break;
                                                        case 1:
                                                            ((vni) r5hVar2.c.b).b(new wgf());
                                                            break;
                                                        default:
                                                            ((vni) r5hVar2.c.b).b(new ycf());
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            oq5Var3.k0(K3);
                                        }
                                        irf.h(M3, a3, null, null, arrayList7.size() > 8 ? (Function0) K3 : null, false, null, false, null, oq5Var3, 48, 492);
                                        List q022 = CollectionsKt.q0(arrayList7, 8);
                                        yci a4 = androidx.compose.ui.platform.a.a(vciVar2, "playlists_lazy_row");
                                        final int i14 = r10 ? 1 : 0;
                                        up6.i(q022, a4, null, null, 0.0f, 0.0f, 0.0f, null, null, null, false, 0, ild.C(423532409, new ryc() { // from class: q5h
                                            @Override // defpackage.ryc
                                            public final Object invoke(Object obj9, Object obj10, Object obj11, Object obj12) {
                                                int i132;
                                                int i142 = i14;
                                                int intValue32 = ((Integer) obj9).intValue();
                                                switch (i142) {
                                                    case 0:
                                                        bvl bvlVar = (bvl) obj10;
                                                        hq5 hq5Var32 = (hq5) obj11;
                                                        int intValue4 = ((Integer) obj12).intValue();
                                                        bvlVar.getClass();
                                                        if ((intValue4 & 6) == 0) {
                                                            i132 = (((oq5) hq5Var32).d(intValue32) ? 4 : 2) | intValue4;
                                                        } else {
                                                            i132 = intValue4;
                                                        }
                                                        if ((intValue4 & 48) == 0) {
                                                            i132 |= ((oq5) hq5Var32).f(bvlVar) ? 32 : 16;
                                                        }
                                                        oq5 oq5Var32 = (oq5) hq5Var32;
                                                        if (oq5Var32.P(i132 & 1, (i132 & 147) != 146)) {
                                                            Object obj13 = bvlVar.b;
                                                            r5h r5hVar3 = r5hVar2;
                                                            r5hVar3.getClass();
                                                            obj13.getClass();
                                                            boolean f2 = oq5Var32.f(obj13);
                                                            Object K32 = oq5Var32.K();
                                                            Object obj14 = gq5.a;
                                                            if (f2 || K32 == obj14) {
                                                                K32 = new xpd(obj13, new qec(11, r5hVar3));
                                                                oq5Var32.k0(K32);
                                                            }
                                                            xpd xpdVar = (xpd) K32;
                                                            rab rabVar = bvlVar.a;
                                                            boolean h32 = oq5Var32.h(xpdVar);
                                                            Object K4 = oq5Var32.K();
                                                            if (h32 || K4 == obj14) {
                                                                K4 = new kfa(xpdVar, 1);
                                                                oq5Var32.k0(K4);
                                                            }
                                                            swf.j(0, 24, oq5Var32, rabVar, b.b(vci.a, intValue32), (Function0) K4, null, false);
                                                        } else {
                                                            oq5Var32.S();
                                                        }
                                                        break;
                                                    default:
                                                        ot otVar = (ot) obj10;
                                                        hq5 hq5Var4 = (hq5) obj11;
                                                        ((Integer) obj12).getClass();
                                                        otVar.getClass();
                                                        taj S = y9w.S(otVar.a, new h4b(r5hVar2), hq5Var4);
                                                        x1g x1gVar = otVar.b;
                                                        w3g w3gVar = (w3g) szf.Q(S.b(), hq5Var4).getValue();
                                                        yci b2 = b.b(vci.a, intValue32);
                                                        oq5 oq5Var4 = (oq5) hq5Var4;
                                                        boolean h4 = oq5Var4.h(S);
                                                        Object K5 = oq5Var4.K();
                                                        kjn kjnVar2 = gq5.a;
                                                        if (h4 || K5 == kjnVar2) {
                                                            K5 = new oea(S, 6);
                                                            oq5Var4.k0(K5);
                                                        }
                                                        Function0 function0 = (Function0) K5;
                                                        boolean h5 = oq5Var4.h(S);
                                                        Object K6 = oq5Var4.K();
                                                        if (h5 || K6 == kjnVar2) {
                                                            K6 = new oea(S, 7);
                                                            oq5Var4.k0(K6);
                                                        }
                                                        w1g.a(function0, x1gVar, w3gVar, b2, false, (Function0) K6, oq5Var4, 0, 16);
                                                        break;
                                                }
                                                return Unit.a;
                                            }
                                        }, oq5Var3), oq5Var3, 48, 384, 4092);
                                    } else {
                                        oq5Var3.S();
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    }, 1016784455, true), 3);
                }
                if (!arrayList6.isEmpty()) {
                    vuf.Y(vufVar6, null, new wn5(new pyc() { // from class: o5h
                        @Override // defpackage.pyc
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            int i10 = i7;
                            kjn kjnVar = gq5.a;
                            ArrayList arrayList7 = arrayList6;
                            final r5h r5hVar2 = r5hVar;
                            final int i11 = 1;
                            switch (i10) {
                                case 0:
                                    hq5 hq5Var = (hq5) obj7;
                                    int intValue = ((Integer) obj8).intValue();
                                    ((a) obj6).getClass();
                                    oq5 oq5Var = (oq5) hq5Var;
                                    if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                                        yci a = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(vci.a, 0.0f, 8, 0.0f, 4, 5), "kids_tracks_header");
                                        String M = rvf.M(R.string.kids_episode_title, oq5Var);
                                        boolean h = oq5Var.h(r5hVar2);
                                        Object K = oq5Var.K();
                                        if (h || K == kjnVar) {
                                            K = new Function0() { // from class: p5h
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i11) {
                                                        case 0:
                                                            ((vni) r5hVar2.c.b).b(new vef());
                                                            break;
                                                        case 1:
                                                            ((vni) r5hVar2.c.b).b(new wgf());
                                                            break;
                                                        default:
                                                            ((vni) r5hVar2.c.b).b(new ycf());
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            oq5Var.k0(K);
                                        }
                                        irf.h(M, a, null, null, arrayList7.size() > 5 ? (Function0) K : null, false, null, false, null, oq5Var, 48, 492);
                                    } else {
                                        oq5Var.S();
                                    }
                                    break;
                                case 1:
                                    hq5 hq5Var2 = (hq5) obj7;
                                    int intValue2 = ((Integer) obj8).intValue();
                                    ((a) obj6).getClass();
                                    oq5 oq5Var2 = (oq5) hq5Var2;
                                    if (oq5Var2.P(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        vci vciVar = vci.a;
                                        yci a2 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 32, 0.0f, 8, 5), "kids_albums_header");
                                        String M2 = rvf.M(R.string.kids_subscribes_title, oq5Var2);
                                        boolean h2 = oq5Var2.h(r5hVar2);
                                        Object K2 = oq5Var2.K();
                                        if (h2 || K2 == kjnVar) {
                                            final int i12 = 2;
                                            K2 = new Function0() { // from class: p5h
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i12) {
                                                        case 0:
                                                            ((vni) r5hVar2.c.b).b(new vef());
                                                            break;
                                                        case 1:
                                                            ((vni) r5hVar2.c.b).b(new wgf());
                                                            break;
                                                        default:
                                                            ((vni) r5hVar2.c.b).b(new ycf());
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            oq5Var2.k0(K2);
                                        }
                                        irf.h(M2, a2, null, null, arrayList7.size() > 8 ? (Function0) K2 : null, false, null, false, null, oq5Var2, 48, 492);
                                        up6.i(CollectionsKt.q0(arrayList7, 8), androidx.compose.ui.platform.a.a(vciVar, "albums_lazy_row"), null, null, 0.0f, 0.0f, 0.0f, null, null, null, false, 0, ild.C(340308718, new ryc() { // from class: q5h
                                            @Override // defpackage.ryc
                                            public final Object invoke(Object obj9, Object obj10, Object obj11, Object obj12) {
                                                int i132;
                                                int i142 = i11;
                                                int intValue32 = ((Integer) obj9).intValue();
                                                switch (i142) {
                                                    case 0:
                                                        bvl bvlVar = (bvl) obj10;
                                                        hq5 hq5Var32 = (hq5) obj11;
                                                        int intValue4 = ((Integer) obj12).intValue();
                                                        bvlVar.getClass();
                                                        if ((intValue4 & 6) == 0) {
                                                            i132 = (((oq5) hq5Var32).d(intValue32) ? 4 : 2) | intValue4;
                                                        } else {
                                                            i132 = intValue4;
                                                        }
                                                        if ((intValue4 & 48) == 0) {
                                                            i132 |= ((oq5) hq5Var32).f(bvlVar) ? 32 : 16;
                                                        }
                                                        oq5 oq5Var32 = (oq5) hq5Var32;
                                                        if (oq5Var32.P(i132 & 1, (i132 & 147) != 146)) {
                                                            Object obj13 = bvlVar.b;
                                                            r5h r5hVar3 = r5hVar2;
                                                            r5hVar3.getClass();
                                                            obj13.getClass();
                                                            boolean f2 = oq5Var32.f(obj13);
                                                            Object K32 = oq5Var32.K();
                                                            Object obj14 = gq5.a;
                                                            if (f2 || K32 == obj14) {
                                                                K32 = new xpd(obj13, new qec(11, r5hVar3));
                                                                oq5Var32.k0(K32);
                                                            }
                                                            xpd xpdVar = (xpd) K32;
                                                            rab rabVar = bvlVar.a;
                                                            boolean h32 = oq5Var32.h(xpdVar);
                                                            Object K4 = oq5Var32.K();
                                                            if (h32 || K4 == obj14) {
                                                                K4 = new kfa(xpdVar, 1);
                                                                oq5Var32.k0(K4);
                                                            }
                                                            swf.j(0, 24, oq5Var32, rabVar, b.b(vci.a, intValue32), (Function0) K4, null, false);
                                                        } else {
                                                            oq5Var32.S();
                                                        }
                                                        break;
                                                    default:
                                                        ot otVar = (ot) obj10;
                                                        hq5 hq5Var4 = (hq5) obj11;
                                                        ((Integer) obj12).getClass();
                                                        otVar.getClass();
                                                        taj S = y9w.S(otVar.a, new h4b(r5hVar2), hq5Var4);
                                                        x1g x1gVar = otVar.b;
                                                        w3g w3gVar = (w3g) szf.Q(S.b(), hq5Var4).getValue();
                                                        yci b2 = b.b(vci.a, intValue32);
                                                        oq5 oq5Var4 = (oq5) hq5Var4;
                                                        boolean h4 = oq5Var4.h(S);
                                                        Object K5 = oq5Var4.K();
                                                        kjn kjnVar2 = gq5.a;
                                                        if (h4 || K5 == kjnVar2) {
                                                            K5 = new oea(S, 6);
                                                            oq5Var4.k0(K5);
                                                        }
                                                        Function0 function0 = (Function0) K5;
                                                        boolean h5 = oq5Var4.h(S);
                                                        Object K6 = oq5Var4.K();
                                                        if (h5 || K6 == kjnVar2) {
                                                            K6 = new oea(S, 7);
                                                            oq5Var4.k0(K6);
                                                        }
                                                        w1g.a(function0, x1gVar, w3gVar, b2, false, (Function0) K6, oq5Var4, 0, 16);
                                                        break;
                                                }
                                                return Unit.a;
                                            }
                                        }, oq5Var2), oq5Var2, 48, 384, 4092);
                                    } else {
                                        oq5Var2.S();
                                    }
                                    break;
                                default:
                                    hq5 hq5Var3 = (hq5) obj7;
                                    int intValue3 = ((Integer) obj8).intValue();
                                    ((a) obj6).getClass();
                                    oq5 oq5Var3 = (oq5) hq5Var3;
                                    if (oq5Var3.P(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        vci vciVar2 = vci.a;
                                        yci a3 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, 32, 0.0f, 8, 5), "kids_playlists_header");
                                        String M3 = rvf.M(R.string.playlists, oq5Var3);
                                        boolean h3 = oq5Var3.h(r5hVar2);
                                        Object K3 = oq5Var3.K();
                                        if (h3 || K3 == kjnVar) {
                                            final int i13 = r10 ? 1 : 0;
                                            K3 = new Function0() { // from class: p5h
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i13) {
                                                        case 0:
                                                            ((vni) r5hVar2.c.b).b(new vef());
                                                            break;
                                                        case 1:
                                                            ((vni) r5hVar2.c.b).b(new wgf());
                                                            break;
                                                        default:
                                                            ((vni) r5hVar2.c.b).b(new ycf());
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            oq5Var3.k0(K3);
                                        }
                                        irf.h(M3, a3, null, null, arrayList7.size() > 8 ? (Function0) K3 : null, false, null, false, null, oq5Var3, 48, 492);
                                        List q022 = CollectionsKt.q0(arrayList7, 8);
                                        yci a4 = androidx.compose.ui.platform.a.a(vciVar2, "playlists_lazy_row");
                                        final int i14 = r10 ? 1 : 0;
                                        up6.i(q022, a4, null, null, 0.0f, 0.0f, 0.0f, null, null, null, false, 0, ild.C(423532409, new ryc() { // from class: q5h
                                            @Override // defpackage.ryc
                                            public final Object invoke(Object obj9, Object obj10, Object obj11, Object obj12) {
                                                int i132;
                                                int i142 = i14;
                                                int intValue32 = ((Integer) obj9).intValue();
                                                switch (i142) {
                                                    case 0:
                                                        bvl bvlVar = (bvl) obj10;
                                                        hq5 hq5Var32 = (hq5) obj11;
                                                        int intValue4 = ((Integer) obj12).intValue();
                                                        bvlVar.getClass();
                                                        if ((intValue4 & 6) == 0) {
                                                            i132 = (((oq5) hq5Var32).d(intValue32) ? 4 : 2) | intValue4;
                                                        } else {
                                                            i132 = intValue4;
                                                        }
                                                        if ((intValue4 & 48) == 0) {
                                                            i132 |= ((oq5) hq5Var32).f(bvlVar) ? 32 : 16;
                                                        }
                                                        oq5 oq5Var32 = (oq5) hq5Var32;
                                                        if (oq5Var32.P(i132 & 1, (i132 & 147) != 146)) {
                                                            Object obj13 = bvlVar.b;
                                                            r5h r5hVar3 = r5hVar2;
                                                            r5hVar3.getClass();
                                                            obj13.getClass();
                                                            boolean f2 = oq5Var32.f(obj13);
                                                            Object K32 = oq5Var32.K();
                                                            Object obj14 = gq5.a;
                                                            if (f2 || K32 == obj14) {
                                                                K32 = new xpd(obj13, new qec(11, r5hVar3));
                                                                oq5Var32.k0(K32);
                                                            }
                                                            xpd xpdVar = (xpd) K32;
                                                            rab rabVar = bvlVar.a;
                                                            boolean h32 = oq5Var32.h(xpdVar);
                                                            Object K4 = oq5Var32.K();
                                                            if (h32 || K4 == obj14) {
                                                                K4 = new kfa(xpdVar, 1);
                                                                oq5Var32.k0(K4);
                                                            }
                                                            swf.j(0, 24, oq5Var32, rabVar, b.b(vci.a, intValue32), (Function0) K4, null, false);
                                                        } else {
                                                            oq5Var32.S();
                                                        }
                                                        break;
                                                    default:
                                                        ot otVar = (ot) obj10;
                                                        hq5 hq5Var4 = (hq5) obj11;
                                                        ((Integer) obj12).getClass();
                                                        otVar.getClass();
                                                        taj S = y9w.S(otVar.a, new h4b(r5hVar2), hq5Var4);
                                                        x1g x1gVar = otVar.b;
                                                        w3g w3gVar = (w3g) szf.Q(S.b(), hq5Var4).getValue();
                                                        yci b2 = b.b(vci.a, intValue32);
                                                        oq5 oq5Var4 = (oq5) hq5Var4;
                                                        boolean h4 = oq5Var4.h(S);
                                                        Object K5 = oq5Var4.K();
                                                        kjn kjnVar2 = gq5.a;
                                                        if (h4 || K5 == kjnVar2) {
                                                            K5 = new oea(S, 6);
                                                            oq5Var4.k0(K5);
                                                        }
                                                        Function0 function0 = (Function0) K5;
                                                        boolean h5 = oq5Var4.h(S);
                                                        Object K6 = oq5Var4.K();
                                                        if (h5 || K6 == kjnVar2) {
                                                            K6 = new oea(S, 7);
                                                            oq5Var4.k0(K6);
                                                        }
                                                        w1g.a(function0, x1gVar, w3gVar, b2, false, (Function0) K6, oq5Var4, 0, 16);
                                                        break;
                                                }
                                                return Unit.a;
                                            }
                                        }, oq5Var3), oq5Var3, 48, 384, 4092);
                                    } else {
                                        oq5Var3.S();
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    }, -2059903224, true), 3);
                }
                return Unit.a;
            case 11:
                lvf lvfVar = (lvf) obj5;
                vuf vufVar7 = (vuf) obj;
                vufVar7.getClass();
                vufVar7.Z(lvfVar.d(), new u8b(9, lvfVar), new u8b(8, lvfVar), new wn5(new ln1(lvfVar, (bmi) obj4, (ynn) obj3, (xli) obj2, 5), -2081211433, true));
                return Unit.a;
            case 12:
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                d dVar = (d) obj;
                dVar.getClass();
                z1 z1Var = ((f) obj5).a;
                z1Var.getClass();
                dVar.a = z1Var;
                dVar.b = (String) obj4;
                str2.getClass();
                dVar.c = str2;
                if (str3 != null && !StringsKt.U(str3)) {
                    dVar.d.put("yandexuid", str3);
                }
                return Unit.a;
            case 13:
                ((is6) obj).getClass();
                return new kvl((Context) obj5, (cvl) obj4, (kxi) obj3, (ivl) obj2);
            case 14:
                vuf vufVar8 = (vuf) obj;
                vufVar8.getClass();
                List list5 = ((j3m) obj5).b;
                vufVar8.Z(list5.size(), new afg(19, new d6h(18), list5), new zcf(list5, 11), new wn5(new n50(list5, (ayn) obj4, (a3m) obj3, (lf5) obj2, 2), -1091073711, true));
                return Unit.a;
            case 15:
                obj.getClass();
                return new a5m((Context) obj5, (z4m) obj4, (String) obj3, (String) obj2);
            case 16:
                ((te) obj).getClass();
                ((rbm) obj5).a.g((u0s) obj4, (jab) obj3, (thj) obj2);
                return Unit.a;
            case 17:
                String str4 = (String) obj4;
                List list6 = (List) obj5;
                Function1 function1 = (Function1) obj3;
                Function1 function12 = (Function1) obj2;
                bsf bsfVar = (bsf) obj;
                bsfVar.getClass();
                if (str4 != null && str4.length() != 0) {
                    bsf.X(bsfVar, new fam(17), new wn5(new mf3(str4, 11), 1032961631, true), 5);
                }
                Iterator it3 = list6.iterator();
                while (it3.hasNext()) {
                    bsf.X(bsfVar, null, new wn5(new vtb(19, (yit) it3.next(), function1, function12), -2103210401, true), 7);
                }
                return Unit.a;
            case 18:
                ((is6) obj).getClass();
                return new ujm((kjm) obj5, (njm) obj4, (k68) obj3, (lkm) obj2);
            case 19:
                iwe iweVar = (iwe) obj3;
                mm6 mm6Var2 = (ltm) obj2;
                uni uniVar = (uni) obj;
                ((rar) obj5).g(null);
                ((tqn) obj4).a = true;
                if (uniVar instanceof tni) {
                    mqs mqsVar = ((tni) uniVar).a;
                    v3w.l("track found - ", mqsVar.c, 3, "RecognizeAudioCenter", null);
                    quk qukVar = (quk) iweVar.c;
                    String str5 = mqsVar.a;
                    qukVar.getClass();
                    str5.getClass();
                    it0.a.a("RECOGNITION_SUCCESS", tah.b(new Pair("track_id", str5)));
                    ylnVar = new amn(mqsVar);
                } else if (Intrinsics.d(uniVar, sni.a)) {
                    ssg.a(3, "RecognizeAudioCenter", "no music detected", null);
                    quk qukVar2 = (quk) iweVar.c;
                    dmn[] dmnVarArr = dmn.a;
                    qukVar2.getClass();
                    it0.a.a("RECOGNITION_FAILURE", tah.b(new Pair("reason", "no_music_detected")));
                    ylnVar = new yln(vln.a);
                } else if (uniVar instanceof rni) {
                    ssg.a(3, "RecognizeAudioCenter", "no match", null);
                    quk qukVar3 = (quk) iweVar.c;
                    dmn[] dmnVarArr2 = dmn.a;
                    qukVar3.getClass();
                    it0.a.a("RECOGNITION_FAILURE", tah.b(new Pair("reason", "track_not_found")));
                    ylnVar = new yln(vln.b);
                } else {
                    if (!(uniVar instanceof qni)) {
                        b6e.s();
                        return null;
                    }
                    ssg.a(3, "RecognizeAudioCenter", "error", null);
                    jue jueVar = ((qni) uniVar).a;
                    if (jueVar instanceof fue) {
                        pair = new Pair(cmn.NETWORK, Integer.valueOf(((fue) jueVar).a));
                    } else if (jueVar instanceof gue) {
                        pair = new Pair(cmn.NETWORK, null);
                    } else if (jueVar instanceof hue) {
                        pair = new Pair(cmn.RECORDER, null);
                    } else {
                        if (!(jueVar instanceof iue)) {
                            b6e.s();
                            return null;
                        }
                        pair = new Pair(cmn.RECORDER, null);
                    }
                    cmn cmnVar = (cmn) pair.a;
                    Integer num = (Integer) pair.b;
                    ((quk) iweVar.c).getClass();
                    cmnVar.getClass();
                    f9h f9hVar = new f9h();
                    f9hVar.put("errorType", cmnVar.a);
                    if (num != null) {
                        f9hVar.put("code", Integer.valueOf(num.intValue()));
                    }
                    it0.a.a("RECOGNITION_ERROR", f9hVar.b());
                    ylnVar = new yln(vln.c);
                }
                oc4 oc4Var = (oc4) mm6Var2;
                oc4Var.c(ylnVar);
                oc4Var.p0(null);
                return Unit.a;
            case 20:
                List list7 = (List) obj5;
                s2p s2pVar = (s2p) obj3;
                vuf vufVar9 = (vuf) obj;
                vufVar9.getClass();
                vuf.Y(vufVar9, null, new wn5(new tik(i3, (c0p) obj4), -305942880, true), 3);
                vufVar9.Z(list7.size(), null, new zcf(list7, i2), new wn5(new cl(26, list7, s2pVar), -1091073711, true));
                vuf.Y(vufVar9, null, new wn5(new tik(14, s2pVar), -944235561, true), 3);
                vuf.Y(vufVar9, null, etn.n, 3);
                float f2 = 0;
                vuf.Y(vufVar9, "bottom_empty_space", new wn5(new r2p((fvf) obj2, f2, new q0k(f2, f2, f2, f2), 1), -487688892, true), 2);
                return Unit.a;
            case 21:
                Float valueOf = Float.valueOf(1.0f);
                xdr xdrVar = (xdr) ((bqi) obj5);
                xdrVar.getClass();
                xdrVar.m(null, valueOf);
                xdr xdrVar2 = (xdr) ((bqi) obj4);
                xdrVar2.getClass();
                xdrVar2.m(null, valueOf);
                ((ExoPlayer) obj3).x0((szq) obj2);
                return Unit.a;
            case 22:
                Float valueOf2 = Float.valueOf(1.0f);
                xdr xdrVar3 = (xdr) ((bqi) obj5);
                xdrVar3.getClass();
                xdrVar3.m(null, valueOf2);
                xdr xdrVar4 = (xdr) ((bqi) obj4);
                xdrVar4.getClass();
                xdrVar4.m(null, valueOf2);
                ((ExoPlayer) obj3).x0((szq) obj2);
                return Unit.a;
            case 23:
                g9r g9rVar = (g9r) obj3;
                plv plvVar = (plv) obj2;
                j9r j9rVar = (j9r) obj;
                j9rVar.getClass();
                wn5 wn5Var3 = new wn5(new ion((wn5) obj4, i4), 1822520875, true);
                ArrayList arrayList7 = j9rVar.a;
                arrayList7.add(wn5Var3);
                Iterator it4 = ((List) obj5).iterator();
                while (it4.hasNext()) {
                    arrayList7.add(new wn5(new h9r(g9rVar, plvVar, (flv) it4.next()), 1213666944, true));
                }
                return Unit.a;
            case 24:
                Function1 function13 = (Function1) obj4;
                w3h w3hVar = (w3h) obj3;
                Function0 function0 = (Function0) obj2;
                float f3 = (int) (((iur) ((pfm) obj5)).y >> 32);
                float f4 = 0.15f * f3;
                float f5 = f3 * 0.85f;
                float e = enj.e(((enj) obj).a);
                if (f4 > e || e > f5) {
                    function0.invoke();
                } else {
                    function13.invoke(w3hVar);
                }
                return Unit.a;
            case 25:
                fk0 fk0Var = (fk0) obj5;
                fk0 fk0Var2 = (fk0) obj4;
                fk0 fk0Var3 = (fk0) obj3;
                jpa jpaVar = (jpa) obj;
                jpaVar.getClass();
                jpa.D0(jpaVar, d85.f, ((Number) fk0Var2.e()).floatValue() * (nmq.c(jpaVar.e()) / 2), 0L, ((Number) fk0Var3.e()).floatValue(), ((Boolean) ((aqi) obj2).getValue()).booleanValue() ? dbc.a : new amr(jpaVar.n0(((Number) fk0Var.e()).floatValue()), 0.0f, 1, 0, 26), 0, 100);
                return Unit.a;
            case 26:
                ksk kskVar = (ksk) obj5;
                ksk kskVar2 = (ksk) obj3;
                jsk jskVar = (jsk) obj;
                jskVar.getClass();
                if (kskVar != null) {
                    jsk.g(jskVar, kskVar, ((Number) obj4).intValue(), 0);
                }
                if (kskVar2 != null) {
                    jsk.g(jskVar, kskVar2, ((Number) obj2).intValue(), 0);
                }
                return Unit.a;
            case 27:
                aqi aqiVar = (aqi) obj5;
                Bundle bundle = (Bundle) obj4;
                String str6 = ((i) obj3).a;
                WebView webView = (WebView) obj2;
                ((FrameLayout) obj).getClass();
                if (((CharSequence) aqiVar.getValue()).length() == 0) {
                    if (bundle.isEmpty()) {
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Open url: " + ((Object) com.yandex.passport.common.url.b.m(str6)), 8);
                        }
                        webView.loadUrl(str6);
                    } else {
                        webView.restoreState(bundle);
                    }
                    aqiVar.setValue(str6);
                }
                if (((CharSequence) aqiVar.getValue()).length() > 0 && !Intrinsics.d(aqiVar.getValue(), str6)) {
                    webView.loadUrl(str6);
                    aqiVar.setValue(str6);
                }
                return Unit.a;
            default:
                com.yandex.plus.log.api.b bVar = (com.yandex.plus.log.api.b) obj5;
                tf6 tf6Var = (tf6) obj2;
                ((c) obj).getClass();
                com.yandex.plus.bdui.plus.a aVar = new com.yandex.plus.bdui.plus.a(bVar, i9);
                mdn mdnVar = new mdn((j) obj4, (com.yandex.plus.bdui.plus.auth.a) obj3, tf6Var, bVar, 13);
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                return t75.c(new com.yandex.plus.bdui.action.b("PlusAuthorizeAction", aVar, ern.a(com.yandex.plus.bdui.plus.action.d.class), mdnVar, e5bVar, true));
        }
    }

    public /* synthetic */ i50(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.e = obj4;
    }

    public /* synthetic */ i50(lb1 lb1Var, ib1 ib1Var, fvf fvfVar, u6k u6kVar) {
        this.a = 2;
        this.c = lb1Var;
        this.d = ib1Var;
        this.e = fvfVar;
        this.b = u6kVar;
    }

    public /* synthetic */ i50(List list, fvf fvfVar, c0p c0pVar, s2p s2pVar) {
        this.a = 20;
        this.c = list;
        this.e = fvfVar;
        this.d = c0pVar;
        this.b = s2pVar;
    }
}
