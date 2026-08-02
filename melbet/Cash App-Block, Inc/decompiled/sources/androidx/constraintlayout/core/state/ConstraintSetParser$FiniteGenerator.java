package androidx.constraintlayout.core.state;

/* loaded from: classes3.dex */
public final class ConstraintSetParser$FiniteGenerator implements ConstraintSetParser$GeneratedValue {
    public float mCurrent;
    public float mMax;
    public String mPostfix;
    public String mPrefix;
    public boolean mStop;

    @Override // androidx.constraintlayout.core.state.ConstraintSetParser$GeneratedValue
    public final float value() {
        float f = this.mCurrent;
        if (f >= this.mMax) {
            this.mStop = true;
        }
        if (!this.mStop) {
            this.mCurrent = f + 1.0f;
        }
        return this.mCurrent;
    }
}
