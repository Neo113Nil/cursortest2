package defpackage;

import android.os.Build;
import android.view.ViewTreeObserver;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.pulse.metrics.o;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.data.DecoderData;
import ru.yandex.video.m3.data.PlaybackStats;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.player.PreparingParams;

/* loaded from: classes.dex */
public final class lma extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lma(Function1 function1, ooi ooiVar, xzb xzbVar) {
        super(1);
        this.r = 12;
        this.s = (uif) function1;
        this.t = ooiVar;
        this.u = xzbVar;
    }

    private final Object a(Object obj) {
        if6 if6Var = (if6) obj;
        qbs qbsVar = (qbs) this.u;
        int i = ((xxh) ((sdr) this.s).getValue()).a;
        nf6 nf6Var = (nf6) this.t;
        y9s y9sVar = y9s.Cut;
        if ((i & 4) == 4) {
            if6.b(if6Var, new y5(7, y9sVar), new tbs(nf6Var, qbsVar, 0));
        }
        y9s y9sVar2 = y9s.Copy;
        if ((i & 1) == 1) {
            if6.b(if6Var, new y5(7, y9sVar2), new tbs(nf6Var, qbsVar, 1));
        }
        y9s y9sVar3 = y9s.Paste;
        if ((i & 2) == 2) {
            if6.b(if6Var, new y5(7, y9sVar3), new tbs(nf6Var, qbsVar, 2));
        }
        y9s y9sVar4 = y9s.SelectAll;
        if ((i & 8) == 8) {
            if6.b(if6Var, new y5(7, y9sVar4), new tbs(nf6Var, qbsVar, 3));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            y9s y9sVar5 = y9s.Autofill;
            if (qbsVar.h() && rds.b(qbsVar.k().b)) {
                if6.b(if6Var, new y5(7, y9sVar5), new tbs(nf6Var, qbsVar, 4));
            }
        }
        return Unit.a;
    }

    private final Object d(Object obj) {
        Function1 function1;
        bs1 bs1Var = (bs1) obj;
        if (bs1Var instanceof zr1) {
            Function1 function12 = (Function1) this.s;
            if (function12 != null) {
                function12.invoke(bs1Var);
            }
        } else if (bs1Var instanceof as1) {
            Function1 function13 = (Function1) this.t;
            if (function13 != null) {
                function13.invoke(bs1Var);
            }
        } else if ((bs1Var instanceof yr1) && (function1 = (Function1) this.u) != null) {
            function1.invoke(bs1Var);
        }
        return Unit.a;
    }

    private final Object g(Object obj) {
        bs1 bs1Var = (bs1) obj;
        if (bs1Var instanceof zr1) {
            w4k w4kVar = (w4k) this.s;
            return w4kVar != null ? new zr1(w4kVar) : (zr1) bs1Var;
        }
        if (!(bs1Var instanceof yr1)) {
            return bs1Var;
        }
        yr1 yr1Var = (yr1) bs1Var;
        pgb pgbVar = yr1Var.b;
        if (pgbVar.c instanceof sgj) {
            w4k w4kVar2 = (w4k) this.t;
            return w4kVar2 != null ? new yr1(w4kVar2, pgbVar) : yr1Var;
        }
        w4k w4kVar3 = (w4k) this.u;
        return w4kVar3 != null ? new yr1(w4kVar3, pgbVar) : yr1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r12v8, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Type inference failed for: r13v12, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        String str2;
        ipa ipaVar;
        ln0 ln0Var;
        Integer e;
        Integer d;
        Integer d2;
        Integer e2;
        cds cdsVar;
        cds cdsVar2;
        dds ddsVar;
        dds ddsVar2;
        cds cdsVar3;
        cds cdsVar4;
        dds ddsVar3;
        dds ddsVar4;
        Integer d3;
        Integer e3;
        Integer e4;
        Integer d4;
        rjp rjpVar;
        int i = this.r;
        int i2 = 2;
        boolean z = false;
        int i3 = 1;
        a7t a7tVar = 0;
        ybs ybsVar = null;
        r10 = null;
        ybs ybsVar2 = null;
        a7tVar = 0;
        Object obj2 = this.t;
        Object obj3 = this.u;
        Object obj4 = this.s;
        switch (i) {
            case 0:
                w9t w9tVar = (w9t) obj;
                mma mmaVar = (mma) w9tVar;
                if (!((ng0) bcx.G((mma) obj2).getDragAndDropManager()).b.contains(mmaVar) || !jf0.t(mmaVar, nt0.E((efo) obj3))) {
                    return v9t.a;
                }
                ((xqn) obj4).a = w9tVar;
                return v9t.c;
            case 1:
                x8a x8aVar = (x8a) obj4;
                ezf.r(x8aVar, (lfm) obj);
                iur iurVar = (iur) ((pfm) obj2);
                iurVar.getClass();
                float e5 = bcx.F(iurVar).A.e();
                long b = x8aVar.b(bzf.s(e5, e5));
                x8aVar.f();
                zi3 zi3Var = ((hoa) obj3).u;
                if (zi3Var != null) {
                    kr3 kr3Var = zoa.a;
                    zi3Var.c(new ana(bzf.s(Float.isNaN(yzt.b(b)) ? 0.0f : yzt.b(b), Float.isNaN(yzt.c(b)) ? 0.0f : yzt.c(b))));
                }
                return Unit.a;
            case 2:
                jsk jskVar = (jsk) obj;
                boolean F = ((mfh) obj4).F();
                roa roaVar = (roa) obj2;
                ia0 ia0Var = roaVar.o;
                float c = F ? ia0Var.g().c(((zx7) roaVar.o.j).getValue()) : ia0Var.k();
                bxj bxjVar = roaVar.q;
                jskVar.d((ksk) obj3, eeh.b(bxjVar == bxj.b ? c : 0.0f), eeh.b(bxjVar == bxj.a ? c : 0.0f), 0.0f);
                return Unit.a;
            case 3:
                jsk jskVar2 = (jsk) obj;
                boolean F2 = ((mfh) obj4).F();
                toa toaVar = (toa) obj2;
                ka0 ka0Var = toaVar.o;
                float c2 = F2 ? ka0Var.e().c(toaVar.o.h.getValue()) : ka0Var.g();
                bxj bxjVar2 = toaVar.q;
                jskVar2.d((ksk) obj3, eeh.b(bxjVar2 == bxj.b ? c2 : 0.0f), eeh.b(bxjVar2 == bxj.a ? c2 : 0.0f), 0.0f);
                return Unit.a;
            case 4:
                zco zcoVar = (zco) obj;
                sdr sdrVar = (sdr) obj2;
                sdr sdrVar2 = (sdr) obj4;
                zcoVar.a(sdrVar2 != null ? ((Number) sdrVar2.getValue()).floatValue() : 1.0f);
                zcoVar.k(sdrVar != null ? ((Number) sdrVar.getValue()).floatValue() : 1.0f);
                zcoVar.n(sdrVar != null ? ((Number) sdrVar.getValue()).floatValue() : 1.0f);
                sdr sdrVar3 = (sdr) obj3;
                zcoVar.v(sdrVar3 != null ? ((a7t) sdrVar3.getValue()).a : a7t.b);
                return Unit.a;
            case 5:
                vpb vpbVar = (vpb) obj3;
                int ordinal = ((r8b) obj).ordinal();
                if (ordinal == 0) {
                    g8t g8tVar = vpbVar.a;
                } else if (ordinal == 1) {
                    a7tVar = (a7t) obj4;
                } else {
                    if (ordinal != 2) {
                        b6e.s();
                        return null;
                    }
                    g8t g8tVar2 = vpbVar.a;
                }
                return new a7t(a7tVar != 0 ? a7tVar.a : a7t.b);
            case 6:
                o0l o0lVar = (o0l) obj;
                o0lVar.getClass();
                o0lVar.b = (Long) obj4;
                o0lVar.h = Boolean.valueOf(((nfb) ((ild) obj2)).o);
                PreparingParams preparingParams = (PreparingParams) obj3;
                o0lVar.j = preparingParams != null ? Boolean.valueOf(preparingParams.getIsOffline()) : null;
                o0lVar.k = preparingParams != null ? preparingParams.getManifestDataSourceParameters() : null;
                o0lVar.l = preparingParams != null ? preparingParams.getChunkDataSourceParameters() : null;
                return Unit.a;
            case 7:
                dpc dpcVar = (dpc) obj;
                if (!Intrinsics.d(dpcVar, (dpc) obj4)) {
                    if (Intrinsics.d(dpcVar, ((uoc) obj2).f)) {
                        xq0.q("Focus search landed at the root.");
                        return null;
                    }
                    z = ((Boolean) ((uif) obj3).invoke(dpcVar)).booleanValue();
                }
                return Boolean.valueOf(z);
            case 8:
                feg fegVar = (feg) obj;
                fegVar.getClass();
                u7e u7eVar = (u7e) obj4;
                String str3 = u7eVar.d;
                str3.getClass();
                fegVar.a = str3;
                fegVar.b = u7eVar.i;
                cfg cfgVar = (cfg) obj2;
                fegVar.c = cfgVar.d;
                fegVar.d = cfgVar.e;
                boh bohVar = (boh) obj3;
                switch (bohVar.b) {
                    case -2:
                        str = "TRACK_TYPE_NONE";
                        break;
                    case -1:
                    default:
                        str = "TRACK_TYPE_UNKNOWN";
                        break;
                    case 0:
                        str = "TRACK_TYPE_DEFAULT";
                        break;
                    case 1:
                        str = "TRACK_TYPE_AUDIO";
                        break;
                    case 2:
                        str = "TRACK_TYPE_VIDEO";
                        break;
                    case 3:
                        str = "TRACK_TYPE_TEXT";
                        break;
                    case 4:
                        str = "TRACK_TYPE_IMAGE";
                        break;
                    case 5:
                        str = "TRACK_TYPE_METADATA";
                        break;
                    case 6:
                        str = "TRACK_TYPE_CAMERA_MOTION";
                        break;
                }
                fegVar.e = str;
                fegVar.f = String.valueOf(bohVar.c);
                switch (bohVar.a) {
                    case 1:
                        str2 = "DATA_TYPE_MEDIA";
                        break;
                    case 2:
                        str2 = "DATA_TYPE_MEDIA_INITIALIZATION";
                        break;
                    case 3:
                        str2 = "DATA_TYPE_DRM";
                        break;
                    case 4:
                        str2 = "DATA_TYPE_MANIFEST";
                        break;
                    case 5:
                        str2 = "DATA_TYPE_TIME_SYNCHRONIZATION";
                        break;
                    case 6:
                        str2 = "DATA_TYPE_AD";
                        break;
                    default:
                        str2 = "DATA_TYPE_UNKNOWN";
                        break;
                }
                fegVar.g = str2;
                return Unit.a;
            case 9:
                jpa jpaVar = (jpa) obj;
                opf opfVar = (opf) obj4;
                ou3 ou3Var = opfVar.a;
                ipa ipaVar2 = opfVar.b;
                opfVar.b = (ipa) obj2;
                try {
                    jx7 y = jpaVar.q0().y();
                    xof A = jpaVar.q0().A();
                    mu3 s = jpaVar.q0().s();
                    long B = jpaVar.q0().B();
                    xod xodVar = (xod) jpaVar.q0().c;
                    Function1 function1 = (Function1) obj3;
                    jx7 y2 = ou3Var.b.y();
                    xof A2 = ou3Var.b.A();
                    mu3 s2 = ou3Var.b.s();
                    long B2 = ou3Var.b.B();
                    nsh nshVar = ou3Var.b;
                    try {
                        xod xodVar2 = (xod) nshVar.c;
                        nshVar.O(y);
                        nshVar.P(A);
                        nshVar.M(s);
                        nshVar.R(B);
                        nshVar.c = xodVar;
                        s.r();
                        try {
                            function1.invoke(opfVar);
                            s.k();
                            nsh nshVar2 = ou3Var.b;
                            nshVar2.O(y2);
                            nshVar2.P(A2);
                            nshVar2.M(s2);
                            nshVar2.R(B2);
                            nshVar2.c = xodVar2;
                            opfVar.b = ipaVar2;
                            return Unit.a;
                        } catch (Throwable th) {
                            ipaVar = ipaVar2;
                            try {
                                s.k();
                                nsh nshVar3 = ou3Var.b;
                                nshVar3.O(y2);
                                nshVar3.P(A2);
                                nshVar3.M(s2);
                                nshVar3.R(B2);
                                nshVar3.c = xodVar2;
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                                opfVar.b = ipaVar;
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        ipaVar = ipaVar2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    ipaVar = ipaVar2;
                }
            case 10:
                zcq zcqVar = (zcq) obj2;
                x97.y((mm6) obj4, null, null, new c90(zcqVar, ((Number) obj).floatValue(), a7tVar, i2), 3).R(new gbi(zcqVar, (Function0) obj3, i3));
                return Unit.a;
            case 11:
                return t1f.n((t1f) obj4, (mb5) obj, (ofg) obj2, (ofg) obj3);
            case 12:
                ((uif) obj4).invoke(((ooi) obj2).a((xzb) obj3));
                return Unit.a;
            case 13:
                jsk jskVar3 = (jsk) obj;
                mfh mfhVar = (mfh) obj3;
                nnj nnjVar = (nnj) obj4;
                boolean z2 = nnjVar.q;
                ksk kskVar = (ksk) obj2;
                float f = nnjVar.o;
                if (z2) {
                    jsk.g(jskVar3, kskVar, mfhVar.L(f), mfhVar.L(nnjVar.p));
                } else {
                    jskVar3.d(kskVar, mfhVar.L(f), mfhVar.L(nnjVar.p), 0.0f);
                }
                return Unit.a;
            case 14:
                jsk jskVar4 = (jsk) obj;
                pnj pnjVar = (pnj) obj4;
                long j = ((wpe) pnjVar.o.invoke((mfh) obj2)).a;
                ksk kskVar2 = (ksk) obj3;
                if (pnjVar.p) {
                    jsk.j(jskVar4, kskVar2, (int) (j >> 32), (int) (j & 4294967295L), null, 12);
                } else {
                    jsk.l(jskVar4, kskVar2, (int) (j >> 32), (int) (j & 4294967295L), null, 12);
                }
                return Unit.a;
            case 15:
                m7l m7lVar = (m7l) obj;
                DecoderData decoderData = (DecoderData) obj3;
                m7lVar.getClass();
                avj avjVar = (avj) obj4;
                PlaybackStats playbackStats = (PlaybackStats) obj2;
                m7lVar.e = Boolean.valueOf(avj.Q(playbackStats));
                Long valueOf = Long.valueOf(playbackStats.getLiveOffset());
                if (!avj.Q(playbackStats)) {
                    valueOf = null;
                }
                m7lVar.b = valueOf != null ? valueOf.longValue() : -9223372036854775807L;
                Long valueOf2 = Long.valueOf(playbackStats.getTargetLiveOffset());
                if (!avj.Q(playbackStats)) {
                    valueOf2 = null;
                }
                m7lVar.c = valueOf2 != null ? valueOf2.longValue() : -9223372036854775807L;
                long windowDuration = playbackStats.getWindowDuration();
                Long valueOf3 = Long.valueOf(windowDuration);
                if (windowDuration == -9223372036854775807L) {
                    valueOf3 = null;
                }
                m7lVar.j = valueOf3 != null ? valueOf3.longValue() : -1L;
                str strVar = avjVar.e;
                m7lVar.m = v3g.o(strVar.a, strVar.b);
                m7lVar.n = decoderData != null ? decoderData.getVideoDecoder() : null;
                m7lVar.o = decoderData != null ? decoderData.getAudioDecoder() : null;
                m7lVar.p = (playbackStats.getVideoType() == VideoType.EVENT || playbackStats.getVideoType() == VideoType.LIVE) ? Long.valueOf(playbackStats.getLiveOffset()) : null;
                return Unit.a;
            case 16:
                jsk jskVar5 = (jsk) obj;
                mfh mfhVar2 = (mfh) obj3;
                n0k n0kVar = (n0k) obj4;
                boolean z3 = n0kVar.s;
                ksk kskVar3 = (ksk) obj2;
                float f2 = n0kVar.o;
                if (z3) {
                    jsk.g(jskVar5, kskVar3, mfhVar2.L(f2), mfhVar2.L(n0kVar.p));
                } else {
                    jskVar5.d(kskVar3, mfhVar2.L(f2), mfhVar2.L(n0kVar.p), 0.0f);
                }
                return Unit.a;
            case 17:
                slm slmVar = (slm) obj3;
                ((qpj) obj4).a((dzf) obj2, slmVar);
                return new hi(13, slmVar);
            case 18:
                ((r7w) obj).getClass();
                ((x60) ((g0c) ((atn) obj2).c)).a(qne.m(gut.S0(), null, 3));
                ((xqn) obj4).a = new s7o((bfk) obj3);
                return Unit.a;
            case 19:
                zxn zxnVar = (zxn) obj;
                zxnVar.getClass();
                long a = zxnVar.a();
                ayn aynVar = (ayn) obj4;
                if (((Boolean) aynVar.i.invoke((ynn) obj2, ywf.d(swf.i((int) (a >> 32), (int) (a & 4294967295L)), nt0.Q(zxnVar.b())))).booleanValue() && aynVar.r.contains(zxnVar.a.l) && ((Boolean) ((Function1) obj3).invoke(zxnVar)).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 20:
                koo kooVar = (koo) obj3;
                ioo iooVar = (ioo) obj4;
                tpi tpiVar = iooVar.b;
                if (tpiVar.b(obj2)) {
                    xq0.o(dfi.g("Key ", " was used multiple times ", obj2));
                    return null;
                }
                iooVar.a.remove(obj2);
                tpiVar.m(obj2, kooVar);
                return new yk0(i3, iooVar, obj2, kooVar);
            case 21:
                lfm lfmVar = (lfm) obj;
                if (((bfi) obj4).l(lfmVar.c, (zdp) obj2)) {
                    lfmVar.a();
                    ((tqn) obj3).a = true;
                }
                return Unit.a;
            case 22:
                gjs gjsVar = (gjs) obj4;
                ajs ajsVar = (ajs) obj2;
                if (nsa.c(gjsVar.a(), ajsVar.b) < 0) {
                    long j2 = ajsVar.b;
                    AtomicReference atomicReference = gjsVar.b;
                    zf0 zf0Var = new zf0(j2, 5);
                    while (true) {
                        Object obj5 = atomicReference.get();
                        Object invoke = zf0Var.invoke(obj5);
                        while (!atomicReference.compareAndSet(obj5, invoke)) {
                            if (atomicReference.get() != obj5) {
                                break;
                            }
                        }
                    }
                }
                x97.y(gjsVar, null, null, new zre((ase) obj3, a7tVar, i3), 3);
                return Unit.a;
            case 23:
                ln0 ln0Var2 = (ln0) obj;
                ln0 ln0Var3 = (ln0) obj2;
                tqn tqnVar = (tqn) obj4;
                if (tqnVar.a) {
                    Object obj6 = ln0Var2.a;
                    int i4 = ln0Var2.c;
                    int i5 = ln0Var2.b;
                    if ((obj6 instanceof c4r) && i5 == ln0Var3.b && i4 == ln0Var3.c) {
                        c4r c4rVar = (c4r) obj3;
                        if (c4rVar == null) {
                            c4rVar = new c4r(0L, 0L, (tqc) null, (oqc) null, (pqc) null, (qpc) null, (String) null, 0L, (wu2) null, (ccs) null, (bqg) null, 0L, (aas) null, (otp) null, 65535);
                        }
                        ln0Var = new ln0(c4rVar, i5, i4);
                        tqnVar.a = ln0Var3.equals(ln0Var2);
                        return ln0Var;
                    }
                }
                ln0Var = ln0Var2;
                tqnVar.a = ln0Var3.equals(ln0Var2);
                return ln0Var;
            case 24:
                Function1 function12 = (Function1) obj3;
                pcs pcsVar = (pcs) ((xqn) obj4).a;
                ybs l = ((pt0) obj2).l((List) obj);
                if (pcsVar != null) {
                    pcsVar.a(null, l);
                }
                function12.invoke(l);
                return Unit.a;
            case 25:
                gbs gbsVar = (gbs) obj;
                dbs dbsVar = (dbs) obj2;
                switch (((iaf) obj4).ordinal()) {
                    case 0:
                        gbsVar.e.a = null;
                        if (gbsVar.g.b.length() > 0) {
                            if (!rds.b(gbsVar.f)) {
                                boolean f3 = gbsVar.f();
                                long j3 = gbsVar.f;
                                if (!f3) {
                                    int d5 = rds.d(j3);
                                    gbsVar.p(d5, d5);
                                    break;
                                } else {
                                    int e6 = rds.e(j3);
                                    gbsVar.p(e6, e6);
                                    break;
                                }
                            } else {
                                gbsVar.i();
                                break;
                            }
                        }
                        break;
                    case 1:
                        gbsVar.e.a = null;
                        if (gbsVar.g.b.length() > 0) {
                            if (!rds.b(gbsVar.f)) {
                                boolean f4 = gbsVar.f();
                                long j4 = gbsVar.f;
                                if (!f4) {
                                    int e7 = rds.e(j4);
                                    gbsVar.p(e7, e7);
                                    break;
                                } else {
                                    int d6 = rds.d(j4);
                                    gbsVar.p(d6, d6);
                                    break;
                                }
                            } else {
                                gbsVar.l();
                                break;
                            }
                        }
                        break;
                    case 2:
                        pds pdsVar = gbsVar.e;
                        pdsVar.a = null;
                        mn0 mn0Var = gbsVar.g;
                        String str4 = mn0Var.b;
                        String str5 = mn0Var.b;
                        if (str4.length() > 0) {
                            if (!gbsVar.f()) {
                                pdsVar.a = null;
                                if (str5.length() > 0 && (e = gbsVar.e()) != null) {
                                    int intValue = e.intValue();
                                    gbsVar.p(intValue, intValue);
                                    break;
                                }
                            } else {
                                pdsVar.a = null;
                                if (str5.length() > 0 && (d = gbsVar.d()) != null) {
                                    int intValue2 = d.intValue();
                                    gbsVar.p(intValue2, intValue2);
                                    break;
                                }
                            }
                        }
                        break;
                    case 3:
                        pds pdsVar2 = gbsVar.e;
                        pdsVar2.a = null;
                        mn0 mn0Var2 = gbsVar.g;
                        String str6 = mn0Var2.b;
                        String str7 = mn0Var2.b;
                        if (str6.length() > 0) {
                            if (!gbsVar.f()) {
                                pdsVar2.a = null;
                                if (str7.length() > 0 && (d2 = gbsVar.d()) != null) {
                                    int intValue3 = d2.intValue();
                                    gbsVar.p(intValue3, intValue3);
                                    break;
                                }
                            } else {
                                pdsVar2.a = null;
                                if (str7.length() > 0 && (e2 = gbsVar.e()) != null) {
                                    int intValue4 = e2.intValue();
                                    gbsVar.p(intValue4, intValue4);
                                    break;
                                }
                            }
                        }
                        break;
                    case 4:
                        gbsVar.j();
                        break;
                    case 5:
                        gbsVar.k();
                        break;
                    case 6:
                        gbsVar.n();
                        break;
                    case 7:
                        gbsVar.m();
                        break;
                    case 8:
                        gbsVar.e.a = null;
                        if (gbsVar.g.b.length() > 0) {
                            if (!gbsVar.f()) {
                                gbsVar.m();
                                break;
                            } else {
                                gbsVar.n();
                                break;
                            }
                        }
                        break;
                    case 9:
                        gbsVar.e.a = null;
                        if (gbsVar.g.b.length() > 0) {
                            if (!gbsVar.f()) {
                                gbsVar.n();
                                break;
                            } else {
                                gbsVar.m();
                                break;
                            }
                        }
                        break;
                    case 10:
                        if (gbsVar.g.b.length() > 0 && (cdsVar = gbsVar.c) != null) {
                            int g = gbsVar.g(cdsVar, -1);
                            gbsVar.p(g, g);
                            break;
                        }
                        break;
                    case 11:
                        if (gbsVar.g.b.length() > 0 && (cdsVar2 = gbsVar.c) != null) {
                            int g2 = gbsVar.g(cdsVar2, 1);
                            gbsVar.p(g2, g2);
                            break;
                        }
                        break;
                    case 12:
                        if (gbsVar.g.b.length() > 0 && (ddsVar = gbsVar.i) != null) {
                            int h = gbsVar.h(ddsVar, -1);
                            gbsVar.p(h, h);
                            break;
                        }
                        break;
                    case 13:
                        if (gbsVar.g.b.length() > 0 && (ddsVar2 = gbsVar.i) != null) {
                            int h2 = gbsVar.h(ddsVar2, 1);
                            gbsVar.p(h2, h2);
                            break;
                        }
                        break;
                    case 14:
                        gbsVar.e.a = null;
                        if (gbsVar.g.b.length() > 0) {
                            gbsVar.p(0, 0);
                            break;
                        }
                        break;
                    case 15:
                        gbsVar.e.a = null;
                        mn0 mn0Var3 = gbsVar.g;
                        if (mn0Var3.b.length() > 0) {
                            int length = mn0Var3.b.length();
                            gbsVar.p(length, length);
                            break;
                        }
                        break;
                    case 16:
                        dbsVar.b.b(false);
                        break;
                    case 17:
                        dbsVar.b.m();
                        break;
                    case 18:
                        dbsVar.b.d();
                        break;
                    case 19:
                        List a2 = gbsVar.a(rvr.x);
                        if (a2 != null) {
                            dbsVar.a(a2);
                            break;
                        }
                        break;
                    case 20:
                        List a3 = gbsVar.a(rvr.y);
                        if (a3 != null) {
                            dbsVar.a(a3);
                            break;
                        }
                        break;
                    case 21:
                        List a4 = gbsVar.a(rvr.z);
                        if (a4 != null) {
                            dbsVar.a(a4);
                            break;
                        }
                        break;
                    case 22:
                        List a5 = gbsVar.a(rvr.A);
                        if (a5 != null) {
                            dbsVar.a(a5);
                            break;
                        }
                        break;
                    case 23:
                        List a6 = gbsVar.a(rvr.B);
                        if (a6 != null) {
                            dbsVar.a(a6);
                            break;
                        }
                        break;
                    case 24:
                        List a7 = gbsVar.a(rvr.C);
                        if (a7 != null) {
                            dbsVar.a(a7);
                            break;
                        }
                        break;
                    case 25:
                        gbsVar.e.a = null;
                        mn0 mn0Var4 = gbsVar.g;
                        if (mn0Var4.b.length() > 0) {
                            gbsVar.p(0, mn0Var4.b.length());
                            break;
                        }
                        break;
                    case 26:
                        gbsVar.i();
                        gbsVar.o();
                        break;
                    case 27:
                        gbsVar.l();
                        gbsVar.o();
                        break;
                    case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                        if (gbsVar.g.b.length() > 0 && (cdsVar3 = gbsVar.c) != null) {
                            int g3 = gbsVar.g(cdsVar3, -1);
                            gbsVar.p(g3, g3);
                        }
                        gbsVar.o();
                        break;
                    case 29:
                        if (gbsVar.g.b.length() > 0 && (cdsVar4 = gbsVar.c) != null) {
                            int g4 = gbsVar.g(cdsVar4, 1);
                            gbsVar.p(g4, g4);
                        }
                        gbsVar.o();
                        break;
                    case 30:
                        if (gbsVar.g.b.length() > 0 && (ddsVar3 = gbsVar.i) != null) {
                            int h3 = gbsVar.h(ddsVar3, -1);
                            gbsVar.p(h3, h3);
                        }
                        gbsVar.o();
                        break;
                    case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                        if (gbsVar.g.b.length() > 0 && (ddsVar4 = gbsVar.i) != null) {
                            int h4 = gbsVar.h(ddsVar4, 1);
                            gbsVar.p(h4, h4);
                        }
                        gbsVar.o();
                        break;
                    case 32:
                        gbsVar.e.a = null;
                        if (gbsVar.g.b.length() > 0) {
                            gbsVar.p(0, 0);
                        }
                        gbsVar.o();
                        break;
                    case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                        gbsVar.e.a = null;
                        mn0 mn0Var5 = gbsVar.g;
                        if (mn0Var5.b.length() > 0) {
                            int length2 = mn0Var5.b.length();
                            gbsVar.p(length2, length2);
                        }
                        gbsVar.o();
                        break;
                    case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                        pds pdsVar3 = gbsVar.e;
                        pdsVar3.a = null;
                        mn0 mn0Var6 = gbsVar.g;
                        String str8 = mn0Var6.b;
                        String str9 = mn0Var6.b;
                        if (str8.length() > 0) {
                            if (gbsVar.f()) {
                                pdsVar3.a = null;
                                if (str9.length() > 0 && (e3 = gbsVar.e()) != null) {
                                    int intValue5 = e3.intValue();
                                    gbsVar.p(intValue5, intValue5);
                                }
                            } else {
                                pdsVar3.a = null;
                                if (str9.length() > 0 && (d3 = gbsVar.d()) != null) {
                                    int intValue6 = d3.intValue();
                                    gbsVar.p(intValue6, intValue6);
                                }
                            }
                        }
                        gbsVar.o();
                        break;
                    case 35:
                        pds pdsVar4 = gbsVar.e;
                        pdsVar4.a = null;
                        mn0 mn0Var7 = gbsVar.g;
                        String str10 = mn0Var7.b;
                        String str11 = mn0Var7.b;
                        if (str10.length() > 0) {
                            if (gbsVar.f()) {
                                pdsVar4.a = null;
                                if (str11.length() > 0 && (d4 = gbsVar.d()) != null) {
                                    int intValue7 = d4.intValue();
                                    gbsVar.p(intValue7, intValue7);
                                }
                            } else {
                                pdsVar4.a = null;
                                if (str11.length() > 0 && (e4 = gbsVar.e()) != null) {
                                    int intValue8 = e4.intValue();
                                    gbsVar.p(intValue8, intValue8);
                                }
                            }
                        }
                        gbsVar.o();
                        break;
                    case o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                        gbsVar.j();
                        gbsVar.o();
                        break;
                    case 37:
                        gbsVar.k();
                        gbsVar.o();
                        break;
                    case 38:
                        gbsVar.n();
                        gbsVar.o();
                        break;
                    case 39:
                        gbsVar.m();
                        gbsVar.o();
                        break;
                    case 40:
                        gbsVar.e.a = null;
                        if (gbsVar.g.b.length() > 0) {
                            if (gbsVar.f()) {
                                gbsVar.n();
                            } else {
                                gbsVar.m();
                            }
                        }
                        gbsVar.o();
                        break;
                    case 41:
                        gbsVar.e.a = null;
                        if (gbsVar.g.b.length() > 0) {
                            if (gbsVar.f()) {
                                gbsVar.m();
                            } else {
                                gbsVar.n();
                            }
                        }
                        gbsVar.o();
                        break;
                    case 42:
                        gbsVar.e.a = null;
                        if (gbsVar.g.b.length() > 0) {
                            long j5 = gbsVar.f;
                            int i6 = rds.c;
                            int i7 = (int) (j5 & 4294967295L);
                            gbsVar.p(i7, i7);
                            break;
                        }
                        break;
                    case o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                        if (!dbsVar.e) {
                            dbsVar.a(t75.c(new vb5(StringUtil.LF, 1)));
                            break;
                        } else {
                            dbsVar.a.w.invoke(new hde(dbsVar.l));
                            break;
                        }
                    case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                        if (!dbsVar.e) {
                            dbsVar.a(t75.c(new vb5(StringUtil.TAB, 1)));
                            break;
                        } else {
                            ((tqn) obj3).a = false;
                            break;
                        }
                    case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                        mit mitVar = dbsVar.h;
                        if (mitVar != null) {
                            mitVar.a(ybs.a(gbsVar.h, gbsVar.g, gbsVar.f, 4));
                        }
                        mit mitVar2 = dbsVar.h;
                        if (mitVar2 != null) {
                            rjp rjpVar2 = mitVar2.a;
                            if (rjpVar2 != null && (rjpVar = (rjp) rjpVar2.a) != null) {
                                mitVar2.a = rjpVar;
                                mitVar2.c -= ((ybs) rjpVar2.b).a.b.length();
                                mitVar2.b = new rjp(mitVar2.b, (ybs) rjpVar2.b);
                                ybsVar2 = (ybs) rjpVar.b;
                            }
                            if (ybsVar2 != null) {
                                dbsVar.k.invoke(ybsVar2);
                                break;
                            }
                        }
                        break;
                    case o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                        mit mitVar3 = dbsVar.h;
                        if (mitVar3 != null) {
                            rjp rjpVar3 = mitVar3.b;
                            if (rjpVar3 != null) {
                                mitVar3.b = (rjp) rjpVar3.a;
                                ybs ybsVar3 = (ybs) rjpVar3.b;
                                mitVar3.a = new rjp(mitVar3.a, ybsVar3);
                                mitVar3.c = ybsVar3.a.b.length() + mitVar3.c;
                                ybsVar = (ybs) rjpVar3.b;
                            }
                            if (ybsVar != null) {
                                dbsVar.k.invoke(ybsVar);
                                break;
                            }
                        }
                        break;
                }
                return Unit.a;
            case 26:
                return a(obj);
            case 27:
                return d(obj);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return g(obj);
            default:
                aln alnVar = (aln) obj4;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) obj2;
                dhu dhuVar = (dhu) obj3;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(dhuVar);
                } else {
                    alnVar.a.getViewTreeObserver().removeOnPreDrawListener(dhuVar);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lma(pt0 pt0Var, nl6 nl6Var, xqn xqnVar) {
        super(1);
        this.r = 24;
        this.t = pt0Var;
        this.u = nl6Var;
        this.s = xqnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lma(dpc dpcVar, uoc uocVar, Function1 function1) {
        super(1);
        this.r = 7;
        this.s = dpcVar;
        this.t = uocVar;
        this.u = (uif) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lma(u7e u7eVar, cfg cfgVar, uue uueVar, boh bohVar) {
        super(1);
        this.r = 8;
        this.s = u7eVar;
        this.t = cfgVar;
        this.u = bohVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lma(atn atnVar, xqn xqnVar, bfk bfkVar) {
        super(1);
        this.r = 18;
        this.t = atnVar;
        this.s = xqnVar;
        this.u = bfkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lma(int i, Object obj, Object obj2, Object obj3) {
        super(1);
        this.r = i;
        this.s = obj;
        this.t = obj2;
        this.u = obj3;
    }
}
