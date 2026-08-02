package com.google.android.material.shape;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R$styleable;
import com.squareup.cash.R;

/* loaded from: classes4.dex */
public final class StateListCornerSize {
    public CornerSize defaultCornerSize;
    public int stateCount;
    public int[][] stateSpecs = new int[10][];
    public CornerSize[] cornerSizes = new CornerSize[10];

    public static StateListCornerSize create(CornerSize cornerSize) {
        StateListCornerSize stateListCornerSize = new StateListCornerSize();
        stateListCornerSize.addStateCornerSize(StateSet.WILD_CARD, cornerSize);
        return stateListCornerSize;
    }

    public final void addStateCornerSize(int[] iArr, CornerSize cornerSize) {
        int i = this.stateCount;
        if (i == 0 || iArr.length == 0) {
            this.defaultCornerSize = cornerSize;
        }
        int[][] iArr2 = this.stateSpecs;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            int[][] iArr3 = new int[i2][];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.stateSpecs = iArr3;
            CornerSize[] cornerSizeArr = new CornerSize[i2];
            System.arraycopy(this.cornerSizes, 0, cornerSizeArr, 0, i);
            this.cornerSizes = cornerSizeArr;
        }
        int[][] iArr4 = this.stateSpecs;
        int i3 = this.stateCount;
        iArr4[i3] = iArr;
        this.cornerSizes[i3] = cornerSize;
        this.stateCount = i3 + 1;
    }

    public final CornerSize getCornerSizeForState(int[] iArr) {
        int i;
        int[][] iArr2 = this.stateSpecs;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = -1;
            if (i3 >= this.stateCount) {
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
            int[][] iArr4 = this.stateSpecs;
            while (true) {
                if (i2 >= this.stateCount) {
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
        return i3 < 0 ? this.defaultCornerSize : this.cornerSizes[i3];
    }

    public final void loadCornerSizesFromItems(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
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
                int[] iArr = R$styleable.ShapeAppearance;
                TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                CornerSize cornerSize = ShapeAppearanceModel.getCornerSize(obtainAttributes, 5, new AbsoluteCornerSize(RecyclerView.DECELERATION_RATE));
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
                addStateCornerSize(StateSet.trimStateSet(iArr2, i), cornerSize);
            }
        }
    }
}
