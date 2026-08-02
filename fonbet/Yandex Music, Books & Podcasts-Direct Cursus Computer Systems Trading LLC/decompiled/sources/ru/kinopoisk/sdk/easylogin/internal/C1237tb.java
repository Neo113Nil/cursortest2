package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.uif;
import kotlin.jvm.functions.Function2;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.tb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1237tb extends uif implements Function2<Za, Za, Boolean> {
    public static final C1237tb a = new C1237tb();

    public C1237tb() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Za za = (Za) obj;
        Za za2 = (Za) obj2;
        za.getClass();
        za2.getClass();
        return Boolean.valueOf(za.getClass() == za2.getClass());
    }
}
