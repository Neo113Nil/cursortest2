package kotlin.text;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class CatchingFishDataStoreBundle extends TextView {
    public final CatchingFishGradleJUnit CatchingFishDaggerWebsocket;
    public Future CatchingFishFragmentHandler;
    public CatchingFishServiceHilt CatchingFishLayout;
    public final CatchingFishPicassoJUnit CatchingFishReduxKtor;
    public boolean CatchingFishViewModelFAB;
    public CatchingFishToastAnimation CatchingFishViewModelScope;
    public final CatchingFishBundleGlide CatchingFishWorkManager;

    public CatchingFishDataStoreBundle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private CatchingFishToastAnimation getEmojiTextViewHelper() {
        if (this.CatchingFishViewModelScope == null) {
            this.CatchingFishViewModelScope = new CatchingFishToastAnimation(this);
        }
        return this.CatchingFishViewModelScope;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishReduxKtor;
        if (catchingFishPicassoJUnit != null) {
            catchingFishPicassoJUnit.CatchingFishParcelableFAB();
        }
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishGradleJUnit != null) {
            catchingFishGradleJUnit.CatchingFishSnackbar();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (CatchingFishMVVMGraphQL.CatchingFishCoroutine) {
            return super.getAutoSizeMaxTextSize();
        }
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishGradleJUnit != null) {
            return Math.round(catchingFishGradleJUnit.CatchingFishLayout.CatchingFishDaggerWebsocket);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (CatchingFishMVVMGraphQL.CatchingFishCoroutine) {
            return super.getAutoSizeMinTextSize();
        }
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishGradleJUnit != null) {
            return Math.round(catchingFishGradleJUnit.CatchingFishLayout.CatchingFishReduxKtor);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (CatchingFishMVVMGraphQL.CatchingFishCoroutine) {
            return super.getAutoSizeStepGranularity();
        }
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishGradleJUnit != null) {
            return Math.round(catchingFishGradleJUnit.CatchingFishLayout.CatchingFishCoroutine);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (CatchingFishMVVMGraphQL.CatchingFishCoroutine) {
            return super.getAutoSizeTextAvailableSizes();
        }
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        return catchingFishGradleJUnit != null ? catchingFishGradleJUnit.CatchingFishLayout.CatchingFishWorkManager : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (CatchingFishMVVMGraphQL.CatchingFishCoroutine) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishGradleJUnit != null) {
            return catchingFishGradleJUnit.CatchingFishLayout.CatchingFishParcelableFAB;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return CatchingFishHiltMVPToast.CatchingFishRecyclerView(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public CatchingFishNavigationGson getSuperCaller() {
        if (this.CatchingFishLayout == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.CatchingFishLayout = new CatchingFishMVIToolbar(this);
            } else if (i >= 28) {
                this.CatchingFishLayout = new CatchingFishCameraXFragment(this);
            } else if (i >= 26) {
                this.CatchingFishLayout = new CatchingFishServiceHilt(14, this);
            }
        }
        return this.CatchingFishLayout;
    }

    public ColorStateList getSupportBackgroundTintList() {
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishReduxKtor;
        if (catchingFishPicassoJUnit != null) {
            return catchingFishPicassoJUnit.CatchingFishSnackbar();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishReduxKtor;
        if (catchingFishPicassoJUnit != null) {
            return catchingFishPicassoJUnit.CatchingFishCoroutine();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.CatchingFishDaggerWebsocket.CatchingFishReduxKtor();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.CatchingFishFragmentHandler;
        if (future != null) {
            try {
                this.CatchingFishFragmentHandler = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                CatchingFishHiltMVPToast.CatchingFishDaggerHiltFAB(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        CatchingFishBundleGlide catchingFishBundleGlide;
        if (Build.VERSION.SDK_INT >= 28 || (catchingFishBundleGlide = this.CatchingFishWorkManager) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) catchingFishBundleGlide.CatchingFishWorkManager;
        return textClassifier == null ? CatchingFishReduxStripeAPI.CatchingFishParcelableFAB((TextView) catchingFishBundleGlide.CatchingFishDaggerWebsocket) : textClassifier;
    }

    public CatchingFishBiometricMVI getTextMetricsParamsCompat() {
        return CatchingFishHiltMVPToast.CatchingFishDaggerHiltFAB(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.CatchingFishDaggerWebsocket.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && onCreateInputConnection != null) {
            CharSequence text = getText();
            if (i >= 30) {
                CatchingFishJUnitIntent.CatchingFishLayout(editorInfo, text);
            } else {
                text.getClass();
                if (i >= 30) {
                    CatchingFishJUnitIntent.CatchingFishLayout(editorInfo, text);
                } else {
                    int i2 = editorInfo.initialSelStart;
                    int i3 = editorInfo.initialSelEnd;
                    int i4 = i2 > i3 ? i3 : i2;
                    if (i2 <= i3) {
                        i2 = i3;
                    }
                    int length = text.length();
                    if (i4 < 0 || i2 > length) {
                        CatchingFishRobolectricHilt.CatchingFishParcelable(editorInfo, null, 0, 0);
                    } else {
                        int i5 = editorInfo.inputType & 4095;
                        if (i5 == 129 || i5 == 225 || i5 == 18) {
                            CatchingFishRobolectricHilt.CatchingFishParcelable(editorInfo, null, 0, 0);
                        } else if (length <= 2048) {
                            CatchingFishRobolectricHilt.CatchingFishParcelable(editorInfo, text, i4, i2);
                        } else {
                            int i6 = i2 - i4;
                            int i7 = i6 > 1024 ? 0 : i6;
                            int i8 = 2048 - i7;
                            int min = Math.min(text.length() - i2, i8 - Math.min(i4, (int) (i8 * 0.8d)));
                            int min2 = Math.min(i4, i8 - min);
                            int i9 = i4 - min2;
                            if (Character.isLowSurrogate(text.charAt(i9))) {
                                i9++;
                                min2--;
                            }
                            if (Character.isHighSurrogate(text.charAt((i2 + min) - 1))) {
                                min--;
                            }
                            int i10 = min2 + i7;
                            CatchingFishRobolectricHilt.CatchingFishParcelable(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + min2), text.subSequence(i2, min + i2)) : text.subSequence(i9, i10 + min + i9), min2, i10);
                        }
                    }
                }
            }
        }
        CatchingFishFirebaseDagger.CatchingFishHandler(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishGradleJUnit == null || CatchingFishMVVMGraphQL.CatchingFishCoroutine) {
            return;
        }
        catchingFishGradleJUnit.CatchingFishLayout.CatchingFishParcelableFAB();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.CatchingFishFragmentHandler;
        if (future != null) {
            try {
                this.CatchingFishFragmentHandler = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                CatchingFishHiltMVPToast.CatchingFishDaggerHiltFAB(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishGradleJUnit != null) {
            CatchingFishHandlerIntent catchingFishHandlerIntent = catchingFishGradleJUnit.CatchingFishLayout;
            if (CatchingFishMVVMGraphQL.CatchingFishCoroutine || !catchingFishHandlerIntent.CatchingFishDaggerWebsocket()) {
                return;
            }
            catchingFishHandlerIntent.CatchingFishParcelableFAB();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().CatchingFishSnackbar(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (CatchingFishMVVMGraphQL.CatchingFishCoroutine) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishGradleJUnit != null) {
            catchingFishGradleJUnit.CatchingFishViewModelFAB(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (CatchingFishMVVMGraphQL.CatchingFishCoroutine) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishGradleJUnit != null) {
            catchingFishGradleJUnit.CatchingFishLayout(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (CatchingFishMVVMGraphQL.CatchingFishCoroutine) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishGradleJUnit != null) {
            catchingFishGradleJUnit.CatchingFishFragmentHandler(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishReduxKtor;
        if (catchingFishPicassoJUnit != null) {
            catchingFishPicassoJUnit.CatchingFishDaggerWebsocket();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishReduxKtor;
        if (catchingFishPicassoJUnit != null) {
            catchingFishPicassoJUnit.CatchingFishWorkManager(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishGradleJUnit != null) {
            catchingFishGradleJUnit.CatchingFishSnackbar();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishGradleJUnit != null) {
            catchingFishGradleJUnit.CatchingFishSnackbar();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishGradleJUnit != null) {
            catchingFishGradleJUnit.CatchingFishSnackbar();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishGradleJUnit != null) {
            catchingFishGradleJUnit.CatchingFishSnackbar();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(CatchingFishHiltMVPToast.CatchingFishDataStoreIntent(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().CatchingFishCoroutine(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((CatchingFishFirebaseDagger) getEmojiTextViewHelper().CatchingFishSnackbar.CatchingFishDaggerWebsocket).CatchingFishMVPRobolectric(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().CatchingFishEspressoTesting(i);
        } else {
            CatchingFishHiltMVPToast.CatchingFishPayPalService(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().CatchingFishDaggerWebsocket(i);
        } else {
            CatchingFishHiltMVPToast.CatchingFishSensorManager(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        CatchingFishHiltMVPToast.CatchingFishEspressoMockk(this, i);
    }

    public void setPrecomputedText(CatchingFishHandlerToast catchingFishHandlerToast) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        CatchingFishHiltMVPToast.CatchingFishDaggerHiltFAB(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishReduxKtor;
        if (catchingFishPicassoJUnit != null) {
            catchingFishPicassoJUnit.CatchingFishViewModelFAB(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishReduxKtor;
        if (catchingFishPicassoJUnit != null) {
            catchingFishPicassoJUnit.CatchingFishLayout(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        catchingFishGradleJUnit.CatchingFishCloudMessaging(colorStateList);
        catchingFishGradleJUnit.CatchingFishSnackbar();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        catchingFishGradleJUnit.CatchingFishEspressoTesting(mode);
        catchingFishGradleJUnit.CatchingFishSnackbar();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishGradleJUnit != null) {
            catchingFishGradleJUnit.CatchingFishViewModelScope(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        CatchingFishBundleGlide catchingFishBundleGlide;
        if (Build.VERSION.SDK_INT >= 28 || (catchingFishBundleGlide = this.CatchingFishWorkManager) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            catchingFishBundleGlide.CatchingFishWorkManager = textClassifier;
        }
    }

    public void setTextFuture(Future<CatchingFishHandlerToast> future) {
        this.CatchingFishFragmentHandler = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(CatchingFishBiometricMVI catchingFishBiometricMVI) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = catchingFishBiometricMVI.CatchingFishSnackbar;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(catchingFishBiometricMVI.CatchingFishParcelableFAB);
        setBreakStrategy(catchingFishBiometricMVI.CatchingFishCoroutine);
        setHyphenationFrequency(catchingFishBiometricMVI.CatchingFishReduxKtor);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = CatchingFishMVVMGraphQL.CatchingFishCoroutine;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishGradleJUnit != null) {
            CatchingFishHandlerIntent catchingFishHandlerIntent = catchingFishGradleJUnit.CatchingFishLayout;
            if (z || catchingFishHandlerIntent.CatchingFishDaggerWebsocket()) {
                return;
            }
            catchingFishHandlerIntent.CatchingFishWorkManager(i, f);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.CatchingFishViewModelFAB) {
            return;
        }
        if (typeface == null || i <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            CatchingFishDaggerBiometric catchingFishDaggerBiometric = CatchingFishGraphQLAdMob.CatchingFishParcelableFAB;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i);
        }
        this.CatchingFishViewModelFAB = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.CatchingFishViewModelFAB = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishDataStoreBundle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        CatchingFishKtorKtorView.CatchingFishParcelableFAB(context);
        this.CatchingFishViewModelFAB = false;
        this.CatchingFishLayout = null;
        CatchingFishKtorWorkManager.CatchingFishParcelableFAB(this, getContext());
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = new CatchingFishPicassoJUnit(this);
        this.CatchingFishReduxKtor = catchingFishPicassoJUnit;
        catchingFishPicassoJUnit.CatchingFishReduxKtor(attributeSet, i);
        CatchingFishGradleJUnit catchingFishGradleJUnit = new CatchingFishGradleJUnit(this);
        this.CatchingFishDaggerWebsocket = catchingFishGradleJUnit;
        catchingFishGradleJUnit.CatchingFishWorkManager(attributeSet, i);
        catchingFishGradleJUnit.CatchingFishSnackbar();
        CatchingFishBundleGlide catchingFishBundleGlide = new CatchingFishBundleGlide(9, false);
        catchingFishBundleGlide.CatchingFishDaggerWebsocket = this;
        this.CatchingFishWorkManager = catchingFishBundleGlide;
        getEmojiTextViewHelper().CatchingFishParcelableFAB(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().CatchingFishAnimationMockk(i, f);
        } else if (i2 >= 34) {
            CatchingFishDataStore.CatchingFishCloudMessaging(this, i, f);
        } else {
            CatchingFishHiltMVPToast.CatchingFishEspressoMockk(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? CatchingFishLayoutRoomFAB.CatchingFishCustomView(context, i) : null, i2 != 0 ? CatchingFishLayoutRoomFAB.CatchingFishCustomView(context, i2) : null, i3 != 0 ? CatchingFishLayoutRoomFAB.CatchingFishCustomView(context, i3) : null, i4 != 0 ? CatchingFishLayoutRoomFAB.CatchingFishCustomView(context, i4) : null);
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishGradleJUnit != null) {
            catchingFishGradleJUnit.CatchingFishSnackbar();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? CatchingFishLayoutRoomFAB.CatchingFishCustomView(context, i) : null, i2 != 0 ? CatchingFishLayoutRoomFAB.CatchingFishCustomView(context, i2) : null, i3 != 0 ? CatchingFishLayoutRoomFAB.CatchingFishCustomView(context, i3) : null, i4 != 0 ? CatchingFishLayoutRoomFAB.CatchingFishCustomView(context, i4) : null);
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishGradleJUnit != null) {
            catchingFishGradleJUnit.CatchingFishSnackbar();
        }
    }
}
