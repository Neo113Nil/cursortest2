package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.uif;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class O9 extends uif implements Function1<P, Boolean> {
    public static final O9 a = new O9();

    public O9() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        P p = (P) obj;
        p.getClass();
        int ordinal = p.a.ordinal();
        return Boolean.valueOf(ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5);
    }
}
