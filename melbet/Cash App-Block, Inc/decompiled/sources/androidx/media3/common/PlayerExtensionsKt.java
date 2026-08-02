package androidx.media3.common;

import android.os.Handler;
import android.os.Looper;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.internal.Lock;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material3.SliderKt$$ExternalSyntheticLambda4;
import androidx.compose.material3.TextKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.LinearGradient;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.media3.common.text.SpanUtil;
import androidx.media3.datasource.BitmapUtil;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.paging.PageFetcher$flow$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpc;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.moneybot.widgets.ComposerKt$$ExternalSyntheticLambda12;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.support.chat.viewmodels.ChatAttachmentViewModel;
import com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda2;
import com.squareup.cash.support.chat.views.input.InputAreaKt$$ExternalSyntheticLambda0;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.full.KClasses$$Lambda$2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.android.HandlerDispatcherKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public abstract class PlayerExtensionsKt {
    public static final void AddAttachmentButton(int i, Composer composer, Modifier modifier, Function0 function0, boolean z) {
        int i2;
        boolean z2;
        Function0 function02;
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-317710535);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(modifier, 52.0f);
            long j2 = Strings.getColors(gapComposer).semantic.border.subtle;
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
            Modifier clip = ClipKt.clip(ImageKt.m178borderxT4_qwU(m285size3ABfNKs, 1.0f, j2, roundedCornerShape), roundedCornerShape);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            z2 = z;
            function02 = function0;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ImageKt.m182clickableO2vRcR0$default(clip, (MutableInteractionSourceImpl) rememberedValue, RippleKt.m3400rippleYJYuY3k(Strings.getColors(gapComposer).semantic.background.ripple, false, RecyclerView.DECELERATION_RATE, null, gapComposer, 0, 14), z, null, new Role(0), function0, 8), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
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
            Icons icons = Icons.Add24;
            String stringResource = Room.stringResource(gapComposer, R.string.support_chat_attach_file_button_content_description);
            Modifier m285size3ABfNKs2 = SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 24.0f);
            if (z2) {
                gapComposer.startReplaceGroup(1085831696);
                j = Strings.getColors(gapComposer).semantic.icon.standard;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1085900144);
                j = Strings.getColors(gapComposer).semantic.icon.disabled;
                gapComposer.end(false);
            }
            Trace.m1191Iconww6aTOc(icons, stringResource, m285size3ABfNKs2, j, gapComposer, 390, 0);
            gapComposer.end(true);
        } else {
            z2 = z;
            function02 = function0;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ComposerKt$$ExternalSyntheticLambda12(function02, z2, modifier, i);
        }
    }

    public static final void AttachmentPreview(ChatAttachmentViewModel chatAttachmentViewModel, Function0 function0, Composer composer, int i) {
        int i2;
        Function0 function02;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-943116946);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(chatAttachmentViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            function02 = function0;
            gapComposer.skipToGroupEnd();
        } else if (chatAttachmentViewModel instanceof ChatAttachmentViewModel.ImageAttachmentViewModel) {
            gapComposer.startReplaceGroup(1279295544);
            BitmapUtil.InputImageAttachment(i2 & 112, gapComposer, null, ((ChatAttachmentViewModel.ImageAttachmentViewModel) chatAttachmentViewModel).uri, function0);
            gapComposer.end(false);
            function02 = function0;
        } else if (chatAttachmentViewModel instanceof ChatAttachmentViewModel.FileAttachmentViewModel) {
            gapComposer.startReplaceGroup(1279447816);
            ChatAttachmentViewModel.FileAttachmentViewModel fileAttachmentViewModel = (ChatAttachmentViewModel.FileAttachmentViewModel) chatAttachmentViewModel;
            function02 = function0;
            SpanUtil.InputFileAttachment((i2 << 3) & 896, gapComposer, null, fileAttachmentViewModel.name, fileAttachmentViewModel.fileTypeDescription, function02);
            gapComposer.end(false);
        } else {
            function02 = function0;
            if (chatAttachmentViewModel != null) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -97281894, false);
            }
            gapComposer.startReplaceGroup(1279627275);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShareSheetViewKt$$ExternalSyntheticLambda2(chatAttachmentViewModel, function02, i, 17);
        }
    }

    public static final void ChatInputAreaContent(ChatAttachmentViewModel chatAttachmentViewModel, TextFieldState textFieldState, boolean z, boolean z2, boolean z3, Function0 function0, Function0 function02, Function0 function03, Composer composer, int i) {
        LinearGradient m132linearGradientmHitzGk;
        textFieldState.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2095883799);
        int i2 = i | (gapComposer.changedInstance(chatAttachmentViewModel) ? 4 : 2) | (gapComposer.changed(textFieldState) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128) | (gapComposer.changed(z2) ? 2048 : 1024) | (gapComposer.changed(z3) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changedInstance(function0) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changedInstance(function02) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer.changedInstance(function03) ? 8388608 : 4194304);
        if (gapComposer.shouldExecute(i2 & 1, (4793491 & i2) != 4793490)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            Pair pair = new Pair(Float.valueOf(RecyclerView.DECELERATION_RATE), new Color(Color.Transparent));
            Float valueOf = Float.valueOf(0.5f);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Pair pair2 = new Pair(valueOf, new Color(Color.m675copywmQWz5c$default(0.8f, colors.semantic.background.f1047app, 14)));
            Float valueOf2 = Float.valueOf(1.0f);
            Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            m132linearGradientmHitzGk = Lock.m132linearGradientmHitzGk((Pair[]) Arrays.copyOf(r0, new Pair[]{pair, pair2, new Pair(valueOf2, new Color(colors2.semantic.background.f1047app))}.length), (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & BodyPartID.bodyIdMax));
            Modifier background$default = ImageKt.background$default(fillMaxWidth, m132linearGradientmHitzGk, null, 6);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Bottom, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, background$default);
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
            if (z3) {
                gapComposer.startReplaceGroup(1606273966);
                AddAttachmentButton(((i2 >> 18) & 14) | MLKEMEngine.KyberPolyBytes | ((i2 >> 3) & 112), gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, 16.0f, 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 4), function02, z);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1606465205);
                gapComposer.end(false);
            }
            InputColumn(chatAttachmentViewModel, textFieldState, z2, function0, function03, Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SpacerKt.m302paddingqDBjuR0$default(companion, z3 ? 16.0f : 20.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), true), gapComposer, (i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i2 >> 3) & 896) | ((i2 >> 6) & 7168) | ((i2 >> 9) & 57344));
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InputAreaKt$$ExternalSyntheticLambda0(chatAttachmentViewModel, textFieldState, z, z2, z3, function0, function02, function03, i);
        }
    }

    public static final void InputColumn(ChatAttachmentViewModel chatAttachmentViewModel, TextFieldState textFieldState, boolean z, Function0 function0, Function0 function02, Modifier modifier, Composer composer, int i) {
        TextFieldState textFieldState2;
        Function0 function03;
        boolean z2;
        int i2;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-192564964);
        Applier applier = gapComposer.applier;
        int i3 = (gapComposer.changedInstance(chatAttachmentViewModel) ? 4 : 2) | i | (gapComposer.changed(textFieldState) ? 32 : 16);
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= gapComposer.changedInstance(function02) ? 16384 : PKIFailureInfo.certRevoked;
        }
        int i4 = i3 | (gapComposer.changed(modifier) ? PKIFailureInfo.unsupportedVersion : 65536);
        if (gapComposer.shouldExecute(i4 & 1, (74899 & i4) != 74898)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new ChatView$$ExternalSyntheticLambda2(26);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier m276defaultMinSizeVpY3zN4$default = SizeKt.m276defaultMinSizeVpY3zN4$default(SizeKt.fillMaxWidth(SpacerKt.m302paddingqDBjuR0$default(SemanticsModifierKt.semantics(modifier, false, (Function1) rememberedValue), RecyclerView.DECELERATION_RATE, 16.0f, 16.0f, 16.0f, 1), 1.0f), RecyclerView.DECELERATION_RATE, 52.0f, 1);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(m276defaultMinSizeVpY3zN4$default, 1.0f, colors.semantic.border.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(26.0f));
            Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(ClipKt.clip(ImageKt.m177backgroundbw27NRU(m178borderxT4_qwU, colors2.semantic.background.f1047app, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(26.0f)), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(26.0f)), 20.0f, 6.0f, 6.0f, 6.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m301paddingqDBjuR0);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            boolean z3 = textFieldState.getValue$foundation().text.length() > 0;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (z3) {
                i2 = i4;
                modifier2 = AnimatedContentKt.animateContentSize$default(companion, null, 3);
            } else {
                i2 = i4;
                modifier2 = companion;
            }
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 6);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, modifier2);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            int i5 = i2 >> 6;
            AttachmentPreview(chatAttachmentViewModel, function0, gapComposer, (i2 & 14) | (i5 & 112));
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ChatView$$ExternalSyntheticLambda2(27);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            textFieldState2 = textFieldState;
            zzpc.InputTextField(textFieldState2, SizeKt.m279heightInVpY3zN4$default(SizeKt.m276defaultMinSizeVpY3zN4$default(SpacerKt.m302paddingqDBjuR0$default(SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue2), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 48.0f, RecyclerView.DECELERATION_RATE, 11), RecyclerView.DECELERATION_RATE, 40.0f, 1), RecyclerView.DECELERATION_RATE, 292.0f, 1), gapComposer, (i2 >> 3) & 14);
            gapComposer.end(true);
            Modifier align = BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.BottomEnd);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new ChatView$$ExternalSyntheticLambda2(28);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Modifier semantics = SemanticsModifierKt.semantics(align, false, (Function1) rememberedValue3);
            z2 = z;
            function03 = function02;
            SendButton((i5 & 14) | ((i2 >> 9) & 112), gapComposer, semantics, function03, z2);
            gapComposer.end(true);
        } else {
            textFieldState2 = textFieldState;
            function03 = function02;
            z2 = z;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SliderKt$$ExternalSyntheticLambda4(chatAttachmentViewModel, textFieldState2, z2, function0, function03, modifier, i);
        }
    }

    public static final void SendButton(int i, Composer composer, Modifier modifier, Function0 function0, boolean z) {
        int i2;
        Function0 function02;
        GapComposer gapComposer;
        long j;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-578817095);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function02 = function0;
            i2 |= gapComposer2.changedInstance(function02) ? 32 : 16;
        } else {
            function02 = function0;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(modifier) ? 256 : 128;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            if (z) {
                gapComposer2.startReplaceGroup(753794826);
                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                j = colors.semantic.icon.standard;
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(753863274);
                Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                j = colors2.semantic.icon.disabled;
                gapComposer2.end(false);
            }
            State m153animateColorAsStateeuL9pac = SingleValueAnimationKt.m153animateColorAsStateeuL9pac(j, null, "send button color", gapComposer2, MLKEMEngine.KyberPolyBytes, 10);
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(modifier, 40.0f);
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(m285size3ABfNKs, roundedCornerShape), ((Color) m153animateColorAsStateeuL9pac.getValue()).value, roundedCornerShape);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors3 = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
            if (colors3 == null) {
                colors3 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(m177backgroundbw27NRU, mutableInteractionSourceImpl, RippleKt.m3400rippleYJYuY3k(colors3.component.button.prominent.background.ripple, false, RecyclerView.DECELERATION_RATE, null, gapComposer2, 0, 14), z, null, new Role(0), function02, 8);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m182clickableO2vRcR0$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Icons icons = Icons.SendArrow24;
            String stringResource = Room.stringResource(gapComposer2, R.string.support_chat_send_button_content_description);
            Modifier m285size3ABfNKs2 = SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 24.0f);
            Colors colors4 = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
            if (colors4 == null) {
                colors4 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Trace.m1191Iconww6aTOc(icons, stringResource, m285size3ABfNKs2, colors4.semantic.icon.inverse, gapComposer2, 390, 0);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ComposerKt$$ExternalSyntheticLambda12(z, function0, modifier, i, 4);
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewAddCashHalfSheet.deepLinkSpecs;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void listen(Player player, TextKt$$ExternalSyntheticLambda0 textKt$$ExternalSyntheticLambda0, ContinuationImpl continuationImpl) {
        PlayerExtensionsKt$listen$1 playerExtensionsKt$listen$1;
        int i;
        if (continuationImpl instanceof PlayerExtensionsKt$listen$1) {
            playerExtensionsKt$listen$1 = (PlayerExtensionsKt$listen$1) continuationImpl;
            int i2 = playerExtensionsKt$listen$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                playerExtensionsKt$listen$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = playerExtensionsKt$listen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = playerExtensionsKt$listen$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (Intrinsics.areEqual(Looper.myLooper(), ((ExoPlayerImpl) player).applicationLooper)) {
                        playerExtensionsKt$listen$1.label = 1;
                        listenImpl(player, textKt$$ExternalSyntheticLambda0, playerExtensionsKt$listen$1);
                        return;
                    }
                    Handler createAsync = Handler.createAsync(((ExoPlayerImpl) player).applicationLooper);
                    createAsync.getClass();
                    int i3 = HandlerDispatcherKt.$r8$clinit;
                    HandlerContext handlerContext = new HandlerContext(createAsync, null, false);
                    PageFetcher$flow$1 pageFetcher$flow$1 = new PageFetcher$flow$1(player, textKt$$ExternalSyntheticLambda0, null, 21);
                    playerExtensionsKt$listen$1.label = 2;
                    if (JobKt.withContext(handlerContext, pageFetcher$flow$1, playerExtensionsKt$listen$1) == coroutineSingletons) {
                        return;
                    }
                } else {
                    if (i == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
            }
        }
        playerExtensionsKt$listen$1 = new PlayerExtensionsKt$listen$1(continuationImpl);
        Object obj2 = playerExtensionsKt$listen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = playerExtensionsKt$listen$1.label;
        if (i != 0) {
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$1();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void listenImpl(Player player, Function2 function2, ContinuationImpl continuationImpl) {
        PlayerExtensionsKt$listenImpl$1 playerExtensionsKt$listenImpl$1;
        int i;
        Ref$ObjectRef m;
        Object obj;
        if (continuationImpl instanceof PlayerExtensionsKt$listenImpl$1) {
            playerExtensionsKt$listenImpl$1 = (PlayerExtensionsKt$listenImpl$1) continuationImpl;
            int i2 = playerExtensionsKt$listenImpl$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                playerExtensionsKt$listenImpl$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = playerExtensionsKt$listenImpl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = playerExtensionsKt$listenImpl$1.label;
                if (i != 0) {
                    m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(obj2);
                    try {
                        playerExtensionsKt$listenImpl$1.L$0 = player;
                        playerExtensionsKt$listenImpl$1.L$2 = function2;
                        playerExtensionsKt$listenImpl$1.L$3 = m;
                        playerExtensionsKt$listenImpl$1.label = 1;
                        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(playerExtensionsKt$listenImpl$1));
                        cancellableContinuationImpl.initCancellability();
                        m.element = new PlayerListener(function2, cancellableContinuationImpl);
                        cancellableContinuationImpl.invokeOnCancellation(new KClasses$$Lambda$2(m, 4));
                        Object obj3 = m.element;
                        if (obj3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("listener");
                            throw null;
                        }
                        ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) player;
                        exoPlayerImpl.listeners.add((PlayerListener) obj3);
                        try {
                            if (cancellableContinuationImpl.getResult() == coroutineSingletons) {
                                return;
                            }
                        } catch (Throwable th) {
                            th = th;
                            player = exoPlayerImpl;
                            obj = m.element;
                            if (obj != null) {
                                Intrinsics.throwUninitializedPropertyAccessException("listener");
                                throw null;
                            }
                            ((ExoPlayerImpl) player).removeListener((PlayerListener) obj);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return;
                    }
                    Ref$ObjectRef ref$ObjectRef = playerExtensionsKt$listenImpl$1.L$3;
                    Player player2 = playerExtensionsKt$listenImpl$1.L$0;
                    try {
                        SafeTrace.throwOnFailure(obj2);
                    } catch (Throwable th3) {
                        m = ref$ObjectRef;
                        player = player2;
                        th = th3;
                        obj = m.element;
                        if (obj != null) {
                        }
                    }
                }
                throw new KotlinNothingValueException();
            }
        }
        playerExtensionsKt$listenImpl$1 = new PlayerExtensionsKt$listenImpl$1(continuationImpl);
        Object obj22 = playerExtensionsKt$listenImpl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = playerExtensionsKt$listenImpl$1.label;
        if (i != 0) {
        }
        throw new KotlinNothingValueException();
    }
}
