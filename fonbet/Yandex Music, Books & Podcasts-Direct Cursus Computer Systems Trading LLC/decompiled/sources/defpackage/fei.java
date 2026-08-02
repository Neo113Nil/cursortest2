package defpackage;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class fei implements Interpolator {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ fei(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        switch (this.a) {
            case 0:
                return (float) ((jya) this.b).a(f);
            case 1:
                return (float) ((jya) this.b).a(f);
            case 2:
                return (float) ((jya) this.b).a(f);
            default:
                return ((Interpolator) this.b).getInterpolation(1.0f - f);
        }
    }
}
