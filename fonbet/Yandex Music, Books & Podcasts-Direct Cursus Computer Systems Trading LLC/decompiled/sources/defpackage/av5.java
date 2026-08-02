package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class av5 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ av5(yci yciVar, Function0 function0, String str, String str2) {
        this.a = 8;
        this.b = yciVar;
        this.c = (ezc) function0;
        this.d = str;
        this.e = str2;
    }

    private final Object a(Object obj, Object obj2) {
        i3 i3Var = (i3) this.c;
        wsj wsjVar = (wsj) this.d;
        ysj ysjVar = (ysj) this.b;
        qnq qnqVar = (qnq) this.e;
        hq5 hq5Var = (hq5) obj;
        if ((((Integer) obj2).intValue() & 3) == 2) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        oq5 oq5Var2 = (oq5) hq5Var;
        boolean f = oq5Var2.f(wsjVar) | oq5Var2.f(ysjVar);
        Object K = oq5Var2.K();
        if (f || K == gq5.a) {
            l18 l18Var = l18.b;
            bdt I = hag.I(g0l.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            qsj qsjVar = new qsj(wsjVar, ysjVar, (g0l) qdcVar.C(I), qnqVar.d, q5g.x((tmb) i3Var.d, wsjVar.e), new w4i(2, (hsj) i3Var.b, hsj.class, "checkTrackAvailable", "checkTrackAvailable(Lru/yandex/music/data/audio/Track;Lkotlin/jvm/functions/Function0;)V", 0, 8), new s8i(i3Var, wsjVar, 10), new s9j(i3Var, 16));
            oq5Var2.k0(qsjVar);
            K = qsjVar;
        }
        lg3.d.invoke(wsjVar.j.a, (qsj) K, hq5Var, 0);
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:227:0x09c5 A[LOOP:0: B:227:0x09c5->B:245:0x0a75, LOOP_START, PHI: r3 r11
      0x09c5: PHI (r3v45 rk6) = (r3v33 rk6), (r3v46 rk6) binds: [B:226:0x09c3, B:245:0x0a75] A[DONT_GENERATE, DONT_INLINE]
      0x09c5: PHI (r11v7 int) = (r11v6 int), (r11v8 int) binds: [B:226:0x09c3, B:245:0x0a75] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0a9d A[LOOP:2: B:249:0x0a97->B:251:0x0a9d, LOOP_END] */
    /* JADX WARN: Type inference failed for: r2v32, types: [ezc, kotlin.jvm.functions.Function0] */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        char c;
        int i;
        int i2;
        long j;
        rk6 rk6Var;
        int i3;
        int i4;
        Iterator it;
        rk6 rk6Var2;
        boolean b;
        int i5 = 3;
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                i4w.e((iv5) this.c, (dib) this.d, (yci) this.b, (Function1) this.e, (hq5) obj, rvf.R(224641));
                return Unit.a;
            case 1:
                ((Integer) obj2).getClass();
                i4w.f((zu5) this.c, (hs1) this.d, (fuw) this.e, (yci) this.b, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 2:
                ((Integer) obj2).getClass();
                ox6.r((kx5) this.c, (Function0) this.d, (Function2) this.e, (yci) this.b, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 3:
                ((Integer) obj2).getClass();
                bg3.e((o16) this.c, (c26) this.d, (tvd) this.e, (yci) this.b, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 4:
                m36 m36Var = (m36) this.c;
                t36 t36Var = (t36) this.d;
                i3 i3Var = (i3) this.b;
                bz2 bz2Var = (bz2) this.e;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    boolean f = oq5Var.f(m36Var) | oq5Var.f(t36Var);
                    Object K = oq5Var.K();
                    if (f || K == gq5.a) {
                        w26 w26Var = new w26(m36Var, m36Var.f, t36Var, ((u26) i3Var.b).b(), bz2Var);
                        oq5Var.k0(w26Var);
                        K = w26Var;
                    }
                    up6.g((w26) K, null, oq5Var, 0);
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            case 5:
                p9f p9fVar = (p9f) this.c;
                Function0 function0 = (Function0) this.d;
                rxv rxvVar = (rxv) this.b;
                qk6 qk6Var = (qk6) this.e;
                utf utfVar = (utf) obj;
                ga6 ga6Var = (ga6) obj2;
                utfVar.getClass();
                ttf ttfVar = (ttf) p9fVar.invoke();
                long j2 = ((fma) function0.invoke()).a;
                float c2 = fma.c(j2);
                dnr dnrVar = utfVar.b;
                long b2 = ia6.b(dnrVar.L(c2), dnrVar.L(fma.b(j2)), 5);
                b2r G = wyf.G();
                Function1 e = G != null ? G.e() : null;
                b2r Q = wyf.Q(G);
                try {
                    rxvVar.q = a4g.i(dnrVar.n0(fma.c(j2)), dnrVar.n0(fma.b(j2)));
                    x6k x6kVar = rxvVar.p;
                    long j3 = ga6Var.a;
                    a4g.i(ga6.i(j3), ga6.h(j3));
                    if (((Boolean) x6kVar.getValue()).booleanValue()) {
                        c = ' ';
                    } else {
                        x6kVar.setValue(Boolean.TRUE);
                        c = ' ';
                        rxvVar.q(swf.i(nmq.d(rxvVar.q) * ((int) (rxvVar.d() >> 32)), nmq.b(rxvVar.q) * ((int) (rxvVar.d() & 4294967295L))));
                        rxvVar.m.setValue(new enj(rxvVar.g()));
                        rxvVar.n.setValue(new wpe(rxvVar.d()));
                    }
                    wyf.b0(G, Q, e);
                    long g = rxvVar.g();
                    long d = rxvVar.d();
                    ArrayList arrayList = new ArrayList();
                    int i6 = (int) (d >> c);
                    int i7 = (int) (d & 4294967295L);
                    long i8 = swf.i(i6 * ga6.i(b2), i7 * ga6.h(b2));
                    float e2 = rxvVar.h.e();
                    long g2 = enj.g(i8, g);
                    float ceil = (float) Math.ceil(ga6.i(j3) / e2);
                    float ceil2 = (float) Math.ceil(ga6.h(j3) / e2);
                    float f2 = 2;
                    float e3 = (ceil / f2) - enj.e(g2);
                    int i9 = ga6.i(b2) / 2;
                    float f3 = (ceil2 / f2) - enj.f(g2);
                    float f4 = i9;
                    int ceil3 = (int) Math.ceil((e3 - f4) / ga6.i(b2));
                    int ceil4 = (int) Math.ceil(((ceil - e3) - f4) / ga6.i(b2));
                    float h = ga6.h(b2) / 2;
                    rk6 rk6Var3 = new rk6(ceil3, ceil4, (int) Math.ceil((f3 - h) / ga6.h(b2)), (int) Math.ceil(((ceil2 - f3) - h) / ga6.h(b2)));
                    b2r G2 = wyf.G();
                    Function1 e4 = G2 != null ? G2.e() : null;
                    b2r Q2 = wyf.Q(G2);
                    try {
                        rxvVar.k = rk6Var3;
                        if (rk6Var3.equals(qk6Var.g)) {
                            wpe wpeVar = qk6Var.f;
                            if (wpeVar == null) {
                                i = ceil3;
                                i2 = ceil4;
                                b = false;
                            } else {
                                i = ceil3;
                                i2 = ceil4;
                                b = wpe.b(wpeVar.a, d);
                            }
                            if (b) {
                                rk6Var = rk6Var3;
                                j = b2;
                                wyf.b0(G2, Q2, e4);
                                i3 = i6 - i2;
                                i4 = i6 + i;
                                if (i3 <= i4) {
                                    while (true) {
                                        int i10 = i7 - rk6Var.d;
                                        int i11 = i7 + rk6Var.c;
                                        if (i10 <= i11) {
                                            while (true) {
                                                long i12 = swf.i(i3 * ga6.i(j), i10 * ga6.h(j));
                                                geh gehVar = new geh(i3, i10);
                                                rk6Var2 = rk6Var;
                                                if (enj.e(g) >= enj.e(i12) - (ga6.i(j) * 0.5f)) {
                                                    if (enj.e(g) <= (ga6.i(j) * 0.5f) + enj.e(i12) && enj.f(g) >= enj.f(i12) - (ga6.h(j) * 0.5f)) {
                                                        if (enj.f(g) <= (ga6.h(j) * 0.5f) + enj.f(i12)) {
                                                            rxvVar.f.setValue(new wpe(xv.t(i3, i10)));
                                                        }
                                                    }
                                                }
                                                int d2 = ttfVar.d(gehVar);
                                                if (d2 != -1) {
                                                    arrayList.add(new Pair(Integer.valueOf(d2), new Pair(gehVar, utfVar.a(d2, j))));
                                                }
                                                if (i10 != i11) {
                                                    i10++;
                                                    rk6Var = rk6Var2;
                                                }
                                            }
                                        } else {
                                            rk6Var2 = rk6Var;
                                        }
                                        if (i3 != i4) {
                                            i3++;
                                            rk6Var = rk6Var2;
                                        }
                                    }
                                }
                                List o0 = CollectionsKt.o0(arrayList, new dl4(14));
                                ArrayList arrayList2 = new ArrayList(v75.o(o0, 10));
                                it = o0.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add((Pair) ((Pair) it.next()).b);
                                }
                                return mfh.m0(utfVar, ga6.i(j3), ga6.h(j3), new nk6(arrayList2, swf.i((ga6.i(j3) / 2.0f) - enj.e(g), (ga6.h(j3) / 2.0f) - enj.f(g)), 0));
                            }
                        } else {
                            i = ceil3;
                            i2 = ceil4;
                        }
                        ok6 ok6Var = qk6Var.a.l;
                        if (ok6Var.a != 0) {
                            mm6 mm6Var = qk6Var.d;
                            pk6 pk6Var = new pk6(qk6Var, d, b2, ok6Var, rk6Var3, null);
                            j = b2;
                            rk6Var = rk6Var3;
                            x97.y(mm6Var, null, null, pk6Var, 3);
                            wyf.b0(G2, Q2, e4);
                            i3 = i6 - i2;
                            i4 = i6 + i;
                            if (i3 <= i4) {
                            }
                            List o02 = CollectionsKt.o0(arrayList, new dl4(14));
                            ArrayList arrayList22 = new ArrayList(v75.o(o02, 10));
                            it = o02.iterator();
                            while (it.hasNext()) {
                            }
                            return mfh.m0(utfVar, ga6.i(j3), ga6.h(j3), new nk6(arrayList22, swf.i((ga6.i(j3) / 2.0f) - enj.e(g), (ga6.h(j3) / 2.0f) - enj.f(g)), 0));
                        }
                        rk6Var = rk6Var3;
                        j = b2;
                        wyf.b0(G2, Q2, e4);
                        i3 = i6 - i2;
                        i4 = i6 + i;
                        if (i3 <= i4) {
                        }
                        List o022 = CollectionsKt.o0(arrayList, new dl4(14));
                        ArrayList arrayList222 = new ArrayList(v75.o(o022, 10));
                        it = o022.iterator();
                        while (it.hasNext()) {
                        }
                        return mfh.m0(utfVar, ga6.i(j3), ga6.h(j3), new nk6(arrayList222, swf.i((ga6.i(j3) / 2.0f) - enj.e(g), (ga6.h(j3) / 2.0f) - enj.f(g)), 0));
                    } finally {
                    }
                } finally {
                }
            case 6:
                uo4 uo4Var = (uo4) this.c;
                z9u z9uVar = (z9u) this.d;
                hp4 hp4Var = (hp4) this.b;
                e9g e9gVar = (e9g) this.e;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    lxe.c(z9uVar, hp4Var, null, e9gVar, uo4Var == uo4.c || uo4Var == uo4.a, oq5Var2, 0);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
            case 7:
                ((Integer) obj2).getClass();
                ksw.s((cvl) this.c, (kr6) this.d, (Function0) this.b, (Function1) this.e, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 8:
                yci yciVar = (yci) this.b;
                ?? r2 = (ezc) this.c;
                String str = (String) this.d;
                String str2 = (String) this.e;
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var3;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        return Unit.a;
                    }
                }
                bg3.a(a.a(d.d(wyf.C(yciVar, r2, 0.0f, 0.0f, 14), 1.0f), "dialog_action_description"), null, false, ild.C(-434837509, new ar(26, str, str2), hq5Var3), hq5Var3, 3072, 6);
                return Unit.a;
            case 9:
                fvf fvfVar = (fvf) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                o0k o0kVar = (o0k) this.b;
                yda ydaVar = (yda) this.e;
                hq5 hq5Var4 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var4 = (oq5) hq5Var4;
                if (oq5Var4.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    c3x.t(fvfVar, arrayList3, oq5Var4, 0);
                    vm C = ghh.C(o0kVar, androidx.compose.foundation.layout.a.c(0.0f, 24, 0.0f, 16, 5));
                    yci a = a.a(d.c(vci.a, 1.0f), "artist_list");
                    boolean f5 = oq5Var4.f(arrayList3) | oq5Var4.h(ydaVar);
                    Object K2 = oq5Var4.K();
                    if (f5 || K2 == gq5.a) {
                        K2 = new ny2(21, arrayList3, ydaVar);
                        oq5Var4.k0(K2);
                    }
                    weo.f(a, fvfVar, C, null, null, null, false, null, (Function1) K2, oq5Var4, 6, 504);
                } else {
                    oq5Var4.S();
                }
                return Unit.a;
            case 10:
                ((Integer) obj2).getClass();
                vq1.m((yci) this.b, (mj2) this.c, (Function0) this.d, (wn5) this.e, (hq5) obj, rvf.R(3073));
                return Unit.a;
            case 11:
                rnl rnlVar = (rnl) this.c;
                otb otbVar = (otb) this.d;
                kub kubVar = (kub) this.b;
                sdr sdrVar = (sdr) this.e;
                hq5 hq5Var5 = (hq5) obj;
                int intValue4 = ((Integer) obj2).intValue();
                kjn kjnVar = gq5.a;
                oq5 oq5Var5 = (oq5) hq5Var5;
                if (oq5Var5.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    yci o = androidx.compose.foundation.layout.a.o(d.d(vci.a, 1.0f), 12, 0.0f, 2);
                    cwk cwkVar = ((v7l) sdrVar.getValue()).a ? cwk.b : cwk.a;
                    zi6 zi6Var = rnlVar.e;
                    n1g n1gVar = rnlVar.c;
                    tbl tblVar = otbVar.b;
                    boolean h2 = oq5Var5.h(kubVar);
                    Object K3 = oq5Var5.K();
                    if (h2 || K3 == kjnVar) {
                        ceb cebVar = new ceb(0, kubVar, kub.class, "onLikeClick", "onLikeClick()V", 0, 10);
                        oq5Var5.k0(cebVar);
                        K3 = cebVar;
                    }
                    h9f h9fVar = (h9f) K3;
                    boolean h3 = oq5Var5.h(kubVar);
                    Object K4 = oq5Var5.K();
                    if (h3 || K4 == kjnVar) {
                        ceb cebVar2 = new ceb(0, kubVar, kub.class, "onDislikeClick", "onDislikeClick()V", 0, 11);
                        oq5Var5.k0(cebVar2);
                        K4 = cebVar2;
                    }
                    h9f h9fVar2 = (h9f) K4;
                    boolean h4 = oq5Var5.h(kubVar);
                    Object K5 = oq5Var5.K();
                    if (h4 || K5 == kjnVar) {
                        ceb cebVar3 = new ceb(0, kubVar, kub.class, "onPlayClick", "onPlayClick()V", 0, 12);
                        oq5Var5.k0(cebVar3);
                        K5 = cebVar3;
                    }
                    h9f h9fVar3 = (h9f) K5;
                    boolean h5 = oq5Var5.h(kubVar);
                    Object K6 = oq5Var5.K();
                    if (h5 || K6 == kjnVar) {
                        o57 o57Var = new o57(1, kubVar, kub.class, "onPrevious", "onPrevious(Lcom/yandex/music/screen/player/ui/ControlsUiData$SkippingType;)V", 0, 17);
                        oq5Var5.k0(o57Var);
                        K6 = o57Var;
                    }
                    h9f h9fVar4 = (h9f) K6;
                    boolean h6 = oq5Var5.h(kubVar);
                    Object K7 = oq5Var5.K();
                    if (h6 || K7 == kjnVar) {
                        o57 o57Var2 = new o57(1, kubVar, kub.class, "onNext", "onNext(Lcom/yandex/music/screen/player/ui/ControlsUiData$SkippingType;)V", 0, 18);
                        oq5Var5.k0(o57Var2);
                        K7 = o57Var2;
                    }
                    h9f h9fVar5 = (h9f) K7;
                    boolean h7 = oq5Var5.h(kubVar);
                    Object K8 = oq5Var5.K();
                    if (h7 || K8 == kjnVar) {
                        K8 = new o57(1, kubVar, kub.class, "onPreviousLongPressInteraction", "onPreviousLongPressInteraction(Lcom/yandex/music/screen/player/ui/expanded/components/LongPressInteraction;)V", 0, 19);
                        oq5Var5.k0(K8);
                    }
                    h9f h9fVar6 = (h9f) K8;
                    boolean h8 = oq5Var5.h(kubVar);
                    Object K9 = oq5Var5.K();
                    if (h8 || K9 == kjnVar) {
                        o57 o57Var3 = new o57(1, kubVar, kub.class, "onNextLongPressInteraction", "onNextLongPressInteraction(Lcom/yandex/music/screen/player/ui/expanded/components/LongPressInteraction;)V", 0, 20);
                        oq5Var5.k0(o57Var3);
                        K9 = o57Var3;
                    }
                    kg5.d(cwkVar, zi6Var, n1gVar, (Function0) h9fVar, (Function0) h9fVar2, (Function0) h9fVar3, (Function1) h9fVar4, (Function1) h9fVar5, (Function1) h9fVar6, (Function1) ((h9f) K9), o, tblVar, oq5Var5, 0);
                } else {
                    oq5Var5.S();
                }
                return Unit.a;
            case 12:
                ((Integer) obj2).getClass();
                ox6.p((j2e) this.c, (qnq) this.d, (nnq) this.b, (tmb) this.e, (hq5) obj, rvf.R(33287));
                return Unit.a;
            case 13:
                ((Integer) obj2).getClass();
                leu.n((qyf) this.c, (fle) this.d, (nke) this.e, (yci) this.b, (hq5) obj, rvf.R(577));
                return Unit.a;
            case 14:
                ((Integer) obj2).getClass();
                a0g.f((mwg) this.c, (List) this.d, (Function2) this.b, (Function0) this.e, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 15:
                x0h x0hVar = (x0h) this.c;
                bci bciVar = (bci) this.d;
                sai saiVar = (sai) this.b;
                Function0 function02 = (Function0) this.e;
                hq5 hq5Var6 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var6 = (oq5) hq5Var6;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        return Unit.a;
                    }
                }
                u0h u0hVar = x0hVar.b;
                oev oevVar = x0hVar.c;
                oq5 oq5Var7 = (oq5) hq5Var6;
                boolean f6 = oq5Var7.f(saiVar) | oq5Var7.f(function02);
                Object K10 = oq5Var7.K();
                if (f6 || K10 == gq5.a) {
                    K10 = new y6g(i5, saiVar, function02);
                    oq5Var7.k0(K10);
                }
                v3g.f(u0hVar, oevVar, bciVar, (Function0) K10, x0hVar.e, oq5Var7, RemoteCameraConfig.Mic.BUFFER_SIZE);
                return Unit.a;
            case 16:
                sdr sdrVar2 = (sdr) this.c;
                iil iilVar = (iil) this.d;
                c6h c6hVar = (c6h) this.b;
                hvb hvbVar = (hvb) this.e;
                hq5 hq5Var7 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var8 = (oq5) hq5Var7;
                    if (oq5Var8.z()) {
                        oq5Var8.S();
                        return Unit.a;
                    }
                }
                boolean z = ((u7l) sdrVar2.getValue()).a;
                h5l h5lVar = iilVar.b;
                eml emlVar = iilVar.a.b.b;
                yci d3 = d.d(vci.a, 1.0f);
                float f7 = ivb.a;
                hvbVar.getClass();
                fj6.a(z, h5lVar, emlVar, c6hVar, d3, hvbVar instanceof fvb, hq5Var7, 24576, 0);
                return Unit.a;
            case 17:
                fvf fvfVar2 = (fvf) this.c;
                o0k o0kVar2 = (o0k) this.d;
                zab zabVar = (zab) this.b;
                vti vtiVar = (vti) this.e;
                hq5 hq5Var8 = (hq5) obj;
                int intValue5 = ((Integer) obj2).intValue();
                oq5 oq5Var9 = (oq5) hq5Var8;
                if (oq5Var9.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    vm C2 = ghh.C(o0kVar2, androidx.compose.foundation.layout.a.c(0.0f, 8, 0.0f, 16, 5));
                    boolean f8 = oq5Var9.f(zabVar) | oq5Var9.h(vtiVar);
                    Object K11 = oq5Var9.K();
                    if (f8 || K11 == gq5.a) {
                        K11 = new dae(29, zabVar, vtiVar);
                        oq5Var9.k0(K11);
                    }
                    weo.f(null, fvfVar2, C2, null, null, null, false, null, (Function1) K11, oq5Var9, 0, 505);
                } else {
                    oq5Var9.S();
                }
                return Unit.a;
            case 18:
                fvf fvfVar3 = (fvf) this.c;
                o0k o0kVar3 = (o0k) this.d;
                lvi lviVar = (lvi) this.b;
                dvi dviVar = (dvi) this.e;
                hq5 hq5Var9 = (hq5) obj;
                int intValue6 = ((Integer) obj2).intValue();
                oq5 oq5Var10 = (oq5) hq5Var9;
                if (oq5Var10.P(intValue6 & 1, (intValue6 & 3) != 2)) {
                    yci a2 = a.a(vci.a, "my_shelf_lazy_column");
                    vm C3 = ghh.C(o0kVar3, androidx.compose.foundation.layout.a.c(0.0f, 0.0f, 0.0f, 16, 7));
                    boolean f9 = oq5Var10.f(lviVar) | oq5Var10.h(dviVar);
                    Object K12 = oq5Var10.K();
                    if (f9 || K12 == gq5.a) {
                        K12 = new avi(r9 ? 1 : 0, lviVar, dviVar);
                        oq5Var10.k0(K12);
                    }
                    weo.f(a2, fvfVar3, C3, null, null, null, false, null, (Function1) K12, oq5Var10, 6, 504);
                } else {
                    oq5Var10.S();
                }
                return Unit.a;
            case 19:
                ((Integer) obj2).getClass();
                wdg.a((w4k) this.c, (o6g) this.d, (yci) this.b, (String) this.e, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 20:
                ((Integer) obj2).getClass();
                j66.u((i5j) this.c, (yci) this.b, (String) this.d, (String) this.e, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 21:
                ((Integer) obj2).getClass();
                szf.c((a9j) this.c, (bci) this.d, (w8j) this.e, (yci) this.b, (hq5) obj, rvf.R(3137));
                return Unit.a;
            case 22:
                fvf fvfVar4 = (fvf) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                o0k o0kVar4 = (o0k) this.b;
                l9j l9jVar = (l9j) this.e;
                hq5 hq5Var10 = (hq5) obj;
                int intValue7 = ((Integer) obj2).intValue();
                oq5 oq5Var11 = (oq5) hq5Var10;
                if (oq5Var11.P(intValue7 & 1, (intValue7 & 3) != 2)) {
                    c3x.t(fvfVar4, arrayList4, oq5Var11, 0);
                    yci a3 = a.a(d.c(vci.a, 1.0f), "collection_non_music_albums_content");
                    vm C4 = ghh.C(o0kVar4, androidx.compose.foundation.layout.a.a(0.0f, 16, 1));
                    boolean f10 = oq5Var11.f(arrayList4) | oq5Var11.h(l9jVar);
                    Object K13 = oq5Var11.K();
                    if (f10 || K13 == gq5.a) {
                        K13 = new avi(i5, arrayList4, l9jVar);
                        oq5Var11.k0(K13);
                    }
                    weo.f(a3, fvfVar4, C4, null, null, null, false, null, (Function1) K13, oq5Var11, 6, 504);
                } else {
                    oq5Var11.S();
                }
                return Unit.a;
            case 23:
                raj rajVar = (raj) this.c;
                frs frsVar = (frs) this.d;
                e9g e9gVar2 = (e9g) this.b;
                lzs lzsVar = (lzs) this.e;
                hq5 hq5Var11 = (hq5) obj;
                int intValue8 = ((Integer) obj2).intValue();
                oq5 oq5Var12 = (oq5) hq5Var11;
                if (oq5Var12.P(intValue8 & 1, (intValue8 & 3) != 2)) {
                    vut.r(rajVar.a, lzsVar, xp3.u(vci.a, lsq.r(e9gVar2, qo6.a, oq5Var12, 48)), null, lsq.s(e9gVar2), frsVar == frs.c, oq5Var12, 0, 8);
                } else {
                    oq5Var12.S();
                }
                return Unit.a;
            case 24:
                ((Integer) obj2).getClass();
                s7g.b((tx) this.c, (Function2) this.d, (Function2) this.b, (ryc) this.e, (hq5) obj, rvf.R(9));
                return Unit.a;
            case 25:
                fvf fvfVar5 = (fvf) this.c;
                ArrayList arrayList5 = (ArrayList) this.d;
                o0k o0kVar5 = (o0k) this.b;
                mdj mdjVar = (mdj) this.e;
                hq5 hq5Var12 = (hq5) obj;
                int intValue9 = ((Integer) obj2).intValue();
                oq5 oq5Var13 = (oq5) hq5Var12;
                if (oq5Var13.P(intValue9 & 1, (intValue9 & 3) != 2)) {
                    c3x.t(fvfVar5, arrayList5, oq5Var13, 0);
                    l18 l18Var = l18.b;
                    bdt I = hag.I(fdj.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    fdj fdjVar = (fdj) qdcVar.C(I);
                    yci a4 = a.a(d.c(vci.a, 1.0f), "collection_non_music_tracks_content");
                    vm C5 = ghh.C(o0kVar5, androidx.compose.foundation.layout.a.a(0.0f, 16, 1));
                    boolean f11 = oq5Var13.f(arrayList5) | oq5Var13.h(mdjVar) | oq5Var13.h(fdjVar);
                    Object K14 = oq5Var13.K();
                    if (f11 || K14 == gq5.a) {
                        K14 = new p3e(11, arrayList5, mdjVar, fdjVar);
                        oq5Var13.k0(K14);
                    }
                    weo.f(a4, fvfVar5, C5, null, null, null, false, null, (Function1) K14, oq5Var13, 6, 504);
                } else {
                    oq5Var13.S();
                }
                return Unit.a;
            case 26:
                ((Integer) obj2).getClass();
                ocg.c((String) this.c, (String) this.d, (j0s) this.b, (Function1) this.e, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 27:
                return a(obj, obj2);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((Integer) obj2).getClass();
                hdg.q((String) this.c, (Function0) this.d, (yci) this.b, (q0k) this.e, (hq5) obj, rvf.R(3457));
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                ldg.a((dsl) this.c, (bci) this.d, (yrl) this.e, (yci) this.b, (hq5) obj, rvf.R(3137));
                return Unit.a;
        }
    }

    public /* synthetic */ av5(yci yciVar, mj2 mj2Var, Function0 function0, wn5 wn5Var, int i) {
        this.a = 10;
        this.b = yciVar;
        this.c = mj2Var;
        this.d = function0;
        this.e = wn5Var;
    }

    public /* synthetic */ av5(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.e = obj4;
    }

    public /* synthetic */ av5(i5j i5jVar, yci yciVar, String str, String str2, int i) {
        this.a = 20;
        this.c = i5jVar;
        this.b = yciVar;
        this.d = str;
        this.e = str2;
    }

    public /* synthetic */ av5(Object obj, Object obj2, Object obj3, yci yciVar, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = yciVar;
    }

    public /* synthetic */ av5(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.e = obj4;
    }
}
