package defpackage;

import android.view.View;
import android.view.animation.Animation;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public final class sxc implements Animation.AnimationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sxc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((View) obj).setLayerType(0, null);
                break;
            default:
                View view = (View) ((WeakReference) obj).get();
                if (view != null) {
                    jyr jyrVar = sht.a;
                    view.setVisibility(4);
                    break;
                }
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
