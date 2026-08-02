package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.connectsdk.service.airplay.PListParser;
import com.yandex.music.shared.bdu.trigger.network.dto.TriggerPollingRequestDto;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.AssertionsKt;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.wave.recommendations.StationId;
import ru.yandex.video.m3.list_player_manager.impl.EngineReuseException;
import ru.yandex.video.m3.player.impl.tracking.a;

/* loaded from: classes4.dex */
public final class ox1 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox1(Continuation continuation, a72 a72Var) {
        super(2, continuation);
        this.j = 1;
        this.k = a72Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new ox1((px1) this.k, continuation, 0);
            case 1:
                return new ox1(continuation, (a72) this.k);
            case 2:
                return new ox1((za2) this.k, continuation, 2);
            case 3:
                return new ox1((osh) this.k, continuation, 3);
            case 4:
                return new ox1((t) this.k, continuation, 4);
            case 5:
                return new ox1((kkp) this.k, continuation, 5);
            case 6:
                return new ox1((tt4) this.k, continuation, 6);
            case 7:
                return new ox1((jk5) this.k, continuation, 7);
            case 8:
                return new ox1((nv5) this.k, continuation, 8);
            case 9:
                return new ox1((c26) this.k, continuation, 9);
            case 10:
                return new ox1((z66) this.k, continuation, 10);
            case 11:
                return new ox1((t4w) this.k, continuation, 11);
            case 12:
                return new ox1((c3r) this.k, continuation, 12);
            case 13:
                return new ox1((l78) this.k, continuation, 13);
            case 14:
                return new ox1((a) this.k, continuation, 14);
            case 15:
                return new ox1((dn9) this.k, continuation, 15);
            case 16:
                return new ox1((k8c) this.k, continuation, 16);
            case 17:
                return new ox1((grc) this.k, continuation, 17);
            case 18:
                return new ox1((bqr) this.k, continuation, 18);
            case 19:
                return new ox1((odd) this.k, continuation, 19);
            case 20:
                return new ox1((ygd) this.k, continuation, 20);
            case 21:
                return new ox1((j2e) this.k, continuation, 21);
            case 22:
                return new ox1((u2f) this.k, continuation, 22);
            case 23:
                return new ox1((jef) this.k, continuation, 23);
            case 24:
                return new ox1((tjf) this.k, continuation, 24);
            case 25:
                return new ox1((n4g) this.k, continuation, 25);
            case 26:
                return new ox1((ecg) this.k, continuation, 26);
            case 27:
                return new ox1((xh1) this.k, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new ox1((byte[]) this.k, continuation, 28);
            default:
                return new ox1((toh) this.k, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((ox1) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v19, types: [pjc] */
    /* JADX WARN: Type inference failed for: r2v3, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, wu5] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v9, types: [xiu] */
    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        String str;
        Object lv5Var;
        kkp kkpVar;
        b5k b5kVar;
        int i;
        int i2 = 20;
        int i3 = 5;
        int i4 = 2;
        ?? r7 = 0;
        r7 = null;
        Integer num = null;
        r7 = 0;
        int i5 = 1;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                ?? r2 = ((px1) this.k).b;
                ((krh) r2.getValue()).getClass();
                irh g = krh.g();
                if (!g.g) {
                    g = null;
                }
                if (g == null) {
                    ((krh) r2.getValue()).getClass();
                    krh.b();
                    g = krh.c().v;
                    if (g == null) {
                        xq0.q("There is no default route.  The media router has not yet been fully initialized.");
                        return null;
                    }
                }
                int i6 = g.n;
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 != 3) {
                            if (i6 != 20 && i6 != 13 && i6 != 14) {
                                switch (i6) {
                                    default:
                                        switch (i6) {
                                            case 22:
                                                break;
                                            case 23:
                                            case 24:
                                                break;
                                            default:
                                                return qx1.c;
                                        }
                                    case 16:
                                    case 17:
                                    case 18:
                                        return qx1.b;
                                }
                            }
                        }
                        return qx1.a;
                    }
                    return qx1.b;
                }
                int identifier = Resources.getSystem().getIdentifier("default_audio_route_name", PListParser.TAG_STRING, ConstantDeviceInfo.APP_PLATFORM);
                krh.b();
                irh irhVar = krh.c().v;
                if (irhVar == null) {
                    xq0.q("There is no default route.  The media router has not yet been fully initialized.");
                    return null;
                }
                if (irhVar == g && TextUtils.equals(Resources.getSystem().getText(identifier), g.d)) {
                    return qx1.c;
                }
                if (!g.h) {
                    return qx1.c;
                }
                krh.b();
                return krh.c().w == g ? qx1.a : qx1.b;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                yfx yfxVar = ((a72) this.k).a;
                xdr xdrVar = saa.a;
                String str2 = ((frt) yfxVar.c).c().a;
                str2.getClass();
                ssg.a(4, "AutoDownloadTracksCacheInfoDatabaseImpl", "get all for user ".concat(str2), null);
                return w62.c((List) up6.F(((w62) yfxVar.b).a(str2).a, true, true, new uv1(19)));
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                String string = ((dd0) ((za2) this.k).j.getValue()).a.getString(R.string.android_auto_downloaded_tabs);
                string.getClass();
                return bb2.c(string);
            case 3:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                ?? r0 = ((osh) this.k).b;
                ((Boolean) r0.getValue()).booleanValue();
                Log.d("BasicOkHttp", "libssl warmed: " + ((Boolean) r0.getValue()).booleanValue());
                return Unit.a;
            case 4:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                jyr jyrVar = px2.a;
                px2.b((t) this.k);
                return Unit.a;
            case 5:
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                x34 x34Var = (x34) ((jyr) ((kkp) this.k).e).getValue();
                y34 y34Var = (y34) x34Var.a.getValue();
                c44 c44Var = (c44) x34Var.b.b;
                f24 f24Var = c44Var.a;
                String str3 = c44Var.b;
                f24Var.getClass();
                str3.getClass();
                y34Var.getClass();
                nmb nmbVar = (nmb) y34Var.b.getValue();
                String G = y34Var.a.G();
                ckb ckbVar = ckb.Shortcut;
                switch (f24Var.ordinal()) {
                    case 0:
                        str = "downloads";
                        break;
                    case 1:
                        str = "playlists";
                        break;
                    case 2:
                        str = "albums";
                        break;
                    case 3:
                        str = "kids";
                        break;
                    case 4:
                        str = "books";
                        break;
                    case 5:
                        str = "podcasts";
                        break;
                    case 6:
                        str = "clips";
                        break;
                    case 7:
                        str = "wave_for_two";
                        break;
                    default:
                        b6e.s();
                        return null;
                }
                nmbVar.b("collection", G, ckbVar, str, str3, dkb.Longtap);
                return Unit.a;
            case 6:
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                ((tt4) this.k).e();
                return Unit.a;
            case 7:
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                jk5 jk5Var = (jk5) this.k;
                return jk5Var.a.b(new TriggerPollingRequestDto(jk5Var.b.a()));
            case 8:
                jv5 jv5Var = jv5.a;
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                nv5 nv5Var = (nv5) this.k;
                b2c b2cVar = nv5Var.m;
                yu5 yu5Var = nv5Var.k;
                xu5 xu5Var = nv5Var.l;
                b2cVar.getClass();
                yu5Var.getClass();
                xu5Var.getClass();
                ArrayList arrayList = yu5Var.a;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    String uri = ((CoverPath) obj2).getUri();
                    if (uri != null && !StringsKt.U(uri)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    CoverPath coverPath = (CoverPath) it.next();
                    String w = vz1.w(coverPath);
                    String pathForSize = coverPath.getPathForSize(frv.b() * 3);
                    pathForSize.getClass();
                    arrayList3.add(new p0d(w, pathForSize));
                }
                n8g b = t75.b();
                ArrayList arrayList4 = new ArrayList(v75.o(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(new zu5((p0d) it2.next()));
                }
                b.addAll(arrayList4);
                n8g a = t75.a(b);
                n8g n8gVar = !a.isEmpty() ? a : null;
                if (n8gVar == null) {
                    lv5Var = jv5Var;
                } else {
                    ?? r3 = wu5.a;
                    if (!r3.equals(r3)) {
                        b6e.s();
                        return null;
                    }
                    int e = yhn.e(0, u75.f(n8gVar));
                    lv5Var = new lv5(e, e, e, null, n8gVar, arrayList.size() > 1);
                }
                xdr xdrVar2 = nv5Var.o;
                xdrVar2.getClass();
                xdrVar2.m(null, lv5Var);
                if (lv5Var instanceof lv5) {
                    cq4 F = ot0.F(nv5Var);
                    xu5Var.getClass();
                    r7 = new xiu(F, new e65(0, nv5Var, nv5.class, "performScroll", "performScroll()V", 0, 6));
                } else if (!lv5Var.equals(kv5.a) && !lv5Var.equals(jv5Var)) {
                    b6e.s();
                    return null;
                }
                nv5Var.n = r7;
                return Unit.a;
            case 9:
                nm6 nm6Var10 = nm6.a;
                qgg.h0(obj);
                ((c26) this.k).d();
                return Unit.a;
            case 10:
                nm6 nm6Var11 = nm6.a;
                qgg.h0(obj);
                z66 z66Var = (z66) this.k;
                z66Var.b.getValue();
                z66Var.d().getValue();
                z66Var.c().getValue();
                return Unit.a;
            case 11:
                nm6 nm6Var12 = nm6.a;
                qgg.h0(obj);
                String str4 = y96.a;
                t4w t4wVar = (t4w) this.k;
                jsg.j().e(str4, "Constraints changed for " + t4wVar);
                return Unit.a;
            case 12:
                nm6 nm6Var13 = nm6.a;
                qgg.h0(obj);
                c3r c3rVar = (c3r) this.k;
                if (c3rVar != null) {
                    ((nw7) c3rVar).b();
                }
                return Unit.a;
            case 13:
                nm6 nm6Var14 = nm6.a;
                qgg.h0(obj);
                l78 l78Var = (l78) this.k;
                synchronized (l78Var) {
                    if (!l78Var.l || l78Var.m) {
                        return Unit.a;
                    }
                    try {
                        l78Var.Q();
                    } catch (IOException unused) {
                        l78Var.n = true;
                    }
                    try {
                        if (l78Var.i >= 2000) {
                            l78Var.S();
                        }
                    } catch (IOException unused2) {
                        l78Var.o = true;
                        l78Var.j = new hkn(new y33());
                    }
                    return Unit.a;
                }
            case 14:
                nm6 nm6Var15 = nm6.a;
                qgg.h0(obj);
                a aVar = (a) this.k;
                List list = a.q;
                aVar.getClass();
                return a.k();
            case 15:
                nm6 nm6Var16 = nm6.a;
                qgg.h0(obj);
                dn9 dn9Var = (dn9) this.k;
                br1 br1Var = (br1) dn9Var.b;
                fs7 fs7Var = (fs7) dn9Var.e;
                tc1 tc1Var = (tc1) dn9Var.c;
                JSONObject a2 = br1Var.a("license.json");
                JSONArray jSONArray = a2.getJSONObject("card").getJSONArray("states").getJSONObject(0).getJSONObject("div").getJSONArray("items");
                jSONArray.getClass();
                int length = jSONArray.length();
                for (int i7 = 0; i7 < length; i7++) {
                    Object obj3 = jSONArray.get(i7);
                    if (obj3 instanceof JSONObject) {
                        JSONObject jSONObject = (JSONObject) obj3;
                        if (i7 == 0) {
                            fs7Var.getClass();
                            jSONObject.put("text", tc1Var.b(R.string.paymentsdk_sbp_agreement_title));
                        } else if (i7 == 1) {
                            fs7Var.getClass();
                            jSONObject.put("body", tc1Var.b(R.string.paymentsdk_sbp_agreement_first_point_short));
                        } else if (i7 == 2) {
                            fs7Var.getClass();
                            jSONObject.put("body", tc1Var.b(R.string.paymentsdk_sbp_agreement_second_point_short));
                        } else if (i7 == 3) {
                            fs7Var.getClass();
                            jSONObject.put("title", tc1Var.b(R.string.paymentsdk_close));
                        }
                    }
                }
                return a2;
            case 16:
                nm6 nm6Var17 = nm6.a;
                qgg.h0(obj);
                return ((k8c) this.k).a.a("result_screen.json");
            case 17:
                nm6 nm6Var18 = nm6.a;
                qgg.h0(obj);
                grc grcVar = (grc) this.k;
                Iterator it3 = grcVar.a.iterator();
                while (it3.hasNext()) {
                    ((erc) it3.next()).a();
                }
                Iterator it4 = grcVar.b.iterator();
                while (it4.hasNext()) {
                    qfj qfjVar = (qfj) it4.next();
                    int i8 = qfjVar.a;
                    Object obj4 = qfjVar.b;
                    switch (i8) {
                        case 0:
                            ((rfj) obj4).g();
                            break;
                        default:
                            z4l z4lVar = (z4l) obj4;
                            z4lVar.h = true;
                            z4lVar.b(s4l.c);
                            break;
                    }
                }
                return Unit.a;
            case 18:
                nm6 nm6Var19 = nm6.a;
                qgg.h0(obj);
                try {
                    Bitmap copy = vq2.N(((bqr) this.k).a, 0, 0, 7).copy(Bitmap.Config.ARGB_8888, true);
                    try {
                        try {
                            kkpVar = new d4b(copy).a();
                        } finally {
                            copy.recycle();
                        }
                    } catch (Exception unused3) {
                        Assertions.throwOrSkip("GalleryImage", new FailedAssertionException("Error while generating palette from bitmap of size " + copy.getHeight() + "*" + copy.getWidth()));
                        copy.recycle();
                        kkpVar = null;
                    }
                    if (kkpVar != null && (b5kVar = (b5k) kkpVar.e) != null) {
                        num = new Integer(b5kVar.d);
                    }
                    return new d85(num != null ? c3x.f(num.intValue()) : d85.b);
                } catch (IllegalArgumentException unused4) {
                    dfi.r("Error while converting drawable to bitmap", "GalleryImage");
                    return new d85(d85.b);
                }
            case 19:
                nm6 nm6Var20 = nm6.a;
                qgg.h0(obj);
                odd oddVar = (odd) this.k;
                AssertionsKt.getAssertionsEnabled();
                yjd yjdVar = (yjd) oddVar.b.b.getValue();
                mm6 mm6Var = yjdVar.e;
                if (yjdVar.f) {
                    i = 21;
                } else {
                    yjdVar.f = true;
                    xdr xdrVar3 = frc.a.g;
                    vdr c = ((z66) yjdVar.b.getValue()).c();
                    pjc j = ((frt) yjdVar.a.getValue()).j();
                    jyr jyrVar2 = p6m.f;
                    fs b0 = o6m.e() ? zsd.b0(new ifd(((j6m) ((d6m) yjdVar.c.getValue())).j, i5)) : new fs(15, Boolean.FALSE);
                    int i9 = 0;
                    int i10 = 12;
                    ox6.B(new ub7(i10, zsd.b0(zsd.P(xdrVar3, c, j, b0, new ujd(5, yjdVar, yjd.class, "composeForDiscovery", "composeForDiscovery(Lcom/yandex/music/core/ui/utils/ForegroundDetector$ForegroundState;Lcom/yandex/music/shared/utils/network/connectivity/ConnectivityInfo;Lcom/yandex/music/shared/auth/api/FullUserInfo;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", i9, 0))), new xc(i4, i2, r7)), mm6Var, new vjd(yjdVar.h, 0));
                    ox6.B(new ub7(i10, zsd.b0(zsd.P(xdrVar3, c, j, b0, new ujd(5, yjdVar, yjd.class, "composeForSmartHome", "composeForSmartHome(Lcom/yandex/music/core/ui/utils/ForegroundDetector$ForegroundState;Lcom/yandex/music/shared/utils/network/connectivity/ConnectivityInfo;Lcom/yandex/music/shared/auth/api/FullUserInfo;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", i9, 1))), new xc(i4, 21, r7)), mm6Var, new vjd(yjdVar.i, 1));
                    i = 21;
                    ox6.B(new ub7(i10, zsd.b0(zsd.Q(c, j, b0, new wjd(4, yjdVar, yjd.class, "composeForConnection", "composeForConnection(Lcom/yandex/music/shared/utils/network/connectivity/ConnectivityInfo;Lcom/yandex/music/shared/auth/api/FullUserInfo;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", i9, 0))), new xc(i4, 22, r7)), mm6Var, new vjd(yjdVar.g, i4));
                }
                iz7 iz7Var = oddVar.j;
                x97.y((mm6) iz7Var.b, null, null, new ped(iz7Var, r7, 1), 3);
                int i11 = 27;
                ox6.B((pjc) ((jyr) iz7Var.l).getValue(), (mm6) iz7Var.b, new u58(i11, iz7Var));
                l18 l18Var = l18.b;
                bdt I = hag.I(vfd.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                vfd vfdVar = (vfd) qdcVar.C(I);
                if (!vfdVar.g.d.a()) {
                    vfdVar.g.g();
                    ox6.B(zsd.d0(vfdVar.b.m, 1), vfdVar.h, new u58(28, vfdVar));
                }
                jfd jfdVar = oddVar.b;
                int i12 = 0;
                ox6.B(zsd.Q(jfdVar.i, new ifd(jfdVar.j, i12), new ub7(i, oddVar.m, oddVar), new kdd(4, i12, (Continuation) r7)), oddVar.f, new fdd(oddVar, 3));
                ox6.B(oddVar.d.g, oddVar.f, new fdd(oddVar, 1));
                ox6.B(new fs(17, new ifd(oddVar.b.j, 0)), oddVar.f, new fdd(oddVar, i4));
                ox6.B(zsd.M0(oddVar.m, new l1((Continuation) r7, oddVar, i11)), oddVar.f, new fdd(oddVar, 0));
                return Unit.a;
            case 20:
                nm6 nm6Var21 = nm6.a;
                qgg.h0(obj);
                return new Double(rre.U((ygd) this.k, false, 0.0d));
            case 21:
                nm6 nm6Var22 = nm6.a;
                qgg.h0(obj);
                h2e h2eVar = (h2e) ((j2e) this.k).d.b;
                if (!h2eVar.r) {
                    h2eVar.r = true;
                    h2eVar.s.d();
                }
                return Unit.a;
            case 22:
                nm6 nm6Var23 = nm6.a;
                qgg.h0(obj);
                l1b.f(((u2f) this.k).a).cancel(5);
                return Unit.a;
            case 23:
                nm6 nm6Var24 = nm6.a;
                qgg.h0(obj);
                ((gef) ((jef) this.k).d.b).n.d();
                return Unit.a;
            case 24:
                nm6 nm6Var25 = nm6.a;
                qgg.h0(obj);
                tjf tjfVar = (tjf) this.k;
                ekf ekfVar = tjfVar.d;
                if (ekfVar != null) {
                    StationId a3 = tjfVar.a();
                    if (a3 == null) {
                        return Unit.a;
                    }
                    ekfVar.a(a3.h(), wre.c, tjfVar.x, ah.c);
                }
                return Unit.a;
            case 25:
                nm6 nm6Var26 = nm6.a;
                qgg.h0(obj);
                g4g g4gVar = ((n4g) this.k).b;
                g4gVar.e = true;
                x97.y(g4gVar.c, null, null, new f4g(g4gVar, r7, i5), 3);
                n4g n4gVar = (n4g) this.k;
                p4g p4gVar = n4gVar.d;
                y yVar = n4gVar.a;
                p4gVar.getClass();
                pu0 t = pd.t(new qzm[0]);
                sai saiVar = new sai(false);
                cvo cvoVar = cvo.i;
                e3s.X(o6m.b(wjb.BottomsheetScreen, null, 6), yVar, "LIKE_ONBOARDING_BOTTOM_SHEET", saiVar, null, new wn5(new gab(i3, t, saiVar), 1574052367, true), 48);
                return Unit.a;
            case 26:
                nm6 nm6Var27 = nm6.a;
                qgg.h0(obj);
                ecg ecgVar = (ecg) this.k;
                ime imeVar = ecgVar.h;
                ArrayList arrayList5 = (ArrayList) imeVar.b;
                Iterator it5 = arrayList5.iterator();
                while (it5.hasNext()) {
                    ((acg) ((rue) it5.next())).h((q9g) imeVar.d);
                }
                arrayList5.clear();
                ru.yandex.video.m3.list_player_manager.impl.a aVar2 = ecgVar.b;
                qdc qdcVar2 = aVar2.c;
                LinkedHashMap linkedHashMap = aVar2.j;
                LinkedHashMap linkedHashMap2 = aVar2.i;
                y7g.Y(false, qdcVar2);
                aVar2.h.clear();
                aVar2.k.clear();
                ArrayList arrayList6 = aVar2.g;
                if (!arrayList6.isEmpty() || !linkedHashMap2.isEmpty() || !linkedHashMap.isEmpty()) {
                    y7g.Q(new EngineReuseException.ReleaseCalledButPlayersAlive("Release called, but some players are not returned to ListYandexPlayerManager.", null, 2, null), qdcVar2, "EngineReuseManager", "release", "Release called, but some players are not returned to ListYandexPlayerManager.");
                    Iterator it6 = CollectionsKt.w0(arrayList6).iterator();
                    while (it6.hasNext()) {
                        aVar2.n((rue) it6.next());
                    }
                    linkedHashMap2.clear();
                    linkedHashMap.clear();
                }
                xbu xbuVar = ecgVar.c;
                xbuVar.c.H("VideoPreloadManager", "release", "isPreloadManagerReady = " + xbuVar.r, new Object[0]);
                if (xbuVar.r) {
                    xbuVar.b();
                }
                xbuVar.p.clear();
                xbuVar.m.clear();
                xbuVar.o.clear();
                xbuVar.q.clear();
                xbuVar.n = true;
                ecgVar.g(null);
                ecgVar.l.b();
                gag gagVar = ecgVar.j;
                rar rarVar = gagVar.e;
                if (rarVar != null) {
                    rarVar.g(null);
                }
                for (u7b u7bVar : ((eag) gagVar.c.getValue()).f.values()) {
                    u7bVar.a.F(u7bVar.b);
                }
                rar rarVar2 = ecgVar.n;
                if (rarVar2 != null) {
                    rarVar2.g(null);
                }
                return Unit.a;
            case 27:
                nm6 nm6Var28 = nm6.a;
                qgg.h0(obj);
                y35 y35Var = y35.WIZARD;
                return ((xh1) this.k).d(new nrf("collection_sections_id", "COLLECTION_SECTIONS"));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                nm6 nm6Var29 = nm6.a;
                qgg.h0(obj);
                byte[] bArr = (byte[]) this.k;
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                if (decodeByteArray != null) {
                    return decodeByteArray;
                }
                kac.f("Can't decode bitmap");
                return null;
            default:
                nm6 nm6Var30 = nm6.a;
                qgg.h0(obj);
                ((dk4) ((toh) this.k).d).b();
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ox1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = obj;
    }
}
