package kotlin.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishGradleJUnit {
    public CatchingFishFABDaggerHilt CatchingFishCoroutine;
    public CatchingFishFABDaggerHilt CatchingFishDaggerWebsocket;
    public Typeface CatchingFishEspressoTesting;
    public final CatchingFishHandlerIntent CatchingFishLayout;
    public boolean CatchingFishOkHttp;
    public final TextView CatchingFishParcelableFAB;
    public CatchingFishFABDaggerHilt CatchingFishReduxKtor;
    public CatchingFishFABDaggerHilt CatchingFishSnackbar;
    public CatchingFishFABDaggerHilt CatchingFishViewModelFAB;
    public CatchingFishFABDaggerHilt CatchingFishViewModelScope;
    public CatchingFishFABDaggerHilt CatchingFishWorkManager;
    public int CatchingFishFragmentHandler = 0;
    public int CatchingFishCloudMessaging = -1;

    public CatchingFishGradleJUnit(TextView textView) {
        this.CatchingFishParcelableFAB = textView;
        this.CatchingFishLayout = new CatchingFishHandlerIntent(textView);
    }

    public static CatchingFishFABDaggerHilt CatchingFishCoroutine(Context context, CatchingFishPicassoMVPJUnit catchingFishPicassoMVPJUnit, int i) {
        ColorStateList CatchingFishWorkManager;
        synchronized (catchingFishPicassoMVPJUnit) {
            CatchingFishWorkManager = catchingFishPicassoMVPJUnit.CatchingFishParcelableFAB.CatchingFishWorkManager(context, i);
        }
        if (CatchingFishWorkManager == null) {
            return null;
        }
        CatchingFishFABDaggerHilt catchingFishFABDaggerHilt = new CatchingFishFABDaggerHilt();
        catchingFishFABDaggerHilt.CatchingFishSnackbar = true;
        catchingFishFABDaggerHilt.CatchingFishCoroutine = CatchingFishWorkManager;
        return catchingFishFABDaggerHilt;
    }

    public final void CatchingFishCloudMessaging(ColorStateList colorStateList) {
        if (this.CatchingFishViewModelFAB == null) {
            this.CatchingFishViewModelFAB = new CatchingFishFABDaggerHilt();
        }
        CatchingFishFABDaggerHilt catchingFishFABDaggerHilt = this.CatchingFishViewModelFAB;
        catchingFishFABDaggerHilt.CatchingFishCoroutine = colorStateList;
        catchingFishFABDaggerHilt.CatchingFishSnackbar = colorStateList != null;
        this.CatchingFishSnackbar = catchingFishFABDaggerHilt;
        this.CatchingFishCoroutine = catchingFishFABDaggerHilt;
        this.CatchingFishReduxKtor = catchingFishFABDaggerHilt;
        this.CatchingFishDaggerWebsocket = catchingFishFABDaggerHilt;
        this.CatchingFishWorkManager = catchingFishFABDaggerHilt;
        this.CatchingFishViewModelScope = catchingFishFABDaggerHilt;
    }

    public final PorterDuff.Mode CatchingFishDaggerWebsocket() {
        CatchingFishFABDaggerHilt catchingFishFABDaggerHilt = this.CatchingFishViewModelFAB;
        if (catchingFishFABDaggerHilt != null) {
            return (PorterDuff.Mode) catchingFishFABDaggerHilt.CatchingFishReduxKtor;
        }
        return null;
    }

    public final void CatchingFishEspressoTesting(PorterDuff.Mode mode) {
        if (this.CatchingFishViewModelFAB == null) {
            this.CatchingFishViewModelFAB = new CatchingFishFABDaggerHilt();
        }
        CatchingFishFABDaggerHilt catchingFishFABDaggerHilt = this.CatchingFishViewModelFAB;
        catchingFishFABDaggerHilt.CatchingFishReduxKtor = mode;
        catchingFishFABDaggerHilt.CatchingFishParcelableFAB = mode != null;
        this.CatchingFishSnackbar = catchingFishFABDaggerHilt;
        this.CatchingFishCoroutine = catchingFishFABDaggerHilt;
        this.CatchingFishReduxKtor = catchingFishFABDaggerHilt;
        this.CatchingFishDaggerWebsocket = catchingFishFABDaggerHilt;
        this.CatchingFishWorkManager = catchingFishFABDaggerHilt;
        this.CatchingFishViewModelScope = catchingFishFABDaggerHilt;
    }

    public final void CatchingFishFragmentHandler(int i) {
        CatchingFishHandlerIntent catchingFishHandlerIntent = this.CatchingFishLayout;
        if (catchingFishHandlerIntent.CatchingFishLayout()) {
            if (i == 0) {
                catchingFishHandlerIntent.CatchingFishParcelableFAB = 0;
                catchingFishHandlerIntent.CatchingFishReduxKtor = -1.0f;
                catchingFishHandlerIntent.CatchingFishDaggerWebsocket = -1.0f;
                catchingFishHandlerIntent.CatchingFishCoroutine = -1.0f;
                catchingFishHandlerIntent.CatchingFishWorkManager = new int[0];
                catchingFishHandlerIntent.CatchingFishSnackbar = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(CatchingFishMVPLiveData.CatchingFishCloudMessaging("Unknown auto-size text type: ", i));
            }
            DisplayMetrics displayMetrics = catchingFishHandlerIntent.CatchingFishFragmentHandler.getResources().getDisplayMetrics();
            catchingFishHandlerIntent.CatchingFishFragmentHandler(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (catchingFishHandlerIntent.CatchingFishViewModelScope()) {
                catchingFishHandlerIntent.CatchingFishParcelableFAB();
            }
        }
    }

    public final void CatchingFishLayout(int[] iArr, int i) {
        CatchingFishHandlerIntent catchingFishHandlerIntent = this.CatchingFishLayout;
        if (catchingFishHandlerIntent.CatchingFishLayout()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = catchingFishHandlerIntent.CatchingFishFragmentHandler.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                catchingFishHandlerIntent.CatchingFishWorkManager = CatchingFishHandlerIntent.CatchingFishSnackbar(iArr2);
                if (!catchingFishHandlerIntent.CatchingFishViewModelFAB()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                catchingFishHandlerIntent.CatchingFishViewModelScope = false;
            }
            if (catchingFishHandlerIntent.CatchingFishViewModelScope()) {
                catchingFishHandlerIntent.CatchingFishParcelableFAB();
            }
        }
    }

    public final void CatchingFishOkHttp(Context context, CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger) {
        String string;
        int i = this.CatchingFishFragmentHandler;
        TypedArray typedArray = (TypedArray) catchingFishAsyncTaskDagger.CatchingFishDaggerWebsocket;
        this.CatchingFishFragmentHandler = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.CatchingFishCloudMessaging = i3;
            if (i3 != -1) {
                this.CatchingFishFragmentHandler &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.CatchingFishOkHttp = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.CatchingFishEspressoTesting = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.CatchingFishEspressoTesting = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.CatchingFishEspressoTesting = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.CatchingFishEspressoTesting = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.CatchingFishCloudMessaging;
        int i7 = this.CatchingFishFragmentHandler;
        if (!context.isRestricted()) {
            try {
                Typeface CatchingFishPayPalService = catchingFishAsyncTaskDagger.CatchingFishPayPalService(i5, this.CatchingFishFragmentHandler, new CatchingFishContextMockk(this, i6, i7, new WeakReference(this.CatchingFishParcelableFAB)));
                if (CatchingFishPayPalService != null) {
                    if (i2 < 28 || this.CatchingFishCloudMessaging == -1) {
                        this.CatchingFishEspressoTesting = CatchingFishPayPalService;
                    } else {
                        this.CatchingFishEspressoTesting = CatchingFishMockkParcelable.CatchingFishParcelableFAB(Typeface.create(CatchingFishPayPalService, 0), this.CatchingFishCloudMessaging, (this.CatchingFishFragmentHandler & 2) != 0);
                    }
                }
                this.CatchingFishOkHttp = this.CatchingFishEspressoTesting == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.CatchingFishEspressoTesting != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.CatchingFishCloudMessaging == -1) {
            this.CatchingFishEspressoTesting = Typeface.create(string, this.CatchingFishFragmentHandler);
        } else {
            this.CatchingFishEspressoTesting = CatchingFishMockkParcelable.CatchingFishParcelableFAB(Typeface.create(string, 0), this.CatchingFishCloudMessaging, (this.CatchingFishFragmentHandler & 2) != 0);
        }
    }

    public final void CatchingFishParcelableFAB(Drawable drawable, CatchingFishFABDaggerHilt catchingFishFABDaggerHilt) {
        if (drawable == null || catchingFishFABDaggerHilt == null) {
            return;
        }
        CatchingFishPicassoMVPJUnit.CatchingFishDaggerWebsocket(drawable, catchingFishFABDaggerHilt, this.CatchingFishParcelableFAB.getDrawableState());
    }

    public final ColorStateList CatchingFishReduxKtor() {
        CatchingFishFABDaggerHilt catchingFishFABDaggerHilt = this.CatchingFishViewModelFAB;
        if (catchingFishFABDaggerHilt != null) {
            return (ColorStateList) catchingFishFABDaggerHilt.CatchingFishCoroutine;
        }
        return null;
    }

    public final void CatchingFishSnackbar() {
        CatchingFishFABDaggerHilt catchingFishFABDaggerHilt = this.CatchingFishSnackbar;
        TextView textView = this.CatchingFishParcelableFAB;
        if (catchingFishFABDaggerHilt != null || this.CatchingFishCoroutine != null || this.CatchingFishReduxKtor != null || this.CatchingFishDaggerWebsocket != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            CatchingFishParcelableFAB(compoundDrawables[0], this.CatchingFishSnackbar);
            CatchingFishParcelableFAB(compoundDrawables[1], this.CatchingFishCoroutine);
            CatchingFishParcelableFAB(compoundDrawables[2], this.CatchingFishReduxKtor);
            CatchingFishParcelableFAB(compoundDrawables[3], this.CatchingFishDaggerWebsocket);
        }
        if (this.CatchingFishWorkManager == null && this.CatchingFishViewModelScope == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        CatchingFishParcelableFAB(compoundDrawablesRelative[0], this.CatchingFishWorkManager);
        CatchingFishParcelableFAB(compoundDrawablesRelative[2], this.CatchingFishViewModelScope);
    }

    public final void CatchingFishViewModelFAB(int i, int i2, int i3, int i4) {
        CatchingFishHandlerIntent catchingFishHandlerIntent = this.CatchingFishLayout;
        if (catchingFishHandlerIntent.CatchingFishLayout()) {
            DisplayMetrics displayMetrics = catchingFishHandlerIntent.CatchingFishFragmentHandler.getResources().getDisplayMetrics();
            catchingFishHandlerIntent.CatchingFishFragmentHandler(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (catchingFishHandlerIntent.CatchingFishViewModelScope()) {
                catchingFishHandlerIntent.CatchingFishParcelableFAB();
            }
        }
    }

    public final void CatchingFishViewModelScope(Context context, int i) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, CatchingFishWidgetGlide.CatchingFishDaggerHiltFAB);
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = new CatchingFishAsyncTaskDagger(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.CatchingFishParcelableFAB;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        CatchingFishOkHttp(context, catchingFishAsyncTaskDagger);
        if (i2 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            CatchingFishLayoutLifecycle.CatchingFishReduxKtor(textView, string);
        }
        catchingFishAsyncTaskDagger.CatchingFishAnimation();
        Typeface typeface = this.CatchingFishEspressoTesting;
        if (typeface != null) {
            textView.setTypeface(typeface, this.CatchingFishFragmentHandler);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishWorkManager(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        int i2;
        float f;
        int i3;
        ColorStateList colorStateList;
        int resourceId;
        int i4;
        int resourceId2;
        TextView textView = this.CatchingFishParcelableFAB;
        Context context = textView.getContext();
        CatchingFishPicassoMVPJUnit CatchingFishParcelableFAB = CatchingFishPicassoMVPJUnit.CatchingFishParcelableFAB();
        int[] iArr = CatchingFishWidgetGlide.CatchingFishViewModelFAB;
        CatchingFishAsyncTaskDagger CatchingFishRecyclerView = CatchingFishAsyncTaskDagger.CatchingFishRecyclerView(context, attributeSet, iArr, i);
        CatchingFishFABCameraX.CatchingFishEspressoTesting(textView, textView.getContext(), iArr, attributeSet, (TypedArray) CatchingFishRecyclerView.CatchingFishDaggerWebsocket, i);
        TypedArray typedArray = (TypedArray) CatchingFishRecyclerView.CatchingFishDaggerWebsocket;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.CatchingFishSnackbar = CatchingFishCoroutine(context, CatchingFishParcelableFAB, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.CatchingFishCoroutine = CatchingFishCoroutine(context, CatchingFishParcelableFAB, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.CatchingFishReduxKtor = CatchingFishCoroutine(context, CatchingFishParcelableFAB, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.CatchingFishDaggerWebsocket = CatchingFishCoroutine(context, CatchingFishParcelableFAB, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.CatchingFishWorkManager = CatchingFishCoroutine(context, CatchingFishParcelableFAB, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.CatchingFishViewModelScope = CatchingFishCoroutine(context, CatchingFishParcelableFAB, typedArray.getResourceId(6, 0));
        }
        CatchingFishRecyclerView.CatchingFishAnimation();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = CatchingFishWidgetGlide.CatchingFishDaggerHiltFAB;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = new CatchingFishAsyncTaskDagger(context, obtainStyledAttributes);
            if (z3 || !obtainStyledAttributes.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z2 = obtainStyledAttributes.getBoolean(14, false);
                z = true;
            }
            CatchingFishOkHttp(context, catchingFishAsyncTaskDagger);
            int i5 = Build.VERSION.SDK_INT;
            str2 = obtainStyledAttributes.hasValue(15) ? obtainStyledAttributes.getString(15) : null;
            str = (i5 < 26 || !obtainStyledAttributes.hasValue(13)) ? null : obtainStyledAttributes.getString(13);
            catchingFishAsyncTaskDagger.CatchingFishAnimation();
        } else {
            z = false;
            z2 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger2 = new CatchingFishAsyncTaskDagger(context, obtainStyledAttributes2);
        if (!z3 && obtainStyledAttributes2.hasValue(14)) {
            z2 = obtainStyledAttributes2.getBoolean(14, false);
            z = true;
        }
        boolean z4 = z2;
        int i6 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        if (i6 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i6 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        CatchingFishOkHttp(context, catchingFishAsyncTaskDagger2);
        catchingFishAsyncTaskDagger2.CatchingFishAnimation();
        if (!z3 && z) {
            textView.setAllCaps(z4);
        }
        Typeface typeface = this.CatchingFishEspressoTesting;
        if (typeface != null) {
            if (this.CatchingFishCloudMessaging == -1) {
                textView.setTypeface(typeface, this.CatchingFishFragmentHandler);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            CatchingFishLayoutLifecycle.CatchingFishReduxKtor(textView, str);
        }
        if (str2 != null) {
            CatchingFishSharedFlowRoom.CatchingFishSnackbar(textView, CatchingFishSharedFlowRoom.CatchingFishParcelableFAB(str2));
        }
        CatchingFishHandlerIntent catchingFishHandlerIntent = this.CatchingFishLayout;
        Context context2 = catchingFishHandlerIntent.CatchingFishFragmentHandler;
        int[] iArr3 = CatchingFishWidgetGlide.CatchingFishLayout;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = catchingFishHandlerIntent.CatchingFishLayout;
        CatchingFishFABCameraX.CatchingFishEspressoTesting(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i);
        if (obtainStyledAttributes3.hasValue(5)) {
            catchingFishHandlerIntent.CatchingFishParcelableFAB = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes3.hasValue(1) ? obtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i7 = 0; i7 < length; i7++) {
                    iArr4[i7] = obtainTypedArray.getDimensionPixelSize(i7, -1);
                }
                catchingFishHandlerIntent.CatchingFishWorkManager = CatchingFishHandlerIntent.CatchingFishSnackbar(iArr4);
                catchingFishHandlerIntent.CatchingFishViewModelFAB();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (!catchingFishHandlerIntent.CatchingFishLayout()) {
            catchingFishHandlerIntent.CatchingFishParcelableFAB = 0;
        } else if (catchingFishHandlerIntent.CatchingFishParcelableFAB == 1) {
            if (!catchingFishHandlerIntent.CatchingFishViewModelScope) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i4 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i4 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i4, 112.0f, displayMetrics);
                }
                float f2 = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                catchingFishHandlerIntent.CatchingFishFragmentHandler(dimension2, f2, dimension);
            }
            catchingFishHandlerIntent.CatchingFishViewModelScope();
        }
        if (CatchingFishMVVMGraphQL.CatchingFishCoroutine && catchingFishHandlerIntent.CatchingFishParcelableFAB != 0) {
            int[] iArr5 = catchingFishHandlerIntent.CatchingFishWorkManager;
            if (iArr5.length > 0) {
                if (CatchingFishLayoutLifecycle.CatchingFishParcelableFAB(textView) != -1.0f) {
                    CatchingFishLayoutLifecycle.CatchingFishSnackbar(textView, Math.round(catchingFishHandlerIntent.CatchingFishReduxKtor), Math.round(catchingFishHandlerIntent.CatchingFishDaggerWebsocket), Math.round(catchingFishHandlerIntent.CatchingFishCoroutine), 0);
                } else {
                    CatchingFishLayoutLifecycle.CatchingFishCoroutine(textView, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable CatchingFishSnackbar = resourceId4 != -1 ? CatchingFishParcelableFAB.CatchingFishSnackbar(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable CatchingFishSnackbar2 = resourceId5 != -1 ? CatchingFishParcelableFAB.CatchingFishSnackbar(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable CatchingFishSnackbar3 = resourceId6 != -1 ? CatchingFishParcelableFAB.CatchingFishSnackbar(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable CatchingFishSnackbar4 = resourceId7 != -1 ? CatchingFishParcelableFAB.CatchingFishSnackbar(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable CatchingFishSnackbar5 = resourceId8 != -1 ? CatchingFishParcelableFAB.CatchingFishSnackbar(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable CatchingFishSnackbar6 = resourceId9 != -1 ? CatchingFishParcelableFAB.CatchingFishSnackbar(context, resourceId9) : null;
        if (CatchingFishSnackbar5 != null || CatchingFishSnackbar6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (CatchingFishSnackbar5 == null) {
                CatchingFishSnackbar5 = compoundDrawablesRelative[0];
            }
            if (CatchingFishSnackbar2 == null) {
                CatchingFishSnackbar2 = compoundDrawablesRelative[1];
            }
            if (CatchingFishSnackbar6 == null) {
                CatchingFishSnackbar6 = compoundDrawablesRelative[2];
            }
            if (CatchingFishSnackbar4 == null) {
                CatchingFishSnackbar4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(CatchingFishSnackbar5, CatchingFishSnackbar2, CatchingFishSnackbar6, CatchingFishSnackbar4);
        } else if (CatchingFishSnackbar != null || CatchingFishSnackbar2 != null || CatchingFishSnackbar3 != null || CatchingFishSnackbar4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (CatchingFishSnackbar == null) {
                    CatchingFishSnackbar = compoundDrawables[0];
                }
                if (CatchingFishSnackbar2 == null) {
                    CatchingFishSnackbar2 = compoundDrawables[1];
                }
                if (CatchingFishSnackbar3 == null) {
                    CatchingFishSnackbar3 = compoundDrawables[2];
                }
                if (CatchingFishSnackbar4 == null) {
                    CatchingFishSnackbar4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(CatchingFishSnackbar, CatchingFishSnackbar2, CatchingFishSnackbar3, CatchingFishSnackbar4);
            } else {
                if (CatchingFishSnackbar2 == null) {
                    CatchingFishSnackbar2 = compoundDrawablesRelative2[1];
                }
                if (CatchingFishSnackbar4 == null) {
                    CatchingFishSnackbar4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, CatchingFishSnackbar2, compoundDrawablesRelative2[2], CatchingFishSnackbar4);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = CatchingFishGsonCardView.CatchingFishSpannableWidget(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(CatchingFishRealmPicasso.CatchingFishSnackbar(obtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (obtainStyledAttributes4.hasValue(19)) {
            TypedValue peekValue = obtainStyledAttributes4.peekValue(19);
            if (peekValue != null && peekValue.type == 5) {
                int i8 = peekValue.data;
                int i9 = i8 & 15;
                f = TypedValue.complexToFloat(i8);
                i3 = i9;
                i2 = -1;
                obtainStyledAttributes4.recycle();
                if (dimensionPixelSize != i2) {
                    CatchingFishHiltMVPToast.CatchingFishPayPalService(textView, dimensionPixelSize);
                }
                if (dimensionPixelSize2 != i2) {
                    CatchingFishHiltMVPToast.CatchingFishSensorManager(textView, dimensionPixelSize2);
                }
                if (f == -1.0f) {
                    if (i3 == i2) {
                        CatchingFishHiltMVPToast.CatchingFishEspressoMockk(textView, (int) f);
                        return;
                    } else if (Build.VERSION.SDK_INT >= 34) {
                        CatchingFishDataStore.CatchingFishCloudMessaging(textView, i3, f);
                        return;
                    } else {
                        CatchingFishHiltMVPToast.CatchingFishEspressoMockk(textView, Math.round(TypedValue.applyDimension(i3, f, textView.getResources().getDisplayMetrics())));
                        return;
                    }
                }
                return;
            }
            i2 = -1;
            f = obtainStyledAttributes4.getDimensionPixelSize(19, -1);
        } else {
            i2 = -1;
            f = -1.0f;
        }
        i3 = i2;
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i2) {
        }
        if (dimensionPixelSize2 != i2) {
        }
        if (f == -1.0f) {
        }
    }
}
