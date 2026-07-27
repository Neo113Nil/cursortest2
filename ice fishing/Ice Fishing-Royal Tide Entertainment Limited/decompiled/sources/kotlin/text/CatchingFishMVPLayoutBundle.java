package kotlin.text;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import com.catchingfish.fishcatcherpro.R;

/* loaded from: classes.dex */
public final class CatchingFishMVPLayoutBundle {
    public int CatchingFishParcelableFAB;
    public CatchingFishCameraXGradle CatchingFishSnackbar;
    public int[][] CatchingFishCoroutine = new int[10][];
    public CatchingFishCameraXGradle[] CatchingFishReduxKtor = new CatchingFishCameraXGradle[10];

    public static CatchingFishMVPLayoutBundle CatchingFishSnackbar(CatchingFishCameraXGradle catchingFishCameraXGradle) {
        CatchingFishMVPLayoutBundle catchingFishMVPLayoutBundle = new CatchingFishMVPLayoutBundle();
        catchingFishMVPLayoutBundle.CatchingFishParcelableFAB(StateSet.WILD_CARD, catchingFishCameraXGradle);
        return catchingFishMVPLayoutBundle;
    }

    public final CatchingFishCameraXGradle CatchingFishCoroutine(int[] iArr) {
        int i;
        int[][] iArr2 = this.CatchingFishCoroutine;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = -1;
            if (i3 >= this.CatchingFishParcelableFAB) {
                i3 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                break;
            }
            i3++;
        }
        if (i3 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = this.CatchingFishCoroutine;
            while (true) {
                if (i2 >= this.CatchingFishParcelableFAB) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr4[i2], iArr3)) {
                    i = i2;
                    break;
                }
                i2++;
            }
            i3 = i;
        }
        return i3 < 0 ? this.CatchingFishSnackbar : this.CatchingFishReduxKtor[i3];
    }

    public final void CatchingFishParcelableFAB(int[] iArr, CatchingFishCameraXGradle catchingFishCameraXGradle) {
        int i = this.CatchingFishParcelableFAB;
        if (i == 0 || iArr.length == 0) {
            this.CatchingFishSnackbar = catchingFishCameraXGradle;
        }
        int[][] iArr2 = this.CatchingFishCoroutine;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            int[][] iArr3 = new int[i2][];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.CatchingFishCoroutine = iArr3;
            CatchingFishCameraXGradle[] catchingFishCameraXGradleArr = new CatchingFishCameraXGradle[i2];
            System.arraycopy(this.CatchingFishReduxKtor, 0, catchingFishCameraXGradleArr, 0, i);
            this.CatchingFishReduxKtor = catchingFishCameraXGradleArr;
        }
        int[][] iArr4 = this.CatchingFishCoroutine;
        int i3 = this.CatchingFishParcelableFAB;
        iArr4[i3] = iArr;
        this.CatchingFishReduxKtor[i3] = catchingFishCameraXGradle;
        this.CatchingFishParcelableFAB = i3 + 1;
    }

    public final void CatchingFishReduxKtor(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = CatchingFishSnackbarPicasso.CatchingFishGsonAppCompat;
                TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                CatchingFishCameraXGradle CatchingFishCoroutine = CatchingFishFragmentMVVM.CatchingFishCoroutine(obtainAttributes, 5, new CatchingFishEspressoTesting(0.0f));
                obtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != R.attr.cornerSize) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i3;
                    }
                }
                CatchingFishParcelableFAB(StateSet.trimStateSet(iArr2, i), CatchingFishCoroutine);
            }
        }
    }
}
