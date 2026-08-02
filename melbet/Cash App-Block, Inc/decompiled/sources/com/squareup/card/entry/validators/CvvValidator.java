package com.squareup.card.entry.validators;

import com.squareup.Card$Brand;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class CvvValidator implements InputValidator {
    public Card$Brand brand = Card$Brand.UNKNOWN;

    @Override // com.squareup.card.entry.validators.InputValidator
    public final boolean isComplete(String str) {
        str.getClass();
        Card$Brand card$Brand = this.brand;
        Card$Brand card$Brand2 = Card$Brand.UNKNOWN;
        if (card$Brand == card$Brand2) {
            return true;
        }
        int length = str.length();
        Card$Brand card$Brand3 = this.brand;
        Pattern pattern = UtilsKt.nonDigitPattern;
        return length == (card$Brand3 == card$Brand2 ? 4 : card$Brand3.cvvLength());
    }

    @Override // com.squareup.card.entry.validators.InputValidator
    public final boolean isValid(String str) {
        str.getClass();
        return true;
    }
}
