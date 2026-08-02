package com.caverock.androidsvg;

import android.graphics.Path;
import com.caverock.androidsvg.SVG;
import com.fillr.e0;

/* loaded from: classes4.dex */
public final class SVGAndroidRenderer$PathConverter implements SVG.PathInterface {
    public float lastX;
    public float lastY;
    public final Path path = new Path();

    public SVGAndroidRenderer$PathConverter(SVG.PathDefinition pathDefinition) {
        if (pathDefinition == null) {
            return;
        }
        pathDefinition.enumeratePath(this);
    }

    @Override // com.caverock.androidsvg.SVG.PathInterface
    public final void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        e0.access$700(this.lastX, this.lastY, f, f2, f3, z, z2, f4, f5, this);
        this.lastX = f4;
        this.lastY = f5;
    }

    @Override // com.caverock.androidsvg.SVG.PathInterface
    public final void close() {
        this.path.close();
    }

    @Override // com.caverock.androidsvg.SVG.PathInterface
    public final void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
        this.path.cubicTo(f, f2, f3, f4, f5, f6);
        this.lastX = f5;
        this.lastY = f6;
    }

    @Override // com.caverock.androidsvg.SVG.PathInterface
    public final void lineTo(float f, float f2) {
        this.path.lineTo(f, f2);
        this.lastX = f;
        this.lastY = f2;
    }

    @Override // com.caverock.androidsvg.SVG.PathInterface
    public final void moveTo(float f, float f2) {
        this.path.moveTo(f, f2);
        this.lastX = f;
        this.lastY = f2;
    }

    @Override // com.caverock.androidsvg.SVG.PathInterface
    public final void quadTo(float f, float f2, float f3, float f4) {
        this.path.quadTo(f, f2, f3, f4);
        this.lastX = f3;
        this.lastY = f4;
    }
}
