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
    String f11864a;

    /* renamed from: b, reason: collision with root package name */
    RectF f11865b;

    /* renamed from: c, reason: collision with root package name */
    float f11866c;

    /* renamed from: d, reason: collision with root package name */
    Paint.FontMetrics f11867d;

    /* renamed from: e, reason: collision with root package name */
    private Paint f11868e;

    /* renamed from: f, reason: collision with root package name */
    private Paint f11869f;

    public TextSeekbar(Context context) {
        super(context);
    }

    public void hideAll() {
        this.f11869f = null;
        this.f11868e = null;
        invalidate();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f11865b == null) {
            this.f11865b = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        }
        Paint paint = this.f11869f;
        if (paint != null) {
            RectF rectF = this.f11865b;
            float f2 = this.f11866c;
            canvas.drawRoundRect(rectF, f2, f2, paint);
        }
        Paint paint2 = this.f11868e;
        if (paint2 != null) {
            if (this.f11867d == null) {
                this.f11867d = paint2.getFontMetrics();
            }
            Paint.FontMetrics fontMetrics = this.f11867d;
            canvas.drawText(this.f11864a, getWidth() / 2, (int) (((getHeight() / 2) - (fontMetrics.top / 2.0f)) - (fontMetrics.bottom / 2.0f)), this.f11868e);
        }
        super.onDraw(canvas);
    }

    public TextSeekbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextSeekbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.f11868e = paint;
        paint.setTextAlign(Paint.Align.CENTER);
        this.f11868e.setTextSize(q.a(context, 12.0f));
        this.f11868e.setAntiAlias(true);
        this.f11868e.setColor(Color.parseColor("#FFFFFF"));
        this.f11864a = getContext().getString(q.a(t.b().g(), "myoffer_g2c_seek_to_click", k.f20423g));
        Paint paint2 = new Paint();
        this.f11869f = paint2;
        paint2.setColor(Color.parseColor("#80000000"));
        this.f11866c = q.a(getContext(), 12.0f);
    }
}
