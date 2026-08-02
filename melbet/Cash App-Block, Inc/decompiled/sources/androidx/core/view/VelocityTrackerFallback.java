package androidx.core.view;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class VelocityTrackerFallback {
    public final float[] mMovements = new float[20];
    public final long[] mEventTimes = new long[20];
    public float mLastComputedVelocity = RecyclerView.DECELERATION_RATE;
    public int mDataPointsBufferSize = 0;
    public int mDataPointsBufferLastUsedIndex = 0;
}
