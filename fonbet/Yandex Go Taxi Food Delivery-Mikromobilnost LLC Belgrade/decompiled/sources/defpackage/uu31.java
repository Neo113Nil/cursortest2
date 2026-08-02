package defpackage;

import android.view.View;

/* loaded from: classes10.dex */
public final class uu31 extends wu31 {
    public final /* synthetic */ int f;

    @Override // defpackage.wu31
    public final void d(float f, View view) {
        switch (this.f) {
            case 0:
                view.setAlpha(a(f));
                break;
            case 1:
                view.setElevation(a(f));
                break;
            case 2:
                view.setPivotX(a(f));
                break;
            case 3:
                view.setPivotY(a(f));
                break;
            case 4:
                view.setRotation(a(f));
                break;
            case 5:
                view.setRotationX(a(f));
                break;
            case 6:
                view.setRotationY(a(f));
                break;
            case 7:
                view.setScaleX(a(f));
                break;
            case 8:
                view.setScaleY(a(f));
                break;
            case 9:
                view.setTranslationX(a(f));
                break;
            case 10:
                view.setTranslationY(a(f));
                break;
            default:
                view.setTranslationZ(a(f));
                break;
        }
    }
}
