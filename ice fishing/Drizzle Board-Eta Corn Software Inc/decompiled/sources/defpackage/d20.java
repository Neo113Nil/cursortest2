package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class d20 {
    public int MdtA4re8;
    public int NCTxEWno;
    public int OnDfzHZD;
    public boolean P7K7Inc8;
    public boolean Qr9iLBAD;
    public boolean VgvYg0wo;
    public boolean b2ZJblxo;
    public boolean eVhOlqcC;
    public boolean jb9XjC4I;
    public int k3x7lurq;
    public long ow5vqvCr;
    public int qoPGr6Ce;
    public int wxUZMvaN;

    public final int NCTxEWno() {
        return this.P7K7Inc8 ? this.qoPGr6Ce - this.NCTxEWno : this.wxUZMvaN;
    }

    public final void qoPGr6Ce(int i) {
        if ((this.MdtA4re8 & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.MdtA4re8));
    }

    public final String toString() {
        return "State{mTargetPosition=-1, mData=null, mItemCount=" + this.wxUZMvaN + ", mIsMeasuring=" + this.Qr9iLBAD + ", mPreviousLayoutItemCount=" + this.qoPGr6Ce + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.NCTxEWno + ", mStructureChanged=" + this.VgvYg0wo + ", mInPreLayout=" + this.P7K7Inc8 + ", mRunSimpleAnimations=" + this.jb9XjC4I + ", mRunPredictiveAnimations=" + this.eVhOlqcC + '}';
    }
}
