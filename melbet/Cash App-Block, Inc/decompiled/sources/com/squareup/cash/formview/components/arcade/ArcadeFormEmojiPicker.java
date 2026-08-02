package com.squareup.cash.formview.components.arcade;

import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda30;
import app.cash.molecule.PlatformKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacn;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda5;
import com.squareup.cash.formview.components.FormElementViewBuilder$toView$18;
import com.squareup.cash.google.pay.RealGooglePayer$$ExternalSyntheticLambda0;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda1;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.squareup.util.emojis.EmojiEmbeddedImageResolver;
import com.squareup.util.emojis.EmojiEmbeddedImageResolverKt;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final class ArcadeFormEmojiPicker extends AbstractComposeView {
    public final FormBlocker.Element.EmojiPickerElement element;
    public final String formElementId;
    public final FormElementViewBuilder$toView$18 onEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArcadeFormEmojiPicker(Context context, FormBlocker.Element.EmojiPickerElement emojiPickerElement, FormElementViewBuilder$toView$18 formElementViewBuilder$toView$18, String str) {
        super(context, null, 6, 0);
        context.getClass();
        this.element = emojiPickerElement;
        this.onEvent = formElementViewBuilder$toView$18;
        this.formElementId = str;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1715287534);
        int i2 = 4;
        int i3 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            Object[] objArr = {this.element};
            boolean changedInstance = gapComposer.changedInstance(this);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new RealGooglePayer$$ExternalSyntheticLambda0(this, 1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer, 0);
            Unit unit = Unit.INSTANCE;
            boolean changedInstance2 = gapComposer.changedInstance(this);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ArcadeFormEmojiPicker$Content$1$1(this, null);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1811737127, new ErrorView$$ExternalSyntheticLambda1(i2, this, mutableState), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal$$ExternalSyntheticLambda5(this, i, 19);
        }
    }

    public final void EmojiOptionItem(FormBlocker.Element.EmojiPickerElement.EmojiCategory.EmojiOption emojiOption, boolean z, Function0 function0, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        boolean z2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-516733891);
        int i2 = i | (gapComposer.changedInstance(emojiOption) ? 4 : 2) | (gapComposer.changed(z) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128) | (gapComposer.changed(modifier) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(modifier, 88.0f);
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(m285size3ABfNKs, roundedCornerShape), Strings.getColors(gapComposer).semantic.background.subtle, ColorKt.RectangleShape);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (z) {
                gapComposer.startReplaceGroup(-856202934);
                modifier2 = ImageKt.m178borderxT4_qwU(companion, 3.0f, Strings.getColors(gapComposer).semantic.border.prominent, roundedCornerShape);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-856016221);
                gapComposer.end(false);
                modifier2 = companion;
            }
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(SelectableKt.m335selectableoSLSa3U$default(m177backgroundbw27NRU.then(modifier2), z, false, null, function0, 14), 16.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
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
            String str = emojiOption.icon_id;
            str.getClass();
            ArrayList arrayList = EmojiEmbeddedImageResolver.supportedEmoji;
            Integer imageResource48ForTheme = EmojiEmbeddedImageResolverKt.getImageResource48ForTheme(str, gapComposer);
            if (imageResource48ForTheme == null) {
                gapComposer.startReplaceGroup(-1789562741);
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.Center), 1.0f);
                boolean changedInstance = gapComposer.changedInstance(emojiOption);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new GpsConfigQueries$$ExternalSyntheticLambda2(emojiOption, 6);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier semantics = SemanticsModifierKt.semantics(fillMaxWidth, false, (Function1) rememberedValue);
                TextStyle textStyle = Strings.getTypography(gapComposer).numeralSmall;
                Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
                zzacn.m2012AutoScaleTextZLomxE(0, 3, 0, 0, 472, 0L, 0L, gapComposer, semantics, TextStyle.m994copyp1EtxEg$default(textStyle, 0L, density.mo239toSpkPz2Gy4(density.mo236toPx0680j_4(44.0f)), null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777213), str, null);
                gapComposer = gapComposer;
                gapComposer.end(false);
                z2 = true;
            } else {
                z2 = true;
                gapComposer.startReplaceGroup(-1788887840);
                ImageKt.Image(Countries.painterResource(imageResource48ForTheme.intValue(), 0, gapComposer), emojiOption.accessibilityText, SizeKt.fillMaxSize(companion, 1.0f), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer, Painter.$stable | MLKEMEngine.KyberPolyBytes, 120);
                gapComposer.end(false);
            }
            gapComposer.end(z2);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda30(this, emojiOption, z, function0, modifier, i, 5);
        }
    }
}
