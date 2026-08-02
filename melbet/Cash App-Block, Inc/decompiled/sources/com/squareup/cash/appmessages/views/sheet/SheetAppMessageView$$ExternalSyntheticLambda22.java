package com.squareup.cash.appmessages.views.sheet;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.appmessages.sheet.SheetAppMessageModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.util.cash.ColorsKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class SheetAppMessageView$$ExternalSyntheticLambda22 implements Function3 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ SheetAppMessageModel.Loaded f$0;

    public /* synthetic */ SheetAppMessageView$$ExternalSyntheticLambda22(SheetAppMessageModel.Loaded loaded) {
        this.f$0 = loaded;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        int i = this.$r8$classId;
        SheetAppMessageModel.Loaded loaded = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, loaded.primaryCta.text, (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    String str = loaded.primaryCta.text;
                    if (loaded.isSolid) {
                        gapComposer2.startReplaceGroup(-2109799086);
                        long m2982getTextColorXeAY9LY = SheetAppMessageView.m2982getTextColorXeAY9LY(loaded, gapComposer2, 0);
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                        Colors colors = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        long j2 = colors.semantic.text.standard;
                        Colors colors2 = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        j = ColorsKt.m3988contrastAdjustedColorysEtTa8(j2, colors2.semantic.text.inverse, m2982getTextColorXeAY9LY);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-2109527123);
                        gapComposer2.end(false);
                        j = Color.Black;
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, j, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SheetAppMessageView$$ExternalSyntheticLambda22(SheetAppMessageModel.Loaded loaded, SheetAppMessageView sheetAppMessageView) {
        this.f$0 = loaded;
    }
}
