package kotlin.text;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class CatchingFishRobolectricMVVM {
    public Typeface CatchingFish;
    public float CatchingFishAndroidX;
    public float CatchingFishAnimation;
    public float CatchingFishAnimationMockk;
    public float CatchingFishAppCompat;
    public int CatchingFishCameraXIntent;
    public CatchingFishCameraXCardView CatchingFishCardViewRealm;
    public CharSequence CatchingFishCardViewView;
    public ColorStateList CatchingFishCloudMessaging;
    public final Rect CatchingFishCoroutine;
    public Typeface CatchingFishCoroutineFlow;
    public boolean CatchingFishCustomView;
    public int CatchingFishDagger;
    public Typeface CatchingFishDaggerHiltFAB;
    public final RectF CatchingFishDaggerWebsocket;
    public float CatchingFishDataStoreIntent;
    public float CatchingFishEspressoMockk;
    public int CatchingFishEspressoTesting;
    public ColorStateList CatchingFishFragmentHandler;
    public final TextPaint CatchingFishGradleManifest;
    public Typeface CatchingFishGsonAppCompat;
    public int[] CatchingFishHandler;
    public float CatchingFishJUnitRealm;
    public Typeface CatchingFishJetpackCompose;
    public float CatchingFishJobScheduler;
    public TimeInterpolator CatchingFishLayoutInflater;
    public CharSequence CatchingFishMVPRobolectric;
    public float CatchingFishMVVMAppCompat;
    public float CatchingFishMoshiDaggerHilt;
    public final TextPaint CatchingFishMotionLayout;
    public float CatchingFishMutableLiveData;
    public float CatchingFishNavigation;
    public float CatchingFishNavigationGson;
    public float CatchingFishOkHttp;
    public TimeInterpolator CatchingFishParcelable;
    public final TextInputLayout CatchingFishParcelableFAB;
    public Typeface CatchingFishParcelableFlux;
    public boolean CatchingFishPayPalLiveData;
    public float CatchingFishPayPalService;
    public float CatchingFishRecyclerView;
    public CharSequence CatchingFishRedux;
    public final Rect CatchingFishReduxKtor;
    public boolean CatchingFishRetrofitMVI;
    public float CatchingFishRoomDatabase;
    public float CatchingFishSensorManager;
    public float CatchingFishSnackbar;
    public Typeface CatchingFishSpannableWidget;
    public ColorStateList CatchingFishStateFlow;
    public float CatchingFishStateLiveData;
    public StaticLayout CatchingFishStripeAPI;
    public float CatchingFishUnitTesting;
    public int CatchingFishWorkManager = 16;
    public int CatchingFishViewModelScope = 16;
    public float CatchingFishViewModelFAB = 15.0f;
    public float CatchingFishLayout = 15.0f;
    public final TextUtils.TruncateAt CatchingFishPayPal = TextUtils.TruncateAt.END;
    public final boolean CatchingFishFragmentFactory = true;
    public int CatchingFishCustomViewJUnit = 1;
    public int CatchingFishDaggerMVVM = 1;
    public final float CatchingFishMockkOkHttp = 1.0f;
    public final int CatchingFishReduxMoshi = 1;
    public int CatchingFishPicasso = -1;
    public int CatchingFishFirebase = -1;

    public CatchingFishRobolectricMVVM(TextInputLayout textInputLayout) {
        this.CatchingFishParcelableFAB = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.CatchingFishGradleManifest = textPaint;
        this.CatchingFishMotionLayout = new TextPaint(textPaint);
        this.CatchingFishReduxKtor = new Rect();
        this.CatchingFishCoroutine = new Rect();
        this.CatchingFishDaggerWebsocket = new RectF();
        CatchingFishLayout(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int CatchingFishParcelableFAB(float f, int i, int i2) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), Math.round((Color.red(i2) * f) + (Color.red(i) * f2)), Math.round((Color.green(i2) * f) + (Color.green(i) * f2)), Math.round((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    public static float CatchingFishViewModelFAB(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return CatchingFishRobolectricRoom.CatchingFishParcelableFAB(f, f2, f3);
    }

    public final boolean CatchingFishAnimationMockk() {
        return this.CatchingFishDaggerMVVM == 1;
    }

    public final void CatchingFishCloudMessaging(ColorStateList colorStateList) {
        if (this.CatchingFishCloudMessaging == colorStateList && this.CatchingFishFragmentHandler == colorStateList) {
            return;
        }
        this.CatchingFishCloudMessaging = colorStateList;
        this.CatchingFishFragmentHandler = colorStateList;
        CatchingFishFragmentHandler(false);
    }

    public final boolean CatchingFishCoroutine(CharSequence charSequence) {
        boolean z = this.CatchingFishParcelableFAB.getLayoutDirection() == 1;
        if (this.CatchingFishFragmentFactory) {
            return (z ? CatchingFishLifecyclePayPal.CatchingFishReduxKtor : CatchingFishLifecyclePayPal.CatchingFishCoroutine).CatchingFishSnackbar(charSequence, charSequence.length());
        }
        return z;
    }

    public final StaticLayout CatchingFishDaggerWebsocket(int i, TextPaint textPaint, CharSequence charSequence, float f, boolean z) {
        Layout.Alignment alignment;
        if (i == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(this.CatchingFishWorkManager, this.CatchingFishCustomView ? 1 : 0) & 7;
            alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.CatchingFishCustomView ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.CatchingFishCustomView ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
        }
        CatchingFishKtorRobolectric catchingFishKtorRobolectric = new CatchingFishKtorRobolectric(charSequence, textPaint, (int) f);
        catchingFishKtorRobolectric.CatchingFishEspressoTesting = this.CatchingFishPayPal;
        catchingFishKtorRobolectric.CatchingFishCloudMessaging = z;
        catchingFishKtorRobolectric.CatchingFishDaggerWebsocket = alignment;
        catchingFishKtorRobolectric.CatchingFishFragmentHandler = false;
        catchingFishKtorRobolectric.CatchingFishWorkManager = i;
        float f2 = this.CatchingFishMockkOkHttp;
        catchingFishKtorRobolectric.CatchingFishViewModelScope = 0.0f;
        catchingFishKtorRobolectric.CatchingFishViewModelFAB = f2;
        catchingFishKtorRobolectric.CatchingFishLayout = this.CatchingFishReduxMoshi;
        catchingFishKtorRobolectric.CatchingFishOkHttp = null;
        StaticLayout CatchingFishParcelableFAB = catchingFishKtorRobolectric.CatchingFishParcelableFAB();
        CatchingFishParcelableFAB.getClass();
        return CatchingFishParcelableFAB;
    }

    public final boolean CatchingFishEspressoTesting(Typeface typeface) {
        CatchingFishCameraXCardView catchingFishCameraXCardView = this.CatchingFishCardViewRealm;
        if (catchingFishCameraXCardView != null) {
            catchingFishCameraXCardView.CatchingFishViewModelFAB = true;
        }
        if (this.CatchingFishCoroutineFlow == typeface) {
            return false;
        }
        this.CatchingFishCoroutineFlow = typeface;
        Typeface CatchingFishCardViewRealm = CatchingFishToastHiltBundle.CatchingFishCardViewRealm(this.CatchingFishParcelableFAB.getContext().getResources().getConfiguration(), typeface);
        this.CatchingFishJetpackCompose = CatchingFishCardViewRealm;
        if (CatchingFishCardViewRealm == null) {
            CatchingFishCardViewRealm = this.CatchingFishCoroutineFlow;
        }
        this.CatchingFish = CatchingFishCardViewRealm;
        return true;
    }

    public final void CatchingFishFragmentHandler(boolean z) {
        float measureText;
        TextInputLayout textInputLayout = this.CatchingFishParcelableFAB;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z) {
            return;
        }
        CatchingFishReduxKtor(1.0f, z);
        CharSequence charSequence = this.CatchingFishMVPRobolectric;
        TextPaint textPaint = this.CatchingFishGradleManifest;
        if (charSequence != null && this.CatchingFishStripeAPI != null) {
            this.CatchingFishRedux = CatchingFishAnimationMockk() ? TextUtils.ellipsize(this.CatchingFishMVPRobolectric, textPaint, this.CatchingFishStripeAPI.getWidth(), this.CatchingFishPayPal) : this.CatchingFishMVPRobolectric;
        }
        CharSequence charSequence2 = this.CatchingFishRedux;
        if (charSequence2 != null) {
            this.CatchingFishMoshiDaggerHilt = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.CatchingFishMoshiDaggerHilt = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.CatchingFishViewModelScope, this.CatchingFishCustomView ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.CatchingFishReduxKtor;
        if (i == 48) {
            this.CatchingFishUnitTesting = rect.top;
        } else if (i != 80) {
            this.CatchingFishUnitTesting = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.CatchingFishUnitTesting = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.CatchingFishStateLiveData = rect.centerX() - (this.CatchingFishMoshiDaggerHilt / 2.0f);
        } else if (i2 != 5) {
            this.CatchingFishStateLiveData = rect.left;
        } else {
            this.CatchingFishStateLiveData = rect.right - this.CatchingFishMoshiDaggerHilt;
        }
        if (this.CatchingFishMoshiDaggerHilt <= rect.width()) {
            float f = this.CatchingFishStateLiveData;
            float max = Math.max(0.0f, rect.left - f) + f;
            this.CatchingFishStateLiveData = max;
            this.CatchingFishStateLiveData = Math.min(0.0f, rect.right - (this.CatchingFishMoshiDaggerHilt + max)) + max;
        }
        float f2 = this.CatchingFishLayout;
        TextPaint textPaint2 = this.CatchingFishMotionLayout;
        textPaint2.setTextSize(f2);
        textPaint2.setTypeface(this.CatchingFish);
        textPaint2.setLetterSpacing(this.CatchingFishJUnitRealm);
        if (textPaint2.descent() + (-textPaint2.ascent()) <= rect.height()) {
            float f3 = this.CatchingFishUnitTesting;
            float max2 = Math.max(0.0f, rect.top - f3) + f3;
            this.CatchingFishUnitTesting = max2;
            this.CatchingFishUnitTesting = Math.min(0.0f, rect.bottom - (CatchingFishWorkManager() + max2)) + max2;
        }
        CatchingFishReduxKtor(0.0f, z);
        float height = this.CatchingFishStripeAPI != null ? r15.getHeight() : 0.0f;
        StaticLayout staticLayout = this.CatchingFishStripeAPI;
        if (staticLayout == null || this.CatchingFishCustomViewJUnit <= 1) {
            CharSequence charSequence3 = this.CatchingFishMVPRobolectric;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout.getWidth();
        }
        StaticLayout staticLayout2 = this.CatchingFishStripeAPI;
        this.CatchingFishEspressoTesting = staticLayout2 != null ? staticLayout2.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.CatchingFishWorkManager, this.CatchingFishCustomView ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.CatchingFishCoroutine;
        if (i3 == 48) {
            this.CatchingFishOkHttp = rect2.top;
        } else if (i3 != 80) {
            this.CatchingFishOkHttp = rect2.centerY() - (height / 2.0f);
        } else {
            this.CatchingFishOkHttp = (rect2.bottom - height) + (this.CatchingFishRetrofitMVI ? textPaint.descent() : 0.0f);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.CatchingFishAnimationMockk = rect2.centerX() - (measureText / 2.0f);
        } else if (i4 != 5) {
            this.CatchingFishAnimationMockk = rect2.left;
        } else {
            this.CatchingFishAnimationMockk = rect2.right - measureText;
        }
        CatchingFishReduxKtor(this.CatchingFishSnackbar, false);
        textInputLayout.postInvalidateOnAnimation();
        CatchingFishSnackbar();
    }

    public final void CatchingFishLayout(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.CatchingFishCoroutineFlow;
            if (typeface != null) {
                this.CatchingFishJetpackCompose = CatchingFishToastHiltBundle.CatchingFishCardViewRealm(configuration, typeface);
            }
            Typeface typeface2 = this.CatchingFishParcelableFlux;
            if (typeface2 != null) {
                this.CatchingFishSpannableWidget = CatchingFishToastHiltBundle.CatchingFishCardViewRealm(configuration, typeface2);
            }
            Typeface typeface3 = this.CatchingFishJetpackCompose;
            if (typeface3 == null) {
                typeface3 = this.CatchingFishCoroutineFlow;
            }
            this.CatchingFish = typeface3;
            Typeface typeface4 = this.CatchingFishSpannableWidget;
            if (typeface4 == null) {
                typeface4 = this.CatchingFishParcelableFlux;
            }
            this.CatchingFishDaggerHiltFAB = typeface4;
            CatchingFishFragmentHandler(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000b, code lost:
    
        if (r3 > 1.0f) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishOkHttp(float f) {
        float f2 = f >= 0.0f ? 1.0f : 0.0f;
        f = f2;
        if (f != this.CatchingFishSnackbar) {
            this.CatchingFishSnackbar = f;
            CatchingFishSnackbar();
        }
    }

    public final void CatchingFishReduxKtor(float f, boolean z) {
        float f2;
        Typeface typeface;
        float f3;
        if (this.CatchingFishCardViewView == null) {
            return;
        }
        float width = this.CatchingFishReduxKtor.width();
        float width2 = this.CatchingFishCoroutine.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = CatchingFishAnimationMockk() ? this.CatchingFishLayout : this.CatchingFishViewModelFAB;
            f3 = CatchingFishAnimationMockk() ? this.CatchingFishJUnitRealm : this.CatchingFishAnimation;
            this.CatchingFishMutableLiveData = CatchingFishAnimationMockk() ? 1.0f : CatchingFishViewModelFAB(this.CatchingFishViewModelFAB, this.CatchingFishLayout, f, this.CatchingFishParcelable) / this.CatchingFishViewModelFAB;
            if (!CatchingFishAnimationMockk()) {
                width = width2;
            }
            typeface = this.CatchingFish;
            width2 = width;
        } else {
            f2 = this.CatchingFishViewModelFAB;
            float f4 = this.CatchingFishAnimation;
            typeface = this.CatchingFishDaggerHiltFAB;
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                this.CatchingFishMutableLiveData = 1.0f;
            } else {
                this.CatchingFishMutableLiveData = CatchingFishViewModelFAB(this.CatchingFishViewModelFAB, this.CatchingFishLayout, f, this.CatchingFishParcelable) / this.CatchingFishViewModelFAB;
            }
            float f5 = this.CatchingFishLayout / this.CatchingFishViewModelFAB;
            float f6 = width2 * f5;
            if (!z && f6 > width && CatchingFishAnimationMockk()) {
                width2 = Math.min(width / f5, width2);
            }
            f3 = f4;
        }
        int i = f < 0.5f ? this.CatchingFishCustomViewJUnit : this.CatchingFishDaggerMVVM;
        TextPaint textPaint = this.CatchingFishGradleManifest;
        if (width2 > 0.0f) {
            boolean z2 = this.CatchingFishJobScheduler != f2;
            boolean z3 = this.CatchingFishMVVMAppCompat != f3;
            boolean z4 = this.CatchingFishGsonAppCompat != typeface;
            StaticLayout staticLayout = this.CatchingFishStripeAPI;
            boolean z5 = z2 || z3 || (staticLayout != null && (width2 > ((float) staticLayout.getWidth()) ? 1 : (width2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z4 || (this.CatchingFishCameraXIntent != i) || this.CatchingFishPayPalLiveData;
            this.CatchingFishJobScheduler = f2;
            this.CatchingFishMVVMAppCompat = f3;
            this.CatchingFishGsonAppCompat = typeface;
            this.CatchingFishPayPalLiveData = false;
            this.CatchingFishCameraXIntent = i;
            textPaint.setLinearText(this.CatchingFishMutableLiveData != 1.0f);
            r7 = z5;
        }
        if (this.CatchingFishMVPRobolectric == null || r7) {
            textPaint.setTextSize(this.CatchingFishJobScheduler);
            textPaint.setTypeface(this.CatchingFishGsonAppCompat);
            textPaint.setLetterSpacing(this.CatchingFishMVVMAppCompat);
            boolean CatchingFishCoroutine = CatchingFishCoroutine(this.CatchingFishCardViewView);
            this.CatchingFishCustomView = CatchingFishCoroutine;
            StaticLayout CatchingFishDaggerWebsocket = CatchingFishDaggerWebsocket(((this.CatchingFishCustomViewJUnit > 1 || this.CatchingFishDaggerMVVM > 1) && !CatchingFishCoroutine) ? i : 1, textPaint, this.CatchingFishCardViewView, width2 * (CatchingFishAnimationMockk() ? 1.0f : this.CatchingFishMutableLiveData), this.CatchingFishCustomView);
            this.CatchingFishStripeAPI = CatchingFishDaggerWebsocket;
            this.CatchingFishMVPRobolectric = CatchingFishDaggerWebsocket.getText();
        }
    }

    public final void CatchingFishSnackbar() {
        float f = this.CatchingFishSnackbar;
        float f2 = this.CatchingFishCoroutine.left;
        Rect rect = this.CatchingFishReduxKtor;
        float CatchingFishViewModelFAB = CatchingFishViewModelFAB(f2, rect.left, f, this.CatchingFishLayoutInflater);
        RectF rectF = this.CatchingFishDaggerWebsocket;
        rectF.left = CatchingFishViewModelFAB;
        rectF.top = CatchingFishViewModelFAB(this.CatchingFishOkHttp, this.CatchingFishUnitTesting, f, this.CatchingFishLayoutInflater);
        rectF.right = CatchingFishViewModelFAB(r1.right, rect.right, f, this.CatchingFishLayoutInflater);
        rectF.bottom = CatchingFishViewModelFAB(r1.bottom, rect.bottom, f, this.CatchingFishLayoutInflater);
        this.CatchingFishRoomDatabase = CatchingFishViewModelFAB(this.CatchingFishAnimationMockk, this.CatchingFishStateLiveData, f, this.CatchingFishLayoutInflater);
        this.CatchingFishNavigation = CatchingFishViewModelFAB(this.CatchingFishOkHttp, this.CatchingFishUnitTesting, f, this.CatchingFishLayoutInflater);
        CatchingFishReduxKtor(f, false);
        TextInputLayout textInputLayout = this.CatchingFishParcelableFAB;
        textInputLayout.postInvalidateOnAnimation();
        CatchingFishLayoutRetrofit catchingFishLayoutRetrofit = CatchingFishRobolectricRoom.CatchingFishSnackbar;
        this.CatchingFishAndroidX = 1.0f - CatchingFishViewModelFAB(0.0f, 1.0f, 1.0f - f, catchingFishLayoutRetrofit);
        textInputLayout.postInvalidateOnAnimation();
        this.CatchingFishNavigationGson = CatchingFishViewModelFAB(1.0f, 0.0f, f, catchingFishLayoutRetrofit);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.CatchingFishCloudMessaging;
        ColorStateList colorStateList2 = this.CatchingFishFragmentHandler;
        TextPaint textPaint = this.CatchingFishGradleManifest;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(CatchingFishParcelableFAB(f, CatchingFishViewModelScope(colorStateList2), CatchingFishViewModelScope(this.CatchingFishCloudMessaging)));
        } else {
            textPaint.setColor(CatchingFishViewModelScope(colorStateList));
        }
        float f3 = this.CatchingFishJUnitRealm;
        float f4 = this.CatchingFishAnimation;
        if (f3 != f4) {
            textPaint.setLetterSpacing(CatchingFishViewModelFAB(f4, f3, f, catchingFishLayoutRetrofit));
        } else {
            textPaint.setLetterSpacing(f3);
        }
        this.CatchingFishPayPalService = CatchingFishRobolectricRoom.CatchingFishParcelableFAB(0.0f, this.CatchingFishRecyclerView, f);
        this.CatchingFishSensorManager = CatchingFishRobolectricRoom.CatchingFishParcelableFAB(0.0f, this.CatchingFishAppCompat, f);
        this.CatchingFishEspressoMockk = CatchingFishRobolectricRoom.CatchingFishParcelableFAB(0.0f, this.CatchingFishDataStoreIntent, f);
        int CatchingFishParcelableFAB = CatchingFishParcelableFAB(f, 0, CatchingFishViewModelScope(this.CatchingFishStateFlow));
        this.CatchingFishDagger = CatchingFishParcelableFAB;
        textPaint.setShadowLayer(this.CatchingFishPayPalService, this.CatchingFishSensorManager, this.CatchingFishEspressoMockk, CatchingFishParcelableFAB);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final void CatchingFishUnitTesting(Typeface typeface) {
        boolean z;
        boolean CatchingFishEspressoTesting = CatchingFishEspressoTesting(typeface);
        if (this.CatchingFishParcelableFlux != typeface) {
            this.CatchingFishParcelableFlux = typeface;
            Typeface CatchingFishCardViewRealm = CatchingFishToastHiltBundle.CatchingFishCardViewRealm(this.CatchingFishParcelableFAB.getContext().getResources().getConfiguration(), typeface);
            this.CatchingFishSpannableWidget = CatchingFishCardViewRealm;
            if (CatchingFishCardViewRealm == null) {
                CatchingFishCardViewRealm = this.CatchingFishParcelableFlux;
            }
            this.CatchingFishDaggerHiltFAB = CatchingFishCardViewRealm;
            z = true;
        } else {
            z = false;
        }
        if (CatchingFishEspressoTesting || z) {
            CatchingFishFragmentHandler(false);
        }
    }

    public final int CatchingFishViewModelScope(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.CatchingFishHandler;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final float CatchingFishWorkManager() {
        int i = this.CatchingFishPicasso;
        if (i != -1) {
            return i;
        }
        float f = this.CatchingFishLayout;
        TextPaint textPaint = this.CatchingFishMotionLayout;
        textPaint.setTextSize(f);
        textPaint.setTypeface(this.CatchingFish);
        textPaint.setLetterSpacing(this.CatchingFishJUnitRealm);
        return -textPaint.ascent();
    }
}
