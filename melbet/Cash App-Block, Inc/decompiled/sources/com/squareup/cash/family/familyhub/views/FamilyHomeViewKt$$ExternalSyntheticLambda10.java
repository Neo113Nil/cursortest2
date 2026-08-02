package com.squareup.cash.family.familyhub.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda3;
import com.squareup.cash.formview.components.arcade.ArcadeFormUpsellKt;
import com.squareup.protos.franklin.api.FormBlocker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class FamilyHomeViewKt$$ExternalSyntheticLambda10 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FormBlocker.Element.UpsellElement f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ FamilyHomeViewKt$$ExternalSyntheticLambda10(FormBlocker.Element.UpsellElement upsellElement, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = upsellElement;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        FormBlocker.Element.UpsellElement upsellElement = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda3(20, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    FamilyUpsellElementKt.FamilyUpsellElement(upsellElement, (Function1) rememberedValue, SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, 16.0f, RecyclerView.DECELERATION_RATE, 2), gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    FormBlocker.Element.UpsellElement.CardLayout cardLayout = upsellElement.card_layout;
                    int i2 = cardLayout == null ? -1 : ArcadeFormUpsellKt.WhenMappings.$EnumSwitchMapping$0[cardLayout.ordinal()];
                    if (i2 != -1) {
                        if (i2 == 1) {
                            gapComposer2.startReplaceGroup(769487533);
                            ArcadeFormUpsellKt.HorizontalUpsellContent(upsellElement, gapComposer2, 0);
                            gapComposer2.end(false);
                        } else if (i2 != 2) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, 769485228, false);
                        }
                    }
                    gapComposer2.startReplaceGroup(769490612);
                    ArcadeFormUpsellKt.VerticalUpsellContent(upsellElement, function1, gapComposer2, 0);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
