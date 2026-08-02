package com.plaid.internal;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* renamed from: com.plaid.internal.x0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0323x0 {
    public final String a;

    public C0323x0(String str) {
        W3 w3 = Z3.a;
        this.a = str.concat(": ");
    }

    public final String a(String str, Object... objArr) {
        if (objArr.length == 0) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), this.a, str);
        }
        try {
            return this.a + String.format(str, objArr);
        } catch (Exception e) {
            return this.a + str + "... {format error " + e.getMessage() + "}";
        }
    }

    public final void a(W3 w3, String str, Object... objArr) {
        W3 w32 = Z3.a;
        if (w3.a <= Z3.a.a) {
            Z3.c.a(w3, a(str, objArr));
        }
    }

    public final void a(Exception exc, String str) {
        W3 w3 = W3.ERROR;
        W3 w32 = Z3.a;
        if (w3.a <= Z3.a.a) {
            Z3.c.a(w3, a(str, new Object[0]), exc);
        }
    }
}
