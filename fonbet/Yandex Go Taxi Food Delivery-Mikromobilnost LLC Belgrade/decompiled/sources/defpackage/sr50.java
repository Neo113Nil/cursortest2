package defpackage;

import android.util.MalformedJsonException;
import java.io.IOException;
import java.net.URI;
import javax.net.ssl.SSLException;
import org.json.JSONException;

/* loaded from: classes8.dex */
public final class sr50 {
    public final bt90 a;

    public sr50(bt90 bt90Var) {
        this.a = bt90Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r14 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(URI uri, String str, String str2, String str3, Integer num, Throwable th) {
        PayEvgenDiagnostic$PlusPayEvgenResponseErrorType payEvgenDiagnostic$PlusPayEvgenResponseErrorType;
        if (num == null && th == null) {
            return;
        }
        if (num == null) {
            if (th != null) {
                payEvgenDiagnostic$PlusPayEvgenResponseErrorType = th instanceof SSLException ? PayEvgenDiagnostic$PlusPayEvgenResponseErrorType.Ssl : ((th instanceof JSONException) || (th instanceof MalformedJsonException)) ? PayEvgenDiagnostic$PlusPayEvgenResponseErrorType.Parse : th instanceof IOException ? PayEvgenDiagnostic$PlusPayEvgenResponseErrorType.Network : PayEvgenDiagnostic$PlusPayEvgenResponseErrorType.Unknown;
            }
            payEvgenDiagnostic$PlusPayEvgenResponseErrorType = PayEvgenDiagnostic$PlusPayEvgenResponseErrorType.Unknown;
        } else {
            payEvgenDiagnostic$PlusPayEvgenResponseErrorType = PayEvgenDiagnostic$PlusPayEvgenResponseErrorType.Http;
        }
        PayEvgenDiagnostic$PlusPayEvgenResponseErrorType payEvgenDiagnostic$PlusPayEvgenResponseErrorType2 = payEvgenDiagnostic$PlusPayEvgenResponseErrorType;
        String host = uri.getHost();
        String path = uri.getPath();
        String str4 = str == null ? "no_value" : str;
        String num2 = num != null ? num.toString() : null;
        this.a.a(host, path, str4, payEvgenDiagnostic$PlusPayEvgenResponseErrorType2, num2 == null ? "no_value" : num2, str3 == null ? "no_value" : str3, str2 == null ? "no_value" : str2);
    }
}
