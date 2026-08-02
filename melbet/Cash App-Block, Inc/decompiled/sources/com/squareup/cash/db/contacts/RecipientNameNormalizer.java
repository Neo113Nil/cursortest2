package com.squareup.cash.db.contacts;

import kotlin.text.Regex;

/* loaded from: classes6.dex */
public abstract class RecipientNameNormalizer {
    public static final Regex DIACRITICS_STRIPPING_REGEX = new Regex("\\p{InCombiningDiacriticalMarks}+");
}
