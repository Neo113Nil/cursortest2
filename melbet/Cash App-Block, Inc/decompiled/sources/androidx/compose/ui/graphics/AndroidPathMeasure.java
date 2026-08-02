package androidx.compose.ui.graphics;

import android.graphics.Path;
import android.graphics.PathMeasure;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class AndroidPathMeasure {
    public final PathMeasure internalPathMeasure;

    public AndroidPathMeasure(PathMeasure pathMeasure) {
        this.internalPathMeasure = pathMeasure;
    }

    public final float getLength() {
        return this.internalPathMeasure.getLength();
    }

    public final void getSegment(float f, float f2, AndroidPath androidPath) {
        if (androidPath == null) {
            a$$ExternalSyntheticBUOutline0.m("Unable to obtain android.graphics.Path");
        } else {
            this.internalPathMeasure.getSegment(f, f2, androidPath.internalPath, true);
        }
    }

    public final void setPath(AndroidPath androidPath) {
        Path path;
        if (androidPath == null) {
            path = null;
        } else {
            if (!(androidPath instanceof AndroidPath)) {
                a$$ExternalSyntheticBUOutline0.m("Unable to obtain android.graphics.Path");
                return;
            }
            path = androidPath.internalPath;
        }
        this.internalPathMeasure.setPath(path, false);
    }
}
