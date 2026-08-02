package defpackage;

import com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility;

/* loaded from: classes11.dex */
public final class ysb implements zsb {
    public static final TinkFipsUtil$AlgorithmFipsCompatibility a = TinkFipsUtil$AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    public ysb() {
        if (a.a()) {
            return;
        }
        kbs.v("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        throw null;
    }
}
