package com.instagram.common.viewpoint.core;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Yp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1409Yp extends View {
    public int A00;
    public Paint A01;
    public Paint A02;
    public Paint A03;
    public boolean A04;

    public C1409Yp(C1860gi c1860gi) {
        this(c1860gi, 60, true);
    }

    public C1409Yp(C1860gi c1860gi, int i, boolean z6) {
        super(c1860gi);
        this.A00 = i;
        this.A04 = z6;
        if (z6) {
            this.A02 = new Paint();
            this.A02.setColor(-3355444);
            this.A02.setStyle(Paint.Style.STROKE);
            this.A02.setStrokeWidth(3.0f);
            this.A02.setAntiAlias(true);
            this.A01 = new Paint();
            this.A01.setColor(-1287371708);
            this.A01.setStyle(Paint.Style.FILL);
            this.A01.setAntiAlias(true);
            this.A03 = new Paint();
            this.A03.setColor(-1);
            this.A03.setStyle(Paint.Style.STROKE);
            this.A03.setStrokeWidth(6.0f);
            this.A03.setAntiAlias(true);
        }
    }

    public RelativeLayout.LayoutParams getDefaultLayoutParams() {
        float f2 = XX.A02;
        float density = this.A00;
        int i = (int) (density * f2);
        float density2 = this.A00;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, (int) (density2 * f2));
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        return layoutParams;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.A04) {
            canvas.isHardwareAccelerated();
            int min = Math.min(canvas.getWidth(), canvas.getHeight());
            int i = min / 2;
            int i4 = min / 2;
            int edgeLength = i * 2;
            int i6 = edgeLength / 3;
            canvas.drawCircle(i, i4, i6, this.A02);
            int edgeLength2 = i6 - 2;
            canvas.drawCircle(i, i4, edgeLength2, this.A01);
            int centerY = min / 3;
            int centerX = min / 3;
            int edgeLength3 = centerY * 2;
            float f2 = edgeLength3;
            int edgeLength4 = centerX * 2;
            canvas.drawLine(centerY, centerX, f2, edgeLength4, this.A03);
            int edgeLength5 = centerY * 2;
            int edgeLength6 = centerX * 2;
            canvas.drawLine(edgeLength5, centerX, centerY, edgeLength6, this.A03);
        }
        super.onDraw(canvas);
    }
}
