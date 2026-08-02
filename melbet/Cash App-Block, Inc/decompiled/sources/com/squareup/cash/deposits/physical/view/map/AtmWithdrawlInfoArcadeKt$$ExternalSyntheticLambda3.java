package com.squareup.cash.deposits.physical.view.map;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.tracing.Trace;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedScope;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.core.views.ArcadeBottomNavigationKt$$ExternalSyntheticLambda3;
import com.squareup.cash.deposits.physical.viewmodels.map.AtmExplainerViewModel;
import com.squareup.cash.deposits.physical.viewmodels.map.Benefit;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda3;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda2;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda4;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class AtmWithdrawlInfoArcadeKt$$ExternalSyntheticLambda3 implements Function3 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ AtmExplainerViewModel f$1;

    public /* synthetic */ AtmWithdrawlInfoArcadeKt$$ExternalSyntheticLambda3(AtmExplainerViewModel atmExplainerViewModel, Function1 function1) {
        this.f$1 = atmExplainerViewModel;
        this.f$0 = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        AtmExplainerViewModel atmExplainerViewModel = this.f$1;
        Object[] objArr = 0;
        final int i2 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(atmExplainerViewModel);
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new ArcadeModal2Kt$$ExternalSyntheticLambda2(13, function1, atmExplainerViewModel);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, null, false, false, null, Expect_jvmKt.rememberComposableLambda(-379353879, new ArcadeModal$$ExternalSyntheticLambda3(atmExplainerViewModel, 3), gapComposer), gapComposer, 1572912, 60);
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed2 = gapComposer.changed(function1);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new ComposeDialogKt$$ExternalSyntheticLambda4(18, function1);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, fillMaxWidth2, buttonProminence, false, false, null, AtmWithdrawlInfoArcadeKt.lambda$1977085074, gapComposer, 1573296, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ListUnorderedScope listUnorderedScope = (ListUnorderedScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                listUnorderedScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(listUnorderedScope) ? 4 : 2;
                }
                int i3 = intValue2;
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
                    for (final Benefit benefit : atmExplainerViewModel.benefits) {
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        listUnorderedScope.ListUnorderedItem(Expect_jvmKt.rememberComposableLambda(-1289636946, new Function2() { // from class: com.squareup.cash.deposits.physical.view.map.AtmWithdrawlInfoArcadeKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                int i4 = objArr2;
                                Benefit benefit2 = benefit;
                                switch (i4) {
                                    case 0:
                                        Composer composer3 = (Composer) obj4;
                                        int intValue3 = ((Integer) obj5).intValue();
                                        GapComposer gapComposer3 = (GapComposer) composer3;
                                        if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, benefit2.name, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer3.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer4 = (Composer) obj4;
                                        int intValue4 = ((Integer) obj5).intValue();
                                        GapComposer gapComposer4 = (GapComposer) composer4;
                                        if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                                            Trace.m1191Iconww6aTOc(benefit2.enabled ? Icons.CheckFill24 : Icons.Magic24, (String) null, (Modifier) null, 0L, gapComposer4, 48, 12);
                                        } else {
                                            gapComposer4.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer2), (Modifier) null, Expect_jvmKt.rememberComposableLambda(452006252, new Function2() { // from class: com.squareup.cash.deposits.physical.view.map.AtmWithdrawlInfoArcadeKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                int i4 = i2;
                                Benefit benefit2 = benefit;
                                switch (i4) {
                                    case 0:
                                        Composer composer3 = (Composer) obj4;
                                        int intValue3 = ((Integer) obj5).intValue();
                                        GapComposer gapComposer3 = (GapComposer) composer3;
                                        if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, benefit2.name, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer3.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer4 = (Composer) obj4;
                                        int intValue4 = ((Integer) obj5).intValue();
                                        GapComposer gapComposer4 = (GapComposer) composer4;
                                        if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                                            Trace.m1191Iconww6aTOc(benefit2.enabled ? Icons.CheckFill24 : Icons.Magic24, (String) null, (Modifier) null, 0L, gapComposer4, 48, 12);
                                        } else {
                                            gapComposer4.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer2), (Function2) null, Expect_jvmKt.rememberComposableLambda(-2101317846, new ArcadeBottomNavigationKt$$ExternalSyntheticLambda3(13, benefit, function1), gapComposer2), gapComposer2, ((i3 << 15) & 458752) | 24966, 10);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AtmWithdrawlInfoArcadeKt$$ExternalSyntheticLambda3(Function1 function1, AtmExplainerViewModel atmExplainerViewModel) {
        this.f$0 = function1;
        this.f$1 = atmExplainerViewModel;
    }
}
