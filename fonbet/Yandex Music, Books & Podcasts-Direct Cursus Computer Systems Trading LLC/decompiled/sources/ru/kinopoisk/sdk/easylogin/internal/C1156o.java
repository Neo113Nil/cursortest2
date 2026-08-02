package ru.kinopoisk.sdk.easylogin.internal;

import android.R;
import android.content.res.TypedArray;
import android.os.Build;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1156o {
    public static final void a(@NotNull T t) {
        t.getClass();
        int i = 1;
        if (t.getRequestedOrientation() != 1) {
            if (Build.VERSION.SDK_INT == 26) {
                boolean z = (t.getWindow().getAttributes().flags & 67108864) == 67108864;
                if (!z) {
                    TypedArray obtainStyledAttributes = t.getTheme().obtainStyledAttributes(new int[]{R.attr.windowIsTranslucent});
                    obtainStyledAttributes.getClass();
                    boolean z2 = obtainStyledAttributes.getBoolean(0, false);
                    obtainStyledAttributes.recycle();
                    z = z2;
                }
                if (z) {
                    i = -1;
                }
            }
            t.setRequestedOrientation(i);
        }
    }
}
