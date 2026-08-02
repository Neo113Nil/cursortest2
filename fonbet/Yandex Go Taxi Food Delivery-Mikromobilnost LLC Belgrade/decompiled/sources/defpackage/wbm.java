package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.yandex.mapkit.styling.transportnavigation.DrawableUtils;
import com.yandex.runtime.image.ImageProvider;

/* loaded from: classes15.dex */
public final class wbm extends ImageProvider {
    public final String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ float c;
    public final /* synthetic */ ssr d;
    public final /* synthetic */ DrawableUtils e;

    public wbm(String str, float f, ssr ssrVar, DrawableUtils drawableUtils) {
        this.b = str;
        this.c = f;
        this.d = ssrVar;
        this.e = drawableUtils;
        this.a = "platform_image_" + str + "_" + f;
    }

    @Override // com.yandex.runtime.image.ImageProvider
    public final String getId() {
        return this.a;
    }

    @Override // com.yandex.runtime.image.ImageProvider
    /* renamed from: getImage */
    public final Bitmap get$image() {
        return this.e.drawableToBitmap(Drawable.createFromStream(this.d.a.getAssets().open("flutter_assets/" + this.b), null), this.c);
    }
}
