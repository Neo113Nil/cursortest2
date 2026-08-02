package com.squareup.cash.payments.views;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.room.Room;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda0;
import coil3.size.SizeKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.calendar.views.CalendarRowKt$$ExternalSyntheticLambda11;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda2;
import com.squareup.cash.paychecks.views.PaycheckCirclesKt$$ExternalSyntheticLambda3;
import com.squareup.cash.payments.viewmodels.DevicePixelPosition;
import com.squareup.cash.payments.viewmodels.PersonalizedPaymentsReactionsState;
import com.squareup.cash.payments.viewmodels.Size;
import com.squareup.cash.payments.viewmodels.WarningDialogViewModel;
import com.squareup.cash.score.views.ScoreUiFactory$$ExternalSyntheticLambda0;
import com.squareup.protos.franklin.common.Reaction;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class UtilKt {
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PersonalizePaymentReactionButton(final Modifier modifier, final boolean z, final String str, final Function0 function0, boolean z2, boolean z3, Function2 function2, Composer composer, int i, int i2) {
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        Function2 function22;
        boolean z6;
        Function2 function23;
        RecomposeScopeImpl endRestartGroup;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1262302228);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changedInstance(function0) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            z4 = z2;
            i3 |= gapComposer.changed(z4) ? 16384 : PKIFailureInfo.certRevoked;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((196608 & i) == 0) {
                z5 = z3;
                i3 |= gapComposer.changed(z5) ? PKIFailureInfo.unsupportedVersion : 65536;
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    function22 = function2;
                    i3 |= gapComposer.changedInstance(function22) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                    if (gapComposer.shouldExecute(i3 & 1, (599187 & i3) == 599186)) {
                        gapComposer.skipToGroupEnd();
                        z6 = z4;
                        function23 = function22;
                    } else {
                        final boolean z7 = i6 != 0 ? true : z4;
                        final boolean z8 = i4 != 0 ? false : z5;
                        final Function2 function24 = i5 != 0 ? null : function22;
                        ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1293514807, new Function2() { // from class: com.squareup.cash.payments.views.StatefulReactionButtonKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                int i7 = 0;
                                int i8 = 2;
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    boolean z9 = z8;
                                    Modifier modifier2 = modifier;
                                    boolean z10 = z;
                                    Function0 function02 = function0;
                                    boolean z11 = z7;
                                    Function2 function25 = function24;
                                    String str2 = str;
                                    if (z9) {
                                        gapComposer2.startReplaceGroup(653090311);
                                        SizeKt.ButtonCta(function02, UtilKt.overlay(modifier2, z10), null, false, z11, null, Expect_jvmKt.rememberComposableLambda(-568370185, new StatefulReactionButtonKt$$ExternalSyntheticLambda11(i7, str2, function25), gapComposer2), gapComposer2, 1575936, 36);
                                        gapComposer2.end(false);
                                    } else {
                                        gapComposer2.startReplaceGroup(653334312);
                                        SizeKt.Button(function02, UtilKt.overlay(modifier2, z10), null, false, z11, null, Expect_jvmKt.rememberComposableLambda(1984232262, new StatefulReactionButtonKt$$ExternalSyntheticLambda11(i8, str2, function25), gapComposer2), gapComposer2, 1572864, 44);
                                        gapComposer2.end(false);
                                    }
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer), gapComposer, 3072, 7);
                        z5 = z8;
                        z6 = z7;
                        function23 = function24;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new CalendarRowKt$$ExternalSyntheticLambda11(modifier, z, str, function0, z6, z5, function23, i, i2);
                        return;
                    }
                    return;
                }
                function22 = function2;
                if (gapComposer.shouldExecute(i3 & 1, (599187 & i3) == 599186)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z5 = z3;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            function22 = function2;
            if (gapComposer.shouldExecute(i3 & 1, (599187 & i3) == 599186)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        z4 = z2;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        z5 = z3;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        function22 = function2;
        if (gapComposer.shouldExecute(i3 & 1, (599187 & i3) == 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void PersonalizedPaymentReactedButton(Modifier modifier, Reaction reaction, Composer composer, int i, int i2) {
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(147510126);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        }
        int i5 = i3 | (gapComposer.changedInstance(reaction) ? 32 : 16);
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 19) != 18)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1659256633, new PaycheckCirclesKt$$ExternalSyntheticLambda3(modifier, reaction), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OverlayKt$$ExternalSyntheticLambda2(modifier2, reaction, i, i2, 27);
        }
    }

    public static final void StatefulReactionButton(Function1 function1, Modifier modifier, PersonalizedPaymentsReactionsState personalizedPaymentsReactionsState, boolean z, Composer composer, int i) {
        GapComposer gapComposer;
        boolean z2;
        String str;
        List list;
        String str2;
        function1.getClass();
        personalizedPaymentsReactionsState.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(625866653);
        int i2 = i | (gapComposer2.changedInstance(function1) ? 4 : 2) | (gapComposer2.changed(modifier) ? 32 : 16) | (gapComposer2.changedInstance(personalizedPaymentsReactionsState) ? 256 : 128) | (gapComposer2.changed(z) ? 2048 : 1024);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            PersonalizedPaymentsReactionsState.ShowingExistingReactions showingExistingReactions = personalizedPaymentsReactionsState instanceof PersonalizedPaymentsReactionsState.ShowingExistingReactions ? (PersonalizedPaymentsReactionsState.ShowingExistingReactions) personalizedPaymentsReactionsState : null;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (showingExistingReactions == null || (list = showingExistingReactions.existingReactions) == null || !(!list.isEmpty())) {
                gapComposer = gapComposer2;
                PersonalizedPaymentsReactionsState.PendingReaction pendingReaction = personalizedPaymentsReactionsState instanceof PersonalizedPaymentsReactionsState.PendingReaction ? (PersonalizedPaymentsReactionsState.PendingReaction) personalizedPaymentsReactionsState : null;
                if (pendingReaction == null || (str = pendingReaction.reaction) == null || str.length() <= 0) {
                    gapComposer.startReplaceGroup(742061475);
                    boolean isReactionBarVisible = personalizedPaymentsReactionsState.isReactionBarVisible();
                    String stringResource = Room.stringResource(gapComposer, R.string.reply);
                    z2 = (i2 & 14) == 4;
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (z2 || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new WarningDialogViewKt$$ExternalSyntheticLambda5(24, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    PersonalizePaymentReactionButton(modifier, isReactionBarVisible, stringResource, (Function0) rememberedValue, false, z, ComposableSingletons$StatefulReactionButtonKt.f545lambda$2018727679, gapComposer, ((i2 >> 3) & 14) | 1572864 | ((i2 << 6) & 458752), 16);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(741586555);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new MainPaymentViewKt$$ExternalSyntheticLambda25(19);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier, (Function1) rememberedValue2);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new MainPaymentViewKt$$ExternalSyntheticLambda0(22);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    PersonalizePaymentReactionButton(clearAndSetSemantics, false, "", (Function0) rememberedValue3, false, z, ComposableSingletons$StatefulReactionButtonKt.lambda$1032945121, gapComposer, ((i2 << 6) & 458752) | 1600944, 0);
                    gapComposer = gapComposer;
                    gapComposer.end(false);
                }
            } else {
                gapComposer2.startReplaceGroup(740769178);
                Reaction reaction = (Reaction) CollectionsKt.firstOrNull(((PersonalizedPaymentsReactionsState.ShowingExistingReactions) personalizedPaymentsReactionsState).existingReactions);
                if (reaction == null || (str2 = reaction.data) == null || str2.length() <= 0) {
                    gapComposer = gapComposer2;
                    gapComposer.startReplaceGroup(741483077);
                    gapComposer.end(false);
                } else {
                    gapComposer2.startReplaceGroup(740893984);
                    if (z) {
                        gapComposer2.startReplaceGroup(740922752);
                        Object rememberedValue4 = gapComposer2.rememberedValue();
                        if (rememberedValue4 == neverEqualPolicy) {
                            rememberedValue4 = new MainPaymentViewKt$$ExternalSyntheticLambda25(17);
                            gapComposer2.updateRememberedValue(rememberedValue4);
                        }
                        PersonalizedPaymentReactedButton(SemanticsModifierKt.semantics(modifier, true, (Function1) rememberedValue4), reaction, gapComposer2, 0, 0);
                        gapComposer2.end(false);
                        gapComposer = gapComposer2;
                    } else {
                        gapComposer2.startReplaceGroup(741129243);
                        Object rememberedValue5 = gapComposer2.rememberedValue();
                        if (rememberedValue5 == neverEqualPolicy) {
                            rememberedValue5 = new MainPaymentViewKt$$ExternalSyntheticLambda25(18);
                            gapComposer2.updateRememberedValue(rememberedValue5);
                        }
                        Modifier semantics = SemanticsModifierKt.semantics(modifier, true, (Function1) rememberedValue5);
                        String str3 = reaction.data;
                        str3.getClass();
                        String stringResource2 = Room.stringResource(R.string.replied_with, new Object[]{str3}, gapComposer2);
                        z2 = (i2 & 14) == 4;
                        Object rememberedValue6 = gapComposer2.rememberedValue();
                        if (z2 || rememberedValue6 == neverEqualPolicy) {
                            rememberedValue6 = new WarningDialogViewKt$$ExternalSyntheticLambda5(23, function1);
                            gapComposer2.updateRememberedValue(rememberedValue6);
                        }
                        gapComposer = gapComposer2;
                        PersonalizePaymentReactionButton(semantics, false, stringResource2, (Function0) rememberedValue6, false, false, null, gapComposer, 0, 112);
                        gapComposer.end(false);
                    }
                    gapComposer.end(false);
                }
                gapComposer.end(false);
            }
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeViewKt$$ExternalSyntheticLambda0(function1, modifier, personalizedPaymentsReactionsState, z, i);
        }
    }

    public static final void ToView(int i, Composer composer, Modifier modifier, String str, Function0 function0) {
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1182238661);
        int i2 = i | 6 | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(958875334, new ToViewKt$$ExternalSyntheticLambda0(str, function0), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ToViewKt$$ExternalSyntheticLambda1(modifier2, str, function0, i, 0);
        }
    }

    public static final void TransitionalBackground(Modifier modifier, int i, List list, Composer composer, int i2) {
        Modifier modifier2;
        list.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1932725535);
        int i3 = (gapComposer.changed(i) ? 32 : 16) | i2 | (gapComposer.changedInstance(list) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Integer valueOf = Integer.valueOf(i);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MainPaymentViewKt$$ExternalSyntheticLambda25(20);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            modifier2 = modifier;
            AnimatedContentKt.AnimatedContent(valueOf, modifier2, (Function1) rememberedValue, null, "background transition", null, Expect_jvmKt.rememberComposableLambda(-1307701589, new ScoreUiFactory$$ExternalSyntheticLambda0(list, 17), gapComposer), gapComposer, ((i3 >> 3) & 14) | 1597872, 40);
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OverlayKt$$ExternalSyntheticLambda2(modifier2, list, i, i2);
        }
    }

    public static final void WarningDialog(WarningDialogViewModel warningDialogViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        warningDialogViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1561821206);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(warningDialogViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1221399583, new PaycheckCirclesKt$$ExternalSyntheticLambda3(warningDialogViewModel, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NoteRequiredViewKt$$ExternalSyntheticLambda1(warningDialogViewModel, function1, modifier2, i, 19);
        }
    }

    public static final Modifier elevateToTop(Modifier modifier, boolean z) {
        modifier.getClass();
        Modifier modifier2 = Modifier.Companion.$$INSTANCE;
        if (z) {
            modifier2 = ZIndexModifierKt.zIndex(modifier2, Float.MAX_VALUE);
        }
        return modifier.then(modifier2);
    }

    public static final Modifier overlay(Modifier modifier, boolean z) {
        modifier.getClass();
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        return modifier.then(z ? ZIndexModifierKt.zIndex(companion, Float.MIN_VALUE) : ZIndexModifierKt.zIndex(companion, Float.MAX_VALUE));
    }

    public static final Modifier positioned(Modifier modifier, Function1 function1) {
        modifier.getClass();
        function1.getClass();
        return ValueInsets.onGloballyPositioned(modifier, new UtilKt$$ExternalSyntheticLambda0(0, function1));
    }

    public static final long scaledSp(Composer composer, int i) {
        return Room.pack(4294967296L, i / ((Density) ((GapComposer) composer).consume(CompositionLocalsKt.LocalDensity)).getFontScale());
    }

    /* renamed from: toDevicePixelPosition-k-4lQ0M, reason: not valid java name */
    public static final DevicePixelPosition m3705toDevicePixelPositionk4lQ0M(long j) {
        return new DevicePixelPosition(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)));
    }

    /* renamed from: toSize-ozmzZPI, reason: not valid java name */
    public static final Size m3706toSizeozmzZPI(long j) {
        return new Size((int) (j >> 32), (int) (j & BodyPartID.bodyIdMax));
    }
}
