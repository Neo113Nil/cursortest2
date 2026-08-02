package defpackage;

import android.content.Context;
import android.graphics.Picture;
import android.graphics.RectF;
import android.graphics.drawable.PictureDrawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.music.shared.skeleton.data.core.api.block.model.SkeletonBlockSourceDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.e;
import ru.yandex.music.common.media.context.h;
import ru.yandex.music.data.wave.recommendations.StationId;
import ru.yandex.video.m3.preload_manager.PreloadException;

/* loaded from: classes6.dex */
public abstract class y5g {
    public static final void A(i7p i7pVar, g6p g6pVar, int i, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        int i4;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-319031755);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(i7pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var.f(g6pVar) : oq5Var.h(g6pVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 = i;
            i3 |= oq5Var.d(i) ? 256 : 128;
        } else {
            i4 = i;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if (!oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            oq5Var.S();
        } else if (!((Boolean) oq5Var.j((agr) spg.d.c)).booleanValue() || i7pVar.b == null) {
            oq5Var.Z(488311616);
            bzf.f(i7pVar.a, h0(g6pVar, o8g.E(i7pVar.c), i, g6pVar.e(), oq5Var, ((i3 >> 3) & 14) | (i3 & 896) | ((i3 << 12) & 57344)), a.a(d.d(yciVar, 1.0f), "best_result_searched_wave"), oq5Var, 0);
            oq5Var.p(false);
        } else {
            oq5Var.Z(487938500);
            int i5 = i3 >> 3;
            vwb.E(i7pVar.b, h0(g6pVar, o8g.E(i7pVar.c), i4, g6pVar.e(), oq5Var, (i3 & 896) | (i5 & 14)), yciVar, e9g.a, oq5Var, (i5 & 896) | 3072, 0);
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new o4p(i7pVar, g6pVar, i, yciVar, i2, 5);
        }
    }

    public static final m3q A0(List list, fyt fytVar) {
        list.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((mqs) it.next()).a);
        }
        return new m3q(new cd5(arrayList), fytVar);
    }

    public static final void B(w7p w7pVar, g6p g6pVar, int i, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-62342125);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(w7pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var.f(g6pVar) : oq5Var.h(g6pVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            lxe.f(w7pVar.a, ehv.p(w7pVar.b, new sfm(g6pVar, w7pVar, szf.o0(Integer.valueOf(i), oq5Var)), oq5Var), ksw.D(a.a(yciVar, "searched_clip"), rvf.M(R.string.music_video, oq5Var), null), null, oq5Var, 0, 8);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lx(w7pVar, g6pVar, i, yciVar, i2, 20);
        }
    }

    public static final b6v B0(mqs mqsVar, fyt fytVar) {
        mqsVar.getClass();
        return new b6v(new m3q(new cd5(t75.c(mqsVar.a)), fytVar));
    }

    public static final void C(final k7p k7pVar, final zzo zzoVar, final int i, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        String n;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1018525430);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(k7pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var.f(zzoVar) : oq5Var.h(zzoVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            if (zzoVar.b()) {
                oq5Var.Z(1053080406);
                n = j66.d0(((pw5) k7pVar.a.a).b.d(), oq5Var);
                oq5Var.p(false);
            } else {
                n = vz1.n(oq5Var, 1053182768, R.string.concert_header_a11y, oq5Var, false);
            }
            g06 g06Var = k7pVar.a;
            yci D = ksw.D(a.a(d.d(yciVar, 1.0f), "searched_concert"), n, null);
            boolean b = zzoVar.b();
            int i4 = i3 & 112;
            int i5 = i3 & 896;
            boolean h = (i4 == 32 || ((i3 & 64) != 0 && oq5Var.h(zzoVar))) | oq5Var.h(k7pVar) | (i5 == 256);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                K = new Function0() { // from class: l4p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (r4) {
                            case 0:
                                zzoVar.p(k7pVar, i);
                                break;
                            default:
                                zzoVar.r(k7pVar, i);
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K);
            }
            Function0 function0 = (Function0) K;
            int i6 = ((i4 == 32 || ((i3 & 64) != 0 && oq5Var.h(zzoVar))) ? 1 : 0) | (oq5Var.h(k7pVar) ? 1 : 0) | (i5 == 256 ? 1 : 0);
            Object K2 = oq5Var.K();
            if (i6 != 0 || K2 == kjnVar) {
                final int i7 = 1;
                K2 = new Function0() { // from class: l4p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i7) {
                            case 0:
                                zzoVar.p(k7pVar, i);
                                break;
                            default:
                                zzoVar.r(k7pVar, i);
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K2);
            }
            g0g.n(g06Var, function0, (Function0) K2, b, D, oq5Var, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lx(k7pVar, zzoVar, i, yciVar, i2, 17);
        }
    }

    public static final void D(l7p l7pVar, g6p g6pVar, int i, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1001443484);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(l7pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var.f(g6pVar) : oq5Var.h(g6pVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            aqi o0 = szf.o0(Integer.valueOf(i), oq5Var);
            raj rajVar = l7pVar.a;
            mqs mqsVar = l7pVar.b;
            l18 l18Var = l18.b;
            bdt I = hag.I(fdj.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            o5g.d(rajVar, aaw.t(mqsVar, new t3e(2, g6pVar, l7pVar, o0), (fdj) qdcVar.C(I), null, oq5Var, 199680), ksw.D(a.a(yciVar, "searched_episode"), X(l7pVar.b, oq5Var), null), oq5Var, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new o4p(l7pVar, g6pVar, i, yciVar, i2, 0);
        }
    }

    public static final void E(int i, int i2, hq5 hq5Var) {
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-262346734);
        int i3 = (oq5Var2.d(i) ? 4 : 2) | i2;
        if (oq5Var2.P(i3 & 1, (i3 & 3) != 2)) {
            String M = rvf.M(i, oq5Var2);
            long j = ((dq0) oq5Var2.j(eq0.a)).b.a;
            ges c = nu0.c();
            float f = 16;
            yci a = a.a(androidx.compose.foundation.layout.a.p(vci.a, f, 24, f, 8), "searched_item_header");
            Object K = oq5Var2.K();
            if (K == gq5.a) {
                K = new d0p(10);
                oq5Var2.k0(K);
            }
            oq5Var = oq5Var2;
            xv7.j(M, nfp.b(a, false, (Function1) K), j, 0L, 0L, 0, 0L, 2, false, 1, 0, null, c, oq5Var, 0, 3120, 55288);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new mz3(i, i2, 6);
        }
    }

    public static final void F(n7p n7pVar, g6p g6pVar, int i, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-441982858);
        int i4 = 4;
        if ((i2 & 6) == 0) {
            i3 = (oq5Var2.h(n7pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var2.f(g6pVar) : oq5Var2.h(g6pVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var2.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var2.f(yciVar) ? 2048 : 1024;
        }
        if (oq5Var2.P(i3 & 1, (i3 & 1171) != 1170)) {
            e9g e9gVar = e9g.b;
            kbj kbjVar = n7pVar.a;
            yci a = a.a(yciVar, "searched_podcast");
            int i5 = w4p.a[n7pVar.b.d().ordinal()];
            yci D = ksw.D(a, rvf.M(i5 != 1 ? i5 != 2 ? R.string.album : R.string.book : R.string.podcast, oq5Var2), null);
            boolean h = ((i3 & 112) == 32 || ((i3 & 64) != 0 && oq5Var2.h(g6pVar))) | oq5Var2.h(n7pVar) | ((i3 & 896) == 256);
            Object K = oq5Var2.K();
            if (h || K == gq5.a) {
                K = new hsl(g6pVar, n7pVar, i, i4);
                oq5Var2.k0(K);
            }
            oq5Var = oq5Var2;
            p6g.d(kbjVar, (Function0) K, D, 0L, null, null, false, null, e9gVar, oq5Var, 100663296, 248);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lx(n7pVar, g6pVar, i, yciVar, i2, 25);
        }
    }

    public static final void G(o7p o7pVar, g6p g6pVar, int i, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-196064842);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(o7pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var.f(g6pVar) : oq5Var.h(g6pVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            e9g e9gVar = e9g.b;
            lwl lwlVar = o7pVar.a;
            yci D = ksw.D(a.a(yciVar, "searched_playlist"), rvf.M(R.string.playlist, oq5Var), null);
            boolean h = ((i3 & 112) == 32 || ((i3 & 64) != 0 && oq5Var.h(g6pVar))) | oq5Var.h(o7pVar) | ((i3 & 896) == 256);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new hsl(g6pVar, o7pVar, i, 3);
                oq5Var.k0(K);
            }
            wyf.h(lwlVar, (Function0) K, D, 0L, null, null, e9gVar, null, oq5Var, ScreenMirroringConfig.Video.BITRATE_1_5MB, 184);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lx(o7pVar, g6pVar, i, yciVar, i2, 21);
        }
    }

    public static final void H(p7p p7pVar, g6p g6pVar, int i, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var;
        Object obj;
        m7n m7nVar;
        int i4;
        Object obj2;
        Object Y;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1274351946);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var2.h(p7pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var2.f(g6pVar) : oq5Var2.h(g6pVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var2.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var2.f(yciVar) ? 2048 : 1024;
        }
        if (oq5Var2.P(i3 & 1, (i3 & 1171) != 1170)) {
            int i5 = i3 >> 3;
            int i6 = i5 & 14;
            g6pVar.getClass();
            Context context = (Context) oq5Var2.j(AndroidCompositionLocals_androidKt.b);
            Object K = oq5Var2.K();
            Object obj3 = gq5.a;
            if (K == obj3) {
                K = gld.R(g.a, oq5Var2);
                oq5Var2.k0(K);
            }
            mm6 mm6Var = (mm6) K;
            boolean z = (((i5 & 112) ^ 48) > 32 && oq5Var2.d(i)) || (i5 & 48) == 32;
            Object K2 = oq5Var2.K();
            if (z || K2 == obj3) {
                obj = obj3;
                Object m7nVar2 = new m7n(context, mm6Var, g6pVar.c0(), new t4p(g6pVar, i, 0), new t4p(g6pVar, i, 1), new qo1(g6pVar, i, 6));
                oq5Var2.k0(m7nVar2);
                K2 = m7nVar2;
            } else {
                obj = obj3;
            }
            m7n m7nVar3 = (m7n) K2;
            if (p7pVar == null) {
                oq5Var2.Z(1003176260);
                oq5Var2.p(false);
                Y = null;
                i4 = i3;
                obj2 = obj;
                oq5Var = oq5Var2;
                m7nVar = m7nVar3;
            } else {
                oq5Var2.Z(1003176261);
                s9p E = o8g.E(p7pVar.b.c);
                cvo e = g6pVar.e();
                int i7 = i6 | (i3 & 896);
                e.getClass();
                c3r c3rVar = (c3r) oq5Var2.j(es5.p);
                int i8 = i3;
                StationId e2 = StationId.e(E);
                ArrayList R = o8g.R(E);
                kxi d = g6pVar.d();
                atn atnVar = new atn(4, g6pVar, E);
                k6l h = g6pVar.h();
                uwu g = g6pVar.g();
                qwu y = g6pVar.y();
                boolean h2 = oq5Var2.h(e) | ((((i7 & 896) ^ 384) > 256 && oq5Var2.d(i)) || (i7 & 384) == 256) | oq5Var2.h(e2);
                Object K3 = oq5Var2.K();
                if (h2 || K3 == obj) {
                    K3 = new u4p(e, i, e2, 0);
                    oq5Var2.k0(K3);
                }
                Function0 function0 = (Function0) K3;
                boolean f = oq5Var2.f(c3rVar);
                Object K4 = oq5Var2.K();
                if (f || K4 == obj) {
                    K4 = new h0f(c3rVar, 3);
                    oq5Var2.k0(K4);
                }
                m7nVar = m7nVar3;
                i4 = i8;
                obj2 = obj;
                Y = wyf.Y(e2, R, d, function0, h, g, y, atnVar, null, (Function1) K4, oq5Var2, 6, 0, 256);
                oq5Var = oq5Var2;
                oq5Var.p(false);
            }
            boolean h3 = oq5Var.h(m7nVar) | oq5Var.h(p7pVar) | oq5Var.h(Y);
            Object K5 = oq5Var.K();
            if (h3 || K5 == obj2) {
                K5 = new cte(22, m7nVar, p7pVar, Y);
                oq5Var.k0(K5);
            }
            gld.D((Function0) K5, oq5Var);
            p6g.i(m7nVar, yciVar, oq5Var, (i4 >> 6) & 112);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lx(p7pVar, g6pVar, i, yciVar, i2, 19);
        }
    }

    public static final void I(float f, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(473719760);
        int i2 = (oq5Var.c(f) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            u1g.l(oq5Var, d.e(vci.a, f));
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new xd1(i, f, 5);
        }
    }

    public static final void J(v7p v7pVar, g6p g6pVar, int i, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(552460156);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(v7pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var.f(g6pVar) : oq5Var.h(g6pVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            aqi o0 = szf.o0(Integer.valueOf(i), oq5Var);
            po6 po6Var = v7pVar.a;
            mqs mqsVar = v7pVar.b;
            vut.i(po6Var, up6.H(mqsVar, new t3e(3, g6pVar, v7pVar, o0), oq5Var, 6, 4), ksw.D(a.a(yciVar, "searched_track"), X(mqsVar, oq5Var), null), oq5Var, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new o4p(v7pVar, g6pVar, i, yciVar, i2, 9);
        }
    }

    public static final void K(x7p x7pVar, g6p g6pVar, int i, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-524836312);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(x7pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var.f(g6pVar) : oq5Var.h(g6pVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            aqi o0 = szf.o0(Integer.valueOf(i), oq5Var);
            if (!((Boolean) oq5Var.j((agr) spg.d.c)).booleanValue() || x7pVar.c == null) {
                int i4 = i3;
                oq5Var.Z(-1716853664);
                euu euuVar = x7pVar.a;
                u1u u1uVar = x7pVar.b;
                StationId stationId = u1uVar.a;
                List list = u1uVar.b;
                StationId stationId2 = StationId.a;
                List c = StationId.c(stationId.h(), list);
                c.getClass();
                fxf.p(euuVar, h0(g6pVar, o8g.E(c), ((Number) o0.getValue()).intValue(), g6pVar.e(), oq5Var, (i4 >> 3) & 14), a.a(yciVar, "searched_vibe"), null, false, e9g.b, oq5Var, 196608, 24);
                oq5Var.p(false);
            } else {
                oq5Var.Z(-1717249069);
                klu kluVar = x7pVar.c;
                u1u u1uVar2 = x7pVar.b;
                StationId stationId3 = u1uVar2.a;
                List list2 = u1uVar2.b;
                StationId stationId4 = StationId.a;
                List c2 = StationId.c(stationId3.h(), list2);
                c2.getClass();
                int i5 = i3 >> 3;
                vwb.E(kluVar, h0(g6pVar, o8g.E(c2), ((Number) o0.getValue()).intValue(), g6pVar.e(), oq5Var, i5 & 14), yciVar, null, oq5Var, i5 & 896, 8);
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lx(x7pVar, g6pVar, i, yciVar, i2, 18);
        }
    }

    public static final void L(String str, boolean z, Function0 function0, o0k o0kVar, hq5 hq5Var, int i) {
        String str2;
        o0k o0kVar2;
        q0k q0kVar;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1709725167);
        int i2 = (oq5Var.f(str) ? 4 : 2) | i | (oq5Var.g(z) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(function0) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            float f = 16;
            float f2 = 2;
            q0k q0kVar2 = new q0k(f, f2, f, f2);
            if (z) {
                oq5Var.Z(405512298);
                hz2 hz2Var = b2c.l;
                vci vciVar = vci.a;
                yci l = androidx.compose.foundation.layout.a.l(d.g(vciVar, 40, 0.0f, 2), q0kVar2);
                nho a = lho.a(qx0.a, hz2Var, oq5Var, 48);
                int i4 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H = vnj.H(oq5Var, l);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, a, wp5.f);
                g0g.U(oq5Var, l2, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var, i4, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                w4k E = a0g.E(R.drawable.ic_check_16, 0, oq5Var);
                agr agrVar = eq0.a;
                irf.r(E, null, null, null, null, 0.0f, new d43(((dq0) oq5Var.j(agrVar)).b.a, 5), oq5Var, 48, 60);
                xcs.b(str, androidx.compose.foundation.layout.a.q(vciVar, 4, 0.0f, 0.0f, 0.0f, 14), ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, nu0.i(), oq5Var, (i3 & 14) | 48, 3072, 57336);
                str2 = str;
                oq5Var = oq5Var;
                oq5Var.p(true);
                oq5Var.p(false);
                q0kVar = q0kVar2;
            } else {
                str2 = str;
                oq5Var.Z(406187261);
                hdg.r(function0, null, q0kVar2, ild.C(2109667515, new mf3(str2, 8), oq5Var), oq5Var, ((i3 >> 6) & 14) | 3456, 2);
                q0kVar = q0kVar2;
                oq5Var.p(false);
            }
            o0kVar2 = q0kVar;
        } else {
            str2 = str;
            oq5Var.S();
            o0kVar2 = o0kVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pp(str2, z, function0, o0kVar2, i, 14);
        }
    }

    public static final void M(Function0 function0, yci yciVar, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-758768728);
        if ((i & 6) == 0) {
            i3 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            yciVar2 = i4 != 0 ? vci.a : yciVar;
            aae.a(function0, a.a(androidx.compose.foundation.layout.a.m(d.m(yciVar2, 48), 8), "share_button"), false, qwp.c, oq5Var, (i3 & 14) | 24576, 12);
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new qtb(function0, yciVar2, i, i2, 2);
        }
    }

    public static final void N(u0q u0qVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1645981853);
        int i2 = (oq5Var.h(u0qVar) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
            Unit unit = Unit.a;
            boolean h = oq5Var.h(u0qVar) | oq5Var.h(context);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new vfe(u0qVar, context, null, 1);
                oq5Var.k0(K);
            }
            gld.w(oq5Var, unit, (Function2) K);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tfe(u0qVar, i, 1);
        }
    }

    public static final void O(i6r i6rVar, Long l, boolean z, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(311207663);
        if (((i | (oq5Var.f(i6rVar) ? 4 : 2) | (oq5Var.f(l) ? 32 : 16) | (oq5Var.g(z) ? 256 : 128) | 3072) & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            boolean z2 = vut.I(oq5Var).y;
            vci vciVar = vci.a;
            if (z2) {
                x2i x2iVar = qx0.a;
                oq5Var.a0(-862651793);
                u3r u3rVar = (u3r) oq5Var.j(bfs.c);
                oq5Var.p(false);
                nx0 g = qx0.g(u3rVar.b);
                oq5Var.a0(693286680);
                nho a = lho.a(g, b2c.k, oq5Var, 0);
                oq5Var.a0(-1323940314);
                int i2 = oq5Var.P;
                androidx.compose.runtime.internal.a l6 = oq5Var.l();
                xp5.T.getClass();
                grb grbVar = wp5.b;
                wn5 A = ghh.A(vciVar);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, a, wp5.f);
                g0g.U(oq5Var, l6, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                    ouj.x(i2, oq5Var, i2, kb5Var);
                }
                A.invoke(new lrq(oq5Var), oq5Var, 0);
                oq5Var.a0(2058660585);
                int i3 = z ? R.string.compactSpeedTelemetryBlurShownTime : R.string.speedTelemetryBlurShownTime;
                String f0 = (i6rVar == null || (l5 = i6rVar.b) == null) ? null : f0(l5.longValue(), z);
                boolean z3 = vut.I(oq5Var).z;
                boolean z4 = vut.I(oq5Var).A;
                qho qhoVar = qho.a;
                h4a.i(Integer.valueOf(i3), f0, qhoVar.a(1.0f, vciVar, false), false, z3, z4, oq5Var, 0, 8);
                int i4 = z ? R.string.compactSpeedTelemetryImageShownTime : R.string.speedTelemetryImageShownTime;
                h4a.i(Integer.valueOf(i4), (i6rVar == null || (l4 = i6rVar.c) == null) ? null : f0(l4.longValue(), z), qhoVar.a(1.0f, vciVar, false), false, vut.I(oq5Var).B, vut.I(oq5Var).C, oq5Var, 0, 8);
                int i5 = z ? R.string.compactSpeedTelemetryFirstFrameShownTime : R.string.speedTelemetryFirstFrameShownTime;
                h4a.i(Integer.valueOf(i5), (i6rVar == null || (l3 = i6rVar.d) == null) ? null : f0(l3.longValue(), z), qhoVar.a(1.0f, vciVar, false), false, vut.I(oq5Var).D, vut.I(oq5Var).E, oq5Var, 0, 8);
                int i6 = z ? R.string.compactSpeedTelemetryPlayDeltaTime : R.string.speedTelemetryPlayDeltaTime;
                h4a.i(Integer.valueOf(i6), l != null ? f0(l.longValue(), z) : null, qhoVar.a(1.0f, vciVar, false), false, vut.I(oq5Var).F, vut.I(oq5Var).G, oq5Var, 0, 8);
                int i7 = z ? R.string.compactSpeedTelemetryTotalTime : R.string.speedTelemetryTotalTime;
                h4a.i(Integer.valueOf(i7), (i6rVar == null || (l2 = i6rVar.e) == null) ? null : f0(l2.longValue(), z), qhoVar.a(1.0f, vciVar, false), false, vut.I(oq5Var).H, vut.I(oq5Var).I, oq5Var, 0, 8);
                k5r.s(oq5Var, false, true, false, false);
            }
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gyj(i6rVar, l, z, yciVar2, i);
        }
    }

    public static final long P(int i, int i2) {
        if (i < 0 || i2 < 0) {
            tme.a("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        long j = (i2 & 4294967295L) | (i << 32);
        int i3 = rds.c;
        return j;
    }

    public static void Q(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!e0(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !e0(b3) && !e0(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw bye.c();
    }

    public static void R(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || e0(b2)) {
            throw bye.c();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    public static void S(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (e0(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || e0(b3)))) {
            throw bye.c();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    public static final ArrayList T(List list, wmn wmnVar) {
        List<x1u> list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        for (x1u x1uVar : list2) {
            arrayList.add(new y1u(new tfn(x1uVar.a), x1uVar, wmnVar));
        }
        return arrayList;
    }

    public static jto U(Callable callable) {
        try {
            Object call = callable.call();
            up6.L(call, "Scheduler Callable result can't be null");
            return (jto) call;
        } catch (Throwable th) {
            throw aob.a(th);
        }
    }

    public static final long V(int i, long j) {
        int i2 = rds.c;
        int i3 = (int) (j >> 32);
        int i4 = i3 < 0 ? 0 : i3;
        if (i4 > i) {
            i4 = i;
        }
        int i5 = (int) (4294967295L & j);
        int i6 = i5 >= 0 ? i5 : 0;
        if (i6 <= i) {
            i = i6;
        }
        return (i4 == i3 && i == i5) ? j : P(i4, i);
    }

    public static final String W(lt ltVar, hq5 hq5Var) {
        int i = w4p.a[ltVar.b.ordinal()];
        return rvf.M(i != 1 ? i != 2 ? R.string.album : R.string.book : R.string.podcast, hq5Var);
    }

    public static final String X(mqs mqsVar, hq5 hq5Var) {
        int ordinal = mqsVar.I().ordinal();
        return rvf.M(ordinal != 1 ? (ordinal == 9 || ordinal == 10) ? R.string.chapter : R.string.track : R.string.episode, hq5Var);
    }

    public static igr Y(List list, qdc qdcVar, xsu xsuVar, pfn pfnVar, a6l a6lVar, String str, String str2, t0q t0qVar, boolean z, int i) {
        qdc qdcVar2 = (i & 2) != 0 ? new qdc((e) null, (h) null, 3) : qdcVar;
        xsu xsuVar2 = (i & 4) != 0 ? rsu.a : xsuVar;
        nyn nynVar = nyn.a;
        pfn pfnVar2 = (i & 16) != 0 ? null : pfnVar;
        String str3 = (i & 64) != 0 ? null : str;
        String str4 = (i & 128) != 0 ? null : str2;
        t0q r0qVar = (i & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? new r0q(0) : t0qVar;
        list.getClass();
        if (list.isEmpty()) {
            dfi.r("seed must be not empty", "EmptySeeds");
        }
        d0t d0tVar = new d0t(list, z);
        gxc gxcVar = a6lVar.a;
        if (pfnVar2 == null) {
            pfnVar2 = null;
        }
        if (str3 == null) {
            str3 = null;
        }
        String str5 = str4 != null ? str4 : null;
        if (str3 == null) {
            str3 = "default";
        }
        if (pfnVar2 == null) {
            pfnVar2 = new q3r(str3);
        }
        return new igr(xsuVar2, nynVar, false, vys.a, pfnVar2, gxcVar, qdcVar2, d0tVar, str5, r0qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.io.BufferedInputStream] */
    public static PictureDrawable Z(ByteArrayInputStream byteArrayInputStream) {
        wmo wmoVar = new wmo();
        wmoVar.a = null;
        wmoVar.b = null;
        wmoVar.c = false;
        wmoVar.e = false;
        wmoVar.f = null;
        wmoVar.g = null;
        wmoVar.h = false;
        wmoVar.i = null;
        if (!byteArrayInputStream.markSupported()) {
            byteArrayInputStream = new BufferedInputStream(byteArrayInputStream);
        }
        try {
            byteArrayInputStream.mark(3);
            int read = byteArrayInputStream.read() + (byteArrayInputStream.read() << 8);
            byteArrayInputStream.reset();
            if (read == 35615) {
                byteArrayInputStream = new BufferedInputStream(new GZIPInputStream(byteArrayInputStream));
            }
        } catch (IOException unused) {
        }
        try {
            byteArrayInputStream.mark(4096);
            wmoVar.B(byteArrayInputStream);
            sfm sfmVar = wmoVar.a;
            glo gloVar = (glo) sfmVar.a;
            if (gloVar == null) {
                xq0.x("SVG document is empty");
                return null;
            }
            spi spiVar = gloVar.o;
            if ((spiVar != null ? new RectF(spiVar.b, spiVar.c, spiVar.c(), spiVar.d()) : null) != null) {
                return q0(sfmVar);
            }
            if (((glo) sfmVar.a) == null) {
                xq0.x("SVG document is empty");
                return null;
            }
            float f = sfmVar.t().d;
            if (((glo) sfmVar.a) == null) {
                xq0.x("SVG document is empty");
                return null;
            }
            float f2 = sfmVar.t().e;
            if (f > 0.0f && f2 > 0.0f) {
                glo gloVar2 = (glo) sfmVar.a;
                if (gloVar2 == null) {
                    xq0.x("SVG document is empty");
                    return null;
                }
                gloVar2.o = new spi(0.0f, 0.0f, f, f2);
            }
            return q0(sfmVar);
        } finally {
            try {
                byteArrayInputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x0660  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(ArrayList arrayList, long j, long j2, yci yciVar, yci yciVar2, boolean z, boolean z2, Integer num, boolean z3, boolean z4, Integer num2, boolean z5, boolean z6, Integer num3, Function1 function1, hq5 hq5Var, int i) {
        ArrayList arrayList2;
        int i2;
        int i3;
        boolean z7;
        Object obj;
        Long valueOf;
        Long l;
        boolean z8;
        vci vciVar;
        Function1 function12;
        String str;
        boolean z9;
        String str2;
        String str3;
        yci yciVar3;
        long j3;
        int i4;
        yciVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1086403371);
        if ((i & 6) == 0) {
            arrayList2 = arrayList;
            i2 = i | (oq5Var.h(arrayList2) ? 4 : 2);
        } else {
            arrayList2 = arrayList;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.c(3.0f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.e(j2) ? 2048 : 1024;
        }
        int i5 = i & 24576;
        int i6 = RemoteCameraConfig.Notification.ID;
        if (i5 == 0) {
            i2 |= oq5Var.e(30000L) ? 16384 : 8192;
        }
        int i7 = 196608 & i;
        int i8 = SQLiteDatabase.OPEN_FULLMUTEX;
        if (i7 == 0) {
            i2 |= oq5Var.f(yciVar) ? 131072 : 65536;
        }
        int i9 = i2 | ScreenMirroringConfig.Video.BITRATE_1_5MB;
        if ((i & 12582912) == 0) {
            i9 |= oq5Var.g(z) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((i & 100663296) == 0) {
            i3 = 1572864;
            i9 |= oq5Var.g(z2) ? 67108864 : 33554432;
        } else {
            i3 = 1572864;
        }
        if ((i & 805306368) == 0) {
            i9 |= oq5Var.f(num) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        long j4 = 30000;
        int i10 = i9;
        int i11 = i3 | (oq5Var.g(z3) ? 4 : 2) | (oq5Var.g(z4) ? 32 : 16) | (oq5Var.f(num2) ? 256 : 128) | (oq5Var.g(z5) ? 2048 : 1024);
        if (oq5Var.g(z6)) {
            i6 = 16384;
        }
        int i12 = i11 | i6;
        if (oq5Var.f(num3)) {
            i8 = 131072;
        }
        int i13 = i12 | i8;
        if ((306783379 & i10) == 306783378 && (i13 & 599187) == 599186 && oq5Var.z()) {
            oq5Var.S();
            yciVar3 = yciVar2;
        } else {
            oq5Var.a0(1545126797);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = szf.g0(new cma(0));
                oq5Var.k0(K);
            }
            aqi aqiVar = (aqi) K;
            oq5Var.p(false);
            oq5Var.a0(1545128653);
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                z7 = false;
                obj = szf.g0(new cma(0));
                oq5Var.k0(obj);
            } else {
                z7 = false;
                obj = K2;
            }
            aqi aqiVar2 = (aqi) obj;
            oq5Var.p(z7);
            oq5Var.a0(1545136328);
            Object K3 = oq5Var.K();
            long j5 = -1;
            if (K3 == kjnVar) {
                K3 = new v6k(-1L);
                oq5Var.k0(K3);
            }
            v6k v6kVar = (v6k) K3;
            oq5Var.p(false);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                long j6 = j5;
                if (((jod) obj2).b > j - 30000) {
                    arrayList3.add(obj2);
                }
                j5 = j6;
            }
            long j7 = j5;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList3.size();
            int i14 = 0;
            while (i14 < size) {
                if (i14 == 0) {
                    arrayList4.add(arrayList3.get(i14));
                    i4 = size;
                } else {
                    i4 = size;
                    arrayList4.add(new jod(((jod) arrayList3.get(i14 - 1)).a, ((jod) arrayList3.get(i14)).b));
                    arrayList4.add(arrayList3.get(i14));
                }
                i14++;
                size = i4;
            }
            Iterator it = arrayList3.iterator();
            if (it.hasNext()) {
                valueOf = Long.valueOf(((jod) it.next()).a.longValue());
                while (it.hasNext()) {
                    Long valueOf2 = Long.valueOf(((jod) it.next()).a.longValue());
                    if (valueOf.compareTo(valueOf2) > 0) {
                        valueOf = valueOf2;
                    }
                }
            } else {
                valueOf = null;
            }
            Iterator it2 = arrayList3.iterator();
            if (it2.hasNext()) {
                Long valueOf3 = Long.valueOf(((jod) it2.next()).a.longValue());
                while (it2.hasNext()) {
                    Long valueOf4 = Long.valueOf(((jod) it2.next()).a.longValue());
                    if (valueOf3.compareTo(valueOf4) < 0) {
                        valueOf3 = valueOf4;
                    }
                }
                l = valueOf3;
            } else {
                l = null;
            }
            jod jodVar = (jod) CollectionsKt.Z(arrayList3);
            if (jodVar != null) {
                v6kVar.i(jodVar.a.longValue());
            }
            oq5Var.a0(733328855);
            iz2 iz2Var = b2c.b;
            wg3 e = ug3.e(iz2Var, false, oq5Var, 0);
            oq5Var.a0(-1323940314);
            int i15 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            xp5.T.getClass();
            grb grbVar = wp5.b;
            vci vciVar2 = vci.a;
            wn5 A = ghh.A(vciVar2);
            oq5Var.d0();
            Long l3 = l;
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, e, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l2, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            Long l4 = valueOf;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i15))) {
                ouj.x(i15, oq5Var, i15, kb5Var3);
            }
            A.invoke(new lrq(oq5Var), oq5Var, 0);
            oq5Var.a0(2058660585);
            oq5Var.a0(1028525643);
            Object K4 = oq5Var.K();
            if (K4 == kjnVar) {
                K4 = new cd(aqiVar, aqiVar2, 1);
                oq5Var.k0(K4);
            }
            oq5Var.p(false);
            yci d = androidx.compose.ui.layout.a.d(yciVar, (Function1) K4);
            oq5Var.a0(733328855);
            wg3 e2 = ug3.e(iz2Var, false, oq5Var, 0);
            oq5Var.a0(-1323940314);
            int i16 = oq5Var.P;
            androidx.compose.runtime.internal.a l5 = oq5Var.l();
            wn5 A2 = ghh.A(d);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, e2, kb5Var);
            g0g.U(oq5Var, l5, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i16))) {
                ouj.x(i16, oq5Var, i16, kb5Var3);
            }
            A2.invoke(new lrq(oq5Var), oq5Var, 0);
            oq5Var.a0(2058660585);
            nh0 a = ph0.a();
            int i17 = 1;
            if (arrayList4.isEmpty() || l4 == null || l3 == null) {
                a.f(0.0f, ((cma) aqiVar2.getValue()).a);
                a.e(((cma) aqiVar.getValue()).a, ((cma) aqiVar2.getValue()).a);
                z8 = true;
            } else {
                ArrayList arrayList5 = new ArrayList(v75.o(arrayList4, 10));
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    jod jodVar2 = (jod) it3.next();
                    long longValue = jodVar2.a.longValue();
                    long longValue2 = l4.longValue();
                    long longValue3 = l3.longValue();
                    float f = ((cma) aqiVar2.getValue()).a;
                    if (longValue3 != longValue2) {
                        f *= i17 - ((longValue - longValue2) / (longValue3 - longValue2));
                    }
                    arrayList5.add(new jod(Float.valueOf(f), jodVar2.b));
                    i17 = 1;
                }
                a.f(0.0f, ((jod) CollectionsKt.Q(arrayList5)).a.floatValue());
                Iterator it4 = arrayList5.iterator();
                int i18 = 0;
                while (it4.hasNext()) {
                    Object next = it4.next();
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        u75.n();
                        throw null;
                    }
                    jod jodVar3 = (jod) next;
                    if (i18 == 0) {
                        j3 = j4;
                    } else {
                        j3 = j4;
                        a.e((1 - ((j - jodVar3.b) / j3)) * ((cma) aqiVar.getValue()).a, jodVar3.a.floatValue());
                    }
                    i18 = i19;
                    j4 = j3;
                }
                a.e(((cma) aqiVar.getValue()).a, ((jod) CollectionsKt.Y(arrayList5)).a.floatValue());
                z8 = false;
            }
            yci c = d.c(vciVar2, 1.0f);
            oq5Var.a0(-2059350701);
            boolean h = oq5Var.h(a) | ((i10 & 7168) == 2048) | ((i10 & 896) == 256);
            Object K5 = oq5Var.K();
            if (h || K5 == kjnVar) {
                K5 = new ol6(a, j2, 2);
                oq5Var.k0(K5);
            }
            oq5Var.p(false);
            ksw.j(6, oq5Var, c, (Function1) K5);
            boolean z10 = true;
            k5r.s(oq5Var, false, true, false, false);
            oq5Var.a0(1028621623);
            if (z || z3 || z5) {
                float f2 = 1;
                vciVar = vciVar2;
                yci m = androidx.compose.foundation.layout.a.m(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.a.q(vciVar, f2, f2, 0.0f, 0.0f, 12), d85.b(d85.d, 0.5f, 0.0f, 0.0f, 0.0f, 14), vnj.i), f2);
                oq5Var.a0(-483455358);
                ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
                oq5Var.a0(-1323940314);
                int i20 = oq5Var.P;
                androidx.compose.runtime.internal.a l6 = oq5Var.l();
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                wn5 A3 = ghh.A(m);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar2);
                } else {
                    oq5Var.n0();
                }
                kb5 kb5Var4 = wp5.f;
                g0g.U(oq5Var, a2, kb5Var4);
                kb5 kb5Var5 = wp5.e;
                g0g.U(oq5Var, l6, kb5Var5);
                kb5 kb5Var6 = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i20))) {
                    ouj.x(i20, oq5Var, i20, kb5Var6);
                }
                A3.invoke(new lrq(oq5Var), oq5Var, 0);
                oq5Var.a0(2058660585);
                nx0 g = qx0.g(8);
                oq5Var.a0(693286680);
                nho a3 = lho.a(g, b2c.k, oq5Var, 6);
                oq5Var.a0(-1323940314);
                int i21 = oq5Var.P;
                androidx.compose.runtime.internal.a l7 = oq5Var.l();
                wn5 A4 = ghh.A(vciVar);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar2);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, a3, kb5Var4);
                g0g.U(oq5Var, l7, kb5Var5);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i21))) {
                    ouj.x(i21, oq5Var, i21, kb5Var6);
                }
                A4.invoke(new lrq(oq5Var), oq5Var, 0);
                oq5Var.a0(2058660585);
                long h2 = v6kVar.h();
                if (!z8) {
                    function12 = function1;
                    str = (String) function12.invoke(l4);
                } else if (h2 == j7) {
                    function12 = function1;
                    str = null;
                } else {
                    function12 = function1;
                    str = (String) function12.invoke(Long.valueOf(h2));
                }
                int i22 = i10 >> 9;
                String str4 = str;
                Function1 function13 = function12;
                z9 = false;
                h4a.i(num, str4, null, false, z, z2, oq5Var, ((i10 >> 27) & 14) | (i22 & 57344) | (i22 & 458752), 12);
                long h3 = v6kVar.h();
                if (!z8) {
                    str2 = (String) function13.invoke(l3);
                } else if (h3 == j7) {
                    str3 = null;
                    int i23 = i13 << 12;
                    h4a.i(num2, str3, null, false, z3, z4, oq5Var, ((i13 >> 6) & 14) | (i23 & 57344) | (i23 & 458752), 12);
                    k5r.s(oq5Var, false, true, false, false);
                    long h4 = v6kVar.h();
                    int i24 = i13 << 3;
                    h4a.i(num3, h4 != j7 ? (String) function13.invoke(Long.valueOf(h4)) : null, null, false, z5, z6, oq5Var, ((i13 >> 15) & 14) | (57344 & i24) | (i24 & 458752), 12);
                    z10 = true;
                    k5r.s(oq5Var, false, true, false, false);
                } else {
                    str2 = (String) function13.invoke(Long.valueOf(h3));
                }
                str3 = str2;
                int i232 = i13 << 12;
                h4a.i(num2, str3, null, false, z3, z4, oq5Var, ((i13 >> 6) & 14) | (i232 & 57344) | (i232 & 458752), 12);
                k5r.s(oq5Var, false, true, false, false);
                long h42 = v6kVar.h();
                int i242 = i13 << 3;
                h4a.i(num3, h42 != j7 ? (String) function13.invoke(Long.valueOf(h42)) : null, null, false, z5, z6, oq5Var, ((i13 >> 15) & 14) | (57344 & i242) | (i242 & 458752), 12);
                z10 = true;
                k5r.s(oq5Var, false, true, false, false);
            } else {
                vciVar = vciVar2;
                z9 = false;
            }
            k5r.s(oq5Var, z9, z9, z10, z9);
            oq5Var.p(z9);
            yciVar3 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x5g(arrayList, j, j2, yciVar, yciVar3, z, z2, num, z3, z4, num2, z5, z6, num3, function1, i);
        }
    }

    public static final kiw a0(mwk mwkVar) {
        mwkVar.getClass();
        return (kiw) dag.p(mwkVar, new quk());
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(k4k k4kVar, lvf lvfVar, boolean z, dib dibVar, v0i v0iVar, tmb tmbVar, hq5 hq5Var, int i) {
        kjn kjnVar;
        int i2;
        kjn kjnVar2;
        boolean z2;
        kjn kjnVar3;
        kjn kjnVar4;
        boolean z3;
        Object K;
        v0i v0iVar2;
        k4kVar.getClass();
        lvfVar.getClass();
        dibVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1219330531);
        int i3 = i | (oq5Var.f(k4kVar) ? 4 : 2) | (oq5Var.h(lvfVar) ? 32 : 16) | (oq5Var.g(z) ? 256 : 128) | (oq5Var.h(dibVar) ? 2048 : 1024) | (oq5Var.f(v0iVar) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.h(tmbVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        if (oq5Var.P(i3 & 1, (74899 & i3) != 74898)) {
            String M = rvf.M(R.string.metatag_all_albums_header, oq5Var);
            int i4 = i3 & 57344;
            boolean z4 = i4 == 16384;
            Object K2 = oq5Var.K();
            kjn kjnVar5 = gq5.a;
            if (z4 || K2 == kjnVar5) {
                kjnVar = kjnVar5;
                i2 = i4;
                k5h k5hVar = new k5h(0, v0iVar, v0i.class, "onBackClicked", "onBackClicked()V", 0, 3);
                oq5Var.k0(k5hVar);
                K2 = k5hVar;
            } else {
                i2 = i4;
                kjnVar = kjnVar5;
            }
            Function0 function0 = (Function0) ((h9f) K2);
            boolean z5 = i2 == 16384;
            Object K3 = oq5Var.K();
            if (!z5) {
                kjn kjnVar6 = kjnVar;
                if (K3 == kjnVar6) {
                    kjnVar = kjnVar6;
                } else {
                    kjnVar2 = kjnVar6;
                    Function0 function02 = (Function0) ((h9f) K3);
                    z2 = i2 != 16384;
                    Object K4 = oq5Var.K();
                    if (z2) {
                        kjn kjnVar7 = kjnVar2;
                        if (K4 == kjnVar7) {
                            kjnVar3 = kjnVar7;
                        } else {
                            kjnVar4 = kjnVar7;
                            Function0 function03 = (Function0) ((h9f) K4);
                            z3 = i2 == 16384;
                            K = oq5Var.K();
                            if (!z3 || K == kjnVar4) {
                                K = new k5h(0, v0iVar, v0i.class, "onRetry", "onRetry()V", 0, 6);
                                v0iVar2 = v0iVar;
                                oq5Var.k0(K);
                            } else {
                                v0iVar2 = v0iVar;
                            }
                            Function0 function04 = (Function0) ((h9f) K);
                            vm C = ghh.C(zs4.g(oq5Var), ogp.A(oq5Var));
                            wn5 C2 = ild.C(-1879746308, new t31(12, v0iVar2), oq5Var);
                            int i5 = lvf.f;
                            int i6 = i3 << 3;
                            ezf.j(k4kVar, lvfVar, M, z, dibVar, function0, function02, function03, function04, tmbVar, C, C2, oq5Var, (i3 & 14) | 64 | (i3 & 112) | (i6 & 7168) | (i6 & 57344) | 1073741824 | ((i3 << 12) & 1879048192), 48);
                        }
                    } else {
                        kjnVar3 = kjnVar2;
                    }
                    kjnVar4 = kjnVar3;
                    k5h k5hVar2 = new k5h(0, v0iVar, v0i.class, "onRefresh", "onRefresh()V", 0, 5);
                    oq5Var.k0(k5hVar2);
                    K4 = k5hVar2;
                    Function0 function032 = (Function0) ((h9f) K4);
                    if (i2 == 16384) {
                    }
                    K = oq5Var.K();
                    if (z3) {
                    }
                    K = new k5h(0, v0iVar, v0i.class, "onRetry", "onRetry()V", 0, 6);
                    v0iVar2 = v0iVar;
                    oq5Var.k0(K);
                    Function0 function042 = (Function0) ((h9f) K);
                    vm C3 = ghh.C(zs4.g(oq5Var), ogp.A(oq5Var));
                    wn5 C22 = ild.C(-1879746308, new t31(12, v0iVar2), oq5Var);
                    int i52 = lvf.f;
                    int i62 = i3 << 3;
                    ezf.j(k4kVar, lvfVar, M, z, dibVar, function0, function02, function032, function042, tmbVar, C3, C22, oq5Var, (i3 & 14) | 64 | (i3 & 112) | (i62 & 7168) | (i62 & 57344) | 1073741824 | ((i3 << 12) & 1879048192), 48);
                }
            }
            kjnVar2 = kjnVar;
            k5h k5hVar3 = new k5h(0, v0iVar, v0i.class, "onSortClick", "onSortClick()V", 0, 4);
            oq5Var.k0(k5hVar3);
            K3 = k5hVar3;
            Function0 function022 = (Function0) ((h9f) K3);
            if (i2 != 16384) {
            }
            Object K42 = oq5Var.K();
            if (z2) {
            }
            kjnVar4 = kjnVar3;
            k5h k5hVar22 = new k5h(0, v0iVar, v0i.class, "onRefresh", "onRefresh()V", 0, 5);
            oq5Var.k0(k5hVar22);
            K42 = k5hVar22;
            Function0 function0322 = (Function0) ((h9f) K42);
            if (i2 == 16384) {
            }
            K = oq5Var.K();
            if (z3) {
            }
            K = new k5h(0, v0iVar, v0i.class, "onRetry", "onRetry()V", 0, 6);
            v0iVar2 = v0iVar;
            oq5Var.k0(K);
            Function0 function0422 = (Function0) ((h9f) K);
            vm C32 = ghh.C(zs4.g(oq5Var), ogp.A(oq5Var));
            wn5 C222 = ild.C(-1879746308, new t31(12, v0iVar2), oq5Var);
            int i522 = lvf.f;
            int i622 = i3 << 3;
            ezf.j(k4kVar, lvfVar, M, z, dibVar, function0, function022, function0322, function0422, tmbVar, C32, C222, oq5Var, (i3 & 14) | 64 | (i3 & 112) | (i622 & 7168) | (i622 & 57344) | 1073741824 | ((i3 << 12) & 1879048192), 48);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k5b(i, 2, k4kVar, lvfVar, dibVar, v0iVar, tmbVar, z);
        }
    }

    public static final void c(bmi bmiVar, fvf fvfVar, xli xliVar, Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        o0k o0kVar;
        bmi bmiVar2;
        xli xliVar2;
        oq5 oq5Var;
        fvf fvfVar2 = fvfVar;
        bmiVar.getClass();
        fvfVar2.getClass();
        xliVar.getClass();
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(2109357338);
        int i2 = i | (oq5Var2.f(bmiVar) ? 4 : 2) | (oq5Var2.f(fvfVar2) ? 32 : 16) | (oq5Var2.h(xliVar) ? 256 : 128) | (oq5Var2.h(function0) ? 2048 : 1024);
        if ((i2 & 9363) == 9362 && oq5Var2.z()) {
            oq5Var2.S();
            bmiVar2 = bmiVar;
            xliVar2 = xliVar;
            oq5Var = oq5Var2;
        } else {
            lvf a = ovf.a(bmiVar.c, oq5Var2);
            boolean f = oq5Var2.f(bmiVar.b);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (f || K == kjnVar) {
                K = szf.U(new y6g(12, bmiVar, fvfVar2));
                oq5Var2.k0(K);
            }
            sdr sdrVar = (sdr) K;
            Object K2 = oq5Var2.K();
            if (K2 == kjnVar) {
                K2 = tlm.f(gld.R(g.a, oq5Var2), oq5Var2);
            }
            mm6 mm6Var = ((fs5) K2).a;
            kfh d = ug3.d(b2c.b, false);
            int i3 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, d, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var2, i3, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            ynn i4 = irv.i(oq5Var2);
            boolean L = c3x.L(oq5Var2);
            o0k o0kVar2 = (o0k) function0.invoke();
            vm C = ghh.C(o0kVar2, androidx.compose.foundation.layout.a.c(0.0f, s2s.a + 16, 0.0f, 0.0f, 13));
            if (L) {
                float f2 = 0;
                o0kVar = new q0k(f2, f2, f2, f2);
            } else {
                o0kVar = C;
            }
            vci vciVar = vci.a;
            yci a2 = a.a(L ? androidx.compose.foundation.layout.a.l(vciVar, C) : vciVar, "music_history_lazy_column");
            boolean h = oq5Var2.h(a) | ((i2 & 14) == 4) | oq5Var2.f(i4) | oq5Var2.h(xliVar);
            Object K3 = oq5Var2.K();
            if (h || K3 == kjnVar) {
                i50 i50Var = new i50(a, bmiVar, i4, xliVar, 11);
                oq5Var2.k0(i50Var);
                K3 = i50Var;
            }
            int i5 = i2 & 112;
            bmiVar2 = bmiVar;
            xliVar2 = xliVar;
            weo.g(a2, fvfVar, o0kVar, null, null, null, false, (Function1) K3, oq5Var2, i5, 248);
            fvfVar2 = fvfVar;
            oq5Var = oq5Var2;
            List list = bmiVar2.b;
            v0s v0sVar = (v0s) sdrVar.getValue();
            boolean h2 = oq5Var.h(xliVar2) | oq5Var.h(mm6Var) | (i5 == 32);
            Object K4 = oq5Var.K();
            if (h2 || K4 == kjnVar) {
                K4 = new p3e(8, xliVar2, mm6Var, fvfVar2);
                oq5Var.k0(K4);
            }
            Function1 function1 = (Function1) K4;
            yci a3 = a.a(androidx.compose.foundation.layout.a.l(vciVar, o0kVar2), "music_history_tabs");
            Object K5 = oq5Var.K();
            if (K5 == kjnVar) {
                K5 = new p1i(22);
                oq5Var.k0(K5);
            }
            s2s.c(list, v0sVar, function1, nfp.b(a3, false, (Function1) K5), oq5Var, 0);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pli(bmiVar2, fvfVar2, xliVar2, function0, yciVar, i, 2);
        }
    }

    public static final void d(ebj ebjVar, List list, fvf fvfVar, vm vmVar, q0k q0kVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        list.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1202664170);
        int i2 = i | (oq5Var2.h(ebjVar) ? 4 : 2) | (oq5Var2.f(list) ? 32 : 16) | (oq5Var2.f(fvfVar) ? 256 : 128) | (oq5Var2.f(vmVar) ? 2048 : 1024) | (oq5Var2.f(q0kVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        if (oq5Var2.P(i2 & 1, (i2 & 9363) != 9362)) {
            boolean booleanValue = ((Boolean) szf.Q(ebjVar.i, oq5Var2).getValue()).booleanValue();
            boolean h = oq5Var2.h(ebjVar);
            Object K = oq5Var2.K();
            if (h || K == gq5.a) {
                m9j m9jVar = new m9j(0, ebjVar, ebj.class, "onRefresh", "onRefresh()V", 0, 6);
                oq5Var2.k0(m9jVar);
                K = m9jVar;
            }
            oq5Var = oq5Var2;
            bfg.f(booleanValue, (Function0) ((h9f) K), vmVar, null, false, ild.C(1878888298, new gbj(list, fvfVar, vmVar, q0kVar, ebjVar, 0), oq5Var2), oq5Var, ((i2 >> 3) & 896) | 196608, 24);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gbj(ebjVar, list, fvfVar, vmVar, q0kVar, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean d0(View view) {
        if (view instanceof p7t) {
            if (((p7t) view).e()) {
                return true;
            }
            if (view.getParent() instanceof ViewGroup) {
                Object parent = view.getParent();
                if ((parent instanceof p7t) && d0((View) parent)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void e(float f, boolean z, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1554462386);
        int i2 = (oq5Var.c(f) ? 4 : 2) | i | (oq5Var.g(z) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            ivf.k((i2 >> 3) & 14, 0, oq5Var, a.a(d.d(xp3.u(d.e(androidx.compose.foundation.layout.a.o(yciVar, 16, 0.0f, 2), f), o5g.G(oq5Var)), 1.0f), "pay_offers_block_placeholder"), z);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new om2(f, z, yciVar, i, 3);
        }
    }

    public static boolean e0(byte b) {
        return b > -65;
    }

    public static final void f(pck pckVar, kck kckVar, float f, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var;
        yci yciVar2;
        oq5 oq5Var2;
        vci vciVar;
        int i3;
        int i4;
        boolean z;
        kckVar.getClass();
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(-1457245791);
        if ((i & 6) == 0) {
            i2 = (oq5Var3.f(pckVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? oq5Var3.f(kckVar) : oq5Var3.h(kckVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var3.c(f) ? 256 : 128;
        }
        int i5 = i2 | 3072;
        if (oq5Var3.P(i5 & 1, (i5 & 1171) != 1170)) {
            ynn i6 = irv.i(oq5Var3);
            iz2 iz2Var = b2c.f;
            vci vciVar2 = vci.a;
            yci o = androidx.compose.foundation.layout.a.o(d.d(d.e(vciVar2, f), 1.0f), 16, 0.0f, 2);
            int i7 = i5 & 112;
            int i8 = i5 & 14;
            boolean z2 = (i7 == 32 || ((i5 & 64) != 0 && oq5Var3.h(kckVar))) | (i8 == 4);
            Object K = oq5Var3.K();
            kjn kjnVar = gq5.a;
            if (z2 || K == kjnVar) {
                K = new wcj(7, kckVar, pckVar);
                oq5Var3.k0(K);
            }
            yci a = a.a(com.yandex.music.core.ui.compose.a.b(o, i6, 0L, 0.0f, null, (Function2) K, 14), "pay_offers_block_success");
            kfh d = ug3.d(iz2Var, false);
            int i9 = oq5Var3.P;
            androidx.compose.runtime.internal.a l = oq5Var3.l();
            yci H = vnj.H(oq5Var3, a);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var3.d0();
            if (oq5Var3.O) {
                oq5Var3.k(grbVar);
            } else {
                oq5Var3.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var3, d, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var3, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i9))) {
                ouj.x(i9, oq5Var3, i9, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var3, H, kb5Var4);
            nho a2 = lho.a(qx0.a, b2c.l, oq5Var3, 48);
            int i10 = oq5Var3.P;
            androidx.compose.runtime.internal.a l2 = oq5Var3.l();
            yci H2 = vnj.H(oq5Var3, vciVar2);
            oq5Var3.d0();
            if (oq5Var3.O) {
                oq5Var3.k(grbVar);
            } else {
                oq5Var3.n0();
            }
            g0g.U(oq5Var3, a2, kb5Var);
            g0g.U(oq5Var3, l2, kb5Var2);
            if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i10))) {
                ouj.x(i10, oq5Var3, i10, kb5Var3);
            }
            g0g.U(oq5Var3, H2, kb5Var4);
            if (pckVar.d != null) {
                oq5Var3.Z(1319462689);
                oq5Var2 = oq5Var3;
                vciVar = vciVar2;
                i3 = i7;
                i4 = i8;
                z = false;
                ltg.e(qo6.m, pckVar.d, a.a(d.m(vciVar2, f), "pay_offers_block_image"), hd6.b, null, yd5.c, null, null, oq5Var2, 199686, 208);
                vz1.B(vciVar, 12, oq5Var2, false);
            } else {
                oq5Var2 = oq5Var3;
                vciVar = vciVar2;
                i3 = i7;
                i4 = i8;
                z = false;
                oq5Var2.Z(1315069803);
                oq5Var2.p(false);
            }
            String str = pckVar.a;
            ges i11 = nu0.i();
            long j = ((dq0) oq5Var2.j(eq0.a)).b.a;
            if (!(((double) 1.0f) > 0.0d ? true : z)) {
                qme.a("invalid weight; must be greater than zero");
            }
            oq5 oq5Var4 = oq5Var2;
            xcs.b(str, new LayoutWeightElement(true, 1.0f), j, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, i11, oq5Var4, 0, 3120, 55288);
            oq5Var = oq5Var4;
            u1g.l(oq5Var, d.r(vciVar, 12));
            String str2 = pckVar.b;
            boolean z3 = pckVar.c;
            boolean z4 = (i3 == 32 || ((i5 & 64) != 0 && oq5Var.h(kckVar))) ? true : z;
            if (i4 == 4) {
                z = true;
            }
            boolean z5 = z | z4;
            Object K2 = oq5Var.K();
            if (z5 || K2 == kjnVar) {
                K2 = new y6g(28, kckVar, pckVar);
                oq5Var.k0(K2);
            }
            L(str2, z3, (Function0) K2, null, oq5Var, 0);
            oq5Var.p(true);
            oq5Var.p(true);
            yciVar2 = vciVar;
        } else {
            oq5Var = oq5Var3;
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new og6(f, i, 3, pckVar, kckVar, yciVar2);
        }
    }

    public static final String f0(long j, boolean z) {
        if (z) {
            return String.valueOf(j);
        }
        return j + "ms";
    }

    public static final void g(kck kckVar, yci yciVar, hq5 hq5Var, int i) {
        kck kckVar2;
        kckVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(256287163);
        int i2 = (oq5Var.f(kckVar) ? 4 : 2) | i | 48;
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            qck qckVar = (qck) szf.Q(kckVar.c, oq5Var).getValue();
            N(kckVar.d, oq5Var, 0);
            oq5Var.Z(1478834946);
            jx7 jx7Var = (jx7) oq5Var.j(es5.h);
            long j = nu0.i().b.c;
            float i0 = jx7Var.i0();
            v7g.p(j);
            long D = v7g.D(kes.c(j) * i0, j & 1095216660480L);
            v7g.p(D);
            float max = Math.max(jx7Var.p(v7g.D(kes.c(D) * 2, 1095216660480L & D)), 44);
            oq5Var.p(false);
            vci vciVar = vci.a;
            yci a = a.a(vciVar, "pay_offers_block");
            kfh d = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            if (qckVar instanceof ock) {
                oq5Var.Z(30463885);
                boolean z = ((ock) qckVar).a;
                Object K = oq5Var.K();
                if (K == gq5.a) {
                    K = new hpj(22);
                    oq5Var.k0(K);
                }
                e(max, z, nfp.a(vciVar, (Function1) K), oq5Var, 0);
                oq5Var.p(false);
                kckVar2 = kckVar;
            } else {
                if (!(qckVar instanceof pck)) {
                    throw vz1.i(oq5Var, 30462013, false);
                }
                oq5Var.Z(944611356);
                kckVar2 = kckVar;
                f((pck) qckVar, kckVar2, max, null, oq5Var, (i2 << 3) & 112);
                oq5Var.p(false);
            }
            oq5Var.p(true);
            yciVar = vciVar;
        } else {
            kckVar2 = kckVar;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wcj(kckVar2, yciVar, i, 6);
        }
    }

    public static void g0(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!(th instanceof ypj) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof ar5)) {
            th = new hit("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | " + th, th);
        }
        th.printStackTrace();
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    public static final void h(final boolean z, final Function0 function0, final Function0 function02, boolean z2, boolean z3, hq5 hq5Var, final int i, final int i2) {
        boolean z4;
        int i3;
        boolean z5;
        int i4;
        final boolean z6;
        final boolean z7;
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1990593226);
        int i5 = 2;
        int i6 = i | (oq5Var.g(z) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.h(function02) ? 256 : 128);
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 = i6 | 3072;
            z4 = z2;
        } else {
            z4 = z2;
            i3 = i6 | (oq5Var.g(z4) ? 2048 : 1024);
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i4 = i3 | 24576;
            z5 = z3;
        } else {
            z5 = z3;
            i4 = i3 | (oq5Var.g(z5) ? 16384 : RemoteCameraConfig.Notification.ID);
        }
        if ((i4 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            z6 = z4;
            z7 = z5;
        } else {
            final boolean z8 = i7 != 0 ? false : z4;
            final boolean z9 = i8 != 0 ? true : z5;
            String M = rvf.M(z ? R.string.pause : R.string.listen, oq5Var);
            boolean f = oq5Var.f(M) | ((57344 & i4) == 16384);
            Object K = oq5Var.K();
            if (f || K == gq5.a) {
                K = new ag3(M, z9, i5);
                oq5Var.k0(K);
            }
            g0g.m(ild.C(1711740830, new Function2() { // from class: p4l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    hq5 hq5Var2 = (hq5) obj;
                    if ((((Integer) obj2).intValue() & 3) == 2) {
                        oq5 oq5Var2 = (oq5) hq5Var2;
                        if (oq5Var2.z()) {
                            oq5Var2.S();
                            return Unit.a;
                        }
                    }
                    a0g.n(Function0.this, a.a(vci.a, "playback_button"), z8, z9, false, 0.0f, ild.C(805767350, new xu0(17, z), hq5Var2), hq5Var2, 1572912, 48);
                    return Unit.a;
                }
            }, oq5Var), M, nfp.b(vci.a, true, (Function1) K), function0, 0L, 0, oq5Var, ((i4 << 6) & 7168) | 6, 48);
            z6 = z8;
            z7 = z9;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2(z, function0, function02, z6, z7, i, i2) { // from class: q4l
                public final /* synthetic */ boolean a;
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ int f;

                {
                    this.f = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(1);
                    y5g.h(this.a, this.b, this.c, this.d, this.e, (hq5) obj, R, this.f);
                    return Unit.a;
                }
            };
        }
    }

    public static final owu h0(g6p g6pVar, s9p s9pVar, int i, cvo cvoVar, hq5 hq5Var, int i2) {
        g6pVar.getClass();
        cvoVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        c3r c3rVar = (c3r) oq5Var.j(es5.p);
        StationId e = StationId.e(s9pVar);
        ArrayList R = o8g.R(s9pVar);
        kxi d = g6pVar.d();
        apo apoVar = new apo(2, g6pVar, s9pVar);
        k6l h = g6pVar.h();
        uwu g = g6pVar.g();
        qwu y = g6pVar.y();
        boolean h2 = ((((i2 & 896) ^ 384) > 256 && oq5Var.d(i)) || (i2 & 384) == 256) | oq5Var.h(cvoVar) | oq5Var.h(e);
        Object K = oq5Var.K();
        Object obj = gq5.a;
        if (h2 || K == obj) {
            K = new u4p(cvoVar, i, e, 1);
            oq5Var.k0(K);
        }
        Function0 function0 = (Function0) K;
        boolean f = oq5Var.f(c3rVar);
        Object K2 = oq5Var.K();
        if (f || K2 == obj) {
            K2 = new h0f(c3rVar, 4);
            oq5Var.k0(K2);
        }
        return wyf.Y(e, R, d, function0, h, g, y, apoVar, null, (Function1) K2, oq5Var, 6, 0, 256);
    }

    public static final void i(oxn oxnVar, j1b j1bVar, lf5 lf5Var, a3m a3mVar, gs4 gs4Var, Function0 function0, int i, hq5 hq5Var, int i2) {
        int i3;
        int i4;
        Object obj;
        oq5 oq5Var;
        oxnVar.getClass();
        lf5Var.getClass();
        a3mVar.getClass();
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1282814176);
        int i5 = (i2 & 6) == 0 ? (oq5Var2.f(oxnVar) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i5 |= (i2 & 64) == 0 ? oq5Var2.f(j1bVar) : oq5Var2.h(j1bVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= oq5Var2.h(lf5Var) ? 256 : 128;
        }
        if ((i2 & 24576) == 0) {
            i5 |= oq5Var2.f(gs4Var) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i5 |= oq5Var2.h(function0) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i2) == 0) {
            i3 = i;
            i5 |= oq5Var2.d(i3) ? 1048576 : 524288;
        } else {
            i3 = i;
        }
        if ((598163 & i5) == 598162 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            boolean z = (57344 & i5) == 16384;
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (z || K == kjnVar) {
                List<pfi> h = u75.h((pfi) gs4Var.a, (pfi) gs4Var.b, (pfi) gs4Var.c, (pfi) gs4Var.d, (pfi) gs4Var.e);
                ArrayList arrayList = new ArrayList(v75.o(h, 10));
                for (pfi pfiVar : h) {
                    arrayList.add(new nw6(pfiVar.a, new z3(5, pfiVar)));
                    i5 = i5;
                }
                i4 = i5;
                oq5Var2.k0(arrayList);
                obj = arrayList;
            } else {
                i4 = i5;
                obj = K;
            }
            List list = (List) obj;
            boolean z2 = (i4 & 458752) == 131072;
            Object K2 = oq5Var2.K();
            if (z2 || K2 == kjnVar) {
                K2 = new g1j(8, function0);
                oq5Var2.k0(K2);
            }
            oq5Var = oq5Var2;
            com.yandex.music.design.components.removable.a.a(com.yandex.music.design.components.removable.a.c((Function0) K2, oq5Var2), null, false, kg5.r(R.color.text_primary_night, oq5Var2), ild.C(1637733079, new ba3(i3, 1, j1bVar, list, lf5Var, function0, oxnVar), oq5Var2), oq5Var, 24576, 6);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new fd1(oxnVar, j1bVar, lf5Var, a3mVar, gs4Var, function0, i, i2);
        }
    }

    public static final t5a i0(m6a m6aVar) {
        if (m6aVar instanceof i6a) {
            return ((i6a) m6aVar).b;
        }
        if (m6aVar instanceof j6a) {
            return ((j6a) m6aVar).c;
        }
        if (m6aVar instanceof k6a) {
            return ((k6a) m6aVar).c;
        }
        if (m6aVar instanceof l6a) {
            return ((l6a) m6aVar).c;
        }
        if (m6aVar instanceof h6a) {
            return ((h6a) m6aVar).c;
        }
        b6e.s();
        return null;
    }

    public static final void j(pjc pjcVar, Function0 function0, hq5 hq5Var, int i) {
        oq5 oq5Var;
        boolean z;
        pjcVar.getClass();
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1248128628);
        int i2 = (oq5Var2.h(pjcVar) ? 4 : 2) | i | (oq5Var2.h(function0) ? 32 : 16);
        if (oq5Var2.P(i2 & 1, (i2 & 19) != 18)) {
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = szf.g0(Boolean.FALSE);
                oq5Var2.k0(K);
            }
            aqi aqiVar = (aqi) K;
            Object K2 = oq5Var2.K();
            if (K2 == kjnVar) {
                K2 = szf.g0(0);
                oq5Var2.k0(K2);
            }
            aqi aqiVar2 = (aqi) K2;
            Unit unit = Unit.a;
            boolean h = oq5Var2.h(pjcVar);
            Object K3 = oq5Var2.K();
            if (h || K3 == kjnVar) {
                kun kunVar = new kun(pjcVar, aqiVar2, aqiVar, null, 1);
                oq5Var2.k0(kunVar);
                K3 = kunVar;
            }
            gld.w(oq5Var2, unit, (Function2) K3);
            if (((Boolean) aqiVar.getValue()).booleanValue()) {
                oq5Var2.Z(1468401336);
                yci a = a.a(vci.a, "remove_tracks_dialog");
                Object K4 = oq5Var2.K();
                if (K4 == kjnVar) {
                    K4 = new jc(aqiVar, 22);
                    oq5Var2.k0(K4);
                }
                z = false;
                up6.b((Function0) K4, ild.C(-2014552249, new hon(3, function0, aqiVar), oq5Var2), a, ild.C(-120218363, new o7n(aqiVar, 1), oq5Var2), ild.C(1774115523, new o7n(aqiVar2, 2), oq5Var2), null, 0L, 0L, null, oq5Var2, 200118, 976);
                oq5Var = oq5Var2;
            } else {
                oq5Var = oq5Var2;
                z = false;
                oq5Var.Z(1467352110);
            }
            oq5Var.p(z);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hon(pjcVar, function0, i, 4);
        }
    }

    public static final void k(y7p y7pVar, g6p g6pVar, int i, yci yciVar, hq5 hq5Var, int i2, int i3) {
        int i4;
        g6p g6pVar2;
        int i5;
        yci yciVar2;
        y7pVar.getClass();
        g6pVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(293867941);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.f(y7pVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? oq5Var.f(g6pVar) : oq5Var.h(g6pVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= oq5Var.d(i) ? 256 : 128;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i4 & 1, (i4 & 1171) != 1170)) {
            if (i6 != 0) {
                yciVar = vci.a;
            }
            yci yciVar3 = yciVar;
            if (y7pVar instanceof v7p) {
                oq5Var.Z(-1060744199);
                g6pVar2 = g6pVar;
                i5 = i;
                J((v7p) y7pVar, g6pVar2, i5, yciVar3, oq5Var, i4 & 8190);
                oq5Var.p(false);
            } else {
                g6pVar2 = g6pVar;
                i5 = i;
                if (y7pVar instanceof l7p) {
                    oq5Var.Z(-1060741381);
                    D((l7p) y7pVar, g6pVar2, i5, yciVar3, oq5Var, i4 & 8190);
                    oq5Var.p(false);
                } else if (y7pVar instanceof t6p) {
                    oq5Var.Z(-1060738534);
                    m((t6p) y7pVar, g6pVar2, i5, yciVar3, oq5Var, i4 & 8190);
                    oq5Var.p(false);
                } else if (y7pVar instanceof s6p) {
                    oq5Var.Z(-1060735751);
                    l((s6p) y7pVar, g6pVar2, i5, yciVar3, oq5Var, i4 & 8190);
                    oq5Var.p(false);
                } else if (y7pVar instanceof o7p) {
                    oq5Var.Z(-1060732900);
                    G((o7p) y7pVar, g6pVar2, i5, yciVar3, oq5Var, i4 & 8190);
                    oq5Var.p(false);
                } else if (y7pVar instanceof n7p) {
                    oq5Var.Z(-1060729956);
                    F((n7p) y7pVar, g6pVar2, i5, yciVar3, oq5Var, i4 & 8190);
                    oq5Var.p(false);
                } else if (y7pVar instanceof w7p) {
                    oq5Var.Z(-1060726984);
                    B((w7p) y7pVar, g6pVar2, i5, yciVar3, oq5Var, i4 & 8190);
                    oq5Var.p(false);
                } else if (y7pVar instanceof k7p) {
                    oq5Var.Z(-1060724197);
                    C((k7p) y7pVar, g6pVar2, i5, yciVar3, oq5Var, i4 & 8190);
                    oq5Var.p(false);
                } else if (y7pVar instanceof m7p) {
                    oq5Var.Z(-1060721373);
                    E(((m7p) y7pVar).a, 0, oq5Var);
                    oq5Var.p(false);
                } else if (y7pVar instanceof x7p) {
                    oq5Var.Z(-1060719144);
                    K((x7p) y7pVar, g6pVar2, i5, yciVar3, oq5Var, i4 & 8190);
                    oq5Var.p(false);
                } else if (y7pVar instanceof f7p) {
                    oq5Var.Z(-1060716061);
                    y((f7p) y7pVar, g6pVar2, i5, yciVar3, oq5Var, i4 & 8190);
                    oq5Var.p(false);
                } else if (y7pVar instanceof v6p) {
                    oq5Var.Z(-1060712604);
                    o((v6p) y7pVar, g6pVar2, i5, yciVar3, oq5Var, i4 & 8190);
                    oq5Var.p(false);
                } else if (y7pVar instanceof u6p) {
                    oq5Var.Z(-1060709149);
                    n((u6p) y7pVar, g6pVar2, i5, yciVar3, oq5Var, i4 & 8190);
                    oq5Var.p(false);
                } else if (y7pVar instanceof b7p) {
                    oq5Var.Z(-1060705626);
                    u((b7p) y7pVar, g6pVar2, i5, yciVar3, oq5Var, i4 & 8190);
                    oq5Var.p(false);
                } else if (y7pVar instanceof y6p) {
                    oq5Var.Z(-1060702043);
                    r((y6p) y7pVar, g6pVar2, i5, yciVar3, oq5Var, i4 & 8190);
                    oq5Var.p(false);
                } else if (y7pVar instanceof i7p) {
                    oq5Var.Z(-1060698590);
                    A((i7p) y7pVar, g6pVar2, i5, yciVar3, oq5Var, i4 & 8190);
                    oq5Var.p(false);
                } else if (y7pVar instanceof g7p) {
                    oq5Var.Z(-1060695094);
                    wyf.l((g7p) y7pVar, g6pVar2, i5, yciVar3, oq5Var, i4 & 8190);
                    oq5Var.p(false);
                } else if (y7pVar instanceof e7p) {
                    oq5Var.Z(-1060691189);
                    x((e7p) y7pVar, g6pVar2, i5, yciVar3, oq5Var, i4 & 8190);
                    oq5Var.p(false);
                } else if (y7pVar instanceof c7p) {
                    oq5Var.Z(-1060687451);
                    v((c7p) y7pVar, g6pVar2, i5, yciVar3, oq5Var, i4 & 8190);
                    oq5Var.p(false);
                } else if (y7pVar instanceof d7p) {
                    oq5Var.Z(-1060683668);
                    w((d7p) y7pVar, g6pVar2, i5, yciVar3, oq5Var, i4 & 8190);
                    oq5Var.p(false);
                } else if (y7pVar instanceof x6p) {
                    oq5Var.Z(-1060679767);
                    q((x6p) y7pVar, g6pVar2, i5, yciVar3, oq5Var, i4 & 8190);
                    oq5Var.p(false);
                } else if (y7pVar instanceof u7p) {
                    oq5Var.Z(-1060676510);
                    I(((u7p) y7pVar).a, oq5Var, 0);
                    oq5Var.p(false);
                } else if (y7pVar instanceof z6p) {
                    oq5Var.Z(-1060674010);
                    s((z6p) y7pVar, g6pVar2, i5, yciVar3, oq5Var, i4 & 8190);
                    oq5Var.p(false);
                } else if (y7pVar instanceof w6p) {
                    oq5Var.Z(-1060670196);
                    p((w6p) y7pVar, g6pVar2, i5, yciVar3, oq5Var, i4 & 8190);
                    oq5Var.p(false);
                } else if (y7pVar instanceof a7p) {
                    oq5Var.Z(-1060666394);
                    t((a7p) y7pVar, i5, g6pVar2, yciVar3, oq5Var, (i4 & 14) | ((i4 >> 3) & 112) | ((i4 << 3) & 896) | (i4 & 7168));
                    i5 = i5;
                    g6pVar2 = g6pVar2;
                    oq5Var.p(false);
                } else if (y7pVar instanceof h7p) {
                    oq5Var.Z(-1060662745);
                    z((h7p) y7pVar, g6pVar2, i5, yciVar3, oq5Var, i4 & 8190);
                    oq5Var.p(false);
                } else {
                    boolean z = y7pVar instanceof p7p;
                    if (z || (y7pVar instanceof s7p)) {
                        oq5Var.Z(-1060657756);
                        g6pVar2 = g6pVar2;
                        i5 = i5;
                        H(z ? (p7p) y7pVar : null, g6pVar2, i5, yciVar3, oq5Var, i4 & 8176);
                        oq5Var.p(false);
                    } else {
                        if (y7pVar instanceof r7p) {
                            oq5Var.Z(-1060653392);
                            q7g.j(0, (i4 >> 9) & 14, 6, oq5Var, yciVar3, false);
                            oq5Var = oq5Var;
                            yciVar3 = yciVar3;
                            oq5Var.p(false);
                        } else {
                            if (!(y7pVar instanceof q7p)) {
                                throw vz1.i(oq5Var, -1060742726, false);
                            }
                            oq5Var.Z(-1060650507);
                            fxf.j(0, (i4 >> 9) & 14, oq5Var, yciVar3, false);
                            oq5Var.p(false);
                        }
                        g6pVar2 = g6pVar2;
                        i5 = i5;
                    }
                }
            }
            yciVar2 = yciVar3;
        } else {
            g6pVar2 = g6pVar;
            i5 = i;
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vpd(y7pVar, g6pVar2, i5, yciVar2, i2, i3);
        }
    }

    public static final void l(s6p s6pVar, g6p g6pVar, int i, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-358193468);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(s6pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var.f(g6pVar) : oq5Var.h(g6pVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            e9g e9gVar = e9g.b;
            ru ruVar = s6pVar.a;
            yci a = a.a(yciVar, "searched_album");
            int i4 = w4p.a[s6pVar.b.d().ordinal()];
            yci D = ksw.D(a, rvf.M(i4 != 1 ? i4 != 2 ? R.string.album : R.string.book : R.string.podcast, oq5Var), null);
            boolean h = ((i3 & 112) == 32 || ((i3 & 64) != 0 && oq5Var.h(g6pVar))) | oq5Var.h(s6pVar) | ((i3 & 896) == 256);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new hsl(g6pVar, s6pVar, i, 5);
                oq5Var.k0(K);
            }
            ghh.a(ruVar, (Function0) K, D, null, null, e9gVar, null, oq5Var, 196608, 88);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lx(s6pVar, g6pVar, i, yciVar, i2, 26);
        }
    }

    public static final void m(t6p t6pVar, g6p g6pVar, int i, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-785476330);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(t6pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var.f(g6pVar) : oq5Var.h(g6pVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z = false;
            e9g e9gVar = e9g.b;
            jd1 jd1Var = t6pVar.a;
            yci D = ksw.D(a.a(yciVar, "searched_artist"), rvf.M(R.string.artist, oq5Var), null);
            boolean h = ((i3 & 112) == 32 || ((i3 & 64) != 0 && oq5Var.h(g6pVar))) | oq5Var.h(t6pVar);
            if ((i3 & 896) == 256) {
                z = true;
            }
            boolean z2 = h | z;
            Object K = oq5Var.K();
            if (z2 || K == gq5.a) {
                K = new hsl(g6pVar, t6pVar, i, 7);
                oq5Var.k0(K);
            }
            jf0.b((Function0) K, jd1Var, D, null, e9gVar, null, oq5Var, 24576, 40);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new o4p(t6pVar, g6pVar, i, yciVar, i2, 8);
        }
    }

    public static final void n(final u6p u6pVar, final l0p l0pVar, final int i, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1760190648);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(u6pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var.f(l0pVar) : oq5Var.h(l0pVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            boolean booleanValue = ((Boolean) szf.P(l0pVar.c(u6pVar.b), Boolean.FALSE, null, oq5Var, 48, 2).getValue()).booleanValue();
            zy2 zy2Var = u6pVar.a;
            boolean z = i == 0;
            yci D = ksw.D(a.a(yciVar, "searched_best_result_album"), W(u6pVar.b, oq5Var), null);
            int i4 = i3 & 112;
            int i5 = i3 & 896;
            boolean h = (i4 == 32 || ((i3 & 64) != 0 && oq5Var.h(l0pVar))) | oq5Var.h(u6pVar) | (i5 == 256);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                final int i6 = 0;
                K = new Function0() { // from class: m4p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i6) {
                            case 0:
                                u6p u6pVar2 = u6pVar;
                                l0pVar.C0(u6pVar2.b, u6pVar2.c, i);
                                break;
                            case 1:
                                u6p u6pVar3 = u6pVar;
                                l0pVar.I(u6pVar3.b, u6pVar3.c, i);
                                break;
                            default:
                                u6p u6pVar4 = u6pVar;
                                l0pVar.g0(u6pVar4.b, u6pVar4.c, i);
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K);
            }
            Function0 function0 = (Function0) K;
            int i7 = i3;
            boolean h2 = (i5 == 256) | (i4 == 32 || ((i3 & 64) != 0 && oq5Var.h(l0pVar))) | oq5Var.h(u6pVar);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                final int i8 = 1;
                K2 = new Function0() { // from class: m4p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i8) {
                            case 0:
                                u6p u6pVar2 = u6pVar;
                                l0pVar.C0(u6pVar2.b, u6pVar2.c, i);
                                break;
                            case 1:
                                u6p u6pVar3 = u6pVar;
                                l0pVar.I(u6pVar3.b, u6pVar3.c, i);
                                break;
                            default:
                                u6p u6pVar4 = u6pVar;
                                l0pVar.g0(u6pVar4.b, u6pVar4.c, i);
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K2);
            }
            Function0 function02 = (Function0) K2;
            boolean h3 = (i4 == 32 || ((i7 & 64) != 0 && oq5Var.h(l0pVar))) | oq5Var.h(u6pVar) | (i5 == 256);
            Object K3 = oq5Var.K();
            if (h3 || K3 == kjnVar) {
                final int i9 = 2;
                K3 = new Function0() { // from class: m4p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i9) {
                            case 0:
                                u6p u6pVar2 = u6pVar;
                                l0pVar.C0(u6pVar2.b, u6pVar2.c, i);
                                break;
                            case 1:
                                u6p u6pVar3 = u6pVar;
                                l0pVar.I(u6pVar3.b, u6pVar3.c, i);
                                break;
                            default:
                                u6p u6pVar4 = u6pVar;
                                l0pVar.g0(u6pVar4.b, u6pVar4.c, i);
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K3);
            }
            swf.k(zy2Var, z, function0, booleanValue, function02, D, (Function0) K3, oq5Var, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new o4p(u6pVar, l0pVar, i, yciVar, i2, 4);
        }
    }

    public static final Toast n0(Context context, int i, int i2) {
        context.getClass();
        Toast makeText = Toast.makeText(context, i, i2);
        if (Build.VERSION.SDK_INT == 25) {
            View view = makeText.getView();
            view.getClass();
            mtc mtcVar = new mtc(context, 1);
            try {
                Field declaredField = View.class.getDeclaredField("mContext");
                declaredField.setAccessible(true);
                declaredField.set(view, mtcVar);
            } catch (Throwable unused) {
            }
        }
        makeText.getClass();
        makeText.show();
        context.getString(i).getClass();
        return makeText;
    }

    public static final void o(final v6p v6pVar, final l0p l0pVar, final int i, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1945052598);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(v6pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var.f(l0pVar) : oq5Var.h(l0pVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            boolean booleanValue = ((Boolean) szf.P(l0pVar.c(v6pVar.b), Boolean.FALSE, null, oq5Var, 48, 2).getValue()).booleanValue();
            vm7 vm7Var = v6pVar.a;
            boolean z = i == 0;
            yci a = a.a(yciVar, "searched_best_result_artist");
            int i4 = i3 & 112;
            int i5 = i3 & 896;
            boolean h = (i4 == 32 || ((i3 & 64) != 0 && oq5Var.h(l0pVar))) | oq5Var.h(v6pVar) | (i5 == 256);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                final int i6 = 0;
                K = new Function0() { // from class: q4p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i6) {
                            case 0:
                                v6p v6pVar2 = v6pVar;
                                l0pVar.C0(v6pVar2.b, v6pVar2.c, i);
                                break;
                            case 1:
                                v6p v6pVar3 = v6pVar;
                                l0pVar.I(v6pVar3.b, v6pVar3.c, i);
                                break;
                            default:
                                v6p v6pVar4 = v6pVar;
                                l0pVar.g0(v6pVar4.b, v6pVar4.c, i);
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K);
            }
            Function0 function0 = (Function0) K;
            int i7 = i3;
            boolean h2 = (i5 == 256) | (i4 == 32 || ((i3 & 64) != 0 && oq5Var.h(l0pVar))) | oq5Var.h(v6pVar);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                final int i8 = 1;
                K2 = new Function0() { // from class: q4p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i8) {
                            case 0:
                                v6p v6pVar2 = v6pVar;
                                l0pVar.C0(v6pVar2.b, v6pVar2.c, i);
                                break;
                            case 1:
                                v6p v6pVar3 = v6pVar;
                                l0pVar.I(v6pVar3.b, v6pVar3.c, i);
                                break;
                            default:
                                v6p v6pVar4 = v6pVar;
                                l0pVar.g0(v6pVar4.b, v6pVar4.c, i);
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K2);
            }
            Function0 function02 = (Function0) K2;
            boolean h3 = (i4 == 32 || ((i7 & 64) != 0 && oq5Var.h(l0pVar))) | oq5Var.h(v6pVar) | (i5 == 256);
            Object K3 = oq5Var.K();
            if (h3 || K3 == kjnVar) {
                final int i9 = 2;
                K3 = new Function0() { // from class: q4p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i9) {
                            case 0:
                                v6p v6pVar2 = v6pVar;
                                l0pVar.C0(v6pVar2.b, v6pVar2.c, i);
                                break;
                            case 1:
                                v6p v6pVar3 = v6pVar;
                                l0pVar.I(v6pVar3.b, v6pVar3.c, i);
                                break;
                            default:
                                v6p v6pVar4 = v6pVar;
                                l0pVar.g0(v6pVar4.b, v6pVar4.c, i);
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K3);
            }
            uwf.b(vm7Var, z, function0, function02, booleanValue, a, (Function0) K3, oq5Var, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new o4p(v6pVar, l0pVar, i, yciVar, i2, 2);
        }
    }

    public static final Toast o0(Context context, CharSequence charSequence) {
        context.getClass();
        charSequence.getClass();
        Toast makeText = Toast.makeText(context, charSequence, 0);
        if (Build.VERSION.SDK_INT == 25) {
            View view = makeText.getView();
            view.getClass();
            mtc mtcVar = new mtc(context, 1);
            try {
                Field declaredField = View.class.getDeclaredField("mContext");
                declaredField.setAccessible(true);
                declaredField.set(view, mtcVar);
            } catch (Throwable unused) {
            }
        }
        makeText.getClass();
        makeText.show();
        charSequence.toString().getClass();
        return makeText;
    }

    public static final void p(w6p w6pVar, g6p g6pVar, int i, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(932443061);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? oq5Var.f(w6pVar) : oq5Var.h(w6pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var.f(g6pVar) : oq5Var.h(g6pVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        boolean z = true;
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            aqi o0 = szf.o0(Integer.valueOf(i), oq5Var);
            nnk nnkVar = w6pVar.a;
            if ((i3 & 112) != 32 && ((i3 & 64) == 0 || !oq5Var.h(g6pVar))) {
                z = false;
            }
            boolean h = oq5Var.h(w6pVar) | z | oq5Var.f(o0);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new cte(23, g6pVar, w6pVar, o0);
                oq5Var.k0(K);
            }
            ywf.e(nnkVar, (Function0) K, ksw.D(a.a(yciVar, "searched_best_result_artist_related"), rvf.M(R.string.artists, oq5Var), null), oq5Var, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lx(w6pVar, g6pVar, i, yciVar, i2, 22);
        }
    }

    public static final l3q p0(u51 u51Var, k3q k3qVar) {
        u51Var.getClass();
        k3qVar.getClass();
        return new l3q(new yc5(u51Var.a), new n3q(u51Var.b), k3qVar);
    }

    public static final void q(x6p x6pVar, g6p g6pVar, int i, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1829447987);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(x6pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var.f(g6pVar) : oq5Var.h(g6pVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            aqi o0 = szf.o0(Integer.valueOf(i), oq5Var);
            zwf.j(x6pVar.a, aaw.t(x6pVar.b, new v4p(g6pVar, x6pVar, o0, 0), g6pVar.k0(), new sfm(g6pVar, x6pVar, o0), oq5Var, 196608), ((Number) o0.getValue()).intValue() == 0, yciVar, oq5Var, i3 & 7168);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lx(x6pVar, g6pVar, i, yciVar, i2, 27);
        }
    }

    public static PictureDrawable q0(sfm sfmVar) {
        Picture E;
        rko rkoVar;
        glo gloVar = (glo) sfmVar.a;
        spi spiVar = gloVar.o;
        rko rkoVar2 = gloVar.r;
        if (rkoVar2 != null && rkoVar2.b != 9 && (rkoVar = gloVar.s) != null && rkoVar.b != 9) {
            E = sfmVar.E((int) Math.ceil(rkoVar2.d()), (int) Math.ceil(((glo) sfmVar.a).s.d()));
        } else if (rkoVar2 == null || spiVar == null) {
            rko rkoVar3 = gloVar.s;
            if (rkoVar3 == null || spiVar == null) {
                E = sfmVar.E(RemoteCameraConfig.Mic.BUFFER_SIZE, RemoteCameraConfig.Mic.BUFFER_SIZE);
            } else {
                E = sfmVar.E((int) Math.ceil((spiVar.d * r1) / spiVar.e), (int) Math.ceil(rkoVar3.d()));
            }
        } else {
            E = sfmVar.E((int) Math.ceil(rkoVar2.d()), (int) Math.ceil((spiVar.e * r1) / spiVar.d));
        }
        return new PictureDrawable(E);
    }

    public static final void r(final y6p y6pVar, final zzo zzoVar, final int i, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        String n;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-838304245);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(y6pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var.f(zzoVar) : oq5Var.h(zzoVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            if (zzoVar.b()) {
                oq5Var.Z(1313303573);
                n = j66.d0(((pw5) y6pVar.a.a).b.d(), oq5Var);
                oq5Var.p(false);
            } else {
                n = vz1.n(oq5Var, 1313405780, R.string.concert_header_a11y, oq5Var, false);
            }
            g06 g06Var = y6pVar.a;
            yci D = ksw.D(a.a(d.d(yciVar, 1.0f), "searched_best_result_concert"), n, null);
            boolean b = zzoVar.b();
            int i4 = i3 & 112;
            int i5 = i3 & 896;
            boolean h = (i4 == 32 || ((i3 & 64) != 0 && oq5Var.h(zzoVar))) | oq5Var.h(y6pVar) | (i5 == 256);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                K = new Function0() { // from class: r4p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (r4) {
                            case 0:
                                zzoVar.o(y6pVar, i);
                                break;
                            default:
                                zzoVar.f(y6pVar, i);
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K);
            }
            Function0 function0 = (Function0) K;
            int i6 = ((i4 == 32 || ((i3 & 64) != 0 && oq5Var.h(zzoVar))) ? 1 : 0) | (oq5Var.h(y6pVar) ? 1 : 0) | (i5 == 256 ? 1 : 0);
            Object K2 = oq5Var.K();
            if (i6 != 0 || K2 == kjnVar) {
                final int i7 = 1;
                K2 = new Function0() { // from class: r4p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i7) {
                            case 0:
                                zzoVar.o(y6pVar, i);
                                break;
                            default:
                                zzoVar.f(y6pVar, i);
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K2);
            }
            g0g.n(g06Var, function0, (Function0) K2, b, D, oq5Var, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new o4p(y6pVar, zzoVar, i, yciVar, i2, 3);
        }
    }

    public static final String r0(PreloadException preloadException) {
        preloadException.getClass();
        if (preloadException instanceof PreloadException.ApiCallError) {
            return "ApiCall";
        }
        if (preloadException instanceof PreloadException.CacheInitException.StorageNotMounted) {
            return "StorageNotMounted";
        }
        if (preloadException instanceof PreloadException.CacheInitException.StorageReadOnly) {
            return "StorageReadOnly";
        }
        if (preloadException instanceof PreloadException.CacheInitException.InitFailed) {
            return "CacheInitFailed";
        }
        if (preloadException instanceof PreloadException.CanceledOperationException.CanceledManifestDownload) {
            return "CanceledManifestDownload";
        }
        if (preloadException instanceof PreloadException.CanceledOperationException.CanceledPendingRequest) {
            return "CanceledPendingRequest";
        }
        if (preloadException instanceof PreloadException.CanceledOperationException.CanceledTracksDownload) {
            return "CanceledTracksDownload";
        }
        if (preloadException instanceof PreloadException.CanceledOperationException.UnsupportedMediaType) {
            return "UnsupportedMediaType";
        }
        if (preloadException instanceof PreloadException.EmptyTrackListSelectedError) {
            return "EmptyTrackListSelected";
        }
        if (preloadException instanceof PreloadException.ManifestDownloadError) {
            return "ManifestDownload";
        }
        if (preloadException instanceof PreloadException.TracksDownloadError) {
            return "TracksDownload";
        }
        if (preloadException instanceof PreloadException.TracksDownloadTimeout) {
            return "TracksDownloadTimeout";
        }
        if (preloadException instanceof PreloadException.UnknownError) {
            return "Unknown";
        }
        b6e.s();
        return null;
    }

    public static final void s(final z6p z6pVar, final g6p g6pVar, final int i, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(849906581);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(z6pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var.f(g6pVar) : oq5Var.h(g6pVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            lt ltVar = z6pVar.b;
            final z6a R = y9w.R(ltVar, new aqd(24, g6pVar, z6pVar), 0, oq5Var, 4);
            boolean booleanValue = ((Boolean) szf.P(g6pVar.c(ltVar), Boolean.FALSE, null, oq5Var, 48, 2).getValue()).booleanValue();
            final boolean z = ((w3g) gld.M(R.b(), oq5Var).getValue()).c;
            az2 az2Var = z6pVar.a;
            boolean z2 = i == 0;
            yci D = ksw.D(a.a(yciVar, "searched_best_result_non_music"), W(ltVar, oq5Var), null);
            int i4 = i3 & 112;
            int i5 = i3 & 896;
            boolean h = (i4 == 32 || ((i3 & 64) != 0 && oq5Var.h(g6pVar))) | oq5Var.h(z6pVar) | (i5 == 256);
            Object K = oq5Var.K();
            int i6 = i3;
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                final int i7 = 1;
                K = new Function0() { // from class: j4p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i7) {
                            case 0:
                                z6p z6pVar2 = z6pVar;
                                g6pVar.I(z6pVar2.b, z6pVar2.c, i);
                                break;
                            default:
                                z6p z6pVar3 = z6pVar;
                                g6pVar.C0(z6pVar3.b, z6pVar3.c, i);
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K);
            }
            Function0 function0 = (Function0) K;
            boolean h2 = (i4 == 32 || ((i6 & 64) != 0 && oq5Var.h(g6pVar))) | oq5Var.h(z6pVar) | (i5 == 256);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                final int i8 = 0;
                K2 = new Function0() { // from class: j4p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i8) {
                            case 0:
                                z6p z6pVar2 = z6pVar;
                                g6pVar.I(z6pVar2.b, z6pVar2.c, i);
                                break;
                            default:
                                z6p z6pVar3 = z6pVar;
                                g6pVar.C0(z6pVar3.b, z6pVar3.c, i);
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K2);
            }
            Function0 function02 = (Function0) K2;
            boolean h3 = oq5Var.h(R) | (i5 == 256) | oq5Var.g(z);
            Object K3 = oq5Var.K();
            if (h3 || K3 == kjnVar) {
                K3 = new Function0() { // from class: k4p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        z6a.this.c(i, z);
                        return Unit.a;
                    }
                };
                oq5Var.k0(K3);
            }
            oq5Var = oq5Var;
            rzf.h(az2Var, booleanValue, z2, z, function0, function02, (Function0) K3, D, oq5Var, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lx(z6pVar, g6pVar, i, yciVar, i2, 16);
        }
    }

    public static final b6v s0(lt ltVar, i3q i3qVar) {
        i3qVar.getClass();
        return new b6v(new j3q(new xc5(ltVar.a), new n3q(ltVar.c), i3qVar));
    }

    public static final void t(a7p a7pVar, int i, g6p g6pVar, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        int i4;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1417910155);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(a7pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 = i;
            i3 |= oq5Var.d(i4) ? 32 : 16;
        } else {
            i4 = i;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var.f(g6pVar) : oq5Var.h(g6pVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 2048 : 1024;
        } else {
            yciVar2 = yciVar;
        }
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            boolean f = ((i3 & 896) == 256 || ((i3 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 && oq5Var.f(g6pVar))) | oq5Var.f(a7pVar) | ((i3 & 112) == 32);
            Object K = oq5Var.K();
            if (f || K == gq5.a) {
                K = new pzj(a7pVar.a, g6pVar.P(), new j1p(2));
                oq5Var.k0(K);
            }
            q5i q5iVar = a7pVar.a;
            neg.b((String) q5iVar.d, (pzj) K, yciVar2, null, q5iVar.a, q5iVar.b, oq5Var, (i3 >> 3) & 896, 8);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lx(i4, i2, 24, yciVar, a7pVar, g6pVar);
        }
    }

    public static final b6v t0(u51 u51Var, k3q k3qVar) {
        u51Var.getClass();
        return new b6v(p0(u51Var, k3qVar));
    }

    public static final void u(final b7p b7pVar, final l0p l0pVar, final int i, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(326014826);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var2.h(b7pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var2.f(l0pVar) : oq5Var2.h(l0pVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var2.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var2.f(yciVar) ? 2048 : 1024;
        }
        final int i4 = 0;
        if (oq5Var2.P(i3 & 1, (i3 & 1171) != 1170)) {
            boolean booleanValue = ((Boolean) szf.P(l0pVar.c(b7pVar.b), Boolean.FALSE, null, oq5Var2, 48, 2).getValue()).booleanValue();
            bz2 bz2Var = b7pVar.a;
            boolean z = i == 0;
            yci D = ksw.D(yciVar, rvf.M(R.string.playlist, oq5Var2), null);
            int i5 = i3 & 112;
            int i6 = i3 & 896;
            boolean h = (i5 == 32 || ((i3 & 64) != 0 && oq5Var2.h(l0pVar))) | oq5Var2.h(b7pVar) | (i6 == 256);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                K = new Function0() { // from class: p4p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                b7p b7pVar2 = b7pVar;
                                l0pVar.C0(b7pVar2.b, b7pVar2.c, i);
                                break;
                            case 1:
                                b7p b7pVar3 = b7pVar;
                                l0pVar.I(b7pVar3.b, b7pVar3.c, i);
                                break;
                            default:
                                b7p b7pVar4 = b7pVar;
                                l0pVar.g0(b7pVar4.b, b7pVar4.c, i);
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var2.k0(K);
            }
            Function0 function0 = (Function0) K;
            int i7 = i3;
            boolean h2 = (i6 == 256) | (i5 == 32 || ((i3 & 64) != 0 && oq5Var2.h(l0pVar))) | oq5Var2.h(b7pVar);
            Object K2 = oq5Var2.K();
            if (h2 || K2 == kjnVar) {
                final int i8 = 1;
                K2 = new Function0() { // from class: p4p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i8) {
                            case 0:
                                b7p b7pVar2 = b7pVar;
                                l0pVar.C0(b7pVar2.b, b7pVar2.c, i);
                                break;
                            case 1:
                                b7p b7pVar3 = b7pVar;
                                l0pVar.I(b7pVar3.b, b7pVar3.c, i);
                                break;
                            default:
                                b7p b7pVar4 = b7pVar;
                                l0pVar.g0(b7pVar4.b, b7pVar4.c, i);
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var2.k0(K2);
            }
            Function0 function02 = (Function0) K2;
            boolean h3 = (i5 == 32 || ((i7 & 64) != 0 && oq5Var2.h(l0pVar))) | oq5Var2.h(b7pVar) | (i6 == 256);
            Object K3 = oq5Var2.K();
            if (h3 || K3 == kjnVar) {
                final int i9 = 2;
                K3 = new Function0() { // from class: p4p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i9) {
                            case 0:
                                b7p b7pVar2 = b7pVar;
                                l0pVar.C0(b7pVar2.b, b7pVar2.c, i);
                                break;
                            case 1:
                                b7p b7pVar3 = b7pVar;
                                l0pVar.I(b7pVar3.b, b7pVar3.c, i);
                                break;
                            default:
                                b7p b7pVar4 = b7pVar;
                                l0pVar.g0(b7pVar4.b, b7pVar4.c, i);
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var2.k0(K3);
            }
            ixf.f(bz2Var, z, function0, booleanValue, function02, D, (Function0) K3, oq5Var2, 0);
            oq5Var = oq5Var2;
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new o4p(b7pVar, l0pVar, i, yciVar, i2, 1);
        }
    }

    public static b6v u0(oq oqVar) {
        i3q i3qVar = i3q.a;
        oqVar.getClass();
        return new b6v(new j3q(new xc5(oqVar.a), new n3q(oqVar.b), i3qVar));
    }

    public static final void v(final c7p c7pVar, final g6p g6pVar, final int i, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var;
        int i4;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-337469811);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var2.h(c7pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var2.f(g6pVar) : oq5Var2.h(g6pVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var2.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var2.f(yciVar) ? 2048 : 1024;
        }
        if (oq5Var2.P(i3 & 1, (i3 & 1171) != 1170)) {
            lt ltVar = c7pVar.c;
            z6a R = y9w.R(ltVar, new j6e(g6pVar, c7pVar), c7pVar.b, oq5Var2, 0);
            boolean booleanValue = ((Boolean) szf.P(g6pVar.c(ltVar), Boolean.FALSE, null, oq5Var2, 48, 2).getValue()).booleanValue();
            w3g w3gVar = (w3g) gld.M(R.b(), oq5Var2).getValue();
            az2 az2Var = c7pVar.a;
            boolean z = i == 0;
            int i5 = i3 & 112;
            int i6 = i3 & 896;
            boolean h = (i5 == 32 || ((i3 & 64) != 0 && oq5Var2.h(g6pVar))) | oq5Var2.h(c7pVar) | (i6 == 256);
            Object K = oq5Var2.K();
            Object obj = gq5.a;
            if (h || K == obj) {
                i4 = i3;
                final int i7 = 0;
                K = new Function0() { // from class: n4p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i7) {
                            case 0:
                                c7p c7pVar2 = c7pVar;
                                g6pVar.C0(c7pVar2.c, c7pVar2.d, i);
                                break;
                            default:
                                c7p c7pVar3 = c7pVar;
                                g6pVar.I(c7pVar3.c, c7pVar3.d, i);
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var2.k0(K);
            } else {
                i4 = i3;
            }
            Function0 function0 = (Function0) K;
            boolean h2 = (i5 == 32 || ((i4 & 64) != 0 && oq5Var2.h(g6pVar))) | oq5Var2.h(c7pVar) | (i6 == 256);
            Object K2 = oq5Var2.K();
            if (h2 || K2 == obj) {
                final int i8 = 1;
                K2 = new Function0() { // from class: n4p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i8) {
                            case 0:
                                c7p c7pVar2 = c7pVar;
                                g6pVar.C0(c7pVar2.c, c7pVar2.d, i);
                                break;
                            default:
                                c7p c7pVar3 = c7pVar;
                                g6pVar.I(c7pVar3.c, c7pVar3.d, i);
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var2.k0(K2);
            }
            Function0 function02 = (Function0) K2;
            boolean h3 = oq5Var2.h(R) | (i6 == 256) | oq5Var2.h(w3gVar);
            Object K3 = oq5Var2.K();
            if (h3 || K3 == obj) {
                K3 = new hsl(R, i, w3gVar, 6);
                oq5Var2.k0(K3);
            }
            szf.m(az2Var, w3gVar, booleanValue, z, function0, function02, (Function0) K3, ksw.D(a.a(yciVar, "searched_best_result_podcast"), W(ltVar, oq5Var2), null), oq5Var2, 0);
            oq5Var = oq5Var2;
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lx(c7pVar, g6pVar, i, yciVar, i2, 29);
        }
    }

    public static b6v v0(c01 c01Var) {
        k3q k3qVar = k3q.a;
        c01Var.getClass();
        return new b6v(new l3q(new yc5(c01Var.a), new n3q(c01Var.b), k3qVar));
    }

    public static final void w(d7p d7pVar, g6p g6pVar, int i, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1423963979);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(d7pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var.f(g6pVar) : oq5Var.h(g6pVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            aqi o0 = szf.o0(Integer.valueOf(i), oq5Var);
            wxf.d(d7pVar.a, aaw.t(d7pVar.b, new v4p(g6pVar, d7pVar, o0, 1), g6pVar.k0(), new lum(g6pVar, d7pVar, o0), oq5Var, 196608), ((Number) o0.getValue()).intValue() == 0, yciVar, oq5Var, i3 & 7168);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lx(d7pVar, g6pVar, i, yciVar, i2, 23);
        }
    }

    public static b6v w0(cvl cvlVar) {
        o3q o3qVar = o3q.b;
        cvlVar.getClass();
        return new b6v(y0(cvlVar, o3qVar));
    }

    public static final void x(final e7p e7pVar, final l0p l0pVar, final int i, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1535840910);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(e7pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var.f(l0pVar) : oq5Var.h(l0pVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            boolean booleanValue = ((Boolean) szf.P(l0pVar.c(e7pVar.b), Boolean.FALSE, null, oq5Var, 48, 2).getValue()).booleanValue();
            zy2 zy2Var = e7pVar.a;
            yci D = ksw.D(a.a(yciVar, "searched_best_result_recent_release"), W(e7pVar.b, oq5Var), null);
            int i4 = i3 & 112;
            int i5 = i3 & 896;
            boolean h = (i4 == 32 || ((i3 & 64) != 0 && oq5Var.h(l0pVar))) | oq5Var.h(e7pVar) | (i5 == 256);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                final int i6 = 0;
                K = new Function0() { // from class: s4p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i6) {
                            case 0:
                                e7p e7pVar2 = e7pVar;
                                l0pVar.C0(e7pVar2.b, e7pVar2.c, i);
                                break;
                            case 1:
                                e7p e7pVar3 = e7pVar;
                                l0pVar.I(e7pVar3.b, e7pVar3.c, i);
                                break;
                            default:
                                e7p e7pVar4 = e7pVar;
                                l0pVar.g0(e7pVar4.b, e7pVar4.c, i);
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K);
            }
            Function0 function0 = (Function0) K;
            boolean h2 = (i4 == 32 || ((i3 & 64) != 0 && oq5Var.h(l0pVar))) | oq5Var.h(e7pVar) | (i5 == 256);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                final int i7 = 1;
                K2 = new Function0() { // from class: s4p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i7) {
                            case 0:
                                e7p e7pVar2 = e7pVar;
                                l0pVar.C0(e7pVar2.b, e7pVar2.c, i);
                                break;
                            case 1:
                                e7p e7pVar3 = e7pVar;
                                l0pVar.I(e7pVar3.b, e7pVar3.c, i);
                                break;
                            default:
                                e7p e7pVar4 = e7pVar;
                                l0pVar.g0(e7pVar4.b, e7pVar4.c, i);
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K2);
            }
            Function0 function02 = (Function0) K2;
            boolean h3 = (i4 == 32 || ((i3 & 64) != 0 && oq5Var.h(l0pVar))) | oq5Var.h(e7pVar) | (i5 == 256);
            Object K3 = oq5Var.K();
            if (h3 || K3 == kjnVar) {
                final int i8 = 2;
                K3 = new Function0() { // from class: s4p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i8) {
                            case 0:
                                e7p e7pVar2 = e7pVar;
                                l0pVar.C0(e7pVar2.b, e7pVar2.c, i);
                                break;
                            case 1:
                                e7p e7pVar3 = e7pVar;
                                l0pVar.I(e7pVar3.b, e7pVar3.c, i);
                                break;
                            default:
                                e7p e7pVar4 = e7pVar;
                                l0pVar.g0(e7pVar4.b, e7pVar4.c, i);
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K3);
            }
            hyf.f(zy2Var, function0, booleanValue, function02, D, (Function0) K3, oq5Var, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new o4p(e7pVar, l0pVar, i, yciVar, i2, 6);
        }
    }

    public static final p3q x0(eul eulVar, o3q o3qVar) {
        o3qVar.getClass();
        nvl d = eulVar.d();
        return new p3q(new zc5(d.a, d.b), o3qVar, new n3q(eulVar.c));
    }

    public static final void y(f7p f7pVar, g6p g6pVar, int i, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(974720475);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(f7pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var.f(g6pVar) : oq5Var.h(g6pVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            aqi o0 = szf.o0(Integer.valueOf(i), oq5Var);
            mqs mqsVar = f7pVar.b;
            bg5 H = up6.H(mqsVar, new t3e(1, g6pVar, f7pVar, o0), oq5Var, 6, 4);
            pzo pzoVar = f7pVar.a;
            boolean f = oq5Var.f(f7pVar);
            Object K = oq5Var.K();
            if (f || K == gq5.a) {
                sfm sfmVar = new sfm(g6pVar, f7pVar, o0);
                H.getClass();
                mqsVar.getClass();
                K = new ozo(H, mqsVar, sfmVar);
                oq5Var.k0(K);
            }
            tyf.g(pzoVar, (ozo) K, ((Number) o0.getValue()).intValue() == 0, ksw.D(a.a(yciVar, "best_result_searched_track"), X(mqsVar, oq5Var), null), oq5Var, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new o4p(f7pVar, g6pVar, i, yciVar, i2, 7);
        }
    }

    public static final p3q y0(cvl cvlVar, o3q o3qVar) {
        cvlVar.getClass();
        o3qVar.getClass();
        nvl g = cvlVar.g();
        return new p3q(new zc5(g.a, g.b), o3qVar, new n3q(cvlVar.b));
    }

    public static final void z(h7p h7pVar, g6p g6pVar, int i, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(704897179);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(h7pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var.f(g6pVar) : oq5Var.h(g6pVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            lxe.f(h7pVar.a, ehv.p(h7pVar.b, new lum(g6pVar, h7pVar, szf.o0(Integer.valueOf(i), oq5Var)), oq5Var), ksw.D(a.a(yciVar, "best_result_searched_clip"), rvf.M(R.string.music_video, oq5Var), null), e9g.a, oq5Var, 3072, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lx(h7pVar, g6pVar, i, yciVar, i2, 28);
        }
    }

    public static final onq z0(SkeletonBlockSourceDto skeletonBlockSourceDto) {
        skeletonBlockSourceDto.getClass();
        String uri = skeletonBlockSourceDto.getUri();
        if (uri == null) {
            return null;
        }
        return new onq(uri, skeletonBlockSourceDto.getCount());
    }

    public abstract void b0(int i);

    public abstract boolean c0();

    public abstract void k0(boolean z);

    public abstract void l0();

    public abstract void m0(int i);

    public void j0(boolean z) {
    }
}
