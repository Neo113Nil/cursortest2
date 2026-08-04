package com.gamericefishpro.space.mi;

import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public e(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static String a(String literal) {
        Intrinsics.checkNotNullParameter(literal, "literal");
        String strQuote = Pattern.quote(literal);
        Intrinsics.checkNotNullExpressionValue(strQuote, "quote(...)");
        return strQuote;
    }
}
