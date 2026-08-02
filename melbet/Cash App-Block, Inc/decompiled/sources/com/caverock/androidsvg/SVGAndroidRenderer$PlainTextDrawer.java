package com.caverock.androidsvg;

import android.graphics.Canvas;
import com.fillr.e0;
import com.google.android.gms.internal.mlkit_vision_common.zzhh;

/* loaded from: classes4.dex */
public class SVGAndroidRenderer$PlainTextDrawer extends zzhh {
    public final /* synthetic */ e0 this$0;
    public float x;
    public float y;

    public SVGAndroidRenderer$PlainTextDrawer(e0 e0Var, float f, float f2) {
        this.this$0 = e0Var;
        this.x = f;
        this.y = f2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzhh
    public void processText(String str) {
        e0 e0Var = this.this$0;
        Canvas canvas = (Canvas) e0Var.a;
        if (e0Var.visible()) {
            SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState = (SVGAndroidRenderer$RendererState) e0Var.c;
            if (sVGAndroidRenderer$RendererState.hasFill) {
                canvas.drawText(str, this.x, this.y, sVGAndroidRenderer$RendererState.fillPaint);
            }
            SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState2 = (SVGAndroidRenderer$RendererState) e0Var.c;
            if (sVGAndroidRenderer$RendererState2.hasStroke) {
                canvas.drawText(str, this.x, this.y, sVGAndroidRenderer$RendererState2.strokePaint);
            }
        }
        this.x = ((SVGAndroidRenderer$RendererState) e0Var.c).fillPaint.measureText(str) + this.x;
    }
}
