package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class s4 implements defpackage.cu1 {
    public final android.view.ViewConfiguration ZpBGe2uQfcn8;

    public s4(android.view.ViewConfiguration viewConfiguration) {
        this.ZpBGe2uQfcn8 = viewConfiguration;
    }

    @Override // defpackage.cu1
    public final float JhCgjQRTAOCT() {
        return this.ZpBGe2uQfcn8.getScaledTouchSlop();
    }

    @Override // defpackage.cu1
    public final float WDYagTQQm9ns() {
        int scaledHandwritingSlop;
        if (android.os.Build.VERSION.SDK_INT < 34) {
            return 2.0f;
        }
        scaledHandwritingSlop = this.ZpBGe2uQfcn8.getScaledHandwritingSlop();
        return scaledHandwritingSlop;
    }

    @Override // defpackage.cu1
    public final float ZpBGe2uQfcn8() {
        return this.ZpBGe2uQfcn8.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.cu1
    public final long fWTAfUmVKrZq() {
        return android.view.ViewConfiguration.getLongPressTimeout();
    }

    @Override // defpackage.cu1
    public final long giKS3J6vZuNy() {
        return android.view.ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // defpackage.cu1
    public final float oh71FJcDz6S2() {
        int scaledHandwritingGestureLineMargin;
        if (android.os.Build.VERSION.SDK_INT < 34) {
            return 16.0f;
        }
        scaledHandwritingGestureLineMargin = this.ZpBGe2uQfcn8.getScaledHandwritingGestureLineMargin();
        return scaledHandwritingGestureLineMargin;
    }
}
