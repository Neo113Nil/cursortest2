package defpackage;

import com.ybsdk.core.design.widget.ModalView;

/* loaded from: classes2.dex */
public final /* synthetic */ class yz20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ModalView b;

    public /* synthetic */ yz20(ModalView modalView, int i) {
        this.a = i;
        this.b = modalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ModalView modalView = this.b;
        switch (i) {
            case 0:
                modalView.lambda$new$0();
                break;
            case 1:
                modalView.onAppearAnimationComplete();
                break;
            case 2:
                modalView.lambda$applyTopOffset$2();
                break;
            default:
                modalView.onModalViewDisappear();
                break;
        }
    }
}
