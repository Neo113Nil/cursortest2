package defpackage;

import com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility;

/* loaded from: classes11.dex */
public final class xsb implements zsb {
    public static final TinkFipsUtil$AlgorithmFipsCompatibility a = TinkFipsUtil$AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;

    public xsb() {
        if (a.a()) {
            return;
        }
        kbs.v("Can not use AES-CMAC in FIPS-mode.");
        throw null;
    }
}
