package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.connectsdk.discovery.provider.ssdp.SSDPDeviceDescriptionParser;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.ott.data.dto.Ott;
import ru.yandex.video.m3.ott.data.dto.OttVideoData;
import ru.yandex.video.m3.ott.impl.TrackingEventType;
import ru.yandex.video.m3.player.tracks.TrackVariant;
import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData$UgcLiveStatus;

/* loaded from: classes6.dex */
public final class q2t {
    public final paw a;
    public final Ott.TrackingData b;
    public final cke c;
    public final e18 d;
    public final xiu e;
    public final j6e f;
    public final jyr g;
    public boolean h;
    public boolean i;

    public q2t(paw pawVar, Ott.TrackingData trackingData, cke ckeVar, ujl ujlVar, e18 e18Var, z23 z23Var, xiu xiuVar, wul wulVar, b2c b2cVar, j6e j6eVar) {
        pawVar.getClass();
        e18Var.getClass();
        this.a = pawVar;
        this.b = trackingData;
        this.c = ckeVar;
        this.d = e18Var;
        this.e = xiuVar;
        this.f = j6eVar;
        this.g = btf.b(new p2t(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0252, code lost:
    
        if ((r2 > 0) != false) goto L138;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LinkedHashMap a(q2t q2tVar, TrackingEventType trackingEventType, String str, o2t o2tVar, int i) {
        String str2;
        String str3;
        String str4;
        Long valueOf;
        Long valueOf2;
        Long valueOf3;
        Long l;
        String str5;
        List split$default;
        boolean U;
        List split$default2;
        CharSequence charSequence;
        NetworkInfo activeNetworkInfo;
        isb b;
        isb b2;
        isb b3;
        isb b4;
        Long l2 = null;
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            o2tVar = null;
        }
        q2tVar.getClass();
        trackingEventType.getClass();
        String name = trackingEventType.name();
        Locale locale = Locale.ROOT;
        String s = ouj.s(locale, name, locale);
        cke ckeVar = q2tVar.c;
        paw pawVar = q2tVar.a;
        Ott.TrackingData trackingData = q2tVar.b;
        LinkedHashMap q = uah.q(trackingData.getTrackings());
        q.put("eventType", s);
        q.put("downloaded", Integer.valueOf(trackingData.getDownloaded() ? 1 : 0));
        String fromBlock = trackingData.getFromBlock();
        if (fromBlock != null) {
            q.put("fromBlock", fromBlock);
        }
        String D = pawVar.D();
        if (D != null) {
            q.put("vSid", D);
        }
        nqs f = pawVar.f();
        if (f != null) {
            jsb jsbVar = (jsb) f;
            TrackVariant c = jsbVar.c();
            if (c == null || (str2 = c.getTitle()) == null) {
                str2 = jsbVar.c.z();
            }
        } else {
            str2 = null;
        }
        if (str2 != null) {
            q.put("audio-track-name", str2);
        }
        nqs f2 = pawVar.f();
        String str6 = (f2 == null || (b4 = ((jsb) f2).b()) == null) ? null : b4.d;
        if (str6 != null) {
            q.put("audio-track-lang", str6);
        }
        nqs C = pawVar.C();
        if (C != null) {
            jsb jsbVar2 = (jsb) C;
            TrackVariant c2 = jsbVar2.c();
            if (c2 == null || (str3 = c2.getTitle()) == null) {
                str3 = jsbVar2.c.z();
            }
        } else {
            str3 = null;
        }
        if (str3 != null) {
            q.put("text-track-name", str3);
        }
        nqs C2 = pawVar.C();
        String str7 = (C2 == null || (b3 = ((jsb) C2).b()) == null) ? null : b3.d;
        if (str7 != null) {
            q.put("text-track-lang", str7);
        }
        nqs x = pawVar.x();
        Integer valueOf4 = (x == null || (b2 = ((jsb) x).b()) == null) ? null : Integer.valueOf(b2.h);
        if (valueOf4 != null) {
            q.put("bitrate_video", valueOf4);
        }
        nqs x2 = pawVar.x();
        Integer valueOf5 = (x2 == null || (b = ((jsb) x2).b()) == null) ? null : Integer.valueOf(b.h);
        if (valueOf5 != null) {
            q.put("bitrate_audio", valueOf5);
        }
        VideoType B = pawVar.B();
        q.put("fts", Long.valueOf((B == null ? -1 : w2t.a[B.ordinal()]) == 1 ? pawVar.getPosition() : pawVar.v() + pawVar.getPosition()));
        q.put("timestamp", Long.valueOf(System.currentTimeMillis()));
        xiu xiuVar = q2tVar.e;
        int m = ldg.m((Context) xiuVar.b, "android.permission.ACCESS_NETWORK_STATE");
        Integer valueOf6 = Integer.valueOf(m);
        if (m != 0) {
            valueOf6 = null;
        }
        q.put(UgcLiveVideoData$UgcLiveStatus.OFFLINE, Integer.valueOf(((valueOf6 == null || (activeNetworkInfo = ((ConnectivityManager) ((jyr) xiuVar.c).getValue()).getActiveNetworkInfo()) == null) ? 0 : activeNetworkInfo.isConnected()) ^ 1));
        if (str != null) {
            q.put("errorCode", str);
        }
        q.put("pictureInPicture", 0);
        String str8 = ckeVar.b().a;
        if (str8 != null) {
            q.put("appName", str8);
        }
        q.put("appVersion", ckeVar.b().b);
        q.put("platformOs", "Android");
        String str9 = Build.MANUFACTURER;
        if (str9 == null) {
            str9 = "Unknown";
        }
        q.put("platformVendor", str9);
        String str10 = Build.MODEL;
        q.put("platformModel", str10 != null ? str10 : "Unknown");
        q.put(SSDPDeviceDescriptionParser.TAG_DEVICE_TYPE, Integer.valueOf(trackingData.getDeviceType().getValue()));
        String str11 = (String) q2tVar.g.getValue();
        if (str11 != null) {
            q.put("device_id", str11);
        }
        q.put("drm_supported", Integer.valueOf(q2tVar.i ? 1 : 0));
        VideoData G = pawVar.G();
        if (G != null) {
            OttVideoData ottVideoData = G instanceof OttVideoData ? (OttVideoData) G : null;
            if (ottVideoData != null && ottVideoData.getDrmConfig() != null) {
                str4 = "Widevine".toLowerCase(locale);
                str4.getClass();
                if (str4 != null) {
                    q.put("drm_system_use", str4);
                }
                valueOf = o2tVar == null ? Long.valueOf(o2tVar.d) : null;
                if (valueOf != null) {
                    q.put("buffering_count", valueOf);
                }
                valueOf2 = o2tVar == null ? Long.valueOf(o2tVar.a / 1000) : null;
                if (valueOf2 != null) {
                    q.put("content_sec", valueOf2);
                }
                valueOf3 = o2tVar == null ? Long.valueOf(o2tVar.b / 1000) : null;
                if (valueOf3 != null) {
                    q.put("buffering_sec", valueOf3);
                }
                if (o2tVar != null) {
                    long j = o2tVar.e;
                    l = Long.valueOf(j);
                }
                l = null;
                if (l != null) {
                    q.put("init_before_stream_or_ad_request_msec", l);
                }
                if (o2tVar != null) {
                    long j2 = o2tVar.c;
                    Long valueOf7 = Long.valueOf(j2);
                    if (j2 > 0) {
                        l2 = valueOf7;
                    }
                }
                if (l2 != null) {
                    q.put("stream_or_ad_initial_buffering_msec", l2);
                }
                str5 = Build.VERSION.RELEASE;
                split$default = StringsKt__StringsKt.split$default(str5 != null ? "" : str5, new String[]{"."}, false, 2, 2, null);
                CharSequence charSequence2 = (CharSequence) CollectionsKt.Q(split$default);
                U = StringsKt.U(charSequence2);
                String str12 = CommonUrlParts.Values.FALSE_INTEGER;
                if (U) {
                    charSequence2 = CommonUrlParts.Values.FALSE_INTEGER;
                }
                q.put("platformOsVersionMajor", charSequence2);
                if (str5 == null) {
                    str5 = "";
                }
                split$default2 = StringsKt__StringsKt.split$default(str5, new String[]{"."}, false, 2, 2, null);
                charSequence = (CharSequence) (!(1 < split$default2.size()) ? split$default2.get(1) : CommonUrlParts.Values.FALSE_INTEGER);
                if (!StringsKt.U(charSequence)) {
                    str12 = charSequence;
                }
                q.put("platformOsVersionMinor", str12);
                q.put("mute", Integer.valueOf(q2tVar.f.i() ? 1 : 0));
                q.put("fullscreen", Integer.valueOf(q2tVar.h ? 1 : 0));
                return q;
            }
        }
        str4 = null;
        if (str4 != null) {
        }
        if (o2tVar == null) {
        }
        if (valueOf != null) {
        }
        if (o2tVar == null) {
        }
        if (valueOf2 != null) {
        }
        if (o2tVar == null) {
        }
        if (valueOf3 != null) {
        }
        if (o2tVar != null) {
        }
        l = null;
        if (l != null) {
        }
        if (o2tVar != null) {
        }
        if (l2 != null) {
        }
        str5 = Build.VERSION.RELEASE;
        split$default = StringsKt__StringsKt.split$default(str5 != null ? "" : str5, new String[]{"."}, false, 2, 2, null);
        CharSequence charSequence22 = (CharSequence) CollectionsKt.Q(split$default);
        U = StringsKt.U(charSequence22);
        String str122 = CommonUrlParts.Values.FALSE_INTEGER;
        if (U) {
        }
        q.put("platformOsVersionMajor", charSequence22);
        if (str5 == null) {
        }
        split$default2 = StringsKt__StringsKt.split$default(str5, new String[]{"."}, false, 2, 2, null);
        charSequence = (CharSequence) (!(1 < split$default2.size()) ? split$default2.get(1) : CommonUrlParts.Values.FALSE_INTEGER);
        if (!StringsKt.U(charSequence)) {
        }
        q.put("platformOsVersionMinor", str122);
        q.put("mute", Integer.valueOf(q2tVar.f.i() ? 1 : 0));
        q.put("fullscreen", Integer.valueOf(q2tVar.h ? 1 : 0));
        return q;
    }
}
