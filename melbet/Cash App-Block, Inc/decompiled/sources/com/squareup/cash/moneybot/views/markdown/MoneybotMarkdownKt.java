package com.squareup.cash.moneybot.views.markdown;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda3;
import androidx.compose.material.TextKt$Text$1$1;
import androidx.compose.material3.SliderKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontListFontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.network.NetworkFetcher$doFetch$2;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.mikepenz.markdown.compose.ComposeLocalKt;
import com.mikepenz.markdown.compose.ComposeLocalKt$$ExternalSyntheticLambda14;
import com.mikepenz.markdown.compose.MarkdownExtensionKt;
import com.mikepenz.markdown.compose.components.DefaultMarkdownComponents;
import com.mikepenz.markdown.compose.components.MarkdownComponentModel;
import com.mikepenz.markdown.compose.elements.MarkdownListKt$$ExternalSyntheticLambda2;
import com.mikepenz.markdown.compose.elements.MarkdownListKt$$ExternalSyntheticLambda6;
import com.mikepenz.markdown.compose.elements.MarkdownListKt$$ExternalSyntheticLambda8;
import com.mikepenz.markdown.compose.elements.MarkdownListKt$$ExternalSyntheticLambda9;
import com.mikepenz.markdown.model.DefaultMarkdownColors;
import com.mikepenz.markdown.model.DefaultMarkdownDimens;
import com.mikepenz.markdown.model.DefaultMarkdownExtendedSpans;
import com.mikepenz.markdown.model.DefaultMarkdownPadding;
import com.mikepenz.markdown.model.DefaultMarkdownTypography;
import com.mikepenz.markdown.model.Input;
import com.mikepenz.markdown.model.MarkdownStateImpl;
import com.mikepenz.markdown.model.ReferenceLinkHandlerImpl;
import com.nimbusds.jose.JWECryptoParts;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.appmessages.views.sheet.SheetAppMessageView$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DividerKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.EmojiIconsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.core.navigationcontainer.UiContainer$$ExternalSyntheticLambda33;
import com.squareup.cash.money.views.ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.MoneyTabThemedHeaderKt$$ExternalSyntheticLambda13;
import com.squareup.cash.moneybot.views.card.InsightChartKt$$ExternalSyntheticLambda19;
import com.squareup.cash.moneybot.views.plugins.SlottedTableKt$$ExternalSyntheticLambda2;
import com.squareup.cash.qrcodes.views.CameraXPreviewKt$$ExternalSyntheticLambda0;
import com.squareup.util.Strings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.InterruptibleKt;
import kotlinx.coroutines.ThreadPoolDispatcherKt;
import kotlinx.serialization.encoding.AbstractDecoder;
import net.idrnd.face.iad.capture.internal.s2;
import okhttp3.internal.Tags;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.ast.ASTNodeImpl;
import org.intellij.markdown.ast.ASTUtilKt;
import org.intellij.markdown.flavours.gfm.GFMElementTypes;
import org.intellij.markdown.flavours.gfm.GFMFlavourDescriptor;
import org.intellij.markdown.flavours.gfm.GFMTokenTypes;
import org.intellij.markdown.parser.MarkdownParser;

