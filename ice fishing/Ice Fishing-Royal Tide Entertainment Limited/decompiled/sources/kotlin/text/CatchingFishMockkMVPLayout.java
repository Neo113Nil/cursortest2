package kotlin.text;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class CatchingFishMockkMVPLayout extends CatchingFishDaggerBiometric {
    public static Font CatchingFishJUnitRealm(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : Constants.MINIMAL_ERROR_STATUS_CODE, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int CatchingFishStripeAPI = CatchingFishStripeAPI(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int CatchingFishStripeAPI2 = CatchingFishStripeAPI(fontStyle, font2.getStyle());
            if (CatchingFishStripeAPI2 < CatchingFishStripeAPI) {
                font = font2;
                CatchingFishStripeAPI = CatchingFishStripeAPI2;
            }
        }
        return font;
    }

    public static int CatchingFishStripeAPI(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public final FontFamily CatchingFishAnimation(CatchingFishRetrofitHiltFAB[] catchingFishRetrofitHiltFABArr, ContentResolver contentResolver) {
        Font font;
        String str;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (CatchingFishRetrofitHiltFAB catchingFishRetrofitHiltFAB : catchingFishRetrofitHiltFABArr) {
            if (Objects.equals(catchingFishRetrofitHiltFAB.CatchingFishParcelableFAB.getScheme(), "systemfont")) {
                font = CatchingFishMVVMAppCompat(catchingFishRetrofitHiltFAB);
            } else {
                try {
                    Uri uri = catchingFishRetrofitHiltFAB.CatchingFishParcelableFAB;
                    str = catchingFishRetrofitHiltFAB.CatchingFishDaggerWebsocket;
                    openFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    font = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(catchingFishRetrofitHiltFAB.CatchingFishCoroutine).setSlant(catchingFishRetrofitHiltFAB.CatchingFishReduxKtor ? 1 : 0).setTtcIndex(catchingFishRetrofitHiltFAB.CatchingFishSnackbar);
                        if (!TextUtils.isEmpty(str)) {
                            ttcIndex.setFontVariationSettings(str);
                        }
                        font = ttcIndex.build();
                        openFileDescriptor.close();
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
            if (font != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(font);
                } else {
                    builder.addFont(font);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    @Override // kotlin.text.CatchingFishDaggerBiometric
    public final Typeface CatchingFishCloudMessaging(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily CatchingFishAnimation = CatchingFishAnimation((CatchingFishRetrofitHiltFAB[]) list.get(0), contentResolver);
            if (CatchingFishAnimation == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(CatchingFishAnimation);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily CatchingFishAnimation2 = CatchingFishAnimation((CatchingFishRetrofitHiltFAB[]) list.get(i2), contentResolver);
                if (CatchingFishAnimation2 != null) {
                    customFallbackBuilder.addCustomFallback(CatchingFishAnimation2);
                }
            }
            return customFallbackBuilder.setStyle(CatchingFishJUnitRealm(CatchingFishAnimation, i).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // kotlin.text.CatchingFishDaggerBiometric
    public final Typeface CatchingFishEspressoTesting(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // kotlin.text.CatchingFishDaggerBiometric
    public final Typeface CatchingFishFragmentHandler(Context context, CatchingFishRetrofitHiltFAB[] catchingFishRetrofitHiltFABArr, int i) {
        try {
            FontFamily CatchingFishAnimation = CatchingFishAnimation(catchingFishRetrofitHiltFABArr, context.getContentResolver());
            if (CatchingFishAnimation == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(CatchingFishAnimation).setStyle(CatchingFishJUnitRealm(CatchingFishAnimation, i).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // kotlin.text.CatchingFishDaggerBiometric
    public final Typeface CatchingFishLayout(Context context, CatchingFishFABSnackbarMVVM catchingFishFABSnackbarMVVM, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (CatchingFishFirebaseFAB catchingFishFirebaseFAB : catchingFishFABSnackbarMVVM.CatchingFishParcelableFAB) {
                try {
                    Font build = new Font.Builder(resources, catchingFishFirebaseFAB.CatchingFishWorkManager).setWeight(catchingFishFirebaseFAB.CatchingFishSnackbar).setSlant(catchingFishFirebaseFAB.CatchingFishCoroutine ? 1 : 0).setTtcIndex(catchingFishFirebaseFAB.CatchingFishDaggerWebsocket).setFontVariationSettings(catchingFishFirebaseFAB.CatchingFishReduxKtor).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(CatchingFishJUnitRealm(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    public Font CatchingFishMVVMAppCompat(CatchingFishRetrofitHiltFAB catchingFishRetrofitHiltFAB) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }
}
