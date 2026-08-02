package defpackage;

import ru.yandex.taxi.banners.presentation.fullscreen.FullScreenBannerModalView;
import ru.yandex.taxi.banners.presentation.fullscreen.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class uhs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ uhs(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                FullScreenBannerModalView.setupCloseButton$onCloseClick(aVar);
                break;
            default:
                FullScreenBannerModalView.setupMenuButton$onMenuClicked(aVar);
                break;
        }
    }
}
