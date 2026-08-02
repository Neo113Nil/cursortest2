package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.R$styleable;
import androidx.core.view.ViewCompat;
import coil3.size.DimensionKt;
import com.squareup.wire.GrpcMethod;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class AppCompatCompoundButtonHelper {
    public ColorStateList mButtonTintList = null;
    public PorterDuff.Mode mButtonTintMode = null;
    public boolean mHasButtonTint = false;
    public boolean mHasButtonTintMode = false;
    public boolean mSkipNextApply;
    public final TextView mView;

    public /* synthetic */ AppCompatCompoundButtonHelper(TextView textView) {
        this.mView = textView;
    }

    public void applyButtonTint() {
        CompoundButton compoundButton = (CompoundButton) this.mView;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.mHasButtonTint || this.mHasButtonTintMode) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.mHasButtonTint) {
                    mutate.setTintList(this.mButtonTintList);
                }
                if (this.mHasButtonTintMode) {
                    mutate.setTintMode(this.mButtonTintMode);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void applyCheckMarkTint() {
        AppCompatCheckedTextView appCompatCheckedTextView = (AppCompatCheckedTextView) this.mView;
        Drawable checkMarkDrawable = appCompatCheckedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.mHasButtonTint || this.mHasButtonTintMode) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.mHasButtonTint) {
                    mutate.setTintList(this.mButtonTintList);
                }
                if (this.mHasButtonTintMode) {
                    mutate.setTintMode(this.mButtonTintMode);
                }
                if (mutate.isStateful()) {
                    mutate.setState(appCompatCheckedTextView.getDrawableState());
                }
                appCompatCheckedTextView.setCheckMarkDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0060 A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:3:0x0027, B:5:0x002d, B:8:0x0033, B:9:0x0059, B:11:0x0060, B:12:0x0067, B:14:0x006e, B:21:0x0042, B:23:0x0048, B:25:0x004e), top: B:2:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #1 {all -> 0x003f, blocks: (B:3:0x0027, B:5:0x002d, B:8:0x0033, B:9:0x0059, B:11:0x0060, B:12:0x0067, B:14:0x006e, B:21:0x0042, B:23:0x0048, B:25:0x004e), top: B:2:0x0027 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void loadFromAttributes(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.mView;
        Context context = compoundButton.getContext();
        int[] iArr = R$styleable.CompoundButton;
        GrpcMethod obtainStyledAttributes = GrpcMethod.obtainStyledAttributes(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) obtainStyledAttributes.requestAdapter;
        Context context2 = compoundButton.getContext();
        TypedArray typedArray2 = (TypedArray) obtainStyledAttributes.requestAdapter;
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api29Impl.saveAttributeDataForStyleable(compoundButton, context2, iArr, attributeSet, typedArray2, i, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(DimensionKt.getDrawable(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    compoundButton.setButtonTintList(obtainStyledAttributes.getColorStateList(2));
                }
                if (typedArray.hasValue(3)) {
                    compoundButton.setButtonTintMode(DrawableUtils.parseTintMode(typedArray.getInt(3, -1), null));
                }
                obtainStyledAttributes.recycle();
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(DimensionKt.getDrawable(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
