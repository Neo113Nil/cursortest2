package defpackage;

import ru.yandex.taxi.search.address.view.FullscreenDestinationSearchView;

/* loaded from: classes6.dex */
public final /* synthetic */ class sjs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FullscreenDestinationSearchView b;

    public /* synthetic */ sjs(FullscreenDestinationSearchView fullscreenDestinationSearchView, int i) {
        this.a = i;
        this.b = fullscreenDestinationSearchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        FullscreenDestinationSearchView fullscreenDestinationSearchView = this.b;
        switch (i) {
            case 0:
                FullscreenDestinationSearchView.updateNextButtonState$lambda$0$0(fullscreenDestinationSearchView);
                break;
            default:
                FullscreenDestinationSearchView.onAttachedToWindow$lambda$0$0(fullscreenDestinationSearchView);
                break;
        }
    }
}
