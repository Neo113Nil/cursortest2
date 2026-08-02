package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.qdb;
import defpackage.rdb;
import defpackage.uop;
import defpackage.xz0;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.g6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC1051g6 {
    public static final EnumC1051g6 b;
    public static final EnumC1051g6 c;
    public static final /* synthetic */ EnumC1051g6[] d;
    public static final /* synthetic */ qdb e;

    @NotNull
    public final Set<EnumC1037f6> a;

    static {
        EnumC1037f6 enumC1037f6 = EnumC1037f6.System;
        EnumC1051g6 enumC1051g6 = new EnumC1051g6("SystemOnly", 0, uop.b(enumC1037f6));
        b = enumC1051g6;
        EnumC1051g6 enumC1051g62 = new EnumC1051g6("Support", 1, xz0.Y(new EnumC1037f6[]{enumC1037f6, EnumC1037f6.Support}));
        c = enumC1051g62;
        EnumC1051g6[] enumC1051g6Arr = {enumC1051g6, enumC1051g62};
        d = enumC1051g6Arr;
        e = new rdb(enumC1051g6Arr);
    }

    public EnumC1051g6(String str, int i, Set set) {
        this.a = set;
    }

    public static EnumC1051g6 valueOf(String str) {
        return (EnumC1051g6) Enum.valueOf(EnumC1051g6.class, str);
    }

    public static EnumC1051g6[] values() {
        return (EnumC1051g6[]) d.clone();
    }
}
