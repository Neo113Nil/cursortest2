package ru.kinopoisk.sdk.easylogin.internal;

import android.content.Context;
import android.content.res.TypedArray;
import defpackage.ocg;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class P7 {
    public static final Integer a(@NotNull Context context, int i) {
        Integer num;
        context.getClass();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        obtainStyledAttributes.getClass();
        try {
            ocg.s(obtainStyledAttributes, 0);
            num = Integer.valueOf(obtainStyledAttributes.getResourceId(0, 0));
        } catch (IllegalArgumentException unused) {
            num = null;
        }
        obtainStyledAttributes.recycle();
        return num;
    }
}
