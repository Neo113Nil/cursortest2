package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.yandex.div.core.images.BitmapSource;
import com.yandex.div.core.util.binding.a;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.DivGifImageBinder$Companion$setPreview$$inlined$runMainThreadAction$1;
import com.yandex.div.core.view2.divs.DivGifImageBinder$Companion$setPreview$$inlined$runMainThreadAction$2;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import com.yandex.div.internal.drawable.NinePatchDrawable;

/* loaded from: classes11.dex */
public final class tfk extends osk {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfk(Div2View div2View, NinePatchDrawable ninePatchDrawable, ufk ufkVar) {
        super(div2View);
        this.d = ninePatchDrawable;
        this.e = ufkVar;
    }

    private final void l(Drawable drawable, BitmapSource bitmapSource) {
    }

    @Override // defpackage.osk, defpackage.btk
    public void d(Throwable th) {
        switch (this.c) {
            case 1:
                super.d(th);
                ((DivGifImageView) this.e).setPreviewUrl$div_release(null);
                break;
            default:
                super.d(th);
                break;
        }
    }

    @Override // defpackage.k25
    public final void i(Bitmap bitmap, BitmapSource bitmapSource) {
        int i = this.c;
        Object obj = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                NinePatchDrawable ninePatchDrawable = (NinePatchDrawable) obj;
                Rect rect = ((ufk) obj2).b;
                ninePatchDrawable.setBottom(rect.bottom);
                ninePatchDrawable.setLeft(rect.left);
                ninePatchDrawable.setRight(rect.right);
                ninePatchDrawable.setTop(rect.top);
                ninePatchDrawable.setBitmap(bitmap);
                break;
            default:
                DivGifImageView divGifImageView = (DivGifImageView) obj2;
                if (!divGifImageView.isImageLoaded()) {
                    Div2View div2View = (Div2View) obj;
                    ngd0 ngd0Var = ngd0.G;
                    ngd0Var.p();
                    fu11 fu11Var = fu11.a;
                    if (!fu11Var.a()) {
                        a g = unr0.g(div2View, ngd0Var);
                        if (!fu11Var.a()) {
                            g.c(new DivGifImageBinder$Companion$setPreview$$inlined$runMainThreadAction$2(divGifImageView, bitmap));
                            divGifImageView.previewLoaded();
                            break;
                        }
                    }
                    divGifImageView.setPreview(bitmap);
                    divGifImageView.previewLoaded();
                }
                break;
        }
    }

    @Override // defpackage.k25
    public final void j(Drawable drawable, BitmapSource bitmapSource) {
        switch (this.c) {
            case 0:
                break;
            default:
                DivGifImageView divGifImageView = (DivGifImageView) this.e;
                if (!divGifImageView.isImageLoaded()) {
                    Div2View div2View = (Div2View) this.d;
                    ngd0 ngd0Var = ngd0.G;
                    ngd0Var.p();
                    fu11 fu11Var = fu11.a;
                    if (!fu11Var.a()) {
                        a g = unr0.g(div2View, ngd0Var);
                        if (!fu11Var.a()) {
                            g.c(new DivGifImageBinder$Companion$setPreview$$inlined$runMainThreadAction$1(divGifImageView, drawable));
                            divGifImageView.previewLoaded();
                            break;
                        }
                    }
                    divGifImageView.setPreview(drawable);
                    divGifImageView.previewLoaded();
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfk(Div2View div2View, DivGifImageView divGifImageView) {
        super(div2View);
        this.d = div2View;
        this.e = divGifImageView;
    }
}
