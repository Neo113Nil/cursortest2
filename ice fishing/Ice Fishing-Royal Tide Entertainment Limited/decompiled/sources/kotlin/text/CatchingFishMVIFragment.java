package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishMVIFragment extends CatchingFishEspressoHilt {
    public static final CatchingFishAsyncTaskWidget CatchingFishNavigation = new CatchingFishAsyncTaskWidget(1);
    public final CatchingFishFABPayPal CatchingFishAnimationMockk;
    public final CatchingFishReduxGson CatchingFishCloudMessaging;
    public final float CatchingFishDaggerWebsocket;
    public final CatchingFishFABPayPal CatchingFishEspressoTesting;
    public final float[] CatchingFishFragmentHandler;
    public final float[] CatchingFishLayout;
    public final CatchingFishDataStoreDagger CatchingFishOkHttp;
    public final CatchingFishRealmMVPKtor CatchingFishReduxKtor;
    public final boolean CatchingFishRoomDatabase;
    public final CatchingFishDataStoreDagger CatchingFishStateLiveData;
    public final CatchingFishReduxGson CatchingFishUnitTesting;
    public final float[] CatchingFishViewModelFAB;
    public final CatchingFishFABMVI CatchingFishViewModelScope;
    public final float CatchingFishWorkManager;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatchingFishMVIFragment(String str, float[] fArr, CatchingFishRealmMVPKtor catchingFishRealmMVPKtor, final CatchingFishFABMVI catchingFishFABMVI, int i) {
        this(str, fArr, catchingFishRealmMVPKtor, null, r4, r0, 0.0f, 1.0f, catchingFishFABMVI, i);
        CatchingFishReduxGson catchingFishReduxGson;
        CatchingFishReduxGson catchingFishReduxGson2;
        double d = catchingFishFABMVI.CatchingFishParcelableFAB;
        boolean z = d == -3.0d;
        double d2 = catchingFishFABMVI.CatchingFishViewModelScope;
        double d3 = catchingFishFABMVI.CatchingFishWorkManager;
        if (z) {
            final int i2 = 4;
            catchingFishReduxGson = new CatchingFishReduxGson() { // from class: kotlin.text.CatchingFishMVIMoshiView
                @Override // kotlin.text.CatchingFishReduxGson
                public final double CatchingFishCoroutine(double d4) {
                    int i3 = i2;
                    CatchingFishFABMVI catchingFishFABMVI2 = catchingFishFABMVI;
                    switch (i3) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            float[] fArr2 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                            return CatchingFishSnackbarGlide.CatchingFishParcelableFAB(catchingFishFABMVI2, d4);
                        case 1:
                            float[] fArr3 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                            return CatchingFishSnackbarGlide.CatchingFishCoroutine(catchingFishFABMVI2, d4);
                        case 2:
                            double d5 = catchingFishFABMVI2.CatchingFishSnackbar;
                            return d4 >= catchingFishFABMVI2.CatchingFishDaggerWebsocket ? Math.pow((d5 * d4) + catchingFishFABMVI2.CatchingFishCoroutine, catchingFishFABMVI2.CatchingFishParcelableFAB) : d4 * catchingFishFABMVI2.CatchingFishReduxKtor;
                        case 3:
                            double d6 = catchingFishFABMVI2.CatchingFishSnackbar;
                            double d7 = catchingFishFABMVI2.CatchingFishCoroutine;
                            double d8 = catchingFishFABMVI2.CatchingFishReduxKtor;
                            return d4 >= catchingFishFABMVI2.CatchingFishDaggerWebsocket ? Math.pow((d6 * d4) + d7, catchingFishFABMVI2.CatchingFishParcelableFAB) + catchingFishFABMVI2.CatchingFishWorkManager : (d8 * d4) + catchingFishFABMVI2.CatchingFishViewModelScope;
                        case 4:
                            float[] fArr4 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                            return CatchingFishSnackbarGlide.CatchingFishSnackbar(catchingFishFABMVI2, d4);
                        case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                            return CatchingFishSnackbarGlide.CatchingFishReduxKtor(catchingFishFABMVI2, d4);
                        case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d9 = catchingFishFABMVI2.CatchingFishSnackbar;
                            double d10 = catchingFishFABMVI2.CatchingFishCoroutine;
                            double d11 = catchingFishFABMVI2.CatchingFishReduxKtor;
                            return d4 >= catchingFishFABMVI2.CatchingFishDaggerWebsocket * d11 ? (Math.pow(d4, 1.0d / catchingFishFABMVI2.CatchingFishParcelableFAB) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = catchingFishFABMVI2.CatchingFishSnackbar;
                            double d13 = catchingFishFABMVI2.CatchingFishCoroutine;
                            double d14 = catchingFishFABMVI2.CatchingFishReduxKtor;
                            return d4 >= catchingFishFABMVI2.CatchingFishDaggerWebsocket * d14 ? (Math.pow(d4 - catchingFishFABMVI2.CatchingFishWorkManager, 1.0d / catchingFishFABMVI2.CatchingFishParcelableFAB) - d13) / d12 : (d4 - catchingFishFABMVI2.CatchingFishViewModelScope) / d14;
                    }
                }
            };
        } else if (d == -2.0d) {
            final int i3 = 5;
            catchingFishReduxGson = new CatchingFishReduxGson() { // from class: kotlin.text.CatchingFishMVIMoshiView
                @Override // kotlin.text.CatchingFishReduxGson
                public final double CatchingFishCoroutine(double d4) {
                    int i32 = i3;
                    CatchingFishFABMVI catchingFishFABMVI2 = catchingFishFABMVI;
                    switch (i32) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            float[] fArr2 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                            return CatchingFishSnackbarGlide.CatchingFishParcelableFAB(catchingFishFABMVI2, d4);
                        case 1:
                            float[] fArr3 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                            return CatchingFishSnackbarGlide.CatchingFishCoroutine(catchingFishFABMVI2, d4);
                        case 2:
                            double d5 = catchingFishFABMVI2.CatchingFishSnackbar;
                            return d4 >= catchingFishFABMVI2.CatchingFishDaggerWebsocket ? Math.pow((d5 * d4) + catchingFishFABMVI2.CatchingFishCoroutine, catchingFishFABMVI2.CatchingFishParcelableFAB) : d4 * catchingFishFABMVI2.CatchingFishReduxKtor;
                        case 3:
                            double d6 = catchingFishFABMVI2.CatchingFishSnackbar;
                            double d7 = catchingFishFABMVI2.CatchingFishCoroutine;
                            double d8 = catchingFishFABMVI2.CatchingFishReduxKtor;
                            return d4 >= catchingFishFABMVI2.CatchingFishDaggerWebsocket ? Math.pow((d6 * d4) + d7, catchingFishFABMVI2.CatchingFishParcelableFAB) + catchingFishFABMVI2.CatchingFishWorkManager : (d8 * d4) + catchingFishFABMVI2.CatchingFishViewModelScope;
                        case 4:
                            float[] fArr4 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                            return CatchingFishSnackbarGlide.CatchingFishSnackbar(catchingFishFABMVI2, d4);
                        case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                            return CatchingFishSnackbarGlide.CatchingFishReduxKtor(catchingFishFABMVI2, d4);
                        case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d9 = catchingFishFABMVI2.CatchingFishSnackbar;
                            double d10 = catchingFishFABMVI2.CatchingFishCoroutine;
                            double d11 = catchingFishFABMVI2.CatchingFishReduxKtor;
                            return d4 >= catchingFishFABMVI2.CatchingFishDaggerWebsocket * d11 ? (Math.pow(d4, 1.0d / catchingFishFABMVI2.CatchingFishParcelableFAB) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = catchingFishFABMVI2.CatchingFishSnackbar;
                            double d13 = catchingFishFABMVI2.CatchingFishCoroutine;
                            double d14 = catchingFishFABMVI2.CatchingFishReduxKtor;
                            return d4 >= catchingFishFABMVI2.CatchingFishDaggerWebsocket * d14 ? (Math.pow(d4 - catchingFishFABMVI2.CatchingFishWorkManager, 1.0d / catchingFishFABMVI2.CatchingFishParcelableFAB) - d13) / d12 : (d4 - catchingFishFABMVI2.CatchingFishViewModelScope) / d14;
                    }
                }
            };
        } else if (d3 == 0.0d && d2 == 0.0d) {
            final int i4 = 6;
            catchingFishReduxGson = new CatchingFishReduxGson() { // from class: kotlin.text.CatchingFishMVIMoshiView
                @Override // kotlin.text.CatchingFishReduxGson
                public final double CatchingFishCoroutine(double d4) {
                    int i32 = i4;
                    CatchingFishFABMVI catchingFishFABMVI2 = catchingFishFABMVI;
                    switch (i32) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            float[] fArr2 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                            return CatchingFishSnackbarGlide.CatchingFishParcelableFAB(catchingFishFABMVI2, d4);
                        case 1:
                            float[] fArr3 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                            return CatchingFishSnackbarGlide.CatchingFishCoroutine(catchingFishFABMVI2, d4);
                        case 2:
                            double d5 = catchingFishFABMVI2.CatchingFishSnackbar;
                            return d4 >= catchingFishFABMVI2.CatchingFishDaggerWebsocket ? Math.pow((d5 * d4) + catchingFishFABMVI2.CatchingFishCoroutine, catchingFishFABMVI2.CatchingFishParcelableFAB) : d4 * catchingFishFABMVI2.CatchingFishReduxKtor;
                        case 3:
                            double d6 = catchingFishFABMVI2.CatchingFishSnackbar;
                            double d7 = catchingFishFABMVI2.CatchingFishCoroutine;
                            double d8 = catchingFishFABMVI2.CatchingFishReduxKtor;
                            return d4 >= catchingFishFABMVI2.CatchingFishDaggerWebsocket ? Math.pow((d6 * d4) + d7, catchingFishFABMVI2.CatchingFishParcelableFAB) + catchingFishFABMVI2.CatchingFishWorkManager : (d8 * d4) + catchingFishFABMVI2.CatchingFishViewModelScope;
                        case 4:
                            float[] fArr4 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                            return CatchingFishSnackbarGlide.CatchingFishSnackbar(catchingFishFABMVI2, d4);
                        case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                            return CatchingFishSnackbarGlide.CatchingFishReduxKtor(catchingFishFABMVI2, d4);
                        case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d9 = catchingFishFABMVI2.CatchingFishSnackbar;
                            double d10 = catchingFishFABMVI2.CatchingFishCoroutine;
                            double d11 = catchingFishFABMVI2.CatchingFishReduxKtor;
                            return d4 >= catchingFishFABMVI2.CatchingFishDaggerWebsocket * d11 ? (Math.pow(d4, 1.0d / catchingFishFABMVI2.CatchingFishParcelableFAB) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = catchingFishFABMVI2.CatchingFishSnackbar;
                            double d13 = catchingFishFABMVI2.CatchingFishCoroutine;
                            double d14 = catchingFishFABMVI2.CatchingFishReduxKtor;
                            return d4 >= catchingFishFABMVI2.CatchingFishDaggerWebsocket * d14 ? (Math.pow(d4 - catchingFishFABMVI2.CatchingFishWorkManager, 1.0d / catchingFishFABMVI2.CatchingFishParcelableFAB) - d13) / d12 : (d4 - catchingFishFABMVI2.CatchingFishViewModelScope) / d14;
                    }
                }
            };
        } else {
            final int i5 = 7;
            catchingFishReduxGson = new CatchingFishReduxGson() { // from class: kotlin.text.CatchingFishMVIMoshiView
                @Override // kotlin.text.CatchingFishReduxGson
                public final double CatchingFishCoroutine(double d4) {
                    int i32 = i5;
                    CatchingFishFABMVI catchingFishFABMVI2 = catchingFishFABMVI;
                    switch (i32) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            float[] fArr2 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                            return CatchingFishSnackbarGlide.CatchingFishParcelableFAB(catchingFishFABMVI2, d4);
                        case 1:
                            float[] fArr3 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                            return CatchingFishSnackbarGlide.CatchingFishCoroutine(catchingFishFABMVI2, d4);
                        case 2:
                            double d5 = catchingFishFABMVI2.CatchingFishSnackbar;
                            return d4 >= catchingFishFABMVI2.CatchingFishDaggerWebsocket ? Math.pow((d5 * d4) + catchingFishFABMVI2.CatchingFishCoroutine, catchingFishFABMVI2.CatchingFishParcelableFAB) : d4 * catchingFishFABMVI2.CatchingFishReduxKtor;
                        case 3:
                            double d6 = catchingFishFABMVI2.CatchingFishSnackbar;
                            double d7 = catchingFishFABMVI2.CatchingFishCoroutine;
                            double d8 = catchingFishFABMVI2.CatchingFishReduxKtor;
                            return d4 >= catchingFishFABMVI2.CatchingFishDaggerWebsocket ? Math.pow((d6 * d4) + d7, catchingFishFABMVI2.CatchingFishParcelableFAB) + catchingFishFABMVI2.CatchingFishWorkManager : (d8 * d4) + catchingFishFABMVI2.CatchingFishViewModelScope;
                        case 4:
                            float[] fArr4 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                            return CatchingFishSnackbarGlide.CatchingFishSnackbar(catchingFishFABMVI2, d4);
                        case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                            return CatchingFishSnackbarGlide.CatchingFishReduxKtor(catchingFishFABMVI2, d4);
                        case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d9 = catchingFishFABMVI2.CatchingFishSnackbar;
                            double d10 = catchingFishFABMVI2.CatchingFishCoroutine;
                            double d11 = catchingFishFABMVI2.CatchingFishReduxKtor;
                            return d4 >= catchingFishFABMVI2.CatchingFishDaggerWebsocket * d11 ? (Math.pow(d4, 1.0d / catchingFishFABMVI2.CatchingFishParcelableFAB) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = catchingFishFABMVI2.CatchingFishSnackbar;
                            double d13 = catchingFishFABMVI2.CatchingFishCoroutine;
                            double d14 = catchingFishFABMVI2.CatchingFishReduxKtor;
                            return d4 >= catchingFishFABMVI2.CatchingFishDaggerWebsocket * d14 ? (Math.pow(d4 - catchingFishFABMVI2.CatchingFishWorkManager, 1.0d / catchingFishFABMVI2.CatchingFishParcelableFAB) - d13) / d12 : (d4 - catchingFishFABMVI2.CatchingFishViewModelScope) / d14;
                    }
                }
            };
        }
        if (d == -3.0d) {
            final int i6 = 0;
            catchingFishReduxGson2 = new CatchingFishReduxGson() { // from class: kotlin.text.CatchingFishMVIMoshiView
                @Override // kotlin.text.CatchingFishReduxGson
                public final double CatchingFishCoroutine(double d4) {
                    int i32 = i6;
                    CatchingFishFABMVI catchingFishFABMVI2 = catchingFishFABMVI;
                    switch (i32) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            float[] fArr2 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                            return CatchingFishSnackbarGlide.CatchingFishParcelableFAB(catchingFishFABMVI2, d4);
                        case 1:
                            float[] fArr3 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                            return CatchingFishSnackbarGlide.CatchingFishCoroutine(catchingFishFABMVI2, d4);
                        case 2:
                            double d5 = catchingFishFABMVI2.CatchingFishSnackbar;
                            return d4 >= catchingFishFABMVI2.CatchingFishDaggerWebsocket ? Math.pow((d5 * d4) + catchingFishFABMVI2.CatchingFishCoroutine, catchingFishFABMVI2.CatchingFishParcelableFAB) : d4 * catchingFishFABMVI2.CatchingFishReduxKtor;
                        case 3:
                            double d6 = catchingFishFABMVI2.CatchingFishSnackbar;
                            double d7 = catchingFishFABMVI2.CatchingFishCoroutine;
                            double d8 = catchingFishFABMVI2.CatchingFishReduxKtor;
                            return d4 >= catchingFishFABMVI2.CatchingFishDaggerWebsocket ? Math.pow((d6 * d4) + d7, catchingFishFABMVI2.CatchingFishParcelableFAB) + catchingFishFABMVI2.CatchingFishWorkManager : (d8 * d4) + catchingFishFABMVI2.CatchingFishViewModelScope;
                        case 4:
                            float[] fArr4 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                            return CatchingFishSnackbarGlide.CatchingFishSnackbar(catchingFishFABMVI2, d4);
                        case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                            return CatchingFishSnackbarGlide.CatchingFishReduxKtor(catchingFishFABMVI2, d4);
                        case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d9 = catchingFishFABMVI2.CatchingFishSnackbar;
                            double d10 = catchingFishFABMVI2.CatchingFishCoroutine;
                            double d11 = catchingFishFABMVI2.CatchingFishReduxKtor;
                            return d4 >= catchingFishFABMVI2.CatchingFishDaggerWebsocket * d11 ? (Math.pow(d4, 1.0d / catchingFishFABMVI2.CatchingFishParcelableFAB) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = catchingFishFABMVI2.CatchingFishSnackbar;
                            double d13 = catchingFishFABMVI2.CatchingFishCoroutine;
                            double d14 = catchingFishFABMVI2.CatchingFishReduxKtor;
                            return d4 >= catchingFishFABMVI2.CatchingFishDaggerWebsocket * d14 ? (Math.pow(d4 - catchingFishFABMVI2.CatchingFishWorkManager, 1.0d / catchingFishFABMVI2.CatchingFishParcelableFAB) - d13) / d12 : (d4 - catchingFishFABMVI2.CatchingFishViewModelScope) / d14;
                    }
                }
            };
        } else if (d == -2.0d) {
            final int i7 = 1;
            catchingFishReduxGson2 = new CatchingFishReduxGson() { // from class: kotlin.text.CatchingFishMVIMoshiView
                @Override // kotlin.text.CatchingFishReduxGson
                public final double CatchingFishCoroutine(double d4) {
                    int i32 = i7;
                    CatchingFishFABMVI catchingFishFABMVI2 = catchingFishFABMVI;
                    switch (i32) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            float[] fArr2 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                            return CatchingFishSnackbarGlide.CatchingFishParcelableFAB(catchingFishFABMVI2, d4);
                        case 1:
                            float[] fArr3 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                            return CatchingFishSnackbarGlide.CatchingFishCoroutine(catchingFishFABMVI2, d4);
                        case 2:
                            double d5 = catchingFishFABMVI2.CatchingFishSnackbar;
                            return d4 >= catchingFishFABMVI2.CatchingFishDaggerWebsocket ? Math.pow((d5 * d4) + catchingFishFABMVI2.CatchingFishCoroutine, catchingFishFABMVI2.CatchingFishParcelableFAB) : d4 * catchingFishFABMVI2.CatchingFishReduxKtor;
                        case 3:
                            double d6 = catchingFishFABMVI2.CatchingFishSnackbar;
                            double d7 = catchingFishFABMVI2.CatchingFishCoroutine;
                            double d8 = catchingFishFABMVI2.CatchingFishReduxKtor;
                            return d4 >= catchingFishFABMVI2.CatchingFishDaggerWebsocket ? Math.pow((d6 * d4) + d7, catchingFishFABMVI2.CatchingFishParcelableFAB) + catchingFishFABMVI2.CatchingFishWorkManager : (d8 * d4) + catchingFishFABMVI2.CatchingFishViewModelScope;
                        case 4:
                            float[] fArr4 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                            return CatchingFishSnackbarGlide.CatchingFishSnackbar(catchingFishFABMVI2, d4);
                        case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                            return CatchingFishSnackbarGlide.CatchingFishReduxKtor(catchingFishFABMVI2, d4);
                        case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d9 = catchingFishFABMVI2.CatchingFishSnackbar;
                            double d10 = catchingFishFABMVI2.CatchingFishCoroutine;
                            double d11 = catchingFishFABMVI2.CatchingFishReduxKtor;
                            return d4 >= catchingFishFABMVI2.CatchingFishDaggerWebsocket * d11 ? (Math.pow(d4, 1.0d / catchingFishFABMVI2.CatchingFishParcelableFAB) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = catchingFishFABMVI2.CatchingFishSnackbar;
                            double d13 = catchingFishFABMVI2.CatchingFishCoroutine;
                            double d14 = catchingFishFABMVI2.CatchingFishReduxKtor;
                            return d4 >= catchingFishFABMVI2.CatchingFishDaggerWebsocket * d14 ? (Math.pow(d4 - catchingFishFABMVI2.CatchingFishWorkManager, 1.0d / catchingFishFABMVI2.CatchingFishParcelableFAB) - d13) / d12 : (d4 - catchingFishFABMVI2.CatchingFishViewModelScope) / d14;
                    }
                }
            };
        } else if (d3 == 0.0d && d2 == 0.0d) {
            final int i8 = 2;
            catchingFishReduxGson2 = new CatchingFishReduxGson() { // from class: kotlin.text.CatchingFishMVIMoshiView
                @Override // kotlin.text.CatchingFishReduxGson
                public final double CatchingFishCoroutine(double d4) {
                    int i32 = i8;
                    CatchingFishFABMVI catchingFishFABMVI2 = catchingFishFABMVI;
                    switch (i32) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            float[] fArr2 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                            return CatchingFishSnackbarGlide.CatchingFishParcelableFAB(catchingFishFABMVI2, d4);
                        case 1:
                            float[] fArr3 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                            return CatchingFishSnackbarGlide.CatchingFishCoroutine(catchingFishFABMVI2, d4);
                        case 2:
                            double d5 = catchingFishFABMVI2.CatchingFishSnackbar;
                            return d4 >= catchingFishFABMVI2.CatchingFishDaggerWebsocket ? Math.pow((d5 * d4) + catchingFishFABMVI2.CatchingFishCoroutine, catchingFishFABMVI2.CatchingFishParcelableFAB) : d4 * catchingFishFABMVI2.CatchingFishReduxKtor;
                        case 3:
                            double d6 = catchingFishFABMVI2.CatchingFishSnackbar;
                            double d7 = catchingFishFABMVI2.CatchingFishCoroutine;
                            double d8 = catchingFishFABMVI2.CatchingFishReduxKtor;
                            return d4 >= catchingFishFABMVI2.CatchingFishDaggerWebsocket ? Math.pow((d6 * d4) + d7, catchingFishFABMVI2.CatchingFishParcelableFAB) + catchingFishFABMVI2.CatchingFishWorkManager : (d8 * d4) + catchingFishFABMVI2.CatchingFishViewModelScope;
                        case 4:
                            float[] fArr4 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                            return CatchingFishSnackbarGlide.CatchingFishSnackbar(catchingFishFABMVI2, d4);
                        case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                            return CatchingFishSnackbarGlide.CatchingFishReduxKtor(catchingFishFABMVI2, d4);
                        case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d9 = catchingFishFABMVI2.CatchingFishSnackbar;
                            double d10 = catchingFishFABMVI2.CatchingFishCoroutine;
                            double d11 = catchingFishFABMVI2.CatchingFishReduxKtor;
                            return d4 >= catchingFishFABMVI2.CatchingFishDaggerWebsocket * d11 ? (Math.pow(d4, 1.0d / catchingFishFABMVI2.CatchingFishParcelableFAB) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = catchingFishFABMVI2.CatchingFishSnackbar;
                            double d13 = catchingFishFABMVI2.CatchingFishCoroutine;
                            double d14 = catchingFishFABMVI2.CatchingFishReduxKtor;
                            return d4 >= catchingFishFABMVI2.CatchingFishDaggerWebsocket * d14 ? (Math.pow(d4 - catchingFishFABMVI2.CatchingFishWorkManager, 1.0d / catchingFishFABMVI2.CatchingFishParcelableFAB) - d13) / d12 : (d4 - catchingFishFABMVI2.CatchingFishViewModelScope) / d14;
                    }
                }
            };
        } else {
            final int i9 = 3;
            catchingFishReduxGson2 = new CatchingFishReduxGson() { // from class: kotlin.text.CatchingFishMVIMoshiView
                @Override // kotlin.text.CatchingFishReduxGson
                public final double CatchingFishCoroutine(double d4) {
                    int i32 = i9;
                    CatchingFishFABMVI catchingFishFABMVI2 = catchingFishFABMVI;
                    switch (i32) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            float[] fArr2 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                            return CatchingFishSnackbarGlide.CatchingFishParcelableFAB(catchingFishFABMVI2, d4);
                        case 1:
                            float[] fArr3 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                            return CatchingFishSnackbarGlide.CatchingFishCoroutine(catchingFishFABMVI2, d4);
                        case 2:
                            double d5 = catchingFishFABMVI2.CatchingFishSnackbar;
                            return d4 >= catchingFishFABMVI2.CatchingFishDaggerWebsocket ? Math.pow((d5 * d4) + catchingFishFABMVI2.CatchingFishCoroutine, catchingFishFABMVI2.CatchingFishParcelableFAB) : d4 * catchingFishFABMVI2.CatchingFishReduxKtor;
                        case 3:
                            double d6 = catchingFishFABMVI2.CatchingFishSnackbar;
                            double d7 = catchingFishFABMVI2.CatchingFishCoroutine;
                            double d8 = catchingFishFABMVI2.CatchingFishReduxKtor;
                            return d4 >= catchingFishFABMVI2.CatchingFishDaggerWebsocket ? Math.pow((d6 * d4) + d7, catchingFishFABMVI2.CatchingFishParcelableFAB) + catchingFishFABMVI2.CatchingFishWorkManager : (d8 * d4) + catchingFishFABMVI2.CatchingFishViewModelScope;
                        case 4:
                            float[] fArr4 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                            return CatchingFishSnackbarGlide.CatchingFishSnackbar(catchingFishFABMVI2, d4);
                        case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                            return CatchingFishSnackbarGlide.CatchingFishReduxKtor(catchingFishFABMVI2, d4);
                        case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d9 = catchingFishFABMVI2.CatchingFishSnackbar;
                            double d10 = catchingFishFABMVI2.CatchingFishCoroutine;
                            double d11 = catchingFishFABMVI2.CatchingFishReduxKtor;
                            return d4 >= catchingFishFABMVI2.CatchingFishDaggerWebsocket * d11 ? (Math.pow(d4, 1.0d / catchingFishFABMVI2.CatchingFishParcelableFAB) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = catchingFishFABMVI2.CatchingFishSnackbar;
                            double d13 = catchingFishFABMVI2.CatchingFishCoroutine;
                            double d14 = catchingFishFABMVI2.CatchingFishReduxKtor;
                            return d4 >= catchingFishFABMVI2.CatchingFishDaggerWebsocket * d14 ? (Math.pow(d4 - catchingFishFABMVI2.CatchingFishWorkManager, 1.0d / catchingFishFABMVI2.CatchingFishParcelableFAB) - d13) / d12 : (d4 - catchingFishFABMVI2.CatchingFishViewModelScope) / d14;
                    }
                }
            };
        }
    }

    @Override // kotlin.text.CatchingFishEspressoHilt
    public final boolean CatchingFishCoroutine() {
        return this.CatchingFishRoomDatabase;
    }

    @Override // kotlin.text.CatchingFishEspressoHilt
    public final float CatchingFishDaggerWebsocket(float f, float f2, float f3) {
        double d = f;
        CatchingFishDataStoreDagger catchingFishDataStoreDagger = this.CatchingFishStateLiveData;
        float CatchingFishCoroutine = (float) catchingFishDataStoreDagger.CatchingFishCoroutine(d);
        float CatchingFishCoroutine2 = (float) catchingFishDataStoreDagger.CatchingFishCoroutine(f2);
        float CatchingFishCoroutine3 = (float) catchingFishDataStoreDagger.CatchingFishCoroutine(f3);
        float[] fArr = this.CatchingFishLayout;
        return (fArr[8] * CatchingFishCoroutine3) + (fArr[5] * CatchingFishCoroutine2) + (fArr[2] * CatchingFishCoroutine);
    }

    @Override // kotlin.text.CatchingFishEspressoHilt
    public final float CatchingFishParcelableFAB(int i) {
        return this.CatchingFishWorkManager;
    }

    @Override // kotlin.text.CatchingFishEspressoHilt
    public final long CatchingFishReduxKtor(float f, float f2, float f3) {
        double d = f;
        CatchingFishDataStoreDagger catchingFishDataStoreDagger = this.CatchingFishStateLiveData;
        float CatchingFishCoroutine = (float) catchingFishDataStoreDagger.CatchingFishCoroutine(d);
        float CatchingFishCoroutine2 = (float) catchingFishDataStoreDagger.CatchingFishCoroutine(f2);
        float CatchingFishCoroutine3 = (float) catchingFishDataStoreDagger.CatchingFishCoroutine(f3);
        float[] fArr = this.CatchingFishLayout;
        if (fArr.length < 9) {
            return 0L;
        }
        float f4 = (fArr[6] * CatchingFishCoroutine3) + (fArr[3] * CatchingFishCoroutine2) + (fArr[0] * CatchingFishCoroutine);
        float f5 = (fArr[7] * CatchingFishCoroutine3) + (fArr[4] * CatchingFishCoroutine2) + (fArr[1] * CatchingFishCoroutine);
        return (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32);
    }

    @Override // kotlin.text.CatchingFishEspressoHilt
    public final float CatchingFishSnackbar(int i) {
        return this.CatchingFishDaggerWebsocket;
    }

    @Override // kotlin.text.CatchingFishEspressoHilt
    public final long CatchingFishWorkManager(float f, float f2, float f3, float f4, CatchingFishEspressoHilt catchingFishEspressoHilt) {
        float[] fArr = this.CatchingFishFragmentHandler;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        CatchingFishDataStoreDagger catchingFishDataStoreDagger = this.CatchingFishOkHttp;
        return CatchingFishFirebaseDagger.CatchingFishParcelableFAB((float) catchingFishDataStoreDagger.CatchingFishCoroutine(f5), (float) catchingFishDataStoreDagger.CatchingFishCoroutine(f6), (float) catchingFishDataStoreDagger.CatchingFishCoroutine(f7), f4, catchingFishEspressoHilt);
    }

    @Override // kotlin.text.CatchingFishEspressoHilt
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CatchingFishMVIFragment.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        CatchingFishMVIFragment catchingFishMVIFragment = (CatchingFishMVIFragment) obj;
        CatchingFishFABMVI catchingFishFABMVI = catchingFishMVIFragment.CatchingFishViewModelScope;
        if (Float.compare(catchingFishMVIFragment.CatchingFishDaggerWebsocket, this.CatchingFishDaggerWebsocket) != 0 || Float.compare(catchingFishMVIFragment.CatchingFishWorkManager, this.CatchingFishWorkManager) != 0 || !CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishReduxKtor, catchingFishMVIFragment.CatchingFishReduxKtor) || !Arrays.equals(this.CatchingFishViewModelFAB, catchingFishMVIFragment.CatchingFishViewModelFAB)) {
            return false;
        }
        CatchingFishFABMVI catchingFishFABMVI2 = this.CatchingFishViewModelScope;
        if (catchingFishFABMVI2 != null) {
            return CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishFABMVI2, catchingFishFABMVI);
        }
        if (catchingFishFABMVI == null) {
            return true;
        }
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishCloudMessaging, catchingFishMVIFragment.CatchingFishCloudMessaging)) {
            return CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishUnitTesting, catchingFishMVIFragment.CatchingFishUnitTesting);
        }
        return false;
    }

    @Override // kotlin.text.CatchingFishEspressoHilt
    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.CatchingFishViewModelFAB) + ((this.CatchingFishReduxKtor.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.CatchingFishDaggerWebsocket;
        int floatToIntBits = (hashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.CatchingFishWorkManager;
        int floatToIntBits2 = (floatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        CatchingFishFABMVI catchingFishFABMVI = this.CatchingFishViewModelScope;
        int hashCode2 = floatToIntBits2 + (catchingFishFABMVI != null ? catchingFishFABMVI.hashCode() : 0);
        if (catchingFishFABMVI == null) {
            return this.CatchingFishUnitTesting.hashCode() + ((this.CatchingFishCloudMessaging.hashCode() + (hashCode2 * 31)) * 31);
        }
        return hashCode2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01e2, code lost:
    
        if ((((r25 - r12) * r3) - ((r1 - r15) * r11)) >= 0.0f) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r41v1 */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r41v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatchingFishMVIFragment(String str, float[] fArr, CatchingFishRealmMVPKtor catchingFishRealmMVPKtor, float[] fArr2, CatchingFishReduxGson catchingFishReduxGson, CatchingFishReduxGson catchingFishReduxGson2, float f, float f2, CatchingFishFABMVI catchingFishFABMVI, int i) {
        super(str, CatchingFishMockkSharedFlow.CatchingFishParcelableFAB, i);
        ?? r41;
        float f3;
        float f4;
        this.CatchingFishReduxKtor = catchingFishRealmMVPKtor;
        this.CatchingFishDaggerWebsocket = f;
        this.CatchingFishWorkManager = f2;
        this.CatchingFishViewModelScope = catchingFishFABMVI;
        this.CatchingFishCloudMessaging = catchingFishReduxGson;
        boolean z = true;
        z = true;
        this.CatchingFishEspressoTesting = new CatchingFishFABPayPal(this, z ? 1 : 0);
        int i2 = 0;
        this.CatchingFishOkHttp = new CatchingFishDataStoreDagger(this, i2);
        this.CatchingFishUnitTesting = catchingFishReduxGson2;
        this.CatchingFishAnimationMockk = new CatchingFishFABPayPal(this, i2);
        this.CatchingFishStateLiveData = new CatchingFishDataStoreDagger(this, z ? 1 : 0);
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f < f2) {
            float[] fArr3 = new float[6];
            if (fArr.length == 9) {
                float f5 = fArr[0];
                float f6 = fArr[1];
                float f7 = f5 + f6 + fArr[2];
                fArr3[0] = f5 / f7;
                fArr3[1] = f6 / f7;
                float f8 = fArr[3];
                float f9 = fArr[4];
                float f10 = f8 + f9 + fArr[5];
                fArr3[2] = f8 / f10;
                fArr3[3] = f9 / f10;
                float f11 = fArr[6];
                float f12 = fArr[7];
                float f13 = f11 + f12 + fArr[8];
                fArr3[4] = f11 / f13;
                fArr3[5] = f12 / f13;
            } else {
                System.arraycopy(fArr, 0, fArr3, 0, 6);
            }
            this.CatchingFishViewModelFAB = fArr3;
            if (fArr2 == null) {
                float f14 = fArr3[0];
                float f15 = fArr3[1];
                float f16 = fArr3[2];
                float f17 = fArr3[3];
                float f18 = fArr3[4];
                float f19 = fArr3[5];
                f3 = 1.0f;
                float f20 = catchingFishRealmMVPKtor.CatchingFishParcelableFAB;
                r41 = 0;
                float f21 = catchingFishRealmMVPKtor.CatchingFishSnackbar;
                float f22 = 1;
                float f23 = (f22 - f14) / f15;
                float f24 = (f22 - f16) / f17;
                float f25 = (f22 - f18) / f19;
                float f26 = (f22 - f20) / f21;
                float f27 = f14 / f15;
                float f28 = (f16 / f17) - f27;
                float f29 = (f20 / f21) - f27;
                float f30 = f24 - f23;
                float f31 = (f18 / f19) - f27;
                float f32 = (((f26 - f23) * f28) - (f29 * f30)) / (((f25 - f23) * f28) - (f30 * f31));
                float f33 = (f29 - (f31 * f32)) / f28;
                float f34 = (1.0f - f33) - f32;
                float f35 = f34 / f15;
                float f36 = f33 / f17;
                float f37 = f32 / f19;
                this.CatchingFishLayout = new float[]{f35 * f14, f34, ((1.0f - f14) - f15) * f35, f36 * f16, f33, ((1.0f - f16) - f17) * f36, f37 * f18, f32, ((1.0f - f18) - f19) * f37};
            } else {
                r41 = 0;
                f3 = 1.0f;
                if (fArr2.length == 9) {
                    this.CatchingFishLayout = fArr2;
                } else {
                    throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
                }
            }
            this.CatchingFishFragmentHandler = CatchingFishLayoutRoomFAB.CatchingFishFragmentFactory(this.CatchingFishLayout);
            float CatchingFishParcelableFAB = CatchingFishKtorViewModel.CatchingFishParcelableFAB(fArr3);
            float[] fArr4 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
            if (CatchingFishParcelableFAB / CatchingFishKtorViewModel.CatchingFishParcelableFAB(CatchingFishSnackbarGlide.CatchingFishSnackbar) > 0.9f) {
                float[] fArr5 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                float f38 = fArr3[r41];
                float f39 = fArr5[r41];
                float f40 = fArr3[1];
                float f41 = fArr5[1];
                float f42 = fArr3[2];
                float f43 = fArr5[2];
                float f44 = fArr3[3];
                float f45 = fArr5[3];
                float f46 = fArr3[4];
                float f47 = fArr5[4];
                float f48 = fArr3[5];
                float f49 = fArr5[5];
                f4 = 0.0f;
                float[] fArr6 = new float[6];
                fArr6[r41] = f38 - f39;
                fArr6[1] = f40 - f41;
                fArr6[2] = f42 - f43;
                fArr6[3] = f44 - f45;
                fArr6[4] = f46 - f47;
                fArr6[5] = f48 - f49;
                float f50 = fArr6[r41];
                float f51 = fArr6[1];
                if (((f41 - f49) * f50) - ((f39 - f47) * f51) >= 0.0f && ((f39 - f43) * f51) - ((f41 - f45) * f50) >= 0.0f) {
                    float f52 = fArr6[2];
                    float f53 = fArr6[3];
                    if (((f45 - f41) * f52) - ((f43 - f39) * f53) >= 0.0f && ((f43 - f47) * f53) - ((f45 - f49) * f52) >= 0.0f) {
                        float f54 = fArr6[4];
                        float f55 = fArr6[5];
                        if (((f49 - f45) * f54) - ((f47 - f43) * f55) >= 0.0f) {
                        }
                    }
                }
            } else {
                f4 = 0.0f;
            }
            int i3 = (f > f4 ? 1 : (f == f4 ? 0 : -1));
            if (i != 0) {
                float[] fArr7 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                if (fArr3 != fArr7) {
                    for (int i4 = r41; i4 < 6; i4++) {
                        if (Float.compare(fArr3[i4], fArr7[i4]) != 0 && Math.abs(fArr3[i4] - fArr7[i4]) > 0.001f) {
                            break;
                        }
                    }
                }
                if (CatchingFishLayoutRoomFAB.CatchingFish(catchingFishRealmMVPKtor, CatchingFishRobolectricHilt.CatchingFishUnitTesting) && f == f4 && f2 == f3) {
                    float[] fArr8 = CatchingFishSnackbarGlide.CatchingFishParcelableFAB;
                    CatchingFishMVIFragment catchingFishMVIFragment = CatchingFishSnackbarGlide.CatchingFishDaggerWebsocket;
                    for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                        if (Math.abs(catchingFishReduxGson.CatchingFishCoroutine(d) - catchingFishMVIFragment.CatchingFishCloudMessaging.CatchingFishCoroutine(d)) <= 0.001d && Math.abs(catchingFishReduxGson2.CatchingFishCoroutine(d) - catchingFishMVIFragment.CatchingFishUnitTesting.CatchingFishCoroutine(d)) <= 0.001d) {
                        }
                    }
                }
                z = r41;
            }
            this.CatchingFishRoomDatabase = z;
            return;
        }
        throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatchingFishMVIFragment(String str, float[] fArr, CatchingFishRealmMVPKtor catchingFishRealmMVPKtor, final double d, float f, float f2, int i) {
        this(str, fArr, catchingFishRealmMVPKtor, null, r11, r3, f, f2, new CatchingFishFABMVI(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
        CatchingFishReduxGson catchingFishReduxGson;
        CatchingFishReduxGson catchingFishReduxGson2 = CatchingFishNavigation;
        if (d == 1.0d) {
            catchingFishReduxGson = catchingFishReduxGson2;
        } else {
            final int i2 = 0;
            catchingFishReduxGson = new CatchingFishReduxGson() { // from class: kotlin.text.CatchingFishFragmentMVP
                @Override // kotlin.text.CatchingFishReduxGson
                public final double CatchingFishCoroutine(double d2) {
                    switch (i2) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        if (d != 1.0d) {
            final int i3 = 1;
            catchingFishReduxGson2 = new CatchingFishReduxGson() { // from class: kotlin.text.CatchingFishFragmentMVP
                @Override // kotlin.text.CatchingFishReduxGson
                public final double CatchingFishCoroutine(double d2) {
                    switch (i3) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
    }
}
