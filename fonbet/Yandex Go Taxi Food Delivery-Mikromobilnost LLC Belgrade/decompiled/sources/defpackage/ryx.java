package defpackage;

import com.yandex.mapkit.geometry.geo.Projection;
import com.yandex.mapkit.geometry.geo.Projections;
import com.yandex.mapkit.images.DefaultImageUrlProvider;
import com.yandex.mapkit.layers.BaseDataSource;
import com.yandex.mapkit.layers.DataSourceLayer;
import com.yandex.mapkit.layers.DataSourceListener;
import com.yandex.mapkit.layers.LayerOptions;
import com.yandex.mapkit.layers.TileDataSource;
import com.yandex.mapkit.tiles.DefaultUrlProvider;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.yandextaxi.flutter_yandex_mapkit.models.ImagesImageUrlProviderType;
import ru.yandextaxi.flutter_yandex_mapkit.models.Layer;
import ru.yandextaxi.flutter_yandex_mapkit.models.ProjectionType;

/* loaded from: classes7.dex */
public final class ryx extends k45 implements DataSourceListener {
    public final LinkedHashMap A;
    public final eu00 b;
    public final LinkedHashMap c;
    public final LinkedHashMap w;
    public final LinkedHashMap x;
    public final LinkedHashMap y;
    public final LinkedHashMap z;

    public ryx(ssr ssrVar, eu00 eu00Var) {
        super(ssrVar, "layers_controller");
        this.b = eu00Var;
        this.c = new LinkedHashMap();
        this.w = new LinkedHashMap();
        this.x = new LinkedHashMap();
        this.y = new LinkedHashMap();
        this.z = new LinkedHashMap();
        this.A = new LinkedHashMap();
    }

    @Override // com.yandex.mapkit.layers.DataSourceListener
    public final void onDataSourceUpdated(BaseDataSource baseDataSource) {
        this.A.put(baseDataSource.getId(), baseDataSource);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        DataSourceLayer dataSourceLayer;
        Object obj = x920Var.b;
        String str = x920Var.a;
        if (str != null) {
            int hashCode = str.hashCode();
            LinkedHashMap linkedHashMap = this.A;
            LinkedHashMap linkedHashMap2 = this.c;
            switch (hashCode) {
                case -1253922512:
                    if (str.equals("addLayer")) {
                        u3u u3uVar = (u3u) w3u.a.getValue();
                        Layer layer = (Layer) u3uVar.a(u3uVar.k((Map) obj), Layer.class);
                        if (layer == null) {
                            ((ba20) da20Var).error("object_not_parsed", "Could not parse layer", "Something went wrong with layer parsing");
                            return;
                        }
                        LayerOptions a = layer.getLayerOptions().a();
                        this.w.put(layer.getId(), a);
                        DefaultUrlProvider a2 = layer.getTileUrlProvider().a();
                        this.x.put(layer.getId(), a2);
                        ImagesImageUrlProviderType imageUrlProvider = layer.getImageUrlProvider();
                        imageUrlProvider.getClass();
                        if (xhv.a[imageUrlProvider.ordinal()] != 1) {
                            w511.b();
                            return;
                        }
                        DefaultImageUrlProvider defaultImageUrlProvider = new DefaultImageUrlProvider();
                        this.y.put(layer.getId(), defaultImageUrlProvider);
                        ProjectionType projection = layer.getProjection();
                        projection.getClass();
                        if (dlf0.a[projection.ordinal()] != 1) {
                            w511.b();
                            return;
                        }
                        Projection wgs84Mercator = Projections.getWgs84Mercator();
                        this.z.put(layer.getId(), wgs84Mercator);
                        com.yandex.mapkit.layers.Layer addTileLayer = ((au00) this.b.a).getMapWindow().getMap().addTileLayer(layer.getId(), a, new f83(layer, a2, defaultImageUrlProvider, wgs84Mercator, 4));
                        addTileLayer.dataSourceLayer().setDataSourceListener(this);
                        linkedHashMap2.put(layer.getId(), addTileLayer);
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -1246674730:
                    if (str.equals("invalidateLayer")) {
                        Map map = (Map) obj;
                        String str2 = (String) map.get("id");
                        if (str2 == null) {
                            ((ba20) da20Var).error("object_not_parsed", "Could not find ID in params", "Provide an id");
                            return;
                        }
                        String str3 = (String) map.get("version");
                        if (str3 == null) {
                            ((ba20) da20Var).error("object_not_parsed", "Could not find version in params", "Provide a version");
                            return;
                        }
                        Object obj2 = linkedHashMap.get(str2);
                        TileDataSource tileDataSource = obj2 instanceof TileDataSource ? (TileDataSource) obj2 : null;
                        if (tileDataSource != null) {
                            tileDataSource.invalidate(str3);
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -311648467:
                    if (str.equals("removeLayer")) {
                        String str4 = (String) obj;
                        com.yandex.mapkit.layers.Layer layer2 = (com.yandex.mapkit.layers.Layer) linkedHashMap2.remove(str4);
                        if (layer2 != null) {
                            layer2.remove();
                        }
                        linkedHashMap.remove(str4);
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -136588445:
                    if (str.equals("setLayerVisible")) {
                        Map map2 = (Map) obj;
                        Object obj3 = map2.get("id");
                        String str5 = obj3 instanceof String ? (String) obj3 : null;
                        if (str5 == null) {
                            ((ba20) da20Var).error("object_not_parsed", "Could not find ID in params", "Provide an id");
                            return;
                        }
                        Object obj4 = map2.get("visible");
                        Boolean bool = obj4 instanceof Boolean ? (Boolean) obj4 : null;
                        if (bool == null) {
                            ((ba20) da20Var).error("object_not_parsed", "Could not find visible in params", "Provide a visible param");
                            return;
                        }
                        boolean booleanValue = bool.booleanValue();
                        com.yandex.mapkit.layers.Layer layer3 = (com.yandex.mapkit.layers.Layer) linkedHashMap2.get(str5);
                        if (layer3 != null && (dataSourceLayer = layer3.dataSourceLayer()) != null) {
                            dataSourceLayer.setActive(booleanValue);
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
            }
        }
        ((ba20) da20Var).notImplemented();
    }
}
