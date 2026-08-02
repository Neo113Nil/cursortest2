package com.caverock.androidsvg;

import androidx.recyclerview.widget.RecyclerView;
import com.fillr.e0;
import com.google.android.gms.internal.mlkit_vision_common.zzhh;

/* loaded from: classes4.dex */
public final class SVGAndroidRenderer$TextWidthCalculator extends zzhh {
    public final /* synthetic */ e0 this$0;
    public float x = RecyclerView.DECELERATION_RATE;

    public SVGAndroidRenderer$TextWidthCalculator(e0 e0Var) {
        this.this$0 = e0Var;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzhh
    public final void processText(String str) {
        this.x = ((SVGAndroidRenderer$RendererState) this.this$0.c).fillPaint.measureText(str) + this.x;
    }
}
