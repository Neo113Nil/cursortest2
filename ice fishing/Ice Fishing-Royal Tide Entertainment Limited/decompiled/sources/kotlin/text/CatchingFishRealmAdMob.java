package kotlin.text;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import com.catchingfish.fishcatcherpro.R;

/* loaded from: classes.dex */
public final class CatchingFishRealmAdMob {
    public int[][] CatchingFishCoroutine;
    public int CatchingFishParcelableFAB;
    public CatchingFishEspressoPayPal[] CatchingFishReduxKtor;
    public CatchingFishEspressoPayPal CatchingFishSnackbar;

    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishParcelableFAB(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        CatchingFishContextLiveData catchingFishContextLiveData;
        int attributeCount;
        int i;
        int i2;
        int[][] iArr;
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
                int[] iArr2 = CatchingFishSnackbarPicasso.CatchingFishCardViewView;
                TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr2) : theme.obtainStyledAttributes(attributeSet, iArr2, 0, 0);
                TypedValue peekValue = obtainAttributes.peekValue(0);
                if (peekValue != null) {
                    int i3 = peekValue.type;
                    if (i3 == 5) {
                        catchingFishContextLiveData = new CatchingFishContextLiveData(2, TypedValue.complexToDimensionPixelSize(peekValue.data, obtainAttributes.getResources().getDisplayMetrics()));
                    } else if (i3 == 6) {
                        catchingFishContextLiveData = new CatchingFishContextLiveData(1, peekValue.getFraction(1.0f, 1.0f));
                    }
                    obtainAttributes.recycle();
                    attributeCount = attributeSet.getAttributeCount();
                    int[] iArr3 = new int[attributeCount];
                    int i4 = 0;
                    for (i = 0; i < attributeCount; i++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i);
                        if (attributeNameResource != R.attr.widthChange) {
                            int i5 = i4 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr3[i4] = attributeNameResource;
                            i4 = i5;
                        }
                    }
                    int[] trimStateSet = StateSet.trimStateSet(iArr3, i4);
                    CatchingFishEspressoPayPal catchingFishEspressoPayPal = new CatchingFishEspressoPayPal(8, false);
                    catchingFishEspressoPayPal.CatchingFishDaggerWebsocket = catchingFishContextLiveData;
                    i2 = this.CatchingFishParcelableFAB;
                    if (i2 != 0 || trimStateSet.length == 0) {
                        this.CatchingFishSnackbar = catchingFishEspressoPayPal;
                    }
                    iArr = this.CatchingFishCoroutine;
                    if (i2 >= iArr.length) {
                        int i6 = i2 + 10;
                        int[][] iArr4 = new int[i6][];
                        System.arraycopy(iArr, 0, iArr4, 0, i2);
                        this.CatchingFishCoroutine = iArr4;
                        CatchingFishEspressoPayPal[] catchingFishEspressoPayPalArr = new CatchingFishEspressoPayPal[i6];
                        System.arraycopy(this.CatchingFishReduxKtor, 0, catchingFishEspressoPayPalArr, 0, i2);
                        this.CatchingFishReduxKtor = catchingFishEspressoPayPalArr;
                    }
                    int[][] iArr5 = this.CatchingFishCoroutine;
                    int i7 = this.CatchingFishParcelableFAB;
                    iArr5[i7] = trimStateSet;
                    this.CatchingFishReduxKtor[i7] = catchingFishEspressoPayPal;
                    this.CatchingFishParcelableFAB = i7 + 1;
                }
                catchingFishContextLiveData = null;
                obtainAttributes.recycle();
                attributeCount = attributeSet.getAttributeCount();
                int[] iArr32 = new int[attributeCount];
                int i42 = 0;
                while (i < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr32, i42);
                CatchingFishEspressoPayPal catchingFishEspressoPayPal2 = new CatchingFishEspressoPayPal(8, false);
                catchingFishEspressoPayPal2.CatchingFishDaggerWebsocket = catchingFishContextLiveData;
                i2 = this.CatchingFishParcelableFAB;
                if (i2 != 0) {
                }
                this.CatchingFishSnackbar = catchingFishEspressoPayPal2;
                iArr = this.CatchingFishCoroutine;
                if (i2 >= iArr.length) {
                }
                int[][] iArr52 = this.CatchingFishCoroutine;
                int i72 = this.CatchingFishParcelableFAB;
                iArr52[i72] = trimStateSet2;
                this.CatchingFishReduxKtor[i72] = catchingFishEspressoPayPal2;
                this.CatchingFishParcelableFAB = i72 + 1;
            }
        }
    }
}
