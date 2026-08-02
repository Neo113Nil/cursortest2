package com.yandex.metrica.push.impl;

import defpackage.hrg;

/* loaded from: classes3.dex */
public class X extends RuntimeException {
    private final String a;
    private final String b;

    public X(String str, String str2) {
        super(hrg.s("Transform failure for category '", str, "' with details '", str2, "'"));
        this.a = str;
        this.b = str2;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }
}
