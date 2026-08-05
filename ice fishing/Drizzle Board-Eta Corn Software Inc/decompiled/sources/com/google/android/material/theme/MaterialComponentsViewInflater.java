package com.google.android.material.theme;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import defpackage.FOrSgJlm;
import defpackage.dr;
import defpackage.e0;
import defpackage.hr;
import defpackage.le0;
import defpackage.nr;
import defpackage.pr;
import defpackage.ra;
import defpackage.uezcOCXw;
import defpackage.ur;
import defpackage.vLKozZt7;
import defpackage.w;
import defpackage.w30;
import defpackage.y00;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends e0 {
    @Override // defpackage.e0
    public final FOrSgJlm MdtA4re8(Context context, AttributeSet attributeSet) {
        return new nr(context, attributeSet);
    }

    @Override // defpackage.e0
    public final AppCompatButton NCTxEWno(Context context, AttributeSet attributeSet) {
        return new hr(context, attributeSet);
    }

    @Override // defpackage.e0
    public final w VgvYg0wo(Context context, AttributeSet attributeSet) {
        ur urVar = new ur(le0.nSmgoSB5(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = urVar.getContext();
        if (ra.ytu5o6f4(context2.getTheme(), com.kolosta.rejin.jilosa.R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = y00.Ey6iv0m0;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int[] iArr2 = {1, 2};
            int i = -1;
            for (int i2 = 0; i2 < 2 && i < 0; i2++) {
                i = w30.WYNAV5pd(context2, obtainStyledAttributes, iArr2[i2], -1);
            }
            obtainStyledAttributes.recycle();
            if (i == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, y00.KlHjfFWx);
                    Context context3 = urVar.getContext();
                    int[] iArr3 = {2, 4};
                    int i3 = -1;
                    for (int i4 = 0; i4 < 2 && i3 < 0; i4++) {
                        i3 = w30.WYNAV5pd(context3, obtainStyledAttributes3, iArr3[i4], -1);
                    }
                    obtainStyledAttributes3.recycle();
                    if (i3 >= 0) {
                        urVar.setLineHeight(i3);
                    }
                }
            }
        }
        return urVar;
    }

    @Override // defpackage.e0
    public final uezcOCXw qoPGr6Ce(Context context, AttributeSet attributeSet) {
        return new dr(context, attributeSet);
    }

    @Override // defpackage.e0
    public final vLKozZt7 wxUZMvaN(Context context, AttributeSet attributeSet) {
        return new pr(context, attributeSet);
    }
}
