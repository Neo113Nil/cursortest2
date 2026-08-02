package com.anythink.basead.ui.guidetoclickv2.picverify;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public final class b extends a {
    public b(Context context) {
        super(context);
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.picverify.a
    public final Path a(int i) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        float f2 = i;
        path.rLineTo(f2, 0.0f);
        path.rLineTo(0.0f, f2);
        float f9 = -i;
        path.rLineTo(f9, 0.0f);
        path.rLineTo(0.0f, f9);
        path.close();
        return path;
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.picverify.a
    public final c b(int i, int i4, int i6) {
        return new c((int) (i * 0.15d), (int) ((i4 / 2.0d) - (i6 * 1.5d)));
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.picverify.a
    public final Paint b() {
        return new Paint();
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.picverify.a
    public final c a(int i, int i4, int i6) {
        return new c((i - i6) - ((int) (i * 0.15d)), (int) ((i4 / 2.0d) - (i6 * 1.5d)));
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.picverify.a
    public final Paint a() {
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#000000"));
        paint.setAlpha(com.anythink.expressad.video.module.a.a.f22515R);
        return paint;
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.picverify.a
    public final void a(Context context, Canvas canvas, Path path) {
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#FFFFFF"));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(q.a(context, 2.0f));
        paint.setPathEffect(new DashPathEffect(new float[]{20.0f, 20.0f}, 10.0f));
        canvas.drawPath(new Path(path), paint);
    }
}
