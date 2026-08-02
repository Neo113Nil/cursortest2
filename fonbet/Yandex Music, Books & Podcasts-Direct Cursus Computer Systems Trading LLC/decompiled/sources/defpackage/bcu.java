package defpackage;

import com.airbnb.lottie.LottieAnimationView;
import com.yandex.passport.common.ui.view.d;

/* loaded from: classes.dex */
public final /* synthetic */ class bcu implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bcu(long j, LottieAnimationView lottieAnimationView, d dVar) {
        this.b = j;
        this.c = dVar;
        this.d = lottieAnimationView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        long j = this.b;
        switch (i) {
            case 0:
                ccu ccuVar = (ccu) ((dxr) obj2).b;
                int i2 = dvt.a;
                ccuVar.j(j, obj);
                break;
            default:
                d dVar = (d) obj2;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) obj;
                if (j > 0) {
                    dVar.setVisibility(0);
                }
                dVar.a();
                lottieAnimationView.cancelAnimation();
                break;
        }
    }

    public /* synthetic */ bcu(dxr dxrVar, Object obj, long j) {
        this.c = dxrVar;
        this.d = obj;
        this.b = j;
    }
}
