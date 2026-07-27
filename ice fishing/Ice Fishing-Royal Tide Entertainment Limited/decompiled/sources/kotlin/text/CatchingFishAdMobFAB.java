package kotlin.text;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.TypedArray;
import android.graphics.BlendMode;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Trace;
import android.util.Xml;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.View;
import android.view.ViewParent;
import com.adjust.sdk.Constants;
import com.catchingfish.fishcatcherpro.presentation.application.FishApp;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes.dex */
public abstract class CatchingFishAdMobFAB {
    public static final Object CatchingFishParcelableFAB = new Object();
    public static final int[] CatchingFishSnackbar = new int[0];
    public static final long[] CatchingFishCoroutine = new long[0];
    public static final Object[] CatchingFishReduxKtor = new Object[0];
    public static final String[] CatchingFishDaggerWebsocket = {"standard", "accelerate", "decelerate", "linear"};
    public static final char[] CatchingFishWorkManager = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final CatchingFishFluxWorkManager CatchingFishViewModelScope = new CatchingFishFluxWorkManager("NULL", 1);
    public static final byte[] CatchingFishViewModelFAB = {48, 49, 53, 0};
    public static final byte[] CatchingFishLayout = {48, 49, 48, 0};
    public static final byte[] CatchingFishFragmentHandler = {48, 48, 57, 0};
    public static final byte[] CatchingFishCloudMessaging = {48, 48, 53, 0};
    public static final byte[] CatchingFishEspressoTesting = {48, 48, 49, 0};
    public static final byte[] CatchingFishOkHttp = {48, 48, 49, 0};
    public static final byte[] CatchingFishUnitTesting = {48, 48, 50, 0};
    public static final CatchingFishFluxExoPlayer CatchingFishAnimationMockk = new CatchingFishFluxExoPlayer(0.0f, 0.0f, 10.0f, 10.0f);
    public static final CatchingFishFluxWorkManager CatchingFishStateLiveData = new CatchingFishFluxWorkManager("NO_THREAD_ELEMENTS", 1);
    public static final CatchingFishKtorBiometric CatchingFishRoomDatabase = new CatchingFishKtorBiometric(2);
    public static final CatchingFishKtorBiometric CatchingFishNavigation = new CatchingFishKtorBiometric(3);
    public static final CatchingFishKtorBiometric CatchingFish = new CatchingFishKtorBiometric(4);

