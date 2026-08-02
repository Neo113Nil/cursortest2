package androidx.constraintlayout.core.state;

/* loaded from: classes3.dex */
public final class ConstraintSetParser$Generator implements ConstraintSetParser$GeneratedValue {
    public float mCurrent;
    public float mIncrementBy;

    @Override // androidx.constraintlayout.core.state.ConstraintSetParser$GeneratedValue
    public final float value() {
        float f = this.mCurrent + this.mIncrementBy;
        this.mCurrent = f;
        return f;
    }
}
