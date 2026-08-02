package com.plaid.internal;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public final class D0 {
    public final String a;
    public final Exception b;
    public final String c;

    public D0(String str, Exception exc, String str2) {
        this.a = str;
        this.b = exc;
        this.c = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceDescriptor{ip='");
        sb.append(this.a);
        sb.append("', mno='null', phoneNumber='null', preCheckError=");
        sb.append(this.b);
        sb.append(", desc='");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.c, "'}");
    }
}
