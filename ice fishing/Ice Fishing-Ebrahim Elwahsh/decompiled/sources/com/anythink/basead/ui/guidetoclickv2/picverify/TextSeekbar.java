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
    String f11235a;

    /* renamed from: b, reason: collision with root package name */
    RectF f11236b;

    /* renamed from: c, reason: collision with root package name */
    float f11237c;

    /* renamed from: d, reason: collision with root package name */
    Paint.FontMetrics f11238d;

    /* renamed from: e, reason: collision with root package name */
    private Paint f11239e;

    /* renamed from: f, reason: collision with root package name */
    private Paint f11240f;

    public TextSeekbar(Context context) {
        super(context);
    }

    public void hideAll() {
        this.f11240f = null;
        this.f11239e = null;
        invalidate();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f11236b == null) {
            this.f11236b = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        }
        Paint paint = this.f11240f;
        if (paint != null) {
            RectF rectF = this.f11236b;
            float f6 = this.f11237c;
            canvas.drawRoundRect(rectF, f6, f6, paint);
        }
        Paint paint2 = this.f11239e;
        if (paint2 != null) {
            if (this.f11238d == null) {
                this.f11238d = paint2.getFontMetrics();
            }
            Paint.FontMetrics fontMetrics = this.f11238d;
            canvas.drawText(this.f11235a, getWidth() / 2, (int) (((getHeight() / 2) - (fontMetrics.top / 2.0f)) - (fontMetrics.bottom / 2.0f)), this.f11239e);
        }
        super.onDraw(canvas);
    }

    public TextSeekbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextSeekbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.f11239e = paint;
        paint.setTextAlign(Paint.Align.CENTER);
        this.f11239e.setTextSize(q.a(context, 12.0f));
        this.f11239e.setAntiAlias(true);
        this.f11239e.setColor(Color.parseColor("#FFFFFF"));
        this.f11235a = getContext().getString(q.a(t.b().g(), "myoffer_g2c_seek_to_click", k.f19794g));
        Paint paint2 = new Paint();
        this.f11240f = paint2;
        paint2.setColor(Color.parseColor("#80000000"));
        this.f11237c = q.a(getContext(), 12.0f);
    }
}
