package com.google.i18n.phonenumbers;

import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;

/* loaded from: classes.dex */
public final class NumberParseException extends Exception {
    public final int errorType;
    public final String message;

    public NumberParseException(int i, String str) {
        super(str);
        this.message = str;
        this.errorType = i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "Error type: " + zzel$EnumUnboxingLocalUtility.stringValueOf$9(this.errorType) + ". " + this.message;
    }
}
