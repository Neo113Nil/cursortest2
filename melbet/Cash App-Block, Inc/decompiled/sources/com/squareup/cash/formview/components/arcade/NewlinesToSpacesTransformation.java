package com.squareup.cash.formview.components.arcade;

import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes6.dex */
public final class NewlinesToSpacesTransformation implements Function1 {
    public static final NewlinesToSpacesTransformation INSTANCE = new NewlinesToSpacesTransformation();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        return StringsKt__StringsJVMKt.replace(str, '\n', ' ', false);
    }
}
