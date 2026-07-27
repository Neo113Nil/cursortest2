package kotlin.text;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishLayoutEspresso extends CatchingFishContextGraphQL implements Drawable.Callback, CatchingFishGraphQLToast {
    public static final int[] CatchingFishJUnitIntent = {R.attr.state_enabled};
    public static final ShapeDrawable CatchingFishRetrofitCameraX = new ShapeDrawable(new OvalShape());
    public SpannableStringBuilder CatchingFishAndroidX;
    public Drawable CatchingFishAnimation;
    public ColorStateList CatchingFishAppCompat;
    public int CatchingFishCameraX;
    public float CatchingFishCameraXIntent;
    public WeakReference CatchingFishCardView;
    public ColorStateList CatchingFishContextToast;
    public Drawable CatchingFishCustomViewJUnit;
    public ColorStateList CatchingFishDagger;
    public int CatchingFishDaggerAppCompat;
    public ColorStateList CatchingFishDaggerMVVM;
    public float CatchingFishDataStoreIntent;
    public int CatchingFishDynamicFeature;
    public ColorStateList CatchingFishEspressoMockk;
    public int[] CatchingFishExoPlayer;
    public final Context CatchingFishFABLayout;
    public float CatchingFishFirebase;
    public PorterDuffColorFilter CatchingFishGlideMVP;
    public float CatchingFishGlideWidgetKtor;
    public float CatchingFishGradleLiveData;
    public float CatchingFishGradleManifest;
    public final Paint CatchingFishGraphQLGlide;
    public float CatchingFishHandler;
    public int CatchingFishHiltBundle;
    public boolean CatchingFishJUnitRealm;
    public boolean CatchingFishKtor;
    public final PointF CatchingFishKtorService;
    public CharSequence CatchingFishLayoutInflater;
    public int CatchingFishLifecycle;
    public TextUtils.TruncateAt CatchingFishLifecycleHilt;
    public ColorFilter CatchingFishLiveDataRoom;
    public int CatchingFishMVPHandler;
    public final CatchingFishToastMVP CatchingFishMVPReduxContext;
    public RippleDrawable CatchingFishMVVMAppCompat;
    public ColorStateList CatchingFishMaterialDesign;
    public CatchingFishRealmToolbar CatchingFishMockkOkHttp;
    public float CatchingFishMoshiDaggerHilt;
    public ColorStateList CatchingFishMotionLayout;
    public boolean CatchingFishNavigationGson;
    public boolean CatchingFishParcelable;
    public int CatchingFishPayPalHandler;
    public ColorStateList CatchingFishPayPalLiveData;
    public float CatchingFishPicasso;
    public int CatchingFishRealmKtorRealm;
    public Drawable CatchingFishRecyclerView;
    public boolean CatchingFishRedux;
    public CatchingFishRealmToolbar CatchingFishReduxMoshi;
    public float CatchingFishRetrofit;
    public float CatchingFishRetrofitMVI;
    public float CatchingFishServiceMVIJUnit;
    public int CatchingFishSharedFlow;
    public boolean CatchingFishStateFlow;
    public final Paint.FontMetrics CatchingFishStateFlowIntent;
    public ColorStateList CatchingFishStripeAPI;
    public boolean CatchingFishStripeAPIWidget;
    public PorterDuff.Mode CatchingFishToolbar;
    public float CatchingFishView;
    public final Path CatchingFishWebSocketMockk;
    public boolean CatchingFishWebsocket;
    public final RectF CatchingFishWidget;

    public CatchingFishLayoutEspresso(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.catchingfish.fishcatcherpro.R.attr.chipStyle, com.catchingfish.fishcatcherpro.R.style.Widget_MaterialComponents_Chip_Action);
        this.CatchingFishHandler = -1.0f;
        this.CatchingFishGraphQLGlide = new Paint(1);
        this.CatchingFishStateFlowIntent = new Paint.FontMetrics();
        this.CatchingFishWidget = new RectF();
        this.CatchingFishKtorService = new PointF();
        this.CatchingFishWebSocketMockk = new Path();
        this.CatchingFishDaggerAppCompat = 255;
        this.CatchingFishToolbar = PorterDuff.Mode.SRC_IN;
        this.CatchingFishCardView = new WeakReference(null);
        CatchingFishCloudMessaging(context);
        this.CatchingFishFABLayout = context;
        CatchingFishToastMVP catchingFishToastMVP = new CatchingFishToastMVP(this);
        this.CatchingFishMVPReduxContext = catchingFishToastMVP;
        this.CatchingFishLayoutInflater = "";
        catchingFishToastMVP.CatchingFishParcelableFAB.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = CatchingFishJUnitIntent;
        setState(iArr);
        CatchingFishParcelable(iArr);
        this.CatchingFishStripeAPIWidget = true;
        CatchingFishRetrofitCameraX.setTint(-1);
    }

    public static void CatchingFishAndroidX(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean CatchingFishCardViewRealm(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static boolean CatchingFishGsonAppCompat(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public final void CatchingFishAnimation(CatchingFishPicassoOkHttp catchingFishPicassoOkHttp) {
        CatchingFishToastMVP catchingFishToastMVP = this.CatchingFishMVPReduxContext;
        CatchingFishPicassoHilt catchingFishPicassoHilt = catchingFishToastMVP.CatchingFishSnackbar;
        TextPaint textPaint = catchingFishToastMVP.CatchingFishParcelableFAB;
        if (catchingFishToastMVP.CatchingFishWorkManager != catchingFishPicassoOkHttp) {
            catchingFishToastMVP.CatchingFishWorkManager = catchingFishPicassoOkHttp;
            if (catchingFishPicassoOkHttp != null) {
                Context context = this.CatchingFishFABLayout;
                catchingFishPicassoOkHttp.CatchingFishDaggerWebsocket(context, textPaint, catchingFishPicassoHilt);
                CatchingFishGraphQLToast catchingFishGraphQLToast = (CatchingFishGraphQLToast) catchingFishToastMVP.CatchingFishDaggerWebsocket.get();
                if (catchingFishGraphQLToast != null) {
                    textPaint.drawableState = catchingFishGraphQLToast.getState();
                }
                catchingFishPicassoOkHttp.CatchingFishReduxKtor(context, textPaint, catchingFishPicassoHilt);
                catchingFishToastMVP.CatchingFishReduxKtor = true;
            }
            CatchingFishGraphQLToast catchingFishGraphQLToast2 = (CatchingFishGraphQLToast) catchingFishToastMVP.CatchingFishDaggerWebsocket.get();
            if (catchingFishGraphQLToast2 != null) {
                CatchingFishLayoutEspresso catchingFishLayoutEspresso = (CatchingFishLayoutEspresso) catchingFishGraphQLToast2;
                catchingFishLayoutEspresso.CatchingFishPayPal();
                catchingFishLayoutEspresso.invalidateSelf();
                catchingFishLayoutEspresso.onStateChange(catchingFishGraphQLToast2.getState());
            }
        }
    }

    public final void CatchingFishAppCompat(boolean z) {
        if (this.CatchingFishJUnitRealm != z) {
            boolean CatchingFishMoshiDaggerHilt = CatchingFishMoshiDaggerHilt();
            this.CatchingFishJUnitRealm = z;
            boolean CatchingFishMoshiDaggerHilt2 = CatchingFishMoshiDaggerHilt();
            if (CatchingFishMoshiDaggerHilt != CatchingFishMoshiDaggerHilt2) {
                if (CatchingFishMoshiDaggerHilt2) {
                    CatchingFishJetpackCompose(this.CatchingFishAnimation);
                } else {
                    CatchingFishAndroidX(this.CatchingFishAnimation);
                }
                invalidateSelf();
                CatchingFishPayPal();
            }
        }
    }

    public final void CatchingFishCameraXIntent(ColorStateList colorStateList) {
        if (this.CatchingFishPayPalLiveData != colorStateList) {
            this.CatchingFishPayPalLiveData = colorStateList;
            if (this.CatchingFishWebsocket) {
                CatchingFishMVPEspressoRoom catchingFishMVPEspressoRoom = this.CatchingFishDaggerWebsocket;
                if (catchingFishMVPEspressoRoom.CatchingFishDaggerWebsocket != colorStateList) {
                    catchingFishMVPEspressoRoom.CatchingFishDaggerWebsocket = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean CatchingFishCardViewView(int[] iArr, int[] iArr2) {
        int i;
        int colorForState;
        int[] state;
        boolean z;
        boolean z2;
        int colorForState2;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.CatchingFishEspressoMockk;
        int CatchingFishCoroutine = CatchingFishCoroutine(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.CatchingFishRealmKtorRealm) : 0);
        boolean z3 = true;
        if (this.CatchingFishRealmKtorRealm != CatchingFishCoroutine) {
            this.CatchingFishRealmKtorRealm = CatchingFishCoroutine;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.CatchingFishDagger;
        int CatchingFishCoroutine2 = CatchingFishCoroutine(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.CatchingFishDynamicFeature) : 0);
        if (this.CatchingFishDynamicFeature != CatchingFishCoroutine2) {
            this.CatchingFishDynamicFeature = CatchingFishCoroutine2;
            onStateChange = true;
        }
        int CatchingFishSnackbar = CatchingFishLiveDataAdMob.CatchingFishSnackbar(CatchingFishCoroutine2, CatchingFishCoroutine);
        if ((this.CatchingFishPayPalHandler != CatchingFishSnackbar) | (this.CatchingFishDaggerWebsocket.CatchingFishReduxKtor == null)) {
            this.CatchingFishPayPalHandler = CatchingFishSnackbar;
            CatchingFishUnitTesting(ColorStateList.valueOf(CatchingFishSnackbar));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.CatchingFishPayPalLiveData;
        int colorForState3 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.CatchingFishSharedFlow) : 0;
        if (this.CatchingFishSharedFlow != colorForState3) {
            this.CatchingFishSharedFlow = colorForState3;
            onStateChange = true;
        }
        if (this.CatchingFishMaterialDesign != null) {
            boolean z4 = false;
            boolean z5 = false;
            for (int i2 : iArr) {
                if (i2 == 16842910) {
                    z4 = true;
                } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                    z5 = true;
                }
            }
            if (z4 && z5) {
                i = this.CatchingFishMaterialDesign.getColorForState(iArr, this.CatchingFishCameraX);
                if (this.CatchingFishCameraX != i) {
                    this.CatchingFishCameraX = i;
                }
                CatchingFishPicassoOkHttp catchingFishPicassoOkHttp = this.CatchingFishMVPReduxContext.CatchingFishWorkManager;
                colorForState = (catchingFishPicassoOkHttp != null || (colorStateList = catchingFishPicassoOkHttp.CatchingFishCloudMessaging) == null) ? 0 : colorStateList.getColorForState(iArr, this.CatchingFishLifecycle);
                if (this.CatchingFishLifecycle != colorForState) {
                    this.CatchingFishLifecycle = colorForState;
                    onStateChange = true;
                }
                state = getState();
                if (state != null) {
                    int length = state.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            break;
                        }
                        if (state[i3] != 16842912) {
                            i3++;
                        } else if (this.CatchingFishNavigationGson) {
                            z = true;
                        }
                    }
                }
                z = false;
                if (this.CatchingFishKtor != z || this.CatchingFishCustomViewJUnit == null) {
                    z2 = false;
                } else {
                    float CatchingFishDaggerHiltFAB = CatchingFishDaggerHiltFAB();
                    this.CatchingFishKtor = z;
                    if (CatchingFishDaggerHiltFAB != CatchingFishDaggerHiltFAB()) {
                        onStateChange = true;
                        z2 = true;
                    } else {
                        z2 = false;
                        onStateChange = true;
                    }
                }
                ColorStateList colorStateList5 = this.CatchingFishContextToast;
                colorForState2 = colorStateList5 == null ? colorStateList5.getColorForState(iArr, this.CatchingFishMVPHandler) : 0;
                if (this.CatchingFishMVPHandler == colorForState2) {
                    this.CatchingFishMVPHandler = colorForState2;
                    ColorStateList colorStateList6 = this.CatchingFishContextToast;
                    PorterDuff.Mode mode = this.CatchingFishToolbar;
                    this.CatchingFishGlideMVP = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
                } else {
                    z3 = onStateChange;
                }
                if (CatchingFishCardViewRealm(this.CatchingFishRecyclerView)) {
                    z3 |= this.CatchingFishRecyclerView.setState(iArr);
                }
                if (CatchingFishCardViewRealm(this.CatchingFishCustomViewJUnit)) {
                    z3 |= this.CatchingFishCustomViewJUnit.setState(iArr);
                }
                if (CatchingFishCardViewRealm(this.CatchingFishAnimation)) {
                    int[] iArr3 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
                    z3 |= this.CatchingFishAnimation.setState(iArr3);
                }
                if (CatchingFishCardViewRealm(this.CatchingFishMVVMAppCompat)) {
                    z3 |= this.CatchingFishMVVMAppCompat.setState(iArr2);
                }
                if (z3) {
                    invalidateSelf();
                }
                if (z2) {
                    CatchingFishPayPal();
                }
                return z3;
            }
        }
        i = 0;
        if (this.CatchingFishCameraX != i) {
        }
        CatchingFishPicassoOkHttp catchingFishPicassoOkHttp2 = this.CatchingFishMVPReduxContext.CatchingFishWorkManager;
        if (catchingFishPicassoOkHttp2 != null) {
        }
        if (this.CatchingFishLifecycle != colorForState) {
        }
        state = getState();
        if (state != null) {
        }
        z = false;
        if (this.CatchingFishKtor != z) {
        }
        z2 = false;
        ColorStateList colorStateList52 = this.CatchingFishContextToast;
        if (colorStateList52 == null) {
        }
        if (this.CatchingFishMVPHandler == colorForState2) {
        }
        if (CatchingFishCardViewRealm(this.CatchingFishRecyclerView)) {
        }
        if (CatchingFishCardViewRealm(this.CatchingFishCustomViewJUnit)) {
        }
        if (CatchingFishCardViewRealm(this.CatchingFishAnimation)) {
        }
        if (CatchingFishCardViewRealm(this.CatchingFishMVVMAppCompat)) {
        }
        if (z3) {
        }
        if (z2) {
        }
        return z3;
    }

    public final void CatchingFishCoroutineFlow(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (CatchingFishStripeAPI() || CatchingFishMVVMAppCompat()) {
            float f = this.CatchingFishPicasso + this.CatchingFishFirebase;
            Drawable drawable = this.CatchingFishKtor ? this.CatchingFishCustomViewJUnit : this.CatchingFishRecyclerView;
            float f2 = this.CatchingFishDataStoreIntent;
            if (f2 <= 0.0f && drawable != null) {
                f2 = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + f2;
            } else {
                float f4 = rect.right - f;
                rectF.right = f4;
                rectF.left = f4 - f2;
            }
            Drawable drawable2 = this.CatchingFishKtor ? this.CatchingFishCustomViewJUnit : this.CatchingFishRecyclerView;
            float f5 = this.CatchingFishDataStoreIntent;
            if (f5 <= 0.0f && drawable2 != null) {
                f5 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.CatchingFishFABLayout.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= f5) {
                    f5 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f5 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f5;
        }
    }

    public final void CatchingFishCustomView(Drawable drawable) {
        if (this.CatchingFishCustomViewJUnit != drawable) {
            float CatchingFishDaggerHiltFAB = CatchingFishDaggerHiltFAB();
            this.CatchingFishCustomViewJUnit = drawable;
            float CatchingFishDaggerHiltFAB2 = CatchingFishDaggerHiltFAB();
            CatchingFishAndroidX(this.CatchingFishCustomViewJUnit);
            CatchingFishJetpackCompose(this.CatchingFishCustomViewJUnit);
            invalidateSelf();
            if (CatchingFishDaggerHiltFAB != CatchingFishDaggerHiltFAB2) {
                CatchingFishPayPal();
            }
        }
    }

    public final void CatchingFishDagger(boolean z) {
        if (this.CatchingFishParcelable != z) {
            boolean CatchingFishStripeAPI = CatchingFishStripeAPI();
            this.CatchingFishParcelable = z;
            boolean CatchingFishStripeAPI2 = CatchingFishStripeAPI();
            if (CatchingFishStripeAPI != CatchingFishStripeAPI2) {
                if (CatchingFishStripeAPI2) {
                    CatchingFishJetpackCompose(this.CatchingFishRecyclerView);
                } else {
                    CatchingFishAndroidX(this.CatchingFishRecyclerView);
                }
                invalidateSelf();
                CatchingFishPayPal();
            }
        }
    }

    public final float CatchingFishDaggerHiltFAB() {
        if (!CatchingFishStripeAPI() && !CatchingFishMVVMAppCompat()) {
            return 0.0f;
        }
        float f = this.CatchingFishFirebase;
        Drawable drawable = this.CatchingFishKtor ? this.CatchingFishCustomViewJUnit : this.CatchingFishRecyclerView;
        float f2 = this.CatchingFishDataStoreIntent;
        if (f2 <= 0.0f && drawable != null) {
            f2 = drawable.getIntrinsicWidth();
        }
        return f2 + f + this.CatchingFishRetrofitMVI;
    }

    public final void CatchingFishDataStoreIntent(float f) {
        if (this.CatchingFishRetrofitMVI != f) {
            float CatchingFishDaggerHiltFAB = CatchingFishDaggerHiltFAB();
            this.CatchingFishRetrofitMVI = f;
            float CatchingFishDaggerHiltFAB2 = CatchingFishDaggerHiltFAB();
            invalidateSelf();
            if (CatchingFishDaggerHiltFAB != CatchingFishDaggerHiltFAB2) {
                CatchingFishPayPal();
            }
        }
    }

    public final void CatchingFishEspressoMockk(ColorStateList colorStateList) {
        this.CatchingFishStateFlow = true;
        if (this.CatchingFishAppCompat != colorStateList) {
            this.CatchingFishAppCompat = colorStateList;
            if (CatchingFishStripeAPI()) {
                this.CatchingFishRecyclerView.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void CatchingFishFragmentFactory(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.CatchingFishDaggerMVVM != colorStateList) {
            this.CatchingFishDaggerMVVM = colorStateList;
            if (this.CatchingFishRedux && (drawable = this.CatchingFishCustomViewJUnit) != null && this.CatchingFishNavigationGson) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void CatchingFishGradleManifest(float f) {
        if (this.CatchingFishServiceMVIJUnit != f) {
            this.CatchingFishServiceMVIJUnit = f;
            invalidateSelf();
            if (CatchingFishMoshiDaggerHilt()) {
                CatchingFishPayPal();
            }
        }
    }

    public final void CatchingFishHandler(float f) {
        if (this.CatchingFishGradleManifest != f) {
            this.CatchingFishGradleManifest = f;
            this.CatchingFishGraphQLGlide.setStrokeWidth(f);
            if (this.CatchingFishWebsocket) {
                this.CatchingFishDaggerWebsocket.CatchingFishCloudMessaging = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void CatchingFishJUnitRealm(ColorStateList colorStateList) {
        if (this.CatchingFishMotionLayout != colorStateList) {
            this.CatchingFishMotionLayout = colorStateList;
            this.CatchingFishMaterialDesign = null;
            onStateChange(getState());
        }
    }

    public final void CatchingFishJetpackCompose(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.CatchingFishAnimation) {
            if (drawable.isStateful()) {
                drawable.setState(this.CatchingFishExoPlayer);
            }
            drawable.setTintList(this.CatchingFishStripeAPI);
            return;
        }
        Drawable drawable2 = this.CatchingFishRecyclerView;
        if (drawable == drawable2 && this.CatchingFishStateFlow) {
            drawable2.setTintList(this.CatchingFishAppCompat);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void CatchingFishJobScheduler(float f) {
        if (this.CatchingFishHandler != f) {
            this.CatchingFishHandler = f;
            CatchingFishKtorMVI CatchingFishWorkManager = this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB.CatchingFishWorkManager();
            CatchingFishWorkManager.CatchingFishDaggerWebsocket = new CatchingFishEspressoTesting(f);
            CatchingFishWorkManager.CatchingFishWorkManager = new CatchingFishEspressoTesting(f);
            CatchingFishWorkManager.CatchingFishViewModelScope = new CatchingFishEspressoTesting(f);
            CatchingFishWorkManager.CatchingFishViewModelFAB = new CatchingFishEspressoTesting(f);
            setShapeAppearanceModel(CatchingFishWorkManager.CatchingFishParcelableFAB());
        }
    }

    public final void CatchingFishLayoutInflater(float f) {
        if (this.CatchingFishView != f) {
            this.CatchingFishView = f;
            invalidateSelf();
            if (CatchingFishMoshiDaggerHilt()) {
                CatchingFishPayPal();
            }
        }
    }

    public final void CatchingFishMVPRobolectric(boolean z) {
        if (this.CatchingFishNavigationGson != z) {
            this.CatchingFishNavigationGson = z;
            float CatchingFishDaggerHiltFAB = CatchingFishDaggerHiltFAB();
            if (!z && this.CatchingFishKtor) {
                this.CatchingFishKtor = false;
            }
            float CatchingFishDaggerHiltFAB2 = CatchingFishDaggerHiltFAB();
            invalidateSelf();
            if (CatchingFishDaggerHiltFAB != CatchingFishDaggerHiltFAB2) {
                CatchingFishPayPal();
            }
        }
    }

    public final boolean CatchingFishMVVMAppCompat() {
        return this.CatchingFishRedux && this.CatchingFishCustomViewJUnit != null && this.CatchingFishKtor;
    }

    public final boolean CatchingFishMoshiDaggerHilt() {
        return this.CatchingFishJUnitRealm && this.CatchingFishAnimation != null;
    }

    public final void CatchingFishMotionLayout(float f) {
        if (this.CatchingFishMoshiDaggerHilt != f) {
            this.CatchingFishMoshiDaggerHilt = f;
            invalidateSelf();
            if (CatchingFishMoshiDaggerHilt()) {
                CatchingFishPayPal();
            }
        }
    }

    public final void CatchingFishMutableLiveData(boolean z) {
        if (this.CatchingFishRedux != z) {
            boolean CatchingFishMVVMAppCompat = CatchingFishMVVMAppCompat();
            this.CatchingFishRedux = z;
            boolean CatchingFishMVVMAppCompat2 = CatchingFishMVVMAppCompat();
            if (CatchingFishMVVMAppCompat != CatchingFishMVVMAppCompat2) {
                if (CatchingFishMVVMAppCompat2) {
                    CatchingFishJetpackCompose(this.CatchingFishCustomViewJUnit);
                } else {
                    CatchingFishAndroidX(this.CatchingFishCustomViewJUnit);
                }
                invalidateSelf();
                CatchingFishPayPal();
            }
        }
    }

    public final boolean CatchingFishParcelable(int[] iArr) {
        if (Arrays.equals(this.CatchingFishExoPlayer, iArr)) {
            return false;
        }
        this.CatchingFishExoPlayer = iArr;
        if (CatchingFishMoshiDaggerHilt()) {
            return CatchingFishCardViewView(getState(), iArr);
        }
        return false;
    }

    public final float CatchingFishParcelableFlux() {
        if (!this.CatchingFishWebsocket) {
            return this.CatchingFishHandler;
        }
        float[] fArr = this.CatchingFishFragmentFactory;
        return fArr != null ? fArr[3] : this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB(CatchingFishViewModelScope());
    }

    public final void CatchingFishPayPal() {
        CatchingFishBundleXMLLayout catchingFishBundleXMLLayout = (CatchingFishBundleXMLLayout) this.CatchingFishCardView.get();
        if (catchingFishBundleXMLLayout != null) {
            Chip chip = (Chip) catchingFishBundleXMLLayout;
            chip.CatchingFishSnackbar(chip.CatchingFish);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public final void CatchingFishPayPalLiveData(Drawable drawable) {
        Drawable drawable2 = this.CatchingFishAnimation;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float CatchingFishSpannableWidget = CatchingFishSpannableWidget();
            this.CatchingFishAnimation = drawable != null ? drawable.mutate() : null;
            this.CatchingFishMVVMAppCompat = new RippleDrawable(CatchingFishGsonCardView.CatchingFishPayPalService(this.CatchingFishMotionLayout), this.CatchingFishAnimation, CatchingFishRetrofitCameraX);
            float CatchingFishSpannableWidget2 = CatchingFishSpannableWidget();
            CatchingFishAndroidX(drawable2);
            if (CatchingFishMoshiDaggerHilt()) {
                CatchingFishJetpackCompose(this.CatchingFishAnimation);
            }
            invalidateSelf();
            if (CatchingFishSpannableWidget != CatchingFishSpannableWidget2) {
                CatchingFishPayPal();
            }
        }
    }

    public final void CatchingFishPayPalService(Drawable drawable) {
        Drawable drawable2 = this.CatchingFishRecyclerView;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float CatchingFishDaggerHiltFAB = CatchingFishDaggerHiltFAB();
            this.CatchingFishRecyclerView = drawable != null ? drawable.mutate() : null;
            float CatchingFishDaggerHiltFAB2 = CatchingFishDaggerHiltFAB();
            CatchingFishAndroidX(drawable2);
            if (CatchingFishStripeAPI()) {
                CatchingFishJetpackCompose(this.CatchingFishRecyclerView);
            }
            invalidateSelf();
            if (CatchingFishDaggerHiltFAB != CatchingFishDaggerHiltFAB2) {
                CatchingFishPayPal();
            }
        }
    }

    public final void CatchingFishRecyclerView(ColorStateList colorStateList) {
        if (this.CatchingFishStripeAPI != colorStateList) {
            this.CatchingFishStripeAPI = colorStateList;
            if (CatchingFishMoshiDaggerHilt()) {
                this.CatchingFishAnimation.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void CatchingFishSensorManager(float f) {
        if (this.CatchingFishDataStoreIntent != f) {
            float CatchingFishDaggerHiltFAB = CatchingFishDaggerHiltFAB();
            this.CatchingFishDataStoreIntent = f;
            float CatchingFishDaggerHiltFAB2 = CatchingFishDaggerHiltFAB();
            invalidateSelf();
            if (CatchingFishDaggerHiltFAB != CatchingFishDaggerHiltFAB2) {
                CatchingFishPayPal();
            }
        }
    }

    public final float CatchingFishSpannableWidget() {
        if (CatchingFishMoshiDaggerHilt()) {
            return this.CatchingFishView + this.CatchingFishMoshiDaggerHilt + this.CatchingFishServiceMVIJUnit;
        }
        return 0.0f;
    }

    public final void CatchingFishStateFlow(float f) {
        if (this.CatchingFishFirebase != f) {
            float CatchingFishDaggerHiltFAB = CatchingFishDaggerHiltFAB();
            this.CatchingFishFirebase = f;
            float CatchingFishDaggerHiltFAB2 = CatchingFishDaggerHiltFAB();
            invalidateSelf();
            if (CatchingFishDaggerHiltFAB != CatchingFishDaggerHiltFAB2) {
                CatchingFishPayPal();
            }
        }
    }

    public final boolean CatchingFishStripeAPI() {
        return this.CatchingFishParcelable && this.CatchingFishRecyclerView != null;
    }

    @Override // kotlin.text.CatchingFishContextGraphQL, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int i2;
        float f;
        int i3;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.CatchingFishDaggerAppCompat) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            i2 = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            i2 = 0;
        }
        boolean z = this.CatchingFishWebsocket;
        Paint paint = this.CatchingFishGraphQLGlide;
        RectF rectF = this.CatchingFishWidget;
        if (!z) {
            paint.setColor(this.CatchingFishRealmKtorRealm);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, CatchingFishParcelableFlux(), CatchingFishParcelableFlux(), paint);
        }
        if (!this.CatchingFishWebsocket) {
            paint.setColor(this.CatchingFishDynamicFeature);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.CatchingFishLiveDataRoom;
            if (colorFilter == null) {
                colorFilter = this.CatchingFishGlideMVP;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, CatchingFishParcelableFlux(), CatchingFishParcelableFlux(), paint);
        }
        if (this.CatchingFishWebsocket) {
            super.draw(canvas);
        }
        if (this.CatchingFishGradleManifest > 0.0f && !this.CatchingFishWebsocket) {
            paint.setColor(this.CatchingFishSharedFlow);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.CatchingFishWebsocket) {
                ColorFilter colorFilter2 = this.CatchingFishLiveDataRoom;
                if (colorFilter2 == null) {
                    colorFilter2 = this.CatchingFishGlideMVP;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f2 = bounds.left;
            float f3 = this.CatchingFishGradleManifest / 2.0f;
            rectF.set(f2 + f3, bounds.top + f3, bounds.right - f3, bounds.bottom - f3);
            float f4 = this.CatchingFishHandler - (this.CatchingFishGradleManifest / 2.0f);
            canvas2.drawRoundRect(rectF, f4, f4, paint);
        }
        paint.setColor(this.CatchingFishCameraX);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.CatchingFishWebsocket) {
            RectF rectF2 = new RectF(bounds);
            CatchingFishMVPEspressoRoom catchingFishMVPEspressoRoom = this.CatchingFishDaggerWebsocket;
            CatchingFishFragmentMVVM catchingFishFragmentMVVM = catchingFishMVPEspressoRoom.CatchingFishParcelableFAB;
            float[] fArr = this.CatchingFishFragmentFactory;
            float f5 = catchingFishMVPEspressoRoom.CatchingFishFragmentHandler;
            CatchingFishCustomViewMoshi catchingFishCustomViewMoshi = this.CatchingFishCoroutineFlow;
            CatchingFishFABRoom catchingFishFABRoom = this.CatchingFishDaggerHiltFAB;
            f = 2.0f;
            Path path = this.CatchingFishWebSocketMockk;
            catchingFishFABRoom.CatchingFishParcelableFAB(catchingFishFragmentMVVM, fArr, f5, rectF2, catchingFishCustomViewMoshi, path);
            CatchingFishDaggerWebsocket(canvas2, paint, path, this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB, this.CatchingFishFragmentFactory, CatchingFishViewModelScope());
        } else {
            canvas2.drawRoundRect(rectF, CatchingFishParcelableFlux(), CatchingFishParcelableFlux(), paint);
            f = 2.0f;
        }
        if (CatchingFishStripeAPI()) {
            CatchingFishCoroutineFlow(bounds, rectF);
            float f6 = rectF.left;
            float f7 = rectF.top;
            canvas2.translate(f6, f7);
            this.CatchingFishRecyclerView.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.CatchingFishRecyclerView.draw(canvas2);
            canvas2.translate(-f6, -f7);
        }
        if (CatchingFishMVVMAppCompat()) {
            CatchingFishCoroutineFlow(bounds, rectF);
            float f8 = rectF.left;
            float f9 = rectF.top;
            canvas2.translate(f8, f9);
            this.CatchingFishCustomViewJUnit.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.CatchingFishCustomViewJUnit.draw(canvas2);
            canvas2.translate(-f8, -f9);
        }
        if (this.CatchingFishStripeAPIWidget && this.CatchingFishLayoutInflater != null) {
            PointF pointF = this.CatchingFishKtorService;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.CatchingFishLayoutInflater;
            CatchingFishToastMVP catchingFishToastMVP = this.CatchingFishMVPReduxContext;
            if (charSequence != null) {
                float CatchingFishDaggerHiltFAB = CatchingFishDaggerHiltFAB() + this.CatchingFishPicasso + this.CatchingFishGradleLiveData;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + CatchingFishDaggerHiltFAB;
                } else {
                    pointF.x = bounds.right - CatchingFishDaggerHiltFAB;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = catchingFishToastMVP.CatchingFishParcelableFAB;
                Paint.FontMetrics fontMetrics = this.CatchingFishStateFlowIntent;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / f);
            }
            rectF.setEmpty();
            if (this.CatchingFishLayoutInflater != null) {
                float CatchingFishDaggerHiltFAB2 = CatchingFishDaggerHiltFAB() + this.CatchingFishPicasso + this.CatchingFishGradleLiveData;
                float CatchingFishSpannableWidget = CatchingFishSpannableWidget() + this.CatchingFishGlideWidgetKtor + this.CatchingFishRetrofit;
                if (getLayoutDirection() == 0) {
                    rectF.left = bounds.left + CatchingFishDaggerHiltFAB2;
                    rectF.right = bounds.right - CatchingFishSpannableWidget;
                } else {
                    rectF.left = bounds.left + CatchingFishSpannableWidget;
                    rectF.right = bounds.right - CatchingFishDaggerHiltFAB2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            CatchingFishPicassoOkHttp catchingFishPicassoOkHttp = catchingFishToastMVP.CatchingFishWorkManager;
            TextPaint textPaint2 = catchingFishToastMVP.CatchingFishParcelableFAB;
            if (catchingFishPicassoOkHttp != null) {
                textPaint2.drawableState = getState();
                catchingFishToastMVP.CatchingFishWorkManager.CatchingFishReduxKtor(this.CatchingFishFABLayout, textPaint2, catchingFishToastMVP.CatchingFishSnackbar);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(catchingFishToastMVP.CatchingFishParcelableFAB(this.CatchingFishLayoutInflater.toString())) > Math.round(rectF.width());
            if (z2) {
                int save = canvas2.save();
                canvas2.clipRect(rectF);
                i3 = save;
            } else {
                i3 = 0;
            }
            CharSequence charSequence2 = this.CatchingFishLayoutInflater;
            if (z2 && this.CatchingFishLifecycleHilt != null) {
                charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF.width(), this.CatchingFishLifecycleHilt);
            }
            canvas.drawText(charSequence2, 0, charSequence2.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z2) {
                canvas2.restoreToCount(i3);
            }
        }
        if (CatchingFishMoshiDaggerHilt()) {
            rectF.setEmpty();
            if (CatchingFishMoshiDaggerHilt()) {
                float f10 = this.CatchingFishGlideWidgetKtor + this.CatchingFishServiceMVIJUnit;
                if (getLayoutDirection() == 0) {
                    float f11 = bounds.right - f10;
                    rectF.right = f11;
                    rectF.left = f11 - this.CatchingFishMoshiDaggerHilt;
                } else {
                    float f12 = bounds.left + f10;
                    rectF.left = f12;
                    rectF.right = f12 + this.CatchingFishMoshiDaggerHilt;
                }
                float exactCenterY = bounds.exactCenterY();
                float f13 = this.CatchingFishMoshiDaggerHilt;
                float f14 = exactCenterY - (f13 / f);
                rectF.top = f14;
                rectF.bottom = f14 + f13;
            }
            float f15 = rectF.left;
            float f16 = rectF.top;
            canvas2.translate(f15, f16);
            this.CatchingFishAnimation.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.CatchingFishMVVMAppCompat.setBounds(this.CatchingFishAnimation.getBounds());
            this.CatchingFishMVVMAppCompat.jumpToCurrentState();
            this.CatchingFishMVVMAppCompat.draw(canvas2);
            canvas2.translate(-f15, -f16);
        }
        if (this.CatchingFishDaggerAppCompat < 255) {
            canvas2.restoreToCount(i2);
        }
    }

    @Override // kotlin.text.CatchingFishContextGraphQL, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.CatchingFishDaggerAppCompat;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.CatchingFishLiveDataRoom;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.CatchingFishCameraXIntent;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(CatchingFishSpannableWidget() + this.CatchingFishMVPReduxContext.CatchingFishParcelableFAB(this.CatchingFishLayoutInflater.toString()) + CatchingFishDaggerHiltFAB() + this.CatchingFishPicasso + this.CatchingFishGradleLiveData + this.CatchingFishRetrofit + this.CatchingFishGlideWidgetKtor), this.CatchingFishHiltBundle);
    }

    @Override // kotlin.text.CatchingFishContextGraphQL, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // kotlin.text.CatchingFishContextGraphQL, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.CatchingFishWebsocket) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.CatchingFishCameraXIntent, this.CatchingFishHandler);
        } else {
            outline.setRoundRect(bounds, this.CatchingFishHandler);
            outline2 = outline;
        }
        outline2.setAlpha(this.CatchingFishDaggerAppCompat / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // kotlin.text.CatchingFishContextGraphQL, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (CatchingFishGsonAppCompat(this.CatchingFishEspressoMockk) || CatchingFishGsonAppCompat(this.CatchingFishDagger) || CatchingFishGsonAppCompat(this.CatchingFishPayPalLiveData)) {
            return true;
        }
        CatchingFishPicassoOkHttp catchingFishPicassoOkHttp = this.CatchingFishMVPReduxContext.CatchingFishWorkManager;
        if (catchingFishPicassoOkHttp == null || (colorStateList = catchingFishPicassoOkHttp.CatchingFishCloudMessaging) == null || !colorStateList.isStateful()) {
            return (this.CatchingFishRedux && this.CatchingFishCustomViewJUnit != null && this.CatchingFishNavigationGson) || CatchingFishCardViewRealm(this.CatchingFishRecyclerView) || CatchingFishCardViewRealm(this.CatchingFishCustomViewJUnit) || CatchingFishGsonAppCompat(this.CatchingFishContextToast);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (CatchingFishStripeAPI()) {
            onLayoutDirectionChanged |= this.CatchingFishRecyclerView.setLayoutDirection(i);
        }
        if (CatchingFishMVVMAppCompat()) {
            onLayoutDirectionChanged |= this.CatchingFishCustomViewJUnit.setLayoutDirection(i);
        }
        if (CatchingFishMoshiDaggerHilt()) {
            onLayoutDirectionChanged |= this.CatchingFishAnimation.setLayoutDirection(i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (CatchingFishStripeAPI()) {
            onLevelChange |= this.CatchingFishRecyclerView.setLevel(i);
        }
        if (CatchingFishMVVMAppCompat()) {
            onLevelChange |= this.CatchingFishCustomViewJUnit.setLevel(i);
        }
        if (CatchingFishMoshiDaggerHilt()) {
            onLevelChange |= this.CatchingFishAnimation.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // kotlin.text.CatchingFishContextGraphQL, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.CatchingFishWebsocket) {
            super.onStateChange(iArr);
        }
        return CatchingFishCardViewView(iArr, this.CatchingFishExoPlayer);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // kotlin.text.CatchingFishContextGraphQL, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.CatchingFishDaggerAppCompat != i) {
            this.CatchingFishDaggerAppCompat = i;
            invalidateSelf();
        }
    }

    @Override // kotlin.text.CatchingFishContextGraphQL, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.CatchingFishLiveDataRoom != colorFilter) {
            this.CatchingFishLiveDataRoom = colorFilter;
            invalidateSelf();
        }
    }

    @Override // kotlin.text.CatchingFishContextGraphQL, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.CatchingFishContextToast != colorStateList) {
            this.CatchingFishContextToast = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // kotlin.text.CatchingFishContextGraphQL, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.CatchingFishToolbar != mode) {
            this.CatchingFishToolbar = mode;
            ColorStateList colorStateList = this.CatchingFishContextToast;
            this.CatchingFishGlideMVP = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (CatchingFishStripeAPI()) {
            visible |= this.CatchingFishRecyclerView.setVisible(z, z2);
        }
        if (CatchingFishMVVMAppCompat()) {
            visible |= this.CatchingFishCustomViewJUnit.setVisible(z, z2);
        }
        if (CatchingFishMoshiDaggerHilt()) {
            visible |= this.CatchingFishAnimation.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
