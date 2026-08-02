package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.appcompat.R$styleable;
import androidx.biometric.BiometricFragment;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.util.TypedValueCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat$Api28Impl;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.wire.GrpcMethod;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class AppCompatTextHelper {
    public boolean mAsyncFontPending;
    public final AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper;
    public TintInfo mDrawableBottomTint;
    public TintInfo mDrawableEndTint;
    public TintInfo mDrawableLeftTint;
    public TintInfo mDrawableRightTint;
    public TintInfo mDrawableStartTint;
    public TintInfo mDrawableTint;
    public TintInfo mDrawableTopTint;
    public Typeface mFontTypeface;
    public final TextView mView;
    public int mStyle = 0;
    public int mFontWeight = -1;

    /* loaded from: classes3.dex */
    public abstract class Api24Impl {
        public static LocaleList forLanguageTags(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void setTextLocales(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* loaded from: classes3.dex */
    public abstract class Api26Impl {
        public static int getAutoSizeStepGranularity(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static void setAutoSizeTextTypeUniformWithConfiguration(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        public static void setAutoSizeTextTypeUniformWithPresetSizes(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        public static boolean setFontVariationSettings(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* loaded from: classes3.dex */
    public abstract class Api28Impl {
        public static Typeface create(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    public AppCompatTextHelper(TextView textView) {
        this.mView = textView;
        this.mAutoSizeTextHelper = new AppCompatTextViewAutoSizeHelper(textView);
    }

    public static TintInfo createTintInfo(Context context, AppCompatDrawableManager appCompatDrawableManager, int i) {
        ColorStateList tintList;
        synchronized (appCompatDrawableManager) {
            tintList = appCompatDrawableManager.mResourceManager.getTintList(context, i);
        }
        if (tintList == null) {
            return null;
        }
        TintInfo tintInfo = new TintInfo();
        tintInfo.mHasTintList = true;
        tintInfo.mTintList = tintList;
        return tintInfo;
    }

    public final void applyCompoundDrawableTint(Drawable drawable, TintInfo tintInfo) {
        if (drawable == null || tintInfo == null) {
            return;
        }
        AppCompatDrawableManager.tintDrawable(drawable, tintInfo, this.mView.getDrawableState());
    }

    public final void applyCompoundDrawablesTints() {
        TintInfo tintInfo = this.mDrawableLeftTint;
        TextView textView = this.mView;
        if (tintInfo != null || this.mDrawableTopTint != null || this.mDrawableRightTint != null || this.mDrawableBottomTint != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            applyCompoundDrawableTint(compoundDrawables[0], this.mDrawableLeftTint);
            applyCompoundDrawableTint(compoundDrawables[1], this.mDrawableTopTint);
            applyCompoundDrawableTint(compoundDrawables[2], this.mDrawableRightTint);
            applyCompoundDrawableTint(compoundDrawables[3], this.mDrawableBottomTint);
        }
        if (this.mDrawableStartTint == null && this.mDrawableEndTint == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        applyCompoundDrawableTint(compoundDrawablesRelative[0], this.mDrawableStartTint);
        applyCompoundDrawableTint(compoundDrawablesRelative[2], this.mDrawableEndTint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:192:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void loadFromAttributes(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        int i2;
        float f;
        int i3;
        ColorStateList colorStateList;
        int resourceId;
        int resourceId2;
        TextView textView = this.mView;
        Context context = textView.getContext();
        AppCompatDrawableManager appCompatDrawableManager = AppCompatDrawableManager.get();
        int[] iArr = R$styleable.AppCompatTextHelper;
        GrpcMethod obtainStyledAttributes = GrpcMethod.obtainStyledAttributes(i, 0, context, attributeSet, iArr);
        Context context2 = textView.getContext();
        TypedArray typedArray = (TypedArray) obtainStyledAttributes.requestAdapter;
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api29Impl.saveAttributeDataForStyleable(textView, context2, iArr, attributeSet, typedArray, i, 0);
        TypedArray typedArray2 = (TypedArray) obtainStyledAttributes.requestAdapter;
        int resourceId3 = typedArray2.getResourceId(0, -1);
        if (typedArray2.hasValue(3)) {
            this.mDrawableLeftTint = createTintInfo(context, appCompatDrawableManager, typedArray2.getResourceId(3, 0));
        }
        if (typedArray2.hasValue(1)) {
            this.mDrawableTopTint = createTintInfo(context, appCompatDrawableManager, typedArray2.getResourceId(1, 0));
        }
        if (typedArray2.hasValue(4)) {
            this.mDrawableRightTint = createTintInfo(context, appCompatDrawableManager, typedArray2.getResourceId(4, 0));
        }
        if (typedArray2.hasValue(2)) {
            this.mDrawableBottomTint = createTintInfo(context, appCompatDrawableManager, typedArray2.getResourceId(2, 0));
        }
        if (typedArray2.hasValue(5)) {
            this.mDrawableStartTint = createTintInfo(context, appCompatDrawableManager, typedArray2.getResourceId(5, 0));
        }
        if (typedArray2.hasValue(6)) {
            this.mDrawableEndTint = createTintInfo(context, appCompatDrawableManager, typedArray2.getResourceId(6, 0));
        }
        obtainStyledAttributes.recycle();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = R$styleable.TextAppearance;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId3, iArr2);
            GrpcMethod grpcMethod = new GrpcMethod(context, obtainStyledAttributes2);
            if (z3 || !obtainStyledAttributes2.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z2 = obtainStyledAttributes2.getBoolean(14, false);
                z = true;
            }
            updateTypefaceAndStyle(context, grpcMethod);
            str2 = obtainStyledAttributes2.hasValue(15) ? obtainStyledAttributes2.getString(15) : null;
            str = obtainStyledAttributes2.hasValue(13) ? obtainStyledAttributes2.getString(13) : null;
            grpcMethod.recycle();
        } else {
            z = false;
            z2 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        GrpcMethod grpcMethod2 = new GrpcMethod(context, obtainStyledAttributes3);
        if (!z3 && obtainStyledAttributes3.hasValue(14)) {
            z2 = obtainStyledAttributes3.getBoolean(14, false);
            z = true;
        }
        boolean z4 = z2;
        if (obtainStyledAttributes3.hasValue(15)) {
            str2 = obtainStyledAttributes3.getString(15);
        }
        if (obtainStyledAttributes3.hasValue(13)) {
            str = obtainStyledAttributes3.getString(13);
        }
        if (obtainStyledAttributes3.hasValue(0) && obtainStyledAttributes3.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, RecyclerView.DECELERATION_RATE);
        }
        updateTypefaceAndStyle(context, grpcMethod2);
        grpcMethod2.recycle();
        if (!z3 && z) {
            textView.setAllCaps(z4);
        }
        Typeface typeface = this.mFontTypeface;
        if (typeface != null) {
            if (this.mFontWeight == -1) {
                textView.setTypeface(typeface, this.mStyle);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            Api26Impl.setFontVariationSettings(textView, str);
        }
        if (str2 != null) {
            Api24Impl.setTextLocales(textView, Api24Impl.forLanguageTags(str2));
        }
        AppCompatTextViewAutoSizeHelper appCompatTextViewAutoSizeHelper = this.mAutoSizeTextHelper;
        Context context3 = appCompatTextViewAutoSizeHelper.mContext;
        int[] iArr3 = R$styleable.AppCompatTextView;
        TypedArray obtainStyledAttributes4 = context3.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = appCompatTextViewAutoSizeHelper.mTextView;
        ViewCompat.Api29Impl.saveAttributeDataForStyleable(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes4, i, 0);
        if (obtainStyledAttributes4.hasValue(5)) {
            appCompatTextViewAutoSizeHelper.mAutoSizeTextType = obtainStyledAttributes4.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes4.hasValue(4) ? obtainStyledAttributes4.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes4.hasValue(2) ? obtainStyledAttributes4.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes4.hasValue(1) ? obtainStyledAttributes4.getDimension(1, -1.0f) : -1.0f;
        if (!obtainStyledAttributes4.hasValue(3) || (resourceId2 = obtainStyledAttributes4.getResourceId(3, 0)) <= 0) {
            i2 = 0;
        } else {
            TypedArray obtainTypedArray = obtainStyledAttributes4.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                i2 = 0;
                for (int i4 = 0; i4 < length; i4++) {
                    iArr4[i4] = obtainTypedArray.getDimensionPixelSize(i4, -1);
                }
                int[] cleanupAutoSizePresetSizes = AppCompatTextViewAutoSizeHelper.cleanupAutoSizePresetSizes(iArr4);
                appCompatTextViewAutoSizeHelper.mAutoSizeTextSizesInPx = cleanupAutoSizePresetSizes;
                boolean z5 = cleanupAutoSizePresetSizes.length > 0;
                appCompatTextViewAutoSizeHelper.mHasPresetAutoSizeValues = z5;
                if (z5) {
                    appCompatTextViewAutoSizeHelper.mAutoSizeTextType = 1;
                    appCompatTextViewAutoSizeHelper.mAutoSizeMinTextSizeInPx = cleanupAutoSizePresetSizes[0];
                    appCompatTextViewAutoSizeHelper.mAutoSizeMaxTextSizeInPx = cleanupAutoSizePresetSizes[r13 - 1];
                    appCompatTextViewAutoSizeHelper.mAutoSizeStepGranularityInPx = -1.0f;
                }
            } else {
                i2 = 0;
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes4.recycle();
        if (!appCompatTextViewAutoSizeHelper.supportsAutoSizeText()) {
            appCompatTextViewAutoSizeHelper.mAutoSizeTextType = i2;
        } else if (appCompatTextViewAutoSizeHelper.mAutoSizeTextType == 1) {
            if (!appCompatTextViewAutoSizeHelper.mHasPresetAutoSizeValues) {
                DisplayMetrics displayMetrics = context3.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                float f2 = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                if (dimension2 <= RecyclerView.DECELERATION_RATE) {
                    a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(dimension2, "Minimum auto-size text size (", "px) is less or equal to (0px)"));
                    return;
                }
                if (f2 <= dimension2) {
                    Drop$$ExternalSyntheticBUOutline0.m("Maximum auto-size text size (", f2, "px) is less or equal to minimum auto-size text size (", dimension2, "px)");
                    return;
                }
                if (dimension <= RecyclerView.DECELERATION_RATE) {
                    a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(dimension, "The auto-size step granularity (", "px) is less or equal to (0px)"));
                    return;
                }
                appCompatTextViewAutoSizeHelper.mAutoSizeTextType = 1;
                appCompatTextViewAutoSizeHelper.mAutoSizeMinTextSizeInPx = dimension2;
                appCompatTextViewAutoSizeHelper.mAutoSizeMaxTextSizeInPx = f2;
                appCompatTextViewAutoSizeHelper.mAutoSizeStepGranularityInPx = dimension;
                appCompatTextViewAutoSizeHelper.mHasPresetAutoSizeValues = i2;
            }
            if (appCompatTextViewAutoSizeHelper.supportsAutoSizeText() && appCompatTextViewAutoSizeHelper.mAutoSizeTextType == 1 && (!appCompatTextViewAutoSizeHelper.mHasPresetAutoSizeValues || appCompatTextViewAutoSizeHelper.mAutoSizeTextSizesInPx.length == 0)) {
                int floor = ((int) Math.floor((appCompatTextViewAutoSizeHelper.mAutoSizeMaxTextSizeInPx - appCompatTextViewAutoSizeHelper.mAutoSizeMinTextSizeInPx) / appCompatTextViewAutoSizeHelper.mAutoSizeStepGranularityInPx)) + 1;
                int[] iArr5 = new int[floor];
                for (int i5 = 0; i5 < floor; i5++) {
                    iArr5[i5] = Math.round((i5 * appCompatTextViewAutoSizeHelper.mAutoSizeStepGranularityInPx) + appCompatTextViewAutoSizeHelper.mAutoSizeMinTextSizeInPx);
                }
                appCompatTextViewAutoSizeHelper.mAutoSizeTextSizesInPx = AppCompatTextViewAutoSizeHelper.cleanupAutoSizePresetSizes(iArr5);
            }
        }
        if (appCompatTextViewAutoSizeHelper.mAutoSizeTextType != 0) {
            int[] iArr6 = appCompatTextViewAutoSizeHelper.mAutoSizeTextSizesInPx;
            if (iArr6.length > 0) {
                if (Api26Impl.getAutoSizeStepGranularity(textView) != -1.0f) {
                    Api26Impl.setAutoSizeTextTypeUniformWithConfiguration(textView, Math.round(appCompatTextViewAutoSizeHelper.mAutoSizeMinTextSizeInPx), Math.round(appCompatTextViewAutoSizeHelper.mAutoSizeMaxTextSizeInPx), Math.round(appCompatTextViewAutoSizeHelper.mAutoSizeStepGranularityInPx), 0);
                } else {
                    Api26Impl.setAutoSizeTextTypeUniformWithPresetSizes(textView, iArr6, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes5 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = obtainStyledAttributes5.getResourceId(8, -1);
        Drawable drawable = resourceId4 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes5.getResourceId(13, -1);
        Drawable drawable2 = resourceId5 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes5.getResourceId(9, -1);
        Drawable drawable3 = resourceId6 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes5.getResourceId(6, -1);
        Drawable drawable4 = resourceId7 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes5.getResourceId(10, -1);
        Drawable drawable5 = resourceId8 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes5.getResourceId(7, -1);
        Drawable drawable6 = resourceId9 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId9) : null;
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable7 = compoundDrawablesRelative2[0];
            if (drawable7 == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawable == null) {
                    drawable = compoundDrawables[0];
                }
                if (drawable2 == null) {
                    drawable2 = compoundDrawables[1];
                }
                if (drawable3 == null) {
                    drawable3 = compoundDrawables[2];
                }
                if (drawable4 == null) {
                    drawable4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            } else {
                if (drawable2 == null) {
                    drawable2 = compoundDrawablesRelative2[1];
                }
                if (drawable4 == null) {
                    drawable4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            }
        }
        if (obtainStyledAttributes5.hasValue(11)) {
            if (!obtainStyledAttributes5.hasValue(11) || (resourceId = obtainStyledAttributes5.getResourceId(11, 0)) == 0 || (colorStateList = ResourcesCompat.getColorStateList(context.getResources(), resourceId, context.getTheme())) == null) {
                colorStateList = obtainStyledAttributes5.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (obtainStyledAttributes5.hasValue(12)) {
            textView.setCompoundDrawableTintMode(DrawableUtils.parseTintMode(obtainStyledAttributes5.getInt(12, -1), null));
        }
        int dimensionPixelSize = obtainStyledAttributes5.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = obtainStyledAttributes5.getDimensionPixelSize(18, -1);
        if (obtainStyledAttributes5.hasValue(19)) {
            TypedValue peekValue = obtainStyledAttributes5.peekValue(19);
            if (peekValue != null && peekValue.type == 5) {
                i3 = TypedValueCompat.getUnitFromComplexDimension(peekValue.data);
                f = TypedValue.complexToFloat(peekValue.data);
                obtainStyledAttributes5.recycle();
                if (dimensionPixelSize != -1) {
                    TransactorKt.checkArgumentNonnegative(dimensionPixelSize);
                    TextViewCompat$Api28Impl.setFirstBaselineToTopHeight(textView, dimensionPixelSize);
                }
                if (dimensionPixelSize2 != -1) {
                    TransactorKt.checkArgumentNonnegative(dimensionPixelSize2);
                    Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
                    int i6 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
                    if (dimensionPixelSize2 > Math.abs(i6)) {
                        textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), dimensionPixelSize2 - i6);
                    }
                }
                if (f == -1.0f) {
                    if (i3 == -1) {
                        PlatformKt.setLineHeight(textView, (int) f);
                        return;
                    } else if (Build.VERSION.SDK_INT >= 34) {
                        PlayerView.Api34.setLineHeight(textView, i3, f);
                        return;
                    } else {
                        PlatformKt.setLineHeight(textView, Math.round(TypedValue.applyDimension(i3, f, textView.getResources().getDisplayMetrics())));
                        return;
                    }
                }
                return;
            }
            f = obtainStyledAttributes5.getDimensionPixelSize(19, -1);
        } else {
            f = -1.0f;
        }
        i3 = -1;
        obtainStyledAttributes5.recycle();
        if (dimensionPixelSize != -1) {
        }
        if (dimensionPixelSize2 != -1) {
        }
        if (f == -1.0f) {
        }
    }

    public final void onSetTextAppearance(Context context, int i) {
        String string2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, R$styleable.TextAppearance);
        GrpcMethod grpcMethod = new GrpcMethod(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.mView;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, RecyclerView.DECELERATION_RATE);
        }
        updateTypefaceAndStyle(context, grpcMethod);
        if (obtainStyledAttributes.hasValue(13) && (string2 = obtainStyledAttributes.getString(13)) != null) {
            Api26Impl.setFontVariationSettings(textView, string2);
        }
        grpcMethod.recycle();
        Typeface typeface = this.mFontTypeface;
        if (typeface != null) {
            textView.setTypeface(typeface, this.mStyle);
        }
    }

    public final void setCompoundDrawableTintList(ColorStateList colorStateList) {
        if (this.mDrawableTint == null) {
            this.mDrawableTint = new TintInfo();
        }
        TintInfo tintInfo = this.mDrawableTint;
        tintInfo.mTintList = colorStateList;
        tintInfo.mHasTintList = colorStateList != null;
        this.mDrawableLeftTint = tintInfo;
        this.mDrawableTopTint = tintInfo;
        this.mDrawableRightTint = tintInfo;
        this.mDrawableBottomTint = tintInfo;
        this.mDrawableStartTint = tintInfo;
        this.mDrawableEndTint = tintInfo;
    }

    public final void setCompoundDrawableTintMode(PorterDuff.Mode mode) {
        if (this.mDrawableTint == null) {
            this.mDrawableTint = new TintInfo();
        }
        TintInfo tintInfo = this.mDrawableTint;
        tintInfo.mTintMode = mode;
        tintInfo.mHasTintMode = mode != null;
        this.mDrawableLeftTint = tintInfo;
        this.mDrawableTopTint = tintInfo;
        this.mDrawableRightTint = tintInfo;
        this.mDrawableBottomTint = tintInfo;
        this.mDrawableStartTint = tintInfo;
        this.mDrawableEndTint = tintInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.appcompat.widget.AppCompatTextHelper$1] */
    public final void updateTypefaceAndStyle(Context context, GrpcMethod grpcMethod) {
        String string2;
        int i = this.mStyle;
        TypedArray typedArray = (TypedArray) grpcMethod.requestAdapter;
        this.mStyle = typedArray.getInt(2, i);
        int i2 = typedArray.getInt(11, -1);
        this.mFontWeight = i2;
        if (i2 != -1) {
            this.mStyle &= 2;
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.mAsyncFontPending = false;
                int i3 = typedArray.getInt(1, 1);
                if (i3 == 1) {
                    this.mFontTypeface = Typeface.SANS_SERIF;
                    return;
                } else if (i3 == 2) {
                    this.mFontTypeface = Typeface.SERIF;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.mFontTypeface = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.mFontTypeface = null;
        int i4 = typedArray.hasValue(12) ? 12 : 10;
        final int i5 = this.mFontWeight;
        final int i6 = this.mStyle;
        if (!context.isRestricted()) {
            final WeakReference weakReference = new WeakReference(this.mView);
            try {
                Typeface font = grpcMethod.getFont(i4, this.mStyle, new ResourcesCompat.FontCallback() { // from class: androidx.appcompat.widget.AppCompatTextHelper.1
                    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                    public final void onFontRetrievalFailed(int i7) {
                    }

                    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                    public final void onFontRetrieved(Typeface typeface) {
                        int i7 = i5;
                        if (i7 != -1) {
                            typeface = Api28Impl.create(typeface, i7, (i6 & 2) != 0);
                        }
                        AppCompatTextHelper appCompatTextHelper = AppCompatTextHelper.this;
                        if (appCompatTextHelper.mAsyncFontPending) {
                            appCompatTextHelper.mFontTypeface = typeface;
                            TextView textView = (TextView) weakReference.get();
                            if (textView != null) {
                                boolean isAttachedToWindow = textView.isAttachedToWindow();
                                int i8 = appCompatTextHelper.mStyle;
                                if (isAttachedToWindow) {
                                    textView.post(new BiometricFragment.AnonymousClass10(textView, typeface, i8));
                                } else {
                                    textView.setTypeface(typeface, i8);
                                }
                            }
                        }
                    }
                });
                if (font != null) {
                    if (this.mFontWeight != -1) {
                        this.mFontTypeface = Api28Impl.create(Typeface.create(font, 0), this.mFontWeight, (this.mStyle & 2) != 0);
                    } else {
                        this.mFontTypeface = font;
                    }
                }
                this.mAsyncFontPending = this.mFontTypeface == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.mFontTypeface != null || (string2 = typedArray.getString(i4)) == null) {
            return;
        }
        if (this.mFontWeight != -1) {
            this.mFontTypeface = Api28Impl.create(Typeface.create(string2, 0), this.mFontWeight, (this.mStyle & 2) != 0);
        } else {
            this.mFontTypeface = Typeface.create(string2, this.mStyle);
        }
    }
}
