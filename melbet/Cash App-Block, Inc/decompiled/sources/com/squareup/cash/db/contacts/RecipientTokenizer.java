package com.squareup.cash.db.contacts;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.Regex;

/* loaded from: classes6.dex */
public abstract class RecipientTokenizer {
    public static final Regex NAME_SEPARATOR_PATTERN = new Regex("[^a-zA-Z0-9.@+]");

    public static final String[] tokenizeUniqueName(String str) {
        str.getClass();
        List split = NAME_SEPARATOR_PATTERN.split(0, str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : split) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return (String[]) CollectionsKt.toList(CollectionsKt.toMutableSet(arrayList)).toArray(new String[0]);
    }
}
