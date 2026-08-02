package defpackage;

import android.app.Activity;
import android.os.Bundle;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.music.shared.dto.CoverPathDto;
import com.yandex.music.shared.dto.ExtraActionDto;
import com.yandex.music.shared.dto.VibeButtonDto;
import com.yandex.music.shared.dto.artist.ArtistBriefInfoDto;
import com.yandex.music.shared.dto.artist.ArtistDto;
import com.yandex.music.shared.dto.artist.ArtistPickDto;
import com.yandex.music.shared.dto.artist.ArtistStatsDto;
import com.yandex.music.shared.dto.artist.BandLinkDto;
import com.yandex.music.shared.dto.artist.LinkDto;
import com.yandex.music.shared.dto.artist.PreSaveContentRestrictionsDto;
import com.yandex.music.shared.dto.artist.PreSaveDto;
import com.yandex.music.shared.dto.concert.ConcertDto;
import com.yandex.music.shared.dto.domainitem.ArtistDomainItemDto;
import com.yandex.music.shared.dto.domainitem.PlaylistDomainItemDto;
import com.yandex.music.shared.dto.playlist.PlaylistHeaderDto;
import com.yandex.music.shared.dto.videoclip.VideoClipDto;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.data.audio.WarningContent;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;
import ru.yandex.video.m3.data.DataSourceParameters;

/* loaded from: classes.dex */
public abstract class gld {
    public static final String[] a = {"android.permission.RECORD_AUDIO", "android.permission.MODIFY_AUDIO_SETTINGS"};
    public static final wn5 b = new wn5(new go5(26), -1554100777, false);
    public static final wn5 c = new wn5(new po5(8), -546035416, false);
    public static final wn5 d = new wn5(new po5(9), 583818565, false);
    public static final wn5 e = new wn5(new ap5(11), -1296122073, false);
    public static final oa8 f = new oa8();
    public static final mhp[] g = new mhp[0];
    public static final i6c[] h = {new i6c("usage_and_diagnostics_listener", 1), new i6c("usage_and_diagnostics_consents", 1), new i6c("usage_and_diagnostics_check_consents", 1), new i6c("usage_and_diagnostics_settings_access", 1), new i6c("el_capitan", 1)};

    public static final void A(yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1112147902);
        if ((((oq5Var.f(yciVar) ? 4 : 2) | i) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            kfh d2 = ug3.d(b2c.b, false);
            int i2 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            irf.r(a0g.E(2131231905, 0, oq5Var), null, null, null, null, 0.0f, null, oq5Var, 48, 124);
            irf.r(a0g.E(2131231904, 0, oq5Var), null, androidx.compose.foundation.layout.a.m(gut.p1(qwp.a0(1, oq5Var)), 16), null, null, 0.0f, null, oq5Var, 48, 120);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u71(yciVar, i, 22);
        }
    }

    public static final tf6 B() {
        wqr n = a4g.n();
        dq7 dq7Var = ca8.a;
        return new tf6(e.c(n, j5h.a));
    }

    public static final void C(yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(904681577);
        if ((((oq5Var.f(yciVar) ? 4 : 2) | i) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            kfh d2 = ug3.d(b2c.b, false);
            int i2 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            irf.r(a0g.E(2131231906, 0, oq5Var), null, null, null, null, 0.0f, null, oq5Var, 48, 124);
            irf.r(a0g.E(2131231903, 0, oq5Var), null, androidx.compose.foundation.layout.a.m(gut.p1(b.a.a(qwp.a0(0, oq5Var), b2c.d)), 16), null, null, 0.0f, null, oq5Var, 48, 120);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u71(yciVar, i, 21);
        }
    }

    public static final void D(Function0 function0, hq5 hq5Var) {
        puj pujVar = ((oq5) hq5Var).L.b.a;
        pujVar.G0(duj.d);
        q5g.J(pujVar, 0, function0);
    }

    public static final void E(int i, int i2, hq5 hq5Var) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(766673307);
        int i4 = (oq5Var.d(i) ? 4 : 2) | i2;
        if (oq5Var.P(i4 & 1, (i4 & 3) != 2)) {
            i3 = i;
            zsd.v(i3, ((i4 << 3) & 112) | 6, 4, oq5Var, null, true);
        } else {
            i3 = i;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new mz3(i3, i2, 5);
        }
    }

