package com.squareup.cardcustomizations.signature;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class Spliner {
    public final ArrayList points = new ArrayList();
    public final ArrayList _beziers = new ArrayList();

    public final class Bezier {
        public final Point control1;
        public final Point control2;
        public final Point endPoint;
        public final Path path;
        public final Point startPoint;

        public Bezier(Point point, Point point2, Point point3, Point point4) {
            point.getClass();
            point2.getClass();
            this.startPoint = point;
            this.endPoint = point2;
            this.control1 = point3;
            this.control2 = point4;
            this.path = new Path();
        }

        public final void draw(Canvas canvas, Paint paint) {
            paint.getClass();
            Path path = this.path;
            path.reset();
            Point point = this.startPoint;
            path.moveTo(point.x, point.y);
            Point point2 = this.control1;
            float f = point2.x;
            float f2 = point2.y;
            Point point3 = this.control2;
            float f3 = point3.x;
            float f4 = point3.y;
            Point point4 = this.endPoint;
            path.cubicTo(f, f2, f3, f4, point4.x, point4.y);
            canvas.drawPath(path, paint);
        }
    }

    public final class Companion {
        public static final float[] access$computeBSpline(float[] fArr) {
            int length = fArr.length;
            float[][] fArr2 = new float[length][];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                fArr2[i2] = new float[length];
            }
            for (int i3 = 0; i3 < length; i3++) {
                if (i3 > 0) {
                    fArr2[i3][i3 - 1] = 1.0f;
                }
                float[] fArr3 = fArr2[i3];
                fArr3[i3] = 4.0f;
                if (i3 < length - 1) {
                    fArr3[i3 + 1] = 1.0f;
                }
            }
            while (i < length) {
                int i4 = i + 1;
                for (int i5 = i4; i5 < length; i5++) {
                    float f = fArr2[i5][i] / fArr2[i][i];
                    for (int i6 = i; i6 < length; i6++) {
                        float[] fArr4 = fArr2[i5];
                        fArr4[i6] = fArr4[i6] - (fArr2[i][i6] * f);
                    }
                    fArr[i5] = fArr[i5] - (f * fArr[i]);
                }
                i = i4;
            }
            float[] fArr5 = new float[length];
            for (int i7 = length - 1; -1 < i7; i7--) {
                float f2 = RecyclerView.DECELERATION_RATE;
                for (int i8 = i7 + 1; i8 < length; i8++) {
                    f2 += fArr2[i7][i8] * fArr5[i8];
                }
                fArr5[i7] = (fArr[i7] - f2) / fArr2[i7][i7];
            }
            return fArr5;
        }
    }
}
