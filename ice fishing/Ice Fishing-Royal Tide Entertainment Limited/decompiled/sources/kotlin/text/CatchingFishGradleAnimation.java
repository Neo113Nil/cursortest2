package kotlin.text;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishGradleAnimation implements Runnable {
    public final /* synthetic */ ArrayList CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ CatchingFishGsonUnitTesting CatchingFishWorkManager;

    public /* synthetic */ CatchingFishGradleAnimation(CatchingFishGsonUnitTesting catchingFishGsonUnitTesting, ArrayList arrayList, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishWorkManager = catchingFishGsonUnitTesting;
        this.CatchingFishDaggerWebsocket = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ArrayList arrayList = this.CatchingFishDaggerWebsocket;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    CatchingFishGsonUnitTesting catchingFishGsonUnitTesting = this.CatchingFishWorkManager;
                    if (i >= size) {
                        arrayList.clear();
                        catchingFishGsonUnitTesting.CatchingFishOkHttp.remove(arrayList);
                        break;
                    } else {
                        Object obj = arrayList.get(i);
                        i++;
                        CatchingFishMVIFlux catchingFishMVIFlux = (CatchingFishMVIFlux) obj;
                        CatchingFishPayPalCardView catchingFishPayPalCardView = catchingFishMVIFlux.CatchingFishParcelableFAB;
                        int i2 = catchingFishMVIFlux.CatchingFishSnackbar;
                        int i3 = catchingFishMVIFlux.CatchingFishCoroutine;
                        int i4 = catchingFishMVIFlux.CatchingFishReduxKtor;
                        int i5 = catchingFishMVIFlux.CatchingFishDaggerWebsocket;
                        catchingFishGsonUnitTesting.getClass();
                        View view = catchingFishPayPalCardView.CatchingFishParcelableFAB;
                        int i6 = i4 - i2;
                        int i7 = i5 - i3;
                        if (i6 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i7 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        catchingFishGsonUnitTesting.CatchingFishStateLiveData.add(catchingFishPayPalCardView);
                        animate.setDuration(catchingFishGsonUnitTesting.CatchingFishDaggerWebsocket).setListener(new CatchingFishFluxAsyncTask(catchingFishGsonUnitTesting, catchingFishPayPalCardView, i6, view, i7, animate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.CatchingFishDaggerWebsocket;
                int size2 = arrayList2.size();
                int i8 = 0;
                while (true) {
                    CatchingFishGsonUnitTesting catchingFishGsonUnitTesting2 = this.CatchingFishWorkManager;
                    if (i8 >= size2) {
                        arrayList2.clear();
                        catchingFishGsonUnitTesting2.CatchingFishUnitTesting.remove(arrayList2);
                        break;
                    } else {
                        Object obj2 = arrayList2.get(i8);
                        i8++;
                        CatchingFishMVPGradle catchingFishMVPGradle = (CatchingFishMVPGradle) obj2;
                        ArrayList arrayList3 = catchingFishGsonUnitTesting2.CatchingFishNavigation;
                        long j = catchingFishGsonUnitTesting2.CatchingFishWorkManager;
                        CatchingFishPayPalCardView catchingFishPayPalCardView2 = catchingFishMVPGradle.CatchingFishParcelableFAB;
                        View view2 = catchingFishPayPalCardView2 == null ? null : catchingFishPayPalCardView2.CatchingFishParcelableFAB;
                        CatchingFishPayPalCardView catchingFishPayPalCardView3 = catchingFishMVPGradle.CatchingFishSnackbar;
                        View view3 = catchingFishPayPalCardView3 != null ? catchingFishPayPalCardView3.CatchingFishParcelableFAB : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList3.add(catchingFishMVPGradle.CatchingFishParcelableFAB);
                            duration.translationX(catchingFishMVPGradle.CatchingFishDaggerWebsocket - catchingFishMVPGradle.CatchingFishCoroutine);
                            duration.translationY(catchingFishMVPGradle.CatchingFishWorkManager - catchingFishMVPGradle.CatchingFishReduxKtor);
                            duration.alpha(0.0f).setListener(new CatchingFishGoogleMapsToast(catchingFishGsonUnitTesting2, catchingFishMVPGradle, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList3.add(catchingFishMVPGradle.CatchingFishSnackbar);
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new CatchingFishGoogleMapsToast(catchingFishGsonUnitTesting2, catchingFishMVPGradle, animate2, view3, 1)).start();
                        }
                    }
                }
            default:
                ArrayList arrayList4 = this.CatchingFishDaggerWebsocket;
                int size3 = arrayList4.size();
                int i9 = 0;
                while (true) {
                    CatchingFishGsonUnitTesting catchingFishGsonUnitTesting3 = this.CatchingFishWorkManager;
                    if (i9 >= size3) {
                        arrayList4.clear();
                        catchingFishGsonUnitTesting3.CatchingFishEspressoTesting.remove(arrayList4);
                        break;
                    } else {
                        Object obj3 = arrayList4.get(i9);
                        i9++;
                        CatchingFishPayPalCardView catchingFishPayPalCardView4 = (CatchingFishPayPalCardView) obj3;
                        catchingFishGsonUnitTesting3.getClass();
                        View view4 = catchingFishPayPalCardView4.CatchingFishParcelableFAB;
                        ViewPropertyAnimator animate3 = view4.animate();
                        catchingFishGsonUnitTesting3.CatchingFishAnimationMockk.add(catchingFishPayPalCardView4);
                        animate3.alpha(1.0f).setDuration(catchingFishGsonUnitTesting3.CatchingFishCoroutine).setListener(new CatchingFishToastAndroidX(catchingFishGsonUnitTesting3, catchingFishPayPalCardView4, view4, animate3)).start();
                    }
                }
        }
    }
}
