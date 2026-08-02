package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.music.shared.fmradio.api.commands.StartFmRadioQueueCommand;
import com.yandex.music.shared.generative.api.commands.StartGenerativeQueueCommand;
import com.yandex.music.shared.playback.core.api.PlaybackQueueStartValidator$InvalidQueueException;
import com.yandex.music.shared.radio.api.commands.StartVideoClipRadioQueueCommand;
import com.yandex.music.shared.wave.api.StartWaveQueueCommand;
import com.yandex.music.shared.ynison.api.queue.StartYnisonQueueCommand;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.data.audio.Album$AlbumType;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes.dex */
public final class rre implements u6c, f, mof, rek, p7q, mx0, ddi, ty5, ccu, rvc, n03, dac, n8e, typ, ngl, c8q {
    public static boolean b;
    public static boolean c;
    public static final rre d = new rre(0);
    public static final rre e = new rre(1);
    public static final /* synthetic */ rre f = new rre(2);
    public static final kac g = new kac(25);
    public static final kac h = new kac(26);
    public static final rre i = new rre(5);
    public static final rre j = new rre(6);
    public static final rre k = new rre(7);
    public static final rre l = new rre(8);
    public static final rre m = new rre(10);
    public static final rre n = new rre(11);
    public static final rre o = new rre(12);
    public final /* synthetic */ int a;

    public /* synthetic */ rre(int i2) {
        this.a = i2;
    }

    public static final el4 O(rre rreVar, String str) {
        el4 el4Var = new el4(str);
        el4.d.put(str, el4Var);
        return el4Var;
    }

    public static tq Q(Album$AlbumType album$AlbumType) {
        album$AlbumType.getClass();
        if (u2x.L(album$AlbumType)) {
            return tq.c;
        }
        return u2x.z(m20.NonMusic, album$AlbumType.a) ? tq.d : tq.b;
    }

    public static qe3 R(kxi kxiVar, pkb pkbVar, String str) {
        kxiVar.getClass();
        str.getClass();
        cvo cvoVar = cvo.i;
        return new qe3(kxiVar, o6m.b(wjb.BottomsheetScreen, new avo(pkbVar, str), 2));
    }

    public static vgd S(dd5 dd5Var, Function1 function1, String str) {
        dd5Var.getClass();
        str.getClass();
        if (dd5Var instanceof xc5) {
            return new pgd(ngd.ALBUM, ((xc5) dd5Var).a, function1, str, null);
        }
        if (dd5Var instanceof yc5) {
            return new pgd(ngd.ARTIST, ((yc5) dd5Var).a, function1, str, null);
        }
        if (dd5Var instanceof bd5) {
            return new pgd(ngd.PLAYLIST, ((bd5) dd5Var).getId(), function1, str, pcg.E(dd5Var));
        }
        if (dd5Var instanceof cd5) {
            return new ugd(new xg(function1, str, (Continuation) null));
        }
        b6e.s();
        return null;
    }

