package defpackage;

import ru.yandex.taxi.payments.cards.dto.VerificationStatus;

/* loaded from: classes13.dex */
public final class tu5 {
    public final ru5 a;
    public final p731 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final tx90 f;

    public tu5(ru5 ru5Var, p731 p731Var) {
        this.a = ru5Var;
        this.b = p731Var;
        VerificationStatus verificationStatus = p731Var.b.c;
        this.c = verificationStatus == VerificationStatus.CVN_EXPECTED;
        this.d = verificationStatus == VerificationStatus.REQUIRED_3DS;
        this.e = verificationStatus == VerificationStatus.AMOUNT_EXPECTED;
        this.f = ru5Var.c;
    }
}
