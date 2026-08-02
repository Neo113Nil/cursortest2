package ru.yandex.video.m3.previews;

import defpackage.d5z0;
import defpackage.evu0;
import defpackage.eyi;
import defpackage.h5z0;
import defpackage.j73;
import defpackage.jl40;
import defpackage.jwu;
import defpackage.kwu;
import defpackage.tls;
import defpackage.xvz;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.video.m3.player.impl.source.dash.manifest.SupplementalPropertiesInPeriodParseListener;
import ru.yandex.video.m3.previews.RawThumbnail;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J7\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/yandex/video/m3/previews/ThumbnailsFromPeriodSupplementalPropsParserImpl;", "Lru/yandex/video/m3/previews/ThumbnailsFromPeriodSupplementalPropsParser;", "Lru/yandex/video/m3/player/impl/source/dash/manifest/SupplementalPropertiesInPeriodParseListener;", "<init>", "()V", "", "Leyi;", "supplementalProperties", "", "schemeUrlPrefix", "Lru/yandex/video/m3/previews/Type;", "Type", "", "presentationTimeOffsetMs", "Lru/yandex/video/m3/previews/RawThumbnail;", "parseRawThumbnail", "(Ljava/util/List;Ljava/lang/String;Lru/yandex/video/m3/previews/Type;J)Lru/yandex/video/m3/previews/RawThumbnail;", "Lkwu;", "url", "parse", "(Lkwu;J)Ljava/util/List;", "Lzy11;", "onSupplementalPropertiesParsed", "(Ljava/lang/String;Ljava/util/List;)V", "", "Ljava/util/Map;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ThumbnailsFromPeriodSupplementalPropsParserImpl implements ThumbnailsFromPeriodSupplementalPropsParser, SupplementalPropertiesInPeriodParseListener {
    private static final String SCHEME_THUMBNAIL = "urn:mpeg:yandex:thumbnail";
    private static final String SCHEME_THUMBNAIL_LOWRES = "urn:mpeg:yandex:thumbnail:lowres";
    private static final String SCHEME_THUMBNAIL_VERSION = "urn:mpeg:yandex:thumbnail:version";
    private final Map<String, List<eyi>> supplementalProperties = new LinkedHashMap();
    public static final int $stable = 8;

    private final RawThumbnail parseRawThumbnail(List<eyi> supplementalProperties, String schemeUrlPrefix, Type Type, long presentationTimeOffsetMs) {
        Object obj;
        Object obj2;
        Object obj3;
        RawThumbnail RawThumbnail;
        String str;
        String str2;
        List<eyi> list = supplementalProperties;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((eyi) obj).a, schemeUrlPrefix + ":uri")) {
                break;
            }
        }
        eyi eyiVar = (eyi) obj;
        String str3 = eyiVar != null ? eyiVar.b : null;
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (jl40.l(((eyi) obj2).a, schemeUrlPrefix + ":tiles")) {
                break;
            }
        }
        eyi eyiVar2 = (eyi) obj2;
        List W = (eyiVar2 == null || (str2 = eyiVar2.b) == null) ? null : evu0.W(str2, new String[]{RemoteBioParameters.X}, (r2 & 4) != 0 ? 0 : 2);
        Iterator<T> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it3.next();
            if (jl40.l(((eyi) obj3).a, schemeUrlPrefix + ":duration")) {
                break;
            }
        }
        eyi eyiVar3 = (eyi) obj3;
        Float valueOf = (eyiVar3 == null || (str = eyiVar3.b) == null) ? null : Float.valueOf(Float.parseFloat(str));
        if (str3 != null && W != null && valueOf != null) {
            RawThumbnail = RawThumbnailKt.RawThumbnail(Type, Integer.parseInt((String) W.get(1)), Integer.parseInt((String) W.get(0)), valueOf.floatValue(), presentationTimeOffsetMs, new MaskPathProvider(str3), PreviewVersion.V2, (r19 & 128) != 0 ? new tls() { // from class: ru.yandex.video.m3.previews.RawThumbnailKt$RawThumbnail$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj4) {
                    invoke((RawThumbnail.Builder) obj4);
                    return zy11.a;
                }

                public final void invoke(RawThumbnail.Builder builder) {
                }
            } : null);
            return RawThumbnail;
        }
        d5z0 d5z0Var = h5z0.a;
        StringBuilder r = xvz.r("Impossible to find uri=", str3, " tiles=", W, " or duration=");
        r.append(valueOf);
        d5z0Var.a(r.toString(), new Object[0]);
        return null;
    }

    @Override // ru.yandex.video.m3.player.impl.source.dash.manifest.SupplementalPropertiesInPeriodParseListener
    public void onSupplementalPropertiesParsed(String url, List<eyi> supplementalProperties) {
        if (supplementalProperties.isEmpty()) {
            return;
        }
        kwu kwuVar = null;
        try {
            jwu jwuVar = new jwu();
            jwuVar.i(null, url);
            kwuVar = jwuVar.e();
        } catch (IllegalArgumentException unused) {
        }
        if (kwuVar != null) {
            this.supplementalProperties.put(kwuVar.b(), supplementalProperties);
        }
    }

    @Override // ru.yandex.video.m3.previews.ThumbnailsFromPeriodSupplementalPropsParser
    public List<RawThumbnail> parse(kwu url, long presentationTimeOffsetMs) throws Exception {
        Object obj;
        List<eyi> list = this.supplementalProperties.get(url.b());
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jl40.l(((eyi) obj).a, SCHEME_THUMBNAIL_VERSION)) {
                    break;
                }
            }
            eyi eyiVar = (eyi) obj;
            List<eyi> list2 = jl40.l(eyiVar != null ? eyiVar.b : null, "2") ? list : null;
            if (list2 != null) {
                return j73.A(new RawThumbnail[]{parseRawThumbnail(list2, SCHEME_THUMBNAIL, Type.HI_RES, presentationTimeOffsetMs), parseRawThumbnail(list2, SCHEME_THUMBNAIL_LOWRES, Type.LOW_RES, presentationTimeOffsetMs)});
            }
        }
        return EmptyList.a;
    }
}
