package com.squareup.cash.afterpayapplet.views.homesection.v3;

import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader;
import squareup.cash.ui.arcade.elements.ButtonProminence;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class AfterpayCardSectionKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader.SectionDisplayEffect.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader.SectionDisplayEffect sectionDisplayEffect = AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader.SectionDisplayEffect.REGULAR_EFFECT;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[ButtonProminence.values().length];
        try {
            iArr2[ButtonProminence.PROMINENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ButtonProminence.STANDARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ButtonProminence.SUBTLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ButtonProminence.CLIENT_COULD_NOT_PARSE_BUTTON_PROMINENCE.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
