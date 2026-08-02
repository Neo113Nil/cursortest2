package androidx.core.widget;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class AutoScrollHelper$ClampedScroller {
    public long mDeltaTime;
    public int mEffectiveRampDown;
    public int mRampDownDuration;
    public int mRampUpDuration;
    public long mStartTime;
    public long mStopTime;
    public float mStopValue;
    public float mTargetVelocityX;
    public float mTargetVelocityY;

    public final float getValueAt(long j) {
        if (j < this.mStartTime) {
            return RecyclerView.DECELERATION_RATE;
        }
        long j2 = this.mStopTime;
        if (j2 < 0 || j < j2) {
            return ListViewAutoScrollHelper.constrain((j - r0) / this.mRampUpDuration, RecyclerView.DECELERATION_RATE, 1.0f) * 0.5f;
        }
        float f = this.mStopValue;
        return (ListViewAutoScrollHelper.constrain((j - j2) / this.mEffectiveRampDown, RecyclerView.DECELERATION_RATE, 1.0f) * f) + (1.0f - f);
    }
}
