package com.mikepenz.markdown.model;

import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class ReferenceLinkHandlerImpl {
    public final LinkedHashMap stored = new LinkedHashMap();

    public final void store(String str, String str2) {
        str.getClass();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        this.stored.put(lowerCase, str2);
    }
}
