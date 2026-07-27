package kotlin.text;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.autofill.AutofillId;
import com.google.android.gms.common.api.internal.zabs;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.function.DoubleUnaryOperator;

/* loaded from: classes.dex */
public abstract class CatchingFishJUnitMVVM {
    public static void CatchingFish(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }

    public static void CatchingFishAnimationMockk(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void CatchingFishCloudMessaging(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static Icon CatchingFishCoroutine(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static float CatchingFishDaggerWebsocket(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static void CatchingFishEspressoTesting(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void CatchingFishFragmentHandler(MenuItem menuItem, char c, int i) {
        menuItem.setAlphabeticShortcut(c, i);
    }

    public static void CatchingFishJetpackCompose(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }

    public static Intent CatchingFishLayout(Context context, zabs zabsVar, IntentFilter intentFilter) {
        return context.registerReceiver(zabsVar, intentFilter, null, null, 2);
    }

    public static void CatchingFishNavigation(Notification.Builder builder) {
        builder.setShortcutId(null);
    }

    public static void CatchingFishOkHttp(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    public static final ColorSpace CatchingFishParcelableFAB(CatchingFishEspressoHilt catchingFishEspressoHilt) {
        ColorSpace colorSpace;
        ColorSpace.Named named;
        ColorSpace.Named named2;
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishEspressoHilt, CatchingFishSnackbarGlide.CatchingFishDaggerWebsocket)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishEspressoHilt, CatchingFishSnackbarGlide.CatchingFishRoomDatabase)) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishEspressoHilt, CatchingFishSnackbarGlide.CatchingFishNavigation)) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishEspressoHilt, CatchingFishSnackbarGlide.CatchingFishAnimationMockk)) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishEspressoHilt, CatchingFishSnackbarGlide.CatchingFishFragmentHandler)) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishEspressoHilt, CatchingFishSnackbarGlide.CatchingFishLayout)) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishEspressoHilt, CatchingFishSnackbarGlide.CatchingFishJetpackCompose)) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishEspressoHilt, CatchingFishSnackbarGlide.CatchingFish)) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishEspressoHilt, CatchingFishSnackbarGlide.CatchingFishCloudMessaging)) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishEspressoHilt, CatchingFishSnackbarGlide.CatchingFishEspressoTesting)) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishEspressoHilt, CatchingFishSnackbarGlide.CatchingFishViewModelScope)) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishEspressoHilt, CatchingFishSnackbarGlide.CatchingFishViewModelFAB)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishEspressoHilt, CatchingFishSnackbarGlide.CatchingFishWorkManager)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishEspressoHilt, CatchingFishSnackbarGlide.CatchingFishOkHttp)) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishEspressoHilt, CatchingFishSnackbarGlide.CatchingFishStateLiveData)) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishEspressoHilt, CatchingFishSnackbarGlide.CatchingFishUnitTesting)) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (Build.VERSION.SDK_INT >= 34) {
            if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishEspressoHilt, CatchingFishSnackbarGlide.CatchingFishDaggerHiltFAB)) {
                named2 = ColorSpace.Named.BT2020_HLG;
                colorSpace = ColorSpace.get(named2);
            } else if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishEspressoHilt, CatchingFishSnackbarGlide.CatchingFishSpannableWidget)) {
                named = ColorSpace.Named.BT2020_PQ;
                colorSpace = ColorSpace.get(named);
            } else {
                colorSpace = null;
            }
            if (colorSpace != null) {
                return colorSpace;
            }
        }
        if (!(catchingFishEspressoHilt instanceof CatchingFishMVIFragment)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        CatchingFishMVIFragment catchingFishMVIFragment = (CatchingFishMVIFragment) catchingFishEspressoHilt;
        float[] CatchingFishParcelableFAB = catchingFishMVIFragment.CatchingFishReduxKtor.CatchingFishParcelableFAB();
        CatchingFishFABMVI catchingFishFABMVI = catchingFishMVIFragment.CatchingFishViewModelScope;
        ColorSpace.Rgb.TransferParameters transferParameters = catchingFishFABMVI != null ? new ColorSpace.Rgb.TransferParameters(catchingFishFABMVI.CatchingFishSnackbar, catchingFishFABMVI.CatchingFishCoroutine, catchingFishFABMVI.CatchingFishReduxKtor, catchingFishFABMVI.CatchingFishDaggerWebsocket, catchingFishFABMVI.CatchingFishWorkManager, catchingFishFABMVI.CatchingFishViewModelScope, catchingFishFABMVI.CatchingFishParcelableFAB) : null;
        if (transferParameters != null) {
            return new ColorSpace.Rgb(catchingFishEspressoHilt.CatchingFishParcelableFAB, catchingFishMVIFragment.CatchingFishViewModelFAB, CatchingFishParcelableFAB, transferParameters);
        }
        String str = catchingFishEspressoHilt.CatchingFishParcelableFAB;
        float[] fArr = catchingFishMVIFragment.CatchingFishViewModelFAB;
        final CatchingFishFABPayPal catchingFishFABPayPal = catchingFishMVIFragment.CatchingFishEspressoTesting;
        final int i = 0;
        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: kotlin.text.CatchingFishMVVMSharedFlow
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d) {
                switch (i) {
                }
                return ((Number) catchingFishFABPayPal.CatchingFishFragmentHandler(Double.valueOf(d))).doubleValue();
            }
        };
        final CatchingFishFABPayPal catchingFishFABPayPal2 = catchingFishMVIFragment.CatchingFishAnimationMockk;
        final int i2 = 1;
        return new ColorSpace.Rgb(str, fArr, CatchingFishParcelableFAB, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: kotlin.text.CatchingFishMVVMSharedFlow
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d) {
                switch (i2) {
                }
                return ((Number) catchingFishFABPayPal2.CatchingFishFragmentHandler(Double.valueOf(d))).doubleValue();
            }
        }, catchingFishMVIFragment.CatchingFishDaggerWebsocket, catchingFishMVIFragment.CatchingFishWorkManager);
    }

    public static AutofillId CatchingFishReduxKtor(View view) {
        return view.getAutofillId();
    }

    public static void CatchingFishRoomDatabase(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static Notification.Builder CatchingFishSnackbar(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static void CatchingFishStateLiveData(MenuItem menuItem, char c, int i) {
        menuItem.setNumericShortcut(c, i);
    }

    public static void CatchingFishUnitTesting(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static Intent CatchingFishViewModelFAB(Context context, zabs zabsVar, IntentFilter intentFilter) {
        return context.registerReceiver(zabsVar, intentFilter, null, null, 0);
    }

    public static boolean CatchingFishViewModelScope(File file, File file2) {
        try {
            Files.move(file.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static float CatchingFishWorkManager(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }
}
