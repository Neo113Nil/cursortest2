package com.onesignal.user.internal.operations.impl.executors;

import com.onesignal.common.h;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class k {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[h.a.values().length];
        iArr[h.a.RETRYABLE.ordinal()] = 1;
        iArr[h.a.CONFLICT.ordinal()] = 2;
        iArr[h.a.INVALID.ordinal()] = 3;
        iArr[h.a.UNAUTHORIZED.ordinal()] = 4;
        iArr[h.a.MISSING.ordinal()] = 5;
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[ob.g.values().length];
        iArr2[ob.g.SMS.ordinal()] = 1;
        iArr2[ob.g.EMAIL.ordinal()] = 2;
        $EnumSwitchMapping$1 = iArr2;
    }
}
