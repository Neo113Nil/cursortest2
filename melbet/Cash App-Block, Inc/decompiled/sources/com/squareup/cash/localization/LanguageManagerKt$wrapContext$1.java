package com.squareup.cash.localization;

import androidx.core.os.BundleKt;
import java.util.Locale;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes.dex */
public final /* synthetic */ class LanguageManagerKt$wrapContext$1 extends PropertyReference1Impl {
    public static final LanguageManagerKt$wrapContext$1 INSTANCE = new LanguageManagerKt$wrapContext$1(BundleKt.class, "isSpanish", "isSpanish(Ljava/util/Locale;)Z", 1);

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        return Boolean.valueOf(BundleKt.isSpanish((Locale) obj));
    }
}
