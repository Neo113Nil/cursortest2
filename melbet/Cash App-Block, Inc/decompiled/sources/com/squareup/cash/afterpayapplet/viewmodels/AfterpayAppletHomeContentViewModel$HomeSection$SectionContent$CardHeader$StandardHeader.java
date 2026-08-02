package com.squareup.cash.afterpayapplet.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader {
    public final String amount;
    public final String amountCaption;
    public final String bodyText;
    public final SectionDisplayEffect displayEffect;
    public final TappableIcon tapInfo;
    public final String titleText;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class SectionDisplayEffect {
        public static final /* synthetic */ SectionDisplayEffect[] $VALUES;
        public static final SectionDisplayEffect DISABLED_EFFECT;
        public static final SectionDisplayEffect REGULAR_EFFECT;

        static {
            SectionDisplayEffect sectionDisplayEffect = new SectionDisplayEffect("REGULAR_EFFECT", 0);
            REGULAR_EFFECT = sectionDisplayEffect;
            SectionDisplayEffect sectionDisplayEffect2 = new SectionDisplayEffect("DISABLED_EFFECT", 1);
            DISABLED_EFFECT = sectionDisplayEffect2;
            $VALUES = new SectionDisplayEffect[]{sectionDisplayEffect, sectionDisplayEffect2};
        }

        public static SectionDisplayEffect valueOf(String str) {
            return (SectionDisplayEffect) Enum.valueOf(SectionDisplayEffect.class, str);
        }

        public static SectionDisplayEffect[] values() {
            return (SectionDisplayEffect[]) $VALUES.clone();
        }
    }

    public /* synthetic */ AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader(String str, String str2, SectionDisplayEffect sectionDisplayEffect, int i) {
        this(null, str, str2, null, (i & 16) != 0 ? null : "Once you get your new debit card, activate it to pay over time", sectionDisplayEffect);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader)) {
            return false;
        }
        AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader = (AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader) obj;
        return Intrinsics.areEqual(this.titleText, afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader.titleText) && Intrinsics.areEqual(this.amount, afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader.amount) && Intrinsics.areEqual(this.amountCaption, afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader.amountCaption) && Intrinsics.areEqual(this.tapInfo, afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader.tapInfo) && Intrinsics.areEqual(this.bodyText, afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader.bodyText) && this.displayEffect == afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader.displayEffect;
    }

    public final int hashCode() {
        String str = this.titleText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.amount;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.amountCaption;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TappableIcon tappableIcon = this.tapInfo;
        int hashCode4 = (hashCode3 + (tappableIcon == null ? 0 : tappableIcon.hashCode())) * 31;
        String str4 = this.bodyText;
        return this.displayEffect.hashCode() + ((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("StandardHeader(titleText=", this.titleText, ", amount=", this.amount, ", amountCaption=");
        m.append(this.amountCaption);
        m.append(", tapInfo=");
        m.append(this.tapInfo);
        m.append(", bodyText=");
        m.append(this.bodyText);
        m.append(", displayEffect=");
        m.append(this.displayEffect);
        m.append(")");
        return m.toString();
    }

    public AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader(String str, String str2, String str3, TappableIcon tappableIcon, String str4, SectionDisplayEffect sectionDisplayEffect) {
        this.titleText = str;
        this.amount = str2;
        this.amountCaption = str3;
        this.tapInfo = tappableIcon;
        this.bodyText = str4;
        this.displayEffect = sectionDisplayEffect;
    }
}
