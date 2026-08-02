package androidx.compose.ui.text.platform.style;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.ui.graphics.AndroidPathEffect;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class DrawStyleSpan extends CharacterStyle implements UpdateAppearance {
    public final DrawStyle drawStyle;

    public DrawStyleSpan(DrawStyle drawStyle) {
        this.drawStyle = drawStyle;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            Fill fill = Fill.INSTANCE;
            DrawStyle drawStyle = this.drawStyle;
            if (Intrinsics.areEqual(drawStyle, fill)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(drawStyle instanceof Stroke)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            Stroke stroke = (Stroke) drawStyle;
            textPaint.setStrokeWidth(stroke.width);
            textPaint.setStrokeMiter(stroke.miter);
            int i = stroke.join;
            textPaint.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 1 ? Paint.Join.ROUND : i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i2 = stroke.cap;
            textPaint.setStrokeCap(i2 == 0 ? Paint.Cap.BUTT : i2 == 1 ? Paint.Cap.ROUND : i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            PathEffect pathEffect = stroke.pathEffect;
            textPaint.setPathEffect(pathEffect != null ? ((AndroidPathEffect) pathEffect).nativePathEffect : null);
        }
    }
}
