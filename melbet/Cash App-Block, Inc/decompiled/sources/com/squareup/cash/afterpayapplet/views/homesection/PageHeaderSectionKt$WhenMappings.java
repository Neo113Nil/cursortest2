package com.squareup.cash.afterpayapplet.views.homesection;

import squareup.cash.ui.arcade.elements.ButtonProminence;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class PageHeaderSectionKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[ButtonProminence.values().length];
        try {
            iArr[ButtonProminence.STANDARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ButtonProminence.PROMINENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ButtonProminence.SUBTLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ButtonProminence.CLIENT_COULD_NOT_PARSE_BUTTON_PROMINENCE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
