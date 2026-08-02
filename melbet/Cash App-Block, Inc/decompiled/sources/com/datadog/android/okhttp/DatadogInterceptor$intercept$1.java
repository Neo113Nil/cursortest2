package com.datadog.android.okhttp;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.CharsKt;

/* loaded from: classes4.dex */
public final class DatadogInterceptor$intercept$1 extends Lambda implements Function0 {
    public final /* synthetic */ String $prefix;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DatadogInterceptor$intercept$1(String str, int i) {
        super(0);
        this.$r8$classId = i;
        this.$prefix = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String valueOf;
        int i = this.$r8$classId;
        String str = this.$prefix;
        switch (i) {
            case 9:
                if (str.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    char charAt = str.charAt(0);
                    if (Character.isLowerCase(charAt)) {
                        Locale locale = Locale.US;
                        locale.getClass();
                        valueOf = CharsKt.titlecase(charAt, locale);
                    } else {
                        valueOf = String.valueOf(charAt);
                    }
                    sb.append((Object) valueOf);
                    sb.append(str.substring(1));
                    break;
                }
                break;
        }
        return String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{str}, 1));
    }
}
