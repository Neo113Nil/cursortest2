package defpackage;

import ru.yandex.taxi.web.modal.WebContainerModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class qf41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebContainerModalView b;

    public /* synthetic */ qf41(WebContainerModalView webContainerModalView, int i) {
        this.a = i;
        this.b = webContainerModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        WebContainerModalView webContainerModalView = this.b;
        switch (i) {
            case 0:
                WebContainerModalView.applyFloatingButtonMode$lambda$0(webContainerModalView);
                break;
            default:
                WebContainerModalView._init_$lambda$0(webContainerModalView);
                break;
        }
    }
}
