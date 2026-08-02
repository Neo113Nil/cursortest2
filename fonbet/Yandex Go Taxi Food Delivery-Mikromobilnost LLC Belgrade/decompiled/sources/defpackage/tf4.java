package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.messaging.internal.net.Error;
import com.yandex.payment.sdk.core.data.PaymentKitError;

/* loaded from: classes15.dex */
public final class tf4 implements uzd, d9b, ryj0, kab, jcy0, k69 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y6f0 b;

    public /* synthetic */ tf4(y6f0 y6f0Var, int i) {
        this.a = i;
        this.b = y6f0Var;
    }

    @Override // defpackage.d9b
    public void a(Error error) {
    }

    @Override // defpackage.uzd
    public void b(BackendConfig backendConfig) {
        ((x6f0) this.b).d(backendConfig);
    }

    @Override // defpackage.d9b
    public void c(s020 s020Var) {
        ((x6f0) this.b).d(s020Var);
    }

    @Override // defpackage.uzd
    public void d(BackendConfig backendConfig) {
        ((x6f0) this.b).d(backendConfig);
    }

    @Override // defpackage.ryj0
    public void i(Object obj) {
        ((x6f0) this.b).d(new hyj0((PaymentKitError) obj));
    }

    @Override // defpackage.ryj0
    public void onSuccess(Object obj) {
        ((x6f0) this.b).d(new kyj0((uv90) obj));
    }

    @Override // defpackage.jcy0
    public void u(String str) {
        ((x6f0) this.b).d(str);
    }

    @Override // defpackage.kab
    public void v(r3z r3zVar) {
        int i = this.a;
        y6f0 y6f0Var = this.b;
        switch (i) {
            case 3:
                sub1.e(y6f0Var, r3zVar);
                break;
            case 4:
                ((x6f0) y6f0Var).d(r3zVar);
                break;
            default:
                ((x6f0) y6f0Var).d(r3zVar);
                break;
        }
    }
}
