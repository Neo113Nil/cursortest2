package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class T9 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ModuleEvent.Category.values().length];
        try {
            iArr[ModuleEvent.Category.GENERAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ModuleEvent.Category.SYSTEM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
