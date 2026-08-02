package Z0;

import com.airbnb.lottie.LottieAnimationView;
import java.lang.ref.WeakReference;

/* renamed from: Z0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0425h implements y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3963a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f3964b;

    public C0425h(LottieAnimationView lottieAnimationView, int i) {
        this.f3963a = i;
        switch (i) {
            case 1:
                this.f3964b = new WeakReference(lottieAnimationView);
                break;
            default:
                this.f3964b = new WeakReference(lottieAnimationView);
                break;
        }
    }

    @Override // Z0.y
    public final void onResult(Object obj) {
        switch (this.f3963a) {
            case 0:
                Throwable th = (Throwable) obj;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f3964b.get();
                if (lottieAnimationView != null) {
                    int i = lottieAnimationView.f6453z;
                    if (i != 0) {
                        lottieAnimationView.setImageResource(i);
                    }
                    y yVar = lottieAnimationView.f6452y;
                    if (yVar == null) {
                        yVar = LottieAnimationView.J;
                    }
                    yVar.onResult(th);
                    break;
                }
                break;
            default:
                i iVar = (i) obj;
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.f3964b.get();
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setComposition(iVar);
                    break;
                }
                break;
        }
    }
}