/* loaded from: classes9.dex */
public abstract class MoneybotMarkdownKt {
    public static final ComposableLambdaImpl lambda$1660982986 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0(19), false, 1660982986);

    /* renamed from: lambda$-1584115095, reason: not valid java name */
    public static final ComposableLambdaImpl f490lambda$1584115095 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0(26), false, -1584115095);

    /* renamed from: lambda$-534245880, reason: not valid java name */
    public static final ComposableLambdaImpl f493lambda$534245880 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0(27), false, -534245880);
    public static final ComposableLambdaImpl lambda$515623335 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0(28), false, 515623335);
    public static final ComposableLambdaImpl lambda$1565492550 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0(29), false, 1565492550);

    /* renamed from: lambda$-1679605531, reason: not valid java name */
    public static final ComposableLambdaImpl f491lambda$1679605531 = new ComposableLambdaImpl(new SlottedTableKt$$ExternalSyntheticLambda2(1), false, -1679605531);
    public static final ComposableLambdaImpl lambda$743377665 = new ComposableLambdaImpl(new SlottedTableKt$$ExternalSyntheticLambda2(2), false, 743377665);
    public static final ComposableLambdaImpl lambda$1793246880 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0(20), false, 1793246880);

    /* renamed from: lambda$-401981986, reason: not valid java name */
    public static final ComposableLambdaImpl f492lambda$401981986 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0(21), false, -401981986);
    public static final ComposableLambdaImpl lambda$647887229 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0(22), false, 647887229);
    public static final ComposableLambdaImpl lambda$1697756444 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0(23), false, 1697756444);
    public static final ComposableLambdaImpl lambda$552396793 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0(24), false, 552396793);
    public static final ComposableLambdaImpl lambda$1602266008 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0(25), false, 1602266008);

    public static final void HorizontalRule(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2100239976);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(m302paddingqDBjuR0$default, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 32.0f, 7);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default2);
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
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(m277height3ABfNKs, colors.semantic.border.subtle, ColorKt.RectangleShape), gapComposer, 0);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyTabThemedHeaderKt$$ExternalSyntheticLambda13(i, 24);
        }
    }

    public static final void MoneybotMarkdown(int i, int i2, Composer composer, Modifier modifier, String str) {
        Modifier modifier2;
        int i3;
        GapComposer gapComposer;
        Modifier modifier3;
        str.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1851627584);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (gapComposer2.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i5 = i3 | (gapComposer2.changed(str) ? 32 : 16);
        if (gapComposer2.shouldExecute(i5 & 1, (i5 & 19) != 18)) {
            Modifier modifier4 = i4 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            int i6 = ((i5 >> 3) & 14) | MLKEMEngine.KyberPolyBytes;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new GFMFlavourDescriptor();
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            GFMFlavourDescriptor gFMFlavourDescriptor = (GFMFlavourDescriptor) rememberedValue;
            boolean changed = gapComposer2.changed(gFMFlavourDescriptor);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new MarkdownParser(gFMFlavourDescriptor);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            MarkdownParser markdownParser = (MarkdownParser) rememberedValue2;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new ReferenceLinkHandlerImpl();
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            ReferenceLinkHandlerImpl referenceLinkHandlerImpl = (ReferenceLinkHandlerImpl) rememberedValue3;
            boolean booleanValue = ((Boolean) gapComposer2.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
            boolean changed2 = gapComposer2.changed(true) | ((((i6 & 14) ^ 6) > 4 && gapComposer2.changed(str)) || (i6 & 6) == 4) | gapComposer2.changed(gFMFlavourDescriptor) | gapComposer2.changed(markdownParser) | gapComposer2.changed(referenceLinkHandlerImpl);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new Input(str, gFMFlavourDescriptor, markdownParser, referenceLinkHandlerImpl);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            Input input = (Input) rememberedValue4;
            Object rememberedValue5 = gapComposer2.rememberedValue();
            Object obj = rememberedValue5;
            if (rememberedValue5 == neverEqualPolicy) {
                MarkdownStateImpl markdownStateImpl = new MarkdownStateImpl(input);
                if (booleanValue) {
                    markdownStateImpl.parseBlocking$multiplatform_markdown_renderer();
                }
                gapComposer2.updateRememberedValue(markdownStateImpl);
                obj = markdownStateImpl;
            }
            MarkdownStateImpl markdownStateImpl2 = (MarkdownStateImpl) obj;
            MutableState rememberUpdatedState = Updater.rememberUpdatedState(input, gapComposer2);
            Unit unit = Unit.INSTANCE;
            boolean changed3 = gapComposer2.changed(rememberUpdatedState);
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (changed3 || rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = new NetworkFetcher$doFetch$2(rememberUpdatedState, markdownStateImpl2, null, 8);
                gapComposer2.updateRememberedValue(rememberedValue6);
            }
            Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue6);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier4, 1.0f);
            FontListFontFamily fontListFontFamily = MoneybotMarkdownStylesKt.cashSansForMarkdown;
            DefaultMarkdownColors defaultMarkdownColors = new DefaultMarkdownColors(Strings.getColors(gapComposer2).semantic.text.standard, Strings.getColors(gapComposer2).semantic.background.subtle, Strings.getColors(gapComposer2).semantic.background.subtle, Strings.getColors(gapComposer2).semantic.border.subtle, Strings.getColors(gapComposer2).semantic.background.subtle);
            TextStyle textStyle = Strings.getTypography(gapComposer2).headlineSmall;
            FontListFontFamily fontListFontFamily2 = MoneybotMarkdownStylesKt.cashSansForMarkdown;
            Modifier modifier5 = modifier4;
            DefaultMarkdownTypography defaultMarkdownTypography = new DefaultMarkdownTypography(TextStyle.m994copyp1EtxEg$default(textStyle, 0L, 0L, null, fontListFontFamily2, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777183), TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer2).sectionTitle, 0L, 0L, null, fontListFontFamily2, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777183), TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer2).labelMedium, 0L, 0L, null, fontListFontFamily2, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777183), TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer2).labelMedium, 0L, 0L, null, fontListFontFamily2, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777183), TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer2).labelMedium, 0L, 0L, null, fontListFontFamily2, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777183), TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer2).labelMedium, 0L, 0L, null, fontListFontFamily2, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777183), TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer2).bodyMedium, 0L, 0L, null, fontListFontFamily2, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777183), MoneybotMarkdownStylesKt.getBodyMediumMono(gapComposer2), MoneybotMarkdownStylesKt.getBodyMediumMono(gapComposer2), TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer2).bodyMedium, 0L, 0L, null, fontListFontFamily2, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777183), TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer2).bodyMedium, 0L, 0L, null, fontListFontFamily2, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777183), TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer2).bodyMedium, 0L, 0L, null, fontListFontFamily2, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777183), TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer2).bodyMedium, 0L, 0L, null, fontListFontFamily2, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777183), TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer2).bodyMedium, 0L, 0L, null, fontListFontFamily2, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777183), new TextLinkStyles(new SpanStyle(Strings.getColors(gapComposer2).semantic.text.link, 0L, FontWeight.Normal, (FontStyle) null, (FontSynthesis) null, fontListFontFamily2, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Underline, (Shadow) null, 61402), (SpanStyle) null, (SpanStyle) null, 14), TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer2).bodySmall, 0L, 0L, null, fontListFontFamily2, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777183));
            int i7 = 978 & 1;
            float f = RecyclerView.DECELERATION_RATE;
            DefaultMarkdownPadding defaultMarkdownPadding = new DefaultMarkdownPadding(i7 != 0 ? 2.0f : 0.0f, (978 & 4) != 0 ? 4.0f : 0.0f, (978 & 8) != 0 ? 4.0f : 0.0f, (978 & 32) != 0 ? 8.0f : 0.0f, new PaddingValuesImpl(8.0f, 8.0f, 8.0f, 8.0f), new PaddingValuesImpl(16.0f, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE), SpacerKt.m295PaddingValuesYgX7TsA$default(RecyclerView.DECELERATION_RATE, 4.0f, 1), new PaddingValues.Absolute(4.0f, 2.0f, 4.0f, 2.0f));
            Strings.getSizes(gapComposer2).getClass();
            Object obj2 = DefaultSizes.border.entries;
            float f2 = (29 & 2) != 0 ? 8.0f : 16.0f;
            float f3 = (29 & 32) == 0 ? 0.0f : 16.0f;
            if ((29 & 64) != 0) {
                f = 8.0f;
            }
            gapComposer = gapComposer2;
            InterruptibleKt.Markdown(markdownStateImpl2, defaultMarkdownColors, defaultMarkdownTypography, fillMaxWidth, defaultMarkdownPadding, new DefaultMarkdownDimens(f2, f3, f), null, null, new DefaultMarkdownExtendedSpans(new MoneyTabThemedHeaderKt$$ExternalSyntheticLambda13(23)), null, ThreadPoolDispatcherKt.markdownComponents$default(3346447), null, null, null, null, gapComposer, 0);
            modifier3 = modifier5;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CameraXPreviewKt$$ExternalSyntheticLambda0(modifier3, str, i, i2, 1);
        }
    }

    /* renamed from: MoneybotMarkdownBasicText-JAgEBs0, reason: not valid java name */
    public static final void m3631MoneybotMarkdownBasicTextJAgEBs0(final String str, final TextStyle textStyle, Modifier modifier, long j, long j2, long j3, long j4, int i, boolean z, int i2, int i3, Composer composer, final int i4, final int i5) {
        final Modifier modifier2;
        int i6;
        final long j5;
        final long j6;
        final long j7;
        final long j8;
        final int i7;
        final boolean z2;
        final int i8;
        final int i9;
        Modifier modifier3;
        long j9;
        long j10;
        int i10;
        boolean z3;
        int i11;
        long j11;
        long j12;
        int i12;
        Modifier modifier4;
        long j13;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1471320988);
        int i13 = i4 | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(textStyle) ? 32 : 16);
        int i14 = i5 & 4;
        if (i14 != 0) {
            i6 = i13 | MLKEMEngine.KyberPolyBytes;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i6 = i13 | (gapComposer.changed(modifier2) ? 256 : 128);
        }
        int i15 = i6 | 920349696;
        int i16 = 1;
        if (gapComposer.shouldExecute(i15 & 1, (306783379 & i15) != 306783378)) {
            gapComposer.startDefaults();
            if ((i4 & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                modifier3 = i14 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                j9 = Color.Unspecified;
                j10 = TextUnit.Unspecified;
                i10 = Integer.MAX_VALUE;
                z3 = true;
                i11 = 1;
                j11 = j10;
                j12 = j11;
            } else {
                gapComposer.skipToGroupEnd();
                j10 = j2;
                j11 = j3;
                j12 = j4;
                i16 = i;
                z3 = z;
                i10 = i2;
                i11 = i3;
                modifier3 = modifier2;
                j9 = j;
            }
            gapComposer.endDefaults();
            if (j9 != 16) {
                i12 = i15;
                gapComposer.startReplaceGroup(-1981480821);
                gapComposer.end(false);
                modifier4 = modifier3;
                j13 = j9;
            } else {
                i12 = i15;
                if (textStyle.m996getColor0d7_KjU() != 16) {
                    gapComposer.startReplaceGroup(-1981427067);
                    gapComposer.end(false);
                    modifier4 = modifier3;
                    j13 = textStyle.m996getColor0d7_KjU();
                } else {
                    gapComposer.startReplaceGroup(-1981395664);
                    modifier4 = modifier3;
                    j13 = ((DefaultMarkdownColors) gapComposer.consume(ComposeLocalKt.LocalMarkdownColors)).text;
                    gapComposer.end(false);
                }
            }
            TextStyle m995mergedA7vx0o$default = TextStyle.m995mergedA7vx0o$default(textStyle, 0L, j10, null, null, j11, null, 0, j12, 16609105);
            boolean changed = gapComposer.changed(j13);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new TextKt$Text$1$1(j13, 3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            boolean z4 = z3;
            int i17 = i10;
            int i18 = i11;
            BasicTextKt.m347BasicTextRWo7tUw(str, modifier4, m995mergedA7vx0o$default, null, i16, z4, i17, i18, (ColorProducer) rememberedValue, gapComposer, (i12 & 14) | ((i12 >> 3) & 112) | 14380032, 512);
            long j14 = j12;
            i7 = i16;
            j6 = j10;
            j7 = j11;
            j8 = j14;
            z2 = z4;
            i9 = i18;
            i8 = i17;
            j5 = j9;
            modifier2 = modifier4;
        } else {
            gapComposer.skipToGroupEnd();
            j5 = j;
            j6 = j2;
            j7 = j3;
            j8 = j4;
            i7 = i;
            z2 = z;
            i8 = i2;
            i9 = i3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(str, textStyle, modifier2, j5, j6, j7, j8, i7, z2, i8, i9, i4, i5) { // from class: com.squareup.cash.moneybot.views.markdown.MoneybotMarkdownListKt$$ExternalSyntheticLambda8
                public final /* synthetic */ String f$0;
                public final /* synthetic */ TextStyle f$1;
                public final /* synthetic */ long f$11;
                public final /* synthetic */ int f$12;
                public final /* synthetic */ boolean f$13;
                public final /* synthetic */ int f$14;
                public final /* synthetic */ int f$15;
                public final /* synthetic */ int f$19;
                public final /* synthetic */ Modifier f$2;
                public final /* synthetic */ long f$3;
                public final /* synthetic */ long f$4;
                public final /* synthetic */ long f$8;

                {
                    this.f$19 = i5;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    MoneybotMarkdownKt.m3631MoneybotMarkdownBasicTextJAgEBs0(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$8, this.f$11, this.f$12, this.f$13, this.f$14, this.f$15, (Composer) obj, updateChangedFlags, this.f$19);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void MoneybotMarkdownBulletList(final String str, ASTNodeImpl aSTNodeImpl, final TextStyle textStyle, final int i, Function1 function1, Function1 function12, Composer composer, int i2) {
        Function1 function13;
        Function1 function14;
        Function1 function15;
        Function1 function16;
        str.getClass();
        aSTNodeImpl.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-87226846);
        int i3 = i2 | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changedInstance(aSTNodeImpl) ? 32 : 16) | (gapComposer.changed(textStyle) ? 256 : 128) | (gapComposer.changed(i) ? 2048 : 1024) | 221184;
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            gapComposer.startDefaults();
            if ((i2 & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                Object rememberedValue = gapComposer.rememberedValue();
                Object obj = Composer.Companion.Empty;
                if (rememberedValue == obj) {
                    rememberedValue = new InsightChartKt$$ExternalSyntheticLambda19(19);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Function1 function17 = (Function1) rememberedValue;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == obj) {
                    rememberedValue2 = new InsightChartKt$$ExternalSyntheticLambda19(21);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                function15 = (Function1) rememberedValue2;
                function16 = function17;
            } else {
                gapComposer.skipToGroupEnd();
                function16 = function1;
                function15 = function12;
            }
            gapComposer.endDefaults();
            final ComposeLocalKt$$ExternalSyntheticLambda14 composeLocalKt$$ExternalSyntheticLambda14 = (ComposeLocalKt$$ExternalSyntheticLambda14) gapComposer.consume(ComposeLocalKt.LocalBulletListHandler);
            final float f = ((DefaultMarkdownPadding) gapComposer.consume(ComposeLocalKt.LocalMarkdownPadding)).listItemBottom;
            MoneybotMarkdownListItems(str, aSTNodeImpl, i, function16, function15, Expect_jvmKt.rememberComposableLambda(-114692782, new Function5(str, i, textStyle, f) { // from class: com.squareup.cash.moneybot.views.markdown.MoneybotMarkdownListKt$$ExternalSyntheticLambda2
                public final /* synthetic */ String f$1;
                public final /* synthetic */ TextStyle f$3;
                public final /* synthetic */ float f$4;

                {
                    this.f$3 = textStyle;
                    this.f$4 = f;
                }

                @Override // kotlin.jvm.functions.Function5
                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                    int intValue = ((Integer) obj2).intValue();
                    int intValue2 = ((Integer) obj3).intValue();
                    ASTNodeImpl aSTNodeImpl2 = (ASTNodeImpl) obj4;
                    Composer composer2 = (Composer) obj5;
                    ((Integer) obj6).getClass();
                    MarkdownElementType markdownElementType = MarkdownTokenTypes.LIST_BULLET;
                    if (aSTNodeImpl2 != null) {
                        MoneybotMarkdownKt.safeGetUnescapedTextInNode(aSTNodeImpl2, this.f$1);
                    }
                    MoneybotMarkdownKt.m3631MoneybotMarkdownBasicTextJAgEBs0(ComposeLocalKt$$ExternalSyntheticLambda14.this.transform(markdownElementType, intValue, intValue2), this.f$3, SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, this.f$4, 7), 0L, 0L, 0L, 0L, 0, false, 0, 0, composer2, 0, 131064);
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, ((i3 >> 3) & 896) | (i3 & 14) | 196608 | (i3 & 112) | 27648);
            function13 = function16;
            function14 = function15;
        } else {
            gapComposer.skipToGroupEnd();
            function13 = function1;
            function14 = function12;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownListKt$$ExternalSyntheticLambda2(str, aSTNodeImpl, textStyle, i, function13, function14, i2, 2);
        }
    }

    public static final void MoneybotMarkdownListItem(String str, ASTNodeImpl aSTNodeImpl, ASTNodeImpl aSTNodeImpl2, int i, int i2, int i3, DefaultMarkdownComponents defaultMarkdownComponents, DefaultMarkdownTypography defaultMarkdownTypography, DefaultMarkdownPadding defaultMarkdownPadding, Function1 function1, Function1 function12, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i4, int i5) {
        int i6;
        int i7;
        Function1 function13;
        DefaultMarkdownComponents defaultMarkdownComponents2;
        int i8;
        String str2 = str;
        DefaultMarkdownTypography defaultMarkdownTypography2 = defaultMarkdownTypography;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2114533208);
        Applier applier = gapComposer.applier;
        if ((i4 & 6) == 0) {
            i6 = (gapComposer.changed(str2) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= gapComposer.changedInstance(aSTNodeImpl) ? 32 : 16;
        }
        if ((i4 & MLKEMEngine.KyberPolyBytes) == 0) {
            i6 |= gapComposer.changedInstance(aSTNodeImpl2) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= gapComposer.changed(i) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= gapComposer.changed(i2) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((i4 & 196608) == 0) {
            i6 |= gapComposer.changed(i3) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i6 |= gapComposer.changed(defaultMarkdownComponents) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i4 & 12582912) == 0) {
            i6 |= gapComposer.changed(defaultMarkdownTypography2) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i6 |= gapComposer.changed(defaultMarkdownPadding) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i6 |= gapComposer.changedInstance(function1) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        int i9 = i6;
        if ((i5 & 6) == 0) {
            i7 = i5 | (gapComposer.changedInstance(function12) ? 4 : 2);
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= gapComposer.changedInstance(composableLambdaImpl) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i9 & 1, ((i9 & 306783379) == 306783378 && (i7 & 19) == 18) ? false : true)) {
            ASTNodeImpl aSTNodeImpl3 = (ASTNodeImpl) CollectionsKt.getOrNull(1, aSTNodeImpl.getChildren());
            if (aSTNodeImpl3 == null || !Intrinsics.areEqual(aSTNodeImpl3.f1630type, GFMTokenTypes.CHECK_BOX)) {
                aSTNodeImpl3 = null;
            }
            MarkdownElementType markdownElementType = aSTNodeImpl2.f1630type;
            Object findChildOfType = Intrinsics.areEqual(markdownElementType, MarkdownTokenTypes.ORDERED_LIST) ? ASTUtilKt.findChildOfType(aSTNodeImpl, MarkdownTokenTypes.LIST_NUMBER) : Intrinsics.areEqual(markdownElementType, MarkdownTokenTypes.UNORDERED_LIST) ? ASTUtilKt.findChildOfType(aSTNodeImpl, MarkdownTokenTypes.LIST_BULLET) : null;
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = findChildOfType;
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new InsightChartKt$$ExternalSyntheticLambda19(20);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            int i10 = i7;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(SemanticsModifierKt.semantics(companion, true, (Function1) rememberedValue), 1.0f), RecyclerView.DECELERATION_RATE, defaultMarkdownPadding.listItemTop, RecyclerView.DECELERATION_RATE, defaultMarkdownPadding.listItemBottom, 5);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifier = (Modifier) function1.invoke(rowScopeInstance);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, modifier);
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
            if (aSTNodeImpl3 != null) {
                gapComposer.startReplaceGroup(-57111205);
                defaultMarkdownComponents2 = defaultMarkdownComponents;
                i8 = 0;
                defaultMarkdownComponents2.checkbox.invoke(new MarkdownComponentModel(str2, aSTNodeImpl3, defaultMarkdownTypography2, Tags.persistentMapOf(new Pair("markdown_list_depth", Integer.valueOf(i3 + 1)))), gapComposer, 0);
                gapComposer.end(false);
            } else {
                defaultMarkdownComponents2 = defaultMarkdownComponents;
                gapComposer.startReplaceGroup(-56806506);
                composableLambdaImpl.invoke(Integer.valueOf(i), Integer.valueOf(i2), obj, gapComposer, Integer.valueOf(((i9 >> 9) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i10 << 6) & 7168)));
                i8 = 0;
                gapComposer.end(false);
            }
            gapComposer.end(true);
            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 12.0f));
            function13 = function12;
            Modifier modifier2 = (Modifier) function13.invoke(rowScopeInstance);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, i8);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, modifier2);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            gapComposer.startReplaceGroup(1436857973);
            Iterator it = aSTNodeImpl.getChildren().iterator();
            while (it.hasNext()) {
                int i11 = i9 >> 9;
                MoneybotMarkdownNestedListItem((ASTNodeImpl) it.next(), str2, i3, defaultMarkdownComponents2, defaultMarkdownTypography2, gapComposer, (i11 & 57344) | ((i9 << 3) & 112) | (i11 & 896) | (i11 & 7168));
                str2 = str;
                defaultMarkdownComponents2 = defaultMarkdownComponents;
                defaultMarkdownTypography2 = defaultMarkdownTypography;
            }
            Boxes$$ExternalSyntheticOutline1.m(gapComposer, false, true, true);
        } else {
            function13 = function12;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownListKt$$ExternalSyntheticLambda8(str, aSTNodeImpl, aSTNodeImpl2, i, i2, i3, defaultMarkdownComponents, defaultMarkdownTypography, defaultMarkdownPadding, function1, function13, composableLambdaImpl, i4, i5, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0161  */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [int] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [int] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MoneybotMarkdownListItems(String str, ASTNodeImpl aSTNodeImpl, int i, Function1 function1, Function1 function12, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i2) {
        boolean z;
        int i3;
        DefaultMarkdownTypography defaultMarkdownTypography;
        boolean z2;
        DefaultMarkdownPadding defaultMarkdownPadding;
        MarkdownElementType markdownElementType;
        String safeGetUnescapedTextInNode;
        String str2 = str;
        ASTNodeImpl aSTNodeImpl2 = aSTNodeImpl;
        MarkdownElementType markdownElementType2 = MarkdownTokenTypes.LIST_ITEM;
        str2.getClass();
        aSTNodeImpl2.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(598860210);
        int i4 = (i2 & 6) == 0 ? (gapComposer.changed(str2) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i4 |= gapComposer.changedInstance(aSTNodeImpl2) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer.changed(i) ? 256 : 128;
        }
        Function1 function13 = function1;
        if ((i2 & 3072) == 0) {
            i4 |= gapComposer.changedInstance(function13) ? 2048 : 1024;
        }
        Function1 function14 = function12;
        if ((i2 & 24576) == 0) {
            i4 |= gapComposer.changedInstance(function14) ? 16384 : PKIFailureInfo.certRevoked;
        }
        ComposableLambdaImpl composableLambdaImpl2 = composableLambdaImpl;
        if ((196608 & i2) == 0) {
            i4 |= gapComposer.changedInstance(composableLambdaImpl2) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        int i5 = i4;
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 74899) != 74898)) {
            DefaultMarkdownPadding defaultMarkdownPadding2 = (DefaultMarkdownPadding) gapComposer.consume(ComposeLocalKt.LocalMarkdownPadding);
            DefaultMarkdownComponents defaultMarkdownComponents = (DefaultMarkdownComponents) gapComposer.consume(ComposeLocalKt.LocalMarkdownComponents);
            DefaultMarkdownTypography defaultMarkdownTypography2 = (DefaultMarkdownTypography) gapComposer.consume(ComposeLocalKt.LocalMarkdownTypography);
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, defaultMarkdownPadding2.listIndent * i, 4.0f, RecyclerView.DECELERATION_RATE, 4.0f, 4);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            DefaultMarkdownPadding defaultMarkdownPadding3 = defaultMarkdownPadding2;
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ASTNodeImpl findChildOfType = ASTUtilKt.findChildOfType(aSTNodeImpl2, markdownElementType2);
            if (findChildOfType == null || (safeGetUnescapedTextInNode = safeGetUnescapedTextInNode(findChildOfType, str2)) == null) {
                z = false;
            } else {
                int length = safeGetUnescapedTextInNode.length();
                int i6 = 0;
                while (true) {
                    if (i6 >= length) {
                        z = false;
                        break;
                    } else {
                        if (!Character.isDigit(safeGetUnescapedTextInNode.charAt(i6))) {
                            z = false;
                            safeGetUnescapedTextInNode = safeGetUnescapedTextInNode.substring(0, i6);
                            break;
                        }
                        i6++;
                    }
                }
                Integer intOrNull = StringsKt.toIntOrNull(safeGetUnescapedTextInNode);
                if (intOrNull != null) {
                    i3 = intOrNull.intValue();
                    gapComposer.startReplaceGroup(788853035);
                    int i7 = i3;
                    ?? r3 = z;
                    for (ASTNodeImpl aSTNodeImpl3 : aSTNodeImpl2.getChildren()) {
                        if (Intrinsics.areEqual(aSTNodeImpl3.f1630type, markdownElementType2)) {
                            gapComposer.startReplaceGroup(1413316053);
                            z2 = z;
                            defaultMarkdownPadding = defaultMarkdownPadding3;
                            markdownElementType = markdownElementType2;
                            defaultMarkdownTypography = defaultMarkdownTypography2;
                            MoneybotMarkdownListItem(str2, aSTNodeImpl3, aSTNodeImpl2, r3, i7, i, defaultMarkdownComponents, defaultMarkdownTypography, defaultMarkdownPadding, function13, function14, composableLambdaImpl2, gapComposer, ((i5 << 18) & 1879048192) | (i5 & 14) | ((i5 << 3) & 896) | ((i5 << 9) & 458752), (i5 >> 12) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                            r3++;
                            gapComposer.end(z2);
                        } else {
                            defaultMarkdownTypography = defaultMarkdownTypography2;
                            z2 = z;
                            defaultMarkdownPadding = defaultMarkdownPadding3;
                            markdownElementType = markdownElementType2;
                            gapComposer.startReplaceGroup(1413775411);
                            gapComposer.end(z2);
                        }
                        str2 = str;
                        aSTNodeImpl2 = aSTNodeImpl;
                        function13 = function1;
                        function14 = function12;
                        composableLambdaImpl2 = composableLambdaImpl;
                        defaultMarkdownTypography2 = defaultMarkdownTypography;
                        z = z2;
                        markdownElementType2 = markdownElementType;
                        defaultMarkdownPadding3 = defaultMarkdownPadding;
                        r3 = r3;
                    }
                    gapComposer.end(z);
                    gapComposer.end(true);
                }
            }
            i3 = 1;
            gapComposer.startReplaceGroup(788853035);
            int i72 = i3;
            ?? r32 = z;
            while (r18.hasNext()) {
            }
            gapComposer.end(z);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownListKt$$ExternalSyntheticLambda6(str, aSTNodeImpl, i, function1, function12, composableLambdaImpl, i2, 1);
        }
    }

    public static final void MoneybotMarkdownNestedListItem(ASTNodeImpl aSTNodeImpl, String str, int i, DefaultMarkdownComponents defaultMarkdownComponents, DefaultMarkdownTypography defaultMarkdownTypography, Composer composer, int i2) {
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(359215985);
        if ((i2 & 6) == 0) {
            i3 = (gapComposer.changedInstance(aSTNodeImpl) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= gapComposer.changed(str) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= gapComposer.changed(defaultMarkdownComponents) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= gapComposer.changed(defaultMarkdownTypography) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            MarkdownElementType markdownElementType = aSTNodeImpl.f1630type;
            if (Intrinsics.areEqual(markdownElementType, MarkdownTokenTypes.ORDERED_LIST)) {
                gapComposer.startReplaceGroup(-1654856244);
                defaultMarkdownComponents.orderedList.invoke(new MarkdownComponentModel(str, aSTNodeImpl, defaultMarkdownTypography, Tags.persistentMapOf(new Pair("markdown_list_depth", Integer.valueOf(i + 1)))), gapComposer, 0);
                gapComposer.end(false);
            } else if (Intrinsics.areEqual(markdownElementType, MarkdownTokenTypes.UNORDERED_LIST)) {
                gapComposer.startReplaceGroup(-1654541718);
                defaultMarkdownComponents.unorderedList.invoke(new MarkdownComponentModel(str, aSTNodeImpl, defaultMarkdownTypography, Tags.persistentMapOf(new Pair("markdown_list_depth", Integer.valueOf(i + 1)))), gapComposer, 0);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1654239220);
                MarkdownExtensionKt.MarkdownElement(aSTNodeImpl, defaultMarkdownComponents, str, false, gapComposer, (i3 & 14) | 3072 | ((i3 >> 6) & 112) | ((i3 << 3) & 896), 0);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownListKt$$ExternalSyntheticLambda9(aSTNodeImpl, str, i, defaultMarkdownComponents, defaultMarkdownTypography, i2, 1);
        }
    }

    public static final void MoneybotMarkdownOrderedList(String str, ASTNodeImpl aSTNodeImpl, TextStyle textStyle, int i, Function1 function1, Function1 function12, Composer composer, int i2) {
        Function1 function13;
        GapComposer gapComposer;
        Function1 function14;
        Function1 function15;
        Function1 function16;
        str.getClass();
        aSTNodeImpl.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(71920095);
        int i3 = i2 | (gapComposer2.changed(str) ? 4 : 2) | (gapComposer2.changedInstance(aSTNodeImpl) ? 32 : 16) | (gapComposer2.changed(textStyle) ? 256 : 128) | (gapComposer2.changed(i) ? 2048 : 1024) | 221184;
        if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            gapComposer2.startDefaults();
            if ((i2 & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                Object rememberedValue = gapComposer2.rememberedValue();
                Object obj = Composer.Companion.Empty;
                if (rememberedValue == obj) {
                    rememberedValue = new InsightChartKt$$ExternalSyntheticLambda19(22);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                function15 = (Function1) rememberedValue;
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (rememberedValue2 == obj) {
                    rememberedValue2 = new InsightChartKt$$ExternalSyntheticLambda19(23);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                function16 = (Function1) rememberedValue2;
            } else {
                gapComposer2.skipToGroupEnd();
                function15 = function1;
                function16 = function12;
            }
            gapComposer2.endDefaults();
            Function1 function17 = function15;
            Function1 function18 = function16;
            MoneybotMarkdownListItems(str, aSTNodeImpl, i, function17, function18, Expect_jvmKt.rememberComposableLambda(-779523921, new MoneybotMarkdownListKt$$ExternalSyntheticLambda6((ComposeLocalKt$$ExternalSyntheticLambda14) gapComposer2.consume(ComposeLocalKt.LocalOrderedListHandler), str, i, textStyle), gapComposer2), gapComposer2, ((i3 >> 3) & 896) | (i3 & 14) | 196608 | (i3 & 112) | 27648);
            function13 = function17;
            gapComposer = gapComposer2;
            function14 = function18;
        } else {
            gapComposer2.skipToGroupEnd();
            function13 = function1;
            gapComposer = gapComposer2;
            function14 = function12;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownListKt$$ExternalSyntheticLambda2(str, aSTNodeImpl, textStyle, i, function13, function14, i2, 3);
        }
    }

    public static final void MoneybotMarkdownTable(String str, ASTNodeImpl aSTNodeImpl, TextStyle textStyle, JWECryptoParts jWECryptoParts, Function5 function5, Function6 function6, Composer composer, int i) {
        JWECryptoParts jWECryptoParts2;
        Function5 function52;
        Function6 function62;
        Function5 rememberComposableLambda;
        JWECryptoParts jWECryptoParts3;
        int i2;
        Function6 function63;
        List children;
        str.getClass();
        aSTNodeImpl.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-838351413);
        int i3 = 2;
        int i4 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changedInstance(aSTNodeImpl) ? 32 : 16) | (gapComposer.changed(textStyle) ? 256 : 128) | 222208;
        if (gapComposer.shouldExecute(i4 & 1, (74899 & i4) != 74898)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                final JWECryptoParts annotatorSettings = AwaitKt.annotatorSettings(gapComposer);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(2068515718, new Function5() { // from class: com.squareup.cash.moneybot.views.markdown.MoneybotMarkdownTableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function5
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                        String str2 = (String) obj;
                        ASTNodeImpl aSTNodeImpl2 = (ASTNodeImpl) obj2;
                        int intValue = ((Integer) obj5).intValue();
                        str2.getClass();
                        aSTNodeImpl2.getClass();
                        float f = ((Dp) obj3).value;
                        int i5 = intValue & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO;
                        MoneybotMarkdownKt.m3632MoneybotMarkdownTableHeaderTN_CM5M(str2, aSTNodeImpl2, f, 0, JWECryptoParts.this, (Composer) obj4, i5);
                        return Unit.INSTANCE;
                    }
                }, gapComposer);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(761619873, new UiContainer$$ExternalSyntheticLambda33(i3, textStyle, annotatorSettings), gapComposer);
                jWECryptoParts3 = annotatorSettings;
                i2 = 0;
                function63 = rememberComposableLambda2;
            } else {
                gapComposer.skipToGroupEnd();
                jWECryptoParts3 = jWECryptoParts;
                rememberComposableLambda = function5;
                i2 = 0;
                function63 = function6;
            }
            gapComposer.endDefaults();
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ComposeLocalKt.LocalMarkdownDimens;
            ((DefaultMarkdownDimens) gapComposer.consume(dynamicProvidableCompositionLocal)).getClass();
            ((DefaultMarkdownDimens) gapComposer.consume(dynamicProvidableCompositionLocal)).getClass();
            boolean changed = gapComposer.changed(aSTNodeImpl);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                ASTNodeImpl findChildOfType = ASTUtilKt.findChildOfType(aSTNodeImpl, GFMElementTypes.HEADER);
                if (findChildOfType != null && (children = findChildOfType.getChildren()) != null) {
                    List list = children;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.areEqual(((ASTNodeImpl) it.next()).f1630type, GFMTokenTypes.CELL) && (i2 = i2 + 1) < 0) {
                                CollectionsKt__CollectionsKt.throwCountOverflow();
                                throw null;
                            }
                        }
                    }
                }
                rememberedValue = Integer.valueOf(i2);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            OffsetKt.BoxWithConstraints(SizeKt.m292widthInVpY3zN4$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, Float.NaN, 1), null, false, Expect_jvmKt.rememberComposableLambda(-1401294303, new SheetAppMessageView$$ExternalSyntheticLambda2(160.0f * ((Number) rememberedValue).intValue(), aSTNodeImpl, rememberComposableLambda, str, function63), gapComposer), gapComposer, 3072, 6);
            function62 = function63;
            jWECryptoParts2 = jWECryptoParts3;
            function52 = rememberComposableLambda;
        } else {
            gapComposer.skipToGroupEnd();
            jWECryptoParts2 = jWECryptoParts;
            function52 = function5;
            function62 = function6;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SwipeToDismissKt$$ExternalSyntheticLambda3(str, aSTNodeImpl, textStyle, jWECryptoParts2, function52, function62, i, 16);
        }
    }

    /* renamed from: MoneybotMarkdownTableHeader-TN_CM5M, reason: not valid java name */
    public static final void m3632MoneybotMarkdownTableHeaderTN_CM5M(String str, ASTNodeImpl aSTNodeImpl, float f, int i, JWECryptoParts jWECryptoParts, Composer composer, int i2) {
        ASTNodeImpl aSTNodeImpl2;
        JWECryptoParts jWECryptoParts2;
        int i3;
        int i4;
        float f2;
        Modifier.Companion companion;
        DefaultMarkdownComponents defaultMarkdownComponents;
        int i5;
        boolean z;
        str.getClass();
        aSTNodeImpl.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1819457682);
        Applier applier = gapComposer.applier;
        String str2 = str;
        int i6 = (i2 & 6) == 0 ? (gapComposer.changed(str2) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            aSTNodeImpl2 = aSTNodeImpl;
            i6 |= gapComposer.changedInstance(aSTNodeImpl2) ? 32 : 16;
        } else {
            aSTNodeImpl2 = aSTNodeImpl;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i6 |= gapComposer.changed(f) ? 256 : 128;
        }
        int i7 = i6 | 3072;
        if ((i2 & 24576) == 0) {
            jWECryptoParts2 = jWECryptoParts;
            i7 |= gapComposer.changed(jWECryptoParts2) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            jWECryptoParts2 = jWECryptoParts;
        }
        if (gapComposer.shouldExecute(i7 & 1, (i7 & 9363) != 9362)) {
            gapComposer.startDefaults();
            if ((i2 & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                i4 = Integer.MAX_VALUE;
            } else {
                gapComposer.skipToGroupEnd();
                i4 = i;
            }
            gapComposer.endDefaults();
            DefaultMarkdownComponents defaultMarkdownComponents2 = (DefaultMarkdownComponents) gapComposer.consume(ComposeLocalKt.LocalMarkdownComponents);
            float f3 = ((DefaultMarkdownDimens) gapComposer.consume(ComposeLocalKt.LocalMarkdownDimens)).tableCellPadding;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(OffsetKt.height(SizeKt.m292widthInVpY3zN4$default(companion2, f, RecyclerView.DECELERATION_RATE, 2), IntrinsicSize.Max), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12.0f, 7);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(403788547);
            List children = aSTNodeImpl2.getChildren();
            ArrayList arrayList = new ArrayList();
            for (Object obj : children) {
                if (Intrinsics.areEqual(((ASTNodeImpl) obj).f1630type, GFMTokenTypes.CELL)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ASTNodeImpl aSTNodeImpl3 = (ASTNodeImpl) it.next();
                Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SpacerKt.m298padding3ABfNKs(companion2, f3), true);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m);
                ComposeUiNode.Companion.getClass();
                Iterator it2 = it;
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                List children2 = aSTNodeImpl3.getChildren();
                if (!(children2 instanceof Collection) || !children2.isEmpty()) {
                    Iterator it3 = children2.iterator();
                    while (it3.hasNext()) {
                        if (Intrinsics.areEqual(((ASTNodeImpl) it3.next()).f1630type, MarkdownTokenTypes.IMAGE)) {
                            gapComposer.startReplaceGroup(-848223501);
                            f2 = f3;
                            companion = companion2;
                            MarkdownExtensionKt.MarkdownElement(aSTNodeImpl3, defaultMarkdownComponents2, str2, false, gapComposer, ((i7 << 6) & 896) | 3072, 0);
                            defaultMarkdownComponents = defaultMarkdownComponents2;
                            gapComposer.end(false);
                            i5 = i4;
                            z = true;
                            break;
                        }
                        str2 = str;
                        f3 = f3;
                    }
                }
                f2 = f3;
                defaultMarkdownComponents = defaultMarkdownComponents2;
                companion = companion2;
                gapComposer.startReplaceGroup(-848012267);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 11);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default2);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$13);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                GapComposer gapComposer2 = gapComposer;
                i5 = i4;
                z = true;
                AbstractDecoder.m4202MarkdownTableBasicTextkKmfEb0(str, aSTNodeImpl3, TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelSmall, 0L, 0L, null, MoneybotMarkdownStylesKt.cashSansForMarkdown, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777183), i5, 0, jWECryptoParts2, gapComposer2, (i7 & 7182) | ((i7 << 3) & 458752), 16);
                gapComposer = gapComposer2;
                gapComposer.end(true);
                gapComposer.end(false);
                gapComposer.end(z);
                str2 = str;
                it = it2;
                jWECryptoParts2 = jWECryptoParts;
                f3 = f2;
                i4 = i5;
                companion2 = companion;
                defaultMarkdownComponents2 = defaultMarkdownComponents;
            }
            i3 = i4;
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
            i3 = i;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EmojiIconsKt$$ExternalSyntheticLambda0(str, aSTNodeImpl2, f, i3, jWECryptoParts, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [boolean, int] */
    /* renamed from: MoneybotMarkdownTableRow-UR9CgXA, reason: not valid java name */
    public static final void m3633MoneybotMarkdownTableRowUR9CgXA(String str, ASTNodeImpl aSTNodeImpl, float f, TextStyle textStyle, BiasAlignment.Vertical vertical, int i, JWECryptoParts jWECryptoParts, boolean z, Composer composer, int i2) {
        BiasAlignment.Vertical vertical2;
        int i3;
        GapComposer gapComposer;
        BiasAlignment.Vertical vertical3;
        int i4;
        ?? r7;
        boolean z2;
        BiasAlignment.Vertical vertical4;
        DefaultMarkdownComponents defaultMarkdownComponents;
        int i5;
        Modifier.Companion companion;
        BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
        Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
        str.getClass();
        aSTNodeImpl.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(552860477);
        Applier applier = gapComposer2.applier;
        int i6 = (i2 & 6) == 0 ? (gapComposer2.changed(str) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i6 |= gapComposer2.changedInstance(aSTNodeImpl) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i6 |= gapComposer2.changed(f) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i6 |= gapComposer2.changed(textStyle) ? 2048 : 1024;
        }
        int i7 = i6 | 221184;
        if ((1572864 & i2) == 0) {
            i7 |= gapComposer2.changed(jWECryptoParts) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i2) == 0) {
            i7 |= gapComposer2.changed(z) ? 8388608 : 4194304;
        }
        if (gapComposer2.shouldExecute(i7 & 1, (4793491 & i7) != 4793490)) {
            gapComposer2.startDefaults();
            if ((i2 & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                vertical3 = Alignment.Companion.CenterVertically;
                i4 = Integer.MAX_VALUE;
            } else {
                gapComposer2.skipToGroupEnd();
                vertical3 = vertical;
                i4 = i;
            }
            gapComposer2.endDefaults();
            DefaultMarkdownComponents defaultMarkdownComponents2 = (DefaultMarkdownComponents) gapComposer2.consume(ComposeLocalKt.LocalMarkdownComponents);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            DefaultMarkdownComponents defaultMarkdownComponents3 = defaultMarkdownComponents2;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, companion2);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            int i8 = i7;
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
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier m292widthInVpY3zN4$default = SizeKt.m292widthInVpY3zN4$default(companion2, f, RecyclerView.DECELERATION_RATE, 2);
            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(m292widthInVpY3zN4$default, RecyclerView.DECELERATION_RATE, 16.0f, 1);
            int i9 = i8 >> 6;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical3, gapComposer2, ((i9 & 896) >> 3) & 112);
            BiasAlignment.Vertical vertical5 = vertical3;
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m300paddingVpY3zN4$default);
            gapComposer2.startReusableNode();
            Modifier.Companion companion3 = companion2;
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            gapComposer2.startReplaceGroup(-151667479);
            List children = aSTNodeImpl.getChildren();
            ArrayList arrayList = new ArrayList();
            for (Object obj : children) {
                if (Intrinsics.areEqual(((ASTNodeImpl) obj).f1630type, GFMTokenTypes.CELL)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            GapComposer gapComposer3 = gapComposer2;
            while (it.hasNext()) {
                ASTNodeImpl aSTNodeImpl2 = (ASTNodeImpl) it.next();
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer3, 0);
                int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, layoutWeightElement);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                gapComposer3.startReusableNode();
                if (gapComposer3.inserting) {
                    gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer3.useNode();
                }
                Updater.m576setimpl(gapComposer3, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer3, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                List children2 = aSTNodeImpl2.getChildren();
                if (!(children2 instanceof Collection) || !children2.isEmpty()) {
                    Iterator it2 = children2.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.areEqual(((ASTNodeImpl) it2.next()).f1630type, MarkdownTokenTypes.IMAGE)) {
                            gapComposer3.startReplaceGroup(-66016852);
                            DefaultMarkdownComponents defaultMarkdownComponents4 = defaultMarkdownComponents3;
                            z2 = true;
                            vertical4 = vertical5;
                            MarkdownExtensionKt.MarkdownElement(aSTNodeImpl2, defaultMarkdownComponents4, str, false, gapComposer3, ((i8 << 6) & 896) | 3072, 0);
                            defaultMarkdownComponents = defaultMarkdownComponents4;
                            gapComposer3.end(false);
                            i5 = i4;
                            companion = companion3;
                            break;
                        }
                    }
                }
                defaultMarkdownComponents = defaultMarkdownComponents3;
                Modifier.Companion companion4 = companion3;
                z2 = true;
                vertical4 = vertical5;
                gapComposer3.startReplaceGroup(-65793621);
                ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion4, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 11);
                companion = companion4;
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                int hashCode4 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer3.currentCompositionLocalScope();
                Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer3, m302paddingqDBjuR0$default);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                gapComposer3.startReusableNode();
                if (gapComposer3.inserting) {
                    gapComposer3.createNode(layoutNode$Companion$Constructor$13);
                } else {
                    gapComposer3.useNode();
                }
                Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer3, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer3, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                int i10 = i8 >> 3;
                Composer composer2 = gapComposer3;
                i5 = i4;
                AbstractDecoder.m4202MarkdownTableBasicTextkKmfEb0(str, aSTNodeImpl2, textStyle, i5, 0, jWECryptoParts, composer2, (i8 & 14) | (i10 & 896) | (i9 & 7168) | (i10 & 458752), 16);
                gapComposer3 = composer2;
                gapComposer3.end(true);
                gapComposer3.end(false);
                gapComposer3.end(z2);
                companion3 = companion;
                vertical5 = vertical4;
                defaultMarkdownComponents3 = defaultMarkdownComponents;
                i4 = i5;
                gapComposer3 = gapComposer3;
            }
            Modifier.Companion companion5 = companion3;
            vertical2 = vertical5;
            int i11 = i4;
            gapComposer3.end(false);
            gapComposer3.end(true);
            if (z) {
                gapComposer3.startReplaceGroup(1139305280);
                Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion5, 1.0f), 1.0f);
                Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    r7 = 0;
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                } else {
                    r7 = 0;
                    gapComposer3.startReplaceGroup(-1762997739);
                    gapComposer3.end(false);
                }
                BoxKt.Box(ImageKt.m177backgroundbw27NRU(m277height3ABfNKs, colors.semantic.border.subtle, ColorKt.RectangleShape), gapComposer3, r7);
                gapComposer3.end(r7);
            } else {
                gapComposer3.startReplaceGroup(1139454235);
                gapComposer3.end(false);
            }
            gapComposer3.end(true);
            i3 = i11;
            gapComposer = gapComposer3;
        } else {
            gapComposer2.skipToGroupEnd();
            vertical2 = vertical;
            i3 = i;
            gapComposer = gapComposer2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SliderKt$$ExternalSyntheticLambda0(str, aSTNodeImpl, f, textStyle, vertical2, i3, jWECryptoParts, z, i2);
        }
    }

    public static final void SpacerVertical20(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(376520527);
        int i2 = i | 6;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 20.0f));
            modifier = companion;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DividerKt$$ExternalSyntheticLambda1(modifier, i, 26);
        }
    }

    public static final void SpacerVerticalSmall(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-525223686);
        int i2 = i | 6;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(fillMaxWidth, 8.0f));
            modifier = companion;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DividerKt$$ExternalSyntheticLambda1(modifier, i, 27);
        }
    }

    public static final String safeGetUnescapedTextInNode(ASTNodeImpl aSTNodeImpl, String str) {
        int i = aSTNodeImpl.startOffset;
        int i2 = aSTNodeImpl.endOffset;
        if (i >= str.length() || i2 > str.length() || aSTNodeImpl.startOffset > i2) {
            return null;
        }
        return s2.getUnescapedTextInNode(aSTNodeImpl, str);
    }
}
