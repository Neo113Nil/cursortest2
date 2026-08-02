package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.arf;
import defpackage.btf;
import defpackage.uif;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.h0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1059h0 {

    @NotNull
    public static final arf a = btf.b(a.a);

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.h0$a */
    public static final class a extends uif implements Function0<Regex> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new Regex("(\\d+\\.\\d+\\.\\d+)");
        }
    }
}
