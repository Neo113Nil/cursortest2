package com.yandex.music.shared.experiments.impl.local.migrations;

import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import defpackage.c5b;

/* loaded from: classes3.dex */
public abstract class a {
    public static c5b a(String str, Exception exc) {
        Assertions.throwOrSkip$default(new FailedAssertionException("Failed to parse experiment details json from file. File content = ".concat(str), exc), null, 2, null);
        return c5b.a;
    }
}
