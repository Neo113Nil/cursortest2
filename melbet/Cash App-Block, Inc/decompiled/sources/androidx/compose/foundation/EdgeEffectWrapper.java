package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.IntSize;
import androidx.recyclerview.widget.RecyclerView;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class EdgeEffectWrapper {
    public EdgeEffect bottomEffect;
    public EdgeEffect bottomEffectNegation;
    public final Context context;
    public final int glowColor;
    public EdgeEffect leftEffect;
    public EdgeEffect leftEffectNegation;
    public EdgeEffect rightEffect;
    public EdgeEffect rightEffectNegation;
    public long size = 0;
    public EdgeEffect topEffect;
    public EdgeEffect topEffectNegation;

    public EdgeEffectWrapper(Context context, int i) {
        this.context = context;
        this.glowColor = i;
    }

    public static boolean isAnimating(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean isStretched(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !(CanvasKt.getDistanceCompat(edgeEffect) == RecyclerView.DECELERATION_RATE);
    }

    public final EdgeEffect createEdgeEffect(Orientation orientation) {
        EdgeEffect create = CanvasKt.create(this.context);
        create.setColor(this.glowColor);
        if (!IntSize.m1055equalsimpl0(this.size, 0L)) {
            Orientation orientation2 = Orientation.Vertical;
            long j = this.size;
            if (orientation == orientation2) {
                create.setSize((int) (j >> 32), (int) (j & BodyPartID.bodyIdMax));
                return create;
            }
            create.setSize((int) (BodyPartID.bodyIdMax & j), (int) (j >> 32));
        }
        return create;
    }

    public final EdgeEffect getOrCreateBottomEffect() {
        EdgeEffect edgeEffect = this.bottomEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect createEdgeEffect = createEdgeEffect(Orientation.Vertical);
        this.bottomEffect = createEdgeEffect;
        return createEdgeEffect;
    }

    public final EdgeEffect getOrCreateLeftEffect() {
        EdgeEffect edgeEffect = this.leftEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect createEdgeEffect = createEdgeEffect(Orientation.Horizontal);
        this.leftEffect = createEdgeEffect;
        return createEdgeEffect;
    }

    public final EdgeEffect getOrCreateRightEffect() {
        EdgeEffect edgeEffect = this.rightEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect createEdgeEffect = createEdgeEffect(Orientation.Horizontal);
        this.rightEffect = createEdgeEffect;
        return createEdgeEffect;
    }

    public final EdgeEffect getOrCreateTopEffect() {
        EdgeEffect edgeEffect = this.topEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect createEdgeEffect = createEdgeEffect(Orientation.Vertical);
        this.topEffect = createEdgeEffect;
        return createEdgeEffect;
    }
}
