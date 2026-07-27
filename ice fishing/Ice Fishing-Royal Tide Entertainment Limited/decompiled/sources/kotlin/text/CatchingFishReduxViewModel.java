package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishReduxViewModel {
    public static CatchingFishToastDaggerHilt CatchingFishParcelableFAB(Object obj) {
        CatchingFishJUnitSharedFlow catchingFishJUnitSharedFlow = (CatchingFishJUnitSharedFlow) obj;
        CatchingFishToastDaggerHilt catchingFishToastDaggerHilt = catchingFishJUnitSharedFlow.unknownFields;
        if (catchingFishToastDaggerHilt != CatchingFishToastDaggerHilt.CatchingFishWorkManager) {
            return catchingFishToastDaggerHilt;
        }
        CatchingFishToastDaggerHilt catchingFishToastDaggerHilt2 = new CatchingFishToastDaggerHilt(0, new int[8], new Object[8], true);
        catchingFishJUnitSharedFlow.unknownFields = catchingFishToastDaggerHilt2;
        return catchingFishToastDaggerHilt2;
    }

    public static boolean CatchingFishSnackbar(int i, Object obj, CatchingFishWidgetFAB catchingFishWidgetFAB) {
        CatchingFishReduxLayout catchingFishReduxLayout = (CatchingFishReduxLayout) catchingFishWidgetFAB.CatchingFishReduxKtor;
        int i2 = catchingFishWidgetFAB.CatchingFishParcelableFAB;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            catchingFishWidgetFAB.CatchingFishPayPal(0);
            ((CatchingFishToastDaggerHilt) obj).CatchingFishCoroutine(i3 << 3, Long.valueOf(catchingFishReduxLayout.CatchingFish()));
            return true;
        }
        if (i4 == 1) {
            catchingFishWidgetFAB.CatchingFishPayPal(1);
            ((CatchingFishToastDaggerHilt) obj).CatchingFishCoroutine((i3 << 3) | 1, Long.valueOf(catchingFishReduxLayout.CatchingFishAnimationMockk()));
            return true;
        }
        if (i4 == 2) {
            ((CatchingFishToastDaggerHilt) obj).CatchingFishCoroutine((i3 << 3) | 2, catchingFishWidgetFAB.CatchingFishLayout());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw CatchingFishKtorMVPAndroidX.CatchingFishSnackbar();
            }
            catchingFishWidgetFAB.CatchingFishPayPal(5);
            ((CatchingFishToastDaggerHilt) obj).CatchingFishCoroutine(5 | (i3 << 3), Integer.valueOf(catchingFishReduxLayout.CatchingFishUnitTesting()));
            return true;
        }
        CatchingFishToastDaggerHilt catchingFishToastDaggerHilt = new CatchingFishToastDaggerHilt(0, new int[8], new Object[8], true);
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new CatchingFishKtorMVPAndroidX("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (catchingFishWidgetFAB.CatchingFishCoroutine() != Integer.MAX_VALUE && CatchingFishSnackbar(i7, catchingFishToastDaggerHilt, catchingFishWidgetFAB)) {
        }
        if (i6 != catchingFishWidgetFAB.CatchingFishParcelableFAB) {
            throw new CatchingFishKtorMVPAndroidX("Protocol message end-group tag did not match expected tag.");
        }
        if (catchingFishToastDaggerHilt.CatchingFishDaggerWebsocket) {
            catchingFishToastDaggerHilt.CatchingFishDaggerWebsocket = false;
        }
        ((CatchingFishToastDaggerHilt) obj).CatchingFishCoroutine(i5 | 3, catchingFishToastDaggerHilt);
        return true;
    }
}
