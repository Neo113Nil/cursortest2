package com.plaid.internal;

import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class j8 extends Lambda implements Function0<Locale> {
    public static final j8 a = new j8();

    public j8() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Locale.getDefault();
    }
}
