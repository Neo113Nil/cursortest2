package defpackage;

import com.yandex.payment.sdk.feature.flags.FeatureFlag;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/* loaded from: classes2.dex */
public final class wh4 implements p8w {
    public wh4() {
        fey feyVar = fey.a;
    }

    public static kvj0 a(zci0 zci0Var, IOException iOException) {
        if (!apa1.e(FeatureFlag.RETRY_BACKGROUND_POLLING)) {
            throw iOException;
        }
        fey feyVar = fey.a;
        if (fey.b) {
            throw iOException;
        }
        Thread.sleep(500L);
        return b(zci0Var);
    }

    public static kvj0 b(zci0 zci0Var) {
        try {
            return zci0Var.b(zci0Var.e);
        } catch (ConnectException e) {
            return a(zci0Var, e);
        } catch (SocketTimeoutException e2) {
            return a(zci0Var, e2);
        } catch (UnknownHostException e3) {
            return a(zci0Var, e3);
        }
    }

    @Override // defpackage.p8w
    public final kvj0 intercept(m8w m8wVar) {
        return b((zci0) m8wVar);
    }
}
