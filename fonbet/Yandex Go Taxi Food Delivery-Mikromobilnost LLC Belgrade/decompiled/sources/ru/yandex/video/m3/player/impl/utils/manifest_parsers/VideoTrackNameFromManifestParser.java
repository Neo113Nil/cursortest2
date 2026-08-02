package ru.yandex.video.m3.player.impl.utils.manifest_parsers;

import defpackage.evu0;
import defpackage.eyi;
import defpackage.jl40;
import defpackage.ycc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.Metadata;
import ru.yandex.video.m3.player.provider.ManifestVideoTrackNameProvider;
import ru.yandex.video.m3.player.tracks.TrackFormat;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ)\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0014\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00118\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001f\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/manifest_parsers/VideoTrackNameFromManifestParser;", "Lru/yandex/video/m3/player/provider/ManifestVideoTrackNameProvider;", "<init>", "()V", "Lru/yandex/video/m3/player/impl/utils/manifest_parsers/DashVideoSupplementalPropParser;", "dashVideoSupplementalPropParser", "Lzy11;", "parse", "(Lru/yandex/video/m3/player/impl/utils/manifest_parsers/DashVideoSupplementalPropParser;)V", "Lru/yandex/video/m3/player/impl/utils/manifest_parsers/HlsSessionDataParser;", "hlsSessionDataParser", "(Lru/yandex/video/m3/player/impl/utils/manifest_parsers/HlsSessionDataParser;)V", "", "Leyi;", "seq", "", "Lru/yandex/video/m3/player/impl/utils/manifest_parsers/TrackInfo;", "", "parseDashDescriptors", "(Ljava/util/List;)Ljava/util/Map;", "tag", "parseHLSTag", "(Ljava/lang/String;)Ljava/util/Map;", "Lru/yandex/video/m3/player/tracks/TrackFormat;", "format", "getTrackName", "(Lru/yandex/video/m3/player/tracks/TrackFormat;)Ljava/lang/String;", "QUALITY_FORMAT", "Ljava/lang/String;", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "QUALITY_FORMAT_REGEX_PATTERN", "Ljava/util/regex/Pattern;", "HLS_LABELS_QUALITY_REGEX_PATTERN", "Ljava/util/concurrent/ConcurrentHashMap;", "nameMap", "Ljava/util/concurrent/ConcurrentHashMap;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VideoTrackNameFromManifestParser implements ManifestVideoTrackNameProvider {
    public static final int $stable = 8;
    private final String QUALITY_FORMAT = "([0-9]{1,10})x([0-9]{1,10})@([0-9]{1,10}):([^,]+)";
    private final Pattern QUALITY_FORMAT_REGEX_PATTERN = Pattern.compile("([0-9]{1,10})x([0-9]{1,10})@([0-9]{1,10}):([^,]+)");
    private final Pattern HLS_LABELS_QUALITY_REGEX_PATTERN = Pattern.compile("DATA-ID=\"com.yandex.video.labels.quality\",VALUE=\"([^\"]+)\"");
    private final ConcurrentHashMap<TrackInfo, String> nameMap = new ConcurrentHashMap<>();

    @Override // ru.yandex.video.m3.player.provider.ManifestVideoTrackNameProvider
    public String getTrackName(TrackFormat format) {
        return this.nameMap.get(new TrackInfo(format.getWidth(), format.getHeight(), format.getBitrate()));
    }

    public final void parse(HlsSessionDataParser hlsSessionDataParser) {
        this.nameMap.clear();
        Iterator<T> it = hlsSessionDataParser.getTags().iterator();
        while (it.hasNext()) {
            this.nameMap.putAll(parseHLSTag((String) it.next()));
        }
    }

    public final Map<TrackInfo, String> parseDashDescriptors(List<eyi> seq) {
        String str;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Object obj : seq) {
            eyi eyiVar = (eyi) obj;
            if (jl40.l(eyiVar.a, "urn:mpeg:yandex:labels:quality") && (str = eyiVar.b) != null && !evu0.J(str)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ycc.r(RegUtilsKt.findAll(this.QUALITY_FORMAT_REGEX_PATTERN, ((eyi) it.next()).b), arrayList2);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            List list = (List) it2.next();
            hashMap.put(new TrackInfo(Integer.parseInt((String) list.get(1)), Integer.parseInt((String) list.get(2)), Integer.parseInt((String) list.get(3))), (String) list.get(4));
        }
        return hashMap;
    }

    public final Map<TrackInfo, String> parseHLSTag(String tag) {
        HashMap hashMap = new HashMap();
        Iterator<T> it = RegUtilsKt.findAll(this.HLS_LABELS_QUALITY_REGEX_PATTERN, tag).iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = RegUtilsKt.findAll(this.QUALITY_FORMAT_REGEX_PATTERN, (String) ((List) it.next()).get(1)).iterator();
            while (it2.hasNext()) {
                List list = (List) it2.next();
                String str = (String) list.get(1);
                String str2 = (String) list.get(2);
                String str3 = (String) list.get(3);
                hashMap.put(new TrackInfo(Integer.parseInt(str), Integer.parseInt(str2), Integer.parseInt(str3)), (String) list.get(4));
            }
        }
        return hashMap;
    }

    public final void parse(DashVideoSupplementalPropParser dashVideoSupplementalPropParser) {
        this.nameMap.clear();
        this.nameMap.putAll(parseDashDescriptors(dashVideoSupplementalPropParser.getSupplementalProperties()));
    }
}
