package kotlin.text;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Path;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import java.util.List;

/* loaded from: classes.dex */
public abstract class CatchingFishToastHiltBundle implements CatchingFishCoroutineJUnit {
    public static final void CatchingFish(CatchingFishMoshiRealm catchingFishMoshiRealm, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / 180) * 3.141592653589793d;
        double cos = Math.cos(d11);
        double sin = Math.sin(d11);
        double d12 = ((d2 * sin) + (d * cos)) / d10;
        double d13 = ((d2 * cos) + ((-d) * sin)) / d6;
        double d14 = ((d4 * sin) + (d3 * cos)) / d10;
        double d15 = ((d4 * cos) + ((-d3) * sin)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = 2;
        double d19 = (d12 + d14) / d18;
        double d20 = (d13 + d15) / d18;
        double d21 = (d17 * d17) + (d16 * d16);
        if (d21 == 0.0d) {
            return;
        }
        double d22 = (1.0d / d21) - 0.25d;
        if (d22 < 0.0d) {
            double sqrt = (float) (Math.sqrt(d21) / 1.99999d);
            CatchingFish(catchingFishMoshiRealm, d, d2, d3, d4, d10 * sqrt, d6 * sqrt, d7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d22);
        double d23 = d16 * sqrt2;
        double d24 = sqrt2 * d17;
        if (z == z2) {
            d8 = d19 - d24;
            d9 = d20 + d23;
        } else {
            d8 = d19 + d24;
            d9 = d20 - d23;
        }
        double atan2 = Math.atan2(d13 - d9, d12 - d8);
        double atan22 = Math.atan2(d15 - d9, d14 - d8) - atan2;
        if (z2 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d25 = d8 * d10;
        double d26 = d9 * d6;
        double d27 = (d25 * cos) - (d26 * sin);
        double d28 = (d26 * cos) + (d25 * sin);
        double d29 = 4;
        int ceil = (int) Math.ceil(Math.abs((atan22 * d29) / 3.141592653589793d));
        double cos2 = Math.cos(d11);
        double sin2 = Math.sin(d11);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d30 = atan22;
        double d31 = -d10;
        double d32 = d31 * cos2;
        double d33 = d6 * sin2;
        double d34 = (d32 * sin3) - (d33 * cos3);
        double d35 = d31 * sin2;
        double d36 = d6 * cos2;
        double d37 = (cos3 * d36) + (sin3 * d35);
        double d38 = d30 / ceil;
        double d39 = atan2;
        double d40 = d34;
        int i = 0;
        double d41 = d;
        double d42 = d37;
        double d43 = d2;
        while (i < ceil) {
            double d44 = d39 + d38;
            double sin4 = Math.sin(d44);
            double cos4 = Math.cos(d44);
            int i2 = i;
            double d45 = (((d10 * cos2) * cos4) + d27) - (d33 * sin4);
            int i3 = ceil;
            double d46 = (d36 * sin4) + (d10 * sin2 * cos4) + d28;
            double d47 = (d32 * sin4) - (d33 * cos4);
            double d48 = (cos4 * d36) + (sin4 * d35);
            double d49 = d44 - d39;
            double tan = Math.tan(d49 / d18);
            double sqrt3 = ((Math.sqrt(((3.0d * tan) * tan) + d29) - 1) * Math.sin(d49)) / 3;
            catchingFishMoshiRealm.CatchingFishParcelableFAB.cubicTo((float) ((d40 * sqrt3) + d41), (float) ((d42 * sqrt3) + d43), (float) (d45 - (sqrt3 * d47)), (float) (d46 - (sqrt3 * d48)), (float) d45, (float) d46);
            sin2 = sin2;
            d41 = d45;
            i = i2 + 1;
            d27 = d27;
            d29 = d29;
            d39 = d44;
            d42 = d48;
            d40 = d47;
            d43 = d46;
            ceil = i3;
            d10 = d5;
        }
    }

    public static void CatchingFishAnimationMockk(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static Typeface CatchingFishCardViewRealm(Configuration configuration, Typeface typeface) {
        int i;
        int i2;
        int weight;
        int i3;
        Typeface create;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i = configuration.fontWeightAdjustment;
        if (i == Integer.MAX_VALUE) {
            return null;
        }
        i2 = configuration.fontWeightAdjustment;
        if (i2 == 0 || typeface == null) {
            return null;
        }
        weight = typeface.getWeight();
        i3 = configuration.fontWeightAdjustment;
        create = Typeface.create(typeface, CatchingFishHiltMVPToast.CatchingFishViewModelScope(i3 + weight, 1, 1000), typeface.isItalic());
        return create;
    }

    public static void CatchingFishCardViewView(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            CatchingFishJUnitIntent.CatchingFishViewModelScope(window, z);
        } else {
            if (i >= 30) {
                CatchingFishJUnitIntent.CatchingFishWorkManager(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static void CatchingFishCloudMessaging(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            sb.append("Must be called on ");
            sb.append(name2);
            sb.append(" thread, but got ");
            sb.append(name);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }

    public static final float CatchingFishCoroutineFlow(float f) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f) & 8589934591L) / 3)) + 709952852);
        float f2 = intBitsToFloat - ((intBitsToFloat - (f / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    public static final void CatchingFishCustomView(List list, CatchingFishMoshiRealm catchingFishMoshiRealm) {
        Path path;
        int i;
        float f;
        int i2;
        CatchingFishContextHiltKtor catchingFishContextHiltKtor;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        List list2 = list;
        Path path2 = catchingFishMoshiRealm.CatchingFishParcelableFAB;
        Path path3 = catchingFishMoshiRealm.CatchingFishParcelableFAB;
        Path.FillType fillType = path2.getFillType();
        Path.FillType fillType2 = Path.FillType.EVEN_ODD;
        boolean z = fillType == fillType2;
        path3.rewind();
        if (!z) {
            fillType2 = Path.FillType.WINDING;
        }
        path3.setFillType(fillType2);
        CatchingFishContextHiltKtor catchingFishContextHiltKtor2 = list2.isEmpty() ? CatchingFishDaggerHiltMoshi.CatchingFishCoroutine : (CatchingFishContextHiltKtor) list2.get(0);
        int size = list2.size();
        float f10 = 0.0f;
        int i3 = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        while (i3 < size) {
            CatchingFishContextHiltKtor catchingFishContextHiltKtor3 = (CatchingFishContextHiltKtor) list2.get(i3);
            if (catchingFishContextHiltKtor3 instanceof CatchingFishDaggerHiltMoshi) {
                path3.close();
                path = path3;
                i = size;
                f = f10;
                i2 = i3;
                catchingFishContextHiltKtor = catchingFishContextHiltKtor3;
                f11 = f15;
                f13 = f11;
                f12 = f16;
            } else {
                if (catchingFishContextHiltKtor3 instanceof CatchingFishLayoutMVI) {
                    CatchingFishLayoutMVI catchingFishLayoutMVI = (CatchingFishLayoutMVI) catchingFishContextHiltKtor3;
                    float f17 = catchingFishLayoutMVI.CatchingFishCoroutine;
                    f13 += f17;
                    float f18 = catchingFishLayoutMVI.CatchingFishReduxKtor;
                    f14 += f18;
                    path3.rMoveTo(f17, f18);
                    path = path3;
                    i = size;
                    f = f10;
                    i2 = i3;
                    f15 = f13;
                    f16 = f14;
                } else {
                    if (catchingFishContextHiltKtor3 instanceof CatchingFishAdMobRoomToast) {
                        CatchingFishAdMobRoomToast catchingFishAdMobRoomToast = (CatchingFishAdMobRoomToast) catchingFishContextHiltKtor3;
                        float f19 = catchingFishAdMobRoomToast.CatchingFishCoroutine;
                        float f20 = catchingFishAdMobRoomToast.CatchingFishReduxKtor;
                        path3.moveTo(f19, f20);
                        f14 = f20;
                        f16 = f14;
                        path = path3;
                        f13 = f19;
                        f15 = f13;
                    } else {
                        if (catchingFishContextHiltKtor3 instanceof CatchingFishIntentStripeAPI) {
                            CatchingFishIntentStripeAPI catchingFishIntentStripeAPI = (CatchingFishIntentStripeAPI) catchingFishContextHiltKtor3;
                            float f21 = catchingFishIntentStripeAPI.CatchingFishCoroutine;
                            float f22 = catchingFishIntentStripeAPI.CatchingFishReduxKtor;
                            path3.rLineTo(f21, f22);
                            f13 += catchingFishIntentStripeAPI.CatchingFishCoroutine;
                            f14 += f22;
                        } else if (catchingFishContextHiltKtor3 instanceof CatchingFishViewDaggerMoshi) {
                            CatchingFishViewDaggerMoshi catchingFishViewDaggerMoshi = (CatchingFishViewDaggerMoshi) catchingFishContextHiltKtor3;
                            float f23 = catchingFishViewDaggerMoshi.CatchingFishCoroutine;
                            float f24 = catchingFishViewDaggerMoshi.CatchingFishReduxKtor;
                            path3.lineTo(f23, f24);
                            f13 = catchingFishViewDaggerMoshi.CatchingFishCoroutine;
                            path = path3;
                            f14 = f24;
                        } else if (catchingFishContextHiltKtor3 instanceof CatchingFishFirebaseHandler) {
                            CatchingFishFirebaseHandler catchingFishFirebaseHandler = (CatchingFishFirebaseHandler) catchingFishContextHiltKtor3;
                            path3.rLineTo(catchingFishFirebaseHandler.CatchingFishCoroutine, f10);
                            f13 += catchingFishFirebaseHandler.CatchingFishCoroutine;
                        } else if (catchingFishContextHiltKtor3 instanceof CatchingFishJUnitPayPal) {
                            CatchingFishJUnitPayPal catchingFishJUnitPayPal = (CatchingFishJUnitPayPal) catchingFishContextHiltKtor3;
                            path3.lineTo(catchingFishJUnitPayPal.CatchingFishCoroutine, f14);
                            f13 = catchingFishJUnitPayPal.CatchingFishCoroutine;
                        } else {
                            if (catchingFishContextHiltKtor3 instanceof CatchingFishWidgetOkHttp) {
                                CatchingFishWidgetOkHttp catchingFishWidgetOkHttp = (CatchingFishWidgetOkHttp) catchingFishContextHiltKtor3;
                                path3.rLineTo(f10, catchingFishWidgetOkHttp.CatchingFishCoroutine);
                                f9 = catchingFishWidgetOkHttp.CatchingFishCoroutine;
                            } else if (catchingFishContextHiltKtor3 instanceof CatchingFishJUnitGsonBundle) {
                                CatchingFishJUnitGsonBundle catchingFishJUnitGsonBundle = (CatchingFishJUnitGsonBundle) catchingFishContextHiltKtor3;
                                path3.lineTo(f13, catchingFishJUnitGsonBundle.CatchingFishCoroutine);
                                f14 = catchingFishJUnitGsonBundle.CatchingFishCoroutine;
                            } else if (catchingFishContextHiltKtor3 instanceof CatchingFishAdMobGlideHilt) {
                                CatchingFishAdMobGlideHilt catchingFishAdMobGlideHilt = (CatchingFishAdMobGlideHilt) catchingFishContextHiltKtor3;
                                path3.rCubicTo(catchingFishAdMobGlideHilt.CatchingFishCoroutine, catchingFishAdMobGlideHilt.CatchingFishReduxKtor, catchingFishAdMobGlideHilt.CatchingFishDaggerWebsocket, catchingFishAdMobGlideHilt.CatchingFishWorkManager, catchingFishAdMobGlideHilt.CatchingFishViewModelScope, catchingFishAdMobGlideHilt.CatchingFishViewModelFAB);
                                f11 = catchingFishAdMobGlideHilt.CatchingFishDaggerWebsocket + f13;
                                f12 = catchingFishAdMobGlideHilt.CatchingFishWorkManager + f14;
                                f13 += catchingFishAdMobGlideHilt.CatchingFishViewModelScope;
                                f9 = catchingFishAdMobGlideHilt.CatchingFishViewModelFAB;
                            } else {
                                if (catchingFishContextHiltKtor3 instanceof CatchingFishAndroidXToolbar) {
                                    CatchingFishAndroidXToolbar catchingFishAndroidXToolbar = (CatchingFishAndroidXToolbar) catchingFishContextHiltKtor3;
                                    path3.cubicTo(catchingFishAndroidXToolbar.CatchingFishCoroutine, catchingFishAndroidXToolbar.CatchingFishReduxKtor, catchingFishAndroidXToolbar.CatchingFishDaggerWebsocket, catchingFishAndroidXToolbar.CatchingFishWorkManager, catchingFishAndroidXToolbar.CatchingFishViewModelScope, catchingFishAndroidXToolbar.CatchingFishViewModelFAB);
                                    f11 = catchingFishAndroidXToolbar.CatchingFishDaggerWebsocket;
                                    f12 = catchingFishAndroidXToolbar.CatchingFishWorkManager;
                                    f5 = catchingFishAndroidXToolbar.CatchingFishViewModelScope;
                                    f6 = catchingFishAndroidXToolbar.CatchingFishViewModelFAB;
                                } else if (catchingFishContextHiltKtor3 instanceof CatchingFishHiltExoPlayer) {
                                    if (catchingFishContextHiltKtor2.CatchingFishParcelableFAB) {
                                        f8 = f14 - f12;
                                        f7 = f13 - f11;
                                    } else {
                                        f7 = f10;
                                        f8 = f7;
                                    }
                                    CatchingFishHiltExoPlayer catchingFishHiltExoPlayer = (CatchingFishHiltExoPlayer) catchingFishContextHiltKtor3;
                                    path3.rCubicTo(f7, f8, catchingFishHiltExoPlayer.CatchingFishCoroutine, catchingFishHiltExoPlayer.CatchingFishReduxKtor, catchingFishHiltExoPlayer.CatchingFishDaggerWebsocket, catchingFishHiltExoPlayer.CatchingFishWorkManager);
                                    f11 = catchingFishHiltExoPlayer.CatchingFishCoroutine + f13;
                                    f12 = catchingFishHiltExoPlayer.CatchingFishReduxKtor + f14;
                                    f13 += catchingFishHiltExoPlayer.CatchingFishDaggerWebsocket;
                                    f9 = catchingFishHiltExoPlayer.CatchingFishWorkManager;
                                } else if (catchingFishContextHiltKtor3 instanceof CatchingFishToastRealm) {
                                    if (catchingFishContextHiltKtor2.CatchingFishParcelableFAB) {
                                        float f25 = 2;
                                        f13 = (f13 * f25) - f11;
                                        f14 = (f25 * f14) - f12;
                                    }
                                    CatchingFishToastRealm catchingFishToastRealm = (CatchingFishToastRealm) catchingFishContextHiltKtor3;
                                    path3.cubicTo(f13, f14, catchingFishToastRealm.CatchingFishCoroutine, catchingFishToastRealm.CatchingFishReduxKtor, catchingFishToastRealm.CatchingFishDaggerWebsocket, catchingFishToastRealm.CatchingFishWorkManager);
                                    f11 = catchingFishToastRealm.CatchingFishCoroutine;
                                    f12 = catchingFishToastRealm.CatchingFishReduxKtor;
                                    f5 = catchingFishToastRealm.CatchingFishDaggerWebsocket;
                                    f6 = catchingFishToastRealm.CatchingFishWorkManager;
                                } else {
                                    if (catchingFishContextHiltKtor3 instanceof CatchingFishSpannableRealm) {
                                        CatchingFishSpannableRealm catchingFishSpannableRealm = (CatchingFishSpannableRealm) catchingFishContextHiltKtor3;
                                        float f26 = catchingFishSpannableRealm.CatchingFishCoroutine;
                                        float f27 = catchingFishSpannableRealm.CatchingFishWorkManager;
                                        float f28 = catchingFishSpannableRealm.CatchingFishDaggerWebsocket;
                                        float f29 = catchingFishSpannableRealm.CatchingFishReduxKtor;
                                        path3.rQuadTo(f26, f29, f28, f27);
                                        float f30 = catchingFishSpannableRealm.CatchingFishCoroutine + f13;
                                        f4 = f29 + f14;
                                        f13 += f28;
                                        f14 += f27;
                                        f11 = f30;
                                        path = path3;
                                    } else if (catchingFishContextHiltKtor3 instanceof CatchingFishLayoutDagger) {
                                        CatchingFishLayoutDagger catchingFishLayoutDagger = (CatchingFishLayoutDagger) catchingFishContextHiltKtor3;
                                        float f31 = catchingFishLayoutDagger.CatchingFishCoroutine;
                                        float f32 = catchingFishLayoutDagger.CatchingFishWorkManager;
                                        float f33 = catchingFishLayoutDagger.CatchingFishDaggerWebsocket;
                                        f4 = catchingFishLayoutDagger.CatchingFishReduxKtor;
                                        path3.quadTo(f31, f4, f33, f32);
                                        f11 = catchingFishLayoutDagger.CatchingFishCoroutine;
                                        path = path3;
                                        f14 = f32;
                                        f13 = f33;
                                    } else {
                                        if (catchingFishContextHiltKtor3 instanceof CatchingFishCameraXFirebase) {
                                            if (catchingFishContextHiltKtor2.CatchingFishSnackbar) {
                                                f2 = f13 - f11;
                                                f3 = f14 - f12;
                                            } else {
                                                f2 = f10;
                                                f3 = f2;
                                            }
                                            CatchingFishCameraXFirebase catchingFishCameraXFirebase = (CatchingFishCameraXFirebase) catchingFishContextHiltKtor3;
                                            float f34 = catchingFishCameraXFirebase.CatchingFishCoroutine;
                                            float f35 = catchingFishCameraXFirebase.CatchingFishReduxKtor;
                                            path3.rQuadTo(f2, f3, f34, f35);
                                            float f36 = f2 + f13;
                                            float f37 = f3 + f14;
                                            f13 += catchingFishCameraXFirebase.CatchingFishCoroutine;
                                            f14 += f35;
                                            path = path3;
                                            f12 = f37;
                                            i = size;
                                            f = f10;
                                            i2 = i3;
                                            catchingFishContextHiltKtor = catchingFishContextHiltKtor3;
                                            f11 = f36;
                                        } else if (catchingFishContextHiltKtor3 instanceof CatchingFishDaggerRedux) {
                                            if (catchingFishContextHiltKtor2.CatchingFishSnackbar) {
                                                float f38 = 2;
                                                f13 = (f13 * f38) - f11;
                                                f14 = (f38 * f14) - f12;
                                            }
                                            CatchingFishDaggerRedux catchingFishDaggerRedux = (CatchingFishDaggerRedux) catchingFishContextHiltKtor3;
                                            float f39 = catchingFishDaggerRedux.CatchingFishCoroutine;
                                            float f40 = catchingFishDaggerRedux.CatchingFishReduxKtor;
                                            path3.quadTo(f13, f14, f39, f40);
                                            float f41 = f14;
                                            f14 = f40;
                                            f12 = f41;
                                            path = path3;
                                            i = size;
                                            f = f10;
                                            i2 = i3;
                                            f11 = f13;
                                            catchingFishContextHiltKtor = catchingFishContextHiltKtor3;
                                            f13 = catchingFishDaggerRedux.CatchingFishCoroutine;
                                        } else if (catchingFishContextHiltKtor3 instanceof CatchingFishReduxPicasso) {
                                            CatchingFishReduxPicasso catchingFishReduxPicasso = (CatchingFishReduxPicasso) catchingFishContextHiltKtor3;
                                            float f42 = catchingFishReduxPicasso.CatchingFishViewModelFAB + f13;
                                            float f43 = catchingFishReduxPicasso.CatchingFishLayout + f14;
                                            i = size;
                                            f = 0.0f;
                                            path = path3;
                                            i2 = i3;
                                            CatchingFish(catchingFishMoshiRealm, f13, f14, f42, f43, catchingFishReduxPicasso.CatchingFishCoroutine, catchingFishReduxPicasso.CatchingFishReduxKtor, catchingFishReduxPicasso.CatchingFishDaggerWebsocket, catchingFishReduxPicasso.CatchingFishWorkManager, catchingFishReduxPicasso.CatchingFishViewModelScope);
                                            f11 = f42;
                                            f13 = f11;
                                            f12 = f43;
                                            f14 = f12;
                                            catchingFishContextHiltKtor = catchingFishContextHiltKtor3;
                                        } else {
                                            path = path3;
                                            i = size;
                                            f = f10;
                                            i2 = i3;
                                            if (!(catchingFishContextHiltKtor3 instanceof CatchingFishLayoutHandler)) {
                                                throw new CatchingFishBiometricView();
                                            }
                                            CatchingFishLayoutHandler catchingFishLayoutHandler = (CatchingFishLayoutHandler) catchingFishContextHiltKtor3;
                                            float f44 = catchingFishLayoutHandler.CatchingFishViewModelFAB;
                                            float f45 = catchingFishLayoutHandler.CatchingFishLayout;
                                            catchingFishContextHiltKtor = catchingFishContextHiltKtor3;
                                            CatchingFish(catchingFishMoshiRealm, f13, f14, f44, f45, catchingFishLayoutHandler.CatchingFishCoroutine, catchingFishLayoutHandler.CatchingFishReduxKtor, catchingFishLayoutHandler.CatchingFishDaggerWebsocket, catchingFishLayoutHandler.CatchingFishWorkManager, catchingFishLayoutHandler.CatchingFishViewModelScope);
                                            f11 = catchingFishLayoutHandler.CatchingFishViewModelFAB;
                                            f13 = f11;
                                            f12 = f45;
                                        }
                                        i3 = i2 + 1;
                                        list2 = list;
                                        size = i;
                                        path3 = path;
                                        catchingFishContextHiltKtor2 = catchingFishContextHiltKtor;
                                        f10 = f;
                                    }
                                    f12 = f4;
                                }
                                f14 = f6;
                                path = path3;
                                f13 = f5;
                            }
                            f14 += f9;
                        }
                        path = path3;
                    }
                    i = size;
                    f = f10;
                    i2 = i3;
                }
                catchingFishContextHiltKtor = catchingFishContextHiltKtor3;
                i3 = i2 + 1;
                list2 = list;
                size = i;
                path3 = path;
                catchingFishContextHiltKtor2 = catchingFishContextHiltKtor;
                f10 = f;
            }
            f14 = f12;
            i3 = i2 + 1;
            list2 = list;
            size = i;
            path3 = path;
            catchingFishContextHiltKtor2 = catchingFishContextHiltKtor;
            f10 = f;
        }
    }

    public static final CatchingFishMVIServiceFlux CatchingFishDaggerWebsocket(float f, float f2, float f3, float f4, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2));
        return new CatchingFishMVIServiceFlux(f, f2, f3, f4, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits);
    }

    public static void CatchingFishEspressoTesting(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void CatchingFishFragmentFactory(CatchingFishIntentSpannable catchingFishIntentSpannable, CatchingFishServiceHandler catchingFishServiceHandler) {
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB = (CatchingFishFABStripeAPIFAB) catchingFishIntentSpannable;
        if (!catchingFishFABStripeAPIFAB.CatchingFishReduxKtor.CatchingFishRoomDatabase) {
            CatchingFishFluxGradle.CatchingFishSnackbar("visitSubtreeIf called on an unattached node");
        }
        CatchingFishFABToast catchingFishFABToast = new CatchingFishFABToast(new CatchingFishFABStripeAPIFAB[16]);
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB2 = catchingFishFABStripeAPIFAB.CatchingFishReduxKtor;
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB3 = catchingFishFABStripeAPIFAB2.CatchingFishLayout;
        if (catchingFishFABStripeAPIFAB3 == null) {
            CatchingFishXMLLayoutGlide.CatchingFishWorkManager(catchingFishFABToast, catchingFishFABStripeAPIFAB2);
        } else {
            catchingFishFABToast.CatchingFishSnackbar(catchingFishFABStripeAPIFAB3);
        }
        while (true) {
            int i = catchingFishFABToast.CatchingFishWorkManager;
            if (i == 0) {
                return;
            }
            CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB4 = (CatchingFishFABStripeAPIFAB) catchingFishFABToast.CatchingFishFragmentHandler(i - 1);
            if ((catchingFishFABStripeAPIFAB4.CatchingFishViewModelScope & 262144) != 0) {
                for (CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB5 = catchingFishFABStripeAPIFAB4; catchingFishFABStripeAPIFAB5 != null; catchingFishFABStripeAPIFAB5 = catchingFishFABStripeAPIFAB5.CatchingFishLayout) {
                    if ((catchingFishFABStripeAPIFAB5.CatchingFishWorkManager & 262144) != 0) {
                        for (Object obj = catchingFishFABStripeAPIFAB5; obj != null; obj = null) {
                            if (obj instanceof CatchingFishIntentSpannable) {
                                CatchingFishIntentSpannable catchingFishIntentSpannable2 = (CatchingFishIntentSpannable) obj;
                                CatchingFishContextFluxGson catchingFishContextFluxGson = (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishIntentSpannable.CatchingFishWorkManager(), catchingFishIntentSpannable2.CatchingFishWorkManager()) && catchingFishIntentSpannable.getClass() == catchingFishIntentSpannable2.getClass()) ? (CatchingFishContextFluxGson) catchingFishServiceHandler.CatchingFishFragmentHandler(catchingFishIntentSpannable2) : CatchingFishContextFluxGson.CatchingFishReduxKtor;
                                if (catchingFishContextFluxGson == CatchingFishContextFluxGson.CatchingFishWorkManager) {
                                    return;
                                } else {
                                    if (catchingFishContextFluxGson != CatchingFishContextFluxGson.CatchingFishDaggerWebsocket) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
            CatchingFishXMLLayoutGlide.CatchingFishWorkManager(catchingFishFABToast, catchingFishFABStripeAPIFAB4);
        }
    }

    public static void CatchingFishFragmentHandler(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static CatchingFishViewDagger CatchingFishGsonAppCompat(CatchingFishMockkView catchingFishMockkView) {
        CatchingFishViewDagger catchingFishViewDagger = new CatchingFishViewDagger();
        catchingFishViewDagger.CatchingFishWorkManager = CatchingFishBiometricBundle.CatchingFishFragmentHandler(catchingFishViewDagger, catchingFishViewDagger, catchingFishMockkView);
        return catchingFishViewDagger;
    }

    public static final boolean CatchingFishJetpackCompose(long j, long j2) {
        return j == j2;
    }

    public static final int CatchingFishLayout(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final long CatchingFishMVPRobolectric(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static void CatchingFishNavigation(String str, String str2, Object obj) {
        if (Log.isLoggable(CatchingFishSpannableWidget(str), 3)) {
            String.format(str2, obj);
        }
    }

    public static void CatchingFishOkHttp(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void CatchingFishParcelableFlux(Context context) {
        boolean z;
        Context applicationContext;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (CatchingFishLayoutRoom.CatchingFishRoomDatabase(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
            packageManager = applicationContext.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
            z = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
            if (Build.VERSION.SDK_INT < 29) {
                new CatchingFishGlideCoroutine(2, context, new CatchingFishAndroidXPayPal(), z).run();
                return;
            } else {
                CatchingFishViewMVIMVVM.CatchingFishDaggerWebsocket(null);
                return;
            }
        }
        z = true;
        if (Build.VERSION.SDK_INT < 29) {
        }
    }

    public static final void CatchingFishPayPal(CatchingFishGoogleMapsMVP catchingFishGoogleMapsMVP, CatchingFishViewFlux catchingFishViewFlux, int i) {
        while (true) {
            int i2 = catchingFishGoogleMapsMVP.CatchingFishDaggerHiltFAB;
            if (i > i2 && i < catchingFishGoogleMapsMVP.CatchingFishCoroutineFlow) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            catchingFishGoogleMapsMVP.CatchingFishDagger();
            if (catchingFishGoogleMapsMVP.CatchingFishSpannableWidget(catchingFishGoogleMapsMVP.CatchingFishDaggerHiltFAB)) {
                catchingFishViewFlux.CatchingFishStateLiveData();
            }
            catchingFishGoogleMapsMVP.CatchingFishFragmentHandler();
        }
    }

    public static final CatchingFishFluxExoPlayer CatchingFishReduxKtor(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new CatchingFishFluxExoPlayer(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    public static String CatchingFishSpannableWidget(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String concat = "TRuntime.".concat(str);
        return concat.length() > 23 ? concat.substring(0, 23) : concat;
    }

    public static void CatchingFishStateLiveData(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void CatchingFishUnitTesting(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void CatchingFishViewModelFAB(StringBuilder sb, Object obj, CatchingFishServiceHandler catchingFishServiceHandler) {
        if (catchingFishServiceHandler != null) {
            sb.append((CharSequence) catchingFishServiceHandler.CatchingFishFragmentHandler(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static final CatchingFishFABStripeAPIFAB CatchingFishViewModelScope(CatchingFishLayoutContext catchingFishLayoutContext, int i) {
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB = ((CatchingFishFABStripeAPIFAB) catchingFishLayoutContext).CatchingFishReduxKtor.CatchingFishLayout;
        if (catchingFishFABStripeAPIFAB == null || (catchingFishFABStripeAPIFAB.CatchingFishViewModelScope & i) == 0) {
            return null;
        }
        while (catchingFishFABStripeAPIFAB != null) {
            int i2 = catchingFishFABStripeAPIFAB.CatchingFishWorkManager;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return catchingFishFABStripeAPIFAB;
            }
            catchingFishFABStripeAPIFAB = catchingFishFABStripeAPIFAB.CatchingFishLayout;
        }
        return null;
    }

    public static final long CatchingFishWorkManager(int i, int i2) {
        if (i < 0 || i2 < 0) {
            CatchingFishReduxAsyncTask.CatchingFishParcelableFAB("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        long j = (i2 & 4294967295L) | (i << 32);
        int i3 = CatchingFishToastViewModel.CatchingFishCoroutine;
        return j;
    }

    public abstract Object CatchingFishDaggerHiltFAB(CatchingFishMVIJobScheduler catchingFishMVIJobScheduler);

    public abstract boolean CatchingFishRoomDatabase(CatchingFishMVIJobScheduler catchingFishMVIJobScheduler);

    @Override // kotlin.text.CatchingFishCoroutineJUnit
    public void CatchingFishCoroutine() {
    }

    @Override // kotlin.text.CatchingFishCoroutineJUnit
    public void CatchingFishSnackbar() {
    }
}
