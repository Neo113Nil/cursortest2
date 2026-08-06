package com.yandex.varioqub.config.impl;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public static String f2747a;

    public static String a(String str) {
        String str2 = f2747a;
        if (str2 == null) {
            str2 = "https://app.uaas.yandex.ru/v1/app?client_id=%s";
        }
        return String.format(str2, Arrays.copyOf(new Object[]{str}, 1));
    }
}
