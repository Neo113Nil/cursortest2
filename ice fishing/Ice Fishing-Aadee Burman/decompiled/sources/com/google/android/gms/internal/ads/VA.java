package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class VA extends MA implements Serializable {
    public final Pattern J;

    public VA(Pattern pattern) {
        super(false);
        pattern.getClass();
        this.J = pattern;
    }

    @Override // com.google.android.gms.internal.ads.MA
    public final String toString() {
        return this.J.toString();
    }
}
