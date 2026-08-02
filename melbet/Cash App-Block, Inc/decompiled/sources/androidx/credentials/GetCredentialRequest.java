package androidx.credentials;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes3.dex */
public final class GetCredentialRequest {
    public final List credentialOptions;
    public final boolean preferImmediatelyAvailableCredentials;

    public GetCredentialRequest(int i, List list, boolean z) {
        int i2 = 0;
        z = (i & 16) != 0 ? false : z;
        list.getClass();
        this.credentialOptions = list;
        this.preferImmediatelyAvailableCredentials = z;
        if (list.isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m$3("credentialOptions should not be empty");
            throw null;
        }
        if (list.size() > 1) {
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if ((((CredentialOption) it.next()) instanceof GetDigitalCredentialOption) && (i2 = i2 + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                        throw null;
                    }
                }
            }
            if (i2 > 0 && i2 != this.credentialOptions.size()) {
                a$$ExternalSyntheticBUOutline0.m$3("Digital Credential Option cannot be used with other credential option.");
                throw null;
            }
            for (CredentialOption credentialOption : this.credentialOptions) {
            }
        }
    }
}
