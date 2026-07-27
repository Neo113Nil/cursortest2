package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishGsonReduxPayPal extends CatchingFishRetrofitPayPal implements CatchingFishLayoutMoshi {
    public final CatchingFishFragmentPayPal CatchingFishDaggerWebsocket;
    public CatchingFishMVPParcelable CatchingFishWorkManager = new CatchingFishMVPParcelable(CatchingFishIntentBundle.CatchingFishCloudMessaging().CatchingFishViewModelScope());

    public CatchingFishGsonReduxPayPal(CatchingFishFragmentPayPal catchingFishFragmentPayPal) {
        this.CatchingFishDaggerWebsocket = catchingFishFragmentPayPal;
    }

    @Override // kotlin.text.CatchingFishJUnitViewPager
    public final CatchingFishGraphQLMVIFAB CatchingFishParcelableFAB() {
        return this.CatchingFishWorkManager;
    }

    @Override // kotlin.text.CatchingFishJUnitViewPager
    public final void CatchingFishSnackbar(CatchingFishGraphQLMVIFAB catchingFishGraphQLMVIFAB) {
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishGraphQLMVIFAB, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.CatchingFishWorkManager = (CatchingFishMVPParcelable) catchingFishGraphQLMVIFAB;
    }

    public final CatchingFishMVPParcelable CatchingFishViewModelFAB() {
        CatchingFishOkHttpStripeAPI CatchingFishCloudMessaging = CatchingFishIntentBundle.CatchingFishCloudMessaging();
        return CatchingFishViewModelScope((CatchingFishMVPParcelable) CatchingFishIntentBundle.CatchingFishFragmentHandler(this.CatchingFishWorkManager, CatchingFishCloudMessaging), CatchingFishCloudMessaging, false, this.CatchingFishDaggerWebsocket);
    }

    public final CatchingFishMVPParcelable CatchingFishViewModelScope(CatchingFishMVPParcelable catchingFishMVPParcelable, CatchingFishOkHttpStripeAPI catchingFishOkHttpStripeAPI, boolean z, CatchingFishJUnitGlide catchingFishJUnitGlide) {
        CatchingFishFABToast CatchingFishEspressoTesting;
        CatchingFishOkHttpStripeAPI CatchingFishCloudMessaging;
        CatchingFishGraphQLMVIFAB CatchingFishOkHttp;
        CatchingFishMVPParcelable catchingFishMVPParcelable2;
        CatchingFishGraphQLOkHttp catchingFishGraphQLOkHttp;
        int i;
        if (catchingFishMVPParcelable.CatchingFishCoroutine(this, catchingFishOkHttpStripeAPI)) {
            if (z) {
                CatchingFishEspressoTesting = CatchingFishLayoutRoom.CatchingFishEspressoTesting();
                Object[] objArr = CatchingFishEspressoTesting.CatchingFishReduxKtor;
                int i2 = CatchingFishEspressoTesting.CatchingFishWorkManager;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((CatchingFishDaggerMVP) objArr[i3]).CatchingFishSnackbar();
                }
                try {
                    CatchingFishJUnitService catchingFishJUnitService = catchingFishMVPParcelable.CatchingFishDaggerWebsocket;
                    CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = CatchingFishGlideJUnit.CatchingFishParcelableFAB;
                    CatchingFishGraphQLOkHttp catchingFishGraphQLOkHttp2 = (CatchingFishGraphQLOkHttp) catchingFishAsyncTaskDagger.get();
                    if (catchingFishGraphQLOkHttp2 == null) {
                        catchingFishGraphQLOkHttp2 = new CatchingFishGraphQLOkHttp();
                        catchingFishAsyncTaskDagger.CatchingFishStripeAPI(catchingFishGraphQLOkHttp2);
                    }
                    int i4 = catchingFishGraphQLOkHttp2.CatchingFishParcelableFAB;
                    Object[] objArr2 = catchingFishJUnitService.CatchingFishSnackbar;
                    int[] iArr = catchingFishJUnitService.CatchingFishCoroutine;
                    long[] jArr = catchingFishJUnitService.CatchingFishParcelableFAB;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        i = i6;
                                        CatchingFishJUnitViewPager catchingFishJUnitViewPager = (CatchingFishJUnitViewPager) objArr2[i9];
                                        catchingFishGraphQLOkHttp2.CatchingFishParcelableFAB = i4 + iArr[i9];
                                        CatchingFishServiceHandler CatchingFishDaggerWebsocket = catchingFishOkHttpStripeAPI.CatchingFishDaggerWebsocket();
                                        if (CatchingFishDaggerWebsocket != null) {
                                            CatchingFishDaggerWebsocket.CatchingFishFragmentHandler(catchingFishJUnitViewPager);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                            }
                            if (i5 == length) {
                                break;
                            }
                            i5++;
                        }
                    }
                    catchingFishGraphQLOkHttp2.CatchingFishParcelableFAB = i4;
                    Object[] objArr3 = CatchingFishEspressoTesting.CatchingFishReduxKtor;
                    int i10 = CatchingFishEspressoTesting.CatchingFishWorkManager;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((CatchingFishDaggerMVP) objArr3[i11]).CatchingFishParcelableFAB();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return catchingFishMVPParcelable;
        }
        final CatchingFishJUnitService catchingFishJUnitService2 = new CatchingFishJUnitService();
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger2 = CatchingFishGlideJUnit.CatchingFishParcelableFAB;
        final CatchingFishGraphQLOkHttp catchingFishGraphQLOkHttp3 = (CatchingFishGraphQLOkHttp) catchingFishAsyncTaskDagger2.get();
        if (catchingFishGraphQLOkHttp3 == null) {
            catchingFishGraphQLOkHttp3 = new CatchingFishGraphQLOkHttp();
            catchingFishAsyncTaskDagger2.CatchingFishStripeAPI(catchingFishGraphQLOkHttp3);
        }
        final int i12 = catchingFishGraphQLOkHttp3.CatchingFishParcelableFAB;
        CatchingFishEspressoTesting = CatchingFishLayoutRoom.CatchingFishEspressoTesting();
        Object[] objArr4 = CatchingFishEspressoTesting.CatchingFishReduxKtor;
        int i13 = CatchingFishEspressoTesting.CatchingFishWorkManager;
        for (int i14 = 0; i14 < i13; i14++) {
            ((CatchingFishDaggerMVP) objArr4[i14]).CatchingFishSnackbar();
        }
        try {
            catchingFishGraphQLOkHttp3.CatchingFishParcelableFAB = i12 + 1;
            Object CatchingFishCustomView = CatchingFishDaggerBiometric.CatchingFishCustomView(catchingFishJUnitGlide, new CatchingFishServiceHandler() { // from class: kotlin.text.CatchingFishGradleSnackbar
                @Override // kotlin.text.CatchingFishServiceHandler
                public final Object CatchingFishFragmentHandler(Object obj) {
                    if (obj == CatchingFishGsonReduxPayPal.this) {
                        throw new IllegalStateException("A derived state calculation cannot read itself");
                    }
                    if (obj instanceof CatchingFishJUnitViewPager) {
                        int i15 = catchingFishGraphQLOkHttp3.CatchingFishParcelableFAB - i12;
                        CatchingFishJUnitService catchingFishJUnitService3 = catchingFishJUnitService2;
                        int CatchingFishReduxKtor = catchingFishJUnitService3.CatchingFishReduxKtor(obj);
                        catchingFishJUnitService3.CatchingFishViewModelFAB(Math.min(i15, CatchingFishReduxKtor >= 0 ? catchingFishJUnitService3.CatchingFishCoroutine[CatchingFishReduxKtor] : Integer.MAX_VALUE), obj);
                    }
                    return CatchingFishRealmContext.CatchingFishParcelableFAB;
                }
            });
            catchingFishGraphQLOkHttp3.CatchingFishParcelableFAB = i12;
            Object[] objArr5 = CatchingFishEspressoTesting.CatchingFishReduxKtor;
            int i15 = CatchingFishEspressoTesting.CatchingFishWorkManager;
            for (int i16 = 0; i16 < i15; i16++) {
                ((CatchingFishDaggerMVP) objArr5[i16]).CatchingFishParcelableFAB();
            }
            Object obj = CatchingFishIntentBundle.CatchingFishCoroutine;
            synchronized (obj) {
                CatchingFishCloudMessaging = CatchingFishIntentBundle.CatchingFishCloudMessaging();
                CatchingFishMVPParcelable catchingFishMVPParcelable3 = this.CatchingFishWorkManager;
                synchronized (obj) {
                    CatchingFishOkHttp = CatchingFishIntentBundle.CatchingFishOkHttp(catchingFishMVPParcelable3, this);
                    CatchingFishOkHttp.CatchingFishParcelableFAB(catchingFishMVPParcelable3);
                    CatchingFishOkHttp.CatchingFishParcelableFAB = CatchingFishCloudMessaging.CatchingFishViewModelScope();
                }
                catchingFishGraphQLOkHttp = (CatchingFishGraphQLOkHttp) CatchingFishGlideJUnit.CatchingFishParcelableFAB.get();
                if (catchingFishGraphQLOkHttp != null || catchingFishGraphQLOkHttp.CatchingFishParcelableFAB != 0) {
                    return catchingFishMVPParcelable2;
                }
                CatchingFishIntentBundle.CatchingFishCloudMessaging().CatchingFishOkHttp();
                synchronized (obj) {
                    CatchingFishOkHttpStripeAPI CatchingFishCloudMessaging2 = CatchingFishIntentBundle.CatchingFishCloudMessaging();
                    catchingFishMVPParcelable2.CatchingFishCoroutine = CatchingFishCloudMessaging2.CatchingFishViewModelScope();
                    catchingFishMVPParcelable2.CatchingFishReduxKtor = CatchingFishCloudMessaging2.CatchingFishViewModelFAB();
                }
                return catchingFishMVPParcelable2;
            }
            catchingFishMVPParcelable2 = (CatchingFishMVPParcelable) CatchingFishOkHttp;
            catchingFishMVPParcelable2.CatchingFishDaggerWebsocket = catchingFishJUnitService2;
            catchingFishMVPParcelable2.CatchingFishViewModelScope = catchingFishMVPParcelable2.CatchingFishReduxKtor(this, CatchingFishCloudMessaging);
            catchingFishMVPParcelable2.CatchingFishWorkManager = CatchingFishCustomView;
            catchingFishGraphQLOkHttp = (CatchingFishGraphQLOkHttp) CatchingFishGlideJUnit.CatchingFishParcelableFAB.get();
            if (catchingFishGraphQLOkHttp != null) {
            }
            return catchingFishMVPParcelable2;
        } finally {
            Object[] objArr6 = CatchingFishEspressoTesting.CatchingFishReduxKtor;
            int i17 = CatchingFishEspressoTesting.CatchingFishWorkManager;
            for (int i18 = 0; i18 < i17; i18++) {
                ((CatchingFishDaggerMVP) objArr6[i18]).CatchingFishParcelableFAB();
            }
        }
    }

    @Override // kotlin.text.CatchingFishLayoutMoshi
    public final Object getValue() {
        CatchingFishServiceHandler CatchingFishDaggerWebsocket = CatchingFishIntentBundle.CatchingFishCloudMessaging().CatchingFishDaggerWebsocket();
        if (CatchingFishDaggerWebsocket != null) {
            CatchingFishDaggerWebsocket.CatchingFishFragmentHandler(this);
        }
        CatchingFishOkHttpStripeAPI CatchingFishCloudMessaging = CatchingFishIntentBundle.CatchingFishCloudMessaging();
        return CatchingFishViewModelScope((CatchingFishMVPParcelable) CatchingFishIntentBundle.CatchingFishFragmentHandler(this.CatchingFishWorkManager, CatchingFishCloudMessaging), CatchingFishCloudMessaging, true, this.CatchingFishDaggerWebsocket).CatchingFishWorkManager;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        CatchingFishMVPParcelable catchingFishMVPParcelable = (CatchingFishMVPParcelable) CatchingFishIntentBundle.CatchingFishLayout(this.CatchingFishWorkManager);
        sb.append(catchingFishMVPParcelable.CatchingFishCoroutine(this, CatchingFishIntentBundle.CatchingFishCloudMessaging()) ? String.valueOf(catchingFishMVPParcelable.CatchingFishWorkManager) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
