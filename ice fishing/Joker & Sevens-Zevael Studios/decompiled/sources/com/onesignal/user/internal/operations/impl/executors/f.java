package com.onesignal.user.internal.operations.impl.executors;

import com.onesignal.common.h;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;

    static {
        int[] iArr = new int[z8.b.values().length];
        iArr[z8.b.SUCCESS.ordinal()] = 1;
        iArr[z8.b.FAIL_CONFLICT.ordinal()] = 2;
        iArr[z8.b.FAIL_NORETRY.ordinal()] = 3;
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[h.a.values().length];
        iArr2[h.a.RETRYABLE.ordinal()] = 1;
        iArr2[h.a.UNAUTHORIZED.ordinal()] = 2;
        $EnumSwitchMapping$1 = iArr2;
        int[] iArr3 = new int[ob.g.values().length];
        iArr3[ob.g.SMS.ordinal()] = 1;
        iArr3[ob.g.EMAIL.ordinal()] = 2;
        $EnumSwitchMapping$2 = iArr3;
    }
}
