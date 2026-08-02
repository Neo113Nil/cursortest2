package defpackage;

import com.airbnb.lottie.LottieAnimationView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class yxg implements izg {
    public final /* synthetic */ int a;
    public final WeakReference b;

    public yxg(LottieAnimationView lottieAnimationView, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new WeakReference(lottieAnimationView);
                break;
            default:
                this.b = new WeakReference(lottieAnimationView);
                break;
        }
    }

    @Override // defpackage.izg
    public final void onResult(Object obj) {
        int i;
        izg izgVar;
        int i2;
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.b.get();
                if (lottieAnimationView != null) {
                    i = lottieAnimationView.fallbackResource;
                    if (i != 0) {
                        i2 = lottieAnimationView.fallbackResource;
                        lottieAnimationView.setImageResource(i2);
                    }
                    izgVar = lottieAnimationView.failureListener;
                    (izgVar == null ? LottieAnimationView.DEFAULT_FAILURE_LISTENER : lottieAnimationView.failureListener).onResult(th);
                    break;
                }
                break;
            default:
                ayg aygVar = (ayg) obj;
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.b.get();
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setComposition(aygVar);
                    break;
                }
                break;
        }
    }
}
