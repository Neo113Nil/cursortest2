package defpackage;

import com.yandex.payment.sdk.ui.view.card.CvnInputViewImpl;

/* loaded from: classes2.dex */
public final class sia0 implements xia0 {
    public final /* synthetic */ CvnInputViewImpl a;

    public sia0(CvnInputViewImpl cvnInputViewImpl) {
        this.a = cvnInputViewImpl;
    }

    @Override // defpackage.xia0
    public final void a(String str) {
        this.a.setCardPaymentSystem(wme.d(tfb1.g(str)));
    }

    @Override // defpackage.xia0
    public final void focusInput() {
        this.a.focusInput();
    }

    @Override // defpackage.xia0
    public final boolean isReady() {
        return this.a.getReadyToProvide();
    }

    @Override // defpackage.xia0
    public final void reset() {
        this.a.reset();
    }

    @Override // defpackage.xia0
    public final void setOnReadyListener(tls tlsVar) {
        this.a.setOnReadyListener(tlsVar);
    }
}
