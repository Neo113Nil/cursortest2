package io.appmetrica.analytics.impl;

import defpackage.jl40;

/* renamed from: io.appmetrica.analytics.impl.w8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0818w8 {
    public final InterfaceC0446jc a;
    public String b = "";

    public C0818w8(InterfaceC0446jc interfaceC0446jc) {
        this.a = interfaceC0446jc;
    }

    public final void a(String str, boolean z) {
        if (str != null) {
            if ((str.length() > 0 ? str : null) == null || jl40.l(this.b, str)) {
                return;
            }
            this.b = str;
            this.a.a(str, z);
        }
    }
}
