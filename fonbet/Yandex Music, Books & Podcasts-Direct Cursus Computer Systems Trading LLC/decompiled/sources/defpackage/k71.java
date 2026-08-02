package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.music.core.ui.compose.b;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.c;
import ru.yandex.music.common.media.context.e;
import ru.yandex.music.common.media.context.h;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes3.dex */
public final /* synthetic */ class k71 implements ryc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ k71(fvf fvfVar, List list, z88 z88Var, fvf fvfVar2, List list2) {
        this.a = 2;
        this.b = fvfVar;
        this.d = list;
        this.e = z88Var;
        this.c = fvfVar2;
        this.f = list2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x020c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r1.K(), java.lang.Integer.valueOf(r13)) == false) goto L70;
     */
    @Override // defpackage.ryc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        oq5 oq5Var;
        boolean z;
        fuw fuwVar;
        fuw fuwVar2;
        vci vciVar;
        boolean z2;
        vci vciVar2;
        hz2 hz2Var;
        boolean z3;
        boolean z4;
        int i = this.a;
        vci vciVar3 = vci.a;
        Object obj5 = gq5.a;
        Object obj6 = this.f;
        Object obj7 = this.c;
        Object obj8 = this.b;
        Object obj9 = this.e;
        Object obj10 = this.d;
        int i2 = 1;
        switch (i) {
            case 0:
                o0k o0kVar = (o0k) obj10;
                t71 t71Var = (t71) obj9;
                fvf fvfVar = (fvf) obj8;
                fvf fvfVar2 = (fvf) obj7;
                int intValue = ((Integer) obj2).intValue();
                hq5 hq5Var = (hq5) obj3;
                ((Integer) obj4).getClass();
                ((b3k) obj).getClass();
                e81 e81Var = (e81) ((v71) ((aqi) obj6).getValue()).b.get(intValue);
                WeakHashMap weakHashMap = rqv.w;
                eoe n = p6g.n(z7l.h(hq5Var).e, hq5Var);
                if (e81Var instanceof c81) {
                    oq5 oq5Var2 = (oq5) hq5Var;
                    oq5Var2.Z(361313850);
                    etn.j(ghh.C(ghh.C(a.c(0.0f, 8, 0.0f, 0.0f, 13), n), o0kVar), (c81) e81Var, t71Var, fvfVar, androidx.compose.ui.platform.a.a(d.c(vciVar3, 1.0f), "familiar_collection"), oq5Var2, 24576, 0);
                    oq5Var2.p(false);
                } else {
                    if (!(e81Var instanceof d81)) {
                        throw vz1.i((oq5) hq5Var, -1512367606, false);
                    }
                    oq5 oq5Var3 = (oq5) hq5Var;
                    oq5Var3.Z(361949164);
                    fgq.f(ghh.C(ghh.C(a.c(0.0f, 8, 0.0f, 0.0f, 13), n), o0kVar), (d81) e81Var, t71Var, fvfVar2, androidx.compose.ui.platform.a.a(d.c(vciVar3, 1.0f), "familiar_wave"), oq5Var3, 24576);
                    oq5Var3.p(false);
                }
                return Unit.a;
            case 1:
                fvf fvfVar3 = (fvf) obj8;
                fvf fvfVar4 = (fvf) obj7;
                v25 v25Var = (v25) obj9;
                tmb tmbVar = (tmb) obj6;
                int intValue2 = ((Integer) obj2).intValue();
                hq5 hq5Var2 = (hq5) obj3;
                ((Integer) obj4).getClass();
                ((b3k) obj).getClass();
                q0s q0sVar = (q0s) ((y25) obj10).a.get(intValue2);
                int ordinal = q0sVar.b.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    fvfVar3 = fvfVar4;
                }
                v25Var.getClass();
                oq5 oq5Var4 = (oq5) hq5Var2;
                boolean f = oq5Var4.f(q0sVar);
                Object K = oq5Var4.K();
                if (f || K == obj5) {
                    K = new j25(q0sVar.b, q0sVar.c, v25Var.j, v25Var.k);
                    oq5Var4.k0(K);
                }
                j25 j25Var = (j25) K;
                boolean h = oq5Var4.h(v25Var);
                Object K2 = oq5Var4.K();
                if (h || K2 == obj5) {
                    Object ub4Var = new ub4(0, v25Var, v25.class, "onRefresh", "onRefresh()V", 0, 29);
                    oq5Var4.k0(ub4Var);
                    K2 = ub4Var;
                }
                etn.k(fvfVar3, j25Var, tmbVar, (Function0) ((h9f) K2), oq5Var4, RemoteCameraConfig.Mic.BUFFER_SIZE);
                return Unit.a;
            case 2:
                fvf fvfVar5 = (fvf) obj8;
                final List list = (List) obj10;
                final z88 z88Var = (z88) obj9;
                fvf fvfVar6 = (fvf) obj7;
                List list2 = (List) obj6;
                int intValue3 = ((Integer) obj2).intValue();
                hq5 hq5Var3 = (hq5) obj3;
                ((Integer) obj4).getClass();
                ((b3k) obj).getClass();
                if (intValue3 != 0) {
                    if (intValue3 != 1) {
                        oq5Var = (oq5) hq5Var3;
                        oq5Var.Z(853186933);
                    } else {
                        oq5Var = (oq5) hq5Var3;
                        oq5Var.Z(2105946421);
                        boolean h2 = oq5Var.h(z88Var);
                        Object K3 = oq5Var.K();
                        if (h2 || K3 == obj5) {
                            K3 = new x88(z88Var, 0);
                            oq5Var.k0(K3);
                        }
                        Function1 function1 = (Function1) K3;
                        boolean h3 = oq5Var.h(z88Var);
                        Object K4 = oq5Var.K();
                        if (h3 || K4 == obj5) {
                            K4 = new x88(z88Var, 1);
                            oq5Var.k0(K4);
                        }
                        irf.f(fvfVar6, list2, function1, (Function1) K4, oq5Var, 0);
                    }
                    oq5Var.p(false);
                } else {
                    oq5 oq5Var5 = (oq5) hq5Var3;
                    oq5Var5.Z(2105933157);
                    boolean h4 = oq5Var5.h(z88Var) | oq5Var5.h(list);
                    Object K5 = oq5Var5.K();
                    if (h4 || K5 == obj5) {
                        final int i3 = 0;
                        K5 = new Function1() { // from class: w88
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj11) {
                                switch (i3) {
                                    case 0:
                                        z88 z88Var2 = z88Var;
                                        List list3 = list;
                                        mqs mqsVar = (mqs) obj11;
                                        mqsVar.getClass();
                                        z88Var2.getClass();
                                        list3.getClass();
                                        int indexOf = list3.indexOf(mqsVar);
                                        l18 l18Var = l18.b;
                                        bdt I = hag.I(byb.class);
                                        qdc qdcVar = l18Var.a;
                                        qdcVar.getClass();
                                        boolean h5 = ((k94) ((byb) qdcVar.C(I)).c(ern.a(k94.class))).h();
                                        v88 v88Var = z88Var2.b;
                                        if (h5) {
                                            h00 h00Var = new h00(z88Var2, indexOf, mqsVar, list3, 6);
                                            v88Var.getClass();
                                            a0g.G(v88Var.a, mqsVar, h00Var);
                                        } else {
                                            v88Var.getClass();
                                            String t = weo.t();
                                            e eVar = v88Var.e;
                                            h hVar = v88Var.c;
                                            eVar.getClass();
                                            c h6 = hVar.h();
                                            boolean c = v88Var.f.c(h6, mqsVar, false);
                                            z5l z5lVar = v88Var.f;
                                            if (c) {
                                                z5lVar.i(false);
                                            } else {
                                                asq.t(z5l.g(z5lVar, h6, v88Var.d.a(t), null, mqsVar, 0, 0, null, null, null, new e50(list3, null, 6), 24052), v88Var.a, new p1n(8));
                                                nnk nnkVar = z88Var2.c;
                                                String str = mqsVar.a;
                                                str.getClass();
                                                nmb.z((nmb) nnkVar.b, ((fnb) nnkVar.a).G(), wjb.DislikesScreen, null, null, null, "tracks", 1, false, "tracks", "tracks", 2, "track", str, indexOf + 1, t, 17564);
                                            }
                                        }
                                        break;
                                    default:
                                        z88 z88Var3 = z88Var;
                                        List list4 = list;
                                        mqs mqsVar2 = (mqs) obj11;
                                        mqsVar2.getClass();
                                        z88Var3.getClass();
                                        list4.getClass();
                                        v88 v88Var2 = z88Var3.b;
                                        v88Var2.getClass();
                                        rre.Z(mqsVar2, zus.b, y5g.B0(mqsVar2, ryt.a), new ve(muo.DISLIKES, zqt.d), v88Var2.a, v88Var2.b, v88Var2.d, v88Var2.c, null, null, null, 1792);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var5.k0(K5);
                    }
                    Function1 function12 = (Function1) K5;
                    boolean h5 = oq5Var5.h(z88Var) | oq5Var5.h(list);
                    Object K6 = oq5Var5.K();
                    if (h5 || K6 == obj5) {
                        final int i4 = 1;
                        K6 = new Function1() { // from class: w88
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj11) {
                                switch (i4) {
                                    case 0:
                                        z88 z88Var2 = z88Var;
                                        List list3 = list;
                                        mqs mqsVar = (mqs) obj11;
                                        mqsVar.getClass();
                                        z88Var2.getClass();
                                        list3.getClass();
                                        int indexOf = list3.indexOf(mqsVar);
                                        l18 l18Var = l18.b;
                                        bdt I = hag.I(byb.class);
                                        qdc qdcVar = l18Var.a;
                                        qdcVar.getClass();
                                        boolean h52 = ((k94) ((byb) qdcVar.C(I)).c(ern.a(k94.class))).h();
                                        v88 v88Var = z88Var2.b;
                                        if (h52) {
                                            h00 h00Var = new h00(z88Var2, indexOf, mqsVar, list3, 6);
                                            v88Var.getClass();
                                            a0g.G(v88Var.a, mqsVar, h00Var);
                                        } else {
                                            v88Var.getClass();
                                            String t = weo.t();
                                            e eVar = v88Var.e;
                                            h hVar = v88Var.c;
                                            eVar.getClass();
                                            c h6 = hVar.h();
                                            boolean c = v88Var.f.c(h6, mqsVar, false);
                                            z5l z5lVar = v88Var.f;
                                            if (c) {
                                                z5lVar.i(false);
                                            } else {
                                                asq.t(z5l.g(z5lVar, h6, v88Var.d.a(t), null, mqsVar, 0, 0, null, null, null, new e50(list3, null, 6), 24052), v88Var.a, new p1n(8));
                                                nnk nnkVar = z88Var2.c;
                                                String str = mqsVar.a;
                                                str.getClass();
                                                nmb.z((nmb) nnkVar.b, ((fnb) nnkVar.a).G(), wjb.DislikesScreen, null, null, null, "tracks", 1, false, "tracks", "tracks", 2, "track", str, indexOf + 1, t, 17564);
                                            }
                                        }
                                        break;
                                    default:
                                        z88 z88Var3 = z88Var;
                                        List list4 = list;
                                        mqs mqsVar2 = (mqs) obj11;
                                        mqsVar2.getClass();
                                        z88Var3.getClass();
                                        list4.getClass();
                                        v88 v88Var2 = z88Var3.b;
                                        v88Var2.getClass();
                                        rre.Z(mqsVar2, zus.b, y5g.B0(mqsVar2, ryt.a), new ve(muo.DISLIKES, zqt.d), v88Var2.a, v88Var2.b, v88Var2.d, v88Var2.c, null, null, null, 1792);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var5.k0(K6);
                    }
                    irf.A(fvfVar5, list, function12, (Function1) K6, oq5Var5, 0);
                    oq5Var5.p(false);
                }
                return Unit.a;
            case 3:
                fvf fvfVar7 = (fvf) obj8;
                fvf fvfVar8 = (fvf) obj7;
                eha ehaVar = (eha) obj9;
                o3k o3kVar = (o3k) obj6;
                int intValue4 = ((Integer) obj2).intValue();
                hq5 hq5Var4 = (hq5) obj3;
                ((Integer) obj4).getClass();
                ((b3k) obj).getClass();
                s0s s0sVar = (s0s) ((List) obj10).get(intValue4);
                p0s p0sVar = s0sVar.b;
                ArrayList arrayList = s0sVar.c;
                int ordinal2 = p0sVar.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        b6e.s();
                        return null;
                    }
                    fvfVar7 = fvfVar8;
                }
                if (arrayList.isEmpty()) {
                    oq5 oq5Var6 = (oq5) hq5Var4;
                    oq5Var6.Z(1797628587);
                    fgq.n(48, oq5Var6, androidx.compose.ui.platform.a.a(d.c(vciVar3, 1.0f), "playlist_list_empty"), rvf.M(R.string.downloaded_playlists_empty, oq5Var6));
                    oq5Var6.p(false);
                } else {
                    oq5 oq5Var7 = (oq5) hq5Var4;
                    oq5Var7.Z(1797915151);
                    bzf.e(fvfVar7, arrayList, ehaVar, b.c(androidx.compose.ui.platform.a.a(vciVar3, "playlist_list_content"), "isSelected", Boolean.valueOf(o3kVar.j() == intValue4)), oq5Var7, 48);
                    oq5Var7.p(false);
                }
                return Unit.a;
            case 4:
                z0d z0dVar = (z0d) obj10;
                d1d d1dVar = (d1d) obj9;
                jd6 jd6Var = d1dVar.a;
                fp7 fp7Var = (fp7) obj8;
                hs1 hs1Var = (hs1) obj7;
                q0d q0dVar = (q0d) obj6;
                int intValue5 = ((Integer) obj2).intValue();
                hq5 hq5Var5 = (hq5) obj3;
                int intValue6 = ((Integer) obj4).intValue();
                ((b3k) obj).getClass();
                yci a = androidx.compose.ui.platform.a.a(d.d(vciVar3, 1.0f), "gallery_item_" + intValue5);
                kfh d = ug3.d(b2c.f, false);
                oq5 oq5Var8 = (oq5) hq5Var5;
                int i5 = oq5Var8.P;
                androidx.compose.runtime.internal.a l = oq5Var8.l();
                yci H = vnj.H(hq5Var5, a);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var8.d0();
                if (oq5Var8.O) {
                    oq5Var8.k(grbVar);
                } else {
                    oq5Var8.n0();
                }
                g0g.U(hq5Var5, d, wp5.f);
                g0g.U(hq5Var5, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var8.O || !Intrinsics.d(oq5Var8.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var8, i5, kb5Var);
                }
                g0g.U(hq5Var5, H, wp5.d);
                l0d l0dVar = (l0d) z0dVar.e.get(intValue5);
                if (((Boolean) oq5Var8.j(koe.a)).booleanValue()) {
                    oq5Var8.Z(53758226);
                    n7w.v(l0dVar, intValue5, hq5Var5, intValue6 & 112);
                    oq5Var8.p(false);
                } else {
                    oq5Var8.Z(53989579);
                    if (l0dVar instanceof j0d) {
                        oq5Var8.Z(54040481);
                        Object K7 = oq5Var8.K();
                        if (K7 == obj5) {
                            K7 = szf.U(new bv5(fp7Var, intValue5, 1));
                            oq5Var8.k0(K7);
                        }
                        sdr sdrVar = (sdr) K7;
                        Continuation continuation = null;
                        if (d1dVar.c) {
                            oq5Var8.Z(54350822);
                            uf7 s = ghh.s(3);
                            oq5 oq5Var9 = (oq5) hq5Var5;
                            Object K8 = oq5Var9.K();
                            if (K8 == obj5) {
                                K8 = new fuw(s);
                                oq5Var9.k0(K8);
                            }
                            fuwVar = (fuw) K8;
                            oq5Var8.p(false);
                        } else {
                            oq5Var8.Z(54430709);
                            oq5Var8.p(false);
                            fuwVar = null;
                        }
                        Boolean bool = (Boolean) sdrVar.getValue();
                        bool.getClass();
                        boolean f2 = oq5Var8.f(fuwVar);
                        Object K9 = oq5Var8.K();
                        if (f2 || K9 == obj5) {
                            K9 = new gv5(fuwVar, sdrVar, continuation, 1);
                            oq5Var8.k0(K9);
                        }
                        gld.w(hq5Var5, bool, (Function2) K9);
                        Integer valueOf = Integer.valueOf(fp7Var.q());
                        boolean f3 = ((((intValue6 & 112) ^ 48) > 32 && oq5Var8.d(intValue5)) || (intValue6 & 48) == 32) | oq5Var8.f(fp7Var) | oq5Var8.f(fuwVar);
                        Object K10 = oq5Var8.K();
                        if (f3 || K10 == obj5) {
                            fuwVar2 = fuwVar;
                            K10 = new hv5(fp7Var, intValue5, fuwVar2, continuation, 1);
                            oq5Var8.k0(K10);
                        } else {
                            fuwVar2 = fuwVar;
                        }
                        gld.w(hq5Var5, valueOf, (Function2) K10);
                        n7w.p((j0d) l0dVar, hs1Var, d1dVar.b, jd6Var, fuwVar2, null, hq5Var5, 0);
                        z = false;
                        oq5Var8.p(false);
                    } else {
                        if (!(l0dVar instanceof k0d)) {
                            throw vz1.i(oq5Var8, -275353065, false);
                        }
                        oq5Var8.Z(-275308474);
                        k0d k0dVar = (k0d) l0dVar;
                        boolean h6 = oq5Var8.h(q0dVar);
                        Object K11 = oq5Var8.K();
                        if (h6 || K11 == obj5) {
                            K11 = new aub(1, q0dVar, q0d.class, "onVideoStateChanged", "onVideoStateChanged(Lcom/yandex/music/shared/video/api/ui/model/VideoLoadState;)V", 0, 4);
                            oq5Var8.k0(K11);
                        }
                        n7w.r(k0dVar, (Function1) ((h9f) K11), jd6Var, d1dVar.b, null, hq5Var5, 0);
                        z = false;
                        oq5Var8.p(false);
                    }
                    oq5Var8.p(z);
                }
                oq5Var8.p(true);
                return Unit.a;
            case 5:
                Function0 function0 = (Function0) obj10;
                String str = (String) obj9;
                mm6 mm6Var = (mm6) obj8;
                o3k o3kVar2 = (o3k) obj7;
                yoc yocVar = (yoc) obj6;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                hq5 hq5Var6 = (hq5) obj3;
                ((Integer) obj4).getClass();
                ((cl0) obj).getClass();
                if (booleanValue) {
                    oq5 oq5Var10 = (oq5) hq5Var6;
                    oq5Var10.Z(-734838407);
                    boolean f4 = oq5Var10.f(str);
                    Object K12 = oq5Var10.K();
                    if (f4 || K12 == obj5) {
                        K12 = new q1h(str, 9);
                        oq5Var10.k0(K12);
                    }
                    a0g.n(function0, androidx.compose.ui.platform.a.a(nfp.b(vciVar3, false, (Function1) K12), "onboarding_button_login"), false, false, false, 0.0f, sj2.d, oq5Var10, ScreenMirroringConfig.Video.BITRATE_1_5MB, 60);
                    oq5Var10.p(false);
                } else {
                    oq5 oq5Var11 = (oq5) hq5Var6;
                    oq5Var11.Z(-734501778);
                    boolean h7 = oq5Var11.h(mm6Var) | oq5Var11.f(o3kVar2) | oq5Var11.f(yocVar);
                    Object K13 = oq5Var11.K();
                    if (h7 || K13 == obj5) {
                        K13 = new cte(12, mm6Var, o3kVar2, yocVar);
                        oq5Var11.k0(K13);
                    }
                    Function0 function02 = (Function0) K13;
                    boolean f5 = oq5Var11.f(str);
                    Object K14 = oq5Var11.K();
                    if (f5 || K14 == obj5) {
                        K14 = new q1h(str, 10);
                        oq5Var11.k0(K14);
                    }
                    a0g.p(function02, androidx.compose.ui.platform.a.a(nfp.b(vciVar3, false, (Function1) K14), "onboarding_button_next"), false, false, 0L, null, sj2.e, oq5Var11, ScreenMirroringConfig.Video.BITRATE_1_5MB, 60);
                    oq5Var11.p(false);
                }
                return Unit.a;
            default:
                Object obj11 = (bc5) obj10;
                ynn ynnVar = (ynn) obj9;
                iwm iwmVar = (iwm) obj8;
                qw qwVar = (qw) obj7;
                sdr sdrVar2 = (sdr) obj6;
                uoi uoiVar = (uoi) obj2;
                hq5 hq5Var7 = (hq5) obj3;
                int intValue7 = ((Integer) obj4).intValue();
                ((dh3) obj).getClass();
                uoiVar.getClass();
                if ((intValue7 & 48) == 0) {
                    intValue7 |= ((oq5) hq5Var7).f(uoiVar) ? 32 : 16;
                }
                if ((intValue7 & 145) == 144) {
                    oq5 oq5Var12 = (oq5) hq5Var7;
                    if (oq5Var12.z()) {
                        oq5Var12.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var13 = (oq5) hq5Var7;
                oq5Var13.Z(31763555);
                oq5Var13.Z(31746394);
                oq5Var13.Z(31729149);
                boolean f6 = oq5Var13.f(obj11);
                Object K15 = oq5Var13.K();
                if (f6 || K15 == obj5) {
                    K15 = new qbp(0, obj11, bc5.class, "onClick", "onClick()V", 0, 23);
                    oq5Var13.k0(K15);
                }
                vci vciVar4 = vci.a;
                yci f7 = androidx.compose.foundation.a.f(vciVar4, uoiVar, null, false, new meo(0), null, null, (Function0) ((h9f) K15), 236);
                float f8 = 12;
                yci p = a.p(f7, f8, f8, 4, f8);
                boolean h8 = oq5Var13.h(iwmVar) | oq5Var13.h(qwVar);
                Object K16 = oq5Var13.K();
                if (h8 || K16 == obj5) {
                    K16 = new xi7(iwmVar, qwVar, i2);
                    oq5Var13.k0(K16);
                }
                yci b = com.yandex.music.core.ui.compose.a.b(p, ynnVar, 0L, 0.0f, null, (Function2) K16, 14);
                tw twVar = qwVar.a;
                wzn wznVar = twVar.b;
                diu diuVar = wznVar != null ? wznVar.a : null;
                if (diuVar == null) {
                    vciVar = vciVar4;
                    z2 = false;
                } else {
                    long j = diuVar.b;
                    boolean h9 = oq5Var13.h(iwmVar) | oq5Var13.h(diuVar);
                    Object K17 = oq5Var13.K();
                    if (h9 || K17 == obj5) {
                        K17 = new yi7(iwmVar, diuVar, 3);
                        oq5Var13.k0(K17);
                    }
                    vciVar = vciVar4;
                    b = b.f(com.yandex.music.core.ui.compose.a.b(vciVar, ynnVar, j, Float.MIN_VALUE, null, (Function2) K17, 8));
                    z2 = false;
                }
                oq5Var13.p(z2);
                ow owVar = twVar.a;
                diu diuVar2 = wznVar != null ? wznVar.b : null;
                if (diuVar2 != null) {
                    long j2 = diuVar2.b;
                    boolean h10 = oq5Var13.h(iwmVar) | oq5Var13.h(diuVar2);
                    Object K18 = oq5Var13.K();
                    if (h10 || K18 == obj5) {
                        K18 = new yi7(iwmVar, diuVar2, 4);
                        oq5Var13.k0(K18);
                    }
                    b = b.f(com.yandex.music.core.ui.compose.a.b(vciVar, ynnVar, j2, 0.5f, null, (Function2) K18, 8));
                }
                oq5Var13.p(false);
                diu diuVar3 = wznVar != null ? wznVar.c : null;
                if (diuVar3 == null) {
                    vciVar2 = vciVar;
                } else {
                    long j3 = diuVar3.b;
                    boolean h11 = oq5Var13.h(iwmVar) | oq5Var13.h(diuVar3);
                    Object K19 = oq5Var13.K();
                    if (h11 || K19 == obj5) {
                        K19 = new yi7(iwmVar, diuVar3, 5);
                        oq5Var13.k0(K19);
                    }
                    yci b2 = com.yandex.music.core.ui.compose.a.b(vciVar, ynnVar, j3, Float.MIN_VALUE, null, (Function2) K19, 8);
                    vciVar2 = vciVar;
                    b = b.f(b2);
                }
                oq5Var13.p(false);
                hz2 hz2Var2 = b2c.l;
                x2i x2iVar = qx0.a;
                nho a2 = lho.a(x2iVar, hz2Var2, oq5Var13, 48);
                int i6 = oq5Var13.P;
                androidx.compose.runtime.internal.a l2 = oq5Var13.l();
                yci H2 = vnj.H(oq5Var13, b);
                xp5.T.getClass();
                Function0 function03 = wp5.b;
                oq5Var13.d0();
                if (oq5Var13.O) {
                    oq5Var13.k(function03);
                } else {
                    oq5Var13.n0();
                }
                kb5 kb5Var2 = wp5.f;
                g0g.U(oq5Var13, a2, kb5Var2);
                kb5 kb5Var3 = wp5.e;
                g0g.U(oq5Var13, l2, kb5Var3);
                kb5 kb5Var4 = wp5.g;
                if (!oq5Var13.O) {
                    hz2Var = hz2Var2;
                    break;
                } else {
                    hz2Var = hz2Var2;
                }
                ouj.x(i6, oq5Var13, i6, kb5Var4);
                kb5 kb5Var5 = wp5.d;
                g0g.U(oq5Var13, H2, kb5Var5);
                iz2 iz2Var = b2c.f;
                yci u = xp3.u(d.m(vciVar2, 80), o5g.E(oq5Var13));
                kfh d2 = ug3.d(iz2Var, false);
                int i7 = oq5Var13.P;
                androidx.compose.runtime.internal.a l3 = oq5Var13.l();
                yci H3 = vnj.H(oq5Var13, u);
                oq5Var13.d0();
                if (oq5Var13.O) {
                    oq5Var13.k(function03);
                } else {
                    oq5Var13.n0();
                }
                g0g.U(oq5Var13, d2, kb5Var2);
                g0g.U(oq5Var13, l3, kb5Var3);
                if (oq5Var13.O || !Intrinsics.d(oq5Var13.K(), Integer.valueOf(i7))) {
                    ouj.x(i7, oq5Var13, i7, kb5Var4);
                }
                g0g.U(oq5Var13, H3, kb5Var5);
                u9b u9bVar = qwVar.b;
                if (u9bVar == null) {
                    oq5Var13.Z(-383652682);
                } else {
                    oq5Var13.Z(-383652681);
                    Object K20 = oq5Var13.K();
                    if (K20 == obj5) {
                        K20 = new h2q(24);
                        oq5Var13.k0(K20);
                    }
                    Function0 function04 = (Function0) K20;
                    function04.getClass();
                    ltg.e(qo6.b, ((Boolean) oq5Var13.j(koe.a)).booleanValue() ? u9bVar.e(200, WebPath$Storage.AVATARS) : u9bVar.e(((Number) function04.invoke()).intValue(), WebPath$Storage.AVATARS), orl.c(androidx.compose.ui.platform.a.a(d.c(vciVar2, 1.0f), "album_cover"), ((kw) sdrVar2.getValue()) != kw.a, ((dq0) oq5Var13.j(eq0.a)).c.d, oq5Var13), null, null, null, null, null, oq5Var13, 6, 248);
                }
                oq5Var13.p(false);
                if (((kw) sdrVar2.getValue()) != kw.a) {
                    oq5Var13.Z(-382951120);
                    orl.a(0, 6, 0L, oq5Var13, null, ((kw) sdrVar2.getValue()) == kw.b);
                    z3 = false;
                } else {
                    z3 = false;
                    oq5Var13.Z(-390946144);
                }
                oq5Var13.p(z3);
                oq5Var13.p(true);
                u1g.l(oq5Var13, d.r(vciVar2, f8));
                if (1.0f <= 0.0d) {
                    qme.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, 1.0f);
                ta5 a3 = sa5.a(qx0.e, b2c.n, oq5Var13, 6);
                int i8 = oq5Var13.P;
                androidx.compose.runtime.internal.a l4 = oq5Var13.l();
                yci H4 = vnj.H(oq5Var13, layoutWeightElement);
                oq5Var13.d0();
                if (oq5Var13.O) {
                    oq5Var13.k(function03);
                } else {
                    oq5Var13.n0();
                }
                g0g.U(oq5Var13, a3, kb5Var2);
                g0g.U(oq5Var13, l4, kb5Var3);
                if (oq5Var13.O || !Intrinsics.d(oq5Var13.K(), Integer.valueOf(i8))) {
                    ouj.x(i8, oq5Var13, i8, kb5Var4);
                }
                g0g.U(oq5Var13, H4, kb5Var5);
                lt ltVar = owVar.a;
                jzb jzbVar = ltVar.g;
                bg3.a(null, null, false, ild.C(-794408216, new qt(ltVar, ox6.E(jzbVar, 0L, oq5Var13, 6), jzbVar != null, 12), oq5Var13), oq5Var13, 3072, 7);
                u1g.l(oq5Var13, d.e(vciVar2, 2));
                ArrayList arrayList2 = owVar.b;
                Object K21 = oq5Var13.K();
                if (K21 == obj5) {
                    K21 = new haq(3);
                    oq5Var13.k0(K21);
                }
                xcs.b(CollectionsKt.X(arrayList2, null, null, null, (Function1) K21, 31), androidx.compose.ui.platform.a.a(vciVar2, "promo_album_artists"), kg5.r(R.color.text_secondary_night, oq5Var13), 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.j(), oq5Var13, 48, 3120, 55288);
                oq5Var13.p(true);
                lee.e.getClass();
                if (lee.f == kee.c) {
                    oq5Var13.Z(-735907653);
                    u1g.l(oq5Var13, d.r(vciVar2, 16));
                    boolean h12 = oq5Var13.h(iwmVar) | oq5Var13.h(qwVar);
                    Object K22 = oq5Var13.K();
                    if (h12 || K22 == obj5) {
                        K22 = new vi7(iwmVar, qwVar, 5);
                        oq5Var13.k0(K22);
                    }
                    rvf.m((Function0) K22, ((kw) sdrVar2.getValue()) == kw.b, null, kg5.r(R.color.icon_primary_night, oq5Var13), oq5Var13, 0, 4);
                    oq5Var13.p(false);
                    z4 = true;
                } else {
                    oq5Var13.Z(-735505645);
                    nho a4 = lho.a(x2iVar, hz2Var, oq5Var13, 48);
                    int i9 = oq5Var13.P;
                    androidx.compose.runtime.internal.a l5 = oq5Var13.l();
                    yci H5 = vnj.H(oq5Var13, vciVar2);
                    oq5Var13.d0();
                    if (oq5Var13.O) {
                        oq5Var13.k(function03);
                    } else {
                        oq5Var13.n0();
                    }
                    g0g.U(oq5Var13, a4, kb5Var2);
                    g0g.U(oq5Var13, l5, kb5Var3);
                    if (oq5Var13.O || !Intrinsics.d(oq5Var13.K(), Integer.valueOf(i9))) {
                        ouj.x(i9, oq5Var13, i9, kb5Var4);
                    }
                    g0g.U(oq5Var13, H5, kb5Var5);
                    boolean h13 = oq5Var13.h(iwmVar) | oq5Var13.h(qwVar);
                    Object K23 = oq5Var13.K();
                    if (h13 || K23 == obj5) {
                        K23 = new vi7(iwmVar, qwVar, 6);
                        oq5Var13.k0(K23);
                    }
                    u1g.o(0, 0L, oq5Var13, null, (Function0) K23);
                    boolean h14 = oq5Var13.h(iwmVar) | oq5Var13.h(qwVar);
                    Object K24 = oq5Var13.K();
                    if (h14 || K24 == obj5) {
                        K24 = new vi7(iwmVar, qwVar, 7);
                        oq5Var13.k0(K24);
                    }
                    rvf.m((Function0) K24, ((kw) sdrVar2.getValue()) == kw.b, null, 0L, oq5Var13, 0, 12);
                    z4 = true;
                    oq5Var13.p(true);
                    oq5Var13.p(false);
                }
                oq5Var13.p(z4);
                return Unit.a;
        }
    }

    public /* synthetic */ k71(Object obj, fvf fvfVar, fvf fvfVar2, Object obj2, Object obj3, int i) {
        this.a = i;
        this.d = obj;
        this.b = fvfVar;
        this.c = fvfVar2;
        this.e = obj2;
        this.f = obj3;
    }

    public /* synthetic */ k71(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
        this.c = obj4;
        this.f = obj5;
    }
}
