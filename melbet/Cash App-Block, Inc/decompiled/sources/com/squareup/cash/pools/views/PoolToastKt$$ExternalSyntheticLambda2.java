package com.squareup.cash.pools.views;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.RealToastIconScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final /* synthetic */ class PoolToastKt$$ExternalSyntheticLambda2 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Icons f$0;

    public /* synthetic */ PoolToastKt$$ExternalSyntheticLambda2(Icons icons, int i) {
        this.$r8$classId = i;
        this.f$0 = icons;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Icons icons = this.f$0;
        switch (i) {
            case 0:
                RealToastIconScope realToastIconScope = (RealToastIconScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                realToastIconScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(realToastIconScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    realToastIconScope.Icon(icons, null, gapComposer, ((intValue << 9) & 7168) | MLKEMEngine.KyberPolyBytes);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f), 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Trace.m1191Iconww6aTOc(this.f$0, (String) null, m302paddingqDBjuR0$default, colors.semantic.icon.brand, gapComposer2, 432, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                RealToastIconScope realToastIconScope2 = (RealToastIconScope) obj;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                realToastIconScope2.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((GapComposer) composer3).changed(realToastIconScope2) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                    realToastIconScope2.Icon(icons, null, gapComposer3, ((intValue3 << 9) & 7168) | MLKEMEngine.KyberPolyBytes);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
