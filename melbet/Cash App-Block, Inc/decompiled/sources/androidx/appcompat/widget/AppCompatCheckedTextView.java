package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;
import androidx.appcompat.R$styleable;
import androidx.core.view.ViewCompat;
import androidx.work.impl.WorkLauncherImpl;
import coil3.size.DimensionKt;
import com.squareup.cash.R;
import com.squareup.wire.GrpcMethod;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class AppCompatCheckedTextView extends CheckedTextView {
    public WorkLauncherImpl mAppCompatEmojiTextHelper;
    public final AppCompatBackgroundHelper mBackgroundTintHelper;
    public final AppCompatCompoundButtonHelper mCheckedHelper;
    public final AppCompatTextHelper mTextHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0087 A[Catch: all -> 0x0066, TryCatch #1 {all -> 0x0066, blocks: (B:3:0x004e, B:5:0x0054, B:8:0x005a, B:9:0x0080, B:11:0x0087, B:12:0x008e, B:14:0x0095, B:24:0x0069, B:26:0x006f, B:28:0x0075), top: B:2:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0095 A[Catch: all -> 0x0066, TRY_LEAVE, TryCatch #1 {all -> 0x0066, blocks: (B:3:0x004e, B:5:0x0054, B:8:0x005a, B:9:0x0080, B:11:0x0087, B:12:0x008e, B:14:0x0095, B:24:0x0069, B:26:0x006f, B:28:0x0075), top: B:2:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int resourceId;
        int resourceId2;
        TintContextWrapper.wrap(context);
        ThemeUtils.checkAppCompatTheme(this, getContext());
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.mTextHelper = appCompatTextHelper;
        appCompatTextHelper.loadFromAttributes(attributeSet, i);
        appCompatTextHelper.applyCompoundDrawablesTints();
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.mBackgroundTintHelper = appCompatBackgroundHelper;
        appCompatBackgroundHelper.loadFromAttributes(attributeSet, i);
        this.mCheckedHelper = new AppCompatCompoundButtonHelper(this);
        Context context2 = getContext();
        int[] iArr = R$styleable.CheckedTextView;
        GrpcMethod obtainStyledAttributes = GrpcMethod.obtainStyledAttributes(i, 0, context2, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) obtainStyledAttributes.requestAdapter;
        Context context3 = getContext();
        TypedArray typedArray2 = (TypedArray) obtainStyledAttributes.requestAdapter;
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api29Impl.saveAttributeDataForStyleable(this, context3, iArr, attributeSet, typedArray2, i, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(DimensionKt.getDrawable(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    setCheckMarkTintList(obtainStyledAttributes.getColorStateList(2));
                }
                if (typedArray.hasValue(3)) {
                    setCheckMarkTintMode(DrawableUtils.parseTintMode(typedArray.getInt(3, -1), null));
                }
                obtainStyledAttributes.recycle();
                if (this.mAppCompatEmojiTextHelper == null) {
                    this.mAppCompatEmojiTextHelper = new WorkLauncherImpl((TextView) this);
                }
                this.mAppCompatEmojiTextHelper.loadFromAttributes(attributeSet, i);
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(DimensionKt.getDrawable(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            obtainStyledAttributes.recycle();
            if (this.mAppCompatEmojiTextHelper == null) {
            }
            this.mAppCompatEmojiTextHelper.loadFromAttributes(attributeSet, i);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.applyCompoundDrawablesTints();
        }
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.applySupportBackgroundTint();
        }
        AppCompatCompoundButtonHelper appCompatCompoundButtonHelper = this.mCheckedHelper;
        if (appCompatCompoundButtonHelper != null) {
            appCompatCompoundButtonHelper.applyCheckMarkTint();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AppCompatHintHelper.onCreateInputConnection(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new WorkLauncherImpl((TextView) this);
        }
        this.mAppCompatEmojiTextHelper.setAllCaps(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.onSetBackgroundDrawable();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.onSetBackgroundResource(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        AppCompatCompoundButtonHelper appCompatCompoundButtonHelper = this.mCheckedHelper;
        if (appCompatCompoundButtonHelper != null) {
            if (appCompatCompoundButtonHelper.mSkipNextApply) {
                appCompatCompoundButtonHelper.mSkipNextApply = false;
            } else {
                appCompatCompoundButtonHelper.mSkipNextApply = true;
                appCompatCompoundButtonHelper.applyCheckMarkTint();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.applyCompoundDrawablesTints();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.applyCompoundDrawablesTints();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new WorkLauncherImpl((TextView) this);
        }
        this.mAppCompatEmojiTextHelper.setEnabled(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.setSupportBackgroundTintList(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.setSupportBackgroundTintMode(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        AppCompatCompoundButtonHelper appCompatCompoundButtonHelper = this.mCheckedHelper;
        if (appCompatCompoundButtonHelper != null) {
            appCompatCompoundButtonHelper.mButtonTintList = colorStateList;
            appCompatCompoundButtonHelper.mHasButtonTint = true;
            appCompatCompoundButtonHelper.applyCheckMarkTint();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        AppCompatCompoundButtonHelper appCompatCompoundButtonHelper = this.mCheckedHelper;
        if (appCompatCompoundButtonHelper != null) {
            appCompatCompoundButtonHelper.mButtonTintMode = mode;
            appCompatCompoundButtonHelper.mHasButtonTintMode = true;
            appCompatCompoundButtonHelper.applyCheckMarkTint();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        appCompatTextHelper.setCompoundDrawableTintList(colorStateList);
        appCompatTextHelper.applyCompoundDrawablesTints();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        appCompatTextHelper.setCompoundDrawableTintMode(mode);
        appCompatTextHelper.applyCompoundDrawablesTints();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.onSetTextAppearance(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(DimensionKt.getDrawable(getContext(), i));
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    public AppCompatCheckedTextView(Context context) {
        this(context, null);
    }
}
