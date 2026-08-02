package io.appmetrica.analytics.logger.common.impl;

import defpackage.x4e;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes9.dex */
public final class e {
    public final Pattern a = Pattern.compile("[\\p{Space},;]");

    public static int a(Matcher matcher, int i, int i2) {
        if (i2 >= i) {
            int c = x4e.c(i2, i, 2, i);
            matcher.region(c, i2);
            if (matcher.find()) {
                int start = matcher.start();
                int a = a(matcher, start + 1, i2);
                return a == -1 ? start : a;
            }
            matcher.region(i, c);
            if (matcher.find()) {
                int start2 = matcher.start();
                int a2 = a(matcher, start2 + 1, c);
                return a2 == -1 ? start2 : a2;
            }
        }
        return -1;
    }
}
