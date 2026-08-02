package com.squareup.cash.afterpayapplet.views.homesection.v3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.tracing.Trace;
import coil3.size.SizeKt;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class TransactionRowKt$$ExternalSyntheticLambda12 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.InlineButton f$0;

    public /* synthetic */ TransactionRowKt$$ExternalSyntheticLambda12(AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.InlineButton inlineButton, int i) {
        this.$r8$classId = i;
        this.f$0 = inlineButton;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ButtonProminence buttonProminence;
        int i = this.$r8$classId;
        AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.InlineButton inlineButton = this.f$0;
        int i2 = 1;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                function0.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changedInstance(function0) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    boolean changedInstance = gapComposer.changedInstance(inlineButton);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new TransactionRowKt$$ExternalSyntheticLambda9(inlineButton, i2);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Modifier semantics = SemanticsModifierKt.semantics(Modifier.Companion.$$INSTANCE, false, (Function1) rememberedValue);
                    int i3 = TransactionRowKt$WhenMappings.$EnumSwitchMapping$0[inlineButton.prominence.ordinal()];
                    if (i3 == 1) {
                        buttonProminence = ButtonProminence.STANDARD;
                    } else if (i3 == 2) {
                        buttonProminence = ButtonProminence.PROMINENT;
                    } else if (i3 == 3) {
                        buttonProminence = ButtonProminence.SUBTLE;
                    } else if (i3 != 4) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        buttonProminence = ButtonProminence.STANDARD;
                    }
                    SizeKt.ButtonCompact(function0, semantics, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(1133085333, new TransactionRowKt$$ExternalSyntheticLambda12(inlineButton, i2), gapComposer), gapComposer, (intValue & 14) | 1572864, 56);
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
                    String str = inlineButton.iconId;
                    if (str == null) {
                        gapComposer2.startReplaceGroup(1597208473);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(1597208474);
                        Icons.Companion.getClass();
                        Icons icons = zzd.get(str);
                        if (icons == null) {
                            icons = Icons.InformationOutline16;
                        }
                        Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                        gapComposer2.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, inlineButton.text, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
