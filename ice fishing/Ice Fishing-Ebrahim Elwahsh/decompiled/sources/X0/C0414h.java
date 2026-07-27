package X0;

import com.airbnb.lottie.LottieAnimationView;
import java.lang.ref.WeakReference;

/* renamed from: X0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0414h implements y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3667a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f3668b;

    public C0414h(LottieAnimationView lottieAnimationView, int i) {
        this.f3667a = i;
        switch (i) {
            case 1:
                this.f3668b = new WeakReference(lottieAnimationView);
                break;
            default:
                this.f3668b = new WeakReference(lottieAnimationView);
                break;
        }
    }

    @Override // X0.y
    public final void onResult(Object obj) {
        switch (this.f3667a) {
            case 0:
                Throwable th = (Throwable) obj;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f3668b.get();
                if (lottieAnimationView != null) {
                    int i = lottieAnimationView.f5824z;
                    if (i != 0) {
                        lottieAnimationView.setImageResource(i);
                    }
                    y yVar = lottieAnimationView.f5823y;
                    if (yVar == null) {
                        yVar = LottieAnimationView.J;
                    }
                    yVar.onResult(th);
                    break;
                }
                break;
            default:
                i iVar = (i) obj;
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.f3668b.get();
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setComposition(iVar);
                    break;
                }
                break;
        }
    }
}
