package kotlin.text;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.os.Bundle;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.catchingfish.fishcatcherpro.R;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class CatchingFishHiltMVPToast {
    /* JADX WARN: Removed duplicated region for block: B:13:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long CatchingFishCameraXIntent(String str, long j, long j2, long j3) {
        String str2;
        boolean z;
        String str3;
        Long valueOf;
        int i = CatchingFishWidgetWidget.CatchingFishParcelableFAB;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        CatchingFishRobolectricHilt.CatchingFishOkHttp(10);
        int length = str2.length();
        if (length != 0) {
            int i2 = 0;
            char charAt = str2.charAt(0);
            long j4 = -9223372036854775807L;
            if (CatchingFishFirebaseDagger.CatchingFishJetpackCompose(charAt, 48) < 0) {
                z = true;
                if (length != 1) {
                    if (charAt == '+') {
                        z = false;
                        i2 = 1;
                    } else if (charAt == '-') {
                        j4 = Long.MIN_VALUE;
                        i2 = 1;
                    }
                }
            } else {
                z = false;
            }
            long j5 = 0;
            long j6 = -256204778801521550L;
            while (i2 < length) {
                int digit = Character.digit((int) str2.charAt(i2), 10);
                if (digit >= 0) {
                    if (j5 >= j6) {
                        str3 = str2;
                    } else if (j6 == -256204778801521550L) {
                        str3 = str2;
                        j6 = j4 / 10;
                        if (j5 < j6) {
                            valueOf = null;
                            break;
                        }
                    }
                    long j7 = j5 * 10;
                    long j8 = digit;
                    if (j7 < j4 + j8) {
                        valueOf = null;
                        break;
                    }
                    j5 = j7 - j8;
                    i2++;
                    str2 = str3;
                }
            }
            str3 = str2;
            valueOf = z ? Long.valueOf(j5) : Long.valueOf(-j5);
            if (valueOf != null) {
                throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str3 + '\'').toString());
            }
            long longValue = valueOf.longValue();
            if (j2 <= longValue && longValue <= j3) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
        }
        str3 = str2;
        valueOf = null;
        if (valueOf != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void CatchingFishCardViewView(CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB, CatchingFishJUnitGlide catchingFishJUnitGlide) {
        CatchingFishWebsocketFAB catchingFishWebsocketFAB = catchingFishFABStripeAPIFAB.CatchingFishFragmentHandler;
        if (catchingFishWebsocketFAB == null) {
            catchingFishWebsocketFAB = new CatchingFishWebsocketFAB((CatchingFishWorkManagerRoom) catchingFishFABStripeAPIFAB);
            catchingFishFABStripeAPIFAB.CatchingFishFragmentHandler = catchingFishWebsocketFAB;
        }
        ((CatchingFishGradleCameraX) CatchingFishXMLLayoutGlide.CatchingFishPayPalService(catchingFishFABStripeAPIFAB)).getSnapshotObserver().CatchingFishParcelableFAB(catchingFishWebsocketFAB, CatchingFishMVI.CatchingFishPayPal, catchingFishJUnitGlide);
    }

    public static void CatchingFishCloudMessaging(String str, Bundle bundle) {
        if (!bundle.containsKey(str)) {
            throw new IllegalArgumentException("Bundle must contain ".concat(str));
        }
    }

    public static TimeInterpolator CatchingFishCustomView(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!CatchingFishGsonAppCompat(valueOf, "cubic-bezier") && !CatchingFishGsonAppCompat(valueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (CatchingFishGsonAppCompat(valueOf, "cubic-bezier")) {
            String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
            if (split.length == 4) {
                return new PathInterpolator(CatchingFishStateLiveData(split, 0), CatchingFishStateLiveData(split, 1), CatchingFishStateLiveData(split, 2), CatchingFishStateLiveData(split, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
        }
        if (!CatchingFishGsonAppCompat(valueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
        }
        String substring = valueOf.substring(5, valueOf.length() - 1);
        Path path = new Path();
        try {
            CatchingFishPayPalFragment.CatchingFishSnackbar(CatchingFishKtorViewModel.CatchingFishLayout(substring), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(substring), e);
        }
    }

    public static CatchingFishBiometricMVI CatchingFishDaggerHiltFAB(CatchingFishDataStoreBundle catchingFishDataStoreBundle) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new CatchingFishBiometricMVI(CatchingFishRobolectricFlux.CatchingFishCloudMessaging(catchingFishDataStoreBundle));
        }
        TextPaint textPaint = new TextPaint(catchingFishDataStoreBundle.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = catchingFishDataStoreBundle.getBreakStrategy();
        int hyphenationFrequency = catchingFishDataStoreBundle.getHyphenationFrequency();
        if (catchingFishDataStoreBundle.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i < 28 || (catchingFishDataStoreBundle.getInputType() & 15) != 3) {
                boolean z = catchingFishDataStoreBundle.getLayoutDirection() == 1;
                switch (catchingFishDataStoreBundle.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                        break;
                    case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(CatchingFishRobolectricFlux.CatchingFishCoroutine(DecimalFormatSymbols.getInstance(catchingFishDataStoreBundle.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new CatchingFishBiometricMVI(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static void CatchingFishDaggerWebsocket(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static ActionMode.Callback CatchingFishDataStoreIntent(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof CatchingFishFluxCustomView) || callback == null) ? callback : new CatchingFishFluxCustomView(callback, textView);
    }

    public static void CatchingFishEspressoMockk(TextView textView, int i) {
        CatchingFishDaggerWebsocket(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static View CatchingFishEspressoTesting(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View findViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    public static final void CatchingFishFragmentFactory(View view, CatchingFishToastFlux catchingFishToastFlux) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, catchingFishToastFlux);
    }

    public static int CatchingFishFragmentHandler(CatchingFishReduxGlide catchingFishReduxGlide, CatchingFishIntentJUnit catchingFishIntentJUnit, View view, View view2, CatchingFishKtorDataStore catchingFishKtorDataStore, boolean z) {
        if (catchingFishKtorDataStore.CatchingFishDaggerHiltFAB() == 0 || catchingFishReduxGlide.CatchingFishSnackbar() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return catchingFishReduxGlide.CatchingFishSnackbar();
        }
        return (int) (((catchingFishIntentJUnit.CatchingFishSnackbar(view2) - catchingFishIntentJUnit.CatchingFishDaggerWebsocket(view)) / (Math.abs(CatchingFishKtorDataStore.CatchingFishPayPalService(view) - CatchingFishKtorDataStore.CatchingFishPayPalService(view2)) + 1)) * catchingFishReduxGlide.CatchingFishSnackbar());
    }

    public static final void CatchingFishGradleManifest(String str) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(str, "message");
        throw new IndexOutOfBoundsException(str);
    }

    public static boolean CatchingFishGsonAppCompat(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static int CatchingFishHandler(String str, int i, int i2) {
        return (int) CatchingFishCameraXIntent(str, i, 1, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static int CatchingFishLayout(CatchingFishReduxGlide catchingFishReduxGlide, CatchingFishIntentJUnit catchingFishIntentJUnit, View view, View view2, CatchingFishKtorDataStore catchingFishKtorDataStore, boolean z, boolean z2) {
        if (catchingFishKtorDataStore.CatchingFishDaggerHiltFAB() == 0 || catchingFishReduxGlide.CatchingFishSnackbar() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (catchingFishReduxGlide.CatchingFishSnackbar() - Math.max(CatchingFishKtorDataStore.CatchingFishPayPalService(view), CatchingFishKtorDataStore.CatchingFishPayPalService(view2))) - 1) : Math.max(0, Math.min(CatchingFishKtorDataStore.CatchingFishPayPalService(view), CatchingFishKtorDataStore.CatchingFishPayPalService(view2)));
        if (z) {
            return Math.round((max * (Math.abs(catchingFishIntentJUnit.CatchingFishSnackbar(view2) - catchingFishIntentJUnit.CatchingFishDaggerWebsocket(view)) / (Math.abs(CatchingFishKtorDataStore.CatchingFishPayPalService(view) - CatchingFishKtorDataStore.CatchingFishPayPalService(view2)) + 1))) + (catchingFishIntentJUnit.CatchingFishCloudMessaging() - catchingFishIntentJUnit.CatchingFishDaggerWebsocket(view)));
        }
        return max;
    }

    public static final double CatchingFishLayoutInflater(long j) {
        return ((j >>> 11) * 2048) + (j & 2047);
    }

    public static int CatchingFishMVPRobolectric(Context context, int i, int i2) {
        TypedValue CatchingFishGradleManifest = CatchingFishOkHttpFAB.CatchingFishGradleManifest(context, i);
        return (CatchingFishGradleManifest == null || CatchingFishGradleManifest.type != 16) ? i2 : CatchingFishGradleManifest.data;
    }

    public static final void CatchingFishMotionLayout(String str) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(str, "message");
        throw new NoSuchElementException(str);
    }

    public static final CatchingFishToastFlux CatchingFishOkHttp(View view) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            CatchingFishToastFlux catchingFishToastFlux = tag instanceof CatchingFishToastFlux ? (CatchingFishToastFlux) tag : null;
            if (catchingFishToastFlux != null) {
                return catchingFishToastFlux;
            }
            Object CatchingFishStateLiveData = CatchingFishLayoutRoom.CatchingFishStateLiveData(view);
            view = CatchingFishStateLiveData instanceof View ? (View) CatchingFishStateLiveData : null;
        }
        return null;
    }

    public static final void CatchingFishParcelable() {
        throw new UnsupportedOperationException();
    }

    public static final CatchingFishMoshiXMLLayout CatchingFishParcelableFAB(long j) {
        int i = (int) j;
        int i2 = (int) (j >> 32);
        int i3 = ~i;
        CatchingFishMoshiXMLLayout catchingFishMoshiXMLLayout = new CatchingFishMoshiXMLLayout();
        catchingFishMoshiXMLLayout.CatchingFishDaggerWebsocket = i;
        catchingFishMoshiXMLLayout.CatchingFishWorkManager = i2;
        catchingFishMoshiXMLLayout.CatchingFishViewModelScope = 0;
        catchingFishMoshiXMLLayout.CatchingFishViewModelFAB = 0;
        catchingFishMoshiXMLLayout.CatchingFishLayout = i3;
        catchingFishMoshiXMLLayout.CatchingFishFragmentHandler = (i << 10) ^ (i2 >>> 4);
        if ((i2 | i | i3) == 0) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.");
        }
        for (int i4 = 0; i4 < 64; i4++) {
            catchingFishMoshiXMLLayout.CatchingFishSnackbar();
        }
        return catchingFishMoshiXMLLayout;
    }

    public static final void CatchingFishPayPalLiveData(String str) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(str, "message");
        throw new IllegalArgumentException(str);
    }

    public static void CatchingFishPayPalService(TextView textView, int i) {
        CatchingFishDaggerWebsocket(i);
        if (Build.VERSION.SDK_INT >= 28) {
            CatchingFishRobolectricFlux.CatchingFishUnitTesting(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static ActionMode.Callback CatchingFishRecyclerView(ActionMode.Callback callback) {
        return (!(callback instanceof CatchingFishFluxCustomView) || Build.VERSION.SDK_INT < 26) ? callback : ((CatchingFishFluxCustomView) callback).CatchingFishParcelableFAB;
    }

    public static void CatchingFishReduxKtor(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void CatchingFishSensorManager(TextView textView, int i) {
        CatchingFishDaggerWebsocket(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static boolean CatchingFishSpannableWidget() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static float CatchingFishStateLiveData(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static int CatchingFishViewModelFAB(CatchingFishReduxGlide catchingFishReduxGlide, CatchingFishIntentJUnit catchingFishIntentJUnit, View view, View view2, CatchingFishKtorDataStore catchingFishKtorDataStore, boolean z) {
        if (catchingFishKtorDataStore.CatchingFishDaggerHiltFAB() == 0 || catchingFishReduxGlide.CatchingFishSnackbar() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(CatchingFishKtorDataStore.CatchingFishPayPalService(view) - CatchingFishKtorDataStore.CatchingFishPayPalService(view2)) + 1;
        }
        return Math.min(catchingFishIntentJUnit.CatchingFishEspressoTesting(), catchingFishIntentJUnit.CatchingFishSnackbar(view2) - catchingFishIntentJUnit.CatchingFishDaggerWebsocket(view));
    }

    public static int CatchingFishViewModelScope(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static void CatchingFishWorkManager(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public abstract int CatchingFish(View view);

    public abstract int CatchingFishAnimationMockk();

    public abstract void CatchingFishAppCompat(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);

    public abstract boolean CatchingFishCardViewRealm(View view);

    public abstract float CatchingFishCoroutine(int i);

    public abstract int CatchingFishCoroutineFlow();

    public abstract boolean CatchingFishDagger(View view, float f);

    public abstract int CatchingFishJetpackCompose(CoordinatorLayout coordinatorLayout);

    public abstract void CatchingFishJobScheduler(boolean z);

    public abstract int CatchingFishNavigation();

    public abstract boolean CatchingFishParcelableFlux(float f);

    public abstract boolean CatchingFishPayPal(float f, float f2);

    public abstract int CatchingFishRoomDatabase();

    public abstract int CatchingFishSnackbar(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int CatchingFishUnitTesting();

    public void CatchingFishMutableLiveData(boolean z) {
    }
}
