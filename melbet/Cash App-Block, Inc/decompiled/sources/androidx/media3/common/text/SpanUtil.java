package androidx.media3.common.text;

import android.text.SpannableStringBuilder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.media3.exoplayer.audio.DeviceTypeUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.contacts.components.SyncContactsCardKt$$ExternalSyntheticLambda0;
import com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda2;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class SpanUtil {
    public static final void InputFileAttachment(int i, Composer composer, Modifier modifier, String str, String str2, Function0 function0) {
        int i2;
        Function0 function02;
        GapComposer gapComposer;
        Modifier modifier2;
        str.getClass();
        str2.getClass();
        function0.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-695506512);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(str2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function0) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 12.0f, 12.0f, 8.0f, 1);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m302paddingqDBjuR0$default);
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
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(SizeKt.wrapContentWidth$default(ClipKt.clip(ImageKt.m177backgroundbw27NRU(companion, Strings.getColors(gapComposer2).semantic.background.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)), null, 3), 16.0f);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ChatView$$ExternalSyntheticLambda2(29);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(m298padding3ABfNKs, true, (Function1) rememberedValue);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer2, 48);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, semantics);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Modifier m298padding3ABfNKs2 = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SpacerKt.m298padding3ABfNKs(SizeKt.m285size3ABfNKs(companion, 48.0f), 4.0f), RoundedCornerShapeKt.CircleShape), Strings.getColors(gapComposer2).semantic.background.f1047app, ColorKt.RectangleShape), 8.0f);
            Painter painterResource = Countries.painterResource(R.drawable.icon_document_24, 0, gapComposer2);
            String stringResource = Room.stringResource(gapComposer2, R.string.support_chat_file_attachment_icon);
            long j = Strings.getColors(gapComposer2).semantic.icon.standard;
            ImageKt.Image(painterResource, stringResource, m298padding3ABfNKs2, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer2, Painter.$stable, 56);
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SpacerKt.m300paddingVpY3zN4$default(companion, 8.0f, RecyclerView.DECELERATION_RATE, 2), false);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, m);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            Room.m1165Text25TpFw(2, 1, 0, 0, (i3 & 14) | 1769472, 0, 3994, 0L, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).labelMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 0, (i3 >> 3) & 14, 0, 4090, 0L, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).bodySmall, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            gapComposer = gapComposer2;
            gapComposer.end(true);
            gapComposer.end(true);
            function02 = function0;
            DeviceTypeUtil.RemoveAttachmentButton((i3 >> 6) & 14, gapComposer, BoxScopeInstance.INSTANCE.align(OffsetKt.m272offsetVpY3zN4(companion, 12.0f, -12.0f), Alignment.Companion.TopEnd), function02);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            function02 = function0;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SyncContactsCardKt$$ExternalSyntheticLambda0(str, str2, function02, modifier2, i);
        }
    }

    public static void addOrReplaceSpan(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewAddCashHalfSheetWithEntry.deepLinkSpecs;
    }
}
