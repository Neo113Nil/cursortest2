package com.onesignal.user.internal.operations.impl.executors;

import com.onesignal.common.h;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class i {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[gb.j.values().length];
        iArr[gb.j.EMAIL.ordinal()] = 1;
        iArr[gb.j.SMS.ordinal()] = 2;
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[h.a.values().length];
        iArr2[h.a.RETRYABLE.ordinal()] = 1;
        iArr2[h.a.UNAUTHORIZED.ordinal()] = 2;
        iArr2[h.a.MISSING.ordinal()] = 3;
        $EnumSwitchMapping$1 = iArr2;
    }
}
