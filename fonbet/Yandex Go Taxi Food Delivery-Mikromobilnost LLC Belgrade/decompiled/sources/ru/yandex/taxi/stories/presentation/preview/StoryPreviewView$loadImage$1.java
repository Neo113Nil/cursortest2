package ru.yandex.taxi.stories.presentation.preview;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import defpackage.ec3;
import defpackage.g18;
import defpackage.koc;
import defpackage.lbm;
import defpackage.nac;
import defpackage.ogu0;
import defpackage.p9t0;
import defpackage.pav;
import defpackage.zy11;
import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"ru/yandex/taxi/stories/presentation/preview/StoryPreviewView$loadImage$1", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Lzy11;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "stories"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StoryPreviewView$loadImage$1 implements View.OnAttachStateChangeListener {
    final /* synthetic */ koc $commonImageLoaderDelegate;
    final /* synthetic */ String $teaserImage;
    final /* synthetic */ StoryPreviewView this$0;

    public StoryPreviewView$loadImage$1(koc kocVar, StoryPreviewView storyPreviewView, String str) {
        this.$commonImageLoaderDelegate = kocVar;
        this.this$0 = storyPreviewView;
        this.$teaserImage = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewAttachedToWindow$lambda$0(StoryPreviewView storyPreviewView, Drawable drawable) {
        View view;
        storyPreviewView.stopPulseAnimation();
        view = storyPreviewView.placeholder;
        if (view == null) {
            view = null;
        }
        view.animate().alpha(0.0f).setDuration(300L);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewAttachedToWindow$lambda$1(StoryPreviewView storyPreviewView) {
        storyPreviewView.stopPulseAnimation();
        return zy11.a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, dai] */
    /* JADX WARN: Type inference failed for: r6v6, types: [T, ec3] */
    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v) {
        final ImageView imageView;
        koc kocVar = this.$commonImageLoaderDelegate;
        imageView = this.this$0.previewView;
        if (imageView == null) {
            imageView = null;
        }
        final String str = this.$teaserImage;
        StoryPreviewView storyPreviewView = this.this$0;
        p9t0 p9t0Var = new p9t0(16, storyPreviewView);
        ogu0 ogu0Var = new ogu0(3, storyPreviewView);
        pav pavVar = kocVar.a;
        pavVar.c(imageView);
        if (str.length() == 0) {
            ogu0Var.invoke();
            return;
        }
        final lbm a = pavVar.a(imageView);
        nac nacVar = (nac) a;
        nacVar.h = p9t0Var;
        nacVar.i = ogu0Var;
        final Supplier supplier = new Supplier() { // from class: joc
            @Override // java.util.function.Supplier
            public final Object get() {
                ImageView imageView2 = imageView;
                int measuredWidth = imageView2.getMeasuredWidth();
                int measuredHeight = imageView2.getMeasuredHeight();
                nac nacVar2 = (nac) lbm.this;
                nacVar2.f(measuredWidth, measuredHeight);
                return nacVar2.c(str);
            }
        };
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = g18.u1;
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: ru.yandex.taxi.stories.domain.CommonImageLoaderDelegate$loadStoryPreview$$inlined$doOnPreDraw$1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                supplier.get();
                ((g18) Ref$ObjectRef.this.element).cancel();
                return true;
            }
        };
        ref$ObjectRef.element = new ec3(viewTreeObserver, onPreDrawListener, imageView, 6);
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
        ImageView imageView;
        imageView = this.this$0.previewView;
        if (imageView == null) {
            imageView = null;
        }
        imageView.removeOnAttachStateChangeListener(this);
    }
}
