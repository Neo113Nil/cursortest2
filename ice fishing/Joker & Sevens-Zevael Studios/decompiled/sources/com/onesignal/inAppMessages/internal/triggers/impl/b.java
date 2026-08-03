package com.onesignal.inAppMessages.internal.triggers.impl;

import com.onesignal.inAppMessages.internal.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[m.a.values().length];
        iArr[m.a.SESSION_TIME.ordinal()] = 1;
        iArr[m.a.TIME_SINCE_LAST_IN_APP.ordinal()] = 2;
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[m.b.values().length];
        iArr2[m.b.LESS_THAN.ordinal()] = 1;
        iArr2[m.b.LESS_THAN_OR_EQUAL_TO.ordinal()] = 2;
        iArr2[m.b.GREATER_THAN.ordinal()] = 3;
        iArr2[m.b.GREATER_THAN_OR_EQUAL_TO.ordinal()] = 4;
        iArr2[m.b.EQUAL_TO.ordinal()] = 5;
        iArr2[m.b.NOT_EQUAL_TO.ordinal()] = 6;
        $EnumSwitchMapping$1 = iArr2;
    }
}