    public static final CatchingFishServiceMVVM CatchingFish(Context context) {
        CatchingFishHiltWidgetMVVM catchingFishHiltWidgetMVVM = CatchingFishHiltWidgetMVVM.CatchingFishParcelableFAB;
        catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral1_0);
        catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral1_10);
        CatchingFishCameraXIntent(catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral1_600), 98.0f);
        CatchingFishCameraXIntent(catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral1_600), 96.0f);
        catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral1_50);
        CatchingFishCameraXIntent(catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral1_600), 94.0f);
        CatchingFishCameraXIntent(catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral1_600), 92.0f);
        catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral1_100);
        CatchingFishCameraXIntent(catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral1_600), 87.0f);
        catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral1_200);
        catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral1_300);
        catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral1_400);
        catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral1_500);
        catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral1_600);
        catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral1_700);
        CatchingFishCameraXIntent(catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral1_600), 24.0f);
        CatchingFishCameraXIntent(catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral1_600), 22.0f);
        catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral1_800);
        CatchingFishCameraXIntent(catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral1_600), 17.0f);
        CatchingFishCameraXIntent(catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral1_600), 12.0f);
        catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral1_900);
        CatchingFishCameraXIntent(catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral1_600), 6.0f);
        CatchingFishCameraXIntent(catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral1_600), 4.0f);
        catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral1_1000);
        long CatchingFishParcelableFAB2 = catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral2_0);
        catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral2_10);
        long CatchingFishCameraXIntent = CatchingFishCameraXIntent(catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral2_600), 98.0f);
        long CatchingFishCameraXIntent2 = CatchingFishCameraXIntent(catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral2_600), 96.0f);
        long CatchingFishParcelableFAB3 = catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral2_50);
        long CatchingFishCameraXIntent3 = CatchingFishCameraXIntent(catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral2_600), 94.0f);
        long CatchingFishCameraXIntent4 = CatchingFishCameraXIntent(catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral2_600), 92.0f);
        long CatchingFishParcelableFAB4 = catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral2_100);
        long CatchingFishCameraXIntent5 = CatchingFishCameraXIntent(catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral2_600), 87.0f);
        long CatchingFishParcelableFAB5 = catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral2_200);
        catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral2_300);
        long CatchingFishParcelableFAB6 = catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral2_400);
        long CatchingFishParcelableFAB7 = catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral2_500);
        catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral2_600);
        long CatchingFishParcelableFAB8 = catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral2_700);
        long CatchingFishCameraXIntent6 = CatchingFishCameraXIntent(catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral2_600), 24.0f);
        long CatchingFishCameraXIntent7 = CatchingFishCameraXIntent(catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral2_600), 22.0f);
        long CatchingFishParcelableFAB9 = catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral2_800);
        long CatchingFishCameraXIntent8 = CatchingFishCameraXIntent(catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral2_600), 17.0f);
        long CatchingFishCameraXIntent9 = CatchingFishCameraXIntent(catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral2_600), 12.0f);
        long CatchingFishParcelableFAB10 = catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral2_900);
        long CatchingFishCameraXIntent10 = CatchingFishCameraXIntent(catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral2_600), 6.0f);
        long CatchingFishCameraXIntent11 = CatchingFishCameraXIntent(catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral2_600), 4.0f);
        long CatchingFishParcelableFAB11 = catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_neutral2_1000);
        long CatchingFishParcelableFAB12 = catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent1_0);
        catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent1_10);
        catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent1_50);
        long CatchingFishParcelableFAB13 = catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent1_100);
        long CatchingFishParcelableFAB14 = catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent1_200);
        catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent1_300);
        catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent1_400);
        catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent1_500);
        long CatchingFishParcelableFAB15 = catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent1_600);
        long CatchingFishParcelableFAB16 = catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent1_700);
        long CatchingFishParcelableFAB17 = catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent1_800);
        long CatchingFishParcelableFAB18 = catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent1_900);
        catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent1_1000);
        long CatchingFishParcelableFAB19 = catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent2_0);
        catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent2_10);
        catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent2_50);
        long CatchingFishParcelableFAB20 = catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent2_100);
        long CatchingFishParcelableFAB21 = catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent2_200);
        catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent2_300);
        catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent2_400);
        catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent2_500);
        long CatchingFishParcelableFAB22 = catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent2_600);
        long CatchingFishParcelableFAB23 = catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent2_700);
        long CatchingFishParcelableFAB24 = catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent2_800);
        long CatchingFishParcelableFAB25 = catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent2_900);
        catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent2_1000);
        long CatchingFishParcelableFAB26 = catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent3_0);
        catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent3_10);
        catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent3_50);
        long CatchingFishParcelableFAB27 = catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent3_100);
        long CatchingFishParcelableFAB28 = catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent3_200);
        catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent3_300);
        catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent3_400);
        catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent3_500);
        long CatchingFishParcelableFAB29 = catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent3_600);
        long CatchingFishParcelableFAB30 = catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent3_700);
        long CatchingFishParcelableFAB31 = catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent3_800);
        long CatchingFishParcelableFAB32 = catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent3_900);
        catchingFishHiltWidgetMVVM.CatchingFishParcelableFAB(context, R.color.system_accent3_1000);
        return new CatchingFishServiceMVVM(CatchingFishParcelableFAB2, CatchingFishCameraXIntent, CatchingFishCameraXIntent2, CatchingFishParcelableFAB3, CatchingFishCameraXIntent3, CatchingFishCameraXIntent4, CatchingFishParcelableFAB4, CatchingFishCameraXIntent5, CatchingFishParcelableFAB5, CatchingFishParcelableFAB6, CatchingFishParcelableFAB7, CatchingFishParcelableFAB8, CatchingFishCameraXIntent6, CatchingFishCameraXIntent7, CatchingFishParcelableFAB9, CatchingFishCameraXIntent8, CatchingFishCameraXIntent9, CatchingFishParcelableFAB10, CatchingFishCameraXIntent10, CatchingFishCameraXIntent11, CatchingFishParcelableFAB11, CatchingFishParcelableFAB12, CatchingFishParcelableFAB13, CatchingFishParcelableFAB14, CatchingFishParcelableFAB15, CatchingFishParcelableFAB16, CatchingFishParcelableFAB17, CatchingFishParcelableFAB18, CatchingFishParcelableFAB19, CatchingFishParcelableFAB20, CatchingFishParcelableFAB21, CatchingFishParcelableFAB22, CatchingFishParcelableFAB23, CatchingFishParcelableFAB24, CatchingFishParcelableFAB25, CatchingFishParcelableFAB26, CatchingFishParcelableFAB27, CatchingFishParcelableFAB28, CatchingFishParcelableFAB29, CatchingFishParcelableFAB30, CatchingFishParcelableFAB31, CatchingFishParcelableFAB32);
    }

    public static final void CatchingFishAnimationMockk(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(CatchingFishMVPLiveData.CatchingFishFragmentHandler(i, i2, "index: ", ", size: "));
        }
    }

    public static final long CatchingFishCameraXIntent(long j, float f) {
        double d = f;
        if (!(d < 1.0E-4d) && !(d > 99.9999d)) {
            CatchingFishGraphQLCardView catchingFishGraphQLCardView = CatchingFishSnackbarGlide.CatchingFishJetpackCompose;
            long CatchingFishParcelableFAB2 = CatchingFishToastFragment.CatchingFishParcelableFAB(j, catchingFishGraphQLCardView);
            return CatchingFishToastFragment.CatchingFishParcelableFAB(CatchingFishFirebaseDagger.CatchingFishParcelableFAB(f, CatchingFishToastFragment.CatchingFishWorkManager(CatchingFishParcelableFAB2), CatchingFishToastFragment.CatchingFishDaggerWebsocket(CatchingFishParcelableFAB2), 1.0f, catchingFishGraphQLCardView), CatchingFishSnackbarGlide.CatchingFishDaggerWebsocket);
        }
        float f2 = 100;
        float f3 = 16;
        float f4 = 116;
        float f5 = (f + f3) / f4;
        float f6 = f5 * f5 * f5;
        if (f6 <= 0.008856452f) {
            f6 = ((f4 * f5) - f3) / 903.2963f;
        }
        double d2 = (f6 * f2) / f2;
        double pow = (d2 <= 0.0031308d ? d2 * 12.92d : (Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d;
        if (Double.isNaN(pow)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        int CatchingFishViewModelScope2 = CatchingFishHiltMVPToast.CatchingFishViewModelScope(pow > 2.147483647E9d ? Integer.MAX_VALUE : pow < -2.147483648E9d ? Integer.MIN_VALUE : (int) Math.round(pow), 0, 255);
        return CatchingFishFirebaseDagger.CatchingFishReduxKtor(CatchingFishViewModelScope2, CatchingFishViewModelScope2, CatchingFishViewModelScope2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        r2 = r2.getRoundedCorner(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CatchingFishFluxDagger CatchingFishCardViewRealm(Display display, int i) {
        RoundedCorner roundedCorner;
        int position;
        int i2;
        int radius;
        Point center;
        if (Build.VERSION.SDK_INT < 31 || roundedCorner == null) {
            return null;
        }
        position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        throw new IllegalArgumentException(CatchingFishMVPLiveData.CatchingFishCloudMessaging("Invalid position: ", position));
                    }
                }
            }
        } else {
            i2 = 0;
        }
        radius = roundedCorner.getRadius();
        center = roundedCorner.getCenter();
        return new CatchingFishFluxDagger(i2, radius, center);
    }

    public static final boolean CatchingFishCardViewView(CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt) {
        if (!CatchingFishPayPal(catchingFishMVIGraphQLHilt)) {
            CatchingFishMVPMotionLayout catchingFishMVPMotionLayout = catchingFishMVIGraphQLHilt.CatchingFishReduxKtor;
            if (catchingFishMVPMotionLayout.CatchingFishWorkManager) {
                return true;
            }
            CatchingFishPayPalService catchingFishPayPalService = catchingFishMVPMotionLayout.CatchingFishReduxKtor;
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
                                if (((CatchingFishGraphQLLayout) obj).CatchingFishCoroutine) {
                                    return true;
                                }
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
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.text.CatchingFishKtorNavigation] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CatchingFishCoroutine(CatchingFishServiceGraphQL[] catchingFishServiceGraphQLArr, CatchingFishMockkView catchingFishMockkView, CatchingFishSharedFlowMVI catchingFishSharedFlowMVI, int i) {
        CatchingFishKtorToolbar CatchingFishStripeAPI;
        boolean z;
        CatchingFishHiltFAB CatchingFishRoomDatabase2;
        catchingFishSharedFlowMVI.CatchingFishRecyclerView(415205898);
        CatchingFishWidgetToolbar catchingFishWidgetToolbar = catchingFishSharedFlowMVI.CatchingFishSpannableWidget;
        CatchingFishKtorNavigation CatchingFishCloudMessaging2 = catchingFishSharedFlowMVI.CatchingFishCloudMessaging();
        catchingFishSharedFlowMVI.CatchingFishMotionLayout(201, CatchingFishUnitTestingFlux.CatchingFishSnackbar);
        if (catchingFishSharedFlowMVI.CatchingFishLayoutInflater) {
            CatchingFishStripeAPI = catchingFishSharedFlowMVI.CatchingFishStripeAPI(CatchingFishCloudMessaging2, CatchingFishRobolectricHilt.CatchingFishJUnitRealm(catchingFishServiceGraphQLArr, CatchingFishCloudMessaging2, CatchingFishKtorToolbar.CatchingFishViewModelScope));
            catchingFishSharedFlowMVI.CatchingFishSensorManager = true;
        } else {
            CatchingFishAnimationMVP catchingFishAnimationMVP = catchingFishSharedFlowMVI.CatchingFishMutableLiveData;
            Object CatchingFishViewModelFAB2 = catchingFishAnimationMVP.CatchingFishViewModelFAB(catchingFishAnimationMVP.CatchingFishViewModelScope, 0);
            CatchingFishFirebaseDagger.CatchingFishStateLiveData(CatchingFishViewModelFAB2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            ?? r2 = (CatchingFishKtorNavigation) CatchingFishViewModelFAB2;
            CatchingFishAnimationMVP catchingFishAnimationMVP2 = catchingFishSharedFlowMVI.CatchingFishMutableLiveData;
            Object CatchingFishViewModelFAB3 = catchingFishAnimationMVP2.CatchingFishViewModelFAB(catchingFishAnimationMVP2.CatchingFishViewModelScope, 1);
            CatchingFishFirebaseDagger.CatchingFishStateLiveData(CatchingFishViewModelFAB3, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            CatchingFishKtorNavigation catchingFishKtorNavigation = (CatchingFishKtorNavigation) CatchingFishViewModelFAB3;
            CatchingFishKtorToolbar CatchingFishJUnitRealm = CatchingFishRobolectricHilt.CatchingFishJUnitRealm(catchingFishServiceGraphQLArr, CatchingFishCloudMessaging2, catchingFishKtorNavigation);
            if (catchingFishSharedFlowMVI.CatchingFishSpannableWidget() && !catchingFishSharedFlowMVI.CatchingFishParcelableFlux && catchingFishKtorNavigation.equals(CatchingFishJUnitRealm)) {
                catchingFishSharedFlowMVI.CatchingFishCloudMessaging = catchingFishSharedFlowMVI.CatchingFishMutableLiveData.CatchingFish() + catchingFishSharedFlowMVI.CatchingFishCloudMessaging;
                CatchingFishStripeAPI = r2;
            } else {
                CatchingFishStripeAPI = catchingFishSharedFlowMVI.CatchingFishStripeAPI(CatchingFishCloudMessaging2, CatchingFishJUnitRealm);
                if (catchingFishSharedFlowMVI.CatchingFishParcelableFlux || !CatchingFishFirebaseDagger.CatchingFishOkHttp(CatchingFishStripeAPI, r2)) {
                    z = true;
                    if (z && !catchingFishSharedFlowMVI.CatchingFishLayoutInflater) {
                        catchingFishSharedFlowMVI.CatchingFishMutableLiveData(CatchingFishStripeAPI);
                    }
                    catchingFishWidgetToolbar.CatchingFishReduxKtor(catchingFishSharedFlowMVI.CatchingFishDaggerHiltFAB ? 1 : 0);
                    catchingFishSharedFlowMVI.CatchingFishDaggerHiltFAB = z;
                    catchingFishSharedFlowMVI.CatchingFishEspressoMockk = CatchingFishStripeAPI;
                    catchingFishSharedFlowMVI.CatchingFishGradleManifest(202, CatchingFishUnitTestingFlux.CatchingFishCoroutine, 0, CatchingFishStripeAPI);
                    catchingFishMockkView.CatchingFishDaggerWebsocket(catchingFishSharedFlowMVI, Integer.valueOf((i >> 3) & 14));
                    catchingFishSharedFlowMVI.CatchingFishStateLiveData(false);
                    catchingFishSharedFlowMVI.CatchingFishStateLiveData(false);
                    catchingFishSharedFlowMVI.CatchingFishDaggerHiltFAB = catchingFishWidgetToolbar.CatchingFishCoroutine() != 0;
                    catchingFishSharedFlowMVI.CatchingFishEspressoMockk = null;
                    CatchingFishRoomDatabase2 = catchingFishSharedFlowMVI.CatchingFishRoomDatabase();
                    if (CatchingFishRoomDatabase2 == null) {
                        CatchingFishRoomDatabase2.CatchingFishReduxKtor = new CatchingFishGlideAndroidX(i, 2, catchingFishServiceGraphQLArr, catchingFishMockkView);
                        return;
                    }
                    return;
                }
            }
        }
        z = false;
        if (z) {
            catchingFishSharedFlowMVI.CatchingFishMutableLiveData(CatchingFishStripeAPI);
        }
        catchingFishWidgetToolbar.CatchingFishReduxKtor(catchingFishSharedFlowMVI.CatchingFishDaggerHiltFAB ? 1 : 0);
        catchingFishSharedFlowMVI.CatchingFishDaggerHiltFAB = z;
        catchingFishSharedFlowMVI.CatchingFishEspressoMockk = CatchingFishStripeAPI;
        catchingFishSharedFlowMVI.CatchingFishGradleManifest(202, CatchingFishUnitTestingFlux.CatchingFishCoroutine, 0, CatchingFishStripeAPI);
        catchingFishMockkView.CatchingFishDaggerWebsocket(catchingFishSharedFlowMVI, Integer.valueOf((i >> 3) & 14));
        catchingFishSharedFlowMVI.CatchingFishStateLiveData(false);
        catchingFishSharedFlowMVI.CatchingFishStateLiveData(false);
        catchingFishSharedFlowMVI.CatchingFishDaggerHiltFAB = catchingFishWidgetToolbar.CatchingFishCoroutine() != 0;
        catchingFishSharedFlowMVI.CatchingFishEspressoMockk = null;
        CatchingFishRoomDatabase2 = catchingFishSharedFlowMVI.CatchingFishRoomDatabase();
        if (CatchingFishRoomDatabase2 == null) {
        }
    }

    public static CatchingFishPicassoContext CatchingFishCoroutineFlow(CatchingFishPicassoContext catchingFishPicassoContext, CatchingFishGlidePayPal catchingFishGlidePayPal) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishGlidePayPal, "key");
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishPicassoContext.getKey(), catchingFishGlidePayPal)) {
            return catchingFishPicassoContext;
        }
        return null;
    }

    public static boolean CatchingFishCustomView(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static final CatchingFishSnackbarLayout CatchingFishDagger(CatchingFishFluxExoPlayer catchingFishFluxExoPlayer) {
        return new CatchingFishSnackbarLayout(Math.round(catchingFishFluxExoPlayer.CatchingFishParcelableFAB), Math.round(catchingFishFluxExoPlayer.CatchingFishSnackbar), Math.round(catchingFishFluxExoPlayer.CatchingFishCoroutine), Math.round(catchingFishFluxExoPlayer.CatchingFishReduxKtor));
    }

    public static final CatchingFishLayoutGsonRoom CatchingFishDaggerHiltFAB(CatchingFishMVPManifest catchingFishMVPManifest) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            CatchingFishMVIGraphQLHilt CatchingFishParcelableFAB2 = catchingFishMVPManifest.CatchingFishParcelableFAB();
            CatchingFishBiometricRoom catchingFishBiometricRoom = CatchingFishParcelableFAB2.CatchingFishCoroutine;
            if (catchingFishBiometricRoom.CatchingFishFragmentFactory() && catchingFishBiometricRoom.CatchingFishCustomView()) {
                CatchingFishLayoutGsonRoom catchingFishLayoutGsonRoom = new CatchingFishLayoutGsonRoom(48);
                CatchingFishEspressoPayPal catchingFishEspressoPayPal = new CatchingFishEspressoPayPal(5);
                CatchingFishSnackbarLayout CatchingFishDagger = CatchingFishDagger(CatchingFishParcelableFAB2.CatchingFishViewModelScope());
                ((Region) catchingFishEspressoPayPal.CatchingFishDaggerWebsocket).set(CatchingFishDagger.CatchingFishParcelableFAB, CatchingFishDagger.CatchingFishSnackbar, CatchingFishDagger.CatchingFishCoroutine, CatchingFishDagger.CatchingFishReduxKtor);
                CatchingFishSpannableWidget(catchingFishEspressoPayPal, CatchingFishParcelableFAB2, catchingFishLayoutGsonRoom, CatchingFishParcelableFAB2, new CatchingFishEspressoPayPal(5));
                return catchingFishLayoutGsonRoom;
            }
            CatchingFishLayoutGsonRoom catchingFishLayoutGsonRoom2 = CatchingFishFluxCardView.CatchingFishParcelableFAB;
            CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishLayoutGsonRoom2, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
            return catchingFishLayoutGsonRoom2;
        } finally {
            Trace.endSection();
        }
    }

    public static final boolean CatchingFishDaggerWebsocket(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final void CatchingFishEspressoMockk(CatchingFishManifestMockk catchingFishManifestMockk, Object obj) {
        if (obj == CatchingFishStateLiveData) {
            return;
        }
        if (!(obj instanceof CatchingFishMockkIntent)) {
            Object CatchingFishEspressoTesting2 = catchingFishManifestMockk.CatchingFishEspressoTesting(null, CatchingFishNavigation);
            CatchingFishFirebaseDagger.CatchingFishStateLiveData(CatchingFishEspressoTesting2, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            CatchingFishMVPLiveData.CatchingFishDaggerHiltFAB(CatchingFishEspressoTesting2);
            throw null;
        }
        CatchingFishMockkIntent catchingFishMockkIntent = (CatchingFishMockkIntent) obj;
        CatchingFishMVPKtor[] catchingFishMVPKtorArr = catchingFishMockkIntent.CatchingFishSnackbar;
        int length = catchingFishMVPKtorArr.length - 1;
        if (length < 0) {
            return;
        }
        CatchingFishMVPKtor catchingFishMVPKtor = catchingFishMVPKtorArr[length];
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(null);
        Object obj2 = catchingFishMockkIntent.CatchingFishParcelableFAB[length];
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r5 != null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void CatchingFishFragmentFactory(Context context, String str) {
        synchronized (CatchingFishParcelableFAB) {
            if (str.equals("")) {
                context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
            try {
                FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                XmlSerializer newSerializer = Xml.newSerializer();
                try {
                    newSerializer.setOutput(openFileOutput, null);
                    newSerializer.startDocument(Constants.ENCODING, Boolean.TRUE);
                    newSerializer.startTag(null, "locales");
                    newSerializer.attribute(null, "application_locales", str);
                    newSerializer.endTag(null, "locales");
                    newSerializer.endDocument();
                } catch (Exception unused) {
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException unused2) {
                        }
                    }
                } catch (Throwable th) {
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused4) {
            }
        }
    }

    public static final int CatchingFishFragmentHandler(long[] jArr, int i, long j) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(jArr, "array");
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    public static int CatchingFishGradleManifest(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final CatchingFishBundleAndroidX CatchingFishGsonAppCompat(Context context) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(context, "<this>");
        Context applicationContext = context.getApplicationContext();
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(applicationContext, "null cannot be cast to non-null type com.catchingfish.fishcatcherpro.presentation.application.FishApp");
        CatchingFishBundleAndroidX catchingFishBundleAndroidX = ((FishApp) applicationContext).CatchingFishReduxKtor;
        if (catchingFishBundleAndroidX != null) {
            return catchingFishBundleAndroidX;
        }
        CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("appContainer");
        throw null;
    }

    public static final String CatchingFishHandler(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static CatchingFishWebSocketMockk CatchingFishJetpackCompose(String str) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(str, "<this>");
        byte[] bytes = str.getBytes(CatchingFishOkHttpToast.CatchingFishParcelableFAB);
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(bytes, "this as java.lang.String).getBytes(charset)");
        CatchingFishWebSocketMockk catchingFishWebSocketMockk = new CatchingFishWebSocketMockk(bytes);
        catchingFishWebSocketMockk.CatchingFishWorkManager = str;
        return catchingFishWebSocketMockk;
    }

    public static final int CatchingFishLayout(int i, int i2, int[] iArr) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(iArr, "array");
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final PorterDuff.Mode CatchingFishLayoutInflater(int i) {
        return i == 0 ? PorterDuff.Mode.CLEAR : i == 1 ? PorterDuff.Mode.SRC : i == 2 ? PorterDuff.Mode.DST : i == 3 ? PorterDuff.Mode.SRC_OVER : i == 4 ? PorterDuff.Mode.DST_OVER : i == 5 ? PorterDuff.Mode.SRC_IN : i == 6 ? PorterDuff.Mode.DST_IN : i == 7 ? PorterDuff.Mode.SRC_OUT : i == 8 ? PorterDuff.Mode.DST_OUT : i == 9 ? PorterDuff.Mode.SRC_ATOP : i == 10 ? PorterDuff.Mode.DST_ATOP : i == 11 ? PorterDuff.Mode.XOR : i == 12 ? PorterDuff.Mode.ADD : i == 14 ? PorterDuff.Mode.SCREEN : i == 15 ? PorterDuff.Mode.OVERLAY : i == 16 ? PorterDuff.Mode.DARKEN : i == 17 ? PorterDuff.Mode.LIGHTEN : i == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static CatchingFishManifestMockk CatchingFishMVPRobolectric(CatchingFishPicassoContext catchingFishPicassoContext, CatchingFishGlidePayPal catchingFishGlidePayPal) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishGlidePayPal, "key");
        return CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishPicassoContext.getKey(), catchingFishGlidePayPal) ? CatchingFishPayPalDataStore.CatchingFishReduxKtor : catchingFishPicassoContext;
    }

    public static final BlendMode CatchingFishMotionLayout(int i) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        BlendMode blendMode10;
        BlendMode blendMode11;
        BlendMode blendMode12;
        BlendMode blendMode13;
        BlendMode blendMode14;
        BlendMode blendMode15;
        BlendMode blendMode16;
        BlendMode blendMode17;
        BlendMode blendMode18;
        BlendMode blendMode19;
        BlendMode blendMode20;
        BlendMode blendMode21;
        BlendMode blendMode22;
        BlendMode blendMode23;
        BlendMode blendMode24;
        BlendMode blendMode25;
        BlendMode blendMode26;
        BlendMode blendMode27;
        BlendMode blendMode28;
        BlendMode blendMode29;
        BlendMode blendMode30;
        if (i == 0) {
            blendMode30 = BlendMode.CLEAR;
            return blendMode30;
        }
        if (i == 1) {
            blendMode29 = BlendMode.SRC;
            return blendMode29;
        }
        if (i == 2) {
            blendMode28 = BlendMode.DST;
            return blendMode28;
        }
        if (i == 3) {
            blendMode27 = BlendMode.SRC_OVER;
            return blendMode27;
        }
        if (i == 4) {
            blendMode26 = BlendMode.DST_OVER;
            return blendMode26;
        }
        if (i == 5) {
            blendMode25 = BlendMode.SRC_IN;
            return blendMode25;
        }
        if (i == 6) {
            blendMode24 = BlendMode.DST_IN;
            return blendMode24;
        }
        if (i == 7) {
            blendMode23 = BlendMode.SRC_OUT;
            return blendMode23;
        }
        if (i == 8) {
            blendMode22 = BlendMode.DST_OUT;
            return blendMode22;
        }
        if (i == 9) {
            blendMode21 = BlendMode.SRC_ATOP;
            return blendMode21;
        }
        if (i == 10) {
            blendMode20 = BlendMode.DST_ATOP;
            return blendMode20;
        }
        if (i == 11) {
            blendMode19 = BlendMode.XOR;
            return blendMode19;
        }
        if (i == 12) {
            blendMode18 = BlendMode.PLUS;
            return blendMode18;
        }
        if (i == 13) {
            blendMode17 = BlendMode.MODULATE;
            return blendMode17;
        }
        if (i == 14) {
            blendMode16 = BlendMode.SCREEN;
            return blendMode16;
        }
        if (i == 15) {
            blendMode15 = BlendMode.OVERLAY;
            return blendMode15;
        }
        if (i == 16) {
            blendMode14 = BlendMode.DARKEN;
            return blendMode14;
        }
        if (i == 17) {
            blendMode13 = BlendMode.LIGHTEN;
            return blendMode13;
        }
        if (i == 18) {
            blendMode12 = BlendMode.COLOR_DODGE;
            return blendMode12;
        }
        if (i == 19) {
            blendMode11 = BlendMode.COLOR_BURN;
            return blendMode11;
        }
        if (i == 20) {
            blendMode10 = BlendMode.HARD_LIGHT;
            return blendMode10;
        }
        if (i == 21) {
            blendMode9 = BlendMode.SOFT_LIGHT;
            return blendMode9;
        }
        if (i == 22) {
            blendMode8 = BlendMode.DIFFERENCE;
            return blendMode8;
        }
        if (i == 23) {
            blendMode7 = BlendMode.EXCLUSION;
            return blendMode7;
        }
        if (i == 24) {
            blendMode6 = BlendMode.MULTIPLY;
            return blendMode6;
        }
        if (i == 25) {
            blendMode5 = BlendMode.HUE;
            return blendMode5;
        }
        if (i == 26) {
            blendMode4 = BlendMode.SATURATION;
            return blendMode4;
        }
        if (i == 27) {
            blendMode3 = BlendMode.COLOR;
            return blendMode3;
        }
        if (i == 28) {
            blendMode2 = BlendMode.LUMINOSITY;
            return blendMode2;
        }
        blendMode = BlendMode.SRC_OVER;
        return blendMode;
    }

    public static CatchingFishManifestMockk CatchingFishMutableLiveData(CatchingFishPicassoContext catchingFishPicassoContext, CatchingFishManifestMockk catchingFishManifestMockk) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishManifestMockk, "context");
        return catchingFishManifestMockk == CatchingFishPayPalDataStore.CatchingFishReduxKtor ? catchingFishPicassoContext : (CatchingFishManifestMockk) catchingFishManifestMockk.CatchingFishEspressoTesting(catchingFishPicassoContext, new CatchingFishRealmCustomView(1, (byte) 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CatchingFishRoomRealmMVI CatchingFishNavigation(Context context) {
        ProviderInfo providerInfo;
        CatchingFishViewAsyncTask catchingFishViewAsyncTask;
        ApplicationInfo applicationInfo;
        CatchingFishMVPExoPlayer catchingFishReduxNavigation = Build.VERSION.SDK_INT >= 28 ? new CatchingFishReduxNavigation(17) : new CatchingFishMVPExoPlayer(17);
        PackageManager packageManager = context.getPackageManager();
        CatchingFishHiltMVPToast.CatchingFishWorkManager(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] CatchingFishAnimationMockk2 = catchingFishReduxNavigation.CatchingFishAnimationMockk(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : CatchingFishAnimationMockk2) {
                    arrayList.add(signature.toByteArray());
                }
                catchingFishViewAsyncTask = new CatchingFishViewAsyncTask(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (catchingFishViewAsyncTask != null) {
                return null;
            }
            return new CatchingFishRoomRealmMVI(new CatchingFishIntentLiveData(context, catchingFishViewAsyncTask));
        }
        catchingFishViewAsyncTask = null;
        if (catchingFishViewAsyncTask != null) {
        }
    }

    public static String CatchingFishParcelable(int i) {
        return i == 0 ? "Clear" : i == 1 ? "Src" : i == 2 ? "Dst" : i == 3 ? "SrcOver" : i == 4 ? "DstOver" : i == 5 ? "SrcIn" : i == 6 ? "DstIn" : i == 7 ? "SrcOut" : i == 8 ? "DstOut" : i == 9 ? "SrcAtop" : i == 10 ? "DstAtop" : i == 11 ? "Xor" : i == 12 ? "Plus" : i == 13 ? "Modulate" : i == 14 ? "Screen" : i == 15 ? "Overlay" : i == 16 ? "Darken" : i == 17 ? "Lighten" : i == 18 ? "ColorDodge" : i == 19 ? "ColorBurn" : i == 20 ? "HardLight" : i == 21 ? "Softlight" : i == 22 ? "Difference" : i == 23 ? "Exclusion" : i == 24 ? "Multiply" : i == 25 ? "Hue" : i == 26 ? "Saturation" : i == 27 ? "Color" : i == 28 ? "Luminosity" : "Unknown";
    }

    public static CatchingFishPicassoCameraX CatchingFishParcelableFAB(int i, CatchingFishCoroutineToast catchingFishCoroutineToast, int i2) {
        int i3 = i2 & 2;
        CatchingFishCoroutineToast catchingFishCoroutineToast2 = CatchingFishCoroutineToast.CatchingFishReduxKtor;
        if (i3 != 0) {
            catchingFishCoroutineToast = catchingFishCoroutineToast2;
        }
        if (i == -2) {
            if (catchingFishCoroutineToast != catchingFishCoroutineToast2) {
                return new CatchingFishLifecycleMVP(1, catchingFishCoroutineToast);
            }
            CatchingFishMVIRobolectric.CatchingFishParcelableFAB.getClass();
            return new CatchingFishPicassoCameraX(CatchingFishMVPService.CatchingFishSnackbar);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? catchingFishCoroutineToast == catchingFishCoroutineToast2 ? new CatchingFishPicassoCameraX(i) : new CatchingFishLifecycleMVP(i, catchingFishCoroutineToast) : new CatchingFishPicassoCameraX(Integer.MAX_VALUE) : catchingFishCoroutineToast == catchingFishCoroutineToast2 ? new CatchingFishPicassoCameraX(0) : new CatchingFishLifecycleMVP(1, catchingFishCoroutineToast);
        }
        if (catchingFishCoroutineToast == catchingFishCoroutineToast2) {
            return new CatchingFishLifecycleMVP(1, CatchingFishCoroutineToast.CatchingFishDaggerWebsocket);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    public static final int CatchingFishParcelableFlux(CatchingFishFragmentToolbar catchingFishFragmentToolbar, int i) {
        boolean z = CatchingFishFirebaseDagger.CatchingFishJetpackCompose(catchingFishFragmentToolbar.CatchingFishReduxKtor, CatchingFishFragmentToolbar.CatchingFishDaggerWebsocket.CatchingFishReduxKtor) >= 0;
        boolean z2 = i == 1;
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    public static final boolean CatchingFishPayPal(CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt) {
        CatchingFishDaggerToolbar CatchingFishReduxKtor2 = catchingFishMVIGraphQLHilt.CatchingFishReduxKtor();
        CatchingFishMVPMotionLayout catchingFishMVPMotionLayout = catchingFishMVIGraphQLHilt.CatchingFishReduxKtor;
        if (CatchingFishReduxKtor2 != null ? CatchingFishReduxKtor2.CatchingFishDaggerAppCompat() : false) {
            return true;
        }
        CatchingFishGraphQLLayout catchingFishGraphQLLayout = CatchingFishServiceMVI.CatchingFishParcelableFAB;
        if (catchingFishMVPMotionLayout.CatchingFishReduxKtor.CatchingFishCoroutine(CatchingFishServiceMVI.CatchingFishAnimationMockk)) {
            return true;
        }
        return catchingFishMVPMotionLayout.CatchingFishReduxKtor.CatchingFishCoroutine(CatchingFishServiceMVI.CatchingFishUnitTesting);
    }

    public static final Object CatchingFishPayPalLiveData(CatchingFishManifestMockk catchingFishManifestMockk) {
        Object CatchingFishEspressoTesting2 = catchingFishManifestMockk.CatchingFishEspressoTesting(0, CatchingFishRoomDatabase);
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(CatchingFishEspressoTesting2);
        return CatchingFishEspressoTesting2;
    }

    public static final Object CatchingFishRecyclerView(CatchingFishManifestMockk catchingFishManifestMockk, Object obj) {
        if (obj == null) {
            obj = CatchingFishPayPalLiveData(catchingFishManifestMockk);
        }
        if (obj == 0) {
            return CatchingFishStateLiveData;
        }
        if (obj instanceof Integer) {
            return catchingFishManifestMockk.CatchingFishEspressoTesting(new CatchingFishMockkIntent(((Number) obj).intValue(), catchingFishManifestMockk), CatchingFish);
        }
        CatchingFishMVPLiveData.CatchingFishDaggerHiltFAB(obj);
        throw null;
    }

    public static final int CatchingFishReduxKtor(CatchingFishWidgetXMLLayout catchingFishWidgetXMLLayout, CatchingFishMoshiMVVM catchingFishMoshiMVVM) {
        CatchingFishWidgetXMLLayout CatchingFishMVVMAppCompat = catchingFishWidgetXMLLayout.CatchingFishMVVMAppCompat();
        if (CatchingFishMVVMAppCompat == null) {
            CatchingFishFluxGradle.CatchingFishSnackbar("Child of " + catchingFishWidgetXMLLayout + " cannot be null when calculating alignment line");
        }
        if (catchingFishWidgetXMLLayout.CatchingFishNavigationGson().CatchingFishParcelableFAB().containsKey(catchingFishMoshiMVVM)) {
            Integer num = (Integer) catchingFishWidgetXMLLayout.CatchingFishNavigationGson().CatchingFishParcelableFAB().get(catchingFishMoshiMVVM);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int CatchingFishAnimation = CatchingFishMVVMAppCompat.CatchingFishAnimation(catchingFishMoshiMVVM);
            if (CatchingFishAnimation != Integer.MIN_VALUE) {
                CatchingFishMVVMAppCompat.CatchingFishEspressoTesting = true;
                catchingFishWidgetXMLLayout.CatchingFishOkHttp = true;
                catchingFishWidgetXMLLayout.CatchingFishGradleLiveData();
                CatchingFishMVVMAppCompat.CatchingFishEspressoTesting = false;
                catchingFishWidgetXMLLayout.CatchingFishOkHttp = false;
                return CatchingFishAnimation + ((int) (catchingFishMoshiMVVM instanceof CatchingFishMoshiMVVM ? CatchingFishMVVMAppCompat.CatchingFishCustomViewJUnit() & 4294967295L : CatchingFishMVVMAppCompat.CatchingFishCustomViewJUnit() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static int CatchingFishRoomDatabase(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (r2 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002e, code lost:
    
        if (r5 != 4) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x003b, code lost:
    
        if (r3.getName().equals("locales") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x003d, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String CatchingFishSensorManager(Context context) {
        String str;
        synchronized (CatchingFishParcelableFAB) {
            str = "";
            try {
                FileInputStream openFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                try {
                    XmlPullParser newPullParser = Xml.newPullParser();
                    newPullParser.setInput(openFileInput, Constants.ENCODING);
                    int depth = newPullParser.getDepth();
                    while (true) {
                        int next = newPullParser.next();
                        if (next != 1) {
                            if (next == 3 && newPullParser.getDepth() <= depth) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } catch (IOException | XmlPullParserException unused) {
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (str.isEmpty()) {
                        context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    }
                    return str;
                } catch (Throwable th) {
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused4) {
                return "";
            }
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CatchingFishSnackbar(CatchingFishServiceGraphQL catchingFishServiceGraphQL, CatchingFishLifecycleRedux catchingFishLifecycleRedux, CatchingFishSharedFlowMVI catchingFishSharedFlowMVI, int i) {
        CatchingFishPayPalView catchingFishPayPalView;
        boolean z;
        CatchingFishHiltFAB CatchingFishRoomDatabase2;
        catchingFishSharedFlowMVI.CatchingFishRecyclerView(-149765515);
        CatchingFishWidgetToolbar catchingFishWidgetToolbar = catchingFishSharedFlowMVI.CatchingFishSpannableWidget;
        CatchingFishKtorNavigation CatchingFishCloudMessaging2 = catchingFishSharedFlowMVI.CatchingFishCloudMessaging();
        catchingFishSharedFlowMVI.CatchingFishMotionLayout(201, CatchingFishUnitTestingFlux.CatchingFishSnackbar);
        Object CatchingFishPayPalService = catchingFishSharedFlowMVI.CatchingFishPayPalService();
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(CatchingFishPayPalService, CatchingFishGsonOkHttp.CatchingFishParcelableFAB)) {
            catchingFishPayPalView = null;
        } else {
            CatchingFishFirebaseDagger.CatchingFishStateLiveData(CatchingFishPayPalService, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            catchingFishPayPalView = (CatchingFishPayPalView) CatchingFishPayPalService;
        }
        CatchingFishStripeAPILayout catchingFishStripeAPILayout = (CatchingFishStripeAPILayout) catchingFishServiceGraphQL.CatchingFishWorkManager;
        CatchingFishPayPalView CatchingFishCoroutine2 = catchingFishStripeAPILayout.CatchingFishCoroutine(catchingFishServiceGraphQL, catchingFishPayPalView);
        boolean equals = CatchingFishCoroutine2.equals(catchingFishPayPalView);
        if (!equals) {
            catchingFishSharedFlowMVI.CatchingFishMoshiDaggerHilt(CatchingFishCoroutine2);
        }
        if (catchingFishSharedFlowMVI.CatchingFishLayoutInflater) {
            if (catchingFishServiceGraphQL.CatchingFishDaggerWebsocket || !((CatchingFishKtorToolbar) CatchingFishCloudMessaging2).containsKey(catchingFishStripeAPILayout)) {
                CatchingFishCloudMessaging2 = ((CatchingFishKtorToolbar) CatchingFishCloudMessaging2).CatchingFishSnackbar(catchingFishStripeAPILayout, CatchingFishCoroutine2);
            }
            catchingFishSharedFlowMVI.CatchingFishSensorManager = true;
        } else {
            CatchingFishAnimationMVP catchingFishAnimationMVP = catchingFishSharedFlowMVI.CatchingFishMutableLiveData;
            Object CatchingFishSnackbar2 = catchingFishAnimationMVP.CatchingFishSnackbar(catchingFishAnimationMVP.CatchingFishSnackbar, catchingFishAnimationMVP.CatchingFishViewModelScope);
            CatchingFishFirebaseDagger.CatchingFishStateLiveData(CatchingFishSnackbar2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            CatchingFishKtorNavigation catchingFishKtorNavigation = (CatchingFishKtorNavigation) CatchingFishSnackbar2;
            if (!(catchingFishSharedFlowMVI.CatchingFishSpannableWidget() && equals) && (catchingFishServiceGraphQL.CatchingFishDaggerWebsocket || !((CatchingFishKtorToolbar) CatchingFishCloudMessaging2).containsKey(catchingFishStripeAPILayout))) {
                CatchingFishCloudMessaging2 = ((CatchingFishKtorToolbar) CatchingFishCloudMessaging2).CatchingFishSnackbar(catchingFishStripeAPILayout, CatchingFishCoroutine2);
            } else if ((equals && !catchingFishSharedFlowMVI.CatchingFishDaggerHiltFAB) || !catchingFishSharedFlowMVI.CatchingFishDaggerHiltFAB) {
                CatchingFishCloudMessaging2 = catchingFishKtorNavigation;
            }
            if (catchingFishSharedFlowMVI.CatchingFishParcelableFlux || catchingFishKtorNavigation != CatchingFishCloudMessaging2) {
                z = true;
                if (z && !catchingFishSharedFlowMVI.CatchingFishLayoutInflater) {
                    catchingFishSharedFlowMVI.CatchingFishMutableLiveData(CatchingFishCloudMessaging2);
                }
                catchingFishWidgetToolbar.CatchingFishReduxKtor(catchingFishSharedFlowMVI.CatchingFishDaggerHiltFAB ? 1 : 0);
                catchingFishSharedFlowMVI.CatchingFishDaggerHiltFAB = z;
                catchingFishSharedFlowMVI.CatchingFishEspressoMockk = CatchingFishCloudMessaging2;
                catchingFishSharedFlowMVI.CatchingFishGradleManifest(202, CatchingFishUnitTestingFlux.CatchingFishCoroutine, 0, CatchingFishCloudMessaging2);
                catchingFishLifecycleRedux.CatchingFishDaggerWebsocket(catchingFishSharedFlowMVI, Integer.valueOf((i >> 3) & 14));
                catchingFishSharedFlowMVI.CatchingFishStateLiveData(false);
                catchingFishSharedFlowMVI.CatchingFishStateLiveData(false);
                catchingFishSharedFlowMVI.CatchingFishDaggerHiltFAB = catchingFishWidgetToolbar.CatchingFishCoroutine() != 0;
                catchingFishSharedFlowMVI.CatchingFishEspressoMockk = null;
                CatchingFishRoomDatabase2 = catchingFishSharedFlowMVI.CatchingFishRoomDatabase();
                if (CatchingFishRoomDatabase2 == null) {
                    CatchingFishRoomDatabase2.CatchingFishReduxKtor = new CatchingFishGlideAndroidX(catchingFishServiceGraphQL, catchingFishLifecycleRedux, i);
                    return;
                }
                return;
            }
        }
        z = false;
        if (z) {
            catchingFishSharedFlowMVI.CatchingFishMutableLiveData(CatchingFishCloudMessaging2);
        }
        catchingFishWidgetToolbar.CatchingFishReduxKtor(catchingFishSharedFlowMVI.CatchingFishDaggerHiltFAB ? 1 : 0);
        catchingFishSharedFlowMVI.CatchingFishDaggerHiltFAB = z;
        catchingFishSharedFlowMVI.CatchingFishEspressoMockk = CatchingFishCloudMessaging2;
        catchingFishSharedFlowMVI.CatchingFishGradleManifest(202, CatchingFishUnitTestingFlux.CatchingFishCoroutine, 0, CatchingFishCloudMessaging2);
        catchingFishLifecycleRedux.CatchingFishDaggerWebsocket(catchingFishSharedFlowMVI, Integer.valueOf((i >> 3) & 14));
        catchingFishSharedFlowMVI.CatchingFishStateLiveData(false);
        catchingFishSharedFlowMVI.CatchingFishStateLiveData(false);
        catchingFishSharedFlowMVI.CatchingFishDaggerHiltFAB = catchingFishWidgetToolbar.CatchingFishCoroutine() != 0;
        catchingFishSharedFlowMVI.CatchingFishEspressoMockk = null;
        CatchingFishRoomDatabase2 = catchingFishSharedFlowMVI.CatchingFishRoomDatabase();
        if (CatchingFishRoomDatabase2 == null) {
        }
    }

    public static final void CatchingFishSpannableWidget(CatchingFishEspressoPayPal catchingFishEspressoPayPal, CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt, CatchingFishLayoutGsonRoom catchingFishLayoutGsonRoom, CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt2, CatchingFishEspressoPayPal catchingFishEspressoPayPal2) {
        CatchingFishFluxExoPlayer CatchingFishRetrofitCameraX;
        CatchingFishBiometricRoom catchingFishBiometricRoom;
        int i = catchingFishMVIGraphQLHilt.CatchingFishViewModelScope;
        Region region = (Region) catchingFishEspressoPayPal2.CatchingFishDaggerWebsocket;
        CatchingFishBiometricRoom catchingFishBiometricRoom2 = catchingFishMVIGraphQLHilt2.CatchingFishCoroutine;
        int i2 = catchingFishMVIGraphQLHilt2.CatchingFishViewModelScope;
        boolean z = (catchingFishBiometricRoom2.CatchingFishFragmentFactory() && catchingFishBiometricRoom2.CatchingFishCustomView()) ? false : true;
        Region region2 = (Region) catchingFishEspressoPayPal.CatchingFishDaggerWebsocket;
        if (!region2.isEmpty() || i2 == i) {
            if (!z || catchingFishMVIGraphQLHilt2.CatchingFishDaggerWebsocket) {
                Object CatchingFishWorkManager2 = catchingFishMVIGraphQLHilt2.CatchingFishWorkManager();
                if (CatchingFishWorkManager2 == null) {
                    CatchingFishRetrofitCameraX = ((CatchingFishGlideHandler) catchingFishBiometricRoom2.CatchingFishJobScheduler.CatchingFishViewModelScope).CatchingFishRetrofitCameraX();
                } else {
                    CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB = ((CatchingFishFABStripeAPIFAB) CatchingFishWorkManager2).CatchingFishReduxKtor;
                    Object CatchingFishViewModelScope2 = catchingFishMVIGraphQLHilt2.CatchingFishReduxKtor.CatchingFishReduxKtor.CatchingFishViewModelScope(CatchingFishViewStripeAPI.CatchingFishSnackbar);
                    if (CatchingFishViewModelScope2 == null) {
                        CatchingFishViewModelScope2 = null;
                    }
                    boolean z2 = CatchingFishViewModelScope2 != null;
                    if (!catchingFishFABStripeAPIFAB.CatchingFishReduxKtor.CatchingFishRoomDatabase) {
                        CatchingFishRetrofitCameraX = CatchingFishFluxExoPlayer.CatchingFishDaggerWebsocket;
                    } else if (z2) {
                        CatchingFishRetrofitCameraX = CatchingFishXMLLayoutGlide.CatchingFishMutableLiveData(catchingFishFABStripeAPIFAB, 8).CatchingFishRetrofitCameraX();
                    } else {
                        CatchingFishDaggerToolbar CatchingFishMutableLiveData = CatchingFishXMLLayoutGlide.CatchingFishMutableLiveData(catchingFishFABStripeAPIFAB, 8);
                        CatchingFishRetrofitCameraX = CatchingFishLayoutRoomFAB.CatchingFishParcelableFlux(CatchingFishMutableLiveData).CatchingFishStateLiveData(CatchingFishMutableLiveData, true);
                    }
                }
                CatchingFishSnackbarLayout CatchingFishDagger = CatchingFishDagger(CatchingFishRetrofitCameraX);
                region.set(CatchingFishDagger.CatchingFishParcelableFAB, CatchingFishDagger.CatchingFishSnackbar, CatchingFishDagger.CatchingFishCoroutine, CatchingFishDagger.CatchingFishReduxKtor);
                if (i2 == i) {
                    i2 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (catchingFishMVIGraphQLHilt2.CatchingFishDaggerWebsocket) {
                        CatchingFishMVIGraphQLHilt CatchingFishEspressoTesting2 = catchingFishMVIGraphQLHilt2.CatchingFishEspressoTesting();
                        catchingFishLayoutGsonRoom.CatchingFishViewModelFAB(i2, new CatchingFishMoshiKtor(catchingFishMVIGraphQLHilt2, CatchingFishDagger((CatchingFishEspressoTesting2 == null || (catchingFishBiometricRoom = CatchingFishEspressoTesting2.CatchingFishCoroutine) == null || !catchingFishBiometricRoom.CatchingFishFragmentFactory()) ? CatchingFishAnimationMockk : CatchingFishEspressoTesting2.CatchingFishViewModelScope())));
                        return;
                    } else {
                        if (i2 == -1) {
                            Rect bounds = region.getBounds();
                            catchingFishLayoutGsonRoom.CatchingFishViewModelFAB(i2, new CatchingFishMoshiKtor(catchingFishMVIGraphQLHilt2, new CatchingFishSnackbarLayout(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                catchingFishLayoutGsonRoom.CatchingFishViewModelFAB(i2, new CatchingFishMoshiKtor(catchingFishMVIGraphQLHilt2, new CatchingFishSnackbarLayout(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List CatchingFishFragmentHandler2 = CatchingFishMVIGraphQLHilt.CatchingFishFragmentHandler(4, catchingFishMVIGraphQLHilt2);
                for (int size = CatchingFishFragmentHandler2.size() - 1; -1 < size; size--) {
                    if (!((CatchingFishMVIGraphQLHilt) CatchingFishFragmentHandler2.get(size)).CatchingFishCloudMessaging().CatchingFishReduxKtor.CatchingFishCoroutine(CatchingFishServiceMVI.CatchingFishSpannableWidget)) {
                        CatchingFishSpannableWidget(catchingFishEspressoPayPal, catchingFishMVIGraphQLHilt, catchingFishLayoutGsonRoom, (CatchingFishMVIGraphQLHilt) CatchingFishFragmentHandler2.get(size), catchingFishEspressoPayPal2);
                    }
                }
                if (CatchingFishCardViewView(catchingFishMVIGraphQLHilt2)) {
                    region2.op(CatchingFishDagger.CatchingFishParcelableFAB, CatchingFishDagger.CatchingFishSnackbar, CatchingFishDagger.CatchingFishCoroutine, CatchingFishDagger.CatchingFishReduxKtor, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final void CatchingFishStateLiveData(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i > i2) {
                throw new IllegalArgumentException(CatchingFishMVPLiveData.CatchingFishFragmentHandler(i, i2, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
    }

    public static final void CatchingFishUnitTesting(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(CatchingFishMVPLiveData.CatchingFishFragmentHandler(i, i2, "index: ", ", size: "));
        }
    }

    public static void CatchingFishViewModelFAB(Throwable th, Throwable th2) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(th, "<this>");
        CatchingFishFirebaseDagger.CatchingFishNavigation(th2, "exception");
        if (th != th2) {
            Integer num = CatchingFishKtorKtor.CatchingFishParcelableFAB;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = CatchingFishRealmDataStore.CatchingFishParcelableFAB;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final View CatchingFishViewModelScope(CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB) {
        CatchingFishReduxRetrofit catchingFishReduxRetrofit = CatchingFishXMLLayoutGlide.CatchingFishJobScheduler(catchingFishFABStripeAPIFAB.CatchingFishReduxKtor).CatchingFishRoomDatabase;
        View interopView = catchingFishReduxRetrofit != null ? catchingFishReduxRetrofit.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }

    public static final Rect CatchingFishWorkManager(CatchingFishViewManifest catchingFishViewManifest, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        CatchingFishAppCompatWidget CatchingFishNavigation2 = CatchingFishGsonCardView.CatchingFishNavigation(((CatchingFishExoPlayerOkHttp) catchingFishViewManifest).CatchingFishCoroutine);
        CatchingFishFluxExoPlayer CatchingFishJetpackCompose = CatchingFishNavigation2 != null ? CatchingFishGsonCardView.CatchingFishJetpackCompose(CatchingFishNavigation2) : null;
        if (CatchingFishJetpackCompose == null) {
            return null;
        }
        int i = (int) CatchingFishJetpackCompose.CatchingFishParcelableFAB;
        int i2 = iArr[0];
        int i3 = iArr2[0];
        int i4 = (int) CatchingFishJetpackCompose.CatchingFishSnackbar;
        int i5 = iArr[1];
        int i6 = iArr2[1];
        return new Rect((i + i2) - i3, (i4 + i5) - i6, (((int) CatchingFishJetpackCompose.CatchingFishCoroutine) + i2) - i3, (((int) CatchingFishJetpackCompose.CatchingFishReduxKtor) + i5) - i6);
    }

    public abstract boolean CatchingFishCloudMessaging(CatchingFishAsyncTask catchingFishAsyncTask, CatchingFishMoshi catchingFishMoshi);

    public abstract boolean CatchingFishEspressoTesting(CatchingFishAsyncTask catchingFishAsyncTask, Object obj, Object obj2);

    public abstract void CatchingFishJobScheduler(CatchingFishExoPlayerWidget catchingFishExoPlayerWidget, CatchingFishExoPlayerWidget catchingFishExoPlayerWidget2);

    public abstract boolean CatchingFishOkHttp(CatchingFishAsyncTask catchingFishAsyncTask, CatchingFishExoPlayerWidget catchingFishExoPlayerWidget, CatchingFishExoPlayerWidget catchingFishExoPlayerWidget2);

    public abstract void CatchingFishPayPalService(CatchingFishExoPlayerWidget catchingFishExoPlayerWidget, Thread thread);
}
