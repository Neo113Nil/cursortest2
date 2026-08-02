package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import com.appsflyer.internal.k;
import com.connectsdk.service.airplay.PListParser;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.media.ynison.service.a0;
import com.yandex.media.ynison.service.i0;
import com.yandex.media.ynison.service.x;
import com.yandex.music.shared.dto.concert.ConcertCashbackDto;
import com.yandex.music.shared.dto.concert.ConcertEventInfoDto;
import com.yandex.music.shared.dto.concert.ConcertPriceDto;
import com.yandex.music.shared.dto.concert.ConcertShortDto;
import com.yandex.music.shared.dto.concert.ConcertWithPriceDto;
import com.yandex.music.shared.dto.domainitem.EntityCoverDto;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.time.ZonedDateTime;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.TypeVariable;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.WebPath$Storage;
import ru.yandex.music.utils.Assertions;
import ru.yandex.video.m3.data.DrmParameters;
import ru.yandex.video.m3.ott.data.dto.drm.DrmConfig;
import ru.yandex.video.m3.ott.data.dto.drm.DrmModule;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxy;
import ru.yandex.video.m3.ott.data.dto.drm.DrmRequestParams;

/* loaded from: classes6.dex */
public abstract class hag {
    public static int A(int i, int i2, String str) {
        return (int) z(str, i, 1, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final Boolean B(String str) {
        String str2;
        if (str != null) {
            Locale locale = Locale.getDefault();
            locale.getClass();
            str2 = str.toLowerCase(locale);
            str2.getClass();
        } else {
            str2 = null;
        }
        if (Intrinsics.d(str2, PListParser.TAG_TRUE)) {
            return Boolean.TRUE;
        }
        if (Intrinsics.d(str2, PListParser.TAG_FALSE)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final h06 C(ConcertShortDto concertShortDto, int i) {
        ZonedDateTime zonedDateTime;
        ru5 ru5Var;
        EntityCoverDto cover = concertShortDto.getCover();
        u9b V = cover != null ? c3x.V(cover) : null;
        if (V == null) {
            su4.s(2, null, "ConcertsTop wrong format:  cover", null);
        }
        if (V != null) {
            String id = concertShortDto.getId();
            if (id == null) {
                su4.s(2, null, "ConcertsTop wrong format:  id", null);
            }
            if (id != null) {
                String concertTitle = concertShortDto.getConcertTitle();
                if (concertTitle == null) {
                    su4.s(2, null, "ConcertsTop wrong format:  concertTitle", null);
                }
                if (concertTitle != null) {
                    Integer rank = concertShortDto.getRank();
                    String city = concertShortDto.getCity();
                    if (city == null) {
                        su4.s(2, null, "ConcertsTop wrong format:  city", null);
                    }
                    if (city != null) {
                        String place = concertShortDto.getPlace();
                        String str = (place == null || StringsKt.U(place)) ? null : place;
                        wye datetime = concertShortDto.getDatetime();
                        if (datetime != null && (zonedDateTime = datetime.b) != null) {
                            String contentRating = concertShortDto.getContentRating();
                            String dataSessionId = concertShortDto.getDataSessionId();
                            if (dataSessionId == null) {
                                su4.s(2, null, "ConcertsTop wrong format:  dataSessionId", null);
                            }
                            if (dataSessionId != null) {
                                String e = V.e(i, WebPath$Storage.AFISHA);
                                Integer d = V.d();
                                int intValue = d != null ? d.intValue() : 0;
                                ConcertCashbackDto cashback = concertShortDto.getCashback();
                                String title = cashback != null ? cashback.getTitle() : null;
                                ConcertCashbackDto cashback2 = concertShortDto.getCashback();
                                Integer valuePercent = cashback2 != null ? cashback2.getValuePercent() : null;
                                ConcertEventInfoDto eventInfoDto = concertShortDto.getEventInfoDto();
                                if (eventInfoDto != null) {
                                    String type = eventInfoDto.getType();
                                    if (type == null) {
                                        type = "unspecified";
                                    }
                                    ru5Var = new ru5(type);
                                } else {
                                    ru5Var = ru5.b;
                                }
                                return new h06(id, concertTitle, rank, city, str, zonedDateTime, contentRating, dataSessionId, e, intValue, title, valuePercent, ru5Var);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final s26 D(ConcertWithPriceDto concertWithPriceDto, int i) {
        h06 C;
        ConcertShortDto concert = concertWithPriceDto.getConcert();
        if (concert == null || (C = C(concert, i)) == null) {
            return null;
        }
        ConcertPriceDto price = concertWithPriceDto.getPrice();
        return new s26(C, price != null ? nu5.b(price) : null);
    }

    public static final float E(int i, int i2, hq5 hq5Var) {
        boolean z = (i2 & 2) != 0;
        float f = i;
        float i0 = ((jx7) ((oq5) hq5Var).j(es5.h)).i0() * f;
        return z ? i0 : Math.max(f, i0);
    }

    public static final JSONObject F(DrmRequestParams drmRequestParams) {
        drmRequestParams.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("productId", drmRequestParams.getProductId());
        jSONObject.putOpt("contentId", drmRequestParams.getContentId());
        jSONObject.putOpt("contentTypeId", Long.valueOf(drmRequestParams.getContentTypeId()));
        jSONObject.putOpt("serviceName", drmRequestParams.getServiceName());
        jSONObject.putOpt("version", drmRequestParams.getVersion());
        jSONObject.putOpt("expirationTimestamp", Long.valueOf(drmRequestParams.getExpirationTimestamp()));
        jSONObject.putOpt("monetizationModel", drmRequestParams.getMonetizationModel());
        jSONObject.putOpt("verificationRequired", Boolean.valueOf(drmRequestParams.getVerificationRequired()));
        jSONObject.putOpt("watchSessionId", drmRequestParams.getWatchSessionId());
        jSONObject.putOpt("signature", drmRequestParams.getSignature());
        jSONObject.putOpt("sessionTimestamp", drmRequestParams.getSessionTimestamp());
        jSONObject.putOpt("persistent", drmRequestParams.getPersistent());
        jSONObject.putOpt("sessionId", drmRequestParams.getSessionId());
        jSONObject.putOpt("puid", drmRequestParams.getPuid());
        jSONObject.putOpt("strictPlaybackTtl", drmRequestParams.getStrictPlaybackTtl());
        jSONObject.putOpt("rentalTtl", drmRequestParams.getRentalTtl());
        jSONObject.putOpt("storageTtl", drmRequestParams.getStorageTtl());
        jSONObject.putOpt("playbackTtl", drmRequestParams.getPlaybackTtl());
        jSONObject.putOpt("uuid", drmRequestParams.getUuid());
        jSONObject.putOpt("uuidSignature", drmRequestParams.getUuidSignature());
        jSONObject.putOpt(BuildConfig.SDK_BUILD_FLAVOR, drmRequestParams.getInternalStream());
        return jSONObject;
    }

    public static final geh G(jtv jtvVar) {
        jtvVar.getClass();
        return new geh(jtvVar.a, jtvVar.b);
    }

    public static final ArrayList H(List list) {
        raj a;
        jyr b = l18.b.b(I(cej.class), true);
        List<mqs> list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        for (mqs mqsVar : list2) {
            a = ((cej) b.getValue()).a(mqsVar, false);
            arrayList.add(new eej(a, mqsVar));
        }
        return arrayList;
    }

    public static final bdt I(Class cls) {
        TypeVariable[] typeParameters = cls.getTypeParameters();
        typeParameters.getClass();
        if (typeParameters.length == 0) {
            return new bdt(cls);
        }
        xq0.x("Failed requirement.");
        return null;
    }

    public static final jtv J(long j) {
        return new jtv((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static String K(String str, boolean z) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            Assertions.fail(e);
            return str;
        } catch (IllegalArgumentException e2) {
            String message = e2.getMessage();
            if (!z || message == null || !message.contains("URLDecoder: Illegal hex characters")) {
                Assertions.fail(e2);
                return str;
            }
            try {
                str = URLEncoder.encode(str, "UTF-8").replace("+", "%20");
            } catch (UnsupportedEncodingException e3) {
                Assertions.fail(e3);
            }
            return K(str, false);
        }
    }

    public static void L(int i, int i2) {
        String I;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                I = ocg.I("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    xq0.x(k5r.i(i2, "negative size: "));
                    return;
                }
                I = ocg.I("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(I);
        }
    }

    public static void M(int i, int i2) {
        if (i < 0 || i > i2) {
            e7o.o(O(i, i2, "index"));
        }
    }

    public static void N(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? O(i, i3, "start index") : (i2 < 0 || i2 > i3) ? O(i2, i3, "end index") : ocg.I("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String O(int i, int i2, String str) {
        if (i < 0) {
            return ocg.I("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return ocg.I("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        xq0.x(k5r.i(i2, "negative size: "));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c3, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r12.K(), java.lang.Integer.valueOf(r10)) == false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, boolean z, Function0 function0, boolean z2, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-616220870);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.g(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i2 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            ta5 a = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i4 = oq5Var.P;
            a l = oq5Var.l();
            vci vciVar = vci.a;
            yci H = vnj.H(oq5Var, vciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O) {
                i3 = i2;
            } else {
                i3 = i2;
            }
            ouj.x(i4, oq5Var, i4, kb5Var3);
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            hz2 hz2Var = b2c.l;
            yci d = d.d(yciVar, 1.0f);
            agr agrVar = eq0.a;
            yci e = androidx.compose.foundation.a.e(androidx.compose.foundation.a.b(d, ((dq0) oq5Var.j(agrVar)).d.c, vnj.i), false, null, null, function0, 7);
            float f = 16;
            yci n = androidx.compose.foundation.layout.a.n(e, f, f);
            boolean z3 = (i3 & 112) == 32;
            Object K = oq5Var.K();
            if (z3 || K == gq5.a) {
                K = new i32(6, z);
                oq5Var.k0(K);
            }
            yci b = nfp.b(n, false, (Function1) K);
            nho a2 = lho.a(qx0.a, hz2Var, oq5Var, 48);
            int i5 = oq5Var.P;
            a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, b);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            xv7.j(str, null, d85.b(((dq0) oq5Var.j(agrVar)).b.a, 0.9f, 0.0f, 0.0f, 0.0f, 14), 0L, 0L, 0, 0L, 0, false, 0, 0, null, nu0.j(), oq5Var, i3 & 14, 0, 65530);
            oq5Var = oq5Var;
            if (z) {
                oq5Var.Z(533710115);
                if (1.0f <= 0.0d) {
                    qme.a("invalid weight; must be greater than zero");
                }
                u1g.l(oq5Var, new LayoutWeightElement(true, 1.0f));
                gae.b(a0g.E(R.drawable.ic_check_24, 0, oq5Var), null, null, d85.b(((dq0) oq5Var.j(agrVar)).a.a, 0.9f, 0.0f, 0.0f, 0.0f, 14), oq5Var, 48, 4);
            } else {
                oq5Var.Z(529603886);
            }
            oq5Var.p(false);
            oq5Var.p(true);
            if (z2) {
                oq5Var.Z(-334879069);
                xv7.k(d.e(d.d(vciVar, 1.0f), 1), d85.b(((dq0) oq5Var.j(agrVar)).c.c, !((ma5) oq5Var.j(pa5.a)).g() ? 0.15f : 0.06f, 0.0f, 0.0f, 0.0f, 14), 0.0f, 0.0f, oq5Var, 6, 12);
            } else {
                oq5Var.Z(-339322702);
            }
            oq5Var.p(false);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new en6(str, z, function0, z2, yciVar, i);
        }
    }

    public static final void b(qe7 qe7Var, jag jagVar, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        qe7Var.getClass();
        jagVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-458996846);
        int i2 = i | (oq5Var.h(qe7Var) ? 4 : 2) | (oq5Var.f(jagVar) ? 32 : 16) | 384;
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            x2i x2iVar = qx0.a;
            oq5Var.a0(-862651793);
            u3r u3rVar = (u3r) oq5Var.j(bfs.c);
            oq5Var.p(false);
            nx0 g = qx0.g(u3rVar.a);
            vci vciVar = vci.a;
            yci d = d.d(vciVar, 1.0f);
            oq5Var.a0(118080530);
            h95 h95Var = (h95) oq5Var.j(bfs.a);
            oq5Var.p(false);
            yci m = androidx.compose.foundation.layout.a.m(androidx.compose.foundation.a.b(d, h95Var.c, ugo.a(16)), 8);
            oq5Var.a0(-483455358);
            ta5 a = sa5.a(g, b2c.n, oq5Var, 0);
            oq5Var.a0(-1323940314);
            int i3 = oq5Var.P;
            a l = oq5Var.l();
            xp5.T.getClass();
            grb grbVar = wp5.b;
            wn5 A = ghh.A(m);
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
            A.invoke(new lrq(oq5Var), oq5Var, 0);
            oq5Var.a0(2058660585);
            xv7.m(jagVar, null, oq5Var, (i2 >> 3) & 14);
            q6k.d(jagVar.e, oq5Var, 0);
            y5g.O(jagVar.g, jagVar.p, jagVar.o, null, oq5Var, 0);
            oq5Var = oq5Var;
            vwb.r(jagVar.f, null, oq5Var, 0);
            x97.k(jagVar.h, null, oq5Var, 0);
            hyf.d(jagVar.i, null, oq5Var, 0);
            jf0.f(0, qe7Var.x, oq5Var, null, jagVar.l);
            ywf.b(0, qe7Var.x, oq5Var, null, jagVar.m);
            k5r.s(oq5Var, false, true, false, false);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lf0(qe7Var, jagVar, yciVar2, i, 6);
        }
    }

    public static final void c(int i, hq5 hq5Var, yci yciVar, String str) {
        int i2;
        oq5 oq5Var;
        str.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1371119020);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 32 : 16;
        }
        if (oq5Var2.P(i2 & 1, (i2 & 19) != 18)) {
            oq5Var = oq5Var2;
            xv7.j(str, androidx.compose.ui.platform.a.a(d.x(d.c(androidx.compose.foundation.layout.a.o(yciVar, 24, 0.0f, 2), 1.0f), b2c.f, 2), "my_shelf_screen_placeholder"), ((dq0) oq5Var2.j(eq0.a)).b.a, 0L, 0L, 3, 0L, 0, false, 0, 0, null, nu0.j(), oq5Var, i2 & 14, 0, 65272);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new a5(str, yciVar, i, 2);
        }
    }

    public static final void d(wik wikVar, hq5 hq5Var, int i) {
        wikVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1707708297);
        if ((((oq5Var.f(wikVar) ? 4 : 2) | i) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            ((cjk) oq5Var.j(djk.a)).a.invoke(ild.C(851169145, new tik(0, wikVar), oq5Var), oq5Var, 6);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ykf(wikVar, i, 19);
        }
    }

    public static final void e(tvd tvdVar, dam damVar, rbm rbmVar, hq5 hq5Var, int i) {
        gvd gvdVar = damVar.b;
        tvdVar.getClass();
        rbmVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1858678298);
        int i2 = i | (oq5Var.f(tvdVar) ? 4 : 2) | (oq5Var.f(damVar) ? 32 : 16) | (oq5Var.f(rbmVar) ? 256 : 128);
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            boolean f = oq5Var.f(gvdVar);
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (f || K == obj) {
                K = new hab(gvdVar);
                oq5Var.k0(K);
            }
            hab habVar = (hab) K;
            boolean h = oq5Var.h(habVar) | ((i2 & 112) == 32);
            Object K2 = oq5Var.K();
            if (h || K2 == obj) {
                K2 = new uv(14, habVar, damVar);
                oq5Var.k0(K2);
            }
            Function0 function0 = (Function0) K2;
            String str = damVar.a.h;
            u2x.o(function0, ild.C(-252294836, new pr(tvdVar, damVar, rbmVar, habVar, function0, hyf.J(str != null ? new jbu(str) : null, ((icj) rbmVar.a.b).v(), oq5Var, 0)), oq5Var), oq5Var, 48);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q6h(tvdVar, damVar, rbmVar, i, 26);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(ArrayList arrayList, String str, Function1 function1, Function0 function0, yci yciVar, hq5 hq5Var, int i, int i2) {
        yci yciVar2;
        int i3;
        Object K;
        Object obj;
        int i4;
        Iterator it;
        int i5;
        yci yciVar3;
        int i6;
        xmn r;
        str.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1984691690);
        int i7 = (oq5Var.f(arrayList) ? 4 : 2) | i | (oq5Var.f(str) ? 32 : 16);
        if ((i & 384) == 0) {
            i7 |= oq5Var.h(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i7 |= oq5Var.h(function0) ? 2048 : 1024;
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i7 |= 24576;
        } else if ((i & 24576) == 0) {
            yciVar2 = yciVar;
            i7 |= oq5Var.f(yciVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
            if ((i7 & 9363) == 9362 || !oq5Var.z()) {
                vci vciVar = vci.a;
                yci yciVar4 = i8 == 0 ? vciVar : yciVar2;
                gz2 gz2Var = b2c.o;
                float f = 16;
                yci d = d.d(androidx.compose.foundation.layout.a.o(yciVar4, f, 0.0f, 2), 1.0f);
                ta5 a = sa5.a(qx0.c, gz2Var, oq5Var, 48);
                i3 = oq5Var.P;
                a l = oq5Var.l();
                yci H = vnj.H(oq5Var, d);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                g0g.U(oq5Var, a, wp5.f);
                g0g.U(oq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                    ouj.x(i3, oq5Var, i3, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                u1g.l(oq5Var, d.e(vciVar, f));
                ges c = nu0.c();
                long b = d85.b(((dq0) oq5Var.j(eq0.a)).b.a, 0.9f, 0.0f, 0.0f, 0.0f, 14);
                K = oq5Var.K();
                obj = gq5.a;
                if (K == obj) {
                    K = new d0p(21);
                    oq5Var.k0(K);
                }
                yci yciVar5 = yciVar4;
                i4 = 256;
                xv7.j(str, nfp.b(vciVar, false, (Function1) K), b, 0L, 0L, 0, 0L, 0, false, 0, 0, null, c, oq5Var, (i7 >> 3) & 14, 0, 65528);
                oq5Var = oq5Var;
                u1g.l(oq5Var, d.e(vciVar, 24));
                oq5Var.Z(1469230864);
                it = arrayList.iterator();
                i5 = 0;
                while (true) {
                    if (it.hasNext()) {
                        oq5Var.p(false);
                        eta.p(vciVar, 20, oq5Var, true);
                        yciVar3 = yciVar5;
                        break;
                    }
                    Object next = it.next();
                    i6 = i5 + 1;
                    if (i5 < 0) {
                        u75.n();
                        throw null;
                    }
                    hdp hdpVar = (hdp) next;
                    int size = arrayList.size() - 1;
                    boolean f2 = ((i7 & 896) == i4) | oq5Var.f(hdpVar) | ((i7 & 7168) == 2048);
                    Object K2 = oq5Var.K();
                    if (f2 || K2 == obj) {
                        K2 = new cte(24, function1, hdpVar, function0);
                        oq5Var.k0(K2);
                    }
                    g(i5, size, hdpVar, (Function0) K2, oq5Var, 0);
                    i5 = i6;
                    i4 = 256;
                }
            } else {
                oq5Var.S();
                yciVar3 = yciVar2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new cj(arrayList, str, function1, function0, yciVar3, i, i2);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((i7 & 9363) == 9362) {
        }
        vci vciVar2 = vci.a;
        if (i8 == 0) {
        }
        gz2 gz2Var2 = b2c.o;
        float f3 = 16;
        yci d2 = d.d(androidx.compose.foundation.layout.a.o(yciVar4, f3, 0.0f, 2), 1.0f);
        ta5 a2 = sa5.a(qx0.c, gz2Var2, oq5Var, 48);
        i3 = oq5Var.P;
        a l2 = oq5Var.l();
        yci H2 = vnj.H(oq5Var, d2);
        xp5.T.getClass();
        grb grbVar2 = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, a2, wp5.f);
        g0g.U(oq5Var, l2, wp5.e);
        kb5 kb5Var2 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i3, oq5Var, i3, kb5Var2);
        g0g.U(oq5Var, H2, wp5.d);
        u1g.l(oq5Var, d.e(vciVar2, f3));
        ges c2 = nu0.c();
        long b2 = d85.b(((dq0) oq5Var.j(eq0.a)).b.a, 0.9f, 0.0f, 0.0f, 0.0f, 14);
        K = oq5Var.K();
        obj = gq5.a;
        if (K == obj) {
        }
        yci yciVar52 = yciVar4;
        i4 = 256;
        xv7.j(str, nfp.b(vciVar2, false, (Function1) K), b2, 0L, 0L, 0, 0L, 0, false, 0, 0, null, c2, oq5Var, (i7 >> 3) & 14, 0, 65528);
        oq5Var = oq5Var;
        u1g.l(oq5Var, d.e(vciVar2, 24));
        oq5Var.Z(1469230864);
        it = arrayList.iterator();
        i5 = 0;
        while (true) {
            if (it.hasNext()) {
            }
            g(i5, size, hdpVar, (Function0) K2, oq5Var, 0);
            i5 = i6;
            i4 = 256;
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void g(int i, int i2, hdp hdpVar, Function0 function0, hq5 hq5Var, int i3) {
        int i4;
        boolean z;
        Function0 function02;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(121009246);
        int i5 = (oq5Var.d(i) ? 4 : 2) | i3 | (oq5Var.d(i2) ? 32 : 16) | (oq5Var.f(hdpVar) ? 256 : 128) | (oq5Var.h(function0) ? 2048 : 1024);
        if ((i5 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            function02 = function0;
        } else {
            if (i != i2) {
                z = true;
                i4 = 0;
            } else {
                i4 = 0;
                z = false;
            }
            int i6 = i4;
            a(hdpVar.a, hdpVar.b, function0, z, androidx.compose.ui.platform.a.a(xp3.u(vci.a, ugo.b(i == 0 ? 8 : i6, i == 0 ? 8 : i6, i == i2 ? 8 : i6, i == i2 ? 8 : i6)), hdpVar.d), oq5Var, (i5 >> 3) & 896);
            function02 = function0;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uf4(i, i2, hdpVar, function02, i3);
        }
    }

    public static final void h(List list, wn5 wn5Var, yci yciVar, boolean z, boolean z2, hq5 hq5Var, int i) {
        boolean z3;
        boolean z4;
        list.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(473709063);
        int i2 = (oq5Var.f(list) ? 4 : 2) | i;
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if (((i2 | 27648) & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            z3 = z;
            z4 = z2;
        } else {
            oq5Var.Z(-32112135);
            yci e = d.e(d.d(yciVar, 1.0f), 40);
            yci b = androidx.compose.ui.graphics.a.b(vci.a, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 65535);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new g5r(23);
                oq5Var.k0(K);
            }
            yci f = e.f(androidx.compose.ui.draw.a.b(b, (Function1) K));
            oq5Var.p(false);
            bg3.a(f, null, false, ild.C(-1804479375, new f6p(10, list, wn5Var), oq5Var), oq5Var, 3072, 6);
            z3 = true;
            z4 = true;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new en6(list, wn5Var, yciVar, z3, z4, i);
        }
    }

    public static final void i(nru nruVar, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-473030025);
        int i2 = 2;
        if ((((oq5Var2.h(nruVar) ? 4 : 2) | i | 48) & 19) == 18 && oq5Var2.z()) {
            oq5Var2.S();
            yciVar2 = yciVar;
            oq5Var = oq5Var2;
        } else {
            aqi x = bcx.x(nruVar.getState(), oq5Var2, 0);
            fvf a = hvf.a(0, 0, oq5Var2, 0, 3);
            String M = rvf.M(R.string.wave_for_two_screen_title, oq5Var2);
            boolean h = oq5Var2.h(nruVar);
            Object K = oq5Var2.K();
            if (h || K == gq5.a) {
                j6u j6uVar = new j6u(0, nruVar, nru.class, "onBackClick", "onBackClick()V", 0, 17);
                oq5Var2.k0(j6uVar);
                K = j6uVar;
            }
            vm C = ghh.C(zs4.g(oq5Var2), ogp.A(oq5Var2));
            boolean z = !((tru) x.getValue()).k();
            wn5 C2 = ild.C(-1905305799, new olu(i2, nruVar), oq5Var2);
            wn5 C3 = ild.C(1079468929, new aqp(11, nruVar, x, a), oq5Var2);
            yciVar2 = vci.a;
            oq5Var = oq5Var2;
            xp3.d(M, a, yciVar2, C, (Function0) ((h9f) K), C2, z, false, null, null, null, C3, oq5Var, 196992, 48, ScreenMirroringConfig.Video.DEFAULT_WIDTH);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k0r(nruVar, yciVar2, i, 28);
        }
    }

    public static final void j(f9v f9vVar, Function0 function0, sdr sdrVar, hq5 hq5Var, int i) {
        aqi aqiVar;
        oq5 oq5Var;
        f9v f9vVar2 = f9vVar;
        f9vVar2.getClass();
        function0.getClass();
        sdrVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1060871674);
        int i2 = (i & 6) == 0 ? (oq5Var2.f(f9vVar2) ? 4 : 2) | i : i;
        Function0 function02 = function0;
        if ((i & 48) == 0) {
            i2 |= oq5Var2.h(function02) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.f(sdrVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            String[] strArr = {rvf.M(R.string.wave_words_loading_text_1, oq5Var2), rvf.M(R.string.wave_words_loading_text_3, oq5Var2), rvf.M(R.string.wave_words_loading_text_4, oq5Var2), rvf.M(R.string.wave_words_loading_text_5, oq5Var2), rvf.M(R.string.wave_words_loading_text_6, oq5Var2)};
            int i3 = i2 << 3;
            boolean z = false;
            for (Object obj : Arrays.copyOf(strArr, 5)) {
                z |= oq5Var2.f(obj);
            }
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (z || K == kjnVar) {
                phn.a.getClass();
                String str = strArr[phn.b.d(5)];
                if (str == null) {
                    str = "";
                }
                K = szf.g0(str);
                oq5Var2.k0(K);
            }
            aqi aqiVar2 = (aqi) K;
            oq5Var2.Z(-923560224);
            Object[] copyOf = Arrays.copyOf(strArr, 5);
            boolean h = ((((i3 & 112) ^ 48) > 32 && oq5Var2.f(f9vVar2)) || (i3 & 48) == 32) | oq5Var2.h(strArr) | oq5Var2.f(aqiVar2);
            Object K2 = oq5Var2.K();
            if (h || K2 == kjnVar) {
                aqiVar = aqiVar2;
                h0t h0tVar = new h0t(strArr, aqiVar, f9vVar, null, 21);
                f9vVar2 = f9vVar;
                oq5Var2.k0(h0tVar);
                K2 = h0tVar;
            } else {
                aqiVar = aqiVar2;
            }
            gld.z(copyOf, (Function2) K2, oq5Var2);
            oq5Var2.p(false);
            g7v g7vVar = (g7v) sdrVar.getValue();
            gz2 gz2Var = b2c.o;
            boolean f = oq5Var2.f(aqiVar);
            Object K3 = oq5Var2.K();
            if (f || K3 == kjnVar) {
                K3 = new xp(aqiVar, 21);
                oq5Var2.k0(K3);
            }
            yci yciVar = vci.a;
            yci a = nfp.a(yciVar, (Function1) K3);
            if (!((Boolean) oq5Var2.j(koe.a)).booleanValue()) {
                final long j = ((d85) function02.invoke()).a;
                final float f2 = g7vVar.a;
                final sdr sdrVar2 = f9vVar2.a;
                sdrVar2.getClass();
                yciVar = vnj.r(yciVar, "com.yandex.music.core.ui.compose.shimmerGradientText", new Object[0], new pyc() { // from class: idi
                    @Override // defpackage.pyc
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        yci yciVar2 = (yci) obj2;
                        ((Integer) obj4).getClass();
                        yciVar2.getClass();
                        oq5 oq5Var3 = (oq5) ((hq5) obj3);
                        oq5Var3.Z(488738160);
                        long j2 = d85.m;
                        d85 d85Var = new d85(j2);
                        long j3 = j;
                        List h2 = u75.h(d85Var, new d85(d85.b(j3, 0.8f, 0.0f, 0.0f, 0.0f, 14)), new d85(j3), new d85(d85.b(j3, 0.5f, 0.0f, 0.0f, 0.0f, 14)), new d85(j2));
                        yci b = androidx.compose.ui.graphics.a.b(yciVar2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 65535);
                        float f3 = f2;
                        boolean c = oq5Var3.c(f3);
                        sdr sdrVar3 = sdr.this;
                        boolean f4 = c | oq5Var3.f(sdrVar3) | oq5Var3.f(h2);
                        Object K4 = oq5Var3.K();
                        if (f4 || K4 == gq5.a) {
                            K4 = new jdi(f3, h2, sdrVar3, 0);
                            oq5Var3.k0(K4);
                        }
                        yci b2 = androidx.compose.ui.draw.a.b(b, (Function1) K4);
                        oq5Var3.p(false);
                        return b2;
                    }
                });
            }
            yci f3 = a.f(yciVar);
            ta5 a2 = sa5.a(qx0.c, gz2Var, oq5Var2, 48);
            int i4 = oq5Var2.P;
            a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, f3);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a2, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var2, i4, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            String str2 = (String) aqiVar.getValue();
            ges i5 = nu0.i();
            long z2 = v7g.z(15);
            long z3 = v7g.z(15);
            v7g.p(z3);
            ges b = ges.b(i5, 0L, z2, null, null, 0L, 0, v7g.D((float) (kes.c(z3) * 1.2d), 1095216660480L & z3), null, null, 0, 0, 16646141);
            ids O = o5g.O(0, 1, oq5Var2);
            int K4 = ff7.K(((cma) yhn.a(new cma(g7vVar.a - 4), new cma(0))).a, oq5Var2);
            boolean f4 = oq5Var2.f(str2) | oq5Var2.d(K4);
            Object K5 = oq5Var2.K();
            if (f4 || K5 == kjnVar) {
                int i6 = g7vVar.b;
                K5 = c9g.r(str2, ids.a(O, str2, b, 0, false, i6 + 1, ia6.b(K4, 10000, 5), 972), i6);
                oq5Var2.k0(K5);
            }
            oq5Var2.Z(-1083873156);
            Iterator it = ((z7v) K5).a.iterator();
            while (it.hasNext()) {
                ges gesVar = b;
                oq5 oq5Var3 = oq5Var2;
                xcs.b((String) it.next(), null, ((d85) function02.invoke()).a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 1, 0, null, gesVar, oq5Var3, 0, 3072, 56826);
                function02 = function0;
                b = gesVar;
                oq5Var2 = oq5Var3;
            }
            oq5Var = oq5Var2;
            oq5Var.p(false);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new erj(f9vVar, function0, sdrVar, i, 29);
        }
    }

    public static final void k(gnb gnbVar) {
        Window window = gnbVar.getWindow();
        window.getClass();
        l(window, gnbVar, 0);
    }

    public static final void l(Window window, Context context, int i) {
        window.getClass();
        if (Build.VERSION.SDK_INT >= 27) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.navigationBarColor}, 0, i);
            obtainStyledAttributes.getClass();
            window.setNavigationBarColor(obtainStyledAttributes.getColor(0, 0));
            obtainStyledAttributes.recycle();
        }
    }

    public static long m(vsb vsbVar, iss issVar) {
        Object obj;
        vsbVar.getClass();
        issVar.getClass();
        thr thrVar = issVar.c;
        String str = issVar.e;
        liq d = vsbVar.d(thrVar);
        long j = 0;
        if (d == null) {
            return 0L;
        }
        int ordinal = issVar.d.ordinal();
        if (ordinal == 0) {
            str.getClass();
            long h = d.h(0L, -1L, str);
            qc6.a(d.a(str));
            return h;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                b6e.s();
                return 0L;
            }
            Uri uri = leu.L(str).b;
            uri.getClass();
            String uri2 = uri.toString();
            uri2.getClass();
            long h2 = d.h(0L, -1L, uri2);
            qc6.a(d.a(uri2));
            return h2;
        }
        Uri N = ldg.N(str);
        N.getClass();
        e6b e6bVar = new e6b(d, vsb.c(vsbVar, d, null, null, 14));
        try {
            long j2 = e6bVar.H(N).a;
            try {
                i0e G = e6bVar.G(N);
                h0e h0eVar = G instanceof h0e ? (h0e) G : null;
                if (h0eVar != null) {
                    List list = h0eVar.d;
                    list.getClass();
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        Uri uri3 = (Uri) obj;
                        uri3.getClass();
                        if (e6bVar.H(uri3).c) {
                            break;
                        }
                    }
                    Uri uri4 = (Uri) obj;
                    if (uri4 != null) {
                        long j3 = j2 + e6bVar.H(uri4).a;
                        i0e G2 = e6bVar.G(uri4);
                        xzd xzdVar = G2 instanceof xzd ? (xzd) G2 : null;
                        if (xzdVar == null) {
                            return j3;
                        }
                        yde ydeVar = xzdVar.r;
                        ydeVar.getClass();
                        ArrayList arrayList = new ArrayList();
                        Iterator<E> it2 = ydeVar.iterator();
                        while (it2.hasNext()) {
                            String str2 = ((uzd) it2.next()).g;
                            if (str2 != null) {
                                arrayList.add(str2);
                            }
                        }
                        Iterator it3 = CollectionsKt.w0(CollectionsKt.z0(arrayList)).iterator();
                        long j4 = 0;
                        while (it3.hasNext()) {
                            Uri N2 = ldg.N((String) it3.next());
                            N2.getClass();
                            j4 += e6bVar.H(N2).a;
                        }
                        j2 = j3 + j4;
                        Iterator<E> it4 = ydeVar.iterator();
                        while (it4.hasNext()) {
                            String str3 = ((uzd) it4.next()).a;
                            str3.getClass();
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            j += e6bVar.H(parse).a;
                        }
                        return j2 + j;
                    }
                }
                return j2;
            } catch (IOException unused) {
                return j2;
            }
        } catch (IOException unused2) {
            return 0L;
        }
    }

    public static dtq o(String str) {
        String str2;
        if (str != null) {
            str2 = str.toLowerCase(Locale.ROOT);
            str2.getClass();
        } else {
            str2 = null;
        }
        if (str2 != null) {
            int hashCode = str2.hashCode();
            if (hashCode != -1383228885) {
                if (hashCode != -1364013995) {
                    if (hashCode == 115029 && str2.equals("top")) {
                        return ctq.c;
                    }
                } else if (str2.equals("center")) {
                    return btq.c;
                }
            } else if (str2.equals("bottom")) {
                return atq.c;
            }
        }
        return null;
    }

    public static ke2 p(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new ke2(fx1.g(view));
        }
        return null;
    }

    public static final String q(bd5 bd5Var) {
        bd5Var.getClass();
        return ouj.o(bd5Var.s(), StringUtils.PROCESS_POSTFIX_DELIMITER, bd5Var.a());
    }

    public static String r(long j) {
        long j2 = j / 3600000;
        long j3 = j / 60000;
        long minutes = j3 - TimeUnit.HOURS.toMinutes(j2);
        long seconds = (j / 1000) - TimeUnit.MINUTES.toSeconds(j3);
        return j2 > 0 ? String.format("%s:%02d:%02d", Long.valueOf(j2), Long.valueOf(minutes), Long.valueOf(seconds)) : minutes > 0 ? String.format("%s:%02d", Long.valueOf(minutes), Long.valueOf(seconds)) : String.format("%01d:%02d", Long.valueOf(minutes), Long.valueOf(seconds));
    }

    public static final int s(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                xq0.x("Step is zero.");
                return 0;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }

    public static final gom v(g8c g8cVar, DrmParameters drmParameters) {
        g8cVar.getClass();
        drmParameters.getClass();
        DrmConfig drmConfig = drmParameters.getDrmConfig();
        if (drmConfig instanceof DrmProxy) {
            return gut.e(new afg(13, g8cVar, drmParameters));
        }
        if (drmConfig instanceof DrmModule) {
            return gut.e(new ybg(13, drmParameters));
        }
        b6e.s();
        return null;
    }

    public static a0 w(a0 a0Var, int i) {
        List A;
        mse j;
        a0Var.getClass();
        fhl l = a0Var.j().C().l();
        switch (l == null ? -1 : zk5.a[l.ordinal()]) {
            case -1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return a0Var;
            case 0:
            default:
                b6e.s();
                return null;
            case 1:
                x j2 = a0Var.j();
                if (j2 == null || (A = j2.A()) == null) {
                    return a0Var;
                }
                int r = j2.r();
                Integer valueOf = Integer.valueOf(r);
                mse mseVar = null;
                if (r <= -1) {
                    valueOf = null;
                }
                if (valueOf == null) {
                    return a0Var;
                }
                int intValue = valueOf.intValue();
                i0 D = j2.D();
                if (D != null && (j = D.j()) != null && !j.isEmpty()) {
                    mseVar = j;
                }
                vat N = o5g.N(A, intValue, mseVar, i);
                List list = (List) N.a;
                List list2 = (List) N.b;
                int intValue2 = ((Number) N.c).intValue();
                pnl o = a0.o(a0Var);
                chl I = x.I(j2);
                I.d();
                x.g((x) I.b);
                I.d();
                x.f((x) I.b, list);
                I.d();
                x.h((x) I.b);
                if (list2 != null) {
                    meq k = i0.k();
                    k.h(list2);
                    i0 i0Var = (i0) k.b();
                    I.d();
                    x.p((x) I.b, i0Var);
                }
                I.h(intValue2);
                o.i((x) I.b());
                return (a0) o.b();
        }
    }

    public static void x(final Context context, final int i, final int i2) {
        Runnable runnable = new Runnable() { // from class: hvt
            @Override // java.lang.Runnable
            public final void run() {
                y5g.n0(context, i, i2);
            }
        };
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            n7w.O().post(runnable);
        }
    }

    public static void y(Context context, String str) {
        xlr xlrVar = new xlr(13, context, str);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            xlrVar.run();
        } else {
            n7w.O().post(xlrVar);
        }
    }

    public static final long z(String str, long j, long j2, long j3) {
        String str2;
        int i = f0s.a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        Long r0 = StringsKt.r0(10, str2);
        if (r0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = r0.longValue();
        if (j2 <= longValue && longValue <= j3) {
            return longValue;
        }
        StringBuilder q = k.q("System property '", j2, str, "' should be in range ");
        ouj.C(q, "..", j3, ", but is '");
        q.append(longValue);
        q.append('\'');
        throw new IllegalStateException(q.toString().toString());
    }

    public void n(int i) {
        new Handler(Looper.getMainLooper()).post(new no0(this, i, 3));
    }

    public abstract void t(int i);

    public abstract void u(Typeface typeface);
}
