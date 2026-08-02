package com.yandex.plus.pay.data.mb.dto;

import defpackage.btf;
import defpackage.bwf;
import defpackage.vhp;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@vhp
/* loaded from: classes5.dex */
public final class b1 {

    /* JADX INFO: Fake field, exist only in values array */
    b1 EF5;
    public static final /* synthetic */ b1[] b = {new b1("TARIFF", 0), new b1("OPTION", 1), new b1("COMPOSITE", 2)};

    @NotNull
    public static final a1 Companion = new a1();
    public static final Object a = btf.a(bwf.b, new com.yandex.plus.pay.data.acquisition.dto.f(29));

    public static b1 valueOf(String str) {
        return (b1) Enum.valueOf(b1.class, str);
    }

    public static b1[] values() {
        return (b1[]) b.clone();
    }
}
