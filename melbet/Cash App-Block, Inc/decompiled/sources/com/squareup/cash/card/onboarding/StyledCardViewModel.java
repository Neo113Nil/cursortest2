package com.squareup.cash.card.onboarding;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.cards.PaymentMethod;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class StyledCardViewModel {
    public final String cardCVV;
    public final String cardExpiration;
    public final String cardHolderName;
    public final String cardNumber;
    public final String cashtag;
    public final CardContouredText contouredText;
    public final CustomizationDetails customizationDetails;
    public final byte[] customizationOverrideBytes;
    public final Integer darkGradientOverride;
    public final boolean isInteractive;
    public final Integer lightGradientOverride;
    public final PaymentMethod paymentMethod;
    public final boolean shouldAlterCardTint;
    public final boolean showCashtag;
    public final boolean showCustomization;
    public final CardTheme theme;

    public /* synthetic */ StyledCardViewModel(String str, boolean z, CardTheme cardTheme, boolean z2, CustomizationDetails customizationDetails, byte[] bArr, boolean z3, PaymentMethod paymentMethod, CardContouredText cardContouredText, String str2, String str3, String str4, String str5, int i) {
        this(str, (i & 2) != 0 ? true : z, cardTheme, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? new CustomizationDetails() : customizationDetails, (i & 32) != 0 ? null : bArr, null, null, (i & 256) != 0 ? false : z3, (i & 512) == 0, (i & 1024) != 0 ? null : paymentMethod, (i & 2048) != 0 ? null : cardContouredText, (i & 4096) != 0 ? null : str2, (i & PKIFailureInfo.certRevoked) != 0 ? null : str3, (i & 16384) != 0 ? null : str4, (i & 32768) != 0 ? null : str5);
    }

    public static StyledCardViewModel copy$default(StyledCardViewModel styledCardViewModel, Integer num, Integer num2, boolean z, CardContouredText cardContouredText, int i) {
        String str = styledCardViewModel.cashtag;
        boolean z2 = styledCardViewModel.showCashtag;
        CardTheme cardTheme = styledCardViewModel.theme;
        boolean z3 = styledCardViewModel.showCustomization;
        CustomizationDetails customizationDetails = styledCardViewModel.customizationDetails;
        byte[] bArr = styledCardViewModel.customizationOverrideBytes;
        Integer num3 = (i & 64) != 0 ? styledCardViewModel.lightGradientOverride : num;
        Integer num4 = (i & 128) != 0 ? styledCardViewModel.darkGradientOverride : num2;
        boolean z4 = (i & 256) != 0 ? styledCardViewModel.isInteractive : z;
        boolean z5 = styledCardViewModel.shouldAlterCardTint;
        Integer num5 = num3;
        Integer num6 = num4;
        boolean z6 = z4;
        PaymentMethod paymentMethod = styledCardViewModel.paymentMethod;
        CardContouredText cardContouredText2 = (i & 2048) != 0 ? styledCardViewModel.contouredText : cardContouredText;
        String str2 = styledCardViewModel.cardHolderName;
        String str3 = styledCardViewModel.cardNumber;
        String str4 = styledCardViewModel.cardExpiration;
        CardContouredText cardContouredText3 = cardContouredText2;
        String str5 = styledCardViewModel.cardCVV;
        styledCardViewModel.getClass();
        str.getClass();
        cardTheme.getClass();
        customizationDetails.getClass();
        return new StyledCardViewModel(str, z2, cardTheme, z3, customizationDetails, bArr, num5, num6, z6, z5, paymentMethod, cardContouredText3, str2, str3, str4, str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StyledCardViewModel)) {
            return false;
        }
        StyledCardViewModel styledCardViewModel = (StyledCardViewModel) obj;
        return Intrinsics.areEqual(this.cashtag, styledCardViewModel.cashtag) && this.showCashtag == styledCardViewModel.showCashtag && Intrinsics.areEqual(this.theme, styledCardViewModel.theme) && this.showCustomization == styledCardViewModel.showCustomization && Intrinsics.areEqual(this.customizationDetails, styledCardViewModel.customizationDetails) && Intrinsics.areEqual(this.customizationOverrideBytes, styledCardViewModel.customizationOverrideBytes) && Intrinsics.areEqual(this.lightGradientOverride, styledCardViewModel.lightGradientOverride) && Intrinsics.areEqual(this.darkGradientOverride, styledCardViewModel.darkGradientOverride) && this.isInteractive == styledCardViewModel.isInteractive && this.shouldAlterCardTint == styledCardViewModel.shouldAlterCardTint && this.paymentMethod == styledCardViewModel.paymentMethod && Intrinsics.areEqual(this.contouredText, styledCardViewModel.contouredText) && Intrinsics.areEqual(this.cardHolderName, styledCardViewModel.cardHolderName) && Intrinsics.areEqual(this.cardNumber, styledCardViewModel.cardNumber) && Intrinsics.areEqual(this.cardExpiration, styledCardViewModel.cardExpiration) && Intrinsics.areEqual(this.cardCVV, styledCardViewModel.cardCVV);
    }

    public final int hashCode() {
        int hashCode = (this.customizationDetails.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.theme.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.cashtag.hashCode() * 31, 31, this.showCashtag)) * 31, 31, this.showCustomization)) * 31;
        byte[] bArr = this.customizationOverrideBytes;
        int hashCode2 = (hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        Integer num = this.lightGradientOverride;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.darkGradientOverride;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.isInteractive), 31, this.shouldAlterCardTint);
        PaymentMethod paymentMethod = this.paymentMethod;
        int hashCode4 = (m + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31;
        CardContouredText cardContouredText = this.contouredText;
        int hashCode5 = (hashCode4 + (cardContouredText == null ? 0 : cardContouredText.hashCode())) * 31;
        String str = this.cardHolderName;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cardNumber;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cardExpiration;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cardCVV;
        return hashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.customizationOverrideBytes);
        StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("StyledCardViewModel(cashtag=", this.cashtag, ", showCashtag=", ", theme=", this.showCashtag);
        m1540m.append(this.theme);
        m1540m.append(", showCustomization=");
        m1540m.append(this.showCustomization);
        m1540m.append(", customizationDetails=");
        m1540m.append(this.customizationDetails);
        m1540m.append(", customizationOverrideBytes=");
        m1540m.append(arrays);
        m1540m.append(", lightGradientOverride=");
        NavAction$$ExternalSyntheticOutline0.m(m1540m, this.lightGradientOverride, ", darkGradientOverride=", this.darkGradientOverride, ", isInteractive=");
        re$$ExternalSyntheticOutline0.m(m1540m, this.isInteractive, ", shouldAlterCardTint=", this.shouldAlterCardTint, ", paymentMethod=");
        m1540m.append(this.paymentMethod);
        m1540m.append(", contouredText=");
        m1540m.append(this.contouredText);
        m1540m.append(", cardHolderName=");
        Boxes$$ExternalSyntheticOutline1.m(m1540m, this.cardHolderName, ", cardNumber=", this.cardNumber, ", cardExpiration=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m1540m, this.cardExpiration, ", cardCVV=", this.cardCVV, ")");
    }

    public StyledCardViewModel(String str, boolean z, CardTheme cardTheme, boolean z2, CustomizationDetails customizationDetails, byte[] bArr, Integer num, Integer num2, boolean z3, boolean z4, PaymentMethod paymentMethod, CardContouredText cardContouredText, String str2, String str3, String str4, String str5) {
        str.getClass();
        cardTheme.getClass();
        customizationDetails.getClass();
        this.cashtag = str;
        this.showCashtag = z;
        this.theme = cardTheme;
        this.showCustomization = z2;
        this.customizationDetails = customizationDetails;
        this.customizationOverrideBytes = bArr;
        this.lightGradientOverride = num;
        this.darkGradientOverride = num2;
        this.isInteractive = z3;
        this.shouldAlterCardTint = z4;
        this.paymentMethod = paymentMethod;
        this.contouredText = cardContouredText;
        this.cardHolderName = str2;
        this.cardNumber = str3;
        this.cardExpiration = str4;
        this.cardCVV = str5;
    }
}
