package defpackage;

import android.graphics.Bitmap;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import android.text.SpannableStringBuilder;
import com.yandex.div.core.images.BitmapSource;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.j;
import com.yandex.div.core.view2.spannable.ImageSpan;
import com.yandex.div.internal.view.DivImageView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivBlendMode;
import java.util.List;

/* loaded from: classes.dex */
public final class xsk extends osk {
    public final /* synthetic */ int c = 1;
    public final aw5 d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public xsk(aw5 aw5Var, cfl cflVar, ImageSpan imageSpan, SpannableStringBuilder spannableStringBuilder, tls tlsVar) {
        super(aw5Var.a);
        this.d = aw5Var;
        this.e = cflVar;
        this.f = imageSpan;
        this.g = spannableStringBuilder;
        this.h = tlsVar;
    }

    @Override // defpackage.osk, defpackage.btk
    public void d(Throwable th) {
        switch (this.c) {
            case 0:
                super.d(th);
                ((DivImageView) this.f).setImageUrl$div_release(null);
                break;
            default:
                super.d(th);
                break;
        }
    }

    @Override // defpackage.k25
    public void h(Drawable drawable, BitmapSource bitmapSource) {
        switch (this.c) {
            case 1:
                if (!(drawable instanceof PictureDrawable)) {
                    j(drawable, bitmapSource);
                    break;
                } else {
                    k((PictureDrawable) drawable, bitmapSource);
                    break;
                }
            default:
                super.h(drawable, bitmapSource);
                break;
        }
    }

    @Override // defpackage.k25
    public final void i(Bitmap bitmap, BitmapSource bitmapSource) {
        switch (this.c) {
            case 0:
                j jVar = (j) this.e;
                Object obj = this.f;
                psk pskVar = (psk) this.g;
                jVar.Mg((DivImageView) obj, this.d, bitmap, pskVar.N, pskVar.t);
                DivImageView divImageView = (DivImageView) obj;
                rvo rvoVar = (rvo) this.h;
                j.Hg(jVar, divImageView, pskVar, rvoVar, bitmapSource);
                divImageView.imageLoaded();
                Expression expression = pskVar.P;
                j.Ng(divImageView, expression != null ? (Integer) expression.a(rvoVar) : null, (DivBlendMode) pskVar.Q.a(rvoVar));
                divImageView.invalidate();
                break;
            default:
                j(new BitmapDrawable(this.d.a.getResources(), bitmap), bitmapSource);
                break;
        }
    }

    @Override // defpackage.k25
    public final void j(Drawable drawable, BitmapSource bitmapSource) {
        int i = this.c;
        Object obj = this.g;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.e;
        aw5 aw5Var = this.d;
        switch (i) {
            case 0:
                j jVar = (j) obj4;
                DivImageView divImageView = (DivImageView) obj3;
                j.Ig(jVar, divImageView, aw5Var.a, drawable);
                j.Hg(jVar, divImageView, (psk) obj, (rvo) obj2, bitmapSource);
                divImageView.imageLoaded();
                divImageView.invalidate();
                break;
            default:
                rvo rvoVar = aw5Var.b;
                cfl cflVar = (cfl) obj4;
                Expression expression = cflVar.g;
                if (expression != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(((Number) expression.a(rvoVar)).intValue(), uml.q((DivBlendMode) cflVar.h.a(rvoVar))));
                }
                ((ImageSpan) obj3).setImage(drawable);
                tls tlsVar = (tls) obj2;
                if (tlsVar != null) {
                    tlsVar.invoke((SpannableStringBuilder) obj);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.k25
    public final void k(PictureDrawable pictureDrawable, BitmapSource bitmapSource) {
        List list;
        int i = this.c;
        Object obj = this.g;
        switch (i) {
            case 0:
                psk pskVar = (psk) obj;
                if (pskVar.P != null || ((list = pskVar.t) != null && !list.isEmpty())) {
                    i(ffx.d0(pictureDrawable, 0, 0, 7), bitmapSource);
                    break;
                } else {
                    j(pictureDrawable, bitmapSource);
                    break;
                }
                break;
            default:
                if (((cfl) this.e).g != null) {
                    i(ffx.d0(pictureDrawable, 0, 0, 7), bitmapSource);
                    break;
                } else {
                    ((ImageSpan) this.f).setImage(pictureDrawable);
                    tls tlsVar = (tls) this.h;
                    if (tlsVar != null) {
                        tlsVar.invoke((SpannableStringBuilder) obj);
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsk(j jVar, DivImageView divImageView, aw5 aw5Var, psk pskVar, rvo rvoVar, Div2View div2View) {
        super(div2View);
        this.e = jVar;
        this.f = divImageView;
        this.d = aw5Var;
        this.g = pskVar;
        this.h = rvoVar;
    }
}
