package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.util.Strings;

/* loaded from: classes3.dex */
public final class GlowEdgeEffectCompat extends EdgeEffect {
    public float oppositeReleaseDelta;
    public final float oppositeReleaseDeltaThreshold;

    public GlowEdgeEffectCompat(Context context) {
        super(context);
        this.oppositeReleaseDeltaThreshold = Strings.Density(context).density * 1.0f;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        this.oppositeReleaseDelta = RecyclerView.DECELERATION_RATE;
        super.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        this.oppositeReleaseDelta = RecyclerView.DECELERATION_RATE;
        super.onPull(f, f2);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.oppositeReleaseDelta = RecyclerView.DECELERATION_RATE;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        this.oppositeReleaseDelta = RecyclerView.DECELERATION_RATE;
        super.onPull(f);
    }
}
