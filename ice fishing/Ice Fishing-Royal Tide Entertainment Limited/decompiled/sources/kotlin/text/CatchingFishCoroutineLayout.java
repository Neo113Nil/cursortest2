package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishCoroutineLayout implements CatchingFishMockkView {
    public final /* synthetic */ Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishCoroutineLayout(int i, Object obj) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0135, code lost:
    
        if (r2 == null) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013c  */
    @Override // kotlin.text.CatchingFishMockkView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        Collection CatchingFishMoshiDaggerHilt;
        Object obj3 = null;
        int i = 8;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishExoPlayerBundle catchingFishExoPlayerBundle = (CatchingFishExoPlayerBundle) this.CatchingFishDaggerWebsocket;
                ((Integer) obj).getClass();
                if (obj2 instanceof CatchingFishRealmWebSocket) {
                    CatchingFishRealmWebSocket catchingFishRealmWebSocket = (CatchingFishRealmWebSocket) obj2;
                    CatchingFishServiceBundle catchingFishServiceBundle = (CatchingFishServiceBundle) catchingFishExoPlayerBundle.CatchingFishLayout;
                    if (catchingFishServiceBundle == null) {
                        int i2 = CatchingFishHiltCameraX.CatchingFishParcelableFAB;
                        catchingFishServiceBundle = new CatchingFishServiceBundle();
                        catchingFishExoPlayerBundle.CatchingFishLayout = catchingFishServiceBundle;
                    }
                    catchingFishServiceBundle.CatchingFishLayout(catchingFishRealmWebSocket);
                    catchingFishExoPlayerBundle.CatchingFishReduxKtor.CatchingFishSnackbar(catchingFishRealmWebSocket);
                }
                if (obj2 instanceof CatchingFishContextJUnit) {
                    catchingFishExoPlayerBundle.CatchingFishViewModelScope((CatchingFishContextJUnit) obj2);
                }
                if (obj2 instanceof CatchingFishHiltFAB) {
                    ((CatchingFishHiltFAB) obj2).CatchingFishReduxKtor();
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case 1:
                CatchingFishMVIHandlerHilt catchingFishMVIHandlerHilt = (CatchingFishMVIHandlerHilt) this.CatchingFishDaggerWebsocket;
                Set set = (Set) obj;
                synchronized (catchingFishMVIHandlerHilt.CatchingFishSnackbar) {
                    try {
                        if (((CatchingFishContextAndroidX) catchingFishMVIHandlerHilt.CatchingFishJetpackCompose.getValue()).compareTo(CatchingFishContextAndroidX.CatchingFishViewModelFAB) >= 0) {
                            CatchingFishServiceBundle catchingFishServiceBundle2 = catchingFishMVIHandlerHilt.CatchingFishViewModelScope;
                            if (set instanceof CatchingFishCardViewRealm) {
                                CatchingFishServiceBundle catchingFishServiceBundle3 = ((CatchingFishCardViewRealm) set).CatchingFishReduxKtor;
                                Object[] objArr = catchingFishServiceBundle3.CatchingFishSnackbar;
                                long[] jArr = catchingFishServiceBundle3.CatchingFishParcelableFAB;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i3 = 0;
                                    while (true) {
                                        long j = jArr[i3];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                                            for (int i5 = 0; i5 < i4; i5++) {
                                                if ((j & 255) < 128) {
                                                    Object obj4 = objArr[(i3 << 3) + i5];
                                                    if (!(obj4 instanceof CatchingFishRetrofitPayPal) || ((CatchingFishRetrofitPayPal) obj4).CatchingFishDaggerWebsocket(1)) {
                                                        catchingFishServiceBundle2.CatchingFishParcelableFAB(obj4);
                                                    }
                                                }
                                                j >>= 8;
                                            }
                                            if (i4 != 8) {
                                            }
                                        }
                                        if (i3 != length) {
                                            i3++;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj5 : set) {
                                    if (!(obj5 instanceof CatchingFishRetrofitPayPal) || ((CatchingFishRetrofitPayPal) obj5).CatchingFishDaggerWebsocket(1)) {
                                        catchingFishServiceBundle2.CatchingFishParcelableFAB(obj5);
                                    }
                                }
                            }
                            obj3 = catchingFishMVIHandlerHilt.CatchingFishDaggerHiltFAB();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (obj3 != null) {
                    ((CatchingFishKtorMockk) obj3).CatchingFishViewModelFAB(CatchingFishRealmContext.CatchingFishParcelableFAB);
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case 2:
                CatchingFishAdMobHilt catchingFishAdMobHilt = (CatchingFishAdMobHilt) this.CatchingFishDaggerWebsocket;
                int intValue = ((Integer) obj).intValue();
                CatchingFishPicassoContext catchingFishPicassoContext = (CatchingFishPicassoContext) obj2;
                CatchingFishGlidePayPal key = catchingFishPicassoContext.getKey();
                Object CatchingFishCoroutineFlow = catchingFishAdMobHilt.CatchingFishViewModelFAB.CatchingFishCoroutineFlow(key);
                if (key != CatchingFishMVPExoPlayer.CatchingFishLayout) {
                    if (catchingFishPicassoContext != CatchingFishCoroutineFlow) {
                        intValue = Integer.MIN_VALUE;
                    }
                    intValue++;
                } else {
                    Object obj6 = (CatchingFishRoomViewGson) CatchingFishCoroutineFlow;
                    Object obj7 = (CatchingFishRoomViewGson) catchingFishPicassoContext;
                    while (obj7 != null) {
                        if (obj7 != obj6 && (obj7 instanceof CatchingFishLifecycleGlide)) {
                            CatchingFishMVVMRobolectric catchingFishMVVMRobolectric = (CatchingFishMVVMRobolectric) CatchingFishPicassoView.CatchingFishDaggerWebsocket.get((CatchingFishLifecycleGlide) obj7);
                            obj7 = catchingFishMVVMRobolectric != null ? catchingFishMVVMRobolectric.getParent() : null;
                        } else {
                            obj3 = obj7;
                            if (obj3 == obj6) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + obj3 + ", expected child of " + obj6 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                        }
                    }
                    if (obj3 == obj6) {
                    }
                }
                return Integer.valueOf(intValue);
            case 3:
                CatchingFishPicassoCameraX catchingFishPicassoCameraX = (CatchingFishPicassoCameraX) this.CatchingFishDaggerWebsocket;
                Set set2 = (Set) obj;
                if (!(set2 instanceof CatchingFishCardViewRealm)) {
                    Set set3 = set2;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        for (Object obj8 : set3) {
                            if ((obj8 instanceof CatchingFishRetrofitPayPal) && !((CatchingFishRetrofitPayPal) obj8).CatchingFishDaggerWebsocket(4)) {
                            }
                            catchingFishPicassoCameraX.CatchingFish(set2);
                        }
                    }
                    return CatchingFishRealmContext.CatchingFishParcelableFAB;
                }
                CatchingFishServiceBundle catchingFishServiceBundle4 = ((CatchingFishCardViewRealm) set2).CatchingFishReduxKtor;
                Object[] objArr2 = catchingFishServiceBundle4.CatchingFishSnackbar;
                long[] jArr2 = catchingFishServiceBundle4.CatchingFishParcelableFAB;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j2 = jArr2[i6];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8 - ((~(i6 - length2)) >>> 31);
                            for (int i8 = 0; i8 < i7; i8++) {
                                if ((j2 & 255) < 128) {
                                    Object obj9 = objArr2[(i6 << 3) + i8];
                                    if ((obj9 instanceof CatchingFishRetrofitPayPal) && !((CatchingFishRetrofitPayPal) obj9).CatchingFishDaggerWebsocket(4)) {
                                    }
                                }
                                j2 >>= 8;
                            }
                            if (i7 != 8) {
                            }
                        }
                        if (i6 != length2) {
                            i6++;
                        }
                    }
                    catchingFishPicassoCameraX.CatchingFish(set2);
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            default:
                CatchingFishViewMVPAndroidX catchingFishViewMVPAndroidX = (CatchingFishViewMVPAndroidX) this.CatchingFishDaggerWebsocket;
                Collection collection = (Set) obj;
                AtomicReference atomicReference = catchingFishViewMVPAndroidX.CatchingFishSnackbar;
                while (true) {
                    Object obj10 = atomicReference.get();
                    if (obj10 == null) {
                        CatchingFishMoshiDaggerHilt = collection;
                    } else if (obj10 instanceof Set) {
                        CatchingFishMoshiDaggerHilt = CatchingFishToastCustomView.CatchingFishLayoutInflater(obj10, collection);
                    } else {
                        if (!(obj10 instanceof List)) {
                            CatchingFishUnitTestingFlux.CatchingFishReduxKtor("Unexpected notification");
                            throw new CatchingFishBiometricView();
                        }
                        CatchingFishMoshiDaggerHilt = CatchingFishCameraXCameraX.CatchingFishMoshiDaggerHilt((Collection) obj10, CatchingFishGsonCardView.CatchingFishFragmentFactory(collection));
                    }
                    while (!atomicReference.compareAndSet(obj10, CatchingFishMoshiDaggerHilt)) {
                        if (atomicReference.get() != obj10) {
                            break;
                        }
                    }
                    if (catchingFishViewMVPAndroidX.CatchingFishParcelableFAB()) {
                        catchingFishViewMVPAndroidX.CatchingFishParcelableFAB.CatchingFishFragmentHandler(new CatchingFishFluxPicasso(i, catchingFishViewMVPAndroidX));
                    }
                    return CatchingFishRealmContext.CatchingFishParcelableFAB;
                    break;
                }
        }
    }
}
