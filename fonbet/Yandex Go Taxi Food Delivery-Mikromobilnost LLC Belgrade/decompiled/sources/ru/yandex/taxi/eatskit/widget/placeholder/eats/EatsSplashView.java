package ru.yandex.taxi.eatskit.widget.placeholder.eats;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.core.view.OneShotPreDrawListener;
import defpackage.cst0;
import defpackage.i8m;
import defpackage.jkz;
import defpackage.kce0;
import defpackage.mgn;
import defpackage.n;
import defpackage.ngn;
import defpackage.ny61;
import defpackage.uo4;
import defpackage.vph0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\"\u0010!J\u0017\u0010#\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000fH\u0014¢\u0006\u0004\b%\u0010!J\u000f\u0010&\u001a\u00020\u000fH\u0014¢\u0006\u0004\b&\u0010!R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0015\u00100\u001a\u00020-8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lru/yandex/taxi/eatskit/widget/placeholder/eats/EatsSplashView;", "Landroid/widget/FrameLayout;", "Lcst0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "canvas", "Luo4;", "model", "Lzy11;", "drawBalloon", "(Landroid/graphics/Canvas;Luo4;)V", "Ljkz;", "drawLogo", "(Landroid/graphics/Canvas;Ljkz;)V", "", "isAnimating", "setAnimating", "(Z)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "showProgressBar", "()V", "hideProgressBar", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "onAttachedToWindow", "onDetachedFromWindow", "Lngn;", "presenter", "Lngn;", "Lmgn;", "binding", "Lmgn;", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "progressBar", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EatsSplashView extends FrameLayout implements cst0 {
    private final mgn binding;
    private final ngn presenter;

    public EatsSplashView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.presenter = new ngn(context);
        View inflate = LayoutInflater.from(context).inflate(vph0.eats_splash_progressbar, (ViewGroup) this, false);
        addView(inflate);
        if (inflate == null) {
            ny61.t("rootView");
            throw null;
        }
        ProgressBar progressBar = (ProgressBar) inflate;
        this.binding = new mgn(progressBar, progressBar);
    }

    private final void drawBalloon(Canvas canvas, uo4 model) {
        RectF rectF = model.c;
        float f = model.d;
        canvas.drawRoundRect(rectF, f, f, model.e);
        String str = model.a;
        int length = str.length();
        RectF rectF2 = model.c;
        float centerX = rectF2.centerX();
        float centerY = rectF2.centerY();
        Paint paint = model.b;
        canvas.drawText(str, 0, length, centerX, (Math.abs(paint.ascent() + paint.descent()) / 2.0f) + centerY, model.b);
    }

    private final void drawLogo(Canvas canvas, jkz model) {
        if (model == null) {
            return;
        }
        RectF rectF = model.a;
        float f = model.c;
        canvas.drawRoundRect(rectF, f, f, model.d);
        Drawable drawable = model.e;
        if (drawable != null) {
            drawable.setBounds(model.b);
            drawable.draw(canvas);
        }
    }

    private final ProgressBar getProgressBar() {
        return this.binding.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        drawLogo(canvas, this.presenter.c);
        Iterator it = this.presenter.d.iterator();
        while (it.hasNext()) {
            drawBalloon(canvas, (uo4) it.next());
        }
        super.dispatchDraw(canvas);
    }

    public void hideProgressBar() {
        this.binding.b.setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.presenter.b = this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ngn ngnVar = this.presenter;
        ngnVar.b = null;
        ngnVar.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0043  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        kce0 kce0Var;
        super.onLayout(changed, left, top, right, bottom);
        ngn ngnVar = this.presenter;
        float width = this.binding.b.getWidth();
        float height = this.binding.b.getHeight();
        jkz jkzVar = ngnVar.c;
        EatsSplashView eatsSplashView = ngnVar.b;
        if (jkzVar != null) {
            RectF rectF = jkzVar.a;
            if (eatsSplashView != null) {
                kce0Var = new kce0(rectF.centerX() - (width / 2.0f), n.a(eatsSplashView.getHeight(), rectF.bottom, 2.0f, rectF.bottom) - (height / 2.0f));
                if (kce0Var != null) {
                    return;
                }
                float f = kce0Var.b;
                ProgressBar progressBar = this.binding.b;
                int i = (int) kce0Var.a;
                int i2 = (int) f;
                progressBar.layout(i, i2, progressBar.getWidth() + i, this.binding.b.getHeight() + i2);
                return;
            }
        }
        kce0Var = null;
        if (kce0Var != null) {
        }
    }

    @Override // defpackage.cst0
    public void setAnimating(boolean isAnimating) {
        if (!isAnimating) {
            this.presenter.b();
        } else if (getWidth() > 0 && getHeight() > 0) {
            this.presenter.a();
        } else {
            OneShotPreDrawListener.add(this, new i8m(5, this.presenter));
        }
    }

    public void showProgressBar() {
        this.binding.b.setVisibility(0);
    }

    public EatsSplashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public EatsSplashView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ EatsSplashView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
