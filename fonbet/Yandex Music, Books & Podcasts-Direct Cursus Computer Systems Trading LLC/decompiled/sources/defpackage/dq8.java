package defpackage;

/* loaded from: classes5.dex */
public enum dq8 {
    SELECT("select"),
    CVV("cvv"),
    BANK_SELECT("SelectBankScreen"),
    EXIT("ExitScreen"),
    SBP_LICENSE("SbpLicence"),
    /* JADX INFO: Fake field, exist only in values array */
    BANK_SEARCH_FIELD("BankSearchField"),
    SBP_CHALLENGER("SbpChallengerScreen"),
    BIND_CARD("BindCard"),
    /* JADX INFO: Fake field, exist only in values array */
    METHOD_SELECT("SelectMethodScreen"),
    RESULT("ResultScreen"),
    /* JADX INFO: Fake field, exist only in values array */
    I_PAYMENT_SCREEN("IPaymentScreen");

    public final String a;

    dq8(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
