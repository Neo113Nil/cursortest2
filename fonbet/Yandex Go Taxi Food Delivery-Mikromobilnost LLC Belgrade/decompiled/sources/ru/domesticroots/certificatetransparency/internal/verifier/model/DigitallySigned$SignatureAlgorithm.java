package ru.domesticroots.certificatetransparency.internal.verifier.model;

import defpackage.k4o;
import defpackage.rjj;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"ru/domesticroots/certificatetransparency/internal/verifier/model/DigitallySigned$SignatureAlgorithm", "", "Lru/domesticroots/certificatetransparency/internal/verifier/model/DigitallySigned$SignatureAlgorithm;", "", "number", CA20Status.STATUS_USER_I, "a", "()I", "Companion", "rjj", "ANONYMOUS", "RSA", "DSA", JCP.ECDSA_NAME, "domesticroots-certificatetransparency_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DigitallySigned$SignatureAlgorithm {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DigitallySigned$SignatureAlgorithm[] $VALUES;
    public static final DigitallySigned$SignatureAlgorithm ANONYMOUS;
    public static final rjj Companion;
    public static final DigitallySigned$SignatureAlgorithm DSA;
    public static final DigitallySigned$SignatureAlgorithm ECDSA;
    public static final DigitallySigned$SignatureAlgorithm RSA;
    private final int number;

    static {
        DigitallySigned$SignatureAlgorithm digitallySigned$SignatureAlgorithm = new DigitallySigned$SignatureAlgorithm("ANONYMOUS", 0, 0);
        ANONYMOUS = digitallySigned$SignatureAlgorithm;
        DigitallySigned$SignatureAlgorithm digitallySigned$SignatureAlgorithm2 = new DigitallySigned$SignatureAlgorithm("RSA", 1, 1);
        RSA = digitallySigned$SignatureAlgorithm2;
        DigitallySigned$SignatureAlgorithm digitallySigned$SignatureAlgorithm3 = new DigitallySigned$SignatureAlgorithm("DSA", 2, 2);
        DSA = digitallySigned$SignatureAlgorithm3;
        DigitallySigned$SignatureAlgorithm digitallySigned$SignatureAlgorithm4 = new DigitallySigned$SignatureAlgorithm(JCP.ECDSA_NAME, 3, 3);
        ECDSA = digitallySigned$SignatureAlgorithm4;
        DigitallySigned$SignatureAlgorithm[] digitallySigned$SignatureAlgorithmArr = {digitallySigned$SignatureAlgorithm, digitallySigned$SignatureAlgorithm2, digitallySigned$SignatureAlgorithm3, digitallySigned$SignatureAlgorithm4};
        $VALUES = digitallySigned$SignatureAlgorithmArr;
        $ENTRIES = a.a(digitallySigned$SignatureAlgorithmArr);
        Companion = new rjj();
    }

    public DigitallySigned$SignatureAlgorithm(String str, int i, int i2) {
        this.number = i2;
    }

    public static DigitallySigned$SignatureAlgorithm valueOf(String str) {
        return (DigitallySigned$SignatureAlgorithm) Enum.valueOf(DigitallySigned$SignatureAlgorithm.class, str);
    }

    public static DigitallySigned$SignatureAlgorithm[] values() {
        return (DigitallySigned$SignatureAlgorithm[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getNumber() {
        return this.number;
    }
}
