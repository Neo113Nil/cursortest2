package kotlin.text;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class CatchingFishGlideMockkToast extends CatchingFishDaggerBiometric {
    public static boolean CatchingFishLayout = true;
    public static boolean CatchingFishViewModelFAB = true;
    public static boolean CatchingFishViewModelScope = true;
    public static boolean CatchingFishWorkManager = true;

    public void CatchingFishAnimation(View view, Matrix matrix) {
        if (CatchingFishWorkManager) {
            try {
                CatchingFishRoomKtor.CatchingFishSnackbar(view, matrix);
            } catch (NoSuchMethodError unused) {
                CatchingFishWorkManager = false;
            }
        }
    }

    public void CatchingFishJUnitRealm(View view, int i, int i2, int i3, int i4) {
        if (CatchingFishViewModelFAB) {
            try {
                CatchingFishMoshiToastMVI.CatchingFishParcelableFAB(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                CatchingFishViewModelFAB = false;
            }
        }
    }

    public void CatchingFishMVVMAppCompat(View view, Matrix matrix) {
        if (CatchingFishViewModelScope) {
            try {
                CatchingFishRoomKtor.CatchingFishCoroutine(view, matrix);
            } catch (NoSuchMethodError unused) {
                CatchingFishViewModelScope = false;
            }
        }
    }

    @Override // kotlin.text.CatchingFishDaggerBiometric
    public void CatchingFishPayPalLiveData(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.CatchingFishPayPalLiveData(view, i);
        } else if (CatchingFishLayout) {
            try {
                CatchingFishIntentFAB.CatchingFishParcelableFAB(view, i);
            } catch (NoSuchMethodError unused) {
                CatchingFishLayout = false;
            }
        }
    }
}
