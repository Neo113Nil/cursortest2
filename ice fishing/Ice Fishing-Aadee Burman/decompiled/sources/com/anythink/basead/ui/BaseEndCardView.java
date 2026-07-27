package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.RelativeLayout;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.v.am;

/* loaded from: classes.dex */
public abstract class BaseEndCardView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    protected String f9821a;

    /* renamed from: b, reason: collision with root package name */
    protected w f9822b;

    /* renamed from: c, reason: collision with root package name */
    protected x f9823c;

    /* renamed from: d, reason: collision with root package name */
    protected y f9824d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f9825e;
    public a mListener;

    public interface a {
        void a();

        void a(int i);
    }

    public interface b extends a {
        void b();
    }

    public BaseEndCardView(Context context, w wVar, x xVar) {
        super(context);
        this.f9821a = getClass().getSimpleName();
        super.setWillNotDraw(false);
        this.f9822b = wVar;
        this.f9823c = xVar;
        this.f9824d = xVar.f14168o;
    }

    private static RectF a(int i, int i6) {
        int i9 = i / 2;
        float f3 = i6;
        int i10 = (int) (1.0f * f3);
        RectF rectF = new RectF();
        rectF.left = i9 - i10;
        rectF.top = i6 - (i10 * 2);
        rectF.right = i9 + i10;
        rectF.bottom = f3;
        return rectF;
    }

    public abstract void a();

    public Drawable b() {
        return null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Canvas canvas2;
        try {
            if (this.f9825e) {
                canvas2 = canvas;
                try {
                    int saveLayer = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
                    super.draw(canvas2);
                    int width = getWidth();
                    int height = getHeight();
                    int width2 = getWidth();
                    int i = width2 / 2;
                    float height2 = getHeight();
                    int i6 = (int) (1.0f * height2);
                    RectF rectF = new RectF();
                    rectF.left = i - i6;
                    rectF.top = r4 - (i6 * 2);
                    rectF.right = i + i6;
                    rectF.bottom = height2;
                    am.a(canvas2, width, height, rectF);
                    canvas2.restoreToCount(saveLayer);
                    return;
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
        }
        canvas2 = canvas;
        super.draw(canvas2);
    }

    public void setNeedArc(boolean z3) {
        this.f9825e = z3;
        postInvalidate();
    }
}
