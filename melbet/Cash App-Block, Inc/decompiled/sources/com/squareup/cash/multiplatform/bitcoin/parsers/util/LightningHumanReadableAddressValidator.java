package com.squareup.cash.multiplatform.bitcoin.parsers.util;

import kotlin.text.Regex;

/* loaded from: classes6.dex */
public abstract class LightningHumanReadableAddressValidator {
    public static final Regex LUD16Address = new Regex("[a-z0-9._-]{1,256}@[a-zA-Z0-9][a-zA-Z0-9-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9-]{0,25})+");

    public static boolean isAddressValid(String str) {
        str.getClass();
        return LUD16Address.matches(str);
    }
}
