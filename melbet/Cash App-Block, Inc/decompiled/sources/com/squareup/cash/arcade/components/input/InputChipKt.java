package com.squareup.cash.arcade.components.input;

import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SwitchKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import bo.app.y0$$ExternalSyntheticLambda0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.MotionKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.cell.CellDefaultKt$$ExternalSyntheticLambda5;
import com.squareup.cash.arcade.components.input.DropdownState;
import com.squareup.cash.arcade.components.internal.InputColors;
import com.squareup.cash.arcade.components.internal.LocalEnabledStateKt;
import com.squareup.cash.arcade.components.internal.UtilsKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.theme.RippleNodeFactory;
import com.squareup.cash.arcade.treehouse.NavBarBinding$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda1;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda5;
import com.squareup.cash.banking.views.BenefitsLeafletViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.banking.views.TransfersViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda2;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda24;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda0;
import com.squareup.cash.overlays.OverlaysKt$$ExternalSyntheticLambda1;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda15;
import com.squareup.cash.work.views.ScheduleCalendarKt$$ExternalSyntheticLambda5;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class InputChipKt {
    public static final ComposableLambdaImpl lambda$774852320 = new ComposableLambdaImpl(new BenefitsLeafletViewKt$$ExternalSyntheticLambda5(0, 18), false, 774852320);

    public static final void InputChipBase(final ComposableLambdaImpl composableLambdaImpl, final String str, final Modifier modifier, final Function0 function0, final boolean z, final boolean z2, Composer composer, int i) {
        int i2;
        MutableInteractionSourceImpl mutableInteractionSourceImpl;
        InputChipColors inputChipColors;
        boolean z3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(671039640);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(composableLambdaImpl) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(z) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changed(z2) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl2 = (MutableInteractionSourceImpl) rememberedValue;
            MutableState collectIsFocusedAsState = Countries.collectIsFocusedAsState(mutableInteractionSourceImpl2, gapComposer, 6);
            if (z2) {
                gapComposer.startReplaceGroup(-2130474429);
                mutableInteractionSourceImpl = mutableInteractionSourceImpl2;
                inputChipColors = new InputChipColors(Strings.getColors(gapComposer).component.optionChip.border.f206default, Strings.getColors(gapComposer).component.optionChip.border.selected, Strings.getColors(gapComposer).component.optionChip.text.f208default, Strings.getColors(gapComposer).component.optionChip.icon.f207default);
                z3 = false;
                gapComposer.end(false);
            } else {
                mutableInteractionSourceImpl = mutableInteractionSourceImpl2;
                gapComposer.startReplaceGroup(-2130429758);
                inputChipColors = new InputChipColors(Strings.getColors(gapComposer).component.optionChip.border.disabled, Strings.getColors(gapComposer).component.optionChip.border.selected, Strings.getColors(gapComposer).component.optionChip.text.disabled, Strings.getColors(gapComposer).component.optionChip.icon.disabled);
                z3 = false;
                gapComposer.end(false);
            }
            boolean z4 = (((Boolean) collectIsFocusedAsState.getValue()).booleanValue() || z) ? true : z3;
            final long j = z4 ? inputChipColors.borderActive : inputChipColors.borderColor;
            final boolean z5 = z4;
            final MutableInteractionSourceImpl mutableInteractionSourceImpl3 = mutableInteractionSourceImpl;
            Updater.CompositionLocalProvider(new ProvidedValue[]{ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium), re$$ExternalSyntheticOutline0.m(inputChipColors.textColor, ArcadeThemeKt.LocalTextColor), Recorder$$ExternalSyntheticOutline2.m(inputChipColors.iconColor, ArcadeThemeKt.LocalIconColor)}, Expect_jvmKt.rememberComposableLambda(614159320, new Function2() { // from class: com.squareup.cash.arcade.components.input.InputChipKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    float f;
                    Composer composer2 = (Composer) obj;
                    int intValue = ((Integer) obj2).intValue();
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    boolean shouldExecute = gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2);
                    Applier applier = gapComposer2.applier;
                    if (shouldExecute) {
                        ProvidableCompositionLocal providableCompositionLocal = ArcadeThemeKt.LocalSizes;
                        ((DefaultSizes) gapComposer2.consume(providableCompositionLocal)).getClass();
                        Object obj3 = DefaultSizes.border.entries;
                        RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f);
                        Modifier clip = ClipKt.clip(SizeKt.m289sizeInqDBjuR0$default(Modifier.this, 84.0f, 64.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12), m340RoundedCornerShape0680j_4);
                        if (z5) {
                            gapComposer2.startReplaceGroup(1796598622);
                            ((DefaultSizes) gapComposer2.consume(providableCompositionLocal)).getClass();
                            gapComposer2.end(false);
                            f = 2.0f;
                        } else {
                            gapComposer2.startReplaceGroup(1796596669);
                            ((DefaultSizes) gapComposer2.consume(providableCompositionLocal)).getClass();
                            gapComposer2.end(false);
                            f = 1.0f;
                        }
                        Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(clip, f, j, m340RoundedCornerShape0680j_4);
                        Role role = new Role(0);
                        Function0 function02 = function0;
                        boolean changed = gapComposer2.changed(function02);
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        Object obj4 = Composer.Companion.Empty;
                        if (changed || rememberedValue2 == obj4) {
                            rememberedValue2 = new y0$$ExternalSyntheticLambda0(28, function02);
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        MutableInteractionSourceImpl mutableInteractionSourceImpl4 = mutableInteractionSourceImpl3;
                        Modifier m181clickableO2vRcR0 = ImageKt.m181clickableO2vRcR0(m178borderxT4_qwU, mutableInteractionSourceImpl4, null, z2, str, role, (Function0) rememberedValue2);
                        boolean z6 = z;
                        boolean changed2 = gapComposer2.changed(z6);
                        Object rememberedValue3 = gapComposer2.rememberedValue();
                        if (changed2 || rememberedValue3 == obj4) {
                            rememberedValue3 = new MoneyTabUIKt$$ExternalSyntheticLambda24(z6, 4);
                            gapComposer2.updateRememberedValue(rememberedValue3);
                        }
                        Modifier semantics = SemanticsModifierKt.semantics(m181clickableO2vRcR0, false, (Function1) rememberedValue3);
                        BiasAlignment biasAlignment = Alignment.Companion.Center;
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                        int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, semantics);
                        ComposeUiNode.Companion.getClass();
                        Function0 function03 = ComposeUiNode.Companion.Constructor;
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer2.startReusableNode();
                        if (gapComposer2.inserting) {
                            gapComposer2.createNode(function03);
                        } else {
                            gapComposer2.useNode();
                        }
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                        Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                        Integer valueOf = Integer.valueOf(hashCode);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                        Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
                        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                        Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                        Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
                        Modifier indication = IndicationKt.indication(BoxScopeInstance.INSTANCE.matchParentSize(), mutableInteractionSourceImpl4, RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer2, 0, 15));
                        Object rememberedValue4 = gapComposer2.rememberedValue();
                        if (rememberedValue4 == obj4) {
                            rememberedValue4 = new NavBarBinding$$ExternalSyntheticLambda2(8);
                            gapComposer2.updateRememberedValue(rememberedValue4);
                        }
                        BoxKt.Box(SemanticsModifierKt.clearAndSetSemantics(indication, (Function1) rememberedValue4), gapComposer2, 0);
                        Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(Modifier.Companion.$$INSTANCE, 8.0f);
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                        int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m298padding3ABfNKs);
                        gapComposer2.startReusableNode();
                        if (gapComposer2.inserting) {
                            gapComposer2.createNode(function03);
                        } else {
                            gapComposer2.useNode();
                        }
                        Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                        composableLambdaImpl.invoke((Object) gapComposer2, (Object) 0);
                        gapComposer2.end(true);
                        gapComposer2.end(true);
                    } else {
                        gapComposer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScheduleCalendarKt$$ExternalSyntheticLambda5(composableLambdaImpl, str, modifier, function0, z, z2, i, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InputChipGrid(Modifier modifier, int i, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i2, int i3) {
        Modifier modifier2;
        int i4;
        int i5;
        Modifier modifier3;
        int i6;
        RecomposeScopeImpl endRestartGroup;
        int i7;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1291429142);
        int i8 = i3 & 1;
        if (i8 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (gapComposer.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 = i;
            i4 |= gapComposer.changed(i5) ? 32 : 16;
            if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
                i4 |= gapComposer.changedInstance(composableLambdaImpl) ? 256 : 128;
            }
            if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) == 146)) {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier2;
                i6 = i5;
            } else {
                if (i8 != 0) {
                    modifier3 = Modifier.Companion.$$INSTANCE;
                    i7 = i9;
                } else {
                    i7 = i9;
                    modifier3 = modifier2;
                }
                int i10 = i7 != 0 ? 3 : i5;
                OffsetKt.FlowRow(modifier3, new Arrangement$SpacedAligned(16.0f, true, new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(Alignment.Companion.CenterHorizontally, 1)), new Arrangement$SpacedAligned(16.0f, false, new StreamSharing$$ExternalSyntheticLambda1(Alignment.Companion.CenterVertically, 17)), null, i10, 0, Expect_jvmKt.rememberComposableLambda(-986644977, new OverlayKt$$ExternalSyntheticLambda0(composableLambdaImpl, 7), gapComposer), gapComposer, (i4 & 14) | 1573296 | ((i4 << 9) & 57344), 40);
                i6 = i10;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new InputChipKt$$ExternalSyntheticLambda1(i6, i2, i3, composableLambdaImpl, modifier3);
                return;
            }
            return;
        }
        i5 = i;
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
        }
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) == 146)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InputDropdown(DropdownState dropdownState, String str, Modifier modifier, boolean z, boolean z2, Function2 function2, String str2, Function2 function22, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        Function2 function23;
        ComposableLambdaImpl composableLambdaImpl2;
        int i6;
        GapComposer gapComposer;
        boolean z5;
        boolean z6;
        Function2 function24;
        RecomposeScopeImpl endRestartGroup;
        InputColors m3397default;
        dropdownState.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1506707743);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changed(dropdownState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changed(modifier) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z3 = z;
            i3 |= gapComposer2.changed(z3) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z4 = z2;
                i3 |= gapComposer2.changed(z4) ? 16384 : PKIFailureInfo.certRevoked;
                if ((196608 & i) == 0) {
                    i3 |= gapComposer2.changedInstance(function2) ? PKIFailureInfo.unsupportedVersion : 65536;
                }
                if ((1572864 & i) == 0) {
                    i3 |= gapComposer2.changed(str2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                }
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                } else if ((12582912 & i) == 0) {
                    function23 = function22;
                    i3 |= gapComposer2.changedInstance(function23) ? 8388608 : 4194304;
                    if ((100663296 & i) != 0) {
                        composableLambdaImpl2 = composableLambdaImpl;
                        i3 |= gapComposer2.changedInstance(composableLambdaImpl2) ? 67108864 : 33554432;
                    } else {
                        composableLambdaImpl2 = composableLambdaImpl;
                    }
                    i6 = i3;
                    if (gapComposer2.shouldExecute(i6 & 1, (i6 & 38347923) == 38347922)) {
                        gapComposer = gapComposer2;
                        gapComposer.skipToGroupEnd();
                        z5 = z3;
                        z6 = z4;
                        function24 = function23;
                    } else {
                        if (i7 != 0) {
                            z3 = true;
                        }
                        boolean z7 = z3;
                        boolean z8 = i4 != 0 ? false : z4;
                        Function2 function25 = i5 != 0 ? null : function23;
                        Object rememberedValue = gapComposer2.rememberedValue();
                        if (rememberedValue == Composer.Companion.Empty) {
                            rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
                        }
                        MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
                        MutableState collectIsPressedAsState = Room.collectIsPressedAsState(mutableInteractionSourceImpl, gapComposer2, 6);
                        if (!z7) {
                            gapComposer2.startReplaceGroup(542178665);
                            m3397default = UtilsKt.disabled(gapComposer2);
                            gapComposer2.end(false);
                        } else if (z8) {
                            gapComposer2.startReplaceGroup(542179942);
                            m3397default = UtilsKt.error(gapComposer2);
                            gapComposer2.end(false);
                        } else {
                            gapComposer2.startReplaceGroup(542181039);
                            ((Boolean) collectIsPressedAsState.getValue()).getClass();
                            m3397default = UtilsKt.m3397default(gapComposer2);
                            gapComposer2.end(false);
                        }
                        InputColors inputColors = m3397default;
                        z6 = z8;
                        gapComposer = gapComposer2;
                        Updater.CompositionLocalProvider(new ProvidedValue[]{ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).input), re$$ExternalSyntheticOutline0.m(inputColors.textColor, ArcadeThemeKt.LocalTextColor)}, Expect_jvmKt.rememberComposableLambda(-1284649505, new CellDefaultKt$$ExternalSyntheticLambda5(modifier, mutableInteractionSourceImpl, z7, dropdownState, z6, function25, str, inputColors, ((Boolean) dropdownState.expanded$delegate.getValue()).booleanValue() ? inputColors.borderActive : inputColors.borderColor, function2, str2, composableLambdaImpl2), gapComposer), gapComposer, 56);
                        function24 = function25;
                        z5 = z7;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new TabToolbarsKt$$ExternalSyntheticLambda15(dropdownState, str, modifier, z5, z6, function2, str2, function24, composableLambdaImpl, i, i2);
                        return;
                    }
                    return;
                }
                function23 = function22;
                if ((100663296 & i) != 0) {
                }
                i6 = i3;
                if (gapComposer2.shouldExecute(i6 & 1, (i6 & 38347923) == 38347922)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z4 = z2;
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            function23 = function22;
            if ((100663296 & i) != 0) {
            }
            i6 = i3;
            if (gapComposer2.shouldExecute(i6 & 1, (i6 & 38347923) == 38347922)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        z3 = z;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z4 = z2;
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        function23 = function22;
        if ((100663296 & i) != 0) {
        }
        i6 = i3;
        if (gapComposer2.shouldExecute(i6 & 1, (i6 & 38347923) == 38347922)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void InputDropdownItem(InputDropdownScope inputDropdownScope, Function0 function0, Modifier modifier, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        inputDropdownScope.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1775572147);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(inputDropdownScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changedInstance(composableLambdaImpl) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 48.0f, RecyclerView.DECELERATION_RATE, 2);
            boolean z = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BankingDialogKt$$ExternalSyntheticLambda5(11, inputDropdownScope, function0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(ImageKt.m183clickableoSLSa3U$default(m279heightInVpY3zN4$default, false, null, null, (Function0) rememberedValue, 15), 16.0f, 4.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$SpacedAligned, vertical, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ProvidedValue defaultProvidedValue$runtime = ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTextColor;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime, re$$ExternalSyntheticOutline0.m(colors.semantic.text.standard, staticProvidableCompositionLocal)}, Expect_jvmKt.rememberComposableLambda(1294870953, new OverlaysKt$$ExternalSyntheticLambda1(composableLambdaImpl, 7), gapComposer), gapComposer, 56);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BookletGridKt$$ExternalSyntheticLambda2(inputDropdownScope, function0, modifier2, composableLambdaImpl, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SelectionCard(ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, boolean z, Modifier modifier, boolean z2, Function1 function1, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        boolean z3;
        boolean z4;
        Modifier modifier3;
        boolean z5;
        RecomposeScopeImpl endRestartGroup;
        int i4;
        Modifier modifier4;
        MutableInteractionSourceImpl mutableInteractionSourceImpl;
        SelectionCardColors selectionCardColors;
        float f;
        int i5;
        SelectionCardStyle[] selectionCardStyleArr = SelectionCardStyle.$VALUES;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-251664095);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(composableLambdaImpl) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(composableLambdaImpl2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changed(0) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 16384 : PKIFailureInfo.certRevoked;
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    z3 = z2;
                    if (gapComposer.changed(z3)) {
                        i5 = PKIFailureInfo.unsupportedVersion;
                        i3 |= i5;
                    }
                } else {
                    z3 = z2;
                }
                i5 = 65536;
                i3 |= i5;
            } else {
                z3 = z2;
            }
            if ((1572864 & i) == 0) {
                i3 |= gapComposer.changedInstance(function1) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            }
            if (gapComposer.shouldExecute(i3 & 1, (599187 & i3) == 599186)) {
                z4 = z;
                gapComposer.skipToGroupEnd();
                modifier3 = modifier2;
                z5 = z3;
            } else {
                gapComposer.startDefaults();
                if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                    Modifier modifier5 = i6 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        z3 = ((Boolean) gapComposer.consume(LocalEnabledStateKt.LocalEnabledState)).booleanValue();
                    }
                    i4 = i3;
                    modifier4 = modifier5;
                } else {
                    gapComposer.skipToGroupEnd();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    i4 = i3;
                    modifier4 = modifier2;
                }
                boolean z6 = z3;
                gapComposer.endDefaults();
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                }
                MutableInteractionSourceImpl mutableInteractionSourceImpl2 = (MutableInteractionSourceImpl) rememberedValue;
                if (z && z6) {
                    gapComposer.startReplaceGroup(-1331013614);
                    mutableInteractionSourceImpl = mutableInteractionSourceImpl2;
                    selectionCardColors = new SelectionCardColors(Strings.getColors(gapComposer).component.input.border.selected, Strings.getColors(gapComposer).semantic.text.standard, Strings.getColors(gapComposer).semantic.text.subtle);
                    gapComposer.end(false);
                } else {
                    mutableInteractionSourceImpl = mutableInteractionSourceImpl2;
                    if (z && !z6) {
                        gapComposer.startReplaceGroup(-1331011437);
                        selectionCardColors = new SelectionCardColors(Strings.getColors(gapComposer).component.input.border.selected, Strings.getColors(gapComposer).semantic.text.disabled, Strings.getColors(gapComposer).semantic.text.disabled);
                        gapComposer.end(false);
                    } else if (z6) {
                        gapComposer.startReplaceGroup(-1331008182);
                        selectionCardColors = new SelectionCardColors(Strings.getColors(gapComposer).component.input.border.f186default, Strings.getColors(gapComposer).semantic.text.standard, Strings.getColors(gapComposer).semantic.text.subtle);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-1331009621);
                        selectionCardColors = new SelectionCardColors(Strings.getColors(gapComposer).component.input.border.disabled, Strings.getColors(gapComposer).semantic.text.disabled, Strings.getColors(gapComposer).semantic.text.disabled);
                        gapComposer.end(false);
                    }
                }
                SelectionCardColors selectionCardColors2 = selectionCardColors;
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                Object obj = DefaultSizes.border.entries;
                if (z) {
                    gapComposer.startReplaceGroup(-1331001529);
                    ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                    gapComposer.end(false);
                    f = 2.0f;
                } else {
                    gapComposer.startReplaceGroup(-1331003162);
                    ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                    gapComposer.end(false);
                    f = 1.0f;
                }
                RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f);
                Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(12.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(ClipKt.clip(modifier4, m340RoundedCornerShape0680j_4), f, selectionCardColors2.border, m340RoundedCornerShape0680j_4);
                int i7 = 3;
                RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer, 0, 15);
                Role role = new Role(3);
                boolean z7 = (i4 & 3670016) == 1048576;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z7 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new AvatarsKt$$ExternalSyntheticLambda1(i7, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Modifier modifier6 = modifier4;
                z4 = z;
                Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(SelectableKt.m336toggleableO2vRcR0(m178borderxT4_qwU, z, mutableInteractionSourceImpl, m3400rippleYJYuY3k, z6, role, (Function1) rememberedValue2), 20.0f, 16.0f);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$SpacedAligned, Alignment.Companion.Top, gapComposer, 6);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                if (gapComposer.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                SelectionCardContent(composableLambdaImpl, composableLambdaImpl2, selectionCardColors2, Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier, 1.0f, true), gapComposer, i4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                int i8 = i4 >> 9;
                SelectionCardAction(z4, z6, null, gapComposer, (i8 & 896) | (i8 & 14) | ((i4 >> 3) & 112));
                gapComposer.end(true);
                modifier3 = modifier6;
                z5 = z6;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new SwitchKt$$ExternalSyntheticLambda0(composableLambdaImpl, composableLambdaImpl2, z4, modifier3, z5, function1, i, i2);
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (599187 & i3) == 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void SelectionCardAction(boolean z, boolean z2, Modifier modifier, Composer composer, int i) {
        int i2;
        boolean z3;
        boolean z4;
        SelectionCardStyle[] selectionCardStyleArr = SelectionCardStyle.$VALUES;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-263649626);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z2) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            gapComposer.startReplaceGroup(35786021);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            z3 = z;
            z4 = z2;
            ModalKt.Radio(z3, companion, null, z4, null, gapComposer, ((i3 >> 3) & 14) | 24576 | ((i3 >> 6) & 112) | ((i3 << 3) & 7168), 4);
            gapComposer.end(false);
            modifier = companion;
        } else {
            z3 = z;
            z4 = z2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SelectionCardKt$$ExternalSyntheticLambda5(z3, z4, modifier, i);
        }
    }

    public static final void SelectionCardContent(ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, SelectionCardColors selectionCardColors, Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-761812414);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(composableLambdaImpl) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(selectionCardColors) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(modifier) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ArcadeThemeKt.LocalTextStyle;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
            ProvidedValue defaultProvidedValue$runtime = dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(((Typography) gapComposer.consume(staticProvidableCompositionLocal)).labelMedium);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalTextColor;
            Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime, re$$ExternalSyntheticOutline0.m(selectionCardColors.label, staticProvidableCompositionLocal2)}, Expect_jvmKt.rememberComposableLambda(1491796940, new OverlaysKt$$ExternalSyntheticLambda1(composableLambdaImpl, 8), gapComposer), gapComposer, 56);
            Updater.CompositionLocalProvider(new ProvidedValue[]{dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(((Typography) gapComposer.consume(staticProvidableCompositionLocal)).bodyMedium), re$$ExternalSyntheticOutline0.m(selectionCardColors.body, staticProvidableCompositionLocal2)}, Expect_jvmKt.rememberComposableLambda(798042613, new OverlaysKt$$ExternalSyntheticLambda1(composableLambdaImpl2, 9), gapComposer), gapComposer, 56);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BookletGridKt$$ExternalSyntheticLambda2(composableLambdaImpl, composableLambdaImpl2, selectionCardColors, modifier, i);
        }
    }

    public static final DropdownState rememberDropdownState(Composer composer) {
        Object[] objArr = new Object[0];
        boolean changed = ((GapComposer) composer).changed(false);
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new MotionKt$$ExternalSyntheticLambda0(26);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (DropdownState) SaverKt.m581rememberSaveable(objArr, (Saver) DropdownState.Saver.INSTANCE, (Function0) rememberedValue, (Composer) gapComposer, 48);
    }

    public static final void InputChipBase(String str, String str2, Modifier modifier, Function0 function0, boolean z, boolean z2, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-237232300);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(str2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(z) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changed(z2) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            InputChipBase(Expect_jvmKt.rememberComposableLambda(802332752, new TransfersViewKt$$ExternalSyntheticLambda5(str, 12), gapComposer), str2, modifier, function0, z, z2, gapComposer, (i2 & 112) | 6 | (i2 & 896) | (i2 & 7168) | (57344 & i2) | (i2 & 458752));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScheduleCalendarKt$$ExternalSyntheticLambda5(str, str2, modifier, function0, z, z2, i, 1);
        }
    }
}
