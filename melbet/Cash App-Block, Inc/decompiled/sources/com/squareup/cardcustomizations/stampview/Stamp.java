package com.squareup.cardcustomizations.stampview;

import android.graphics.Path;
import android.graphics.RectF;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.yf$$ExternalSyntheticLambda2;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.androidsvg.SVG$Box;
import com.squareup.cash.androidsvg.SVG$Length;
import com.squareup.cash.androidsvg.SVG$Svg;
import com.squareup.cash.androidsvg.SVGAndroidRenderer;
import com.squareup.cash.androidsvg.SVGParseException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class Stamp {
    public final RectF canvasBounds;
    public final String name;
    public final Path path;
    public final Lazy pathBounds$delegate;
    public final Path renderedPath;
    public final String svgString;
    public final RectF transformedBounds;

    public Stamp(String str, String str2) {
        Path path;
        RectF rectF;
        float floatValue$1;
        str.getClass();
        this.name = str;
        this.svgString = str2;
        this.transformedBounds = new RectF();
        this.renderedPath = new Path();
        String str3 = this.svgString;
        if (str3 != null) {
            try {
                JCAContext fromString = JCAContext.getFromString(str3);
                this.svgString = str3;
                SVG$Length sVG$Length = ((SVG$Svg) fromString.provider).width;
                if (sVG$Length != null) {
                    float floatValue$12 = sVG$Length.floatValue$1();
                    SVG$Svg sVG$Svg = (SVG$Svg) fromString.provider;
                    SVG$Box sVG$Box = sVG$Svg.viewBox;
                    if (sVG$Box != null) {
                        floatValue$1 = (sVG$Box.height * floatValue$12) / sVG$Box.width;
                    } else {
                        SVG$Length sVG$Length2 = sVG$Svg.height;
                        floatValue$1 = sVG$Length2 != null ? sVG$Length2.floatValue$1() : floatValue$12;
                    }
                    Math.ceil(floatValue$12);
                    Math.ceil(floatValue$1);
                    SVGAndroidRenderer sVGAndroidRenderer = new SVGAndroidRenderer();
                    SVG$Svg sVG$Svg2 = (SVG$Svg) fromString.provider;
                    if (sVG$Svg2 == null) {
                        Log.w("SVGAndroidRenderer", "Nothing to render. Document is empty.");
                    } else {
                        sVGAndroidRenderer.render(sVG$Svg2, sVG$Svg2.width, sVG$Svg2.height);
                    }
                    path = (Path) sVGAndroidRenderer.fullPath;
                } else {
                    SVGAndroidRenderer sVGAndroidRenderer2 = new SVGAndroidRenderer();
                    SVG$Svg sVG$Svg3 = (SVG$Svg) fromString.provider;
                    if (sVG$Svg3 == null) {
                        Log.w("SVGAndroidRenderer", "Nothing to render. Document is empty.");
                    } else {
                        sVGAndroidRenderer2.render(sVG$Svg3, sVG$Svg3.width, sVG$Svg3.height);
                    }
                    path = (Path) sVGAndroidRenderer2.fullPath;
                }
                path.getClass();
                this.path = path;
                if (((SVG$Svg) fromString.provider) == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("SVG document is empty");
                    throw null;
                }
                if (fromString.getDocumentDimensions().width == -1.0f) {
                    if (((SVG$Svg) fromString.provider) == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("SVG document is empty");
                        throw null;
                    }
                    if (fromString.getDocumentDimensions().height == -1.0f) {
                        rectF = new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, fromString.getDocumentViewBox().width(), fromString.getDocumentViewBox().height());
                        this.canvasBounds = rectF;
                    }
                }
                if (((SVG$Svg) fromString.provider) == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("SVG document is empty");
                    throw null;
                }
                float f = fromString.getDocumentDimensions().width;
                if (((SVG$Svg) fromString.provider) == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("SVG document is empty");
                    throw null;
                }
                rectF = new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f, fromString.getDocumentDimensions().height);
                this.canvasBounds = rectF;
            } catch (SVGParseException e) {
                Path$$ExternalSyntheticBUOutline0.m((Throwable) e);
                throw null;
            }
        }
        this.pathBounds$delegate = LazyKt.lazy(new yf$$ExternalSyntheticLambda2(this, 13));
    }

    public final RectF getCanvasBounds() {
        RectF rectF = this.canvasBounds;
        if (rectF != null) {
            return rectF;
        }
        Intrinsics.throwUninitializedPropertyAccessException("canvasBounds");
        throw null;
    }
}
