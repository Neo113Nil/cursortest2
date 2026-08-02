package ru.domesticroots.certificatetransparency.internal.verifier.model;

import defpackage.k4o;
import defpackage.qjj;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"ru/domesticroots/certificatetransparency/internal/verifier/model/DigitallySigned$HashAlgorithm", "", "Lru/domesticroots/certificatetransparency/internal/verifier/model/DigitallySigned$HashAlgorithm;", "", "number", CA20Status.STATUS_USER_I, "a", "()I", "Companion", "qjj", JCP.RAW_PREFIX, "MD5", JCP.DIGEST_SHA1, JCP.DIGEST_SHA224, JCP.DIGEST_SHA256, JCP.DIGEST_SHA384, JCP.DIGEST_SHA512, "domesticroots-certificatetransparency_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DigitallySigned$HashAlgorithm {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DigitallySigned$HashAlgorithm[] $VALUES;
    public static final qjj Companion;
    public static final DigitallySigned$HashAlgorithm MD5;
    public static final DigitallySigned$HashAlgorithm NONE;
    public static final DigitallySigned$HashAlgorithm SHA1;
    public static final DigitallySigned$HashAlgorithm SHA224;
    public static final DigitallySigned$HashAlgorithm SHA256;
    public static final DigitallySigned$HashAlgorithm SHA384;
    public static final DigitallySigned$HashAlgorithm SHA512;
    private final int number;

    static {
        DigitallySigned$HashAlgorithm digitallySigned$HashAlgorithm = new DigitallySigned$HashAlgorithm(JCP.RAW_PREFIX, 0, 0);
        NONE = digitallySigned$HashAlgorithm;
        DigitallySigned$HashAlgorithm digitallySigned$HashAlgorithm2 = new DigitallySigned$HashAlgorithm("MD5", 1, 1);
        MD5 = digitallySigned$HashAlgorithm2;
        DigitallySigned$HashAlgorithm digitallySigned$HashAlgorithm3 = new DigitallySigned$HashAlgorithm(JCP.DIGEST_SHA1, 2, 2);
        SHA1 = digitallySigned$HashAlgorithm3;
        DigitallySigned$HashAlgorithm digitallySigned$HashAlgorithm4 = new DigitallySigned$HashAlgorithm(JCP.DIGEST_SHA224, 3, 3);
        SHA224 = digitallySigned$HashAlgorithm4;
        DigitallySigned$HashAlgorithm digitallySigned$HashAlgorithm5 = new DigitallySigned$HashAlgorithm(JCP.DIGEST_SHA256, 4, 4);
        SHA256 = digitallySigned$HashAlgorithm5;
        DigitallySigned$HashAlgorithm digitallySigned$HashAlgorithm6 = new DigitallySigned$HashAlgorithm(JCP.DIGEST_SHA384, 5, 5);
        SHA384 = digitallySigned$HashAlgorithm6;
        DigitallySigned$HashAlgorithm digitallySigned$HashAlgorithm7 = new DigitallySigned$HashAlgorithm(JCP.DIGEST_SHA512, 6, 6);
        SHA512 = digitallySigned$HashAlgorithm7;
        DigitallySigned$HashAlgorithm[] digitallySigned$HashAlgorithmArr = {digitallySigned$HashAlgorithm, digitallySigned$HashAlgorithm2, digitallySigned$HashAlgorithm3, digitallySigned$HashAlgorithm4, digitallySigned$HashAlgorithm5, digitallySigned$HashAlgorithm6, digitallySigned$HashAlgorithm7};
        $VALUES = digitallySigned$HashAlgorithmArr;
        $ENTRIES = a.a(digitallySigned$HashAlgorithmArr);
        Companion = new qjj();
    }

    public DigitallySigned$HashAlgorithm(String str, int i, int i2) {
        this.number = i2;
    }

    public static DigitallySigned$HashAlgorithm valueOf(String str) {
        return (DigitallySigned$HashAlgorithm) Enum.valueOf(DigitallySigned$HashAlgorithm.class, str);
    }

    public static DigitallySigned$HashAlgorithm[] values() {
        return (DigitallySigned$HashAlgorithm[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getNumber() {
        return this.number;
    }
}
