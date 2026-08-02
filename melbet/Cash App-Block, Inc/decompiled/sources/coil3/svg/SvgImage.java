package coil3.svg;

import android.graphics.Canvas;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import coil3.Image;
import coil3.svg.internal.AndroidSvg;
import com.caverock.androidsvg.CSSParser;
import com.caverock.androidsvg.PreserveAspectRatio;
import com.caverock.androidsvg.SVG;
import com.caverock.androidsvg.SVGAndroidRenderer$RendererState;
import com.fillr.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/* loaded from: classes3.dex */
public final class SvgImage implements Image {
    public final int height;
    public final AndroidSvg renderOptions;
    public final SVG svg;
    public final int width;

    public SvgImage(SVG svg, AndroidSvg androidSvg, int i, int i2) {
        this.svg = svg;
        this.renderOptions = androidSvg;
        this.width = i;
        this.height = i2;
    }

    @Override // coil3.Image
    public final void draw(Canvas canvas) {
        ArrayList arrayList;
        SVG svg = this.svg;
        svg.getClass();
        CSSParser.Ruleset ruleset = (CSSParser.Ruleset) svg.cssRules;
        AndroidSvg androidSvg = this.renderOptions;
        if (androidSvg == null) {
            androidSvg = new AndroidSvg(24);
        }
        if (((SVG.Box) androidSvg.renderOptions) == null) {
            androidSvg.renderOptions = new SVG.Box(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, canvas.getWidth(), canvas.getHeight());
        }
        e0 e0Var = new e0(1);
        e0Var.a = canvas;
        e0Var.b = svg;
        SVG.Svg svg2 = (SVG.Svg) svg.rootElement;
        if (svg2 == null) {
            Log.w("SVGAndroidRenderer", "Nothing to render. Document is empty.");
            return;
        }
        SVG.Box box = svg2.viewBox;
        PreserveAspectRatio preserveAspectRatio = svg2.preserveAspectRatio;
        CSSParser.Ruleset ruleset2 = (CSSParser.Ruleset) androidSvg.svg;
        if (ruleset2 != null) {
            ArrayList arrayList2 = ruleset2.rules;
            if ((arrayList2 != null ? arrayList2.size() : 0) > 0) {
                ruleset.addAll((CSSParser.Ruleset) androidSvg.svg);
            }
        }
        e0Var.c = new SVGAndroidRenderer$RendererState();
        e0Var.h = new Stack();
        e0Var.updateStyle((SVGAndroidRenderer$RendererState) e0Var.c, SVG.Style.getDefaultStyle());
        SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState = (SVGAndroidRenderer$RendererState) e0Var.c;
        sVGAndroidRenderer$RendererState.viewPort = null;
        sVGAndroidRenderer$RendererState.spacePreserve = false;
        ((Stack) e0Var.h).push(new SVGAndroidRenderer$RendererState(sVGAndroidRenderer$RendererState));
        e0Var.f = new Stack();
        e0Var.i = new Stack();
        Boolean bool = svg2.spacePreserve;
        if (bool != null) {
            ((SVGAndroidRenderer$RendererState) e0Var.c).spacePreserve = bool.booleanValue();
        }
        e0Var.statePush();
        SVG.Box box2 = new SVG.Box((SVG.Box) androidSvg.renderOptions);
        SVG.Length length = svg2.width;
        if (length != null) {
            box2.width = length.floatValue(e0Var, box2.width);
        }
        SVG.Length length2 = svg2.height;
        if (length2 != null) {
            box2.height = length2.floatValue(e0Var, box2.height);
        }
        e0Var.render(svg2, box2, box, preserveAspectRatio);
        e0Var.statePop();
        CSSParser.Ruleset ruleset3 = (CSSParser.Ruleset) androidSvg.svg;
        if (ruleset3 != null) {
            ArrayList arrayList3 = ruleset3.rules;
            if ((arrayList3 != null ? arrayList3.size() : 0) <= 0 || (arrayList = ruleset.rules) == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((CSSParser.Rule) it.next()).source == 2) {
                    it.remove();
                }
            }
        }
    }

    @Override // coil3.Image
    public final int getHeight() {
        return this.height;
    }

    @Override // coil3.Image
    public final boolean getShareable() {
        return true;
    }

    @Override // coil3.Image
    public final long getSize() {
        return 2048L;
    }

    @Override // coil3.Image
    public final int getWidth() {
        return this.width;
    }
}
