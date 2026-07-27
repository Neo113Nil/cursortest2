package kotlin.text;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.catchingfish.fishcatcherpro.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class CatchingFishOkHttpFAB {
    public static final CatchingFishAppCompatWidget CatchingFish(CatchingFishFABToast catchingFishFABToast, CatchingFishFluxExoPlayer catchingFishFluxExoPlayer, int i) {
        CatchingFishFluxExoPlayer CatchingFishSnackbar;
        if (i == 3) {
            CatchingFishSnackbar = catchingFishFluxExoPlayer.CatchingFishSnackbar((catchingFishFluxExoPlayer.CatchingFishCoroutine - catchingFishFluxExoPlayer.CatchingFishParcelableFAB) + 1, 0.0f);
        } else if (i == 4) {
            CatchingFishSnackbar = catchingFishFluxExoPlayer.CatchingFishSnackbar(-((catchingFishFluxExoPlayer.CatchingFishCoroutine - catchingFishFluxExoPlayer.CatchingFishParcelableFAB) + 1), 0.0f);
        } else if (i == 5) {
            CatchingFishSnackbar = catchingFishFluxExoPlayer.CatchingFishSnackbar(0.0f, (catchingFishFluxExoPlayer.CatchingFishReduxKtor - catchingFishFluxExoPlayer.CatchingFishSnackbar) + 1);
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            CatchingFishSnackbar = catchingFishFluxExoPlayer.CatchingFishSnackbar(0.0f, -((catchingFishFluxExoPlayer.CatchingFishReduxKtor - catchingFishFluxExoPlayer.CatchingFishSnackbar) + 1));
        }
        Object[] objArr = catchingFishFABToast.CatchingFishReduxKtor;
        int i2 = catchingFishFABToast.CatchingFishWorkManager;
        CatchingFishAppCompatWidget catchingFishAppCompatWidget = null;
        for (int i3 = 0; i3 < i2; i3++) {
            CatchingFishAppCompatWidget catchingFishAppCompatWidget2 = (CatchingFishAppCompatWidget) objArr[i3];
            if (CatchingFishGsonCardView.CatchingFishCustomView(catchingFishAppCompatWidget2)) {
                CatchingFishFluxExoPlayer CatchingFishJetpackCompose = CatchingFishGsonCardView.CatchingFishJetpackCompose(catchingFishAppCompatWidget2);
                if (CatchingFishMVPRobolectric(CatchingFishJetpackCompose, CatchingFishSnackbar, catchingFishFluxExoPlayer, i)) {
                    catchingFishAppCompatWidget = catchingFishAppCompatWidget2;
                    CatchingFishSnackbar = CatchingFishJetpackCompose;
                }
            }
        }
        return catchingFishAppCompatWidget;
    }

    public static int CatchingFishAndroidX(Parcel parcel) {
        int readInt = parcel.readInt();
        int CatchingFishHandler = CatchingFishHandler(parcel, readInt);
        char c = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new CatchingFishBiometricView("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i = CatchingFishHandler + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(dataPosition).length() + 32 + String.valueOf(i).length());
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new CatchingFishBiometricView(sb.toString(), parcel);
    }

    public static final CatchingFishWidgetRoom CatchingFishAnimation(CatchingFishReduxPayPal catchingFishReduxPayPal) {
        return new CatchingFishWidgetRoom(catchingFishReduxPayPal.CatchingFishParcelableFAB, catchingFishReduxPayPal.CatchingFishSnackbar, catchingFishReduxPayPal.CatchingFishCoroutine, catchingFishReduxPayPal.CatchingFishReduxKtor);
    }

    public static String CatchingFishAnimationMockk(Parcel parcel, int i) {
        int CatchingFishHandler = CatchingFishHandler(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (CatchingFishHandler == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + CatchingFishHandler);
        return readString;
    }

    public static final void CatchingFishAppCompat(Object obj, CatchingFishSharedFlowMVI catchingFishSharedFlowMVI, CatchingFishMockkView catchingFishMockkView) {
        if (catchingFishSharedFlowMVI.CatchingFishLayoutInflater || !CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishSharedFlowMVI.CatchingFishPayPalService(), obj)) {
            catchingFishSharedFlowMVI.CatchingFishMoshiDaggerHilt(obj);
            catchingFishSharedFlowMVI.CatchingFishSnackbar(obj, catchingFishMockkView);
        }
    }

    public static int CatchingFishCameraXIntent(Parcel parcel, int i) {
        CatchingFishNavigationGson(parcel, i, 4);
        return parcel.readInt();
    }

    public static Intent CatchingFishCardViewRealm(AppCompatActivity appCompatActivity, ComponentName componentName) {
        String CatchingFishPayPal = CatchingFishPayPal(appCompatActivity, componentName);
        if (CatchingFishPayPal == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), CatchingFishPayPal);
        return CatchingFishPayPal(appCompatActivity, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static final CatchingFishFluxSnackbar CatchingFishCardViewView(Object obj) {
        if (obj != CatchingFishLayoutRoomFAB.CatchingFishSnackbar) {
            return (CatchingFishFluxSnackbar) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void CatchingFishCloudMessaging(CatchingFishAppCompatWidget catchingFishAppCompatWidget, CatchingFishFABToast catchingFishFABToast) {
        if (!catchingFishAppCompatWidget.CatchingFishReduxKtor.CatchingFishRoomDatabase) {
            CatchingFishFluxGradle.CatchingFishSnackbar("visitChildren called on an unattached node");
        }
        CatchingFishFABToast catchingFishFABToast2 = new CatchingFishFABToast(new CatchingFishFABStripeAPIFAB[16]);
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB = catchingFishAppCompatWidget.CatchingFishReduxKtor;
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB2 = catchingFishFABStripeAPIFAB.CatchingFishLayout;
        if (catchingFishFABStripeAPIFAB2 == null) {
            CatchingFishXMLLayoutGlide.CatchingFishWorkManager(catchingFishFABToast2, catchingFishFABStripeAPIFAB);
        } else {
            catchingFishFABToast2.CatchingFishSnackbar(catchingFishFABStripeAPIFAB2);
        }
        while (true) {
            int i = catchingFishFABToast2.CatchingFishWorkManager;
            if (i == 0) {
                return;
            }
            CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB3 = (CatchingFishFABStripeAPIFAB) catchingFishFABToast2.CatchingFishFragmentHandler(i - 1);
            if ((catchingFishFABStripeAPIFAB3.CatchingFishViewModelScope & 1024) == 0) {
                CatchingFishXMLLayoutGlide.CatchingFishWorkManager(catchingFishFABToast2, catchingFishFABStripeAPIFAB3);
            } else {
                while (true) {
                    if (catchingFishFABStripeAPIFAB3 == null) {
                        break;
                    }
                    if ((catchingFishFABStripeAPIFAB3.CatchingFishWorkManager & 1024) != 0) {
                        while (catchingFishFABStripeAPIFAB3 != null) {
                            if (catchingFishFABStripeAPIFAB3 instanceof CatchingFishAppCompatWidget) {
                                CatchingFishAppCompatWidget catchingFishAppCompatWidget2 = (CatchingFishAppCompatWidget) catchingFishFABStripeAPIFAB3;
                                if (catchingFishAppCompatWidget2.CatchingFishRoomDatabase && !CatchingFishXMLLayoutGlide.CatchingFishJobScheduler(catchingFishAppCompatWidget2).CatchingFishLayoutInflater) {
                                    if (catchingFishAppCompatWidget2.CatchingFishCardViewView().CatchingFishParcelableFAB) {
                                        catchingFishFABToast.CatchingFishSnackbar(catchingFishAppCompatWidget2);
                                    } else {
                                        CatchingFishCloudMessaging(catchingFishAppCompatWidget2, catchingFishFABToast);
                                    }
                                }
                            }
                            catchingFishFABStripeAPIFAB3 = null;
                        }
                    } else {
                        catchingFishFABStripeAPIFAB3 = catchingFishFABStripeAPIFAB3.CatchingFishLayout;
                    }
                }
            }
        }
    }

    public static final boolean CatchingFishCoroutine(int i, CatchingFishFluxExoPlayer catchingFishFluxExoPlayer, CatchingFishFluxExoPlayer catchingFishFluxExoPlayer2) {
        if (i == 3 || i == 4) {
            return catchingFishFluxExoPlayer.CatchingFishReduxKtor > catchingFishFluxExoPlayer2.CatchingFishSnackbar && catchingFishFluxExoPlayer.CatchingFishSnackbar < catchingFishFluxExoPlayer2.CatchingFishReduxKtor;
        }
        if (i == 5 || i == 6) {
            return catchingFishFluxExoPlayer.CatchingFishCoroutine > catchingFishFluxExoPlayer2.CatchingFishParcelableFAB && catchingFishFluxExoPlayer.CatchingFishParcelableFAB < catchingFishFluxExoPlayer2.CatchingFishCoroutine;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final boolean CatchingFishCoroutineFlow(int i, CatchingFishMVPBiometric catchingFishMVPBiometric, CatchingFishAppCompatWidget catchingFishAppCompatWidget, CatchingFishFluxExoPlayer catchingFishFluxExoPlayer) {
        if (CatchingFishParcelable(i, catchingFishMVPBiometric, catchingFishAppCompatWidget, catchingFishFluxExoPlayer)) {
            return true;
        }
        CatchingFishAppCompatWidget catchingFishAppCompatWidget2 = ((CatchingFishExoPlayerOkHttp) ((CatchingFishGradleCameraX) CatchingFishXMLLayoutGlide.CatchingFishPayPalService(catchingFishAppCompatWidget)).getFocusOwner()).CatchingFishViewModelFAB;
        CatchingFishFirebaseDagger.CatchingFishLayoutInflater(catchingFishAppCompatWidget);
        return false;
    }

    public static final boolean CatchingFishCustomView(int i, CatchingFishFluxExoPlayer catchingFishFluxExoPlayer, CatchingFishFluxExoPlayer catchingFishFluxExoPlayer2) {
        float f = catchingFishFluxExoPlayer.CatchingFishSnackbar;
        float f2 = catchingFishFluxExoPlayer.CatchingFishReduxKtor;
        float f3 = catchingFishFluxExoPlayer.CatchingFishParcelableFAB;
        float f4 = catchingFishFluxExoPlayer.CatchingFishCoroutine;
        if (i == 3) {
            float f5 = catchingFishFluxExoPlayer2.CatchingFishCoroutine;
            float f6 = catchingFishFluxExoPlayer2.CatchingFishParcelableFAB;
            return (f5 > f4 || f6 >= f4) && f6 > f3;
        }
        if (i == 4) {
            float f7 = catchingFishFluxExoPlayer2.CatchingFishParcelableFAB;
            float f8 = catchingFishFluxExoPlayer2.CatchingFishCoroutine;
            return (f7 < f3 || f8 <= f3) && f8 < f4;
        }
        if (i == 5) {
            float f9 = catchingFishFluxExoPlayer2.CatchingFishReduxKtor;
            float f10 = catchingFishFluxExoPlayer2.CatchingFishSnackbar;
            return (f9 > f2 || f10 >= f2) && f10 > f;
        }
        if (i != 6) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        float f11 = catchingFishFluxExoPlayer2.CatchingFishSnackbar;
        float f12 = catchingFishFluxExoPlayer2.CatchingFishReduxKtor;
        return (f11 < f || f12 <= f) && f12 < f2;
    }

    public static boolean CatchingFishDagger(Parcel parcel, int i) {
        CatchingFishNavigationGson(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static final CatchingFishJUnitLiveData CatchingFishDaggerHiltFAB(View view) {
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            CatchingFishJUnitLiveData catchingFishJUnitLiveData = tag instanceof CatchingFishJUnitLiveData ? (CatchingFishJUnitLiveData) tag : null;
            if (catchingFishJUnitLiveData != null) {
                return catchingFishJUnitLiveData;
            }
            Object CatchingFishStateLiveData = CatchingFishLayoutRoom.CatchingFishStateLiveData(view);
            view = CatchingFishStateLiveData instanceof View ? (View) CatchingFishStateLiveData : null;
        }
        return null;
    }

    public static void CatchingFishDataStoreIntent(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + CatchingFishHandler(parcel, i));
    }

    public static float[] CatchingFishEspressoTesting() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final long CatchingFishFragmentFactory(int i, CatchingFishFluxExoPlayer catchingFishFluxExoPlayer, CatchingFishFluxExoPlayer catchingFishFluxExoPlayer2) {
        float f;
        float f2;
        float f3 = catchingFishFluxExoPlayer2.CatchingFishSnackbar;
        float f4 = catchingFishFluxExoPlayer2.CatchingFishReduxKtor;
        float f5 = catchingFishFluxExoPlayer2.CatchingFishParcelableFAB;
        float f6 = catchingFishFluxExoPlayer2.CatchingFishCoroutine;
        if (i == 3) {
            f = catchingFishFluxExoPlayer.CatchingFishParcelableFAB - f6;
        } else if (i == 4) {
            f = f5 - catchingFishFluxExoPlayer.CatchingFishCoroutine;
        } else if (i == 5) {
            f = catchingFishFluxExoPlayer.CatchingFishSnackbar - f4;
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f = f3 - catchingFishFluxExoPlayer.CatchingFishReduxKtor;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        long j = (long) f;
        if (i == 3 || i == 4) {
            float f7 = catchingFishFluxExoPlayer.CatchingFishSnackbar;
            float f8 = 2;
            f2 = (((catchingFishFluxExoPlayer.CatchingFishReduxKtor - f7) / f8) + f7) - (((f4 - f3) / f8) + f3);
        } else {
            if (i != 5 && i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f9 = catchingFishFluxExoPlayer.CatchingFishParcelableFAB;
            float f10 = 2;
            f2 = (((catchingFishFluxExoPlayer.CatchingFishCoroutine - f9) / f10) + f9) - (((f6 - f5) / f10) + f5);
        }
        long j2 = (long) f2;
        return (j2 * j2) + (13 * j * j);
    }

    public static Comparable CatchingFishFragmentHandler(Float f, CatchingFishManifestIntent catchingFishManifestIntent) {
        float f2 = catchingFishManifestIntent.CatchingFishSnackbar;
        float f3 = catchingFishManifestIntent.CatchingFishParcelableFAB;
        if (f3 <= f2) {
            return (!CatchingFishManifestIntent.CatchingFishParcelableFAB(f, Float.valueOf(f3)) || CatchingFishManifestIntent.CatchingFishParcelableFAB(Float.valueOf(f3), f)) ? (!CatchingFishManifestIntent.CatchingFishParcelableFAB(Float.valueOf(f2), f) || CatchingFishManifestIntent.CatchingFishParcelableFAB(f, Float.valueOf(f2))) ? f : Float.valueOf(f2) : Float.valueOf(f3);
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + catchingFishManifestIntent + '.');
    }

    public static TypedValue CatchingFishGradleManifest(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static Intent CatchingFishGsonAppCompat(AppCompatActivity appCompatActivity) {
        Intent parentActivityIntent = appCompatActivity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String CatchingFishPayPal = CatchingFishPayPal(appCompatActivity, appCompatActivity.getComponentName());
            if (CatchingFishPayPal == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(appCompatActivity, CatchingFishPayPal);
            try {
                return CatchingFishPayPal(appCompatActivity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int CatchingFishHandler(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static final CatchingFishXMLLayoutRedux CatchingFishJUnitRealm(String str) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(str, "name");
        return new CatchingFishXMLLayoutRedux(str);
    }

    public static final boolean CatchingFishJetpackCompose(CatchingFishAppCompatWidget catchingFishAppCompatWidget, int i, CatchingFishServiceHandler catchingFishServiceHandler) {
        CatchingFishFluxExoPlayer catchingFishFluxExoPlayer;
        CatchingFishFABToast catchingFishFABToast = new CatchingFishFABToast(new CatchingFishAppCompatWidget[16]);
        CatchingFishCloudMessaging(catchingFishAppCompatWidget, catchingFishFABToast);
        int i2 = catchingFishFABToast.CatchingFishWorkManager;
        if (i2 <= 1) {
            CatchingFishAppCompatWidget catchingFishAppCompatWidget2 = (CatchingFishAppCompatWidget) (i2 == 0 ? null : catchingFishFABToast.CatchingFishReduxKtor[0]);
            if (catchingFishAppCompatWidget2 != null) {
                return ((Boolean) catchingFishServiceHandler.CatchingFishFragmentHandler(catchingFishAppCompatWidget2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                CatchingFishFluxExoPlayer CatchingFishJetpackCompose = CatchingFishGsonCardView.CatchingFishJetpackCompose(catchingFishAppCompatWidget);
                float f = CatchingFishJetpackCompose.CatchingFishParcelableFAB;
                float f2 = CatchingFishJetpackCompose.CatchingFishSnackbar;
                catchingFishFluxExoPlayer = new CatchingFishFluxExoPlayer(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                CatchingFishFluxExoPlayer CatchingFishJetpackCompose2 = CatchingFishGsonCardView.CatchingFishJetpackCompose(catchingFishAppCompatWidget);
                float f3 = CatchingFishJetpackCompose2.CatchingFishCoroutine;
                float f4 = CatchingFishJetpackCompose2.CatchingFishReduxKtor;
                catchingFishFluxExoPlayer = new CatchingFishFluxExoPlayer(f3, f4, f3, f4);
            }
            CatchingFishAppCompatWidget CatchingFish = CatchingFish(catchingFishFABToast, catchingFishFluxExoPlayer, i);
            if (CatchingFish != null) {
                return ((Boolean) catchingFishServiceHandler.CatchingFishFragmentHandler(CatchingFish)).booleanValue();
            }
        }
        return false;
    }

    public static final long CatchingFishJobScheduler(float[] fArr, long j) {
        if (fArr.length < 16) {
            return j;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float f10 = 1 / (((f6 * intBitsToFloat2) + (f3 * intBitsToFloat)) + f9);
        if ((Float.floatToRawIntBits(f10) & Integer.MAX_VALUE) >= 2139095040) {
            f10 = 0.0f;
        }
        float f11 = ((f5 * intBitsToFloat2) + (f2 * intBitsToFloat) + f8) * f10;
        return (Float.floatToRawIntBits((((f4 * intBitsToFloat2) + (f * intBitsToFloat)) + f7) * f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L);
    }

    public static int CatchingFishLayout(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static TypedValue CatchingFishLayoutInflater(int i, Context context, String str) {
        TypedValue CatchingFishGradleManifest = CatchingFishGradleManifest(context, i);
        if (CatchingFishGradleManifest != null) {
            return CatchingFishGradleManifest;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static final boolean CatchingFishMVPRobolectric(CatchingFishFluxExoPlayer catchingFishFluxExoPlayer, CatchingFishFluxExoPlayer catchingFishFluxExoPlayer2, CatchingFishFluxExoPlayer catchingFishFluxExoPlayer3, int i) {
        if (!CatchingFishCustomView(i, catchingFishFluxExoPlayer, catchingFishFluxExoPlayer3)) {
            return false;
        }
        if (CatchingFishCustomView(i, catchingFishFluxExoPlayer2, catchingFishFluxExoPlayer3) && !CatchingFishSnackbar(catchingFishFluxExoPlayer3, catchingFishFluxExoPlayer, catchingFishFluxExoPlayer2, i)) {
            return !CatchingFishSnackbar(catchingFishFluxExoPlayer3, catchingFishFluxExoPlayer2, catchingFishFluxExoPlayer, i) && CatchingFishFragmentFactory(i, catchingFishFluxExoPlayer3, catchingFishFluxExoPlayer) < CatchingFishFragmentFactory(i, catchingFishFluxExoPlayer3, catchingFishFluxExoPlayer2);
        }
        return true;
    }

    public static void CatchingFishMVVMAppCompat(float[] fArr, float f, float f2) {
        if (fArr.length < 16) {
            return;
        }
        float f3 = (fArr[8] * 0.0f) + (fArr[4] * f2) + (fArr[0] * f) + fArr[12];
        float f4 = (fArr[9] * 0.0f) + (fArr[5] * f2) + (fArr[1] * f) + fArr[13];
        float f5 = (fArr[10] * 0.0f) + (fArr[6] * f2) + (fArr[2] * f) + fArr[14];
        float f6 = (fArr[11] * 0.0f) + (fArr[7] * f2) + (fArr[3] * f) + fArr[15];
        fArr[12] = f3;
        fArr[13] = f4;
        fArr[14] = f5;
        fArr[15] = f6;
    }

    public static CatchingFishLifecycleMoshi CatchingFishMoshiDaggerHilt(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new CatchingFishLifecycleMoshi(i, i2 - 1, 1);
        }
        CatchingFishLifecycleMoshi catchingFishLifecycleMoshi = CatchingFishLifecycleMoshi.CatchingFishViewModelScope;
        return CatchingFishLifecycleMoshi.CatchingFishViewModelScope;
    }

    public static boolean CatchingFishMotionLayout(Context context, int i, boolean z) {
        TypedValue CatchingFishGradleManifest = CatchingFishGradleManifest(context, i);
        return (CatchingFishGradleManifest == null || CatchingFishGradleManifest.type != 18) ? z : CatchingFishGradleManifest.data != 0;
    }

    public static final boolean CatchingFishMutableLiveData(Object obj) {
        return obj == CatchingFishLayoutRoomFAB.CatchingFishSnackbar;
    }

    public static void CatchingFishNavigation(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
        sb.append("Overread allowed size end=");
        sb.append(i);
        throw new CatchingFishBiometricView(sb.toString(), parcel);
    }

    public static void CatchingFishNavigationGson(Parcel parcel, int i, int i2) {
        int CatchingFishHandler = CatchingFishHandler(parcel, i);
        if (CatchingFishHandler == i2) {
            return;
        }
        String hexString = Integer.toHexString(CatchingFishHandler);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(CatchingFishHandler).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(CatchingFishHandler);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new CatchingFishBiometricView(sb.toString(), parcel);
    }

    public static Bundle CatchingFishOkHttp(Parcel parcel, int i) {
        int CatchingFishHandler = CatchingFishHandler(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (CatchingFishHandler == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + CatchingFishHandler);
        return readBundle;
    }

    public static final boolean CatchingFishParcelable(int i, CatchingFishMVPBiometric catchingFishMVPBiometric, CatchingFishAppCompatWidget catchingFishAppCompatWidget, CatchingFishFluxExoPlayer catchingFishFluxExoPlayer) {
        CatchingFishAppCompatWidget CatchingFish;
        CatchingFishFABToast catchingFishFABToast = new CatchingFishFABToast(new CatchingFishAppCompatWidget[16]);
        if (!catchingFishAppCompatWidget.CatchingFishReduxKtor.CatchingFishRoomDatabase) {
            CatchingFishFluxGradle.CatchingFishSnackbar("visitChildren called on an unattached node");
        }
        CatchingFishFABToast catchingFishFABToast2 = new CatchingFishFABToast(new CatchingFishFABStripeAPIFAB[16]);
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB = catchingFishAppCompatWidget.CatchingFishReduxKtor;
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB2 = catchingFishFABStripeAPIFAB.CatchingFishLayout;
        if (catchingFishFABStripeAPIFAB2 == null) {
            CatchingFishXMLLayoutGlide.CatchingFishWorkManager(catchingFishFABToast2, catchingFishFABStripeAPIFAB);
        } else {
            catchingFishFABToast2.CatchingFishSnackbar(catchingFishFABStripeAPIFAB2);
        }
        while (true) {
            int i2 = catchingFishFABToast2.CatchingFishWorkManager;
            if (i2 == 0) {
                break;
            }
            CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB3 = (CatchingFishFABStripeAPIFAB) catchingFishFABToast2.CatchingFishFragmentHandler(i2 - 1);
            if ((catchingFishFABStripeAPIFAB3.CatchingFishViewModelScope & 1024) == 0) {
                CatchingFishXMLLayoutGlide.CatchingFishWorkManager(catchingFishFABToast2, catchingFishFABStripeAPIFAB3);
            } else {
                while (true) {
                    if (catchingFishFABStripeAPIFAB3 == null) {
                        break;
                    }
                    if ((catchingFishFABStripeAPIFAB3.CatchingFishWorkManager & 1024) != 0) {
                        while (catchingFishFABStripeAPIFAB3 != null) {
                            if (catchingFishFABStripeAPIFAB3 instanceof CatchingFishAppCompatWidget) {
                                CatchingFishAppCompatWidget catchingFishAppCompatWidget2 = (CatchingFishAppCompatWidget) catchingFishFABStripeAPIFAB3;
                                if (catchingFishAppCompatWidget2.CatchingFishRoomDatabase) {
                                    catchingFishFABToast.CatchingFishSnackbar(catchingFishAppCompatWidget2);
                                }
                            }
                            catchingFishFABStripeAPIFAB3 = null;
                        }
                    } else {
                        catchingFishFABStripeAPIFAB3 = catchingFishFABStripeAPIFAB3.CatchingFishLayout;
                    }
                }
            }
        }
        while (catchingFishFABToast.CatchingFishWorkManager != 0 && (CatchingFish = CatchingFish(catchingFishFABToast, catchingFishFluxExoPlayer, i)) != null) {
            if (CatchingFish.CatchingFishCardViewView().CatchingFishParcelableFAB) {
                return ((Boolean) catchingFishMVPBiometric.CatchingFishFragmentHandler(CatchingFish)).booleanValue();
            }
            if (CatchingFishCoroutineFlow(i, catchingFishMVPBiometric, CatchingFish, catchingFishFluxExoPlayer)) {
                return true;
            }
            catchingFishFABToast.CatchingFishLayout(CatchingFish);
        }
        return false;
    }

    public static final long CatchingFishParcelableFAB(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final long CatchingFishParcelableFlux(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static String CatchingFishPayPal(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final void CatchingFishPayPalLiveData(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static final void CatchingFishPayPalService(float[] fArr, CatchingFishAdMobKtor catchingFishAdMobKtor) {
        if (fArr.length < 16) {
            return;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float f10 = catchingFishAdMobKtor.CatchingFishParcelableFAB;
        float f11 = catchingFishAdMobKtor.CatchingFishSnackbar;
        float f12 = catchingFishAdMobKtor.CatchingFishCoroutine;
        float f13 = catchingFishAdMobKtor.CatchingFishReduxKtor;
        float f14 = f3 * f10;
        float f15 = f6 * f11;
        float f16 = 1.0f / ((f14 + f15) + f9);
        if ((Float.floatToRawIntBits(f16) & Integer.MAX_VALUE) >= 2139095040) {
            f16 = 0.0f;
        }
        float f17 = f * f10;
        float f18 = f4 * f11;
        float f19 = (f17 + f18 + f7) * f16;
        float f20 = f10 * f2;
        float f21 = f11 * f5;
        float f22 = (f20 + f21 + f8) * f16;
        float f23 = f6 * f13;
        float f24 = 1.0f / ((f14 + f23) + f9);
        if ((Float.floatToRawIntBits(f24) & Integer.MAX_VALUE) >= 2139095040) {
            f24 = 0.0f;
        }
        float f25 = f4 * f13;
        float f26 = (f17 + f25 + f7) * f24;
        float f27 = f5 * f13;
        float f28 = (f20 + f27 + f8) * f24;
        float f29 = f3 * f12;
        float f30 = 1.0f / ((f15 + f29) + f9);
        if ((Float.floatToRawIntBits(f30) & Integer.MAX_VALUE) >= 2139095040) {
            f30 = 0.0f;
        }
        float f31 = f * f12;
        float f32 = (f31 + f18 + f7) * f30;
        float f33 = f12 * f2;
        float f34 = (f21 + f33 + f8) * f30;
        float f35 = 1.0f / ((f29 + f23) + f9);
        float f36 = (Float.floatToRawIntBits(f35) & Integer.MAX_VALUE) < 2139095040 ? f35 : 0.0f;
        float f37 = (f31 + f25 + f7) * f36;
        float f38 = (f33 + f27 + f8) * f36;
        catchingFishAdMobKtor.CatchingFishParcelableFAB = Math.min(f19, Math.min(f26, Math.min(f32, f37)));
        catchingFishAdMobKtor.CatchingFishSnackbar = Math.min(f22, Math.min(f28, Math.min(f34, f38)));
        catchingFishAdMobKtor.CatchingFishCoroutine = Math.max(f19, Math.max(f26, Math.max(f32, f37)));
        catchingFishAdMobKtor.CatchingFishReduxKtor = Math.max(f22, Math.max(f28, Math.max(f34, f38)));
    }

    public static final void CatchingFishRecyclerView(View view, CatchingFishJUnitLiveData catchingFishJUnitLiveData) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, catchingFishJUnitLiveData);
    }

    public static void CatchingFishReduxKtor(long j, CatchingFishWidgetGradle catchingFishWidgetGradle, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 >= i3) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((CatchingFishWebSocketMockk) arrayList4.get(i8)).CatchingFishReduxKtor() < i7) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        CatchingFishWebSocketMockk catchingFishWebSocketMockk = (CatchingFishWebSocketMockk) arrayList.get(i2);
        CatchingFishWebSocketMockk catchingFishWebSocketMockk2 = (CatchingFishWebSocketMockk) arrayList4.get(i3 - 1);
        if (i7 == catchingFishWebSocketMockk.CatchingFishReduxKtor()) {
            int intValue = ((Number) arrayList5.get(i2)).intValue();
            int i9 = i2 + 1;
            CatchingFishWebSocketMockk catchingFishWebSocketMockk3 = (CatchingFishWebSocketMockk) arrayList4.get(i9);
            i4 = i9;
            i5 = intValue;
            catchingFishWebSocketMockk = catchingFishWebSocketMockk3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (catchingFishWebSocketMockk.CatchingFishViewModelScope(i7) == catchingFishWebSocketMockk2.CatchingFishViewModelScope(i7)) {
            int min = Math.min(catchingFishWebSocketMockk.CatchingFishReduxKtor(), catchingFishWebSocketMockk2.CatchingFishReduxKtor());
            int i10 = 0;
            for (int i11 = i7; i11 < min && catchingFishWebSocketMockk.CatchingFishViewModelScope(i11) == catchingFishWebSocketMockk2.CatchingFishViewModelScope(i11); i11++) {
                i10++;
            }
            long j3 = 4;
            long j4 = (catchingFishWidgetGradle.CatchingFishDaggerWebsocket / j3) + j + 2 + i10 + 1;
            catchingFishWidgetGradle.CatchingFishCustomView(-i10);
            catchingFishWidgetGradle.CatchingFishCustomView(i5);
            int i12 = i7 + i10;
            while (i7 < i12) {
                catchingFishWidgetGradle.CatchingFishCustomView(catchingFishWebSocketMockk.CatchingFishViewModelScope(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i12 != ((CatchingFishWebSocketMockk) arrayList4.get(i4)).CatchingFishReduxKtor()) {
                    throw new IllegalStateException("Check failed.");
                }
                catchingFishWidgetGradle.CatchingFishCustomView(((Number) arrayList5.get(i4)).intValue());
                return;
            } else {
                CatchingFishWidgetGradle catchingFishWidgetGradle2 = new CatchingFishWidgetGradle();
                catchingFishWidgetGradle.CatchingFishCustomView(((int) ((catchingFishWidgetGradle2.CatchingFishDaggerWebsocket / j3) + j4)) * (-1));
                CatchingFishReduxKtor(j4, catchingFishWidgetGradle2, i12, arrayList4, i4, i3, arrayList5);
                catchingFishWidgetGradle.CatchingFishCardViewRealm(catchingFishWidgetGradle2);
                return;
            }
        }
        int i13 = 1;
        for (int i14 = i4 + 1; i14 < i3; i14++) {
            if (((CatchingFishWebSocketMockk) arrayList4.get(i14 - 1)).CatchingFishViewModelScope(i7) != ((CatchingFishWebSocketMockk) arrayList4.get(i14)).CatchingFishViewModelScope(i7)) {
                i13++;
            }
        }
        long j5 = 4;
        long j6 = (catchingFishWidgetGradle.CatchingFishDaggerWebsocket / j5) + j + 2 + (i13 * 2);
        catchingFishWidgetGradle.CatchingFishCustomView(i13);
        catchingFishWidgetGradle.CatchingFishCustomView(i5);
        for (int i15 = i4; i15 < i3; i15++) {
            int CatchingFishViewModelScope = ((CatchingFishWebSocketMockk) arrayList4.get(i15)).CatchingFishViewModelScope(i7);
            if (i15 == i4 || CatchingFishViewModelScope != ((CatchingFishWebSocketMockk) arrayList4.get(i15 - 1)).CatchingFishViewModelScope(i7)) {
                catchingFishWidgetGradle.CatchingFishCustomView(CatchingFishViewModelScope & 255);
            }
        }
        CatchingFishWidgetGradle catchingFishWidgetGradle3 = new CatchingFishWidgetGradle();
        int i16 = i4;
        while (i16 < i3) {
            byte CatchingFishViewModelScope2 = ((CatchingFishWebSocketMockk) arrayList4.get(i16)).CatchingFishViewModelScope(i7);
            int i17 = i16 + 1;
            int i18 = i17;
            while (true) {
                if (i18 >= i3) {
                    i18 = i3;
                    break;
                } else if (CatchingFishViewModelScope2 != ((CatchingFishWebSocketMockk) arrayList4.get(i18)).CatchingFishViewModelScope(i7)) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i17 == i18 && i7 + 1 == ((CatchingFishWebSocketMockk) arrayList4.get(i16)).CatchingFishReduxKtor()) {
                catchingFishWidgetGradle.CatchingFishCustomView(((Number) arrayList5.get(i16)).intValue());
                arrayList3 = arrayList5;
                j2 = j6;
                i6 = i18;
            } else {
                catchingFishWidgetGradle.CatchingFishCustomView(((int) ((catchingFishWidgetGradle3.CatchingFishDaggerWebsocket / j5) + j6)) * (-1));
                arrayList3 = arrayList5;
                j2 = j6;
                i6 = i18;
                CatchingFishReduxKtor(j2, catchingFishWidgetGradle3, i7 + 1, arrayList, i16, i6, arrayList3);
                arrayList4 = arrayList;
            }
            j6 = j2;
            i16 = i6;
            arrayList5 = arrayList3;
        }
        catchingFishWidgetGradle.CatchingFishCardViewRealm(catchingFishWidgetGradle3);
    }

    public static final long CatchingFishRoomDatabase() {
        return Thread.currentThread().getId();
    }

    public static final boolean CatchingFishSnackbar(CatchingFishFluxExoPlayer catchingFishFluxExoPlayer, CatchingFishFluxExoPlayer catchingFishFluxExoPlayer2, CatchingFishFluxExoPlayer catchingFishFluxExoPlayer3, int i) {
        float f;
        float f2;
        boolean CatchingFishCoroutine = CatchingFishCoroutine(i, catchingFishFluxExoPlayer3, catchingFishFluxExoPlayer);
        float f3 = catchingFishFluxExoPlayer3.CatchingFishSnackbar;
        float f4 = catchingFishFluxExoPlayer3.CatchingFishReduxKtor;
        float f5 = catchingFishFluxExoPlayer3.CatchingFishParcelableFAB;
        float f6 = catchingFishFluxExoPlayer3.CatchingFishCoroutine;
        float f7 = catchingFishFluxExoPlayer.CatchingFishReduxKtor;
        float f8 = catchingFishFluxExoPlayer.CatchingFishSnackbar;
        float f9 = catchingFishFluxExoPlayer.CatchingFishCoroutine;
        float f10 = catchingFishFluxExoPlayer.CatchingFishParcelableFAB;
        if (CatchingFishCoroutine || !CatchingFishCoroutine(i, catchingFishFluxExoPlayer2, catchingFishFluxExoPlayer)) {
            return false;
        }
        if (i == 3) {
            if (f10 < f6) {
                return true;
            }
        } else if (i == 4) {
            if (f9 > f5) {
                return true;
            }
        } else if (i == 5) {
            if (f8 < f4) {
                return true;
            }
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (f7 > f3) {
                return true;
            }
        }
        if (i == 3 || i == 4) {
            return true;
        }
        if (i == 3) {
            f = f10 - catchingFishFluxExoPlayer2.CatchingFishCoroutine;
        } else if (i == 4) {
            f = catchingFishFluxExoPlayer2.CatchingFishParcelableFAB - f9;
        } else if (i == 5) {
            f = f8 - catchingFishFluxExoPlayer2.CatchingFishReduxKtor;
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f = catchingFishFluxExoPlayer2.CatchingFishSnackbar - f7;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (i == 3) {
            f2 = f10 - f5;
        } else if (i == 4) {
            f2 = f6 - f9;
        } else if (i == 5) {
            f2 = f8 - f3;
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f2 = f4 - f7;
        }
        if (f2 < 1.0f) {
            f2 = 1.0f;
        }
        return f < f2;
    }

    public static CatchingFishFABFlux CatchingFishSpannableWidget(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new CatchingFishFABFlux(CatchingFishJUnitMVVM.CatchingFishReduxKtor(view));
        }
        return null;
    }

    public static CatchingFishRetrofitService CatchingFishStateFlow(CatchingFishLifecycleMoshi catchingFishLifecycleMoshi) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishLifecycleMoshi, "<this>");
        return new CatchingFishRetrofitService(catchingFishLifecycleMoshi.CatchingFishReduxKtor, catchingFishLifecycleMoshi.CatchingFishDaggerWebsocket, catchingFishLifecycleMoshi.CatchingFishWorkManager > 0 ? 2 : -2);
    }

    public static Object[] CatchingFishStateLiveData(Parcel parcel, int i, Parcelable.Creator creator) {
        int CatchingFishHandler = CatchingFishHandler(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (CatchingFishHandler == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + CatchingFishHandler);
        return createTypedArray;
    }

    public static final Boolean CatchingFishStripeAPI(int i, CatchingFishMVPBiometric catchingFishMVPBiometric, CatchingFishAppCompatWidget catchingFishAppCompatWidget, CatchingFishFluxExoPlayer catchingFishFluxExoPlayer) {
        int ordinal = catchingFishAppCompatWidget.CatchingFishMVPRobolectric().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                CatchingFishAppCompatWidget CatchingFishDaggerHiltFAB = CatchingFishGsonCardView.CatchingFishDaggerHiltFAB(catchingFishAppCompatWidget);
                if (CatchingFishDaggerHiltFAB == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int ordinal2 = CatchingFishDaggerHiltFAB.CatchingFishMVPRobolectric().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        Boolean CatchingFishStripeAPI = CatchingFishStripeAPI(i, catchingFishMVPBiometric, CatchingFishDaggerHiltFAB, catchingFishFluxExoPlayer);
                        if (!CatchingFishFirebaseDagger.CatchingFishOkHttp(CatchingFishStripeAPI, Boolean.FALSE)) {
                            return CatchingFishStripeAPI;
                        }
                        if (catchingFishFluxExoPlayer == null) {
                            if (CatchingFishDaggerHiltFAB.CatchingFishMVPRobolectric() != CatchingFishFABBiometric.CatchingFishDaggerWebsocket) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            CatchingFishAppCompatWidget CatchingFishNavigation = CatchingFishGsonCardView.CatchingFishNavigation(CatchingFishDaggerHiltFAB);
                            if (CatchingFishNavigation == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            catchingFishFluxExoPlayer = CatchingFishGsonCardView.CatchingFishJetpackCompose(CatchingFishNavigation);
                        }
                        return Boolean.valueOf(CatchingFishCoroutineFlow(i, catchingFishMVPBiometric, catchingFishAppCompatWidget, catchingFishFluxExoPlayer));
                    }
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            throw new CatchingFishBiometricView();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (catchingFishFluxExoPlayer == null) {
                    catchingFishFluxExoPlayer = CatchingFishGsonCardView.CatchingFishJetpackCompose(CatchingFishDaggerHiltFAB);
                }
                return Boolean.valueOf(CatchingFishCoroutineFlow(i, catchingFishMVPBiometric, catchingFishAppCompatWidget, catchingFishFluxExoPlayer));
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return catchingFishAppCompatWidget.CatchingFishCardViewView().CatchingFishParcelableFAB ? (Boolean) catchingFishMVPBiometric.CatchingFishFragmentHandler(catchingFishAppCompatWidget) : catchingFishFluxExoPlayer == null ? Boolean.valueOf(CatchingFishJetpackCompose(catchingFishAppCompatWidget, i, catchingFishMVPBiometric)) : Boolean.valueOf(CatchingFishParcelable(i, catchingFishMVPBiometric, catchingFishAppCompatWidget, catchingFishFluxExoPlayer));
                }
                throw new CatchingFishBiometricView();
            }
        }
        return Boolean.valueOf(CatchingFishJetpackCompose(catchingFishAppCompatWidget, i, catchingFishMVPBiometric));
    }

    public static Parcelable CatchingFishUnitTesting(Parcel parcel, int i, Parcelable.Creator creator) {
        int CatchingFishHandler = CatchingFishHandler(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (CatchingFishHandler == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + CatchingFishHandler);
        return parcelable;
    }

    public static double CatchingFishViewModelFAB(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static final boolean CatchingFishViewModelScope(CatchingFishFABAdMob catchingFishFABAdMob) {
        return catchingFishFABAdMob.CatchingFishViewModelFAB && !catchingFishFABAdMob.CatchingFishReduxKtor;
    }

    public static final boolean CatchingFishWorkManager(CatchingFishFABAdMob catchingFishFABAdMob) {
        return !catchingFishFABAdMob.CatchingFishViewModelFAB && catchingFishFABAdMob.CatchingFishReduxKtor;
    }

    public void CatchingFishDaggerWebsocket(int i) {
        new Handler(Looper.getMainLooper()).post(new CatchingFishMVVMGson(i, 0, this));
    }

    public abstract void CatchingFishEspressoMockk(Typeface typeface);

    public abstract void CatchingFishSensorManager(int i);
}
