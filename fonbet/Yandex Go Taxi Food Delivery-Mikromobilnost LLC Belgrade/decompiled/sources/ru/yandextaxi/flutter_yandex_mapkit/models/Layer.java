package ru.yandextaxi.flutter_yandex_mapkit.models;

import defpackage.jl40;
import defpackage.ysq0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/models/Layer;", "", "", "id", "Lru/yandextaxi/flutter_yandex_mapkit/models/TileFormat;", "format", "Lru/yandextaxi/flutter_yandex_mapkit/models/LayerOptions;", "layerOptions", "Lru/yandextaxi/flutter_yandex_mapkit/models/TilesUrlProvider;", "tileUrlProvider", "Lru/yandextaxi/flutter_yandex_mapkit/models/ImagesImageUrlProviderType;", "imageUrlProvider", "Lru/yandextaxi/flutter_yandex_mapkit/models/ProjectionType;", "projection", "<init>", "(Ljava/lang/String;Lru/yandextaxi/flutter_yandex_mapkit/models/TileFormat;Lru/yandextaxi/flutter_yandex_mapkit/models/LayerOptions;Lru/yandextaxi/flutter_yandex_mapkit/models/TilesUrlProvider;Lru/yandextaxi/flutter_yandex_mapkit/models/ImagesImageUrlProviderType;Lru/yandextaxi/flutter_yandex_mapkit/models/ProjectionType;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lru/yandextaxi/flutter_yandex_mapkit/models/TileFormat;", "a", "()Lru/yandextaxi/flutter_yandex_mapkit/models/TileFormat;", "Lru/yandextaxi/flutter_yandex_mapkit/models/LayerOptions;", "d", "()Lru/yandextaxi/flutter_yandex_mapkit/models/LayerOptions;", "Lru/yandextaxi/flutter_yandex_mapkit/models/TilesUrlProvider;", "f", "()Lru/yandextaxi/flutter_yandex_mapkit/models/TilesUrlProvider;", "Lru/yandextaxi/flutter_yandex_mapkit/models/ImagesImageUrlProviderType;", "c", "()Lru/yandextaxi/flutter_yandex_mapkit/models/ImagesImageUrlProviderType;", "Lru/yandextaxi/flutter_yandex_mapkit/models/ProjectionType;", "e", "()Lru/yandextaxi/flutter_yandex_mapkit/models/ProjectionType;", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Layer {

    @ysq0("format")
    private final TileFormat format;

    @ysq0("id")
    private final String id;

    @ysq0("imageUrlProvider")
    private final ImagesImageUrlProviderType imageUrlProvider;

    @ysq0("layerOptions")
    private final LayerOptions layerOptions;

    @ysq0("projection")
    private final ProjectionType projection;

    @ysq0("tileUrlProvider")
    private final TilesUrlProvider tileUrlProvider;

    public Layer(String str, TileFormat tileFormat, LayerOptions layerOptions, TilesUrlProvider tilesUrlProvider, ImagesImageUrlProviderType imagesImageUrlProviderType, ProjectionType projectionType) {
        this.id = str;
        this.format = tileFormat;
        this.layerOptions = layerOptions;
        this.tileUrlProvider = tilesUrlProvider;
        this.imageUrlProvider = imagesImageUrlProviderType;
        this.projection = projectionType;
    }

    /* renamed from: a, reason: from getter */
    public final TileFormat getFormat() {
        return this.format;
    }

    /* renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: c, reason: from getter */
    public final ImagesImageUrlProviderType getImageUrlProvider() {
        return this.imageUrlProvider;
    }

    /* renamed from: d, reason: from getter */
    public final LayerOptions getLayerOptions() {
        return this.layerOptions;
    }

    /* renamed from: e, reason: from getter */
    public final ProjectionType getProjection() {
        return this.projection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Layer)) {
            return false;
        }
        Layer layer = (Layer) obj;
        return jl40.l(this.id, layer.id) && this.format == layer.format && jl40.l(this.layerOptions, layer.layerOptions) && jl40.l(this.tileUrlProvider, layer.tileUrlProvider) && this.imageUrlProvider == layer.imageUrlProvider && this.projection == layer.projection;
    }

    /* renamed from: f, reason: from getter */
    public final TilesUrlProvider getTileUrlProvider() {
        return this.tileUrlProvider;
    }

    public final int hashCode() {
        return this.projection.hashCode() + ((this.imageUrlProvider.hashCode() + ((this.tileUrlProvider.hashCode() + ((this.layerOptions.hashCode() + ((this.format.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Layer(id=" + this.id + ", format=" + this.format + ", layerOptions=" + this.layerOptions + ", tileUrlProvider=" + this.tileUrlProvider + ", imageUrlProvider=" + this.imageUrlProvider + ", projection=" + this.projection + Extension.C_BRAKE;
    }
}
