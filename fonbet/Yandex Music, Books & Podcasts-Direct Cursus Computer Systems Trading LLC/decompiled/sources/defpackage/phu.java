package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class phu extends thu {
    public final /* synthetic */ int k;

    public /* synthetic */ phu(int i) {
        this.k = i;
    }

    @Override // defpackage.thu
    public final boolean d(float f, long j, n7b n7bVar, View view) {
        switch (this.k) {
            case 0:
                view.setAlpha(b(f, j, n7bVar, view));
                break;
            case 1:
                view.setElevation(b(f, j, n7bVar, view));
                break;
            case 2:
                view.setRotation(b(f, j, n7bVar, view));
                break;
            case 3:
                view.setRotationX(b(f, j, n7bVar, view));
                break;
            case 4:
                view.setRotationY(b(f, j, n7bVar, view));
                break;
            case 5:
                view.setScaleX(b(f, j, n7bVar, view));
                break;
            case 6:
                view.setScaleY(b(f, j, n7bVar, view));
                break;
            case 7:
                view.setTranslationX(b(f, j, n7bVar, view));
                break;
            case 8:
                view.setTranslationY(b(f, j, n7bVar, view));
                break;
            default:
                view.setTranslationZ(b(f, j, n7bVar, view));
                break;
        }
        return this.h;
    }
}
