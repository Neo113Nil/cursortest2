package io.appmetrica.analytics.push.impl;

import io.appmetrica.analytics.push.intent.NotificationActionType;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class T0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[NotificationActionType.values().length];
        iArr[NotificationActionType.CLEAR.ordinal()] = 1;
        iArr[NotificationActionType.CLICK.ordinal()] = 2;
        iArr[NotificationActionType.ADDITIONAL_ACTION.ordinal()] = 3;
        iArr[NotificationActionType.INLINE_ACTION.ordinal()] = 4;
        a = iArr;
    }
}
