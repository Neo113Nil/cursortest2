package com.google.android.material.shape;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import com.google.android.material.R$styleable;
import com.google.mlkit.vision.text.internal.zzr;
import com.squareup.cash.R;

/* loaded from: classes4.dex */
public final class StateListSizeChange {
    public zzr defaultSizeChange;
    public zzr[] sizeChanges;
    public int stateCount;
    public int[][] stateSpecs;

    public final class SizeChangeAmount {
        public final float amount;

        /* renamed from: type, reason: collision with root package name */
        public final int f996type;

        public SizeChangeAmount(float f, int i) {
            this.f996type = i;
            this.amount = f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void loadSizeChangeFromItems(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        SizeChangeAmount sizeChangeAmount;
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
                int[] iArr2 = R$styleable.StateListSizeChange;
                TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr2) : theme.obtainStyledAttributes(attributeSet, iArr2, 0, 0);
                TypedValue peekValue = obtainAttributes.peekValue(0);
                if (peekValue != null) {
                    int i3 = peekValue.type;
                    if (i3 == 5) {
                        sizeChangeAmount = new SizeChangeAmount(TypedValue.complexToDimensionPixelSize(peekValue.data, obtainAttributes.getResources().getDisplayMetrics()), 2);
                    } else if (i3 == 6) {
                        sizeChangeAmount = new SizeChangeAmount(peekValue.getFraction(1.0f, 1.0f), 1);
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
                    zzr zzrVar = new zzr(7);
                    zzrVar.zza = sizeChangeAmount;
                    i2 = this.stateCount;
                    if (i2 != 0 || trimStateSet.length == 0) {
                        this.defaultSizeChange = zzrVar;
                    }
                    iArr = this.stateSpecs;
                    if (i2 >= iArr.length) {
                        int i6 = i2 + 10;
                        int[][] iArr4 = new int[i6][];
                        System.arraycopy(iArr, 0, iArr4, 0, i2);
                        this.stateSpecs = iArr4;
                        zzr[] zzrVarArr = new zzr[i6];
                        System.arraycopy(this.sizeChanges, 0, zzrVarArr, 0, i2);
                        this.sizeChanges = zzrVarArr;
                    }
                    int[][] iArr5 = this.stateSpecs;
                    int i7 = this.stateCount;
                    iArr5[i7] = trimStateSet;
                    this.sizeChanges[i7] = zzrVar;
                    this.stateCount = i7 + 1;
                }
                sizeChangeAmount = null;
                obtainAttributes.recycle();
                attributeCount = attributeSet.getAttributeCount();
                int[] iArr32 = new int[attributeCount];
                int i42 = 0;
                while (i < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr32, i42);
                zzr zzrVar2 = new zzr(7);
                zzrVar2.zza = sizeChangeAmount;
                i2 = this.stateCount;
                if (i2 != 0) {
                }
                this.defaultSizeChange = zzrVar2;
                iArr = this.stateSpecs;
                if (i2 >= iArr.length) {
                }
                int[][] iArr52 = this.stateSpecs;
                int i72 = this.stateCount;
                iArr52[i72] = trimStateSet2;
                this.sizeChanges[i72] = zzrVar2;
                this.stateCount = i72 + 1;
            }
        }
    }
}
