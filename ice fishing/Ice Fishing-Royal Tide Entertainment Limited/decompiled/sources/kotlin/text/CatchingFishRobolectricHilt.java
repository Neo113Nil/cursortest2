package kotlin.text;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EdgeEffect;
import android.widget.ImageView;
import android.widget.TextView;
import com.adjust.sdk.Constants;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class CatchingFishRobolectricHilt implements CatchingFishToastBundle {
    public static final char[] CatchingFishReduxKtor = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final float[][] CatchingFishDaggerWebsocket = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] CatchingFishWorkManager = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] CatchingFishViewModelScope = {95.047f, 100.0f, 108.883f};
    public static final float[][] CatchingFishViewModelFAB = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final CatchingFishPayPalCoroutine CatchingFishLayout = new CatchingFishPayPalCoroutine(new CatchingFishBundleMVI());
    public static final String[] CatchingFishFragmentHandler = new String[0];
    public static final CatchingFishRealmMVPKtor CatchingFishCloudMessaging = new CatchingFishRealmMVPKtor(0.31006f, 0.31616f);
    public static final CatchingFishRealmMVPKtor CatchingFishEspressoTesting = new CatchingFishRealmMVPKtor(0.34567f, 0.3585f);
    public static final CatchingFishRealmMVPKtor CatchingFishOkHttp = new CatchingFishRealmMVPKtor(0.32168f, 0.33767f);
    public static final CatchingFishRealmMVPKtor CatchingFishUnitTesting = new CatchingFishRealmMVPKtor(0.31271f, 0.32902f);
    public static final float[] CatchingFishAnimationMockk = {0.964212f, 1.0f, 0.825188f};
    public static final boolean[] CatchingFishStateLiveData = new boolean[3];
    public static final CatchingFishCoroutineBundle CatchingFishRoomDatabase = new CatchingFishCoroutineBundle(2);
    public static final CatchingFishFluxWorkManager CatchingFishNavigation = new CatchingFishFluxWorkManager("NO_VALUE", 1);
    public static final CatchingFishMVVMCoroutine CatchingFish = new CatchingFishMVVMCoroutine(10);

    public static final boolean CatchingFish(long j, long j2) {
        return j == j2;
    }

    public static final CatchingFishToastIntent CatchingFishAnimation(CatchingFishWebsocketGradle catchingFishWebsocketGradle, CatchingFishManifestMockk catchingFishManifestMockk, Object obj) {
        CatchingFishToastIntent catchingFishToastIntent = null;
        if ((catchingFishWebsocketGradle instanceof CatchingFishSpannableRedux) && catchingFishManifestMockk.CatchingFishCoroutineFlow(CatchingFishNavigationMockk.CatchingFishReduxKtor) != null) {
            CatchingFishSpannableRedux catchingFishSpannableRedux = (CatchingFishSpannableRedux) catchingFishWebsocketGradle;
            while (true) {
                if ((catchingFishSpannableRedux instanceof CatchingFishLiveDataMoshi) || (catchingFishSpannableRedux = catchingFishSpannableRedux.CatchingFishViewModelScope()) == null) {
                    break;
                }
                if (catchingFishSpannableRedux instanceof CatchingFishToastIntent) {
                    catchingFishToastIntent = (CatchingFishToastIntent) catchingFishSpannableRedux;
                    break;
                }
            }
            if (catchingFishToastIntent != null) {
                catchingFishToastIntent.CatchingFishMockkOkHttp(catchingFishManifestMockk, obj);
            }
        }
        return catchingFishToastIntent;
    }

    public static ImageView.ScaleType CatchingFishAnimationMockk(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static final Bitmap.Config CatchingFishAppCompat(int i) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (i == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && i == 3) {
            config2 = Bitmap.Config.RGBA_F16;
            return config2;
        }
        if (i2 < 26 || i != 4) {
            return Bitmap.Config.ARGB_8888;
        }
        config = Bitmap.Config.HARDWARE;
        return config;
    }

    public static float CatchingFishCameraXIntent(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return CatchingFishBundleCoroutine.CatchingFishCoroutine(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    public static final CatchingFishKtorMockk CatchingFishCardViewRealm(CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        CatchingFishKtorMockk catchingFishKtorMockk;
        CatchingFishKtorMockk catchingFishKtorMockk2;
        if (!(catchingFishWebsocketGradle instanceof CatchingFishPayPalRoom)) {
            return new CatchingFishKtorMockk(1, catchingFishWebsocketGradle);
        }
        CatchingFishPayPalRoom catchingFishPayPalRoom = (CatchingFishPayPalRoom) catchingFishWebsocketGradle;
        CatchingFishFluxWorkManager catchingFishFluxWorkManager = CatchingFishGsonCardView.CatchingFishCloudMessaging;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishPayPalRoom.CatchingFishCloudMessaging;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(catchingFishPayPalRoom);
            catchingFishKtorMockk = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(catchingFishPayPalRoom, catchingFishFluxWorkManager);
                catchingFishKtorMockk2 = null;
                break;
            }
            if (obj instanceof CatchingFishKtorMockk) {
                while (!atomicReferenceFieldUpdater.compareAndSet(catchingFishPayPalRoom, obj, catchingFishFluxWorkManager)) {
                    if (atomicReferenceFieldUpdater.get(catchingFishPayPalRoom) != obj) {
                        break;
                    }
                }
                catchingFishKtorMockk2 = (CatchingFishKtorMockk) obj;
                break loop0;
            }
            if (obj != catchingFishFluxWorkManager && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (catchingFishKtorMockk2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = CatchingFishKtorMockk.CatchingFishFragmentHandler;
            Object obj2 = atomicReferenceFieldUpdater2.get(catchingFishKtorMockk2);
            if (!(obj2 instanceof CatchingFishRetrofitFABGson) || ((CatchingFishRetrofitFABGson) obj2).CatchingFishReduxKtor == null) {
                CatchingFishKtorMockk.CatchingFishLayout.set(catchingFishKtorMockk2, 536870911);
                atomicReferenceFieldUpdater2.set(catchingFishKtorMockk2, CatchingFishLayoutInflater.CatchingFishParcelableFAB);
                catchingFishKtorMockk = catchingFishKtorMockk2;
            } else {
                catchingFishKtorMockk2.CatchingFishAnimationMockk();
            }
            if (catchingFishKtorMockk != null) {
                return catchingFishKtorMockk;
            }
        }
        return new CatchingFishKtorMockk(2, catchingFishWebsocketGradle);
    }

    public static final int CatchingFishCardViewView(CatchingFishRoomStateFlow catchingFishRoomStateFlow, Object obj, int i) {
        int i2 = catchingFishRoomStateFlow.CatchingFishWorkManager;
        if (i2 == 0) {
            return -1;
        }
        try {
            int CatchingFishLayout2 = CatchingFishAdMobFAB.CatchingFishLayout(i2, i, catchingFishRoomStateFlow.CatchingFishReduxKtor);
            if (CatchingFishLayout2 < 0 || CatchingFishFirebaseDagger.CatchingFishOkHttp(obj, catchingFishRoomStateFlow.CatchingFishDaggerWebsocket[CatchingFishLayout2])) {
                return CatchingFishLayout2;
            }
            int i3 = CatchingFishLayout2 + 1;
            while (i3 < i2 && catchingFishRoomStateFlow.CatchingFishReduxKtor[i3] == i) {
                if (CatchingFishFirebaseDagger.CatchingFishOkHttp(obj, catchingFishRoomStateFlow.CatchingFishDaggerWebsocket[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = CatchingFishLayout2 - 1; i4 >= 0 && catchingFishRoomStateFlow.CatchingFishReduxKtor[i4] == i; i4--) {
                if (CatchingFishFirebaseDagger.CatchingFishOkHttp(obj, catchingFishRoomStateFlow.CatchingFishDaggerWebsocket[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final CatchingFishFluxExoPlayer CatchingFishCloudMessaging(View view, CatchingFishGradleCameraX catchingFishGradleCameraX) {
        int[] iArr = CatchingFishLayoutRoomFAB.CatchingFishReduxKtor;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        catchingFishGradleCameraX.getLocationInWindow(iArr);
        float f = i - iArr[0];
        float f2 = i2 - iArr[1];
        return new CatchingFishFluxExoPlayer(f, f2, view.getWidth() + f, view.getHeight() + f2);
    }

    public static CatchingFishCustomViewAdMob CatchingFishCoroutine() {
        CatchingFishCustomViewAdMob catchingFishCustomViewAdMob = new CatchingFishCustomViewAdMob(true);
        catchingFishCustomViewAdMob.CatchingFishHandler(null);
        return catchingFishCustomViewAdMob;
    }

    public static float CatchingFishCoroutineFlow(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return CatchingFishBundleCoroutine.CatchingFishSnackbar(edgeEffect);
        }
        return 0.0f;
    }

    public static final void CatchingFishCustomView(CatchingFishSharedFlowMVI catchingFishSharedFlowMVI, CatchingFishMockkView catchingFishMockkView) {
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishMockkView, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        CatchingFishLayoutRoomFAB.CatchingFishFragmentHandler(2, catchingFishMockkView);
        catchingFishMockkView.CatchingFishDaggerWebsocket(catchingFishSharedFlowMVI, 1);
    }

    public static final float CatchingFishDaggerHiltFAB(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final CatchingFishViewPagerFAB CatchingFishDataStoreIntent(int i) {
        if (i == 1) {
            return new CatchingFishViewPagerFAB(2);
        }
        if (i == 2) {
            return new CatchingFishViewPagerFAB(1);
        }
        if (i == 17) {
            return new CatchingFishViewPagerFAB(3);
        }
        if (i == 33) {
            return new CatchingFishViewPagerFAB(5);
        }
        if (i == 66) {
            return new CatchingFishViewPagerFAB(4);
        }
        if (i != 130) {
            return null;
        }
        return new CatchingFishViewPagerFAB(6);
    }

    public static void CatchingFishEspressoTesting(CatchingFishGsonAppCompat catchingFishGsonAppCompat, CatchingFishHandlerOkHttp catchingFishHandlerOkHttp, CatchingFishDaggerRetrofit catchingFishDaggerRetrofit) {
        catchingFishDaggerRetrofit.CatchingFishAnimationMockk = -1;
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit = catchingFishDaggerRetrofit.CatchingFishHandler;
        int[] iArr = catchingFishDaggerRetrofit.CatchingFishGlideWidgetKtor;
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit2 = catchingFishDaggerRetrofit.CatchingFishCameraXIntent;
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit3 = catchingFishDaggerRetrofit.CatchingFishEspressoMockk;
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit4 = catchingFishDaggerRetrofit.CatchingFishDagger;
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit5 = catchingFishDaggerRetrofit.CatchingFishSensorManager;
        catchingFishDaggerRetrofit.CatchingFishStateLiveData = -1;
        if (catchingFishGsonAppCompat.CatchingFishGlideWidgetKtor[0] != 2 && iArr[0] == 4) {
            int i = catchingFishStripeAPIJUnit5.CatchingFishViewModelScope;
            int CatchingFishRoomDatabase2 = catchingFishGsonAppCompat.CatchingFishRoomDatabase() - catchingFishStripeAPIJUnit4.CatchingFishViewModelScope;
            catchingFishStripeAPIJUnit5.CatchingFishLayout = catchingFishHandlerOkHttp.CatchingFishCloudMessaging(catchingFishStripeAPIJUnit5);
            catchingFishStripeAPIJUnit4.CatchingFishLayout = catchingFishHandlerOkHttp.CatchingFishCloudMessaging(catchingFishStripeAPIJUnit4);
            catchingFishHandlerOkHttp.CatchingFishReduxKtor(catchingFishStripeAPIJUnit5.CatchingFishLayout, i);
            catchingFishHandlerOkHttp.CatchingFishReduxKtor(catchingFishStripeAPIJUnit4.CatchingFishLayout, CatchingFishRoomDatabase2);
            catchingFishDaggerRetrofit.CatchingFishAnimationMockk = 2;
            catchingFishDaggerRetrofit.CatchingFishMVVMAppCompat = i;
            int i2 = CatchingFishRoomDatabase2 - i;
            catchingFishDaggerRetrofit.CatchingFishDataStoreIntent = i2;
            int i3 = catchingFishDaggerRetrofit.CatchingFishAndroidX;
            if (i2 < i3) {
                catchingFishDaggerRetrofit.CatchingFishDataStoreIntent = i3;
            }
        }
        if (catchingFishGsonAppCompat.CatchingFishGlideWidgetKtor[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i4 = catchingFishStripeAPIJUnit3.CatchingFishViewModelScope;
        int CatchingFishCloudMessaging2 = catchingFishGsonAppCompat.CatchingFishCloudMessaging() - catchingFishStripeAPIJUnit2.CatchingFishViewModelScope;
        catchingFishStripeAPIJUnit3.CatchingFishLayout = catchingFishHandlerOkHttp.CatchingFishCloudMessaging(catchingFishStripeAPIJUnit3);
        catchingFishStripeAPIJUnit2.CatchingFishLayout = catchingFishHandlerOkHttp.CatchingFishCloudMessaging(catchingFishStripeAPIJUnit2);
        catchingFishHandlerOkHttp.CatchingFishReduxKtor(catchingFishStripeAPIJUnit3.CatchingFishLayout, i4);
        catchingFishHandlerOkHttp.CatchingFishReduxKtor(catchingFishStripeAPIJUnit2.CatchingFishLayout, CatchingFishCloudMessaging2);
        if (catchingFishDaggerRetrofit.CatchingFishMoshiDaggerHilt > 0 || catchingFishDaggerRetrofit.CatchingFishMockkOkHttp == 8) {
            CatchingFishHandlerGson CatchingFishCloudMessaging3 = catchingFishHandlerOkHttp.CatchingFishCloudMessaging(catchingFishStripeAPIJUnit);
            catchingFishStripeAPIJUnit.CatchingFishLayout = CatchingFishCloudMessaging3;
            catchingFishHandlerOkHttp.CatchingFishReduxKtor(CatchingFishCloudMessaging3, catchingFishDaggerRetrofit.CatchingFishMoshiDaggerHilt + i4);
        }
        catchingFishDaggerRetrofit.CatchingFishStateLiveData = 2;
        catchingFishDaggerRetrofit.CatchingFishStripeAPI = i4;
        int i5 = CatchingFishCloudMessaging2 - i4;
        catchingFishDaggerRetrofit.CatchingFishStateFlow = i5;
        int i6 = catchingFishDaggerRetrofit.CatchingFishNavigationGson;
        if (i5 < i6) {
            catchingFishDaggerRetrofit.CatchingFishStateFlow = i6;
        }
    }

    public static final boolean CatchingFishFragmentFactory(long j) {
        return (j & 2) != 0;
    }

    public static void CatchingFishGradleManifest(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
        Drawable mutate = drawable.mutate();
        mutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class CatchingFishGsonAppCompat(CatchingFishRealmKtor catchingFishRealmKtor) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishRealmKtor, "<this>");
        Class CatchingFishParcelableFAB = ((CatchingFishViewPicasso) catchingFishRealmKtor).CatchingFishParcelableFAB();
        if (CatchingFishParcelableFAB.isPrimitive()) {
            String name = CatchingFishParcelableFAB.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals(Constants.LONG)) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return CatchingFishParcelableFAB;
    }

    public static final void CatchingFishHandler(float[] fArr, float[] fArr2) {
        float CatchingFishRoomDatabase2 = CatchingFishRoomDatabase(fArr2, 0, fArr, 0);
        float CatchingFishRoomDatabase3 = CatchingFishRoomDatabase(fArr2, 0, fArr, 1);
        float CatchingFishRoomDatabase4 = CatchingFishRoomDatabase(fArr2, 0, fArr, 2);
        float CatchingFishRoomDatabase5 = CatchingFishRoomDatabase(fArr2, 0, fArr, 3);
        float CatchingFishRoomDatabase6 = CatchingFishRoomDatabase(fArr2, 1, fArr, 0);
        float CatchingFishRoomDatabase7 = CatchingFishRoomDatabase(fArr2, 1, fArr, 1);
        float CatchingFishRoomDatabase8 = CatchingFishRoomDatabase(fArr2, 1, fArr, 2);
        float CatchingFishRoomDatabase9 = CatchingFishRoomDatabase(fArr2, 1, fArr, 3);
        float CatchingFishRoomDatabase10 = CatchingFishRoomDatabase(fArr2, 2, fArr, 0);
        float CatchingFishRoomDatabase11 = CatchingFishRoomDatabase(fArr2, 2, fArr, 1);
        float CatchingFishRoomDatabase12 = CatchingFishRoomDatabase(fArr2, 2, fArr, 2);
        float CatchingFishRoomDatabase13 = CatchingFishRoomDatabase(fArr2, 2, fArr, 3);
        float CatchingFishRoomDatabase14 = CatchingFishRoomDatabase(fArr2, 3, fArr, 0);
        float CatchingFishRoomDatabase15 = CatchingFishRoomDatabase(fArr2, 3, fArr, 1);
        float CatchingFishRoomDatabase16 = CatchingFishRoomDatabase(fArr2, 3, fArr, 2);
        float CatchingFishRoomDatabase17 = CatchingFishRoomDatabase(fArr2, 3, fArr, 3);
        fArr[0] = CatchingFishRoomDatabase2;
        fArr[1] = CatchingFishRoomDatabase3;
        fArr[2] = CatchingFishRoomDatabase4;
        fArr[3] = CatchingFishRoomDatabase5;
        fArr[4] = CatchingFishRoomDatabase6;
        fArr[5] = CatchingFishRoomDatabase7;
        fArr[6] = CatchingFishRoomDatabase8;
        fArr[7] = CatchingFishRoomDatabase9;
        fArr[8] = CatchingFishRoomDatabase10;
        fArr[9] = CatchingFishRoomDatabase11;
        fArr[10] = CatchingFishRoomDatabase12;
        fArr[11] = CatchingFishRoomDatabase13;
        fArr[12] = CatchingFishRoomDatabase14;
        fArr[13] = CatchingFishRoomDatabase15;
        fArr[14] = CatchingFishRoomDatabase16;
        fArr[15] = CatchingFishRoomDatabase17;
    }

    public static final CatchingFishKtorToolbar CatchingFishJUnitRealm(CatchingFishServiceGraphQL[] catchingFishServiceGraphQLArr, CatchingFishKtorNavigation catchingFishKtorNavigation, CatchingFishKtorNavigation catchingFishKtorNavigation2) {
        CatchingFishHiltGraphQL catchingFishHiltGraphQL = new CatchingFishHiltGraphQL(CatchingFishKtorToolbar.CatchingFishViewModelScope);
        for (CatchingFishServiceGraphQL catchingFishServiceGraphQL : catchingFishServiceGraphQLArr) {
            CatchingFishStripeAPILayout catchingFishStripeAPILayout = (CatchingFishStripeAPILayout) catchingFishServiceGraphQL.CatchingFishWorkManager;
            if (catchingFishServiceGraphQL.CatchingFishDaggerWebsocket || !((CatchingFishKtorToolbar) catchingFishKtorNavigation).containsKey(catchingFishStripeAPILayout)) {
                catchingFishHiltGraphQL.put(catchingFishStripeAPILayout, catchingFishStripeAPILayout.CatchingFishCoroutine(catchingFishServiceGraphQL, (CatchingFishPayPalView) ((CatchingFishKtorToolbar) catchingFishKtorNavigation2).get(catchingFishStripeAPILayout)));
            }
        }
        return catchingFishHiltGraphQL.CatchingFishParcelableFAB();
    }

    public static final CatchingFishManifestMockk CatchingFishJetpackCompose(CatchingFishManifestMockk catchingFishManifestMockk, CatchingFishManifestMockk catchingFishManifestMockk2, boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) catchingFishManifestMockk.CatchingFishEspressoTesting(bool, new CatchingFishRealmCustomView(4, (byte) 0))).booleanValue();
        boolean booleanValue2 = ((Boolean) catchingFishManifestMockk2.CatchingFishEspressoTesting(bool, new CatchingFishRealmCustomView(4, (byte) 0))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return catchingFishManifestMockk.CatchingFishAnimationMockk(catchingFishManifestMockk2);
        }
        CatchingFishRealmCustomView catchingFishRealmCustomView = new CatchingFishRealmCustomView(2, (byte) 0);
        CatchingFishPayPalDataStore catchingFishPayPalDataStore = CatchingFishPayPalDataStore.CatchingFishReduxKtor;
        CatchingFishManifestMockk catchingFishManifestMockk3 = (CatchingFishManifestMockk) catchingFishManifestMockk.CatchingFishEspressoTesting(catchingFishPayPalDataStore, catchingFishRealmCustomView);
        Object obj = catchingFishManifestMockk2;
        if (booleanValue2) {
            obj = catchingFishManifestMockk2.CatchingFishEspressoTesting(catchingFishPayPalDataStore, new CatchingFishRealmCustomView(3, (byte) 0));
        }
        return catchingFishManifestMockk3.CatchingFishAnimationMockk((CatchingFishManifestMockk) obj);
    }

    public static final boolean CatchingFishJobScheduler(CatchingFishBiometricRoom catchingFishBiometricRoom) {
        if (catchingFishBiometricRoom.CatchingFishFragmentHandler == null) {
            return false;
        }
        CatchingFishBiometricRoom CatchingFishRoomDatabase2 = catchingFishBiometricRoom.CatchingFishRoomDatabase();
        if ((CatchingFishRoomDatabase2 != null ? CatchingFishRoomDatabase2.CatchingFishFragmentHandler : null) == null) {
            return true;
        }
        catchingFishBiometricRoom.CatchingFishPayPalService.getClass();
        return false;
    }

    public static void CatchingFishLayout(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static void CatchingFishLayoutInflater(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = hasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    public static int CatchingFishMVPRobolectric(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = CatchingFishViewModelScope;
        return CatchingFishLiveDataAdMob.CatchingFishParcelableFAB(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    public static float CatchingFishMVVMAppCompat() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public static final boolean CatchingFishMotionLayout(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof CatchingFishGradleCameraX) {
            return ((CatchingFishGradleCameraX) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return findNextFocusFromRect != null ? findNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return findNextFocus != null ? findNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    public static final boolean CatchingFishMutableLiveData(long j) {
        return (j & 1) != 0;
    }

    public static final boolean CatchingFishNavigation(int i, int i2) {
        return (i & i2) == i2;
    }

    public static void CatchingFishOkHttp(int i) {
        if (2 > i || i >= 37) {
            throw new IllegalArgumentException("radix " + i + " was not in valid range " + new CatchingFishLifecycleMoshi(2, 36, 1));
        }
    }

    public static void CatchingFishParcelable(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    public static final Class CatchingFishParcelableFlux(CatchingFishAnimationIntent catchingFishAnimationIntent) {
        Class CatchingFishParcelableFAB = catchingFishAnimationIntent.CatchingFishParcelableFAB();
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(CatchingFishParcelableFAB, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return CatchingFishParcelableFAB;
    }

    public static ArrayList CatchingFishPayPal(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < materialToolbar.getChildCount(); i++) {
            View childAt = materialToolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static final Object CatchingFishPayPalLiveData(CatchingFishKtorNavigation catchingFishKtorNavigation, CatchingFishStripeAPILayout catchingFishStripeAPILayout) {
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishStripeAPILayout, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        CatchingFishKtorToolbar catchingFishKtorToolbar = (CatchingFishKtorToolbar) catchingFishKtorNavigation;
        Object obj = catchingFishKtorToolbar.get(catchingFishStripeAPILayout);
        if (obj == null) {
            obj = catchingFishStripeAPILayout.CatchingFishSnackbar();
        }
        return ((CatchingFishPayPalView) obj).CatchingFishParcelableFAB(catchingFishKtorToolbar);
    }

    public static boolean CatchingFishPayPalService(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static final Integer CatchingFishRecyclerView(int i) {
        if (i == 5) {
            return 33;
        }
        if (i == 6) {
            return 130;
        }
        if (i == 3) {
            return 17;
        }
        if (i == 4) {
            return 66;
        }
        if (i == 1) {
            return 2;
        }
        return i == 2 ? 1 : null;
    }

    public static final float CatchingFishRoomDatabase(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3] * fArr2[i2]);
    }

    public static float CatchingFishSensorManager(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static boolean CatchingFishSpannableWidget() {
        try {
            if (CatchingFishGradleCameraX.CatchingFishLiveDataRoom == null) {
                CatchingFishGradleCameraX.CatchingFishLiveDataRoom = Class.forName("android.os.SystemProperties");
            }
            if (CatchingFishGradleCameraX.CatchingFishGlideMVP == null) {
                Class cls = CatchingFishGradleCameraX.CatchingFishLiveDataRoom;
                CatchingFishGradleCameraX.CatchingFishGlideMVP = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = CatchingFishGradleCameraX.CatchingFishGlideMVP;
            Object invoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return CatchingFishFirebaseDagger.CatchingFishOkHttp(invoke instanceof Boolean ? (Boolean) invoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static String CatchingFishStateFlow(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public static final Object CatchingFishStateLiveData(long j, CatchingFishStateFlowGson catchingFishStateFlowGson) {
        if (j > 0) {
            CatchingFishKtorMockk catchingFishKtorMockk = new CatchingFishKtorMockk(1, CatchingFishBiometricBundle.CatchingFishParcelableFlux(catchingFishStateFlowGson));
            catchingFishKtorMockk.CatchingFish();
            if (j < Long.MAX_VALUE) {
                CatchingFishPicassoContext CatchingFishCoroutineFlow = catchingFishKtorMockk.CatchingFishViewModelFAB.CatchingFishCoroutineFlow(CatchingFishWidgetContext.CatchingFishDaggerWebsocket);
                CatchingFishRealmAndroidX catchingFishRealmAndroidX = CatchingFishCoroutineFlow instanceof CatchingFishRealmAndroidX ? (CatchingFishRealmAndroidX) CatchingFishCoroutineFlow : null;
                if (catchingFishRealmAndroidX == null) {
                    catchingFishRealmAndroidX = CatchingFishMoshiNavigation.CatchingFishParcelableFAB;
                }
                catchingFishRealmAndroidX.CatchingFishParcelableFlux(j, catchingFishKtorMockk);
            }
            Object CatchingFishNavigation2 = catchingFishKtorMockk.CatchingFishNavigation();
            if (CatchingFishNavigation2 == CatchingFishXMLLayoutMockk.CatchingFishReduxKtor) {
                return CatchingFishNavigation2;
            }
        }
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }

    public static final int CatchingFishUnitTesting(long j, long j2) {
        boolean CatchingFishMutableLiveData = CatchingFishMutableLiveData(j);
        if (CatchingFishMutableLiveData != CatchingFishMutableLiveData(j2)) {
            return CatchingFishMutableLiveData ? -1 : 1;
        }
        return (Math.min(CatchingFishDaggerHiltFAB(j), CatchingFishDaggerHiltFAB(j2)) >= 0.0f && CatchingFishFragmentFactory(j) != CatchingFishFragmentFactory(j2)) ? CatchingFishFragmentFactory(j) ? -1 : 1 : (int) Math.signum(CatchingFishDaggerHiltFAB(j) - CatchingFishDaggerHiltFAB(j2));
    }

    public static final void CatchingFishViewModelFAB(CatchingFishRoomStateFlow catchingFishRoomStateFlow, int i) {
        catchingFishRoomStateFlow.CatchingFishReduxKtor = new int[i];
        catchingFishRoomStateFlow.CatchingFishDaggerWebsocket = new Object[i];
    }

    public static final void CatchingFishViewModelScope(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final int CatchingFishWorkManager(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    public abstract boolean CatchingFishDagger();

    public abstract View CatchingFishEspressoMockk(int i);

    public abstract void CatchingFishFragmentHandler(float f, long j, CatchingFishFluxFirebase catchingFishFluxFirebase);
}
