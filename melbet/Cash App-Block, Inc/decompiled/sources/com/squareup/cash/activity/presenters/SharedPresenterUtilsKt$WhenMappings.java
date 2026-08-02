package com.squareup.cash.activity.presenters;

import com.squareup.protos.cash.activity.api.v1.ActivityRowSection;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class SharedPresenterUtilsKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[ActivityRowSection.values().length];
        try {
            iArr[ActivityRowSection.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ActivityRowSection.UPCOMING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ActivityRowSection.COMPLETED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ActivityRowSection.DEFAULT_ACTIVITY_ROW_SECTION_DO_NOT_USE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
