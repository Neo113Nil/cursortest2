package androidx.credentials.exceptions.publickeycredential;

import androidx.credentials.exceptions.domerrors.DomError;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialDomException;", "Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialException;", "com/squareup/cash/sheet/RealSheetStateKt", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetPublicKeyCredentialDomException extends GetPublicKeyCredentialException {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final DomError domError;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GetPublicKeyCredentialDomException(DomError domError, String str) {
        super(str, r0);
        String concat = "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/".concat(domError.getType());
        if (concat.length() > 0) {
            this.domError = domError;
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("type must not be empty");
            throw null;
        }
    }
}
