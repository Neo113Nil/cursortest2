package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.Locale;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public interface a9h {
    default boolean a() {
        String b = b();
        if (b == null) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String lowerCase = b.toLowerCase(locale);
        lowerCase.getClass();
        String str = Build.MANUFACTURER;
        str.getClass();
        String lowerCase2 = str.toLowerCase(locale);
        lowerCase2.getClass();
        return StringsKt.M(lowerCase2, lowerCase, false);
    }

    default String b() {
        return Build.MANUFACTURER;
    }

    default Intent c(Context context) {
        return jo0.j(context);
    }
}
