package kotlin.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class CatchingFishBundleService {
    public float CatchingFishCoroutine;
    public int CatchingFishParcelableFAB;
    public float CatchingFishReduxKtor;
    public int CatchingFishSnackbar;

    public final void CatchingFishParcelableFAB(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CatchingFishFluxAndroidX.CatchingFishViewModelScope);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.CatchingFishCoroutine = obtainStyledAttributes.getFloat(index, this.CatchingFishCoroutine);
            } else if (index == 0) {
                int i2 = obtainStyledAttributes.getInt(index, this.CatchingFishParcelableFAB);
                this.CatchingFishParcelableFAB = i2;
                this.CatchingFishParcelableFAB = CatchingFishAnimationBundle.CatchingFishReduxKtor[i2];
            } else if (index == 4) {
                this.CatchingFishSnackbar = obtainStyledAttributes.getInt(index, this.CatchingFishSnackbar);
            } else if (index == 3) {
                this.CatchingFishReduxKtor = obtainStyledAttributes.getFloat(index, this.CatchingFishReduxKtor);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
