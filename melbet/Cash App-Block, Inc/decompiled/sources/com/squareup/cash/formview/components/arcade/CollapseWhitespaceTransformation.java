package com.squareup.cash.formview.components.arcade;

import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* loaded from: classes6.dex */
public final class CollapseWhitespaceTransformation implements Function1 {
    public static final CollapseWhitespaceTransformation INSTANCE = new CollapseWhitespaceTransformation();
    public static final Regex repeatingWhitespaceRegex = new Regex("\\s{2,}");

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        return repeatingWhitespaceRegex.replace(str, " ");
    }
}
