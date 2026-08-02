package defpackage;

import android.net.Uri;
import com.yandex.go.vault.data.ActionButtonTypeResponse;
import com.yandex.go.vault.domain.prize.ActionButtonType;
import java.util.concurrent.CancellationException;

/* loaded from: classes12.dex */
public abstract class x991 {
    public static final z3k a = new z3k(17);

    public static final String a(String str) {
        try {
            return sd90.l(Uri.parse(str), "paymentServiceId");
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final ActionButtonType b(ActionButtonTypeResponse actionButtonTypeResponse) {
        int i = y231.a[actionButtonTypeResponse.ordinal()];
        if (i == 1) {
            return ActionButtonType.CLIPBOARD_COPY;
        }
        if (i == 2) {
            return ActionButtonType.DEEPLINK;
        }
        if (i == 3) {
            return ActionButtonType.CLOSE;
        }
        w511.b();
        return null;
    }

    public static final qv0 c(kei keiVar) {
        s9e s9eVar = keiVar.c;
        if (s9eVar == null) {
            s9eVar = new s9e(0);
        }
        return new qv0(keiVar.b, (String) null, (String) null, (String) null, (String) null, (String) null, s9eVar, keiVar.d, 318);
    }
}
