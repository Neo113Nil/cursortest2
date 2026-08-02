package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.g4;
import defpackage.btf;
import defpackage.bwf;
import defpackage.vhp;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@vhp
/* loaded from: classes5.dex */
public final class k {

    /* JADX INFO: Fake field, exist only in values array */
    k EF5;
    public static final /* synthetic */ k[] b = {new k("PERCENT", 0), new k("FIXED", 1)};

    @NotNull
    public static final j Companion = new j();
    public static final Object a = btf.a(bwf.b, new g4(13));

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) b.clone();
    }
}
