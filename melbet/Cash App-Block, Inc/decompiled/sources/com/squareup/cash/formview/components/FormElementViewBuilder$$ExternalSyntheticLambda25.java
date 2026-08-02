package com.squareup.cash.formview.components;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormDividerKt;
import com.squareup.protos.franklin.api.FormBlocker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class FormElementViewBuilder$$ExternalSyntheticLambda25 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FormBlocker.Element.DividerElement f$0;

    public /* synthetic */ FormElementViewBuilder$$ExternalSyntheticLambda25(FormBlocker.Element.DividerElement dividerElement, int i) {
        this.$r8$classId = 2;
        this.f$0 = dividerElement;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j;
        float f;
        int i = this.$r8$classId;
        FormBlocker.Element.DividerElement dividerElement = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeFormDividerKt.ArcadeFormDivider(dividerElement, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                int intValue2 = num.intValue();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    FormBlocker.Element.DividerElement.DividerStyle dividerStyle = dividerElement.style;
                    int i2 = dividerStyle == null ? -1 : ArcadeFormDividerKt.WhenMappings.$EnumSwitchMapping$0[dividerStyle.ordinal()];
                    if (i2 == -1 || i2 == 1) {
                        gapComposer2.startReplaceGroup(360352891);
                        Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        j = colors.component.ui.divider.border;
                        gapComposer2.end(false);
                    } else if (i2 == 2) {
                        gapComposer2.startReplaceGroup(360354336);
                        gapComposer2.end(false);
                        j = Color.Transparent;
                    } else {
                        if (i2 != 3) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, 360349589, false);
                        }
                        gapComposer2.startReplaceGroup(360355936);
                        gapComposer2.end(false);
                        j = Color.Transparent;
                    }
                    FormBlocker.Element.DividerElement.DividerStyle dividerStyle2 = dividerElement.style;
                    dividerStyle2.getClass();
                    int i3 = ArcadeFormDividerKt.WhenMappings.$EnumSwitchMapping$0[dividerStyle2.ordinal()];
                    if (i3 == 1) {
                        f = 1.0f;
                    } else if (i3 == 2) {
                        f = 16.0f;
                    } else {
                        if (i3 != 3) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        f = 32.0f;
                    }
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), f), j, ColorKt.RectangleShape), gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                num.getClass();
                ArcadeFormDividerKt.ArcadeFormDivider(dividerElement, composer, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ FormElementViewBuilder$$ExternalSyntheticLambda25(FormBlocker.Element.DividerElement dividerElement, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = dividerElement;
    }
}
