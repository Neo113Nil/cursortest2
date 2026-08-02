package com.squareup.cash.afterpayapplet.views.homesection;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.tracing.Trace;
import coil3.size.SizeKt;
import com.squareup.cash.afterpayapplet.backend.RetroTransaction;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class RetroCellActivityKt$$ExternalSyntheticLambda15 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RetroTransaction.Button f$0;

    public /* synthetic */ RetroCellActivityKt$$ExternalSyntheticLambda15(RetroTransaction.Button button, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                break;
            default:
                ButtonProminence buttonProminence = ButtonProminence.STANDARD;
                break;
        }
        this.f$0 = button;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        RetroTransaction.Button button = this.f$0;
        int i2 = 1;
        switch (i) {
            case 0:
                ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                Function0 function0 = (Function0) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                function0.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changedInstance(function0) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    boolean changedInstance = gapComposer.changedInstance(button);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new RetroCellActivityKt$$ExternalSyntheticLambda9(button, i2);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    SizeKt.ButtonCompact(function0, TestTagKt.testTag(SemanticsModifierKt.semantics(Modifier.Companion.$$INSTANCE, false, (Function1) rememberedValue), "actionButton_".concat(button.text)), buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(1576218474, new RetroCellActivityKt$$ExternalSyntheticLambda15(button, i2), gapComposer), gapComposer, (intValue & 14) | 1573248, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 17) != 16)) {
                    Icons icons = button.icon;
                    if (icons == null) {
                        gapComposer2.startReplaceGroup(247137125);
                    } else {
                        gapComposer2.startReplaceGroup(247137126);
                        Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                    }
                    gapComposer2.end(false);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button.text, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
