package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class je extends le0 {
    public final /* synthetic */ int OnDfzHZD;

    public /* synthetic */ je(int i) {
        this.OnDfzHZD = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.le0
    public final float RXQxj5Oe(Drawable drawable) {
        switch (this.OnDfzHZD) {
            case 0:
                return ((View) drawable).getAlpha();
            case 1:
                return ((View) drawable).getScaleX();
            case 2:
                return ((View) drawable).getScaleY();
            case 3:
                return ((View) drawable).getRotation();
            case 4:
                return ((View) drawable).getRotationX();
            default:
                return ((View) drawable).getRotationY();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.le0
    public final void hzgxAD8d(Drawable drawable, float f) {
        switch (this.OnDfzHZD) {
            case 0:
                ((View) drawable).setAlpha(f);
                break;
            case 1:
                ((View) drawable).setScaleX(f);
                break;
            case 2:
                ((View) drawable).setScaleY(f);
                break;
            case 3:
                ((View) drawable).setRotation(f);
                break;
            case 4:
                ((View) drawable).setRotationX(f);
                break;
            default:
                ((View) drawable).setRotationY(f);
                break;
        }
    }
}
