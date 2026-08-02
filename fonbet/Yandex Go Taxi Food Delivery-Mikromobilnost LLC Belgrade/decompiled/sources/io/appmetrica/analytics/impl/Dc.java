package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class Dc {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[InternalModuleEvent.Category.values().length];
        try {
            iArr[InternalModuleEvent.Category.SYSTEM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InternalModuleEvent.Category.GENERAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
