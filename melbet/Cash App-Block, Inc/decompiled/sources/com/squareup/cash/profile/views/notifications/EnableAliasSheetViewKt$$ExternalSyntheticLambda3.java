package com.squareup.cash.profile.views.notifications;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzagn;
import com.squareup.cash.R;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.moneybot.views.chat.EmptyChatKt;
import com.squareup.cash.profile.viewmodels.Alias;
import com.squareup.cash.profile.viewmodels.EnableAliasSheetViewModel;
import com.squareup.cash.profile.views.personal.PersonalInfoView$$ExternalSyntheticLambda0;
import com.squareup.cash.savings.views.ButtonGroupKt$$ExternalSyntheticLambda11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import okio.ByteString;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import squareup.cash.ui.arcade.elements.BetweenSection;

/* loaded from: classes7.dex */
public final /* synthetic */ class EnableAliasSheetViewKt$$ExternalSyntheticLambda3 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ EnableAliasSheetViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ EnableAliasSheetViewKt$$ExternalSyntheticLambda3(EnableAliasSheetViewModel enableAliasSheetViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = enableAliasSheetViewModel;
        this.f$1 = function1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0069, code lost:
    
        if (r2.isEmpty() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0095, code lost:
    
        if (r1.isEmpty() != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0099, code lost:
    
        r12 = false;
     */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        EnableAliasSheetViewModel enableAliasSheetViewModel = this.f$0;
        int i6 = 1;
        switch (i5) {
            case 0:
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18);
                Applier applier = gapComposer.applier;
                if (shouldExecute) {
                    ScrollState rememberScrollState = ImageKt.rememberScrollState(gapComposer);
                    Modifier padding = SpacerKt.padding(SizeKt.wrapContentSize$default(companion, null, 3), paddingValues);
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, padding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    boolean z2 = enableAliasSheetViewModel.isUpdateLoading;
                    List list = enableAliasSheetViewModel.emailAliases;
                    List list2 = enableAliasSheetViewModel.phoneAliases;
                    AnimatedContentKt.AnimatedVisibility(ColumnScopeInstance.INSTANCE, z2, null, EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3), null, ChannelListViewKt.f601lambda$1294967537, gapComposer, 1600518, 18);
                    GapComposer gapComposer2 = gapComposer;
                    if (enableAliasSheetViewModel.isUpdateLoading) {
                        gapComposer2.startReplaceGroup(424274123);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(421923517);
                        Modifier verticalScroll$default = ImageKt.verticalScroll$default(NestedScrollModifierKt.nestedScroll(companion, zzagn.rememberNestedScrollInteropConnection(gapComposer2), null), rememberScrollState, false, 14);
                        ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
                        int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, verticalScroll$default);
                        gapComposer2.startReusableNode();
                        if (gapComposer2.inserting) {
                            gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer2.useNode();
                        }
                        Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                        EmptyChatKt.ProfileHeader(enableAliasSheetViewModel.title, (Modifier) null, (Function2) null, enableAliasSheetViewModel.body, gapComposer2, 0, 6);
                        DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer2, null);
                        if (EnableAliasSheetViewKt.shouldShowAliasSectionHeader(list2, list)) {
                            gapComposer2.startReplaceGroup(148848245);
                            if (list2.size() == 1) {
                                i3 = 148957241;
                                i4 = R.string.enable_alias_sheet_phone_label;
                            } else {
                                i3 = 149059696;
                                i4 = R.string.enable_alias_sheet_phone_required_label;
                            }
                            ChannelListViewKt.m3728NotificationSectionHeadereopBjH0(re$$ExternalSyntheticOutline0.m(gapComposer2, i3, i4, gapComposer2, false), 0L, 0L, null, gapComposer2, 0);
                            gapComposer2 = gapComposer2;
                            gapComposer2.end(false);
                        } else {
                            gapComposer2.startReplaceGroup(149191322);
                            gapComposer2.end(false);
                        }
                        gapComposer2.startReplaceGroup(836097871);
                        Iterator it = list2.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            Function1 function1 = this.f$1;
                            if (hasNext) {
                                EnableAliasSheetViewKt.AliasRow(function1, (Alias) it.next(), true, list2.size(), gapComposer2, MLKEMEngine.KyberPolyBytes);
                            } else {
                                gapComposer2.end(false);
                                if (EnableAliasSheetViewKt.shouldShowAliasSectionHeader(list2, list)) {
                                    gapComposer2.startReplaceGroup(149551542);
                                    new BetweenSection(null, ByteString.EMPTY);
                                    if (list.size() == 1) {
                                        i = 149690329;
                                        i2 = R.string.enable_alias_sheet_email_label;
                                        z = false;
                                    } else {
                                        z = false;
                                        i = 149792784;
                                        i2 = R.string.enable_alias_sheet_email_required_label;
                                    }
                                    GapComposer gapComposer3 = gapComposer2;
                                    ChannelListViewKt.m3728NotificationSectionHeadereopBjH0(re$$ExternalSyntheticOutline0.m(gapComposer2, i, i2, gapComposer2, z), 0L, 0L, null, gapComposer3, 0);
                                    gapComposer2 = gapComposer3;
                                    gapComposer2.end(z);
                                } else {
                                    gapComposer2.startReplaceGroup(149924410);
                                    gapComposer2.end(false);
                                }
                                gapComposer2.startReplaceGroup(836121520);
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    EnableAliasSheetViewKt.AliasRow(function1, (Alias) it2.next(), false, list.size(), gapComposer2, MLKEMEngine.KyberPolyBytes);
                                }
                                gapComposer2.end(false);
                                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                                gapComposer2.end(true);
                                GapComposer gapComposer4 = gapComposer2;
                                DimensionKt.ButtonCtaGroup(null, rememberScrollState.getCanScrollForward(), null, null, Expect_jvmKt.rememberComposableLambda(-1330520044, new EnableAliasSheetViewKt$$ExternalSyntheticLambda3(enableAliasSheetViewModel, function1, 1), gapComposer2), gapComposer4, 24576, 13);
                                gapComposer2 = gapComposer4;
                                gapComposer2.end(false);
                            }
                        }
                    }
                    gapComposer2.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer2;
                if (gapComposer5.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    List list3 = enableAliasSheetViewModel.emailAliases;
                    List list4 = enableAliasSheetViewModel.phoneAliases;
                    List list5 = list4;
                    if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                        Iterator it3 = list5.iterator();
                        while (it3.hasNext()) {
                            if (((Alias) it3.next()).isChecked) {
                                List list6 = list3;
                                if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                                    Iterator it4 = list6.iterator();
                                    while (it4.hasNext()) {
                                        if (((Alias) it4.next()).isChecked) {
                                            boolean z3 = true;
                                            Function1 function12 = this.f$1;
                                            boolean changed = gapComposer5.changed(function12);
                                            Object rememberedValue = gapComposer5.rememberedValue();
                                            if (changed || rememberedValue == Composer.Companion.Empty) {
                                                rememberedValue = new PersonalInfoView$$ExternalSyntheticLambda0(8, function12);
                                                gapComposer5.updateRememberedValue(rememberedValue);
                                            }
                                            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, z3, null, Expect_jvmKt.rememberComposableLambda(-65029105, new ButtonGroupKt$$ExternalSyntheticLambda11(enableAliasSheetViewModel, i6), gapComposer5), gapComposer5, 1573296, 40);
                                        }
                                    }
                                }
                                break;
                            }
                        }
                    }
                    break;
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
