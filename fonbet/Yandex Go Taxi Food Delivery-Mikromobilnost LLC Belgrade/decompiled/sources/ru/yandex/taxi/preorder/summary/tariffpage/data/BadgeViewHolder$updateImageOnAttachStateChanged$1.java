package ru.yandex.taxi.preorder.summary.tariffpage.data;

import android.graphics.drawable.Drawable;
import android.view.View;
import defpackage.g18;
import defpackage.nac;
import defpackage.zbd;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.taxi.plus.design.view.GradientGlyphValueView;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"ru/yandex/taxi/preorder/summary/tariffpage/data/BadgeViewHolder$updateImageOnAttachStateChanged$1", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Lzy11;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "Lg18;", "imageLoadingCancellable", "Lg18;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BadgeViewHolder$updateImageOnAttachStateChanged$1 implements View.OnAttachStateChangeListener {
    final /* synthetic */ String $cashbackIconUrl;
    final /* synthetic */ GradientGlyphValueView $cashbackView;
    private g18 imageLoadingCancellable = g18.u1;
    final /* synthetic */ b this$0;

    public BadgeViewHolder$updateImageOnAttachStateChanged$1(b bVar, GradientGlyphValueView gradientGlyphValueView, String str) {
        this.this$0 = bVar;
        this.$cashbackView = gradientGlyphValueView;
        this.$cashbackIconUrl = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewAttachedToWindow$lambda$0(GradientGlyphValueView gradientGlyphValueView, Drawable drawable) {
        if (drawable != null) {
            gradientGlyphValueView.setIconDrawable(drawable);
        }
        return zy11.a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v) {
        this.imageLoadingCancellable = ((nac) this.this$0.a.f(new zbd(24), this.$cashbackView)).c(this.$cashbackIconUrl);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
        this.imageLoadingCancellable.cancel();
        this.$cashbackView.removeOnAttachStateChangeListener(this);
    }
}
