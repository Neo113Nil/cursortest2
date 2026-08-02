package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

import com.yandex.plus.home.datasource.openapi.models.u6;
import defpackage.btf;
import defpackage.bwf;
import defpackage.vhp;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@vhp
/* loaded from: classes5.dex */
public final class t {

    @NotNull
    public static final s Companion;
    public static final Object a;
    public static final t b;
    public static final t c;
    public static final t d;
    public static final /* synthetic */ t[] e;

    static {
        t tVar = new t("SUCCESS", 0);
        b = tVar;
        t tVar2 = new t("FAILED", 1);
        c = tVar2;
        t tVar3 = new t("CANCELED", 2);
        d = tVar3;
        e = new t[]{tVar, tVar2, tVar3};
        Companion = new s();
        a = btf.a(bwf.b, new u6(28));
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) e.clone();
    }
}
