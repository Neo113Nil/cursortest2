package defpackage;

import ru.yandex.taxi.widget.ModalView;

/* loaded from: classes10.dex */
public final /* synthetic */ class zz20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ModalView b;

    public /* synthetic */ zz20(ModalView modalView, int i) {
        this.a = i;
        this.b = modalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ModalView modalView = this.b;
        switch (i) {
            case 0:
                ModalView.onAnimateShowStartAction$lambda$0(modalView);
                break;
            case 1:
                modalView.onAppearAnimationComplete();
                break;
            default:
                modalView.onModalViewDisappear();
                break;
        }
    }
}
