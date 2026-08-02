package com.yandex.plus.bdui.plus.checkout.action.serializer;

import defpackage.btf;
import defpackage.bwf;
import defpackage.vhp;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@vhp
/* loaded from: classes4.dex */
public final class r {

    /* JADX INFO: Fake field, exist only in values array */
    r EF5;
    public static final /* synthetic */ r[] b = {new r("CHARGE_FULL_PRICE", 0), new r("DEFERRED", 1)};

    @NotNull
    public static final q Companion = new q();
    public static final Object a = btf.a(bwf.b, new com.yandex.plus.bdui.plus.action.serializer.s(11));

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) b.clone();
    }
}
