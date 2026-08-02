package com.squareup.cash.borrow.ui.util;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda9;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class FillableBackgroundKt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ float f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ long f$2;

    public /* synthetic */ FillableBackgroundKt$$ExternalSyntheticLambda0(float f, RoundedCornerShape roundedCornerShape, long j) {
        this.f$0 = f;
        this.f$1 = roundedCornerShape;
        this.f$2 = j;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Object obj4 = this.f$1;
        switch (i) {
            case 0:
                RoundedCornerShape roundedCornerShape = (RoundedCornerShape) obj4;
                Modifier modifier = (Modifier) obj;
                ((Integer) obj3).getClass();
                modifier.getClass();
                GapComposer gapComposer = (GapComposer) ((Composer) obj2);
                gapComposer.startReplaceGroup(357597318);
                LayoutDirection layoutDirection = (LayoutDirection) gapComposer.consume(CompositionLocalsKt.LocalLayoutDirection);
                Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
                float f = this.f$0;
                boolean changed = gapComposer.changed(f) | gapComposer.changed(roundedCornerShape) | gapComposer.changed(layoutDirection.ordinal()) | gapComposer.changed(density);
                long j = this.f$2;
                boolean changed2 = gapComposer.changed(j) | changed;
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed2 || rememberedValue == Composer.Companion.Empty) {
                    TabContentViewKt$$ExternalSyntheticLambda9 tabContentViewKt$$ExternalSyntheticLambda9 = new TabContentViewKt$$ExternalSyntheticLambda9(f, roundedCornerShape, layoutDirection, density, j);
                    gapComposer.updateRememberedValue(tabContentViewKt$$ExternalSyntheticLambda9);
                    rememberedValue = tabContentViewKt$$ExternalSyntheticLambda9;
                }
                Modifier drawBehind = ClipKt.drawBehind(modifier, (Function1) rememberedValue);
                gapComposer.end(false);
                return drawBehind;
            default:
                Dp dp = (Dp) obj4;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(SizeKt.m287sizeVpY3zN4(Modifier.Companion.$$INSTANCE, dp.value, this.f$0), this.f$2, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(4.0f)), gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ FillableBackgroundKt$$ExternalSyntheticLambda0(Dp dp, float f, long j) {
        this.f$1 = dp;
        this.f$0 = f;
        this.f$2 = j;
    }
}
