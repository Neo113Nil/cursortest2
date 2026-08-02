package ru.yandex.taxi.eatskit.widget.placeholder.grocery;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import defpackage.acu0;
import defpackage.cst0;
import defpackage.u1u;
import defpackage.zcu0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/yandex/taxi/eatskit/widget/placeholder/grocery/GrocerySplashView;", "Landroid/view/View;", "Lcst0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "canvas", "Lacu0;", "model", "Lzy11;", "drawSticker", "(Landroid/graphics/Canvas;Lacu0;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "isAnimating", "setAnimating", "(Z)V", "onDraw", "(Landroid/graphics/Canvas;)V", "Lzcu0;", "presenter", "Lzcu0;", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GrocerySplashView extends View implements cst0 {
    private final zcu0 presenter;

    public /* synthetic */ GrocerySplashView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void drawSticker(Canvas canvas, acu0 model) {
        canvas.save();
        float f = model.g;
        RectF rectF = model.b;
        canvas.rotate(f, rectF.centerX(), rectF.centerY());
        Path path = model.e;
        float f2 = model.f;
        canvas.scale(f2, f2, rectF.centerX(), rectF.centerY());
        canvas.drawPath(path, model.d);
        String str = model.a;
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        Paint paint = model.c;
        canvas.drawText(str, centerX, (Math.abs(paint.ascent() + paint.descent()) / 2.0f) + centerY, paint);
        canvas.restore();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        zcu0 zcu0Var = this.presenter;
        zcu0Var.b = this;
        OneShotPreDrawListener.add(this, new u1u(zcu0Var, 0));
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zcu0 zcu0Var = this.presenter;
        zcu0Var.b = null;
        zcu0Var.c();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Iterator it = this.presenter.c.iterator();
        while (it.hasNext()) {
            drawSticker(canvas, (acu0) it.next());
        }
    }

    @Override // defpackage.cst0
    public void setAnimating(boolean isAnimating) {
        if (!isAnimating) {
            this.presenter.c();
        } else if (getWidth() <= 0 || getHeight() <= 0) {
            OneShotPreDrawListener.add(this, new u1u(this.presenter, 1));
        } else {
            this.presenter.a();
        }
    }

    public GrocerySplashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public GrocerySplashView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.presenter = new zcu0(context);
    }

    public GrocerySplashView(Context context) {
        this(context, null, 0, 6, null);
    }
}
