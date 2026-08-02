package com.squareup.cash.nearby.views;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class ChaserState {
    public int cols;
    public int halfCols;
    public int halfRows;
    public float[] intensities;
    public int rows;

    public final void reset() {
        float[] fArr = this.intensities;
        int length = fArr.length;
        fArr.getClass();
        Arrays.fill(fArr, 0, length, RecyclerView.DECELERATION_RATE);
    }
}
