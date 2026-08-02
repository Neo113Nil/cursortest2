package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.btf;
import defpackage.bwf;
import defpackage.vhp;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@vhp
/* loaded from: classes4.dex */
public final class h6 {

    /* JADX INFO: Fake field, exist only in values array */
    h6 EF5;
    public static final /* synthetic */ h6[] b = {new h6("CHARGE_FULL_PRICE", 0), new h6("DEFERRED", 1)};

    @NotNull
    public static final g6 Companion = new g6();
    public static final Object a = btf.a(bwf.b, new y5(4));

    public static h6 valueOf(String str) {
        return (h6) Enum.valueOf(h6.class, str);
    }

    public static h6[] values() {
        return (h6[]) b.clone();
    }
}
