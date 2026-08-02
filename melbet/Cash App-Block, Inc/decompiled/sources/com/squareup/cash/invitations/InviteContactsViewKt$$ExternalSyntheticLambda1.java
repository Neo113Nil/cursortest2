package com.squareup.cash.invitations;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.room.TransactorKt;
import coil3.size.DimensionKt;
import coil3.size.SizeKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.blockers.views.SetNameViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda2;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes6.dex */
public final /* synthetic */ class InviteContactsViewKt$$ExternalSyntheticLambda1 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InviteContactsViewModel f$0;
    public final /* synthetic */ DelegatingSoftwareKeyboardController f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ InviteContactsViewKt$$ExternalSyntheticLambda1(DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, Function1 function1, InviteContactsViewModel inviteContactsViewModel, int i) {
        this.$r8$classId = i;
        this.f$1 = delegatingSoftwareKeyboardController;
        this.f$2 = function1;
        this.f$0 = inviteContactsViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TitleBarActionScope titleBarActionScope;
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object[] objArr = 0;
        char c = 1;
        char c2 = 1;
        final InviteContactsViewModel inviteContactsViewModel = this.f$0;
        Function1 function1 = this.f$2;
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = this.f$1;
        switch (i) {
            case 0:
                TitleBarActionScope titleBarActionScope2 = (TitleBarActionScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                titleBarActionScope2.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(titleBarActionScope2) ? 4 : 2;
                }
                int i2 = intValue;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
                    if (inviteContactsViewModel.headerViewModel.showReferralRules) {
                        gapComposer.startReplaceGroup(-1098376642);
                        Icons icons = Icons.NavigationHelp;
                        String stringResource = Room.stringResource(gapComposer, R.string.information);
                        boolean changed = gapComposer.changed(delegatingSoftwareKeyboardController) | gapComposer.changed(function1);
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (changed || rememberedValue == neverEqualPolicy) {
                            rememberedValue = new SetNameViewKt$$ExternalSyntheticLambda6(delegatingSoftwareKeyboardController, function1, 7);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        TransactorKt.IconAction(titleBarActionScope2, icons, stringResource, (Function0) rememberedValue, null, null, null, null, null, null, false, gapComposer, (i2 & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                        titleBarActionScope = titleBarActionScope2;
                        gapComposer = gapComposer;
                        gapComposer.end(false);
                    } else {
                        titleBarActionScope = titleBarActionScope2;
                        gapComposer.startReplaceGroup(-1098110445);
                        gapComposer.end(false);
                    }
                    String str = inviteContactsViewModel.shareReferralLinkButtonText;
                    if (str == null || StringsKt.isBlank(str)) {
                        gapComposer.startReplaceGroup(-1098035673);
                        Icons icons2 = Icons.NavigationShareAndroid;
                        String stringResource2 = Room.stringResource(gapComposer, R.string.share);
                        boolean changed2 = gapComposer.changed(delegatingSoftwareKeyboardController) | gapComposer.changed(function1);
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (changed2 || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new SetNameViewKt$$ExternalSyntheticLambda6(delegatingSoftwareKeyboardController, function1, 8);
                            gapComposer.updateRememberedValue(rememberedValue2);
                        }
                        TransactorKt.IconAction(titleBarActionScope, icons2, stringResource2, (Function0) rememberedValue2, null, null, null, null, null, null, false, gapComposer, (i2 & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-1097778125);
                        gapComposer.end(false);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    boolean changed3 = gapComposer2.changed(delegatingSoftwareKeyboardController) | gapComposer2.changed(function1);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new SetNameViewKt$$ExternalSyntheticLambda6(delegatingSoftwareKeyboardController, function1, 9);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    final char c3 = c == true ? 1 : 0;
                    SizeKt.ButtonCta((Function0) rememberedValue3, null, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(1189008684, new Function3() { // from class: com.squareup.cash.invitations.InviteContactsViewKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            int i3 = c3;
                            InviteContactsViewModel inviteContactsViewModel2 = inviteContactsViewModel;
                            switch (i3) {
                                case 0:
                                    Composer composer3 = (Composer) obj5;
                                    int intValue3 = ((Integer) obj6).intValue();
                                    ((RowScope) obj4).getClass();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        String str2 = inviteContactsViewModel2.sendInviteButtonText;
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2 == null ? "" : str2, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer4 = (Composer) obj5;
                                    int intValue4 = ((Integer) obj6).intValue();
                                    ((RowScope) obj4).getClass();
                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                    if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                        String str3 = inviteContactsViewModel2.shareReferralLinkButtonText;
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3 == null ? "" : str3, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer2), gapComposer2, 1573248, 58);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
                Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(SpacerKt.imePadding(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f)), 16.0f, 16.0f);
                InviteErrorDialogKt inviteErrorDialogKt = inviteContactsViewModel.state;
                InviteContactsViewModel$State$ShowInvite inviteContactsViewModel$State$ShowInvite = inviteErrorDialogKt instanceof InviteContactsViewModel$State$ShowInvite ? (InviteContactsViewModel$State$ShowInvite) inviteErrorDialogKt : null;
                boolean z = inviteContactsViewModel$State$ShowInvite != null ? inviteContactsViewModel$State$ShowInvite.buttonEnabled : false;
                GapComposer gapComposer3 = (GapComposer) composer3;
                boolean changedInstance = gapComposer3.changedInstance(inviteContactsViewModel) | gapComposer3.changed(delegatingSoftwareKeyboardController) | gapComposer3.changed(function1);
                Object rememberedValue4 = gapComposer3.rememberedValue();
                if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new GLSceneScope$$ExternalSyntheticLambda2(26, inviteContactsViewModel, delegatingSoftwareKeyboardController, function1);
                    gapComposer3.updateRememberedValue(rememberedValue4);
                }
                final Object[] objArr2 = objArr == true ? 1 : 0;
                SizeKt.ButtonCta((Function0) rememberedValue4, m299paddingVpY3zN4, buttonProminence2, false, z, null, Expect_jvmKt.rememberComposableLambda(1097629981, new Function3() { // from class: com.squareup.cash.invitations.InviteContactsViewKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        int i3 = objArr2;
                        InviteContactsViewModel inviteContactsViewModel2 = inviteContactsViewModel;
                        switch (i3) {
                            case 0:
                                Composer composer32 = (Composer) obj5;
                                int intValue3 = ((Integer) obj6).intValue();
                                ((RowScope) obj4).getClass();
                                GapComposer gapComposer32 = (GapComposer) composer32;
                                if (gapComposer32.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                    String str2 = inviteContactsViewModel2.sendInviteButtonText;
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2 == null ? "" : str2, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer32.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer4 = (Composer) obj5;
                                int intValue4 = ((Integer) obj6).intValue();
                                ((RowScope) obj4).getClass();
                                GapComposer gapComposer4 = (GapComposer) composer4;
                                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                    String str3 = inviteContactsViewModel2.shareReferralLinkButtonText;
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3 == null ? "" : str3, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer3), gapComposer3, 1573248, 40);
                break;
            default:
                Composer composer4 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                DimensionKt.ButtonCtaGroup(null, true, null, null, Expect_jvmKt.rememberComposableLambda(-1074543439, new InviteContactsViewKt$$ExternalSyntheticLambda1(delegatingSoftwareKeyboardController, function1, inviteContactsViewModel, c2 == true ? 1 : 0), composer4), composer4, 24624, 13);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ InviteContactsViewKt$$ExternalSyntheticLambda1(InviteContactsViewModel inviteContactsViewModel, DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = inviteContactsViewModel;
        this.f$1 = delegatingSoftwareKeyboardController;
        this.f$2 = function1;
    }
}
