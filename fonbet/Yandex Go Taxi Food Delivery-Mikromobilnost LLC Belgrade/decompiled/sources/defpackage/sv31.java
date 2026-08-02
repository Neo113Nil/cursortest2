package defpackage;

import android.view.View;

/* loaded from: classes10.dex */
public final class sv31 extends uv31 {
    public final /* synthetic */ int k;

    @Override // defpackage.uv31
    public final boolean e(float f, long j, thx thxVar, View view) {
        switch (this.k) {
            case 0:
                view.setAlpha(d(f, j, thxVar, view));
                break;
            case 1:
                view.setElevation(d(f, j, thxVar, view));
                break;
            case 2:
                view.setRotation(d(f, j, thxVar, view));
                break;
            case 3:
                view.setRotationX(d(f, j, thxVar, view));
                break;
            case 4:
                view.setRotationY(d(f, j, thxVar, view));
                break;
            case 5:
                view.setScaleX(d(f, j, thxVar, view));
                break;
            case 6:
                view.setScaleY(d(f, j, thxVar, view));
                break;
            case 7:
                view.setTranslationX(d(f, j, thxVar, view));
                break;
            case 8:
                view.setTranslationY(d(f, j, thxVar, view));
                break;
            default:
                view.setTranslationZ(d(f, j, thxVar, view));
                break;
        }
        return this.h;
    }
}
