package defpackage;

import com.yandex.payment.sdk.core.data.CardPaymentSystem;

/* loaded from: classes2.dex */
public interface qwl {
    void focusInput();

    void provideCvn();

    void provideCvnForChallenge();

    void setCardPaymentSystem(CardPaymentSystem cardPaymentSystem);

    void setCvnProvider(pwl pwlVar);

    void setOnReadyListener(tls tlsVar);

    void setPaymentApi(vv90 vv90Var);

    void showError();

    void showLoading(boolean z);

    void showSuccess();
}