    public static pgd T(aou aouVar, String str, Function1 function1) {
        aouVar.getClass();
        str.getClass();
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        boolean h2 = ((thd) ((byb) qdcVar.C(I)).b(thd.class)).h();
        String str2 = "user:onyourwave";
        if (h2) {
            if (aouVar instanceof tnu) {
                str2 = CollectionsKt.X(o8g.R(((tnu) aouVar).a), StringUtils.COMMA, null, null, null, 62);
            } else if (aouVar instanceof unu) {
                str2 = CollectionsKt.X(o8g.R(((unu) aouVar).a), StringUtils.COMMA, null, null, null, 62);
            } else if (aouVar instanceof wnu) {
                str2 = CollectionsKt.X(o8g.R(((wnu) aouVar).e()), StringUtils.COMMA, null, null, null, 62);
            } else {
                if (!(aouVar instanceof ynu)) {
                    b6e.s();
                    return null;
                }
                su4.s(2, null, "WaveContentId.WithoutSeeds can't be started on Glagol as RADIO", null);
            }
        } else if (aouVar instanceof tnu) {
            str2 = StationId.e(((tnu) aouVar).a).h();
        } else if (aouVar instanceof unu) {
            str2 = StationId.e(((unu) aouVar).a).h();
        } else if (aouVar instanceof wnu) {
            str2 = StationId.e(((wnu) aouVar).e()).h();
        } else {
            if (!(aouVar instanceof ynu)) {
                b6e.s();
                return null;
            }
            su4.s(2, null, "WaveContentId.WithoutSeeds can't be started on Glagol as RADIO", null);
        }
        return new pgd(ngd.RADIO, str2, function1, str, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static double U(ygd ygdVar, boolean z, double d2) {
        Double d3;
        n7q n7qVar;
        l18 l18Var = l18.b;
        bdt I = hag.I(oq7.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        d6l x = p6g.x((e6l) ((oq7) qdcVar.C(I)).a.c.getValue());
        Double d4 = null;
        if (x != null && (n7qVar = x.a) != null) {
            String str = ygdVar.a;
            mqs a = n7qVar.b().a();
            if (Intrinsics.d(str, a != null ? a.a : null)) {
                d3 = Double.valueOf(r1.c.g() / 1000);
                if (z) {
                    bdt I2 = hag.I(r1l.class);
                    qdc qdcVar2 = l18Var.a;
                    qdcVar2.getClass();
                    Long a2 = ((r1l) qdcVar2.C(I2)).a(ygdVar.a);
                    if (a2 != null) {
                        if (r1l.c(a2.longValue(), ygdVar.b)) {
                            a2 = null;
                        }
                        if (a2 != null) {
                            d4 = Double.valueOf(a2.longValue() / 1000);
                        }
                    }
                    if (d4 != null) {
                        return d4.doubleValue();
                    }
                    if (d3 != null) {
                        return d3.doubleValue();
                    }
                } else if (d3 != null) {
                    return d3.doubleValue();
                }
                return d2;
            }
        }
        d3 = null;
        if (z) {
        }
        return d2;
    }

    public static mzi V(int i2) {
        Object obj;
        Iterator it = mzi.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (i2 < ((mzi) obj).a) {
                break;
            }
        }
        mzi mziVar = (mzi) obj;
        return mziVar == null ? mzi.d : mziVar;
    }

    public static void X(oq oqVar, t tVar, kxi kxiVar, PlaybackScope playbackScope) {
        oqVar.getClass();
        tVar.getClass();
        playbackScope.getClass();
        if (u2x.M(oqVar.j)) {
            lt B = lxe.B(oqVar);
            y supportFragmentManager = tVar.getSupportFragmentManager();
            supportFragmentManager.getClass();
            Y(B, supportFragmentManager, tVar, kxiVar, playbackScope, oqVar, false);
            return;
        }
        y supportFragmentManager2 = tVar.getSupportFragmentManager();
        supportFragmentManager2.getClass();
        br brVar = new br(oqVar, supportFragmentManager2, tVar, kxiVar, playbackScope);
        pkb pkbVar = pkb.Album;
        qe3 R = R(kxiVar, pkbVar, oqVar.a);
        int i2 = 0;
        sai saiVar = new sai(false);
        kkp kkpVar = new kkp(oqVar, brVar, R, saiVar);
        y supportFragmentManager3 = tVar.getSupportFragmentManager();
        supportFragmentManager3.getClass();
        pu0 t = pd.t(new qzm[0]);
        cvo cvoVar = cvo.i;
        wjb wjbVar = wjb.EntityActionsScreen;
        lt B2 = lxe.B(oqVar);
        String str = B2.a;
        if (lxe.x(B2)) {
            pkbVar = pkb.Podcast;
        } else if (lxe.w(B2)) {
            pkbVar = pkb.Audiobook;
        }
        e3s.X(o6m.b(wjbVar, new avo(pkbVar, str), 2), supportFragmentManager3, null, saiVar, null, new wn5(new ar(i2, kkpVar, t), 614003564, true), 52);
    }

    public static void Y(lt ltVar, y yVar, Context context, kxi kxiVar, PlaybackScope playbackScope, oq oqVar, boolean z) {
        String str = ltVar.a;
        yVar.getClass();
        context.getClass();
        playbackScope.getClass();
        Album$AlbumType album$AlbumType = ltVar.b;
        album$AlbumType.getClass();
        if (!u2x.M(album$AlbumType.a)) {
            dfi.r("incorrect album type for non-music bottom sheet: " + album$AlbumType, "EntityBottomSheetFactory");
            return;
        }
        sai saiVar = new sai(false);
        r8j r8jVar = new r8j(ltVar, yVar, context, kxiVar, playbackScope, z);
        pkb pkbVar = pkb.Album;
        gs4 gs4Var = new gs4(ltVar, oqVar, r8jVar, R(kxiVar, pkbVar, str), saiVar);
        pu0 t = pd.t(new qzm[0]);
        cvo cvoVar = cvo.i;
        wjb wjbVar = wjb.EntityActionsScreen;
        if (lxe.x(ltVar)) {
            pkbVar = pkb.Podcast;
        } else if (lxe.w(ltVar)) {
            pkbVar = pkb.Audiobook;
        }
        e3s.X(o6m.b(wjbVar, new avo(pkbVar, str), 2), yVar, null, saiVar, null, new wn5(new gab(14, gs4Var, t), 1706200061, true), 52);
    }

    public static void Z(mqs mqsVar, zus zusVar, e6v e6vVar, ve veVar, Context context, y yVar, kxi kxiVar, PlaybackScope playbackScope, gj gjVar, ovs ovsVar, cvl cvlVar, int i2) {
        gj gjVar2 = (i2 & 256) != 0 ? null : gjVar;
        ovs ovsVar2 = (i2 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? null : ovsVar;
        cvl cvlVar2 = (i2 & 1024) != 0 ? null : cvlVar;
        mqsVar.getClass();
        zusVar.getClass();
        context.getClass();
        yVar.getClass();
        kxiVar.getClass();
        playbackScope.getClass();
        String str = mqsVar.a;
        if (!wyf.P(mqsVar) && !wyf.L(mqsVar)) {
            sai saiVar = new sai(false);
            irs irsVar = new irs(mqsVar, gjVar2, zusVar, e6vVar, ovsVar2, veVar, context, yVar, kxiVar, playbackScope, new dda(0, saiVar, sai.class, "hide", "hide()V", 0, 25), cvlVar2);
            pkb pkbVar = pkb.Track;
            qe3 R = R(kxiVar, pkbVar, str);
            mqsVar.getClass();
            kxiVar.getClass();
            tao taoVar = new tao();
            taoVar.a = mqsVar;
            taoVar.b = irsVar;
            taoVar.c = R;
            taoVar.d = kxiVar;
            taoVar.e = saiVar;
            pu0 t = pd.t(new qzm[0]);
            cvo cvoVar = cvo.i;
            wjb wjbVar = wjb.EntityActionsScreen;
            if (a4g.H(mqsVar)) {
                pkbVar = pkb.PodcastEpisode;
            } else if (a4g.D(gys.AudioBookHolder, mqsVar)) {
                pkbVar = pkb.AudiobookChapter;
            }
            e3s.X(o6m.b(wjbVar, new avo(pkbVar, mqsVar.a), 2), yVar, null, saiVar, null, new wn5(new f6p(12, taoVar, t), 549236424, true), 52);
            return;
        }
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        if (!((j4j) ((byb) qdcVar.C(I)).b(j4j.class)).h()) {
            ovs ovsVar3 = ovsVar2 != null ? ovsVar2 : null;
            cvl cvlVar3 = cvlVar2 != null ? cvlVar2 : null;
            ef3.g(ef3.b, veVar.a, a4g.D(gys.NonMusicHolder, mqsVar) ? df3.EPISODE_BOTTOMSHEET : df3.TRACK_BOTTOMSHEET, pe3.TAPPED);
            x8f x8fVar = new x8f();
            x8fVar.l = mqsVar;
            x8fVar.m = veVar;
            x8fVar.n = zusVar;
            x8fVar.o = f8g.H(mqsVar, gjVar2, zusVar, e6vVar, ovsVar3, veVar, context, yVar, kxiVar, playbackScope, new zhs(0, x8fVar, x8f.class, "dismissDialog", "dismissDialog()V", 0, 4), cvlVar3);
            x7f.B(x8fVar, yVar, "TRACK_DIALOG");
            return;
        }
        sai saiVar2 = new sai(false);
        awc awcVar = new awc(new lcj(mqsVar, gjVar2, zusVar, e6vVar, ovsVar2, veVar, cvlVar2, context, yVar, kxiVar, playbackScope, new dda(0, saiVar2, sai.class, "hide", "hide()V", 0, 26), (dy7) l18Var.b(hag.I(dy7.class), true).getValue()));
        pkb pkbVar2 = pkb.Track;
        ime imeVar = new ime(mqsVar, awcVar, R(kxiVar, pkbVar2, str), saiVar2);
        pu0 t2 = pd.t(new qzm[0]);
        cvo cvoVar2 = cvo.i;
        wjb wjbVar2 = wjb.EntityActionsScreen;
        if (a4g.H(mqsVar)) {
            pkbVar2 = pkb.PodcastEpisode;
        } else if (a4g.D(gys.AudioBookHolder, mqsVar)) {
            pkbVar2 = pkb.AudiobookChapter;
        }
        e3s.X(o6m.b(wjbVar2, new avo(pkbVar2, mqsVar.a), 2), yVar, null, saiVar2, null, new wn5(new gab(16, t2, imeVar), 301103741, true), 52);
    }

    public static void a0(mqs mqsVar, dy7 dy7Var, kxi kxiVar, pu0 pu0Var, y yVar, boolean z) {
        mqsVar.getClass();
        dy7Var.getClass();
        kxiVar.getClass();
        yVar.getClass();
        sai saiVar = new sai(false);
        cvo cvoVar = cvo.i;
        e3s.X(o6m.b(wjb.SummaryScreen, new avo(pkb.Track, mqsVar.a), 2), yVar, "TRACK_DESCRIPTION_DIALOG_TAG", saiVar, null, new wn5(new h54(dy7Var, mqsVar, kxiVar, pu0Var, saiVar, z), 373270324, true), 48);
    }

    public static void b0(x1u x1uVar, y yVar, Activity activity, PlaybackScope playbackScope, kxi kxiVar, ru0 ru0Var) {
        x1uVar.getClass();
        yVar.getClass();
        activity.getClass();
        playbackScope.getClass();
        kxiVar.getClass();
        sai saiVar = new sai(false);
        apo apoVar = new apo(x1uVar, new gao(new cr(playbackScope, yVar, kxiVar, new dda(0, saiVar, sai.class, "hide", "hide()V", 0, 27), ru0Var)), saiVar);
        pu0 C = jf0.C(pd.t(new qzm[0]), ru0Var);
        cvo cvoVar = cvo.i;
        e3s.X(o6m.b(wjb.BottomsheetScreen, new avo(pkb.Video, x1uVar.a), 2), yVar, null, saiVar, null, new wn5(new aqp(9, C, apoVar, activity), -116388387, true), 52);
    }

    @Override // defpackage.n03
    public jxt B(jxt jxtVar, jxt jxtVar2) {
        jxtVar.getClass();
        jxtVar2.getClass();
        yxt yxtVar = jxtVar.a;
        yxt yxtVar2 = jxtVar2.a;
        if (yxtVar != yxtVar2) {
            throw new mac(yxtVar, yxtVar2);
        }
        if (yxtVar == yxt.Boolean) {
            return new vc3(jxtVar.c() == jxtVar2.c());
        }
        if (yxtVar == yxt.Double) {
            return new vc3(jxtVar.d() == jxtVar2.d());
        }
        if (yxtVar == yxt.Int) {
            return new vc3(jxtVar.e() == jxtVar2.e());
        }
        return yxtVar == yxt.Version ? gld.H(jxtVar, jxtVar2, fl5.a) : new vc3(Intrinsics.d(jxtVar.f(), jxtVar2.f()));
    }

    @Override // defpackage.typ
    public Object E(StartGenerativeQueueCommand startGenerativeQueueCommand, cg6 cg6Var) {
        return startGenerativeQueueCommand.getStartRequest().b.a;
    }

    @Override // defpackage.ngl
    public void H(String str, String str2, Object obj, Object... objArr) {
        str.getClass();
        Log.v(str, "[" + str2 + "] " + obj);
    }

    @Override // defpackage.dac
    public Object K(File file) {
        return ParcelFileDescriptor.open(file, 268435456);
    }

    @Override // defpackage.u6c
    public void L(boolean z) {
        if (z) {
            boolean z2 = q7o.a;
            if (bp6.a.contains(q7o.class)) {
                return;
            }
            try {
                q7o.a = true;
                q7o.d.b();
            } catch (Throwable th) {
                bp6.a(q7o.class, th);
            }
        }
    }

    @Override // defpackage.ngl
    public void M(String str, String str2, Object obj, Throwable th, Object... objArr) {
        str.getClass();
        Log.e(str, "[" + str2 + "] " + obj, th);
    }

    @Override // defpackage.mof
    public Object N(xod xodVar, Continuation continuation) {
        long j2 = xodVar.u;
        Bitmap createBitmap = Bitmap.createBitmap((int) (j2 >> 32), (int) (j2 & 4294967295L), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Canvas canvas2 = vd0.a;
        ud0 ud0Var = new ud0();
        ud0Var.a = canvas;
        xodVar.c(ud0Var, null);
        return createBitmap;
    }

    public synchronized el4 P(String str) {
        el4 el4Var;
        try {
            str.getClass();
            LinkedHashMap linkedHashMap = el4.d;
            el4Var = (el4) linkedHashMap.get(str);
            if (el4Var == null) {
                el4Var = (el4) linkedHashMap.get(c.v(str, "TLS_", false) ? "SSL_".concat(str.substring(4)) : c.v(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str);
                if (el4Var == null) {
                    el4Var = new el4(str);
                }
                linkedHashMap.put(str, el4Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return el4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if (r4 != null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean W(String str) {
        Set set = bp6.a;
        if (set.contains(this)) {
            return false;
        }
        try {
            String str2 = null;
            if (!set.contains(this)) {
                try {
                    float[] fArr = new float[30];
                    for (int i2 = 0; i2 < 30; i2++) {
                        fArr[i2] = 0.0f;
                    }
                    String[] f2 = oci.f(1, new float[][]{fArr}, new String[]{str});
                    if (f2 != null) {
                        str2 = f2[0];
                    }
                    str2 = "none";
                } catch (Throwable th) {
                    bp6.a(this, th);
                }
            }
            return !"none".equals(str2);
        } catch (Throwable th2) {
            bp6.a(this, th2);
            return false;
        }
    }

    @Override // defpackage.dac
    public Class a() {
        return ParcelFileDescriptor.class;
    }

    @Override // defpackage.typ
    public Object c() {
        throw new uej("there is no relay queue in the app");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function0, uif] */
    @Override // defpackage.ddi
    public Object d(pzm pzmVar) {
        return pzmVar.a.invoke();
    }

    @Override // defpackage.c8q
    public Object f() {
        return Executors.newCachedThreadPool(xqd.e("grpc-okhttp-%d"));
    }

    @Override // defpackage.n8e
    public boolean h() {
        return false;
    }

    @Override // defpackage.dac, defpackage.c8q
    public void l(Object obj) {
        switch (this.a) {
            case 23:
                ((ParcelFileDescriptor) obj).close();
                break;
            default:
                ((ExecutorService) ((Executor) obj)).shutdown();
                break;
        }
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        switch (this.a) {
            case 7:
                iocVar.getClass();
                return null;
            default:
                iocVar.getClass();
                return new gxj(c9g.D(iocVar));
        }
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        switch (this.a) {
            case 7:
                szuVar.getClass();
                eu7 eu7Var = (eu7) szuVar.b.h.getValue();
                if (eu7Var != null) {
                    return (jzs) eu7Var.b();
                }
                return null;
            default:
                szuVar.getClass();
                return new gxj(c9g.D(szuVar));
        }
    }

    @Override // defpackage.typ
    public Object p(StartYnisonQueueCommand startYnisonQueueCommand) {
        return ((pqw) startYnisonQueueCommand.getStartRequest().a.getValue()).b.b().c().a;
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        switch (this.a) {
            case 7:
                y4dVar.getClass();
                return null;
            default:
                y4dVar.getClass();
                return new gxj(c9g.D(y4dVar));
        }
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [arf, java.lang.Object] */
    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        switch (this.a) {
            case 7:
                maqVar.getClass();
                if (maqVar instanceof jbq) {
                    return (naq) ((jbq) maqVar).n.getValue();
                }
                if (maqVar instanceof vaq) {
                    return ((vaq) maqVar).p();
                }
                if ((maqVar instanceof eaq) || (maqVar instanceof raq)) {
                    return null;
                }
                b6e.s();
                return null;
            default:
                maqVar.getClass();
                return new gxj(c9g.D(maqVar));
        }
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        switch (this.a) {
            case 7:
                t1qVar.getClass();
                return t1qVar.b;
            default:
                t1qVar.getClass();
                List list = t1qVar.e;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((m1q) obj).a() != null) {
                        arrayList.add(obj);
                    }
                }
                int indexOf = arrayList.indexOf(t1qVar.c);
                Integer valueOf = Integer.valueOf(indexOf);
                if (indexOf < 0) {
                    valueOf = null;
                }
                return new gxj(valueOf != null ? valueOf.intValue() : 0);
        }
    }

    public String toString() {
        switch (this.a) {
            case 14:
                return "Arrangement#End";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        switch (this.a) {
            case 7:
                u7uVar.getClass();
                return u7uVar.b;
            default:
                u7uVar.getClass();
                return new gxj(c9g.D(u7uVar));
        }
    }

    @Override // defpackage.typ
    public Object v(StartFmRadioQueueCommand startFmRadioQueueCommand) {
        startFmRadioQueueCommand.getClass();
        throw null;
    }

    @Override // defpackage.mx0
    public void w(jx7 jx7Var, int i2, int[] iArr, xof xofVar, int[] iArr2) {
        if (xofVar == xof.a) {
            qx0.c(i2, iArr, iArr2, false);
        } else {
            qx0.b(iArr, iArr2, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.typ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object x(StartWaveQueueCommand startWaveQueueCommand, cg6 cg6Var) {
        fnf fnfVar;
        int i2;
        jzs jzsVar;
        v80 v80Var;
        oyu oyuVar;
        rj6 rj6Var;
        if (cg6Var instanceof fnf) {
            fnfVar = (fnf) cg6Var;
            int i3 = fnfVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fnfVar.m = i3 - Integer.MIN_VALUE;
                Object obj = fnfVar.k;
                nm6 nm6Var = nm6.a;
                i2 = fnfVar.m;
                String str = null;
                if (i2 != 0) {
                    qgg.h0(obj);
                    oyu oyuVar2 = startWaveQueueCommand.getStartRequest().c;
                    if (oyuVar2 instanceof kyu) {
                        return ((kyu) oyuVar2).b.e;
                    }
                    if (oyuVar2 instanceof hyu) {
                        v4q v4qVar = ((hyu) oyuVar2).b;
                        return v4qVar.a.a(v4qVar.b);
                    }
                    if (!(oyuVar2 instanceof iyu)) {
                        if (!(oyuVar2 instanceof jyu)) {
                            b6e.s();
                            return null;
                        }
                        xsu xsuVar = startWaveQueueCommand.getStartRequest().a;
                        if ((xsuVar instanceof wsu) && (jzsVar = (jzs) CollectionsKt.firstOrNull(((wsu) xsuVar).a)) != null && (v80Var = jzsVar.b) != null) {
                            str = v80Var.a;
                        }
                        if (str != null) {
                            return str;
                        }
                        dfi.r("StandardAutoflow requires initialPlayablesInfo to have playables", "LaunchGlagolCommandsExecutor");
                        return "";
                    }
                    l18 l18Var = l18.b;
                    bdt I = hag.I(mfn.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    mfn mfnVar = (mfn) qdcVar.C(I);
                    iyu iyuVar = (iyu) oyuVar2;
                    s9p s9pVar = iyuVar.a;
                    StationId e2 = StationId.e(s9pVar);
                    ArrayList R = o8g.R(s9pVar);
                    fnfVar.j = iyuVar;
                    fnfVar.m = 1;
                    Object a = mfnVar.a(e2, R, fnfVar);
                    if (a == nm6Var) {
                        return nm6Var;
                    }
                    obj = a;
                    oyuVar = oyuVar2;
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oyuVar = fnfVar.j;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof pj6)) {
                    throw new PlaybackQueueStartValidator$InvalidQueueException(((pj6) rj6Var).a(), null);
                }
                if (!(rj6Var instanceof qj6)) {
                    b6e.s();
                    return null;
                }
                dgr dgrVar = (dgr) ((qj6) rj6Var).a;
                pfn pfnVar = ((iyu) oyuVar).b.a;
                String str2 = dgrVar.d;
                str2.getClass();
                return pfnVar.a(str2);
            }
        }
        fnfVar = new fnf(this, cg6Var);
        Object obj2 = fnfVar.k;
        nm6 nm6Var2 = nm6.a;
        i2 = fnfVar.m;
        String str3 = null;
        if (i2 != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof pj6)) {
        }
    }

    @Override // defpackage.typ
    public Object y(StartVideoClipRadioQueueCommand startVideoClipRadioQueueCommand, cg6 cg6Var) {
        return startVideoClipRadioQueueCommand.getStartRequest().b;
    }

    @Override // defpackage.ty5
    public void e() {
    }

    @Override // defpackage.ty5
    public void C(String str) {
    }

    @Override // defpackage.ty5
    public void J(us5 us5Var) {
    }

    @Override // defpackage.ty5
    public void s(String str, String str2) {
    }
}
