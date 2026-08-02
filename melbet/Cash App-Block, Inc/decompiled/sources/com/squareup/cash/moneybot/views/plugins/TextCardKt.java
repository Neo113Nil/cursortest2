package com.squareup.cash.moneybot.views.plugins;

import androidx.camera.core.processing.TargetUtils;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.material3.SliderKt$SliderImpl$2$1;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda2;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.arcade.values.ButtonProminence;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda9;
import app.cash.local.views.internal.LocalCombinedViewsKt$$ExternalSyntheticLambda3;
import app.cash.local.views.sheet.LocalShortlinkSheetKt$$ExternalSyntheticLambda8;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda0;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda26;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.compose.LocalImageLoaderKt;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda0;
import coil3.memory.RealWeakMemoryCache;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabx;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacn;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaco;
import com.google.maps.android.compose.GoogleMapKt;
import com.google.mlkit.vision.text.zzb;
import com.mikepenz.markdown.annotator.AnnotatorSettingsKt$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.HapticsKt;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Motion;
import com.squareup.cash.arcade.MotionKt;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.avatar.AvatarSizeOverride;
import com.squareup.cash.arcade.components.haptic.HapticVibratorKt;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.treehouse.PasscodeInputComposablesKt$$ExternalSyntheticLambda5;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.charting.components.ChartWithYAxisKt$$ExternalSyntheticLambda6;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.genie.backend.real.GenieLogger;
import com.squareup.cash.instruments.screens.TransferOptionPickerDisplayIcon;
import com.squareup.cash.instruments.views.InstrumentCellKt;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda3;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda1;
import com.squareup.cash.money.views.MoneyTabToolbarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda10;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda39;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda6;
import com.squareup.cash.money.views.MoneyUiFactory$$ExternalSyntheticLambda1;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.SlotContent;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.moneybot.theme.MoneybotColors;
import com.squareup.cash.moneybot.theme.MoneybotColorsKt;
import com.squareup.cash.moneybot.theme.MoneybotThemeKt;
import com.squareup.cash.moneybot.viewmodels.plugins.GenieCardViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.NavigationCardViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.SuggestionListViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.TemplateCardViewEvent;
import com.squareup.cash.moneybot.viewmodels.plugins.TemplateCardViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.TextCardViewModel;
import com.squareup.cash.moneybot.views.card.CardUiKt;
import com.squareup.cash.moneybot.views.card.InsightChartKt$$ExternalSyntheticLambda19;
import com.squareup.cash.moneybot.views.chat.SuggestionRowStyle;
import com.squareup.cash.moneybot.views.chat.SuggestionUiKt;
import com.squareup.cash.moneybot.views.chat.SuggestionUiKt$$ExternalSyntheticLambda8;
import com.squareup.cash.moneybot.views.shared.LocalMoneybotSlotContentAnimationsReadyKt;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.overlays.FakeOverlayLayerKt$$ExternalSyntheticLambda0;
import com.squareup.cash.overlays.Overlay$$ExternalSyntheticLambda0;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.CardLockViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda24;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda3;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.util.Strings;
import com.squareup.workflow1.Snapshots;
import com.stripe.android.uicore.elements.H6TextKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda25;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Function;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__ReversedViewsKt;
import kotlin.collections.ReversedList$listIterator$1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import xyz.block.genie.state.GenieCompositionLocalsKt;
import xyz.block.protos.genie.KeyValueMap;
import xyz.block.protos.genie.ViewPlan;

/* loaded from: classes6.dex */
public abstract class TextCardKt {
    public static final ComposableLambdaImpl lambda$276970087 = new ComposableLambdaImpl(new SlottedTableKt$$ExternalSyntheticLambda2(20), false, 276970087);
    public static final int[] GRADIENT_DRAWABLES = {R.drawable.text_card_gradient_0, R.drawable.text_card_gradient_1, R.drawable.text_card_gradient_2, R.drawable.text_card_gradient_3, R.drawable.text_card_gradient_4, R.drawable.text_card_gradient_5};

