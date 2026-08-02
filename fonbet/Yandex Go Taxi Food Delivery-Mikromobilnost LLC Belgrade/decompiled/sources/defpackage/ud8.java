package defpackage;

import com.ybsdk.feature.card.internal.presentation.carddetails.CardDetailsViewModel$CardDetailsTooltipAnchorView;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class ud8 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CardDetailsViewModel$CardDetailsTooltipAnchorView.values().length];
        try {
            iArr[CardDetailsViewModel$CardDetailsTooltipAnchorView.CARD_NUMBER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CardDetailsViewModel$CardDetailsTooltipAnchorView.EXPIRE_DATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CardDetailsViewModel$CardDetailsTooltipAnchorView.CVV.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
