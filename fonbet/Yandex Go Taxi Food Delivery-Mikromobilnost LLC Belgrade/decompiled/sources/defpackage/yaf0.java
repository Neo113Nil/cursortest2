package defpackage;

import com.yandex.go.shortcuts.dto.request.ProductsScreenType$Type;

/* loaded from: classes8.dex */
public interface yaf0 {
    public static final uaf0 a = new uaf0(ProductsScreenType$Type.MAIN);
    public static final uaf0 b = new uaf0(ProductsScreenType$Type.SUPERAPP_MAIN);
    public static final uaf0 c = new uaf0(ProductsScreenType$Type.ON_MULTI_ORDER);
    public static final uaf0 d = new uaf0(ProductsScreenType$Type.TAXI_MAIN_SCREEN);

    default ProductsScreenType$Type a() {
        if (this instanceof uaf0) {
            return ((uaf0) this).e;
        }
        if (this instanceof vaf0) {
            return ((vaf0) this).g;
        }
        if (this instanceof waf0) {
            return null;
        }
        w511.b();
        return null;
    }
}
