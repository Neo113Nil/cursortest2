package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.bg3;
import defpackage.ivf;
import defpackage.ngg;
import defpackage.vdn;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(bg3.p0(context, attributeSet, i, 0), attributeSet, i);
        p(attributeSet, i, 0);
    }

    public final void p(AttributeSet attributeSet, int i, int i2) {
        Context context = getContext();
        if (ngg.D(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context.getTheme();
            int[] iArr = vdn.H;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int[] iArr2 = {1, 2};
            int i3 = -1;
            for (int i4 = 0; i4 < 2 && i3 < 0; i4++) {
                i3 = ivf.E(context, obtainStyledAttributes, iArr2[i4], -1);
            }
            obtainStyledAttributes.recycle();
            if (i3 != -1) {
                return;
            }
            TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
            obtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, vdn.G);
                Context context2 = getContext();
                int[] iArr3 = {2, 4};
                int i5 = -1;
                for (int i6 = 0; i6 < 2 && i5 < 0; i6++) {
                    i5 = ivf.E(context2, obtainStyledAttributes3, iArr3[i6], -1);
                }
                obtainStyledAttributes3.recycle();
                if (i5 >= 0) {
                    setLineHeight(i5);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (ngg.D(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, vdn.G);
            Context context2 = getContext();
            int[] iArr = {2, 4};
            int i2 = -1;
            for (int i3 = 0; i3 < 2 && i2 < 0; i3++) {
                i2 = ivf.E(context2, obtainStyledAttributes, iArr[i3], -1);
            }
            obtainStyledAttributes.recycle();
            if (i2 >= 0) {
                setLineHeight(i2);
            }
        }
    }

    public MaterialTextView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    public MaterialTextView(@NonNull Context context) {
        this(context, null);
    }

    @Deprecated
    public MaterialTextView(@NonNull Context context, AttributeSet attributeSet, int i, int i2) {
        super(bg3.p0(context, attributeSet, i, i2), attributeSet, i);
        p(attributeSet, i, i2);
    }
}
