package com.squareup.cash.blockers.presenters;

import com.squareup.protos.franklin.api.CalendarBlocker;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class CalendarBlockerPresenterKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[CalendarBlocker.AnimationDirection.values().length];
        try {
            iArr[CalendarBlocker.AnimationDirection.FORWARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CalendarBlocker.AnimationDirection.BACKWARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
