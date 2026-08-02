package com.squareup.cash.androidsvg;

import android.graphics.Matrix;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class SVG$GraphicsElement implements SVG$HasTransform {
    public SVG$Box boundingBox;
    public SVG$GraphicsElement parent;
    public Object transform;

    public SVG$GraphicsElement() {
        this(false);
        this.transform = new ArrayList();
    }

    public void addChild(SVG$GraphicsElement sVG$GraphicsElement) {
        ((ArrayList) this.transform).add(sVG$GraphicsElement);
    }

    @Override // com.squareup.cash.androidsvg.SVG$HasTransform
    public void setTransform(Matrix matrix) {
        this.transform = matrix;
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    public SVG$GraphicsElement(boolean z) {
        this.boundingBox = null;
    }
}
