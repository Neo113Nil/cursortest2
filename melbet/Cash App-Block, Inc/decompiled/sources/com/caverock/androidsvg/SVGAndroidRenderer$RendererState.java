package com.caverock.androidsvg;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.Log;
import com.caverock.androidsvg.SVG;
import com.plaid.internal.EnumC0170g;

/* loaded from: classes4.dex */
public final class SVGAndroidRenderer$RendererState {
    public final Paint fillPaint;
    public boolean hasFill;
    public boolean hasStroke;
    public boolean spacePreserve;
    public final Paint strokePaint;
    public final SVG.Style style;
    public SVG.Box viewBox;
    public SVG.Box viewPort;

    public SVGAndroidRenderer$RendererState(SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState) {
        this.hasFill = sVGAndroidRenderer$RendererState.hasFill;
        this.hasStroke = sVGAndroidRenderer$RendererState.hasStroke;
        this.fillPaint = new Paint(sVGAndroidRenderer$RendererState.fillPaint);
        this.strokePaint = new Paint(sVGAndroidRenderer$RendererState.strokePaint);
        SVG.Box box = sVGAndroidRenderer$RendererState.viewPort;
        if (box != null) {
            this.viewPort = new SVG.Box(box);
        }
        SVG.Box box2 = sVGAndroidRenderer$RendererState.viewBox;
        if (box2 != null) {
            this.viewBox = new SVG.Box(box2);
        }
        this.spacePreserve = sVGAndroidRenderer$RendererState.spacePreserve;
        try {
            this.style = (SVG.Style) sVGAndroidRenderer$RendererState.style.clone();
        } catch (CloneNotSupportedException e) {
            Log.e("SVGAndroidRenderer", "Unexpected clone error", e);
            this.style = SVG.Style.getDefaultStyle();
        }
    }

    public SVGAndroidRenderer$RendererState() {
        Paint paint = new Paint();
        this.fillPaint = paint;
        paint.setFlags(EnumC0170g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE);
        paint.setHinting(0);
        paint.setStyle(Paint.Style.FILL);
        Typeface typeface = Typeface.DEFAULT;
        paint.setTypeface(typeface);
        Paint paint2 = new Paint();
        this.strokePaint = paint2;
        paint2.setFlags(EnumC0170g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE);
        paint2.setHinting(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setTypeface(typeface);
        this.style = SVG.Style.getDefaultStyle();
    }
}
