package com.google.android.material.theme;

import A3.n;
import C3.a;
import J3.y;
import U.b;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.IceFishing.LiveIceFishing.C5248R;
import com.bumptech.glide.e;
import com.bumptech.glide.f;
import com.google.android.material.button.MaterialButton;
import h.C4540D;
import m.C4680B;
import m.C4716o;
import m.C4718p;
import m.C4720q;
import m.Z;
import m3.AbstractC4742a;
import u3.C5070c;

/* loaded from: classes2.dex */
public class MaterialComponentsViewInflater extends C4540D {
    @Override // h.C4540D
    public final C4716o a(Context context, AttributeSet attributeSet) {
        return new y(context, attributeSet);
    }

    @Override // h.C4540D
    public final C4718p b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // h.C4540D
    public final C4720q c(Context context, AttributeSet attributeSet) {
        return new C5070c(context, attributeSet);
    }

    @Override // h.C4540D
    public final C4680B d(Context context, AttributeSet attributeSet) {
        a aVar = new a(L3.a.a(context, attributeSet, C5248R.attr.radioButtonStyle, C5248R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = aVar.getContext();
        TypedArray f2 = n.f(context2, attributeSet, AbstractC4742a.f39431o, C5248R.attr.radioButtonStyle, C5248R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (f2.hasValue(0)) {
            b.c(aVar, f.j(context2, f2, 0));
        }
        aVar.f328y = f2.getBoolean(1, false);
        f2.recycle();
        return aVar;
    }

    @Override // h.C4540D
    public final Z e(Context context, AttributeSet attributeSet) {
        K3.a aVar = new K3.a(L3.a.a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = aVar.getContext();
        if (e.g(context2, C5248R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC4742a.f39434r;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int k9 = K3.a.k(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (k9 == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC4742a.f39433q);
                    int k10 = K3.a.k(aVar.getContext(), obtainStyledAttributes3, 1, 2);
                    obtainStyledAttributes3.recycle();
                    if (k10 >= 0) {
                        aVar.setLineHeight(k10);
                    }
                }
            }
        }
        return aVar;
    }
}
