package androidx.transition;

import android.view.View;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class TransitionValues {
    public final View view;
    public final HashMap values = new HashMap();
    public final ArrayList mTargetedTransitions = new ArrayList();

    public TransitionValues(View view) {
        this.view = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TransitionValues)) {
            return false;
        }
        TransitionValues transitionValues = (TransitionValues) obj;
        return this.view == transitionValues.view && this.values.equals(transitionValues.values);
    }

    public final int hashCode() {
        return this.values.hashCode() + (this.view.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        m108m.append(this.view);
        m108m.append("\n");
        String concat = m108m.toString().concat("    values:");
        HashMap hashMap = this.values;
        for (String str : hashMap.keySet()) {
            concat = concat + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return concat;
    }
}
