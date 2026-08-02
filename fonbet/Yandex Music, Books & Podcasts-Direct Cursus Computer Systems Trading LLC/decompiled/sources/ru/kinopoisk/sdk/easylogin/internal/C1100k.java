package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.uif;
import defpackage.xq0;
import kotlin.jvm.functions.Function1;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1100k extends uif implements Function1<C1032f1<Object>, Object> {
    public static final C1100k a = new C1100k();

    public C1100k() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C1032f1 c1032f1 = (C1032f1) obj;
        c1032f1.getClass();
        T t = c1032f1.c;
        if (t != 0) {
            return t;
        }
        xq0.x("Required value was null.");
        return null;
    }
}
