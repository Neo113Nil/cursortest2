package kotlin.text;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class CatchingFishGsonCoroutine extends CatchingFishMockkRedux {
    public static final String[] CatchingFishCustomView = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final CatchingFishGraphQLMVVMMVP CatchingFishFragmentFactory = new CatchingFishGraphQLMVVMMVP(PointF.class, "topLeft", 0);
    public static final CatchingFishGraphQLMVVMMVP CatchingFishMutableLiveData = new CatchingFishGraphQLMVVMMVP(PointF.class, "bottomRight", 1);
    public static final CatchingFishGraphQLMVVMMVP CatchingFishJobScheduler = new CatchingFishGraphQLMVVMMVP(PointF.class, "bottomRight", 2);
    public static final CatchingFishGraphQLMVVMMVP CatchingFishPayPalService = new CatchingFishGraphQLMVVMMVP(PointF.class, "topLeft", 3);
    public static final CatchingFishGraphQLMVVMMVP CatchingFishSensorManager = new CatchingFishGraphQLMVVMMVP(PointF.class, "position", 4);

    public static void CatchingFishSensorManager(CatchingFishDaggerJUnit catchingFishDaggerJUnit) {
        View view = catchingFishDaggerJUnit.CatchingFishSnackbar;
        HashMap hashMap = catchingFishDaggerJUnit.CatchingFishParcelableFAB;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", catchingFishDaggerJUnit.CatchingFishSnackbar.getParent());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.text.CatchingFishMockkRedux
    public final Animator CatchingFishCloudMessaging(ViewGroup viewGroup, CatchingFishDaggerJUnit catchingFishDaggerJUnit, CatchingFishDaggerJUnit catchingFishDaggerJUnit2) {
        int i;
        CatchingFishGsonCoroutine catchingFishGsonCoroutine;
        ObjectAnimator CatchingFishParcelableFAB;
        if (catchingFishDaggerJUnit != null) {
            HashMap hashMap = catchingFishDaggerJUnit.CatchingFishParcelableFAB;
            if (catchingFishDaggerJUnit2 != null) {
                HashMap hashMap2 = catchingFishDaggerJUnit2.CatchingFishParcelableFAB;
                ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = catchingFishDaggerJUnit2.CatchingFishSnackbar;
                    Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
                    int i2 = rect.left;
                    int i3 = rect2.left;
                    int i4 = rect.top;
                    int i5 = rect2.top;
                    int i6 = rect.right;
                    int i7 = rect2.right;
                    int i8 = rect.bottom;
                    int i9 = rect2.bottom;
                    int i10 = i6 - i2;
                    int i11 = i8 - i4;
                    int i12 = i7 - i3;
                    int i13 = i9 - i5;
                    Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
                    if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
                        i = 0;
                    } else {
                        i = (i2 == i3 && i4 == i5) ? 0 : 1;
                        if (i6 != i7 || i8 != i9) {
                            i++;
                        }
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i++;
                    }
                    int i14 = i;
                    if (i14 > 0) {
                        CatchingFishMockkFragment.CatchingFishParcelableFAB(view, i2, i4, i6, i8);
                        if (i14 != 2) {
                            catchingFishGsonCoroutine = this;
                            if (i2 == i3 && i4 == i5) {
                                catchingFishGsonCoroutine.CatchingFishGsonAppCompat.getClass();
                                CatchingFishParcelableFAB = CatchingFishCameraXMVI.CatchingFishParcelableFAB(view, CatchingFishJobScheduler, CatchingFishMoshiGson.CatchingFishSnackbar(i6, i8, i7, i9));
                            } else {
                                catchingFishGsonCoroutine.CatchingFishGsonAppCompat.getClass();
                                CatchingFishParcelableFAB = CatchingFishCameraXMVI.CatchingFishParcelableFAB(view, CatchingFishPayPalService, CatchingFishMoshiGson.CatchingFishSnackbar(i2, i4, i3, i5));
                            }
                        } else if (i10 == i12 && i11 == i13) {
                            catchingFishGsonCoroutine = this;
                            catchingFishGsonCoroutine.CatchingFishGsonAppCompat.getClass();
                            CatchingFishParcelableFAB = CatchingFishCameraXMVI.CatchingFishParcelableFAB(view, CatchingFishSensorManager, CatchingFishMoshiGson.CatchingFishSnackbar(i2, i4, i3, i5));
                        } else {
                            catchingFishGsonCoroutine = this;
                            CatchingFishFABStripeAPI catchingFishFABStripeAPI = new CatchingFishFABStripeAPI(view);
                            catchingFishGsonCoroutine.CatchingFishGsonAppCompat.getClass();
                            ObjectAnimator CatchingFishParcelableFAB2 = CatchingFishCameraXMVI.CatchingFishParcelableFAB(catchingFishFABStripeAPI, CatchingFishFragmentFactory, CatchingFishMoshiGson.CatchingFishSnackbar(i2, i4, i3, i5));
                            catchingFishGsonCoroutine.CatchingFishGsonAppCompat.getClass();
                            ObjectAnimator CatchingFishParcelableFAB3 = CatchingFishCameraXMVI.CatchingFishParcelableFAB(catchingFishFABStripeAPI, CatchingFishMutableLiveData, CatchingFishMoshiGson.CatchingFishSnackbar(i6, i8, i7, i9));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(CatchingFishParcelableFAB2, CatchingFishParcelableFAB3);
                            animatorSet.addListener(new CatchingFishMVIFluxFABRedux(catchingFishFABStripeAPI));
                            CatchingFishParcelableFAB = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            CatchingFishKtorViewModel.CatchingFishPayPal(viewGroup4, true);
                            catchingFishGsonCoroutine.CatchingFishAnimationMockk().CatchingFishParcelableFAB(new CatchingFishFABContext(viewGroup4));
                        }
                        return CatchingFishParcelableFAB;
                    }
                }
            }
        }
        return null;
    }

    @Override // kotlin.text.CatchingFishMockkRedux
    public final void CatchingFishReduxKtor(CatchingFishDaggerJUnit catchingFishDaggerJUnit) {
        CatchingFishSensorManager(catchingFishDaggerJUnit);
    }

    @Override // kotlin.text.CatchingFishMockkRedux
    public final String[] CatchingFishRoomDatabase() {
        return CatchingFishCustomView;
    }

    @Override // kotlin.text.CatchingFishMockkRedux
    public final void CatchingFishViewModelScope(CatchingFishDaggerJUnit catchingFishDaggerJUnit) {
        CatchingFishSensorManager(catchingFishDaggerJUnit);
    }
}
