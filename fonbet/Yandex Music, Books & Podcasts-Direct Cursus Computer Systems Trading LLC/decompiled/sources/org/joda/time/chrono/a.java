package org.joda.time.chrono;

import defpackage.glm;
import defpackage.mzc;
import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

/* loaded from: classes5.dex */
public final class a extends glm {
    @Override // defpackage.mq2, defpackage.xc7
    public final long B(long j, String str, Locale locale) {
        String[] strArr = mzc.b(locale).f;
        int length = strArr.length;
        do {
            length--;
            if (length < 0) {
                throw new IllegalFieldValueException(DateTimeFieldType.m, str);
            }
        } while (!strArr[length].equalsIgnoreCase(str));
        return A(length, j);
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final String e(int i, Locale locale) {
        return mzc.b(locale).f[i];
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final int i(Locale locale) {
        return mzc.b(locale).m;
    }
}
