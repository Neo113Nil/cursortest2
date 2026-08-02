package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* loaded from: classes3.dex */
public final class rxd extends zxd {
    public final /* synthetic */ int a;

    @Override // defpackage.zxd
    public final int a(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int measuredHeight;
        int i;
        switch (this.a) {
            case 0:
                measuredHeight = view.getMeasuredHeight();
                i = marginLayoutParams.bottomMargin;
                break;
            case 1:
                measuredHeight = view.getMeasuredWidth();
                i = marginLayoutParams.leftMargin;
                break;
            default:
                measuredHeight = view.getMeasuredWidth();
                i = marginLayoutParams.rightMargin;
                break;
        }
        return measuredHeight + i;
    }

    @Override // defpackage.zxd
    public final int b() {
        switch (this.a) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                return 0;
        }
    }

    @Override // defpackage.zxd
    public final ViewPropertyAnimator c(int i, View view) {
        switch (this.a) {
            case 0:
                return view.animate().translationY(i);
            case 1:
                return view.animate().translationX(-i);
            default:
                return view.animate().translationX(i);
        }
    }

    @Override // defpackage.zxd
    public final void d(View view, int i, int i2) {
        switch (this.a) {
            case 0:
                view.setTranslationY(i + i2);
                break;
            case 1:
                view.setTranslationX(i - i2);
                break;
            default:
                view.setTranslationX(i + i2);
                break;
        }
    }

    @Override // defpackage.zxd
    public final void e(int i, View view) {
        switch (this.a) {
            case 0:
                view.setTranslationY(i);
                break;
            case 1:
                view.setTranslationX(-i);
                break;
            default:
                view.setTranslationX(i);
                break;
        }
    }
}
