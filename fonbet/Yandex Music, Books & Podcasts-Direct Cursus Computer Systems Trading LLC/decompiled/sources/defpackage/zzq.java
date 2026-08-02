package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import android.view.TextureView;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.compose.foundation.layout.d;
import androidx.media3.exoplayer.ExoPlayer;
import com.yandex.passport.api.p1;
import com.yandex.passport.common.a;
import com.yandex.passport.common.logger.b;
import com.yandex.passport.common.network.p;
import com.yandex.passport.data.models.v;
import com.yandex.passport.data.models.w;
import com.yandex.passport.data.network.c9;
import com.yandex.passport.data.network.d9;
import com.yandex.passport.data.network.da;
import com.yandex.passport.data.network.e9;
import com.yandex.passport.data.network.l;
import com.yandex.passport.data.network.z9;
import com.yandex.passport.internal.entities.r;
import com.yandex.passport.internal.properties.u;
import com.yandex.passport.internal.report.j4;
import com.yandex.passport.internal.ui.bouncer.model.c2;
import com.yandex.passport.internal.ui.bouncer.model.y1;
import com.yandex.passport.internal.ui.bouncer.s;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.LogoutBottomSheetComposeActivity;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.yandex.pulse.metrics.o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzq implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zzq(g40 g40Var, jd6 jd6Var, ExoPlayer exoPlayer) {
        this.a = 15;
        this.b = g40Var;
        this.d = jd6Var;
        this.c = exoPlayer;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v2, types: [zhs] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nrs nrsVar;
        nrs nrsVar2;
        lnu lnuVar;
        String str;
        String str2;
        ubu ubuVar;
        int i = 14;
        int i2 = 7;
        int i3 = 25;
        int i4 = 10;
        int i5 = 18;
        int i6 = 4;
        int i7 = 8;
        int i8 = 16;
        final int i9 = 0;
        int i10 = 3;
        final int i11 = 1;
        Continuation continuation = null;
        ubu ubuVar2 = null;
        r14 = null;
        zhs zhsVar = null;
        switch (this.a) {
            case 0:
                bqi bqiVar = (bqi) this.b;
                ExoPlayer exoPlayer = (ExoPlayer) this.c;
                a0r a0rVar = (a0r) this.d;
                Float valueOf = Float.valueOf(1.0f);
                xdr xdrVar = (xdr) bqiVar;
                xdrVar.getClass();
                xdrVar.m(null, valueOf);
                exoPlayer.x0(a0rVar);
                return Unit.a;
            case 1:
                bqi bqiVar2 = (bqi) this.b;
                ExoPlayer exoPlayer2 = (ExoPlayer) this.c;
                a0r a0rVar2 = (a0r) this.d;
                Float valueOf2 = Float.valueOf(1.0f);
                xdr xdrVar2 = (xdr) bqiVar2;
                xdrVar2.getClass();
                xdrVar2.m(null, valueOf2);
                exoPlayer2.x0(a0rVar2);
                return Unit.a;
            case 2:
                p4r p4rVar = (p4r) this.b;
                osu osuVar = (osu) this.c;
                osu osuVar2 = (osu) this.d;
                float floatValue = ((Float) obj).floatValue();
                int intValue = ix0.a(floatValue, Integer.valueOf(osuVar.a), Integer.valueOf(osuVar2.a)).intValue();
                p4rVar.r = intValue;
                float[] fArr = p4rVar.A;
                p4r.g(intValue, 15, fArr);
                int intValue2 = ix0.a(floatValue, Integer.valueOf(osuVar.b), Integer.valueOf(osuVar2.b)).intValue();
                p4rVar.s = intValue2;
                p4r.g(intValue2, 6, fArr);
                int intValue3 = ix0.a(floatValue, Integer.valueOf(osuVar.c), Integer.valueOf(osuVar2.c)).intValue();
                p4rVar.t = intValue3;
                p4r.g(intValue3, 12, fArr);
                int intValue4 = ix0.a(floatValue, Integer.valueOf(osuVar.d), Integer.valueOf(osuVar2.d)).intValue();
                p4rVar.u = intValue4;
                p4r.g(intValue4, 3, fArr);
                int intValue5 = ix0.a(floatValue, Integer.valueOf(osuVar.e), Integer.valueOf(osuVar2.e)).intValue();
                p4rVar.v = intValue5;
                p4r.g(intValue5, 9, fArr);
                int intValue6 = ix0.a(floatValue, Integer.valueOf(osuVar.f), Integer.valueOf(osuVar2.f)).intValue();
                p4rVar.w = intValue6;
                p4r.g(intValue6, 0, fArr);
                p4rVar.h();
                return Unit.a;
            case 3:
                Function0 function0 = (Function0) this.b;
                a8r a8rVar = (a8r) this.c;
                dzf dzfVar = (dzf) this.d;
                ((Context) obj).getClass();
                gc8 gc8Var = (gc8) function0.invoke();
                sk3.T(gc8Var, a8rVar.a, new dw8("SplashScreenContent"), dzfVar, true);
                return gc8Var;
            case 4:
                cir cirVar = (cir) this.b;
                ((h5i) ywf.L(cirVar, (h5i) this.c)).b(cirVar, (usg) this.d, (ohb) obj);
                return Unit.a;
            case 5:
                x8a x8aVar = (x8a) this.b;
                wqn wqnVar = (wqn) this.c;
                x8aVar.f();
                wqnVar.a = 0L;
                ((Function1) this.d).invoke((enj) obj);
                return Unit.a;
            case 6:
                srs srsVar = (srs) this.b;
                nrs nrsVar3 = (nrs) this.c;
                mm6 mm6Var = (mm6) this.d;
                n9b n9bVar = (n9b) obj;
                n9bVar.getClass();
                ubi ubiVar = n9bVar.a;
                if (Intrinsics.d(srsVar, prs.a) || Intrinsics.d(srsVar, qrs.a)) {
                    lg3.A(n9bVar);
                } else {
                    if (!(srsVar instanceof rrs)) {
                        b6e.s();
                        return null;
                    }
                    rrs rrsVar = (rrs) srsVar;
                    boolean z = rrsVar.h;
                    xbb xbbVar = rrsVar.a;
                    if (z) {
                        swu c = nrsVar3.c(mm6Var);
                        mqs mqsVar = nrsVar3.a;
                        if (mqsVar.l() && !mqsVar.C()) {
                            zhsVar = new zhs(0, nrsVar3, nrs.class, "onAlbumClick", "onAlbumClick()V", 0, 2);
                        }
                        xbbVar.getClass();
                        ubiVar.a(new wn5(new t2n(29, xbbVar, c, zhsVar), 2022736450, true));
                        nrsVar = nrsVar3;
                    } else {
                        mqs mqsVar2 = nrsVar3.a;
                        if (!mqsVar2.l() || mqsVar2.C()) {
                            nrsVar = nrsVar3;
                        } else {
                            nrsVar = nrsVar3;
                            continuation = new zhs(0, nrsVar, nrs.class, "onAlbumClick", "onAlbumClick()V", 0, 3);
                        }
                        xbbVar.getClass();
                        mqsVar2.getClass();
                        ubiVar.a(new wn5(new t2n(28, xbbVar, mqsVar2, continuation), 1317940462, true));
                    }
                    List list = rrsVar.b;
                    if (list != null) {
                        nrsVar2 = nrsVar;
                        ild.e(n9bVar, list, new lgq(1, nrsVar, nrs.class, "onArtistClick", "onArtistClick(Lru/yandex/music/data/domainitem/ArtistDomainItem;)V", 0, 17));
                    } else {
                        nrsVar2 = nrsVar;
                    }
                    qld.h(n9bVar, rrsVar.c);
                    if (!z && (lnuVar = rrsVar.d) != null) {
                        o5g.p(n9bVar, lnuVar, nrsVar2.c(mm6Var));
                        lg3.D(n9bVar, 8);
                    }
                    ubb ubbVar = rrsVar.e;
                    if (ubbVar != null) {
                        ltg.f(n9bVar, ubbVar, 6);
                    }
                    lg3.D(n9bVar, 24);
                    Iterator it = rrsVar.f.iterator();
                    while (it.hasNext()) {
                        ksw.A(n9bVar, (sbb) it.next());
                    }
                    lg3.D(n9bVar, 16);
                    Iterator it2 = rrsVar.g.iterator();
                    while (it2.hasNext()) {
                        ksw.A(n9bVar, (sbb) it2.next());
                    }
                }
                return Unit.a;
            case 7:
                mqs mqsVar3 = (mqs) this.b;
                kxi kxiVar = (kxi) this.c;
                uus uusVar = (uus) this.d;
                ((is6) obj).getClass();
                return new wus(mqsVar3, kxiVar, uusVar);
            case 8:
                zvs zvsVar = (zvs) this.b;
                o5n o5nVar = (o5n) this.c;
                thr thrVar = (thr) this.d;
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                cko D0 = xjoVar.D0("DELETE FROM tracks_cache WHERE track_id = ? AND quality = ? AND storage = ?");
                try {
                    zvsVar.getClass();
                    D0.E(1, zvsVar.a);
                    o5nVar.getClass();
                    int ordinal = o5nVar.ordinal();
                    if (ordinal == 0) {
                        str = "auto";
                    } else if (ordinal == 1) {
                        str = "Low";
                    } else if (ordinal == 2) {
                        str = "Normal";
                    } else if (ordinal == 3) {
                        str = "High";
                    } else {
                        if (ordinal != 4) {
                            throw new x7j();
                        }
                        str = "Lossless";
                    }
                    D0.E(2, str);
                    thrVar.getClass();
                    int ordinal2 = thrVar.ordinal();
                    if (ordinal2 == 0) {
                        str2 = "External";
                    } else {
                        if (ordinal2 != 1) {
                            throw new x7j();
                        }
                        str2 = "Sd";
                    }
                    D0.E(3, str2);
                    D0.q();
                    D0.close();
                    return Unit.a;
                } finally {
                }
            case 9:
                css cssVar = (css) this.b;
                zvs zvsVar2 = (zvs) this.c;
                css cssVar2 = (css) this.d;
                xjo xjoVar2 = (xjo) obj;
                xjoVar2.getClass();
                cko D02 = xjoVar2.D0("UPDATE tracks_cache SET cache_type = ? WHERE track_id = ? AND cache_type = ?");
                try {
                    D02.E(1, c9g.U(cssVar));
                    D02.E(2, zvsVar2.a);
                    D02.E(3, c9g.U(cssVar2));
                    D02.q();
                    D02.close();
                    return Unit.a;
                } finally {
                }
            case 10:
                e6t e6tVar = (e6t) this.b;
                mqs mqsVar4 = (mqs) this.c;
                String str3 = (String) this.d;
                r4t r4tVar = (r4t) obj;
                r4tVar.getClass();
                t4t t4tVar = e6tVar.k;
                int a = r4tVar.a(mqsVar4);
                t4tVar.getClass();
                nmb.s(t4tVar.b(), t4tVar.a.a.G(), wjb.TrailerScreen, null, pkb.Trailer, t4tVar.a(), pkb.SmartPreview, t4t.d(r4tVar, a), 1, a + 1, null, 0, false, "SMART_PREVIEW", t4t.d(r4tVar, a), 2, r4tVar.a, null, null, null, 0, str3, 24721436);
                return Unit.a;
            case 11:
                b3u b3uVar = (b3u) this.b;
                jmj jmjVar = (jmj) this.c;
                final x2u x2uVar = (x2u) this.d;
                n9b n9bVar2 = (n9b) obj;
                n9bVar2.getClass();
                if (b3uVar instanceof z2u) {
                    ksw.y(n9bVar2, jmjVar, d.x(d.c(vci.a, 1.0f), b2c.f, 2));
                } else {
                    if (!(b3uVar instanceof a3u)) {
                        b6e.s();
                        return null;
                    }
                    a3u a3uVar = (a3u) b3uVar;
                    final mqs mqsVar5 = a3uVar.g;
                    x2uVar.getClass();
                    final mqs mqsVar6 = (mqsVar5 == null || !mqsVar5.l() || mqsVar5.C()) ? null : mqsVar5;
                    Function0 function02 = mqsVar6 != null ? new Function0() { // from class: w2u
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i12 = i9;
                            mqs mqsVar7 = mqsVar6;
                            x2u x2uVar2 = x2uVar;
                            switch (i12) {
                                case 0:
                                    x2uVar2.getClass();
                                    bjt bjtVar = x2uVar2.d;
                                    ((dda) bjtVar.d).invoke();
                                    if (mqsVar7.k != dg2.c) {
                                        m mVar = (m) bjtVar.b;
                                        Parcelable.Creator<oq> creator = oq.CREATOR;
                                        mVar.u(cxb.O(mqsVar7));
                                    } else {
                                        Context context = (Context) bjtVar.a;
                                        context.getClass();
                                        hag.x(context, R.string.track_no_rights_title, 0);
                                    }
                                    break;
                                default:
                                    x2uVar2.getClass();
                                    mqsVar7.getClass();
                                    bjt bjtVar2 = x2uVar2.d;
                                    String str4 = mqsVar7.a;
                                    str4.getClass();
                                    Uri m = new r20(d2t.c).c(str4).m();
                                    m.getClass();
                                    Context context2 = (Context) bjtVar2.a;
                                    String uri = m.toString();
                                    uri.getClass();
                                    w1g.y(context2, uri, true);
                                    break;
                            }
                            return Unit.a;
                        }
                    } : null;
                    ubi ubiVar2 = n9bVar2.a;
                    ubiVar2.a(new wn5(new k0r(i3, a3uVar, function02), -2068076530, true));
                    List list2 = a3uVar.e;
                    if (list2 != null) {
                        ild.e(n9bVar2, list2, new r3s(i5, x2uVar));
                    }
                    qld.h(n9bVar2, a3uVar.f);
                    lg3.D(n9bVar2, 32);
                    u7g.n(n9bVar2, new zhs(0, x2uVar, x2u.class, "onShareClick", "onShareClick()V", 0, 22));
                    if (mqsVar5 != null) {
                        ubiVar2.a(new wn5(new ykf(i2, new Function0() { // from class: w2u
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i12 = i11;
                                mqs mqsVar7 = mqsVar5;
                                x2u x2uVar2 = x2uVar;
                                switch (i12) {
                                    case 0:
                                        x2uVar2.getClass();
                                        bjt bjtVar = x2uVar2.d;
                                        ((dda) bjtVar.d).invoke();
                                        if (mqsVar7.k != dg2.c) {
                                            m mVar = (m) bjtVar.b;
                                            Parcelable.Creator<oq> creator = oq.CREATOR;
                                            mVar.u(cxb.O(mqsVar7));
                                        } else {
                                            Context context = (Context) bjtVar.a;
                                            context.getClass();
                                            hag.x(context, R.string.track_no_rights_title, 0);
                                        }
                                        break;
                                    default:
                                        x2uVar2.getClass();
                                        mqsVar7.getClass();
                                        bjt bjtVar2 = x2uVar2.d;
                                        String str4 = mqsVar7.a;
                                        str4.getClass();
                                        Uri m = new r20(d2t.c).c(str4).m();
                                        m.getClass();
                                        Context context2 = (Context) bjtVar2.a;
                                        String uri = m.toString();
                                        uri.getClass();
                                        w1g.y(context2, uri, true);
                                        break;
                                }
                                return Unit.a;
                            }
                        }), 2070583965, true));
                    }
                    lg3.D(n9bVar2, 16);
                    ubiVar2.a(new wn5(new f5r(i, new zhs(0, x2uVar, x2u.class, "onVideoClipInfo", "onVideoClipInfo()V", 0, 23)), -1781052159, true));
                }
                return Unit.a;
            case 12:
                Integer num = (Integer) this.b;
                String str4 = (String) this.c;
                String str5 = (String) this.d;
                xjo xjoVar3 = (xjo) obj;
                xjoVar3.getClass();
                cko D03 = xjoVar3.D0("UPDATE video_clip SET like_status = ?, timestamp = ? WHERE video_clip_id = ?");
                try {
                    if (num == null) {
                        D03.bindNull(1);
                    } else {
                        D03.bindLong(1, num.intValue());
                    }
                    if (str4 == null) {
                        D03.bindNull(2);
                    } else {
                        D03.E(2, str4);
                    }
                    D03.E(3, str5);
                    D03.q();
                    D03.close();
                    return Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            case 13:
                String str6 = (String) this.b;
                String str7 = (String) this.c;
                Collection collection = (Collection) this.d;
                xjo xjoVar4 = (xjo) obj;
                xjoVar4.getClass();
                cko D04 = xjoVar4.D0(str6);
                try {
                    D04.E(1, str7);
                    Iterator it3 = collection.iterator();
                    int i12 = 2;
                    while (it3.hasNext()) {
                        D04.E(i12, (String) it3.next());
                        i12++;
                    }
                    D04.q();
                    D04.close();
                    return Unit.a;
                } finally {
                }
            case 14:
                paw pawVar = (paw) this.b;
                u7g u7gVar = (u7g) this.c;
                dzf dzfVar2 = (dzf) this.d;
                ((oa8) obj).getClass();
                pawVar.getClass();
                u7gVar.getClass();
                an5 an5Var = new an5(i6, u7gVar, pawVar);
                dzfVar2.getLifecycle().a(an5Var);
                return new mf0(17, dzfVar2, an5Var);
            case 15:
                g40 g40Var = (g40) this.b;
                jd6 jd6Var = (jd6) this.d;
                ExoPlayer exoPlayer3 = (ExoPlayer) this.c;
                Context context = (Context) obj;
                context.getClass();
                TextureView textureView = new TextureView(context);
                bjt bjtVar = new bjt(textureView, g40Var, jd6Var);
                b7t b7tVar = (b7t) bjtVar.c;
                exoPlayer3.getClass();
                ssg.a(3, null, "VideoPlayerView bind", null);
                ssg.a(3, null, "VideoPlayerView unbind", null);
                ExoPlayer exoPlayer4 = (ExoPlayer) bjtVar.b;
                if (exoPlayer4 != null) {
                    gdg.J(exoPlayer4, b7tVar);
                }
                textureView.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener) bjtVar.d);
                if (textureView.isAttachedToWindow()) {
                    v3w.k("VideoPlayerView on attach ", bjtVar.hashCode(), 3, null, null);
                    b7tVar.getClass();
                    exoPlayer3.j0(b7tVar);
                    exoPlayer3.n(textureView);
                    if (textureView.isAttachedToWindow()) {
                        ubuVar = new ubu(exoPlayer3, bjtVar, i11);
                        textureView.addOnAttachStateChangeListener(ubuVar);
                    } else {
                        v3w.k("VideoPlayerView on detach ", bjtVar.hashCode(), 3, null, null);
                        gdg.J(exoPlayer3, b7tVar);
                        ubuVar = null;
                    }
                    bjtVar.d = ubuVar;
                } else {
                    ubuVar2 = new ubu(exoPlayer3, bjtVar, i9);
                    textureView.addOnAttachStateChangeListener(ubuVar2);
                }
                bjtVar.d = ubuVar2;
                bjtVar.b = exoPlayer3;
                return textureView;
            case 16:
                dnu dnuVar = (dnu) this.b;
                qnq qnqVar = (qnq) this.c;
                knn knnVar = (knn) this.d;
                hjl hjlVar = (hjl) obj;
                hjlVar.getClass();
                return new rmu(dnuVar, qnqVar, knnVar, hjlVar);
            case 17:
                mpu mpuVar = (mpu) this.b;
                kxi kxiVar2 = (kxi) this.c;
                tmb tmbVar = (tmb) this.d;
                ((is6) obj).getClass();
                apo apoVar = mpuVar.a;
                apoVar.getClass();
                pzl pzlVar = (pzl) apoVar.c;
                bdt I = hag.I(squ.class);
                qdc qdcVar = pzlVar.a;
                qdcVar.getClass();
                squ squVar = (squ) qdcVar.C(I);
                gqu gquVar = (gqu) apoVar.b;
                return new uru(squVar, (frt) gquVar.c.getValue(), (oq7) gquVar.f.getValue(), (g0l) gquVar.e.getValue(), kxiVar2, new uiq(i4, tmbVar));
            case 18:
                mpu mpuVar2 = (mpu) this.b;
                String str8 = (String) this.c;
                fnb fnbVar = (fnb) this.d;
                ((is6) obj).getClass();
                apo apoVar2 = mpuVar2.a;
                apoVar2.getClass();
                str8.getClass();
                pzl pzlVar2 = (pzl) apoVar2.c;
                bdt I2 = hag.I(squ.class);
                qdc qdcVar2 = pzlVar2.a;
                qdcVar2.getClass();
                squ squVar2 = (squ) qdcVar2.C(I2);
                gqu gquVar2 = (gqu) apoVar2.b;
                return new fqu(str8, squVar2, (frt) gquVar2.c.getValue(), (g0l) gquVar2.e.getValue(), fnbVar, new atn(fnbVar));
            case 19:
                rru rruVar = (rru) this.b;
                Function0 function03 = (Function0) this.c;
                sdr sdrVar = (sdr) this.d;
                vuf vufVar = (vuf) obj;
                vufVar.getClass();
                vuf.Y(vufVar, null, new wn5(new f6p(i8, rruVar, function03), -1458422789, true), 3);
                vufVar.Z(4, null, vsf.v, new wn5(new t31(21, sdrVar), -792829166, true));
                return Unit.a;
            case 20:
                aqi aqiVar = (aqi) this.b;
                mm6 mm6Var2 = (mm6) this.c;
                fk0 fk0Var = (fk0) this.d;
                float floatValue2 = ((Float) obj).floatValue();
                aqiVar.setValue(0);
                x97.y(mm6Var2, null, null, new fn4(fk0Var, floatValue2, continuation, i11), 3);
                return Unit.a;
            case 21:
                bzv bzvVar = (bzv) this.b;
                rxv rxvVar = (rxv) this.c;
                mm6 mm6Var3 = (mm6) this.d;
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                if (bzvVar instanceof zyv) {
                    wfp.y(jfpVar, new cwo(new keh(rxvVar, i7), new nxv(i10), false));
                    jfpVar.o(hfp.d, new sa(null, new u0v(i, mm6Var3, rxvVar)));
                }
                return Unit.a;
            case 22:
                mm6 mm6Var4 = (mm6) this.b;
                z1w z1wVar = (z1w) this.c;
                fvf fvfVar = (fvf) this.d;
                String str9 = (String) obj;
                str9.getClass();
                x97.y(mm6Var4, null, null, new aq5(fvfVar, continuation, i2), 3);
                z1wVar.getClass();
                str9.getClass();
                xdr xdrVar3 = z1wVar.e;
                xdrVar3.getClass();
                xdrVar3.m(null, str9);
                ((j1w) z1wVar.b.b).a.n0(str9);
                return Unit.a;
            case 23:
                j2w j2wVar = (j2w) this.b;
                Function2 function2 = (Function2) this.c;
                pyc pycVar = (pyc) this.d;
                vuf vufVar2 = (vuf) obj;
                vufVar2.getClass();
                vuf.Y(vufVar2, null, i4w.i, 3);
                if (j2wVar instanceof h2w) {
                    vufVar2.Z(10, null, vsf.v, i4w.j);
                }
                if (j2wVar instanceof g2w) {
                    List list3 = ((g2w) j2wVar).a;
                    vufVar2.Z(list3.size(), null, new zcf(list3, i3), new wn5(new t50(list3, function2, pycVar, i8), -1091073711, true));
                }
                vuf.Y(vufVar2, null, i4w.k, 3);
                return Unit.a;
            case 24:
                String str10 = (String) this.b;
                l3o l3oVar = (l3o) this.c;
                d9 d9Var = (d9) this.d;
                c9 c9Var = (c9) obj;
                c9Var.getClass();
                String a2 = l3oVar.f.a("ETag");
                String str11 = a2 != null ? a2 : null;
                d9Var.a.getClass();
                return new e9(str10, str11, a.a(), c9Var);
            case 25:
                String str12 = (String) this.b;
                l3o l3oVar2 = (l3o) this.c;
                l lVar = (l) this.d;
                da daVar = (da) obj;
                daVar.getClass();
                String str13 = daVar.a;
                String str14 = daVar.b;
                String str15 = daVar.c;
                v vVar = w.Companion;
                String a3 = l3oVar2.f.a("ETag");
                String str16 = a3 != null ? a3 : null;
                ((a) lVar.a).getClass();
                long a4 = a.a();
                vVar.getClass();
                return new z9(str13, str14, str15, v.a(a4, str12, str16));
            case 26:
                String str17 = (String) this.b;
                r rVar = (r) this.c;
                String str18 = (String) this.d;
                p pVar = (p) obj;
                pVar.getClass();
                pVar.J("/1/bundle/account/person/");
                pVar.F("Ya-Consumer-Authorization", "OAuth ".concat(str17));
                Pair pair = new Pair("display_name", rVar.a);
                Pair pair2 = new Pair("firstname", rVar.b);
                Pair pair3 = new Pair("lastname", rVar.c);
                Pair pair4 = new Pair("birthday", rVar.d);
                p1 p1Var = rVar.e;
                pVar.T(n7w.G(uah.e(pair, pair2, pair3, pair4, new Pair("gender", p1Var != null ? p1Var.a[0] : null))));
                pVar.S("track_id", str18);
                return Unit.a;
            case 27:
                String str19 = (String) this.b;
                WebView webView = (WebView) this.c;
                aqi aqiVar2 = (aqi) this.d;
                ((FrameLayout) obj).getClass();
                if (!Intrinsics.d(str19, (String) aqiVar2.getValue())) {
                    webView.loadUrl(str19);
                    aqiVar2.setValue(str19);
                }
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                com.yandex.passport.internal.report.reporters.m mVar = (com.yandex.passport.internal.report.reporters.m) this.b;
                com.yandex.passport.internal.ui.bouncer.model.p1 p1Var2 = (com.yandex.passport.internal.ui.bouncer.model.p1) this.c;
                s sVar = (s) this.d;
                qh qhVar = (qh) obj;
                qhVar.getClass();
                int i13 = qhVar.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(b.b, null, "activityResult: " + qhVar, 8);
                }
                mVar.getClass();
                mVar.n(j4.d, new com.yandex.passport.internal.report.a(i13, 18));
                if (i13 == 0) {
                    sVar.a(p1Var2.b ? y1.a : y1.b);
                } else {
                    sVar.a(new c2(i13, qhVar.b));
                }
                return Unit.a;
            default:
                com.yandex.passport.internal.ui.challenge.logout.bottomsheet.p pVar2 = (com.yandex.passport.internal.ui.challenge.logout.bottomsheet.p) this.b;
                LogoutBottomSheetComposeActivity logoutBottomSheetComposeActivity = (LogoutBottomSheetComposeActivity) this.c;
                u uVar = (u) this.d;
                com.yandex.passport.internal.ui.challenge.logout.d dVar = (com.yandex.passport.internal.ui.challenge.logout.d) obj;
                int i14 = LogoutBottomSheetComposeActivity.f;
                dVar.getClass();
                (((Boolean) pVar2.getFlagRepository().b(com.yandex.passport.internal.flags.o.T)).booleanValue() ? logoutBottomSheetComposeActivity.c : logoutBottomSheetComposeActivity.b).a(new Pair(uVar, dVar));
                return Unit.a;
        }
    }

    public /* synthetic */ zzq(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
