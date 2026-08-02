package defpackage;

import ru.yandex.taxi.order.BottomCircleButtonsView;

/* loaded from: classes6.dex */
public final /* synthetic */ class yb6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomCircleButtonsView b;

    public /* synthetic */ yb6(BottomCircleButtonsView bottomCircleButtonsView, int i) {
        this.a = i;
        this.b = bottomCircleButtonsView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        BottomCircleButtonsView bottomCircleButtonsView = this.b;
        switch (i) {
            case 0:
                BottomCircleButtonsView.init$lambda$0(bottomCircleButtonsView);
                break;
            case 1:
                BottomCircleButtonsView.init$lambda$1(bottomCircleButtonsView);
                break;
            case 2:
                BottomCircleButtonsView.init$lambda$2(bottomCircleButtonsView);
                break;
            case 3:
                BottomCircleButtonsView.init$lambda$3(bottomCircleButtonsView);
                break;
            case 4:
                BottomCircleButtonsView.init$lambda$4(bottomCircleButtonsView);
                break;
            case 5:
                BottomCircleButtonsView.createCandidateButton$lambda$0(bottomCircleButtonsView);
                break;
            default:
                bottomCircleButtonsView.getUiDelegate().A4();
                break;
        }
    }
}
