package defpackage;

import com.connectsdk.etc.helper.HttpMessage;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.data.exception.ManifestLoadingException;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;
import ru.yandex.video.m3.ott.data.dto.ExtendedVh;
import ru.yandex.video.m3.ott.data.dto.Vh;
import ru.yandex.video.m3.ott.data.net.impl.VhManifestApi$getManifest$1$invoke$lambda$8$$inlined$from$1;
import ru.yandex.video.m3.ott.data.net.impl.VhManifestApi$getManifest$1$invoke$lambda$8$lambda$5$$inlined$from$1;

/* loaded from: classes6.dex */
public final class g1u extends uif implements Function0 {
    public final /* synthetic */ h1u r;
    public final /* synthetic */ String s;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1u(h1u h1uVar, String str, String str2) {
        super(0);
        this.r = h1uVar;
        this.s = str;
        this.t = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0139, code lost:
    
        r11 = r9.getStreams();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02c5, code lost:
    
        r0 = r10.getContent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02c9, code lost:
    
        if (r0 == null) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02cb, code lost:
    
        r0 = r0.getOttParams();
     */
    /* JADX WARN: Removed duplicated region for block: B:156:0x016a A[Catch: all -> 0x0117, Exception -> 0x011b, TryCatch #0 {Exception -> 0x011b, blocks: (B:126:0x00f6, B:128:0x00fa, B:130:0x0112, B:131:0x011f, B:133:0x0123, B:138:0x012f, B:143:0x0139, B:144:0x013f, B:146:0x0147, B:148:0x014d, B:149:0x0153, B:151:0x0159, B:153:0x015f, B:154:0x0165, B:156:0x016a, B:158:0x0175, B:160:0x0180, B:162:0x018b, B:164:0x0196, B:166:0x01a1, B:168:0x01ac, B:170:0x01b7, B:172:0x01c2, B:173:0x01cb, B:175:0x01d2, B:177:0x01da, B:178:0x01e0), top: B:125:0x00f6, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0175 A[Catch: all -> 0x0117, Exception -> 0x011b, TryCatch #0 {Exception -> 0x011b, blocks: (B:126:0x00f6, B:128:0x00fa, B:130:0x0112, B:131:0x011f, B:133:0x0123, B:138:0x012f, B:143:0x0139, B:144:0x013f, B:146:0x0147, B:148:0x014d, B:149:0x0153, B:151:0x0159, B:153:0x015f, B:154:0x0165, B:156:0x016a, B:158:0x0175, B:160:0x0180, B:162:0x018b, B:164:0x0196, B:166:0x01a1, B:168:0x01ac, B:170:0x01b7, B:172:0x01c2, B:173:0x01cb, B:175:0x01d2, B:177:0x01da, B:178:0x01e0), top: B:125:0x00f6, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0180 A[Catch: all -> 0x0117, Exception -> 0x011b, TryCatch #0 {Exception -> 0x011b, blocks: (B:126:0x00f6, B:128:0x00fa, B:130:0x0112, B:131:0x011f, B:133:0x0123, B:138:0x012f, B:143:0x0139, B:144:0x013f, B:146:0x0147, B:148:0x014d, B:149:0x0153, B:151:0x0159, B:153:0x015f, B:154:0x0165, B:156:0x016a, B:158:0x0175, B:160:0x0180, B:162:0x018b, B:164:0x0196, B:166:0x01a1, B:168:0x01ac, B:170:0x01b7, B:172:0x01c2, B:173:0x01cb, B:175:0x01d2, B:177:0x01da, B:178:0x01e0), top: B:125:0x00f6, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x018b A[Catch: all -> 0x0117, Exception -> 0x011b, TryCatch #0 {Exception -> 0x011b, blocks: (B:126:0x00f6, B:128:0x00fa, B:130:0x0112, B:131:0x011f, B:133:0x0123, B:138:0x012f, B:143:0x0139, B:144:0x013f, B:146:0x0147, B:148:0x014d, B:149:0x0153, B:151:0x0159, B:153:0x015f, B:154:0x0165, B:156:0x016a, B:158:0x0175, B:160:0x0180, B:162:0x018b, B:164:0x0196, B:166:0x01a1, B:168:0x01ac, B:170:0x01b7, B:172:0x01c2, B:173:0x01cb, B:175:0x01d2, B:177:0x01da, B:178:0x01e0), top: B:125:0x00f6, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0196 A[Catch: all -> 0x0117, Exception -> 0x011b, TryCatch #0 {Exception -> 0x011b, blocks: (B:126:0x00f6, B:128:0x00fa, B:130:0x0112, B:131:0x011f, B:133:0x0123, B:138:0x012f, B:143:0x0139, B:144:0x013f, B:146:0x0147, B:148:0x014d, B:149:0x0153, B:151:0x0159, B:153:0x015f, B:154:0x0165, B:156:0x016a, B:158:0x0175, B:160:0x0180, B:162:0x018b, B:164:0x0196, B:166:0x01a1, B:168:0x01ac, B:170:0x01b7, B:172:0x01c2, B:173:0x01cb, B:175:0x01d2, B:177:0x01da, B:178:0x01e0), top: B:125:0x00f6, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01a1 A[Catch: all -> 0x0117, Exception -> 0x011b, TryCatch #0 {Exception -> 0x011b, blocks: (B:126:0x00f6, B:128:0x00fa, B:130:0x0112, B:131:0x011f, B:133:0x0123, B:138:0x012f, B:143:0x0139, B:144:0x013f, B:146:0x0147, B:148:0x014d, B:149:0x0153, B:151:0x0159, B:153:0x015f, B:154:0x0165, B:156:0x016a, B:158:0x0175, B:160:0x0180, B:162:0x018b, B:164:0x0196, B:166:0x01a1, B:168:0x01ac, B:170:0x01b7, B:172:0x01c2, B:173:0x01cb, B:175:0x01d2, B:177:0x01da, B:178:0x01e0), top: B:125:0x00f6, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01ac A[Catch: all -> 0x0117, Exception -> 0x011b, TryCatch #0 {Exception -> 0x011b, blocks: (B:126:0x00f6, B:128:0x00fa, B:130:0x0112, B:131:0x011f, B:133:0x0123, B:138:0x012f, B:143:0x0139, B:144:0x013f, B:146:0x0147, B:148:0x014d, B:149:0x0153, B:151:0x0159, B:153:0x015f, B:154:0x0165, B:156:0x016a, B:158:0x0175, B:160:0x0180, B:162:0x018b, B:164:0x0196, B:166:0x01a1, B:168:0x01ac, B:170:0x01b7, B:172:0x01c2, B:173:0x01cb, B:175:0x01d2, B:177:0x01da, B:178:0x01e0), top: B:125:0x00f6, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01b7 A[Catch: all -> 0x0117, Exception -> 0x011b, TryCatch #0 {Exception -> 0x011b, blocks: (B:126:0x00f6, B:128:0x00fa, B:130:0x0112, B:131:0x011f, B:133:0x0123, B:138:0x012f, B:143:0x0139, B:144:0x013f, B:146:0x0147, B:148:0x014d, B:149:0x0153, B:151:0x0159, B:153:0x015f, B:154:0x0165, B:156:0x016a, B:158:0x0175, B:160:0x0180, B:162:0x018b, B:164:0x0196, B:166:0x01a1, B:168:0x01ac, B:170:0x01b7, B:172:0x01c2, B:173:0x01cb, B:175:0x01d2, B:177:0x01da, B:178:0x01e0), top: B:125:0x00f6, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01c2 A[Catch: all -> 0x0117, Exception -> 0x011b, TryCatch #0 {Exception -> 0x011b, blocks: (B:126:0x00f6, B:128:0x00fa, B:130:0x0112, B:131:0x011f, B:133:0x0123, B:138:0x012f, B:143:0x0139, B:144:0x013f, B:146:0x0147, B:148:0x014d, B:149:0x0153, B:151:0x0159, B:153:0x015f, B:154:0x0165, B:156:0x016a, B:158:0x0175, B:160:0x0180, B:162:0x018b, B:164:0x0196, B:166:0x01a1, B:168:0x01ac, B:170:0x01b7, B:172:0x01c2, B:173:0x01cb, B:175:0x01d2, B:177:0x01da, B:178:0x01e0), top: B:125:0x00f6, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01d2 A[Catch: all -> 0x0117, Exception -> 0x011b, TryCatch #0 {Exception -> 0x011b, blocks: (B:126:0x00f6, B:128:0x00fa, B:130:0x0112, B:131:0x011f, B:133:0x0123, B:138:0x012f, B:143:0x0139, B:144:0x013f, B:146:0x0147, B:148:0x014d, B:149:0x0153, B:151:0x0159, B:153:0x015f, B:154:0x0165, B:156:0x016a, B:158:0x0175, B:160:0x0180, B:162:0x018b, B:164:0x0196, B:166:0x01a1, B:168:0x01ac, B:170:0x01b7, B:172:0x01c2, B:173:0x01cb, B:175:0x01d2, B:177:0x01da, B:178:0x01e0), top: B:125:0x00f6, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01da A[Catch: all -> 0x0117, Exception -> 0x011b, TryCatch #0 {Exception -> 0x011b, blocks: (B:126:0x00f6, B:128:0x00fa, B:130:0x0112, B:131:0x011f, B:133:0x0123, B:138:0x012f, B:143:0x0139, B:144:0x013f, B:146:0x0147, B:148:0x014d, B:149:0x0153, B:151:0x0159, B:153:0x015f, B:154:0x0165, B:156:0x016a, B:158:0x0175, B:160:0x0180, B:162:0x018b, B:164:0x0196, B:166:0x01a1, B:168:0x01ac, B:170:0x01b7, B:172:0x01c2, B:173:0x01cb, B:175:0x01d2, B:177:0x01da, B:178:0x01e0), top: B:125:0x00f6, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01ea A[Catch: all -> 0x0117, TryCatch #2 {all -> 0x0117, blocks: (B:21:0x00e4, B:27:0x01e3, B:29:0x01ea, B:35:0x0207, B:36:0x020a, B:37:0x020f, B:39:0x0210, B:41:0x0216, B:42:0x021c, B:44:0x0222, B:46:0x0226, B:47:0x022a, B:48:0x0230, B:49:0x0231, B:51:0x0235, B:52:0x0239, B:53:0x023c, B:55:0x023d, B:56:0x0242, B:57:0x0243, B:58:0x0248, B:59:0x0249, B:60:0x024e, B:61:0x024f, B:62:0x0254, B:63:0x0255, B:64:0x025a, B:65:0x025b, B:66:0x0260, B:68:0x0263, B:70:0x026b, B:74:0x0274, B:75:0x027a, B:77:0x0282, B:79:0x028a, B:81:0x029f, B:82:0x02a3, B:83:0x02a6, B:84:0x02a7, B:85:0x02ac, B:86:0x02ad, B:87:0x02c2, B:90:0x02c5, B:92:0x02cb, B:93:0x02d1, B:95:0x02e9, B:97:0x02f1, B:98:0x02f7, B:100:0x02fd, B:103:0x0310, B:107:0x031c, B:112:0x0328, B:113:0x033d, B:114:0x033e, B:115:0x0355, B:126:0x00f6, B:128:0x00fa, B:130:0x0112, B:131:0x011f, B:133:0x0123, B:138:0x012f, B:143:0x0139, B:144:0x013f, B:146:0x0147, B:148:0x014d, B:149:0x0153, B:151:0x0159, B:153:0x015f, B:154:0x0165, B:156:0x016a, B:158:0x0175, B:160:0x0180, B:162:0x018b, B:164:0x0196, B:166:0x01a1, B:168:0x01ac, B:170:0x01b7, B:172:0x01c2, B:173:0x01cb, B:175:0x01d2, B:177:0x01da, B:178:0x01e0, B:198:0x0356, B:199:0x0374), top: B:20:0x00e4, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0261  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Vh.VhResponse vhResponse;
        String str;
        ExtendedVh.ActualEpisode actualEpisode;
        ExtendedVh.ActualEpisode actualEpisode2;
        String contentUrl;
        String contentId;
        Vh.License license;
        Object obj;
        b0o b0oVar = new b0o();
        h1u h1uVar = this.r;
        n4f n4fVar = h1uVar.b;
        String str2 = this.s;
        str2.getClass();
        wpt wptVar = (wpt) h1uVar.e.a;
        s7e s7eVar = new s7e();
        s7eVar.h(null, "https://frontend.vh.yandex.ru/player");
        s7e f = s7eVar.e().f();
        f.b(str2);
        String str3 = f.e().i;
        s7e s7eVar2 = new s7e();
        s7eVar2.h(null, str3);
        u7e e = s7eVar2.e();
        ArrayList arrayList = e.f;
        int size = arrayList.size() - 1;
        String str4 = (String) CollectionsKt.Y(arrayList);
        s7e f2 = e.f();
        ArrayList arrayList2 = f2.f;
        arrayList2.remove(size);
        String str5 = "";
        if (arrayList2.isEmpty()) {
            arrayList2.add("");
        }
        f2.b(str4 + ".json");
        String str6 = wptVar.c;
        if (str6 != null && e.g("service") == null) {
            f2.d("service", str6);
        }
        String str7 = wptVar.b;
        if (str7 != null && e.g("from") == null) {
            f2.d("from", str7);
        }
        String str8 = this.t;
        if (str8 != null && e.g("vpuid") == null) {
            f2.d("vpuid", str8);
        }
        b0oVar.g(f2.e().i);
        b0oVar.a("Authorization", String.format("OAuth %s", Arrays.copyOf(new Object[]{h1uVar.c.e()}, 1)));
        String str9 = h1uVar.d.a;
        str9.getClass();
        b0oVar.a(HttpMessage.USER_AGENT, str9);
        OkHttpClient okHttpClient = h1uVar.a;
        d0o b = b0oVar.b();
        okHttpClient.getClass();
        l3o execute = new mkn(okHttpClient, b, false).execute();
        try {
            boolean b2 = execute.b();
            int i = execute.d;
            d0o d0oVar = execute.a;
            if (b2 || i == 404) {
                try {
                    o3o o3oVar = execute.g;
                    if (o3oVar != null) {
                        String D = o3oVar.D();
                        Type type = new VhManifestApi$getManifest$1$invoke$lambda$8$lambda$5$$inlined$from$1().getType();
                        type.getClass();
                        ExtendedVh.ExtendedVhResponse extendedVhResponse = (ExtendedVh.ExtendedVhResponse) n4fVar.a(D, type);
                        ExtendedVh.Content content = extendedVhResponse != null ? extendedVhResponse.getContent() : null;
                        if (content != null && (contentId = content.getContentId()) != null) {
                            str = contentId;
                            if (content != null && (contentUrl = content.getContentUrl()) != null) {
                                str5 = contentUrl;
                            }
                            List<ExtendedVh.Stream> list = null;
                            vhResponse = new Vh.VhResponse(new Vh.Content(str, str5, h1u.a(h1uVar, list), new Vh.ActualEpisode(h1u.a(h1uVar, (content != null || (actualEpisode2 = content.getActualEpisode()) == null) ? null : actualEpisode2.getStreams()), (content != null || (actualEpisode = content.getActualEpisode()) == null) ? null : actualEpisode.getStartPosition()), content == null ? content.isUgcLive() : null, content == null ? content.isUgcLiveStatus() : null, content == null ? content.getViewers() : null, content == null ? content.getXivaSubscriptionId() : null, content == null ? content.getOttParams() : null, content == null ? content.getFirstFrameUrl() : null, content == null ? content.getFirstFrameHash() : null, content == null ? content.getTitle() : null, content == null ? content.getThumbnail() : null), extendedVhResponse == null ? extendedVhResponse.getError() : null, extendedVhResponse == null ? extendedVhResponse.getError_cause() : null);
                            if (!execute.b()) {
                                ManifestLoadingException.UnknownError.GenericError genericError = new ManifestLoadingException.UnknownError.GenericError(execute.d, d0oVar.a.i, null, null, 12, null);
                                if (i == 412) {
                                    throw new ManifestLoadingException.ForbiddenByLicense(genericError, null, 2, null);
                                }
                                if (i == 417) {
                                    throw new ManifestLoadingException.UserProfileNotCreated(genericError, null, 2, null);
                                }
                                if (i == 503) {
                                    throw new ManifestLoadingException.CommunicationError(genericError, null, 2, null);
                                }
                                switch (i) {
                                    case NetworkRequestException.EXPIRED_SIGNATURE /* 401 */:
                                        throw new ManifestLoadingException.Forbidden(genericError, null, 2, null);
                                    case 402:
                                        throw new ManifestLoadingException.PaymentRequired(genericError, null, 2, null);
                                    case NetworkRequestException.INVALID_SIGNATURE /* 403 */:
                                        throw new ManifestLoadingException.Forbidden(genericError, null, 2, null);
                                    case NetworkRequestException.RESOURCE_NOT_FOUND /* 404 */:
                                        if (!CollectionsKt.I(h1u.f, vhResponse != null ? vhResponse.getError_cause() : null)) {
                                            throw new ManifestLoadingException.NotFound(genericError, vhResponse != null ? vhResponse.getError_cause() : null);
                                        }
                                        String error_cause = vhResponse != null ? vhResponse.getError_cause() : null;
                                        error_cause.getClass();
                                        throw new ManifestLoadingException.ForbiddenByModeration(error_cause);
                                    default:
                                        throw new ManifestLoadingException.UnknownError(genericError, null, 2, null);
                                }
                            }
                            String error = vhResponse != null ? vhResponse.getError() : null;
                            if (error != null && !StringsKt.U(error)) {
                                String error2 = vhResponse != null ? vhResponse.getError() : null;
                                if (Intrinsics.d(error2, "no_licenses")) {
                                    throw new ManifestLoadingException.ForbiddenByLicense(new ManifestLoadingException.UnknownError.GenericError(execute.d, d0oVar.a.i, null, null, 12, null), null, 2, null);
                                }
                                if (Intrinsics.d(error2, "invalid_region")) {
                                    throw new ManifestLoadingException.InvalidRegion();
                                }
                                throw new ManifestLoadingException.UnknownError(new ManifestLoadingException.UnknownError.GenericError(execute.d, d0oVar.a.i, null, null, 12, null), vhResponse != null ? vhResponse.getError() : null);
                            }
                            Map<String, Object> map = null;
                            String str10 = n4fVar.to(map);
                            Type type2 = new VhManifestApi$getManifest$1$invoke$lambda$8$$inlined$from$1().getType();
                            type2.getClass();
                            Vh.Licenses licenses = (Vh.Licenses) n4fVar.a(str10, type2);
                            List<Vh.License> licenses2 = licenses != null ? licenses.getLicenses() : null;
                            if (licenses2 != null) {
                                Iterator<T> it = licenses2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it.next();
                                    Vh.License license2 = (Vh.License) obj;
                                    Boolean active = license2.getActive();
                                    Boolean bool = Boolean.TRUE;
                                    if (!Intrinsics.d(active, bool) && Intrinsics.d(license2.getPrimary(), bool)) {
                                        break;
                                    }
                                }
                                license = (Vh.License) obj;
                            } else {
                                license = null;
                            }
                            if (license != null) {
                                throw new ManifestLoadingException.SubscriptionNotFoundError(new ManifestLoadingException.UnknownError.GenericError(execute.d, d0oVar.a.i, null, null, 12, null), "Primary license is not active");
                            }
                            if (vhResponse == null) {
                                throw new ManifestLoadingException.NotFound(new ManifestLoadingException.UnknownError.GenericError(execute.d, d0oVar.a.i, null, null, 12, null), null, 2, null);
                            }
                            execute.close();
                            return vhResponse;
                        }
                        str = "";
                        if (content != null) {
                            str5 = contentUrl;
                        }
                        List<ExtendedVh.Stream> list2 = null;
                        vhResponse = new Vh.VhResponse(new Vh.Content(str, str5, h1u.a(h1uVar, list2), new Vh.ActualEpisode(h1u.a(h1uVar, (content != null || (actualEpisode2 = content.getActualEpisode()) == null) ? null : actualEpisode2.getStreams()), (content != null || (actualEpisode = content.getActualEpisode()) == null) ? null : actualEpisode.getStartPosition()), content == null ? content.isUgcLive() : null, content == null ? content.isUgcLiveStatus() : null, content == null ? content.getViewers() : null, content == null ? content.getXivaSubscriptionId() : null, content == null ? content.getOttParams() : null, content == null ? content.getFirstFrameUrl() : null, content == null ? content.getFirstFrameHash() : null, content == null ? content.getTitle() : null, content == null ? content.getThumbnail() : null), extendedVhResponse == null ? extendedVhResponse.getError() : null, extendedVhResponse == null ? extendedVhResponse.getError_cause() : null);
                        if (!execute.b()) {
                        }
                    }
                } catch (Exception e2) {
                    throw new ManifestLoadingException.UnknownError(new ManifestLoadingException.UnknownError.GenericError(i, d0oVar.a.i, e2, e2.getMessage()), "responseCode=" + i);
                }
            }
            vhResponse = null;
            if (!execute.b()) {
            }
        } finally {
        }
    }
}
