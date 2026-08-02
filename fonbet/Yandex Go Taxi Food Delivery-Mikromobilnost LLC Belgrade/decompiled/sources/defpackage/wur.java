package defpackage;

import android.graphics.PointF;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.ScreenRect;

/* loaded from: classes9.dex */
public final class wur {
    public final PointF a = new PointF();
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public ScreenRect h;

    public final ScreenRect a() {
        ScreenRect screenRect = this.h;
        if (screenRect == null) {
            PointF pointF = this.a;
            float f = pointF.x;
            float f2 = f - this.d;
            float f3 = (this.f - this.e) - f;
            float f4 = pointF.y;
            float f5 = f4 - this.b;
            float f6 = (this.g - this.c) - f4;
            if (f2 > f3) {
                f2 = f3;
            }
            if (f5 > f6) {
                f5 = f6;
            }
            float f7 = f - f2;
            float f8 = f + f2;
            float f9 = f4 - f5;
            float f10 = f4 + f5;
            ScreenPoint screenPoint = new ScreenPoint(f7, f9);
            if (f8 >= f7) {
                f7 = f8;
            }
            if (f10 >= f9) {
                f9 = f10;
            }
            screenRect = new ScreenRect(screenPoint, new ScreenPoint(f7, f9));
        }
        if (screenRect != this.h) {
            this.h = screenRect;
        }
        return screenRect;
    }
}
