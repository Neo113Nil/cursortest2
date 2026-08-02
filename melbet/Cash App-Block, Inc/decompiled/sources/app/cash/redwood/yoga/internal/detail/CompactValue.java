package app.cash.redwood.yoga.internal.detail;

import app.cash.redwood.yoga.internal.YGValue;
import app.cash.redwood.yoga.internal.enums.YGUnit;
import com.squareup.cash.androidsvg.SVGAndroidRenderer;

/* loaded from: classes3.dex */
public final class CompactValue {
    public final SVGAndroidRenderer payload_;
    public final boolean undefined;

    public CompactValue() {
        this.undefined = true;
        this.payload_ = new SVGAndroidRenderer(Float.NaN, YGUnit.YGUnitUndefined);
    }

    public final YGValue convertToYgValue() {
        SVGAndroidRenderer sVGAndroidRenderer = this.payload_;
        return new YGValue(sVGAndroidRenderer.dpi, (YGUnit) sVGAndroidRenderer.fullPath);
    }

    public final boolean isUndefined() {
        if (this.undefined) {
            return true;
        }
        SVGAndroidRenderer sVGAndroidRenderer = this.payload_;
        YGUnit yGUnit = (YGUnit) sVGAndroidRenderer.fullPath;
        return (yGUnit == YGUnit.YGUnitAuto || yGUnit == YGUnit.YGUnitPoint || yGUnit == YGUnit.YGUnitPercent || !Float.isNaN(sVGAndroidRenderer.dpi)) ? false : true;
    }

    public CompactValue(SVGAndroidRenderer sVGAndroidRenderer) {
        this.payload_ = sVGAndroidRenderer;
    }
}
