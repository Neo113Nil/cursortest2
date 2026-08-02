package defpackage;

import com.yandex.go.payments.data.model.response.ErrorDialogs;
import com.yandex.go.payments.sbp.data.f;
import com.yandex.go.payments.sbp.domain.ErrorType;

/* loaded from: classes13.dex */
public final class tim0 {
    public final f a;

    public tim0(f fVar) {
        this.a = fVar;
    }

    public final eao a(ErrorType errorType) {
        ErrorDialogs.ErrorDialog errorDialog;
        ErrorDialogs errorDialogs = this.a.b.f;
        int i = sim0.a[errorType.ordinal()];
        if (i == 1) {
            errorDialog = errorDialogs.a;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            errorDialog = errorDialogs.b;
            if (errorDialog == null) {
                errorDialog = errorDialogs.a;
            }
        }
        return new eao(errorDialog.a, errorDialog.b, errorDialog.c, errorDialog.d);
    }
}
