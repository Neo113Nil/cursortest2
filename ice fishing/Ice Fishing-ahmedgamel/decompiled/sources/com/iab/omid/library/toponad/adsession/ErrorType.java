package com.iab.omid.library.toponad.adsession;

import com.anythink.basead.exoplayer.k.o;

/* loaded from: classes2.dex */
public enum ErrorType {
    GENERIC("generic"),
    VIDEO(o.f9230a);

    private final String errorType;

    ErrorType(String str) {
        this.errorType = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.errorType;
    }
}
