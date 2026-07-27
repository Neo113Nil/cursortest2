package kotlin.text;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishGsonUnitTesting extends CatchingFishFluxAppCompat {
    public static TimeInterpolator CatchingFish;
    public ArrayList CatchingFishAnimationMockk;
    public ArrayList CatchingFishCloudMessaging;
    public ArrayList CatchingFishEspressoTesting;
    public ArrayList CatchingFishFragmentHandler;
    public ArrayList CatchingFishLayout;
    public ArrayList CatchingFishNavigation;
    public ArrayList CatchingFishOkHttp;
    public ArrayList CatchingFishRoomDatabase;
    public ArrayList CatchingFishStateLiveData;
    public ArrayList CatchingFishUnitTesting;
    public ArrayList CatchingFishViewModelFAB;
    public boolean CatchingFishViewModelScope;

    public static void CatchingFishViewModelFAB(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((CatchingFishPayPalCardView) arrayList.get(size)).CatchingFishParcelableFAB.animate().cancel();
        }
    }

    public final boolean CatchingFishCloudMessaging(CatchingFishMVPGradle catchingFishMVPGradle, CatchingFishPayPalCardView catchingFishPayPalCardView) {
        if (catchingFishMVPGradle.CatchingFishSnackbar == catchingFishPayPalCardView) {
            catchingFishMVPGradle.CatchingFishSnackbar = null;
        } else {
            if (catchingFishMVPGradle.CatchingFishParcelableFAB != catchingFishPayPalCardView) {
                return false;
            }
            catchingFishMVPGradle.CatchingFishParcelableFAB = null;
        }
        View view = catchingFishPayPalCardView.CatchingFishParcelableFAB;
        View view2 = catchingFishPayPalCardView.CatchingFishParcelableFAB;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        CatchingFishCoroutine(catchingFishPayPalCardView);
        return true;
    }

    @Override // kotlin.text.CatchingFishFluxAppCompat
    public final void CatchingFishDaggerWebsocket() {
        ArrayList arrayList = this.CatchingFishUnitTesting;
        ArrayList arrayList2 = this.CatchingFishEspressoTesting;
        ArrayList arrayList3 = this.CatchingFishOkHttp;
        ArrayList arrayList4 = this.CatchingFishCloudMessaging;
        ArrayList arrayList5 = this.CatchingFishLayout;
        ArrayList arrayList6 = this.CatchingFishViewModelFAB;
        ArrayList arrayList7 = this.CatchingFishFragmentHandler;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            CatchingFishMVIFlux catchingFishMVIFlux = (CatchingFishMVIFlux) arrayList7.get(size);
            View view = catchingFishMVIFlux.CatchingFishParcelableFAB.CatchingFishParcelableFAB;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            CatchingFishCoroutine(catchingFishMVIFlux.CatchingFishParcelableFAB);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            CatchingFishCoroutine((CatchingFishPayPalCardView) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            CatchingFishPayPalCardView catchingFishPayPalCardView = (CatchingFishPayPalCardView) arrayList5.get(size3);
            catchingFishPayPalCardView.CatchingFishParcelableFAB.setAlpha(1.0f);
            CatchingFishCoroutine(catchingFishPayPalCardView);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            CatchingFishMVPGradle catchingFishMVPGradle = (CatchingFishMVPGradle) arrayList4.get(size4);
            CatchingFishPayPalCardView catchingFishPayPalCardView2 = catchingFishMVPGradle.CatchingFishParcelableFAB;
            if (catchingFishPayPalCardView2 != null) {
                CatchingFishCloudMessaging(catchingFishMVPGradle, catchingFishPayPalCardView2);
            }
            CatchingFishPayPalCardView catchingFishPayPalCardView3 = catchingFishMVPGradle.CatchingFishSnackbar;
            if (catchingFishPayPalCardView3 != null) {
                CatchingFishCloudMessaging(catchingFishMVPGradle, catchingFishPayPalCardView3);
            }
        }
        arrayList4.clear();
        if (CatchingFishWorkManager()) {
            for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList3.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    CatchingFishMVIFlux catchingFishMVIFlux2 = (CatchingFishMVIFlux) arrayList8.get(size6);
                    View view2 = catchingFishMVIFlux2.CatchingFishParcelableFAB.CatchingFishParcelableFAB;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    CatchingFishCoroutine(catchingFishMVIFlux2.CatchingFishParcelableFAB);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList3.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList2.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    CatchingFishPayPalCardView catchingFishPayPalCardView4 = (CatchingFishPayPalCardView) arrayList9.get(size8);
                    catchingFishPayPalCardView4.CatchingFishParcelableFAB.setAlpha(1.0f);
                    CatchingFishCoroutine(catchingFishPayPalCardView4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList2.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    CatchingFishMVPGradle catchingFishMVPGradle2 = (CatchingFishMVPGradle) arrayList10.get(size10);
                    CatchingFishPayPalCardView catchingFishPayPalCardView5 = catchingFishMVPGradle2.CatchingFishParcelableFAB;
                    if (catchingFishPayPalCardView5 != null) {
                        CatchingFishCloudMessaging(catchingFishMVPGradle2, catchingFishPayPalCardView5);
                    }
                    CatchingFishPayPalCardView catchingFishPayPalCardView6 = catchingFishMVPGradle2.CatchingFishSnackbar;
                    if (catchingFishPayPalCardView6 != null) {
                        CatchingFishCloudMessaging(catchingFishMVPGradle2, catchingFishPayPalCardView6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList.remove(arrayList10);
                    }
                }
            }
            CatchingFishViewModelFAB(this.CatchingFishRoomDatabase);
            CatchingFishViewModelFAB(this.CatchingFishStateLiveData);
            CatchingFishViewModelFAB(this.CatchingFishAnimationMockk);
            CatchingFishViewModelFAB(this.CatchingFishNavigation);
            ArrayList arrayList11 = this.CatchingFishSnackbar;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    public final void CatchingFishEspressoTesting(CatchingFishPayPalCardView catchingFishPayPalCardView) {
        if (CatchingFish == null) {
            CatchingFish = new ValueAnimator().getInterpolator();
        }
        catchingFishPayPalCardView.CatchingFishParcelableFAB.animate().setInterpolator(CatchingFish);
        CatchingFishReduxKtor(catchingFishPayPalCardView);
    }

    public final void CatchingFishFragmentHandler(ArrayList arrayList, CatchingFishPayPalCardView catchingFishPayPalCardView) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            CatchingFishMVPGradle catchingFishMVPGradle = (CatchingFishMVPGradle) arrayList.get(size);
            if (CatchingFishCloudMessaging(catchingFishMVPGradle, catchingFishPayPalCardView) && catchingFishMVPGradle.CatchingFishParcelableFAB == null && catchingFishMVPGradle.CatchingFishSnackbar == null) {
                arrayList.remove(catchingFishMVPGradle);
            }
        }
    }

    public final void CatchingFishLayout() {
        if (CatchingFishWorkManager()) {
            return;
        }
        ArrayList arrayList = this.CatchingFishSnackbar;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    @Override // kotlin.text.CatchingFishFluxAppCompat
    public final boolean CatchingFishParcelableFAB(CatchingFishPayPalCardView catchingFishPayPalCardView, CatchingFishPayPalCardView catchingFishPayPalCardView2, CatchingFishToastCoroutine catchingFishToastCoroutine, CatchingFishToastCoroutine catchingFishToastCoroutine2) {
        int i;
        int i2;
        int i3 = catchingFishToastCoroutine.CatchingFishParcelableFAB;
        int i4 = catchingFishToastCoroutine.CatchingFishSnackbar;
        if (catchingFishPayPalCardView2.CatchingFishAnimationMockk()) {
            int i5 = catchingFishToastCoroutine.CatchingFishParcelableFAB;
            i2 = catchingFishToastCoroutine.CatchingFishSnackbar;
            i = i5;
        } else {
            i = catchingFishToastCoroutine2.CatchingFishParcelableFAB;
            i2 = catchingFishToastCoroutine2.CatchingFishSnackbar;
        }
        if (catchingFishPayPalCardView == catchingFishPayPalCardView2) {
            return CatchingFishViewModelScope(catchingFishPayPalCardView, i3, i4, i, i2);
        }
        View view = catchingFishPayPalCardView.CatchingFishParcelableFAB;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        CatchingFishEspressoTesting(catchingFishPayPalCardView);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = catchingFishPayPalCardView2.CatchingFishParcelableFAB;
        CatchingFishEspressoTesting(catchingFishPayPalCardView2);
        view2.setTranslationX(-((int) ((i - i3) - translationX)));
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.CatchingFishCloudMessaging;
        CatchingFishMVPGradle catchingFishMVPGradle = new CatchingFishMVPGradle();
        catchingFishMVPGradle.CatchingFishParcelableFAB = catchingFishPayPalCardView;
        catchingFishMVPGradle.CatchingFishSnackbar = catchingFishPayPalCardView2;
        catchingFishMVPGradle.CatchingFishCoroutine = i3;
        catchingFishMVPGradle.CatchingFishReduxKtor = i4;
        catchingFishMVPGradle.CatchingFishDaggerWebsocket = i;
        catchingFishMVPGradle.CatchingFishWorkManager = i2;
        arrayList.add(catchingFishMVPGradle);
        return true;
    }

    @Override // kotlin.text.CatchingFishFluxAppCompat
    public final void CatchingFishReduxKtor(CatchingFishPayPalCardView catchingFishPayPalCardView) {
        ArrayList arrayList = this.CatchingFishEspressoTesting;
        ArrayList arrayList2 = this.CatchingFishOkHttp;
        ArrayList arrayList3 = this.CatchingFishUnitTesting;
        View view = catchingFishPayPalCardView.CatchingFishParcelableFAB;
        view.animate().cancel();
        ArrayList arrayList4 = this.CatchingFishFragmentHandler;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((CatchingFishMVIFlux) arrayList4.get(size)).CatchingFishParcelableFAB == catchingFishPayPalCardView) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                CatchingFishCoroutine(catchingFishPayPalCardView);
                arrayList4.remove(size);
            }
        }
        CatchingFishFragmentHandler(this.CatchingFishCloudMessaging, catchingFishPayPalCardView);
        if (this.CatchingFishViewModelFAB.remove(catchingFishPayPalCardView)) {
            view.setAlpha(1.0f);
            CatchingFishCoroutine(catchingFishPayPalCardView);
        }
        if (this.CatchingFishLayout.remove(catchingFishPayPalCardView)) {
            view.setAlpha(1.0f);
            CatchingFishCoroutine(catchingFishPayPalCardView);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            CatchingFishFragmentHandler(arrayList5, catchingFishPayPalCardView);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            int size4 = arrayList6.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((CatchingFishMVIFlux) arrayList6.get(size4)).CatchingFishParcelableFAB == catchingFishPayPalCardView) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    CatchingFishCoroutine(catchingFishPayPalCardView);
                    arrayList6.remove(size4);
                    if (arrayList6.isEmpty()) {
                        arrayList2.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(catchingFishPayPalCardView)) {
                view.setAlpha(1.0f);
                CatchingFishCoroutine(catchingFishPayPalCardView);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.CatchingFishRoomDatabase.remove(catchingFishPayPalCardView);
        this.CatchingFishAnimationMockk.remove(catchingFishPayPalCardView);
        this.CatchingFishNavigation.remove(catchingFishPayPalCardView);
        this.CatchingFishStateLiveData.remove(catchingFishPayPalCardView);
        CatchingFishLayout();
    }

    public final boolean CatchingFishViewModelScope(CatchingFishPayPalCardView catchingFishPayPalCardView, int i, int i2, int i3, int i4) {
        View view = catchingFishPayPalCardView.CatchingFishParcelableFAB;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) catchingFishPayPalCardView.CatchingFishParcelableFAB.getTranslationY());
        CatchingFishEspressoTesting(catchingFishPayPalCardView);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            CatchingFishCoroutine(catchingFishPayPalCardView);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.CatchingFishFragmentHandler;
        CatchingFishMVIFlux catchingFishMVIFlux = new CatchingFishMVIFlux();
        catchingFishMVIFlux.CatchingFishParcelableFAB = catchingFishPayPalCardView;
        catchingFishMVIFlux.CatchingFishSnackbar = translationX;
        catchingFishMVIFlux.CatchingFishCoroutine = translationY;
        catchingFishMVIFlux.CatchingFishReduxKtor = i3;
        catchingFishMVIFlux.CatchingFishDaggerWebsocket = i4;
        arrayList.add(catchingFishMVIFlux);
        return true;
    }

    @Override // kotlin.text.CatchingFishFluxAppCompat
    public final boolean CatchingFishWorkManager() {
        return (this.CatchingFishLayout.isEmpty() && this.CatchingFishCloudMessaging.isEmpty() && this.CatchingFishFragmentHandler.isEmpty() && this.CatchingFishViewModelFAB.isEmpty() && this.CatchingFishStateLiveData.isEmpty() && this.CatchingFishRoomDatabase.isEmpty() && this.CatchingFishAnimationMockk.isEmpty() && this.CatchingFishNavigation.isEmpty() && this.CatchingFishOkHttp.isEmpty() && this.CatchingFishEspressoTesting.isEmpty() && this.CatchingFishUnitTesting.isEmpty()) ? false : true;
    }
}
