package com.squareup.cash.card.onboarding;

import android.content.Context;
import android.view.TextureView;
import androidx.compose.ui.geometry.Offset;
import com.squareup.cash.card.onboarding.opengl.renderer.HeatRenderer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoodHeatEffectKt$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ HeatRenderer f$0;

    public /* synthetic */ MoodHeatEffectKt$$ExternalSyntheticLambda2(HeatRenderer heatRenderer, int i) {
        this.$r8$classId = i;
        this.f$0 = heatRenderer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        HeatRenderer heatRenderer = this.f$0;
        switch (i) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                TextureView textureView = new TextureView(context);
                textureView.setSurfaceTextureListener(heatRenderer);
                textureView.setOpaque(false);
                return textureView;
            default:
                Offset offset = (Offset) obj;
                heatRenderer.applyHeat(Float.intBitsToFloat((int) (offset.packedValue >> 32)), Float.intBitsToFloat((int) (offset.packedValue & BodyPartID.bodyIdMax)));
                return Unit.INSTANCE;
        }
    }
}
