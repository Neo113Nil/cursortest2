package skeletor.parser.exception;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.j73;
import defpackage.qoi0;
import defpackage.rms0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lskeletor/parser/exception/TokenFinalizationException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lrms0;", AuthSdkActivity.RESPONSE_TYPE_TOKEN, "Lrms0;", "parser"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class TokenFinalizationException extends RuntimeException {
    private final rms0 token;

    public TokenFinalizationException(rms0 rms0Var) {
        this.token = rms0Var;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to finalize token " + qoi0.a(this.token.getClass()).d() + '\n');
        StringBuilder sb2 = new StringBuilder("Args were: ");
        String[] strArr = this.token.a;
        StringBuilder sb3 = new StringBuilder("[");
        int length = strArr.length - 1;
        for (int i = 0; i < length; i++) {
            sb3.append(strArr[i]);
            sb3.append(Extension.FIX_SPACE);
        }
        sb3.append((String) j73.O(strArr));
        sb3.append(']');
        sb2.append(sb3.toString());
        sb.append(sb2.toString());
        return sb.toString();
    }
}
