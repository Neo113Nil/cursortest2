package com.anythink.basead.ui.guidetoclickv2.picverify;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public class TextSeekbar extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    String f11078a;

    /* renamed from: b, reason: collision with root package name */
    RectF f11079b;

    /* renamed from: c, reason: collision with root package name */
    float f11080c;

    /* renamed from: d, reason: collision with root package name */
    Paint.FontMetrics f11081d;

    /* renamed from: e, reason: collision with root package name */
    private Paint f11082e;

    /* renamed from: f, reason: collision with root package name */
    private Paint f11083f;

    public TextSeekbar(Context context) {
        super(context);
    }

    public void hideAll() {
        this.f11083f = null;
        this.f11082e = null;
        invalidate();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f11079b == null) {
            this.f11079b = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        }
        Paint paint = this.f11083f;
        if (paint != null) {
            RectF rectF = this.f11079b;
            float f3 = this.f11080c;
            canvas.drawRoundRect(rectF, f3, f3, paint);
        }
        Paint paint2 = this.f11082e;
        if (paint2 != null) {
            if (this.f11081d == null) {
                this.f11081d = paint2.getFontMetrics();
            }
            Paint.FontMetrics fontMetrics = this.f11081d;
            canvas.drawText(this.f11078a, getWidth() / 2, (int) (((getHeight() / 2) - (fontMetrics.top / 2.0f)) - (fontMetrics.bottom / 2.0f)), this.f11082e);
        }
        super.onDraw(canvas);
    }

    public TextSeekbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextSeekbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.f11082e = paint;
        paint.setTextAlign(Paint.Align.CENTER);
        this.f11082e.setTextSize(q.a(context, 12.0f));
        this.f11082e.setAntiAlias(true);
        this.f11082e.setColor(Color.parseColor("#FFFFFF"));
        this.f11078a = getContext().getString(q.a(t.b().g(), "myoffer_g2c_seek_to_click", k.f19636g));
        Paint paint2 = new Paint();
        this.f11083f = paint2;
        paint2.setColor(Color.parseColor("#80000000"));
        this.f11080c = q.a(getContext(), 12.0f);
    }
}
