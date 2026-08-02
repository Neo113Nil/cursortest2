package app.cash.local.primitives;

import com.squareup.protos.cash.local.client.v1.LocalActionOrdering;
import com.squareup.protos.cash.papermate.enums.FeeType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class ActionKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[LocalActionOrdering.DiscountCodeMode.values().length];
        try {
            FeeType.Companion companion = LocalActionOrdering.DiscountCodeMode.Companion;
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            FeeType.Companion companion2 = LocalActionOrdering.DiscountCodeMode.Companion;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            FeeType.Companion companion3 = LocalActionOrdering.DiscountCodeMode.Companion;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            FeeType.Companion companion4 = LocalActionOrdering.DiscountCodeMode.Companion;
            iArr[3] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
