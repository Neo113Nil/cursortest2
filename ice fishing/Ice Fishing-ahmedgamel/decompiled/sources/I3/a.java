package I3;

import L3.F;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import com.icefishingapp.icefishing.C5275R;
import k3.AbstractC4632a;
import m.Z;

/* loaded from: classes2.dex */
public final class a extends Z {
    public static int k(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i6 = 0; i6 < iArr.length && i < 0; i6++) {
            int i9 = iArr[i6];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i9, typedValue) && typedValue.type == 2) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i = dimensionPixelSize;
            } else {
                i = typedArray.getDimensionPixelSize(i9, -1);
            }
        }
        return i;
    }

    @Override // m.Z, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (F.q(context, C5275R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, AbstractC4632a.f38644q);
            int k9 = k(getContext(), obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (k9 >= 0) {
                setLineHeight(k9);
            }
        }
    }
}
