package io.appmetrica.analytics.push.impl;

import defpackage.unr0;

/* loaded from: classes4.dex */
public final class B2 extends RuntimeException {
    public final String a;
    public final String b;

    public B2(String str, String str2) {
        super(unr0.p("Transform failure for category '", str, "' with details '", str2, "'"));
        this.a = str;
        this.b = str2;
    }
}
