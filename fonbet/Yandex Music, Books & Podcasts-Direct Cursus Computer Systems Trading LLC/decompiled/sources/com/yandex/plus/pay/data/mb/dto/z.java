package com.yandex.plus.pay.data.mb.dto;

import defpackage.btf;
import defpackage.bwf;
import defpackage.vhp;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@vhp
/* loaded from: classes5.dex */
public final class z {

    /* JADX INFO: Fake field, exist only in values array */
    z EF5;
    public static final /* synthetic */ z[] b = {new z("LINK", 0), new z("TEXT", 1)};

    @NotNull
    public static final y Companion = new y();
    public static final Object a = btf.a(bwf.b, new com.yandex.plus.pay.data.acquisition.dto.f(24));

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) b.clone();
    }
}
