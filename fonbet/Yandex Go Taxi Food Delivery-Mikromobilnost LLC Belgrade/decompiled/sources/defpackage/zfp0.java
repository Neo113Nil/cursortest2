package defpackage;

import androidx.fragment.app.Fragment;
import kotlin.Pair;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.verification.esia.entities.exceptions.VerificationAttemptsExceededEbsException;
import ru.rt.ebs.cryptosdk.presentation.error.attemptsExceeded.VerificationAttemptsExceededFragment;

/* loaded from: classes4.dex */
public final class zfp0 extends mds {
    public final VerificationAttemptsExceededEbsException a;

    public zfp0(VerificationAttemptsExceededEbsException verificationAttemptsExceededEbsException) {
        this.a = verificationAttemptsExceededEbsException;
    }

    @Override // defpackage.mds
    public final Fragment a() {
        VerificationAttemptsExceededFragment.Companion.getClass();
        VerificationAttemptsExceededFragment verificationAttemptsExceededFragment = new VerificationAttemptsExceededFragment();
        verificationAttemptsExceededFragment.setArguments(wwg.g(new Pair("ARG_VERIFICATION_ATTEMPTS_EXCEEDED_ERROR", this.a)));
        return verificationAttemptsExceededFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zfp0) && jl40.l(this.a, ((zfp0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VerificationAttemptsExceededScreen(error=" + this.a + Extension.C_BRAKE;
    }
}
