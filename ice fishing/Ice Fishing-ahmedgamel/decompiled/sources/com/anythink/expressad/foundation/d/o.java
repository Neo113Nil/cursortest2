package com.anythink.expressad.foundation.d;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class o implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f18843a;

    /* renamed from: b, reason: collision with root package name */
    private String f18844b;

    /* renamed from: c, reason: collision with root package name */
    private int f18845c;

    private o(String str, String str2, int i) {
        this.f18844b = str;
        this.f18843a = str2;
        this.f18845c = i;
    }

    private String a() {
        return this.f18843a;
    }

    private String b() {
        return this.f18844b;
    }

    private void a(String str) {
        this.f18843a = str;
    }

    private void b(String str) {
        this.f18844b = str;
    }
}
