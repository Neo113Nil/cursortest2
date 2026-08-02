package com.squareup.cash.scrubbing;

import com.squareup.protos.common.countries.Country;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class PostalCodeKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[Country.values().length];
        try {
            iArr[Country.AU.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Country.US.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Country.CA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Country.GB.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Country.IE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
