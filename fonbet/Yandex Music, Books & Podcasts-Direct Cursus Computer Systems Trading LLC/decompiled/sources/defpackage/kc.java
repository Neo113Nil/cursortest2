package defpackage;

import android.webkit.WebView;
import androidx.compose.foundation.lazy.a;
import com.google.gson.ExclusionStrategy;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.internal.Excluder;
import com.yandex.music.shared.backend_utils.date.DateTypeAdapter;
import com.yandex.music.shared.backend_utils.date.DateTypeAdapter$Companion$factory$1;
import com.yandex.music.shared.backend_utils.date.IsoZonedTypeAdapter;
import com.yandex.music.shared.network.parser.IgnoreFailureTypeAdapterFactory;
import com.yandex.music.shared.network.parser.UnitDeserializer;
import com.yandex.music.shared.network.retrofit.NewBackendFormatError;
import com.yandex.music.shared.network.retrofit.NewBackendFormatErrorDeserializer;
import com.yandex.music.shared.promo.data.AlbumPromoApi;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.c;

/* loaded from: classes3.dex */
public final /* synthetic */ class kc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kc(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        dz1 dz1Var;
        int i = this.a;
        int i2 = 8;
        int i3 = 6;
        int i4 = 2;
        int i5 = 5;
        int i6 = 3;
        final int i7 = 1;
        boolean z = false;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((oa8) obj).getClass();
                return new pc((WebView) obj3, (aqi) obj2, 0);
            case 1:
                ie ieVar = (ie) obj3;
                String str = (String) obj2;
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.k(jfpVar, ieVar.b);
                if (!ieVar.f) {
                    str = "";
                }
                wfp.s(jfpVar, str);
                return Unit.a;
            case 2:
                il ilVar = (il) obj2;
                vuf vufVar = (vuf) obj;
                vufVar.getClass();
                vuf.Y(vufVar, null, new wn5(new u2(i5, ilVar), -1954476407, true), 3);
                vuf.Y(vufVar, null, xee.b, 3);
                List list = ((jl) ((ml) obj3)).a;
                vufVar.Z(list.size(), new al(null == true ? 1 : 0, new u4(14), list), new bl(null == true ? 1 : 0, list, null == true ? 1 : 0), new wn5(new cl(null == true ? 1 : 0, list, ilVar), -632812321, true));
                vuf.Y(vufVar, null, xee.c, 3);
                return Unit.a;
            case 3:
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                ((yq) obj3).b.G(xjoVar, (ArrayList) obj2);
                return Unit.a;
            case 4:
                ht htVar = (ht) obj3;
                String str2 = (String) obj;
                str2.getClass();
                htVar.getClass();
                str2.getClass();
                jt jtVar = htVar.a;
                thj thjVar = new thj(pkb.Shortcut, str2, 1, 1, "");
                jtVar.getClass();
                oq oqVar = jtVar.k;
                gt gtVar = jtVar.m;
                g0l.f((g0l) gtVar.a.getValue(), oqVar, hcr.a, oqVar.F, jtVar.l, new w5l(new cvo(wjb.SummaryScreen, hlb.Bottomsheet, (glb) null, (dvo) null, new avo(pkb.Album, oqVar.a), 44), new jab(qkb.Summary, 1, 1, 0), thjVar, null), ((c) ((gpj) gtVar.b.getValue()).b.getValue()).a());
                ((sai) obj2).a();
                return Unit.a;
            case 5:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(e0j.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                rp7Var.E(new dx((jyr) obj3, null == true ? 1 : 0));
                o18Var.c = hag.I(AlbumPromoApi.class);
                rp7Var.getClass();
                rp7Var.E(new u4(21));
                o18Var.c = hag.I(ox.class);
                rp7Var.getClass();
                rp7Var.E(new u4(22));
                o18Var.c = hag.I(ax.class);
                rp7Var.getClass();
                rp7Var.E(new u4(23));
                o18Var.c = hag.I(mx.class);
                rp7Var.getClass();
                rp7Var.D(new u4(24));
                o18Var.c = hag.I(gx.class);
                rp7Var.getClass();
                rp7Var.E(new ex(null == true ? 1 : 0, (Function0) obj2));
                return Unit.a;
            case 6:
                dy dyVar = (dy) obj2;
                u51 u51Var = (u51) obj;
                u51Var.getClass();
                for (m7a m7aVar : (List) obj3) {
                    if (Intrinsics.d(m7aVar.c.a, u51Var.a)) {
                        jyr jyrVar = y7a.a;
                        y7a.a(dyVar.a, m7aVar.a, true);
                        return Unit.a;
                    }
                }
                wvs.h("Collection contains no element matching the predicate.");
                return null;
            case 7:
                xjo xjoVar2 = (xjo) obj;
                xjoVar2.getClass();
                ((s10) obj3).b.H(xjoVar2, (t10) obj2);
                return Unit.a;
            case 8:
                xjo xjoVar3 = (xjo) obj;
                xjoVar3.getClass();
                ((j20) obj3).b.G(xjoVar3, (ArrayList) obj2);
                return Unit.a;
            case 9:
                xjo xjoVar4 = (xjo) obj;
                xjoVar4.getClass();
                ((z20) obj3).b.G(xjoVar4, (List) obj2);
                return Unit.a;
            case 10:
                List list2 = (List) obj3;
                vuf vufVar2 = (vuf) obj;
                vufVar2.getClass();
                vufVar2.Z(list2.size(), new al(i7, new j3(i3), list2), new bl(i7, list2, null == true ? 1 : 0), new wn5(new cl(i7, list2, (v40) obj2), -1091073711, true));
                return Unit.a;
            case 11:
                p90 p90Var = (p90) obj3;
                ca0 ca0Var = (ca0) obj2;
                long i8 = enj.i(p90Var.a1() ? -1.0f : 1.0f, ((vma) obj).a);
                ca0Var.a(p90Var.H.e(p90Var.I == bxj.a ? enj.f(i8) : enj.e(i8)), 0.0f);
                return Unit.a;
            case 12:
                hfb hfbVar = (hfb) obj2;
                GsonBuilder gsonBuilder = (GsonBuilder) obj;
                gsonBuilder.getClass();
                ArrayList arrayList = gsonBuilder.e;
                ExclusionStrategy exclusionStrategy = new ExclusionStrategy[]{new frq()}[0];
                Excluder excluder = gsonBuilder.a;
                Excluder clone = excluder.clone();
                ArrayList arrayList2 = new ArrayList(excluder.a);
                clone.a = arrayList2;
                arrayList2.add(exclusionStrategy);
                ArrayList arrayList3 = new ArrayList(excluder.b);
                clone.b = arrayList3;
                arrayList3.add(exclusionStrategy);
                gsonBuilder.a = clone;
                gsonBuilder.b(Unit.class, new UnitDeserializer());
                gsonBuilder.b(wye.class, new IsoZonedTypeAdapter());
                if (((Boolean) ((Function0) obj3).invoke()).booleanValue()) {
                    gsonBuilder.b(NewBackendFormatError.class, new NewBackendFormatErrorDeserializer(hfbVar));
                }
                DateTypeAdapter$Companion$factory$1 dateTypeAdapter$Companion$factory$1 = DateTypeAdapter.b;
                Objects.requireNonNull(dateTypeAdapter$Companion$factory$1);
                arrayList.add(dateTypeAdapter$Companion$factory$1);
                arrayList.add(new IgnoreFailureTypeAdapterFactory());
                return Unit.a;
            case 13:
                xjo xjoVar5 = (xjo) obj;
                xjoVar5.getClass();
                ((t51) obj3).b.H(xjoVar5, (s51) obj2);
                return Unit.a;
            case 14:
                c81 c81Var = (c81) obj3;
                final t71 t71Var = (t71) obj2;
                vuf vufVar3 = (vuf) obj;
                vufVar3.getClass();
                List list3 = c81Var.b;
                List list4 = c81Var.c;
                if (!list3.isEmpty() && !list4.isEmpty()) {
                    vuf.Y(vufVar3, null, h4a.a, 3);
                }
                vufVar3.Z(list3.size(), null, new bl(i3, list3, null == true ? 1 : 0), new wn5(new t50(list3, t71Var, c81Var, i7), -1091073711, true));
                List list5 = list3;
                if (!list5.isEmpty()) {
                    final Object[] objArr = null == true ? 1 : 0;
                    vuf.Y(vufVar3, null, new wn5(new pyc() { // from class: c71
                        @Override // defpackage.pyc
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            int i9 = objArr;
                            a aVar = (a) obj4;
                            hq5 hq5Var = (hq5) obj5;
                            int intValue = ((Integer) obj6).intValue();
                            switch (i9) {
                                case 0:
                                    aVar.getClass();
                                    oq5 oq5Var = (oq5) hq5Var;
                                    if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                                        final t71 t71Var2 = t71Var;
                                        boolean h = oq5Var.h(t71Var2);
                                        Object K = oq5Var.K();
                                        if (h || K == gq5.a) {
                                            final int i10 = 1;
                                            K = new Function0() { // from class: d71
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i10) {
                                                        case 0:
                                                            t71Var2.f();
                                                            break;
                                                        case 1:
                                                            t71Var2.b();
                                                            break;
                                                        default:
                                                            t71Var2.b();
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            oq5Var.k0(K);
                                        }
                                        com.yandex.music.core.ui.compose.a.a((Function0) K, oq5Var, 0);
                                    } else {
                                        oq5Var.S();
                                    }
                                    break;
                                case 1:
                                    aVar.getClass();
                                    oq5 oq5Var2 = (oq5) hq5Var;
                                    if (oq5Var2.P(intValue & 1, (intValue & 17) != 16)) {
                                        final t71 t71Var3 = t71Var;
                                        boolean h2 = oq5Var2.h(t71Var3);
                                        Object K2 = oq5Var2.K();
                                        if (h2 || K2 == gq5.a) {
                                            final int i11 = 0;
                                            K2 = new Function0() { // from class: d71
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i11) {
                                                        case 0:
                                                            t71Var3.f();
                                                            break;
                                                        case 1:
                                                            t71Var3.b();
                                                            break;
                                                        default:
                                                            t71Var3.b();
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            oq5Var2.k0(K2);
                                        }
                                        com.yandex.music.core.ui.compose.a.a((Function0) K2, oq5Var2, 0);
                                    } else {
                                        oq5Var2.S();
                                    }
                                    break;
                                default:
                                    aVar.getClass();
                                    oq5 oq5Var3 = (oq5) hq5Var;
                                    if (oq5Var3.P(intValue & 1, (intValue & 17) != 16)) {
                                        final t71 t71Var4 = t71Var;
                                        boolean h3 = oq5Var3.h(t71Var4);
                                        Object K3 = oq5Var3.K();
                                        if (h3 || K3 == gq5.a) {
                                            final int i12 = 2;
                                            K3 = new Function0() { // from class: d71
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i12) {
                                                        case 0:
                                                            t71Var4.f();
                                                            break;
                                                        case 1:
                                                            t71Var4.b();
                                                            break;
                                                        default:
                                                            t71Var4.b();
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            oq5Var3.k0(K3);
                                        }
                                        com.yandex.music.core.ui.compose.a.a((Function0) K3, oq5Var3, 0);
                                    } else {
                                        oq5Var3.S();
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    }, -1184125967, true), 3);
                }
                if (!list5.isEmpty() && !list4.isEmpty()) {
                    vuf.Y(vufVar3, null, new wn5(new u2(10, c81Var), -612896624, true), 3);
                }
                vufVar3.Z(list4.size(), null, new bl(i5, list4, null == true ? 1 : 0), new wn5(new cl(i6, list4, t71Var), -632812321, true));
                if (!list4.isEmpty()) {
                    vuf.Y(vufVar3, null, new wn5(new pyc() { // from class: c71
                        @Override // defpackage.pyc
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            int i9 = i7;
                            a aVar = (a) obj4;
                            hq5 hq5Var = (hq5) obj5;
                            int intValue = ((Integer) obj6).intValue();
                            switch (i9) {
                                case 0:
                                    aVar.getClass();
                                    oq5 oq5Var = (oq5) hq5Var;
                                    if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                                        final t71 t71Var2 = t71Var;
                                        boolean h = oq5Var.h(t71Var2);
                                        Object K = oq5Var.K();
                                        if (h || K == gq5.a) {
                                            final int i10 = 1;
                                            K = new Function0() { // from class: d71
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i10) {
                                                        case 0:
                                                            t71Var2.f();
                                                            break;
                                                        case 1:
                                                            t71Var2.b();
                                                            break;
                                                        default:
                                                            t71Var2.b();
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            oq5Var.k0(K);
                                        }
                                        com.yandex.music.core.ui.compose.a.a((Function0) K, oq5Var, 0);
                                    } else {
                                        oq5Var.S();
                                    }
                                    break;
                                case 1:
                                    aVar.getClass();
                                    oq5 oq5Var2 = (oq5) hq5Var;
                                    if (oq5Var2.P(intValue & 1, (intValue & 17) != 16)) {
                                        final t71 t71Var3 = t71Var;
                                        boolean h2 = oq5Var2.h(t71Var3);
                                        Object K2 = oq5Var2.K();
                                        if (h2 || K2 == gq5.a) {
                                            final int i11 = 0;
                                            K2 = new Function0() { // from class: d71
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i11) {
                                                        case 0:
                                                            t71Var3.f();
                                                            break;
                                                        case 1:
                                                            t71Var3.b();
                                                            break;
                                                        default:
                                                            t71Var3.b();
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            oq5Var2.k0(K2);
                                        }
                                        com.yandex.music.core.ui.compose.a.a((Function0) K2, oq5Var2, 0);
                                    } else {
                                        oq5Var2.S();
                                    }
                                    break;
                                default:
                                    aVar.getClass();
                                    oq5 oq5Var3 = (oq5) hq5Var;
                                    if (oq5Var3.P(intValue & 1, (intValue & 17) != 16)) {
                                        final t71 t71Var4 = t71Var;
                                        boolean h3 = oq5Var3.h(t71Var4);
                                        Object K3 = oq5Var3.K();
                                        if (h3 || K3 == gq5.a) {
                                            final int i12 = 2;
                                            K3 = new Function0() { // from class: d71
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i12) {
                                                        case 0:
                                                            t71Var4.f();
                                                            break;
                                                        case 1:
                                                            t71Var4.b();
                                                            break;
                                                        default:
                                                            t71Var4.b();
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            oq5Var3.k0(K3);
                                        }
                                        com.yandex.music.core.ui.compose.a.a((Function0) K3, oq5Var3, 0);
                                    } else {
                                        oq5Var3.S();
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    }, -41667281, true), 3);
                }
                return Unit.a;
            case 15:
                d81 d81Var = (d81) obj3;
                final t71 t71Var2 = (t71) obj2;
                vuf vufVar4 = (vuf) obj;
                vufVar4.getClass();
                List list6 = d81Var.b;
                vufVar4.Z(list6.size(), null, new bl(7, list6, null == true ? 1 : 0), new wn5(new t50(list6, t71Var2, d81Var, i6), -1091073711, true));
                if (!d81Var.b.isEmpty()) {
                    final int i9 = 2;
                    vuf.Y(vufVar4, null, new wn5(new pyc() { // from class: c71
                        @Override // defpackage.pyc
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            int i92 = i9;
                            a aVar = (a) obj4;
                            hq5 hq5Var = (hq5) obj5;
                            int intValue = ((Integer) obj6).intValue();
                            switch (i92) {
                                case 0:
                                    aVar.getClass();
                                    oq5 oq5Var = (oq5) hq5Var;
                                    if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                                        final t71 t71Var22 = t71Var2;
                                        boolean h = oq5Var.h(t71Var22);
                                        Object K = oq5Var.K();
                                        if (h || K == gq5.a) {
                                            final int i10 = 1;
                                            K = new Function0() { // from class: d71
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i10) {
                                                        case 0:
                                                            t71Var22.f();
                                                            break;
                                                        case 1:
                                                            t71Var22.b();
                                                            break;
                                                        default:
                                                            t71Var22.b();
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            oq5Var.k0(K);
                                        }
                                        com.yandex.music.core.ui.compose.a.a((Function0) K, oq5Var, 0);
                                    } else {
                                        oq5Var.S();
                                    }
                                    break;
                                case 1:
                                    aVar.getClass();
                                    oq5 oq5Var2 = (oq5) hq5Var;
                                    if (oq5Var2.P(intValue & 1, (intValue & 17) != 16)) {
                                        final t71 t71Var3 = t71Var2;
                                        boolean h2 = oq5Var2.h(t71Var3);
                                        Object K2 = oq5Var2.K();
                                        if (h2 || K2 == gq5.a) {
                                            final int i11 = 0;
                                            K2 = new Function0() { // from class: d71
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i11) {
                                                        case 0:
                                                            t71Var3.f();
                                                            break;
                                                        case 1:
                                                            t71Var3.b();
                                                            break;
                                                        default:
                                                            t71Var3.b();
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            oq5Var2.k0(K2);
                                        }
                                        com.yandex.music.core.ui.compose.a.a((Function0) K2, oq5Var2, 0);
                                    } else {
                                        oq5Var2.S();
                                    }
                                    break;
                                default:
                                    aVar.getClass();
                                    oq5 oq5Var3 = (oq5) hq5Var;
                                    if (oq5Var3.P(intValue & 1, (intValue & 17) != 16)) {
                                        final t71 t71Var4 = t71Var2;
                                        boolean h3 = oq5Var3.h(t71Var4);
                                        Object K3 = oq5Var3.K();
                                        if (h3 || K3 == gq5.a) {
                                            final int i12 = 2;
                                            K3 = new Function0() { // from class: d71
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i12) {
                                                        case 0:
                                                            t71Var4.f();
                                                            break;
                                                        case 1:
                                                            t71Var4.b();
                                                            break;
                                                        default:
                                                            t71Var4.b();
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            oq5Var3.k0(K3);
                                        }
                                        com.yandex.music.core.ui.compose.a.a((Function0) K3, oq5Var3, 0);
                                    } else {
                                        oq5Var3.S();
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    }, -1120008248, true), 3);
                }
                return Unit.a;
            case 16:
                ((r7g) obj).getClass();
                w1g.z(((hb1) obj3).a.a, ((r7g) obj2).a);
                return Unit.a;
            case 17:
                u51 u51Var2 = (u51) obj;
                u51Var2.getClass();
                ((sai) obj3).a();
                ((Function1) obj2).invoke(u51Var2);
                return Unit.a;
            case 18:
                String str3 = (String) obj;
                str3.getClass();
                ((ne1) obj3).d.m(null, (thj) obj2, str3);
                return Unit.a;
            case 19:
                xjo xjoVar6 = (xjo) obj;
                xjoVar6.getClass();
                ((jk1) obj3).b.G(xjoVar6, (List) obj2);
                return Unit.a;
            case 20:
                String str4 = (String) obj;
                str4.getClass();
                nsh nshVar = ((ml1) obj3).d;
                String str5 = ((mqs) obj2).a;
                str5.getClass();
                nmb.z((nmb) nshVar.d, ((fnb) nshVar.c).G(), wjb.TrackListScreen, null, pkb.Artist, (String) nshVar.b, null, 0, false, "tracks", "tracks", 0, "track", str5, 0, str4, 52452);
                return Unit.a;
            case 21:
                ((Boolean) obj).booleanValue();
                ((Function0) obj3).invoke();
                ((lvf) obj2).g();
                return Unit.a;
            case 22:
                xjo xjoVar7 = (xjo) obj;
                xjoVar7.getClass();
                ((lm1) obj3).b.G(xjoVar7, (List) obj2);
                return Unit.a;
            case 23:
                vuf vufVar5 = (vuf) obj;
                vufVar5.getClass();
                List list7 = ((to1) ((sdr) obj3).getValue()).a;
                vufVar5.Z(list7.size(), null, new bl(i2, list7, z), new wn5(new cl(i5, list7, (bp1) obj2), -1091073711, true));
                return Unit.a;
            case 24:
                sp1 sp1Var = (sp1) obj3;
                zp1 zp1Var = (zp1) obj2;
                op1 op1Var = (op1) obj;
                op1Var.getClass();
                u51 u51Var3 = op1Var.b;
                vtm vtmVar = zp1Var.c;
                int indexOf = zp1Var.b.indexOf(op1Var);
                sp1Var.getClass();
                sp1Var.a(wjb.BottomsheetScreen, vtmVar != null ? new qkl(new gjl((pkl) vtmVar.a, 0, 6), gld.I(u51Var3, indexOf)) : null);
                szf.R(sp1Var.a.a.a, new qvg(g0g.F(u51Var3, false)), null);
                return Unit.a;
            case 25:
                ez1 ez1Var = (ez1) obj3;
                dz1 dz1Var2 = (dz1) obj2;
                vuf vufVar6 = (vuf) obj;
                vufVar6.getClass();
                ArrayList arrayList4 = ez1Var.a;
                if (arrayList4.isEmpty()) {
                    dz1Var = dz1Var2;
                } else {
                    int i10 = 0;
                    int i11 = 1;
                    dz1Var = dz1Var2;
                    cb0.c(vufVar6, arrayList4, R.string.collection_audiobooks_postponed_audiobooks, androidx.compose.foundation.layout.a.a(0.0f, 8, 1), new m5(i11, dz1Var2, dz1.class, "onAudiobookClick", "onAudiobookClick(Lru/yandex/music/data/audio/Album;)V", i10, 18), new m5(i11, dz1Var2, dz1.class, "onAudiobookLongClick", "onAudiobookLongClick(Lru/yandex/music/data/audio/Album;)V", i10, 19), new oi1(0, dz1Var2, dz1.class, "onViewAllPostponedAudiobooksClick", "onViewAllPostponedAudiobooksClick()V", i10, 13));
                }
                ArrayList arrayList5 = ez1Var.b;
                if (!arrayList5.isEmpty()) {
                    c9g.e(vufVar6, arrayList5, R.string.collection_audiobooks_postponed_chapters, androidx.compose.foundation.layout.a.c(0.0f, 28, 0.0f, 4, 5), dz1Var.j, new oi1(0, dz1Var, dz1.class, "onViewAllChaptersClick", "onViewAllChaptersClick()V", 0, 14));
                }
                vuf.Y(vufVar6, null, i4w.a, 3);
                return Unit.a;
            case 26:
                g42 g42Var = (g42) obj3;
                Function1 function1 = (Function1) obj2;
                rsr rsrVar = (rsr) obj;
                rsrVar.getClass();
                dtr compileStatement = rsrVar.compileStatement(g42Var.a);
                int length = g42Var.c.length;
                int i12 = 1;
                while (i12 < length) {
                    int i13 = g42Var.c[i12];
                    if (i13 == 1) {
                        compileStatement.bindLong(i12, g42Var.d[i12]);
                    } else if (i13 == i4) {
                        compileStatement.bindDouble(i12, g42Var.e[i12]);
                    } else if (i13 == 3) {
                        String str6 = g42Var.f[i12];
                        str6.getClass();
                        compileStatement.bindString(i12, str6);
                    } else if (i13 == 4) {
                        byte[] bArr = g42Var.g[i12];
                        bArr.getClass();
                        compileStatement.bindBlob(i12, bArr);
                    } else if (i13 == 5) {
                        compileStatement.bindNull(i12);
                    }
                    i12++;
                    i4 = 2;
                }
                return function1.invoke(compileStatement);
            case 27:
                x62 x62Var = (x62) obj3;
                String str7 = (String) obj2;
                xjo xjoVar8 = (xjo) obj;
                xjoVar8.getClass();
                cko D0 = xjoVar8.D0("UPDATE auto_tracks_cache_info SET cache_info = ? WHERE track_id = ?");
                try {
                    JsonObject jsonObject = new JsonObject();
                    jsonObject.s(1, "version");
                    JsonObject jsonObject2 = new JsonObject();
                    jsonObject2.s(Long.valueOf(x62Var.a), "lastUseTimestamp");
                    jsonObject.r(Constants.KEY_VALUE, jsonObject2);
                    String jsonElement = jsonObject.toString();
                    jsonElement.getClass();
                    D0.E(1, jsonElement);
                    D0.E(2, str7);
                    D0.q();
                    D0.close();
                    return Unit.a;
                } catch (Throwable th) {
                    D0.close();
                    throw th;
                }
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                xjo xjoVar9 = (xjo) obj;
                xjoVar9.getClass();
                ((hb2) obj3).b.H(xjoVar9, (ib2) obj2);
                return Unit.a;
            default:
                jx7 jx7Var = (jx7) obj3;
                Function1 function12 = (Function1) obj2;
                hqe hqeVar = (hqe) obj;
                if (function12 != null) {
                    function12.invoke(new cma(jx7Var.c0((int) (hqeVar.a & 4294967295L))));
                }
                return Unit.a;
        }
    }
}
