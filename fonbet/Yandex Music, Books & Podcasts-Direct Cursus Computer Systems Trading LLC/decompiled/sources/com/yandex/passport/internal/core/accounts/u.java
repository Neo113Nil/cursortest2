package com.yandex.passport.internal.core.accounts;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class u {
    public static final Set a;

    static {
        Set synchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        synchronizedSet.getClass();
        a = synchronizedSet;
    }

    public static void a(String str) {
        str.getClass();
        a.remove(str);
    }
}
