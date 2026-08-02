package androidx.credentials;

import android.os.Bundle;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public class CustomCredential extends Credential {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomCredential(Bundle bundle, String str) {
        super(bundle, str);
        str.getClass();
        bundle.getClass();
        if (str.length() > 0) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("type should not be empty");
        throw null;
    }
}
