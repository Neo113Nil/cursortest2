package kotlin.text;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class CatchingFishMVPMotionLayout implements Iterable, CatchingFishCardViewFAB {
    public CatchingFishHandlerManifest CatchingFishDaggerWebsocket;
    public final CatchingFishPayPalService CatchingFishReduxKtor;
    public boolean CatchingFishViewModelScope;
    public boolean CatchingFishWorkManager;

    public CatchingFishMVPMotionLayout() {
        long[] jArr = CatchingFishViewPayPal.CatchingFishParcelableFAB;
        this.CatchingFishReduxKtor = new CatchingFishPayPalService();
    }

    public final void CatchingFishCoroutine(CatchingFishMVPMotionLayout catchingFishMVPMotionLayout) {
        CatchingFishPayPalService catchingFishPayPalService = catchingFishMVPMotionLayout.CatchingFishReduxKtor;
        Object[] objArr = catchingFishPayPalService.CatchingFishSnackbar;
        Object[] objArr2 = catchingFishPayPalService.CatchingFishCoroutine;
        long[] jArr = catchingFishPayPalService.CatchingFishParcelableFAB;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        CatchingFishGraphQLLayout catchingFishGraphQLLayout = (CatchingFishGraphQLLayout) obj;
                        CatchingFishPayPalService catchingFishPayPalService2 = this.CatchingFishReduxKtor;
                        Object CatchingFishViewModelScope = catchingFishPayPalService2.CatchingFishViewModelScope(catchingFishGraphQLLayout);
                        CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishGraphQLLayout, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object CatchingFishDaggerWebsocket = catchingFishGraphQLLayout.CatchingFishSnackbar.CatchingFishDaggerWebsocket(CatchingFishViewModelScope, obj2);
                        if (CatchingFishDaggerWebsocket != null) {
                            catchingFishPayPalService2.CatchingFishOkHttp(catchingFishGraphQLLayout, CatchingFishDaggerWebsocket);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void CatchingFishDaggerWebsocket(CatchingFishGraphQLLayout catchingFishGraphQLLayout, Object obj) {
        boolean z = obj instanceof CatchingFishSnackbarToast;
        CatchingFishPayPalService catchingFishPayPalService = this.CatchingFishReduxKtor;
        if (!z || !catchingFishPayPalService.CatchingFishCoroutine(catchingFishGraphQLLayout)) {
            catchingFishPayPalService.CatchingFishOkHttp(catchingFishGraphQLLayout, obj);
            return;
        }
        Object CatchingFishViewModelScope = catchingFishPayPalService.CatchingFishViewModelScope(catchingFishGraphQLLayout);
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(CatchingFishViewModelScope, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        CatchingFishSnackbarToast catchingFishSnackbarToast = (CatchingFishSnackbarToast) CatchingFishViewModelScope;
        CatchingFishSnackbarToast catchingFishSnackbarToast2 = (CatchingFishSnackbarToast) obj;
        String str = catchingFishSnackbarToast2.CatchingFishParcelableFAB;
        if (str == null) {
            str = catchingFishSnackbarToast.CatchingFishParcelableFAB;
        }
        CatchingFishIntentAnimation catchingFishIntentAnimation = catchingFishSnackbarToast2.CatchingFishSnackbar;
        if (catchingFishIntentAnimation == null) {
            catchingFishIntentAnimation = catchingFishSnackbarToast.CatchingFishSnackbar;
        }
        catchingFishPayPalService.CatchingFishOkHttp(catchingFishGraphQLLayout, new CatchingFishSnackbarToast(str, catchingFishIntentAnimation));
    }

    public final CatchingFishMVPMotionLayout CatchingFishParcelableFAB() {
        CatchingFishMVPMotionLayout catchingFishMVPMotionLayout = new CatchingFishMVPMotionLayout();
        catchingFishMVPMotionLayout.CatchingFishWorkManager = this.CatchingFishWorkManager;
        catchingFishMVPMotionLayout.CatchingFishViewModelScope = this.CatchingFishViewModelScope;
        CatchingFishPayPalService catchingFishPayPalService = catchingFishMVPMotionLayout.CatchingFishReduxKtor;
        catchingFishPayPalService.getClass();
        CatchingFishPayPalService catchingFishPayPalService2 = this.CatchingFishReduxKtor;
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishPayPalService2, "from");
        Object[] objArr = catchingFishPayPalService2.CatchingFishSnackbar;
        Object[] objArr2 = catchingFishPayPalService2.CatchingFishCoroutine;
        long[] jArr = catchingFishPayPalService2.CatchingFishParcelableFAB;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            catchingFishPayPalService.CatchingFishOkHttp(objArr[i4], objArr2[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return catchingFishMVPMotionLayout;
    }

    public final Object CatchingFishSnackbar(CatchingFishGraphQLLayout catchingFishGraphQLLayout) {
        Object CatchingFishViewModelScope = this.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishGraphQLLayout);
        if (CatchingFishViewModelScope != null) {
            return CatchingFishViewModelScope;
        }
        throw new IllegalStateException("Key not present: " + catchingFishGraphQLLayout + " - consider getOrElse or getOrNull");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishMVPMotionLayout)) {
            return false;
        }
        CatchingFishMVPMotionLayout catchingFishMVPMotionLayout = (CatchingFishMVPMotionLayout) obj;
        return CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishReduxKtor, catchingFishMVPMotionLayout.CatchingFishReduxKtor) && this.CatchingFishWorkManager == catchingFishMVPMotionLayout.CatchingFishWorkManager && this.CatchingFishViewModelScope == catchingFishMVPMotionLayout.CatchingFishViewModelScope;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.CatchingFishViewModelScope) + ((Boolean.hashCode(this.CatchingFishWorkManager) + (this.CatchingFishReduxKtor.hashCode() * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        CatchingFishHandlerManifest catchingFishHandlerManifest = this.CatchingFishDaggerWebsocket;
        if (catchingFishHandlerManifest == null) {
            CatchingFishPayPalService catchingFishPayPalService = this.CatchingFishReduxKtor;
            catchingFishPayPalService.getClass();
            CatchingFishHandlerManifest catchingFishHandlerManifest2 = new CatchingFishHandlerManifest(catchingFishPayPalService);
            this.CatchingFishDaggerWebsocket = catchingFishHandlerManifest2;
            catchingFishHandlerManifest = catchingFishHandlerManifest2;
        }
        return ((CatchingFishKtorOkHttp) catchingFishHandlerManifest.entrySet()).iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.CatchingFishWorkManager) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.CatchingFishViewModelScope) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        CatchingFishPayPalService catchingFishPayPalService = this.CatchingFishReduxKtor;
        Object[] objArr = catchingFishPayPalService.CatchingFishSnackbar;
        Object[] objArr2 = catchingFishPayPalService.CatchingFishCoroutine;
        long[] jArr = catchingFishPayPalService.CatchingFishParcelableFAB;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((CatchingFishGraphQLLayout) obj).CatchingFishParcelableFAB);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return CatchingFishAdMobFAB.CatchingFishHandler(this) + "{ " + ((Object) sb) + " }";
    }
}
