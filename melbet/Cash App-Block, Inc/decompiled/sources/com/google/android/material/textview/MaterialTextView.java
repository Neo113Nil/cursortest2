package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.R$styleable;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;

/* loaded from: classes4.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, 0), attributeSet, i);
        initialize(attributeSet, i, 0);
    }

    public final void initialize(AttributeSet attributeSet, int i, int i2) {
        Context context = getContext();
        if (MaterialAttributes.resolveBoolean(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context.getTheme();
            int[] iArr = R$styleable.MaterialTextView;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int[] iArr2 = {1, 2};
            int i3 = -1;
            for (int i4 = 0; i4 < 2 && i3 < 0; i4++) {
                i3 = ContextUtilsKt.getDimensionPixelSize(context, obtainStyledAttributes, iArr2[i4], -1);
            }
            obtainStyledAttributes.recycle();
            if (i3 != -1) {
                return;
            }
            TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
            obtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, R$styleable.MaterialTextAppearance);
                Context context2 = getContext();
                int[] iArr3 = {2, 4};
                int i5 = -1;
                for (int i6 = 0; i6 < 2 && i5 < 0; i6++) {
                    i5 = ContextUtilsKt.getDimensionPixelSize(context2, obtainStyledAttributes3, iArr3[i6], -1);
                }
                obtainStyledAttributes3.recycle();
                if (i5 >= 0) {
                    setLineHeight(i5);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (MaterialAttributes.resolveBoolean(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, R$styleable.MaterialTextAppearance);
            Context context2 = getContext();
            int[] iArr = {2, 4};
            int i2 = -1;
            for (int i3 = 0; i3 < 2 && i2 < 0; i3++) {
                i2 = ContextUtilsKt.getDimensionPixelSize(context2, obtainStyledAttributes, iArr[i3], -1);
            }
            obtainStyledAttributes.recycle();
            if (i2 >= 0) {
                setLineHeight(i2);
            }
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    public MaterialTextView(Context context) {
        this(context, null);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        initialize(attributeSet, i, i2);
    }
}
