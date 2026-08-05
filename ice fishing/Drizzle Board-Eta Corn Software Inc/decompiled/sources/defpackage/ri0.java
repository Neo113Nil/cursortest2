package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ri0 extends pi0 {
    public ri0(wi0 wi0Var, WindowInsets windowInsets) {
        super(wi0Var, windowInsets);
    }

    @Override // defpackage.ji0, defpackage.si0
    public List<Rect> P7K7Inc8(int i) {
        List<Rect> boundingRectsIgnoringVisibility;
        boundingRectsIgnoringVisibility = this.MdtA4re8.getBoundingRectsIgnoringVisibility(vi0.qoPGr6Ce(i));
        return boundingRectsIgnoringVisibility;
    }

    @Override // defpackage.ji0, defpackage.si0
    public List<Rect> VgvYg0wo(int i) {
        List<Rect> boundingRects;
        boundingRects = this.MdtA4re8.getBoundingRects(vi0.qoPGr6Ce(i));
        return boundingRects;
    }

    @Override // defpackage.ji0, defpackage.si0
    public void lDXGDhIF() {
    }
}
