package ru.yandextaxi.flutter_yandex_mapkit.models;

import com.yandex.mapkit.tiles.DefaultUrlProvider;
import defpackage.b5z0;
import defpackage.jl40;
import defpackage.w511;
import defpackage.ysq0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/models/TilesUrlProvider;", "", "Lru/yandextaxi/flutter_yandex_mapkit/models/TilesUrlProviderType;", "type", "", "urlPattern", "<init>", "(Lru/yandextaxi/flutter_yandex_mapkit/models/TilesUrlProviderType;Ljava/lang/String;)V", "Lru/yandextaxi/flutter_yandex_mapkit/models/TilesUrlProviderType;", "getType", "()Lru/yandextaxi/flutter_yandex_mapkit/models/TilesUrlProviderType;", "Ljava/lang/String;", "getUrlPattern", "()Ljava/lang/String;", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TilesUrlProvider {

    @ysq0("type")
    private final TilesUrlProviderType type;

    @ysq0("urlPattern")
    private final String urlPattern;

    public TilesUrlProvider(TilesUrlProviderType tilesUrlProviderType, String str) {
        this.type = tilesUrlProviderType;
        this.urlPattern = str;
    }

    public final DefaultUrlProvider a() {
        if (b5z0.a[this.type.ordinal()] != 1) {
            w511.b();
            return null;
        }
        DefaultUrlProvider defaultUrlProvider = new DefaultUrlProvider();
        defaultUrlProvider.setUrlPattern(this.urlPattern);
        return defaultUrlProvider;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TilesUrlProvider)) {
            return false;
        }
        TilesUrlProvider tilesUrlProvider = (TilesUrlProvider) obj;
        return this.type == tilesUrlProvider.type && jl40.l(this.urlPattern, tilesUrlProvider.urlPattern);
    }

    public final int hashCode() {
        return this.urlPattern.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        return "TilesUrlProvider(type=" + this.type + ", urlPattern=" + this.urlPattern + Extension.C_BRAKE;
    }
}
