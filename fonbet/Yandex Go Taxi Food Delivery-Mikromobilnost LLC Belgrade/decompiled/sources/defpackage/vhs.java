package defpackage;

import ru.yandex.taxi.banners.presentation.fullscreen.FullScreenBannerModalView;

/* loaded from: classes5.dex */
public final /* synthetic */ class vhs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FullScreenBannerModalView b;

    public /* synthetic */ vhs(FullScreenBannerModalView fullScreenBannerModalView, int i) {
        this.a = i;
        this.b = fullScreenBannerModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        FullScreenBannerModalView fullScreenBannerModalView = this.b;
        switch (i) {
            case 0:
                FullScreenBannerModalView.onModalViewAppear$lambda$0(fullScreenBannerModalView);
                break;
            default:
                FullScreenBannerModalView.cancelDismiss$lambda$0(fullScreenBannerModalView);
                break;
        }
    }
}
