package defpackage;

/* loaded from: classes4.dex */
public enum oq9 {
    SELECT("VerticalGalleryForSelectFragment"),
    CVV("CvvConfirmFragment"),
    BANK_SELECT("SelectBankScreen"),
    EXIT("ExitScreen"),
    RESULT("ResultScreen"),
    SBP_LICENSE("SbpLegalAgreementView"),
    SBP_CHALLENGER("ChallengerScreen"),
    CARD_INPUT_SCREEN("CardInputScreen");

    public final String a;

    oq9(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
