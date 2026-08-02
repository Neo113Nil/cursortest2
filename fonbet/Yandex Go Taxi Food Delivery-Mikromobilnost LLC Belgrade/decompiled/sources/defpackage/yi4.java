package defpackage;

import android.view.ViewConfiguration;
import ru.yandex.taxi.widget.BackportNumberPicker;

/* loaded from: classes6.dex */
public final class yi4 implements Runnable {
    public int a;
    public int b;
    public final /* synthetic */ BackportNumberPicker c;

    public yi4(BackportNumberPicker backportNumberPicker) {
        this.c = backportNumberPicker;
    }

    public final void a() {
        boolean z;
        boolean z2;
        int i;
        int i2;
        this.b = 0;
        this.a = 0;
        BackportNumberPicker backportNumberPicker = this.c;
        backportNumberPicker.removeCallbacks(this);
        z = backportNumberPicker.mIncrementVirtualButtonPressed;
        if (z) {
            backportNumberPicker.mIncrementVirtualButtonPressed = false;
            i2 = backportNumberPicker.mBottomSelectionDividerBottom;
            backportNumberPicker.invalidate(0, i2, backportNumberPicker.getRight(), backportNumberPicker.getBottom());
        }
        backportNumberPicker.mDecrementVirtualButtonPressed = false;
        z2 = backportNumberPicker.mDecrementVirtualButtonPressed;
        if (z2) {
            int right = backportNumberPicker.getRight();
            i = backportNumberPicker.mTopSelectionDividerTop;
            backportNumberPicker.invalidate(0, 0, right, i);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        boolean z3;
        boolean z4;
        int i4;
        int i5 = this.b;
        BackportNumberPicker backportNumberPicker = this.c;
        if (i5 == 1) {
            int i6 = this.a;
            if (i6 == 1) {
                backportNumberPicker.mIncrementVirtualButtonPressed = true;
                i = backportNumberPicker.mBottomSelectionDividerBottom;
                backportNumberPicker.invalidate(0, i, backportNumberPicker.getRight(), backportNumberPicker.getBottom());
                return;
            } else {
                if (i6 != 2) {
                    return;
                }
                backportNumberPicker.mDecrementVirtualButtonPressed = true;
                int right = backportNumberPicker.getRight();
                i2 = backportNumberPicker.mTopSelectionDividerTop;
                backportNumberPicker.invalidate(0, 0, right, i2);
                return;
            }
        }
        if (i5 != 2) {
            return;
        }
        int i7 = this.a;
        if (i7 == 1) {
            z = backportNumberPicker.mIncrementVirtualButtonPressed;
            if (!z) {
                backportNumberPicker.postDelayed(this, ViewConfiguration.getPressedStateDuration());
            }
            z2 = backportNumberPicker.mIncrementVirtualButtonPressed;
            backportNumberPicker.mIncrementVirtualButtonPressed = !z2;
            i3 = backportNumberPicker.mBottomSelectionDividerBottom;
            backportNumberPicker.invalidate(0, i3, backportNumberPicker.getRight(), backportNumberPicker.getBottom());
            return;
        }
        if (i7 != 2) {
            return;
        }
        z3 = backportNumberPicker.mDecrementVirtualButtonPressed;
        if (!z3) {
            backportNumberPicker.postDelayed(this, ViewConfiguration.getPressedStateDuration());
        }
        z4 = backportNumberPicker.mDecrementVirtualButtonPressed;
        backportNumberPicker.mDecrementVirtualButtonPressed = !z4;
        int right2 = backportNumberPicker.getRight();
        i4 = backportNumberPicker.mTopSelectionDividerTop;
        backportNumberPicker.invalidate(0, 0, right2, i4);
    }
}
