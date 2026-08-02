package com.squareup.cash.moneybot.widgets;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.ScaffoldKt$$ExternalSyntheticLambda5;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.material3.OutlinedTextFieldDefaults$$ExternalSyntheticLambda1;
import androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda4;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda10;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.haptic.HapticVibratorKt;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.theme.RippleNodeFactory;
import com.squareup.cash.blockers.views.CashtagViewKt$Cashtag$1$1;
import com.squareup.cash.card.onboarding.CardStudioViewV2Kt$$ExternalSyntheticLambda27;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.money.views.MoneyTabThemedHeaderKt$$ExternalSyntheticLambda13;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda11;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda9;
import com.squareup.cash.pools.views.PoolErrorViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda7;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda17;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class UtilsKt {

    /* renamed from: lambda$-506894838, reason: not valid java name */
    public static final ComposableLambdaImpl f505lambda$506894838 = new ComposableLambdaImpl(new MoneyTabThemedHeaderKt$$ExternalSyntheticLambda13(27), false, -506894838);
    public static final ComposableLambdaImpl lambda$533797784 = new ComposableLambdaImpl(new MoneyTabThemedHeaderKt$$ExternalSyntheticLambda13(28), false, 533797784);

    public static final void AttachmentButton(Function0 function0, Composer composer, int i) {
        int i2;
        byte b;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1872053991);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            BiasAlignment biasAlignment = Alignment.Companion.Center;
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.m290width3ABfNKs(Modifier.Companion.$$INSTANCE, 52.0f), 52.0f);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            Modifier m181clickableO2vRcR0 = ImageKt.m181clickableO2vRcR0(m277height3ABfNKs, (MutableInteractionSourceImpl) rememberedValue, RippleKt.m3400rippleYJYuY3k(0L, false, 30.0f, null, gapComposer, 432, 9), true, "", new Role(0), function0);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier floatingBackground = floatingBackground(m181clickableO2vRcR0, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(32.0f), gapComposer);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, floatingBackground);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(-2141781138);
            long j = ((Color) gapComposer.consume(ArcadeThemeKt.LocalIconColor)).value;
            if (j == 16) {
                j = Strings.getColors(gapComposer).semantic.icon.standard;
            }
            long j2 = j;
            gapComposer.end(false);
            b = 0;
            Trace.m1191Iconww6aTOc(Icons.Add16, Room.stringResource(gapComposer, R.string.floating_chat_send_attachment_button_content_description), (Modifier) null, j2, gapComposer, 6, 4);
            gapComposer.end(true);
        } else {
            b = 0;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FloatingChatInputKt$$ExternalSyntheticLambda8(function0, i, b, b);
        }
    }

    public static final void CancelButton(int i, Composer composer, Modifier modifier, Function0 function0) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1409837243);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            BiasAlignment biasAlignment = Alignment.Companion.Center;
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.m290width3ABfNKs(modifier, 40.0f), 40.0f);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(m277height3ABfNKs, (MutableInteractionSourceImpl) rememberedValue, RippleKt.m3400rippleYJYuY3k(0L, false, 20.0f, null, gapComposer, 432, 9), false, "", new Role(0), function0, 4);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(m182clickableO2vRcR0$default, colors.component.button.prominent.background.f160default, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(40.0f));
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Modifier clip = ClipKt.clip(SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 16.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(4.0f));
            Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(clip, colors2.component.button.prominent.icon.f161default, ColorKt.RectangleShape), gapComposer, 0);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolErrorViewKt$$ExternalSyntheticLambda0(i, modifier, function0);
        }
    }

    public static final void CollapsedChatInput(TextFieldValue textFieldValue, Modifier modifier, String str, Function1 function1, Function0 function0, Composer composer, int i) {
        int i2;
        String str2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1976667012);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(textFieldValue) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(true) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            str2 = str;
            i2 |= gapComposer.changed(str2) ? 2048 : 1024;
        } else {
            str2 = str;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(SizeKt.wrapContentSize$default(modifier, null, 3), 52.0f, RecyclerView.DECELERATION_RATE, 2);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier floatingBackground = floatingBackground(m279heightInVpY3zN4$default, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(9999.0f), gapComposer);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(floatingBackground, 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 10);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
            Icons icons = Icons.Search24;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Trace.m1191Iconww6aTOc(icons, (String) null, SizeKt.m285size3ABfNKs(companion, 24.0f), 0L, gapComposer, 438, 8);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 16.0f));
            PromptInput(textFieldValue, SizeKt.wrapContentWidth$default(companion, null, 3), str2, function1, function0, null, null, gapComposer, ((i2 << 3) & 112) | 102236550 | (i2 & 7168) | (57344 & i2) | (458752 & i2) | ((i2 << 15) & 29360128));
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabToolbarsKt$$ExternalSyntheticLambda17((Object) textFieldValue, (Object) modifier, (Object) str, function1, (Object) function0, i, 5);
        }
    }

    public static final void ExpandedChatInput(Modifier modifier, TextFieldValue textFieldValue, FloatingChatInputStatus floatingChatInputStatus, boolean z, boolean z2, boolean z3, String str, Function1 function1, Function0 function0, Function0 function02, Function0 function03, Function2 function2, Function2 function22, Composer composer, int i, int i2) {
        int i3;
        boolean z4;
        boolean z5;
        int i4;
        TextFieldValue textFieldValue2;
        Function0 function04;
        Function2 function23;
        FocusRequester focusRequester;
        FocusRequester focusRequester2;
        Object obj;
        BiasAlignment.Vertical vertical;
        BiasAlignment.Vertical vertical2;
        MutableInteractionSourceImpl mutableInteractionSourceImpl;
        FocusRequester focusRequester3;
        int i5;
        boolean z6;
        Function0 function05 = function0;
        BiasAlignment.Vertical vertical3 = Alignment.Companion.Bottom;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(601621144);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(textFieldValue) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(floatingChatInputStatus.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z4 = z;
            i3 |= gapComposer.changed(z4) ? 2048 : 1024;
        } else {
            z4 = z;
        }
        if ((i & 24576) == 0) {
            z5 = z2;
            i3 |= gapComposer.changed(z5) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            z5 = z2;
        }
        if ((i & 196608) == 0) {
            i3 |= gapComposer.changed(true) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= gapComposer.changed(z3) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i & 12582912) == 0) {
            i3 |= gapComposer.changed(str) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= gapComposer.changedInstance(function05) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (gapComposer.changedInstance(function02) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= gapComposer.changedInstance(function03) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= gapComposer.changedInstance(function22) ? 2048 : 1024;
        }
        int i6 = i4;
        if (gapComposer.shouldExecute(i3 & 1, ((i3 & 306783379) == 306783378 && (i6 & 1171) == 1170) ? false : true)) {
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj2 = Composer.Companion.Empty;
            if (rememberedValue == obj2) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m106m(gapComposer);
            }
            FocusRequester focusRequester4 = (FocusRequester) rememberedValue;
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            Boolean valueOf = Boolean.valueOf(z4);
            boolean changed = ((i3 & 7168) == 2048) | gapComposer.changed(delegatingSoftwareKeyboardController);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == obj2) {
                rememberedValue2 = new ComposerKt$ComposerExpanded$1$1(z4, focusRequester4, delegatingSoftwareKeyboardController, null, 2);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue2);
            Boolean valueOf2 = Boolean.valueOf(z5);
            boolean changed2 = ((i3 & 57344) == 16384) | gapComposer.changed(delegatingSoftwareKeyboardController);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue3 == obj2) {
                rememberedValue3 = new ComposerKt$ComposerExpanded$1$1(z5, focusRequester4, delegatingSoftwareKeyboardController, null, 3);
                focusRequester = focusRequester4;
                gapComposer.updateRememberedValue(rememberedValue3);
            } else {
                focusRequester = focusRequester4;
            }
            int i7 = i3 >> 12;
            Updater.LaunchedEffect(gapComposer, valueOf2, (Function2) rememberedValue3);
            Arrangement$End$1 arrangement$End$1 = SpacerKt.Start;
            BiasAlignment.Vertical vertical4 = Alignment.Companion.Top;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$End$1, vertical4, gapComposer, 0);
            int i8 = i3;
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
            ComposeUiNode.Companion.getClass();
            Function0 function06 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function06);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf3 = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf3, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (function03 != null) {
                vertical2 = vertical4;
                gapComposer.startReplaceGroup(-1585231898);
                Modifier align = rowScopeInstance.align(companion, vertical3);
                vertical = vertical3;
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                focusRequester2 = focusRequester;
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, align);
                gapComposer.startReusableNode();
                obj = obj2;
                if (gapComposer.inserting) {
                    gapComposer.createNode(function06);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                AttachmentButton(function03, gapComposer, ((i8 >> 15) & 14) | (i6 & 112));
                if (function2 == null) {
                    gapComposer.startReplaceGroup(-2013754970);
                    z6 = false;
                    gapComposer.end(false);
                } else {
                    z6 = false;
                    gapComposer.startReplaceGroup(766324155);
                    Recorder$$ExternalSyntheticOutline1.m((i6 >> 6) & 14, function2, gapComposer, false);
                }
                gapComposer.end(true);
                SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 12.0f));
                gapComposer.end(z6);
            } else {
                focusRequester2 = focusRequester;
                obj = obj2;
                vertical = vertical3;
                vertical2 = vertical4;
                gapComposer.startReplaceGroup(-1585008946);
                gapComposer.end(false);
            }
            Object rememberedValue4 = gapComposer.rememberedValue();
            Object obj3 = obj;
            if (rememberedValue4 == obj3) {
                rememberedValue4 = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl2 = (MutableInteractionSourceImpl) rememberedValue4;
            Modifier clip = ClipKt.clip(floatingBackground(rowScopeInstance.weight(1.0f, TestTagKt.testTag(companion, "expanded-chat-input"), true), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(26.0f), gapComposer), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(26.0f));
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                mutableInteractionSourceImpl = mutableInteractionSourceImpl2;
            } else {
                mutableInteractionSourceImpl = mutableInteractionSourceImpl2;
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(colors.semantic.background.subtle, true, RecyclerView.DECELERATION_RATE, new RippleAlpha(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f), gapComposer, 3120, 4);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (rememberedValue5 == obj3) {
                focusRequester3 = focusRequester2;
                rememberedValue5 = new MoneyTabUIKt$$ExternalSyntheticLambda5(focusRequester3, 10);
                gapComposer.updateRememberedValue(rememberedValue5);
            } else {
                focusRequester3 = focusRequester2;
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl3 = mutableInteractionSourceImpl;
            Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(clip, mutableInteractionSourceImpl3, m3400rippleYJYuY3k, false, null, null, (Function0) rememberedValue5, 28);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m182clickableO2vRcR0$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function06);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            if (function22 == null) {
                gapComposer.startReplaceGroup(-261885829);
                i5 = 0;
                gapComposer.end(false);
                function23 = function22;
            } else {
                i5 = 0;
                gapComposer.startReplaceGroup(-8447930);
                function23 = function22;
                Recorder$$ExternalSyntheticOutline1.m((i6 >> 9) & 14, function23, gapComposer, false);
            }
            Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(companion, 52.0f, RecyclerView.DECELERATION_RATE, 2);
            RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$End$1, vertical2, gapComposer, i5);
            int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, m279heightInVpY3zN4$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function06);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier4, composeUiNode$Companion$SetModifier$14);
            BiasAlignment.Vertical vertical5 = vertical;
            function05 = function0;
            textFieldValue2 = textFieldValue;
            PromptInput(textFieldValue2, SpacerKt.m302paddingqDBjuR0$default(rowScopeInstance.align(rowScopeInstance.weight(1.0f, SizeKt.fillMaxWidth(companion, 1.0f), true), Alignment.Companion.CenterVertically), 20.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), str, function1, function05, focusRequester3, mutableInteractionSourceImpl3, gapComposer, (i8 & 112) | 102236166 | (i7 & 7168) | (i7 & 57344) | (i7 & 458752) | ((i8 << 6) & 29360128));
            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 6.0f));
            PaddingValuesImpl m297PaddingValuesa9UjIt4$default = SpacerKt.m297PaddingValuesa9UjIt4$default(RecyclerView.DECELERATION_RATE, 6.0f, 6.0f, 6.0f, 1);
            int ordinal = floatingChatInputStatus.ordinal();
            if (ordinal == 0) {
                function04 = function02;
                gapComposer.startReplaceGroup(-1923428223);
                SendButton(((i8 >> 18) & 7168) | 6, gapComposer, SpacerKt.padding(companion, m297PaddingValuesa9UjIt4$default), function05, textFieldValue2.annotatedString.text.length() > 0 || z3);
                gapComposer.end(false);
            } else if (ordinal == 1) {
                gapComposer.startReplaceGroup(-1922826606);
                function04 = function02;
                CancelButton((i6 << 3) & 112, gapComposer, rowScopeInstance.align(SpacerKt.padding(companion, m297PaddingValuesa9UjIt4$default), vertical5), function04);
                gapComposer.end(false);
            } else {
                if (ordinal != 2) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 769236382, false);
                }
                gapComposer.startReplaceGroup(-1922879802);
                gapComposer.end(false);
                function04 = function02;
            }
            Boxes$$ExternalSyntheticOutline1.m(gapComposer, true, true, true);
        } else {
            textFieldValue2 = textFieldValue;
            function04 = function02;
            function23 = function22;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextFieldImplKt$$ExternalSyntheticLambda4(modifier, textFieldValue2, floatingChatInputStatus, z, z2, z3, str, function1, function05, function04, function03, function2, function23, i, i2);
        }
    }

    public static final void FloatingChatInput(Modifier modifier, FloatingChatInputState floatingChatInputState, FloatingChatInputStatus floatingChatInputStatus, boolean z, boolean z2, DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, String str, boolean z3, Function0 function0, Function2 function2, Function2 function22, Function1 function1, Function0 function02, Function1 function12, Composer composer, int i) {
        int i2;
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController2;
        boolean z4;
        boolean z5;
        MutableState mutableState;
        boolean z6;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(646673463);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(floatingChatInputState.ordinal()) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(floatingChatInputStatus.ordinal()) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= gapComposer.changed(z2) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            delegatingSoftwareKeyboardController2 = delegatingSoftwareKeyboardController;
            i3 |= gapComposer.changed(delegatingSoftwareKeyboardController2) ? PKIFailureInfo.unsupportedVersion : 65536;
        } else {
            delegatingSoftwareKeyboardController2 = delegatingSoftwareKeyboardController;
        }
        if ((1572864 & i) == 0) {
            i3 |= gapComposer.changed(str) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            z4 = z3;
            i3 |= gapComposer.changed(z4) ? 8388608 : 4194304;
        } else {
            z4 = z3;
        }
        if ((i & 100663296) == 0) {
            i3 |= gapComposer.changedInstance(function0) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= gapComposer.changedInstance(function2) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        int i4 = (gapComposer.changedInstance(function22) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(function02) ? 256 : 128) | (gapComposer.changedInstance(function12) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 1171) == 1170) ? false : true)) {
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = Updater.mutableStateOf$default(new TextFieldValue("", 0L, 6));
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState2 = (MutableState) rememberedValue;
            RealHapticVibrator realHapticVibrator = (RealHapticVibrator) gapComposer.consume(HapticVibratorKt.LocalHapticVibrator);
            FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) gapComposer.consume(CompositionLocalsKt.LocalFocusManager);
            boolean changedInstance = ((29360128 & i3) == 8388608) | gapComposer.changedInstance(realHapticVibrator) | ((i4 & 112) == 32) | gapComposer.changedInstance(focusOwnerImpl) | ((i3 & 458752) == 131072);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == obj) {
                rememberedValue2 = new CardStudioViewV2Kt$$ExternalSyntheticLambda27(z4, realHapticVibrator, function1, focusOwnerImpl, delegatingSoftwareKeyboardController2, mutableState2);
                mutableState = mutableState2;
                gapComposer.updateRememberedValue(rememberedValue2);
            } else {
                mutableState = mutableState2;
            }
            Function0 function03 = (Function0) rememberedValue2;
            TextFieldValue textFieldValue = (TextFieldValue) mutableState.getValue();
            boolean z7 = (i4 & 7168) == 2048;
            Object rememberedValue3 = gapComposer.rememberedValue();
            Continuation continuation = null;
            if (z7 || rememberedValue3 == obj) {
                rememberedValue3 = new CashtagViewKt$Cashtag$1$1(function12, mutableState, null, 5);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Updater.LaunchedEffect(gapComposer, textFieldValue, (Function2) rememberedValue3);
            boolean z8 = (i3 & 3670016) == 1048576;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (z8 || rememberedValue4 == obj) {
                rememberedValue4 = new ComposerKt$Composer$3$1(str, mutableState, continuation, 2);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Updater.LaunchedEffect(gapComposer, str, (Function2) rememberedValue4);
            int ordinal = floatingChatInputState.ordinal();
            if (ordinal != 0) {
                z6 = true;
                if (ordinal != 1) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1317013184, false);
                }
                gapComposer.startReplaceGroup(2122626245);
                boolean z9 = !(str == null || str.length() == 0);
                TextFieldValue textFieldValue2 = (TextFieldValue) mutableState.getValue();
                String stringResource = Room.stringResource(gapComposer, R.string.floating_chat_start_input_hint);
                Object rememberedValue5 = gapComposer.rememberedValue();
                int i5 = 21;
                if (rememberedValue5 == obj) {
                    rememberedValue5 = new MoneyTabUIKt$$ExternalSyntheticLambda9(i5, mutableState);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                int i6 = i3 >> 3;
                int i7 = i3 >> 21;
                ExpandedChatInput(modifier, textFieldValue2, floatingChatInputStatus, z2, z9, z3, stringResource, (Function1) rememberedValue5, function03, function02, function0, function2, function22, gapComposer, (i3 & 14) | 100663296 | (i3 & 896) | (i6 & 7168) | ((i3 << 6) & 458752) | (3670016 & i6), ((i4 >> 6) & 14) | (i7 & 112) | (i7 & 896) | ((i4 << 9) & 7168));
                gapComposer.end(false);
            } else {
                z6 = true;
                gapComposer.startReplaceGroup(2122303752);
                TextFieldValue textFieldValue3 = (TextFieldValue) mutableState.getValue();
                String stringResource2 = Room.stringResource(gapComposer, R.string.floating_chat_input_hint);
                Object rememberedValue6 = gapComposer.rememberedValue();
                if (rememberedValue6 == obj) {
                    rememberedValue6 = new MoneyTabUIKt$$ExternalSyntheticLambda9(20, mutableState);
                    gapComposer.updateRememberedValue(rememberedValue6);
                }
                CollapsedChatInput(textFieldValue3, modifier, stringResource2, (Function1) rememberedValue6, function03, gapComposer, ((i3 << 3) & 112) | 24576 | ((i3 >> 3) & 896));
                gapComposer.end(false);
            }
            z5 = z6;
        } else {
            gapComposer.skipToGroupEnd();
            z5 = z;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OutlinedTextFieldDefaults$$ExternalSyntheticLambda1(modifier, floatingChatInputState, floatingChatInputStatus, z5, z2, delegatingSoftwareKeyboardController, str, z3, function0, function2, function22, function1, function02, function12, i);
        }
    }

    /* renamed from: FullscreenNotice-6RhP_wg, reason: not valid java name */
    public static final void m3636FullscreenNotice6RhP_wg(Modifier modifier, String str, String str2, String str3, Function0 function0, String str4, Function0 function02, long j, Composer composer, int i, int i2) {
        String str5;
        int i3;
        int i4;
        Function0 function03;
        String str6;
        GapComposer gapComposer;
        long j2;
        int i5;
        long j3;
        int i6;
        str.getClass();
        str2.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-604957451);
        Applier applier = gapComposer2.applier;
        int i7 = i | 432 | (gapComposer2.changed(str) ? 2048 : 1024) | (gapComposer2.changed(str2) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer2.changed(str3) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer2.changedInstance(function0) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        int i8 = i2 & 128;
        if (i8 != 0) {
            i3 = i7 | 12582912;
            str5 = str4;
        } else {
            str5 = str4;
            i3 = i7 | (gapComposer2.changed(str5) ? 8388608 : 4194304);
        }
        int i9 = i2 & 256;
        if (i9 != 0) {
            i4 = i3 | 100663296;
        } else {
            i4 = i3 | (gapComposer2.changedInstance(function02) ? 67108864 : 33554432);
        }
        int i10 = i4 | 268435456;
        if (gapComposer2.shouldExecute(i10 & 1, (306783379 & i10) != 306783378)) {
            gapComposer2.startDefaults();
            if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                if (i8 != 0) {
                    str5 = null;
                }
                function03 = i9 != 0 ? null : function02;
                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    i5 = -1879048193;
                } else {
                    i5 = -1879048193;
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                j3 = colors.semantic.background.f1047app;
                i6 = i10 & i5;
            } else {
                gapComposer2.skipToGroupEnd();
                i6 = i10 & (-1879048193);
                function03 = function02;
                j3 = j;
            }
            gapComposer2.endDefaults();
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(modifier, j3, ColorKt.RectangleShape);
            int i11 = i6;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14, 1.0f, true);
            Strings.getSizes(gapComposer2).getClass();
            DefaultSizes.spacing.getClass();
            long j4 = j3;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(m, 32.0f, RecyclerView.DECELERATION_RATE, 2);
            Strings.getSizes(gapComposer2).getClass();
            Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(m300paddingVpY3zN4$default, RecyclerView.DECELERATION_RATE, 64.0f, 1);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer2, 54);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m300paddingVpY3zN4$default2);
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
            gapComposer2.startReplaceGroup(-461871888);
            gapComposer2.end(false);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
            gapComposer = gapComposer2;
            Room.m1165Text25TpFw(0, 0, 0, 3, (i11 >> 9) & 14, 0, 3826, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer2).headlineSmall, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            Room.m1165Text25TpFw(0, 0, 0, 3, (i11 >> 12) & 14, 0, 3826, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(556814973, new FullscreenNoticeKt$$ExternalSyntheticLambda0(str5, function03, str3, function0), gapComposer), gapComposer, 24576, 15);
            gapComposer.end(true);
            str6 = str5;
            j2 = j4;
        } else {
            gapComposer2.skipToGroupEnd();
            function03 = function02;
            str6 = str5;
            gapComposer = gapComposer2;
            j2 = j;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetScope$$ExternalSyntheticLambda7(modifier, str, str2, str3, function0, str6, function03, j2, i, i2);
        }
    }

    public static final void PromptInput(TextFieldValue textFieldValue, Modifier modifier, String str, Function1 function1, Function0 function0, FocusRequester focusRequester, MutableInteractionSourceImpl mutableInteractionSourceImpl, Composer composer, int i) {
        int i2;
        Modifier focusRequester2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(897997008);
        int i3 = i & 6;
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        if (i3 == 0) {
            i2 = (gapComposer.changed(rowScopeInstance) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(textFieldValue) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((i & 196608) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer.changed(focusRequester) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i2 |= gapComposer.changed(true) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= gapComposer.changed(mutableInteractionSourceImpl) ? 67108864 : 33554432;
        }
        if (gapComposer.shouldExecute(i2 & 1, (38347923 & i2) != 38347922)) {
            Modifier align = rowScopeInstance.align(SpacerKt.m300paddingVpY3zN4$default(SizeKt.m279heightInVpY3zN4$default(TestTagKt.testTag(modifier, "expanded-chat-input-text-field"), RecyclerView.DECELERATION_RATE, 292.0f, 1), RecyclerView.DECELERATION_RATE, 14.0f, 1), Alignment.Companion.CenterVertically);
            Modifier modifier2 = Modifier.Companion.$$INSTANCE;
            if (focusRequester != null && (focusRequester2 = FocusTraversalKt.focusRequester(modifier2, focusRequester)) != null) {
                modifier2 = focusRequester2;
            }
            Modifier then = align.then(modifier2);
            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).bodyMedium, Strings.getColors(gapComposer).semantic.text.prominent, 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777214);
            SolidColor solidColor = new SolidColor(Strings.getColors(gapComposer).semantic.text.standard);
            KeyboardOptions keyboardOptions = KeyboardOptions.Default;
            KeyboardOptions m359copyINvB4aQ$default = KeyboardOptions.m359copyINvB4aQ$default(0, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            boolean z = (458752 & i2) == 131072;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new LocalMapKt$$ExternalSyntheticLambda10(25, function0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            KeyboardActions keyboardActions = new KeyboardActions((Function1) rememberedValue, null, null, 62);
            boolean z2 = (57344 & i2) == 16384;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new UtilsKt$$ExternalSyntheticLambda0(24, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            BasicTextFieldKt.BasicTextField(textFieldValue, (Function1) rememberedValue2, then, true, m994copyp1EtxEg$default, m359copyINvB4aQ$default, keyboardActions, false, 0, 0, null, null, mutableInteractionSourceImpl, solidColor, Expect_jvmKt.rememberComposableLambda(-822648499, new MoneyTabUIKt$$ExternalSyntheticLambda11(12, textFieldValue, str), gapComposer), gapComposer, ((i2 >> 3) & 14) | ((i2 >> 12) & 7168), ((i2 >> 15) & 7168) | 196608, 7952);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScaffoldKt$$ExternalSyntheticLambda5(textFieldValue, modifier, str, function1, function0, focusRequester, mutableInteractionSourceImpl, i, 9);
        }
    }

    public static final void SendButton(int i, Composer composer, Modifier modifier, Function0 function0, boolean z) {
        int i2;
        Function0 function02;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(997139825);
        int i3 = i & 6;
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        if (i3 == 0) {
            i2 = (gapComposer.changed(rowScopeInstance) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function02 = function0;
            i2 |= gapComposer.changedInstance(function02) ? 2048 : 1024;
        } else {
            function02 = function0;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            BiasAlignment biasAlignment = Alignment.Companion.Center;
            Modifier align = rowScopeInstance.align(SizeKt.m277height3ABfNKs(SizeKt.m290width3ABfNKs(TestTagKt.testTag(modifier, "send-button"), 40.0f), 40.0f), Alignment.Companion.Bottom);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            Modifier m181clickableO2vRcR0 = ImageKt.m181clickableO2vRcR0(align, (MutableInteractionSourceImpl) rememberedValue, RippleKt.m3400rippleYJYuY3k(0L, false, 20.0f, null, gapComposer, 432, 9), z, "", new Role(0), function02);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(m181clickableO2vRcR0, colors.component.button.prominent.background.f160default, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(40.0f));
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 20.0f);
            Painter painterResource = Countries.painterResource(R.drawable.send_icon, 0, gapComposer);
            String stringResource = Room.stringResource(gapComposer, R.string.floating_chat_send_button_content_description);
            Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Trace.m1190Iconww6aTOc(painterResource, stringResource, m285size3ABfNKs, colors2.component.button.prominent.icon.f161default, gapComposer, Painter.$stable | MLKEMEngine.KyberPolyBytes, 0);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ComposerKt$$ExternalSyntheticLambda12(modifier, z, function0, i, 2);
        }
    }

    public static final Modifier floatingBackground(Modifier modifier, RoundedCornerShape roundedCornerShape, Composer composer) {
        modifier.getClass();
        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
        GapComposer gapComposer = (GapComposer) composer;
        Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
        if (colors == null) {
            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
        } else {
            gapComposer.startReplaceGroup(-1762997739);
            gapComposer.end(false);
        }
        Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(modifier, 1.0f, colors.semantic.border.subtle, roundedCornerShape);
        Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
        if (colors2 == null) {
            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
        } else {
            gapComposer.startReplaceGroup(-1762997739);
            gapComposer.end(false);
        }
        return ImageKt.m177backgroundbw27NRU(m178borderxT4_qwU, colors2.semantic.background.f1047app, roundedCornerShape);
    }

    public static final KeyboardState rememberKeyboardState(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
        int i = Arrangement$End$1.current(gapComposer).ime.getInsets$foundation_layout().bottom;
        int i2 = Arrangement$End$1.current(gapComposer).imeAnimationSource.getValue$foundation_layout().bottom;
        int i3 = Arrangement$End$1.current(gapComposer).imeAnimationTarget.getValue$foundation_layout().bottom;
        return i3 > i2 ? KeyboardState.AnimatingIn : i3 < i2 ? KeyboardState.AnimatingOut : i > 0 ? KeyboardState.Open : KeyboardState.Closed;
    }
}
