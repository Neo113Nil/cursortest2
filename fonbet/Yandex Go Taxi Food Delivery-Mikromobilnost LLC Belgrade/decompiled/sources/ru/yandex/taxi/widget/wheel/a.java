package ru.yandex.taxi.widget.wheel;

import ru.yandex.taxi.widget.wheel.WheelView;

/* loaded from: classes6.dex */
public final class a implements Runnable {
    public float a = 2.1474836E9f;
    public final /* synthetic */ float b;
    public final /* synthetic */ WheelView c;

    public a(WheelView wheelView, float f) {
        this.b = f;
        this.c = wheelView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        boolean z;
        int i2;
        float f;
        int i3;
        float f2;
        int i4;
        float f3;
        int i5;
        float f4;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        if (this.a == 2.1474836E9f) {
            float f5 = this.b;
            if (Math.abs(f5) > 2000.0f) {
                f5 = f5 > 0.0f ? 2000.0f : -2000.0f;
            }
            this.a = f5;
        }
        float abs = Math.abs(this.a);
        WheelView wheelView = this.c;
        if (abs >= 0.0f && Math.abs(this.a) <= 20.0f) {
            wheelView.cancelFuture();
            wheelView.smoothScroll(WheelView.Action.FLING);
            return;
        }
        int i12 = (int) ((this.a * 10.0f) / 1000.0f);
        i = wheelView.totalScrollY;
        wheelView.totalScrollY = i - i12;
        z = wheelView.isCyclical;
        if (!z) {
            i2 = wheelView.initPosition;
            f = wheelView.itemHeight;
            float f6 = f * (-i2);
            int itemsCount = wheelView.getItemsCount() - 1;
            i3 = wheelView.initPosition;
            float f7 = itemsCount - i3;
            f2 = wheelView.itemHeight;
            float f8 = f2 * f7;
            i4 = wheelView.totalScrollY;
            double d = i4;
            f3 = wheelView.itemHeight;
            if (d - (f3 * 0.3d) < f6) {
                i10 = wheelView.totalScrollY;
                int i13 = i10 + i12;
                i11 = wheelView.totalScrollY;
                if (i11 <= i13) {
                    this.a = 40.0f;
                    wheelView.totalScrollY = i13;
                }
            } else {
                i5 = wheelView.totalScrollY;
                double d2 = i5;
                f4 = wheelView.itemHeight;
                if ((f4 * 0.3d) + d2 > f8) {
                    i6 = wheelView.totalScrollY;
                    int i14 = i6 + i12;
                    i7 = wheelView.totalScrollY;
                    if (i7 >= i14) {
                        wheelView.totalScrollY = i14;
                        this.a = -40.0f;
                    }
                }
            }
            i8 = wheelView.totalScrollY;
            if (i8 <= f6) {
                this.a = 40.0f;
                wheelView.totalScrollY = (int) f6;
            } else {
                i9 = wheelView.totalScrollY;
                if (i9 >= f8) {
                    wheelView.totalScrollY = (int) f8;
                    this.a = -40.0f;
                }
            }
        }
        float f9 = this.a;
        if (f9 < 0.0f) {
            this.a = f9 + 20.0f;
        } else {
            this.a = f9 - 20.0f;
        }
        wheelView.invalidate();
    }
}
