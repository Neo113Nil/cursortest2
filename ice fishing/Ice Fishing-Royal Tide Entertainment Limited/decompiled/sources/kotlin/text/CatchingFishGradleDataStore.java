package kotlin.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class CatchingFishGradleDataStore {
    public static final SparseIntArray CatchingFishUnitTesting;
    public float CatchingFishCloudMessaging;
    public float CatchingFishCoroutine;
    public float CatchingFishDaggerWebsocket;
    public boolean CatchingFishEspressoTesting;
    public float CatchingFishFragmentHandler;
    public float CatchingFishLayout;
    public float CatchingFishOkHttp;
    public float CatchingFishParcelableFAB;
    public float CatchingFishReduxKtor;
    public float CatchingFishSnackbar;
    public int CatchingFishViewModelFAB;
    public float CatchingFishViewModelScope;
    public float CatchingFishWorkManager;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        CatchingFishUnitTesting = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void CatchingFishParcelableFAB(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CatchingFishFluxAndroidX.CatchingFishLayout);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (CatchingFishUnitTesting.get(index)) {
                case 1:
                    this.CatchingFishParcelableFAB = obtainStyledAttributes.getFloat(index, this.CatchingFishParcelableFAB);
                    break;
                case 2:
                    this.CatchingFishSnackbar = obtainStyledAttributes.getFloat(index, this.CatchingFishSnackbar);
                    break;
                case 3:
                    this.CatchingFishCoroutine = obtainStyledAttributes.getFloat(index, this.CatchingFishCoroutine);
                    break;
                case 4:
                    this.CatchingFishReduxKtor = obtainStyledAttributes.getFloat(index, this.CatchingFishReduxKtor);
                    break;
                case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                    this.CatchingFishDaggerWebsocket = obtainStyledAttributes.getFloat(index, this.CatchingFishDaggerWebsocket);
                    break;
                case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                    this.CatchingFishWorkManager = obtainStyledAttributes.getDimension(index, this.CatchingFishWorkManager);
                    break;
                case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                    this.CatchingFishViewModelScope = obtainStyledAttributes.getDimension(index, this.CatchingFishViewModelScope);
                    break;
                case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                    this.CatchingFishLayout = obtainStyledAttributes.getDimension(index, this.CatchingFishLayout);
                    break;
                case 9:
                    this.CatchingFishFragmentHandler = obtainStyledAttributes.getDimension(index, this.CatchingFishFragmentHandler);
                    break;
                case 10:
                    this.CatchingFishCloudMessaging = obtainStyledAttributes.getDimension(index, this.CatchingFishCloudMessaging);
                    break;
                case 11:
                    this.CatchingFishEspressoTesting = true;
                    this.CatchingFishOkHttp = obtainStyledAttributes.getDimension(index, this.CatchingFishOkHttp);
                    break;
                case 12:
                    this.CatchingFishViewModelFAB = CatchingFishAnimationBundle.CatchingFishWorkManager(obtainStyledAttributes, index, this.CatchingFishViewModelFAB);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
