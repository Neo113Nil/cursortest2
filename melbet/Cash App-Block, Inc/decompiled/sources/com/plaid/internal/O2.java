package com.plaid.internal;

import com.plaid.internal.N2;

/* loaded from: classes5.dex */
public final class O2 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final String a(N2 n2) {
        String c;
        n2.getClass();
        N2.h hVar = n2 instanceof N2.h ? (N2.h) n2 : null;
        return (hVar == null || (c = hVar.c()) == null) ? "" : c;
    }
}
