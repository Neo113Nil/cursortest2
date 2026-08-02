package defpackage;

import com.yandex.go.taxi.order.view.tips.TipsInputModalView;

/* loaded from: classes14.dex */
public final /* synthetic */ class wfz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TipsInputModalView b;

    public /* synthetic */ wfz0(TipsInputModalView tipsInputModalView, int i) {
        this.a = i;
        this.b = tipsInputModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        TipsInputModalView tipsInputModalView = this.b;
        switch (i) {
            case 0:
                tipsInputModalView.confirmClicked();
                break;
            default:
                TipsInputModalView.setupInputField$lambda$1(tipsInputModalView);
                break;
        }
    }
}
