package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.music.core.ui.compose.b;
import com.yandex.music.shared.relay.common.proto.f;
import com.yandex.music.shared.relay.common.proto.g;
import com.yandex.music.shared.relay.common.proto.q;
import com.yandex.music.shared.relay.common.proto.r;
import com.yandex.music.shared.relay.common.proto.s;
import com.yandex.music.shared.relay.common.proto.t;
import com.yandex.music.shared.relay.common.proto.u;
import com.yandex.music.shared.relay.common.proto.v;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import okhttp3.OkHttpClient;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes.dex */
public abstract class dag implements qsq {
    public static final String A(int i, boolean z) {
        l18 l18Var = l18.b;
        bdt I = hag.I(o8q.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        return lsq.C(i, (o8q) qdcVar.C(I), R.string.added_to_collection_content_description, z);
    }

    public static final apo B(Function2 function2, Function1 function1) {
        t30 t30Var = new t30(function2, 2);
        wct.o(1, function1);
        apo apoVar = bpo.a;
        return new apo(0, t30Var, function1);
    }

    public static yci C(yci yciVar, float f) {
        return nfp.b(yciVar, true, new jvm(f, new fq4(0.0f, 1.0f), 0));
    }

    public static boolean D(Context context) {
        ApplicationInfo applicationInfo;
        Intent putExtra = new Intent().addFlags(268435456).setAction("com.android.settings.panel.action.MEDIA_OUTPUT").putExtra("com.android.settings.panel.extra.PACKAGE_NAME", context.getPackageName());
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(putExtra, 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && (applicationInfo = activityInfo.applicationInfo) != null && (applicationInfo.flags & 129) != 0) {
                context.startActivity(putExtra);
                return true;
            }
        }
        return false;
    }

    public static final hja E(css cssVar) {
        cssVar.getClass();
        int ordinal = cssVar.ordinal();
        if (ordinal == 0) {
            return hja.d;
        }
        if (ordinal == 1) {
            return hja.b;
        }
        if (ordinal == 2) {
            return hja.c;
        }
        if (ordinal == 3) {
            return hja.a;
        }
        if (ordinal == 4) {
            return hja.a;
        }
        b6e.s();
        return null;
    }

    public static final gkb F(vik vikVar) {
        vikVar.getClass();
        switch (vikVar.ordinal()) {
            case 0:
                return gkb.Album;
            case 1:
                return gkb.Artist;
            case 2:
                return gkb.Playlist;
            case 3:
                return gkb.Track;
            case 4:
                return gkb.Auth;
            case 5:
                return gkb.PodcastTab;
            case 6:
                return gkb.KidsTab;
            case 7:
                return gkb.Deeplink;
            case 8:
                return gkb.Debug;
            case 9:
                return gkb.Push;
            case 10:
                return gkb.Unknown;
            default:
                b6e.s();
                return null;
        }
    }

    public static final nlb G(bjk bjkVar) {
        int ordinal = bjkVar.ordinal();
        if (ordinal == 0) {
            return nlb.Bdu;
        }
        if (ordinal == 1) {
            return nlb.BduOption;
        }
        b6e.s();
        return null;
    }

