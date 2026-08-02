package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class cta extends y2x {
    public final /* synthetic */ int j;

    public /* synthetic */ cta(int i) {
        this.j = i;
    }

    @Override // defpackage.y2x
    public final float A(Object obj) {
        switch (this.j) {
            case 0:
                return ((View) obj).getAlpha();
            case 1:
                return ((View) obj).getScaleX();
            case 2:
                return ((View) obj).getScaleY();
            case 3:
                return ((View) obj).getRotation();
            case 4:
                return ((View) obj).getRotationX();
            default:
                return ((View) obj).getRotationY();
        }
    }

    @Override // defpackage.y2x
    public final void Y(Object obj, float f) {
        switch (this.j) {
            case 0:
                ((View) obj).setAlpha(f);
                break;
            case 1:
                ((View) obj).setScaleX(f);
                break;
            case 2:
                ((View) obj).setScaleY(f);
                break;
            case 3:
                ((View) obj).setRotation(f);
                break;
            case 4:
                ((View) obj).setRotationX(f);
                break;
            default:
                ((View) obj).setRotationY(f);
                break;
        }
    }
}
