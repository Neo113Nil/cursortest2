package com.squareup.cash.retro.views;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.shopping.views.ShopEmptyViewKt$$ExternalSyntheticLambda1;
import com.squareup.util.compose.ScaledSizeKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes7.dex */
public final /* synthetic */ class SelectPaymentPlanViewKt$$ExternalSyntheticLambda20 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ SelectPaymentPlanViewKt$$ExternalSyntheticLambda20(String str, boolean z) {
        this.$r8$classId = 0;
        this.f$0 = str;
        this.f$1 = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        String str = this.f$0;
        boolean z = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    AnnotatedString.Builder builder = new AnnotatedString.Builder();
                    builder.append(str);
                    if (z) {
                        KeyMappingKt.appendInlineContent(builder, "info_icon", "�");
                    }
                    AnnotatedString annotatedString = builder.toAnnotatedString();
                    MapBuilder mapBuilder = new MapBuilder();
                    if (z) {
                        mapBuilder.put("info_icon", SelectPaymentPlanViewKt.inlineInfoIcon(4));
                    }
                    Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 2046, 0L, (Composer) gapComposer, (Modifier) null, annotatedString, (TextStyle) null, (TextLineBalancing) null, (Map) mapBuilder.build(), (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (!gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    gapComposer2.skipToGroupEnd();
                } else if (z) {
                    gapComposer2.startReplaceGroup(444199542);
                    TextStyle textStyle = (TextStyle) gapComposer2.consume(ArcadeThemeKt.LocalTextStyle);
                    if (textStyle == null) {
                        gapComposer2.startReplaceGroup(-1100573765);
                        textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                    } else {
                        gapComposer2.startReplaceGroup(-1100574912);
                    }
                    gapComposer2.end(false);
                    ProgressCircularKt.ProgressCircular(0, 0, gapComposer2, ScaledSizeKt.m3994scaleHeightToTextHeightr9BaKPg(Modifier.Companion.$$INSTANCE, textStyle.paragraphStyle.lineHeight, gapComposer2));
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(444364617);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, this.f$0, (Map) null, (Function1) null, false);
                    gapComposer2.end(false);
                }
                return Unit.INSTANCE;
            default:
                Modifier modifier = (Modifier) obj;
                ((Integer) obj3).getClass();
                modifier.getClass();
                GapComposer gapComposer3 = (GapComposer) ((Composer) obj2);
                gapComposer3.startReplaceGroup(1787698759);
                String stringResource = Room.stringResource(gapComposer3, R.string.default_error_message);
                if (z) {
                    gapComposer3.startReplaceGroup(-260634017);
                    boolean changed = gapComposer3.changed(str) | gapComposer3.changed(stringResource);
                    Object rememberedValue = gapComposer3.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new ShopEmptyViewKt$$ExternalSyntheticLambda1(str, stringResource, 1);
                        gapComposer3.updateRememberedValue(rememberedValue);
                    }
                    modifier = SemanticsModifierKt.semantics(modifier, false, (Function1) rememberedValue);
                    gapComposer3.end(false);
                } else {
                    gapComposer3.startReplaceGroup(-260539033);
                    gapComposer3.end(false);
                }
                gapComposer3.end(false);
                return modifier;
        }
    }

    public /* synthetic */ SelectPaymentPlanViewKt$$ExternalSyntheticLambda20(String str, int i, boolean z) {
        this.$r8$classId = i;
        this.f$1 = z;
        this.f$0 = str;
    }
}