    public static final g H(jzs jzsVar, ppe ppeVar, skr skrVar) {
        s9p s9pVar;
        s4v s4vVar;
        int i;
        int i2;
        String str;
        String str2;
        mqs mqsVar = jzsVar.a;
        String str3 = mqsVar.a;
        String str4 = jzsVar.i;
        String str5 = mqsVar.c;
        long j = mqsVar.e;
        CoverPath coverPath = mqsVar.w;
        String uri = coverPath != null ? coverPath.getUri() : null;
        mqs mqsVar2 = jzsVar.a;
        String str6 = mqsVar2.q;
        k10 k10Var = mqsVar2.d;
        String str7 = k10Var.a;
        String str8 = k10Var.d;
        String str9 = k10Var.b;
        List list = mqsVar2.f;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zp2 zp2Var = (zp2) it.next();
            String str10 = zp2Var.a;
            String str11 = zp2Var.b;
            Iterator it2 = it;
            itn itnVar = (itn) f.d.createBuilder();
            if (str10 != null) {
                itnVar.d();
                str = str9;
                f fVar = (f) itnVar.b;
                fVar.getClass();
                str2 = str8;
                fVar.a |= 1;
                fVar.b = str10;
            } else {
                str = str9;
                str2 = str8;
            }
            if (str11 != null) {
                itnVar.d();
                f fVar2 = (f) itnVar.b;
                fVar2.getClass();
                fVar2.a |= 2;
                fVar2.c = str11;
            }
            arrayList.add((f) itnVar.b());
            str9 = str;
            it = it2;
            str8 = str2;
        }
        String str12 = str9;
        String str13 = str8;
        wzu wzuVar = (wzu) v.c.createBuilder();
        wzuVar.getClass();
        izs izsVar = jzsVar.g;
        if (Intrinsics.d(izsVar, hzs.a)) {
            c5b c5bVar = c5b.a;
            c5bVar.getClass();
            yzu yzuVar = (yzu) t.b.createBuilder();
            yzuVar.d();
            t tVar = (t) yzuVar.b;
            rse rseVar = tVar.a;
            if (!((u8) rseVar).a) {
                tVar.a = o3d.mutableCopy(rseVar);
            }
            c8.addAll(c5bVar, tVar.a);
            t tVar2 = (t) yzuVar.b();
            wzuVar.d();
            v vVar = (v) wzuVar.b;
            vVar.getClass();
            vVar.b = tVar2;
            vVar.a = 5;
        } else {
            if (!(izsVar instanceof e6v)) {
                b6e.s();
                return null;
            }
            e6v e6vVar = (e6v) izsVar;
            if (e6vVar instanceof b6v) {
                r3q r3qVar = ((b6v) e6vVar).a;
                if (r3qVar instanceof j3q) {
                    j3q j3qVar = (j3q) r3qVar;
                    String str14 = j3qVar.a.a;
                    String str15 = j3qVar.b.a;
                    uzu uzuVar = (uzu) q.d.createBuilder();
                    if (str14 != null) {
                        uzuVar.d();
                        q qVar = (q) uzuVar.b;
                        qVar.getClass();
                        qVar.a |= 1;
                        qVar.b = str14;
                    }
                    if (str15 != null) {
                        uzuVar.d();
                        q qVar2 = (q) uzuVar.b;
                        qVar2.getClass();
                        qVar2.a |= 2;
                        qVar2.c = str15;
                    }
                    q qVar3 = (q) uzuVar.b();
                    wzuVar.d();
                    v vVar2 = (v) wzuVar.b;
                    vVar2.getClass();
                    vVar2.b = qVar3;
                    vVar2.a = 2;
                } else if (r3qVar instanceof l3q) {
                    l3q l3qVar = (l3q) r3qVar;
                    String str16 = l3qVar.a.a;
                    String str17 = l3qVar.b.a;
                    vzu vzuVar = (vzu) r.d.createBuilder();
                    if (str16 != null) {
                        vzuVar.d();
                        r rVar = (r) vzuVar.b;
                        rVar.getClass();
                        rVar.a |= 1;
                        rVar.b = str16;
                    }
                    if (str17 != null) {
                        vzuVar.d();
                        r rVar2 = (r) vzuVar.b;
                        rVar2.getClass();
                        rVar2.a |= 2;
                        rVar2.c = str17;
                    }
                    r rVar3 = (r) vzuVar.b();
                    wzuVar.d();
                    v vVar3 = (v) wzuVar.b;
                    vVar3.getClass();
                    vVar3.b = rVar3;
                    vVar3.a = 3;
                } else if (r3qVar instanceof p3q) {
                    p3q p3qVar = (p3q) r3qVar;
                    String id = p3qVar.a.getId();
                    String str18 = p3qVar.c.a;
                    xzu xzuVar = (xzu) s.d.createBuilder();
                    xzuVar.d();
                    s sVar = (s) xzuVar.b;
                    sVar.getClass();
                    sVar.a |= 1;
                    sVar.b = id;
                    if (str18 != null) {
                        xzuVar.d();
                        s sVar2 = (s) xzuVar.b;
                        sVar2.getClass();
                        sVar2.a |= 2;
                        sVar2.c = str18;
                    }
                    s sVar3 = (s) xzuVar.b();
                    wzuVar.d();
                    v vVar4 = (v) wzuVar.b;
                    vVar4.getClass();
                    vVar4.b = sVar3;
                    vVar4.a = 4;
                } else {
                    if (!(r3qVar instanceof m3q)) {
                        b6e.s();
                        return null;
                    }
                    List list2 = ((m3q) r3qVar).a.a;
                    list2.getClass();
                    yzu yzuVar2 = (yzu) t.b.createBuilder();
                    List list3 = list2;
                    yzuVar2.d();
                    t tVar3 = (t) yzuVar2.b;
                    rse rseVar2 = tVar3.a;
                    if (!((u8) rseVar2).a) {
                        tVar3.a = o3d.mutableCopy(rseVar2);
                    }
                    c8.addAll(list3, tVar3.a);
                    t tVar4 = (t) yzuVar2.b();
                    wzuVar.d();
                    v vVar5 = (v) wzuVar.b;
                    vVar5.getClass();
                    vVar5.b = tVar4;
                    vVar5.a = 5;
                }
            } else {
                if (!(e6vVar instanceof d6v)) {
                    b6e.s();
                    return null;
                }
                z4q z4qVar = ((d6v) e6vVar).a;
                if (z4qVar instanceof s4q) {
                    s4q s4qVar = (s4q) z4qVar;
                    s9pVar = s4qVar.a.a;
                    s4vVar = s4qVar.c;
                } else if (z4qVar instanceof u4q) {
                    u4q u4qVar = (u4q) z4qVar;
                    s9pVar = u4qVar.a.a;
                    s4vVar = u4qVar.c;
                } else {
                    if (!(z4qVar instanceof w4q)) {
                        b6e.s();
                        return null;
                    }
                    w4q w4qVar = (w4q) z4qVar;
                    s9pVar = w4qVar.a.a;
                    s4vVar = w4qVar.c;
                }
                String str19 = s4vVar.a;
                String str20 = s4vVar.b;
                str19.getClass();
                s9pVar.getClass();
                g9p a = s9pVar.a();
                r9p r9pVar = r9p.a;
                if (a.equals(r9pVar)) {
                    str20 = null;
                } else if (str20 == null) {
                    k7h k7hVar = (k7h) s9pVar.b.getValue();
                    if (k7hVar instanceof h9p) {
                        i = R.string.wave_header_activity;
                    } else if (k7hVar instanceof i9p) {
                        i = R.string.dialog_action_radio_album;
                    } else if (k7hVar instanceof j9p) {
                        i = R.string.dialog_action_radio_artist;
                    } else if (k7hVar instanceof k9p) {
                        i = R.string.wave_header_epoch;
                    } else if (k7hVar instanceof l9p) {
                        i = R.string.wave_header_genre;
                    } else if (k7hVar instanceof n9p) {
                        i = R.string.wave_header_mood;
                    } else if (k7hVar instanceof p9p) {
                        i = R.string.dialog_action_radio_playlist;
                    } else if (k7hVar instanceof q9p) {
                        i = R.string.dialog_action_radio_track;
                    } else {
                        if (k7hVar != null && !k7hVar.equals(r9pVar)) {
                            b6e.s();
                            return null;
                        }
                        i = R.string.rup_block_title;
                    }
                    str20 = skrVar.c(i);
                }
                String X = CollectionsKt.X(CollectionsKt.O(u75.h(str20, str19)), " • ", null, null, null, 62);
                ArrayList R = o8g.R(s9pVar);
                zzu zzuVar = (zzu) u.d.createBuilder();
                zzuVar.d();
                u uVar = (u) zzuVar.b;
                rse rseVar3 = uVar.b;
                if (!((u8) rseVar3).a) {
                    uVar.b = o3d.mutableCopy(rseVar3);
                }
                c8.addAll(R, uVar.b);
                zzuVar.d();
                u uVar2 = (u) zzuVar.b;
                uVar2.getClass();
                uVar2.a |= 1;
                uVar2.c = X;
                u uVar3 = (u) zzuVar.b();
                wzuVar.d();
                v vVar6 = (v) wzuVar.b;
                vVar6.getClass();
                vVar6.b = uVar3;
                vVar6.a = 1;
            }
        }
        v vVar7 = (v) wzuVar.b();
        HashMap hashMap = ppeVar.b;
        Integer num = (Integer) hashMap.get(vVar7);
        if (num != null) {
            i2 = num.intValue();
        } else {
            ppeVar.c.put(Integer.valueOf(ppeVar.a), vVar7);
            hashMap.put(vVar7, Integer.valueOf(ppeVar.a));
            i2 = ppeVar.a;
            ppeVar.a = i2 + 1;
        }
        jtn jtnVar = (jtn) g.m.createBuilder();
        if (str3 != null) {
            jtnVar.d();
            g gVar = (g) jtnVar.b;
            gVar.getClass();
            gVar.a |= 1;
            gVar.b = str3;
        }
        if (str5 != null) {
            jtnVar.d();
            g gVar2 = (g) jtnVar.b;
            gVar2.getClass();
            gVar2.a |= 2;
            gVar2.c = str5;
        }
        jtnVar.d();
        g gVar3 = (g) jtnVar.b;
        gVar3.a |= 4;
        gVar3.d = j;
        if (uri != null) {
            jtnVar.d();
            g gVar4 = (g) jtnVar.b;
            gVar4.getClass();
            gVar4.a |= 8;
            gVar4.e = uri;
        }
        if (str4 != null) {
            jtnVar.d();
            g gVar5 = (g) jtnVar.b;
            gVar5.getClass();
            gVar5.a |= 16;
            gVar5.f = str4;
        }
        if (str6 != null) {
            jtnVar.d();
            g gVar6 = (g) jtnVar.b;
            gVar6.getClass();
            gVar6.a |= 32;
            gVar6.g = str6;
        }
        if (str7 != null) {
            jtnVar.d();
            g gVar7 = (g) jtnVar.b;
            gVar7.getClass();
            gVar7.a |= 64;
            gVar7.h = str7;
        }
        if (str13 != null) {
            jtnVar.d();
            g gVar8 = (g) jtnVar.b;
            gVar8.getClass();
            gVar8.a |= 128;
            gVar8.i = str13;
        }
        if (str12 != null) {
            jtnVar.d();
            g gVar9 = (g) jtnVar.b;
            gVar9.getClass();
            gVar9.a |= 256;
            gVar9.j = str12;
        }
        jtnVar.d();
        g gVar10 = (g) jtnVar.b;
        rse rseVar4 = gVar10.k;
        if (!((u8) rseVar4).a) {
            gVar10.k = o3d.mutableCopy(rseVar4);
        }
        c8.addAll(arrayList, gVar10.k);
        jtnVar.d();
        g gVar11 = (g) jtnVar.b;
        gVar11.a |= RemoteCameraConfig.Mic.BUFFER_SIZE;
        gVar11.l = i2;
        return (g) jtnVar.b();
    }

    public static final Uri I(String str, String str2, String str3) {
        str2.getClass();
        return Uri.parse(c.r(c.r(str, "{QRC_ID}", str2, false), "{QUERY_STRING}", (str3 == null || StringsKt.U(str3)) ? "" : "?".concat(str3), false));
    }

    public static final void J(StringBuilder sb, Iterator it, wfl wflVar) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(wfl.e(entry.getKey()));
            sb.append(" : ");
            sb.append(wfl.e(entry.getValue()));
            while (it.hasNext()) {
                sb.append(",\n  ");
                Map.Entry entry2 = (Map.Entry) it.next();
                sb.append(wfl.e(entry2.getKey()));
                sb.append(" : ");
                sb.append(wfl.e(entry2.getValue()));
            }
        }
    }

    public static final void c(o0k o0kVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        o0kVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-119020740);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(o0kVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            yciVar = vci.a;
            vum.b(d.x(d.c(a.l(yciVar, o0kVar), 1.0f), b2c.f, 2), ((dq0) oq5Var.j(eq0.a)).d.a, 0.0f, 0L, 0, oq5Var, 0, 28);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lv4(o0kVar, yciVar, i, 1);
        }
    }

    public static final void d(fvf fvfVar, o0k o0kVar, ArrayList arrayList, mdj mdjVar, hq5 hq5Var, int i) {
        int i2;
        fvfVar.getClass();
        o0kVar.getClass();
        mdjVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1378922712);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(fvfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(o0kVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(arrayList) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(mdjVar) ? 2048 : 1024;
        }
        int i3 = i2;
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            boolean booleanValue = ((Boolean) szf.Q(mdjVar.j, oq5Var).getValue()).booleanValue();
            boolean h = oq5Var.h(mdjVar);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                m9j m9jVar = new m9j(0, mdjVar, mdj.class, "onRefresh", "onRefresh()V", 0, 16);
                oq5Var.k0(m9jVar);
                K = m9jVar;
            }
            bfg.f(booleanValue, (Function0) ((h9f) K), o0kVar, null, false, ild.C(-144413784, new av5(fvfVar, arrayList, o0kVar, mdjVar, 25), oq5Var), oq5Var, ((i3 << 3) & 896) | 196608, 24);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wda(fvfVar, o0kVar, arrayList, mdjVar, i, 27);
        }
    }

    public static final void e(int i, hq5 hq5Var, yci yciVar, String str) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-583967881);
        int i2 = (oq5Var.f(str) ? 4 : 2) | i | (oq5Var.f(yciVar) ? 32 : 16);
        if (!oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            oq5Var.S();
        } else if (str == null || StringsKt.U(str)) {
            oq5Var.Z(1925492267);
            saf.m(wrc.Podcast, yciVar, oq5Var, (i2 & 112) | 6);
            oq5Var.p(false);
        } else {
            oq5Var.Z(1925625102);
            saf.m(new urc(str), yciVar, oq5Var, i2 & 112);
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cb1(str, yciVar, i, 11);
        }
    }

    public static final void f(e2o e2oVar, act actVar, wn5 wn5Var, hq5 hq5Var, int i) {
        int i2;
        e2oVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2057046858);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(e2oVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i & 48;
        vci vciVar = vci.a;
        if (i4 == 0) {
            i2 |= oq5Var.f(vciVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(actVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(wn5Var) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            ja0 ja0Var = e2oVar.a;
            yci c = d.c(vciVar, 1.0f);
            boolean f = oq5Var.f(ja0Var);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (f || K == kjnVar) {
                K = new mjm(12, ja0Var);
                oq5Var.k0(K);
            }
            yci i5 = a.i(c, (Function1) K);
            bxj bxjVar = bxj.a;
            act actVar2 = b90.a;
            ja0Var.getClass();
            u10 u10Var = b90.b;
            jx7 jx7Var = (jx7) oq5Var.j(es5.h);
            boolean f2 = oq5Var.f(jx7Var) | oq5Var.f(ja0Var) | oq5Var.f(u10Var) | oq5Var.f(actVar);
            Object K2 = oq5Var.K();
            if (f2 || K2 == kjnVar) {
                K2 = com.yandex.music.core.ui.compose.draggable.a.g(ja0Var, jx7Var, u10Var, actVar);
                oq5Var.k0(K2);
            }
            yci f3 = com.yandex.music.core.ui.compose.draggable.a.f(i5, ja0Var, bxjVar, false, null, (s1r) K2, 28);
            boolean f4 = ((i2 & 14) == 4) | oq5Var.f(ja0Var);
            Object K3 = oq5Var.K();
            if (f4 || K3 == kjnVar) {
                K3 = new yh0(i3, e2oVar, ja0Var);
                oq5Var.k0(K3);
            }
            kfh kfhVar = (kfh) K3;
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, f3);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            int i7 = ((((i2 >> 9) & 14) << 6) & 896) | 6;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, kfhVar, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            eta.l((i7 >> 6) & 14, wn5Var, oq5Var, true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new erj(e2oVar, actVar, wn5Var, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public static final void g(int i, hq5 hq5Var, yci yciVar, String str, Function0 function0, boolean z) {
        int i2;
        oq5 oq5Var;
        ?? r4;
        long j;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(327639468);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 2048 : 1024;
        }
        if (oq5Var2.P(i2 & 1, (i2 & 1171) != 1170)) {
            yci e = androidx.compose.foundation.a.e(yciVar, false, null, null, function0, 7);
            boolean z2 = (i2 & 896) == 256;
            Object K = oq5Var2.K();
            if (z2 || K == gq5.a) {
                K = new i32(12, z);
                oq5Var2.k0(K);
            }
            yci b = nfp.b(e, false, (Function1) K);
            kfh d = ug3.d(b2c.f, false);
            int i3 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, b);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var2, d, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var2, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var2, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var2, H, kb5Var4);
            float f = 4;
            vci vciVar = vci.a;
            yci r = a.r(a.o(vciVar, 0.0f, f, 1), hxe.b);
            ta5 a = sa5.a(qx0.c, b2c.o, oq5Var2, 48);
            int i4 = oq5Var2.P;
            androidx.compose.runtime.internal.a l2 = oq5Var2.l();
            yci H2 = vnj.H(oq5Var2, r);
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a, kb5Var);
            g0g.U(oq5Var2, l2, kb5Var2);
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var2, i4, kb5Var3);
            }
            g0g.U(oq5Var2, H2, kb5Var4);
            yci m = a.m(vciVar, f);
            ges j2 = nu0.j();
            if (z) {
                oq5Var2.Z(1778295607);
                j = ((dq0) oq5Var2.j(eq0.a)).b.a;
                r4 = 0;
            } else {
                r4 = 0;
                oq5Var2.Z(1778296665);
                j = ((dq0) oq5Var2.j(eq0.a)).b.b;
            }
            oq5Var2.p(r4);
            xcs.b(str, m, j, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, j2, oq5Var2, (i2 & 14) | 48, 3120, 55288);
            oq5 oq5Var3 = oq5Var2;
            if (z) {
                oq5Var3.Z(-707240312);
                ug3.a(androidx.compose.foundation.a.b(d.e(d.d(vciVar, 1.0f), 2), ((dq0) oq5Var3.j(eq0.a)).b.a, vnj.i), oq5Var3, r4);
                oq5Var3.p(r4);
            } else {
                oq5Var3.Z(-707007254);
                eta.p(vciVar, 2, oq5Var3, r4);
            }
            oq5Var3.p(true);
            oq5Var3.p(true);
            oq5Var = oq5Var3;
        } else {
            oq5 oq5Var4 = oq5Var2;
            oq5Var4.S();
            oq5Var = oq5Var4;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new iw5(str, function0, z, yciVar, i);
        }
    }

    public static final void h(String str, long j, yci yciVar, hq5 hq5Var, int i) {
        str.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1543988995);
        int i2 = i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.e(j) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            kfh d = ug3.d(b2c.f, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
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
            xcs.b(str, null, j, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((kmn) oq5Var.j(jft.b)).a, oq5Var, (i2 & 14) | ((i2 << 3) & 896), 3120, 55290);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new dj(str, j, yciVar, i);
        }
    }

    public static final void i(t53 t53Var, eqp eqpVar, yci yciVar, hq5 hq5Var, int i) {
        boolean z;
        yci yciVar2;
        yci yciVar3;
        float f;
        List list = t53Var.a;
        eqpVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-999190691);
        int i2 = i | (oq5Var.f(t53Var) ? 4 : 2) | (oq5Var.f(eqpVar) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            float f2 = 16;
            yci a = androidx.compose.ui.platform.a.a(a.q(yciVar, 0.0f, f2, 0.0f, f2, 5), "settings_theme_block");
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
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
            a0g.v(0, oq5Var, null, rvf.M(R.string.settings_section_theme, oq5Var));
            float f3 = 8;
            yci yciVar4 = vci.a;
            u1g.l(oq5Var, d.e(yciVar4, f3));
            yci o = a.o(d.d(yciVar4, 1.0f), f2, 0.0f, 2);
            nho a3 = lho.a(qx0.a, b2c.k, oq5Var, 0);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, o);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            oq5Var.Z(-1765182876);
            int i5 = 0;
            for (Object obj : list) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    u75.n();
                    throw null;
                }
                zes zesVar = (zes) obj;
                int i7 = i2;
                oht ohtVar = zesVar.a;
                boolean z2 = zesVar.b;
                boolean f4 = oq5Var.f(zesVar) | ((i7 & 112) == 32);
                Object K = oq5Var.K();
                if (f4 || K == gq5.a) {
                    K = new wes(0, zesVar, eqpVar);
                    oq5Var.k0(K);
                }
                Function1 function1 = (Function1) K;
                float f5 = f3;
                if (irv.h(oq5Var)) {
                    z = true;
                    yciVar2 = yciVar4;
                    yciVar3 = yciVar2;
                } else {
                    if (1.0f <= 0.0d) {
                        qme.a("invalid weight; must be greater than zero");
                    }
                    z = true;
                    yciVar2 = new LayoutWeightElement(true, 1.0f);
                    yciVar3 = yciVar4;
                }
                k(ohtVar, z2, function1, yciVar2, oq5Var, 0);
                if (i5 != u75.g(list)) {
                    oq5Var.Z(1079191612);
                    f = f5;
                    u1g.l(oq5Var, d.r(yciVar3, f));
                } else {
                    f = f5;
                    oq5Var.Z(1075926816);
                }
                oq5Var.p(false);
                i5 = i6;
                yciVar4 = yciVar3;
                f3 = f;
                i2 = i7;
            }
            f1d.u(oq5Var, false, true, true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new t2n(t53Var, eqpVar, yciVar, i, 23);
        }
    }

    public static final void j(yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1741484976);
        int i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            pm0.a(lm0.m, ild.C(2119524985, new cxd(yciVar, 13), oq5Var), oq5Var, 48, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cxd(yciVar, i, 14);
        }
    }

    public static final void k(oht ohtVar, boolean z, Function1 function1, yci yciVar, hq5 hq5Var, int i) {
        oht ohtVar2;
        String str;
        int i2;
        String string;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1198696195);
        int i3 = i | (oq5Var.d(ohtVar.ordinal()) ? 4 : 2) | (oq5Var.g(z) ? 32 : 16) | (oq5Var.h(function1) ? 256 : 128) | (oq5Var.f(yciVar) ? 2048 : 1024);
        int i4 = 0;
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            oq5Var.Z(-895799012);
            yci u = xp3.u(yciVar, o5g.D(oq5Var));
            agr agrVar = eq0.a;
            yci b = androidx.compose.foundation.a.b(u, ((dq0) oq5Var.j(agrVar)).c.c, vnj.i);
            vci vciVar = vci.a;
            yci f = b.f(z ? c3x.y(2, ((dq0) oq5Var.j(agrVar)).a.a, vciVar, o5g.D(oq5Var)) : vciVar);
            oq5Var.p(false);
            boolean z2 = ((i3 & 896) == 256) | ((i3 & 14) == 4);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z2 || K == kjnVar) {
                ohtVar2 = ohtVar;
                K = new xes(i4, function1, ohtVar2);
                oq5Var.k0(K);
            } else {
                ohtVar2 = ohtVar;
            }
            yci r = d.r(a.o(androidx.compose.foundation.a.e(f, false, null, null, (Function0) K, 7), 0.0f, 16, 1), 104);
            boolean z3 = (i3 & 112) == 32;
            Object K2 = oq5Var.K();
            if (z3 || K2 == kjnVar) {
                K2 = new i32(11, z);
                oq5Var.k0(K2);
            }
            yci b2 = nfp.b(r, false, (Function1) K2);
            int ordinal = ohtVar2.ordinal();
            if (ordinal == 0) {
                str = "settings_system_theme";
            } else if (ordinal == 1) {
                str = "settings_light_theme";
            } else {
                if (ordinal != 2) {
                    b6e.s();
                    return;
                }
                str = "settings_dark_theme";
            }
            yci a = androidx.compose.ui.platform.a.a(b2, str);
            ta5 a2 = sa5.a(qx0.c, b2c.o, oq5Var, 48);
            int i5 = oq5Var.P;
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
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            int ordinal2 = ohtVar2.ordinal();
            if (ordinal2 == 0) {
                i2 = 2131232655;
            } else if (ordinal2 == 1) {
                i2 = 2131231925;
            } else {
                if (ordinal2 != 2) {
                    b6e.s();
                    return;
                }
                i2 = 2131231135;
            }
            irf.r(a0g.E(i2, 0, oq5Var), null, d.m(vciVar, 60), null, null, 0.0f, null, oq5Var, 432, 120);
            float f2 = 8;
            u1g.l(oq5Var, d.e(vciVar, f2));
            Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
            context.getClass();
            int ordinal3 = ohtVar2.ordinal();
            if (ordinal3 == 0) {
                string = context.getString(R.string.theme_system);
                string.getClass();
            } else if (ordinal3 == 1) {
                string = context.getString(R.string.theme_light);
                string.getClass();
            } else if (ordinal3 != 2) {
                b6e.s();
                return;
            } else {
                string = context.getString(R.string.theme_dark);
                string.getClass();
            }
            xcs.b(string, a.o(vciVar, f2, 0.0f, 2), ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.i(), oq5Var, 48, 0, 65528);
            oq5Var = oq5Var;
            oq5Var.p(true);
        } else {
            ohtVar2 = ohtVar;
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new s43(ohtVar2, z, function1, yciVar, i, 24);
        }
    }

    public static final void l(yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-267230556);
        int i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            pm0.c(xp3.u(d.o(yciVar, 104, 120), o5g.D(oq5Var)), oq5Var, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cxd(yciVar, i, 15);
        }
    }

    public static final void m(String str, String str2, Function0 function0, Function0 function02, j0s j0sVar, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        str.getClass();
        str2.getClass();
        function0.getClass();
        function02.getClass();
        j0sVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1678997048);
        int i2 = (oq5Var.f(str) ? 4 : 2) | i | (oq5Var.f(str2) ? 32 : 16) | (oq5Var.h(function0) ? 256 : 128) | (oq5Var.h(function02) ? 2048 : 1024);
        if ((i & 24576) == 0) {
            i2 |= oq5Var.d(j0sVar.ordinal()) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if (oq5Var.P(i2 & 1, (74899 & i2) != 74898)) {
            yciVar2 = yciVar;
            yci c = b.c(androidx.compose.ui.platform.a.a(yciVar2, "non_music_tabs"), "state", j0sVar.name());
            nho a = lho.a(qx0.f, b2c.l, oq5Var, 54);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, c);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            boolean z = j0sVar == j0s.a;
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            int i4 = i2 >> 3;
            g((i2 & 14) | (i4 & 112), oq5Var, androidx.compose.ui.platform.a.a(new LayoutWeightElement(true, 1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f), "non_music_album_left_tab"), str, function0, z);
            boolean z2 = j0sVar == j0s.b;
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            g((i4 & 14) | ((i2 >> 6) & 112), oq5Var, androidx.compose.ui.platform.a.a(new LayoutWeightElement(true, 1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f), "non_music_album_right_tab"), str2, function02, z2);
            oq5Var.p(true);
        } else {
            yciVar2 = yciVar;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu0(str, str2, function0, function02, j0sVar, yciVar2, i, 17);
        }
    }

    public static final void n(Function0 function0, hq5 hq5Var, int i) {
        int i2;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(225762812);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(vci.a) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            s7g.k(ild.C(417406000, new j1p(25), oq5Var), vwb.f, vwb.g, ild.C(-1815375667, new xtp(7, function0), oq5Var), null, false, vwb.h, oq5Var, 12586422, 112);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new i80(function0, i, 9);
        }
    }

    public static final void o(aav aavVar, Function0 function0, r4v r4vVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        int i3;
        yci yciVar2;
        Iterable iterable;
        oq5 oq5Var;
        function0.getClass();
        r4vVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1114181033);
        Function0 function02 = function0;
        int i4 = i | (oq5Var2.f(aavVar) ? 4 : 2) | (oq5Var2.h(function02) ? 32 : 16) | (oq5Var2.h(r4vVar) ? 256 : 128) | 3072;
        if ((i4 & 1171) == 1170 && oq5Var2.z()) {
            oq5Var2.S();
            yciVar2 = yciVar;
            oq5Var = oq5Var2;
        } else {
            int ordinal = aavVar.c.c.ordinal();
            boolean z = true;
            boolean z2 = false;
            if (ordinal == 0 || ordinal == 1) {
                i2 = 1281126379;
                i3 = R.string.wave_words_widget_feedback_on_like;
            } else {
                if (ordinal != 2) {
                    throw vz1.i(oq5Var2, 1281122596, false);
                }
                i2 = 1281130030;
                i3 = R.string.wave_words_widget_feedback_on_dislike;
            }
            String n = vz1.n(oq5Var2, i2, i3, oq5Var2, false);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = vz1.h(oq5Var2);
            }
            uoi uoiVar = (uoi) K;
            lx0 lx0Var = qx0.e;
            gz2 gz2Var = b2c.o;
            boolean z3 = aavVar.d;
            boolean h = ((i4 & 14) == 4) | oq5Var2.h(r4vVar);
            Object K2 = oq5Var2.K();
            if (h || K2 == kjnVar) {
                K2 = new xes(27, r4vVar, aavVar);
                oq5Var2.k0(K2);
            }
            vci vciVar = vci.a;
            yci d = androidx.compose.foundation.a.d(vciVar, uoiVar, null, z3, null, null, (Function0) K2, 24);
            yciVar2 = vciVar;
            ta5 a = sa5.a(lx0Var, gz2Var, oq5Var2, 54);
            int i5 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, d);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var2, i5, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            oq5Var2.Z(1787642880);
            n.getClass();
            k7g k7gVar = new k7g(n);
            if (k7gVar.hasNext()) {
                Object next = k7gVar.next();
                if (k7gVar.hasNext()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(next);
                    while (k7gVar.hasNext()) {
                        arrayList.add(k7gVar.next());
                    }
                    iterable = arrayList;
                } else {
                    iterable = t75.c(next);
                }
            } else {
                iterable = c5b.a;
            }
            int i6 = 0;
            for (Object obj : iterable) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    u75.n();
                    throw null;
                }
                ges i8 = nu0.i();
                long z4 = v7g.z(15);
                long z5 = v7g.z(15);
                v7g.p(z5);
                oq5 oq5Var3 = oq5Var2;
                lsq.k((String) obj, aavVar.b.b, ges.b(i8, 0L, z4, null, null, 0L, 0, v7g.D((float) (kes.c(z5) * 1.2d), 1095216660480L & z5), null, null, 0, 0, 16646141), ((d85) function02.invoke()).a, null, i6, 0L, 0, uoiVar, oq5Var3, 100663296, 208);
                function02 = function0;
                z = z;
                z2 = z2;
                i6 = i7;
                oq5Var2 = oq5Var3;
            }
            oq5Var = oq5Var2;
            oq5Var.p(z2);
            oq5Var.p(z);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new mqr(i, 12, aavVar, function0, r4vVar, yciVar2);
        }
    }

    public static final Object p(mwk mwkVar, w2q w2qVar) {
        mwkVar.getClass();
        w2qVar.getClass();
        if (mwkVar instanceof jzs) {
            return w2qVar.h((jzs) mwkVar);
        }
        if (mwkVar instanceof k4d) {
            return w2qVar.k((k4d) mwkVar);
        }
        if (mwkVar instanceof foc) {
            return w2qVar.c((foc) mwkVar);
        }
        if (mwkVar instanceof i5u) {
            return w2qVar.j((i5u) mwkVar);
        }
        if (mwkVar instanceof m1q) {
            return w2qVar.i((m1q) mwkVar);
        }
        if (mwkVar instanceof faq) {
            return w2qVar.g((faq) mwkVar);
        }
        kac.j(mwkVar, "Developer Error. Unexpected class for visit ");
        return null;
    }

    public static final String q(List list) {
        list.getClass();
        return CollectionsKt.X(list, StringUtils.COMMA, null, null, null, 62);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Integer r(ix3 ix3Var, boolean z, boolean z2) {
        if (z) {
            switch (ix3Var.ordinal()) {
                case 0:
                    return 2131232406;
                case 1:
                    return Integer.valueOf(R.drawable.paymentsdk_ic_diners_light);
                case 2:
                    return 2131232435;
                case 3:
                    return 2131232442;
                case 4:
                    return 2131232439;
                case 5:
                    return 2131232447;
                case 6:
                    return 2131232449;
                case 7:
                    if (!z2) {
                        return 2131232451;
                    }
                    return null;
                case 8:
                    return Integer.valueOf(R.drawable.paymentsdk_ic_union_pay_light);
                case 9:
                    return 2131232478;
                case 10:
                    return 2131232482;
                case 11:
                    return 2131232481;
                case 12:
                    return null;
                default:
                    b6e.s();
                    return null;
            }
        }
        switch (ix3Var.ordinal()) {
            case 0:
                return 2131232405;
            case 1:
                return Integer.valueOf(R.drawable.paymentsdk_ic_diners_dark);
            case 2:
                return 2131232434;
            case 3:
                return 2131232441;
            case 4:
                break;
            case 5:
                return 2131232446;
            case 6:
                return 2131232448;
            case 7:
                if (!z2) {
                    return 2131232450;
                }
                return null;
            case 8:
                return Integer.valueOf(R.drawable.paymentsdk_ic_union_pay_dark);
            case 9:
                return 2131232477;
            case 10:
                return 2131232479;
            case 11:
                return 2131232480;
            case 12:
                break;
            default:
                b6e.s();
                return null;
        }
    }

    public static X509TrustManager s(KeyStore keyStore, osg osgVar) {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        try {
            for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    try {
                        return (X509TrustManager) trustManager;
                    } catch (IllegalArgumentException e) {
                        osgVar.F("Error creating trust manager (" + trustManager.getClass().getName() + "): " + e);
                    }
                }
            }
            osgVar.F("Could not find suitable trust manager");
            return null;
        } catch (RuntimeException e2) {
            osgVar.D("TrustManagerFactory.getTrustManagers() unexpectedly threw", e2);
            throw new KeyStoreException(e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static X509TrustManager t(Context context, h88 h88Var, y9w y9wVar, osg osgVar) {
        X509TrustManager x509TrustManager;
        InputStream openRawResource = h88Var.a.getResources().openRawResource(R.raw.nuc_cert);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = openRawResource.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                byte[][] bArr2 = {byteArray};
                try {
                    KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                    keyStore.load(null);
                    try {
                        try {
                            keyStore.setCertificateEntry("custom_cert_0", u(bArr2[0]));
                        } catch (KeyStoreException unused) {
                            osgVar.getClass();
                        }
                    } catch (CertificateException unused2) {
                        osgVar.getClass();
                    }
                    try {
                        x509TrustManager = s(keyStore, osgVar);
                    } catch (KeyStoreException | NoSuchAlgorithmException unused3) {
                        osgVar.getClass();
                        x509TrustManager = null;
                        if (x509TrustManager != null) {
                        }
                    }
                } catch (IOException | GeneralSecurityException unused4) {
                    osgVar.getClass();
                }
                if (x509TrustManager != null) {
                    return null;
                }
                uiq uiqVar = new uiq(7, y9wVar);
                joj jojVar = new joj();
                jojVar.c.add(new n56(3));
                TimeUnit timeUnit = TimeUnit.SECONDS;
                jojVar.c(30L, timeUnit);
                jojVar.e(30L, timeUnit);
                jojVar.g(30L);
                jojVar.k = null;
                j6e j6eVar = new j6e(uiqVar, new OkHttpClient(jojVar));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                return ru.domesticroots.webview.a.a(new la4(x509TrustManager, CollectionsKt.A0(linkedHashSet), CollectionsKt.A0(linkedHashSet2), j6eVar, new yfx(context, new o6c(27)), new sml(osgVar)), osgVar);
            } finally {
            }
        } catch (IOException e) {
            kac.k("Failed to get certificate from resources", e);
            return null;
        }
    }

    public static X509Certificate u(byte[] bArr) {
        Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr));
        if (generateCertificate instanceof X509Certificate) {
            return (X509Certificate) generateCertificate;
        }
        throw new CertificateException("Generated certificate is " + generateCertificate.getClass() + ", but expected X509Certificate");
    }

    public static View v(int i, View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View findViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    public static m5i w(m5i m5iVar, xof xofVar, ges gesVar, jx7 jx7Var, ppc ppcVar) {
        if (m5iVar != null && xofVar == m5iVar.a && u7g.T(gesVar, xofVar).equals(m5iVar.b) && jx7Var.getDensity() == m5iVar.c.a && ppcVar == m5iVar.d) {
            return m5iVar;
        }
        m5i m5iVar2 = m5i.h;
        if (m5iVar2 != null && xofVar == m5iVar2.a && u7g.T(gesVar, xofVar).equals(m5iVar2.b) && jx7Var.getDensity() == m5iVar2.c.a && ppcVar == m5iVar2.d) {
            return m5iVar2;
        }
        m5i m5iVar3 = new m5i(xofVar, u7g.T(gesVar, xofVar), new kx7(jx7Var.getDensity(), jx7Var.i0()), ppcVar);
        m5i.h = m5iVar3;
        return m5iVar3;
    }

    public static Pair[] x() {
        return new Pair[]{new Pair(Float.valueOf(0.0f), new d85(c3x.f(0))), new Pair(Float.valueOf(0.2036f), new d85(c3x.f(1509949440))), new Pair(Float.valueOf(0.2478f), new d85(c3x.f(1761607680))), new Pair(Float.valueOf(0.2883f), new d85(c3x.f(1996488704))), new Pair(Float.valueOf(0.321f), new d85(c3x.f(2130706432))), new Pair(Float.valueOf(0.3531f), new d85(c3x.h(2332033024L))), new Pair(Float.valueOf(0.3915f), new d85(c3x.h(2449473536L))), new Pair(Float.valueOf(0.4108f), new d85(c3x.h(2566914048L))), new Pair(Float.valueOf(0.4445f), new d85(c3x.h(2634022912L))), new Pair(Float.valueOf(0.4909f), new d85(c3x.h(2701131776L))), new Pair(Float.valueOf(0.5331f), new d85(c3x.h(2852126720L))), new Pair(Float.valueOf(0.5696f), new d85(c3x.h(2885681152L))), new Pair(Float.valueOf(1.0f), new d85(c3x.h(3321888768L)))};
    }

    public static final rfk y(kcp kcpVar) {
        if (kcpVar == null) {
            kcpVar = null;
        }
        if (kcpVar != null) {
            return kcpVar.a;
        }
        xq0.x("Wrong type");
        return null;
    }

    public static SSLSocketFactory z() {
        TrustManager[] trustManagerArr = {new qs1(3)};
        try {
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            return sSLContext.getSocketFactory();
        } catch (KeyManagementException | NoSuchAlgorithmException e) {
            b6e.q(e);
            return null;
        }
    }

    @Override // defpackage.qsq
    public float a(int i, View view, ViewGroup viewGroup) {
        return view.getTranslationX();
    }
}
