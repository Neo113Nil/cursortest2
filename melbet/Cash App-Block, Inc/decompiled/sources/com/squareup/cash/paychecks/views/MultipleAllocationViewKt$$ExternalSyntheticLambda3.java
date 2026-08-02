package com.squareup.cash.paychecks.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.views.chat.SuggestionUiKt$$ExternalSyntheticLambda8;
import com.squareup.cash.offers.views.home.OffersHomeV2Kt$$ExternalSyntheticLambda7;
import com.squareup.cash.paychecks.viewmodels.MultipleAllocationViewModel;
import com.squareup.cash.payments.views.MainPaymentViewKt$$ExternalSyntheticLambda0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class MultipleAllocationViewKt$$ExternalSyntheticLambda3 implements Function3 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ MultipleAllocationViewModel.Active f$1;

    public /* synthetic */ MultipleAllocationViewKt$$ExternalSyntheticLambda3(MultipleAllocationViewModel.Active active, Function1 function1) {
        this.f$1 = active;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Function1 function1 = this.f$0;
        MultipleAllocationViewModel.Active active = this.f$1;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        final int i2 = 1;
        boolean z = false;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    NavigationType navigationType = NavigationType.BACK;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1158513336, new SuggestionUiKt$$ExternalSyntheticLambda8(active, 29), gapComposer);
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new HelpSheetViewKt$$ExternalSyntheticLambda2(25, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.TitleBarSub(rememberComposableLambda, navigationType, fillMaxWidth, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 438, 104);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    final MultipleAllocationViewModel.Active.Action action = active.action;
                    if (action instanceof MultipleAllocationViewModel.Active.Action.Prominent) {
                        gapComposer2.startReplaceGroup(-1312034553);
                        ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                        Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                        boolean changed2 = gapComposer2.changed(function1) | gapComposer2.changedInstance(action);
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        Object obj4 = rememberedValue2;
                        if (changed2 || rememberedValue2 == neverEqualPolicy) {
                            OffersHomeV2Kt$$ExternalSyntheticLambda7 offersHomeV2Kt$$ExternalSyntheticLambda7 = new OffersHomeV2Kt$$ExternalSyntheticLambda7(21, function1, action);
                            gapComposer2.updateRememberedValue(offersHomeV2Kt$$ExternalSyntheticLambda7);
                            obj4 = offersHomeV2Kt$$ExternalSyntheticLambda7;
                        }
                        final boolean z2 = z ? 1 : 0;
                        coil3.size.SizeKt.ButtonCta((Function0) obj4, fillMaxWidth2, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-117120700, new Function3() { // from class: com.squareup.cash.paychecks.views.MultipleAllocationViewKt$$ExternalSyntheticLambda20
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                int i3 = z2;
                                MultipleAllocationViewModel.Active.Action action2 = action;
                                switch (i3) {
                                    case 0:
                                        Composer composer3 = (Composer) obj6;
                                        int intValue3 = ((Integer) obj7).intValue();
                                        ((RowScope) obj5).getClass();
                                        GapComposer gapComposer3 = (GapComposer) composer3;
                                        if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((MultipleAllocationViewModel.Active.Action.Prominent) action2).text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer3.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer4 = (Composer) obj6;
                                        int intValue4 = ((Integer) obj7).intValue();
                                        ((RowScope) obj5).getClass();
                                        GapComposer gapComposer4 = (GapComposer) composer4;
                                        if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((MultipleAllocationViewModel.Active.Action.StandardDisabled) action2).text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer4.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer2), gapComposer2, 1573296, 56);
                        gapComposer2.end(false);
                    } else {
                        if (!(action instanceof MultipleAllocationViewModel.Active.Action.StandardDisabled)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, -1843441117, false);
                        }
                        gapComposer2.startReplaceGroup(-1311587874);
                        Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
                        Object rememberedValue3 = gapComposer2.rememberedValue();
                        Object obj5 = rememberedValue3;
                        if (rememberedValue3 == neverEqualPolicy) {
                            MainPaymentViewKt$$ExternalSyntheticLambda0 mainPaymentViewKt$$ExternalSyntheticLambda0 = new MainPaymentViewKt$$ExternalSyntheticLambda0(2);
                            gapComposer2.updateRememberedValue(mainPaymentViewKt$$ExternalSyntheticLambda0);
                            obj5 = mainPaymentViewKt$$ExternalSyntheticLambda0;
                        }
                        coil3.size.SizeKt.ButtonCta((Function0) obj5, fillMaxWidth3, null, false, false, null, Expect_jvmKt.rememberComposableLambda(982278972, new Function3() { // from class: com.squareup.cash.paychecks.views.MultipleAllocationViewKt$$ExternalSyntheticLambda20
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj52, Object obj6, Object obj7) {
                                int i3 = i2;
                                MultipleAllocationViewModel.Active.Action action2 = action;
                                switch (i3) {
                                    case 0:
                                        Composer composer3 = (Composer) obj6;
                                        int intValue3 = ((Integer) obj7).intValue();
                                        ((RowScope) obj52).getClass();
                                        GapComposer gapComposer3 = (GapComposer) composer3;
                                        if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((MultipleAllocationViewModel.Active.Action.Prominent) action2).text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer3.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer4 = (Composer) obj6;
                                        int intValue4 = ((Integer) obj7).intValue();
                                        ((RowScope) obj52).getClass();
                                        GapComposer gapComposer4 = (GapComposer) composer4;
                                        if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((MultipleAllocationViewModel.Active.Action.StandardDisabled) action2).text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer4.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer2), gapComposer2, 1597494, 44);
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ MultipleAllocationViewKt$$ExternalSyntheticLambda3(Function1 function1, MultipleAllocationViewModel.Active active) {
        this.f$0 = function1;
        this.f$1 = active;
    }
}
