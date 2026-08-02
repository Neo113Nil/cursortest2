package com.squareup.card.entry.validators;

import com.squareup.Card$Brand;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class CardNumberValidator implements InputValidator {
    public Card$Brand brand = Card$Brand.UNKNOWN;

    @Override // com.squareup.card.entry.validators.InputValidator
    public final boolean isComplete(String str) {
        str.getClass();
        Card$Brand card$Brand = this.brand;
        Pattern pattern = UtilsKt.spacePattern;
        pattern.getClass();
        String replaceAll = pattern.matcher(str).replaceAll("");
        replaceAll.getClass();
        return card$Brand.isValidNumberLength(replaceAll.length());
    }

    @Override // com.squareup.card.entry.validators.InputValidator
    public final boolean isValid(String str) {
        str.getClass();
        Card$Brand card$Brand = this.brand;
        Pattern pattern = UtilsKt.spacePattern;
        pattern.getClass();
        String replaceAll = pattern.matcher(str).replaceAll("");
        replaceAll.getClass();
        return card$Brand.validateLuhnIfRequired(replaceAll) || this.brand == Card$Brand.UNKNOWN;
    }
}
