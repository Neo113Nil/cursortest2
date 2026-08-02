package ru.yandex.video.m3.previews;

import androidx.media3.common.a;
import defpackage.a70;
import defpackage.egg;
import defpackage.evu0;
import defpackage.eyi;
import defpackage.ic5;
import defpackage.jl40;
import defpackage.jwu;
import defpackage.kwu;
import defpackage.m4m0;
import defpackage.pxa0;
import defpackage.q4j0;
import defpackage.r4j0;
import defpackage.s4j0;
import defpackage.tls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.video.m3.player.impl.source.dash.manifest.ThumbnailsEssentialPropertiesParseListener;
import ru.yandex.video.m3.previews.RawThumbnail;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R&\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/previews/ThumbnailsFromRepresentationParserImpl;", "Lru/yandex/video/m3/previews/ThumbnailsFromRepresentationParser;", "Lru/yandex/video/m3/player/impl/source/dash/manifest/ThumbnailsEssentialPropertiesParseListener;", "<init>", "()V", "Legg;", "dashManifest", "Lkwu;", "url", "", "duration", "", "Lru/yandex/video/m3/previews/RawThumbnail;", "parse", "(Legg;Lkwu;J)Ljava/util/List;", "", "Leyi;", "essentialProperties", "Lzy11;", "onThumbnailsEssentialPropertiesParsed", "(Ljava/lang/String;Ljava/util/List;)V", "", "essentialPropertiesMap", "Ljava/util/Map;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ThumbnailsFromRepresentationParserImpl implements ThumbnailsFromRepresentationParser, ThumbnailsEssentialPropertiesParseListener {
    private static final String THUMBNAIL_SCHEME = "http://dashif.org/guidelines/thumbnail_tile";
    private final Map<String, List<eyi>> essentialPropertiesMap = new LinkedHashMap();
    public static final int $stable = 8;

    @Override // ru.yandex.video.m3.player.impl.source.dash.manifest.ThumbnailsEssentialPropertiesParseListener
    public void onThumbnailsEssentialPropertiesParsed(String url, List<eyi> essentialProperties) {
        kwu kwuVar = null;
        try {
            jwu jwuVar = new jwu();
            jwuVar.i(null, url);
            kwuVar = jwuVar.e();
        } catch (IllegalArgumentException unused) {
        }
        if (kwuVar != null) {
            this.essentialPropertiesMap.put(kwuVar.b(), essentialProperties);
        }
    }

    @Override // ru.yandex.video.m3.previews.ThumbnailsFromRepresentationParser
    public List<RawThumbnail> parse(egg dashManifest, kwu url, long duration) throws Exception {
        ArrayList arrayList;
        Object obj;
        Object obj2;
        PathProvider pathProvider;
        PathProvider maskPathProvider;
        RawThumbnail RawThumbnail;
        List list;
        a aVar;
        String str;
        List list2;
        List<eyi> list3 = this.essentialPropertiesMap.get(url.b());
        Float f = null;
        pxa0 period = dashManifest.getPeriodCount() > 0 ? dashManifest.getPeriod(0) : null;
        if (period == null || (list2 = period.c) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj3 : list2) {
                if (((a70) obj3).b == -1) {
                    arrayList.add(obj3);
                }
            }
        }
        if (list3 != null && arrayList != null && (!arrayList.isEmpty())) {
            Iterator<T> it = list3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jl40.l(((eyi) obj).a, THUMBNAIL_SCHEME)) {
                    break;
                }
            }
            eyi eyiVar = (eyi) obj;
            List W = (eyiVar == null || (str = eyiVar.b) == null) ? null : evu0.W(str, new String[]{RemoteBioParameters.X}, (r2 & 4) != 0 ? 0 : 2);
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                s4j0 s4j0Var = (s4j0) kotlin.collections.a.R(((a70) obj2).c);
                if (jl40.l((s4j0Var == null || (aVar = s4j0Var.a) == null) ? null : aVar.a, "thumbnails")) {
                    break;
                }
            }
            a70 a70Var = (a70) obj2;
            final s4j0 s4j0Var2 = (a70Var == null || (list = a70Var.c) == null) ? null : (s4j0) kotlin.collections.a.R(list);
            if (s4j0Var2 instanceof q4j0) {
                f = Float.valueOf(((q4j0) s4j0Var2).y.e(0L, duration * 1000) / 1000000.0f);
                maskPathProvider = new PathProvider() { // from class: ru.yandex.video.m3.previews.ThumbnailsFromRepresentationParserImpl$parse$1
                    @Override // ru.yandex.video.m3.previews.PathProvider
                    public String get(int atlasNumber) {
                        q4j0 q4j0Var = (q4j0) s4j0.this;
                        return m4m0.i(((ic5) kotlin.collections.a.P(((q4j0) s4j0.this).b)).a, q4j0Var.y.h(atlasNumber, q4j0Var).c);
                    }
                };
            } else if (s4j0Var2 instanceof r4j0) {
                f = Float.valueOf(duration);
                maskPathProvider = new MaskPathProvider(((r4j0) s4j0Var2).y.toString());
            } else if (s4j0Var2 != null) {
                pathProvider = null;
                RawThumbnail = RawThumbnailKt.RawThumbnail(Type.HI_RES, Integer.parseInt((String) W.get(1)), Integer.parseInt((String) W.get(0)), f.floatValue(), 0L, pathProvider, PreviewVersion.V1, (r19 & 128) != 0 ? new tls() { // from class: ru.yandex.video.m3.previews.RawThumbnailKt$RawThumbnail$1
                    @Override // defpackage.tls
                    public /* bridge */ /* synthetic */ Object invoke(Object obj4) {
                        invoke((RawThumbnail.Builder) obj4);
                        return zy11.a;
                    }

                    public final void invoke(RawThumbnail.Builder builder) {
                    }
                } : null);
                return Collections.singletonList(RawThumbnail);
            }
            pathProvider = maskPathProvider;
            RawThumbnail = RawThumbnailKt.RawThumbnail(Type.HI_RES, Integer.parseInt((String) W.get(1)), Integer.parseInt((String) W.get(0)), f.floatValue(), 0L, pathProvider, PreviewVersion.V1, (r19 & 128) != 0 ? new tls() { // from class: ru.yandex.video.m3.previews.RawThumbnailKt$RawThumbnail$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj4) {
                    invoke((RawThumbnail.Builder) obj4);
                    return zy11.a;
                }

                public final void invoke(RawThumbnail.Builder builder) {
                }
            } : null);
            return Collections.singletonList(RawThumbnail);
        }
        return EmptyList.a;
    }
}
