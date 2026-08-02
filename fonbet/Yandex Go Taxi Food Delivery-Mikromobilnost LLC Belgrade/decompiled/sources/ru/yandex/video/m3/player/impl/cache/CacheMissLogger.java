package ru.yandex.video.m3.player.impl.cache;

import android.net.Uri;
import com.yandex.div.state.db.StateEntry;
import defpackage.b64;
import defpackage.bhe;
import defpackage.evu0;
import defpackage.jl40;
import defpackage.npg;
import defpackage.oyr;
import defpackage.ra7;
import defpackage.scc;
import defpackage.tcc;
import defpackage.unr0;
import defpackage.vuu0;
import defpackage.w610;
import defpackage.x4e;
import defpackage.yuu0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.text.Regex;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001!B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\r\u001a\u00020\f2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0013\u001a\u00020\n*\u00020\u00102\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001c\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/yandex/video/m3/player/impl/cache/CacheMissLogger;", "", "<init>", "()V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "Lnpg;", "missingSpec", "", "", "codeNames", "Lzy11;", "formatMissingUri", "(Ljava/lang/StringBuilder;Lnpg;Ljava/util/Map;)V", "uriString", "Lru/yandex/video/m3/player/impl/cache/CacheMissLogger$CacheKey;", "getKey", "(Ljava/lang/String;)Lru/yandex/video/m3/player/impl/cache/CacheMissLogger$CacheKey;", "format", "(Lru/yandex/video/m3/player/impl/cache/CacheMissLogger$CacheKey;Ljava/util/Map;)Ljava/lang/String;", "Lra7;", "cache", "testDataSpec", "logContainInCache", "(Lra7;Lnpg;)Ljava/lang/String;", "", "brief", "logCacheMiss", "(Lra7;Lnpg;Z)Ljava/lang/String;", "Lkotlin/text/Regex;", "videoTrackResolution", "Lkotlin/text/Regex;", "CacheKey", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CacheMissLogger {
    public static final CacheMissLogger INSTANCE = new CacheMissLogger();
    private static final Regex videoTrackResolution = new Regex("label=\\d*p");
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/yandex/video/m3/player/impl/cache/CacheMissLogger$CacheKey;", "", StateEntry.COLUMN_PATH, "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getPath", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class CacheKey {
        private final String name;
        private final String path;

        public CacheKey(String str, String str2) {
            this.path = str;
            this.name = str2;
        }

        public static /* synthetic */ CacheKey copy$default(CacheKey cacheKey, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cacheKey.path;
            }
            if ((i & 2) != 0) {
                str2 = cacheKey.name;
            }
            return cacheKey.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final CacheKey copy(String path, String name) {
            return new CacheKey(path, name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CacheKey)) {
                return false;
            }
            CacheKey cacheKey = (CacheKey) other;
            return jl40.l(this.path, cacheKey.path) && jl40.l(this.name, cacheKey.name);
        }

        public final String getName() {
            return this.name;
        }

        public final String getPath() {
            return this.path;
        }

        public int hashCode() {
            return this.name.hashCode() + (this.path.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("CacheKey(path=");
            sb.append(this.path);
            sb.append(", name=");
            return b64.p(sb, this.name, ')');
        }
    }

    private CacheMissLogger() {
    }

    private final String format(CacheKey cacheKey, Map<String, String> map) {
        String str;
        if (map == null || (str = map.get(cacheKey.getPath())) == null) {
            return "path=" + cacheKey.getPath() + "\nname=" + cacheKey.getName();
        }
        return str + '/' + cacheKey.getName();
    }

    private final void formatMissingUri(StringBuilder builder, npg missingSpec, Map<String, String> codeNames) {
        builder.append("\nMissing key:");
        yuu0.e(builder);
        String str = missingSpec.h;
        if (str == null) {
            str = "";
        }
        CacheKey key = getKey(str);
        builder.append(format(key, codeNames));
        yuu0.e(builder);
        w610 b = videoTrackResolution.b(key.getPath());
        if (b != null) {
            builder.append("quality=".concat(b.a.group()));
            yuu0.e(builder);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void formatMissingUri$default(CacheMissLogger cacheMissLogger, StringBuilder sb, npg npgVar, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = null;
        }
        cacheMissLogger.formatMissingUri(sb, npgVar, map);
    }

    private final CacheKey getKey(String uriString) {
        if (uriString == null || evu0.J(uriString)) {
            return new CacheKey(uriString, "");
        }
        Uri parse = Uri.parse(uriString);
        StringBuilder sb = new StringBuilder();
        String scheme = parse.getScheme();
        String concat = scheme != null ? scheme.concat("/") : null;
        if (concat == null) {
            concat = "";
        }
        sb.append(concat);
        String host = parse.getHost();
        String concat2 = host != null ? host.concat("/") : null;
        if (concat2 == null) {
            concat2 = "";
        }
        sb.append(concat2);
        sb.append(a.X(a.K(parse.getPathSegments()), "/", null, null, null, 62));
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        String lastPathSegment = parse.getLastPathSegment();
        sb3.append(lastPathSegment != null ? lastPathSegment : "");
        String query = parse.getQuery();
        sb3.append(query != null ? vuu0.b(query, "?") : null);
        return new CacheKey(sb2, sb3.toString());
    }

    public static /* synthetic */ String logCacheMiss$default(CacheMissLogger cacheMissLogger, ra7 ra7Var, npg npgVar, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return cacheMissLogger.logCacheMiss(ra7Var, npgVar, z);
    }

    public final String logCacheMiss(ra7 cache, npg missingSpec, boolean brief) {
        if (brief || cache == null) {
            StringBuilder sb = new StringBuilder();
            formatMissingUri$default(INSTANCE, sb, missingSpec, null, 4, null);
            return sb.toString();
        }
        List J0 = a.J0(cache.getKeys());
        ArrayList arrayList = new ArrayList(tcc.n(J0, 10));
        Iterator it = J0.iterator();
        while (it.hasNext()) {
            arrayList.add(getKey((String) it.next()));
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((CacheKey) it2.next()).getPath());
        }
        List I = a.I(arrayList2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Object obj : I) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            String str = (String) obj;
            w610 b = videoTrackResolution.b(str);
            linkedHashMap.put(str, b != null ? "PATH_" + i + '(' + b.a.group() + ')' : oyr.i(i, "PATH_"));
            i = i2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Paths:");
        yuu0.e(sb2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            sb2.append(((String) entry.getValue()) + Extension.COLON_SPACE + ((String) entry.getKey()));
            yuu0.e(sb2);
        }
        sb2.append("\nSegments:");
        yuu0.e(sb2);
        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(INSTANCE.format((CacheKey) it3.next(), linkedHashMap));
        }
        Iterator it4 = a.w0(arrayList3).iterator();
        while (it4.hasNext()) {
            sb2.append((String) it4.next());
            yuu0.e(sb2);
        }
        formatMissingUri(sb2, missingSpec, linkedHashMap);
        return sb2.toString();
    }

    public final String logContainInCache(ra7 cache, npg testDataSpec) {
        Uri uri = testDataSpec.a;
        String str = testDataSpec.h;
        if (str == null) {
            return unr0.n(uri, "it is empty key for ");
        }
        StringBuilder l = x4e.l("For ", str, " contain ", bhe.a(cache.getContentMetadata(str)));
        l.append(" bytes in cache from ");
        l.append(testDataSpec.g);
        l.append(". URL: ");
        l.append(uri);
        return l.toString();
    }
}
