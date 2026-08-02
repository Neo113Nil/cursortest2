package androidx.credentials.exceptions;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/exceptions/GetCredentialCustomException;", "Landroidx/credentials/exceptions/GetCredentialException;", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetCredentialCustomException extends GetCredentialException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCredentialCustomException(CharSequence charSequence, String str) {
        super(charSequence, str);
        str.getClass();
        if (str.length() > 0) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("type must not be empty");
        throw null;
    }
}
