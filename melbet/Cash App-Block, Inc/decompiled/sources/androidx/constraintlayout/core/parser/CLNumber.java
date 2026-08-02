package androidx.constraintlayout.core.parser;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class CLNumber extends CLElement {
    public float mValue;

    public CLNumber(float f) {
        super(null);
        this.mValue = f;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CLNumber) {
            float f = getFloat();
            float f2 = ((CLNumber) obj).getFloat();
            if ((Float.isNaN(f) && Float.isNaN(f2)) || f == f2) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public final float getFloat() {
        char[] cArr;
        if (Float.isNaN(this.mValue) && (cArr = this.mContent) != null && cArr.length >= 1) {
            this.mValue = Float.parseFloat(content());
        }
        return this.mValue;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public final int getInt$1() {
        char[] cArr;
        if (Float.isNaN(this.mValue) && (cArr = this.mContent) != null && cArr.length >= 1) {
            this.mValue = Integer.parseInt(content());
        }
        return (int) this.mValue;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        float f = this.mValue;
        return hashCode + (f != RecyclerView.DECELERATION_RATE ? Float.floatToIntBits(f) : 0);
    }
}
