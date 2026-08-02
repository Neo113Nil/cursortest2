package defpackage;

import com.yandex.go.preload.PreloadFragment;

/* loaded from: classes13.dex */
public final /* synthetic */ class soe0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PreloadFragment b;

    public /* synthetic */ soe0(PreloadFragment preloadFragment, int i) {
        this.a = i;
        this.b = preloadFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        PreloadFragment preloadFragment = this.b;
        switch (i) {
            case 0:
                PreloadFragment.animateButtonOnCancellation$lambda$0(preloadFragment);
                break;
            case 1:
                PreloadFragment.animateTextOnCancellation$lambda$0$0$0(preloadFragment);
                break;
            case 2:
                PreloadFragment.animateTextOnCancellation$lambda$0$0(preloadFragment);
                break;
            default:
                PreloadFragment.setupCancelButton$lambda$0$0(preloadFragment);
                break;
        }
    }
}
