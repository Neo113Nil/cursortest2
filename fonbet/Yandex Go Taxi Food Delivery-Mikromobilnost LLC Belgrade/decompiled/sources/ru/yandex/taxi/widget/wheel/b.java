package ru.yandex.taxi.widget.wheel;

/* loaded from: classes6.dex */
public final class b implements Runnable {
    public int a;
    public int b;
    public final /* synthetic */ WheelView c;

    public b(WheelView wheelView) {
        int i;
        this.c = wheelView;
        i = wheelView.mOffset;
        this.a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if (r0 >= r2) goto L18;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        boolean z;
        int i2;
        float f;
        int i3;
        float f2;
        int i4;
        int i5;
        int i6;
        int i7 = this.a;
        int i8 = (int) (i7 * 0.1f);
        this.b = i8;
        if (i8 == 0) {
            this.b = i7 < 0 ? -1 : 1;
        }
        int abs = Math.abs(i7);
        WheelView wheelView = this.c;
        if (abs <= 1) {
            wheelView.cancelFuture();
            wheelView.onItemSelected();
            return;
        }
        i = wheelView.totalScrollY;
        wheelView.totalScrollY = i + this.b;
        z = wheelView.isCyclical;
        if (!z) {
            i2 = wheelView.initPosition;
            f = wheelView.itemHeight;
            float f3 = f * (-i2);
            int itemsCount = wheelView.getItemsCount() - 1;
            i3 = wheelView.initPosition;
            float f4 = itemsCount - i3;
            f2 = wheelView.itemHeight;
            float f5 = f2 * f4;
            i4 = wheelView.totalScrollY;
            if (i4 > f3) {
                i6 = wheelView.totalScrollY;
            }
            i5 = wheelView.totalScrollY;
            wheelView.totalScrollY = i5 - this.b;
            wheelView.cancelFuture();
            wheelView.onItemSelected();
            return;
        }
        wheelView.invalidate();
        this.a -= this.b;
    }
}
