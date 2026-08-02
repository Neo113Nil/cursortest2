package com.squareup.cash.blockers.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.room.Room;
import app.cash.local.views.sheet.LocalShortlinkSheetKt$$ExternalSyntheticLambda8;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda26;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.HapticsKt;
import com.squareup.cash.arcade.components.haptic.HapticVibratorKt;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.viewmodels.LayoutUpdate;
import com.squareup.cash.blockers.viewmodels.StatusResultViewModel;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda12;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda9;
import com.squareup.cash.checks.ConfirmBackOfCheckKt$$ExternalSyntheticLambda6;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.StatusResultButton;
import com.squareup.protos.franklin.common.appmessaging.AppMessageAction;
import com.squareup.protos.franklin.common.appmessaging.AppMessageHeadline;
import com.squareup.protos.franklin.common.appmessaging.AppMessageInAppPromoTemplate;
import com.squareup.protos.hieroglyph.KeyScope;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class StatusResultViewKt {
    static {
        KeyScope.Companion companion = StatusResult.Icon.Companion;
        new StatusResultButton(null, "I'm a primary button", 224);
        new StatusResultButton(null, "I'm a secondary button", 224);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CallToAction(String str, String str2, String str3, Function0 function0, Function2 function2, Composer composer, int i, int i2) {
        int i3;
        String str4;
        int i4;
        String str5;
        int i5;
        Function0 function02;
        int i6;
        Function2 function22;
        int i7;
        String str6;
        String str7;
        Function0 function03;
        Function2 function23;
        RecomposeScopeImpl endRestartGroup;
        Function0 function04;
        String str8;
        char c;
        boolean z;
        Function2 function24;
        Modifier.Companion companion;
        boolean z2;
        String str9;
        Function0 function05;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1150992909);
        Applier applier = gapComposer.applier;
        int i8 = i & 6;
        Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
        if (i8 == 0) {
            i3 = (gapComposer.changed(companion2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            str4 = str;
            i3 |= gapComposer.changed(str4) ? 32 : 16;
            if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                i3 |= gapComposer.changed(str2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                str5 = str3;
                i3 |= gapComposer.changed(str5) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    function02 = function0;
                    i3 |= gapComposer.changedInstance(function02) ? 16384 : PKIFailureInfo.certRevoked;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((196608 & i) == 0) {
                        function22 = function2;
                        i3 |= gapComposer.changedInstance(function22) ? PKIFailureInfo.unsupportedVersion : 65536;
                        i7 = i3;
                        if (gapComposer.shouldExecute(i7 & 1, (i7 & 74899) != 74898)) {
                            String str10 = i9 != 0 ? null : str4;
                            if (i4 != 0) {
                                str5 = null;
                            }
                            if (i5 != 0) {
                                Object rememberedValue = gapComposer.rememberedValue();
                                if (rememberedValue == Composer.Companion.Empty) {
                                    rememberedValue = new SsnViewKt$$ExternalSyntheticLambda0(22);
                                    gapComposer.updateRememberedValue(rememberedValue);
                                }
                                function04 = (Function0) rememberedValue;
                            } else {
                                function04 = function02;
                            }
                            Function2 function25 = i6 != 0 ? null : function22;
                            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
                            Strings.getSizes(gapComposer).getClass();
                            DefaultSizes.spacing.getClass();
                            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m178borderxT4_qwU(SpacerKt.m299paddingVpY3zN4(fillMaxWidth, 16.0f, 16.0f), 1.0f, Strings.getColors(gapComposer).semantic.border.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)), 24.0f);
                            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
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
                            if (function25 == null) {
                                gapComposer.startReplaceGroup(1303870891);
                                gapComposer.end(false);
                                str8 = str5;
                                c = 0;
                            } else {
                                gapComposer.startReplaceGroup(1303870892);
                                Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion2, 1.0f);
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                                str8 = str5;
                                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth2);
                                gapComposer.startReusableNode();
                                if (gapComposer.inserting) {
                                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                                } else {
                                    gapComposer.useNode();
                                }
                                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                                Recorder$$ExternalSyntheticOutline1.m(0, function25, gapComposer, true);
                                c = 0;
                                re$$ExternalSyntheticOutline0.m(companion2, 20.0f, gapComposer, false);
                            }
                            if (str10 == null) {
                                gapComposer.startReplaceGroup(1304032060);
                                gapComposer.end(false);
                                z = false;
                            } else {
                                gapComposer.startReplaceGroup(1304032061);
                                z = false;
                                Room.m1165Text25TpFw(3, 0, 0, 0, 196608, 0, 3026, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).sectionTitle, new TextLineBalancing(1), str10, (Map) null, (Function1) null, false);
                                gapComposer.end(false);
                            }
                            if (str2 == null) {
                                gapComposer.startReplaceGroup(1304301171);
                                gapComposer.end(z);
                                str9 = str8;
                                z2 = z;
                                companion = companion2;
                                function24 = function25;
                            } else {
                                gapComposer.startReplaceGroup(1304301172);
                                if (str10 == null) {
                                    gapComposer.startReplaceGroup(1301668638);
                                } else {
                                    re$$ExternalSyntheticOutline0.m(gapComposer, 1301668639, companion2, 12.0f, gapComposer);
                                }
                                gapComposer.end(z);
                                function24 = function25;
                                companion = companion2;
                                Room.m1165Text25TpFw(3, 10, 0, 0, 1769472, 0, 2962, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, new TextLineBalancing(1), str2, (Map) null, (Function1) null, false);
                                z2 = false;
                                gapComposer.end(false);
                                str9 = str8;
                            }
                            if (str9 == null) {
                                gapComposer.startReplaceGroup(1304640311);
                                gapComposer.end(z2);
                                function05 = function04;
                            } else {
                                Modifier.Companion companion3 = companion;
                                re$$ExternalSyntheticOutline0.m(gapComposer, 1304640312, companion3, 20.0f, gapComposer);
                                function05 = function04;
                                coil3.size.SizeKt.Button(function05, SizeKt.fillMaxWidth(companion3, 1.0f), null, false, false, null, Expect_jvmKt.rememberComposableLambda(1469988209, new SetPinViewKt$$ExternalSyntheticLambda7(str9, 12), gapComposer), gapComposer, ((i7 >> 12) & 14) | 1572912, 60);
                                gapComposer = gapComposer;
                                gapComposer.end(z2);
                            }
                            gapComposer.end(true);
                            function03 = function05;
                            str7 = str9;
                            function23 = function24;
                            str6 = str10;
                        } else {
                            gapComposer.skipToGroupEnd();
                            str6 = str4;
                            str7 = str5;
                            function03 = function02;
                            function23 = function22;
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda3(str6, str2, str7, function03, function23, i, i2);
                            return;
                        }
                        return;
                    }
                    function22 = function2;
                    i7 = i3;
                    if (gapComposer.shouldExecute(i7 & 1, (i7 & 74899) != 74898)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function02 = function0;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                function22 = function2;
                i7 = i3;
                if (gapComposer.shouldExecute(i7 & 1, (i7 & 74899) != 74898)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            str5 = str3;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function02 = function0;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            function22 = function2;
            i7 = i3;
            if (gapComposer.shouldExecute(i7 & 1, (i7 & 74899) != 74898)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        str4 = str;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        str5 = str3;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function02 = function0;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        function22 = function2;
        i7 = i3;
        if (gapComposer.shouldExecute(i7 & 1, (i7 & 74899) != 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void HapticEffect(StatusResultViewModel statusResultViewModel, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1513515760);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(statusResultViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Continuation continuation = null;
            StatusResultViewModel.Ready ready = statusResultViewModel instanceof StatusResultViewModel.Ready ? (StatusResultViewModel.Ready) statusResultViewModel : null;
            StatusResultViewModel.Ready.HapticEffect hapticEffect = ready != null ? ready.hapticEffect : null;
            Haptics haptics = (Haptics) gapComposer.consume(HapticsKt.LocalHaptics);
            RealHapticVibrator realHapticVibrator = (RealHapticVibrator) gapComposer.consume(HapticVibratorKt.LocalHapticVibrator);
            boolean changed = gapComposer.changed(hapticEffect == null ? -1 : hapticEffect.ordinal()) | gapComposer.changedInstance(realHapticVibrator) | gapComposer.changed(haptics);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SetNameViewKt$SetName$2$1(hapticEffect, realHapticVibrator, haptics, continuation, 20);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, hapticEffect, (Function2) rememberedValue);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalShortlinkSheetKt$$ExternalSyntheticLambda8(statusResultViewModel, i, 10);
        }
    }

    public static final void Render(LayoutUpdate.Promotions promotions, Function1 function1, Modifier modifier, Composer composer, int i) {
        ComposableLambdaImpl rememberComposableLambda;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(999314599);
        int i2 = i | (gapComposer.changedInstance(promotions) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            String str = promotions.template.image_url;
            if (str == null) {
                gapComposer.startReplaceGroup(-2131881359);
                gapComposer.end(false);
                rememberComposableLambda = null;
            } else {
                gapComposer.startReplaceGroup(-2131881358);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1757799498, new ConfirmBackOfCheckKt$$ExternalSyntheticLambda6(str, 12), gapComposer);
                gapComposer.end(false);
            }
            AppMessageInAppPromoTemplate appMessageInAppPromoTemplate = promotions.template;
            AppMessageHeadline appMessageHeadline = appMessageInAppPromoTemplate.headline;
            String str2 = appMessageHeadline != null ? appMessageHeadline.title_text : null;
            String str3 = appMessageHeadline != null ? appMessageHeadline.detail_text : null;
            AppMessageAction appMessageAction = appMessageInAppPromoTemplate.primary_navigation_action;
            String str4 = appMessageAction != null ? appMessageAction.title : null;
            boolean changedInstance = gapComposer.changedInstance(promotions) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BulletinTileKt$$ExternalSyntheticLambda12(22, function1, promotions);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CallToAction(str2, str3, str4, (Function0) rememberedValue, rememberComposableLambda, gapComposer, 6, 0);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda9(promotions, function1, modifier2, i, 1);
        }
    }

    public static final void StatusResult(StatusResultViewModel statusResultViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1672374585);
        int i2 = (gapComposer.changedInstance(statusResultViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        boolean z = false;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            if ((statusResultViewModel instanceof StatusResultViewModel.Loading) || ((statusResultViewModel instanceof StatusResultViewModel.Ready) && ((StatusResultViewModel.Ready) statusResultViewModel).loading)) {
                z = true;
            }
            HapticEffect(statusResultViewModel, gapComposer, i2 & 14);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1854650076, new TabContentViewKt$$ExternalSyntheticLambda26(statusResultViewModel, z, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda9(statusResultViewModel, function1, modifier2, i, 2);
        }
    }

    public static final void Render(LayoutUpdate.PromoText promoText, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1237055370);
        int i2 = (gapComposer.changedInstance(promoText) ? 4 : 2) | i | 48;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            CallToAction(null, promoText.promoText, null, null, null, gapComposer, 6, 58);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SetPinViewKt$$ExternalSyntheticLambda2(promoText, modifier, i, 23);
        }
    }
}
