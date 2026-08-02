package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.R$styleable;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ImageViewCompat;
import coil3.size.DimensionKt;
import com.squareup.wire.GrpcMethod;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class AppCompatImageHelper {
    public TintInfo mImageTint;
    public int mLevel = 0;
    public final ImageView mView;

    public AppCompatImageHelper(ImageView imageView) {
        this.mView = imageView;
    }

    public final void applySupportImageTint() {
        TintInfo tintInfo;
        ImageView imageView = this.mView;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            DrawableUtils.fixDrawable(drawable);
        }
        if (drawable == null || (tintInfo = this.mImageTint) == null) {
            return;
        }
        AppCompatDrawableManager.tintDrawable(drawable, tintInfo, imageView.getDrawableState());
    }

    public final void loadFromAttributes(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = this.mView;
        Context context = imageView.getContext();
        int[] iArr = R$styleable.AppCompatImageView;
        GrpcMethod obtainStyledAttributes = GrpcMethod.obtainStyledAttributes(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) obtainStyledAttributes.requestAdapter;
        Context context2 = imageView.getContext();
        TypedArray typedArray2 = (TypedArray) obtainStyledAttributes.requestAdapter;
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api29Impl.saveAttributeDataForStyleable(imageView, context2, iArr, attributeSet, typedArray2, i, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = DimensionKt.getDrawable(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                DrawableUtils.fixDrawable(drawable);
            }
            if (typedArray.hasValue(2)) {
                ImageViewCompat.setImageTintList(imageView, obtainStyledAttributes.getColorStateList(2));
            }
            if (typedArray.hasValue(3)) {
                ImageViewCompat.setImageTintMode(imageView, DrawableUtils.parseTintMode(typedArray.getInt(3, -1), null));
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void setImageResource(int i) {
        ImageView imageView = this.mView;
        if (i != 0) {
            Drawable drawable = DimensionKt.getDrawable(imageView.getContext(), i);
            if (drawable != null) {
                DrawableUtils.fixDrawable(drawable);
            }
            imageView.setImageDrawable(drawable);
        } else {
            imageView.setImageDrawable(null);
        }
        applySupportImageTint();
    }
}