    public static final void F(List list, List list2, mdc mdcVar, cvl cvlVar, t5c t5cVar, dib dibVar, hq5 hq5Var, int i) {
        int i2;
        List list3;
        mdc mdcVar2;
        oq5 oq5Var;
        Object u3eVar;
        int i3;
        aqi aqiVar;
        int i4;
        int i5;
        oq5 oq5Var2;
        kjn kjnVar;
        int i6;
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(487998236);
        if ((i & 6) == 0) {
            i2 = (oq5Var3.h(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var3.f(list2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var3.f(mdcVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var3.h(cvlVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & SQLiteDatabase.OPEN_NOMUTEX) == 0 ? oq5Var3.f(t5cVar) : oq5Var3.h(t5cVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var3.h(dibVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        boolean z = true;
        if (oq5Var3.P(i2 & 1, (74899 & i2) != 74898)) {
            Object K = oq5Var3.K();
            Continuation continuation = null;
            kjn kjnVar2 = gq5.a;
            if (K == kjnVar2) {
                K = szf.g0(null);
                oq5Var3.k0(K);
            }
            aqi aqiVar2 = (aqi) K;
            oq5Var3.Z(814880216);
            Unit unit = Unit.a;
            boolean h2 = oq5Var3.h(dibVar);
            Object K2 = oq5Var3.K();
            if (h2 || K2 == kjnVar2) {
                K2 = new fzb(dibVar, aqiVar2, continuation, 2);
                oq5Var3.k0(K2);
            }
            w(oq5Var3, unit, (Function2) K2);
            oq5Var3.p(false);
            yci a2 = androidx.compose.ui.platform.a.a(vci.a, "collection_favourite_playlist_tracks_pager");
            int i7 = i2 & 112;
            boolean z2 = i7 == 32;
            Object K3 = oq5Var3.K();
            Object obj = K3;
            if (z2 || K3 == kjnVar2) {
                List list4 = list2;
                ArrayList arrayList = new ArrayList(v75.o(list4, 10));
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    arrayList.add(((jo6) it.next()).a);
                }
                oq5Var3.k0(arrayList);
                obj = arrayList;
            }
            List list5 = (List) obj;
            boolean z3 = i7 == 32;
            Object K4 = oq5Var3.K();
            Object obj2 = K4;
            if (z3 || K4 == kjnVar2) {
                List list6 = list2;
                ArrayList arrayList2 = new ArrayList(v75.o(list6, 10));
                Iterator it2 = list6.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((jo6) it2.next()).b);
                }
                oq5Var3.k0(arrayList2);
                obj2 = arrayList2;
            }
            List list7 = (List) obj2;
            boolean f2 = oq5Var3.f(list);
            Object K5 = oq5Var3.K();
            if (f2 || K5 == kjnVar2) {
                oq5Var3.k0(list);
                K5 = list;
            }
            List list8 = (List) K5;
            int i8 = 57344 & i2;
            t5cVar.getClass();
            list7.getClass();
            cvlVar.getClass();
            oq5Var3.Z(1052697874);
            mdc a3 = t5cVar.a();
            boolean f3 = oq5Var3.f(list7) | oq5Var3.f(cvlVar) | oq5Var3.f(a3);
            Object K6 = oq5Var3.K();
            if (f3 || K6 == kjnVar2) {
                i3 = i7;
                aqiVar = aqiVar2;
                i4 = i8;
                i5 = i2;
                oq5Var2 = oq5Var3;
                kjnVar = kjnVar2;
                i6 = 256;
                u3eVar = new u3e(list7, list8, cvlVar, a3, t5cVar.a, t5cVar.c, t5cVar.b, t5cVar.d, t5cVar.e);
                oq5Var2.k0(u3eVar);
            } else {
                u3eVar = K6;
                oq5Var2 = oq5Var3;
                i5 = i2;
                aqiVar = aqiVar2;
                i3 = i7;
                i4 = i8;
                kjnVar = kjnVar2;
                i6 = 256;
            }
            u3e u3eVar2 = (u3e) u3eVar;
            oq5Var2.p(false);
            q0k q0kVar = i3e.a;
            boolean z4 = (i3 == 32) | ((i5 & 896) == i6);
            if (i4 != 16384 && ((i5 & SQLiteDatabase.OPEN_NOMUTEX) == 0 || !oq5Var2.h(t5cVar))) {
                z = false;
            }
            boolean z5 = z4 | z;
            Object K7 = oq5Var2.K();
            if (z5 || K7 == kjnVar) {
                list3 = list2;
                mdcVar2 = mdcVar;
                K7 = new vtb(1, mdcVar2, list3, t5cVar);
                oq5Var2.k0(K7);
            } else {
                list3 = list2;
                mdcVar2 = mdcVar;
            }
            oq5 oq5Var4 = oq5Var2;
            zsd.u(list5, u3eVar2, a2, (pyc) K7, q0kVar, new ca3(aqiVar, 2), oq5Var4, 384, 0);
            oq5Var = oq5Var4;
        } else {
            list3 = list2;
            mdcVar2 = mdcVar;
            oq5Var = oq5Var3;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu0(list, list3, mdcVar2, cvlVar, t5cVar, dibVar, i, 7);
        }
    }

    public static final vc3 G(jxt jxtVar, jxt jxtVar2, fl5 fl5Var) {
        yxt yxtVar = jxtVar.a;
        yxt yxtVar2 = jxtVar2.a;
        if (yxtVar != yxtVar2) {
            throw new mac(yxtVar, yxtVar2);
        }
        if (yxtVar == yxt.Double) {
            double d2 = jxtVar.d();
            double d3 = jxtVar2.d();
            return new vc3(((d2 > d3 ? 1 : (d2 == d3 ? 0 : -1)) == 0 ? fl5.a : (d2 > d3 ? 1 : (d2 == d3 ? 0 : -1)) < 0 ? fl5.b : fl5.c) == fl5Var);
        }
        if (yxtVar == yxt.Int) {
            int e2 = jxtVar.e();
            int e3 = jxtVar2.e();
            return new vc3((e2 == e3 ? fl5.a : e2 < e3 ? fl5.b : fl5.c) == fl5Var);
        }
        if (yxtVar == yxt.Version) {
            return H(jxtVar, jxtVar2, fl5Var);
        }
        throw new mac(yxtVar, yxtVar2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b3, code lost:
    
        if (r8 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b5, code lost:
    
        r0 = defpackage.fl5.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b8, code lost:
    
        r0 = defpackage.fl5.e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final vc3 H(jxt jxtVar, jxt jxtVar2, fl5 fl5Var) {
        fl5 fl5Var2;
        yxt yxtVar = jxtVar.a;
        yxt yxtVar2 = yxt.Version;
        w0u w0uVar = yxtVar == yxtVar2 ? (w0u) jxtVar : null;
        mac macVar = new mac(jxtVar, yxtVar2);
        if (w0uVar == null) {
            throw macVar;
        }
        yx3 yx3Var = w0uVar.b;
        w0u w0uVar2 = jxtVar2.a == yxtVar2 ? (w0u) jxtVar2 : null;
        mac macVar2 = new mac(jxtVar2, yxtVar2);
        if (w0uVar2 == null) {
            throw macVar2;
        }
        yx3 yx3Var2 = w0uVar2.b;
        if (yx3Var.a.equals(yx3Var2.a)) {
            fl5Var2 = fl5.a;
        } else {
            ArrayList P = up6.P(yx3Var.a, ".");
            ArrayList P2 = up6.P(yx3Var2.a, ".");
            while (P.size() < P2.size()) {
                P.add(CommonUrlParts.Values.FALSE_INTEGER);
            }
            while (P2.size() < P.size()) {
                P2.add(CommonUrlParts.Values.FALSE_INTEGER);
            }
            kotlin.ranges.a l = yhn.l(1, yhn.m(0, P.size()));
            int i = l.a;
            int i2 = l.b;
            int i3 = l.c;
            if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
                while (true) {
                    Integer Q = up6.Q((String) P.get(i));
                    Integer Q2 = up6.Q((String) P2.get(i));
                    if (Q != null && Q2 != null) {
                        if (Q.intValue() <= Q2.intValue()) {
                            if (Q.intValue() >= Q2.intValue()) {
                                if (i == i2) {
                                    break;
                                }
                                i += i3;
                            } else {
                                fl5Var2 = fl5.b;
                                break;
                            }
                        } else {
                            fl5Var2 = fl5.c;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            fl5Var2 = fl5.a;
        }
        fl5 fl5Var3 = fl5.d;
        if (fl5Var2 != fl5Var3 && fl5Var2 != fl5.e) {
            return new vc3(fl5Var2 == fl5Var);
        }
        if (fl5Var2 != fl5Var3) {
            jxtVar = jxtVar2;
        }
        throw new mac(hrg.q("Incorrect format for Variable: \"", jxtVar.a(), "\""), (Throwable) null);
    }

    public static final thj I(u51 u51Var, int i) {
        u51Var.getClass();
        String str = u51Var.a;
        str.getClass();
        return new thj(pkb.Artist, str, i + 1, 1, "");
    }

    public static final Set J(mhp mhpVar) {
        mhpVar.getClass();
        if (mhpVar instanceof fr3) {
            return ((fr3) mhpVar).b();
        }
        HashSet hashSet = new HashSet(mhpVar.e());
        int e2 = mhpVar.e();
        for (int i = 0; i < e2; i++) {
            hashSet.add(mhpVar.f(i));
        }
        return hashSet;
    }

    public static final void K(mm6 mm6Var, String str, Throwable th) {
        L(mm6Var, n7w.c(str, th));
    }

    public static final void L(mm6 mm6Var, CancellationException cancellationException) {
        r2f r2fVar = (r2f) mm6Var.getCoroutineContext().get(o6c.l);
        if (r2fVar != null) {
            r2fVar.g(cancellationException);
        } else {
            b6e.l(mm6Var, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static final aqi M(vdr vdrVar, hq5 hq5Var) {
        vdrVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.W(1643894851, vdrVar);
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = szf.g0(vdrVar.getValue());
            oq5Var.k0(K);
        }
        aqi aqiVar = (aqi) K;
        boolean h2 = oq5Var.h(vdrVar);
        Object K2 = oq5Var.K();
        if (h2 || K2 == kjnVar) {
            K2 = new cs1(vdrVar, aqiVar, null, 26);
            oq5Var.k0(K2);
        }
        w(oq5Var, vdrVar, (Function2) K2);
        oq5Var.p(false);
        return aqiVar;
    }

    public static final aqi N(pjc pjcVar, Object obj, hq5 hq5Var, int i) {
        pjcVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.W(-847004355, pjcVar);
        dzf dzfVar = (dzf) oq5Var.j(ykg.a);
        aqi w = bcx.w(pjcVar, obj, dzfVar.getLifecycle(), lyf.d, g.a, oq5Var, i & 112);
        oq5Var.p(false);
        return w;
    }

    public static final aqi O(vdr vdrVar, hq5 hq5Var) {
        vdrVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.W(-1447042140, vdrVar);
        aqi x = bcx.x(vdrVar, oq5Var, 0);
        oq5Var.p(false);
        return x;
    }

    public static final mhp[] P(List list) {
        mhp[] mhpVarArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (mhpVarArr = (mhp[]) list.toArray(new mhp[0])) == null) ? g : mhpVarArr;
    }

    public static final Object Q(Function2 function2, Continuation continuation) {
        huo huoVar = new huo(continuation, continuation.getContext());
        Object l0 = swf.l0(huoVar, true, huoVar, function2);
        nm6 nm6Var = nm6.a;
        return l0;
    }

    public static final mm6 R(CoroutineContext coroutineContext, hq5 hq5Var) {
        if (coroutineContext.get(o6c.l) == null) {
            return new gun(((oq5) hq5Var).b.i(), coroutineContext);
        }
        w2f p = saf.p();
        p.U(new sm5(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"), false));
        return e(p);
    }

    public static final void S(ogi ogiVar, mu3 mu3Var, ai3 ai3Var, float f2, otp otpVar, aas aasVar, kpa kpaVar) {
        ArrayList arrayList = ogiVar.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            t5k t5kVar = (t5k) arrayList.get(i);
            t5kVar.a.g(mu3Var, ai3Var, f2, otpVar, aasVar, kpaVar);
            mu3Var.j(0.0f, t5kVar.a.b());
        }
    }

    public static final boolean T(mm6 mm6Var) {
        r2f r2fVar = (r2f) mm6Var.getCoroutineContext().get(o6c.l);
        if (r2fVar != null) {
            return r2fVar.b();
        }
        return true;
    }

    public static final f9f U(u9f u9fVar) {
        f9f d2 = u9fVar.d();
        if (d2 instanceof f9f) {
            return d2;
        }
        kac.j(d2, "Only KClass supported as classifier, got ");
        return null;
    }

    public static final String V(f9f f9fVar) {
        String h2 = ((lm4) f9fVar).h();
        if (h2 == null) {
            h2 = "<local class name not available>";
        }
        return hrg.q("Serializer for class '", h2, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n");
    }

    public static Bundle W(t5a t5aVar) {
        q5f q5fVar;
        Bundle bundle = new Bundle(3);
        bundle.putString("path", t5aVar.a);
        Map map = t5aVar.b;
        Bundle bundle2 = new Bundle(map.size());
        for (Map.Entry entry : map.entrySet()) {
            bundle2.putStringArray((String) entry.getKey(), (String[]) ((List) entry.getValue()).toArray(new String[0]));
        }
        bundle.putBundle("params", bundle2);
        Map map2 = t5aVar.c;
        String str = null;
        if (map2 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(map2.size()));
            for (Map.Entry entry2 : map2.entrySet()) {
                linkedHashMap.put(entry2.getKey(), qee.u(entry2.getValue()));
            }
            q5fVar = new q5f(linkedHashMap);
        } else {
            q5fVar = null;
        }
        if (q5fVar != null) {
            w3f w3fVar = x3f.d;
            str = w3fVar.c(swf.g0(w3fVar.b, ern.c(w4f.class)), q5fVar);
        }
        bundle.putString("body", str);
        return bundle;
    }

    public static final tf6 X(mm6 mm6Var, CoroutineContext coroutineContext) {
        return new tf6(mm6Var.getCoroutineContext().plus(coroutineContext));
    }

    public static final void Y(Bundle bundle, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Integer) {
                bundle.putInt(str, ((Number) value).intValue());
            } else if (value instanceof String) {
                bundle.putString(str, (String) value);
            } else if (value instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) value).booleanValue());
            } else if (value instanceof Double) {
                bundle.putDouble(str, ((Number) value).doubleValue());
            } else if (value instanceof Long) {
                bundle.putLong(str, ((Number) value).longValue());
            } else if (value instanceof Float) {
                bundle.putFloat(str, ((Number) value).floatValue());
            } else if (value instanceof ArrayList) {
                bundle.putStringArrayList(str, (ArrayList) value);
            }
        }
    }

    public static final void a(mr mrVar, bci bciVar, hr hrVar, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1102891029);
        int i2 = i | (oq5Var.f(mrVar) ? 4 : 2) | (oq5Var.h(bciVar) ? 32 : 16) | (oq5Var.h(hrVar) ? 256 : 128);
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = tlm.f(R(g.a, oq5Var), oq5Var);
            }
            mm6 mm6Var = ((fs5) K).a;
            boolean z = mrVar instanceof lr;
            boolean h2 = ((i2 & 14) == 4) | oq5Var.h(hrVar) | oq5Var.h(mm6Var);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                K2 = new g3(2, mrVar, hrVar, mm6Var);
                oq5Var.k0(K2);
            }
            vq1.g(yciVar, bciVar, z, (Function1) K2, oq5Var, 70 | (i2 & 112), 4);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wl(i, 2, mrVar, bciVar, hrVar, yciVar);
        }
    }

    public static final yci a0(yci yciVar, k0f k0fVar, f0f f0fVar, int i) {
        return com.yandex.music.core.ui.compose.a.b(yciVar, null, 0L, 0.0f, null, new gva(k0fVar, f0fVar, i, 12), 15);
    }

    public static final void b(b18 b18Var, Function1 function1, hq5 hq5Var, int i) {
        boolean z;
        b18Var.getClass();
        o84 o84Var = b18Var.d;
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(675733755);
        int i2 = i | (oq5Var.f(b18Var) ? 4 : 2) | (oq5Var.h(function1) ? 32 : 16);
        int i3 = 17;
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            vci vciVar = vci.a;
            yci a2 = androidx.compose.ui.platform.a.a(vciVar, "cast_picker_device_item");
            boolean z2 = b18Var.e;
            yci c2 = com.yandex.music.core.ui.compose.b.c(a2, "cast_picker_selected", Boolean.valueOf(o84Var == o84.b));
            agr agrVar = eq0.a;
            yci b2 = androidx.compose.foundation.a.b(c2, ((dq0) oq5Var.j(agrVar)).c.c, vnj.i);
            boolean z3 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z3 || K == kjnVar) {
                K = new ap1(i3, function1, b18Var);
                oq5Var.k0(K);
            }
            yci o = androidx.compose.foundation.layout.a.o(d.d(d.g(androidx.compose.foundation.a.e(b2, false, null, null, (Function0) K, 7), 56, 0.0f, 2), 1.0f), 14, 0.0f, 2);
            nho a3 = lho.a(qx0.a, b2c.l, oq5Var, 48);
            int i4 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, o);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a3, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            float f2 = z2 ? 1.0f : 0.5f;
            hld.g(b18Var.b.a, ((dq0) oq5Var.j(agrVar)).a.a, f2, null, oq5Var, 0, 8);
            yci o2 = androidx.compose.foundation.layout.a.o(vciVar, 12, 0.0f, 2);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            yci g2 = vz1.g(1.0f, o2, true);
            ta5 a4 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i5 = oq5Var.P;
            a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, g2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a4, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            xcs.b(b18Var.c, null, d85.b(((dq0) oq5Var.j(agrVar)).b.a, f2, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), oq5Var, 0, 0, 65530);
            oq5Var = oq5Var;
            oq5Var.Z(-937352883);
            oq5Var.p(false);
            oq5Var.p(true);
            if (z2) {
                oq5Var.Z(-1000899786);
                kfh d2 = ug3.d(b2c.b, false);
                int i6 = oq5Var.P;
                a l3 = oq5Var.l();
                yci H3 = vnj.H(oq5Var, vciVar);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, d2, kb5Var);
                g0g.U(oq5Var, l3, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var, i6, kb5Var3);
                }
                g0g.U(oq5Var, H3, kb5Var4);
                int ordinal = o84Var.ordinal();
                if (ordinal == 0) {
                    oq5Var.Z(-1595868537);
                    oq5Var.p(false);
                } else if (ordinal == 1) {
                    oq5Var.Z(-1595405211);
                    w4k E = a0g.E(R.drawable.ic_check_24, 0, oq5Var);
                    yci m = d.m(vciVar, 24);
                    Object K2 = oq5Var.K();
                    if (K2 == kjnVar) {
                        K2 = new h14(16);
                        oq5Var.k0(K2);
                    }
                    gae.b(E, null, nfp.b(m, false, (Function1) K2), ((dq0) oq5Var.j(agrVar)).a.a, oq5Var, 48, 0);
                    oq5Var.p(false);
                } else {
                    if (ordinal != 2) {
                        throw vz1.i(oq5Var, 1333991729, false);
                    }
                    oq5Var.Z(-1595745591);
                    vum.b(d.m(vciVar, 24), ((dq0) oq5Var.j(agrVar)).a.a, 2, 0L, 0, oq5Var, 390, 24);
                    oq5Var = oq5Var;
                    oq5Var.p(false);
                }
                z = true;
                oq5Var.p(true);
            } else {
                z = true;
                oq5Var.Z(-1003813693);
            }
            oq5Var.p(false);
            oq5Var.p(z);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new m32(b18Var, function1, i, 17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0344 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r18v6, types: [cvl] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [fk1] */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r1v0, types: [c5b] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [c5b] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [r1u] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v3, types: [n2c] */
    /* JADX WARN: Type inference failed for: r23v3, types: [m2c] */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r2v0, types: [c5b] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [c5b] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v37, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v4, types: [c5b] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [c5b] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final i21 b0(ArtistBriefInfoDto artistBriefInfoDto) {
        c01 C;
        kjm kjmVar;
        ?? r2;
        ?? r22;
        nnk nnkVar;
        ?? r23;
        ArrayList arrayList;
        nk2 nk2Var;
        ?? r1;
        ?? r12;
        ?? r24;
        List list;
        c01 c01Var;
        ArrayList arrayList2;
        Iterator it;
        List list2;
        Object obj;
        String title;
        c01 c01Var2;
        ArrayList n2cVar;
        Iterator it2;
        ArrayList arrayList3;
        nk2 nk2Var2;
        nnk nnkVar2;
        PlaylistDomainItemDto playlist;
        eul H;
        Long millisecondsUntilRelease;
        Date date;
        WarningContent warningContent;
        kjm kjmVar2;
        artistBriefInfoDto.getClass();
        ArtistDto artist = artistBriefInfoDto.getArtist();
        if (artist == null || (C = lxe.C(artist)) == null) {
            return null;
        }
        List albums = artistBriefInfoDto.getAlbums();
        List I = albums != null ? ild.I(albums) : c5b.a;
        PreSaveDto preSave = artistBriefInfoDto.getPreSave();
        if (preSave != null) {
            String str = C.a;
            String str2 = C.b;
            CoverPath coverPath = C.k;
            str.getClass();
            str2.getClass();
            coverPath.getClass();
            String id = preSave.getId();
            if (id != null && (millisecondsUntilRelease = preSave.getMillisecondsUntilRelease()) != null) {
                long longValue = millisecondsUntilRelease.longValue();
                qc7 releaseDate = preSave.getReleaseDate();
                if (releaseDate != null && (date = releaseDate.b) != null) {
                    List c2 = t75.c(new ljm(str, str2, coverPath));
                    String coverUri = preSave.getCoverUri();
                    WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS;
                    webPath$Storage.getClass();
                    CoverPath B = etn.B(coverUri, webPath$Storage);
                    String title2 = preSave.getTitle();
                    String type = preSave.getType();
                    String contentWarning = preSave.getContentWarning();
                    if (contentWarning == null || (warningContent = WarningContent.a(contentWarning)) == null) {
                        warningContent = WarningContent.NONE;
                    }
                    WarningContent warningContent2 = warningContent;
                    Boolean isPreSaved = preSave.getIsPreSaved();
                    boolean booleanValue = isPreSaved != null ? isPreSaved.booleanValue() : false;
                    PreSaveContentRestrictionsDto contentRestrictions = preSave.getContentRestrictions();
                    kjmVar2 = new kjm(c2, id, date, longValue, B, title2, type, warningContent2, null, booleanValue, contentRestrictions != null ? cb0.G(contentRestrictions) : null);
                    kjmVar = kjmVar2;
                }
            }
            kjmVar2 = null;
            kjmVar = kjmVar2;
        } else {
            kjmVar = null;
        }
        List discographyAlbums = artistBriefInfoDto.getDiscographyAlbums();
        List I2 = discographyAlbums != null ? ild.I(discographyAlbums) : c5b.a;
        List alsoAlbums = artistBriefInfoDto.getAlsoAlbums();
        List I3 = alsoAlbums != null ? ild.I(alsoAlbums) : c5b.a;
        List lastReleases = artistBriefInfoDto.getLastReleases();
        List I4 = lastReleases != null ? ild.I(lastReleases) : c5b.a;
        List popularTracks = artistBriefInfoDto.getPopularTracks();
        List b2 = popularTracks != null ? wts.b(popularTracks) : c5b.a;
        List<VideoClipDto> popularVideoClips = artistBriefInfoDto.getPopularVideoClips();
        if (popularVideoClips != null) {
            r2 = new ArrayList();
            for (VideoClipDto videoClipDto : popularVideoClips) {
                x1u p0 = videoClipDto != null ? o2g.p0(videoClipDto) : null;
                if (p0 != null) {
                    r2.add(p0);
                }
            }
        } else {
            r2 = c5b.a;
        }
        List list3 = r2;
        List<ArtistDto> similarArtists = artistBriefInfoDto.getSimilarArtists();
        if (similarArtists != null) {
            r22 = new ArrayList();
            for (ArtistDto artistDto : similarArtists) {
                c01 C2 = artistDto != null ? lxe.C(artistDto) : null;
                if (C2 != null) {
                    r22.add(C2);
                }
            }
        } else {
            r22 = c5b.a;
        }
        List list4 = r22;
        ArtistPickDto artistPick = artistBriefInfoDto.getArtistPick();
        if (artistPick != null) {
            List<ArtistDomainItemDto> artists = artistPick.getArtists();
            if (artists != null) {
                ArrayList arrayList4 = new ArrayList();
                for (ArtistDomainItemDto artistDomainItemDto : artists) {
                    u51 K = artistDomainItemDto != null ? ltg.K(artistDomainItemDto) : null;
                    if (K != null) {
                        arrayList4.add(K);
                    }
                }
                if (arrayList4.isEmpty()) {
                    arrayList4 = null;
                }
                if (arrayList4 != null && (playlist = artistPick.getPlaylist()) != null && (H = neg.H(playlist)) != null) {
                    nnkVar2 = new nnk((List) arrayList4, H);
                    nnkVar = nnkVar2;
                }
            }
            nnkVar2 = null;
            nnkVar = nnkVar2;
        } else {
            nnkVar = null;
        }
        List<CoverPathDto> allCovers = artistBriefInfoDto.getAllCovers();
        if (allCovers != null) {
            r23 = new ArrayList();
            for (CoverPathDto coverPathDto : allCovers) {
                CoverPath H2 = coverPathDto != null ? q6k.H(coverPathDto, WebPath$Storage.AVATARS_NO_CROP) : null;
                if (H2 != null) {
                    r23.add(H2);
                }
            }
        } else {
            r23 = c5b.a;
        }
        List list5 = r23;
        BandLinkDto bandLinkDto = artistBriefInfoDto.getBandLinkDto();
        if (bandLinkDto != null) {
            String title3 = bandLinkDto.getTitle();
            if (title3 == null) {
                nk2Var2 = null;
                arrayList = null;
            } else {
                String subtitle = bandLinkDto.getSubtitle();
                arrayList = null;
                String url = bandLinkDto.getUrl();
                nk2Var2 = url == null ? null : new nk2(title3, subtitle, url, bandLinkDto.getImageUrl());
            }
            nk2Var = nk2Var2;
        } else {
            arrayList = null;
            nk2Var = null;
        }
        List<LinkDto> links = artistBriefInfoDto.getLinks();
        if (links != null) {
            r1 = new ArrayList();
            for (LinkDto linkDto : links) {
                Object D = linkDto != null ? s7g.D(linkDto) : arrayList;
                if (D != null) {
                    r1.add(D);
                }
            }
        } else {
            r1 = c5b.a;
        }
        List list6 = r1;
        List<ConcertDto> concerts = artistBriefInfoDto.getConcerts();
        if (concerts != null) {
            r12 = new ArrayList();
            for (ConcertDto concertDto : concerts) {
                Object a2 = concertDto != null ? nu5.a(concertDto) : arrayList;
                if (a2 != null) {
                    r12.add(a2);
                }
            }
        } else {
            r12 = c5b.a;
        }
        List lastRelease = artistBriefInfoDto.getLastRelease();
        List O = lastRelease != null ? CollectionsKt.O(lastRelease) : c5b.a;
        List playlists = artistBriefInfoDto.getPlaylists();
        if (playlists != null) {
            r24 = new ArrayList();
            Iterator it3 = playlists.iterator();
            while (it3.hasNext()) {
                PlaylistHeaderDto playlistHeaderDto = (PlaylistHeaderDto) it3.next();
                if (playlistHeaderDto != null) {
                    ?? I5 = uwf.I(playlistHeaderDto);
                    it2 = it3;
                    arrayList3 = I5;
                } else {
                    it2 = it3;
                    arrayList3 = arrayList;
                }
                if (arrayList3 != null) {
                    r24.add(arrayList3);
                }
                it3 = it2;
            }
        } else {
            r24 = c5b.a;
        }
        List list7 = r24;
        List extraActions = artistBriefInfoDto.getExtraActions();
        if (extraActions != null) {
            ArrayList arrayList5 = new ArrayList();
            Iterator it4 = extraActions.iterator();
            List list8 = r12;
            while (it4.hasNext()) {
                ExtraActionDto extraActionDto = (ExtraActionDto) it4.next();
                if (extraActionDto == null) {
                    it = it4;
                    list2 = list8;
                } else {
                    it = it4;
                    String type2 = extraActionDto.getType();
                    if (type2 == null) {
                        list2 = list8;
                        obj = arrayList;
                    } else {
                        list2 = list8;
                        obj = type2.equals("year-rewind") ? m2c.c : type2.equals("donation") ? m2c.b : m2c.a;
                    }
                    if (obj != null && (title = extraActionDto.getTitle()) != null) {
                        String subtitle2 = extraActionDto.getSubtitle();
                        String image = extraActionDto.getImage();
                        String color = extraActionDto.getColor();
                        c01Var2 = C;
                        boolean d2 = Intrinsics.d(extraActionDto.getViewBrowser(), Boolean.TRUE);
                        String url2 = extraActionDto.getUrl();
                        if (url2 != null) {
                            ?? r29 = (obj != m2c.b || t7a.a.e(url2)) ? url2 : arrayList;
                            if (r29 != 0) {
                                n2cVar = new n2c(obj, title, subtitle2, image, color, d2, r29);
                                if (n2cVar != null) {
                                    arrayList5.add(n2cVar);
                                }
                                it4 = it;
                                list8 = list2;
                                C = c01Var2;
                            }
                        }
                        n2cVar = arrayList;
                        if (n2cVar != null) {
                        }
                        it4 = it;
                        list8 = list2;
                        C = c01Var2;
                    }
                }
                c01Var2 = C;
                n2cVar = arrayList;
                if (n2cVar != null) {
                }
                it4 = it;
                list8 = list2;
                C = c01Var2;
            }
            list = list8;
            c01Var = C;
            if (arrayList5.isEmpty()) {
                arrayList5 = arrayList;
            }
            arrayList2 = arrayList5;
        } else {
            list = r12;
            c01Var = C;
            arrayList2 = arrayList;
        }
        String backgroundImageUrl = artistBriefInfoDto.getBackgroundImageUrl();
        WebPath$Storage webPath$Storage2 = WebPath$Storage.ENTITY_BACKGROUND_IMG;
        webPath$Storage2.getClass();
        CoverPath B2 = etn.B(backgroundImageUrl, webPath$Storage2);
        ArrayList arrayList6 = arrayList;
        List list9 = list;
        String backgroundVideoUrl = artistBriefInfoDto.getBackgroundVideoUrl();
        ArtistStatsDto stats = artistBriefInfoDto.getStats();
        ?? D2 = stats != null ? lxe.D(stats) : arrayList6;
        VibeButtonDto vibeButtonInfo = artistBriefInfoDto.getVibeButtonInfo();
        return new i21(c01Var, I, kjmVar, I3, I2, I4, b2, list3, nk2Var, list6, list4, nnkVar, list5, list9, O, list7, D2, B2, backgroundVideoUrl, vibeButtonInfo != null ? u1g.S(vibeButtonInfo) : arrayList6, arrayList2);
    }

    public static final void c(wl5 wl5Var, hq5 hq5Var, int i) {
        ol5 ol5Var;
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        float f2;
        String str2;
        vci vciVar;
        wl5Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1879801033);
        int i2 = i | (oq5Var.h(wl5Var) ? 4 : 2);
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            vci vciVar2 = vci.a;
            yci c2 = d.c(vciVar2, 1.0f);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i3 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, c2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            am5 am5Var = (am5) szf.P(new d64(wl5Var.m, 19), xl5.a, null, oq5Var, 48, 2).getValue();
            if (am5Var instanceof xl5) {
                oq5Var.Z(-609888957);
                oq5Var.p(false);
                z2 = true;
            } else if (am5Var instanceof yl5) {
                oq5Var.Z(-609887769);
                yci c3 = d.c(vciVar2, 1.0f);
                kfh d2 = ug3.d(b2c.b, false);
                int i4 = oq5Var.P;
                a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, c3);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, d2, kb5Var);
                g0g.U(oq5Var, l2, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var, i4, kb5Var3);
                }
                g0g.U(oq5Var, H2, kb5Var4);
                pd.g(0, 0, oq5Var, b.a.a(vciVar2, b2c.f));
                oq5Var.p(true);
                oq5Var.p(false);
                z2 = true;
            } else {
                if (!(am5Var instanceof zl5)) {
                    throw vz1.i(oq5Var, -609890268, false);
                }
                oq5Var.Z(-609879366);
                boolean booleanValue = ((Boolean) oq5Var.j((agr) ajg.d.c)).booleanValue();
                kjn kjnVar = gq5.a;
                if (booleanValue) {
                    oq5Var.Z(-1726319209);
                    String str3 = ((zl5) am5Var).a;
                    Object K = oq5Var.K();
                    if (K == kjnVar) {
                        f2 = 1.0f;
                        str2 = str3;
                        vciVar = vciVar2;
                        cev cevVar = new cev("postMessageBridge", "\njavascript:(function() {\n    function receiveMessage(event) {\n        postMessageBridge.onPostMessage(event.data);\n    }\n    window.addEventListener(\"message\", receiveMessage, false);\n})()\n", new q3f(new mt4(1, wl5Var, wl5.class, "onPostMessage", "onPostMessage(Ljava/lang/String;)V", 0, 6)));
                        oq5Var.k0(cevVar);
                        K = cevVar;
                    } else {
                        f2 = 1.0f;
                        str2 = str3;
                        vciVar = vciVar2;
                    }
                    cev cevVar2 = (cev) K;
                    yci c4 = d.c(vciVar, f2);
                    long j = d85.m;
                    Object K2 = oq5Var.K();
                    if (K2 == kjnVar) {
                        K2 = new xfv(127);
                        oq5Var.k0(K2);
                    }
                    xfv xfvVar = (xfv) K2;
                    cgv a0 = wyf.a0(oq5Var);
                    String str4 = str2;
                    boolean f3 = oq5Var.f(str4);
                    Object K3 = oq5Var.K();
                    if (f3 || K3 == kjnVar) {
                        K3 = szf.g0(new xcv(str4, (String) null, 6));
                        oq5Var.k0(K3);
                    }
                    z2 = true;
                    ixf.n((xcv) ((aqi) K3).getValue(), c4, null, j, xfvVar, a0, null, cevVar2, null, true, oq5Var, 100688256, 6, 0);
                    oq5Var = oq5Var;
                    oq5Var.p(false);
                    z3 = false;
                } else {
                    oq5Var.Z(-1725646943);
                    String str5 = ((zl5) am5Var).a;
                    long j2 = d85.m;
                    ol5 ol5Var2 = new ol5(wl5Var);
                    Object K4 = oq5Var.K();
                    if (K4 == kjnVar) {
                        ol5Var = ol5Var2;
                        str = str5;
                        z = true;
                        yfv yfvVar = new yfv(new q3f(new mt4(1, wl5Var, wl5.class, "onPostMessage", "onPostMessage(Ljava/lang/String;)V", 0, 7)), "postMessageBridge", "\njavascript:(function() {\n    function receiveMessage(event) {\n        postMessageBridge.onPostMessage(event.data);\n    }\n    window.addEventListener(\"message\", receiveMessage, false);\n})()\n", true);
                        oq5Var.k0(yfvVar);
                        K4 = yfvVar;
                    } else {
                        ol5Var = ol5Var2;
                        str = str5;
                        z = true;
                    }
                    yci c5 = d.c(vciVar2, 1.0f);
                    z2 = z;
                    z3 = false;
                    wxf.g(str, j2, ol5Var, (yfv) K4, c5, true, oq5Var, 225328, 0);
                    oq5Var = oq5Var;
                    oq5Var.p(false);
                }
                oq5Var.p(z3);
            }
            oq5Var.p(z2);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ll5(wl5Var, i);
        }
    }

    public static t5a c0(Bundle bundle) {
        q5f q5fVar;
        List list;
        String string = bundle.getString("path");
        if (string == null) {
            xq0.x("Path should not be null");
            return null;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            xq0.x("Params should not be null");
            return null;
        }
        String string2 = bundle.getString("body");
        if (string2 == null) {
            q5fVar = null;
        } else {
            w3f w3fVar = x3f.d;
            q5fVar = (q5f) w3fVar.b(swf.g0(w3fVar.b, ern.b(q5f.class)), string2);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle2.keySet()) {
            String[] stringArray = bundle2.getStringArray(str);
            if (stringArray == null || (list = xz0.X(stringArray)) == null) {
                list = c5b.a;
            }
            linkedHashMap.put(str, list);
        }
        return new t5a(string, linkedHashMap, q5fVar != null ? uah.m(jhp.e(new o7t(CollectionsKt.F(q5fVar.a.entrySet()), new san(27)))) : null);
    }

    public static final void d(j56 j56Var, hq5 hq5Var, int i) {
        j56 j56Var2;
        j56Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(77078647);
        if ((((oq5Var.h(j56Var) ? 4 : 2) | i) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
            j56Var2 = j56Var;
        } else {
            vci vciVar = vci.a;
            yci c2 = d.c(vciVar, 1.0f);
            c2.getClass();
            yci r = vnj.r(c2, "com.yandex.music.shared.congratulations.ui.composable.confetti.confettiEffect", new Object[0], new ep5(8));
            kfh d2 = ug3.d(b2c.f, false);
            int i2 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, r);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            iz2 iz2Var = b2c.d;
            b bVar = b.a;
            C(bVar.a(vciVar, iz2Var), oq5Var, 0);
            A(bVar.a(vciVar, b2c.b), oq5Var, 0);
            boolean h2 = oq5Var.h(j56Var);
            Object K = oq5Var.K();
            if (h2 || K == gq5.a) {
                j56Var2 = j56Var;
                e65 e65Var = new e65(0, j56Var2, j56.class, "close", "close()V", 0, 24);
                oq5Var.k0(e65Var);
                K = e65Var;
            } else {
                j56Var2 = j56Var;
            }
            cxb.e((Function0) ((h9f) K), androidx.compose.foundation.layout.a.o(vciVar, 16, 0.0f, 2), oq5Var, 48);
            oq5Var.p(true);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new kv4(j56Var2, i, 15);
        }
    }

    public static final tf6 e(CoroutineContext coroutineContext) {
        if (coroutineContext.get(o6c.l) == null) {
            coroutineContext = coroutineContext.plus(saf.p());
        }
        return new tf6(coroutineContext);
    }

    public static final DataSourceParameters f(Function1 function1) {
        lb7 lb7Var = new lb7();
        function1.invoke(lb7Var);
        return new DataSourceParameters(true, false, false, lb7Var.a, null);
    }

    public static final void g(final w48 w48Var, yci yciVar, e9g e9gVar, hq5 hq5Var, int i) {
        yci yciVar2;
        e9g e9gVar2;
        w48Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(837205832);
        if (((i | (oq5Var.f(w48Var) ? 4 : 2) | 432) & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
            e9gVar2 = e9gVar;
        } else {
            e9g e9gVar3 = e9g.a;
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new bv7(8);
                oq5Var.k0(K);
            }
            final int i2 = 0;
            wn5 C = ild.C(-1408241014, new Function2(w48Var, i2) { // from class: u48
                public final /* synthetic */ int a;
                public final /* synthetic */ w48 b;

                /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
                {
                    this.a = i2;
                    switch (i2) {
                    }
                    e9g e9gVar4 = e9g.a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i3 = this.a;
                    vci vciVar = vci.a;
                    w48 w48Var2 = this.b;
                    switch (i3) {
                        case 0:
                            e9g e9gVar4 = e9g.a;
                            hq5 hq5Var2 = (hq5) obj;
                            if ((((Integer) obj2).intValue() & 3) == 2) {
                                oq5 oq5Var2 = (oq5) hq5Var2;
                                if (oq5Var2.z()) {
                                    oq5Var2.S();
                                    break;
                                }
                            }
                            swf.d(w48Var2.a, gce.d, xp3.u(d.m(vciVar, lsq.s(e9gVar4)), lsq.r(e9gVar4, w48Var2.a, hq5Var2, 0)), null, 0L, 0L, false, hq5Var2, 48, 120);
                        default:
                            e9g e9gVar5 = e9g.a;
                            hq5 hq5Var3 = (hq5) obj;
                            if ((((Integer) obj2).intValue() & 3) == 2) {
                                oq5 oq5Var3 = (oq5) hq5Var3;
                                if (oq5Var3.z()) {
                                    oq5Var3.S();
                                    break;
                                }
                            }
                            yci d2 = d.d(vciVar, 1.0f);
                            ta5 a2 = sa5.a(qx0.c, b2c.n, hq5Var3, 0);
                            oq5 oq5Var4 = (oq5) hq5Var3;
                            int i4 = oq5Var4.P;
                            a l = oq5Var4.l();
                            yci H = vnj.H(hq5Var3, d2);
                            xp5.T.getClass();
                            grb grbVar = wp5.b;
                            oq5Var4.d0();
                            if (oq5Var4.O) {
                                oq5Var4.k(grbVar);
                            } else {
                                oq5Var4.n0();
                            }
                            g0g.U(hq5Var3, a2, wp5.f);
                            g0g.U(hq5Var3, l, wp5.e);
                            kb5 kb5Var = wp5.g;
                            if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i4))) {
                                ouj.x(i4, oq5Var4, i4, kb5Var);
                            }
                            g0g.U(hq5Var3, H, wp5.d);
                            String str = w48Var2.b;
                            h6g h6gVar = nu0.a;
                            h6g h6gVar2 = h6g.c;
                            xv7.j(str, null, ((dq0) ((oq5) hq5Var3).j(eq0.a)).b.b, 0L, 0L, 0, 0L, 2, false, 1, 0, null, nu0.j(), hq5Var3, 0, 3120, 55290);
                            oq5Var4.Z(1846478816);
                            String str2 = w48Var2.c;
                            if (str2 == null) {
                                oq5Var4.Z(1846524633);
                            } else {
                                oq5Var4.Z(1846524634);
                                gld.h(str2, hq5Var3, 0);
                            }
                            oq5Var4.p(false);
                            oq5Var4.Z(1846666489);
                            oq5Var4.p(false);
                            oq5Var4.p(false);
                            oq5Var4.p(true);
                            break;
                    }
                    return Unit.a;
                }
            }, oq5Var);
            final int i3 = 1;
            wn5 C2 = ild.C(1645876195, new Function2(w48Var, i3) { // from class: u48
                public final /* synthetic */ int a;
                public final /* synthetic */ w48 b;

                /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
                {
                    this.a = i3;
                    switch (i3) {
                    }
                    e9g e9gVar4 = e9g.a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i32 = this.a;
                    vci vciVar = vci.a;
                    w48 w48Var2 = this.b;
                    switch (i32) {
                        case 0:
                            e9g e9gVar4 = e9g.a;
                            hq5 hq5Var2 = (hq5) obj;
                            if ((((Integer) obj2).intValue() & 3) == 2) {
                                oq5 oq5Var2 = (oq5) hq5Var2;
                                if (oq5Var2.z()) {
                                    oq5Var2.S();
                                    break;
                                }
                            }
                            swf.d(w48Var2.a, gce.d, xp3.u(d.m(vciVar, lsq.s(e9gVar4)), lsq.r(e9gVar4, w48Var2.a, hq5Var2, 0)), null, 0L, 0L, false, hq5Var2, 48, 120);
                        default:
                            e9g e9gVar5 = e9g.a;
                            hq5 hq5Var3 = (hq5) obj;
                            if ((((Integer) obj2).intValue() & 3) == 2) {
                                oq5 oq5Var3 = (oq5) hq5Var3;
                                if (oq5Var3.z()) {
                                    oq5Var3.S();
                                    break;
                                }
                            }
                            yci d2 = d.d(vciVar, 1.0f);
                            ta5 a2 = sa5.a(qx0.c, b2c.n, hq5Var3, 0);
                            oq5 oq5Var4 = (oq5) hq5Var3;
                            int i4 = oq5Var4.P;
                            a l = oq5Var4.l();
                            yci H = vnj.H(hq5Var3, d2);
                            xp5.T.getClass();
                            grb grbVar = wp5.b;
                            oq5Var4.d0();
                            if (oq5Var4.O) {
                                oq5Var4.k(grbVar);
                            } else {
                                oq5Var4.n0();
                            }
                            g0g.U(hq5Var3, a2, wp5.f);
                            g0g.U(hq5Var3, l, wp5.e);
                            kb5 kb5Var = wp5.g;
                            if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i4))) {
                                ouj.x(i4, oq5Var4, i4, kb5Var);
                            }
                            g0g.U(hq5Var3, H, wp5.d);
                            String str = w48Var2.b;
                            h6g h6gVar = nu0.a;
                            h6g h6gVar2 = h6g.c;
                            xv7.j(str, null, ((dq0) ((oq5) hq5Var3).j(eq0.a)).b.b, 0L, 0L, 0, 0L, 2, false, 1, 0, null, nu0.j(), hq5Var3, 0, 3120, 55290);
                            oq5Var4.Z(1846478816);
                            String str2 = w48Var2.c;
                            if (str2 == null) {
                                oq5Var4.Z(1846524633);
                            } else {
                                oq5Var4.Z(1846524634);
                                gld.h(str2, hq5Var3, 0);
                            }
                            oq5Var4.p(false);
                            oq5Var4.Z(1846666489);
                            oq5Var4.p(false);
                            oq5Var4.p(false);
                            oq5Var4.p(true);
                            break;
                    }
                    return Unit.a;
                }
            }, oq5Var);
            vci vciVar = vci.a;
            ngg.i((Function0) K, vciVar, C, false, 0L, null, null, 0.0f, null, C2, oq5Var, 806882742, 432);
            yciVar2 = vciVar;
            e9gVar2 = e9gVar3;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new v48(w48Var, yciVar2, e9gVar2, i, 0);
        }
    }

    public static final void h(String str, hq5 hq5Var, int i) {
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-13166026);
        int i2 = i | (oq5Var2.f(str) ? 4 : 2);
        if ((i2 & 3) == 2 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            h6g h6gVar = nu0.a;
            h6g h6gVar2 = h6g.c;
            oq5Var = oq5Var2;
            xv7.j(str, null, ((dq0) oq5Var2.j(eq0.a)).b.c, 0L, 0L, 0, 0L, 2, false, 1, 0, null, nu0.i(), oq5Var, i2 & 14, 3120, 55290);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new da1(str, i, 5);
        }
    }

    public static final void i(Object obj, Object obj2, Object obj3, Function1 function1, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        boolean f2 = oq5Var.f(obj) | oq5Var.f(obj2) | oq5Var.f(obj3);
        Object K = oq5Var.K();
        if (f2 || K == gq5.a) {
            K = new ma8(function1);
            oq5Var.k0(K);
        }
    }

    public static final void j(Object obj, Object obj2, Function1 function1, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        boolean f2 = oq5Var.f(obj) | oq5Var.f(obj2);
        Object K = oq5Var.K();
        if (f2 || K == gq5.a) {
            K = new ma8(function1);
            oq5Var.k0(K);
        }
    }

    public static final void k(Object obj, Function1 function1, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        boolean f2 = oq5Var.f(obj);
        Object K = oq5Var.K();
        if (f2 || K == gq5.a) {
            K = new ma8(function1);
            oq5Var.k0(K);
        }
    }

    public static final void l(Object[] objArr, Function1 function1, hq5 hq5Var) {
        boolean z = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z |= ((oq5) hq5Var).f(obj);
        }
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        if (z || K == gq5.a) {
            oq5Var.k0(new ma8(function1));
        }
    }

    public static final void m(int i, hq5 hq5Var, yci yciVar, String str, String str2, boolean z) {
        long j;
        oq5 oq5Var;
        str.getClass();
        str2.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-792491715);
        int i2 = (oq5Var2.f(str) ? 4 : 2) | i | (oq5Var2.f(str2) ? 32 : 16) | (oq5Var2.g(z) ? 256 : 128);
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            int i3 = z ? 3 : 5;
            ges gesVar = gdg.F(oq5Var2).c;
            d85 T = pd.T(str2);
            if (T == null) {
                oq5Var2.Z(-1375314780);
                j = ((dq0) oq5Var2.j(eq0.a)).b.a;
                oq5Var2.p(false);
            } else {
                oq5Var2.Z(-1375316795);
                oq5Var2.p(false);
                j = T.a;
            }
            oq5Var = oq5Var2;
            xcs.b(str, yciVar, d85.b(j, 0.9f, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, new o9s(i3), 0L, 0, false, 0, 0, null, gesVar, oq5Var, (i2 & 14) | ((i2 >> 6) & 112), 0, 65016);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pp((Object) str, (Object) str2, z, yciVar, i, 9);
        }
    }

    public static final void n(Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-817626053);
        if (((i | (oq5Var2.h(function0) ? 4 : 2) | (oq5Var2.f(yciVar) ? 32 : 16)) & 19) == 18 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            kfh d2 = ug3.d(b2c.b, false);
            int i2 = oq5Var2.P;
            a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var2, d2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var2, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var2, i2, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var2, H, kb5Var4);
            agr agrVar = jft.c;
            ((jmn) oq5Var2.j(agrVar)).getClass();
            String M = rvf.M(R.string.recognition_error, oq5Var2);
            agr agrVar2 = jft.a;
            long j = ((tln) oq5Var2.j(agrVar2)).c;
            agr agrVar3 = jft.b;
            ges gesVar = ((kmn) oq5Var2.j(agrVar3)).b;
            iz2 iz2Var = b2c.f;
            b bVar = b.a;
            vci vciVar = vci.a;
            xcs.b(M, androidx.compose.foundation.layout.a.o(bVar.a(vciVar, iz2Var), 40, 0.0f, 2), j, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, gesVar, oq5Var2, 0, 0, 65016);
            yci o = androidx.compose.foundation.layout.a.o(d.e(d.d(bVar.a(vciVar, b2c.i), 1.0f), 50), 16, 0.0f, 2);
            Object K = oq5Var2.K();
            if (K == gq5.a) {
                K = vz1.h(oq5Var2);
            }
            yci d3 = androidx.compose.foundation.a.d(o, (uoi) K, null, false, null, null, function0, 28);
            kfh d4 = ug3.d(iz2Var, false);
            int i3 = oq5Var2.P;
            a l2 = oq5Var2.l();
            yci H2 = vnj.H(oq5Var2, d3);
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, d4, kb5Var);
            g0g.U(oq5Var2, l2, kb5Var2);
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var2, i3, kb5Var3);
            }
            g0g.U(oq5Var2, H2, kb5Var4);
            ((jmn) oq5Var2.j(agrVar)).getClass();
            xcs.b(rvf.M(R.string.recognition_retry_button, oq5Var2), null, ((tln) oq5Var2.j(agrVar2)).a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((kmn) oq5Var2.j(agrVar3)).c, oq5Var2, 0, 0, 65530);
            oq5Var = oq5Var2;
            oq5Var.p(true);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kx(function0, yciVar, i, 9);
        }
    }

    public static final void o(x5c x5cVar, t5c t5cVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var;
        kjn kjnVar;
        oq5 oq5Var2;
        cvl cvlVar;
        t5c t5cVar2;
        t5c t5cVar3 = t5cVar;
        t5cVar3.getClass();
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(855189492);
        if ((i & 6) == 0) {
            i2 = (oq5Var3.f(x5cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? oq5Var3.f(t5cVar3) : oq5Var3.h(t5cVar3) ? 32 : 16;
        }
        int i3 = i2;
        if (oq5Var3.P(i3 & 1, (i3 & 19) != 18)) {
            int i4 = i3 & 112;
            boolean z = i4 == 32 || ((i3 & 64) != 0 && oq5Var3.h(t5cVar3));
            Object K = oq5Var3.K();
            kjn kjnVar2 = gq5.a;
            if (z || K == kjnVar2) {
                kjnVar = kjnVar2;
                ceb cebVar = new ceb(0, t5cVar3, t5c.class, "onStart", "onStart()V", 0, 21);
                oq5Var3.k0(cebVar);
                K = cebVar;
            } else {
                kjnVar = kjnVar2;
            }
            Function0 function0 = (Function0) ((h9f) K);
            boolean z2 = i4 == 32 || ((i3 & 64) != 0 && oq5Var3.h(t5cVar3));
            Object K2 = oq5Var3.K();
            if (z2 || K2 == kjnVar) {
                ceb cebVar2 = new ceb(0, t5cVar3, t5c.class, "onStop", "onStop()V", 0, 22);
                oq5Var3.k0(cebVar2);
                K2 = cebVar2;
            }
            wyf.c(function0, null, null, (Function0) ((h9f) K2), null, oq5Var3, 0, 45);
            cvl a2 = x5cVar.a();
            vci vciVar = vci.a;
            yci a3 = androidx.compose.ui.platform.a.a(vciVar, "collection_favourite_playlist_block");
            ta5 a4 = sa5.a(qx0.c, b2c.n, oq5Var3, 0);
            int i5 = oq5Var3.P;
            a l = oq5Var3.l();
            yci H = vnj.H(oq5Var3, a3);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var3.d0();
            if (oq5Var3.O) {
                oq5Var3.k(grbVar);
            } else {
                oq5Var3.n0();
            }
            g0g.U(oq5Var3, a4, wp5.f);
            g0g.U(oq5Var3, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var3, i5, kb5Var);
            }
            g0g.U(oq5Var3, H, wp5.d);
            p(a2, t5cVar, oq5Var3, i4);
            yci q = androidx.compose.foundation.layout.a.q(androidx.compose.foundation.a.b(vciVar, svd.a(oq5Var3), vnj.i), 0.0f, 0.0f, 0.0f, 12, 7);
            fvf a5 = hvf.a(0, 0, oq5Var3, 0, 3);
            odc b2 = x5cVar.b();
            boolean z3 = i4 == 32 || ((i3 & 64) != 0 && oq5Var3.h(t5cVar));
            Object K3 = oq5Var3.K();
            if (z3 || K3 == kjnVar) {
                oq5Var2 = oq5Var3;
                cvlVar = a2;
                aub aubVar = new aub(1, t5cVar, t5c.class, "onFilterClicked", "onFilterClicked(Ljava/lang/String;)V", 0, 1);
                t5cVar2 = t5cVar;
                oq5Var2.k0(aubVar);
                K3 = aubVar;
            } else {
                oq5Var2 = oq5Var3;
                t5cVar2 = t5cVar;
                cvlVar = a2;
            }
            oq5Var = oq5Var2;
            azl.b(a5, b2, (Function1) ((h9f) K3), q, false, oq5Var, 0);
            if (x5cVar instanceof w5c) {
                oq5Var.Z(149794066);
                w5c w5cVar = (w5c) x5cVar;
                odc odcVar = w5cVar.b;
                mdc mdcVar = odcVar instanceof mdc ? (mdc) odcVar : null;
                t5c t5cVar4 = t5cVar2;
                F(mdcVar != null ? mdcVar.d : null, mdcVar != null ? mdcVar.c : w5cVar.c, mdcVar, cvlVar, t5cVar4, t5cVar2.g, oq5Var, (i3 << 9) & 57344);
                t5cVar3 = t5cVar4;
                oq5Var = oq5Var;
                oq5Var.p(false);
            } else {
                t5cVar3 = t5cVar2;
                cvl cvlVar2 = cvlVar;
                if (!(x5cVar instanceof v5c)) {
                    throw vz1.i(oq5Var, 1528850451, false);
                }
                oq5Var.Z(1528871862);
                E(cvlVar2.g, 0, oq5Var);
                oq5Var.p(false);
            }
            oq5Var.p(true);
        } else {
            oq5Var = oq5Var3;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gva(x5cVar, t5cVar3, i, 7);
        }
    }

    public static final void p(final cvl cvlVar, final t5c t5cVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(38486092);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(cvlVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? oq5Var.f(t5cVar) : oq5Var.h(t5cVar) ? 32 : 16;
        }
        boolean z = false;
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            wn5 C = ild.C(-352399096, new a6c(t5cVar, cvlVar.g), oq5Var);
            int i3 = i2 & 112;
            boolean h2 = (i3 == 32 || ((i2 & 64) != 0 && oq5Var.h(t5cVar))) | oq5Var.h(cvlVar);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h2 || K == kjnVar) {
                final int i4 = 0;
                K = new Function0() { // from class: b6c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                t5c t5cVar2 = t5cVar;
                                t5cVar2.getClass();
                                cvl cvlVar2 = cvlVar;
                                cvlVar2.getClass();
                                rmb.j(t5cVar2.b, wjb.PlaylistScreen, t7g.n(cvlVar2), null, 12);
                                rdk rdkVar = t5cVar2.a;
                                Activity activity = (Activity) rdkVar.b;
                                activity.startActivity(ixf.E(activity, cvlVar2, (PlaybackScope) ((jyr) rdkVar.c).getValue()));
                                break;
                            default:
                                t5c t5cVar3 = t5cVar;
                                t5cVar3.getClass();
                                cvl cvlVar3 = cvlVar;
                                cvlVar3.getClass();
                                rmb.j(t5cVar3.b, wjb.BottomsheetScreen, t7g.n(cvlVar3), null, 12);
                                rdk rdkVar2 = t5cVar3.a;
                                szf.R((y) rdkVar2.d, new qvg(g0g.H(bfg.J(cvlVar3), cvlVar3.x)), (PlaybackScope) ((jyr) rdkVar2.c).getValue());
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K);
            }
            Function0 function0 = (Function0) K;
            if (i3 == 32 || ((i2 & 64) != 0 && oq5Var.h(t5cVar))) {
                z = true;
            }
            boolean h3 = oq5Var.h(cvlVar) | z;
            Object K2 = oq5Var.K();
            if (h3 || K2 == kjnVar) {
                final int i5 = 1;
                K2 = new Function0() { // from class: b6c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i5) {
                            case 0:
                                t5c t5cVar2 = t5cVar;
                                t5cVar2.getClass();
                                cvl cvlVar2 = cvlVar;
                                cvlVar2.getClass();
                                rmb.j(t5cVar2.b, wjb.PlaylistScreen, t7g.n(cvlVar2), null, 12);
                                rdk rdkVar = t5cVar2.a;
                                Activity activity = (Activity) rdkVar.b;
                                activity.startActivity(ixf.E(activity, cvlVar2, (PlaybackScope) ((jyr) rdkVar.c).getValue()));
                                break;
                            default:
                                t5c t5cVar3 = t5cVar;
                                t5cVar3.getClass();
                                cvl cvlVar3 = cvlVar;
                                cvlVar3.getClass();
                                rmb.j(t5cVar3.b, wjb.BottomsheetScreen, t7g.n(cvlVar3), null, 12);
                                rdk rdkVar2 = t5cVar3.a;
                                szf.R((y) rdkVar2.d, new qvg(g0g.H(bfg.J(cvlVar3), cvlVar3.x)), (PlaybackScope) ((jyr) rdkVar2.c).getValue());
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K2);
            }
            o2g.i(C, function0, (Function0) K2, androidx.compose.ui.platform.a.a(vci.a, "collection_favourite_playlist_block_header"), false, oq5Var, 3078, 16);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gva(cvlVar, t5cVar, i, 6);
        }
    }

    public static t2o q(int i, tqc tqcVar, int i2, int i3) {
        if ((i3 & 2) != 0) {
            tqcVar = tqc.m;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return new t2o(i, tqcVar, i2, new rqc(new qqc[0]));
    }

    public static final void r(int i, hq5 hq5Var, yci yciVar, w4k w4kVar, String str, Function0 function0) {
        int i2;
        w4kVar.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(253658692);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(w4kVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci n = d.n(((jx7) oq5Var.j(es5.h)).m(w4kVar.i()), ksw.D(yciVar, str, null));
            boolean h2 = ((i2 & 112) == 32) | oq5Var.h(w4kVar);
            Object K = oq5Var.K();
            if (h2 || K == gq5.a) {
                K = new dae(0, w4kVar, function0);
                oq5Var.k0(K);
            }
            ug3.a(androidx.compose.ui.draw.a.c(n, (Function1) K), oq5Var, 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gz7(w4kVar, function0, str, yciVar, i);
        }
    }

    public static final void s(pze pzeVar, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1723725800);
        int i2 = ((i & 6) == 0 ? (oq5Var.f(pzeVar) ? 4 : 2) | i : i) | 48;
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            vci vciVar = vci.a;
            yci d2 = d.d(vciVar, 1.0f);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i3 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, d2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            oq5Var.Z(-1316717853);
            int i4 = pzeVar.b;
            for (int i5 = 0; i5 < i4; i5++) {
                cxb.r(0, oq5Var, null, pzeVar.a);
            }
            oq5Var.p(false);
            oq5Var.p(true);
            yciVar = vciVar;
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gva(pzeVar, yciVar, i, 13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:277:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(qze qzeVar, k0f k0fVar, yci yciVar, Function1 function1, hq5 hq5Var, int i, int i2) {
        Function1 function12;
        int i3;
        k0f k0fVar2;
        yci yciVar2;
        Function1 function13;
        xmn r;
        Function1 function14;
        yci yciVar3;
        k0f k0fVar3;
        float f2;
        k0f k0fVar4;
        int i4;
        boolean z;
        Object le0Var;
        c0f c0fVar;
        int i5;
        k0f k0fVar5;
        Object le0Var2;
        int i6;
        k0f k0fVar6;
        Object le0Var3;
        f0f f0fVar;
        k0f k0fVar7 = k0fVar;
        qzeVar.getClass();
        k0fVar7.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2079562518);
        int i7 = (i & 6) == 0 ? (oq5Var.f(qzeVar) ? 4 : 2) | i : i;
        int i8 = 32;
        if ((i & 48) == 0) {
            i7 |= (i & 64) == 0 ? oq5Var.f(k0fVar7) : oq5Var.h(k0fVar7) ? 32 : 16;
        }
        int i9 = i7 | 384;
        int i10 = i2 & 8;
        if (i10 != 0) {
            i9 = i7 | 3456;
        } else if ((i & 3072) == 0) {
            function12 = function1;
            i9 |= oq5Var.h(function12) ? 2048 : 1024;
            i3 = i9;
            if (oq5Var.P(i3 & 1, (i3 & 1171) == 1170)) {
                k0fVar2 = k0fVar7;
                oq5Var.S();
                yciVar2 = yciVar;
                function13 = function12;
            } else {
                kjn kjnVar = gq5.a;
                if (i10 != 0) {
                    Object K = oq5Var.K();
                    if (K == kjnVar) {
                        K = new mke(25);
                        oq5Var.k0(K);
                    }
                    function12 = (Function1) K;
                }
                yciVar2 = vci.a;
                float f3 = 1.0f;
                yci d2 = d.d(yciVar2, 1.0f);
                ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
                int i11 = oq5Var.P;
                a l = oq5Var.l();
                yci H = vnj.H(oq5Var, d2);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, a2, wp5.f);
                g0g.U(oq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i11))) {
                    ouj.x(i11, oq5Var, i11, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                oq5Var.Z(875709544);
                int i12 = 0;
                for (Object obj : qzeVar.a) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        u75.n();
                        throw null;
                    }
                    f0f f0fVar2 = (f0f) obj;
                    if (f0fVar2 instanceof yze) {
                        oq5Var.Z(1526012708);
                        yze yzeVar = (yze) f0fVar2;
                        yci b2 = com.yandex.music.core.ui.compose.b.b(a0(d.d((yci) function12.invoke(f0fVar2), f3), k0fVar7, f0fVar2, i12), i12);
                        boolean f4 = oq5Var.f(f0fVar2) | ((i3 & 112) == i8 || ((i3 & 64) != 0 && oq5Var.h(k0fVar7))) | oq5Var.d(i12);
                        Object K2 = oq5Var.K();
                        if (f4 || K2 == kjnVar) {
                            K2 = new v50(k0fVar7, yzeVar, i12, 11);
                            oq5Var.k0(K2);
                        }
                        cxb.s(yzeVar, (Function1) K2, b2, oq5Var, 0);
                        oq5Var.p(false);
                        yciVar3 = yciVar2;
                        k0fVar4 = k0fVar7;
                        f2 = f3;
                        i4 = i8;
                        function14 = function12;
                    } else {
                        if (f0fVar2 instanceof wze) {
                            oq5Var.Z(1850354663);
                            wze wzeVar = (wze) f0fVar2;
                            boolean z2 = (i3 & 112) == i8 || ((i3 & 64) != 0 && oq5Var.h(k0fVar7));
                            Object K3 = oq5Var.K();
                            if (z2 || K3 == kjnVar) {
                                yciVar3 = yciVar2;
                                f2 = f3;
                                f0fVar = f0fVar2;
                                function14 = function12;
                                le0Var3 = new le0(2, k0fVar7, k0f.class, "onArtistClicked", "onArtistClicked(Lru/yandex/music/data/domainitem/ArtistDomainItem;I)V", 0, 17);
                                k0fVar3 = k0fVar7;
                                oq5Var.k0(le0Var3);
                            } else {
                                function14 = function12;
                                yciVar3 = yciVar2;
                                f2 = f3;
                                f0fVar = f0fVar2;
                                le0Var3 = K3;
                                k0fVar3 = k0fVar7;
                            }
                            cxb.p(wzeVar, i12, (Function2) ((h9f) le0Var3), a0((yci) function14.invoke(f0fVar), k0fVar3, f0fVar, i12), oq5Var, 0);
                            oq5Var.p(false);
                        } else {
                            function14 = function12;
                            yciVar3 = yciVar2;
                            k0fVar3 = k0fVar7;
                            f2 = f3;
                            if (f0fVar2 instanceof vze) {
                                oq5Var.Z(1526743998);
                                vze vzeVar = (vze) f0fVar2;
                                boolean z3 = (i3 & 112) == 32 || ((i3 & 64) != 0 && oq5Var.h(k0fVar3));
                                Object K4 = oq5Var.K();
                                if (z3 || K4 == kjnVar) {
                                    le0 le0Var4 = new le0(2, k0fVar, k0f.class, "onAlbumClicked", "onAlbumClicked(Lru/yandex/music/data/domainitem/AlbumDomainItem;I)V", 0, 18);
                                    k0fVar3 = k0fVar;
                                    oq5Var.k0(le0Var4);
                                    K4 = le0Var4;
                                }
                                cxb.o(vzeVar, i12, (Function2) ((h9f) K4), a0((yci) function14.invoke(f0fVar2), k0fVar3, f0fVar2, i12), oq5Var, 0);
                                oq5Var.p(false);
                            } else if (f0fVar2 instanceof zze) {
                                oq5Var.Z(1527135094);
                                zze zzeVar = (zze) f0fVar2;
                                boolean z4 = (i3 & 112) == 32 || ((i3 & 64) != 0 && oq5Var.h(k0fVar3));
                                Object K5 = oq5Var.K();
                                if (z4 || K5 == kjnVar) {
                                    le0 le0Var5 = new le0(2, k0fVar, k0f.class, "onAlbumClicked", "onAlbumClicked(Lru/yandex/music/data/domainitem/AlbumDomainItem;I)V", 0, 19);
                                    k0fVar3 = k0fVar;
                                    oq5Var.k0(le0Var5);
                                    K5 = le0Var5;
                                }
                                cxb.t(zzeVar, i12, (Function2) ((h9f) K5), a0((yci) function14.invoke(f0fVar2), k0fVar3, f0fVar2, i12), oq5Var, 0);
                                oq5Var.p(false);
                            } else if (f0fVar2 instanceof xze) {
                                oq5Var.Z(1850390317);
                                xze xzeVar = (xze) f0fVar2;
                                int i14 = i3 & 112;
                                boolean z5 = i14 == 32 || ((i3 & 64) != 0 && oq5Var.h(k0fVar3));
                                Object K6 = oq5Var.K();
                                if (z5 || K6 == kjnVar) {
                                    i6 = i14;
                                    k0fVar6 = k0fVar;
                                    le0Var2 = new le0(2, k0fVar6, k0f.class, "onClipClicked", "onClipClicked(Lru/yandex/music/data/audio/VideoClip;I)V", 0, 20);
                                    oq5Var.k0(le0Var2);
                                } else {
                                    i6 = i14;
                                    le0Var2 = K6;
                                    k0fVar6 = k0fVar3;
                                }
                                Function2 function2 = (Function2) ((h9f) le0Var2);
                                boolean z6 = i6 == 32 || ((i3 & 64) != 0 && oq5Var.h(k0fVar6));
                                Object K7 = oq5Var.K();
                                if (z6 || K7 == kjnVar) {
                                    K7 = new aub(1, k0fVar6, k0f.class, "onClipOverflowClicked", "onClipOverflowClicked(Lru/yandex/music/data/audio/VideoClip;)V", 0, 19);
                                    k0fVar4 = k0fVar6;
                                    oq5Var.k0(K7);
                                } else {
                                    k0fVar4 = k0fVar6;
                                }
                                oq5 oq5Var2 = oq5Var;
                                cxb.q(xzeVar, i12, function2, (Function1) ((h9f) K7), a0((yci) function14.invoke(f0fVar2), k0fVar4, f0fVar2, i12), oq5Var2, 0);
                                oq5Var2.p(false);
                                oq5Var = oq5Var2;
                                i4 = 32;
                            } else {
                                k0fVar4 = k0fVar3;
                                oq5 oq5Var3 = oq5Var;
                                int i15 = i12;
                                if (f0fVar2 instanceof d0f) {
                                    oq5Var3.Z(1850403175);
                                    d0f d0fVar = (d0f) f0fVar2;
                                    kxi d3 = k0fVar4.d();
                                    boolean f5 = ((i3 & 112) == 32 || ((i3 & 64) != 0 && oq5Var3.h(k0fVar4))) | oq5Var3.f(f0fVar2) | oq5Var3.d(i15);
                                    Object K8 = oq5Var3.K();
                                    if (f5 || K8 == kjnVar) {
                                        K8 = new de(k0fVar4, d0fVar, i15, 22);
                                        oq5Var3.k0(K8);
                                    }
                                    cxb.x(d0fVar, i15, d3, (Function0) K8, a0((yci) function14.invoke(f0fVar2), k0fVar4, f0fVar2, i15), oq5Var3, 0);
                                    oq5Var = oq5Var3;
                                    oq5Var.p(false);
                                } else {
                                    oq5Var = oq5Var3;
                                    if (f0fVar2 instanceof a0f) {
                                        oq5Var.Z(1850423597);
                                        a0f a0fVar = (a0f) f0fVar2;
                                        boolean z7 = (i3 & 112) == 32 || ((i3 & 64) != 0 && oq5Var.h(k0fVar4));
                                        Object K9 = oq5Var.K();
                                        if (z7 || K9 == kjnVar) {
                                            le0 le0Var6 = new le0(2, k0fVar4, k0f.class, "onPlaylistClicked", "onPlaylistClicked(Lru/yandex/music/data/domainitem/PlaylistDomainItem;I)V", 0, 21);
                                            k0fVar3 = k0fVar4;
                                            oq5Var.k0(le0Var6);
                                            K9 = le0Var6;
                                        } else {
                                            k0fVar3 = k0fVar4;
                                        }
                                        cxb.u(a0fVar, i15, (Function2) ((h9f) K9), a0((yci) function14.invoke(f0fVar2), k0fVar3, f0fVar2, i15), oq5Var, 0);
                                        oq5Var.p(false);
                                    } else if (f0fVar2 instanceof c0f) {
                                        oq5Var.Z(1850434454);
                                        c0f c0fVar2 = (c0f) f0fVar2;
                                        int i16 = i3 & 112;
                                        boolean z8 = i16 == 32 || ((i3 & 64) != 0 && oq5Var.h(k0fVar4));
                                        Object K10 = oq5Var.K();
                                        if (z8 || K10 == kjnVar) {
                                            c0fVar = c0fVar2;
                                            i5 = i16;
                                            k0fVar5 = k0fVar;
                                            le0Var = new le0(2, k0fVar5, k0f.class, "onTrackClicked", "onTrackClicked(Lru/yandex/music/data/audio/Track;I)V", 0, 22);
                                            oq5Var.k0(le0Var);
                                        } else {
                                            c0fVar = c0fVar2;
                                            i5 = i16;
                                            le0Var = K10;
                                            k0fVar5 = k0fVar4;
                                        }
                                        Function2 function22 = (Function2) ((h9f) le0Var);
                                        boolean z9 = i5 == 32 || ((i3 & 64) != 0 && oq5Var.h(k0fVar5));
                                        Object K11 = oq5Var.K();
                                        if (z9 || K11 == kjnVar) {
                                            aub aubVar = new aub(1, k0fVar5, k0f.class, "onTrackOverflowClicked", "onTrackOverflowClicked(Lru/yandex/music/data/audio/Track;)V", 0, 18);
                                            oq5Var.k0(aubVar);
                                            K11 = aubVar;
                                        }
                                        Function1 function15 = (Function1) ((h9f) K11);
                                        boolean z10 = i5 == 32 || ((i3 & 64) != 0 && oq5Var.h(k0fVar5));
                                        Object K12 = oq5Var.K();
                                        if (z10 || K12 == kjnVar) {
                                            K12 = new y66(1, k0fVar5, k0f.class, "onTrackLongClick", "onTrackLongClick(Lru/yandex/music/data/audio/Track;)Z", 8, 1);
                                            k0fVar4 = k0fVar5;
                                            oq5Var.k0(K12);
                                        } else {
                                            k0fVar4 = k0fVar5;
                                        }
                                        cxb.w(c0fVar, i15, function22, function15, (Function1) K12, a0((yci) function14.invoke(f0fVar2), k0fVar4, f0fVar2, i15), oq5Var, 0);
                                        oq5Var.p(false);
                                    } else {
                                        k0fVar4 = k0fVar4;
                                        if (f0fVar2 instanceof e0f) {
                                            oq5Var.Z(1529378223);
                                            if (((Boolean) oq5Var.j((agr) spg.d.c)).booleanValue()) {
                                                oq5Var.Z(1529436286);
                                                e0f e0fVar = (e0f) f0fVar2;
                                                kxi d4 = k0fVar4.d();
                                                boolean f6 = ((i3 & 112) == 32 || ((i3 & 64) != 0 && oq5Var.h(k0fVar4))) | oq5Var.f(f0fVar2) | oq5Var.d(i15);
                                                Object K13 = oq5Var.K();
                                                if (f6 || K13 == kjnVar) {
                                                    K13 = new de(k0fVar4, e0fVar, i15, 23);
                                                    oq5Var.k0(K13);
                                                }
                                                cxb.y(e0fVar, i15, d4, (Function0) K13, a0((yci) function14.invoke(f0fVar2), k0fVar4, f0fVar2, i15), oq5Var, 0);
                                                z = false;
                                            } else {
                                                z = false;
                                                oq5Var.Z(1523805043);
                                            }
                                            oq5Var.p(z);
                                            oq5Var.p(z);
                                        } else {
                                            if (!(f0fVar2 instanceof b0f)) {
                                                throw vz1.i(oq5Var, 1850344437, false);
                                            }
                                            oq5Var.Z(1850478498);
                                            b0f b0fVar = (b0f) f0fVar2;
                                            kxi d5 = k0fVar4.d();
                                            int i17 = i3 & 112;
                                            boolean f7 = (i17 == 32 || ((i3 & 64) != 0 && oq5Var.h(k0fVar4))) | oq5Var.f(f0fVar2) | oq5Var.d(i15);
                                            Object K14 = oq5Var.K();
                                            if (f7 || K14 == kjnVar) {
                                                K14 = new de(k0fVar4, b0fVar, i15, 24);
                                                oq5Var.k0(K14);
                                            }
                                            Function0 function0 = (Function0) K14;
                                            i4 = 32;
                                            boolean f8 = oq5Var.f(f0fVar2) | (i17 == 32 || ((i3 & 64) != 0 && oq5Var.h(k0fVar4))) | oq5Var.d(i15);
                                            Object K15 = oq5Var.K();
                                            if (f8 || K15 == kjnVar) {
                                                K15 = new l0f(k0fVar4, b0fVar, i15, 0);
                                                oq5Var.k0(K15);
                                            }
                                            cxb.v(b0fVar, i15, d5, function0, (l0f) K15, a0((yci) function14.invoke(f0fVar2), k0fVar4, f0fVar2, i15), oq5Var, 0);
                                            oq5Var.p(false);
                                        }
                                    }
                                }
                                i4 = 32;
                            }
                        }
                        k0fVar4 = k0fVar3;
                        i4 = 32;
                    }
                    k0fVar7 = k0fVar4;
                    function12 = function14;
                    i8 = i4;
                    i12 = i13;
                    yciVar2 = yciVar3;
                    f3 = f2;
                }
                k0fVar2 = k0fVar7;
                oq5Var.p(false);
                oq5Var.p(true);
                function13 = function12;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new hq(qzeVar, k0fVar2, yciVar2, function13, i, i2, 14);
                return;
            }
            return;
        }
        function12 = function1;
        i3 = i9;
        if (oq5Var.P(i3 & 1, (i3 & 1171) == 1170)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void u(lze lzeVar, yci yciVar, hq5 hq5Var, int i) {
        lzeVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2033786694);
        int i2 = (oq5Var.f(lzeVar) ? 4 : 2) | i | 48;
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            rze rzeVar = (rze) szf.Q(lzeVar.d, oq5Var).getValue();
            wn5 C = ild.C(13711400, new tt5(18, lzeVar), oq5Var);
            vci vciVar = vci.a;
            tt0.g(rzeVar, vciVar, null, "ItemListBlockCrossfade", C, oq5Var, 27696, 4);
            yciVar = vciVar;
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new t1b(lzeVar, yciVar, i, 15);
        }
    }

    public static final void v(ml4 ml4Var, hvq hvqVar, hq5 hq5Var, int i) {
        int i2;
        ml4Var.getClass();
        hvqVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1842157397);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(ml4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(hvqVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object obj = (dzf) oq5Var.j(ykg.a);
            Object o0 = szf.o0(ml4Var, oq5Var);
            final hwq t = hvqVar.t();
            Object k = hvqVar.k();
            Object K = oq5Var.K();
            Object obj2 = gq5.a;
            if (K == obj2) {
                K = szf.g0(null);
                oq5Var.k0(K);
            }
            aqi aqiVar = (aqi) K;
            boolean h2 = oq5Var.h(obj) | oq5Var.h(k) | oq5Var.f(o0);
            Object K2 = oq5Var.K();
            if (h2 || K2 == obj2) {
                Object yeVar = new ye(obj, k, o0, aqiVar, 22);
                oq5Var.k0(yeVar);
                K2 = yeVar;
            }
            final Function0 function0 = (Function0) K2;
            boolean h3 = oq5Var.h(t) | oq5Var.f(function0);
            Object K3 = oq5Var.K();
            if (h3 || K3 == obj2) {
                final int i3 = 0;
                K3 = new Function0() { // from class: knf
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                t.d();
                                function0.invoke();
                                break;
                            default:
                                t.i();
                                function0.invoke();
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K3);
            }
            Function0 function02 = (Function0) K3;
            boolean f2 = oq5Var.f(function0);
            Object K4 = oq5Var.K();
            if (f2 || K4 == obj2) {
                K4 = new or(23, function0);
                oq5Var.k0(K4);
            }
            Function0 function03 = (Function0) K4;
            boolean f3 = oq5Var.f(function0);
            Object K5 = oq5Var.K();
            if (f3 || K5 == obj2) {
                K5 = new or(24, function0);
                oq5Var.k0(K5);
            }
            Function0 function04 = (Function0) K5;
            boolean h4 = oq5Var.h(t) | oq5Var.f(function0);
            Object K6 = oq5Var.K();
            if (h4 || K6 == obj2) {
                final int i4 = 1;
                K6 = new Function0() { // from class: knf
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                t.d();
                                function0.invoke();
                                break;
                            default:
                                t.i();
                                function0.invoke();
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K6);
            }
            wyf.c(function02, function03, function04, (Function0) K6, null, oq5Var, 0, 33);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lnf(ml4Var, hvqVar, i, 0);
        }
    }

    public static final void w(hq5 hq5Var, Object obj, Function2 function2) {
        oq5 oq5Var = (oq5) hq5Var;
        CoroutineContext i = oq5Var.b.i();
        boolean f2 = oq5Var.f(obj);
        Object K = oq5Var.K();
        if (f2 || K == gq5.a) {
            K = new bof(i, function2);
            oq5Var.k0(K);
        }
    }

    public static final void x(Object obj, Object obj2, Object obj3, Function2 function2, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        CoroutineContext i = oq5Var.b.i();
        boolean f2 = oq5Var.f(obj) | oq5Var.f(obj2) | oq5Var.f(obj3);
        Object K = oq5Var.K();
        if (f2 || K == gq5.a) {
            K = new bof(i, function2);
            oq5Var.k0(K);
        }
    }

    public static final void y(Object obj, Object obj2, Function2 function2, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        CoroutineContext i = oq5Var.b.i();
        boolean f2 = oq5Var.f(obj) | oq5Var.f(obj2);
        Object K = oq5Var.K();
        if (f2 || K == gq5.a) {
            K = new bof(i, function2);
            oq5Var.k0(K);
        }
    }

    public static final void z(Object[] objArr, Function2 function2, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        CoroutineContext i = oq5Var.b.i();
        boolean z = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z |= oq5Var.f(obj);
        }
        Object K = oq5Var.K();
        if (z || K == gq5.a) {
            oq5Var.k0(new bof(i, function2));
        }
    }

    public abstract int Z();
}
