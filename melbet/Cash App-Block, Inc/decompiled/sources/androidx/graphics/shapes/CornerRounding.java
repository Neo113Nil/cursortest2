package androidx.graphics.shapes;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class CornerRounding {
    public static final CornerRounding Unrounded = new CornerRounding(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
    public final float radius;
    public final float smoothing;

    public CornerRounding(float f, float f2) {
        this.radius = f;
        this.smoothing = f2;
    }
}
