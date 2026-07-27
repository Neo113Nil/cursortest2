package kotlin.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import com.catchingfish.fishcatcherpro.R;

/* loaded from: classes.dex */
public final class CatchingFishRoomLifecycle extends CatchingFishDataStoreBundle {
    public static int CatchingFishViewModelScope(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            int i3 = iArr[i2];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i3, typedValue) && typedValue.type == 2) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i = dimensionPixelSize;
            } else {
                i = typedArray.getDimensionPixelSize(i3, -1);
            }
        }
        return i;
    }

    @Override // kotlin.text.CatchingFishDataStoreBundle, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (CatchingFishOkHttpFAB.CatchingFishMotionLayout(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, CatchingFishSnackbarPicasso.CatchingFishJetpackCompose);
            int CatchingFishViewModelScope = CatchingFishViewModelScope(getContext(), obtainStyledAttributes, 2, 4);
            obtainStyledAttributes.recycle();
            if (CatchingFishViewModelScope >= 0) {
                setLineHeight(CatchingFishViewModelScope);
            }
        }
    }
}
