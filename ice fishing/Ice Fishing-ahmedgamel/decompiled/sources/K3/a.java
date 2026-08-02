package K3;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import com.IceFishing.LiveIceFishing.C5248R;
import com.bumptech.glide.e;
import m.Z;
import m3.AbstractC4742a;

/* loaded from: classes2.dex */
public final class a extends Z {
    public static int k(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i4 = 0; i4 < iArr.length && i < 0; i4++) {
            int i6 = iArr[i4];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i6, typedValue) && typedValue.type == 2) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i = dimensionPixelSize;
            } else {
                i = typedArray.getDimensionPixelSize(i6, -1);
            }
        }
        return i;
    }

    @Override // m.Z, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (e.g(context, C5248R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, AbstractC4742a.f39433q);
            int k9 = k(getContext(), obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (k9 >= 0) {
                setLineHeight(k9);
            }
        }
    }
}
