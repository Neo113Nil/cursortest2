package com.squareup.cash.cashapppay.views;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class GrantSheetKt$$ExternalSyntheticLambda7 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PayWithCashAuthorizationBlocker.Footer f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ GrantSheetKt$$ExternalSyntheticLambda7(PayWithCashAuthorizationBlocker.Footer footer, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = footer;
        this.f$1 = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0191  */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BlockerAction blockerAction;
        PayWithCashAuthorizationBlocker.Footer.Content content;
        BlockerAction blockerAction2;
        PayWithCashAuthorizationBlocker.Footer.Content content2;
        int i = this.$r8$classId;
        BlockerAction blockerAction3 = null;
        Object obj4 = Composer.Companion.Empty;
        Function1 function1 = this.f$1;
        PayWithCashAuthorizationBlocker.Footer footer = this.f$0;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    PayWithCashAuthorizationBlocker.Footer.Content content3 = footer.content;
                    if (content3 != null) {
                        PayWithCashAuthorizationBlocker.Footer.Content.ButtonFooter buttonFooter = content3 instanceof PayWithCashAuthorizationBlocker.Footer.Content.ButtonFooter ? (PayWithCashAuthorizationBlocker.Footer.Content.ButtonFooter) content3 : null;
                        PayWithCashAuthorizationBlocker.Footer.ButtonFooter value = buttonFooter != null ? buttonFooter.getValue() : null;
                        if (value != null) {
                            blockerAction = value.secondary_action;
                            if (blockerAction != null) {
                                gapComposer.startReplaceGroup(-20544032);
                                gapComposer.end(false);
                            } else {
                                gapComposer.startReplaceGroup(-20544031);
                                String str = blockerAction.text;
                                if (str == null) {
                                    gapComposer.startReplaceGroup(1951834924);
                                    gapComposer.end(false);
                                } else {
                                    gapComposer.startReplaceGroup(1951834925);
                                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                                    boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(blockerAction);
                                    Object rememberedValue = gapComposer.rememberedValue();
                                    if (changed || rememberedValue == obj4) {
                                        rememberedValue = new GrantSheetKt$$ExternalSyntheticLambda11(function1, blockerAction, 0);
                                        gapComposer.updateRememberedValue(rememberedValue);
                                    }
                                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, null, false, false, null, Expect_jvmKt.rememberComposableLambda(-1429329278, new SetPinViewKt$$ExternalSyntheticLambda7(str, 20), gapComposer), gapComposer, 1572912, 60);
                                    gapComposer.end(false);
                                }
                                gapComposer.end(false);
                            }
                            content = footer.content;
                            if (content != null) {
                                PayWithCashAuthorizationBlocker.Footer.Content.ButtonFooter buttonFooter2 = content instanceof PayWithCashAuthorizationBlocker.Footer.Content.ButtonFooter ? (PayWithCashAuthorizationBlocker.Footer.Content.ButtonFooter) content : null;
                                PayWithCashAuthorizationBlocker.Footer.ButtonFooter value2 = buttonFooter2 != null ? buttonFooter2.getValue() : null;
                                if (value2 != null) {
                                    blockerAction3 = value2.primary_action;
                                }
                            }
                            if (blockerAction3 != null) {
                                gapComposer.startReplaceGroup(-20163104);
                                gapComposer.end(false);
                            } else {
                                gapComposer.startReplaceGroup(-20163103);
                                String str2 = blockerAction3.text;
                                if (str2 == null) {
                                    gapComposer.startReplaceGroup(-2143076431);
                                    gapComposer.end(false);
                                } else {
                                    gapComposer.startReplaceGroup(-2143076430);
                                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                                    boolean changed2 = gapComposer.changed(function1) | gapComposer.changedInstance(blockerAction3);
                                    Object rememberedValue2 = gapComposer.rememberedValue();
                                    if (changed2 || rememberedValue2 == obj4) {
                                        rememberedValue2 = new GrantSheetKt$$ExternalSyntheticLambda11(function1, blockerAction3, 3);
                                        gapComposer.updateRememberedValue(rememberedValue2);
                                    }
                                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, fillMaxWidth2, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-1697136583, new SetPinViewKt$$ExternalSyntheticLambda7(str2, 21), gapComposer), gapComposer, 1573296, 56);
                                    gapComposer.end(false);
                                }
                                gapComposer.end(false);
                            }
                        }
                    }
                    blockerAction = null;
                    if (blockerAction != null) {
                    }
                    content = footer.content;
                    if (content != null) {
                    }
                    if (blockerAction3 != null) {
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    PayWithCashAuthorizationBlocker.Footer.Content content4 = footer.content;
                    if (content4 != null) {
                        PayWithCashAuthorizationBlocker.Footer.Content.ButtonFooter buttonFooter3 = content4 instanceof PayWithCashAuthorizationBlocker.Footer.Content.ButtonFooter ? (PayWithCashAuthorizationBlocker.Footer.Content.ButtonFooter) content4 : null;
                        PayWithCashAuthorizationBlocker.Footer.ButtonFooter value3 = buttonFooter3 != null ? buttonFooter3.getValue() : null;
                        if (value3 != null) {
                            blockerAction2 = value3.secondary_action;
                            if (blockerAction2 != null) {
                                gapComposer2.startReplaceGroup(338264305);
                                gapComposer2.end(false);
                            } else {
                                gapComposer2.startReplaceGroup(338264306);
                                String str3 = blockerAction2.text;
                                if (str3 == null) {
                                    gapComposer2.startReplaceGroup(1353056627);
                                    gapComposer2.end(false);
                                } else {
                                    gapComposer2.startReplaceGroup(1353056628);
                                    Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
                                    boolean changed3 = gapComposer2.changed(function1) | gapComposer2.changedInstance(blockerAction2);
                                    Object rememberedValue3 = gapComposer2.rememberedValue();
                                    if (changed3 || rememberedValue3 == obj4) {
                                        rememberedValue3 = new GrantSheetKt$$ExternalSyntheticLambda11(function1, blockerAction2, 1);
                                        gapComposer2.updateRememberedValue(rememberedValue3);
                                    }
                                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue3, fillMaxWidth3, null, false, false, null, Expect_jvmKt.rememberComposableLambda(1451956545, new SetPinViewKt$$ExternalSyntheticLambda7(str3, 18), gapComposer2), gapComposer2, 1572912, 60);
                                    gapComposer2.end(false);
                                }
                                gapComposer2.end(false);
                            }
                            content2 = footer.content;
                            if (content2 != null) {
                                PayWithCashAuthorizationBlocker.Footer.Content.ButtonFooter buttonFooter4 = content2 instanceof PayWithCashAuthorizationBlocker.Footer.Content.ButtonFooter ? (PayWithCashAuthorizationBlocker.Footer.Content.ButtonFooter) content2 : null;
                                PayWithCashAuthorizationBlocker.Footer.ButtonFooter value4 = buttonFooter4 != null ? buttonFooter4.getValue() : null;
                                if (value4 != null) {
                                    blockerAction3 = value4.primary_action;
                                }
                            }
                            if (blockerAction3 != null) {
                                gapComposer2.startReplaceGroup(338645233);
                                gapComposer2.end(false);
                            } else {
                                gapComposer2.startReplaceGroup(338645234);
                                String str4 = blockerAction3.text;
                                if (str4 == null) {
                                    gapComposer2.startReplaceGroup(-1035058234);
                                    gapComposer2.end(false);
                                } else {
                                    gapComposer2.startReplaceGroup(-1035058233);
                                    ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
                                    Modifier fillMaxWidth4 = SizeKt.fillMaxWidth(companion, 1.0f);
                                    boolean changed4 = gapComposer2.changed(function1) | gapComposer2.changedInstance(blockerAction3);
                                    Object rememberedValue4 = gapComposer2.rememberedValue();
                                    if (changed4 || rememberedValue4 == obj4) {
                                        rememberedValue4 = new GrantSheetKt$$ExternalSyntheticLambda11(function1, blockerAction3, 2);
                                        gapComposer2.updateRememberedValue(rememberedValue4);
                                    }
                                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue4, fillMaxWidth4, buttonProminence2, false, false, null, Expect_jvmKt.rememberComposableLambda(1739864682, new SetPinViewKt$$ExternalSyntheticLambda7(str4, 19), gapComposer2), gapComposer2, 1573296, 56);
                                    gapComposer2.end(false);
                                }
                                gapComposer2.end(false);
                            }
                        }
                    }
                    blockerAction2 = null;
                    if (blockerAction2 != null) {
                    }
                    content2 = footer.content;
                    if (content2 != null) {
                    }
                    if (blockerAction3 != null) {
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
