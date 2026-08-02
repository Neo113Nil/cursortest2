package androidx.compose.foundation.gestures;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class DraggableAnchorsConfig {
    public final ArrayList keys = new ArrayList();
    public float[] positions;

    public DraggableAnchorsConfig() {
        float[] fArr = new float[5];
        for (int i = 0; i < 5; i++) {
            fArr[i] = Float.NaN;
        }
        this.positions = fArr;
    }

    public final void at(Object obj, float f) {
        ArrayList arrayList = this.keys;
        arrayList.add(obj);
        if (this.positions.length < arrayList.size()) {
            this.positions = Arrays.copyOf(this.positions, arrayList.size() + 2);
        }
        this.positions[arrayList.size() - 1] = f;
    }
}
