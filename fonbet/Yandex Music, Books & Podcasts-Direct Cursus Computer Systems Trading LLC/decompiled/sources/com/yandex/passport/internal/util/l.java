package com.yandex.passport.internal.util;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes4.dex */
public abstract class l {
    public static final com.yandex.passport.common.coroutine.d a = new com.yandex.passport.common.coroutine.d(16);

    public static Uri a(String str) {
        return Uri.parse("content://".concat("com.yandex.passport.internal.provider." + str));
    }

    public static final String b(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, str.length() / 2));
        int length = str.length() - sb.length();
        for (int i = 0; i < length; i++) {
            sb.append('*');
        }
        return sb.toString();
    }

    public static void c(View view) {
        if (view instanceof TextInputLayout) {
            ((TextInputLayout) view).setHintEnabled(false);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.getClass();
                c(childAt);
            }
        }
    }
}