    public static final void AvatarBubble(UiAvatar uiAvatar, Modifier modifier, boolean z, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1396891419);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(uiAvatar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            float f = z ? 208.0f : 140.0f;
            AvatarSize avatarSize = AvatarSize.Size96;
            AvatarSizeOverride avatarSizeOverride = new AvatarSizeOverride(f, avatarSize.iconSize, 56, avatarSize.textSize);
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(modifier, 6.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
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
            TextViewKt.Avatar(avatarSizeOverride, AvatarsKt.toAvatarEntry(uiAvatar, new SlottedTableKt$$ExternalSyntheticLambda2(22), gapComposer, 0), SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f), false, false, gapComposer, MLKEMEngine.KyberPolyBytes, 24);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardLockViewKt$$ExternalSyntheticLambda2((Object) uiAvatar, modifier, z, i, 17);
        }
    }

    public static final void BottomPicker(TemplateCardViewModel.BottomPicker bottomPicker, boolean z, Modifier modifier, Function0 function0, Composer composer, int i) {
        TextStyle textStyle;
        long j;
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1033634660);
        int i3 = i | (gapComposer.changedInstance(bottomPicker) ? 4 : 2) | (gapComposer.changed(z) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(modifier, z, null, new Role(0), function0, 10);
            boolean changedInstance = gapComposer.changedInstance(bottomPicker);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new Overlay$$ExternalSyntheticLambda0(bottomPicker, 8);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(m183clickableoSLSa3U$default, false, (Function1) rememberedValue);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
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
            TemplateCardViewModel.Icon icon = bottomPicker.icon;
            boolean z2 = bottomPicker.isPlaceholder;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (icon == null) {
                gapComposer.startReplaceGroup(-1450788199);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1450788198);
                BottomPickerIcon(icon, gapComposer, 0);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 8.0f));
                gapComposer.end(false);
            }
            String str = bottomPicker.label;
            if (z2) {
                gapComposer.startReplaceGroup(-739528398);
                textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-739526893);
                textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                gapComposer.end(false);
            }
            TextStyle textStyle2 = textStyle;
            if (z2) {
                gapComposer.startReplaceGroup(-739523698);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.text.subtle;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-739522000);
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors2.semantic.text.standard;
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4018, j, (Composer) gapComposer, (Modifier) null, textStyle2, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            String str2 = bottomPicker.subtitle;
            if (str2 == null) {
                gapComposer.startReplaceGroup(-1450272204);
                gapComposer.end(false);
                i2 = -1762997026;
            } else {
                gapComposer.startReplaceGroup(-1450272203);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 8.0f));
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, false);
                TextStyle textStyle3 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                i2 = -1762997026;
                Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4016, colors3.semantic.text.subtle, (Composer) gapComposer, (Modifier) layoutWeightElement, textStyle3, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            Icons icons = Icons.SubtleExpand16;
            Colors colors4 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors4 == null) {
                colors4 = re$$ExternalSyntheticOutline0.m(gapComposer, i2, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, colors4.semantic.icon.subtle, gapComposer, 54, 4);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeViewKt$$ExternalSyntheticLambda0(bottomPicker, z, modifier, function0, i);
        }
    }

    public static final void BottomPickerIcon(TemplateCardViewModel.Icon icon, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1094401828);
        int i2 = (gapComposer.changedInstance(icon) ? 4 : 2) | i;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            gapComposer.skipToGroupEnd();
        } else if (icon instanceof TemplateCardViewModel.Icon.Avatar) {
            gapComposer.startReplaceGroup(-227995342);
            TextViewKt.Avatar(AvatarSize.Size16, AvatarsKt.toAvatarEntry(((TemplateCardViewModel.Icon.Avatar) icon).avatar, null, gapComposer, 1), null, false, gapComposer, 6, 28);
            gapComposer.end(false);
        } else if (icon instanceof TemplateCardViewModel.Icon.SavingsGoalIcon) {
            gapComposer.startReplaceGroup(-227851595);
            VisibleKt.m3489EmojiIconDzVHIIc(((TemplateCardViewModel.Icon.SavingsGoalIcon) icon).iconId, 16.0f, null, null, gapComposer, 48, 12);
            gapComposer.end(false);
        } else {
            if (!(icon instanceof TemplateCardViewModel.Icon.TransferOptionIcon)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 546833114, false);
            }
            gapComposer.startReplaceGroup(-227739096);
            TransferOptionIcon(((TemplateCardViewModel.Icon.TransferOptionIcon) icon).icon, AvatarSize.Size16, false, gapComposer, 432);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SuggestionUiKt$$ExternalSyntheticLambda8(icon, i, 11);
        }
    }

    public static final void Bubble(SlotContent.StackedImage.Content content, Modifier modifier, boolean z, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-120383022);
        int i2 = i | (gapComposer.changedInstance(content) ? 4 : 2) | (gapComposer.changed(modifier) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (content instanceof SlotContent.StackedImage.Content.Avatar) {
            gapComposer.startReplaceGroup(-32730829);
            AvatarBubble(((SlotContent.StackedImage.Content.Avatar) content).avatar, modifier, z, gapComposer, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
            gapComposer.end(false);
        } else if (content instanceof SlotContent.StackedImage.Content.Text) {
            gapComposer.startReplaceGroup(-32589872);
            TextBubble((SlotContent.StackedImage.Content.Text) content, modifier, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            gapComposer.end(false);
        } else {
            if (!(content instanceof SlotContent.StackedImage.Content.Image)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 276037294, false);
            }
            gapComposer.startReplaceGroup(-32466275);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ImageKt.Image(AsyncImageKt.m1448rememberAsyncImagePainter5jETZwI(ThemablesKt.urlForTheme(((SlotContent.StackedImage.Content.Image) content).image, gapComposer), (RealImageLoader) gapComposer.consume(LocalImageLoaderKt.LocalImageLoader), null, gapComposer, 0, 60), null, SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer, 432, 120);
            gapComposer.end(true);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda26(content, modifier, z, i, 26);
        }
    }

    public static final void ButtonGroup(TemplateCardViewModel.TapBehavior.ButtonGroup buttonGroup, Function1 function1, Composer composer, int i) {
        TemplateCardViewModel.TapBehavior.ButtonGroup buttonGroup2;
        Function1 function12;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1942186740);
        int i2 = (gapComposer.changedInstance(buttonGroup) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            buttonGroup2 = buttonGroup;
            function12 = function1;
            zzabx.ButtonDefaultGroupHorizontal(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), Expect_jvmKt.rememberComposableLambda(-660614566, new BasicShieetScope$$ExternalSyntheticLambda0(buttonGroup2, (RealHapticVibrator) gapComposer.consume(HapticVibratorKt.LocalHapticVibrator), (Haptics) gapComposer.consume(HapticsKt.LocalHaptics), function12, 7), gapComposer), gapComposer, 54, 0);
        } else {
            buttonGroup2 = buttonGroup;
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TemplateCardKt$$ExternalSyntheticLambda6(buttonGroup2, function12, i);
        }
    }

    public static final void Description(int i, Composer composer, Modifier modifier, String str, boolean z) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2120248897);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(z) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & 14, 0, 4080, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier, 1.0f, false), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            if (z) {
                gapComposer.startReplaceGroup(1315039595);
                Trace.m1191Iconww6aTOc(Icons.SubtlePush16, (String) null, (Modifier) null, Strings.getColors(gapComposer).semantic.icon.subtle, gapComposer, 54, 4);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1315187589);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new H6TextKt$$ExternalSyntheticLambda0(str, z, modifier, i, 1);
        }
    }

    public static final void FallbackGenieCard(String str, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1743012191);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (i3 == 0) {
            i2 |= gapComposer.changed(companion) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(32.0f, 24.0f, 24.0f, 24.0f);
            MoneybotColors moneybotColors = (MoneybotColors) gapComposer.consume(MoneybotThemeKt.LocalMoneybotColors);
            if (moneybotColors == null) {
                gapComposer.startReplaceGroup(-973090538);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                moneybotColors = MoneybotColorsKt.fromArcade(colors);
            } else {
                gapComposer.startReplaceGroup(-973091964);
            }
            gapComposer.end(false);
            CardUiKt.m3624CardContainerhTdSg4(fillMaxWidth, paddingValuesImpl, 40.0f, moneybotColors.card.background, null, Expect_jvmKt.rememberComposableLambda(2071518321, new MoneyTabToolbarKt$$ExternalSyntheticLambda1(str, 11), gapComposer), gapComposer, 1573296, 48);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardTransitionKt$$ExternalSyntheticLambda3(str, i);
        }
    }

    public static final void GenieCard(GenieCardViewModel genieCardViewModel, GenieLogger genieLogger, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        String str = genieCardViewModel.fallbackText;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(72507196);
        int i2 = (gapComposer.changedInstance(genieCardViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(genieLogger) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            if (((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue()) {
                gapComposer.startReplaceGroup(-306537822);
                FallbackGenieCard(str, gapComposer, 48);
                gapComposer.end(false);
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new FakeOverlayLayerKt$$ExternalSyntheticLambda0(genieCardViewModel, genieLogger, i, 7);
                    return;
                }
                return;
            }
            gapComposer.startReplaceGroup(-306472474);
            gapComposer.end(false);
            GenieCardViewModel.Content content = genieCardViewModel.content;
            boolean z = content instanceof GenieCardViewModel.Content.Rendered;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (z) {
                gapComposer.startReplaceGroup(959947660);
                RenderedGenieCard(((GenieCardViewModel.Content.Rendered) content).plan, genieCardViewModel.sceneInputs, genieLogger, SizeKt.fillMaxWidth(companion, 1.0f), gapComposer, (i2 << 3) & 896);
                gapComposer.end(false);
            } else if (Intrinsics.areEqual(content, GenieCardViewModel.Content.Loading.INSTANCE)) {
                gapComposer.startReplaceGroup(959953910);
                LoadingGenieCard(gapComposer, 6);
                gapComposer.end(false);
            } else {
                if (!Intrinsics.areEqual(content, GenieCardViewModel.Content.Fallback.INSTANCE) && !Intrinsics.areEqual(content, GenieCardViewModel.Content.Error.INSTANCE)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 959945745, false);
                }
                gapComposer.startReplaceGroup(959959691);
                FallbackGenieCard(str, gapComposer, 48);
                gapComposer.end(false);
            }
            modifier2 = companion;
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new MusicViewKt$$ExternalSyntheticLambda5(genieCardViewModel, genieLogger, modifier2, i, 19);
        }
    }

    public static final void LoadingGenieCard(Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1765769028);
        int i3 = i & 6;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (i3 == 0) {
            i2 = (gapComposer.changed(companion) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 24.0f, 1);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            ProgressCircularKt.ProgressCircular(6, 0, gapComposer, SizeKt.m285size3ABfNKs(companion, 24.0f));
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalCombinedViewsKt$$ExternalSyntheticLambda3(i);
        }
    }

    public static final void NavigationCard(NavigationCardViewModel navigationCardViewModel, Modifier modifier, Function1 function1, Composer composer, int i) {
        Modifier modifier2;
        NavigationCardViewModel navigationCardViewModel2 = navigationCardViewModel;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(492671581);
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(navigationCardViewModel2) ? 4 : 2) | i | 48;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            RealHapticVibrator realHapticVibrator = (RealHapticVibrator) gapComposer.consume(HapticVibratorKt.LocalHapticVibrator);
            Haptics haptics = (Haptics) gapComposer.consume(HapticsKt.LocalHaptics);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m292widthInVpY3zN4$default = SizeKt.m292widthInVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, 320.0f, 1);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new InsightChartKt$$ExternalSyntheticLambda19(26);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(m292widthInVpY3zN4$default, true, (Function1) rememberedValue);
            PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(12.0f, 12.0f, 20.0f, 12.0f);
            MoneybotColors moneybotColors = (MoneybotColors) gapComposer.consume(MoneybotThemeKt.LocalMoneybotColors);
            if (moneybotColors == null) {
                gapComposer.startReplaceGroup(-973090538);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                moneybotColors = MoneybotColorsKt.fromArcade(colors);
            } else {
                gapComposer.startReplaceGroup(-973091964);
            }
            gapComposer.end(false);
            long j = moneybotColors.card.background;
            boolean changedInstance = gapComposer.changedInstance(realHapticVibrator) | gapComposer.changed(haptics) | ((i3 & 896) == 256) | gapComposer.changedInstance(navigationCardViewModel2);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                UiWorkflow$$ExternalSyntheticLambda25 uiWorkflow$$ExternalSyntheticLambda25 = new UiWorkflow$$ExternalSyntheticLambda25(realHapticVibrator, haptics, function1, navigationCardViewModel2, 6);
                navigationCardViewModel2 = navigationCardViewModel2;
                gapComposer.updateRememberedValue(uiWorkflow$$ExternalSyntheticLambda25);
                rememberedValue2 = uiWorkflow$$ExternalSyntheticLambda25;
            }
            CardUiKt.m3624CardContainerhTdSg4(semantics, paddingValuesImpl, RecyclerView.DECELERATION_RATE, j, (Function0) rememberedValue2, Expect_jvmKt.rememberComposableLambda(-1898117491, new P2PListViewKt$$ExternalSyntheticLambda12(navigationCardViewModel2, i2), gapComposer), gapComposer, 1572864, 20);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda8((Object) navigationCardViewModel2, (Object) modifier2, (Object) function1, false, i, 16);
        }
    }

    public static final void RenderedGenieCard(ViewPlan viewPlan, KeyValueMap keyValueMap, GenieLogger genieLogger, Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1626669251);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(viewPlan) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(keyValueMap) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(genieLogger) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(modifier) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Updater.CompositionLocalProvider(GenieCompositionLocalsKt.LocalGenieLogger.defaultProvidedValue$runtime(genieLogger), Expect_jvmKt.rememberComposableLambda(1745552771, new MusicViewKt$$ExternalSyntheticLambda5(20, keyValueMap, viewPlan, modifier), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda2(i, 25, viewPlan, keyValueMap, genieLogger, modifier, false);
        }
    }

    public static final void RingGraphic(SlotContent.ProgressRing progressRing, Composer composer, int i) {
        int i2;
        AnimationSpec snap$default;
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1365890768);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(progressRing) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            boolean moneybotSlotContentAnimationsReady = LocalMoneybotSlotContentAnimationsReadyKt.moneybotSlotContentAnimationsReady(gapComposer);
            boolean moneybotSlotContentShouldAnimate = LocalMoneybotSlotContentAnimationsReadyKt.moneybotSlotContentShouldAnimate(gapComposer);
            float f = RecyclerView.DECELERATION_RATE;
            if (moneybotSlotContentAnimationsReady) {
                f = RangesKt___RangesKt.coerceIn(progressRing.fraction, RecyclerView.DECELERATION_RATE, 1.0f);
            }
            float f2 = f;
            Color color = null;
            if (moneybotSlotContentShouldAnimate) {
                gapComposer.startReplaceGroup(732045458);
                Object obj = ((Motion) gapComposer.consume(MotionKt.LocalMotion)).springs.text;
                snap$default = new SpringSpec(1.0f, 50.0f, null);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(732113782);
                gapComposer.end(false);
                snap$default = AnimatableKt.snap$default();
            }
            State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f2, snap$default, "SlottedProgressRingProgressFraction", null, gapComposer, 3072, 20);
            com.squareup.protos.cash.ui.Color color2 = progressRing.ringColor;
            if (color2 == null) {
                gapComposer.startReplaceGroup(732240199);
                gapComposer.end(false);
            } else {
                color = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, -1638947334, color2, gapComposer, false);
            }
            if (color == null) {
                gapComposer.startReplaceGroup(-1638945835);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.text.brand;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1638947819);
                gapComposer.end(false);
                j = color.value;
            }
            long j2 = j;
            Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j3 = colors2.semantic.border.subtle;
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 208.0f);
            boolean changed = gapComposer.changed(animateFloatAsState) | gapComposer.changed(j2) | gapComposer.changed(j3);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                PasscodeInputComposablesKt$$ExternalSyntheticLambda5 passcodeInputComposablesKt$$ExternalSyntheticLambda5 = new PasscodeInputComposablesKt$$ExternalSyntheticLambda5(j2, j3, animateFloatAsState, 1);
                gapComposer.updateRememberedValue(passcodeInputComposablesKt$$ExternalSyntheticLambda5);
                rememberedValue = passcodeInputComposablesKt$$ExternalSyntheticLambda5;
            }
            CanvasKt.Canvas(6, gapComposer, m285size3ABfNKs, (Function1) rememberedValue);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalShortlinkSheetKt$$ExternalSyntheticLambda8(progressRing, i, 24);
        }
    }

    public static final void SlottedProgressRing(SlotContent.ProgressRing progressRing, Modifier modifier, Composer composer, int i) {
        int i2;
        progressRing.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1042003657);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(progressRing) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            RingGraphic(progressRing, gapComposer, i2 & 14);
            StackedContent(0, gapComposer, progressRing.contents);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda1(progressRing, modifier, i, 27);
        }
    }

    public static final void SlottedStackedImage(SlotContent.StackedImage stackedImage, Modifier modifier, Composer composer, int i) {
        int i2;
        AnimationSpec snap$default;
        boolean z;
        stackedImage.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-140389888);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(stackedImage) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean moneybotSlotContentAnimationsReady = LocalMoneybotSlotContentAnimationsReadyKt.moneybotSlotContentAnimationsReady(gapComposer);
            boolean moneybotSlotContentShouldAnimate = LocalMoneybotSlotContentAnimationsReadyKt.moneybotSlotContentShouldAnimate(gapComposer);
            float f = moneybotSlotContentAnimationsReady ? 1.0f : RecyclerView.DECELERATION_RATE;
            if (moneybotSlotContentShouldAnimate) {
                gapComposer.startReplaceGroup(943353986);
                snap$default = TargetUtils.steady$default((zzb) ((Motion) gapComposer.consume(MotionKt.LocalMotion)).springs.text);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(943422310);
                gapComposer.end(false);
                snap$default = AnimatableKt.snap$default();
            }
            State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f, snap$default, "SlottedStackedImageEntranceProgress", null, gapComposer, 3072, 20);
            float floatValue = (((Number) animateFloatAsState.getValue()).floatValue() * 0.25f) + 0.75f;
            gapComposer.startReplaceGroup(-1770668125);
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(modifier, 1.0f), RecyclerView.DECELERATION_RATE, 10.0f, RecyclerView.DECELERATION_RATE, 34.0f, 5);
            boolean changed = gapComposer.changed(animateFloatAsState) | gapComposer.changed(floatValue);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new CardTransitionKt$$ExternalSyntheticLambda24(floatValue, animateFloatAsState, 2);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier graphicsLayer = ColorKt.graphicsLayer(m302paddingqDBjuR0$default, (Function1) rememberedValue);
            String str = stackedImage.accessibilityLabel;
            ArrayList arrayList = stackedImage.contents;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (str != null) {
                boolean changed2 = gapComposer.changed(str);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new ClusterItemKt$$ExternalSyntheticLambda3(str, 19);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                graphicsLayer = graphicsLayer.then(SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue2));
            }
            gapComposer.end(false);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, graphicsLayer);
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
            gapComposer.startReplaceGroup(-956233063);
            if (arrayList.isEmpty()) {
                gapComposer.end(false);
                z = true;
            } else {
                List take = CollectionsKt.take(arrayList, 2);
                RealWeakMemoryCache realWeakMemoryCache = new RealWeakMemoryCache(1);
                gapComposer.startReplaceGroup(664071683);
                Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 208.0f);
                boolean changedInstance = gapComposer.changedInstance(take);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new SliderKt$SliderImpl$2$1(take, 5);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue3;
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m285size3ABfNKs);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, measurePolicy, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                gapComposer.startReplaceGroup(1965059410);
                Iterator it = CollectionsKt__ReversedViewsKt.asReversed(take).iterator();
                while (true) {
                    ListIterator listIterator = (ListIterator) ((ReversedList$listIterator$1) it).delegateIterator;
                    if (!listIterator.hasPrevious()) {
                        break;
                    } else {
                        Bubble((SlotContent.StackedImage.Content) listIterator.previous(), RealWeakMemoryCache.m1458clippedOutlinewH6b6FI$default(realWeakMemoryCache, companion, RoundedCornerShapeKt.CircleShape, 2), take.size() == 1, gapComposer, 0);
                    }
                }
                z = true;
                gapComposer.end(false);
                gapComposer.end(true);
                gapComposer.end(false);
                gapComposer.end(false);
            }
            gapComposer.end(z);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda1(stackedImage, modifier, i, 28);
        }
    }

    public static final void StackedBubbles(List list, final float f, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-497502851);
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(list) ? 4 : 2) | i | (gapComposer.changed(f) ? 32 : 16);
        int i4 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            RealWeakMemoryCache realWeakMemoryCache = new RealWeakMemoryCache(1);
            gapComposer.startReplaceGroup(-1911544983);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 96.0f);
            boolean changed = gapComposer.changed(f);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new Function1() { // from class: com.squareup.cash.moneybot.views.plugins.SlottedProgressRingKt$StackedBubbles$1$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                        reusableGraphicsLayerScope.getClass();
                        reusableGraphicsLayerScope.setAlpha(f);
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier graphicsLayer = ColorKt.graphicsLayer(m285size3ABfNKs, (Function1) rememberedValue);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = SlottedProgressRingKt$StackedBubbles$1$2$1.INSTANCE;
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue2;
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, graphicsLayer);
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
            Updater.m576setimpl(gapComposer, measurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(231283256);
            Iterator it = CollectionsKt__ReversedViewsKt.asReversed(list).iterator();
            final int i5 = 0;
            while (true) {
                ListIterator listIterator = (ListIterator) ((ReversedList$listIterator$1) it).delegateIterator;
                if (!listIterator.hasPrevious()) {
                    Boxes$$ExternalSyntheticOutline1.m(gapComposer, false, true, false);
                    break;
                }
                Object previous = listIterator.previous();
                int i6 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                SlotContent.ProgressRing.Content content = (SlotContent.ProgressRing.Content) previous;
                RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
                Modifier clip = ClipKt.clip(SpacerKt.m298padding3ABfNKs(RealWeakMemoryCache.m1458clippedOutlinewH6b6FI$default(realWeakMemoryCache, companion, roundedCornerShape, i2), 3.0f), roundedCornerShape);
                boolean changed2 = gapComposer.changed(f) | gapComposer.changed(i5);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new Function1() { // from class: com.squareup.cash.moneybot.views.plugins.SlottedProgressRingKt$StackedBubbles$1$3$1$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                            reusableGraphicsLayerScope.getClass();
                            float f2 = f;
                            reusableGraphicsLayerScope.setScaleX(f2);
                            reusableGraphicsLayerScope.setScaleY(f2);
                            reusableGraphicsLayerScope.m711setTransformOrigin__ExYCQ(i5 == 0 ? ColorKt.TransformOrigin(0.75f, 0.75f) : ColorKt.TransformOrigin(0.25f, 0.25f));
                            return Unit.INSTANCE;
                        }
                    };
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                Bubble(content, false, ColorKt.graphicsLayer(clip, (Function1) rememberedValue3), (Composer) gapComposer, 48);
                i5 = i6;
                i2 = 2;
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ChartWithYAxisKt$$ExternalSyntheticLambda6(list, f, i, i4);
        }
    }

    public static final void StackedContent(int i, Composer composer, List list) {
        Modifier m277height3ABfNKs;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(22739355);
        int i2 = (gapComposer.changedInstance(list) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(LocalMoneybotSlotContentAnimationsReadyKt.moneybotSlotContentAnimationsReady(gapComposer) ? 1.0f : 0.0f, LocalMoneybotSlotContentAnimationsReadyKt.moneybotSlotContentShouldAnimate(gapComposer) ? AnimatableKt.spring$default(0.75f, 600.0f, null, 4) : AnimatableKt.snap$default(), "SlottedProgressRingContentAnimationProgress", null, gapComposer, 3072, 20);
            if (list.size() == 1) {
                gapComposer.startReplaceGroup(-1176043073);
                SlotContent.ProgressRing.Content content = (SlotContent.ProgressRing.Content) CollectionsKt.first(list);
                boolean changed = gapComposer.changed(animateFloatAsState);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda10(animateFloatAsState, 16);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier graphicsLayer = ColorKt.graphicsLayer(companion, (Function1) rememberedValue);
                if (content instanceof SlotContent.ProgressRing.Content.Avatar) {
                    gapComposer.startReplaceGroup(377716507);
                    gapComposer.end(false);
                    m277height3ABfNKs = SizeKt.m285size3ABfNKs(companion, 96.0f);
                } else if (content instanceof SlotContent.ProgressRing.Content.Image) {
                    gapComposer.startReplaceGroup(377719419);
                    gapComposer.end(false);
                    m277height3ABfNKs = SizeKt.m285size3ABfNKs(companion, 96.0f);
                } else {
                    if (!(content instanceof SlotContent.ProgressRing.Content.Text)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 377714462, false);
                    }
                    gapComposer.startReplaceGroup(377725885);
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.m292widthInVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, 176.0f, 1), 96.0f);
                    gapComposer.end(false);
                }
                Bubble(content, true, graphicsLayer.then(m277height3ABfNKs), (Composer) gapComposer, 48);
                gapComposer.end(false);
            } else if (list.size() >= 2) {
                gapComposer.startReplaceGroup(377730094);
                StackedBubbles(CollectionsKt.take(list, 2), ((Number) animateFloatAsState.getValue()).floatValue(), gapComposer, 0);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1175215993);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda9(i, 8, list);
        }
    }

    public static final void SuggestionList(SuggestionListViewModel suggestionListViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1168268967);
        int i2 = 32;
        int i3 = i | (gapComposer.changedInstance(suggestionListViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        boolean z = true;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(-2097895744);
            for (SuggestionListViewModel.HomeWidgetSuggestion homeWidgetSuggestion : suggestionListViewModel.suggestions) {
                boolean z2 = z;
                SuggestionRowStyle suggestionRowStyle = SuggestionRowStyle.CARD;
                int i4 = i3 & 112;
                boolean changedInstance = (i4 == i2 ? z2 : false) | gapComposer.changedInstance(homeWidgetSuggestion);
                Object rememberedValue = gapComposer.rememberedValue();
                Object obj = Composer.Companion.Empty;
                if (changedInstance || rememberedValue == obj) {
                    rememberedValue = new SuggestionListKt$$ExternalSyntheticLambda0(function1, homeWidgetSuggestion);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Function0 function02 = (Function0) rememberedValue;
                boolean changedInstance2 = (i4 == i2 ? z2 : false) | gapComposer.changedInstance(homeWidgetSuggestion);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue2 == obj) {
                    rememberedValue2 = new SuggestionListKt$$ExternalSyntheticLambda0(homeWidgetSuggestion, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                SuggestionUiKt.SuggestionRow(null, homeWidgetSuggestion, suggestionRowStyle, false, false, null, function02, (Function0) rememberedValue2, gapComposer, MLKEMEngine.KyberPolyBytes, 57);
                z = z2;
                companion = companion;
                i2 = 32;
            }
            gapComposer.end(false);
            gapComposer.end(z);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda5(suggestionListViewModel, function1, modifier2, i, 22);
        }
    }

    public static final void TemplateCard(TemplateCardViewModel templateCardViewModel, Modifier modifier, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier modifier2;
        RealHapticVibrator realHapticVibrator;
        long j;
        Haptics haptics;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(200995831);
        int i2 = (gapComposer2.changedInstance(templateCardViewModel) ? 4 : 2) | i | 48;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            RealHapticVibrator realHapticVibrator2 = (RealHapticVibrator) gapComposer2.consume(HapticVibratorKt.LocalHapticVibrator);
            Haptics haptics2 = (Haptics) gapComposer2.consume(HapticsKt.LocalHaptics);
            FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) gapComposer2.consume(CompositionLocalsKt.LocalFocusManager);
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer2.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            TemplateCardViewModel.TapBehavior tapBehavior = templateCardViewModel.tapBehavior;
            int i3 = i2 & 896;
            boolean changedInstance = gapComposer2.changedInstance(focusOwnerImpl) | gapComposer2.changed(delegatingSoftwareKeyboardController) | (i3 == 256);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda39(10, focusOwnerImpl, delegatingSoftwareKeyboardController, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Function1 function12 = (Function1) rememberedValue;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            PaddingValuesImpl m295PaddingValuesYgX7TsA$default = SpacerKt.m295PaddingValuesYgX7TsA$default(RecyclerView.DECELERATION_RATE, 24.0f, 1);
            MoneybotColors moneybotColors = (MoneybotColors) gapComposer2.consume(MoneybotThemeKt.LocalMoneybotColors);
            if (moneybotColors == null) {
                gapComposer2.startReplaceGroup(-973090538);
                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                moneybotColors = MoneybotColorsKt.fromArcade(colors);
            } else {
                gapComposer2.startReplaceGroup(-973091964);
            }
            gapComposer2.end(false);
            long j2 = moneybotColors.card.background;
            Function0 function0 = null;
            TemplateCardViewModel.TapBehavior.TapAction tapAction = tapBehavior instanceof TemplateCardViewModel.TapBehavior.TapAction ? (TemplateCardViewModel.TapBehavior.TapAction) tapBehavior : null;
            TemplateCardViewEvent templateCardViewEvent = tapAction != null ? tapAction.action : null;
            if (templateCardViewEvent == null) {
                gapComposer2.startReplaceGroup(683200914);
                gapComposer2.end(false);
                realHapticVibrator = realHapticVibrator2;
                haptics = haptics2;
                j = j2;
            } else {
                gapComposer2.startReplaceGroup(683200915);
                boolean changedInstance2 = gapComposer2.changedInstance(realHapticVibrator2) | gapComposer2.changed(haptics2) | (i3 == 256) | gapComposer2.changedInstance(templateCardViewEvent);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                    realHapticVibrator = realHapticVibrator2;
                    j = j2;
                    TemplateCardViewEvent templateCardViewEvent2 = templateCardViewEvent;
                    haptics = haptics2;
                    UiWorkflow$$ExternalSyntheticLambda25 uiWorkflow$$ExternalSyntheticLambda25 = new UiWorkflow$$ExternalSyntheticLambda25(realHapticVibrator, haptics, function1, templateCardViewEvent2, 9);
                    gapComposer2.updateRememberedValue(uiWorkflow$$ExternalSyntheticLambda25);
                    rememberedValue2 = uiWorkflow$$ExternalSyntheticLambda25;
                } else {
                    realHapticVibrator = realHapticVibrator2;
                    haptics = haptics2;
                    j = j2;
                }
                function0 = (Function0) rememberedValue2;
                gapComposer2.end(false);
            }
            gapComposer = gapComposer2;
            CardUiKt.m3624CardContainerhTdSg4(fillMaxWidth, m295PaddingValuesYgX7TsA$default, RecyclerView.DECELERATION_RATE, j, function0, Expect_jvmKt.rememberComposableLambda(-1636742105, new SubcomposeAsyncImageKt$$ExternalSyntheticLambda0(templateCardViewModel, realHapticVibrator, haptics, function12, tapBehavior, function1, 7), gapComposer2), gapComposer, 1572912, 20);
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda8((Object) templateCardViewModel, (Object) modifier2, (Object) function1, false, i, 20);
        }
    }

    public static final void TemplateCardButton(TemplateCardViewModel.TapBehavior.ButtonGroup.Button button, Modifier modifier, Function0 function0, Composer composer, int i) {
        Function0 function02;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-61194978);
        int i2 = i | (gapComposer.changedInstance(button) ? 4 : 2) | (gapComposer.changed(modifier) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128);
        boolean z = true;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ButtonProminence.Id id = button.prominence;
            boolean z2 = button.isLoading;
            com.squareup.cash.arcade.components.button.ButtonProminence buttonProminence = CardUiKt.toButtonProminence(id);
            if (!button.isEnabled && !z2) {
                z = false;
            }
            if (z2) {
                gapComposer.startReplaceGroup(-1993162398);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda6(23);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                function02 = (Function0) rememberedValue;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1321178053);
                gapComposer.end(false);
                function02 = function0;
            }
            coil3.size.SizeKt.ButtonCta(function02, modifier, buttonProminence, false, z, null, Expect_jvmKt.rememberComposableLambda(-2028714493, new P2PListViewKt$$ExternalSyntheticLambda12(button, 5), gapComposer), gapComposer, (i2 & 112) | 1572864, 40);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda5((Object) button, (Object) modifier, (Function) function0, i, 23);
        }
    }

    public static final void TextBubble(SlotContent.StackedImage.Content.Text text, Modifier modifier, Composer composer, int i) {
        int i2;
        Color m;
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-407000461);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(text) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            com.squareup.protos.cash.ui.Color color = text.backgroundColor;
            if (color == null) {
                gapComposer.startReplaceGroup(-257901980);
                gapComposer.end(false);
                m = null;
            } else {
                m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, -285414083, color, gapComposer, false);
            }
            if (m == null) {
                gapComposer.startReplaceGroup(-285412388);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.background.prominent;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-285414806);
                gapComposer.end(false);
                j = m.value;
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(SpacerKt.m298padding3ABfNKs(modifier, 6.0f), RoundedCornerShapeKt.CircleShape), j, ColorKt.RectangleShape);
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
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), 12.0f, RecyclerView.DECELERATION_RATE, 2);
            String str = text.text;
            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).headlineSmall, 0L, Room.getSp(36), FontWeight.Medium, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777209);
            Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            zzacn.m2012AutoScaleTextZLomxE(1, 3, 2, 12607536, 256, colors2.semantic.text.standard, Snapshots.getNotScaledUp(Room.getSp(26), gapComposer), gapComposer, m300paddingVpY3zN4$default, m994copyp1EtxEg$default, str, null);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda1(text, modifier, i, 29);
        }
    }

    public static final void TextCard(TextCardViewModel textCardViewModel, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2141849329);
        int i2 = (gapComposer.changedInstance(textCardViewModel) ? 4 : 2) | i | 48;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(32.0f, 24.0f, 24.0f, 24.0f);
            MoneybotColors moneybotColors = (MoneybotColors) gapComposer.consume(MoneybotThemeKt.LocalMoneybotColors);
            if (moneybotColors == null) {
                gapComposer.startReplaceGroup(-973090538);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                moneybotColors = MoneybotColorsKt.fromArcade(colors);
            } else {
                gapComposer.startReplaceGroup(-973091964);
            }
            gapComposer.end(false);
            CardUiKt.m3624CardContainerhTdSg4(fillMaxWidth, paddingValuesImpl, 40.0f, moneybotColors.card.background, null, Expect_jvmKt.rememberComposableLambda(133210913, new P2PListViewKt$$ExternalSyntheticLambda12(textCardViewModel, 7), gapComposer), gapComposer, 1573296, 48);
            modifier = companion;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FakeOverlayLayerKt$$ExternalSyntheticLambda0(textCardViewModel, modifier, i, 9);
        }
    }

    public static final void TokenizedDisplayText(ArrayList arrayList, TemplateCardViewModel.EditState editState, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Function1 function12;
        SpanStyle spanStyle;
        long j;
        String str;
        Iterator it;
        int i2;
        boolean z;
        long j2;
        Iterator it2;
        boolean z2;
        String str2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(653113844);
        int i3 = i | (gapComposer.changedInstance(arrayList) ? 4 : 2) | (gapComposer.changed(editState.ordinal()) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z3 = editState == TemplateCardViewModel.EditState.Editable;
            SpanStyle spanStyle2 = Strings.getTypography(gapComposer).pageTitle.spanStyle;
            long j3 = Strings.getColors(gapComposer).semantic.text.standard;
            long j4 = Strings.getColors(gapComposer).semantic.text.disabled;
            boolean z4 = editState != TemplateCardViewModel.EditState.Disabled;
            ArrayList arrayList2 = new ArrayList();
            long j5 = j4;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str3 = "template-card-inline-spacer";
            linkedHashMap.put("template-card-inline-spacer", new InlineTextContent(new Placeholder(4, Room.getSp(8), Room.getSp(1)), lambda$276970087));
            AnnotatedString.Builder builder = new AnnotatedString.Builder();
            Iterator it3 = arrayList.iterator();
            int i4 = 0;
            while (it3.hasNext()) {
                Object next = it3.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                List list = (List) next;
                if (i4 > 0) {
                    builder.append("\n");
                }
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    TemplateCardViewModel.DisplayTextSegment displayTextSegment = (TemplateCardViewModel.DisplayTextSegment) it4.next();
                    if (displayTextSegment instanceof TemplateCardViewModel.DisplayTextSegment.Text) {
                        TemplateCardViewModel.DisplayTextSegment.Text text = (TemplateCardViewModel.DisplayTextSegment.Text) displayTextSegment;
                        spanStyle = spanStyle2;
                        j = j5;
                        builder.pushStyle(SpanStyle.m973copyGSF8kmg$default(spanStyle, j5, text.isBold ? FontWeight.Bold : null, 0L, 65530));
                        builder.append(text.text);
                        builder.pop();
                        i2 = i3;
                        z = z3;
                        str = str3;
                        it = it4;
                        j2 = j3;
                        it2 = it3;
                        z2 = z4;
                    } else {
                        spanStyle = spanStyle2;
                        j = j5;
                        if (!(displayTextSegment instanceof TemplateCardViewModel.DisplayTextSegment.Token)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        StringBuilder sb = builder.text;
                        int length = sb.length();
                        TemplateCardViewModel.DisplayTextSegment.Token token = (TemplateCardViewModel.DisplayTextSegment.Token) displayTextSegment;
                        String str4 = token.text;
                        str = str3;
                        String str5 = token.placeholderKey;
                        it = it4;
                        TemplateCardViewModel.Icon icon = token.inlineContent;
                        if (icon != null) {
                            j2 = j3;
                            str2 = Recorder$$ExternalSyntheticOutline2.m("template-card-token-", str5);
                            it2 = it3;
                            z2 = z4;
                            i2 = i3;
                            z = z3;
                            linkedHashMap.put(str2, new InlineTextContent(new Placeholder(4, Room.getSp(32), Room.getSp(32)), new ComposableLambdaImpl(new P2PListViewKt$$ExternalSyntheticLambda12(icon, 6), true, -718039042)));
                        } else {
                            i2 = i3;
                            z = z3;
                            j2 = j3;
                            it2 = it3;
                            z2 = z4;
                            str2 = null;
                        }
                        SpanStyle m973copyGSF8kmg$default = SpanStyle.m973copyGSF8kmg$default(spanStyle, z2 ? j2 : j, null, 0L, JpegConstants.COM_MARKER);
                        String str6 = (str2 == null || str4.length() <= 0) ? null : str;
                        if (z) {
                            int pushLink = builder.pushLink(new LinkAnnotation.Clickable(str5, new TextLinkStyles(m973copyGSF8kmg$default, (SpanStyle) null, (SpanStyle) null, 14), new AnnotatorSettingsKt$$ExternalSyntheticLambda0(1, function1, token)));
                            try {
                                appendTokenText(builder, (TemplateCardViewModel.DisplayTextSegment.Token) displayTextSegment, str2, str6);
                            } finally {
                                builder.pop(pushLink);
                            }
                        } else {
                            builder.pushStyle(m973copyGSF8kmg$default);
                            appendTokenText(builder, token, str2, str6);
                            builder.pop();
                        }
                        arrayList2.add(new TokenRange(str5, length, sb.length(), str4));
                    }
                    spanStyle2 = spanStyle;
                    j5 = j;
                    str3 = str;
                    it4 = it;
                    j3 = j2;
                    it3 = it2;
                    z4 = z2;
                    i3 = i2;
                    z3 = z;
                }
                i4 = i5;
            }
            int i6 = i3;
            boolean z5 = z3;
            AnnotatedString annotatedString = builder.toAnnotatedString();
            TokenizedText tokenizedText = new TokenizedText(annotatedString, arrayList2, linkedHashMap);
            int i7 = i6 & 896;
            boolean changed = gapComposer.changed(z5) | gapComposer.changedInstance(tokenizedText) | (i7 == 256);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new DialogHostKt$$ExternalSyntheticLambda2(z5, tokenizedText, function1, 8);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            modifier2 = modifier;
            Modifier semantics = SemanticsModifierKt.semantics(modifier2, true, (Function1) rememberedValue);
            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).pageTitle, 0L, 0L, null, null, 0L, null, 0L, null, null, null, 0, Room.getSp(40), null, null, 0, 16646143);
            if (z5) {
                gapComposer.startReplaceGroup(713936372);
                boolean changedInstance = gapComposer.changedInstance(tokenizedText) | (i7 == 256);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new MusicViewKt$$ExternalSyntheticLambda6(13, tokenizedText, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                gapComposer.end(false);
                function12 = (Function1) rememberedValue2;
            } else {
                gapComposer.startReplaceGroup(714152504);
                gapComposer.end(false);
                function12 = null;
            }
            zzaco.m2013ClickableTextJZIOrgw(annotatedString, semantics, m994copyp1EtxEg$default, 0L, null, 0, 0, linkedHashMap, function12, gapComposer, 0, 0, 504);
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyUiFactory$$ExternalSyntheticLambda1(arrayList, i, editState, function1, modifier2, 28);
        }
    }

    public static final void ToolRequestError(int i, Composer composer, Modifier modifier, String str) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2128456500);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Icons icons = Icons.AlertOutline16;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Trace.m1191Iconww6aTOc(icons, (String) null, SizeKt.m285size3ABfNKs(companion, 16.0f), Strings.getColors(gapComposer).semantic.text.danger, gapComposer, 438, 0);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 8.0f));
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & 14, 0, 4082, Strings.getColors(gapComposer).semantic.text.danger, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolCreateViewKt$$ExternalSyntheticLambda4(str, modifier, i, 10);
        }
    }

    public static final void TransferOptionIcon(TransferOptionPickerDisplayIcon transferOptionPickerDisplayIcon, AvatarSize avatarSize, boolean z, Composer composer, int i) {
        TransferOptionPickerDisplayIcon transferOptionPickerDisplayIcon2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(381166791);
        int i2 = i | (gapComposer2.changedInstance(transferOptionPickerDisplayIcon) ? 4 : 2);
        if (!gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            transferOptionPickerDisplayIcon2 = transferOptionPickerDisplayIcon;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        } else if (Intrinsics.areEqual(transferOptionPickerDisplayIcon, TransferOptionPickerDisplayIcon.CashBalance.INSTANCE)) {
            gapComposer2.startReplaceGroup(-553419629);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            long j = colors.semantic.background.brand;
            Icons icons = Icons.CurrencyUsd24;
            Colors colors2 = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            gapComposer = gapComposer2;
            TextViewKt.m3613AvatarB_rZmmc(avatarSize, "", j, (String) null, (Modifier) null, (AvatarImage) new AvatarImage.LocalIcon(icons, colors2.semantic.icon.inverse, 4), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer, 3126, 0, 2000);
            gapComposer.end(false);
            transferOptionPickerDisplayIcon2 = transferOptionPickerDisplayIcon;
        } else {
            gapComposer = gapComposer2;
            if (transferOptionPickerDisplayIcon instanceof TransferOptionPickerDisplayIcon.Savings) {
                gapComposer.startReplaceGroup(-553014490);
                if (z) {
                    gapComposer.startReplaceGroup(-552975988);
                    TransferOptionPickerDisplayIcon.Savings savings = (TransferOptionPickerDisplayIcon.Savings) transferOptionPickerDisplayIcon;
                    VisibleKt.m3496ProgressEmojiIconLzaahlw(savings.iconId, savings.progress, SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, avatarSize.size), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0L, 0L, 0L, gapComposer, 0, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                    gapComposer = gapComposer;
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-552813114);
                    VisibleKt.m3489EmojiIconDzVHIIc(((TransferOptionPickerDisplayIcon.Savings) transferOptionPickerDisplayIcon).iconId, avatarSize.size, null, null, gapComposer, 0, 12);
                    gapComposer.end(false);
                }
                gapComposer.end(false);
                transferOptionPickerDisplayIcon2 = transferOptionPickerDisplayIcon;
            } else {
                transferOptionPickerDisplayIcon2 = transferOptionPickerDisplayIcon;
                if (!(transferOptionPickerDisplayIcon2 instanceof TransferOptionPickerDisplayIcon.Instrument)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1229072217, false);
                }
                gapComposer.startReplaceGroup(-552691532);
                InstrumentCellKt.InstrumentAvatar(null, CollectionsKt__CollectionsJVMKt.listOf(GoogleMapKt.instrumentIcon$default(((TransferOptionPickerDisplayIcon.Instrument) transferOptionPickerDisplayIcon2).instrument, null, null, 7)), avatarSize, gapComposer, MLKEMEngine.KyberPolyBytes, 1);
                gapComposer.end(false);
            }
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda26(transferOptionPickerDisplayIcon2, avatarSize, z, i, 27);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r3 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void appendTokenText(AnnotatedString.Builder builder, TemplateCardViewModel.DisplayTextSegment.Token token, String str, String str2) {
        String str3;
        String str4 = token.text;
        if (str != null) {
            TemplateCardViewModel.Icon icon = token.inlineContent;
            if (icon != null) {
                if (icon instanceof TemplateCardViewModel.Icon.Avatar) {
                    str3 = ((TemplateCardViewModel.Icon.Avatar) icon).avatar.accessibility_value;
                } else {
                    if (!(icon instanceof TemplateCardViewModel.Icon.SavingsGoalIcon) && !(icon instanceof TemplateCardViewModel.Icon.TransferOptionIcon)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    str3 = str4;
                }
                if (str3 == null || StringsKt.isBlank(str3)) {
                    str3 = null;
                }
            }
            str3 = str4;
            KeyMappingKt.appendInlineContent(builder, str, str3);
            if (str2 != null) {
                KeyMappingKt.appendInlineContent(builder, str2, " ");
            }
        }
        builder.append(str4);
    }

    public static final void Bubble(SlotContent.ProgressRing.Content content, boolean z, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-133213327);
        int i2 = i | (gapComposer2.changedInstance(content) ? 4 : 2) | (gapComposer2.changed(modifier) ? 256 : 128);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            if (content instanceof SlotContent.ProgressRing.Content.Avatar) {
                gapComposer2.startReplaceGroup(-8261894);
                float f = z ? 96.0f : 70.0f;
                AvatarSize avatarSize = AvatarSize.Size96;
                gapComposer = gapComposer2;
                TextViewKt.Avatar(new AvatarSizeOverride(f, avatarSize.iconSize, 56, avatarSize.textSize), AvatarsKt.toAvatarEntry(((SlotContent.ProgressRing.Content.Avatar) content).avatar, new SlottedTableKt$$ExternalSyntheticLambda2(21), gapComposer2, 0), modifier, false, false, gapComposer, i2 & 896, 24);
                gapComposer.end(false);
            } else {
                gapComposer = gapComposer2;
                if (content instanceof SlotContent.ProgressRing.Content.Image) {
                    gapComposer.startReplaceGroup(-7749030);
                    ImageKt.Image(AsyncImageKt.m1448rememberAsyncImagePainter5jETZwI(ThemablesKt.urlForTheme(((SlotContent.ProgressRing.Content.Image) content).image, gapComposer), (RealImageLoader) gapComposer.consume(LocalImageLoaderKt.LocalImageLoader), null, gapComposer, 0, 60), null, modifier, null, null, RecyclerView.DECELERATION_RATE, null, gapComposer, (i2 & 896) | 48, 120);
                    gapComposer = gapComposer;
                    gapComposer.end(false);
                } else if (content instanceof SlotContent.ProgressRing.Content.Text) {
                    gapComposer.startReplaceGroup(-7457878);
                    TextBubble((SlotContent.ProgressRing.Content.Text) content, modifier, z, gapComposer, ((i2 >> 3) & 112) | (i2 & 14) | MLKEMEngine.KyberPolyBytes);
                    gapComposer.end(false);
                } else {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 831015960, false);
                }
            }
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda26(content, z, modifier, i, 25);
        }
    }

    public static final void TextBubble(SlotContent.ProgressRing.Content.Text text, Modifier modifier, boolean z, Composer composer, int i) {
        int i2;
        Color m;
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-939343706);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(text) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            com.squareup.protos.cash.ui.Color color = text.backgroundColor;
            if (color == null) {
                gapComposer.startReplaceGroup(2018719281);
                gapComposer.end(false);
                m = null;
            } else {
                m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, -766164016, color, gapComposer, false);
            }
            if (m == null) {
                gapComposer.startReplaceGroup(-766162321);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.background.prominent;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-766164739);
                gapComposer.end(false);
                j = m.value;
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier then = !z ? modifier.then(ImageKt.m177backgroundbw27NRU(companion, j, ColorKt.RectangleShape)) : modifier;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, then);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier != null) {
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
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 12.0f, RecyclerView.DECELERATION_RATE, 2);
                String str = text.text;
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).numeralLarge;
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                zzacn.m2012AutoScaleTextZLomxE(1, 3, 2, 12607536, 256, colors2.semantic.text.standard, Snapshots.getNotScaledUp(Room.getSp(18), gapComposer), gapComposer, m300paddingVpY3zN4$default, textStyle, str, null);
                gapComposer.end(true);
            } else {
                Updater.invalidApplier();
                throw null;
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardLockViewKt$$ExternalSyntheticLambda2((Object) text, modifier, z, i, 16);
        }
    }
}
