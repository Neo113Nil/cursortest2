package app.cash.redwood.yoga.internal.detail;

import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class GlobalMembers {
    public static int bitWidthFn(Enum[] enumArr) {
        enumArr.getClass();
        return log2ceilFn(enumArr.length - 1);
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewEarningsStreamDetail.deepLinkSpecs;
    }

    public static int log2ceilFn(int i) {
        if (i < 1) {
            return 0;
        }
        return log2ceilFn(i / 2) + 1;
    }
}
