package defpackage;

import android.net.Uri;
import com.yandex.xplat.common.PollingStep;
import com.yandex.xplat.common.YSError;
import com.yandex.xplat.payment.sdk.CardVerificationError;
import com.yandex.xplat.payment.sdk.ExternalErrorKind;
import com.yandex.xplat.payment.sdk.ExternalErrorTrigger;
import java.net.URI;

/* loaded from: classes11.dex */
public final class yeb {
    public final hh5 a;
    public final rwo b;
    public boolean c;
    public boolean d;

    public /* synthetic */ yeb(hh5 hh5Var, rwo rwoVar) {
        this.a = hh5Var;
        this.b = rwoVar;
    }

    public tyj0 a(cib cibVar) {
        anh anhVar;
        try {
            String str = cibVar.c;
            if (str != null && !this.c) {
                this.c = true;
                try {
                    anhVar = new anh(Uri.parse(new URI(str).toString()));
                } catch (Throwable unused) {
                    anhVar = null;
                }
                if (anhVar == null) {
                    return coa1.h(ggb1.a(cibVar));
                }
                rwo rwoVar = this.b;
                qv90.a.getClass();
                ((y22) rwoVar).a(sv90.k());
                this.a.s(anhVar);
            }
            return coa1.i(PollingStep.retry);
        } catch (RuntimeException e) {
            String message = e instanceof YSError ? ((YSError) e).getMessage() : String.valueOf(e);
            ExternalErrorKind externalErrorKind = ExternalErrorKind.fail_3ds;
            ExternalErrorTrigger externalErrorTrigger = ExternalErrorTrigger.internal_sdk;
            String str2 = cibVar.a;
            return coa1.h(new CardVerificationError(externalErrorKind, externalErrorTrigger, null, str2, unr0.p("Failed to handle 3ds challenge for response: ", oyr.t(b64.v("<VerificationResponse: status - ", str2, ", status code - ", cibVar.b, ", rc - "), cibVar.e, ">"), ", error: \"", message, "\"")));
        }
    }
}
