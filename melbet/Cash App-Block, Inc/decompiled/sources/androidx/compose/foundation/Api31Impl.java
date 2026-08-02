package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public abstract class Api31Impl {
    public static EdgeEffect create(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static float getDistance(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return RecyclerView.DECELERATION_RATE;
        }
    }

    public static float onPullDistance(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return RecyclerView.DECELERATION_RATE;
        }
    }
}
