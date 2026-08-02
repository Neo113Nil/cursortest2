package androidx.compose.material;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class MapDraggableAnchors {
    public final Map anchors;

    public MapDraggableAnchors(Map map) {
        this.anchors = map;
    }

    public final Object closestAnchor(float f, boolean z) {
        Object next;
        Iterator it = this.anchors.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float floatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                float f2 = z ? floatValue - f : f - floatValue;
                if (f2 < RecyclerView.DECELERATION_RATE) {
                    f2 = Float.POSITIVE_INFINITY;
                }
                do {
                    Object next2 = it.next();
                    float floatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    float f3 = z ? floatValue2 - f : f - floatValue2;
                    if (f3 < RecyclerView.DECELERATION_RATE) {
                        f3 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f2, f3) > 0) {
                        next = next2;
                        f2 = f3;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapDraggableAnchors)) {
            return false;
        }
        return Intrinsics.areEqual(this.anchors, ((MapDraggableAnchors) obj).anchors);
    }

    public final int hashCode() {
        return this.anchors.hashCode() * 31;
    }

    public final float positionOf(Object obj) {
        Float f = (Float) this.anchors.get(obj);
        if (f != null) {
            return f.floatValue();
        }
        return Float.NaN;
    }

    public final String toString() {
        return "MapDraggableAnchors(" + this.anchors + ')';
    }

    public final Object closestAnchor(float f) {
        Object next;
        Iterator it = this.anchors.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float abs = Math.abs(f - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    Object next2 = it.next();
                    float abs2 = Math.abs(f - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(abs, abs2) > 0) {
                        next = next2;
                        abs = abs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }
}
