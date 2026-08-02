package com.caverock.androidsvg;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import com.caverock.androidsvg.SVG;
import com.fillr.e0;
import com.google.android.gms.internal.mlkit_vision_common.zzhh;

/* loaded from: classes4.dex */
public final class SVGAndroidRenderer$PlainTextToPath extends zzhh {
    public final /* synthetic */ int $r8$classId;
    public final Object textAsPath;
    public final /* synthetic */ e0 this$0;
    public float x;
    public final float y;

    public SVGAndroidRenderer$PlainTextToPath(e0 e0Var, float f, float f2) {
        this.$r8$classId = 1;
        this.this$0 = e0Var;
        this.textAsPath = new RectF();
        this.x = f;
        this.y = f2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzhh
    public final boolean doTextContainer(SVG.TextContainer textContainer) {
        switch (this.$r8$classId) {
            case 0:
                if (!(textContainer instanceof SVG.TextPath)) {
                    break;
                } else {
                    Log.w("SVGAndroidRenderer", "Using <textPath> elements in a clip path is not supported.");
                    break;
                }
            default:
                if (!(textContainer instanceof SVG.TextPath)) {
                    break;
                } else {
                    SVG.TextPath textPath = (SVG.TextPath) textContainer;
                    SVG.SvgElementBase resolveIRI = textContainer.document.resolveIRI(textPath.href);
                    if (resolveIRI != null) {
                        SVG.Path path = (SVG.Path) resolveIRI;
                        SVGAndroidRenderer$PathConverter sVGAndroidRenderer$PathConverter = new SVGAndroidRenderer$PathConverter(path.d);
                        Matrix matrix = path.transform;
                        Path path2 = sVGAndroidRenderer$PathConverter.path;
                        if (matrix != null) {
                            path2.transform(matrix);
                        }
                        RectF rectF = new RectF();
                        path2.computeBounds(rectF, true);
                        ((RectF) this.textAsPath).union(rectF);
                        break;
                    } else {
                        e0.error("TextPath path reference '%s' not found", textPath.href);
                        break;
                    }
                }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzhh
    public final void processText(String str) {
        String str2;
        int i = this.$r8$classId;
        Object obj = this.textAsPath;
        e0 e0Var = this.this$0;
        switch (i) {
            case 0:
                if (e0Var.visible()) {
                    Path path = new Path();
                    str2 = str;
                    ((SVGAndroidRenderer$RendererState) e0Var.c).fillPaint.getTextPath(str2, 0, str.length(), this.x, this.y, path);
                    ((Path) obj).addPath(path);
                } else {
                    str2 = str;
                }
                this.x = ((SVGAndroidRenderer$RendererState) e0Var.c).fillPaint.measureText(str2) + this.x;
                break;
            default:
                if (e0Var.visible()) {
                    Rect rect = new Rect();
                    ((SVGAndroidRenderer$RendererState) e0Var.c).fillPaint.getTextBounds(str, 0, str.length(), rect);
                    RectF rectF = new RectF(rect);
                    rectF.offset(this.x, this.y);
                    ((RectF) obj).union(rectF);
                }
                this.x = ((SVGAndroidRenderer$RendererState) e0Var.c).fillPaint.measureText(str) + this.x;
                break;
        }
    }

    public SVGAndroidRenderer$PlainTextToPath(e0 e0Var, float f, float f2, Path path) {
        this.$r8$classId = 0;
        this.this$0 = e0Var;
        this.x = f;
        this.y = f2;
        this.textAsPath = path;
    }
}
