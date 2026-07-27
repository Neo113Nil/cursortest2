package kotlin.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class CatchingFishAsyncTaskRoom {
    public static final SparseIntArray CatchingFishFragmentHandler;
    public int CatchingFishCoroutine;
    public float CatchingFishDaggerWebsocket;
    public int CatchingFishLayout;
    public int CatchingFishParcelableFAB;
    public float CatchingFishReduxKtor;
    public int CatchingFishSnackbar;
    public String CatchingFishViewModelFAB;
    public int CatchingFishViewModelScope;
    public float CatchingFishWorkManager;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        CatchingFishFragmentHandler = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void CatchingFishParcelableFAB(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CatchingFishFluxAndroidX.CatchingFishWorkManager);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (CatchingFishFragmentHandler.get(index)) {
                case 1:
                    this.CatchingFishDaggerWebsocket = obtainStyledAttributes.getFloat(index, this.CatchingFishDaggerWebsocket);
                    break;
                case 2:
                    this.CatchingFishCoroutine = obtainStyledAttributes.getInt(index, this.CatchingFishCoroutine);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = CatchingFishAdMobFAB.CatchingFishDaggerWebsocket[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                    this.CatchingFishParcelableFAB = CatchingFishAnimationBundle.CatchingFishWorkManager(obtainStyledAttributes, index, this.CatchingFishParcelableFAB);
                    break;
                case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                    this.CatchingFishSnackbar = obtainStyledAttributes.getInteger(index, this.CatchingFishSnackbar);
                    break;
                case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                    this.CatchingFishReduxKtor = obtainStyledAttributes.getFloat(index, this.CatchingFishReduxKtor);
                    break;
                case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                    this.CatchingFishViewModelScope = obtainStyledAttributes.getInteger(index, this.CatchingFishViewModelScope);
                    break;
                case 9:
                    this.CatchingFishWorkManager = obtainStyledAttributes.getFloat(index, this.CatchingFishWorkManager);
                    break;
                case 10:
                    int i2 = obtainStyledAttributes.peekValue(index).type;
                    if (i2 == 1) {
                        this.CatchingFishLayout = obtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i2 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.CatchingFishViewModelFAB = string;
                        if (string.indexOf("/") > 0) {
                            this.CatchingFishLayout = obtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        obtainStyledAttributes.getInteger(index, this.CatchingFishLayout);
                        break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
