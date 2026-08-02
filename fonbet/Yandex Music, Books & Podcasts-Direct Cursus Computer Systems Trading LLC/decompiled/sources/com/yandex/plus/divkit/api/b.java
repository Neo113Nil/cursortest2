package com.yandex.plus.divkit.api;

import defpackage.hrg;

/* loaded from: classes4.dex */
public final class b extends IllegalArgumentException {
    public final String a;

    public b(String str) {
        super(hrg.q("Can not evaluate action uri \"", str, "\"!"));
        this.a = str;
    }
}
